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
import com.kms.katalon.core.annotation.Keyword as Keyword

'Enter First Name'
Mobile.setText(findTestObject('User_Registration/Registration_Screen/MyInformation/android.widget.EditText - First Name'), 
    'Jack', 0)

'Enter Last Name'
Mobile.setText(findTestObject('User_Registration/Registration_Screen/MyInformation/android.widget.EditText - Last Name'), 
    'Daniel', 0)

'Click on Gender'
Mobile.tap(findTestObject('User_Registration/Registration_Screen/MyInformation/android.widget.EditText - Gender'), 0)

'Select Gender as a Male'
Mobile.selectListItemByLabel(findTestObject('User_Registration/Registration_Screen/MyInformation/android.widget.CheckedTextView - Male'), 
    'Male', 1)

//Mobile.tap(findTestObject('User_Registration/Registration_Screen/MyInformation/android.widget.EditText - When is your birthday'), 5)
'Click on Date'
Mobile.tap(findTestObject('User_Registration/Registration_Screen/MyInformation/android.widget.ImageButton'), 0)

'Click on Year'
Mobile.longPress(findTestObject('User_Registration/Registration_Screen/MyInformation/android.widget.EditText - 2021'), 1993, 
    FailureHandling.STOP_ON_FAILURE)

'Enter Year'
Mobile.setText(findTestObject('User_Registration/Registration_Screen/MyInformation/android.widget.EditText - 2021'), '1993', 
    0)

'Click on Month'
Mobile.longPress(findTestObject('User_Registration/Registration_Screen/MyInformation/android.widget.EditText - Aug'), 0)

'Hide Keyboard'
Mobile.hideKeyboard()

'Wait'
Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

'Click on Continue Button'
Mobile.tap(findTestObject('User_Registration/Registration_Screen/MyInformation/android.widget.Button - Continue'), 0)

//Mobile.setText(findTestObject('User_Registration/Registration_Screen/MyInformation/android.widget.EditText - 2021'), '1993', 0)
//Mobile.tap(findTestObject('User_Registration/Registration_Screen/MyInformation/android.widget.Button'), 0)
//def RN = ((Math.random() * 16473289) as int)
//println("'$RN'")
'Generate Random Email ID'
String mail = CustomKeywords.'com.arabbank.RandomEmail.RandomEmail.getEmail'('NikhilY', 'Gmail.com')

'Enter Email ID'
Mobile.setText(findTestObject('User_Registration/Registration_Screen/MyInformation/android.widget.EditText - Email'), mail, 
    0)

'Enter Password'
Mobile.setText(findTestObject('User_Registration/Registration_Screen/MyInformation/android.widget.EditText - Password'), 
    'Aa@123456', 0)

'Enter Confirm Password'
Mobile.setText(findTestObject('User_Registration/Registration_Screen/MyInformation/android.widget.EditText - Confirm Password'), 
    'Aa@123456', 1)

'Swipe Down Till Signup button'
Mobile.swipe(400, 600, 0, 0)

'Click on Signup Button'
Mobile.tap(findTestObject('User_Registration/Registration_Screen/MyInformation/android.widget.Button - Signup'), 60)

'Wait'
Mobile.delay(30, FailureHandling.STOP_ON_FAILURE)

'Take Screenshot'
Mobile.takeScreenshot()

