<%@include file="../template/header.jspf" %>
<form:form commandName="item">
    <legend>${pageTitle}</legend> 
    <div>
        <table class="table table-bordered" width="100%">
            <tr>
                <td>
                    <a href="${page}/admin/user/">Manage Users</a>
                </td> 
                <td>
                    <a href="${page}/admin/incentive/">Manage Incentives</a>
                </td>
                <td>
                    <a href="${page}/admin/donor/donor-entry">Donors</a>
                </td>
            </tr>
            <tr>
                <td>
                    <a href="${page}/admin/adverse-effects/">Manage Adverse Effects</a>
                </td>
            </tr>
        </table>
    </div>
    <div>
    </div>
</form:form>
<%@include file="../template/footer.jspf" %>