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

WebUI.callTestCase(findTestCase('denglu'), [('url') : findTestData('account/登录').getValue('网址', 1), ('username') : findTestData(
            'account/登录').getValue('用户名', 1), ('password') : findTestData('account/登录').getValue('密码', 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/软件工具设置/span_软件工具设置'), 5)

WebUI.scrollToElement(findTestObject('changshanghoutai/左侧菜单/软件工具设置/span_软件工具设置'), 0)

WebUI.click(findTestObject('changshanghoutai/左侧菜单/软件工具设置/span_软件工具设置'))

WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/软件工具设置/a_pad首页设置'), 5)

WebUI.click(findTestObject('changshanghoutai/左侧菜单/软件工具设置/a_pad首页设置'))

WebUI.delay(3)

not_run: WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/软件工具设置/span_启用'), 5)

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('changshanghoutai/左侧菜单/软件工具设置/span_禁用'))

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('changshanghoutai/左侧菜单/软件工具设置/span_上升排序'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('changshanghoutai/左侧菜单/软件工具设置/span_下降排序'))

not_run: WebUI.delay(5)

WebUI.scrollToElement(findTestObject('changshanghoutai/左侧菜单/软件工具设置/img_轮播图设置'), 0)

WebUI.mouseOver(findTestObject('changshanghoutai/左侧菜单/软件工具设置/img_轮播图设置'))

WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/软件工具设置/img_点击轮播图设置'), 0)

WebUI.click(findTestObject('changshanghoutai/左侧菜单/软件工具设置/img_点击轮播图设置'))

WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/软件工具设置/button_添加轮播图'), 3)

WebUI.click(findTestObject('changshanghoutai/左侧菜单/软件工具设置/button_添加轮播图'))

WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/软件工具设置/input_标题'), 3)

WebUI.setText(findTestObject('changshanghoutai/左侧菜单/软件工具设置/input_标题'), '222222')

WebUI.click(findTestObject('changshanghoutai/左侧菜单/软件工具设置/input_看大图'))

WebUI.delay(2)

WebUI.click(findTestObject('changshanghoutai/左侧菜单/软件工具设置/input_外部链接'))

WebUI.setText(findTestObject('changshanghoutai/左侧菜单/软件工具设置/input_外部链接输入'), 'www.baidu.com')

WebUI.delay(2)

WebUI.click(findTestObject('changshanghoutai/左侧菜单/软件工具设置/input_内部链接'))

WebUI.delay(2)

WebUI.setText(findTestObject('changshanghoutai/左侧菜单/软件工具设置/input_分类关键字'), '123123213')

WebUI.delay(2)

WebUI.selectAllOption(findTestObject('changshanghoutai/左侧菜单/软件工具设置/select_新品推荐'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.uploadFile(findTestObject('changshanghoutai/左侧菜单/软件工具设置/input_选择上传轮播图'), PathHelper.getProjectAbsolutePath(lunbotutupian))

WebUI.delay(5)

WebUI.click(findTestObject('changshanghoutai/左侧菜单/软件工具设置/button_保存新增的轮播图'))

WebUI.delay(5)

WebUI.click(findTestObject('changshanghoutai/左侧菜单/软件工具设置/span_关闭添加轮播图'))

WebUI.delay(2)

WebUI.click(findTestObject('changshanghoutai/左侧菜单/软件工具设置/div_发布首页设置'))

