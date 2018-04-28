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

WebUI.callTestCase(findTestCase('xitongshezhi/zizhanghu/zizhanghu_jinru'), [:], FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.delay(2)

WebUiBuiltInKeywords.waitForElementVisible(findTestObject('changshanghoutai/系统设置/子账户/编辑/td_序号'), 0)

WebUI.click(findTestObject('changshanghoutai/系统设置/子账户/编辑/td_序号'))

WebUiBuiltInKeywords.waitForElementClickable(findTestObject('changshanghoutai/系统设置/子账户/编辑/i_fa-self-icon fa-self-edit-编辑图标'), 
    0)

WebUI.click(findTestObject('changshanghoutai/系统设置/子账户/编辑/i_fa-self-icon fa-self-edit-编辑图标'))

WebUiBuiltInKeywords.delay(0)

WebUiBuiltInKeywords.uploadFile(findTestObject('changshanghoutai/系统设置/子账户/编辑/input_files_上传头像'), dpjia.pathtool.PathHelper.getProjectAbsolutePath(
        findTestData('图片/yuanliaotupianku').getValue('路径', 1)))

WebUI.setText(findTestObject('changshanghoutai/系统设置/子账户/编辑/input_form-control_密码'), '123456')

WebUI.setText(findTestObject('changshanghoutai/系统设置/子账户/编辑/input_form-control-姓名'), '张三2')

WebUI.setText(findTestObject('changshanghoutai/系统设置/子账户/编辑/input_form-control-职务'), '2')

WebUI.setText(findTestObject('changshanghoutai/系统设置/子账户/编辑/input_form-control-手机号码'), '13111222222')

WebUI.setText(findTestObject('changshanghoutai/系统设置/子账户/编辑/input_form-control-固定电话'), '2')

WebUI.setText(findTestObject('changshanghoutai/系统设置/子账户/编辑/input_form-control-QQ号码'), '12312312')

WebUI.setText(findTestObject('changshanghoutai/系统设置/子账户/编辑/input_form-control-邮箱号码'), '111@212.com')

WebUI.selectOptionByValue(findTestObject('changshanghoutai/系统设置/子账户/编辑/select_用户身份'), '138', true)

WebUI.click(findTestObject('changshanghoutai/系统设置/子账户/编辑/button_提交'))

