<%@include file="../template/header.jspf" %>
<div class="col-lg-12">
    <div class="panel panel-default">
        <div class="panel-heading">
            User List
        </div>
        <div class="panel-body">
            <a href="user.form">New User</a> | <a href="user.list">User List</a>
            <hr/>
            <%@include file="../template/message.jspf" %>
            <div class="row">
                <div class="col-lg-10">
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
                                    <td><a href="<c:url value="/admin/user/user.form?id=${user.id}"/>">Edit</a></td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>

                </div>
            </div>

        </div>
        <div class="panel-footer">
            
        </div>
    </div>
</div>

<%@include file="../template/footer.jspf" %>