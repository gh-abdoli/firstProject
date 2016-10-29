/**
 * Created by gh-abdoli on 10/16/16.
 */

$(function () {
    $('.nav-tabs a[href$="#profile"]').click(function () {
        $('.myTable').html("");
        $.post("getPersons.do", function (list) {
            var personsList = JSON.parse(list);
            $.each(personsList, function (i, person) {
                var tr ="<tr>" +
                        "<td>" + person.id + "</td>" +
                        "<td>" + person.position + "</td>" +
                        "<td>" + person.name + "</td> "+
                        "<td>" + person.family + "</td>" +
                        "<td>" + person.dateOfBird + "</td>" +
                        "<td>" + person.experienceYear + "</td>" +
                        "<td>" + person.wage.wage + "</td>" +
                        "<td>" + "<button onclick='computeExtraWage(" + JSON.stringify(person) + ")' class='btn btn-default'>ExtraWage</button> " + "</td>" +
                        "<td>" + "<button onclick='removePerson(" + person.id  + ", this)' class='btn btn-default'><span class='glyphicon glyphicon-remove'/></button> </td>" +
                        "</tr>";
                $(".myTable").append(tr);
            })
        });
    });
});


var removePerson  = function (id, row) {

    var deleted = confirm("Are you sure you want to delete?");
    if (deleted == true) {
        $.post("removePerson.do",
            { idOfPerson: id }
        );
        document.getElementById('table').deleteRow(row.parentNode.parentNode.rowIndex);
    }
};

var compute = function (person, wageIncreaseRate, extraIncreament) {
    return (person.wage.wage + (person.wage.wage * (wageIncreaseRate/100)) +  (person.wage.wage * (extraIncreament/100)) * person.year);
};

var computeExtraWage = function (person) {
    switch (person.position) {
        case "MANAGER":
            alert(compute(person, 25, 15));
            break;
        case "LEADER":
            alert(compute(person, 25, 10));
            break;
        case "EMPLOYEE":
            alert(compute(person, 25, 0));
            break;
        case "DEPARTMENT_HEAD":
            alert(compute(person, 25, 15));
            break;
        }
};

$( function() {
    $("#datepicker").datepicker();
} );

$('#demolist li').click( function(){
    $('#datebox').val($(this).text());
});

var validate = function () {
    document.getElementById('a').innerHTML = "error"
};