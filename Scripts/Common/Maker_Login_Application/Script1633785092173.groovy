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

'Click on Login Button'
Mobile.tap(findTestObject('User_Login/IOS.widget.Button - Have an account Login'), 30)

'Enter Valid Email on EMail ID fields'
Mobile.setText(findTestObject('User_Login/IOS.widget.EditText - Email address'), GlobalVariable.Email, 0)

'Enter Valid Password on Password  fields'
Mobile.setText(findTestObject('User_Login/IOS.widget.EditText - Password'), GlobalVariable.Password, 0)

'Click on Login Button'
Mobile.tap(findTestObject('User_Login/IOS.widget.Button - Login'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Wait'
Mobile.delay(30)

'Take ScreenShot'
Mobile.takeScreenshot()

'Verify OTP'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Functional/OTP_Verification'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

