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

                                <p class="text-pembukaan col-lg-3">Daftar Pembukaan Rekening</p>
                                <div class="card-body text-form">

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Tanggal pembukaan</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="col-lg-2">
                                            <input type="date" class="form-control" id="date1" aria-describedby="emailHelp" onload ="getData()">
                                        </div>
                                        <div class="mb-3 col-lg-2">
                                        <input type="date" class="form-control" id="date2" aria-describedby="emailHelp" onload ="getData()" max="{{ now()->toDateString('Y-m-d') }}">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">
                                            <label for="exampleInputEmail1" class="form-label">Pencarian Nasabah/Rekening/CIF</label>
                                        </div>
                                        <div class="col-lg-1">
                                            <label for="exampleInputEmail1" class="form-label">:</label>
                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <input type="text" class="form-control" id="cifnumberform" aria-describedby="emailHelp" onchange="getData()">
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
                                            <select class="form-select" aria-label="Default select example" id="productcode" onchange="getData()">
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
                                                <option value="22">HAJI</option>
                                                <option value="13">INVESTASI</option>
                                                <option value="15">LAINNYA</option>
                                                <option value="11">MENYIMPAN DANA</option>
                                                <option value="12">PEMBAYARAN GAJI</option>
                                                <option value="14">PINJAMAN</option>
                                                <option value="21">TRANSAKSI UMROH</option>                 
                                                <option value="16">UMROH</option>  
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
                                            <select class="form-select" aria-label="Default select example" id="status" onchange="getData()">
                                                <option selected>- Silahkan Pilih -</option>
                                                <option value="9">Reject</option>   
                                                <option value="3">Success</option>   
                                                <option value="1">Waiting Authorization</option>                                        
                                            </select>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-lg-3">

                                        </div>
                                        <div class="col-lg-1">

                                        </div>
                                        <div class="mb-3 col-lg-6">
                                            <label class="btn btn-info  role=" button">Submit</label>
                                        </div>
                                    </div>

                                    <table class="table table-striped mt-5">
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
            status = document.getElementById("status").value;
            cif_number= document.getElementById("cifnumberform").value;
            date_start = document.getElementById("date1").value;
            date_finish = document.getElementById("date2").value;

            if(document.getElementById("accountpurpose").value == "null"){
                account_purpose ="";
            }
            if(document.getElementById("productcode").value == "null"){
                product ="";
            }
            if(document.getElementById("status").value == "null"){
                status ="";
            }
            if(document.getElementById("cifnumberform").value == "null"){
                cif_number ="";
            }
            if(document.getElementById("date1").value == ""){
                date_start ="";
            }else{
                date_start1 = document.getElementById("date1").value.split("-")
                date_start = date_start1[2]+"-"+date_start1[1]+"-"+date_start1[0]
            }

            if(document.getElementById("date2").value == ""){
                date_finish ="";
            }else{
                date_finish1 = document.getElementById("date2").value.split("-")
                date_finish = date_finish1[2]+"-"+date_finish1[1]+"-"+date_finish1[0]
            }

            $.ajax({
                url: "/get-all-account",
                method:"get",
                data:{
                    _token: "{{ csrf_token() }}",
                    account_purpose: account_purpose,
                    product: product,
                    status: status,
                    cif_number: "%"+cif_number+"%",
                    date_of_start: date_start,
                    date_of_finish: date_finish
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
                            
                                if(response.data[i].status == "3"){
                                    console.log(response.data[i].shortName);
                                    console.log(response.data[i].productCode);
                                    console.log(response.data[i].cifNo);
                                    
                                    $('#account_data_tbl').append('<tr> <td>' + row + '</td>  <td>' + response.data[i].shortName + '</td> <td>' + response.data[i].productCode + '</td> <td>' + response.data[i].cifNo  + '</td> <td>' + response.data[i].accNo+ '</td> <td>' + response.data[i].acOpenPurpose + '</td> <td>' + response.data[i].status+ '</td> <td>' + response.data[i].userCreatedDate + " / "+ response.data[i].userCreatedTime + " / " +response.data[i].userCreatedByName +'</td> <td>' + " ");
                                    
                                }else if(response.data[i].status == "9"){
                                    $('#account_data_tbl').append('<tr> <td>' + row + '</td>  <td>' + response.data[i].shortName + '</td> <td>' + response.data[i].productCode + '</td> <td>' + response.data[i].cifNo  + '</td> <td>' + response.data[i].accNo+ '</td> <td>' + response.data[i].acOpenPurpose + '</td> <td>' + response.data[i].status+ '</td> <td>' + response.data[i].userCreatedDate + " / "+ response.data[i].userCreatedTime + " / " +response.data[i].userCreatedByName +'</td> <td>' + " ");
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
    </script>

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

</body>

</html>