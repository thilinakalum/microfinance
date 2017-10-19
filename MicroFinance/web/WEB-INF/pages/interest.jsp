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
        <f:form method="post" modelAttribute="interest" >
            <table border="0" class="table table-condensed">
                <tr>
                    <td>Date</td>
                    <td><f:input type="date" path="date" cssClass="form-control"/></td>
                </tr>
                <tr>
                    <td>Rate (%)</td>
                    <td><f:input path="rate" cssClass="form-control"/></td>
                </tr>
            </table>
            <td><input type="submit" value="SAVE" class="btn btn-success" style="width: 359px"/></td>
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
