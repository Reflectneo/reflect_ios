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

'Get IBAN Number'
def GetIBAN = Mobile.getText(findTestObject('Top Up/IBAN Top-up/android.widget.TextView -GetIBAN'), 10)

'Verify IBAN Number'
Mobile.verifyEqual(GetIBAN, GlobalVariable.IBAN_TopUp_IBAN_No)

'Get Full Name'
def GetName = Mobile.getText(findTestObject('Top Up/IBAN Top-up/android.widget.TextView - GetName'), 10)

'Verify Name'
Mobile.verifyEqual(GetName, GlobalVariable.IBAN_TopUp_Bank)

'Get Swift code'
def GetSwiftCode = Mobile.getText(findTestObject('Top Up/IBAN Top-up/android.widget.TextView - GetSwiftcode'), 10)

'Verify Swift Code'
Mobile.verifyEqual(GetSwiftCode, GlobalVariable.IBAN_TopUp_Swift)

'Take A screenshot'
Mobile.takeScreenshot()

