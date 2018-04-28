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

WebUI.callTestCase(findTestCase('ruanjiangongjushezhi/pinpaiyepeizhi/bianji'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('changshanghoutai/软件工具设置/品牌页配置/编辑/开关设置/span_LOGO设置'), 4)

WebUI.click(findTestObject('changshanghoutai/软件工具设置/品牌页配置/编辑/开关设置/span_LOGO设置'))

WebUI.waitForElementVisible(findTestObject('changshanghoutai/软件工具设置/品牌页配置/编辑/LOGO设置/i_编辑'), 2)

WebUI.click(findTestObject('changshanghoutai/软件工具设置/品牌页配置/编辑/LOGO设置/i_编辑'))

WebUI.waitForElementVisible(findTestObject('changshanghoutai/软件工具设置/品牌页配置/编辑/LOGO设置/button_完成'), 3)

WebUI.delay(3)

WebUI.uploadFile(findTestObject('changshanghoutai/软件工具设置/品牌页配置/编辑/LOGO设置/input_上传图片'), PathHelper.getProjectAbsolutePath(
        localimage))

WebUI.click(findTestObject('changshanghoutai/软件工具设置/品牌页配置/编辑/LOGO设置/button_完成'))

