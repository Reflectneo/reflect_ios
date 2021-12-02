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

'CLick on PayBill Button'
Mobile.tap(findTestObject('Top Up/Card Top-up/android.widget.Button - Pay the bill'), 10)

'CLick on Pay Button'
Mobile.tap(findTestObject('Top Up/Card Top-up/android.view.View - Pay'), 10)

Mobile.delay(10)

'Take A screenshot'
Mobile.takeScreenshot()

'Verify Bill Paid Suucessfully'

//Mobile.verifyElementExist(findTestObject('Top Up/Card Top-up/android.view.View - Bill paid'), 10)
'Take A screenshot'
Mobile.takeScreenshot()

Mobile.delay(5)

Mobile.tap(findTestObject('Top Up/Card Top-up/android.view.View-Child'), 10)

Mobile.delay(2)

Mobile.tap(findTestObject('Top Up/Card Top-up/android.view.View-Child'), 10)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Top Up/Card Top-up/android.widget.Button - Done'), 10)

Mobile.takeScreenshot()

