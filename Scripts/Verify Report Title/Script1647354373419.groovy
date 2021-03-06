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

WebUI.openBrowser('https://app.powerbi.com/groups/7b4737be-1aed-4acc-9954-40569989ca94/reports/8917e9f0-7af8-49d1-9053-5feaf089889d/ReportSection')

WebUI.waitForElementVisible(findTestObject('Email'), 20)

WebUI.setText(findTestObject('Email'), GlobalVariable.email)

WebUI.click(findTestObject('button_Submit'))

WebUI.setText(findTestObject('password'), 'Tek&asp2022')

WebUI.click(findTestObject('sign-in button'))

WebUI.click(findTestObject('sign-in button'))

WebUI.verifyElementText(findTestObject('Report Title'), headerTitle)

WebUI.closeBrowser()

WebUI.openBrowser('https://app.powerbi.com/groups/7b4737be-1aed-4acc-9954-40569989ca94/reports/05bebd26-4d8f-46d1-ae99-79dcacd121f6/ReportSection')

WebUI.waitForElementVisible(findTestObject('Email'), 20)

WebUI.setText(findTestObject('Email'), GlobalVariable.email)

WebUI.click(findTestObject('button_Submit'))

WebUI.setText(findTestObject('password'), 'Tek&asp2022')

WebUI.click(findTestObject('sign-in button'))

WebUI.click(findTestObject('sign-in button'))

WebUI.verifyElementText(findTestObject('Report Title'), headerTitle)

WebUI.closeBrowser()

