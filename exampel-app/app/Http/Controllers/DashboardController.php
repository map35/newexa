<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class DashboardController extends Controller
{
    public function index() {
        return view('dashboard');
    }
    public function showAccountOpen(){
        return view('accountopen');
    }
    public function showAccountOpenNew(){
        return view('accountopen.datanasabahbaru');
    }
    public function showAccountOpenExisting(){
        return view('accountopen.datanasabahexisting');
    }
    public function showAccountInquiry(){
        return view('accountinquiry');
    }
    public function showAccountAuthorization(){
        return view('accountauthorization');
    }
    public function showDetailAuthorization(){
        return view('detailauthorization');
    }
}
