<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="Creative - Bootstrap 3 Responsive Admin Template">
        <meta name="author" content="GeeksLabs">
        <meta name="keyword" content="Creative, Dashboard, Admin, Template, Theme, Bootstrap, Responsive, Retina, Minimal">
        <link rel="shortcut icon" href="img/favicon.png">

        <title>Update Location</title>

        <!-- Bootstrap CSS -->
        <!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">"-->    
        <link href="css/bootstrap.min.css" rel="stylesheet"
              <!-- bootstrap theme -->

              <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/bootstrap-theme.css" rel="stylesheet">
        <link href="css/elegant-icons-style.css" rel="stylesheet" />
        <link href="css/font-awesome.min.css" rel="stylesheet" />
        <!-- Custom styles -->
        <link href="css/style.css" rel="stylesheet">
        <link href="css/style-responsive.css" rel="stylesheet" />

        <!-- HTML5 shim and Respond.js IE8 support of HTML5 -->
        <!--[if lt IE 9]>
          <script src="js/html5shiv.js"></script>
          <script src="js/respond.min.js"></script>
          <script src="js/lte-ie7.js"></script>
        <![endif]-->
    </head>

    <body>
        <!-- container section start -->
        <section id="container" class="">
            <!--header start-->

            <header class="header dark-bg">
                <div class="toggle-nav">
                    <div class="icon-reorder tooltips" data-original-title="Toggle Navigation" data-placement="bottom"><i class="icon_menu"></i></div>
                </div>

                <!--logo start-->
                <a href="index.html" class="logo">Tropical <span class="lite">Travel</span></a>
                <!--logo end-->

                <!--  search form end -->                
                </div>
            </header>      
            <!--header end-->

            <!--sidebar start-->
            <aside>
                <div id="sidebar"  class="nav-collapse ">
                    <!-- sidebar menu start-->
                    <ul class="sidebar-menu">                
                        <li class="">
                            <a class="" href="index.html">
                                <i class="icon_house_alt"></i>
                                <span>Dashboard</span>
                            </a>
                        </li>
                        <li class="sub-menu">
                            <a href="javascript:;" class="">
                                <i class="icon_document_alt"></i>
                                <span>Trip Detail</span>
                                <span class="menu-arrow arrow_carrot-right"></span>
                            </a>
                            <ul class="sub">
                                <li><a class="" href="form_component.html">Form Elements</a></li>                          
                                <li><a class="" href="form_validation.html">Form Validation</a></li>
                            </ul>
                        </li>       


                        <li class="sub-menu">
                            <a href="javascript:;" class="">
                                <i class="icon_table"></i>
                                <span>Vehicle Detail</span>
                                <span class="menu-arrow arrow_carrot-right"></span>
                            </a>
                            <ul class="sub">
                                <li><a class="" href="http://localhost:8080/App2.2/addnewvehicle">Add Vehicle</a></li>
                                <li><a class="" href="http://localhost:8080/App2.2/viewallvehicle">View Vehicle</a></li>

                            </ul>
                        </li>

                        <li class="sub-menu">
                            <a href="javascript:;" class="">
                                <i class="icon_table"></i>
                                <span>User Detail</span>
                                <span class="menu-arrow arrow_carrot-right"></span>
                            </a>
                            <ul class="sub">
                                <li><a class="" href="http://localhost:8080/App2.2/adduser">Signup User</a></li>
                                <li><a class="" href="http://localhost:8080/App2.2/viewallusers">View Users</a></li>
                            </ul>
                        </li>

                        <li class="sub-menu">
                            <a href="javascript:;" class="">
                                <i class="icon_table"></i>
                                <span>HOTEL Detail</span>
                                <span class="menu-arrow arrow_carrot-right"></span>
                            </a>
                            <ul class="sub">
                                <li><a class="" href="http://localhost:8080/App2.2/addnewhotel">Add Hotel</a></li>
                                <li><a class="" href="http://localhost:8080/App2.2/">View Hotel</a></li>

                            </ul>
                        </li>
                        <li class="sub-menu">
                            <a href="javascript:;" class="">
                                <i class="icon_table"></i>
                                <span>Driver Detail</span>
                                <span class="menu-arrow arrow_carrot-right"></span>
                            </a>
                            <ul class="sub">
                                <li><a class="" href="http://localhost:8080/App2.2/driverform">Add Driver</a></li>
                                <li><a class="" href="http://localhost:8080/App2.2/toviewdrivers">View Driver</a></li>

                            </ul>
                        </li>
                        <li class="sub-menu">
                            <a href="javascript:;" class="">
                                <i class="icon_table"></i>
                                <span>Customer Detail</span>
                                <span class="menu-arrow arrow_carrot-right"></span>
                            </a>
                            <ul class="sub">
                                <li><a class="" href="http://localhost:8080/App2.2/addcus">Add Customer</a></li>
                                <li><a class="" href="http://localhost:8080/App2.2/toviewdrivers">View Customer</a></li>

                            </ul>
                        </li>


                    </ul>
                    <!-- sidebar menu end-->
                </div>
            </aside>
            <!--sidebar end-->

            <!--main content start-->
            <section id="main-content">
                <section class="wrapper">
                    <div class="row">
                        <div class="col-lg-12">
                            <h3 class="page-header"><i class="fa fa fa-bars"></i> Add New Hotel</h3>
                            <ol class="breadcrumb">
                                <li><i class="fa fa-home"></i><a href="index.html">Home</a></li>
                                <li><i class="fa fa-square-o"></i>Add New Hotel</li>
                            </ol>
                        </div>
                    </div>
                    <div class="panel-body">
                        <form class="form-horizontal" action="addnewhotel" method="POST" >
                            <div class="form-group">
                                <label class="col-sm-2 control-label">Hotel Name</label>
                                <div class="col-sm-6">
                                    <input name="name" type="text" class="form-control" placeholder="Enter Loaction Name">
                                </div>
                            </div>


                            <div class="form-group">
                                <label class="col-sm-2 control-label">Address </label>
                                <div class="col-sm-3">
                                    <input name="address1" type="text" class="form-control" placeholder="Address Line 1"><br>
                                    <input name="address2" type="text" class="form-control" placeholder="Address Line 2"><br>
                                    <input name="address3" type="text" class="form-control" placeholder="Address Line 3">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-sm-2 control-label">Phone </label>  
                                <div class="col-sm-3">
                                    <input name="phone" type="text" class="form-control" placeholder="If Exihst">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-sm-2 control-label">Star Rate </label>  
                                <div class="btn-group" data-toggle="buttons">
                                    <label class="btn btn-default active">
                                        <input type="radio" name="srate" id="option1" value="1"> 1 Star
                                    </label>
                                    <label class="btn btn-default ">
                                        <input type="radio" name="srate" id="option1" value="2"> 2 Star
                                    </label>
                                    <label class="btn btn-default ">
                                        <input type="radio" name="srate" id="option1" value="3"> 3 Star
                                    </label>
                                    <label class="btn btn-default">
                                        <input type="radio" name="srate" id="option2" value="4"> 4 Star
                                    </label>
                                    <label class="btn btn-default">
                                        <input type="radio" name="srate" id="option3" value="5"> 5 Star
                                    </label>
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-sm-2 control-label"></label>
                                <div class="col-sm-3">
                                    <input type="submit" class="btn btn btn-success" value="S A V E">
                                </div>
                            </div>

                        </form>
                    </div>
                </section>
            </section>
            <!--main content end-->

        </section>
        <!-- container section end -->
        <!-- javascripts -->
        <script src="js/jquery.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <!-- nice scroll -->
        <script src="js/jquery.scrollTo.min.js"></script>
        <script src="js/jquery.nicescroll.js" type="text/javascript"></script><!--custome script for all page-->
        <script src="js/scripts.js"></script>


    </body>
</html>
