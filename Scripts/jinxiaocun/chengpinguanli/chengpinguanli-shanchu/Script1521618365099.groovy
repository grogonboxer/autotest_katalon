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

WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/成品管理/span_成品管理'), 10)

'点击成品管理'
WebUI.click(findTestObject('changshanghoutai/左侧菜单/成品管理/span_成品管理'), FailureHandling.STOP_ON_FAILURE)

'等待成品列表子菜单'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/成品管理/a_成品列表'), 10)

'点击成品列表'
WebUI.click(findTestObject('changshanghoutai/左侧菜单/成品管理/a_成品列表'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

'验证新增'
WebUI.verifyElementText(findTestObject('changshanghoutai/成品管理/新增编辑/a_验证新增'), chengpinmingcheng, FailureHandling.STOP_ON_FAILURE)

'点击删除按钮'
WebUI.click(findTestObject('changshanghoutai/成品管理/列表操作/i_删除'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

'确认删除'
WebUI.acceptAlert()

WebUI.delay(1)

WebUI.verifyTextNotPresent(chengpinmingcheng, false)

