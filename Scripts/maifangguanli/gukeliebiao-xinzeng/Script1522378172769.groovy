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
            'account/登录').getValue('用户名', 1), ('password') : findTestData('account/登录').getValue('密码', 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/买方管理/span_买方管理'), 10)

WebUI.scrollToElement(findTestObject('changshanghoutai/左侧菜单/买方管理/span_买方管理'), 3)

WebUI.click(findTestObject('changshanghoutai/左侧菜单/买方管理/span_买方管理'))

WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/买方管理/a_顾客列表'), 2)

WebUI.click(findTestObject('changshanghoutai/左侧菜单/买方管理/a_顾客列表'))

WebUI.delay(4)

WebUI.click(findTestObject('changshanghoutai/买方管理/顾客列表页/a_新增'))

WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('changshanghoutai/买方管理/新增页面/input_顾客简称'), 3)

WebUI.setText(findTestObject('changshanghoutai/买方管理/新增页面/input_顾客简称'), shortname)

WebUI.setText(findTestObject('changshanghoutai/买方管理/新增页面/input_顾客全称'), fullname)

WebUI.selectOptionByValue(findTestObject('changshanghoutai/买方管理/新增页面/select_顾客类型'), '2', true)

WebUI.click(findTestObject('changshanghoutai/买方管理/新增页面/button_提交'))

WebUI.waitForElementVisible(findTestObject('changshanghoutai/买方管理/新增页面/div_新增成功提示'), 0)

