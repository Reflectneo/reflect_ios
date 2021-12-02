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

WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Registration_option_page/Neo_8_TC_01_Validate successful Signup option page appears once user launch the application'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Registration_option_page/Neo_8_TC_02_Validate successful user registration page appears once user clicks on Email option for registration'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Registration_option_page/Neo_8_TC_03_Validate successful user registration page appears once user clicks on Facebook option for registration'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Registration_option_page/Neo_8_TC_04_Validate successful user registration page appears once user clicks on Google. option for registration'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Registration_option_page/Neo_8_TC_05_Validate successful user Login page appears once user clicks on Have an account Login button'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

