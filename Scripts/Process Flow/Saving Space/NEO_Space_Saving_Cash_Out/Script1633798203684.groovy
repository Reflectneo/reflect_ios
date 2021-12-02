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

'Click on Completed Goal'
Mobile.tap(findTestObject('Saving Space/Trip/Trip Transaction/IOS.widget.TextView - Space Completed'), 0)

'Verify Goal Completed Successfully'
Mobile.verifyElementExist(findTestObject('Saving Space/Trip/CashOut/IOS.widget.Button - COMPLETED'), 0)

'Take A screenshot'
Mobile.takeScreenshot()

'Take A screenshot'
Mobile.takeScreenshot()

'Click on Cash Out'
Mobile.tap(findTestObject('Saving Space/Trip/CashOut/IOS.widget.Button - Cash out'), 0)

'Take A screenshot'
Mobile.takeScreenshot()

'Click on Transfer Wallet'
Mobile.tap(findTestObject('Saving Space/Trip/CashOut/IOS.widget.Button - Transfer to wallet'), 0)

'Take A screenshot'
Mobile.takeScreenshot()

'Click on Transfer Wallet'
Mobile.tap(findTestObject('Saving Space/Trip/CashOut/IOS.widget.Button - Transfer to wallet (1)'), 0)

'Take A screenshot'
Mobile.takeScreenshot()

'Verify Congratulation'
Mobile.verifyElementExist(findTestObject('Saving Space/Trip/CashOut/IOS.widget.TextView - Congratulations'), 0)

'Verify Amount Transferred into Wallet'
Mobile.verifyElementExist(findTestObject('Saving Space/Trip/CashOut/IOS.widget.TextView - Amount transferred into wallet'), 
    0)

'Click on Home'
Mobile.tap(findTestObject('Saving Space/Trip/CashOut/IOS.widget.Button - Home'), 0)

'Take A screenshot'
Mobile.takeScreenshot()

