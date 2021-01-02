$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Scholastic/SecondWeekSprint.feature");
formatter.feature({
  "line": 2,
  "name": "Place an order by adding a new credit card",
  "description": "",
  "id": "place-an-order-by-adding-a-new-credit-card",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@scholastic"
    }
  ]
});
formatter.before({
  "duration": 12572687463,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "TC10 - Verify user can delete item on Cart page",
  "description": "",
  "id": "place-an-order-by-adding-a-new-credit-card;tc10---verify-user-can-delete-item-on-cart-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@TC10-start"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I click Sign In",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "type email address username \u0027mmjmmkju@gmail.com\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "type password \u0027poiu0987\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "click Sign in",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "click close the curtains",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Navigate to enter orders",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "click to Student Fryer Orders",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenarioOutline({
  "line": 13,
  "name": "enter name, item number and quantity",
  "description": "",
  "id": "place-an-order-by-adding-a-new-credit-card;enter-name,-item-number-and-quantity",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 12,
      "name": "@TC10"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "enter \u0027\u003cName\u003e\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "enter item number \u0027\u003cItemNumber\u003e\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "click Add",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "enter quantity \u0027\u003cQuantity\u003e\u0027",
  "keyword": "And "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "place-an-order-by-adding-a-new-credit-card;enter-name,-item-number-and-quantity;",
  "rows": [
    {
      "cells": [
        "Name",
        "ItemNumber",
        "Quantity"
      ],
      "line": 19,
      "id": "place-an-order-by-adding-a-new-credit-card;enter-name,-item-number-and-quantity;;1"
    },
    {
      "cells": [
        "Harry",
        "16B3",
        "5"
      ],
      "line": 20,
      "id": "place-an-order-by-adding-a-new-credit-card;enter-name,-item-number-and-quantity;;2"
    },
    {
      "cells": [
        "Harry",
        "42J4",
        "1"
      ],
      "line": 21,
      "id": "place-an-order-by-adding-a-new-credit-card;enter-name,-item-number-and-quantity;;3"
    },
    {
      "cells": [
        "John",
        "35J3",
        "2"
      ],
      "line": 22,
      "id": "place-an-order-by-adding-a-new-credit-card;enter-name,-item-number-and-quantity;;4"
    },
    {
      "cells": [
        "John",
        "16B3",
        "2"
      ],
      "line": 23,
      "id": "place-an-order-by-adding-a-new-credit-card;enter-name,-item-number-and-quantity;;5"
    },
    {
      "cells": [
        "Michael",
        "35N3",
        "4"
      ],
      "line": 24,
      "id": "place-an-order-by-adding-a-new-credit-card;enter-name,-item-number-and-quantity;;6"
    },
    {
      "cells": [
        "Michael",
        "34B4",
        "10"
      ],
      "line": 25,
      "id": "place-an-order-by-adding-a-new-credit-card;enter-name,-item-number-and-quantity;;7"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 7456887302,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "enter name, item number and quantity",
  "description": "",
  "id": "place-an-order-by-adding-a-new-credit-card;enter-name,-item-number-and-quantity;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@scholastic"
    },
    {
      "line": 12,
      "name": "@TC10"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "enter \u0027Harry\u0027",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "enter item number \u002716B3\u0027",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "click Add",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "enter quantity \u00275\u0027",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.before({
  "duration": 9221694598,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "enter name, item number and quantity",
  "description": "",
  "id": "place-an-order-by-adding-a-new-credit-card;enter-name,-item-number-and-quantity;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@scholastic"
    },
    {
      "line": 12,
      "name": "@TC10"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "enter \u0027Harry\u0027",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "enter item number \u002742J4\u0027",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "click Add",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "enter quantity \u00271\u0027",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.before({
  "duration": 9184691562,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "enter name, item number and quantity",
  "description": "",
  "id": "place-an-order-by-adding-a-new-credit-card;enter-name,-item-number-and-quantity;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@scholastic"
    },
    {
      "line": 12,
      "name": "@TC10"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "enter \u0027John\u0027",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "enter item number \u002735J3\u0027",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "click Add",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "enter quantity \u00272\u0027",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.before({
  "duration": 10228188825,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "enter name, item number and quantity",
  "description": "",
  "id": "place-an-order-by-adding-a-new-credit-card;enter-name,-item-number-and-quantity;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@scholastic"
    },
    {
      "line": 12,
      "name": "@TC10"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "enter \u0027John\u0027",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "enter item number \u002716B3\u0027",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "click Add",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "enter quantity \u00272\u0027",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.before({
  "duration": 11022115706,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "enter name, item number and quantity",
  "description": "",
  "id": "place-an-order-by-adding-a-new-credit-card;enter-name,-item-number-and-quantity;;6",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@scholastic"
    },
    {
      "line": 12,
      "name": "@TC10"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "enter \u0027Michael\u0027",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "enter item number \u002735N3\u0027",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "click Add",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "enter quantity \u00274\u0027",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.before({
  "duration": 14651317835,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "enter name, item number and quantity",
  "description": "",
  "id": "place-an-order-by-adding-a-new-credit-card;enter-name,-item-number-and-quantity;;7",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@scholastic"
    },
    {
      "line": 12,
      "name": "@TC10"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "enter \u0027Michael\u0027",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "enter item number \u002734B4\u0027",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "click Add",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "enter quantity \u002710\u0027",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.before({
  "duration": 16808175439,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "finish the TC10",
  "description": "",
  "id": "place-an-order-by-adding-a-new-credit-card;finish-the-tc10",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 26,
      "name": "@TC10-end"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "click Review Cart",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "get total for student and total for the item",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "delete first item",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "Verify the total amount is changed after deleting the item",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});