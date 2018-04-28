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

WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/买方管理/span_买方管理'), 10)

WebUI.scrollToElement(findTestObject('changshanghoutai/左侧菜单/买方管理/span_买方管理'), 3)

WebUI.click(findTestObject('changshanghoutai/左侧菜单/买方管理/span_买方管理'))

WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/买方管理/a_顾客列表'), 2)

WebUI.click(findTestObject('changshanghoutai/左侧菜单/买方管理/a_顾客列表'))

WebUI.delay(4)

WebUI.setText(findTestObject('changshanghoutai/买方管理/顾客列表页/input_搜索框'), shortname)

WebUI.click(findTestObject('changshanghoutai/买方管理/顾客列表页/button_搜索'))

WebUI.delay(4)

WebUI.verifyTextPresent(shortname, true)

WebUI.click(findTestObject('changshanghoutai/买方管理/顾客列表页/button_刷新'))

WebUI.waitForElementVisible(findTestObject('changshanghoutai/买方管理/顾客列表页/div_刷新成功提示'), 0)

WebUI.setText(findTestObject('changshanghoutai/买方管理/顾客列表页/input_搜索框'), '')

WebUI.click(findTestObject('changshanghoutai/买方管理/顾客列表页/button_搜索'))

WebUI.delay(4)

WebUI.verifyTextPresent(shortname, true)

WebUI.click(findTestObject('changshanghoutai/买方管理/顾客列表页/input_选中一条导出'))

WebUI.click(findTestObject('changshanghoutai/买方管理/顾客列表页/button_导出'))

WebUI.verifyElementNotVisible(findTestObject('changshanghoutai/买方管理/顾客列表页/div_未选择导出项提示'))

