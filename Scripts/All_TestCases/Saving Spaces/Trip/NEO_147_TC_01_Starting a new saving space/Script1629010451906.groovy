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

WebUI.callTestCase(findTestCase('Common/Swipe_Saving Space'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'Click on Saving Space'
Mobile.tap(findTestObject('Saving Space/Saving Dashboard/IOS.widget.Button-Plus Icon'), 0)

'Click on Trip'
Mobile.tap(findTestObject('Saving Space/Saving Options/IOS.widget.TextView - Trip'), 0)

'Verify What do you want to name this space'
Mobile.verifyElementExist(findTestObject('Saving Space/Trip/Setup your saving space/IOS.widget.EditText - What do you want to name this space'), 
    10)

'Verify Where are you going'
Mobile.verifyElementExist(findTestObject('Saving Space/Trip/Setup your saving space/IOS.widget.EditText - Where are you going'), 
    10)

'Verify When are you traveling'
Mobile.verifyElementExist(findTestObject('Saving Space/Trip/Setup your saving space/IOS.widget.EditText - When are you traveling'), 
    10)

'Verify Add a picture for inspiration'
Mobile.verifyElementExist(findTestObject('Saving Space/Trip/Setup your saving space/IOS.widget.EditText - Add a picture for inspiration'), 
    10)

'Verify Setup your saving space'
Mobile.verifyElementExist(findTestObject('Saving Space/Trip/Setup your saving space/IOS.widget.TextView - Setup your saving space'), 
    10)

'Take A screenshot'
Mobile.takeScreenshot()

