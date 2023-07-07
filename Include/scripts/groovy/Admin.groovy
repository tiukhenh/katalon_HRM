import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

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

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

class Admin {
	@Given("User navigate page daskboard")
	def navigateDaskboard() {
		WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index')
	}

	@When("User click Admin to visit admin function")
	def clickAdmin() {
		WebUI.click(findTestObject('Object Repository/PageAdmin/Search/sp_adminLoca'))
	}
	@When("User enter username in input username")
	def inputUsername() {
		WebUI.setText(findTestObject('Object Repository/PageAdmin/Search/Search_usernameInput'), GlobalVariable.username_find)
	}
	@And ("User click button search")
	def clickBtnSearch(){
		WebUI.click(findTestObject('Object Repository/PageAdmin/Search/btn_search'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/PageAdmin/Search/span_NotFound'), 0)
	}
	@Then("Verify search user by username successful")
	def verifySearchByUsername() {
		WebUI.verifyElementText(findTestObject('Object Repository/PageAdmin/Search/verifySearchByUsername'), GlobalVariable.username_find)
		WebUI.takeFullPageScreenshot()
	}
	@When("User click userRole location")
	def clickUserRoleLoca() {
		WebUI.click(findTestObject('Object Repository/PageAdmin/Search/Search_userRoleLoca'))
	}
	@And("User select userRole")
	def selectUserRole(){
		WebUI.click(findTestObject('Object Repository/PageAdmin/Search/Seach_userRole'))
	}
	@Then("Verify search by userRole successful")
	def verifySearchByUserRole() {
		WebUI.verifyElementNotHasAttribute(findTestObject('Object Repository/PageAdmin/Search/span_NotFound'), 'No Records Found', 0)
		WebUI.takeFullPageScreenshot()
	}
	@When("User enter username in input username (.*)")
	def inputUsername(String usernameSearch) {
		WebUI.setText(findTestObject('Object Repository/PageAdmin/Search/Search_usernameInput'), usernameSearch)
	}
	@When("User click icon edit")
	def clickiconedit() {
		WebUI.click(findTestObject('Object Repository/PageAdmin/Edit_User/iconEdit'))
	}
	@And ("User edit userRole")
	def editUserRole() {
		WebUI.click(findTestObject('Object Repository/PageAdmin/Edit_User/Edit_UserRoleLoca'))
		'select user role '
		String userRole = GlobalVariable.userRoleUpdate
		WebUI.click(findTestObject('Object Repository/PageAdmin/Edit_User/Edit_UserRole',[('userRole'):userRole]))
	}
	@And("User edit userSatus")
	def editUserStatus() {
		WebUI.click(findTestObject('Object Repository/PageAdmin/Edit_User/Edit_UserStatusLoca'))
		'select user status'
		String userstatus = GlobalVariable.userStatusUpdate
		WebUI.click(findTestObject('Object Repository/PageAdmin/Edit_User/Edit_UserStatus',[('userStatus'):userstatus]))
		WebUI.takeFullPageScreenshot()
	}
	@And("User click button save")
	def clickBtnsave() {
		WebUI.click(findTestObject('Object Repository/PageAdmin/Edit_User/btn_saveEdit'))
	}
	@Then("Verify edit successful")
	def verifyEditSuccess() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/PageAdmin/Add_User/icon_Add'))
	}
}