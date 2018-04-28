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

'点击入库按钮'
WebUI.click(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/入库操作/a_入库'), FailureHandling.STOP_ON_FAILURE)

'等待入库弹框'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/入库操作/input_入库数量'), 10)

'输入入库数量'
WebUI.setText(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/入库操作/input_入库数量'), '2')

'选择入库仓库类型'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/入库操作/select_入库类型'), '37', true)

WebUI.waitForElementVisible(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/入库操作/select_入库仓库'), 10)

'选择入库仓库'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/入库操作/select_入库仓库'), '80', true)

'输入备注'
WebUI.setText(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/入库操作/textarea_备注'), '入库备注')

'点击提交'
WebUI.click(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/入库操作/button_提交'), FailureHandling.STOP_ON_FAILURE)

