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

WebUI.callTestCase(findTestCase('maifangguanli/xiajijingxiaoshang/xiajijingxiaoshang-dakaiyemian'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('changshanghoutai/卖方管理/下级经销商/a_审核'), 10)

WebUI.click(findTestObject('changshanghoutai/卖方管理/下级经销商/a_审核'))

WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('changshanghoutai/卖方管理/下级经销商/button_审核同意按钮'), 10)

WebUI.click(findTestObject('changshanghoutai/卖方管理/下级经销商/button_审核同意按钮'))

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('changshanghoutai/卖方管理/下级经销商/span_禁用'), 10)

WebUI.click(findTestObject('changshanghoutai/卖方管理/下级经销商/span_禁用'))

WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('changshanghoutai/卖方管理/下级经销商/textarea_禁用原因'), 10)

WebUI.setText(findTestObject('changshanghoutai/卖方管理/下级经销商/textarea_禁用原因'), '自动化测试')

WebUI.click(findTestObject('changshanghoutai/卖方管理/下级经销商/button_禁用同意按钮'))

WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('changshanghoutai/卖方管理/下级经销商/span_启用'), 10)

WebUI.click(findTestObject('changshanghoutai/卖方管理/下级经销商/span_启用'))

WebUI.delay(2)

WebUI.acceptAlert()

