package authen
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI



class authen {
	@Keyword
	def login(String username, String password) {
		'input username'
		WebUI.setText(findTestObject('Object Repository/PageLogin/input_username'), username)

		'input pasword'
		WebUI.setText(findTestObject('Object Repository/PageLogin/input_password'), password)

		'click button login'
		WebUI.click(findTestObject('Object Repository/PageLogin/btn_login'))
		'verify login successful'
		WebUI.verifyElementVisible(findTestObject('Object Repository/PageLogin/viewDashboard'))
	}

	@Keyword
	def logout() {
		'click user dropdown'
		WebUI.click(findTestObject('Object Repository/PageLogout/userdropdown'))
		'click logout'
		WebUI.click(findTestObject('Object Repository/PageLogout/Logout_Loca'))
		'verify logout successfull'
		WebUI.verifyElementVisible(findTestObject('Object Repository/PageLogin/btn_login'))
	}
	//
	//	/**
	//	 * Get all rows of HTML table
	//	 * @param table Katalon test object represent for HTML table
	//	 * @param outerTagName outer tag name of TR tag, usually is TBODY
	//	 * @return All rows inside HTML table
	//	 */
	//	@Keyword
	//	def List<WebElement> getHtmlTableRows(TestObject table, String outerTagName) {
	//		WebElement mailList = WebUiBuiltInKeywords.findWebElement(table)
	//		List<WebElement> selectedRows = mailList.findElements(By.xpath("./" + outerTagName + "/tr"))
	//		return selectedRows
	//	}
}