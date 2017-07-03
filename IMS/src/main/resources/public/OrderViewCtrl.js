imsApp.controller("OrderViewCtrl", ['$scope', '$http',
function($scope, $http){

    $scope.getAll = function(){

        $http({
            method: 'GET',
            url: "/po/all"
        }).then(function successCallback(response) {
                $scope.orders = response.data; 
            }, function errorCallback(response) {
                alert("Unable to retreive orders!");
        });
    }();

    // Create an empty purchase purchase order line object.
    // Used if no other purchase order line is avalible
    $scope.blankPurchaseOrderLine = {
        id: "",
        product:{
            id: "",
            name: "",
            supplierPrice: "",
            retailerPrice: "",
            productCategory: {
                id: "",
                name: ""
            }
        },
        quantity: "",
        cost: ""
    };

    $scope.getPurchaseOrderLine = function(oid, otime, ocost){
        $scope.selectedOrder = {
            id: oid,
            time: otime,
            cost: ocost
        }
        $http({
            method: 'GET',
            url: "/pol/poid/" + oid
        }).then(function successCallback(response) {
                $scope.purchaseOrderLine = response.data; 
            }, function errorCallback(response) {
                alert("Unable to retreive purchase order line!");
        });
    }
    
}]);