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

WebUI.callTestCase(findTestCase('denglu'), [:], FailureHandling.STOP_ON_FAILURE)

'等待库存管理菜单按钮'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/库存管理/span_库存管理'), 10)

'点击库存管理按钮'
WebUI.click(findTestObject('changshanghoutai/左侧菜单/库存管理/span_库存管理'), FailureHandling.STOP_ON_FAILURE)

'等待入库管理子菜单'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/库存管理/a_入库管理'), 10)

'点击入库管理'
WebUI.click(findTestObject('changshanghoutai/左侧菜单/库存管理/a_入库管理'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'点击新增按钮\r\n'
WebUI.click(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/新增/a_新增'), FailureHandling.STOP_ON_FAILURE)

'等待新增入库页'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/新增/input_入库时间'), 10)

'输入入库时间'
WebUI.setText(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/新增/input_入库时间'), '2018-09-11', FailureHandling.STOP_ON_FAILURE)

'选择入库人'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/新增/select_入库人'), '266', true)

'选择入库类型'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/新增/select_入库类型'), '18', true)

'输入相关采购单号'
WebUI.setText(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/新增/input_相关采购单号'), xiangguancaigoudanhao)

'点击选择新增按钮'
WebUI.click(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/新增/span_选择新增'), FailureHandling.STOP_ON_FAILURE)

'等待选择原料弹框'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/新增/input_选择原料'), 10)

'选择原料'
WebUI.click(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/新增/input_选择原料'), FailureHandling.STOP_ON_FAILURE)

'点击提交'
WebUI.click(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/新增/button_提交选择原料'), FailureHandling.STOP_ON_FAILURE)

'等待原料信息页'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/新增/input_输入入库数量'), 10)

'输入入库数量'
WebUI.setText(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/新增/input_输入入库数量'), rukushuliang)

'输入入库备注'
WebUI.setText(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/新增/textarea_输入入库备注'), rukubeizhu)

'点击删除按钮'
WebUI.click(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/新增/i_删除'), FailureHandling.STOP_ON_FAILURE)

'点击选择新增按钮'
WebUI.click(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/新增/span_选择新增'), FailureHandling.STOP_ON_FAILURE)

'等待选择原料弹框'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/新增/input_选择原料'), 10)

'选择原料'
WebUI.click(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/新增/input_选择原料'), FailureHandling.STOP_ON_FAILURE)

'点击提交'
WebUI.click(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/新增/button_提交选择原料'), FailureHandling.STOP_ON_FAILURE)

'等待原料信息页'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/新增/input_输入入库数量'), 10)

'输入入库数量'
WebUI.setText(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/新增/input_输入入库数量'), rukushuliang)

'输入入库备注'
WebUI.setText(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/新增/textarea_输入入库备注'), rukubeizhu)

'输入总备注'
WebUI.setText(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/新增/textarea_原料总备注'), zongbeizhu)

'点击提交'
WebUI.click(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/新增/button_提交新增'), FailureHandling.STOP_ON_FAILURE)

