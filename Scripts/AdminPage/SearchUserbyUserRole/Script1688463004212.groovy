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

'click viewAdmin'
WebUI.click(findTestObject('Object Repository/PageAdmin/Search/sp_adminLoca'))
'Search by userRole'
WebUI.click(findTestObject('Object Repository/PageAdmin/Search/Search_userRoleLoca'))
'select user Role'
WebUI.click(findTestObject('Object Repository/PageAdmin/Search/Seach_userRole'))
'click btn search' 
WebUI.click(findTestObject('Object Repository/PageAdmin/Search/btn_search'))
'verify search by userRole successful'
WebUI.verifyElementNotHasAttribute(findTestObject('Object Repository/PageAdmin/Search/span_NotFound'), 'No Records Found', 0)
WebUI.takeFullPageScreenshot()