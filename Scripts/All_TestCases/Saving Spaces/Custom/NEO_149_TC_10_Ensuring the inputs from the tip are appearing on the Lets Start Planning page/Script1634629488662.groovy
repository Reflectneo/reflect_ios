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

WebUI.callTestCase(findTestCase('Common/Swipe_Saving Space'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'Click on Saving Space'
Mobile.tap(findTestObject('Saving Space/Saving Dashboard/IOS.widget.Button-Plus Icon'), 0)

'Click on Custom'
Mobile.tap(findTestObject('Saving Space/Custom/IOS.widget.TextView - Custom Space'), 0)

'Enter What Car are you saving for'
Mobile.setText(findTestObject('Saving Space/Custom/IOS.widget.EditText - What do you want to name this space'), 'Study', 
    0)

'Enter When do you want to purchase the car'
Mobile.tap(findTestObject('Saving Space/Custom/IOS.widget.EditText - When do you want to reach this goal'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.longPress(findTestObject('Saving Space/Trip/Setup your saving space/IOS.widget.EditText - 2021'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Saving Space/Trip/Setup your saving space/IOS.widget.EditText - 2021'), '2022', 0)

Mobile.longPress(findTestObject('Saving Space/Trip/Setup your saving space/IOS.widget.EditText - Sep'), 0)

//Mobile.hideKeyboard()
Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('User_Registration/Registration_Screen/MyInformation/android.widget.Button - Continue'), 0)

'Enter Amount'
Mobile.setText(findTestObject('Saving Space/Trip/Setup your saving space/IOS.widget.EditText - 0'), '1000', 0)

'Take A screenshot'
Mobile.takeScreenshot()

'Click on next button'
Mobile.tap(findTestObject('Saving Space/Trip/Setup your saving space/IOS.widget.Button - Next'), 10)

'Take A screenshot'
Mobile.takeScreenshot()

'Verify calculation should always be based on daily.'
Mobile.verifyElementExist(findTestObject('Saving Space/Custom/IOS.widget.TextView - If you start 77 JOD per Month you can reach your goal'), 
    10)

'Take A screenshot'
Mobile.takeScreenshot()

'Click on Continue button'
Mobile.tap(findTestObject('Saving Space/Trip/Suggestion pop-up/IOS.widget.Button - Continue'), 10)

'Take A screenshot'
Mobile.takeScreenshot()

