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

Mobile.tap(findTestObject('User_Login/IOS.widget.Button_FaceBook'), 30)

'Neo_220_TC_03_Validate successfully user clicks on Facebook option'
Mobile.verifyElementExist(findTestObject('User_Registration/RegistrationThroughFacebook/Facebook_Login/android.view.View - Log in to Facebook'), 
    10)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('User_Registration/RegistrationThroughFacebook/Facebook_Login/android.widget.TextView - English (UK)'), 
    30)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

'Enter Facebook ID'
WebUI.setText(findTestObject('User_Registration/RegistrationThroughFacebook/Facebook_Login/android.widget.EditText - Email'), '9131150812', 
    0)

'Enter Facebook Password'
WebUI.setEncryptedText(findTestObject('User_Registration/RegistrationThroughFacebook/Facebook_Login/android.widget.EditText - Password'), 
    'aA01fTvnMA0YnYsFtYX0cA==', 0)

'Neo_220_TC_04_Validate successfully user clicks on Facebook with Valid Credential'
WebUI.click(findTestObject('User_Registration/RegistrationThroughFacebook/Facebook_Login/android.widget.Button - Log In'), 
    0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('User_Registration/RegistrationThroughFacebook/Facebook_Login/android.widget.Button - Continue as Jack'), 
    0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot()

