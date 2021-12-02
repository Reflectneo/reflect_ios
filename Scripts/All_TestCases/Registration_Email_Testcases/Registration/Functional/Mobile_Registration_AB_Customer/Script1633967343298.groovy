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

def RN = ((Math.random() * 164732898) as int)

println("'$RN'")

Mobile.setText(findTestObject('User_Registration/Registration_Screen/MobileNumberForRegistration/android.widget.EditText - Mobile Number'), 
    GlobalVariable.ABMobileNumber, 0)

Mobile.checkElement(findTestObject('User_Registration/Registration_Screen/MobileNumberForRegistration/android.widget.CheckBox'), 
    0)

Mobile.tap(findTestObject('User_Registration/Registration_Screen/MobileNumberForRegistration/android.widget.EditText - Mobile Number'), 
    0)

Mobile.delay(2)

Mobile.tap(findTestObject('User_Registration/Registration_Screen/MobileNumberForRegistration/android.widget.Button'), 0)

Mobile.takeScreenshot()

Mobile.delay(5)

