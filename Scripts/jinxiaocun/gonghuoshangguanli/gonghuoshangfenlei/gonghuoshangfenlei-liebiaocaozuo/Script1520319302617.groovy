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
WebUI.waitForElementVisible(findTestObject('changshanghoutai/供货商管理/供货商分类/列表操作/span_启用'), 10)

'点击启用按钮'
WebUI.click(findTestObject('changshanghoutai/供货商管理/供货商分类/列表操作/span_启用'), FailureHandling.STOP_ON_FAILURE)

'点击禁用按钮\r\n'
WebUI.click(findTestObject('changshanghoutai/供货商管理/供货商分类/列表操作/span_禁用'), FailureHandling.STOP_ON_FAILURE)

'点击删除按钮'
WebUI.click(findTestObject('changshanghoutai/供货商管理/供货商分类/列表操作/i_删除'), FailureHandling.STOP_ON_FAILURE)

'等待删除弹框'
WebUI.waitForAlert(0, FailureHandling.STOP_ON_FAILURE)

'确认删除'
WebUI.acceptAlert()

