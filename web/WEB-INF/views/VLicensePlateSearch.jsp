<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Creative - Unia Travels">
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
                          <li><a class="" href="AddVehicle.html">Add Vehicle</a></li>
                           <li><a class="" href="ViewVehicle.html">View Vehicle</a></li>
                           <li><a class="" href="VSearchSelect.html">Search Vehicle</a></li>
                      </ul>

                  </li>
                  
                  <li class="sub-menu ">
                      <a href="javascript:;" class="">
                          <i class="icon_documents_alt"></i>
                          <span>Pages</span>
                          <span class="menu-arrow arrow_carrot-right"></span>
                      </a>
                      <ul class="sub">                          
                          <li><a class="" href="profile.html">Profile</a></li>
                          <li><a class="" href="login.html"><span>Login Page</span></a></li>
                          <li><a class="active" href="blank.html">Blank Page</a></li>
                          <li><a class="" href="404.html">404 Error</a></li>
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
					<h3 class="page-header"><i class="fa fa fa-bars"></i>Search Vehicles By License Plate</h3>
					<ol class="breadcrumb">
						<li><i class="fa fa-home"></i><a href="index.html">Home</a></li>
						<li><i class="fa fa-bars"></i>vehicles</li>
						<li><i class="fa fa-square-o"></i>serch type</li>
            <li><i class="fa fa-square-o"></i>License Plate Search</li>
					</ol>
				</div>
			</div>
            <div class="panel-body">
                <form class="form-horizontal " method="get">
                    <div class="col-lg-12">
                      <section class="col-lg-8">
                          <!--Code Here-->

                          <!--Search bar start-->
                          <div>
                          <br><br>
                              <div class="col-sm-6">
                              <input type="text" class="form-control round-input" placeholder="Enter Your License Plate Number">
                          </div>
                          <div class="col-sm-2">
                            <a class="btn btn-primary" href="" title="Bootstrap 3 themes generator"><span class="icon_search"></span> Search</a><br><br>
                          </div>
                          </div>
                          </section>
                           <!--Search bar END-->

                           <!--Table START-->
                           <section class="panel">
                           <div class="panel-body">
                           <table class="table table-striped table-advance table-hover">
                           <tbody>
                              <tr>
                                 <th><i class="icon_profile"></i></th>
                                 <th><i class="icon_calendar"></i> Date</th>
                                 <th><i class="icon_mail_alt"></i> Email</th>
                                 <th><i class="icon_pin_alt"></i> City</th>
                                 <th><i class="icon_mobile"></i> Mobile</th>
                                 <th><i class="icon_cogs"></i> Action</th>
                              </tr>
                              <tr>
                                 <td>Angeline Mcclain</td>
                                 <td>2004-07-06</td>
                                 <td>dale@chief.info</td>
                                 <td>Rosser</td>
                                 <td>176-026-5992</td>
                                 <td>
                                  <div class="btn-group">
                                      <a class="btn btn-primary" href="#"><i class="icon_plus_alt2"></i></a>
                                      <a class="btn btn-success" href="#"><i class="icon_check_alt2"></i></a>
                                      <a class="btn btn-danger" href="#"><i class="icon_close_alt2"></i></a>
                                  </div>
                                  </td>
                              </tr>                              
                           </tbody>
                        </table>
                        </div>
                           <!--Table END-->
                      </section>
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
