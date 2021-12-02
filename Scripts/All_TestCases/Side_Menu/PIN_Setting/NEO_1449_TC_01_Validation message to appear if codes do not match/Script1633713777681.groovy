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

'Click on Side Panel'
Mobile.tap(findTestObject('Side Menu/PIN Setting/android.widget.Button'), 0)

'Click on Setting'
Mobile.tap(findTestObject('Side Menu/PIN Setting/android.widget.CheckedTextView - Settings'), 0)

'Click on Security'
Mobile.tap(findTestObject('Side Menu/PIN Setting/android.widget.TextView - Security'), 0)

'Click on Setup PIN'
Mobile.tap(findTestObject('Side Menu/PIN Setting/android.widget.TextView - Setup PIN code'), 0)

Mobile.tap(findTestObject('Side Menu/PIN Setting/android.widget.Button - 1'), 0)

Mobile.tap(findTestObject('Side Menu/PIN Setting/android.widget.Button - 2'), 0)

Mobile.tap(findTestObject('Side Menu/PIN Setting/android.widget.Button - 3'), 0)

Mobile.tap(findTestObject('Side Menu/PIN Setting/android.widget.Button - 4'), 0)

Mobile.tap(findTestObject('Side Menu/PIN Setting/android.widget.Button - 5'), 0)

Mobile.tap(findTestObject('Side Menu/PIN Setting/android.widget.Button - 6'), 0)

'Take A screenshot'
Mobile.takeScreenshot()

'Click on Next'
Mobile.tap(findTestObject('Side Menu/PIN Setting/android.widget.Button - Next'), 0)

Mobile.tap(findTestObject('Side Menu/PIN Setting/android.widget.Button - 3'), 0)

Mobile.tap(findTestObject('Side Menu/PIN Setting/android.widget.Button - 4'), 0)

Mobile.tap(findTestObject('Side Menu/PIN Setting/android.widget.Button - 5'), 0)

Mobile.tap(findTestObject('Side Menu/PIN Setting/android.widget.Button - 6'), 0)

Mobile.tap(findTestObject('Side Menu/PIN Setting/android.widget.Button - 2'), 0)

Mobile.tap(findTestObject('Side Menu/PIN Setting/android.widget.Button - 3'), 0)

'Take A screenshot'
Mobile.takeScreenshot()

'Click on Confirm'
Mobile.tap(findTestObject('Side Menu/PIN Setting/android.widget.Button - Confirm'), 0)

'Verify PIN codes do not match'

AppiumDriver<?> driver = MobileDriverFactory.getDriver()

def toast = driver.findElementByXPath('//android.widget.Toast[@text=\'PIN codes do not match\']')

println('Toast element: ' + toast)

'Verify PIN codes do not match'
if (toast == null) {
    KeywordUtil.markFailed('ERROR: Toast object not found!')
}

'Take A screenshot'
Mobile.takeScreenshot()
