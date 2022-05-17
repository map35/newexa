<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    
    <meta name="csrf-token" content="{{ csrf_token() }}">

    <title>Dashboard Main Menu EXA V2</title>

    <!-- Custom fonts for this template-->
    <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="{{asset('css/sb-admin-2.css')}}" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="{{asset('vendor/bootstrap/css/bootstrap.min.css')}}">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="{{asset('fonts/font-awesome-4.7.0/css/font-awesome.min.css')}}">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="{{asset('fonts/Linearicons-Free-v1.0.0/icon-font.min.css')}}">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="{{asset('vendor/animate/animate.css')}}">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="{{asset('vendor/css-hamburgers/hamburgers.min.css')}}">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="{{asset('vendor/animsition/css/animsition.min.css')}}">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="{{asset('vendor/select2/select2.min.css')}}">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="{{asset('vendor/daterangepicker/daterangepicker.css')}}">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="{{asset('css/util.css')}}">
    <link rel="stylesheet" type="text/css" href="{{asset('css/main.css')}}">
    <link rel="stylesheet" type="text/css" href="{{asset('css/bootsrap.css')}}">

    <script language="JavaScript" type="text/javascript" src="/js/jquery-1.2.6.min.js"></script>
    <script language="JavaScript" type="text/javascript" src="/js/jquery-ui-personalized-1.5.2.packed.js"></script>
    <script language="JavaScript" type="text/javascript" src="/js/sprinkle.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/10.5.1/sweetalert2.min.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/10.5.1/sweetalert2.all.min.js"></script>

</head>

