<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\DashboardController;
use App\Http\Controllers\LoginController;
use App\Http\Controllers\CIFController;
use App\Http\Controllers\AccountController;
use App\Http\Controllers\MasterDataController;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

Route::get('/', function () {
    return view('landingpage');
});

Route::get('/landingpage', function () {
    return view('landingpage');
});

Route::get('/mainmenu', function () {
    return view('mainmenu');
});

Route::get('/dashboard', [DashboardController::class, 'index']);
Route::get('/account-open', [DashboardController::class, 'showAccountOpen']);
Route::get('/account-open-new', [DashboardController::class, 'showAccountOpenNew']);
Route::get('/account-open-existing', [DashboardController::class, 'showAccountOpenExisting']);
Route::get('/account-inquiry', [DashboardController::class, 'showAccountInquiry']);
Route::get('/account-otorisasi', [DashboardController::class, 'showAccountAuthorization']);
Route::get('/detail-otorisasi', [DashboardController::class, 'showDetailAuthorization']);

// Login & Logout
Route::post('/login',[LoginController::class,'store']);
Route::get('/logout',[LoginController::class,'logout']);

// CIF
Route::post('/submit-new-cif', [CIFController::class, 'submitNewCIF']);

// Acc
Route::get('/account-inquiry', [AccountController::class, 'showAllAccountInquiry']);
Route::get('/account-otorisasi', [AccountController::class, 'showAllAccountAuthorization']);
Route::post('/author-account', [AccountController::class, 'authorAccountMudharabah']);
Route::post('/author-account-rejected', [AccountController::class, 'authorAccountMudharabahRejected']);
Route::post('/submit-account-existing', [AccountController::class, 'submitNewAccountExisting']);
Route::get('/get-all-account', [AccountController::class, 'getAllAccount']);

// MasterData
Route::get('/get-retail-data', [MasterDataController::class, 'getRetailData']);
Route::get('/get-master-data', [MasterDataController::class, 'getMasterData']);
Route::get('/get-all-province', [MasterDataController::class, 'getAllProvince']);
Route::get('/get-city-by-province-id', [MasterDataController::class, 'getCitybyProvinceId']);
Route::get('/get-district-by-city-id', [MasterDataController::class, 'getDistrictbyCityId']);
Route::get('/get-village-by-district-id', [MasterDataController::class, 'getVillagebyDistrictId']);
Route::get('/get-province-by-id', [MasterDataController::class, 'getProvinceById']);
Route::get('/get-regency-by-id', [MasterDataController::class, 'getRegencyById']);
Route::get('/get-district-by-id', [MasterDataController::class, 'getDistrictById']);
Route::get('/get-village-by-id', [MasterDataController::class, 'getVillageById']);
Route::get('/get-company-detail-by-company-address', [MasterDataController::class, 'getCompanyDetailByCompanyAddress']);
