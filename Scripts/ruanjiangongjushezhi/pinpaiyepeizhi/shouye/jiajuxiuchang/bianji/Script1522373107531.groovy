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

WebUI.callTestCase(findTestCase('ruanjiangongjushezhi/pinpaiyepeizhi/shouye/jiajuxiuchang/jinrujiajuxiuchang'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('changshanghoutai/软件工具设置/品牌页配置/编辑/首页/家具秀场/新增/button_新增'), 4)

WebUI.delay(5)

WebUI.click(findTestObject('changshanghoutai/软件工具设置/品牌页配置/编辑/首页/家具秀场/编辑/i_编辑'))

WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('changshanghoutai/软件工具设置/品牌页配置/编辑/首页/家具秀场/新增/button_完成'), 4)

WebUI.setText(findTestObject('changshanghoutai/软件工具设置/品牌页配置/编辑/首页/家具秀场/新增/input_图片标题'), 'ashfdgfghjg')

WebUI.setText(findTestObject('changshanghoutai/软件工具设置/品牌页配置/编辑/首页/家具秀场/新增/textarea_文字描述'), 'fgdhfgdhhg')

WebUI.setText(findTestObject('changshanghoutai/软件工具设置/品牌页配置/编辑/首页/家具秀场/新增/input_跳转链接'), 'ghffhgfghd')

WebUI.click(findTestObject('changshanghoutai/软件工具设置/品牌页配置/编辑/首页/家具秀场/新增/button_完成'))

