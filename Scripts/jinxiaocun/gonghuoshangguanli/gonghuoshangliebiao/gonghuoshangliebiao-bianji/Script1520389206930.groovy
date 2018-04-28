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

'等待供货商管理菜单按钮出现\r\n'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/供货商管理/span_供货商管理'), 10)

'滚动到供货商管理菜单'
WebUI.scrollToElement(findTestObject('changshanghoutai/左侧菜单/供货商管理/span_供货商管理'), 10)

'点击供货商管理菜单按钮'
WebUI.click(findTestObject('changshanghoutai/左侧菜单/供货商管理/span_供货商管理'), FailureHandling.STOP_ON_FAILURE)

'等待供货商列表菜单按钮出现'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/供货商管理/a_供货商列表'), 10)

'点击供货商列表按钮'
WebUI.click(findTestObject('changshanghoutai/左侧菜单/供货商管理/a_供货商列表'), FailureHandling.STOP_ON_FAILURE)

'等待供货商列表数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/供货商管理/供货商列表/新增编辑/i_编辑'), 10)

'点击新增按钮'
WebUI.click(findTestObject('changshanghoutai/供货商管理/供货商列表/新增编辑/i_编辑'), FailureHandling.STOP_ON_FAILURE)

'等待新增供货商页'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/供货商管理/供货商列表/新增编辑/select_选择内部外部类型'), 10)

'选择供货商类型'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/供货商管理/供货商列表/新增编辑/select_选择内部外部类型'), '外部', true)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('changshanghoutai/供货商管理/供货商列表/新增编辑/select_选择类型'), 'manufacturer', true)

'输入供货商简称'
WebUI.setText(findTestObject('changshanghoutai/供货商管理/供货商列表/新增编辑/input_简称'), gonghuoshangjiancheng)

'输入供货商全称'
WebUI.setText(findTestObject('changshanghoutai/供货商管理/供货商列表/新增编辑/input_全称'), gonghuoshangquancheng)

'输入供货商编号'
WebUI.setText(findTestObject('changshanghoutai/供货商管理/供货商列表/新增编辑/input_编号'), gonghuoshangbianhao)

'选择所属区域'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/供货商管理/供货商列表/新增编辑/select_选择所属区域'), '18', true)

'选择联系地址-省'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/供货商管理/供货商列表/新增编辑/select_选择省'), '9', true)

'选择联系地址-市'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/供货商管理/供货商列表/新增编辑/select_选择市'), '73', true)

'选择联系地址-区'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/供货商管理/供货商列表/新增编辑/select_选择区'), '725', true)

'输入详情地址'
WebUI.setText(findTestObject('changshanghoutai/供货商管理/供货商列表/新增编辑/input_详细地址'), xiangxidizhi)

'选择所属分类'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/供货商管理/供货商列表/新增编辑/select_所属分类'), '24', true)

'输入联系人姓名'
WebUI.setText(findTestObject('changshanghoutai/供货商管理/供货商列表/新增编辑/input_联系人姓名'), lianxirenxingming)

'输入手机号码'
WebUI.setText(findTestObject('changshanghoutai/供货商管理/供货商列表/新增编辑/input_手机号码'), shoujihao)

'输入座机'
WebUI.setText(findTestObject('changshanghoutai/供货商管理/供货商列表/新增编辑/input_座机'), zuoji)

'输入邮箱'
WebUI.setText(findTestObject('changshanghoutai/供货商管理/供货商列表/新增编辑/input_邮箱'), youxiang)

'备注'
WebUI.setText(findTestObject('changshanghoutai/供货商管理/供货商列表/新增编辑/textarea_备注'), beizhu)

'点击确定'
WebUI.click(findTestObject('changshanghoutai/供货商管理/供货商列表/新增编辑/button_确定'), FailureHandling.STOP_ON_FAILURE)

