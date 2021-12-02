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

'Wait'
Mobile.delay(20)

//Mobile.tap(findTestObject('User_Registration/Registration_Screen/Interested_Screen/android.widget.TextView - Beauty_Health'),     0)
//Mobile.tap(findTestObject('User_Registration/Registration_Screen/Interested_Screen/android.widget.TextView - Toys'), 0)
//Mobile.tap(findTestObject('User_Registration/Registration_Screen/Interested_Screen/android.widget.TextView - Sweets'), 0)
///Mobile.tap(findTestObject('User_Registration/Registration_Screen/Interested_Screen/android.widget.TextView - Electronics'),     0)
'Swipe'
Mobile.swipe(300, 500, 0, 0)

//Mobile.tap(findTestObject('User_Registration/Registration_Screen/Interested_Screen/android.widget.TextView - Sports'), 0)
'Click on Travel'
Mobile.tap(findTestObject('User_Registration/Registration_Screen/Interested_Screen/android.widget.TextView - Travel'), 0)

'Wait'
Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

'Click on Submit'
Mobile.tap(findTestObject('User_Registration/Registration_Screen/Interested_Screen/android.widget.Button - Submit'), 0)

'Wait'
Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

'Take ScreenShot '
Mobile.takeScreenshot()

