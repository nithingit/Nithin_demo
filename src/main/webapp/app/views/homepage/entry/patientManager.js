patientApp.factory('patientManager', ['$http', '$q',
function($http, $q) {

	var patientManager = {

		_pool : {},

		persistRecord : function(record) {
			var scope = this;

			var deferred = $q.defer();

			var results = [];

			$http.post("patientService/persistObject/",record).success(function(resultsArray, status, headers, config) {

				deferred.resolve(results);
			}).error(function(data, status, headers, config) {
				console.log(false);
			});

			return deferred.promise;
		},
		retrieveRecords : function() {
			var scope = this;

			var deferred = $q.defer();

			var results = [];

			$http.post("patientService/findAllObjects",{}).success(function(resultsArray, status, headers, config) {

				deferred.resolve(resultsArray);
			}).error(function(data, status, headers, config) {
				console.log(false);
			});

			return deferred.promise;
		},

		
	};

	return patientManager;
}]); 