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

'Click on Resume Space'
Mobile.tap(findTestObject('Saving Space/Pause and Resume/IOS.widget.Button - Resume Space'), 10)

'Take A screenshot'
Mobile.takeScreenshot()

'Verify Saving space is Resume'
Mobile.verifyElementExist(findTestObject('Saving Space/Pause and Resume/IOS.widget.TextView - Resume Saving'), 0)

'Verify Weve missed you Transfers into this space will resume as scheduled'
Mobile.verifyElementExist(findTestObject('Saving Space/Pause and Resume/IOS.widget.TextView - Weve missed you Transfers into this space will resume as scheduled'), 
    0)

'Take A screenshot'
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Saving Space/Pause and Resume/IOS.widget.Button - Resume'), 10)

'Verify Transaction amount Button is Enabled'
Mobile.verifyElementExist(findTestObject('Saving Space/Trip/Trip Transaction/IOS.widget.Button - Transfer Amount'), 
    0)

'Verify Saving space status is Active in Dashboard'
Mobile.verifyElementExist(findTestObject('Saving Space/Pause and Resume/IOS.widget.Button - ACTIVE'), 0)

'Take A screenshot'
Mobile.takeScreenshot()

