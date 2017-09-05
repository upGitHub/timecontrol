<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
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

  <body ng-app="controlApp">

   <form class="navbar-form navbar-right" role="form"
			action="<c:url value="/logout"/>" method="post">
    <input class="btn btn-defaut" type="submit" value="Logout" /> 
    <security:csrfInput />
   </form>
   <br>
   <div class="container" ng-controller="ctrl">
	<div class="row">
		<div class="col-md-12">
		 <div class="panel panel-default">
		  <div class="panel-heading">Журнал учета рабочего времени</div>
          <div class="panel-body">
           <table class="table table-striped">
            <thead>
              <tr>
               <th>ID</th>
               <th>Сотрудник</th>
               <th>Время</th>
               <th>Датчик</th>
               <th>Хэш-код</th>
              </tr>
            </thead>
            <tbody>
             <tr ng-repeat="item in listrecord">
                <th>{{item.idRecord}}</th>
               <th>{{item.personM.name}}</th>
               <th>{{item.time | date:'dd-MM-yyyy HH:mm:ss'}}</th>
               <th>{{item.device}}</th>
               <th>{{item.personM.shaKey}}</th>
              </tr>
            </tbody>
           </table>
          </div>		 
		 
		 </div>
		</div>
	</div>
   </div>

    <script src="resources/js/bootstrap.min.js"></script>
    <script src="resources/js/angular.min.js"></script>
    <script src="resources/js/main.js"></script>
  </body>
</html>

			


  