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

WebUI.callTestCase(findTestCase('maifangguanli/quyuguanli/quyuguanli-dakaiyemain'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('changshanghoutai/卖方管理/区域管理/a_新增'), 10)

WebUI.click(findTestObject('changshanghoutai/卖方管理/区域管理/a_新增'))

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('changshanghoutai/卖方管理/区域管理/input_新增区域名称'), 10)

WebUI.setText(findTestObject('changshanghoutai/卖方管理/区域管理/input_新增区域名称'), area_name)

WebUI.waitForElementVisible(findTestObject('changshanghoutai/卖方管理/区域管理/textarea_新增文字说明'), 5)

WebUI.setText(findTestObject('changshanghoutai/卖方管理/区域管理/textarea_新增文字说明'), instructions)

WebUI.selectOptionByValue(findTestObject('changshanghoutai/卖方管理/区域管理/select_新增省'), province, false)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('changshanghoutai/卖方管理/区域管理/select_新增市'), city, false)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('changshanghoutai/卖方管理/区域管理/select_新增区'), area, false)

WebUI.click(findTestObject('changshanghoutai/卖方管理/区域管理/button_添加区域按钮'))

WebUI.waitForElementVisible(findTestObject('changshanghoutai/卖方管理/区域管理/button_新增提交'), 10)

WebUI.click(findTestObject('changshanghoutai/卖方管理/区域管理/button_新增提交'))

