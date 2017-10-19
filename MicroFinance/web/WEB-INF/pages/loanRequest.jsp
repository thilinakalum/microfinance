<%-- 
    Document   : loanRequest
    Created on : Sep 16, 2017, 11:16:22 PM
    Author     : Thilina Kalum
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<!--start top contents of page-->
<jsp:include page="/WEB-INF/pages/main/import-top.jsp"/>
<!--end top contents of page-->

<!--start page content-->
<section class="content-header">
    <h1>
        Start New Loan Session
        <small>Create Loan Request</small>
    </h1>
    <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Micro Finance</a></li>
        <li class="active">Start New Group Session</li>
    </ol>
</section>

<section class="content">
    <div class="col-lg-4">

            
            
                       <f:form  method="post" modelAttribute="user">
                    <div cssClass="form-group has-feedback">
                        <f:input type="text" cssClass="form-control" placeholder="Name" path="name" />
                        <span class="glyphicon glyphicon-user form-control-feedback"></span>
                    </div>

                    <div cssClass="form-group has-feedback">
                        <f:input type="password" class="form-control" placeholder="Password" path="password" />
                        <span cssClass="glyphicon glyphicon-certificate form-control-feedback"></span>
                    </div>
                    <div cssClass="row">
                        <div cssClass="col-xs-12 form-group">
                            <f:button type="submit" cssClass="btn btn-primary btn-block btn-flat">Login</form:button>
                            </div>
                        </div>
                </f:form>
            
            
    </div>
</section>
<!--end page content-->

<script>
    <%--<jsp:include page="customer-form.js"/>--%>
</script>

<!--start bottom contents of page-->
<jsp:include page="/WEB-INF/pages/main/import-bottom.jsp"/>
<!--end bottom contents of page-->
