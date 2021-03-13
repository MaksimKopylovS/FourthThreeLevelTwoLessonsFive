angular.module('app', []).controller('indexController', function ($scope, $http) {
    const contextPath = 'http://localhost:8190/get-products';

    $scope.fillTable = function () {
        $http.get(contextPath)
        .then(function (response) {
            console.log(response)
        });

    };




});