$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Checkmate Scenarios for CA State",
  "description": "",
  "id": "checkmate-scenarios-for-ca-state",
  "keyword": "Feature"
});
formatter.before({
  "duration": 132700,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 308,
      "value": "#Then History"
    }
  ],
  "line": 311,
  "name": "Loan Loan with ACH → mark Revoke from admin → Process Safe deposit on Due date",
  "description": "",
  "id": "checkmate-scenarios-for-ca-state;loan-loan-with-ach-→-mark-revoke-from-admin-→-process-safe-deposit-on-due-date",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 310,
      "name": "@current"
    }
  ]
});
formatter.step({
  "line": 312,
  "name": "CA_PDL_087",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 313,
      "value": "#And Login into CSR"
    },
    {
      "line": 314,
      "value": "#Given Registration of the Borrower PDL"
    },
    {
      "line": 315,
      "value": "#Then New Loan taken for the user"
    },
    {
      "line": 316,
      "value": "#And Get the Due Date from History"
    }
  ],
  "line": 317,
  "name": "Revoke from admin",
  "keyword": "Then "
});
formatter.step({
  "line": 318,
  "name": "Get the Due Date from History",
  "keyword": "And "
});
formatter.step({
  "line": 319,
  "name": "Age the store to \"0\"",
  "keyword": "Then "
});
formatter.step({
  "line": 320,
  "name": "Safe deposit on duedate",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinations.CA_PDL_087()"
});
formatter.result({
  "duration": 422470400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinations.revoke_from_admin()"
});
formatter.result({
  "duration": 14788953400,
  "error_message": "org.openqa.selenium.UnhandledAlertException: Modal dialog present: Please Enter any one of The Search Criteria.\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027QTLSYS0-238\u0027, ip: \u0027192.168.0.238\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_212-3-redhat\u0027\nDriver info: org.openqa.selenium.ie.InternetExplorerDriver\nCapabilities {browserAttachTimeout: 0, browserName: internet explorer, cssSelectorsEnabled: true, elementScrollBehavior: 0, enableElementCacheCleanup: true, enablePersistentHover: true, handlesAlerts: true, ie.browserCommandLineSwitches: , ie.ensureCleanSession: false, ie.forceCreateProcessApi: false, ie.usePerProcessProxy: false, ignoreProtectedModeSettings: false, ignoreZoomSetting: false, initialBrowserUrl: http://localhost:46690/, javascriptEnabled: true, nativeEvents: true, platform: WINDOWS, platformName: WINDOWS, requireWindowFocus: false, takesScreenshot: true, unexpectedAlertBehaviour: dismiss, unhandledPromptBehavior: dismiss, version: 11}\nSession ID: 0e7cb299-91ee-43ad-8489-d7ea9275c3b6\n*** Element info: {Using\u003dxpath, value\u003d//input[@name\u003d\u0027button\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createUnhandledAlertException(ErrorHandler.java:195)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:156)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:319)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:421)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:311)\r\n\tat stepDefinitions.revoke_from_admin.revoke_from_admin(revoke_from_admin.java:73)\r\n\tat stepDefinitions.StepDefinations.revoke_from_admin(StepDefinations.java:1035)\r\n\tat ✽.Then Revoke from admin(login.feature:317)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinations.get_the_Due_Date_from_History()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 18
    }
  ],
  "location": "StepDefinations.age_the_store_to_days(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinations.safe_deposit_on_duedate()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 66000,
  "status": "passed"
});
});