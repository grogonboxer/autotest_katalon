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

'等待页面数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/仓库管理/span_仓库管理'), 10)

'滚动到仓库管理菜单按钮\r\n'
WebUI.scrollToElement(findTestObject('changshanghoutai/左侧菜单/仓库管理/span_仓库管理'), 10)

'点击仓库管理按钮'
WebUI.click(findTestObject('changshanghoutai/左侧菜单/仓库管理/span_仓库管理'), FailureHandling.STOP_ON_FAILURE)

'等待货品库存子菜单按钮'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/仓库管理/a_货品库存'), 10)

'点击货品库存'
WebUI.click(findTestObject('changshanghoutai/左侧菜单/仓库管理/a_货品库存'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'点击出库记录'
WebUI.click(findTestObject('changshanghoutai/仓库管理/货品库存/出库入库记录/a_出库记录'), FailureHandling.STOP_ON_FAILURE)

'等待出库记录'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/仓库管理/货品库存/出库入库记录/a_出库更多'), 10)

'点击更多按钮'
WebUI.click(findTestObject('changshanghoutai/仓库管理/货品库存/出库入库记录/a_出库更多'), FailureHandling.STOP_ON_FAILURE)

'等待更多数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/仓库管理/货品库存/出库入库记录/a_出库查看更多返回列表'), 10)

'点击返回列表'
WebUI.click(findTestObject('changshanghoutai/仓库管理/货品库存/出库入库记录/a_出库查看更多返回列表'), FailureHandling.STOP_ON_FAILURE)

'等待出库记录页'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/仓库管理/货品库存/出库入库记录/a_出库返回列表'), 10)

'点击返回按钮'
WebUI.click(findTestObject('changshanghoutai/仓库管理/货品库存/出库入库记录/a_出库返回列表'), FailureHandling.STOP_ON_FAILURE)

'等待列表数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/仓库管理/货品库存/出库入库记录/a_入库记录'), 10)

'点击入库记录'
WebUI.click(findTestObject('changshanghoutai/仓库管理/货品库存/出库入库记录/a_入库记录'), FailureHandling.STOP_ON_FAILURE)

'等待入库记录'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/仓库管理/货品库存/出库入库记录/a_入库更多'), 10)

'点击更多按钮'
WebUI.click(findTestObject('changshanghoutai/仓库管理/货品库存/出库入库记录/a_入库更多'), FailureHandling.STOP_ON_FAILURE)

'等待更多数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/仓库管理/货品库存/出库入库记录/a_入库查看更多返回列表'), 10)

'点击返回列表'
WebUI.click(findTestObject('changshanghoutai/仓库管理/货品库存/出库入库记录/a_入库查看更多返回列表'), FailureHandling.STOP_ON_FAILURE)

'等待入库记录页'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/仓库管理/货品库存/出库入库记录/a_入库返回列表'), 10)

'点击返回'
WebUI.click(findTestObject('changshanghoutai/仓库管理/货品库存/出库入库记录/a_入库返回列表'), FailureHandling.STOP_ON_FAILURE)

'等待列表数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/仓库管理/货品库存/出库入库记录/a_入库记录'), 10)

