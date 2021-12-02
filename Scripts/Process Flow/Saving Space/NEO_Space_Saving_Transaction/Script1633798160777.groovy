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



'Take A screenshot'
Mobile.takeScreenshot()

'Click on Transafer amount'
Mobile.tap(findTestObject('Saving Space/Trip/Trip Transaction/IOS.widget.Button - Transfer Amount'), 10)

'Take A screenshot'
Mobile.takeScreenshot()

'Enter Amount'
Mobile.setText(findTestObject('Saving Space/Trip/Trip Transaction/IOS.widget.EditText - 0'), '25', 0)

'Take A screenshot'
Mobile.takeScreenshot()

'Click on Continue'
Mobile.tap(findTestObject('Saving Space/Trip/Trip Transaction/IOS.widget.Button - Continue'), 10)

'Take A screenshot'
Mobile.takeScreenshot()

'Click on Confirm'
Mobile.tap(findTestObject('Saving Space/Trip/Trip Transaction/IOS.widget.Button - Confirm'), 10)

'Take A screenshot'
Mobile.takeScreenshot()

'Verify Transaction has been successfully'
Mobile.verifyElementExist(findTestObject('Saving Space/Trip/Trip Transaction/IOS.widget.TextView - Your transaction has been successfully processed'), 
    0)

'Click on Dashboard'
Mobile.tap(findTestObject('Saving Space/Trip/Trip Transaction/IOS.widget.Button - Goal Dashboard'), 10)

'Take A screenshot'
Mobile.takeScreenshot()

