/* 
 * Copyright 2015 Judge Muzinda.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

$(function () {
    $('#tableList').dataTable({"aaSorting": []});
});
$(function () {
    $('.itemList').dataTable({"aaSorting": []});
});
$("#centre").change(function () {
    $this = $(this);
    $("#collectSite").val("");
    $.get("http://localhost:8084/nbsz-portal/global/getcentrecollectsites", {"centre": $this.val()}, function (data) {
        $("#collectSite").html(processDropDown(data));
    });
});
$("#startDate").datepicker({
    changeMonth: true,
    changeYear: true,
    dateFormat: 'dd/mm/yy'
});
$("#endDate").datepicker({
    changeMonth: true,
    changeYear: true,
    dateFormat: 'dd/mm/yy'
});
$("#entryDate").datepicker({
    changeMonth: true,
    changeYear: true,
    dateFormat: 'dd/mm/yy'
});
function processDropDown(items) {
    var list = "<option value=''>--Select Item--</option>";
    for (var x = 0; x < items.length; x++) {
        list += "<option value='" + items[x].id + "'>" + items[x].name + "</option>";
    }
    return list;
}