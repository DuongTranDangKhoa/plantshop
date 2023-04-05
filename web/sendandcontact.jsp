<%-- 
    Document   : contact
    Created on : Mar 1, 2023, 3:58:35 PM
    Author     : Khoa Duong
--%>

<%@page import="DAO.AccountDAO"%>
<%@page import="DTO.AccountDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="mycss.scss" type="text/css" />
    </head>
    <body>
        <% String email = (String) request.getAttribute("email_newAccount");%>
        Please, check your email: <%= email%>, a confirm code is sent to you.
        <footer>
            <% AccountDTO adminAcc = AccountDAO.getAccount("admin@gmail.com", "12345");
                if (adminAcc != null) {
            %>
            <p align="center"> contact us: <%= adminAcc.getEmail() %></p>
            <%        
                }
            %>
        </footer>
    </body>
</html>
