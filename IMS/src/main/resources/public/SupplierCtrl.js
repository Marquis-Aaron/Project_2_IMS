imsApp.controller("SupplierViewCtrl", ['$scope', '$http',
function($scope, $http){

    $http({
        method: 'GET',
        url: "/supplier/all"
    }).then(function successCallback(response) {
            $scope.suppliers = response.data; 
        }, function errorCallback(response) {
            alert("Unable to retreive suppliers!");
    });
    
}]);