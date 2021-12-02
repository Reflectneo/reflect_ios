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

WebUI.callTestCase(findTestCase('Process Flow/Registration/RegistrationThroughEmailID'), [:], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common/Swipe_Loyalty'), [:], FailureHandling.CONTINUE_ON_FAILURE)

def LoyaltyBalance = Mobile.getText(findTestObject('Loyalty Balance/DashBoard/IOS.widget.TextView - LoyaltyBalance'), 
    10)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot()

'Verify Loyalty Balance'
Mobile.verifyEqual(LoyaltyBalance, '5.0')

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Loyalty Balance/DashBoard/IOS.widget.TextView - LoyaltyBalance'), 10)

Mobile.takeScreenshot()

def LoyaltyBalanceHistory = Mobile.getText(findTestObject('Loyalty Balance/LoyaltyHistory/IOS.widget.TextView - 2nd_TransactionHistory'), 
    10)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

'Verify Loyalty Balance History'
Mobile.verifyEqual(LoyaltyBalanceHistory, '+ 5.0 POINTS')

Mobile.takeScreenshot()

