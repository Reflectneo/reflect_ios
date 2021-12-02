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

'Enter 1 digit'
Mobile.setText(findTestObject('User_Registration/Registration_Screen/MobileVerificationViaOTP/android.widget.EditText'), 
    '5', 0)

'Enter 2 digit'
Mobile.setText(findTestObject('User_Registration/Registration_Screen/MobileVerificationViaOTP/android.widget.EditText (1)'), 
    '5', 0)

'Enter 3 digit'
Mobile.setText(findTestObject('User_Registration/Registration_Screen/MobileVerificationViaOTP/android.widget.EditText (2)'), 
    '5', 0)

'Enter 4 digit'
Mobile.setText(findTestObject('User_Registration/Registration_Screen/MobileVerificationViaOTP/android.widget.EditText (3)'), 
    '5', 0)

'Enter 5 digit'
Mobile.setText(findTestObject('User_Registration/Registration_Screen/MobileVerificationViaOTP/android.widget.EditText (4)'), 
    '5', 0)

'Enter 6 digit'
Mobile.setText(findTestObject('User_Registration/Registration_Screen/MobileVerificationViaOTP/android.widget.EditText (5)'), 
    '6', 0)

'Take ScreenShot'
Mobile.takeScreenshot()

//Mobile.verifyElementExist(findTestObject('User_Registration/Registration_Screen/MobileVerificationViaOTP/android.widget.Button - Verify'),	0)
'Click on Verify Button'
Mobile.tap(findTestObject('Forgot Password/IOS.widget.Button - Verify'), 10)

'5 sec wait'
Mobile.delay(5)

'Verify Invalid OTP'
Mobile.verifyElementExist(findTestObject('Forgot Password/IOS.widget.TextView - The code you entered is not valid'), 
    0)

'Take ScreenShot'
Mobile.takeScreenshot()

'Click on Ok'
Mobile.tap(findTestObject('User_Registration/Registration_Screen/MobileVerificationViaOTP/android.widget.Button - OK'), 
    10)

