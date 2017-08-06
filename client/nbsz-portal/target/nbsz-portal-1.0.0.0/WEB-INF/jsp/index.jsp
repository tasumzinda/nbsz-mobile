<%@include file="template/header.jspf" %>
<div class="row">
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">
                Snapshot of Planned Visits as of <b>${currentPeriod.name}</b>
            </div>
            <div class="panel-body">
                <div class="row">
                    <div class="col-lg-12">
                        <table class="table">
                            <thead>
                                <tr>
                                    <th>Status</th>
                                       <th>Date</th>
                                    <th>Province</th>
                                    <th>District</th>
                                    <th>&nbsp;</th>
                                </tr>
                            </thead> 
                            <tbody>
                                <c:forEach var="visit" items="${visits}" varStatus="status">
                                    <c:choose>
                                        <c:when test='${(status.index)%2 eq 0}'>
                                            <c:set var="rowColor" value="even" scope="page"/>
                                        </c:when>
                                        <c:otherwise>
                                            <c:set var="rowColor" value="odd" scope="page"/>
                                        </c:otherwise>
                                    </c:choose>
                                    <tr class="${rowColor}">
                                        <td>${visit.visitStatus.name}</td>
                                        <td><spring:eval expression="visit.startDate"/></td>
                                        <td>${visit.facility.district.province.name}</td>
                                        <td>${visit.facility.district}</td>
                                        <td><img src="<c:url value="${visit.status}"/>"/></td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<%@include file="template/footer.jspf" %>