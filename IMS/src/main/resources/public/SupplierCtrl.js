imsApp.controller("SupplierViewCtrl", ['$scope', '$http',
function($scope, $http){
    $scope.getAllSuppliers = function(){
        $http({
            method: 'GET',
            url: "ec2-34-227-57-97.compute-1.amazonaws.com:8085/supplier/all"
        }).then(function successCallback(response) {
                $scope.suppliers = response.data; 
            }, function errorCallback(response) {
                alert("Unable to retreive suppliers!");
        });
    }();
}]);