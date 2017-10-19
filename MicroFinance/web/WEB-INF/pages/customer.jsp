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
        <f:form method="post" modelAttribute="client">
            <table border="0" class="table table-condensed" >
                <tr>
                    <td>Title</td>
                    <td>
                        <f:select path="title" cssClass="form-control">
                            <f:option value="none" label="Select" />
                            <f:option value="MR" />
                            <f:option value="MS" />
                            <f:option value="MIS" />
                        </f:select>
                    </td>
                </tr>
                <tr>
                    <td>Name</td>
                    <td><f:input path="name" cssClass="form-control" /></td>
                </tr>
                <tr>
                    <td>Address</td>
                    <td><f:input path="address" cssClass="form-control" /></td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td><f:input path="email" cssClass="form-control" /></td>
                </tr>
                <tr>
                    <td>Mobile</td>
                    <td><f:input path="mobile" cssClass="form-control" /></td>
                </tr>
                <tr>
                    <td>NIC</td>
                    <td><f:input path="nic" cssClass="form-control"/></td>
                </tr>
                <tr>
                    <td>Job</td>
                    <td><f:input path="job" cssClass="form-control" /></td>
                </tr>
                <tr>
                    <td>Group</td>
                    <td>
                        <f:select path="group1" cssClass="form-control select2-selection--single">
                            <c:forEach var="item" items="${group_list}">
                                <option value="${item.id}">${item.name}</option>
                            </c:forEach>
                        </f:select>
                    </td>
                </tr>
            </table>
            <td><input type="submit" value="SAVE" class="btn btn-success" style="width: 359px"/></td>
            </f:form>
    </div>
    <div class="col-lg-8" style="padding-top: 20px">
        <table class="table table-bordered">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>NAME</th>
                    <th>ADDRESS</th>
                    <th>EMAIL</th>
                    <th>MOBILE</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${client_list}" var="clientList">
                    <tr>
                        <td>${clientList.id}</td>
                        <td>${clientList.name}</td>
                        <td>${clientList.address}</td>
                        <td>${clientList.email}</td>
                        <td>${clientList.mobile}</td>
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

