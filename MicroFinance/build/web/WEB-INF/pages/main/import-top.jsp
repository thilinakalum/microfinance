<%-- 
    Document   : home
    Created on : May 9, 2016, 10:48:09 PM
    Author     : Mohan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Micro finance</title>

        <!-- Tell the browser to be responsive to screen width -->
        <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">

        <!-- Bootstrap 3.3.5 -->
        <link rel="stylesheet" href="resources/bootstrap/css/bootstrap.min.css">
        <!-- Font Awesome -->
        <link rel="stylesheet" href="resources/font-awesome/css/font-awesome.min.css">
        <!-- Theme style -->
        <link rel="stylesheet" href="resources/theme/css/AdminLTE.min.css">
        <!-- AdminLTE Skins. Choose a skin from the css/skins
             folder instead of downloading all of them to reduce the load. -->
        <link rel="stylesheet" href="resources/theme/css/skins/_all-skins.min.css">
        <!--jquery ui css-->
        <link rel="stylesheet" href="resources/jquery-ui/jquery-ui.min.css">
        <!--fonts-->
        <link rel="stylesheet" href="resources/fonts/fonts.css">
    </head>
    <body class="hold-transition skin-green sidebar-mini">
        <!--start js import-->

        <!-- jQuery 2.1.4 -->
        <script src="resources/jquery/jQuery-2.1.4.min.js"></script>
        <!-- jQuery UI 1.11.4 -->
        <script src="resources/jquery-ui/jquery-ui.min.js"></script>
        <!-- jQuery Toaster -->
        <script src="resources/jquery-toaster/jquery.toaster.js"></script>
        <!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
        <script>
            $.widget.bridge('uibutton', $.ui.button);
        </script>
        <!-- Bootstrap 3.3.5 -->
        <script src="resources/bootstrap/js/bootstrap.min.js"></script>
        <!-- AdminLTE App -->
        <script src="resources/theme/js/app.min.js"></script>
        <!--datatables-->
        <script src="resources/datatables/jquery.dataTables.min.js"></script>
        <script src="resources/datatables/dataTables.bootstrap.min.js"></script>


        <!--end js import-->

        <div class="wrapper">
            <jsp:include page="/WEB-INF/pages/main/main-header.jsp"/>

            <jsp:include page="/WEB-INF/pages/main/main-sidebar.jsp"/>

            <div class="content-wrapper">
