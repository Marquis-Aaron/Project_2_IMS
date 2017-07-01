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
        });

        $locationProvider.html5Mode(true);
})
