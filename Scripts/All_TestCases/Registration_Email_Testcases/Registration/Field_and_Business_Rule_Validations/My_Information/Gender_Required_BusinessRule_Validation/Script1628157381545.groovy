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

Mobile.setText(findTestObject('User_Registration/Registration_Screen/MyInformation/android.widget.EditText - First Name'), 
    'Nikhil', 0)

Mobile.tap(findTestObject('User_Registration/Registration_Screen/MyInformation/android.widget.EditText - Email'), 60)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('User_Registration/Registration_Screen/MyInformation/android.widget.EditText - Last Name'), 
    'Yadav', 0)

Mobile.tap(findTestObject('User_Registration/Registration_Screen/MyInformation/android.widget.EditText - Email'), 60)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('User_Registration/Registration_Screen/MyInformation/android.widget.Button - Signup'), 60)

AppiumDriver<?> driver = MobileDriverFactory.getDriver()

def toast = driver.findElementByXPath('//android.widget.Toast[@text=\'Please enter your gender\']')

println('Toast element: ' + toast)

'Verify Gender is required'
if (toast == null) {
    KeywordUtil.markFailed('ERROR: Toast object not found!')
}

Mobile.takeScreenshot()

//Mobile.verifyElementExist(findTestObject('User_Registration/Registration_Screen/MyInformation/android.widget.Toast - Gender is required'),     10)
'Verify Gender is required'
Mobile.takeScreenshot()

Mobile.tap(findTestObject('User_Registration/Registration_Screen/MyInformation/android.widget.EditText - Gender'), 0)

Mobile.selectListItemByLabel(findTestObject('User_Registration/Registration_Screen/MyInformation/android.widget.CheckedTextView - Male'), 
    'Male', 1)

