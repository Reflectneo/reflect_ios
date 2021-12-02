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
Mobile.tap(findTestObject('User_Login/IOS.widget.Button - Have an account Login'), 10)

'Click on Forgot Password'
Mobile.tap(findTestObject('Forgot Password/IOS.widget.TextView - Forgot your password'), 10)

'Wait'
Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

'Clear mobile number'
Mobile.clearText(findTestObject('Forgot Password/IOS.widget.EditText - Mobile Number'), 0)

'Verify Mobile is required'
Mobile.verifyElementExist(findTestObject('Forgot Password/IOS.widget.Button - Reset Password_Disabled'), 0)

'Take ScreenShot'
Mobile.takeScreenshot()

