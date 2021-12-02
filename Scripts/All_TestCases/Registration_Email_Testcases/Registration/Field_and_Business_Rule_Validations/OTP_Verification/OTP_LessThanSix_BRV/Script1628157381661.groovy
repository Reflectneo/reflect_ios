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

'Enter 1 Digit'
Mobile.setText(findTestObject('User_Registration/Registration_Screen/MobileVerificationViaOTP/android.widget.EditText'), 
    '6', 0)

'Enter 2 Digit'
Mobile.setText(findTestObject('User_Registration/Registration_Screen/MobileVerificationViaOTP/android.widget.EditText (1)'), 
    '6', 0)

'Enter 3 Digit'
Mobile.setText(findTestObject('User_Registration/Registration_Screen/MobileVerificationViaOTP/android.widget.EditText (2)'), 
    '6', 0)

'Verify Mobile is less than 6 digit'
Mobile.verifyElementExist(findTestObject('User_Registration/Registration_Screen/MobileVerificationViaOTP/android.widget.Button - Verify_Disabled'), 
    0)

'Take ScreenShot'
Mobile.takeScreenshot()

