$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/feature/TestCase.feature");
formatter.feature({
  "line": 2,
  "name": "DemoWebShop Web site",
  "description": "",
  "id": "demowebshop-web-site",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@DemoWebShop"
    }
  ]
});
formatter.scenario({
  "line": 180,
  "name": "",
  "description": "",
  "id": "demowebshop-web-site;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 179,
      "name": "@TC20_Remove"
    }
  ]
});
formatter.step({
  "line": 181,
  "name": "launch the chrome9 browser",
  "keyword": "Given "
});
formatter.step({
  "line": 182,
  "name": "open the app page9",
  "keyword": "When "
});
formatter.step({
  "line": 183,
  "name": "user9 login in to the home page",
  "keyword": "Then "
});
formatter.step({
  "line": 184,
  "name": "user9 remove item from the cart",
  "keyword": "Then "
});
formatter.step({
  "line": 185,
  "name": "user9 closes the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Demo_Remove_Definition.launch_The_Chrome9_Browser()"
});
formatter.result({
  "duration": 12929339100,
  "status": "passed"
});
formatter.match({
  "location": "Demo_Remove_Definition.open_The_App_Page9()"
});
formatter.result({
  "duration": 4182403200,
  "status": "passed"
});
formatter.match({
  "location": "Demo_Remove_Definition.user9_Login_In_To_The_Home_Page()"
});
formatter.result({
  "duration": 15036552200,
  "status": "passed"
});
formatter.match({
  "location": "Demo_Remove_Definition.user9_Remove_Item_From_The_Cart()"
});
formatter.result({
  "duration": 3783908400,
  "status": "passed"
});
formatter.match({
  "location": "Demo_Remove_Definition.user9_Closes_The_Browser()"
});
formatter.result({
  "duration": 164037000,
  "status": "passed"
});
});