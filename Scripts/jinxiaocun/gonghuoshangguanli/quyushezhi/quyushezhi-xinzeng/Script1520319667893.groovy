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

WebUI.callTestCase(findTestCase('denglu'), [:], FailureHandling.STOP_ON_FAILURE)

'等待供货商管理菜单按钮出现\r\n'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/供货商管理/span_供货商管理'), 10)

'滚动到供货商管理菜单'
WebUI.scrollToElement(findTestObject('changshanghoutai/左侧菜单/供货商管理/span_供货商管理'), 10)

'点击供货商管理菜单按钮'
WebUI.click(findTestObject('changshanghoutai/左侧菜单/供货商管理/span_供货商管理'), FailureHandling.STOP_ON_FAILURE)

'等待区域设置子菜单按钮出现'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/供货商管理/a_区域设置'), 10)

'点击区域设置子菜单按钮'
WebUI.click(findTestObject('changshanghoutai/左侧菜单/供货商管理/a_区域设置'), FailureHandling.STOP_ON_FAILURE)

'等待区域列表'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/供货商管理/区域设置/新增编辑/a_新增'), 10)

'点击新增按钮'
WebUI.click(findTestObject('changshanghoutai/供货商管理/区域设置/新增编辑/a_新增'), FailureHandling.STOP_ON_FAILURE)

'等待新增区域页出现'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/供货商管理/区域设置/新增编辑/input_区域名称'), 10)

'输入区域名称'
WebUI.setText(findTestObject('changshanghoutai/供货商管理/区域设置/新增编辑/input_区域名称'), quyumingcheng)

'选择省'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/供货商管理/区域设置/新增编辑/select_选择省'), '14', true)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'选择市'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/供货商管理/区域设置/新增编辑/select_选择市'), '128', true)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'选择区'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/供货商管理/区域设置/新增编辑/select_选择区'), '1154', true)

'点击添加按钮'
WebUI.click(findTestObject('changshanghoutai/供货商管理/区域设置/新增编辑/button_添加区域'), FailureHandling.STOP_ON_FAILURE)

'输入文字说明'
WebUI.setText(findTestObject('changshanghoutai/供货商管理/区域设置/新增编辑/textarea_文字说明'), quyushuoming)

'点击提交'
WebUI.click(findTestObject('changshanghoutai/供货商管理/区域设置/新增编辑/button_提交'), FailureHandling.STOP_ON_FAILURE)

