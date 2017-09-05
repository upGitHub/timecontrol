var app = angular.module("controlApp",[]);
app.controller("ctrl", function($scope, $http){
$scope.listrecord = [];
$http.get('http://localhost:8080/project/listrecord').
success(function(data, status, headers, config) {
	$scope.listrecord = data;
}).
error(function(data, status, headers, config) {
	
});


});
