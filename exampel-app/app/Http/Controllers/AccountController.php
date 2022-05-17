<?php

namespace App\Http\Controllers;

use Illuminate\Support\Facades\Http;
use Illuminate\Http\Request;
use Session;
use RealRashid\SweetAlert\Facades\Alert;
use Illuminate\Support\Facades\Route;

class AccountController extends Controller
{
    public function showAllAccountInquiry(){
        // print_r($user_json);
        if(Session::has('user')){
            // $response = Http::get('http://localhost:9002/acc/getallaccount', []);
            // $user_json = json_decode($response->body());
            $user = Session::get('user');
            return view('accountinquiry')->with('user', $user);
        }else{
            return view('/landingpage');
        }
    }

    public function showAllAccountAuthorization(){ 
        // print_r($user_json);
        if(Session::has('user')){
            if(Session::get('user')->role!="CS"){
                // $response = Http::get('http://localhost:9002/acc/getallaccount', []);
                // $user_json = json_decode($response->body());
                $user = Session::get('user');
                return view('accountauthorization')->with('user', $user);
            }
            Session::forget('authenticated');
            Session::forget('user');
        }
        return view('/landingpage');
    }

    public function authorAccountMudharabah(Request $request){
        if(empty($request->cif_number)){
            $response = Http::post('http://localhost:9002/cif/cifauthorization', [
                'username' => Session::get('user')->username,
                'id' => $request->id,
            ]);
            $user_json = json_decode($response->body());
            return $user_json;

        }else{
            $response = Http::post('http://localhost:9002/acc/authormudharabahaccount', [
                'username' => Session::get('user')->username,
                'id' => $request->id,
            ]);
            $user_json = json_decode($response->body());

            return $user_json;
        }
    }

    public function authorAccountMudharabahRejected(Request $request){
        if(empty($request->cif_number)){
            $response = Http::post('http://localhost:9002/cif/cifauthorizationrejected', [
                'username' => Session::get('user')->username,
                'id' => $request->id,
            ]);
            $user_json = json_decode($response->body());
            return $user_json;
            
        }else{
            $response = Http::post('http://localhost:9002/acc/authormudharabahaccountrejected', [
                'username' => Session::get('user')->username,
                'id' => $request->id,
            ]);
            $user_json = json_decode($response->body());
            return $user_json;
        }
    }


    public function submitNewAccountExisting(Request $request){
        if($request->date_of_birth != ""){
            $dateofbirthString = explode("-", $request->date_of_birth);
        }else{
            $dateofbirthString = ["","",""];
        }
        
        $response = Http::post('http://localhost:9002/acc/validatemudharabah', [
            'username' => Session::get('user')->username,
            'productCode' => $request->product_code,
            'shortName' => $request->short_name,
            'printedName' => $request->printed_name,
            'acopenPurpose' => $request->account_open_purpose,
            'accountOfficer' => $request->account_officer,
            'currency' => 'IDR',
            'cifNo' => $request->cif_number,
            'passBook' => 'N',
            'zakat' => $request->zakat,
            'placeBirth' => $request->place_of_birth,
            'dateOfBirth'=> $dateofbirthString[0].$dateofbirthString[1].$dateofbirthString[2],
            'mothMaiden' =>$request->mother_name

        ]);
        $user_json = json_decode($response->body());
        return $user_json;
    }

    public function getAllAccount(Request $request){
        if(Session::get('user')->role == "CS"){
            $response = Http::asForm()->get('http://localhost:9002/acc/getallaccountbyusername', [
                'username' => Session::get('user')->username,
                'accountType' => $request->account_purpose,
                'product'  => $request->product,
                'status'  => $request->status,
                'cifNumber' => $request->cif_number,
                'dateofStart' => $request->date_of_start,
                'dateofFinish' => $request->date_of_finish
            ]); 
            $user_json = json_decode($response->body());
            if($user_json->message == "Get all account success!"){
                return $user_json;
            }
        }else if((Session::get('user')->role == "BOSM" ||Session::get('user')->role == "BM")  && Session::get('user')->branch_office_location != "KANTOR PUSAT" ){
            $response = Http::asForm()->get('http://localhost:9002/acc/getallaccountbybranchlocation', [
                'branchLocation' => Session::get('user')->branch_office_location,
                'accountType' => $request->account_purpose,
                'product'  => $request->product,
                'status'  => $request->status,
                'cifNumber' => $request->cif_number,
                'dateofStart' => $request->date_of_start,
                'dateofFinish' => $request->date_of_finish
            ]);
            $user_json = json_decode($response->body());
            if($user_json->message == "Get all account success!"){
                return $user_json;
            }
        }else{
            $response = Http::get('http://localhost:9002/acc/getallaccount', [
                'acOpenPurpose' => $request->acOpenPurpose,
                'productCode'  => $request->productCode,
                'status'  => $request->status,
                'cifNo' => $request->cifNo,
                'dateofStart' => $request->date_of_start,
                'dateofFinish' => $request->date_of_finish
            ]);
            $user_json = json_decode($response->body());
            if($user_json->message == "Get all account success!"){
                // console.log($user_json);
                return $user_json;
            }
        }
        
    }


}
