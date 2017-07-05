imsApp.controller("ReportCtrl", ['$scope', '$http',
function($scope, $http){

    
    
    
    
    // month = (month < 10) ? "0" + month : month ;
    // // Gets all retailer sales for report data
    // $http({
    //     method: 'POST',
    //     url: "/rs/salesByMonth",
    //     data: {
    //         "start" : new Date(year, month,1,0,0,0,0),
    //         "end" : new Date(year, month,daysInMonth(year, month),23,59,59,59)
    //     }
    // }).then(function successCallback(response) {
    //         $scope.prevMonth = response.data; 
    //     }, function errorCallback(response) {
    //         alert("Unable to retreive sales!");
    // });

    // $http({
    //     method: 'POST',
    //     url: "/rs/salesByMonth",
    //     data: {
    //         "start" : new Date(year-1, month,1,0,0,0,0),
    //         "end" : new Date(year-1, month,daysInMonth(year-1, month),23,59,59,59)
    //     }
    // }).then(function successCallback(response) {
    //         $scope.prevYear = response.data; 
    //     }, function errorCallback(response) {
    //         alert("Unable to retreive sales!");
    // });

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
                if (!$scope.salesArray[$scope.sales[i].retailer.id]){
                    $scope.salesArray[$scope.sales[i].retailer.id] = $scope.sales[i].cost;
                }
                else {
                    $scope.salesArray[$scope.sales[i].retailer.id] += $scope.sales[i].cost;
                }
                
            }
            }, function errorCallback(response) {
                alert("Unable to retreive sales!");
        });

        
    }();
    $scope.criteria = ["All Time Sales"];
    console.log("SalesArray");
    console.log($scope.salesArray);
}]);