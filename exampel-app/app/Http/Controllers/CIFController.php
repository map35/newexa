<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use Illuminate\Support\Facades\Http;
use Session;
use RealRashid\SweetAlert\Facades\Alert;

class CIFController extends Controller
{
    // public function getCIFDatabyCIFNumber(Request $request){
    //     $response = Http::asForm()->get('http://localhost:9191/cif_perorangan/getcifdatausingcifnumber', [
    //         'cifNumber' => $request->cif_number,
    //     ]);
    //     $user_json = json_decode($response->body());
    //     return $user_json;
    // }

    public function submitNewCIF(Request $request){

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

        $response = Http::post('http://localhost:9001/cif/validateCIF', [
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
        return $user_json;
    }
}
