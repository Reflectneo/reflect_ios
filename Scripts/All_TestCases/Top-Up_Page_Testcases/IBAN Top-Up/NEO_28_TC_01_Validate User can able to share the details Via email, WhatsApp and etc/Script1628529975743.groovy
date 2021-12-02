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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.AppiumDriver as AppiumDriver
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

'Click on Top up'
Mobile.tap(findTestObject('Top Up/Top Up Home/android.widget.Button-Open Top Up'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Click on IBAN Top up'
Mobile.tap(findTestObject('Top Up/Top Up Home/android.widget.TextView - IBAN Top-up'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Wait'
Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

'Swipe'
Mobile.swipe(300, 500, 0, 0)

'Click on Share'
Mobile.tap(findTestObject('Top Up/IBAN Top-up/android.widget.Button - Share Details'), 10)

'Click on Copy'
Mobile.tap(findTestObject('Top Up/IBAN Top-up/android.widget.Button - Copy'), 0)

'Get Toast Message'
AppiumDriver<?> driver = MobileDriverFactory.getDriver()

def toast = driver.findElementByXPath('//android.widget.Toast[@text=\'Copied\']')

println('Toast element: ' + toast)

'Verify Text Copied'
if (toast == null) {
    KeywordUtil.markFailed('ERROR: Toast object not found!')
}

'Take ScreenShot'
Mobile.takeScreenshot()

