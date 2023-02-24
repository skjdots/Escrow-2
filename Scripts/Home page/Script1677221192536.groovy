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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://zapital.24livehost.com/login')

WebUI.setText(findTestObject('Object Repository/Page_Zapitel  Sign In/input_Email Or Username_username'), 'vikas')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Zapitel  Sign In/input_Password_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Page_Zapitel  Sign In/button_Sign In'))

WebUI.mouseOver(findTestObject('Object Repository/Page_Zapitel  Dashboard/a_Escrow'))

WebUI.click(findTestObject('Object Repository/Page_Zapitel  Dashboard/a_Make Escrow'))

WebUI.setText(findTestObject('Object Repository/Page_Zapitel  Make Escrow/input_Seller_title'), 'Katalon')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Zapitel  Make Escrow/select_Choose Industry                     _281d57'), 
    '4', true)

WebUI.click(findTestObject('Object Repository/Page_Zapitel  Make Escrow/button_Next'))

WebUI.setText(findTestObject('Object Repository/Page_Zapitel  Make Escrow/input_Deal Amount_amount'), '1000')

WebUI.click(findTestObject('Object Repository/Page_Zapitel  Make Escrow/button_Calculate Commission'))

WebUI.click(findTestObject('Object Repository/Page_Zapitel  Make Escrow/div_Me                                     _3ebb98'))

WebUI.click(findTestObject('Object Repository/Page_Zapitel  Make Escrow/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Zapitel  Make Escrow/h6_MUDIT GUPTA'))

WebUI.click(findTestObject('Object Repository/Page_Zapitel  Make Escrow/p_muditgupta'))

WebUI.click(findTestObject('Object Repository/Page_Zapitel  Make Escrow/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Zapitel  Make Escrow/button_Submit'))

WebUI.setText(findTestObject('Object Repository/Page_Zapitel  Make Escrow/textarea_(max 1000 characters)_rules'), 'test')

WebUI.click(findTestObject('Object Repository/Page_Zapitel  Make Escrow/button_Submit'))

WebUI.click(findTestObject('Object Repository/Page_Zapitel  Make Escrow/a_Logout'))

