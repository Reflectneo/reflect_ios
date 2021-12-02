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

Mobile.setText(findTestObject('User_Registration/Registration_Screen/MyInformation/android.widget.EditText - Password'), 
    'test12342', 0)

//Mobile.swipe(400, 600, 0, 0)

Mobile.tap(findTestObject('User_Registration/Registration_Screen/MyInformation/android.widget.Button - Signup'), 60)

'Verify  Error message "Then Password should inlcude at least one number and special character and both uppercase and lowercase letters".'
Mobile.delay(2)

'Take a ScreenShot'
CustomKeywords.'com.arabbank.toastmessage.InvalidMessage.takeScreenShot'(GlobalVariable.Path, GlobalVariable.Name)

'Convert OCR to Text'
CustomKeywords.'com.arabbank.toastmessage.InvalidMessage.runBatchFile'(GlobalVariable.batchFile)

'5 sec wait'
Mobile.delay(5)

'Verify  Password should include at least one number and special character Password should include both uppercase and lowercase letters'
CustomKeywords.'com.arabbank.toastmessage.InvalidMessage.ValidationMessage'('uppercase and lowercase letters', GlobalVariable.OutputFile)

Mobile.takeScreenshot()


Mobile.delay(2)


Mobile.setText(findTestObject('User_Registration/Registration_Screen/MyInformation/android.widget.EditText - Password'),
	'Test@123456', 0)