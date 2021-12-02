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

'Click on Login Button'
Mobile.tap(findTestObject('User_Login/IOS.widget.Button - Have an account Login'), 30)

'Enter Email id on Email Fields'
Mobile.setText(findTestObject('User_Login/IOS.widget.EditText - Email address'), GlobalVariable.Email, 0)

'Inavlid Password on Password Fields'
Mobile.setText(findTestObject('User_Login/IOS.widget.EditText - Password'), GlobalVariable.InvalidPassword, 0)

'5 sec wait'
Mobile.delay(5)

'Click on Login Button'
Mobile.tap(findTestObject('User_Login/IOS.widget.Button - Login'), 2, FailureHandling.CONTINUE_ON_FAILURE)

'5 sec wait'
Mobile.delay(5)

'Verify The information you entered is invalid'
Mobile.verifyElementExist(findTestObject('User_Login/IOS.widget.TextView - The information you entered is invalid'), 
    0)

Mobile.takeScreenshot()

