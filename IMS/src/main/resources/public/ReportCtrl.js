imsApp.controller("ReportCtrl", ['$scope', '$http',
function($scope, $http){

    //Gets all retailer sales and retailers for report data
    
    // Defaultly shows previous months total sales.
    // Sets up date variables
    var curDate = new Date();
    var month = curDate.getMonth()+1;
    var year = curDate.getFullYear();

    var daysInMonth = function(month, year) {
        return new Date(year, month, 0).getDate();
    }
    $scope.retailArray = [];
    $scope.salesArray = [];
    $scope.productSales = [];
    $scope.productNames = [];
    $scope.categorySales = [];
    $scope.categoryNames = [];

    $scope.generateSales = function(){
        $http({
        method: 'GET',
        url: "/retailer/all"
    }).then(function successCallback(response) {
            $scope.retailers = response.data;
            for(var i = 0; i < $scope.retailers.length; i++){
                $scope.retailArray[$scope.retailers[i].id] = $scope.retailers[i].name;
            }
            }, function errorCallback(response) {
                alert("Unable to retreive retailers!");
        });
        
        $http({
        method: 'GET',
        url: "/rs/all"
        }).then(function successCallback(response) {
            $scope.sales = response.data;
            for(var i = 0; i < $scope.sales.length; i++){
                // Adds values to the sales Array
                if (!$scope.salesArray[$scope.sales[i].retailer.id]){
                    $scope.salesArray[$scope.sales[i].retailer.id] = $scope.sales[i].cost;
                }
                else {
                    $scope.salesArray[$scope.sales[i].retailer.id] += $scope.sales[i].cost;
                }
                // Adds values to product Array
                if (!$scope.productSales[$scope.sales[i].product.id]){
                    $scope.productNames[$scope.sales[i].product.id] = $scope.sales[i].product.name;
                    $scope.productSales[$scope.sales[i].product.id] = $scope.sales[i].quantity * $scope.sales[i].product.retailerPrice;
                }
                else {
                    $scope.productSales[$scope.sales[i].product.id] += $scope.sales[i].quantity * $scope.sales[i].product.retailerPrice;
                }
                // Adds values to category Array s.product.productCategory.category.name
                if (!$scope.categorySales[$scope.sales[i].product.productCategory.category.id]){
                    $scope.categoryNames[$scope.sales[i].product.productCategory.category.id] = $scope.sales[i].product.productCategory.category.name;
                    $scope.categorySales[$scope.sales[i].product.productCategory.category.id] = $scope.sales[i].quantity * $scope.sales[i].product.retailerPrice;
                }
                else {
                    $scope.categorySales[$scope.sales[i].product.productCategory.category.id] += $scope.sales[i].quantity * $scope.sales[i].product.retailerPrice;
                }
            }
            }, function errorCallback(response) {
                alert("Unable to retreive sales!");
        });

        
    }();
    $scope.criteria = ["All Time Sales"];

    $scope.salesChart = true;
    $scope.productChart = false;
    $scope.categoryChart = false;

    $scope.changeReport = function(type){
        $scope.salesChart = false;
        $scope.productChart = false;
        $scope.categoryChart = false;
        switch (type){
            case 'sale':
                $scope.salesChart = true;
                break;
            case 'product':
                $scope.productChart = true;
                break;
            case 'category':
                $scope.categoryChart = true;
                break;
        }
    }
}]);