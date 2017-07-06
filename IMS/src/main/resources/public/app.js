var imsApp = angular.module('imsApp', ['ui.router', 'chart.js']);

imsApp.config(function($stateProvider, $urlRouterProvider, $locationProvider){

    $urlRouterProvider.otherwise('/home');

    $stateProvider

        .state('home', {
            url: '/home',
            templateUrl: 'home.html',
            controller: 'HomeCtrl'
        })

        .state('suppliers', {
            url: '/suppliers',
            templateUrl: 'suppliers.html',
            controller: 'SupplierViewCtrl'
        })

        .state('retailers', {
            url: '/retailers',
            templateUrl: 'retailers.html',
            controller: 'RetailerViewCtrl'
        })

        .state('products', {
            url: '/products',
            templateUrl: 'products.html',
            controller: 'ProductViewCtrl'
        })

        .state('orders', {
            url: '/purchaseOrders',
            templateUrl: 'orders.html',
            controller: 'OrderViewCtrl'
        })

        .state('sales', {
            url: '/sales',
            templateUrl: 'retailerSales.html',
            controller: 'SaleViewCtrl'
        })

        .state('purchaseOrder', {
            url: '/purchaseOrder',
            templateUrl: 'purchaseOrder.html',
            controller: 'PurchaseOrderCtrl'
        })

        .state('retailerReport', {
            url: '/retailerReport',
            templateUrl: 'retailerReport.html',
            controller: 'ReportCtrl' 
        })
        $locationProvider.html5Mode(true);
})
