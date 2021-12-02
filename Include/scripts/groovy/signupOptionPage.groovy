import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class signupOptionPage {


	@Given("User has started the mobile app")
	def user_has_started_the_mobile_app() {
		Mobile.startApplication('C:\\Users\\nikhi\\Downloads\\app-prod-debug.apk', true)
	}

	@When("User taps on Signup page")
	def user_taps_on_Signup_page() {
		if (Mobile.verifyElementVisible(findTestObject('AfterInvokeSkip/android.widget.Button - Skip'), 4) == true) {
			Mobile.tap(findTestObject('AfterInvokeSkip/android.widget.Button - Skip'), 1)
		}

		def message = Mobile.getText(findTestObject('Signup_Option/android.widget.Button - Continue With Email'), 10)
	}

	  @Then("Verify the Continue With Email option will appear")
	   def Verify_the_Continue_With_Email_option_will_appear() {
		Mobile.verifyEqual(message, 'Continue With Email')
	}

	
}