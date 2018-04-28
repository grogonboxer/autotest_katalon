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

'滚动到业务类型左侧菜单\r\n'
WebUI.scrollToElement(findTestObject('changshanghoutai/左侧菜单/业务类型/span_业务类型'), 10)

'点击业务类型菜单按钮'
WebUI.click(findTestObject('changshanghoutai/左侧菜单/业务类型/span_业务类型'), FailureHandling.STOP_ON_FAILURE)

'等待业务类型列表子菜单'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/业务类型/a_业务类型列表'), 10)

'点击业务类型列表子菜单按钮'
WebUI.click(findTestObject('changshanghoutai/左侧菜单/业务类型/a_业务类型列表'), FailureHandling.STOP_ON_FAILURE)

'等待列表数据出现'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/业务类型/新增/a_新增'), 10)

'点击启用按钮'
WebUI.click(findTestObject('changshanghoutai/业务类型/列表操作/span_启用'), FailureHandling.STOP_ON_FAILURE)

'点击禁用按钮'
WebUI.click(findTestObject('changshanghoutai/业务类型/列表操作/span_禁用'), FailureHandling.STOP_ON_FAILURE)

'点击删除按钮'
WebUI.click(findTestObject('changshanghoutai/业务类型/列表操作/i_删除'), FailureHandling.STOP_ON_FAILURE)

'点击确认按钮\r\n'
WebUI.acceptAlert(FailureHandling.STOP_ON_FAILURE)

