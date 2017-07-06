imsApp.controller("SaleViewCtrl", ['$scope', '$http',
function($scope, $http){

    $http({
        method: 'GET',
        url: "/rs/all"
    }).then(function successCallback(response) {
            $scope.sales = response.data; 
        }, function errorCallback(response) {
            alert("Unable to retreive sales!");
    });
    
}]);