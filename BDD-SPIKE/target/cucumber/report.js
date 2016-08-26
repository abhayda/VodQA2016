$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("NewClientWorkflow.feature");
formatter.feature({
  "id": "",
  "tags": [
    {
      "name": "@signup",
      "line": 1
    },
    {
      "name": "@taggedagain",
      "line": 1
    }
  ],
  "description": "As a user\nI want to be able to add new clients in the system\nSo that i can add accounting data for that client",
  "name": "",
  "keyword": "Feature",
  "line": 2
});
formatter.background({
  "description": "",
  "name": "",
  "keyword": "Background",
  "line": 7,
  "type": "background"
});
formatter.step({
  "name": "the user is on landing page",
  "keyword": "Given ",
  "line": 8
});
formatter.step({
  "name": "she chooses to sign up",
  "keyword": "When ",
  "line": 9
});
formatter.match({
  "location": "ClientSteps.setup()"
});
formatter.result({
  "duration": 6722247000,
  "status": "passed"
});
formatter.match({
  "location": "ClientSteps.she_chooses_to_sign_up()"
});
formatter.result({
  "duration": 578422000,
  "status": "passed"
});
formatter.scenario({
  "id": ";sign-up-a-new-user-with-datatable-example",
  "tags": [
    {
      "name": "@TableDriven",
      "line": 37
    }
  ],
  "description": "",
  "name": "Sign-up a new user with datatable example",
  "keyword": "Scenario",
  "line": 38,
  "type": "scenario"
});
formatter.step({
  "name": "she provides the her details as follows:",
  "keyword": "And ",
  "line": 39,
  "rows": [
    {
      "cells": [
        "firstName",
        "lastName",
        "email",
        "password"
      ],
      "line": 40
    },
    {
      "cells": [
        "Sukesh",
        "Kumar",
        "sukesh.km@aq.com",
        "password"
      ],
      "line": 41
    }
  ]
});
formatter.step({
  "name": "she signs-up",
  "keyword": "And ",
  "line": 42
});
formatter.step({
  "name": "she should be logged in to the application",
  "keyword": "Then ",
  "line": 43
});
formatter.match({
  "location": "ClientSteps.she_provides_the_her_details_as_follows(UserDetails\u003e)"
});
formatter.result({
  "duration": 317583000,
  "status": "passed"
});
formatter.match({
  "location": "ClientSteps.she_signs_up()"
});
formatter.result({
  "duration": 5891888000,
  "status": "passed"
});
formatter.match({
  "location": "ClientSteps.she_should_be_logged_in_to_the_application()"
});
formatter.result({
  "duration": 27248000,
  "status": "passed"
});
});