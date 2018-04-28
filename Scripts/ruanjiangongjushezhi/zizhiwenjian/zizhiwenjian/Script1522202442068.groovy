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

WebUI.callTestCase(findTestCase('denglu'), [('url') : findTestData('account/登录').getValue('网址', 1), ('username') : findTestData(
            'account/登录').getValue('用户名', 1), ('password') : findTestData('account/登录').getValue('密码', 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/软件工具设置/span_软件工具设置'), 3)

WebUI.scrollToElement(findTestObject('changshanghoutai/左侧菜单/软件工具设置/span_软件工具设置'), 0)

WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/软件工具设置/span_软件工具设置'), 3)

WebUI.click(findTestObject('changshanghoutai/左侧菜单/软件工具设置/span_软件工具设置'))

WebUI.click(findTestObject('changshanghoutai/左侧菜单/软件工具设置/zizhiwenjian/Page_/a_'))

WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/软件工具设置/img_品牌资质'), 4)

WebUI.mouseOver(findTestObject('changshanghoutai/左侧菜单/软件工具设置/img_品牌资质'))

WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/软件工具设置/img_编辑品牌资质'), 3)

WebUI.click(findTestObject('changshanghoutai/左侧菜单/软件工具设置/zizhiwenjian/Page_logo-/img_hover'))

WebUI.click(findTestObject('changshanghoutai/左侧菜单/软件工具设置/zizhiwenjian/Page_logo-/button_'))

WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/软件工具设置/input_本地上传'), 5)

WebUI.uploadFile(findTestObject('changshanghoutai/左侧菜单/软件工具设置/input_本地上传'), PathHelper.getProjectAbsolutePath(zizhitupian))

WebUI.click(findTestObject('changshanghoutai/左侧菜单/软件工具设置/button_取消添加资质文件'))

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/软件工具设置/button_添加品牌资质'), 5)

WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/软件工具设置/a_编辑资质文件'), 5)

WebUI.click(findTestObject('changshanghoutai/左侧菜单/软件工具设置/a_编辑资质文件'))

WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/软件工具设置/button_取消添加资质文件'), 5)

WebUI.click(findTestObject('changshanghoutai/左侧菜单/软件工具设置/button_取消添加资质文件'))

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/软件工具设置/a_删除资质文件'), 5)

WebUI.click(findTestObject('changshanghoutai/左侧菜单/软件工具设置/a_删除资质文件'))

