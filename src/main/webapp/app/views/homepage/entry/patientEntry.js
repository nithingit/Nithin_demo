patientApp
		.controller(
				'patientEntryController',
				[
						'$scope',
						'$rootScope',
						'$http',
						'$window',
						'patientManager',
						function($scope, $rootScope, $http,
								$window,patientManager) {
							
							$scope.names=['Male','Female'];
						
							
							var today = new Date();
							var dd = today.getDate();
							var mm = today.getMonth()+1; //January is 0!

							var yyyy = today.getFullYear();
							if(dd<10){
							    dd='0'+dd
							} 
							if(mm<10){
							    mm='0'+mm
							} 
							var today = yyyy+'-'+mm+'-'+dd;
							document.getElementById("dob").setAttribute("max", today);
							
							$scope.dob=new Date();
							$scope.patient={
								id:0,
									fname:"",
									lname:"",
									age:'',
									dob:new Date(),
									overview:"",
									gender:"Male",
									phone:''
							};
							
							
							$scope.submitForm =function(){
								$scope.patient.dob=$scope.dob.getTime();
								$scope.patient.age=parseInt($scope.patient.age);
								////$scope.patient.phone=parseInt($scope.patient.phone);
								patientManager.persistRecord($scope.patient).then(function(data) {
									if(data != false){
										alert("Saved Patient Details");
									}else
										{
										
										}
									
								});
							}
							
						}]);