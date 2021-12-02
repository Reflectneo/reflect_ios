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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

'Wait'
Mobile.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

'Take A screenshot'
Mobile.takeScreenshot()

'Get Total Balance'
def TotalBalance = Mobile.getText(findTestObject('Top Up/Card Top-up/android.widget.TextView - TotalBalance'), 10)

System.out.print(TotalBalance)

String[] TB = TotalBalance.split(' ')

System.out.print(TB[0])

System.out.print(TB[1])

def TBalance = TB[1].toFloat()

'Click on Card Dashboard'
Mobile.tap(findTestObject('Card Dashboard/IOS.widget.TextView - Total Balance'), 0)

'Click on Top up plus icon'
Mobile.tap(findTestObject('Top Up/Top Up Home/android.widget.Button-Open Top Up'), 0)

'Click on Card Top-up'
Mobile.tap(findTestObject('Top Up/Top Up Home/android.widget.TextView - Debitcredit card Top-up'), 0)

'Take A screenshot'
Mobile.takeScreenshot()

'Enter Top-up amount'
Mobile.setText(findTestObject('Top Up/Card Top-up/android.widget.EditText - Top-up Amount'), '100', 0)

'Click on Next'
Mobile.tap(findTestObject('Top Up/Card Top-up/android.widget.Button - Next'), 0)

'Click On Yes Button'
Mobile.tap(findTestObject('Top Up/Card Top-up/android.widget.Button - Yes For AB'), 10)

'Enter Card Number'
Mobile.setText(findTestObject('Top Up/Card Top-up/android.widget.EditText - Card Number_AB'), GlobalVariable.AB_Card_Number, 
    0)

'Click on Submit'
Mobile.tap(findTestObject('Top Up/Card Top-up/android.widget.Button - Submit'), 0)

'Verify OTP'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Functional/OTP_Verification'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'Verify Top-up Amount'
Mobile.verifyElementExist(findTestObject('Top Up/Card Top-up/android.widget.TextView - JOD 100 top-up'), 10)

'Take A screenshot'
Mobile.takeScreenshot()

'Wait'
Mobile.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

'Click On Done'
Mobile.tap(findTestObject('Top Up/Card Top-up/android.widget.Button - Done'), 10)

'Wait'
Mobile.delay(20, FailureHandling.CONTINUE_ON_FAILURE)

'Take A screenshot'
Mobile.takeScreenshot()

'Click on Transaction History'
Mobile.tap(findTestObject('DashBoard/IOS.widget.TextView - Transactions'), 0)

'Verify Transaction History Descriptions'
Mobile.verifyElementExist(findTestObject('Transaction History/android.widget.TextView - Arab Bank Card top-up'), 10)

'Verify Transaction History Amount'
Mobile.verifyElementExist(findTestObject('Transaction History/android.widget.TextView - 100.000 JOD'), 10)

'Take A screenshot'
Mobile.takeScreenshot()

'Get Final Balance'
def FinalBalance = Mobile.getText(findTestObject('Top Up/Card Top-up/android.widget.TextView - TotalBalance'), 10)

System.out.print(FinalBalance)

String[] FB = FinalBalance.split(' ')

System.out.print(FB[0])

System.out.print(FB[1])

//Float AfterAdding = TBalance + '100'
'Verify Wallet Dashboard'
Mobile.verifyGreaterThan(FB[1], TB[1])

//Mobile.verifyEqual(FB[1], AfterAdding)

'Take A screenshot'
Mobile.takeScreenshot()

