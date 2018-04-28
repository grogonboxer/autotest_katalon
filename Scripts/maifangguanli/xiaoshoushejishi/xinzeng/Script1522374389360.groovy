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
import dpjia.pathtool.PathHelper as PathHelper

WebUI.callTestCase(findTestCase('maifangguanli/xiaoshoushejishi/xiaoshoushejishi_jinru'), [:], FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.delay(2)

WebUiBuiltInKeywords.waitForElementVisible(findTestObject('changshanghoutai/卖方管理/销售设计师/新增/span_设计师列表'), 0)

WebUI.click(findTestObject('changshanghoutai/卖方管理/销售设计师/新增/span_设计师列表'))

WebUiBuiltInKeywords.waitForElementClickable(findTestObject('changshanghoutai/卖方管理/销售设计师/新增/a_新增'), 0)

WebUI.click(findTestObject('changshanghoutai/卖方管理/销售设计师/新增/a_新增'))

WebUiBuiltInKeywords.delay(3)

WebUiBuiltInKeywords.waitForElementVisible(findTestObject('changshanghoutai/卖方管理/销售设计师/新增/span__新增设计师'), 0)

WebUI.setText(findTestObject('changshanghoutai/卖方管理/销售设计师/新增/input_uname_用户姓名'), yonghuxingming)

WebUI.setText(findTestObject('changshanghoutai/卖方管理/销售设计师/新增/input_username_用户账号'), yonghuzhanghao)

WebUI.setText(findTestObject('changshanghoutai/卖方管理/销售设计师/新增/input_pwd_密码'), mima)

WebUI.setText(findTestObject('changshanghoutai/卖方管理/销售设计师/新增/input_form-control-手机号'), shoujihao)

WebUI.setText(findTestObject('changshanghoutai/卖方管理/销售设计师/新增/input_form-control-电子邮箱'), dianziyouxiang)

WebUI.selectOptionByIndex(findTestObject('changshanghoutai/卖方管理/销售设计师/新增/select_选择所属'), 2)

WebUI.setText(findTestObject('changshanghoutai/卖方管理/销售设计师/新增/input_form-control_折扣'), zhekou)

WebUI.setText(findTestObject('changshanghoutai/卖方管理/销售设计师/新增/input_form-control-身份证号码'), shenfenzhenghao)

WebUI.selectOptionByValue(findTestObject('changshanghoutai/卖方管理/销售设计师/新增/select_性别'), '1', true)

WebUI.setText(findTestObject('changshanghoutai/卖方管理/销售设计师/新增/input_form-control-年龄'), '12')

WebUI.waitForElementVisible(findTestObject('changshanghoutai/卖方管理/销售设计师/新增/select_省_选择'), 0)

WebUI.selectOptionByValue(findTestObject('changshanghoutai/卖方管理/销售设计师/新增/select_省_选择'), '1', true)

WebUiBuiltInKeywords.delay(3)

WebUI.selectOptionByValue(findTestObject('changshanghoutai/卖方管理/销售设计师/新增/select__市_选择'), '1', true)

WebUiBuiltInKeywords.delay(5)

WebUI.selectOptionByValue(findTestObject('changshanghoutai/卖方管理/销售设计师/新增/select__区_选择'), '8', true)

WebUiBuiltInKeywords.delay(3)

WebUI.selectOptionByValue(findTestObject('changshanghoutai/卖方管理/销售设计师/新增/select_政治面貌'), 'league_members', true)

WebUI.selectOptionByValue(findTestObject('changshanghoutai/卖方管理/销售设计师/新增/select_学历'), 'master', true)

WebUI.setText(findTestObject('changshanghoutai/卖方管理/销售设计师/新增/textarea_col-md-5 form-control-设计师简介'), jianjie)

WebUI.setText(findTestObject('changshanghoutai/卖方管理/销售设计师/新增/textarea_form-control-设计师签名'), qianming)

WebUI.setText(findTestObject('changshanghoutai/卖方管理/销售设计师/新增/input_form-control-经验'), '1')

WebUI.uploadFile(findTestObject('changshanghoutai/卖方管理/销售设计师/新增/input_files-头像'), PathHelper.getProjectAbsolutePath(findTestData(
            '图片/yuanliaotupianku').getValue('路径', 1)))

WebUiBuiltInKeywords.delay(3)

WebUI.uploadFile(findTestObject('changshanghoutai/卖方管理/销售设计师/新增/input_files-正面照'), PathHelper.getProjectAbsolutePath(findTestData(
            '图片/yuanliaotupianku').getValue('路径', 1)))

WebUiBuiltInKeywords.delay(3)

WebUI.uploadFile(findTestObject('changshanghoutai/卖方管理/销售设计师/新增/input_files-反面照'), PathHelper.getProjectAbsolutePath(findTestData(
            '图片/yuanliaotupianku').getValue('路径', 1)))

WebUiBuiltInKeywords.delay(3)

WebUI.uploadFile(findTestObject('changshanghoutai/卖方管理/销售设计师/新增/input_files_作品图'), PathHelper.getProjectAbsolutePath(findTestData(
            '图片/yuanliaotupianku').getValue('路径', 1)))

WebUI.delay(5)

WebUI.click(findTestObject('changshanghoutai/卖方管理/销售设计师/新增/button_提交'))

WebUiBuiltInKeywords.delay(3)

WebUiBuiltInKeywords.waitForElementVisible(findTestObject('changshanghoutai/卖方管理/销售设计师/新增/span_设计师列表'), 0)

WebUI.click(findTestObject('changshanghoutai/卖方管理/销售设计师/新增/span_设计师列表'))

WebUiBuiltInKeywords.waitForElementVisible(findTestObject('changshanghoutai/卖方管理/销售设计师/新增/td_序号'), 0)

WebUI.click(findTestObject('changshanghoutai/卖方管理/销售设计师/新增/td_序号'))

WebUiBuiltInKeywords.waitForElementClickable(findTestObject('changshanghoutai/卖方管理/销售设计师/新增/i_fa-self-icon fa-check-self'), 
    0)

WebUI.click(findTestObject('changshanghoutai/卖方管理/销售设计师/新增/i_fa-self-icon fa-check-self'))

WebUiBuiltInKeywords.delay(3)

WebUI.setText(findTestObject('changshanghoutai/卖方管理/销售设计师/新增/textarea_addopinion_输入审核意见'), '通过')

WebUI.click(findTestObject('changshanghoutai/卖方管理/销售设计师/新增/button__通过审核'))

