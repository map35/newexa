<?php

namespace App\Http\Controllers;

use Illuminate\Support\Facades\Http;
use Illuminate\Http\Request;
use Session;
use RealRashid\SweetAlert\Facades\Alert;


class MasterDataController extends Controller
{
    public function getMasterData(){
        $response = Http::get('http://localhost:9005/masterdata/getallmasterdata', []);
        $user_json = json_decode($response->body());

        if($user_json->message == "Get All Master Data Sucess!"){
            return $user_json;
        }
    }

    public function getAllProvince(){
        $response = Http::get('http://localhost:9005/masterdata/get_all_province', []);
        $user_json = json_decode($response->body());

        if($user_json->message == "Get All Provinces Success!"){
            return $user_json;
        }
    }
    public function getCitybyProvinceId(Request $request){
        $response = Http::get('http://localhost:9005/masterdata/get_regencies_by_province_id/'.$request->province_id, []);
        $user_json = json_decode($response->body());

        if($user_json->message == "Get All Regencies By Province Id Success!"){
            return $user_json;
        }
    }

    public function getProvinceById(Request $request){
        $response = Http::get('http://localhost:9005/masterdata/get_province_data_by_id/'.$request->province_id, []);
        $user_json = json_decode($response->body());

        if($user_json->message == "Get Province Data Success!"){
            return $user_json;
        }
    }
    
    public function getRegencyById(Request $request){
        $response = Http::get('http://localhost:9005/masterdata/get_regency_data_by_id/'.$request->regency_id, []);
        $user_json = json_decode($response->body());

        if($user_json->message == "Get Regency Data Success!"){
            return $user_json;
        }
    }
}




