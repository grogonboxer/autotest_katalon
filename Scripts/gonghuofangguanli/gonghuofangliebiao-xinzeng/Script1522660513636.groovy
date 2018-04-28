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

WebUI.callTestCase(findTestCase('denglu'), [('url') : findTestData('account/登录').getValue('网址', 1), ('username') : findTestData(
            'account/登录').getValue('用户名', 1), ('password') : findTestData('account/登录').getValue('密码', 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/供货方管理/span_供货方管理'), 0)

WebUI.scrollToElement(findTestObject('changshanghoutai/左侧菜单/供货方管理/span_供货方管理'), 0)

WebUI.click(findTestObject('changshanghoutai/左侧菜单/供货方管理/span_供货方管理'))

WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/供货方管理/a_供货方列表'), 0)

WebUI.click(findTestObject('changshanghoutai/左侧菜单/供货方管理/a_供货方列表'))

WebUI.delay(4)

WebUI.click(findTestObject('changshanghoutai/供货方管理/供货方列表页/a_新增'))

WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('changshanghoutai/供货方管理/新增页面/input_供货方账号'), 0)

WebUI.setText(findTestObject('changshanghoutai/供货方管理/新增页面/input_供货方账号'), gonghuofangzhanghao)

WebUI.setText(findTestObject('changshanghoutai/供货方管理/新增页面/input_密码'), mima)

WebUI.selectOptionByValue(findTestObject('changshanghoutai/供货方管理/新增页面/select_供货方类型'), 'supplier', true)

WebUI.setText(findTestObject('changshanghoutai/供货方管理/新增页面/input_供货方全称'), gonghuofangquancheng)

WebUI.setText(findTestObject('changshanghoutai/供货方管理/新增页面/input_供货方简称'), gonghuofangjiancheng)

WebUI.setText(findTestObject('changshanghoutai/供货方管理/新增页面/input_供货范围'), gonghuofanwei)

WebUI.setText(findTestObject('changshanghoutai/供货方管理/新增页面/input_供货方联系人'), gonghuofanglianxiren)

WebUI.setText(findTestObject('changshanghoutai/供货方管理/新增页面/input_供货方联系电话'), gonghuofanglianxidianhua)

WebUI.setText(findTestObject('changshanghoutai/供货方管理/新增页面/input_供货方地址'), gonghuofangdizhi)

WebUI.setText(findTestObject('changshanghoutai/供货方管理/新增页面/textarea_备注'), beizhu)

WebUI.click(findTestObject('changshanghoutai/供货方管理/新增页面/button_确定'))

WebUI.waitForElementVisible(findTestObject('changshanghoutai/供货方管理/新增页面/div_添加成功提示'), 0)

