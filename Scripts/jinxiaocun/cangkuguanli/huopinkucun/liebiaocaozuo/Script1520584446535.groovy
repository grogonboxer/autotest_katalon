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

'等待页面数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/仓库管理/span_仓库管理'), 10)

'滚动到仓库管理菜单按钮\r\n'
WebUI.scrollToElement(findTestObject('changshanghoutai/左侧菜单/仓库管理/span_仓库管理'), 10)

'点击仓库管理按钮'
WebUI.click(findTestObject('changshanghoutai/左侧菜单/仓库管理/span_仓库管理'), FailureHandling.STOP_ON_FAILURE)

'等待货品库存子菜单按钮'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/仓库管理/a_货品库存'), 10)

'点击货品库存'
WebUI.click(findTestObject('changshanghoutai/左侧菜单/仓库管理/a_货品库存'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'选择仓库类型'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/仓库管理/货品库存/搜索筛选/select_仓库类型'), '38', true)

'点击搜索'
WebUI.click(findTestObject('changshanghoutai/仓库管理/货品库存/搜索筛选/button_搜索'), FailureHandling.STOP_ON_FAILURE)

'等待搜索结果'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/仓库管理/货品库存/出库入库记录/a_出库记录'), 10)

'点击刷新'
WebUI.click(findTestObject('changshanghoutai/仓库管理/货品库存/搜索筛选/button_刷新'), FailureHandling.STOP_ON_FAILURE)

'等待列表内容'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/仓库管理/货品库存/出库入库记录/a_出库记录'), 10)

'选择仓库类型'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/仓库管理/货品库存/搜索筛选/select_仓库类型'), '38', true)

'等待仓库名称'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/仓库管理/货品库存/搜索筛选/select_仓库名称'), 10)

'选择仓库名称'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/仓库管理/货品库存/搜索筛选/select_仓库名称'), '82', true)

'点击搜索'
WebUI.click(findTestObject('changshanghoutai/仓库管理/货品库存/搜索筛选/button_搜索'), FailureHandling.STOP_ON_FAILURE)

'等待搜索结果'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/仓库管理/货品库存/出库入库记录/a_出库记录'), 10)

'点击刷新'
WebUI.click(findTestObject('changshanghoutai/仓库管理/货品库存/搜索筛选/button_刷新'), FailureHandling.STOP_ON_FAILURE)

'等待列表内容'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/仓库管理/货品库存/出库入库记录/a_出库记录'), 10)

'选择仓库类型'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/仓库管理/货品库存/搜索筛选/select_仓库类型'), '38', true)

'等待仓库名称'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/仓库管理/货品库存/搜索筛选/select_仓库名称'), 10)

'选择仓库名称'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/仓库管理/货品库存/搜索筛选/select_仓库名称'), '82', true)

'选择类别'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/仓库管理/货品库存/搜索筛选/select_类别'), 'product', true)

'点击搜索'
WebUI.click(findTestObject('changshanghoutai/仓库管理/货品库存/搜索筛选/button_搜索'), FailureHandling.STOP_ON_FAILURE)

'等待搜索结果'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/仓库管理/货品库存/出库入库记录/a_出库记录'), 10)

'点击刷新'
WebUI.click(findTestObject('changshanghoutai/仓库管理/货品库存/搜索筛选/button_刷新'), FailureHandling.STOP_ON_FAILURE)

'等待列表内容'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/仓库管理/货品库存/出库入库记录/a_出库记录'), 10)

'选择仓库类型'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/仓库管理/货品库存/搜索筛选/select_仓库类型'), '38', true)

'等待仓库名称'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/仓库管理/货品库存/搜索筛选/select_仓库名称'), 10)

'选择仓库名称'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/仓库管理/货品库存/搜索筛选/select_仓库名称'), '82', true)

'选择类别'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/仓库管理/货品库存/搜索筛选/select_类别'), 'product', true)

'输入搜索关键字'
WebUI.setText(findTestObject('changshanghoutai/仓库管理/货品库存/搜索筛选/input_搜索关键字'), '02')

'点击搜索'
WebUI.click(findTestObject('changshanghoutai/仓库管理/货品库存/搜索筛选/button_搜索'), FailureHandling.STOP_ON_FAILURE)

'等待搜索结果'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/仓库管理/货品库存/出库入库记录/a_出库记录'), 10)

'点击刷新'
WebUI.click(findTestObject('changshanghoutai/仓库管理/货品库存/搜索筛选/button_刷新'), FailureHandling.STOP_ON_FAILURE)

'等待列表内容'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/仓库管理/货品库存/出库入库记录/a_出库记录'), 10)

