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

'Enter date When are you traveling'
Mobile.tap(findTestObject('Saving Space/Trip/Setup your saving space/IOS.widget.ImageButton'), 0)

Mobile.longPress(findTestObject('Saving Space/Trip/Setup your saving space/IOS.widget.EditText - 2021'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Saving Space/Trip/Setup your saving space/IOS.widget.EditText - 2021'), '2024', 0)

Mobile.longPress(findTestObject('Saving Space/Trip/Setup your saving space/IOS.widget.EditText - Sep'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

//Mobile.hideKeyboard()
Mobile.tap(findTestObject('User_Registration/Registration_Screen/MyInformation/android.widget.Button - Continue'), 0)

Mobile.setText(findTestObject('Saving Space/Trip/Setup your saving space/IOS.widget.EditText - 0'), '100', 0)

'Click on Next'
Mobile.tap(findTestObject('Saving Space/Trip/Setup your saving space/IOS.widget.Button - Next'), 10)

'5 sec wait'
Mobile.delay(5)

Mobile.takeScreenshot()

'Verify The goal cannot exceed 24 months'
Mobile.verifyElementExist(findTestObject('Saving Space/Trip/Setup your saving space/IOS.widget.TextView - The goal cannot exceed 24 months'), 
    0)

'Take A screenshot'
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Saving Space/Trip/Setup your saving space/IOS.widget.Button - OK'), 10)

