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

'等待库存管理菜单按钮'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/库存管理/span_库存管理'), 10)

'点击库存管理按钮'
WebUI.click(findTestObject('changshanghoutai/左侧菜单/库存管理/span_库存管理'), FailureHandling.STOP_ON_FAILURE)

'等待出库管理子菜单'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/库存管理/a_出库管理'), 10)

'点击出库管理'
WebUI.click(findTestObject('changshanghoutai/左侧菜单/库存管理/a_出库管理'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'点击出库按钮'
WebUI.click(findTestObject('changshanghoutai/库存管理/出库管理/原料出库/出库操作/a_出库'), FailureHandling.STOP_ON_FAILURE)

'等待出库操作页'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/库存管理/出库管理/原料出库/出库操作/input_实出库数量'), 10)

'点击实出库数量'
WebUI.click(findTestObject('changshanghoutai/库存管理/出库管理/原料出库/出库操作/input_实出库数量'), FailureHandling.STOP_ON_FAILURE)

'等待仓库选择页'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/库存管理/出库管理/原料出库/出库操作/input_数量1'), 10)

'输入数量'
WebUI.setText(findTestObject('changshanghoutai/库存管理/出库管理/原料出库/出库操作/input_数量1'), '1')

'输入数量'
WebUI.setText(findTestObject('changshanghoutai/库存管理/出库管理/原料出库/出库操作/input_数量2'), '1')

'输入数量'
WebUI.setText(findTestObject('changshanghoutai/库存管理/出库管理/原料出库/出库操作/input_数量3'), '1')

'点击取消'
WebUI.click(findTestObject('changshanghoutai/库存管理/出库管理/原料出库/出库操作/button_取消数量'), FailureHandling.STOP_ON_FAILURE)

'点击实出库数量'
WebUI.click(findTestObject('changshanghoutai/库存管理/出库管理/原料出库/出库操作/input_实出库数量'), FailureHandling.STOP_ON_FAILURE)

'选择仓库类型'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/库存管理/出库管理/原料出库/出库操作/select_仓库类型'), '37', true)

'点击搜索'
WebUI.click(findTestObject('changshanghoutai/库存管理/出库管理/原料出库/出库操作/button_搜索'), FailureHandling.STOP_ON_FAILURE)

'等待搜索结果'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/库存管理/出库管理/原料出库/出库操作/input_数量1'), 10)

'选择仓库名称'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/库存管理/出库管理/原料出库/出库操作/select_仓库名称'), '80', true)

'点击搜索'
WebUI.click(findTestObject('changshanghoutai/库存管理/出库管理/原料出库/出库操作/button_搜索'), FailureHandling.STOP_ON_FAILURE)

'等待搜索结果'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/库存管理/出库管理/原料出库/出库操作/input_数量1'), 10)

'清空选择条件'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/库存管理/出库管理/原料出库/出库操作/select_仓库类型'), '-1', true)

'点击搜索'
WebUI.click(findTestObject('changshanghoutai/库存管理/出库管理/原料出库/出库操作/button_搜索'), FailureHandling.STOP_ON_FAILURE)

'等待搜索结果'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/库存管理/出库管理/原料出库/出库操作/input_数量1'), 10)

'输入数量'
WebUI.setText(findTestObject('changshanghoutai/库存管理/出库管理/原料出库/出库操作/input_数量1'), '1')

'输入数量'
WebUI.setText(findTestObject('changshanghoutai/库存管理/出库管理/原料出库/出库操作/input_数量2'), '2')

'输入数量'
WebUI.setText(findTestObject('changshanghoutai/库存管理/出库管理/原料出库/出库操作/input_数量3'), '3')

'提交数量'
WebUI.click(findTestObject('changshanghoutai/库存管理/出库管理/原料出库/出库操作/button_提交数量'), FailureHandling.STOP_ON_FAILURE)

'提交出库'
WebUI.click(findTestObject('changshanghoutai/库存管理/出库管理/原料出库/出库操作/button_提交出库'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('changshanghoutai/库存管理/出库管理/原料出库/出库操作/a_出库'), 10)

