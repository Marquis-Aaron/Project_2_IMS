imsApp.controller("indexCtrl", ['$scope', '$stateProvider',
function($scope, $stateProvider){

    $scope.changeState = function(name){
        console.log("Changing state to " + name);
        $stateProvider.state(name);
    } 
    
}]);