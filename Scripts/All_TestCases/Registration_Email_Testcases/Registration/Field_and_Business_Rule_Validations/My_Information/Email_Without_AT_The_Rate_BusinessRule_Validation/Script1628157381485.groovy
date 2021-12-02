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

Mobile.setText(findTestObject('User_Registration/Registration_Screen/MyInformation/android.widget.EditText - Email'), 'Test@test', 
    0)

//Mobile.swipe(400, 600, 0, 0)

Mobile.tap(findTestObject('User_Registration/Registration_Screen/MyInformation/android.widget.Button - Signup'), 60)

'Verify  Error message "Email is invalid".'
Mobile.delay(2)

'Take a ScreenShot'
CustomKeywords.'com.arabbank.toastmessage.InvalidMessage.takeScreenShot'(GlobalVariable.Path, GlobalVariable.Name)

'Convert OCR to Text'
CustomKeywords.'com.arabbank.toastmessage.InvalidMessage.runBatchFile'(GlobalVariable.batchFile)

'5 sec wait'
Mobile.delay(5)

'Verify  Error message "Enter an e-mail in the following format: example@email.com'
CustomKeywords.'com.arabbank.toastmessage.InvalidMessage.ValidationMessage'('Enter an e-mail in the following format: example@email.com', GlobalVariable.OutputFile)

Mobile.takeScreenshot()


Mobile.delay(2)


