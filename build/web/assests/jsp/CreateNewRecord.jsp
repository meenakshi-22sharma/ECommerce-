<%-- 
    Document   : CreateNewRecord
    Created on : 17 Jul, 2018, 2:37:38 PM
    Author     : Meenakshi Sharma
--%>

<%@page import="com.jdbc.ErrorMessageInterface"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="com.jdbc.InsertNewUser"%>

<%@page contentType="text/html" errorPage="error.jsp" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Record</title>
    </head>
    <body>
        
        <jsp:useBean id='obj' class="com.beans.RegisterClass">
          </jsp:useBean>
        
        <jsp:setProperty name="obj" param="fullname" property="fullname"></jsp:setProperty>
        <jsp:setProperty name="obj" param="email" property="email"></jsp:setProperty>
        <jsp:setProperty name="obj" param="username" property="username"></jsp:setProperty>
        <jsp:setProperty name="obj" param="password" property="password"></jsp:setProperty>
        <jsp:setProperty name="obj" param="telephone" property="telephone"></jsp:setProperty>
        
        
        <%
       
        
        boolean UserRegister = InsertNewUser.insertUser(obj);
       
        
           
           if(!UserRegister)
           {
              RequestDispatcher res=request.getRequestDispatcher("loginPage.jsp");
              res.forward(request,response);
           }
           else
           {
               String dob = request.getParameter("dob");
              RequestDispatcher res=request.getRequestDispatcher("Createuser.jsp");
              res.include(request,response);
              out.print("Wrong credentials Try again !!!");
              out.print(dob);
              out.print(ErrorMessageInterface.USER_ERRROR_MSG);
              
           }
        
        %>
       
        
        
    </body>
</html>
