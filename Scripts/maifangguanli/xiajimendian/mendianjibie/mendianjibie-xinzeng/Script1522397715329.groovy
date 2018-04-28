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

WebUI.callTestCase(findTestCase('maifangguanli/xiajimendian/mendianjibie/mendianjibie-dakaiyemian'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('changshanghoutai/卖方管理/下级门店/门店级别/a_新增'), 10)

WebUI.click(findTestObject('changshanghoutai/卖方管理/下级门店/门店级别/a_新增'))

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('changshanghoutai/卖方管理/下级门店/门店级别/新增/input_级别名称'), 10)

WebUI.setText(findTestObject('changshanghoutai/卖方管理/下级门店/门店级别/新增/input_级别名称'), '自动化测试1')

WebUI.setText(findTestObject('changshanghoutai/卖方管理/下级门店/门店级别/新增/textarea_文字说明'), '自动化测试文字说明')

WebUI.click(findTestObject('changshanghoutai/卖方管理/下级门店/门店级别/新增/button_提交'))

