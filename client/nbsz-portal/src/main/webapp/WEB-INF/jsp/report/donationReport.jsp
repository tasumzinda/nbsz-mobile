<%@include file="../template/header.jspf" %>
<div class="row">
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">
                ${pageTitle}
            </div>
            <div class="panel-body">
                <%@include file="../template/message.jspf" %>
                <div class="row">
                    <a href="${page}/report/index.htm">&DoubleLeftArrow; Back To Reports DashBoard Home</a>
                    <%@include file="../template/searchDateFragment.jspf" %>
                    <div class="col-lg-12">
                        <!--Dashboard panels here -->
                        <div class="row">
                            <div class="col-lg-12">
                                <div class="panel panel-default">
                                    <%--<%@include file="../template/table.jspf" %>--%>
                                    <table id="tableList" class="display" cellspacing="0">
                        <thead>
                        <th>First Name</th>
                        <th>Surname</th>
                        <th>Collect Site</th>
                        <th>Donation Date</th>
                        <th>&nbsp</th>
                        </thead>
                        <tfoot>
                        <th>First Name</th>
                        <th>Surname</th>
                        <th>Collect Site</th>
                        <th>Donation Date</th>
                        <th>&nbsp</th>
                        </tfoot>
                        <tbody>
                            <c:forEach var="donor" items="${items}" >
                                <tr>
                                    <td>${donor.firstName}</td>
                                    <td>${donor.surname}</td>
                                    <td>${donor.collectSite.name}</td>
                                    <td>${donor.entryDate}</td>
                                    <td><a href="<c:url value="/admin/donor/form?id=${donor.id}"/>">Generate Form</a></td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                                    <div class="panel-footer" style="text-align: right">
                                        Export/ View As
                                        <a href="${page}${excelExport}">
                                            <img src="<c:url value="/resources/images/excel.jpeg"/>"/>
                                        </a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<%@include file="../template/footer.jspf" %>
<script type="text/javascript">
    $(".sidebar-nav").addClass("custom-side-bar-ref");
    $("#page-wrapper").addClass("main-wrp");
    // ensire toggle side bar is pointing right
    $("span.toggle-span").addClass("fa-long-arrow-right");
    $("span.toggle-span").removeClass("fa-long-arrow-left");
</script>