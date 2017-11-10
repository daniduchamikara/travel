<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="Creative - Bootstrap 3 Responsive Admin Template">
        <meta name="author" content="GeeksLabs">
        <meta name="keyword" content="Creative, Dashboard, Admin, Template, Theme, Bootstrap, Responsive, Retina, Minimal">
        <link rel="shortcut icon" href="img/favicon.png">

        <title>Blank | Creative - Bootstrap 3 Responsive Admin Template</title>

        <!-- Bootstrap CSS -->    
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <!-- bootstrap theme -->
        <link href="css/bootstrap-theme.css" rel="stylesheet">
        <!--external css-->
        <!-- font icon -->
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
                            <h3 class="page-header"><i class="fa fa fa-bars"></i> Pages</h3>
                            <ol class="breadcrumb">
                                <li><i class="fa fa-home"></i><a href="index.html">Home</a></li>
                                <li><i class="fa fa-bars"></i>Pages</li>
                                <li><i class="fa fa-square-o"></i>Pages</li>
                            </ol>
                        </div>
                    </div>
                    <div class="panel-body">
                        <form class="form-horizontal " action="createVehicle" method="POST">
                            <div class="form-group">
                                <label class="col-sm-2 control-label">Vehicle Name</label>
                                <div class="col-sm-6">
                                    <input type="text" id="vname" name="vname" class="form-control" placeholder="Vehicle Name Will Auto Complete">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-sm-2 control-label">Regitration Number</label>
                                <div class="col-sm-3">
                                    <input id="regno" type="text" name="regno" class="form-control">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-sm-2 control-label">Vehicle Model</label>
                                <div class="col-sm-3">
                                    <input id="vmodel" type="text" name="vmodel" class="form-control" onkeyup="sync()">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-sm-2 control-label">Year</label>
                                <div class="col-sm-3">
                                    <input type="text" name="vyear" class="form-control">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-sm-2 control-label">Vehicle Type</label>
                                <div class="col-sm-3">
                                    <div class="btn-group" data-toggle="buttons">
                                        <label class="btn btn-primary active">
                                            <input name="vtype" type="radio">   Car  
                                        </label>
                                        <label class="btn btn-primary">
                                            <input value="van" name="vtype" type="radio">   Van  
                                        </label>
                                        <label class="btn btn-primary">
                                            <input value="bus" name="vtype" type="radio">   Bus  
                                        </label>
                                    </div>
                                </div>
                            </div>


                            <div class="form-group">
                                <label class="col-sm-2 control-label">AC</label>
                                <div class="col-sm-3">
                                    <div class="btn-group" data-toggle="buttons">
                                        <label class="btn btn-primary active">
                                            <input name="ac" type="radio">   AC  
                                        </label>
                                        <label class="btn btn-primary">
                                            <input name="ac" type="radio">   NonAc  
                                        </label>
                                    </div>
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-sm-2 control-label">Vehicle Fee</label>
                                <div class="col-sm-3">
                                    <input type="text" name="fee" class="form-control">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-sm-2 control-label"></label>
                                <div class="col-sm-3">
                                    <input type="submit" class="btn  btn-success" value="SAVE Vehicle">
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
        <script src="js/jquery.js">
            function sync() {
                                            var fn, ln, result;
                                            fn = document.getElementById("vmodel").value;
                                            ln = document.getElementById("regno").value;
                                            result = (fn + "-"+ln);
                                            document.getElementById("vname").value = result;

                                        }
            
            
        </script>
        <script src="js/bootstrap.min.js"></script>
        <!-- nice scroll -->
        <script src="js/jquery.scrollTo.min.js"></script>
        <script src="js/jquery.nicescroll.js" type="text/javascript"></script><!--custome script for all page-->

    </body>
</html>
