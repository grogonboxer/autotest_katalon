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

WebUI.callTestCase(findTestCase('denglu'), [:], FailureHandling.STOP_ON_FAILURE)

'等待左侧栏列表出现'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/零部件管理/左侧菜单/span_零部件管理'), 30)

'点击零部件管理'
WebUI.click(findTestObject('changshanghoutai/零部件管理/左侧菜单/span_零部件管理'))

'等待衣柜零部件按钮出现'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/零部件管理/左侧菜单/a_衣柜零部件列表'), 30)

'点击衣柜零部件'
WebUI.click(findTestObject('changshanghoutai/零部件管理/左侧菜单/a_衣柜零部件列表'))

'等待零部件列表出现'
WebUI.waitForAlert(2, FailureHandling.STOP_ON_FAILURE)

'点击新增按钮'
WebUI.click(findTestObject('changshanghoutai/零部件管理/衣柜零部件/列表页/a_新增'))

'等待新增页'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/零部件管理/衣柜零部件/新增页/通用信息/input_名称'), 30)

'点击上传预览图'
WebUI.uploadFile(findTestObject('changshanghoutai/零部件管理/衣柜零部件/新增页/通用信息/input_files_上传衣柜零部件预览图'), PathHelper.getProjectAbsolutePath(
        '/Data Files/衣柜零部件/平开门.png'))

'输入部件名称'
WebUI.setText(findTestObject('changshanghoutai/零部件管理/衣柜零部件/新增页/通用信息/input_名称'), bujianmingcheng)

'输入部件型号'
WebUI.setText(findTestObject('changshanghoutai/零部件管理/衣柜零部件/新增页/通用信息/input_部件型号'), bujianxinghao)

'等待一级分类选项出现'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/零部件管理/衣柜零部件/新增页/通用信息/select_一级分类选项'), 30)

'选择一级分类'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/零部件管理/衣柜零部件/新增页/通用信息/select_一级分类'), '5', true)

'等待二级分类下拉内容出现'
WebUI.waitForElementPresent(findTestObject('changshanghoutai/零部件管理/衣柜零部件/新增页/通用信息/select_二级分类选项'), 30)

'选择所属二级分类'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/零部件管理/衣柜零部件/新增页/通用信息/select_二级分类'), '42', true)

'输入最大尺寸长'
WebUI.setText(findTestObject('changshanghoutai/零部件管理/衣柜零部件/新增页/基本信息/input_最大尺寸-长'), zuidachicunchang)

'输入最大尺寸宽'
WebUI.setText(findTestObject('changshanghoutai/零部件管理/衣柜零部件/新增页/基本信息/input_最大尺寸-宽'), zuidachicunkuan)

'输入最大尺寸深'
WebUI.setText(findTestObject('changshanghoutai/零部件管理/衣柜零部件/新增页/基本信息/input_最大尺寸-厚'), zuidachicunshen)

'输入最小尺寸长'
WebUI.setText(findTestObject('changshanghoutai/零部件管理/衣柜零部件/新增页/基本信息/input_最小尺寸-长'), zuixiaochicunchang)

'输入最小尺寸宽'
WebUI.setText(findTestObject('changshanghoutai/零部件管理/衣柜零部件/新增页/基本信息/input_最小尺寸-宽'), zuixiaochicunkuan)

'输入最小尺寸深'
WebUI.setText(findTestObject('changshanghoutai/零部件管理/衣柜零部件/新增页/基本信息/input_最小尺寸-厚'), zuixiaochicunshen)

'输入默认尺寸长'
WebUI.setText(findTestObject('changshanghoutai/零部件管理/衣柜零部件/新增页/基本信息/input_默认尺寸-长'), morenchicunchang)

'输入默认尺寸宽'
WebUI.setText(findTestObject('changshanghoutai/零部件管理/衣柜零部件/新增页/基本信息/input_默认尺寸-宽'), morenchicunkuan)

'输入默认尺寸厚'
WebUI.setText(findTestObject('changshanghoutai/零部件管理/衣柜零部件/新增页/基本信息/input_默认尺寸-厚'), morenchicunshen)

'输入部件区域'
WebUI.setText(findTestObject('changshanghoutai/零部件管理/衣柜零部件/新增页/基本信息/input_部件区域'), bujianquyu)

'材质名称'
WebUI.setText(findTestObject('changshanghoutai/零部件管理/衣柜零部件/新增页/基本信息/input_材质名称'), caizhimingcheng)

'输入材质文字描述'
WebUI.setText(findTestObject('changshanghoutai/零部件管理/衣柜零部件/新增页/基本信息/input_材质文字描述'), caizhimiaoshu)

'输入备注'
WebUI.setText(findTestObject('changshanghoutai/零部件管理/衣柜零部件/新增页/基本信息/textarea_备注'), beizhu)

'点击可用原料'
WebUI.click(findTestObject('changshanghoutai/零部件管理/衣柜零部件/新增页/Tab/a_可用原料Tab'))

'等待原料新增'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/零部件管理/衣柜零部件/新增页/可用原料/a_可用原料新增'), 30)

'点击新增'
WebUI.click(findTestObject('changshanghoutai/零部件管理/衣柜零部件/新增页/可用原料/a_可用原料新增'))

'等待原料新增页'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/零部件管理/衣柜零部件/新增页/可用原料/td_可选原料表格数据'), 10)

'选择原料'
WebUI.click(findTestObject('changshanghoutai/零部件管理/衣柜零部件/新增页/可用原料/input_check_可用原料1'))

'选择原料'
WebUI.click(findTestObject('changshanghoutai/零部件管理/衣柜零部件/新增页/可用原料/input_check_可用原料2'))

'选择原料'
WebUI.click(findTestObject('changshanghoutai/零部件管理/衣柜零部件/新增页/可用原料/input_check_可用原料3'))

'滚动到确认按钮'
WebUI.scrollToElement(findTestObject('changshanghoutai/零部件管理/衣柜零部件/新增页/可用原料/button_选择可用原料确认按钮'), 10)

'点击确认'
WebUI.click(findTestObject('changshanghoutai/零部件管理/衣柜零部件/新增页/可用原料/button_选择可用原料确认按钮'))

WebUI.waitForElementVisible(findTestObject('changshanghoutai/零部件管理/衣柜零部件/新增页/可用原料/input_可用原料单选框'), 30)

'点击基本信息'
WebUI.click(findTestObject('changshanghoutai/零部件管理/衣柜零部件/新增页/Tab/a_基本信息Tab'))

WebUI.waitForElementVisible(findTestObject('changshanghoutai/零部件管理/衣柜零部件/新增页/基本信息/input_默认尺寸-宽'), 30)

WebUI.click(findTestObject('changshanghoutai/零部件管理/衣柜零部件/新增页/基本信息/div_材质预览图上传按钮容器'))

'上传材质预览图'
WebUI.uploadFile(findTestObject('changshanghoutai/零部件管理/衣柜零部件/新增页/基本信息/input_file_上传材质预览图'), PathHelper.getProjectAbsolutePath(
        '/Data Files/衣柜零部件/平开门材质预览.jpg'))

WebUI.waitForAlert(2)

WebUI.scrollToElement(findTestObject('changshanghoutai/零部件管理/衣柜零部件/新增页/button_提交'), 10)

'点击提交\r\n'
WebUI.click(findTestObject('changshanghoutai/零部件管理/衣柜零部件/新增页/button_提交'))

