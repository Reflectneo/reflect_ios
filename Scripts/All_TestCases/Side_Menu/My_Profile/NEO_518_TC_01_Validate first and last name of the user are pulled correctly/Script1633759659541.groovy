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

'Click on Side Panel'
Mobile.tap(findTestObject('Side Menu/PIN Setting/android.widget.Button'), 0)

'Click on Profile'
Mobile.tap(findTestObject('Side Menu/MyProfile/android.widget.CheckedTextView - Profile'), 0)

'Click on Edit'
Mobile.tap(findTestObject('Side Menu/MyProfile/android.widget.TextView - Edit'), 0)

def FirstName = Mobile.getText(findTestObject('Side Menu/MyProfile/android.widget.EditText - FirstName'), 10)

'Verify First Name'
Mobile.verifyEqual(FirstName, 'Jack')

def LastName = Mobile.getText(findTestObject('Side Menu/MyProfile/android.widget.EditText - LastName'), 10)

'Verify Last Name'
Mobile.verifyEqual(LastName, 'Daniel')

'Take A screenshot'
Mobile.takeScreenshot()

