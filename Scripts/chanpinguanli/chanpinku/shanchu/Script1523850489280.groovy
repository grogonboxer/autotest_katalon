import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('chanpinguanli/chanpinku/chanpinku_jinru'), [:], FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.delay(3)

WebUiBuiltInKeywords.waitForElementVisible(findTestObject('changshanghoutai/产品管理/产品库/删除/td_序号'), 0)

WebUI.click(findTestObject('changshanghoutai/产品管理/产品库/删除/td_序号'))

WebUiBuiltInKeywords.waitForElementClickable(findTestObject('changshanghoutai/产品管理/产品库/删除/i_fa-self-icon-删除图标'), 0)

WebUI.click(findTestObject('changshanghoutai/产品管理/产品库/删除/i_fa-self-icon-删除图标'))

WebUiBuiltInKeywords.acceptAlert()

WebUiBuiltInKeywords.delay(3)

WebUI.check(findTestObject('changshanghoutai/产品管理/产品库/删除/input-选择1'))

WebUI.check(findTestObject('changshanghoutai/产品管理/产品库/删除/input-选择2'))

WebUI.click(findTestObject('changshanghoutai/产品管理/产品库/删除/button_删除按钮'))

WebUiBuiltInKeywords.acceptAlert()

