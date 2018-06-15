$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("loginFeature.feature");
formatter.feature({
  "line": 1,
  "name": "annotation",
  "description": "",
  "id": "annotation",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "",
  "description": "",
  "id": "annotation;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I enters username \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I enters password \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "click for login",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "should get result for \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "annotation;;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 14,
      "id": "annotation;;;1"
    },
    {
      "cells": [
        "9968285308",
        "pankaj"
      ],
      "line": 15,
      "id": "annotation;;;2"
    },
    {
      "cells": [
        "testuser_1",
        "Test@153"
      ],
      "line": 16,
      "id": "annotation;;;3"
    },
    {
      "cells": [
        "testuser_2",
        "Test@153"
      ],
      "line": 17,
      "id": "annotation;;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "comments": [
    {
      "line": 2,
      "value": "#This is how background can be used to eliminate duplicate steps"
    }
  ],
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User navigates to Facebook",
  "keyword": "Given "
});
formatter.match({
  "location": "annotation.user_navigates_to_Facebook()"
});
formatter.result({
  "duration": 6152889543,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "",
  "description": "",
  "id": "annotation;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I enters username \"9968285308\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I enters password \"pankaj\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "click for login",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "should get result for \"9968285308\" and \"pankaj\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "9968285308",
      "offset": 19
    }
  ],
  "location": "annotation.i_enter_username_as(String)"
});
formatter.result({
  "duration": 2602137196,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pankaj",
      "offset": 19
    }
  ],
  "location": "annotation.i_enter_password_as(String)"
});
formatter.result({
  "duration": 75906294,
  "status": "passed"
});
formatter.match({
  "location": "annotation.click_for_login()"
});
formatter.result({
  "duration": 7033969182,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "9968285308",
      "offset": 23
    },
    {
      "val": "pankaj",
      "offset": 40
    }
  ],
  "location": "annotation.should_get_result_for_and(String,String)"
});
formatter.result({
  "duration": 1479760533,
  "status": "passed"
});
formatter.background({
  "comments": [
    {
      "line": 2,
      "value": "#This is how background can be used to eliminate duplicate steps"
    }
  ],
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User navigates to Facebook",
  "keyword": "Given "
});
formatter.match({
  "location": "annotation.user_navigates_to_Facebook()"
});
formatter.result({
  "duration": 6596913705,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "",
  "description": "",
  "id": "annotation;;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I enters username \"testuser_1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I enters password \"Test@153\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "click for login",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "should get result for \"testuser_1\" and \"Test@153\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "testuser_1",
      "offset": 19
    }
  ],
  "location": "annotation.i_enter_username_as(String)"
});
formatter.result({
  "duration": 121802995,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test@153",
      "offset": 19
    }
  ],
  "location": "annotation.i_enter_password_as(String)"
});
formatter.result({
  "duration": 94519147,
  "status": "passed"
});
formatter.match({
  "location": "annotation.click_for_login()"
});
formatter.result({
  "duration": 1406419798,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testuser_1",
      "offset": 23
    },
    {
      "val": "Test@153",
      "offset": 40
    }
  ],
  "location": "annotation.should_get_result_for_and(String,String)"
});
formatter.result({
  "duration": 1322091038,
  "status": "passed"
});
formatter.background({
  "comments": [
    {
      "line": 2,
      "value": "#This is how background can be used to eliminate duplicate steps"
    }
  ],
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User navigates to Facebook",
  "keyword": "Given "
});
formatter.match({
  "location": "annotation.user_navigates_to_Facebook()"
});
formatter.result({
  "duration": 4211010311,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "",
  "description": "",
  "id": "annotation;;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I enters username \"testuser_2\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I enters password \"Test@153\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "click for login",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "should get result for \"testuser_2\" and \"Test@153\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "testuser_2",
      "offset": 19
    }
  ],
  "location": "annotation.i_enter_username_as(String)"
});
formatter.result({
  "duration": 2508443176,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test@153",
      "offset": 19
    }
  ],
  "location": "annotation.i_enter_password_as(String)"
});
formatter.result({
  "duration": 101941636,
  "status": "passed"
});
formatter.match({
  "location": "annotation.click_for_login()"
});
formatter.result({
  "duration": 973495094,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testuser_2",
      "offset": 23
    },
    {
      "val": "Test@153",
      "offset": 40
    }
  ],
  "location": "annotation.should_get_result_for_and(String,String)"
});
formatter.result({
  "duration": 1286580835,
  "status": "passed"
});
});