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

'点击零部件管理'
WebUI.click(findTestObject('changshanghoutai/零部件管理/左侧菜单/span_零部件管理'))

'点击工位零部件列表\r\n'
WebUI.click(findTestObject('changshanghoutai/零部件管理/左侧菜单/a_工位零部件列表'))

'新增'
WebUI.click(findTestObject('changshanghoutai/零部件管理/工位零部件/新增编辑/i_新增'))

'输入部件名称'
WebUI.setText(findTestObject('changshanghoutai/零部件管理/工位零部件/新增编辑/input_部件名称'), '测试名称')

'输入部件型号'
WebUI.setText(findTestObject('changshanghoutai/零部件管理/工位零部件/新增编辑/input_部件型号'), '测试型号')

'选择部件二级分类-支撑'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/零部件管理/工位零部件/新增编辑/select_二级分类'), '3', true)

'选择部件三级分类-支撑腿'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/零部件管理/工位零部件/新增编辑/select_三级分类'), '9', true)

'输入板部件材质名称'
WebUI.setText(findTestObject('changshanghoutai/零部件管理/工位零部件/新增编辑/input_材质名称'), '黑色')

'输入部件材质均价'
WebUI.setText(findTestObject('changshanghoutai/零部件管理/工位零部件/新增编辑/input_材质均价'), '110')

'选择品牌分类 嘉利信得'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/零部件管理/工位零部件/新增编辑/select_品牌分类'), '198', true)

'选择系列分类  嘉利信得'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/零部件管理/工位零部件/新增编辑/select_系列分类'), '317', true)

'点击部件规格-不变规格'
WebUI.click(findTestObject('changshanghoutai/零部件管理/工位零部件/新增编辑/input_不变规格'))

'输入A'
WebUI.setText(findTestObject('changshanghoutai/零部件管理/工位零部件/新增编辑/input_尺寸A'), '900')

'输入B'
WebUI.setText(findTestObject('changshanghoutai/零部件管理/工位零部件/新增编辑/input_尺寸B'), '1600')

'上传图片'
WebUI.uploadFile(findTestObject('changshanghoutai/零部件管理/工位零部件/新增编辑/input_files_部件图片'), findTestData('图片/gongweitupianku').getValue(
        '路径', 2))

'提交'
WebUI.click(findTestObject('changshanghoutai/零部件管理/工位零部件/新增编辑/button_提交'))

WebUI.closeBrowser()

