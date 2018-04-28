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

'点击删除按钮'
WebUI.click(findTestObject('changshanghoutai/仓库管理/仓库列表/列表操作/i_删除'), FailureHandling.STOP_ON_FAILURE)

'等待弹框'
WebUI.waitForAlert(2, FailureHandling.STOP_ON_FAILURE)

'确定删除'
WebUI.acceptAlert()

