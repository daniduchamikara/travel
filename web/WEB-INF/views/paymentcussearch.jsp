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

        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
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
                            <h3 class="page-header"><i class="fa fa fa-bars"></i>View Customers</h3>
                            <ol class="breadcrumb">
                                <li><i class="fa fa-home"></i><a href="index.html">Home</a></li>
                                <li><i class="fa fa-bars"></i>Pages</li>
                                <li><i class="fa fa-square-o"></i>View Customers</li>
                            </ol>
                        </div>
                    </div>
                    <div class="panel-body">
                        <div class="row">
                            <div class="col-lg-12">
                                <section class="panel">
                                    <header class="panel-heading">
                                        Search or Add New Customer
                                    </header>
                                    <div class="panel-body">
                                        <form class="form-inline" role="form" action="http://localhost:8080/App2.2/topayment">
                                            <div>
                                                <input type="text" name="mobile" class="form form-group">
                                                <input type="submit"  class="btn btn-danger" value="Search Customer" />
                                            </div>

                                            <div class="col-lg-12">
                                                <section class="panel">
                                                    <header class="panel-heading">
                                                        ALL Customers
                                                    </header>
                                                    <sql:setDataSource var="dbsource" driver="com.mysql.jdbc.Driver"
                                                                       url="jdbc:mysql://localhost/absd"
                                                                       user="root"  password=""/>

                                                    <sql:query dataSource="${dbsource}" var="result">
                                                        SELECT * from customer where phone="${param.mobile}";
                                                    </sql:query>
                                                    
                                                    <table class="table table-striped table-advance table-hover">
                                                        <tbody>
                                                            <tr>
                                                                <th><i class="icon_profile"></i>Customer Name</th>
                                                                <th><i class="icon_calendar"></i>Address </th>
                                                                <th><i class="icon_mail_alt"></i>Country</th>
                                                                <th><i class="icon_mobile"></i>Mobile</th>
                                                                <th><i class="icon_pin_alt"></i> Email</th>
                                                                <th><i class="icon_pin_alt"></i>Passport</th>
                                                                <th><i class="icon_cogs"></i> Action</th>
                                                            </tr>
                                                            <tr>
                                                                <c:forEach var="row" items="${result.rows}">
                                                                <tr>
                                                                    <%-- <td><c:out value="${row.id}"/></td>--%>
                                                                    <td><c:out value="${row.name}"/></td>
                                                                    <td><c:out value="${row.address}"/></td>
                                                                    <td><c:out value="${row.country}"/></td>
                                                                    <td><c:out value="${row.phone}"/></td>
                                                                    <td><c:out value="${row.email}"/></td>
                                                                    <td><c:out value="${row.passportNo}"/></td>
                                                                    <td>
                                                                        <div class="btn-group">
                                                                            <a class="btn btn-success" href="http://localhost:8080/App2.2/toselecttrip?cusid=<c:out value="${row.customerId}"/>"><i class="icon_check_alt2"></i></a>
                                                                        </div>
                                                                    </td>
                                                                </c:forEach>
                                                            </tr>                                
                                                        </tbody>
                                                    </table>
                                                </section>
                                            </div>
                                        </form>
                                    </div>
                                </section>
                            </div>
                        </div>
                        <form class="form-horizontal " method="get">

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
