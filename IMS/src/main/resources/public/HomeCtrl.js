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

    $scope.out = true;
    $scope.under = true;
    $scope.close = true;

    $scope.changeNotification = function(x){
        $scope.out = false;
        $scope.under = false;
        $scope.close = false;
        switch (x){
            case "out":
                $scope.out = true;
                break;
            case "under":
                $scope.under = true;
                break;
            case "close":
                $scope.close = true;
                break;
            case "all":
                $scope.out = true;
                $scope.under = true;
                $scope.close = true;
                break;
        }
    }
}]);