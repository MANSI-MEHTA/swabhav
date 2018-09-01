angular.module('student_app', ["ngRoute"])
    .config(function ($routeProvider) {
        $routeProvider
            .when("/", {
                templateUrl: "displayStudent.html",
                controller: "homeController"
            })
            .when("/add", {
                templateUrl: "addStudent.html",
                controller: "addStudentController"
            })
            .when("/edit/:param1", {
                templateUrl: "addStudent.html",
                controller: "editStudentController"
            })
            .when("/delete/:param2", {
                templateUrl: "displayStudent.html",
                controller: "deleteStudentController"
            })
            .when("/login", {
                templateUrl: "login.html",
                controller: "loginController"
            })
            .when("/logout", {
                templateUrl: "displayStudent.html",
                controller: "logoutController"
            })
    }).factory('studentservice', function ($q) {
        var _students = [{
            rollno: 101,
            fname: "varshil",
            lname: "mehta",
            cgpi: 8.0,
            gender: "male"
        }, {
            rollno: 102,
            fname: "manoj",
            lname: "m",
            cgpi: 8.5,
            gender: "male"

        },
        {
            rollno: 103,
            fname: "shubham",
            lname: "vora",
            cgpi: 8.6,
            gender: "male"

        },
        {
            rollno: 104,
            fname: "manan",
            lname: "shah",
            cgpi: 10,
            gender: "male"

        }
        ]
        const object = {};
        object.getStudent = (() => {
            return $q((resolve, reject) => {
                if (_students.length !== 0) {
                    resolve(_students)
                }
                else {
                    reject("student list is empty")
                }
            })

        })
        object.getStudentById = ((id) => {
            return $q((resolve) => {
                _students.map((x) => {
                    if (x.rollno == id) {
                        resolve(x)
                    }
                })


            })

        })
        object.addStudent = (student => {
            return $q(resolve => {
                _students.push(student)
                resolve("student Details added");
            })
        })
        object.deleteStudentbyId = (id => {
            var oldstudentlist = _students;
            _students = [];
            return $q(resolve => {
                oldstudentlist.map((x) => {
                    if (x.rollno != id) {
                        _students.push(x);

                    }
                })
                resolve("student deleted successfully")
            })

        })
        return object;
    }).factory('userservice', function ($q, $log) {
        var _currentUser = {}
        const _users = [{
            username: "varshil",
            password: "varsh"
        },
        {
            username: "manoj",
            password: "manojST"
        },
        {
            username: "shubham",
            password: "shubh"
        }]
        const object = {}
        object.getUsers = (() => {
            return $q((resolve, reject) => {
                if (_users.length != 0) {
                    resolve(_users)
                }
                else {
                    reject("NO users are registered")
                }
            })
        })
        object.getUserById = (user => {
            return $q((resolve, reject) => {
                _users.map((x) => {
                    if (x.username == user.username && x.password == user.password) {
                        // _currentUser = user;
                        localStorage.setItem("usernameInlocalstorage", user.username)
                        resolve(true);
                    }
                })
                reject(false);
            })
        })
        object.getCurrentUser = (() => {
            return $q(resolve => {
                _currentUser = localStorage.getItem("usernameInlocalstorage")
                console.log(_currentUser)
                resolve(_currentUser)
            })
        })
        object.setCurrentUser = (() => {
            return $q(resolve => {
                //  _currentUser={}
                localStorage.setItem("usernameInlocalstorage", null)
                resolve();
            })
        })

        return object;

    }).factory('statechangeservice', function ($q) {

        var state;
        const object = {}
        object.getstate = (() => {
            return $q(resolve => {
                var statefromlocalstorage = localStorage.getItem("stateFromLocalStorage")
                if (statefromlocalstorage == "true") {
                    state = true;
                }
                else {
                    state = false
                }
                resolve(state);
            })
        })
        object.changestate = (() => {
            return $q(resolve => {

                state = (!state);
                localStorage.setItem("stateFromLocalStorage", true)
                resolve("state has changed")
            })
        })
        object.setstate = (() => {
            return $q(resolve => {
                localStorage.setItem("stateFromLocalStorage", false)
                resolve();
            })
        })

        return object
    })
    .controller('homeController', function ($scope, studentservice, statechangeservice, $log, $rootScope, userservice) {
        $scope.students = [];
        $rootScope.currentUser = {}
        $rootScope.authenticated = {};
        $scope.arrayOfStudent = []
        $scope.searchResult = []

        userservice.getCurrentUser().then(response => {
            $rootScope.currentUser = response;
            $log.log($rootScope.currentUser)
        }).catch(error => {
            $log.log("current user not found")
        })

        statechangeservice.getstate().then((response) => {
            $log.log("getting state" + response)
            $rootScope.authenticated = response
            $log.log($rootScope.authenticated)

        })

        studentservice.getStudent().then(response => {
            response.map((x) => {
                $scope.arrayOfStudent.push(x);
            })


        }).catch(error => {
            $log.log("current user not found")
        })


        studentservice.getStudent().then(response => {
            response.map((x) => {
                $scope.students.push(x);
            })
        }).catch(error => $log.log(error));
        $scope.filterNames = () => {
            $scope.searchResult = []
            var copyofsearchname = new RegExp($scope.searchname, 'g');
            if ($scope.searchname != '') {
                $scope.searchResult = [];
                $scope.arrayOfStudent.map((x) => {
                    var temp = x.fname;
                    var splitedstring = temp.match(copyofsearchname);
                    if (splitedstring != null) {
                        $scope.searchResult.push(temp);
                    }
                })
            }

        }

    }).controller('addStudentController', function ($scope, studentservice, $log) {
        $scope.add = true
        $scope.update = false
        $scope.student = {};
        $scope.submitButton = (() => {
            studentservice.addStudent($scope.student).then(message => {
                window.location.href = "#/"
                $log.log(message)
            }).catch((error) => $log.log(error));
        })
    }).controller('editStudentController', function ($scope, studentservice, $routeParams, $log) {

        $scope.add = false
        $scope.update = true


        $scope.param = $routeParams.param1;
        $log.log($scope.param)
        $scope.student = {};
        studentservice.getStudentById($scope.param).then(response => {
            $log.log(response);
            $scope.student = response

        })
        $scope.submitButton = (() => {
            window.location.href = "#/"
        })


    })
    .controller('deleteStudentController', function ($scope, studentservice, $routeParams, $log) {
        $scope.param = $routeParams.param2;
        $log.log($scope.param)
        if (confirm("are sure you want to delete record")) {
            studentservice.deleteStudentbyId($scope.param).then(response => {
                $log.log(response)
                window.location.href = "#/"
            }).catch(error => {
                $log.log(error)
            })
        }

    })
    .controller('loginController', function ($log, userservice, statechangeservice, $scope) {
        $scope.user = {}
        $scope.authenticateUser = function () {
            userservice.getUserById($scope.user).then(response => {
                $log.log("check found in database :" + response)
                $log.log("calling state change service and changing state")
                return statechangeservice.changestate()


            }).then((response) => {
                $log.log(response)
            }).finally(() => {
                window.location.href = "#/"
            }).catch((error) => {
                $log.log(error)
            })

        }
    })
    .controller('logoutController', function ($log, statechangeservice, userservice, $scope) {

        statechangeservice.setstate().then(() => {
            $log.log("state is set to null")


        })
            .finally(() => {
                window.location.href = "#/"
            })
        userservice.setCurrentUser().then(() => {
            $log.log("current user is set to null")
        })

    })
