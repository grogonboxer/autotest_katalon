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
import dpjia.pathtool.PathHelper as PathHelper

WebUI.callTestCase(findTestCase('denglu'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/成品管理/span_成品管理'), 10)

'点击成品管理'
WebUI.click(findTestObject('changshanghoutai/左侧菜单/成品管理/span_成品管理'), FailureHandling.STOP_ON_FAILURE)

'等待成品列表子菜单'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/成品管理/a_成品列表'), 10)

'点击成品列表'
WebUI.click(findTestObject('changshanghoutai/左侧菜单/成品管理/a_成品列表'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

'验证数据'
WebUI.verifyElementText(findTestObject('changshanghoutai/成品管理/新增编辑/a_验证新增'), xinzengmingcheng, FailureHandling.STOP_ON_FAILURE)

'点击编辑按钮'
WebUI.click(findTestObject('changshanghoutai/成品管理/新增编辑/i_编辑'), FailureHandling.STOP_ON_FAILURE)

'等待编辑页\r\n'
WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'上传成品图片'
WebUI.uploadFile(findTestObject('changshanghoutai/成品管理/新增编辑/input_成品图片'), PathHelper.getProjectAbsolutePath(chengpintupian))

'输入成品名称'
WebUI.setText(findTestObject('changshanghoutai/成品管理/新增编辑/input_成品名称'), chengpinmingcheng)

'输入成品型号'
WebUI.setText(findTestObject('changshanghoutai/成品管理/新增编辑/input_成品型号'), chengpinxinghao)

'输入尺寸长'
WebUI.setText(findTestObject('changshanghoutai/成品管理/新增编辑/input_长'), chang)

'输入尺寸宽'
WebUI.setText(findTestObject('changshanghoutai/成品管理/新增编辑/input_宽'), kuan)

'输入尺寸高'
WebUI.setText(findTestObject('changshanghoutai/成品管理/新增编辑/input_高'), gao)

'输入颜色'
WebUI.setText(findTestObject('changshanghoutai/成品管理/新增编辑/input_颜色'), yanse)

'输入重要特征'
WebUI.setText(findTestObject('changshanghoutai/成品管理/新增编辑/input_重要特性'), zhongyaotexing)

'选择计价单位'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/成品管理/新增编辑/select_计价单位'), '12', true)

'输入计数单位'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/成品管理/新增编辑/select_计数单位'), '13', true)

'输入备注'
WebUI.setText(findTestObject('changshanghoutai/成品管理/新增编辑/textarea_备注'), beizhu)

'点击提交'
WebUI.click(findTestObject('changshanghoutai/成品管理/新增编辑/button_提交'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

'验证新增'
WebUI.verifyElementText(findTestObject('changshanghoutai/成品管理/新增编辑/a_验证新增'), chengpinmingcheng, FailureHandling.STOP_ON_FAILURE)

