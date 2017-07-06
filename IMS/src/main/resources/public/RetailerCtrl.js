imsApp.controller("RetailerViewCtrl", ['$scope', '$http',
function($scope, $http){
    $http({
        method: 'GET',
        url: "/retailer/all"
    }).then(function successCallback(response) {
            $scope.retailers = response.data; 
        }, function errorCallback(response) {
            alert("Unable to retreive retailers!");
    });
    
}]);