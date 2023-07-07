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
//Login
// open browser
WebUI.openBrowser('')

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

// input username
WebUI.setText(findTestObject('Object Repository/PageLogin/input_username'), 'Admin')

// input pasword
WebUI.setText(findTestObject('Object Repository/PageLogin/input_password'), 'admin123')

// click button login
WebUI.click(findTestObject('Object Repository/PageLogin/btn_login'))
// verify login successful
WebUI.verifyElementVisible(findTestObject('Object Repository/PageLogin/viewDashboard'))

//Logout
// click user dropdown
WebUI.click(findTestObject('Object Repository/PageLogout/userdropdown'))
// click logout
WebUI.click(findTestObject('Object Repository/PageLogout/Logout_Loca'))
// verify logout successfull
WebUI.verifyElementVisible(findTestObject('Object Repository/PageLogin/btn_login'))
WebUI.takeFullPageScreenshot()