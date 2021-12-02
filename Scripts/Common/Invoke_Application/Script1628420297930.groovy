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

//if (GlobalVariable.Environment == 'BS')
//{'Invoke App using Browser stack'
//Mobile.startApplication('bs://c4cd838ba343a8883ebae8b15c063f4344fa4659', true)
//Mobile.tap(findTestObject('AfterInvokeApplication/IOS.widget.Button - English'), 0)
//Mobile.tap(findTestObject('AfterInvokeApplication/IOS.widget.Button - Skip'), 1)
//}
//else
//{
//Mobile.startApplication(GlobalVariable.G_AndroidApp, true)
'Start The application'
Mobile.startApplication(GlobalVariable.G_AndroidApp, true)
//Mobile.startApplication('bs://0835dcc369745a6ff390b5d83ce07eaccf1ed1dc', true)

'Wait'
Mobile.delay(5)

'Take ScreenShot'
Mobile.takeScreenshot()

'Navigate to signup-page'
if (Mobile.verifyElementVisible(findTestObject('AfterInvokeApplication/IOS.widget.Button - English'), 10) == true) {
    Mobile.tap(findTestObject('AfterInvokeApplication/IOS.widget.Button - English'), 0)

    Mobile.tap(findTestObject('AfterInvokeApplication/IOS.widget.Button - Skip'), 5)
}

