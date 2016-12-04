var patientApp = angular.module("patientApp", ["ui.router"]).config(function($stateProvider, $urlRouterProvider) {
	$stateProvider.state("patientEntry", {
		url : '/patientEntry',
		templateUrl : "app/views/homepage/entry/patientEntry.html",
		controller : "patientEntryController"
	}).state("patientsView", {
		url : '/patientsView',
		templateUrl : "app/views/homepage/directory/patientsView.html",
		controller : "patientsViewController"
	});
	$urlRouterProvider.otherwise('patientEntry');
});
