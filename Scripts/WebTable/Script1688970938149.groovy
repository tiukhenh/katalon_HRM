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
import org.openqa.selenium.By as By

import org.openqa.selenium.WebDriver as WebDriver

import org.openqa.selenium.WebElement as WebElement

import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
'click viewAdmin'
WebUI.click(findTestObject('Object Repository/PageAdmin/Search/sp_adminLoca'))

WebDriver driver = DriverFactory.getWebDriver()
'locator table'
WebElement table = driver.findElement(By.xpath('//*[@class="oxd-table"]'))

List<WebElement> rows = table.findElements(By.xpath('//*[@class="oxd-table-body"]//*[@class="oxd-table-card"]'))

for (int i = 0; i < rows.size(); i++) {
	List<WebElement> cols = rows.get(i).findElements(By.xpath('.//*[@class="oxd-table-row oxd-table-row--with-border"]'))
	for (WebElement col : cols) {
		if(col.findElement(By.xpath('.//div[3]//div')).getText()== 'ESS') {
			println("username is: "+ col.findElement(By.xpath('.//div[2]//div')).getText())
		}
	}
}
