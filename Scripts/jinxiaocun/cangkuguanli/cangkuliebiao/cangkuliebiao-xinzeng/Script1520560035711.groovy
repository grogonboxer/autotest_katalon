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

'等待仓库列表子菜单按钮'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/仓库管理/a_仓库列表'), 10)

'点击仓库列表'
WebUI.click(findTestObject('changshanghoutai/左侧菜单/仓库管理/a_仓库列表'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'点击新增按钮'
WebUI.click(findTestObject('changshanghoutai/仓库管理/仓库列表/新增编辑/a_新增'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('changshanghoutai/仓库管理/仓库列表/新增编辑/input_仓库名称'), 10)

'输入仓库名称'
WebUI.setText(findTestObject('changshanghoutai/仓库管理/仓库列表/新增编辑/input_仓库名称'), cangkumingcheng)

'点击设为默认'
WebUI.click(findTestObject('changshanghoutai/仓库管理/仓库列表/新增编辑/input_设为默认'), FailureHandling.STOP_ON_FAILURE)

'输入仓库编号'
WebUI.setText(findTestObject('changshanghoutai/仓库管理/仓库列表/新增编辑/input_仓库编号'), cangkubianhao)

WebUI.delay(1)

'选择省'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/仓库管理/仓库列表/新增编辑/select_选择省'), '1', true)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

'选择市'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/仓库管理/仓库列表/新增编辑/select_选择市'), '1', true)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

'选择区'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/仓库管理/仓库列表/新增编辑/select_选择区'), '4', true)

'输入详细地址'
WebUI.setText(findTestObject('changshanghoutai/仓库管理/仓库列表/新增编辑/input_详细地址'), xiangxidizhi)

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('changshanghoutai/仓库管理/仓库列表/新增编辑/select_仓库类型'), cangkuleixingmingcheng, false)

WebUI.delay(1)

'选择负责人'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/仓库管理/仓库列表/新增编辑/select_负责人'), '267', true)

'输入联系电话'
WebUI.setText(findTestObject('changshanghoutai/仓库管理/仓库列表/新增编辑/input_联系电话'), lianxidianhua)

'输入备注'
WebUI.setText(findTestObject('changshanghoutai/仓库管理/仓库列表/新增编辑/textarea_备注'), beizhu)

WebUI.click(findTestObject('changshanghoutai/仓库管理/仓库列表/新增编辑/button_提交'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4)

WebUI.verifyElementText(findTestObject('changshanghoutai/仓库管理/仓库列表/新增编辑/a_验证新增'), cangkumingcheng)

