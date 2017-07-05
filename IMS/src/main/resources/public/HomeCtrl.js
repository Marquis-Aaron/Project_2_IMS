imsApp.controller("HomeCtrl", ['$scope', '$http',
function($scope, $http){

    // Gets all notifications to display on the home controller
    $http({
        method: 'GET',
        url: "/ri/soldOut"
    }).then(function successCallback(response) {
            $scope.soldOut = response.data; 
        }, function errorCallback(response) {
            alert("Unable to retreive orders!");
    });

    $http({
        method: 'GET',
        url: "/ri/below"
    }).then(function successCallback(response) {
            $scope.below = response.data; 
        }, function errorCallback(response) {
            alert("Unable to retreive orders!");
    });

    $http({
        method: 'GET',
        url: "/ri/near"
    }).then(function successCallback(response) {
            $scope.near = response.data; 
        }, function errorCallback(response) {
            alert("Unable to retreive orders!");
    });

}]);