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

WebUI.delay(3)

WebUI.setText(findTestObject('changshanghoutai/软件工具设置/品牌页配置/编辑/工程案例/成功案例/新增/input_案例标题'), '案例标题')

WebUI.setText(findTestObject('changshanghoutai/软件工具设置/品牌页配置/编辑/工程案例/成功案例/新增/input_案例排序'), '10')

WebUI.uploadFile(findTestObject('changshanghoutai/软件工具设置/品牌页配置/编辑/工程案例/成功案例/新增/input_封面图片'), PathHelper.getProjectAbsolutePath(
        url))

WebUI.delay(4)

WebUI.selectOptionByIndex(findTestObject('changshanghoutai/软件工具设置/品牌页配置/编辑/工程案例/成功案例/新增/select_省'), 1)

WebUI.delay(3)

WebUI.selectOptionByIndex(findTestObject('changshanghoutai/软件工具设置/品牌页配置/编辑/工程案例/成功案例/新增/select_市'), 1)

WebUI.delay(3)

WebUI.selectOptionByIndex(findTestObject('changshanghoutai/软件工具设置/品牌页配置/编辑/工程案例/成功案例/新增/select_区'), 2)

WebUI.delay(2)

WebUI.setText(findTestObject('changshanghoutai/软件工具设置/品牌页配置/编辑/工程案例/成功案例/新增/textarea_案例描述'), '案例描述')

WebUI.click(findTestObject('changshanghoutai/软件工具设置/品牌页配置/编辑/工程案例/成功案例/新增/button_添加案例图片'))

WebUI.delay(2)

WebUI.uploadFile(findTestObject('changshanghoutai/软件工具设置/品牌页配置/编辑/工程案例/成功案例/新增/添加案例图片/input_封面图片'), PathHelper.getProjectAbsolutePath(
        url))

WebUI.delay(4)

WebUI.setText(findTestObject('changshanghoutai/软件工具设置/品牌页配置/编辑/工程案例/成功案例/新增/添加案例图片/input_标题'), '标题')

WebUI.setText(findTestObject('changshanghoutai/软件工具设置/品牌页配置/编辑/工程案例/成功案例/新增/添加案例图片/input_排序'), '5')

WebUI.click(findTestObject('changshanghoutai/软件工具设置/品牌页配置/编辑/工程案例/成功案例/新增/添加案例图片/button_提交'))

WebUI.delay(5)

WebUI.click(findTestObject('changshanghoutai/软件工具设置/品牌页配置/编辑/工程案例/成功案例/新增/button_添加案例图片'))

WebUI.delay(2)

WebUI.uploadFile(findTestObject('changshanghoutai/软件工具设置/品牌页配置/编辑/工程案例/成功案例/新增/添加案例图片/input_封面图片'), PathHelper.getProjectAbsolutePath(
        url))

WebUI.delay(4)

WebUI.setText(findTestObject('changshanghoutai/软件工具设置/品牌页配置/编辑/工程案例/成功案例/新增/添加案例图片/input_标题'), '标题')

WebUI.setText(findTestObject('changshanghoutai/软件工具设置/品牌页配置/编辑/工程案例/成功案例/新增/添加案例图片/input_排序'), '5')

WebUI.click(findTestObject('changshanghoutai/软件工具设置/品牌页配置/编辑/工程案例/成功案例/新增/添加案例图片/button_提交'))

WebUI.delay(5)

WebUI.click(findTestObject('changshanghoutai/软件工具设置/品牌页配置/编辑/工程案例/成功案例/新增/添加案例图片/i_编辑'))

WebUI.delay(2)

WebUI.uploadFile(findTestObject('changshanghoutai/软件工具设置/品牌页配置/编辑/工程案例/成功案例/新增/添加案例图片/input_封面图片'), PathHelper.getProjectAbsolutePath(
        url))

WebUI.delay(4)

WebUI.setText(findTestObject('changshanghoutai/软件工具设置/品牌页配置/编辑/工程案例/成功案例/新增/添加案例图片/input_标题'), '111111')

WebUI.setText(findTestObject('changshanghoutai/软件工具设置/品牌页配置/编辑/工程案例/成功案例/新增/添加案例图片/input_排序'), '51')

WebUI.click(findTestObject('changshanghoutai/软件工具设置/品牌页配置/编辑/工程案例/成功案例/新增/添加案例图片/button_提交'))

WebUI.delay(3)

WebUI.click(findTestObject('changshanghoutai/软件工具设置/品牌页配置/编辑/工程案例/成功案例/新增/添加案例图片/i_删除'))

WebUI.acceptAlert()

WebUI.delay(1)

WebUI.click(findTestObject('changshanghoutai/软件工具设置/品牌页配置/编辑/工程案例/成功案例/新增/button_保存'))

