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

'Click on Pause'
Mobile.tap(findTestObject('Saving Space/Pause and Resume/IOS.widget.Button - Pause Saving'), 10)

'Take A screenshot'
Mobile.takeScreenshot()

'Verify Saving space is Paused'
Mobile.verifyElementExist(findTestObject('Saving Space/Pause and Resume/IOS.widget.TextView - Taking a pause'), 0)

'Verify Transfers into this space will be paused till further notice'
Mobile.verifyElementExist(findTestObject('Saving Space/Pause and Resume/IOS.widget.TextView - Transfers into this space will be paused till further notice'), 
    0)

'Take A screenshot'
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Saving Space/Pause and Resume/IOS.widget.Button - OK'), 10)

'Verify Transaction amount Button is disabled'
Mobile.verifyElementExist(findTestObject('Saving Space/Pause and Resume/IOS.widget.Button - Transfer Amount - Disabled'), 
    0)

'Verify Saving space status is Paused in Dashboard'
Mobile.verifyElementExist(findTestObject('Saving Space/Pause and Resume/IOS.widget.Button - PAUSED'), 0)

'Take A screenshot'
Mobile.takeScreenshot()

