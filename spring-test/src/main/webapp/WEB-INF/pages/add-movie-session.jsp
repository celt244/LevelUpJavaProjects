<%--
  Created by IntelliJ IDEA.
  User: java
  Date: 07.07.2017
  Time: 20:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add movie session</title>
</head>
<body>

<%--<form:form action="/movie/add-session" method="post" modelAttribute="session">--%>

    <%--<form:input path="filmId" type="text" name="filmId" id="filmId"/>--%>
    <%--<form:input path="sessionStartDate" type="date" name="sessionStartDate" id="sessionStartDate"/>--%>
    <%--<form:input path="sessionStartTime" type="time" name="sessionStartTime" id="sessionStartTime"/>--%>
    <%--<form:input path="hallNumber" type="text" name="hallNumber" id="hallNumber"/>--%>
    <%--<form:input path="standardTicketPrice" type="text" name="standardTicketPrice" id="standardTicketPrice"/>--%>
    <%--<form:input path="comfortTicketPrice" type="text" name="comfortTicketPrice" id="comfortTicketPrice"/>--%>

    <%--<input type="submit" value="Add">--%>
    <%--<button onclick="history.back()">Cancel</button>--%>
<%--</form:form>--%>

<%--<form action="#">--%>
    <input type="text" name="filmId" id="filmId">
    <input type="date" name="sessionStartDate" id="sessionStartDate">
    <input type="time" name="sessionStartTime" id="sessionStartTime">
    <input type="text" name="hallNumber" id="hallNumber">
    <input type="text" name="standardTicketPrice" id="standardTicketPrice">
    <input type="text" name="comfortTicketPrice" id="comfortTicketPrice">

    <input type="button" onclick="addSession()" value="Add">
    <button onclick="history.back()">Cancel</button>
<%--</form>--%>

<script>
    function addSession(event) {
        let filmId = document.getElementById("filmId").value;
        let sessionStartDate = document.getElementById("sessionStartDate").value;
        let sessionStartTime = document.getElementById("sessionStartTime").value;
        let hallNumber = document.getElementById("hallNumber").value;
        let standardTicketPrice = document.getElementById("standardTicketPrice").value;
        let comfortTicketPrice = document.getElementById("comfortTicketPrice").value;

        let session = {filmId,sessionStartDate,sessionStartTime,hallNumber,standardTicketPrice,comfortTicketPrice};

        let sessionStr = JSON.stringify( session );

        console.log(sessionStr);

//        var data = new FormData();
//        data.append( "json",  sessionStr);

        let options = {

            mode: "cors"
         };

        fetch('http://localhost:8080/movie/add-session', {
            method : "post",
            headers: {
                "Accept":"application/json",
                "Content-Type" : "application/json"
            },
            body: JSON.stringify(session)
        })
//        .then(resp => resp.json())
        .then(res => console.log(res));
    }
</script>

</body>
</html>
