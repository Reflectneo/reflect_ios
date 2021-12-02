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

'Click on Top-up'
Mobile.tap(findTestObject('Top Up/Top Up Home/android.widget.TextView - IBAN Top-up'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify Name'
Mobile.verifyElementExist(findTestObject('Top Up/IBAN Top-up/android.widget.TextView - Name'), 10)

'Verify IBAN'
Mobile.verifyElementExist(findTestObject('Top Up/IBAN Top-up/android.widget.TextView - IBAN'), 10)

'Verify Wallet ID  Mobile Number'
Mobile.verifyElementExist(findTestObject('Top Up/IBAN Top-up/android.widget.TextView - Wallet ID  Mobile Number'), 10)

'Verify Swift code'
Mobile.verifyElementExist(findTestObject('Top Up/IBAN Top-up/android.widget.TextView - Swift code'), 10)

'Verify BANK (Bank Name)'
Mobile.verifyElementExist(findTestObject('Top Up/IBAN Top-up/android.widget.TextView - BANK (Bank Name)'), 10)

'Take A screenshot'
Mobile.takeScreenshot()

