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

//'Click on Card Top-up'
//Mobile.tap(findTestObject('Top Up/Top Up Home/android.widget.TextView - Card Top-up'), 0)
//'Take A screenshot'
//Mobile.takeScreenshot()
//'Enter Top-up amount'
//Mobile.setText(findTestObject('Top Up/Card Top-up/android.widget.EditText - Top-up Amount'), '10', 0)
//'Click on Next'
//Mobile.tap(findTestObject('Top Up/Card Top-up/android.widget.Button - Next'), 0)
'Click on Cancel'
Mobile.tap(findTestObject('Top Up/Card Top-up/android.widget.Button - No For Arab Bank debit card'), 0)

'Verify pop-up option'
Mobile.verifyElementExist(findTestObject('Top Up/Card Top-up/android.widget.TextView - You will be redirected to a secure payment portal to complete the payment'), 
    10)

'Verify Yes Button'
Mobile.verifyElementExist(findTestObject('Top Up/Card Top-up/android.widget.Button - Yes  For Mobicash'), 10)

'Verify Cancel Button'
Mobile.verifyElementExist(findTestObject('Top Up/Card Top-up/android.widget.Button - Cancel For Mobicash'), 10)

'Take A screenshot'
Mobile.takeScreenshot()

