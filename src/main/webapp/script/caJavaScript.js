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
                editable();
            });
        },
        error: function (error) {
            var json = JSON.parse(error.responseText);
            $("#failed").show().html(json["msg"]);
        }
    });

    //Create person
    $('.create').on('click', function () {
        var person = {
            firstName : $("#CFirstName").val(),
            lastName : $("#CLastName").val(),
            email : $("#CEmail").val(),
            street : $("CStreet").val(),
            phoneNumber : $("#CPhoneNumber").val(),
            Hobby : $("#CHobbyName").val()
        };
        $.ajax({
            url: 'api/person',
            type: 'PUT',
            contentType: 'application/json',
            data: JSON.stringify(person),
            success: function (res) {
                $('#people').append(
                        "<tr>" +
                        "<td class='tabletd'>" + res.pid + "</td>" +
                        "<td class='tabletd'>" + res.firstName + "</td>" +
                        "<td class='tabletd'>" + res.lastName + "</td>" +
                        "<td class='tabletd'>" + res.email + "</td>" +
                        "<td class='tabletd'>" + res.hobbyCollection + "</td>" +
                        "<td class='tabletd'>" + res.phoneCollection + "</td>" +
                        "<td class='tabletd'>" + res.addressCollection + "</td>" +
                        "<td><button class='del'>delete</button> / <button class='edit'>edit</button></td>" +
                        "</tr>"
                        );
                editable();
            },
            error: function (error) {
                var json = JSON.parse(error.responseText);
                $("#failed").show().html(json["msg"]);
            }
        });
    });

    //Get persons with a given hobby
    $('.givHobGet').on('click', function () {
        $.ajax({
            url: 'api/hobby/single/' + $("#givenHobby").val(),
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
                editable();
            },
            error: function (error) {
                var json = JSON.parse(error.responseText);
                $("#failed").show().html(json["msg"]);
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
                editable();
            },
            error: function (error) {
                var json = JSON.parse(error.responseText);
                $("#failed").show().html(json["msg"]);
            }
        });
    });

    //Get the count of people with a given hobby
    $('.givCoHobGet').on('click', function () {
        $.ajax({
            url: 'api/hobby/all/' + $("#givenHobby").val(),
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
                editable();
            },
            error: function (error) {
                var json = JSON.parse(error.responseText);
                $("#failed").show().html(json["msg"]);
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
                editable();
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
                editable();
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
            url: 'api/cityinfo/zipcodes',
            type: 'GET',
            contentType: 'application/json',
            success: function (res) {
                $("#zipcodes").append(
                            "<tr>" +
                        "<td class='tabletd'>" + res.zipcode + "</td>" +
                        "</tr>"
                        );
                editable();
            },
            error: function (error) {
                var json = JSON.parse(error.responseText);
                $("#failed").show().html(json["msg"]);
            }
        });
    });

    //Get list of companies with more than xx employees
    $('.comGet').on('click', function () {
        $.ajax({
            url: 'api/company/all/population/' + $("#minpop").val(),
            type: 'GET',
            contentType: 'application/json',
            success: function (res) {
                $("#companies").append(
                            "<tr>" +
                        "<td class='tabletd'>" + res.cid + "</td>" +
                        "<td class='tabletd'>" + res.cvr + "</td>" +
                        "<td class='tabletd'>" + res.cname + "</td>" +
                        "<td class='tabletd'>" + res.description + "</td>" +
                        "<td class='tabletd'>" + res.no_of_employees + "</td>" +
                        "<td class='tabletd'>" + res.market_value + "</td>" +
                        "<td><button class='del'>delete</button> / <button class='edit'>edit</button></td>" +
                        "</tr>"
                        );
                editable();
            },
            error: function (res) {
                var json = JSON.parse(error.responseText);
                $("#failed").show().html(json["msg"]);
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


