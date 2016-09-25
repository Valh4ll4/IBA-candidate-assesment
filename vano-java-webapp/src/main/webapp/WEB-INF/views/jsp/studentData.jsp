<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
    <head>
        <title>Student Data</title>
    </head>
    <body>
        <h2> 
            Student after-form data presentation
        </h2>
        First Name: ${student.name}
        <br/>
        Last Name: ${student.surname}
        <br/>
        Date of birth: ${student.birthdate}
        <br/>
        Sex: ${student.sex}
    </body>
</html>
