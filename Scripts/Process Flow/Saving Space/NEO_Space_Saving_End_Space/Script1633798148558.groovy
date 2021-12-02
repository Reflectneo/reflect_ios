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

Mobile.swipe(300, 500, 0, 0)

'Click on End Space'
Mobile.tap(findTestObject('Saving Space/End Space/IOS.widget.Button - End Space'), 10)

'Take A screenshot'
Mobile.takeScreenshot()

'Verify End Space Pop-up'
Mobile.verifyElementExist(findTestObject('Saving Space/End Space/IOS.widget.TextView - The amount saved in this space will be transferred back to your wallet'), 
    0)

'Take A screenshot'
Mobile.takeScreenshot()

'Click on End Spacing'
Mobile.tap(findTestObject('Saving Space/End Space/IOS.widget.Button - End this space'), 10)

'Take A screenshot'
Mobile.takeScreenshot()

'Verify Sad to see you leave, but you can start a new space at anytime'
Mobile.verifyElementExist(findTestObject('Saving Space/End Space/IOS.widget.TextView - Sad to see you leave, but you can start a new space at anytime'), 
    0)

'Take A screenshot'
Mobile.takeScreenshot()

'Click on Confirm'
Mobile.tap(findTestObject('Saving Space/End Space/IOS.widget.Button - Confirm'), 10)

'Take A screenshot'
Mobile.takeScreenshot()

'Verify My Space'
Mobile.verifyElementExist(findTestObject('Saving Space/End Space/IOS.widget.TextView - My Spaces'), 0)

