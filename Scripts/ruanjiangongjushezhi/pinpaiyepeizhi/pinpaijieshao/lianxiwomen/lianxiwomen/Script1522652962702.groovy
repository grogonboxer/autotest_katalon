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

WebUI.callTestCase(findTestCase('ruanjiangongjushezhi/pinpaiyepeizhi/pinpaijieshao/jinrupinpaijieshao'), [('url') : findTestData('图片/yuanliaotupianku').getValue('路径', 1)
        , ('localimage') : findTestData('图片/yuanliaotupianku').getValue('路径', 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.mouseOver(findTestObject('changshanghoutai/软件工具设置/品牌页配置/编辑/品牌介绍/联系我们/div_联系我们'))

WebUI.click(findTestObject('changshanghoutai/软件工具设置/品牌页配置/编辑/品牌介绍/联系我们/span_编辑'))

WebUI.delay(3)

WebUI.setText(findTestObject('changshanghoutai/软件工具设置/品牌页配置/编辑/品牌介绍/联系我们/input_品牌名称'), 'dpjia')

WebUI.delay(1)

WebUI.setText(findTestObject('changshanghoutai/软件工具设置/品牌页配置/编辑/品牌介绍/联系我们/input_公司地址'), '弘彧大厦')

WebUI.delay(1)

WebUI.setText(findTestObject('changshanghoutai/软件工具设置/品牌页配置/编辑/品牌介绍/联系我们/input_公司邮箱'), '12344556@qq.com')

WebUI.delay(1)

WebUI.setText(findTestObject('changshanghoutai/软件工具设置/品牌页配置/编辑/品牌介绍/联系我们/input_联系电话'), '1329832932023')

WebUI.delay(1)

WebUI.uploadFile(findTestObject('changshanghoutai/软件工具设置/品牌页配置/编辑/品牌介绍/联系我们/input_微信二维码'), PathHelper.getProjectAbsolutePath(
        url))

WebUI.delay(5)

WebUI.click(findTestObject('changshanghoutai/软件工具设置/品牌页配置/编辑/品牌介绍/联系我们/button_保存'))

