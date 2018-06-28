$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/apium/poc/Feature/MyApplicationFeature.feature");
formatter.feature({
  "line": 1,
  "name": "Smoke Selendroid Test",
  "description": "",
  "id": "smoke-selendroid-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8127408913,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Register a new Selendroid User",
  "description": "",
  "id": "smoke-selendroid-test;register-a-new-selendroid-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User opens Selendroid application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User clicks on Create New User icon",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Unser provides valid details and click on submit button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User details should be populated correctly on verify screen",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on Confirm button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "homepage should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "NewTest.user_opens_Selendroid_application()"
});
formatter.result({
  "duration": 1305699148,
  "error_message": "java.lang.NullPointerException: Please provide a valid record in the data file!!!\r\n\tat com.apium.poc.StepDefinition.NewTest.user_opens_Selendroid_application(NewTest.java:58)\r\n\tat ✽.Given User opens Selendroid application(src/test/java/com/apium/poc/Feature/MyApplicationFeature.feature:4)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "NewTest.user_clicks_on_Create_New_User_icon()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NewTest.unser_provides_valid_details_and_click_on_submit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NewTest.user_details_should_be_populated_correctly_on_verify_screen()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NewTest.user_clicks_on_Confirm_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NewTest.homepage_should_be_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1752728535,
  "status": "passed"
});
});