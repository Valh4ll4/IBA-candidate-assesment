<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
    <head>
        <title>Welcome page</title>
    </head>
    <body>
        <c:set var="message" scope="page" value="Hello IBA!"/>
        <h2> 
            <c:choose>
                <c:when test="${x > 1}">
                    <c:forEach begin="1" end="${x}">
                        ${message}
                        <br/>
                    </c:forEach>
                </c:when>
                <c:when test="${x <= 0}">
                    You supplied wrong parameter 'x' therefore gracefully here 
                    is the message only once:<br/>
                    ${message}
                </c:when>
                <c:otherwise>
                    ${message}
                </c:otherwise>
            </c:choose>
        </h2>
    </body>
</html>
