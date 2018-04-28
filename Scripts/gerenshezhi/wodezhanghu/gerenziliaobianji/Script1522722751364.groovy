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

WebUI.callTestCase(findTestCase('gerenshezhi/wodezhanghu/wodezhanghu_jinru'), [:], FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.delay(3)

WebUI.uploadFile(findTestObject('changshanghoutai/个人设置/我的账户/个人资料编辑/input_files_头像'), PathHelper.getProjectAbsolutePath(findTestData(
            '图片/yuanliaotupianku').getValue('路径', 1)))

WebUiBuiltInKeywords.delay(3)

WebUI.setText(findTestObject('changshanghoutai/个人设置/我的账户/个人资料编辑/input_form-control_姓名'), xingming)

WebUI.setText(findTestObject('changshanghoutai/个人设置/我的账户/个人资料编辑/input_form-control_手机号码'), shoujihaoma)

WebUI.setText(findTestObject('changshanghoutai/个人设置/我的账户/个人资料编辑/input_form-control_qq'), QQ)

WebUI.setText(findTestObject('changshanghoutai/个人设置/我的账户/个人资料编辑/input_form-control_邮箱'), youxiang)

WebUI.click(findTestObject('changshanghoutai/个人设置/我的账户/个人资料编辑/button_提交'))

