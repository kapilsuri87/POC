$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/apium/poc/Feature/MyApplicationFeature.feature");
formatter.feature({
  "line": 2,
  "name": "Smoke Selendroid Test",
  "description": "",
  "id": "smoke-selendroid-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Functional"
    }
  ]
});
formatter.before({
  "duration": 8475539465,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Register a new Selendroid User",
  "description": "",
  "id": "smoke-selendroid-test;register-a-new-selendroid-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User opens Selendroid application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User clicks on Create New User icon",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Unser provides valid details and click on submit button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User details should be populated correctly on verify screen",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks on Confirm button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "homepage should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "SelendroidTest.user_opens_Selendroid_application()"
});
formatter.result({
  "duration": 675478845,
  "status": "passed"
});
formatter.match({
  "location": "SelendroidTest.user_clicks_on_Create_New_User_icon()"
});
formatter.result({
  "duration": 1540997223,
  "status": "passed"
});
formatter.match({
  "location": "SelendroidTest.unser_provides_valid_details_and_click_on_submit_button()"
});
formatter.result({
  "duration": 42547338831,
  "status": "passed"
});
formatter.match({
  "location": "SelendroidTest.user_details_should_be_populated_correctly_on_verify_screen()"
});
formatter.result({
  "duration": 1644915151,
  "status": "passed"
});
formatter.match({
  "location": "SelendroidTest.user_clicks_on_Confirm_button()"
});
formatter.result({
  "duration": 605179270,
  "status": "passed"
});
formatter.match({
  "location": "SelendroidTest.homepage_should_be_displayed()"
});
formatter.result({
  "duration": 979549968,
  "status": "passed"
});
formatter.after({
  "duration": 1931589531,
  "status": "passed"
});
formatter.before({
  "duration": 7398511705,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Validate Toast message",
  "description": "",
  "id": "smoke-selendroid-test;validate-toast-message",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@Prod"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "User opens Selendroid application",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "User clicks on Display a Toast button",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "Toast message should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "SelendroidTest.user_opens_Selendroid_application()"
});
formatter.result({
  "duration": 134648568,
  "status": "passed"
});
formatter.match({
  "location": "SelendroidTest.user_clicks_on_Display_a_Toast_button()"
});
formatter.result({
  "duration": 3359222272,
  "status": "passed"
});
formatter.match({
  "location": "SelendroidTest.toast_message_should_be_displayed()"
});
formatter.result({
  "duration": 6303554201,
  "status": "passed"
});
formatter.after({
  "duration": 1760933688,
  "status": "passed"
});
formatter.before({
  "duration": 7098790452,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Handle Popup message",
  "description": "",
  "id": "smoke-selendroid-test;handle-popup-message",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "User opens Selendroid application",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "User clicks on Display Popup button",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "Popup should be displayed and user able to dismiss it",
  "keyword": "Then "
});
formatter.match({
  "location": "SelendroidTest.user_opens_Selendroid_application()"
});
formatter.result({
  "duration": 159007498,
  "status": "passed"
});
formatter.match({
  "location": "SelendroidTest.user_clicks_on_Display_Popup_button()"
});
formatter.result({
  "duration": 3508674766,
  "status": "passed"
});
formatter.match({
  "location": "SelendroidTest.popup_should_be_displayed_and_user_able_to_dismiss_it()"
});
formatter.result({
  "duration": 46393594,
  "status": "passed"
});
formatter.after({
  "duration": 2285955617,
  "status": "passed"
});
});