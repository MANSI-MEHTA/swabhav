
angular.module("spa_app", ["ngRoute"])
    .config(function ($routeProvider) {
        $routeProvider
            .when("/", {
                templateUrl: "partial_view/home.html",
                controller: "homeController"
            })
            .when("/carrier", {
                templateUrl: "partial_view/carrier.html",
                controller: "carrierController"
            })
            .when("/contact", {
                templateUrl: "partial_view/contact.html",
                controller: "contactController"
            })
            .when("/about", {
                templateUrl: "partial_view/about.html",
                controller: "aboutController"
            })
    }).controller('homeController', function ($scope) {
        $scope.home = {
            message: "Displaying Home content"
        }
       
    }).controller('carrierController', function ($scope) {
        $scope.carrier = {
            message: "Displaying carrier content"
        }
      
    }).controller('contactController', function ($scope) {
        $scope.contact = {
            message: "Displaying contact content"
        }
      
    }).controller('aboutController', function ($scope) {
        $scope.about = {
            message: "Displaying about content"
        }
        
    })

