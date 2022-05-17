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
        if($request->firstRegDate != ""){
            $firstRegDateString = explode("-", $request->firstRegDate);
        }else{
            $firstRegDateString = ["","",""];
        }

        if($request->legalIssDate1 != ""){
            $legalIssDate1String = explode("-", $request->legalIssDate1);
        }else{
            $legalIssDate1String = ["","",""];
        }

        if($request->legalExpDate1 != ""){
            $legalExpDate1String = explode("-", $request->legalExpDate1);
        }else{
            $legalExpDate1String = ["","",""];
        }

        if($request->legalIssDate2 != ""){
            $legalIssDate2String = explode("-", $request->legalIssDate2);
        }else{
            $legalIssDate2String = ["","",""];
        }

        if($request->legalExpDate2 != ""){
            $legalExpDate2String = explode("-", $request->legalExpDate2);
        }else{
            $legalExpDate2String = ["","",""];
        }

        if($request->legalIssDate3 != ""){
            $legalIssDate3String = explode("-", $request->legalIssDate3);
        }else{
            $legalIssDate3String = ["","",""];
        }

        if($request->legalExpDate3 != ""){
            $legalExpDate3String = explode("-", $request->legalExpDate3);
        }else{
            $legalExpDate3String = ["","",""];
        }

        if($request->legalIssDate4 != ""){
            $legalIssDate4String = explode("-", $request->legalIssDate4);
        }else{
            $legalIssDate4String = ["","",""];
        }

        if($request->legalExpDate4 != ""){
            $legalExpDate4String = explode("-", $request->legalExpDate4);
        }else{
            $legalExpDate4String = ["","",""];
        }
        
        if(empty($request->cifno)){
            $response = Http::post('http://localhost:9001/cif/cifauthorization', [
                'username' => Session::get('user')->username,
                'id' => $request->id,
                "businessType"=> $request->businessType,
                "districtCode"=> $request->districtCode,
                "firstRegNo"=> $request->firstRegNo,
                "firstRegDate"=> $firstRegDateString[0].$firstRegDateString[1].$firstRegDateString[2],
                "corpFinReport"=> $request->corpFinReport,
                "nationality"=> $request->nationality,
                "province"=> $request->province,
                "residence"=> $request->residence,
                "resideYN"=> $request->resideYN,
                "rt"=> $request->rt,
                "rw"=> $request->rw,
                "sector"=> $request->sector,
                "segment"=> $request->segment,
                "sideCoSector"=> $request->sideCoSector,
                "bdName"=> $request->bdName,
                "bdPosition"=> $request->bdPosition,
                "legalID1"=> $request->legalID1,
                "legalIssDate1"=> $legalIssDate1String[0].$legalIssDate1String[1].$legalIssDate1String[2],
                "legalExpDate1"=> $legalExpDate1String[0].$legalExpDate1String[1].$legalExpDate1String[2],
                "legalID2"=> $request->legalID2,
                "legalIssDate2"=> $legalIssDate2String[0].$legalIssDate2String[1].$legalIssDate2String[2],
                "legalExpDate2"=> $legalExpDate2String[0].$legalExpDate2String[1].$legalExpDate2String[2],
                "legalID3"=> $request->legalID3,
                "legalIssDate3"=> $legalIssDate3String[0].$legalIssDate3String[1].$legalIssDate3String[2],
                "legalExpDate3"=> $legalExpDate3String[0].$legalExpDate2String[1].$legalExpDate3String[2],
                "legalID4"=> $request->legalID4,
                "legalIssDate4"=> $legalIssDate4String[0].$legalIssDate4String[1].$legalIssDate4String[2],
                "legalExpDate4"=> $legalExpDate4String[0].$legalExpDate4String[1].$legalExpDate4String[2],
                "name1"=> $request->name1,
                "offPhone"=> $request->offPhone,
                "postCode"=> $request->postCode,
                "shortName"=> $request->shortName,
                "street"=> $request->street,
                "taxID"=> $request->taxID
            ]);
            $user_json = json_decode($response->body());
            // console.log($user_json);
            return $user_json;

        }else{
            $response = Http::post('http://localhost:9002/acc/authorAccMudharabah', [
                'username' => Session::get('user')->username,
                'id' => $request->id,
                "businessType"=> $request->businessType,
                "districtCode"=> $request->districtCode,
                "firstRegNo"=> $request->firstRegNo,
                "firstRegDate"=> $firstRegDateString[0].$firstRegDateString[1].$firstRegDateString[2],
                "corpFinReport"=> $request->corpFinReport,
                "nationality"=> $request->nationality,
                "province"=> $request->province,
                "residence"=> $request->residence,
                "resideYN"=> $request->resideYN,
                "rt"=> $request->rt,
                "rw"=> $request->rw,
                "sector"=> $request->sector,
                "segment"=> $request->segment,
                "sideCoSector"=> $request->sideCoSector,
                "bdName"=> $request->bdName,
                "bdPosition"=> $request->bdPosition,
                "legalID1"=> $request->legalID1,
                "legalIssDate1"=> $legalIssDate1String[0].$legalIssDate1String[1].$legalIssDate1String[2],
                "legalExpDate1"=> $legalExpDate1String[0].$legalExpDate1String[1].$legalExpDate1String[2],
                "legalID2"=> $request->legalID2,
                "legalIssDate2"=> $legalIssDate2String[0].$legalIssDate2String[1].$legalIssDate2String[2],
                "legalExpDate2"=> $legalExpDate2String[0].$legalExpDate2String[1].$legalExpDate2String[2],
                "legalID3"=> $request->legalID3,
                "legalIssDate3"=> $legalIssDate3String[0].$legalIssDate3String[1].$legalIssDate3String[2],
                "legalExpDate3"=> $legalExpDate3String[0].$legalExpDate2String[1].$legalExpDate3String[2],
                "legalID4"=> $request->legalID4,
                "legalIssDate4"=> $legalIssDate4String[0].$legalIssDate4String[1].$legalIssDate4String[2],
                "legalExpDate4"=> $legalExpDate4String[0].$legalExpDate4String[1].$legalExpDate4String[2],
                "name1"=> $request->name1,
                "offPhone"=> $request->offPhone,
                "postCode"=> $request->postCode,
                "shortName"=> $request->shortName,
                "street"=> $request->street,
                "taxID"=> $request->taxID
            ]);
            $user_json = json_decode($response->body());
            // console.log($user_json);
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
