var imsApp = angular.module('imsApp', ['ui.router']);

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
        });

        $locationProvider.html5Mode(true);
})
