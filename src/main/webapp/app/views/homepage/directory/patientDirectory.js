patientApp.controller('patientsViewController', [ '$scope', '$rootScope', '$window', 'patientManager',
		function($scope, $rootScope, $window, patientManager) {

			$scope.viewPatients = function() {

				patientManager.retrieveRecords().then(function(data) {
					if (data != false) {
						$scope.patients = data;
					} else {

					}

				});
			}

			$scope.viewPatients();

		} ]);
