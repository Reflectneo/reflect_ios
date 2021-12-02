package com.arabbank.toastmessage

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable
import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import net.sourceforge.tess4j.ITesseract
import net.sourceforge.tess4j.Tesseract
import net.sourceforge.tess4j.TesseractException
import net.sourceforge.tess4j.util.LoadLibs
import java.io.File
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.Date

import org.apache.commons.io.FilenameUtils
import org.openqa.selenium.OutputType
import org.openqa.selenium.TakesScreenshot
import io.appium.java_client.android.AndroidDriver
import com.kms.katalon.core.configuration.RunConfiguration
import org.apache.commons.io.FileUtils



public class InvalidMessage {

	@Keyword
	public static takeScreenShot(String Path, String Name){

		String fullPath = Path + Name  + ".png"
		println Mobile.takeScreenshot(fullPath);
		return fullPath
	}

	@Keyword

	static void runBatchFile(String batchFile) {
		String bf = RunConfiguration.getProjectDir() + '/' + batchFile
		//comment("Running batch file: " + bf)
		Runtime.runtime.exec(bf)
	}


	@Keyword

	public static ValidationMessage(String ErrorMessage, String OutputPath) {


		File file = new File(OutputPath)

		String ActualData = FileUtils.readFileToString(file)

		println(ActualData)

		if(!ActualData.contains(ErrorMessage)) {
			KeywordUtil.markFailed("Message does not contain expected Error.")
		}
	}
}

