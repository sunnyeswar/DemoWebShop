$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/feature/TestCase.feature");
formatter.feature({
  "line": 2,
  "name": "DemoWebShop Website",
  "description": "",
  "id": "demowebshop-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@DemoWebShop"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "",
  "description": "Register in the DemoWebShop",
  "id": "demowebshop-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@TC01_Demo"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "the user launch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the user open the DemoWebShop Register page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the user register by filling all the neccessary details",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "click on the register button user nagivate to the next page",
  "keyword": "Then "
});
formatter.match({
  "location": "Demo_Register.the_user_launch_the_chrome_application()"
});
formatter.result({
  "duration": 6785235225,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "Demo_Register.the_user_register_by_filling_all_the_neccessary_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Demo_Register.click_on_the_register_button_user_nagivate_to_the_next_page()"
});
formatter.result({
  "status": "skipped"
});
});