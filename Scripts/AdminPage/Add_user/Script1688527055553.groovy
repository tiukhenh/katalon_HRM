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
import com.kms.katalon.core.testobject.ConditionType
'click viewAdmin'
WebUI.click(findTestObject('Object Repository/PageAdmin/Search/sp_adminLoca'))

'click icon add user'
WebUI.click(findTestObject('Object Repository/PageAdmin/Add_User/icon_Add'))

'select add user role'
WebUI.click(findTestObject('Object Repository/PageAdmin/Add_User/Select_UserRoleLoca'))
//String Role= userRole
WebUI.click(findTestObject('Object Repository/PageAdmin/Add_User/Select_UserRole',[('userRole'):userRole]))


'select add user status'
WebUI.click(findTestObject('Object Repository/PageAdmin/Add_User/Select_UserStatusLoca'))

WebUI.click(findTestObject('Object Repository/PageAdmin/Add_User/Select_UserStatus',[('userStatus'):userStatus]))

'add Employee name'
WebUI.setText(findTestObject('Object Repository/PageAdmin/Add_User/input_EmployeeName'), EmployeeName)

'add username'
WebUI.setText(findTestObject('Object Repository/PageAdmin/Add_User/input_Username'), username)

'add password'
WebUI.setText(findTestObject('Object Repository/PageAdmin/Add_User/input_Password'), password)

'confirm pass'
WebUI.setText(findTestObject('Object Repository/PageAdmin/Add_User/input_ConfirmPass'), password)

WebUI.takeFullPageScreenshot()

'click button save'
WebUI.click(findTestObject('Object Repository/PageAdmin/Add_User/btn_SaveAdd'))

