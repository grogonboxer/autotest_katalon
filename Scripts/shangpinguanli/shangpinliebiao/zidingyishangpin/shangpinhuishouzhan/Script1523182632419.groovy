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

WebUI.callTestCase(findTestCase('shangpinguanli/shangpinliebiao/zidingyishangpin/zidingyishangpin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/商品回收站/a_商品回收站'))

WebUI.delay(3)

WebUI.click(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/商品回收站/a_第二页'))

WebUI.delay(2)

WebUI.setText(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/商品回收站/input_搜索内容'), 'JL')

WebUI.click(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/商品回收站/button_搜索'))

WebUI.delay(3)

WebUI.click(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/商品回收站/button_刷新'))

WebUI.delay(2)

WebUI.click(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/商品回收站/a_详情页'))

WebUI.delay(3)

WebUI.click(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/商品回收站/a_返回列表'))

WebUI.delay(3)

WebUI.click(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/商品回收站/i_查看原因'))

WebUI.delay(2)

WebUI.click(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/商品回收站/span_关闭对话框'))

WebUI.delay(5)

WebUI.click(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/商品回收站/a_删除'))

WebUI.delay(2)

WebUI.acceptAlert()

WebUI.click(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/商品回收站/a_撤销'))

WebUI.delay(2)

WebUI.acceptAlert()

