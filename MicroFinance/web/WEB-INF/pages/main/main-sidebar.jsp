<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
        <!-- Sidebar user panel -->
        <div class="user-panel">
            <div class="pull-left image">
                <img src="${pageContext.request.contextPath}/resources/theme/img/user2-160x160.jpg" class="img-circle" alt="User Image">
            </div>
            <div class="pull-left info">
                <p>${sessionScope.user.type}</p>
                <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
            </div>
        </div>

        <ul class="sidebar-menu">
            <li class="header">MAIN NAVIGATION</li>

            <!--start home-->
            <li class="active">
                <a href="${pageContext.request.contextPath}/">
                    <i class="fa fa-th"></i> <span>Home</span>
                </a>
            </li>
            <!--end home-->
            <li class="active">
                <a href="client">
                    <i class="fa fa-bookmark"></i> <span>Client</span>
                </a>
            </li>

                <li class="active">
                    <a href="group">
                        <i class="fa fa-bell"></i> <span>Group</span>
                    </a>
                </li>
                <li class="active">
                    <a href="loan-request">
                        <i class="fa fa-circle"></i> <span>Loan Request</span>
                    </a>
                </li>
                <li class="active">
                    <a href="loan">
                        <i class="fa fa-circle"></i> <span>Loan</span>
                    </a>
                </li>
                <li class="active">
                    <a href="interest-rate">
                        <i class="fa fa-circle"></i> <span>Interest Rate</span>
                    </a>
                </li>
                <li class="active">
                    <a href="user">
                        <i class="fa fa-circle"></i> <span>User</span>
                    </a>
                </li>

                <li class="active">
                    <a href="/security/new-security-user">
                        <i class="fa fa-user"></i> <span>User Registration</span>
                    </a>
                </li>

                <li class="active">
                    <a href="${pageContext.request.contextPath}/user/quiz-session-list">
                        <i class="fa fa-print"></i> <span>Reports</span>
                    </a>
                </li>
        </ul>
    </section>
    <!-- /.sidebar -->
</aside>