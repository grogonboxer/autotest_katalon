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

WebUI.click(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/供货配置/a_供货配置'))

WebUI.delay(3)

WebUI.click(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/供货配置/a_新增'))

WebUI.delay(3)

WebUI.check(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/供货配置/input_序号'))

WebUI.setText(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/供货配置/input_供货周期'), '12')

WebUI.setText(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/供货配置/input_参考价格'), '12345')

WebUI.setText(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/供货配置/textarea_备注'), '备注一')

WebUI.click(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/供货配置/button_确定'))

WebUI.delay(3)

WebUI.click(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/供货配置/a_新增'))

WebUI.delay(6)

WebUI.setText(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/供货配置/input_供货周期'), '122')

WebUI.setText(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/供货配置/input_参考价格'), '4346567')

WebUI.setText(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/供货配置/textarea_备注'), '备注er')

WebUI.check(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/供货配置/input_序号2'))

WebUI.delay(2)

WebUI.click(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/供货配置/button_确定'))

WebUI.delay(6)

WebUI.click(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/供货配置/i_编辑'))

WebUI.delay(3)

WebUI.check(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/供货配置/input_备注'))

WebUI.setText(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/供货配置/input_供货周期'), '22')

WebUI.setText(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/供货配置/input_参考价格'), '11111')

WebUI.setText(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/供货配置/textarea_备注'), 'beizhusan')

WebUI.click(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/供货配置/button_确定'))

WebUI.delay(3)

WebUI.click(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/供货配置/i_删除'))

WebUI.delay(2)

WebUI.acceptAlert()

