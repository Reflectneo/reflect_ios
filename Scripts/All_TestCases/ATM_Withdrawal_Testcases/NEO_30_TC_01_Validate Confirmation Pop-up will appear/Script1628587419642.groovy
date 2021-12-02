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

'Click on Card Dashboard'
Mobile.tap(findTestObject('Card Dashboard/IOS.widget.TextView - Total Balance'), 0)

'Click on ATM WithDrawal Button '
Mobile.tap(findTestObject('ATM withdrawal Home Page/android.widget.TextView - ATM Withdrawal'), 0)

'Take A screenshot'
Mobile.takeScreenshot()

'Enter Withdrawal amount'
Mobile.setText(findTestObject('ATM withdrawal Home Page/android.widget.EditText - Withdrawal Amount'), '10', 0)

'Click on Confirm Button'
Mobile.tap(findTestObject('ATM withdrawal Home Page/IOS.widget.Button - Confirm'), 0)

'wait'
Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'Swipe'
Mobile.swipe(300, 500, 0, 0)

'Take A screenshot'
Mobile.takeScreenshot()

'Click on Confirm Button'
Mobile.tap(findTestObject('ATM withdrawal Home Page/android.widget.Button - Final Confirm'), 0)

'Verify Your transaction has been successfully processed'
Mobile.verifyElementExist(findTestObject('ATM withdrawal Home Page/android.widget.TextView - Your transaction has been successfully processed'), 
    10)

'Take A screenshot'
Mobile.takeScreenshot()

