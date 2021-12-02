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

WebUI.callTestCase(findTestCase('Common/Invoke_Application'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common/Maker_Login_Application'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Process Flow/Saving Space/NEO_Trip_Space_Saving'), [:], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Saving Space/Saving Dashboard/IOS.widget.ImageView - Close'), 0)

WebUI.callTestCase(findTestCase('Process Flow/Saving Space/NEO_Car_Space_Saving'), [:], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Saving Space/Saving Dashboard/IOS.widget.ImageView - Close'), 0)

WebUI.callTestCase(findTestCase('Process Flow/Saving Space/NEO_Custom_Space_Saving'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'Verify overview of all my saving spaces'
Mobile.verifyElementExist(findTestObject('Saving Space/Saving Dashboard/IOS.widget.TextView - Trip'), 0)

'Verify overview of all my saving spaces'
Mobile.verifyElementExist(findTestObject('Saving Space/Saving Dashboard/IOS.widget.TextView - Car'), 0)

'Verify overview of all my saving spaces'
Mobile.verifyElementExist(findTestObject('Saving Space/Saving Dashboard/IOS.widget.TextView - Custom'), 0)

