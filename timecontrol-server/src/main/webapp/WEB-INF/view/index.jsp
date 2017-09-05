<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<html lang="en">
  <head>
  
  <title></title>
  
    <spring:url value="resources/css/bootstrap.min.css" var="bootstrap"/>
    <spring:url value="resources/css/font-awesome.min.css" var="fontawesome"/>

    <link href="${bootstrap}" rel="stylesheet" />    
    <link href="${fontawesome}" rel="stylesheet">

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
 
  </head>

<body>

<img src="resources/images/login.jpg" alt="" style="position: absolute;
    left: 0;
    right: 0;
    width: 100%;
    z-index: -1;">

<div class="container-fluid">
   <div class="row">
      <div class="col-md-4">
      </div>     
      <div class="col-md-2">
         <div class="modal-dialog" style="margin: 50px auto">
			<div class="modal-content" style="background-color: rgb(0, 0, 0, 0); width: 350px">
	
				<form class="" role="form" name="frm"
					action="<c:url value='login'/>" method="post">
					<div class="modal-body">

						<div class="input-group">
							<span class="input-group-addon"><span
								class="glyphicon glyphicon-user"></span></span> <input type="text"
								name="username" class="form-control" placeholder="login" autocomplete="off">
						</div>
						<div class="form-group"></div>
						<div class="input-group">
							<span class="input-group-addon"><span
								class="glyphicon glyphicon-lock"></span></span><input type="password"
								name="password" class="form-control" placeholder="password" autocomplete="off">
						</div>
						<div class="form-group">
							<input type="hidden"
								name="<c:out value="${_csrf.parameterName}"/>"
								value="<c:out value="${_csrf.token}"/>" />
						</div>


						<div class="form-group text-danger">
						<button type="submit" class="btn btn-primary">Log In</button>
							<c:if test="${not empty param.login_error}">
								<strong> access denied </strong>
							</c:if>
																		
						</div>

					</div>

				</form>
			</div>
		</div>

      </div>
      
      <div class="col-md-6">
      </div> 
   </div>
  </div>     

    <script src="resources/js/bootstrap.min.js"></script>   
  </body>
</html>
		
	


