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

'Clear 1 digit'
Mobile.clearText(findTestObject('User_Registration/Registration_Screen/MobileVerificationViaOTP/android.widget.EditText'), 
    0)

'Clear 2 digit'
Mobile.clearText(findTestObject('User_Registration/Registration_Screen/MobileVerificationViaOTP/android.widget.EditText (1)'), 
    0)

'Clear 3 digit'
Mobile.clearText(findTestObject('User_Registration/Registration_Screen/MobileVerificationViaOTP/android.widget.EditText (2)'), 
    0)

'Clear 4 digit'
Mobile.clearText(findTestObject('User_Registration/Registration_Screen/MobileVerificationViaOTP/android.widget.EditText (3)'), 
    0)

'Clear 5 digit'
Mobile.clearText(findTestObject('User_Registration/Registration_Screen/MobileVerificationViaOTP/android.widget.EditText (4)'), 
    0)

'Clear 6 digit'
Mobile.clearText(findTestObject('User_Registration/Registration_Screen/MobileVerificationViaOTP/android.widget.EditText (5)'), 
    0)

'Verify OTP is required'
Mobile.verifyElementExist(findTestObject('Forgot Password/IOS.widget.Button - Verify_Diabled'), 0)

'Take ScreenShot'
Mobile.takeScreenshot()

