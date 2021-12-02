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

'Click on National Expiry Date'
Mobile.tap(findTestObject('Forgot Password/IOS.widget.EditText - When does your National ID expire'), 10)

'Take ScreenShot'
Mobile.takeScreenshot()

'Click on Continue'
Mobile.tap(findTestObject('Forgot Password/IOS.widget.Button - Date Continue'), 10)

'Clear Documents ID'
Mobile.clearText(findTestObject('Forgot Password/IOS.widget.EditText - Input the document number on your national ID'), 
    0)

'Take ScreenShot'
Mobile.takeScreenshot()

'Click on Continue'
Mobile.tap(findTestObject('Forgot Password/IOS.widget.Button - Continue'), 10)

'Take ScreenShot'
Mobile.takeScreenshot()

'Verify Documents ID Required'
Mobile.verifyElementExist(findTestObject('Forgot Password/IOS.widget.TextView - Please Answer this question'), 0)

'Take ScreenShot'
Mobile.takeScreenshot()

