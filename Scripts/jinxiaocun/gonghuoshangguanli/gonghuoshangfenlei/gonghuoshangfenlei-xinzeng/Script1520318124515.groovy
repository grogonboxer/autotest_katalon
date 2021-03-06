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

WebUI.callTestCase(findTestCase('denglu'), [('url') : findTestData('account/登录').getValue('网址', 1), ('username') : findTestData('account/登录').getValue('用户名', 1)
        , ('password') : findTestData('account/登录').getValue('密码', 1)], FailureHandling.STOP_ON_FAILURE)

'等待供货商管理菜单按钮出现\r\n'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/供货商管理/span_供货商管理'), 10)

'滚动到供货商管理菜单'
WebUI.scrollToElement(findTestObject('changshanghoutai/左侧菜单/供货商管理/span_供货商管理'), 10)

'点击供货商管理菜单按钮'
WebUI.click(findTestObject('changshanghoutai/左侧菜单/供货商管理/span_供货商管理'), FailureHandling.STOP_ON_FAILURE)

'等待供货商分类子菜单按钮出现'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/供货商管理/a_供货商分类'), 10)

'点击供货商分类子菜单按钮'
WebUI.click(findTestObject('changshanghoutai/左侧菜单/供货商管理/a_供货商分类'), FailureHandling.STOP_ON_FAILURE)

'等待分类列表'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/供货商管理/供货商分类/新增编辑/button_新增'), 10)

'点击新增按钮'
WebUI.click(findTestObject('changshanghoutai/供货商管理/供货商分类/新增编辑/button_新增'), FailureHandling.STOP_ON_FAILURE)

'等待新增弹框出现'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/供货商管理/供货商分类/新增编辑/input_分类名称'), 10)

'输入分类名称'
WebUI.setText(findTestObject('changshanghoutai/供货商管理/供货商分类/新增编辑/input_分类名称'), fenleimingcheng)

'点击确认按钮'
WebUI.click(findTestObject('changshanghoutai/供货商管理/供货商分类/新增编辑/button_确认'), FailureHandling.STOP_ON_FAILURE)

