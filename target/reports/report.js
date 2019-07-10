$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Training_c2a.04.30/ManojCucumber/Demo/src/resource/java/tags.feature");
formatter.feature({
  "line": 1,
  "name": "Demo",
  "description": "",
  "id": "demo",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Regression testing scenario",
  "description": "",
  "id": "demo;regression-testing-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Functional"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "This test case must be executed in regression phase",
  "keyword": "Given "
});
formatter.match({
  "location": "TagStepDefination.regression_Phase()"
});
formatter.result({
  "duration": 150909800,
  "status": "passed"
});
});