<body id="page-top" onload="masterData()">
    <div class="dashboard-main">

        <!-- Topbar -->
        <nav class="navbar navbar-dashboard navbar-expand navbar-light bg-white topbar static-top shadow">

            <a class="sidebar-brand d-flex align-items-center justify-content-center logo-dashboard" href="/dashboard">
                <img src="{{asset('/images/logo_putih.png')}}" class="img-fluid">
            </a>


            <!-- Topbar Navbar -->
            <ul class="navbar-nav ml-auto">

                <!-- Nav Item - Search Dropdown (Visible Only XS) -->

                <div class=" d-none d-sm-block"></div>

                <!-- Nav Item - User Information -->
                <li class="nav-item dropdown no-arrow">
                    <p class="text-header ">Selamat Datang Akhi Dimas </p>
                    <br>
                    <p class="text-header ">Customer Service | 2101670159 - KC Bekasi 2</p>
                    <button type="button" class="buttonLogout", align="center">LOGOUT </button>
                </li>
                <br>
            </ul>
        </nav>
        <!-- End of Topbar -->

        <!-- Page Wrapper -->
        <div id="wrapper">

            <!-- Sidebar -->
            <ul class="navbar-nav  sidebar sidebar-dark accordion" id="accordionSidebar">

                <!-- Nav Item - Pages Collapse Menu -->
                <li class="nav-item">
                    <a class="nav-link" href="/account-open">
                        <p class="text-sidebar">Pembukaan Rekening</p>
                    </a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="/account-inquiry">
                        <p class="text-sidebar">Inquiry Pembukaan CIF & Rekening</p>
                    </a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="/account-otorisasi">
                        <p class="text-sidebar">Otorisasi Pembukaan CIF & Rekening</p>
                    </a>
                </li>

            </ul>
            <!-- End of Sidebar -->

            <div id="content-wrapper" class="d-flex flex-column">

                <!-- Main Content -->
                <div id="content">

                    <!-- Begin Page Content -->
                    <div class="container-fluid">

                        <!-- Page Heading -->
                        <div class="d-sm-flex align-items-center justify-content-between">
                            <h1 class="h3 mb-0 text-gray-800">Pembukaan Rekening</h1>
                        </div>

                            <div class="mb-3">
                                <label for="exampleFormControlInput1" class="form-label">Pilih Jenis Nasabah</label>
                                <select class="form-select" aria-label="Default select example" id="state" name="state">
                                    <option selected>Select CIF</option>
                                    <option value="qld">CIF Perorangan</option>
                                    <option value="nsw">CIF Anak</option>
                                    <option value="tbk">CIF Perusahaan</option>
                                </select>
                            </div>

                            <form action="" method="post" id="testform">

                            <hr>

                            <div class="card shadow">


                                <!-- ======PEMBUKAAN REKENING====== -->

                                    <p>Pembukaan Rekening Nasabah Baru CIF Perusahaan</p>
                                <div class="card-body text-form">
                                    <p class="text-pembukaan">Informasi Pembukaan Rekening</p>
                                     <p><br>
                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Produk<span style="color:red">*</span></label></label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example" id="productcode">
                                                <option selected>- Silahkan Pilih -</option>
                                                <!-- <option value="6020">TABUNGAN BISNIS</option> -->
                                            </select>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Tujuan Buka Rekening<span style="color:red">*</span></label></label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example" id="acOpenPurpose">
                                                <option selected>- Silahkan Pilih -</option>                                          
                                                <!-- <option value="21">HAJI</option>                                           -->
                                            </select>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Bentuk Badan Usaha / Lembaga<span style="color:red">*</span></label></label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example" id="businessType">                                     
                                                <option selected>- Silahkan Pilih -</option>                                          
                                                <!-- <option value="201">Badan Usaha Unit Desa</option>                       -->
                                            </select>
                                        </div>
                                    </div>

                                    <hr>

                                    <!-- ======INFORMASI DATA Nasabah====== -->

                                    <p class="text-pembukaan">Informasi Data Nasabah</p>
                                    <p><br>
                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Nama Lengkap<span style="color:red">*</span></label></label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control" id="name1" aria-describedby="emailHelp" maxlength="35">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Kewarganegaraan<span style="color:red">*</span></label></label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example" id="nationality">
                                            <!-- <select class="form-select" aria-label="Default select example" id="nationality" onchange="onChangeCountry()"> -->
                                                <option selected>- Silahkan Pilih -</option>                                          
                                                <option value="ID">Indonesia</option>                                    
                                            </select>
                                        </div>
                                    </div>


                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Sumber Dana<span style="color:red">*</span></label></label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example" id="fundSource">
                                                <option selected>- Silahkan Pilih -</option>
                                                <option value="21">asdasdasd</option>                        
                                            </select>
                                        </div>
                                    </div>
                                
                                    <hr>
                                    <p class="text-pembukaan">Informasi Data Perusahaan</p>
                                    <p><br>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Nama Perusahaan<span style="color:red">*</span></label></label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control" id="shortName" aria-describedby="emailHelp" maxlength="35">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">NPWP Perusahaan<span style="color:red">*</span></label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="number" class="form-control" id="taxID" aria-describedby="emailHelp" minlength="15">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Bidang Usaha<span style="color:red">*</span></label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example" id="sideCoSector">
                                                <option selected>- Silahkan Pilih -</option>
                                                <option value="9310">Kegiatan yang Belum Jelas Batasannya Perorangan (Produktif)</option>
                                            </select>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Laporan Keuangan<span style="color:red">*</span></label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example" id="corpFinReport">
                                                <option selected>- Silahkan Pilih -</option>
                                                <option value="Y">YA</option>    
                                                <option value="N">Tidak</option>     
                                            </select>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Deskripsi Kegiatan Usaha</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control" id="corpBussDesc" aria-describedby="emailHelp" maxlength="35">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Alamat Perusahaan<span style="color:red">*</span></label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control" id="street" aria-describedby="emailHelp" maxlength="70">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">RT / RW<span style="color:red">*</span></label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="col-lg-2">
                                            <input type="number" class="form-control" id="rt" aria-describedby="emailHelp" maxlength="3">
                                        </div>
                                        <div class="mb-3 col-lg-2">
                                            <input type="number" class="form-control" id="rw" aria-describedby="emailHelp" maxlength="3">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Provinsi<span style="color:red">*</span></label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example" id="province">
                                            <!-- <select class="form-select" aria-label="Default select example" id="province" onchange="onChangeProvince()"> -->
                                                <option selected>- Silahkan Pilih -</option>
                                                <option value="3500">Jawa Barat</option>          
                                            </select>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Kabupaten / Kota<span style="color:red">*</span></label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example" id="districtCode">
                                                <option selected>- Silahkan Pilih -</option>
                                                <option value="3501">Provinsi Riau</option>      
                                            </select>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Kode Pos<span style="color:red">*</span></label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="number" class="form-control" id="postCode" aria-describedby="emailHelp" minlength="5">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Negara<span style="color:red">*</span></label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example" id="residence">
                                                <option selected>- Silahkan Pilih -</option>
                                                <option value="ID">Indonesia</option>
                                            </select>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">No. Telp. Kantor<span style="color:red">*</span></label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="number" class="form-control" id="offPhone" aria-describedby="emailHelp" maxlength="35">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Kel. Fasilitas</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control" id="fas" aria-describedby="emailHelp" maxlength="10">
                                        </div>
                                    </div>

                                    <hr>
                                    <p class="text-pembukaan">Informasi Surat Perizinan Pendirian Perusahaan</p>
                                     <p><br>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">No. Akta Pendirian<span style="color:red">*</span></label></label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control" id="firstRegNo" aria-describedby="emailHelp" maxlength="35">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Tgl. Akta Pendirian<span style="color:red">*</span></label></label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-2">
                                            <input type="date" class="form-control" id="firstRegDate" aria-describedby="emailHelp">
                                        </div>
                                    </div>

                                    <hr style="width:25%">

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">No. Akta SIUP<span style="color:red">*</span></label></label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control" id="legalID1" aria-describedby="emailHelp" maxlength="35">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Penerbitan SIUP<span style="color:red">*</span></label></label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-2">
                                            <input type="date" class="form-control" id="legalIssDate1" aria-describedby="emailHelp">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Tgl. Berakhir SIUP<span style="color:red">*</span></label></label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-2">
                                            <input type="date" class="form-control" id="legalExpDate1" aria-describedby="emailHelp">
                                        </div>
                                    </div>

                                    <hr style="width:25%">

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">No. SITU<span style="color:red">*</span></label></label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control" id="legalID2" aria-describedby="emailHelp" maxlength="35">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Penerbitan SITU<span style="color:red">*</span></label></label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-2">
                                            <input type="date" class="form-control" id="legalIssDate2" aria-describedby="emailHelp">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Tgl. Berakhir SITU<span style="color:red">*</span></label></label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-2">
                                            <input type="date" class="form-control" id="legalExpDate2" aria-describedby="emailHelp">
                                        </div>
                                    </div>

                                    <hr style="width:25%">

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">No. SK Menteri<span style="color:red">*</span></label></label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control" id="legalID3" aria-describedby="emailHelp" maxlength="35">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Penerbitan SK Menteri <span style="color:red">*</span></label></label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-2">
                                            <input type="date" class="form-control" id="legalIssDate3" aria-describedby="emailHelp">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Tgl. Berakhir SK Menteri <span style="color:red">*</span></label></label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-2">
                                            <input type="date" class="form-control" id="legalExpDate3" aria-describedby="emailHelp">
                                        </div>
                                    </div>

                                    <hr style="width:25%">

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">No. TDP <span style="color:red">*</span></label></label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control" id="legalID4" aria-describedby="emailHelp" maxlength="35">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Penerbitan TDP <span style="color:red">*</span></label></label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-2">
                                            <input type="date" class="form-control" id="legalIssDate4" aria-describedby="emailHelp">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Tgl. Berakhir TDP <span style="color:red">*</span></label></label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-2">
                                            <input type="date" class="form-control" id="legalExpDate4" aria-describedby="emailHelp">
                                        </div>
                                    </div>

                                    <hr>
                                    <p class="text-pembukaan">Informasi Data Pengurus Perusahaan</p>
                                     <p><br>
                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Nama Pengurus <span style="color:red">*</span></label></label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control" id="bdName" aria-describedby="emailHelp" maxlength="35">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Jabatan Pengurus <span style="color:red">*</span></label></label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example" id="bdPosition">
                                                <option selected>- Silahkan Pilih -</option>
                                                <!-- <option value="0">PENGURUS - PEMILIK</option> -->
                                            </select>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Kelompok Nasabah <span style="color:red">*</span></label></label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example" id="sector">
                                                <option selected>- Silahkan Pilih -</option>
                                            </select>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Segment BUC <span style="color:red">*</span></label></label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example" id="segment">
                                                <option selected>- Silahkan Pilih -</option>
                                                <!-- <option value="20">General Customer</option> -->
                                            </select>
                                        </div>
                                    </div>

                                    <hr>
                                    <p class="text-pembukaan">Informasi Tambahan</p>
                                     <p><br>
                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Zakat <span style="color:red">*</span></label></label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example" id="zakat">
                                                <option selected>- Silahkan Pilih -</option>
                                                <option value="Y">YA</option>    
                                                <option value="N">Tidak</option>     
                                            </select>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Biaya Kartu <span style="color:red">*</span></label></label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example" id="x">
                                                <option selected>- Silahkan Pilih -</option>
                                                <option value="Y">YA</option>    
                                                <option value="N">Tidak</option>     
                                            </select>
                                        </div>
                                    </div>

                                    <hr>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Account Officer <span style="color:red">*</span></label></label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control" id="accountOfficer" aria-describedby="emailHelp" maxlength="10">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col text-center">
                                            <label class="btn btn-info" onclick="submitNewCIF(this)">Submit</label>
                                        </div>
                                    </div>

                                </div>
                            </div>

                        </form>

                    </div>
                    <!-- /.container-fluid -->

                </div>
                <!-- End of Main Content -->


                <!-- End of Footer -->

            </div>
            <!-- End of Content Wrapper -->

        </div>
        <!-- End of Page Wrapper -->
        <!-- Footer -->
        <footer class="sticky-footer" style="background-color: #00A39D;">
        <div class="container my-auto">
            <div class="copyright text-center my-auto">
                <center>
                    <p style="color:white"> (c) 2016 - 2022 PT. Bank Syariah Indonesia Tbk, All Right Reserved.
                </center>
            </div>
        </div>
        </div>
    </footer>

    <!-- Scroll to Top Button-->
    <a class="scroll-to-top rounded" href="#page-top">
        <i class="fas fa-angle-up"></i>
    </a>

   <script>
        function masterData(){

            // document.getElementById("residence_address2").style.display = "none";
            // document.getElementById("company_name_others_div").style.display = "none";
            $.ajax({
                url: "/get-master-data",
                method:"get",
                data:{
                    _token:"{{ csrf_token() }}",
                },
                success:function(response){
                    console.log("test" );
                    if(response.message == "Get All Master Data Sucess!") {

                        $('#productcode').empty();
                        $('#productcode').append('<option selected>- Silahkan Pilih -</option>');
                        var len = response.data.products.length;
                        for( var i = 0; i<len; i++){
                            var id = response.data.products[i]['id'];
                            var name = response.data.products[i]['description'];
                            $('#productcode').append("<option value='"+id+"'>"+name+"</option>");
                        }

                        $('#acOpenPurpose').empty();
                        $('#acOpenPurpose').append('<option selected>- Silahkan Pilih -</option>');
                        var len = response.data.acOpenPurposes.length;
                        for( var i = 0; i<len; i++){
                            var id = response.data.acOpenPurposes[i]['id'];
                            var name = response.data.acOpenPurposes[i]['description'];
                            $("#acOpenPurpose").append("<option value='"+id+"'>"+name+"</option>");
                        }

                        $('#bdPosition').empty();
                        $('#bdPosition').append('<option selected>- Silahkan Pilih -</option>');
                        var len = response.data.bdPositions.length;
                        for( var i = 0; i<len; i++){
                            var id = response.data.bdPositions[i]['id'];
                            var name = response.data.bdPositions[i]['description'];
                            $("#bdPosition").append("<option value='"+id+"'>"+name+"</option>");
                        }

                        $('#businessType').empty();
                        $('#businessType').append('<option selected>- Silahkan Pilih -</option>');
                        var len = response.data.businessTypes.length;
                        for( var i = 0; i<len; i++){
                            var id = response.data.businessTypes[i]['id'];
                            var name = response.data.businessTypes[i]['description'];
                            $("#businessType").append("<option value='"+id+"'>"+name+"</option>");
                        }

                        $('#product').empty();
                        $('#product').append('<option selected>- Silahkan Pilih -</option>');
                        var len = response.data.products.length;
                        for( var i = 0; i<len; i++){
                            var id = response.data.products[i]['id'];
                            var name = response.data.products[i]['description'];
                            $("#product").append("<option value='"+id+"'>"+name+"</option>");
                        }

                        $('#sector').empty();
                        $('#sector').append('<option selected>- Silahkan Pilih -</option>');
                        var len = response.data.sectors.length;
                        for( var i = 0; i<len; i++){
                            var id = response.data.sectors[i]['id'];
                            var name = response.data.sectors[i]['description'];
                            $("#sector").append("<option value='"+id+"'>"+name+"</option>");
                        }

                        $('#segment').empty();
                        $('#segment').append('<option selected>- Silahkan Pilih -</option>');
                        var len = response.data.segments.length;
                        for( var i = 0; i<len; i++){
                            var id = response.data.segments[i]['id'];
                            var name = response.data.segments[i]['description'];
                            $("#segment").append("<option value='"+id+"'>"+name+"</option>");
                        }

                        $('#sideCoSector').empty();
                        $('#sideCoSector').append('<option selected>- Silahkan Pilih -</option>');
                        var len = response.data.sideCoSectors.length;
                        for( var i = 0; i<len; i++){
                            var id = response.data.sideCoSectors[i]['id'];
                            var name = response.data.sideCoSectors[i]['description'];
                            $("#sideCoSector").append("<option value='"+id+"'>"+name+"</option>");
                        }

                    }else{
                        Swal.fire({
                            title: 'Error!!',
                            text: response.message,
                            icon: 'error',
                            showCancelButton: false,
                            confirmButtonText: 'Yes!',
                        }).then(function (e) {
                            if (e.value === true) {
                                window.location="{{url('/account-otorisasi')}}";
                            }
                        }, function (dismiss) {
                            return false;
                        })
                    }              
                },
                error: function(error) {
                    console.log(error);
                }
            });
        }

        function onChangeCountry(){
            if(document.getElementById("nationality").value =="ID"){
                $.ajax({
                    url: "/get-all-province",
                    method:"get",
                    data:{
                        _token:"{{ csrf_token() }}",
                    },
                    success:function(response){
                        if(response.message == "Get All Provinces Success!") {
                            $('#province').empty();
                            $('#province').append('<option selected>- Silahkan Pilih -</option>'); 
                            var len = response.data.length;
                            for( var i = 0; i<len; i++){
                                var id = response.data[i]['id'];
                                var name = response.data[i]['name'];
                                $("#province").append("<option value='"+id+"'>"+name+"</option>");
                            }
                            $('#districtCode').empty();
                            $('#districtCode').append('<option selected>- Silahkan Pilih -</option>');
                                
                        }else{
                            Swal.fire({
                                title: 'Error!!',
                                text: response.message,
                                icon: 'error',
                                showCancelButton: false,
                                confirmButtonText: 'Yes!',
                            }).then(function (e) {
                                    // console("masuk"+e.value);
                                    // if (e.value === true) {
                                    
                                    // }

                            }, function (dismiss) {
                                console("masuk 1"+e.value);
                                return false;
                            })    
                        }              
                    },
                    error: function(error) {
                        console.log(error);
                    }
                });
            }else{
                $('#province').empty();
                $('#province').append('<option selected>- Silahkan Pilih -</option>');
                $('#districtcode').empty();
                $('#districtcode').append('<option selected>- Silahkan Pilih -</option>');
            }    
        }

        function onChangeProvince(){
            if(document.getElementById("province").value != "- Silahkan Pilih -"){
                $.ajax({
                    url: "/get-city-by-province-id",
                    method:"get",
                    data:{
                        _token:"{{ csrf_token() }}",
                        province_id:document.getElementById("province").value
                    },
                    success:function(response){
                        if(response.message == "Get All Regencies By Province Id Success!") {
                            console.log("test lagi");
                            $('#districtCode').empty();
                            $('#districtCode').append('<option selected>- Silahkan Pilih -</option>'); 
                            var len = response.data.length;
                            for( var i = 0; i<len; i++){
                                var id = response.data[i]['id'];
                                var name = response.data[i]['name'];
                                $("#districtCode").append("<option value='"+id+"'>"+name+"</option>");
                                console.log("test"+i);
                            }
                            // $('#districtCode').empty();
                            // $('#districtCode').append('<option selected>- Silahkan Pilih -</option>');
                                
                        }else{
                            Swal.fire({
                                title: 'Error!!',
                                text: response.message,
                                icon: 'error',
                                showCancelButton: false,
                                confirmButtonText: 'Yes!',
                            }).then(function (e) {
                                    // console("masuk"+e.value);
                                    // if (e.value === true) {
                                    
                                    // }

                            }, function (dismiss) {
                                console("masuk 1"+e.value);
                                return false;
                            })    
                        }              
                    },
                    error: function(error) {
                        console.log(error);
                    }
                });
            }else{
                $('#districtCode').empty();
                $('#districtCode').append('<option selected>- Silahkan Pilih -</option>');
            }    
        }

        function submitNewCIF(element){
        
            // var addr_street = document.getElementById("addr_street").value;
            // var addr_rt = document.getElementById("addr_rt").value;
            // var addr_rw = document.getElementById("addr_rw").value;
            // var addr_province = document.getElementById("addr_province").value;
            // var addr_country = document.getElementById("addr_country").value;
            // var addr_city = document.getElementById("addr_city").value;
            // var addr_postal_code = document.getElementById("addr_postal_code").value;
        
            // if (document.getElementById('same_with_address_based_on_identity').checked) {
            //     var addr_street = document.getElementById("street").value;
            //     var addr_rt = document.getElementById("rt").value;
            //     var addr_rw = document.getElementById("rw").value;
            //     var addr_province = document.getElementById("province").value;
            //     var addr_country = document.getElementById("country").value;
            //     var addr_city = document.getElementById("city").value;
            //     var addr_postal_code = document.getElementById("postal_code").value;
            // }

            // console.log("1"+document.getElementById("account_type").value);
            // console.log("2"+document.getElementById("legal_type").value);
            // console.log("3"+document.getElementById("legal_id_number").value);
            // console.log("4"+document.getElementById("name_based_on_identity").value);
            // console.log("5"+document.getElementById("full_name").value);
            // console.log("6"+document.getElementById("given_name").value);
            // console.log("7"+document.getElementById("family_name").value);
            // console.log("8"+document.getElementById("advance_title").value);
            // console.log("9"+document.getElementById("back_degree").value);
            // console.log("10"+document.getElementById("place_of_birth").value);
            // console.log("11"+document.getElementById("date_of_birth").value);
            // console.log("12"+document.getElementById("street").value);
            // console.log("13"+document.getElementById("rt").value);
            // console.log("14"+document.getElementById("rw").value);
            // console.log("15"+document.getElementById("province").value);
            // console.log("16"+document.getElementById("city").value);
            // console.log("17"+document.getElementById("addr_street").value);
            // console.log("18"+document.getElementById("addr_rt").value);
            // console.log("19"+document.getElementById("addr_rw").value);
            // console.log("20"+document.getElementById("addr_province").value);
            // console.log("21"+document.getElementById("addr_city").value);
            // console.log("22"+document.getElementById("addr_postal_code").value);
            // console.log("23"+document.getElementById("addr_celular_phone").value);
            // console.log("24"+document.getElementById("addr_phone_number").value);
            // console.log("25"+document.getElementById("marital_status").value);
            // console.log("26"+document.getElementById("education").value);
            // console.log("27"+document.getElementById("religion").value);
            // console.log("28"+document.getElementById("mother_name").value);
            // console.log("29"+document.getElementById("fund_source").value);
            // console.log("30"+document.getElementById("fund_source_amt").value);
            // console.log("31"+document.getElementById("job_status").value);
            // console.log("32"+document.getElementById("company").value);
            // console.log("33"+document.getElementById("job_title").value);
            // console.log("34"+document.getElementById("occupations").value);
            // console.log("35"+document.getElementById("employers_address").value);
            // console.log("36"+document.getElementById("business_type").value);
            // console.log("37"+document.getElementById("employment_start").value);
            // console.log("38"+document.getElementById("office_phone").value);
            // console.log("39"+document.getElementById("tax_id").value);
            // console.log("40"+document.getElementById("account_purpose").value);
            console.log(document.getElementById("firstRegDate").value);
            console.log(document.getElementById("legalIssDate3").value);
            console.log(document.getElementById("legalIssDate4").value);
  
            // $.ajaxSetup({
            //     headers: {
            //         'X-CSRF-TOKEN': $('meta[name="csrf-token"]').attr('content')
            //     }
            // });

            $.ajax({
                url: "/submit-new-cif",
                method:"post",
                data:{
                    _token:"{{ csrf_token() }}",
                    businessType : document.getElementById("businessType").value,
                    districtCode : document.getElementById("districtCode").value,
                    firstRegNo : document.getElementById("firstRegNo").value,
                    firstRegDate : document.getElementById("firstRegDate").value,
                    corpFinReport : document.getElementById("corpFinReport").value,
                    nationality : document.getElementById("nationality").value,
                    province : document.getElementById("province").value,
                    residence : document.getElementById("residence").value,
                    resideYN : "Y",
                    rt : document.getElementById("rt").value,
                    rw : document.getElementById("rw").value,
                    sector : document.getElementById("sector").value,
                    segment : document.getElementById("segment").value,
                    sideCoSector : document.getElementById("sideCoSector").value,
                    bdName : document.getElementById("bdName").value,
                    bdPosition : document.getElementById("bdPosition").value,
                    legalID1 : document.getElementById("legalID1").value,
                    legalIssDate1 : document.getElementById("legalIssDate1").value,
                    legalExpDate1 : document.getElementById("legalExpDate1").value,
                    legalID2 : document.getElementById("legalID2").value,
                    legalIssDate2 : document.getElementById("legalIssDate2").value,
                    legalExpDate2 : document.getElementById("legalExpDate2").value,
                    legalID3 : document.getElementById("legalID3").value,
                    legalIssDate3 : document.getElementById("legalIssDate3").value,
                    legalExpDate3 : document.getElementById("legalExpDate3").value,
                    legalID4 : document.getElementById("legalID4").value,
                    legalIssDate4 : document.getElementById("legalIssDate4").value,
                    legalExpDate4 : document.getElementById("legalExpDate4").value,
                    name1 : document.getElementById("name1").value,
                    offPhone : document.getElementById("offPhone").value,
                    postCode : document.getElementById("postCode").value,
                    shortName : document.getElementById("shortName").value,
                    street : document.getElementById("street").value,
                    taxID : document.getElementById("taxID").value
                },

                success:function(response){
                    if(response.message == "Create CIF Success!") {
                        Swal.fire({
                            title: 'Success!!',
                            text: response.message,
                            icon: 'success',
                            showCancelButton: false,
                            confirmButtonText: 'Yes!',
                        }).then(function (e) {
                            if (e.value == true) {
                                window.location="{{url('/account-otorisasi')}}";
                            }
                        }, function (dismiss) {
                            
                        })
                            
                    }else{
                        Swal.fire({
                            title: 'Error!!',
                            text: response.message,
                            icon: 'error',
                            showCancelButton: false,
                            confirmButtonText: 'Yes!',
                        }).then(function (e) {
                            // if (e.value == true) {
                            //     window.location="{{url('/account-open-new')}}";
                            // }

                        }, function (dismiss) {
                            return false;
                        })
                    }              
                },

                error: function(error) {
                    console.log(error);
                }
            });
        }
    </script> -->

    <!-- Logout Modal-->
    <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
                    <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">×</span>
                    </button>
                </div>
                <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
                <div class="modal-footer">
                    <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
                    <a class="btn btn-primary" href="login.html">Logout</a>
                </div>
            </div>
        </div>
    </div>
    </div>

    <!-- Bootstrap core JavaScript-->
    <script src="{{asset('vendor/jquery/jquery.min.js')}}"></script>
    <script src="{{asset('vendor/bootstrap/js/bootstrap.bundle.min.js')}}"></script>

    <!-- Core plugin JavaScript-->
    <script src="{{asset('vendor/jquery-easing/jquery.easing.min.js')}}"></script>

    <!-- Custom scripts for all pages-->
    <script src="{{asset('js/sb-admin-2.min.js')}}"></script>

    <!-- Page level plugins -->
    <script src="{{asset('vendor/chart.js/Chart.min.js')}}"></script>

    <!-- Page level custom scripts -->
    <script src="{{asset('js/demo/chart-area-demo.js')}}"></script>
    <script src="{{asset('js/demo/chart-pie-demo.js')}}"></script>

    <script>
        $(document).ready(function() {
            $("form").hide();
        })

        $("#state").change(function() {
            stateChange($(this).val());
        });

        function stateChange(stateValue) {
            $("form").hide();

            switch (stateValue) {
                case 'tbk':
                    $("#testform").show();;
                case 'qld':
                    $("#testform2").show();;
                    // so on and so on...
            }
        }
    </script>

</body>

</html>