<%-- 
    Document   : login
    Created on : 8 Jul, 2018, 2:16:40 PM
    Author     : Meenakshi Sharma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head></head>
    <body>
<div class="modal fade" id="exampleModalCenter" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
  <div class="modal-dialog modal-dialog-centered" role="document">
    <div class="modal-content" style="width: 425px;background-color: #F7F7F7;">
     
      <div class="modal-body text-center">
        
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      
           
          <img id="profile-img" class="profile-img-card" src="../../images/login.png" style="width: 100px;">
            <p id="profile-name" class="profile-name-card"></p>
            
            <form class="form-signin">
                <span id="reauth-email" class="reauth-email"></span>
                <input type="email" id="inputEmail" class="form-control" placeholder="Email address" required autofocus style="margin-bottom: 10px;">
                <input type="password" id="inputPassword" class="form-control" placeholder="Password" required style="margin-bottom: 10px; margin-top: 10px;">
                <span class="help-block d-none d-print-block" style="float: left; color: crimson">Please enter valid username/password
                 </span>
               
                
                <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit"">Login</button>
            </form><!-- /form -->
            
            <div id="remember" class="checkbox">
                    <label>
                        <input type="checkbox" value="remember-me"> Remember me
                    </label>
                </div>
            <a href="#" class="forgot-password">
                Forgot the password?
            </a>
       
   
      </div>
      
    </div>
  </div>
</div>
        
</body>
</html>