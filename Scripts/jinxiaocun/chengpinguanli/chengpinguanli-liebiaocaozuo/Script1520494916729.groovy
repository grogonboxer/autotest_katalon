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

WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/成品管理/span_成品管理'), 10)

'点击成品管理'
WebUI.click(findTestObject('changshanghoutai/左侧菜单/成品管理/span_成品管理'), FailureHandling.STOP_ON_FAILURE)

'等待成品列表子菜单'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/成品管理/a_成品列表'), 10)

'点击成品列表'
WebUI.click(findTestObject('changshanghoutai/左侧菜单/成品管理/a_成品列表'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

'选择用途'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/成品管理/列表操作/select_用途'), '2', true)

'点击搜索'
WebUI.click(findTestObject('changshanghoutai/成品管理/列表操作/button_搜索'), FailureHandling.STOP_ON_FAILURE)

'等待搜索结果'
WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'点击刷新'
WebUI.click(findTestObject('changshanghoutai/成品管理/列表操作/button_刷新'), FailureHandling.STOP_ON_FAILURE)

'等待列表数据'
WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'选择用途'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/成品管理/列表操作/select_用途'), '2', true)

'等待二级分类'
WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'选择二级分类'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/成品管理/列表操作/select_二级分类'), '34', true)

'点击搜索'
WebUI.click(findTestObject('changshanghoutai/成品管理/列表操作/button_搜索'), FailureHandling.STOP_ON_FAILURE)

'等待搜索结果'
WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'点击刷新'
WebUI.click(findTestObject('changshanghoutai/成品管理/列表操作/button_刷新'), FailureHandling.STOP_ON_FAILURE)

'等待列表数据'
WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'选择用途'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/成品管理/列表操作/select_用途'), '2', true)

'等待二级分类'
WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'选择二级分类'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/成品管理/列表操作/select_二级分类'), '34', true)

'等待三级分类'
WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'选择三级分类'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/成品管理/列表操作/select_三级分类'), '215', true)

'点击搜索'
WebUI.click(findTestObject('changshanghoutai/成品管理/列表操作/button_搜索'), FailureHandling.STOP_ON_FAILURE)

'等待搜索结果'
WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'点击刷新'
WebUI.click(findTestObject('changshanghoutai/成品管理/列表操作/button_刷新'), FailureHandling.STOP_ON_FAILURE)

'等待列表数据'
WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'选择用途'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/成品管理/列表操作/select_用途'), '2', true)

'等待二级分类'
WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'选择二级分类'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/成品管理/列表操作/select_二级分类'), '34', true)

'等待三级分类'
WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'选择三级分类'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/成品管理/列表操作/select_三级分类'), '215', true)

'输入搜索关键字'
WebUI.setText(findTestObject('changshanghoutai/成品管理/列表操作/input_搜索关键字'), '自动化测试')

'点击搜索'
WebUI.click(findTestObject('changshanghoutai/成品管理/列表操作/button_搜索'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

'点击刷新'
WebUI.click(findTestObject('changshanghoutai/成品管理/列表操作/button_刷新'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

'点击启用按钮'
WebUI.click(findTestObject('changshanghoutai/成品管理/列表操作/span_启用'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('changshanghoutai/成品管理/列表操作/div_切换状态成功提示'), 10)

WebUI.verifyElementVisible(findTestObject('changshanghoutai/成品管理/列表操作/td_禁用状态'))

WebUI.delay(1)

'点击禁用按钮'
WebUI.click(findTestObject('changshanghoutai/成品管理/列表操作/span_禁用'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('changshanghoutai/成品管理/列表操作/div_切换状态成功提示'), 10)

WebUI.verifyElementVisible(findTestObject('changshanghoutai/成品管理/列表操作/td_启用状态'))

'点击查看详情'
WebUI.click(findTestObject('changshanghoutai/成品管理/列表操作/a_查看详情'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'点击返回列表'
WebUI.click(findTestObject('changshanghoutai/成品管理/列表操作/a_返回列表'), FailureHandling.STOP_ON_FAILURE)

