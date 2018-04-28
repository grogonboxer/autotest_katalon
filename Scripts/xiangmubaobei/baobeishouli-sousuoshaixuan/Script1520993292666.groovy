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

WebUI.openBrowser('http://b.dpjia.com')

WebUI.waitForElementVisible(findTestObject('changshanghoutai/登录/input_用户名'), 10)

WebUI.setText(findTestObject('changshanghoutai/登录/input_用户名'), 'jlxd')

WebUI.setText(findTestObject('changshanghoutai/登录/input_密码'), '123456')

WebUI.click(findTestObject('changshanghoutai/登录/button_登录'))

'等待左侧按钮'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/报备受理/span_项目报备'), 10)

'点击项目报备菜单'
WebUI.click(findTestObject('changshanghoutai/左侧菜单/报备受理/span_项目报备'))

'等待报备受理子菜单'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/报备受理/a_报备受理'), 10)

'点击报备受理'
WebUI.click(findTestObject('changshanghoutai/左侧菜单/报备受理/a_报备受理'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'点击待受理标签'
WebUI.click(findTestObject('changshanghoutai/项目报备/报备受理/搜索筛选/a_待受理标签'))

'等待列表数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/项目报备/报备受理/搜索筛选/tbody_列表数据'), 10)

'点击已受理标签'
WebUI.click(findTestObject('changshanghoutai/项目报备/报备受理/搜索筛选/a_已受理标签'))

'等待列表数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/项目报备/报备受理/搜索筛选/tbody_列表数据'), 10)

'点击已采纳标签'
WebUI.click(findTestObject('changshanghoutai/项目报备/报备受理/搜索筛选/a_已采纳标签'))

'等待列表数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/项目报备/报备受理/搜索筛选/tbody_列表数据'), 10)

'点击已拒绝标签'
WebUI.click(findTestObject('changshanghoutai/项目报备/报备受理/搜索筛选/a_已拒绝标签'))

'等待列表数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/项目报备/报备受理/搜索筛选/tbody_列表数据'), 10)

'点击已驳回标签'
WebUI.click(findTestObject('changshanghoutai/项目报备/报备受理/搜索筛选/a_已驳回标签'))

'等待列表数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/项目报备/报备受理/搜索筛选/tbody_列表数据'), 10)

'点击已撤回标签'
WebUI.click(findTestObject('changshanghoutai/项目报备/报备受理/搜索筛选/a_已撤回标签'))

'等待列表数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/项目报备/报备受理/搜索筛选/tbody_列表数据'), 10)

'点击已过期标签'
WebUI.click(findTestObject('changshanghoutai/项目报备/报备受理/搜索筛选/a_已过期标签'))

'等待列表数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/项目报备/报备受理/搜索筛选/tbody_列表数据'), 10)

'点击已关闭标签'
WebUI.click(findTestObject('changshanghoutai/项目报备/报备受理/搜索筛选/a_已关闭标签'))

'等待列表数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/项目报备/报备受理/搜索筛选/tbody_列表数据'), 10)

'点击全部标签'
WebUI.click(findTestObject('changshanghoutai/项目报备/报备受理/搜索筛选/a_全部标签'))

'等待列表数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/项目报备/报备受理/搜索筛选/tbody_列表数据'), 10)

'输入搜索关键字'
WebUI.setText(findTestObject('changshanghoutai/项目报备/报备受理/搜索筛选/input_搜索关键字'), "京乐")

'点击搜索'
WebUI.click(findTestObject('changshanghoutai/项目报备/报备受理/搜索筛选/button_搜索'))

'等待列表数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/项目报备/报备受理/搜索筛选/tbody_列表数据'), 10)

'点击刷新'
WebUI.click(findTestObject('changshanghoutai/项目报备/报备受理/搜索筛选/button_刷新'))

'等待列表数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/项目报备/报备受理/搜索筛选/tbody_列表数据'), 10)

'选择报备1'
WebUI.click(findTestObject('changshanghoutai/项目报备/报备受理/搜索筛选/input_选择报备1'))

'选择报备3'
WebUI.click(findTestObject('changshanghoutai/项目报备/报备受理/搜索筛选/input_选择报备3'))

'点击导出'
WebUI.click(findTestObject('changshanghoutai/项目报备/报备受理/搜索筛选/button_导出'))