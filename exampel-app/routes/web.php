<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\DashboardController;
use App\Http\Controllers\LoginController;
use App\Http\Controllers\CIFController;

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