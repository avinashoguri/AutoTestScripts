$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/FC_Test.feature");
formatter.feature({
  "line": 1,
  "name": "Log-in functions",
  "description": "",
  "id": "log-in-functions",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Login with in-valid credentials",
  "description": "",
  "id": "log-in-functions;login-with-in-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on Firecompass login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "enter invalid username and password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "enter login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "application should display error promt",
  "keyword": "And "
});
formatter.match({
  "location": "FC_Test_StepDeffination.user_is_on_firecompass_login_page()"
});
formatter.result({
  "duration": 17276733400,
  "status": "passed"
});
formatter.match({
  "location": "FC_Test_StepDeffination.enter_invalid_username_and_password()"
});
formatter.result({
  "duration": 5254447900,
  "status": "passed"
});
formatter.match({
  "location": "FC_Test_StepDeffination.enter_login_button()"
});
formatter.result({
  "duration": 81148900,
  "status": "passed"
});
formatter.match({
  "location": "FC_Test_StepDeffination.application_should_display_error_promt()"
});
formatter.result({
  "duration": 10040781700,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Login with correct username and in-correct password",
  "description": "",
  "id": "log-in-functions;login-with-correct-username-and-in-correct-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "User is on Firecompass login page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "enter valid username and invalid password",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "enter login button",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "application should display error promt",
  "keyword": "And "
});
formatter.match({
  "location": "FC_Test_StepDeffination.user_is_on_firecompass_login_page()"
});
formatter.result({
  "duration": 12264358800,
  "status": "passed"
});
formatter.match({
  "location": "FC_Test_StepDeffination.enter_valid_username_and_invalid_password()"
});
formatter.result({
  "duration": 5251247800,
  "status": "passed"
});
formatter.match({
  "location": "FC_Test_StepDeffination.enter_login_button()"
});
formatter.result({
  "duration": 121612300,
  "status": "passed"
});
formatter.match({
  "location": "FC_Test_StepDeffination.application_should_display_error_promt()"
});
formatter.result({
  "duration": 20087838400,
  "status": "passed"
});
});