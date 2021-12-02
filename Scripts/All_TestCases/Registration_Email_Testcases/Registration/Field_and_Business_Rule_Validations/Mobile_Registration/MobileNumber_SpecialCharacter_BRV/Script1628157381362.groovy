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

Mobile.setText(findTestObject('User_Registration/Registration_Screen/MobileNumberForRegistration/android.widget.EditText - Mobile Number'), 
    '@#!3525325', 0)

Mobile.checkElement(findTestObject('User_Registration/Registration_Screen/MobileNumberForRegistration/android.widget.CheckBox'), 
    0)

Mobile.tap(findTestObject('User_Registration/Registration_Screen/MobileNumberForRegistration/android.widget.EditText - Mobile Number'),
	0)

Mobile.tap(findTestObject('User_Registration/Registration_Screen/MobileNumberForRegistration/android.widget.Button'), 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

def MobileValue = Mobile.getText(findTestObject('User_Registration/Registration_Screen/MobileNumberForRegistration/android.widget.EditText - Mobile Number'), 
   0)

'Verify Unable to processed with Special Character'
Mobile.verifyMatch(MobileValue, '@#!352532', false)

'Take a ScreenShot'
CustomKeywords.'com.arabbank.toastmessage.InvalidMessage.takeScreenShot'(GlobalVariable.Path, GlobalVariable.Name)

'Convert OCR to Text'
CustomKeywords.'com.arabbank.toastmessage.InvalidMessage.runBatchFile'(GlobalVariable.batchFile)

'5 sec wait'
Mobile.delay(5)

println('The mobile number you entered is not valid')

'Verify Unable to processed with Special Character'
CustomKeywords.'com.arabbank.toastmessage.InvalidMessage.ValidationMessage'('The mobile number you entered is not valid', 
    GlobalVariable.OutputFile)

Mobile.takeScreenshot()

