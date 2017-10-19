<%-- 
    Document   : customer
    Created on : Sep 11, 2017, 2:14:17 PM
    Author     : kalum
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>

<!--start top contents of page-->
<jsp:include page="/WEB-INF/pages/main/import-top.jsp"/>
<!--end top contents of page-->

<!--start page content-->
<section class="content-header">
    <h1>
        Start New Client Session
        <small>manage client</small>
    </h1>
    <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Micro Finance</a></li>
        <li class="active">Start New Client Session</li>
    </ol>
</section>

<section class="content">

    <div class="col-lg-4" style="padding-top: 20px" >
        <f:form method="post" modelAttribute="user">
            <table border="0" class="table table-condensed" > 
                <tr>
                    <td>Name</td>
                    <td><f:input path="name" cssClass="form-control" /></td>
                </tr>
                <tr>
                    <td>Role</td>
                    <td><f:input path="role" cssClass="form-control" /></td>
                </tr>
                <tr>
                    <td>User Name</td>
                    <td><f:input path="userName" cssClass="form-control" /></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><f:input path="password" cssClass="form-control" /></td>
                </tr>
            </table>
            <td><input type="submit" value="SAVE" class="btn btn-success" style="width: 359px"/></td>
            </f:form>
    </div>
    <div class="col-lg-8" style="padding-top: 20px">
        
    </div>
</section>
<!--end page content-->

<script>
    <%--<jsp:include page="customer-form.js"/>--%>
</script>

<!--start bottom contents of page-->
<jsp:include page="/WEB-INF/pages/main/import-bottom.jsp"/>
<!--end bottom contents of page-->

