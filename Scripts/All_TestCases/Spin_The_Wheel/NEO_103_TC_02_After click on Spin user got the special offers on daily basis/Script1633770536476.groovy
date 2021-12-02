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

'Click on  Spin and win '
Mobile.tap(findTestObject('Spin the Wheel/android.widget.ImageView - Spin and Win'), 0)

'Take A screenshot'
Mobile.takeScreenshot()

'Click on  Spin the wheel '
Mobile.tap(findTestObject('Spin the Wheel/android.widget.Button - SPIN'), 0)

'Wait'
Mobile.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

'Verify User got the offer and points'
Mobile.verifyElementExist(findTestObject('Spin the Wheel/android.widget.TextView - You won 50 points'), 0)

'Take A screenshot'
Mobile.takeScreenshot()

'Click on  Collect '
Mobile.tap(findTestObject('Spin the Wheel/android.widget.Button - Collect'), 0)

'Wait'
Mobile.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

'Take A screenshot'
Mobile.takeScreenshot()

'Click on  Dashboard '
Mobile.tap(findTestObject('Spin the Wheel/android.widget.Button'), 0)

'Take A screenshot'
Mobile.takeScreenshot()

