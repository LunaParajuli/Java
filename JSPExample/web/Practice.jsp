<%-- 
    Document   : practice
    Created on : Jan 19, 2024, 7:20:14 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%--
        <h1>Hello World!</h1>
        <%out.println("Hello World! My First JSP Page");%>
        <%!int a=5;%>
        <%out.println(a);%>
        
        <%=(2*5)%>   <%--Expression tag--%>
        
       --%>
       
       <%-- comment:JSP Scripting elements --%>
       <%! int i=0; %>
       <% i++; %>
       Welcome to world  of JSP!
       <%="This page hs been accessed "+i+" times"%>
       
    </body>
</html>
