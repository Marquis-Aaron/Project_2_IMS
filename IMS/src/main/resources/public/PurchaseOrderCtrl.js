imsApp.controller("PurchaseOrderCtrl", ['$scope', '$http',
function($scope, $http){

    // Used to auto generate all retailers, suppliers, products, and categories
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

    $http({
        method: 'GET',
        url: "/product/all"
    }).then(function successCallback(response) {
            $scope.products = response.data; 
        }, function errorCallback(response) {
            alert("Unable to retreive products!");
    });

    $http({
        method: 'GET',
        url: "/Category/all"
    }).then(function successCallback(response) {
            $scope.categories = response.data; 
        }, function errorCallback(response) {
            alert("Unable to retreive categories!");
    });

    // Sets up blank objects
    $scope.newItem = {
        category: "",
        product: "",
        qty: 0,
        selected: true
    }
    $scope.order = {
        retailer: "",
        supplier: "",
        cost: 0.00
    }
    $scope.newProducts = [{item: angular.copy($scope.newItem)}];
    
    $scope.selectCateogry = 'All';
    // Filters product list on category change.
    $scope.changeCateogry = function(i){
        console.log($scope.newProducts[i]);
        if ($scope.newProducts[i].category.name){
            $scope.selectCateogry = $scope.newProducts[i].category.name;
        }
    }

    $scope.productFilter = function(pro){
        return $scope.selectCateogry == "All" || 
        pro.productCategory.category.name == $scope.selectCateogry;
    }

    // //Adds products to the purchase order line as well as adds cost of products to order total.
    // $scope.addProduct = function(i){
    //     $scope.newProducts[i].item.selected = false;
    //     $scope.order.cost += $scope.newProducts[i].product.supplierPrice * $scope.newProducts[i].qty;
    //     $scope.newProducts[i + 1] = {item: angular.copy($scope.newItem)}
    // }
    //
    // $scope.submitOrder = function(){
    //     $http.post('/submit/po', {"po":$scope.order,"pols":$scope.newProducts})
    //         .then(function (response) {
    //                 console.log("Success");
    //             },
    //             function (response) {
    //                 console.log("Error");
    //             });
    //
    //     console.log($scope.order);
    //     console.log($scope.newProducts);
    // }
}]);