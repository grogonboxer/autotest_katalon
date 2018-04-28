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

WebUI.callTestCase(findTestCase('chanpinguanli/chanpinku/chanpinku_jinru'), [:], FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.delay(4)

WebUiBuiltInKeywords.waitForElementClickable(findTestObject('changshanghoutai/产品管理/产品库/新增标品/a_新增'), 0)

WebUI.click(findTestObject('changshanghoutai/产品管理/产品库/新增标品/a_新增'))

WebUiBuiltInKeywords.delay(2)

WebUI.selectOptionByValue(findTestObject('changshanghoutai/产品管理/产品库/新增标品/select_选择一级分类'), '31', true)

WebUiBuiltInKeywords.delay(4)

WebUI.selectOptionByValue(findTestObject('changshanghoutai/产品管理/产品库/新增标品/select_选择二级分类'), '51', true)

WebUiBuiltInKeywords.delay(4)

WebUI.selectOptionByValue(findTestObject('changshanghoutai/产品管理/产品库/新增标品/select_选择三级分类'), '85', true)

WebUiBuiltInKeywords.delay(1)

WebUI.click(findTestObject('changshanghoutai/产品管理/产品库/新增标品/button_下一步'))

WebUiBuiltInKeywords.delay(2)

WebUiBuiltInKeywords.setText(findTestObject('changshanghoutai/产品管理/产品库/新增标品/input_form-control-产品名称'), '一把椅子4')

WebUiBuiltInKeywords.setText(findTestObject('changshanghoutai/产品管理/产品库/新增标品/input_ml28 form-control-编码'), '18123')

WebUI.setText(findTestObject('changshanghoutai/产品管理/产品库/新增标品/input_form-control-型号'), '123')

WebUI.uploadFile(findTestObject('changshanghoutai/产品管理/产品库/新增标品/input_files_产品预览图'), PathHelper.getProjectAbsolutePath(findTestData(
            '图片/yuanliaotupianku').getValue('路径', 1)))

WebUI.selectOptionByValue(findTestObject('changshanghoutai/产品管理/产品库/新增标品/select_选择一级分组'), '3', true)

WebUiBuiltInKeywords.delay(4)

WebUI.selectOptionByValue(findTestObject('changshanghoutai/产品管理/产品库/新增标品/select_选择二级分组'), '5', true)

WebUiBuiltInKeywords.delay(4)

WebUI.selectOptionByValue(findTestObject('changshanghoutai/产品管理/产品库/新增标品/select_选择三级分组'), '6', true)

WebUiBuiltInKeywords.delay(3)

WebUI.setText(findTestObject('changshanghoutai/产品管理/产品库/新增标品/input_ml28 form-control-备注'), '有分组的椅子')

WebUI.click(findTestObject('changshanghoutai/产品管理/产品库/新增标品/button_完成'))

WebUiBuiltInKeywords.delay(2)

WebUiBuiltInKeywords.waitForElementVisible(findTestObject('changshanghoutai/产品管理/产品库/新增标品/a_产品组成'), 0)

WebUiBuiltInKeywords.click(findTestObject('changshanghoutai/产品管理/产品库/新增标品/a_产品组成'))

WebUiBuiltInKeywords.delay(2)

WebUiBuiltInKeywords.waitForElementClickable(findTestObject('changshanghoutai/产品管理/产品库/新增标品/button_产品组成_编辑'), 0)

WebUiBuiltInKeywords.click(findTestObject('changshanghoutai/产品管理/产品库/新增标品/button_产品组成_编辑'))

WebUiBuiltInKeywords.waitForElementClickable(findTestObject('changshanghoutai/产品管理/产品库/新增标品/button_产品组成_添加'), 0)

WebUiBuiltInKeywords.click(findTestObject('changshanghoutai/产品管理/产品库/新增标品/button_产品组成_添加'))

WebUI.uploadFile(findTestObject('changshanghoutai/产品管理/产品库/新增标品/input_files_产品信息_预览图'), dpjia.pathtool.PathHelper.getProjectAbsolutePath(
        findTestData('图片/yuanliaotupianku').getValue('路径', 1)))

WebUiBuiltInKeywords.setText(findTestObject('changshanghoutai/产品管理/产品库/新增标品/input_form-control_产品信息_配置名称'), '就是一个椅子')

WebUiBuiltInKeywords.setText(findTestObject('changshanghoutai/产品管理/产品库/新增标品/input_form-control_产品信息_尺寸'), '500*500*500')

WebUiBuiltInKeywords.setText(findTestObject('changshanghoutai/产品管理/产品库/新增标品/input_form-control_产品信息_颜色'), '白色')

WebUiBuiltInKeywords.setText(findTestObject('changshanghoutai/产品管理/产品库/新增标品/input_form-control_产品信息_其他规格'), '规格.高配')

WebUiBuiltInKeywords.setText(findTestObject('changshanghoutai/产品管理/产品库/新增标品/input_form-control_产品信息_配置代码'), '椅子就是椅子')

WebUiBuiltInKeywords.setText(findTestObject('changshanghoutai/产品管理/产品库/新增标品/input_form-control_产品信息_文字介绍'), '一个椅子的自白')

WebUiBuiltInKeywords.click(findTestObject('changshanghoutai/产品管理/产品库/新增标品/button_产品组成_完成'))

WebUiBuiltInKeywords.delay(1)

WebUI.click(findTestObject('changshanghoutai/产品管理/产品库/新增标品/a_产品图册'))

WebUiBuiltInKeywords.delay(2)

WebUI.click(findTestObject('changshanghoutai/产品管理/产品库/新增标品/button_产品图册_编辑'))

WebUI.uploadFile(findTestObject('changshanghoutai/产品管理/产品库/新增标品/input_files_产品图册_BOM图'), dpjia.pathtool.PathHelper.getProjectAbsolutePath(
        findTestData('图片/yuanliaotupianku').getValue('路径', 1)))

WebUI.uploadFile(findTestObject('changshanghoutai/产品管理/产品库/新增标品/input_files_产品图册_工艺图'), dpjia.pathtool.PathHelper.getProjectAbsolutePath(
        findTestData('图片/yuanliaotupianku').getValue('路径', 1)))

WebUI.uploadFile(findTestObject('changshanghoutai/产品管理/产品库/新增标品/input_files_产品图册_三视图'), dpjia.pathtool.PathHelper.getProjectAbsolutePath(
        findTestData('图片/yuanliaotupianku').getValue('路径', 1)))

WebUI.uploadFile(findTestObject('changshanghoutai/产品管理/产品库/新增标品/input_files_产品图册_孔位图'), dpjia.pathtool.PathHelper.getProjectAbsolutePath(
        findTestData('图片/yuanliaotupianku').getValue('路径', 1)))

WebUI.uploadFile(findTestObject('changshanghoutai/产品管理/产品库/新增标品/input_files_产品图册_其他图'), PathHelper.getProjectAbsolutePath(
        findTestData('图片/yuanliaotupianku').getValue('路径', 1)))

WebUiBuiltInKeywords.delay(5)

WebUI.click(findTestObject('changshanghoutai/产品管理/产品库/新增标品/button_产品图册_完成'))

WebUiBuiltInKeywords.delay(1)

WebUI.click(findTestObject('changshanghoutai/产品管理/产品库/新增标品/a_产品附件'))

WebUiBuiltInKeywords.delay(2)

WebUiBuiltInKeywords.click(findTestObject('changshanghoutai/产品管理/产品库/新增标品/button_产品附件_编辑'))

WebUiBuiltInKeywords.delay(1)

WebUiBuiltInKeywords.uploadFile(findTestObject('changshanghoutai/产品管理/产品库/新增标品/input_files_产品附件_上传附件'), PathHelper.getProjectAbsolutePath(
        findTestData('产品附件/chanpinfujian').getValue('附件路径', 1)))

WebUiBuiltInKeywords.delay(3)

WebUiBuiltInKeywords.click(findTestObject('changshanghoutai/产品管理/产品库/新增标品/button_产品附件_完成'))

WebUiBuiltInKeywords.delay(1)

WebUI.click(findTestObject('changshanghoutai/产品管理/产品库/新增标品/a_返回列表'))

WebUiBuiltInKeywords.delay(3)

WebUiBuiltInKeywords.waitForElementClickable(findTestObject('changshanghoutai/产品管理/产品库/新增标品/i_fa-self-icon fa-check-self-审核图标'), 
    0)

WebUI.click(findTestObject('changshanghoutai/产品管理/产品库/新增标品/i_fa-self-icon fa-check-self-审核图标'))

WebUiBuiltInKeywords.delay(2)

WebUI.setText(findTestObject('changshanghoutai/产品管理/产品库/新增标品/textarea_addopinion-审核意见'), '审核通过')

WebUI.click(findTestObject('changshanghoutai/产品管理/产品库/新增标品/button_通过审核'))

