imsApp.controller("OrderViewCtrl", ['$scope', '$http',
function($scope, $http){

    $http({
        method: 'GET',
        url: "/po/all"
    }).then(function successCallback(response) {
            $scope.orders = response.data; 
        }, function errorCallback(response) {
            alert("Unable to retreive orders!");
    });

    $http({
        method: 'GET',
        url: "/retailer/all"
    }).then(function successCallback(response) {
            $scope.retailers = response.data; 
        }, function errorCallback(response) {
            alert("Unable to retreive retailers!");
    });

    $http({
        method: 'GET',
        url: "/supplier/all"
    }).then(function successCallback(response) {
            $scope.suppliers = response.data; 
        }, function errorCallback(response) {
            alert("Unable to retreive suppliers!");
    });

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
    
    $scope.selectRetailer = 'All';
    $scope.selectSupplier = 'All';

     $scope.retailerFilter = function(ret){
        if($scope.selectRetailer == null){
            $scope.selectRetailer = "All";
        }
        return $scope.selectRetailer == "All" || 
        ret.retailer.name == $scope.selectRetailer.name;
    }
    $scope.supplierFilter = function(sup){
        if($scope.selectSupplier == null){
            $scope.selectSupplier = "All";
        }
        return $scope.selectSupplier == "All" || 
        sup.supplier.name == $scope.selectSupplier.name;
    }
}]);