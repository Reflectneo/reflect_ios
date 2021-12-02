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

WebUI.callTestCase(findTestCase('Common/Invoke_Application'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_73_TC_01_Validate User should be redirected to My Email Page'
Mobile.tap(findTestObject('User_Registration/Registration_Option/android.widget.Button - Continue With Email'), 10)

'NEO_73_TC_02_Term and Conditions_FieldValidation'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Field_and_Business_Rule_Validations/Mobile_Registration/Term_and_Condition_Field_Validation'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_73_TC_03_Verify Terms & Conditions Field is required'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Field_and_Business_Rule_Validations/Mobile_Registration/Term_and_Conditions_Required_Business_Rule_Validation'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_73_TC_04_Verify Field Should not have a default value'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Field_and_Business_Rule_Validations/Mobile_Registration/Term_and_Conditions_UnCheck_DefaultValue_Business_Rule_Validation'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_73_TC_05_Validate the Terms & Conditions Link Should be open'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Field_and_Business_Rule_Validations/Mobile_Registration/Term_and_Conditions_PDF_Business_Rule_Validation'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_73_TC_06_CountryCode_FieldValidation'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Field_and_Business_Rule_Validations/Mobile_Registration/CountryCode_Field_Validation'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_73_TC_07_Phone Number_FieldValidation'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Field_and_Business_Rule_Validations/Mobile_Registration/Mobile_Number_Field_Validation'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_73_TC_08_Verify phone Number Field is required'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Field_and_Business_Rule_Validations/Mobile_Registration/MobileNumber_Required_BusinessRule_Validation'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_73_TC_09_Verify Enter less than 9 digit phone Number'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Field_and_Business_Rule_Validations/Mobile_Registration/MobileNumber_LessThanNine_BRV'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_73_TC_10_Verify Enter More than 9 digit phone Number'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Field_and_Business_Rule_Validations/Mobile_Registration/MobileNumber_GreaterThanNine_BRV'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_73_TC_11_Verify Unable to enter Special Character'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Field_and_Business_Rule_Validations/Mobile_Registration/MobileNumber_SpecialCharacter_BRV'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_73_TC_12_Verify Enter Field value start with other than 77,78 or 79 phone Number'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Field_and_Business_Rule_Validations/Mobile_Registration/MobileNumber_WithOut78_77_79_BRV'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_73_TC_14_Validate successful OTP Sent to Registered Mobile Number'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Functional/Mobile_Registration'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_73_TC_15_Phone Number_FieldValidation'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Field_and_Business_Rule_Validations/OTP_Verification/OTP_Field_Validation'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_73_TC_16_Verify OTP is required'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Field_and_Business_Rule_Validations/OTP_Verification/OTP_Required_BusinessRule_Validation'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_73_TC_17_Verify Enter less than 6 digit OTP'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Field_and_Business_Rule_Validations/OTP_Verification/OTP_LessThanSix_BRV'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_73_TC_18_Verify Invalid OTP Number'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Field_and_Business_Rule_Validations/OTP_Verification/OTP_Invalid_BusinessRuleValidation'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_73_TC_19_Validate Received OTP'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Functional/OTP_Verification'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_73_TC_20_First Name_FieldValidation'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Field_and_Business_Rule_Validations/My_Information/First_Name_Field_Validations'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_73_TC_21_Verify First Name Field is required'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Field_and_Business_Rule_Validations/My_Information/First_Name_Required_BusinessRule_Validation'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_73_TC_22_Verify Enter less than 2 digit FirstName'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Field_and_Business_Rule_Validations/My_Information/First_Name_LessThan2Digit_BusinessRule_Validation'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_73_TC_23_Verify  Unable to accept Special Character'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Field_and_Business_Rule_Validations/My_Information/First_Name_Special _Character_BusinessRule_Validation'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_73_TC_24_Verify Enter More than 15 digit First name'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Field_and_Business_Rule_Validations/My_Information/First_Name_MoreThan15_Character_Business_Rule_Validations'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_73_TC_25_Verify automatically changed to “Capital letter”.'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Field_and_Business_Rule_Validations/My_Information/First_Name_CapitalLetter_Validations'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_73_TC_26_LastName_FieldValidation'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Field_and_Business_Rule_Validations/My_Information/Last_Name_Field_Validation'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_73_TC_27_Verify Last Name Field is required'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Field_and_Business_Rule_Validations/My_Information/Last_Name_Required_BusinessRule_Validation'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_73_TC_28_Verify Enter less than 2 digit Last Name'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Field_and_Business_Rule_Validations/My_Information/Last_Name_LessThan2Digit_BusinessRule_Validation'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_73_TC_29_Verify  Unable to accept Special Character'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Field_and_Business_Rule_Validations/My_Information/Last_Name_Special _Character_BusinessRule_Validation'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_73_TC_30_Verify Enter More than 15 digit Last  name'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Field_and_Business_Rule_Validations/My_Information/Last_Name_MoreThan15_Character_Business_Rule_Validations'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_73_TC_31_Verify automatically changed to “Capital letter”.'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Field_and_Business_Rule_Validations/My_Information/Last_Name_CapitalLetter_Validations'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_73_TC_32_Gender_FieldValidation'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Field_and_Business_Rule_Validations/My_Information/Gender_Field_Validation'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_73_TC_33_Verify Gender Field is required'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Field_and_Business_Rule_Validations/My_Information/Gender_Required_BusinessRule_Validation'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_73_TC_34_Date of Birth_FieldValidation'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Field_and_Business_Rule_Validations/My_Information/Date_of_Birth_Field_Validation'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_73_TC_35_Verify Date of Bith Field is required'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Field_and_Business_Rule_Validations/My_Information/Date of Birth_Required_BusinessRule_Validation'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_73_TC_36_TC_37_Verify Date of Birth_LessThan18_Years'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Field_and_Business_Rule_Validations/My_Information/Date of Birth_LessThan18_Years_Business_Rule_Validations'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_73_TC_39_Email_FieldValidation'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Field_and_Business_Rule_Validations/My_Information/Email_Field_Validations'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_73_TC_40_Verify EmailField is required'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Field_and_Business_Rule_Validations/My_Information/Email_Required_BusinessRule_Validation'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_73_TC_41_Verify Email ID without At the rate'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Field_and_Business_Rule_Validations/My_Information/Email_Without_AT_The_Rate_BusinessRule_Validation'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_73_TC_42_Verify Email ID without Dot'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Field_and_Business_Rule_Validations/My_Information/Email_Without_Dot_BusinessRule_Validation'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_73_TC_43_Verify Enter More than 30 Character First name'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Field_and_Business_Rule_Validations/My_Information/Email_MoreThan30_Character_Business_Rule_Validations'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_73_TC_44_Password_FieldValidation'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Field_and_Business_Rule_Validations/My_Information/Password_Field_Validations'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_73_TC_45_Verify Password  is required'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Field_and_Business_Rule_Validations/My_Information/Password_Required_BusinessRule_Validation'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_73_TC_46_Verify Password Less than 8 Characters'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Field_and_Business_Rule_Validations/My_Information/Password_LessThan8Digit_BusinessRule_Validation'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_73_TC_47_Verify Password More than 20 Characters'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Field_and_Business_Rule_Validations/My_Information/Password_MoreThan20_Character_Business_Rule_Validations'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_73_TC_48_Verify Password Without Special Characters'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Field_and_Business_Rule_Validations/My_Information/Password_Without_Special_Character_BusinessRule_Validation'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_73_TC_49_Verify Password Without uppercase'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Field_and_Business_Rule_Validations/My_Information/Password_Without_Upper_Case_BusinessRule_Validation'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_73_TC_50_Verify Confirm Password  is required'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Field_and_Business_Rule_Validations/My_Information/ConfirmPassword_Field_Validations'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_73_TC_51_Verify Confirm Password  is required'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Field_and_Business_Rule_Validations/My_Information/ConfirmPassword_Required_BusinessRule_Validation'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_73_TC_52_Verify Confirm Password Less than 8 Characters'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Field_and_Business_Rule_Validations/My_Information/ConfirmPassword_LessThan8Digit_BusinessRule_Validation'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_73_TC_53_Verify Confrim Password With Wrong Value'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Field_and_Business_Rule_Validations/My_Information/ConfirmPassword_WrongValue_BusinessRule_Validation'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_73_TC_54_Verify Confirm Password More than 20 Characters'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Field_and_Business_Rule_Validations/My_Information/ConfirmPassword_MoreThan20_Character_Business_Rule_Validations'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Functional/Skip_Screen'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_73_TC_55_Password_FieldValidation'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Field_and_Business_Rule_Validations/InvitationCode/Code_Field_Validations'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_73_TC_56_Verify Code is required'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Field_and_Business_Rule_Validations/InvitationCode/Code_Required_BusinessRule_Validation'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_73_TC_57_Verify Field Length is equal to 15'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Field_and_Business_Rule_Validations/InvitationCode/Code_LessThan15Digit_BusinessRule_Validation'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Functional/Skip_Screen'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Functional/Interested_Screen'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'NEO_73_TC_60_Validate  successfully  User should be Sign-up to Email'
WebUI.callTestCase(findTestCase('All_TestCases/Open_Wallet_Testcases/Open Wallet/Functional/OpenWallet_LandingPage'), [:], FailureHandling.CONTINUE_ON_FAILURE)

