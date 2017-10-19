<%-- 
    Document   : group
    Created on : Sep 16, 2017, 8:02:14 PM
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
        Start New Group Session
        <small>manage group</small>
    </h1>
    <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Micro Finance</a></li>
        <li class="active">Start New Group Session</li>
    </ol>
</section>

<section class="content">
    <div class="col-lg-4" style="padding-top: 20px">
        <f:form method="post" modelAttribute="group" >
            <table border="0" class="table table-condensed">
                <tr>
                    <td>Name</td>
                    <td><f:input path="name" cssClass="form-control"/></td>
                </tr>
                <tr>
                    <td>Max Group Member</td>
                    <td><f:input path="maxGroupMembers" cssClass="form-control"/></td>
                </tr>
                <tr>
                    <td>Min Group Member</td>
                    <td><f:input path="minGroupMembers" cssClass="form-control"/></td>
                </tr>
            </table>
            <td><input type="submit" value="SAVE" class="btn btn-success" style="width: 359px"/></td>
        </f:form>
    </div>
    <div class="col-lg-6" style="padding-top: 20px">
        <table class="table table-bordered">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>NAME</th>
                    <th>OPEN DATE</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${group_list}" var="groupList">
                    <tr>
                        <td>${groupList.id}</td>
                        <td>${groupList.name}</td>
                        <td>${groupList.date}</td>
                    </tr>
                </c:forEach>

            </tbody>
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
