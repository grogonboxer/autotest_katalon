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

WebUI.callTestCase(findTestCase('xitongshezhi/jueseyuquanxian/jusequanxian_jinru'), [:], FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.delay(2)

WebUiBuiltInKeywords.waitForElementClickable(findTestObject('changshanghoutai/系统设置/角色与权限/新增/a_新增'), 0)

WebUI.click(findTestObject('changshanghoutai/系统设置/角色与权限/新增/a_新增'))

WebUiBuiltInKeywords.delay(2)

WebUI.setText(findTestObject('changshanghoutai/系统设置/角色与权限/新增/input_角色名称'), juesemingcheng)

WebUI.setText(findTestObject('changshanghoutai/系统设置/角色与权限/新增/textarea_form-control-角色描述'), miaoshu)

WebUiBuiltInKeywords.waitForElementClickable(findTestObject('changshanghoutai/系统设置/角色与权限/新增/button_查看'), 0)

WebUI.click(findTestObject('changshanghoutai/系统设置/角色与权限/新增/button_查看'))

WebUiBuiltInKeywords.waitForElementClickable(findTestObject('changshanghoutai/系统设置/角色与权限/新增/button_提交'), 0)

WebUI.click(findTestObject('changshanghoutai/系统设置/角色与权限/新增/button_提交'))

