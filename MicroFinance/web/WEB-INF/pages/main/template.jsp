<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!--start top contents of page-->
<jsp:include page="/WEB-INF/main/pages/import-top.jsp"/>
<!--end top contents of page-->

<!--start page content-->
<section class="content-header">
    <h1>
        Customer Control Panel
        <small>create new customers</small>
    </h1>
    <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Control Panel</a></li>
        <li class="active">Customer Control Panel</li>
    </ol>
</section>

<section class="content">
    <!--start item basic information-->
    <div class="box box-primary">
        <div class="box-header with-border">
            <h3 class="box-title">Customer Information</h3>
        </div>

        <div class="box-body  no-padding" id="item-list">
            <!--content-->
        </div>
    </div>

</section>
<!--end page content-->



<!--start bottom contents of page-->
<jsp:include page="/WEB-INF/main/pages/import-bottom.jsp"/>
<!--end bottom contents of page-->
