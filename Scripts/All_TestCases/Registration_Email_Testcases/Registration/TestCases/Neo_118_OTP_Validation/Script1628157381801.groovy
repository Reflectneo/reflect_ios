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

WebUI.callTestCase(findTestCase('Common/Invoke_Application'), [:], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('User_Login/IOS.widget.Button - Login'), 30)

'Login to the application'
WebUI.callTestCase(findTestCase('Common/Continue_With_Email'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_118_TC_01_Field Validation for OTP\r\n'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Field_and_Business_Rule_Validations/OTP_Verification/OTP_Field_Validation'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_118_TC_02_Business Rule Validation for OTP is required'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Field_and_Business_Rule_Validations/OTP_Verification/OTP_Required_BusinessRule_Validation'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_118_TC_03_Business Rule Validation OTP Field is  less than 6 digits'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Field_and_Business_Rule_Validations/OTP_Verification/OTP_LessThanSix_BRV'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_118_TC_04_Business Rule Validation Random Number in OTP Fields\r\n'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Field_and_Business_Rule_Validations/OTP_Verification/OTP_Invalid_BusinessRuleValidation'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

