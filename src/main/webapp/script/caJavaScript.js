/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function () {
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
            success: function (res) {
                alert('Found the persons living in this city');
            },
            error: function (res) {
                console.log('error');
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
            success: function (res) {
                alert('Founf the person by his/her id');
            },
            error: function (res) {
                console.log('error');
            }
        });
    });

    //Get person info by ID
    $('.byInfoIdGet').on('click', function () {
        $.ajax({
            success: function (res) {
                alert('Found the info on this person by his id');
            },
            error: function (res) {
                console.log('error');
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
});

