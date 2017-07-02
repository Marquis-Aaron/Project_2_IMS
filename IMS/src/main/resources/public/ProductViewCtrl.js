imsApp.controller("ProductViewCtrl", ['$scope', '$http',
function($scope, $http){

    $scope.getAll = function(){

        $http({
            method: 'GET',
            url: "/product/all"
        }).then(function successCallback(response) {
                $scope.products = response.data; 
            }, function errorCallback(response) {
                alert("Unable to retreive products!");
        });
    }();
    
}]);