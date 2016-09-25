<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
    <head>
        <title>Student Form</title>
    </head>
    <body>
        <h2> 
            Student input form
        </h2>
        <form action="/vano-java-webapp/studentData" method="GET">
            First Name: <input type="text" name="name">
            <br/>
            Last Name: <input type="text" name="surname" />
            <br/>
            Date of birth: <input type="text" name="birthdate" />
            <br/>
            Sex: <input type="text" name="sex" />
            <input type="submit" value="Submit" />
        </form>
    </body>
</html>
