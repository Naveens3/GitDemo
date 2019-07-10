Feature: Demo

@Functional
Scenario: Regression testing scenario
Given This test case must be executed in regression phase

@SmokeTesting
Scenario: Smoke Testing Scenario
Given This test case must be executed in smoke testing phase

@SmokeTesting @Regression
Scenario: Common Scenario
Given This test case is executed in both regression and smoke testing

