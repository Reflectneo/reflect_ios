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
Mobile.tap(findTestObject('Top Up/Top Up Home/android.widget.Button-Open Top Up'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify Using any of the 3 methods below'
Mobile.verifyElementExist(findTestObject('Top Up/Top Up Home/android.widget.TextView - Add funds to your wallet using one of the 3 methods below'), 
    10)

'Verify IBAN Top-up'
Mobile.verifyElementExist(findTestObject('Top Up/Top Up Home/android.widget.TextView - IBAN Top-up'), 10)

'Verify Card Top-up'
Mobile.verifyElementExist(findTestObject('Top Up/Top Up Home/android.widget.TextView - Debitcredit card Top-up'), 10)

'Swipe'
Mobile.swipe(300, 500, 0, 0)

'Verify UATM Deposit Top-up'
Mobile.verifyElementExist(findTestObject('Top Up/Top Up Home/android.widget.TextView - ATM Deposit'), 10)

'Take A screenshot'
Mobile.takeScreenshot()

