<%-- 
    Document   : header
    Created on : 8 Jul, 2018, 2:20:44 PM
    Author     : Meenakshi Sharma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
 <header>
       <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="#">MESH MELO SHOP</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav ml-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
      </li>
      
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Categories
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="#">Indoor</a>
          <a class="dropdown-item" href="#">Outdoor</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">Antique Furniture</a>
        </div>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Contact</a>
      </li>
       <li class="nav-item"> <a class="nav-link" data-toggle="modal" data-target="#exampleModalCenter">
        Login
       </a></li>
        <%@include file="login.jsp" %>

      <li class="nav-item"> <a class="nav-link" data-toggle="modal" data-target="#signupModel">
        Signup
      </a></li>
       <%@include file="signup.jsp" %>
    </ul>
      
   
  </div>
</nav>

            <nav class="logo mx-auto">
                 <div class="navbar-header">
                     <a class="navbar-brand" href="#"><img src="assests/images/logo2.png" alt="Mesh Melo " class="img-fluid" style="width: 200px;
                z-index: -1;
                 height: 200px;
                position: absolute;
                top: -68%;">
                    </a>
                     <a href="#" id="cart"><i class="fas fa-shopping-cart"> My Cart</i>
                     </a>
                </div>
           </nav>  
            
                      
   <ul class="nav justify-content-center" id="category">
  <li class="nav-item">
    <a class="nav-link active" href="#">Sofas and Armchairs</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="#">Tables and Chairs</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="#">Storage Systems and Units</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="#">Sleeping area and children's bedrooms</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="#">Kid furniture</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="#">Furniture components and hardware</a>
  </li>
  </ul>          
             
        </header>

