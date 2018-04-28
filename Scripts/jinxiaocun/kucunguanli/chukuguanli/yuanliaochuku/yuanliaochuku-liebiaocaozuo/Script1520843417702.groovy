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

'等待出库管理子菜单'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/库存管理/a_出库管理'), 10)

'点击出库管理'
WebUI.click(findTestObject('changshanghoutai/左侧菜单/库存管理/a_出库管理'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'点击查看详情'
WebUI.click(findTestObject('changshanghoutai/库存管理/出库管理/原料出库/列表操作/a_查看详情'), FailureHandling.STOP_ON_FAILURE)

'等待详情页'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/库存管理/出库管理/原料出库/列表操作/a_返回列表'), 0)

'点击返回列表'
WebUI.click(findTestObject('changshanghoutai/库存管理/出库管理/原料出库/列表操作/a_返回列表'), FailureHandling.STOP_ON_FAILURE)

'等待列表数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/库存管理/出库管理/原料出库/列表操作/input_搜索关键字'), 0)

'输入搜索关键字'
WebUI.setText(findTestObject('changshanghoutai/库存管理/出库管理/原料出库/列表操作/input_搜索关键字'), '')

'点击搜索'
WebUI.click(findTestObject('changshanghoutai/库存管理/出库管理/原料出库/列表操作/button_搜索'), FailureHandling.STOP_ON_FAILURE)

'等待搜索结果'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/库存管理/出库管理/原料出库/列表操作/td_序号'), 0)

'点击刷新按钮'
WebUI.click(findTestObject('changshanghoutai/库存管理/出库管理/原料出库/列表操作/button_刷新'), FailureHandling.STOP_ON_FAILURE)

'等待列表数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/库存管理/出库管理/原料出库/列表操作/td_序号'), 0)

'点击删除按钮'
WebUI.click(findTestObject('changshanghoutai/库存管理/出库管理/原料出库/列表操作/i_删除'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForAlert(0, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

'选择原料出库记录'
WebUI.click(findTestObject('changshanghoutai/库存管理/出库管理/原料出库/列表操作/input_选择原料记录'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('changshanghoutai/库存管理/出库管理/原料出库/列表操作/input_选择原料记录2'), FailureHandling.STOP_ON_FAILURE)

'点击导出'
WebUI.click(findTestObject('changshanghoutai/库存管理/出库管理/原料出库/列表操作/button_导出'), FailureHandling.STOP_ON_FAILURE)

