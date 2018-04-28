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

WebUI.openBrowser('')

'点击建材管理'
WebUI.click(findTestObject('changshanghoutai/jiancaiguanli/tianhuabanguanli/Page_(50)/span_'))

'点击天花板管理'
WebUI.click(findTestObject('changshanghoutai/jiancaiguanli/tianhuabanguanli/Page_(50)/a_'))

'点击新增'
WebUI.click(findTestObject('changshanghoutai/jiancaiguanli/tianhuabanguanli/Page_(50)-/i_fa fa-plus'))

'上传天花板图片'
WebUI.click(findTestObject('changshanghoutai/jiancaiguanli/tianhuabanguanli/Page_(50)-/img_preview'))

'输入天花板名称'
WebUI.setText(findTestObject('changshanghoutai/jiancaiguanli/tianhuabanguanli/Page_(50)-/input_form-control'), 'testtianhuaban')

'选择天花板用途-办公'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/jiancaiguanli/tianhuabanguanli/Page_(50)-/select_form-control'), 
    '2', true)

'选择三级分类-天花板'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/jiancaiguanli/tianhuabanguanli/Page_(50)-/select_form-control'), 
    '10', true)

'选择材质分类-陶瓷'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/jiancaiguanli/tianhuabanguanli/Page_(50)-/select_form-control'), 
    '16', true)

'选择风格分类-古典中式'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/jiancaiguanli/tianhuabanguanli/Page_(50)-/select_form-control'), 
    '29', true)

'勾选空间分类-教师'
WebUI.click(findTestObject('changshanghoutai/jiancaiguanli/tianhuabanguanli/Page_(50)-/input_aprt_group_21'))

'勾选空间分类-办公室'
WebUI.click(findTestObject('changshanghoutai/jiancaiguanli/tianhuabanguanli/Page_(50)-/input_aprt_group_19'))

'提交'
WebUI.click(findTestObject('changshanghoutai/jiancaiguanli/tianhuabanguanli/Page_(50)-/button_'))

'直接启用待审核的天花板'
WebUI.click(findTestObject('changshanghoutai/jiancaiguanli/tianhuabanguanli/Page_(50)-/span_switch-plug'))

'审核'
WebUI.click(findTestObject('changshanghoutai/jiancaiguanli/tianhuabanguanli/Page_(50)-/i_fa-self-icon fa-check-self'))

'输入审核意见'
WebUI.setText(findTestObject('changshanghoutai/jiancaiguanli/tianhuabanguanli/Page_(50)-/textarea_addopinion'), 'butongguo')

'不通过审核'
WebUI.click(findTestObject('changshanghoutai/jiancaiguanli/tianhuabanguanli/Page_(50)-/button_ (1)'))

'查看原因'
WebUI.click(findTestObject('changshanghoutai/jiancaiguanli/tianhuabanguanli/Page_(50)-/i_fa-self-icon fa-self-eye'))

'关闭弹框'
WebUI.click(findTestObject('changshanghoutai/jiancaiguanli/tianhuabanguanli/Page_(50)-/span_'))

'编辑'
WebUI.click(findTestObject('changshanghoutai/jiancaiguanli/tianhuabanguanli/Page_(50)-/i_fa-self-icon fa-self-edit'))

'上传天花板图片'
WebUI.click(findTestObject('changshanghoutai/jiancaiguanli/tianhuabanguanli/Page_(50)-/div_modal-body'))

'输入天花板名称'
WebUI.setText(findTestObject('changshanghoutai/jiancaiguanli/tianhuabanguanli/Page_(50)-/input_form-control'), 'testtianhuaban1')

'选择天花板用途-民用\r\n'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/jiancaiguanli/tianhuabanguanli/Page_(50)-/select_form-control'), 
    '1', true)

'选择天花板用途-办公'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/jiancaiguanli/tianhuabanguanli/Page_(50)-/select_form-control'), 
    '2', true)

'选择三级分类-天花板'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/jiancaiguanli/tianhuabanguanli/Page_(50)-/select_form-control'), 
    '10', true)

'选择默认拉伸方式-平铺'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/jiancaiguanli/tianhuabanguanli/Page_(50)-/select_form-control'), 
    'repeat', true)

'选择材质分类-大理石'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/jiancaiguanli/tianhuabanguanli/Page_(50)-/select_form-control'), 
    '15', true)

'选择风格分类-科技型办公'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/jiancaiguanli/tianhuabanguanli/Page_(50)-/select_form-control'), 
    '23', true)

'勾选空间分类-阅览室'
WebUI.click(findTestObject('changshanghoutai/jiancaiguanli/tianhuabanguanli/Page_(50)-/input_aprt_group_22'))

'勾选空间分类-会客厅'
WebUI.click(findTestObject('changshanghoutai/jiancaiguanli/tianhuabanguanli/Page_(50)-/input_aprt_group_16'))

'提交'
WebUI.click(findTestObject('changshanghoutai/jiancaiguanli/tianhuabanguanli/Page_(50)-/button_'))

'审核'
WebUI.click(findTestObject('changshanghoutai/jiancaiguanli/tianhuabanguanli/Page_(50)-/i_fa-self-icon fa-check-self'))

'通过审核'
WebUI.click(findTestObject('changshanghoutai/jiancaiguanli/tianhuabanguanli/Page_(50)-/button_ (2)'))

'禁用'
WebUI.click(findTestObject('changshanghoutai/jiancaiguanli/tianhuabanguanli/Page_(50)-/span_switch-plug'))

'输入禁用原因'
WebUI.setText(findTestObject('changshanghoutai/jiancaiguanli/tianhuabanguanli/Page_(50)-/textarea_checkopinion'), '禁用')

'确定'
WebUI.click(findTestObject('changshanghoutai/jiancaiguanli/tianhuabanguanli/Page_(50)-/button_ (3)'))

'查看原因'
WebUI.click(findTestObject('changshanghoutai/jiancaiguanli/tianhuabanguanli/Page_(50)-/i_fa-self-icon fa-self-eye'))

'关闭弹窗'
WebUI.click(findTestObject('changshanghoutai/jiancaiguanli/tianhuabanguanli/Page_(50)-/span_'))

'启用'
WebUI.click(findTestObject('changshanghoutai/jiancaiguanli/tianhuabanguanli/Page_(50)-/span_switch-plug'))

'删除'
WebUI.click(findTestObject('changshanghoutai/jiancaiguanli/tianhuabanguanli/Page_(50)-/i_fa-self-icon fa-self-trash'))

'切换天花板-模板'
WebUI.click(findTestObject('changshanghoutai/jiancaiguanli/tianhuabanguanli/Page_(50)-/a_'))

'启用禁用状态的墙天花板'
WebUI.click(findTestObject('changshanghoutai/jiancaiguanli/tianhuabanguanli/Page_(50)- (1)/span_switch-plug'))

'禁用启用状态的天花板'
WebUI.click(findTestObject('changshanghoutai/jiancaiguanli/tianhuabanguanli/Page_(50)- (1)/span_switch-plug (1)'))

WebUI.closeBrowser()

