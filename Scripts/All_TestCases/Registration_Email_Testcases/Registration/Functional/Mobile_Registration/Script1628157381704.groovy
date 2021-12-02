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

'Generate Random Mobile Number'
def RN = ((Math.random() * 164732898) as int)

'Print Mobile Number'
println("'$RN'")

'Enter Mobile Number'
Mobile.setText(findTestObject('User_Registration/Registration_Screen/MobileNumberForRegistration/android.widget.EditText - Mobile Number'), 
    ('79' + RN) + '', 0)

'Check on Term and Conditions'
Mobile.checkElement(findTestObject('User_Registration/Registration_Screen/MobileNumberForRegistration/android.widget.CheckBox'), 
    0)

'Click on Mobile number'
Mobile.tap(findTestObject('User_Registration/Registration_Screen/MobileNumberForRegistration/android.widget.EditText - Mobile Number'), 
    0)

'Wait'
Mobile.delay(2)

'Click on Submit Button'
Mobile.tap(findTestObject('User_Registration/Registration_Screen/MobileNumberForRegistration/android.widget.Button'), 0)

'Take ScreenShot'
Mobile.takeScreenshot()

'Wait'
Mobile.delay(5)

