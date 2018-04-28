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
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('maifangguanli/xiaoshoushejishi/xiaoshoushejishi_jinru'), [:], FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.delay(3)

WebUiBuiltInKeywords.waitForElementVisible(findTestObject('changshanghoutai/卖方管理/销售设计师/编辑/td_序号'), 0)

WebUI.click(findTestObject('changshanghoutai/卖方管理/销售设计师/编辑/td_序号'))

WebUiBuiltInKeywords.waitForElementClickable(findTestObject('changshanghoutai/卖方管理/销售设计师/编辑/i_fa-self-icon fa-self-edit-编辑按钮'), 
    0)

WebUI.click(findTestObject('changshanghoutai/卖方管理/销售设计师/编辑/i_fa-self-icon fa-self-edit-编辑按钮'))

WebUI.waitForPageLoad(5)

WebUiBuiltInKeywords.delay(10)

WebUI.setText(findTestObject('changshanghoutai/卖方管理/销售设计师/编辑/input_uname_用户姓名'), yonghuxingming)

WebUI.setText(findTestObject('changshanghoutai/卖方管理/销售设计师/编辑/input_form-control-修改折扣'), zhekou)

WebUI.setText(findTestObject('changshanghoutai/卖方管理/销售设计师/编辑/input_form-control_修改手机号'), shoujihao)

WebUI.delay(5)

WebUI.click(findTestObject('changshanghoutai/卖方管理/销售设计师/编辑/button_提交'))

WebUiBuiltInKeywords.delay(3)

WebUiBuiltInKeywords.waitForElementVisible(findTestObject('changshanghoutai/卖方管理/销售设计师/编辑/td_序号'), 0)

WebUI.click(findTestObject('changshanghoutai/卖方管理/销售设计师/编辑/td_序号'))

WebUiBuiltInKeywords.waitForElementClickable(findTestObject('changshanghoutai/卖方管理/销售设计师/编辑/i_fa-self-icon fa-check-self-审核图标'), 
    0)

WebUI.click(findTestObject('changshanghoutai/卖方管理/销售设计师/编辑/i_fa-self-icon fa-check-self-审核图标'))

WebUiBuiltInKeywords.delay(2)

WebUI.setText(findTestObject('changshanghoutai/卖方管理/销售设计师/编辑/textarea_addopinion_添加审核意见'), '编辑审核')

WebUI.click(findTestObject('changshanghoutai/卖方管理/销售设计师/编辑/button__通过审核'))

