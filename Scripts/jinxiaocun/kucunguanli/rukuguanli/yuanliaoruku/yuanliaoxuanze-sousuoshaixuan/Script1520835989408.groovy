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

'选择一级分类'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/新增/select_选择一级分类'), '11', true)

'点击搜索'
WebUI.click(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/新增/button_搜索'), FailureHandling.STOP_ON_FAILURE)

'等待搜索结果'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/新增/td_序号'), 10)

'点击刷新'
WebUI.click(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/新增/button_刷新'), FailureHandling.STOP_ON_FAILURE)

'等待刷新结果'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/新增/td_序号'), 10)

'选择一级分类'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/新增/select_选择一级分类'), '11', true)

'等待二级分类'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/新增/select_选择二级分类'), 10)

'选择二级分类'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/新增/select_选择二级分类'), '32', true)

'点击搜索'
WebUI.click(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/新增/button_搜索'), FailureHandling.STOP_ON_FAILURE)

'等待搜索结果'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/新增/td_序号'), 10)

'点击刷新'
WebUI.click(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/新增/button_刷新'), FailureHandling.STOP_ON_FAILURE)

'等待刷新结果'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/新增/td_序号'), 10)

'选择一级分类'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/新增/select_选择一级分类'), '11', true)

'等待二级分类'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/新增/select_选择二级分类'), 10)

'选择二级分类'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/新增/select_选择二级分类'), '32', true)

'等待三级分类'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/新增/select_选择三级分类'), 10)

'选择三级分类'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/新增/select_选择三级分类'), '69', true)

'点击搜索'
WebUI.click(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/新增/button_搜索'), FailureHandling.STOP_ON_FAILURE)

'等待搜索结果'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/新增/td_序号'), 10)

'点击刷新'
WebUI.click(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/新增/button_刷新'), FailureHandling.STOP_ON_FAILURE)

'等待刷新结果'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/新增/td_序号'), 10)

'选择一级分类'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/新增/select_选择一级分类'), '11', true)

'等待二级分类'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/新增/select_选择二级分类'), 10)

'选择二级分类'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/新增/select_选择二级分类'), '32', true)

'等待三级分类'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/新增/select_选择三级分类'), 10)

'选择三级分类'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/新增/select_选择三级分类'), '69', true)

'输入搜索关键字'
WebUI.setText(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/新增/input_输入搜索关键字'), '腿')

'点击搜索'
WebUI.click(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/新增/button_搜索'), FailureHandling.STOP_ON_FAILURE)

'等待搜索结果'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/新增/td_序号'), 10)

'点击刷新'
WebUI.click(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/新增/button_刷新'), FailureHandling.STOP_ON_FAILURE)

'等待刷新结果'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/库存管理/入库管理/原料入库/新增/td_序号'), 10)

