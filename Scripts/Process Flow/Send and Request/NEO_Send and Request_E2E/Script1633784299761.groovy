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

'Click on Pay'
Mobile.tap(findTestObject('P2P/IOS.widget.ImageView-Pay1'), 10)

'Click on Request'
Mobile.tap(findTestObject('Send and Request/android.widget.Button - Request'), 10)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot()

'Click on Request'
Mobile.tap(findTestObject('Send and Request/android.widget.Button - Request Money'), 10)

Mobile.takeScreenshot()

'Search Contact Number'
Mobile.setText(findTestObject('P2P/IOS.widget.EditText - Enter a name or phone number'), 'P2P', 0)

Mobile.takeScreenshot()

'Select Contact number'
Mobile.tap(findTestObject('Send and Request/android.widget.TextView - P2P'), 10)

'Enter Amount'
Mobile.setText(findTestObject('Send and Request/android.widget.EditText - 0.00'), '120', 0)

'Enter Note'
Mobile.setText(findTestObject('Send and Request/android.widget.EditText - Whats it for'), 'Demo', 0)

Mobile.takeScreenshot()

'Click on Request'
Mobile.tap(findTestObject('Send and Request/android.widget.Button - Request_Final'), 10)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot()

'Click on Confirm'
Mobile.tap(findTestObject('Send and Request/android.widget.Button - Confirm'), 10)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot()

'Verify Request Successfully'
Mobile.verifyElementExist(findTestObject('Send and Request/android.widget.TextView - Your request has been sent'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot()

'Click on Close'
Mobile.tap(findTestObject('Send and Request/android.widget.ImageView-Close Request'), 10)

Mobile.takeScreenshot()

