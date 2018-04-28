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

'等待仓库列表子菜单按钮'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/仓库管理/a_仓库列表'), 10)

'点击仓库列表'
WebUI.click(findTestObject('changshanghoutai/左侧菜单/仓库管理/a_仓库列表'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'选择类型'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/仓库管理/仓库列表/列表操作/select_选择类型'), '38', true)

'点击搜索'
WebUI.click(findTestObject('changshanghoutai/仓库管理/仓库列表/列表操作/button_搜索'), FailureHandling.STOP_ON_FAILURE)

'等待搜索结果'
WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'点击刷新'
WebUI.click(findTestObject('changshanghoutai/仓库管理/仓库列表/列表操作/button_刷新'), FailureHandling.STOP_ON_FAILURE)

'等待列表数据'
WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'选择类型'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/仓库管理/仓库列表/列表操作/select_选择类型'), '38', true)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

'选择状态'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/仓库管理/仓库列表/列表操作/select_选择状态'), 'on', true)

'点击搜索'
WebUI.click(findTestObject('changshanghoutai/仓库管理/仓库列表/列表操作/button_搜索'), FailureHandling.STOP_ON_FAILURE)

'等待搜索结果'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/仓库管理/仓库列表/列表操作/td_序号'), 10)

'点击刷新'
WebUI.click(findTestObject('changshanghoutai/仓库管理/仓库列表/列表操作/button_刷新'), FailureHandling.STOP_ON_FAILURE)

'等待刷新结果'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/仓库管理/仓库列表/列表操作/td_序号'), 10)

'选择类型'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/仓库管理/仓库列表/列表操作/select_选择类型'), '38', true)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

'选择状态'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/仓库管理/仓库列表/列表操作/select_选择状态'), 'on', true)

'输入搜索关键字'
WebUI.setText(findTestObject('changshanghoutai/仓库管理/仓库列表/列表操作/input_搜索关键字'), '02')

'点击搜索'
WebUI.click(findTestObject('changshanghoutai/仓库管理/仓库列表/列表操作/button_搜索'), FailureHandling.STOP_ON_FAILURE)

'等待搜索结果'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/仓库管理/仓库列表/列表操作/td_序号'), 10)

'点击启用按钮'
WebUI.click(findTestObject('changshanghoutai/仓库管理/仓库列表/列表操作/span_启用'), FailureHandling.STOP_ON_FAILURE)

'点击禁用按钮'
WebUI.click(findTestObject('changshanghoutai/仓库管理/仓库列表/列表操作/span_禁用'), FailureHandling.STOP_ON_FAILURE)

'点击查看详情'
WebUI.click(findTestObject('changshanghoutai/仓库管理/仓库列表/列表操作/a_查看详情'), FailureHandling.STOP_ON_FAILURE)

'查看详情数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/仓库管理/仓库列表/列表操作/a_返回列表'), 10)

'点击返回列表'
WebUI.click(findTestObject('changshanghoutai/仓库管理/仓库列表/列表操作/a_返回列表'), FailureHandling.STOP_ON_FAILURE)

'等待列表数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/仓库管理/仓库列表/列表操作/td_序号'), 10)

