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

'Click on Continue For AB Customer'
Mobile.tap(findTestObject('Open Wallet for AB/IOS.widget.Button - Continue'), 10)

'Click on Continue For Start Fresh'
Mobile.tap(findTestObject('Open Wallet for AB/IOS.widget.TextView - Open with Arab Bank'), 10)

WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Functional/Skip_Screen'), [:], 
    FailureHandling.CONTINUE_ON_FAILURE)

'Enter Card Number 4 digit'
Mobile.setText(findTestObject('Open Wallet for AB/IOS.widget.EditText -1'), GlobalVariable.CardNo1, 0)

'Enter Card Number 4 digit'
Mobile.setText(findTestObject('Open Wallet for AB/IOS.widget.EditText -2'), GlobalVariable.CardNo2, 0)

'Enter Card Number 4 digit'
Mobile.setText(findTestObject('Open Wallet for AB/IOS.widget.EditText -3'), GlobalVariable.CardNo3, 0)

'Enter Card Number 4 digit'
Mobile.setText(findTestObject('Open Wallet for AB/IOS.widget.EditText -4'), GlobalVariable.CardNo4, 0)

'Enter PIN Number'
Mobile.setText(findTestObject('Open Wallet for AB/IOS.widget.EditText - PIN code'), GlobalVariable.PINCode, 0)

'Click on Open Wallet'
Mobile.tap(findTestObject('Open Wallet for AB/IOS.widget.Button - Open Wallet'), 10)

