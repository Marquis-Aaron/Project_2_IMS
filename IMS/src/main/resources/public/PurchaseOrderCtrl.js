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
        quantity: 0,
        cost: 0,
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
    // Removes a purchase order line for the newProducts array
    $scope.removePOL = function(i){
        $scope.order.cost -= $scope.newProducts[i].product.supplierPrice * $scope.newProducts[i].quantity
        $scope.newProducts.splice(i, 1);
    }
   

    //Adds products to the purchase order line as well as adds cost of products to order total.
    $scope.addProduct = function(i){
        $scope.newProducts[i].item.selected = false;
        $scope.newProducts[i].cost = $scope.newProducts[i].quantity * $scope.newProducts[i].product.supplierPrice;
        $scope.order.cost += $scope.newProducts[i].product.supplierPrice * $scope.newProducts[i].quantity;
        $scope.newProducts[i + 1] = {item: angular.copy($scope.newItem)}
    }
    $scope.sizeLessThanOne = function(){
        if ($scope.newProducts.length <= 1){
            return true;
        }
        else{
            return false;
        }
    }
    $scope.submitOrder = function(){
        $scope.newProducts.splice($scope.newProducts.length - 1, 1);
        $http.post('/submit/po', {"po":$scope.order,"pols":$scope.newProducts})
            .then(function (response) {
                    console.log("Success");
                    $scope.newProducts.splice(0, $scope.newProducts.length);
                    $scope.newProducts = [{item: angular.copy($scope.newItem)}];
                    $scope.order = { retailer: "", supplier: "", cost: 0.00 }
                },
                function (response) {
                    console.log("Error");
                });
    
        console.log($scope.order);
        console.log($scope.newProducts);
    }
}]);