import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.AppiumDriver as AppiumDriver
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

Mobile.swipe(400, 600, 0, 0)

Mobile.tap(findTestObject('User_Registration/Registration_Screen/MyInformation/android.widget.Button - Signup'), 60)

'Verify Date of Birth is required'
AppiumDriver<?> driver = MobileDriverFactory.getDriver()

def toast = driver.findElementByXPath('//android.widget.Toast[@text=\'Please enter your date of birth\']')

println('Toast element: ' + toast)

'Verify Date of Birth is required'
if (toast == null) {
    KeywordUtil.markFailed('ERROR: Toast object not found!')
}

Mobile.takeScreenshot()



Mobile.tap(findTestObject('User_Registration/Registration_Screen/MyInformation/android.widget.ImageButton'), 0)

Mobile.longPress(findTestObject('User_Registration/Registration_Screen/MyInformation/android.widget.EditText - 2021'), 1993,
	FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('User_Registration/Registration_Screen/MyInformation/android.widget.EditText - 2021'), '1993',
	0)

Mobile.longPress(findTestObject('User_Registration/Registration_Screen/MyInformation/android.widget.EditText - Aug'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('User_Registration/Registration_Screen/MyInformation/android.widget.Button - Continue'), 0)