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

'删除部件'
WebUI.click(findTestObject('changshanghoutai/零部件管理/工位零部件/删除/i_删除部件'))

'输入原因'
WebUI.setText(findTestObject('changshanghoutai/零部件管理/工位零部件/删除/textarea_删除原因'), '3333')

'确定'
WebUI.click(findTestObject('changshanghoutai/零部件管理/工位零部件/删除/button_ 确认删除'))

'点击工位部件回收站'
WebUI.click(findTestObject('changshanghoutai/零部件管理/工位零部件/删除/a_回收站'))

'查看原因'
WebUI.click(findTestObject('changshanghoutai/零部件管理/工位零部件/审核上下架/i_查看原因'))

'关闭弹框'
WebUI.click(findTestObject('changshanghoutai/零部件管理/工位零部件/审核上下架/span_关闭弹窗'))

'还原'
WebUI.click(findTestObject('changshanghoutai/零部件管理/工位零部件/删除/i_还原'))

'返回列表'
WebUI.click(findTestObject('changshanghoutai/零部件管理/工位零部件/删除/a_返回列表'))

'删除部件'
WebUI.click(findTestObject('changshanghoutai/零部件管理/工位零部件/删除/i_删除部件'))

'输入原因'
WebUI.setText(findTestObject('changshanghoutai/零部件管理/工位零部件/删除/textarea_删除原因'), '3455')

'确定'
WebUI.click(findTestObject('changshanghoutai/零部件管理/工位零部件/删除/button_ 确认删除'))

'点击工位部件回收站\r\n'
WebUI.click(findTestObject('changshanghoutai/零部件管理/工位零部件/删除/a_回收站'))

'彻底删除'
WebUI.click(findTestObject('changshanghoutai/零部件管理/工位零部件/删除/i_彻底删除'))

'返回列表'
WebUI.click(findTestObject('changshanghoutai/零部件管理/工位零部件/删除/a_返回列表'))

'输入部件名称'
WebUI.setText(findTestObject('changshanghoutai/零部件管理/工位零部件/删除/input_输入搜索关键字'), '支撑腿')

'搜索'
WebUI.click(findTestObject('changshanghoutai/零部件管理/工位零部件/删除/i_搜索'))

'选中关键字'
WebUI.click(findTestObject('changshanghoutai/零部件管理/工位零部件/删除/div_选中关键字'))

'删除关键字\r\n'
WebUI.setText(findTestObject('changshanghoutai/零部件管理/工位零部件/删除/input_输入搜索关键字'), '')

'搜索'
WebUI.click(findTestObject('changshanghoutai/零部件管理/工位零部件/删除/i_搜索'))

