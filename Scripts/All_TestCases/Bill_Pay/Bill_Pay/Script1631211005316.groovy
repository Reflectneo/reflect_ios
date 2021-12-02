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

Mobile.tap(findTestObject('null'), 0)

Mobile.tap(findTestObject('Bill_Pay/IOS.widget.Button - Pay bill'), 0)

Mobile.setText(findTestObject('Bill_Pay/IOS.widget.EditText - Search'), 'madfooat3', 0)

Mobile.tap(findTestObject('Bill_Pay/IOS.widget.TextView - Madfooat3'), 0)

Mobile.tap(findTestObject('Bill_Pay/IOS.widget.EditText - Services'), 0)

Mobile.tap(findTestObject('Bill_Pay/IOS.widget.CheckedTextView - Electricity'), 0)

Mobile.setText(findTestObject('Bill_Pay/IOS.widget.EditText - Electricity, Electricity'), '21', 0)

Mobile.tap(findTestObject('Bill_Pay/IOS.widget.Button - Inquire'), 0)

Mobile.setText(findTestObject('Bill_Pay/IOS.widget.EditText - 81.0'), '18', 0)

WebUI.callTestCase(findTestCase('All_TestCases/Card_TestCases/Card_DashBoard/NEO_399_TC_01_Validate Virtual Card'), [:], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('All_TestCases/Card_TestCases/Card_DashBoard/NEO_399_TC_02_Validate masked Card'), [:], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('All_TestCases/Card_TestCases/Card_DashBoard/NEO_399_TC_03_Validate last 4 digits'), [:], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('All_TestCases/Card_TestCases/Card_DashBoard/NEO_399_TC_04_Validate Full Name'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('All_TestCases/Card_TestCases/Card_DashBoard/NEO_399_TC_05_Validate full details of their virutal card'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('All_TestCases/Card_TestCases/Card_DashBoard/NEO_399_TC_10_Validate Fields visbile after biometirc authentication'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('All_TestCases/Card_TestCases/Card_DashBoard/NEO_399_TC_11_Validate Full card number'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('All_TestCases/Card_TestCases/Card_DashBoard/NEO_399_TC_12_Validate Expiration date'), [:], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('All_TestCases/Card_TestCases/Card_DashBoard/NEO_399_TC_13_Validate CVV code'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('All_TestCases/Card_TestCases/Card_DashBoard/NEO_399_TC_14_Settings button on virtual card'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('All_TestCases/Card_TestCases/Card_DashBoard/NEO_399_TC_15_Freeze button on virtual card'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('All_TestCases/Card_TestCases/Card_DashBoard/NEO_399_TC_16_Validate if user click on Cancel for Freeze your card'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('All_TestCases/Card_TestCases/Card_DashBoard/NEO_399_TC_17_Validate if user click on Yes for Freeze your card'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('All_TestCases/Card_TestCases/Card_DashBoard/NEO_399_TC_18_Defrost button on frozen card'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('All_TestCases/Card_TestCases/Card_DashBoard/NEO_399_TC_19_Validate Confirmation Pop-up appear for issue new card'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('All_TestCases/Card_TestCases/Card_DashBoard/NEO_399_TC_20_Validate the meassage Are you going to cancel the card and Reissue new one'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Bill_Pay/IOS.widget.Button - Pay'), 0)

Mobile.closeApplication()

