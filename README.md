# Coding Assessment POC
## Functional test on Selendroid App

# Test Case
## Create a new user and assert the values on Verfiy screen

# Installation Pre-requisites:
## Following tools must be installed to run the test case on desired machine:
	Install JDK
	Install Eclipse - LUNA IDE
	Install Cucumber Eclipse Feature Plugin
	Install Android SDK
	Install Android API version 4.4.2
	Install Appium for Windows
	Install Android Studio
	Install Node JS
	
# Steps to execute the code:
## Open the imported project in Eclipse
## Instatiate Appium Server on the following address: Host:Port = localhost:4723
## Create a new emulator with Android Studio and following details:
		AVD Name: Nexus 5 API 19
		Target: 4.4.2 Kitkat
		Resolution: 1080x1920
##Open the TestRunner file placed in poc/src/test/java/com/apium/poc/Runner/TestRunner.java directory

Note: This test will execute once as their is a single test data record in the data file placed at /poc/src/main/java/com/apium/poc/utilities/testdata/Test_Data_new.xlsx

Report will be generated in the following folder: /poc/target/cucumber-html-report