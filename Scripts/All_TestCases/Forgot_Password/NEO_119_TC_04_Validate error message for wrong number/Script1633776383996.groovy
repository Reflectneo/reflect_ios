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

'Enter wrong mobile number'
Mobile.setText(findTestObject('Forgot Password/IOS.widget.EditText - Mobile Number'), '770909090', 0)

'Click on Reset Passwoed buttton'
Mobile.tap(findTestObject('Forgot Password/IOS.widget.Button - Reset Password'), 0)

'5 sec wait'
Mobile.delay(5)

'Take ScreenShot'
Mobile.takeScreenshot()

'Verify error message for wrong mobile number'
Mobile.verifyElementExist(findTestObject('Forgot Password/IOS.widget.TextView - The entered mobile number is incorrect Please enter the mobile number again'), 
    0)

'Take ScreenShot'
Mobile.takeScreenshot()

'Click on OK'
Mobile.tap(findTestObject('Forgot Password/IOS.widget.Button - OK'), 0)

'Enter Correct Mobile Number'
Mobile.setText(findTestObject('Forgot Password/IOS.widget.EditText - Mobile Number'), '779131150', 0)

'Click on Reset Passwoed buttton'
Mobile.tap(findTestObject('Forgot Password/IOS.widget.Button - Reset Password'), 10)

