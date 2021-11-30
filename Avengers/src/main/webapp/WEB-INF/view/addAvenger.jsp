<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
   <title>Avengers Info </title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" 
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>
   <hr>
<div class="container">
    <h3>Create New Avenger</h3>
     <form action="saveAvenger" method="POST">
    <div class="row">
            <div class="form-group col-lg-6">
                <label >Avenger Id</label>
                <input type="text" placeholder="Avenger Id" class="form-control" value="${avenger.avengersId}" name="avengersId" >
            </div>
        </div>
        <div class="row">
            <div class="form-group col-lg-6">
                <label >Avenger Class</label>
                <input type="text" placeholder="Avnegers class" class="form-control"  value="${avenger.avengersTitle}" name="avengersTitle">
            </div>
        </div>
        <div class="row">
            <div class="form-group col-lg-6">
                <label >Avenger Name</label>
                <input type="text" placeholder="Avenger Name" class="form-control" value="${avenger.avengersName}" name="avengersName" >
            </div>
        </div>
        <div class="row">
            <div class="form-group col-lg-6">
                <label >Avenger Category</label>
                <input type="text" placeholder="Avenger Category" class="form-control" value="${avenger.category}" name="category">
            </div>
        </div>
        <button type="submit" class="btn btn-primary" >Submit</button>
    </form>
</div>
</body>
</body>
</html>