<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Success</title>
<style type="text/css">
    span {
        display: inline-block;
        width: 200px;
        text-align: left;
    }
</style>
</head>
<body>
    <div align="center">
        <h2>Registration Succeeded!</h2>
        <span>Full name:</span><span>${user.name}</span><br/>
        <span>E-mail:</span><span>${user.email}</span><br/>
        <span>Password:</span><span>${user.password}</span><br/>
        <span>Birthday:</span><span>${user.birthday}</span><br/>
        <span>Gender:</span><span>${user.gender}</span><br/>
        <span>Employeed?:</span><span>${user.employed}</span><br/>
    </div>
</body>
</html>