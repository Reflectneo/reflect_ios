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

Mobile.tap(findTestObject('User_Login/IOS.widget.Button - Have an account Login'), 30)

'NEO_105_TC_01_Validate login Page using Different methods'
WebUI.callTestCase(findTestCase('All_TestCases/Login_Page_Testcases/Email_Login_Screen/NEO_105_TC_01_Validate login Page using Different methods'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_105_TC_02_Validate Email is required'
WebUI.callTestCase(findTestCase('All_TestCases/Login_Page_Testcases/Email_Login_Screen/NEO_105_TC_02_Validate Email is required'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_105_TC_03_Validate Email without At the rate'
WebUI.callTestCase(findTestCase('All_TestCases/Login_Page_Testcases/Email_Login_Screen/NEO_105_TC_03_Validate Email without At the rate'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_105_TC_04_Validate Email without Dot'
WebUI.callTestCase(findTestCase('All_TestCases/Login_Page_Testcases/Email_Login_Screen/NEO_105_TC_04_Validate Email without Dot'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_105_TC_05_Validate Password is required'
WebUI.callTestCase(findTestCase('All_TestCases/Login_Page_Testcases/Email_Login_Screen/NEO_105_TC_05_Validate Password is required'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_105_TC_06_Validate combination of Valid Email ID and Invalid Password'
WebUI.callTestCase(findTestCase('All_TestCases/Login_Page_Testcases/Email_Login_Screen/NEO_105_TC_06_Validate combination of Valid Email ID and Invalid Password'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_105_TC_07_Validate Login using email and password'
WebUI.callTestCase(findTestCase('All_TestCases/Login_Page_Testcases/Email_Login_Screen/NEO_105_TC_07_Validate Login using email and password'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

