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

WebUI.callTestCase(findTestCase('All_TestCases/Open_Wallet_Testcases/Open Wallet/Functional/OpenWallet_HomePage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('All_TestCases/Open_Wallet_Testcases/Open Wallet/Functional/Start_Fresh'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('All_TestCases/Open_Wallet_Testcases/Open Wallet/Functional/FrontSide_Scan_Upload'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('All_TestCases/Open_Wallet_Testcases/Open Wallet/Functional/BackSide_Scan_Upload'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('All_TestCases/Open_Wallet_Testcases/Open Wallet/Functional/Document_Verification'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('All_TestCases/Open_Wallet_Testcases/Open Wallet/Functional/FATCA_PEP'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('All_TestCases/Open_Wallet_Testcases/Open Wallet/Functional/Address_Page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('All_TestCases/Open_Wallet_Testcases/Open Wallet/Functional/Waiting_Return_TO_HomePage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('All_TestCases/Open_Wallet_Testcases/Open Wallet/Functional/CardVerification'), [:], FailureHandling.STOP_ON_FAILURE)

