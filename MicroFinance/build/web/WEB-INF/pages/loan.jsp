<%-- 
    Document   : loan
    Created on : Oct 18, 2017, 1:53:12 PM
    Author     : Thilina Kalum
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!--start top contents of page-->
<jsp:include page="/WEB-INF/pages/main/import-top.jsp"/>
<!--end top contents of page-->

<!--start page content-->
<section class="content-header">
    <h1>
        Start New Loan Session
        <small>manage Loan</small>
    </h1>
    <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Micro Finance</a></li>
        <li class="active">Start New LoanS Session</li>
    </ol>
</section>

<section class="content">
    <div class="col-lg-4" style="padding-top: 20px">
        <f:form method="post" modelAttribute="loan" >
            <table border="0" class="table table-condensed">
                <tr>
                    <td>Amount</td>
                    <td><f:input path="amount" cssClass="form-control"/></td>
                </tr>
                <tr>
                    <td>Instalment Count</td>
                    <td><f:input path="installmentCount" cssClass="form-control"/></td>
                </tr>
                <tr>
                    <td>Status</td>
                    <td><f:input path="status" cssClass="form-control"/></td>
                </tr>
                <tr>
                    <td>Fine</td>
                    <td><f:input path="fine" cssClass="form-control"/></td>
                </tr>
                <tr>
                    <td>Fine Rate</td>
                    <td><f:input path="fineRate" cssClass="form-control"/></td>
                </tr>
                <tr>
                    <td>Interest Rate</td>
                    <td><f:input path="interestRate" cssClass="form-control"/></td>
                </tr>
                <tr>
                    <td>Loan Request</td>
                    <td><f:input path="loanRequest" cssClass="form-control"/></td>
                    
                     <f:select path="group1" cssClass="form-control select2-selection--single">
                            <c:forEach var="item" items="${group_list}">
                                <option value="${item.id}">${item.name}</option>
                            </c:forEach>
                        </f:select>
                </tr>
            </table>
            <td><input type="submit" value="SAVE" class="btn btn-success" style="width: 359px"/></td>
        </f:form>
    </div>
    <div class="col-lg-6" style="padding-top: 20px">
        <table class="table table-bordered">


        </table>
    </div>
</section>
<!--end page content-->

<script>
    <%--<jsp:include page="customer-form.js"/>--%>
</script>

<!--start bottom contents of page-->
<jsp:include page="/WEB-INF/pages/main/import-bottom.jsp"/>
<!--end bottom contents of page-->
