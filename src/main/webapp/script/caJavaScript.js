/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function () {

    $("#failed").hide();
    loadPage();

});

function loadPage() {

    //Start up
    $.ajax({
        url: 'api/person/all/complete',
        type: 'GET',
        contentType: 'application/json',
        success: function (res) {
            res.forEach(function (entry) {
                $('#people').append(
                        "<tr>" +
                        "<td class='tabletd'>" + entry.pid + "</td>" +
                        "<td class='tabletd'>" + entry.email + "</td>" +
                        "<td class='tabletd'>" + entry.firstName + "</td>" +
                        "<td class='tabletd'>" + entry.lastName + "</td>" +
                        "<td class='tabletd'>" + entry.hobbyCollection + "</td>" +
                        "<td class='tabletd'>" + entry.phoneCollection + "</td>" +
                        "<td class='tabletd'>" + entry.addressCollection + "</td>" +
                        "<td><button class='del'>delete</button> / <button class='edit'>edit</button></td>" +
                        "</tr>"
                        );
            });
        },
        error: function (error) {
            var json = JSON.parse(error.responseText);
            $("#failed").show().html(json["msg"]);
        }
    });

    //Create person
    $('.create').on('click', function () {
        $.ajax({
            success: function (res) {
                alert('created');
            },
            error: function (res) {
                console.log('error');
            }
        });
    });

    //edit person
    $('.edit').on('click', function () {
        $.ajax({
            success: function (res) {
                alert('edited');
            },
            error: function (res) {
                console.log('error');
            }
        });
    });

    //delete person
    $('.delete').on('click', function () {
        $.ajax({
            success: function (res) {
                alert('deleted');
            },
            error: function (res) {
                console.log('error');
            }
        });
    });

    //Get persons with a given hobby
    $('.givHobGet').on('click', function () {
        $.ajax({
            success: function (res) {
                alert('got all persons with the given hobby');
            },
            error: function (res) {
                console.log('error');
            }
        });
    });

    //Persons living in a given city
    $('.givCityGet').on('click', function () {
        $.ajax({
            url: 'all/complete/zipcode/' + $("#givenCity").val(),
            type: 'GET',
            contentType: 'application/json',
            success: function (entry) {
                $("people").append(
                        "<tr>" +
                        "<td class='tabletd'>" + entry.pid + "</td>" +
                        "<td class='tabletd'>" + entry.email + "</td>" +
                        "<td class='tabletd'>" + entry.firstName + "</td>" +
                        "<td class='tabletd'>" + entry.lastName + "</td>" +
                        "<td class='tabletd'>" + entry.hobbyCollection + "</td>" +
                        "<td class='tabletd'>" + entry.phoneCollection + "</td>" +
                        "<td class='tabletd'>" + entry.addressCollection + "</td>" +
                        "<td><button class='del'>delete</button> / <button class='edit'>edit</button></td>" +
                        "</tr>"
                        );
            },
            error: function () {
                var json = JSON.parse(error.responseText);
                $("#failed").show().html(json["msg"]);
            }
        });
    });

    //Get the count of people with a given hobby
    $('.givCoHobGet').on('click', function () {
        $.ajax({
            success: function (res) {
                alert('Got the count of people with this given hobby');
            },
            error: function (res) {
                console.log('error');
            }
        });
    });

    //Get person by ID
    $('.byIdGet').on('click', function () {
        $.ajax({
            url: 'api/person/all/' + $("#personId").val(),
            type: 'GET',
            contentType: 'application/json',
            success: function (entry) {
                $("#people").remove();
                $("#people").append(
                        "<tr>" +
                        "<td class='tabletd'>" + entry.pid + "</td>" +
                        "<td class='tabletd'>" + entry.email + "</td>" +
                        "<td class='tabletd'>" + entry.firstName + "</td>" +
                        "<td class='tabletd'>" + entry.lastName + "</td>" +
                        "<td class='tabletd'>" + entry.hobbyCollection + "</td>" +
                        "<td class='tabletd'>" + entry.phoneCollection + "</td>" +
                        "<td class='tabletd'>" + entry.addressCollection + "</td>" +
                        "<td><button class='del'>delete</button> / <button class='edit'>edit</button></td>" +
                        "</tr>"
                        );
            },
            error: function (error) {
                var json = JSON.parse(error.responseText);
                $("#failed").show().html(json["msg"]);
            }
        });
    });

    //Get person info by ID
    $('.byInfoIdGet').on('click', function () {
        $.ajax({
            url: 'api/person/all/' + $("#personId").val(),
            type: 'GET',
            contentType: 'application/json',
            success: function (entry) {
                $("#people").remove();
                $("#people").append(
                        "<tr>" +
                        "<td class='tabletd'>" + entry.pid + "</td>" +
                        "<td class='tabletd'>" + entry.email + "</td>" +
                        "<td class='tabletd'>---</td>" +
                        "<td class='tabletd'>---</td>" +
                        "<td class='tabletd'>" + entry.hobbyCollection + "</td>" +
                        "<td class='tabletd'>" + entry.phoneCollection + "</td>" +
                        "<td class='tabletd'>" + entry.addressCollection + "</td>" +
                        "<td><button class='del'>delete</button> / <button class='edit'>edit</button></td>" +
                        "</tr>"
                        );
            },
            error: function (error) {
                var json = JSON.parse(error.responseText);
                $("#failed").show().html(json["msg"]);
            }
        });
    });

    //Get a list of all zip codes in Denmark
    $('.zipGet').on('click', function () {
        $.ajax({
            success: function (res) {
                alert('Got all the zip codes in Denmark');
            },
            error: function (res) {
                console.log('error');
            }
        });
    });

    //Get list of companies with more than xx employees
    $('.comGet').on('click', function () {
        $.ajax({
            success: function (res) {
                alert('Got the companies with more than xx employees');
            },
            error: function (res) {
                console.log('error');
            }
        });
    });
}


function editable() {

    $(".del").click(function () {
        var row = $(this).closest('tr');
        row.remove();
        $.ajax({
            url: 'api/person/' + $(row).find("td:first-child").text(),
            type: 'DELETE',
            success: function () {
                $('#people').remove($(row));
            },
            error: function (error) {
                var json = JSON.parse(error.responseText);
                $("#failed").show().html(json["msg"]);
            }
        });
    });

    $(".edit").click(function () {
        var row = $(this).closest('tr');
        var person = {
            personid: $(row).find("td:first-child").text(),
            email: $("#email").val(),
            firstName: $("#fname").val(),
            lastName: $("#lname").val(),
            addres: $("#CStreet").val(),
            phone: $("#CPhoneNumber").val(),
            hobby: $("#CHobbyName").val()
        };
        $.ajax({
            url: 'api/person',
            type: 'POST',
            contentType: 'application/json',
            data: JSON.stringify(person),
            success: function (res) {
                $(row).find("td:first-child").text(res.id);
                $(row).find("td:nth-child(2)").text(res.email);
                $(row).find("td:nth-child(3)").text(res.fname);
                $(row).find("td:nth-child(4)").text(res.lname);
                $(row).find("td:nth-child(5)").text(res.hobbyCollection);
                $(row).find("td:nth-child(6)").text(res.phoneCollection);
                $(row).find("td:nth-child(7)").text(res.addressCollection);
                location.reload();
            },
            error: function (error) {
                var json = JSON.parse(error.responseText);
                $("#failed").show().html(json["msg"]);
            }
        });
    });

}


