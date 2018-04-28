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
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('denglu'), [('url') : findTestData('account/登录').getValue('网址', 1), ('username') : findTestData(
            'account/登录').getValue('用户名', 1), ('password') : findTestData('account/登录').getValue('密码', 1), ('password_new') : findTestData(
            'account/login').getValue('密码', 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/生产批次管理/span_生产批次管理'), 0)

WebUI.scrollToElement(findTestObject('changshanghoutai/左侧菜单/生产批次管理/span_生产批次管理'), 0)

WebUI.click(findTestObject('changshanghoutai/左侧菜单/生产批次管理/span_生产批次管理'))

WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/生产批次管理/a_生产任务单列表'), 0)

WebUI.click(findTestObject('changshanghoutai/左侧菜单/生产批次管理/a_生产任务单列表'))

WebUI.delay(4)

WebUI.click(findTestObject('changshanghoutai/生产批次管理/生产任务单列表/生产任务单列表页/a_新增'))

WebUI.delay(0)

WebUI.waitForElementVisible(findTestObject('changshanghoutai/生产批次管理/生产任务单列表/新增页面/div_新增页面'), 0)

WebUI.setText(findTestObject('changshanghoutai/生产批次管理/生产任务单列表/新增页面/input_衣柜id'), '301')

WebUI.setText(findTestObject('changshanghoutai/生产批次管理/生产任务单列表/新增页面/input_收货人'), '测试')

WebUI.setText(findTestObject('changshanghoutai/生产批次管理/生产任务单列表/新增页面/input_电话'), '18310966817')

WebUI.setText(findTestObject('changshanghoutai/生产批次管理/生产任务单列表/新增页面/input_交货地址'), '弘彧大厦313')

WebUI.click(findTestObject('changshanghoutai/生产批次管理/生产任务单列表/新增页面/input_交货时间'))

WebUI.click(findTestObject('changshanghoutai/生产批次管理/生产任务单列表/新增页面/td_日历'))

WebUI.click(findTestObject('changshanghoutai/生产批次管理/生产任务单列表/新增页面/button_确定'))

