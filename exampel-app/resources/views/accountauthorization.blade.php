<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

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
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">


</head>

<body id="page-top" onload ="getData()">
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

                        <form action="" method="post">
                            <div class="mb-3">
                                <label for="exampleFormControlInput1" class="form-label">Pilih Jenis Nasabah</label>
                                <select class="form-select" aria-label="Default select example">
                                    <option selected>Select CIF</option>
                                    <option value="1">CIF Perorangan</option>
                                    <option value="2">CIF Anak</option>
                                    <option value="3">CIF Perusahaan</option>
                                </select>
                            </div>

                            <hr>

                            <div class="card shadow">


                                <!-- ======PEMBUKAAN REKENING====== -->

                                <p class="text-pembukaan col-lg-3">Otorisasi Pembukaan Rekening</p>
                                <div class="card-body text-form">

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Pencarian Nasabah/Rekening/CIF)</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="number" class="form-control" onchange="getData()" aria-describedby="emailHelp"  id="cifnumberform">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Jenis Pembukaan</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example" id="productcode" onchange="getData()>
                                                <option selected>- Silahkan Pilih -</option>
                                                <option value="6020">TABUNGAN BISNIS</option>
                                            </select>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Produk</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example" id="accountpurpose" onchange="getData()">
                                                <option selected>- Silahkan Pilih -</option>                                          
                                                <option value="1">HAJI</option>
                                                <option value="2">INVESTASI</option>
                                                <option value="3">LAINNYA</option>
                                                <option value="4">MENYIMPAN DANA</option>
                                                <option value="5">PEMBAYARAN GAJI</option>
                                                <option value="6">PINJAMAN</option>                                               
                                                <option value="7">TRANSAKSI UMROH</option>                                             
                                            </select>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Status</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <select class="form-select" aria-label="Default select example">
                                                <option selected>- Silahkan Pilih -</option>                                          
                                                <option value="1">KTP</option>                                        
                                            </select>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">

                                        </div>
                                        <div class="col-lg-1">

                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <label class="btn btn-info"  role="button">Submit</label>
                                        </div>
                                    </div>



                                    <table id="data_tbl" class="table table-striped mt-5">
                                        <thead>
                                            <tr>
                                                <th scope="col">No</th>
                                                <th scope="col">Nama Perusahaan</th>
                                                <th scope="col">Produk</th>
                                                <th scope="col">Nomor CIF</th>
                                                <th scope="col">Nomor Rekening</th>
                                                <th scope="col">Jenis Pembukaan Rekening</th>
                                                <th scope="col">Status</th>
                                                <th scope="col">Tanggal Permohonan</th>
                                                <th scope="col">Tanggal Otorisasi</th>
                                            </tr>
                                        </thead>
                                        <tbody id="account_data_tbl">
                                            
                                        </tbody>
                                    </table>

                                    <hr>

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

    <div class="modal fade" id="account_detail_information_new" tabindex="-1" aria-labelledby="modalTambahBarang" aria-hidden="true" >
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title">Informasi Nasabah</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                </div>
                <div class="modal-body">
                    <!--FORM TAMBAH BARANG-->
                    <form id="authorize-form">
                                    @csrf
                                    <div class="form-group " hidden>
                                        <label for="">id</label>
                                        <label type="text" class="form-control" id="id" aria-describedby="emailHelp">
                                    </div>


                                    <div class="form-group">
                                        <label for=""><b>Informasi Pembukaan Rekening</b></label>                 
                                    </div>

                                    <div class="form-group ">
                                        <label for="">Jenis Produk</label>
                                        <label type="text" class="form-control" id="productCode" aria-describedby="emailHelp">
                                    </div>

                                    <div class="form-group">
                                        <label for="">Tujuan Buka Rekening</label>
                                        <label type="text" class="form-control" id="acOpenPurpose" name="addJumlahBarang">
                                    </div>

                                    <div class="form-group">
                                        <label for="">Mata Uang</label>
                                        <label type="text" class="form-control" id="currency" name="addJumlahBarang">
                                    </div>

                                    <div class="form-group">
                                        <label for="">Bentuk Badan Usaha / Lembang</label>
                                        <label type="text" class="form-control" id="businessType" name="addJumlahBarang">
                                    </div>

                                    <div class="form-group">
                                    <hr style="height:2px;border-width:0;color:gray;background-color:gray">
                                    </div>  


                                    <div class="form-group">
                                        <label for=""><b>Informasi Data Nasabah</b></label>                 
                                    </div>

                                    <div class="form-group">
                                        <label for="">Nama Lengkap</label>
                                        <label type="text" class="form-control" id="name1" name="addJumlahBarang">
                                    </div>

                                    <div class="form-group">
                                        <label for="">Kewarganegaraan</label>
                                        <label type="text" class="form-control" id="nationality" name="addJumlahBarang">
                                    </div>

                                    <div class="form-group">
                                        <label for="">Status Kependudukan</label>
                                        <label type="text" class="form-control" id="status_kependudukan" name="addJumlahBarang">
                                    </div>

                                    <div class="form-group">
                                        <label for="">No.NPWP</label>
                                        <label type="text" class="form-control" id="taxID" name="addJumlahBarang">
                                    </div>

                                    <div class="form-group">
                                        <label for="">Sumber Dana</label>
                                        <label type="text" class="form-control" id="fundSource" name="addJumlahBarang">
                                    </div>

                                    <div class="form-group">
                                    <hr style="height:2px;border-width:0;color:gray;background-color:gray">
                                    </div>  
                                    
                                    <div class="form-group">
                                        <label for=""><b>Informasi Data Perusahaan</b></label>                 
                                    </div>
                                    
                                    
                                    <div class="form-group">
                                        <label for="">Nama Perusahaan</label>
                                        <label type="text" class="form-control" id="shortName" name="addJumlahBarang">
                                    </div>

                                    <div class="form-group">
                                        <label for="">Bidang Usaha</label>
                                        <label type="text" class="form-control" id="sector" name="addJumlahBarang">
                                    </div>

                                    <div class="form-group">
                                        <label for="">Bidang Usaha</label>
                                        <label type="text" class="form-control" id="bidang_usaha" name="addJumlahBarang">
                                    </div>

                                    <div class="form-group">
                                        <label for="">Laporan Keuangan</label>
                                        <label type="text" class="form-control" id="laporan_keuangan" name="addJumlahBarang">
                                    </div>

                                    <div class="form-group">
                                        <label for="">Deskripsi Kegiatan Usaha</label>
                                        <label type="text" class="form-control" id="deskripsi_usaha" name="addJumlahBarang">
                                    </div>

                                    <div class="form-group">
                                        <label for="">Alamat Perusahaan</label>
                                        <label type="text" class="form-control" id="alamat_perusahaan" name="addJumlahBarang">
                                    </div>

                                    <div class="form-group">
                                        <label for="">RT/RW</label>
                                        <label type="text" class="form-control" id="RT" name="addJumlahBarang">
                                        <!-- <label type="text" class="form-control" id="RW" name="addJumlahBarang"> -->
                                    </div>

                                    <div class="form-group">
                                        <label for="">Provinsi</label>
                                        <label type="text" class="form-control" id="provinsi" name="addJumlahBarang">
                                    </div>

                                    <div class="form-group">
                                        <label for="">Kabupaten/Kota</label>
                                        <label type="text" class="form-control" id="kabupaten_kota" name="addJumlahBarang">
                                    </div>

                                    <div class="form-group">
                                        <label for="">Kode Pos</label>
                                        <label type="text" class="form-control" id="kode_pos" name="addJumlahBarang">
                                    </div>

                                    <div class="form-group">
                                        <label for="">Negara</label>
                                        <label type="text" class="form-control" id="negara" name="addJumlahBarang">
                                    </div>

                                    <div class="form-group">
                                        <label for="">No. Telp Kantor</label>
                                        <label type="text" class="form-control" id="no_telp_kantor" name="addJumlahBarang">
                                    </div>

                                    <div class="form-group">
                                        <label for="">Kel Fasilitas</label>
                                        <label type="text" class="form-control" id="kel_fasilitas" name="addJumlahBarang">
                                    </div>


                                    <div class="form-group">
                                    <hr style="height:2px;border-width:0;color:gray;background-color:gray">
                                    </div>  

                                    <div class="form-group">
                                        <label for=""><b>Informasi Surat Perizinan Pendirian Perusahaan</b></label>                 
                                    </div>

                                    <div class="form-group">
                                        <label for="">No. Akta Pendirian</label>
                                        <label type="text" class="form-control" id="no_akta_pendirian" name="addJumlahBarang">
                                    </div>

                                    <div class="form-group">
                                        <label for="">Tgl. Akta Pendirian</label>
                                        <label type="text" class="form-control" id="tgl_akta_pendirian" name="addJumlahBarang">
                                    </div>

                                    <div class="form-group">
                                        <label for="">No. Akta SIUP</label>
                                        <label type="text" class="form-control" id="no_akta_siup" name="addJumlahBarang">
                                    </div>

                                    <div class="form-group">
                                        <label for="">Penerbitan SIUP</label>
                                        <label type="text" class="form-control" id="penerbitan_siup" name="addJumlahBarang">
                                    </div>

                                    <div class="form-group">
                                        <label for="">Tgl. Berakhir SIUP</label>
                                        <label type="text" class="form-control" id="tgl_berakhir_siup" name="addJumlahBarang">
                                    </div>

                                    <div class="form-group">
                                        <label for="">No. SITU</label>
                                        <label type="text" class="form-control" id="no_situ" name="addJumlahBarang">
                                    </div>

                                    <div class="form-group">
                                        <label for="">Penerbitan SITU</label>
                                        <label type="text" class="form-control" id="penerbitan_situ" name="addJumlahBarang">
                                    </div>

                                    <div class="form-group">
                                        <label for="">Tgl. Berakhir SITU</label>
                                        <label type="text" class="form-control" id="tgl_berakhir_situ" name="addJumlahBarang">
                                    </div>

                                    <div class="form-group">
                                        <label for="">No. SK Menteri</label>
                                        <label type="text" class="form-control" id="no_sk_menteri" name="addJumlahBarang">
                                    </div>

                                    <div class="form-group">
                                        <label for="">Penerbitan SK Menteri</label>
                                        <label type="text" class="form-control" id="penerbitan_sk_menteri" name="addJumlahBarang">
                                    </div>

                                    <div class="form-group">
                                        <label for="">Tgl. Berakhir SK Menteri</label>
                                        <label type="text" class="form-control" id="tgl_berakhir_sk_menteri" name="addJumlahBarang">
                                    </div>

                                    <div class="form-group">
                                        <label for="">No. TDP</label>
                                        <label type="text" class="form-control" id="no_tdp" name="addJumlahBarang">
                                    </div>

                                    <div class="form-group">
                                        <label for="">Penerbitan TDP</label>
                                        <label type="text" class="form-control" id="penerbitan_tdp" name="addJumlahBarang">
                                    </div>

                                    <div class="form-group">
                                        <label for="">Tgl. Berakhir TDP</label>
                                        <label type="text" class="form-control" id="tgl_berakhir_tdp" name="addJumlahBarang">
                                    </div>


                                    <div class="form-group">
                                    <hr style="height:2px;border-width:0;color:gray;background-color:gray">
                                    </div>  


                                    <div class="form-group">
                                        <label for=""><b>Informasi Data Pengurus Perusahaan</b></label>                 
                                    </div>

                                    <div class="form-group">
                                        <label for="">Nama Pengurus</label>
                                        <label type="text" class="form-control" id="nama_pengurus" name="addJumlahBarang">
                                    </div>

                                    <div class="form-group">
                                        <label for="">Jabatan Pengurus</label>
                                        <label type="text" class="form-control" id="jabatan_pengurus" name="addJumlahBarang">
                                    </div>

                                    <div class="form-group">
                                        <label for="">Kelompok Nasabah</label>
                                        <label type="text" class="form-control" id="kelompok_nasabah" name="addJumlahBarang">
                                    </div>

                                    <div class="form-group">
                                        <label for="">Segment BUC</label>
                                        <label type="text" class="form-control" id="segment_buc" name="addJumlahBarang">
                                    </div>


                                    <div class="form-group">
                                    <hr style="height:2px;border-width:0;color:gray;background-color:gray">
                                    </div>  

                                    <div class="form-group">
                                        <label for=""><b>Informasi Tambahan (Optional)</b></label>                 
                                    </div>

                                    <div class="form-group">
                                        <label for="">Zakat</label>
                                        <label type="text" class="form-control" id="zakat" name="addJumlahBarang">
                                    </div>

                                    <div class="form-group">
                                        <label for="">Biaya Kartu ATM</label>
                                        <label type="text" class="form-control" id="biaya_kartu_atm" name="addJumlahBarang">
                                    </div>

                                    <div class="form-group">
                                    <hr style="height:2px;border-width:0;color:gray;background-color:gray">
                                    </div>  

                                    <div class="form-group">
                                        <label for=""><b>Informasi Fasilitas E-Channel</b></label>                 
                                    </div>

                                    <div class="form-group">
                                        <label for="">Fasilitas</label>
                                        <label type="text" class="form-control" id="fasilitas" name="addJumlahBarang">
                                    </div>

                                    <div class="form-group">
                                    <hr style="height:2px;border-width:0;color:gray;background-color:gray">
                                    </div>  

                                    <div class="form-group">
                                        <label for=""><b>Informasi Lainnya</b></label>                 
                                    </div>

                                    <div class="form-group">
                                        <label for="">Status</label>
                                        <label type="text" class="form-control" id="status" name="addJumlahBarang">
                                    </div>

                                    <div class="form-group">
                                        <label for="">Tanggal Permohonan</label>
                                        <label type="text" class="form-control" id="tanggal_permohonan" name="addJumlahBarang">
                                    </div>

                                    <div class="form-group">
                                        <label for="">Tanggal Otorisasi</label>
                                        <label type="text" class="form-control" id="tanggal_otorisasi" name="addJumlahBarang">
                                    </div>

                                    <div class="form-group">
                                        <hr style="height:2px;border-width:0;color:gray;background-color:gray">
                                    </div>  

                                    <div>
                                    <!-- 
                                            <div class="col-lg-3">
                                                <button for="exampleInputEmail1" class="btn btn-success float-right mb-1">Reject</button>
                                            </div>
                                            
                                            <div class="col-lg-3">
                                                <button for="exampleInputEmail1" class="btn btn-success float-right mb-1">Accept</button>
                                            </div>
                                        -->

                                        <div class="row">
                                            <div class="col-lg-6 col-md-6">
                                                <a class="btn btn-danger float-right mb-1" onclick="authorizeAccountRejected(this)"><span style="color:white">Reject</span></a>
                                            </div>
                                            <div class="col-lg-6 col-md-6">
                                                <a class="btn btn-info float-left mb-2" onclick="authorizeAccount(this)"><span style="color:white">Accept</span></a>
                                            </div>
                                        </div>
                                    </div> 
                    </form>
                    <!--END FORM TAMBAH BARANG-->
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
        function getData(){
            // console.log(document.getElementById("accountpurpose").value);
            // console.log(document.getElementById("productcode").value);
            // console.log(document.getElementById("status").value);
            // $("#account_data_tbl tbody").remove();
            var table = document.getElementById("account_data_tbl");

            while(table.rows.length > 0) {
              table.deleteRow(0);
            }

            account_purpose = document.getElementById("accountpurpose").value;
            product = document.getElementById("productcode").value;
            // status = document.getElementById("status").value;
            var cif_number= document.getElementById("cifnumberform").value;

            if(document.getElementById("accountpurpose").value == "null"){
                acOpenPurpose ="";
            }
            if(document.getElementById("productcode").value == "null"){
                productCode ="";
            }
            // if(document.getElementById("status").value == "null"){
            //     status ="";
            // }
            if(document.getElementById("cifnumberform").value == "null"){
                cifNo ="";
            }
            $.ajax({
                url: "/get-all-account",
                method:"get",
                data:{
                    _token: "{{ csrf_token() }}",
                    acOpenPurpose: account_purpose,
                    productCode: product,
                    status: "Waiting Authorization",
                    cifNo: "%"+cif_number+"%",
                    date_of_start:"",
                    date_of_finish:""
                },
                success:function(response){
                    console.log(response.message);
                    console.log(response.data);
                    var role = '{{ Session::get('user')->role;}}';;

                    if(response.message == "Get all account success!") {
                        var len = response.data.length;
                        console.log(len);
                        if(len>0){
                            for( var i = 0; i<len; i++){
                                var row = i+1;
                            
                                if(response.data[i].status == "1" && role != "2" && response.data[i].cifNo != ""){
                                    console.log(response.data[i].shortName);
                                    console.log(response.data[i].productCode);
                                    console.log(response.data[i].cifNo);
                                    
                                    $('#account_data_tbl').append('<tr> <td>' + row + '</td>  <td>' + response.data[i].shortName + '</td> <td>' + response.data[i].productCode + '</td> <td>' + response.data[i].cifNo  + '</td> <td>' + response.data[i].accNo+ '</td> <td>' + response.data[i].acOpenPurpose + '</td> <td>' + response.data[i].status+ '</td> <td>' + response.data[i].userCreatedDate + " / "+ response.data[i].userCreatedTime + " / " +response.data[i].userCreatedByName +'</td> <td>' + " " 
                                        +"</td> <td> <button type=\"button\" class=\"btn btn-success float-right mb-1\" data-toggle=\"modal\" data-target=\"#account_detail_information\" onclick=\"getDetailData(this)\" data-id="+response.data[i].id+" data-shortname="+response.data[i].shortName +">Otorisasi</button></td></tr>");
                                    
                                // }else if(response.data[i].status == "1" && role != "2" && response.data[i].cifNo  == ""){
                                //     $('#account_data_tbl').append('<tr> <td>' + row + '</td>  <td>' + response.data[i].shortName + '</td> <td>' + response.data[i].product.description + '</td> <td>' + response.data[i].cifNo  + '</td> <td>' + response.data[i].accountNo+ '</td> <td>' + response.data[i].retail.description + '</td> <td>' + response.data[i].status+ '</td> <td>' + response.data[i].userCreatedDate + " / "+ response.data[i].userCreatedTime + " / " +response.data[i].userCreatedByName + " / " +response.data[i].userCreatedBranch +'</td> <td>' + " " 
                                        
                                //         +"</td> <td> <button type=\"button\" class=\"btn btn-success float-right mb-1\" data-toggle=\"modal\" data-target=\"#account_detail_information\" onclick=\"getDetailData(this)\" data-id="+response.data[i].id+" data-shortname="+response.data[i].shortName +" data-producttype = "+response.data[i].product.description +" data-productpurpose = "+response.data[i].retail.description+"  data-printedname = "+response.data[i].shortName+" data-legalnumber = "+response.data[i].customerCIF.legalIdNo+" data-placeofbirth = "+response.data[i].placeBirth+" data-dateofbirth = "+response.data[i].dateOfBirth+" data-mothername = "+response.data[i].mothMaiden+" data-zakat = "+response.data[i].zakatt.description+" data-accountofficer = "+response.data[i].accountOfficer+">Otorisasi</button></td></tr>");
                                // }else if(response.data[i].status == "Rejected" ){
                                //     $('#account_data_tbl').append('<tr> <td>' + row + '</td>  <td>' + response.data[i].shortName + '</td> <td>' + response.data[i].product.description + '</td> <td>' + response.data[i].cifNo  + '</td> <td>' + response.data[i].accountNo+ '</td> <td>' + response.data[i].retail.description + '</td> <td style="color: red;">' + response.data[i].status+ '</td> <td>' + response.data[i].userCreatedDate + " / "+ response.data[i].userCreatedTime + " / " +response.data[i].userCreatedByName + " / " +response.data[i].userCreatedBranch +'</td> <td>' + response.data[i].userApprovedDate + " /" + response.data[i].userApprovedTime + " / " +response.data[i].userApprovedByName + " / " +response.data[i].userApprovedBranch +'</td></tr>');
                                // }else if(response.data[i].status != "Waiting Authorization" ){
                                //     $('#account_data_tbl').append('<tr> <td>' + row + '</td>  <td>' + response.data[i].shortName + '</td> <td>' + response.data[i].product.description + '</td> <td>' + response.data[i].cifNo  + '</td> <td>' + response.data[i].accountNo+ '</td> <td>' + response.data[i].retail.description + '</td> <td>' + response.data[i].status+ '</td> <td>' + response.data[i].userCreatedDate + " / "+ response.data[i].userCreatedTime + " / " +response.data[i].userCreatedByName + " / " +response.data[i].userCreatedBranch +'</td> <td>' + response.data[i].userApprovedDate + " /" + response.data[i].userApprovedTime + " / " +response.data[i].userApprovedByName + " / " +response.data[i].userApprovedBranch +'</td></tr>');
                                // }else{
                                //     $('#account_data_tbl').append('<tr> <td>' + row + '</td>  <td>' + response.data[i].shortName + '</td> <td>' + response.data[i].product.description + '</td> <td>' + response.data[i].cifNo  + '</td> <td>' + response.data[i].accountNo+ '</td> <td>' + response.data[i].retail.description + '</td> <td>' + response.data[i].status+ '</td> <td>' + response.data[i].userCreatedDate + " / "+ response.data[i].userCreatedTime + " / " +response.data[i].userCreatedByName + " / " +response.data[i].userCreatedBranch +'</td> <td></td></tr>');
                                }
                            }
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
                        }, 
                        function (dismiss) {
                            return false;
                        })
                    }
                },
                error: function(error) {
                    console.log(error);
                }
            });
        }

        function getDetailData(element){
            console.log($(element).data('shortname'));
            var id = $(element).data('id');
            // var dateBirth = $(element).data('dateofbirth').toString();
            // const myArray = dateBirth.split("");
            // year = myArray[0]+myArray[1]+myArray[2]+myArray[3];
            // month = myArray[4]+myArray[5];
            // date = myArray[6]+myArray[7];

            $('#id_account').text($(element).data('id'));
            $('#nasabah_name').text($(element).data('shortname'));
            $('#product_type').text($(element).data('producttype'));
            $('#product_purpose').text($(element).data('productpurpose'));
            $('#cif_number').text($(element).data('cifnumber'));
            $('#printed_name').text($(element).data('printedname'));
            $('#legal_number').text($(element).data('legalnumber'));
            
            $('#place_of_birth').text($(element).data('placeofbirth'));
            $('#date_of_birth').text(date+" - "+month+" - "+year);
            $('#mother_name').text($(element).data('mothername'));
            $('#zakat').text($(element).data('zakat'));
            $('#account_officer').text($(element).data('accountofficer'));
        }

        function authorizeAccount(element) {
            let username = $("#nasabah_name").text();
            let cif_number  = $("#cif_number").text();
            let accountid  = $("#id_account").text();
            // console.log(username);
            // console.log(cif_number);

            swal.fire({
                title: "Are you sure to authorize "+username +"'s account?",
                icon: 'question',
                text: "Please ensure and then confirm!",
                type: "warning",
                showCancelButton: !0,
                confirmButtonText: "Yes",
                cancelButtonText: "No",
                reverseButtons: !0
            }).then(function (e) {
   

                if (e.value == true) {
                    $.ajax({
                        url: "/author-account",
                        method:"post",
                        data:{
                            _token:"{{ csrf_token() }}",
                            cif_number:cif_number,
                            id: accountid
                        },
                        beforeSend : function(){
                            $('#loading-bar').show();
                        },
                        success:function(response){
                            $('#loading-bar').hide();
                            console.log(response);
                          if(response.message == "Authorization Account Success!" || response.message === "CIF Authorization Sucess!") {
                            Swal.fire({
                                title: 'Info',
                                text: "Authorization "+ username+ "'s account success",
                                icon: 'success',
                                showCancelButton: false,
                                confirmButtonText: 'Yes!',
                              }).then(function (e) {
                                if (e.value == true) {
                                    window.location="{{url('/account-otorisasi')}}";
                                }

                            }, function (dismiss) {
                                return false;
                            })
                          }else{
                            Swal.fire({
                                title: 'Error!!',
                                text: response.message,
                                icon: 'error',
                                showCancelButton: false,
                                confirmButtonText: 'Yes!',
                            }).then(function (e) {
                                if (e.value == true) {
                                    window.location="{{url('/account-otorisasi')}}";
                                }

                            }, 
                            function (dismiss) {
                                return false;
                            })
                          }
                        },
                        error: function(error) {
                            console.log(error);
                        }
                    });


                } else {
                    e.dismiss;
                }

            }, function (dismiss) {
                return false;
            })
        }   
    </script>    
</body>

</html>