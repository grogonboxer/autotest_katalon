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

'审核'
WebUI.click(findTestObject('changshanghoutai/零部件管理/工位零部件/审核上下架/i_审核'))

'输入审核意见'
WebUI.setText(findTestObject('changshanghoutai/零部件管理/工位零部件/审核上下架/textarea_审核意见'), '不通过')

'不通过审核'
WebUI.click(findTestObject('changshanghoutai/零部件管理/工位零部件/审核上下架/button_不通过审核'))

'查看原因'
WebUI.click(findTestObject('changshanghoutai/零部件管理/工位零部件/审核上下架/i_查看原因'))

'关闭弹框'
WebUI.click(findTestObject('changshanghoutai/零部件管理/工位零部件/审核上下架/span_关闭弹窗'))

'审核'
WebUI.click(findTestObject('changshanghoutai/零部件管理/工位零部件/审核上下架/i_审核'))

'审核通过'
WebUI.click(findTestObject('changshanghoutai/零部件管理/工位零部件/审核上下架/button_审核通过'))

'上架'
WebUI.click(findTestObject('changshanghoutai/零部件管理/工位零部件/审核上下架/i_上架'))

'下架'
WebUI.click(findTestObject('changshanghoutai/零部件管理/工位零部件/审核上下架/i_下架'))

'输入原因'
WebUI.setText(findTestObject('changshanghoutai/零部件管理/工位零部件/审核上下架/textarea_输入原因'), '111')

'确定'
WebUI.click(findTestObject('changshanghoutai/零部件管理/工位零部件/审核上下架/button_确定'))

'查看原因'
WebUI.click(findTestObject('changshanghoutai/零部件管理/工位零部件/审核上下架/i_查看原因'))

'关闭弹框'
WebUI.click(findTestObject('changshanghoutai/零部件管理/工位零部件/审核上下架/span_关闭弹窗'))

