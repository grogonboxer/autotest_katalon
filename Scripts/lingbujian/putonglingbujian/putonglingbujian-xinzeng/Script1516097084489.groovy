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

'点击普通零部件列表'
WebUI.click(findTestObject('changshanghoutai/零部件管理/左侧菜单/a_普通零部件列表'))

'新增'
WebUI.click(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)-/i_fa fa-plus'))

'输入部件名称'
WebUI.setText(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)- (1)/input_form-control'), '测试部件')

'选择一级分类-金属类'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)- (1)/select_form-control'), '16', 
    true)

'选择二级分类-一般金属'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)- (1)/select_form-control'), '30', 
    true)

'上传预览图'
WebUI.click(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)- (1)/div_box box-con'))

'提交'
WebUI.click(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)- (1)/button_'))

'审核'
WebUI.click(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)-/i_fa-self-icon fa-check-self'))

'输入审核内容'
WebUI.setText(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)-/textarea_addopinion'), '不�?�过')

'不通过审核'
WebUI.click(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)-/button_'))

'编辑普通零部件'
WebUI.click(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)-/i_fa-self-icon fa-self-edit'))

'修改名称'
WebUI.setText(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)- (2)/input_form-control'), '测试部件33')

'一级分类-玻璃'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)- (2)/select_form-control'), '14', 
    true)

'二级分类-一般玻璃'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)- (2)/select_form-control'), '29', 
    true)

'上传预览图'
WebUI.click(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)- (2)/button_'))

'提交'
WebUI.click(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)-/i_fa-self-icon fa-check-self'))

'审核通过\r\n'
WebUI.click(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)-/button_ (1)'))

'上架'
WebUI.click(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)-/i_fa-self-icon fa-self-up'))

'下架'
WebUI.click(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)-/i_fa-self-icon fa-self-down'))

'输入下架原因'
WebUI.setText(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)-/textarea_checkopinion'), '33')

'确定'
WebUI.click(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)-/button_ (2)'))

'查看下架原因'
WebUI.click(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)-/i_fa-self-icon fa-self-eye'))

'关闭弹出框'
WebUI.click(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)-/span_'))

'供货配置'
WebUI.click(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)-/i_fa-self-icon fa-self-product'))

'新增'
WebUI.click(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)- (3)/i_fa fa-plus'))

'选择供货商'
WebUI.click(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)- (3)/input_change_supplier'))

'输入供货周期'
WebUI.setText(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)- (3)/input_form-control'), '10')

'输入参考价格'
WebUI.setText(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)- (3)/input_form-control'), '110')

'确定'
WebUI.click(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)- (3)/button_'))

'设为默认'
WebUI.click(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)- (3)/input'))

'编辑供货信息'
WebUI.click(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)- (3)/i_fa-self-icon fa-self-edit'))

'修改供货商'
WebUI.click(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)- (3)/input_change_supplier (1)'))

'修改参考价格'
WebUI.setText(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)- (3)/input_form-control'), '120.00')

'确定'
WebUI.click(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)- (3)/button_'))

'删除供货商'
WebUI.click(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)- (3)/i_fa-self-icon fa-self-trash'))

'返回列表'
WebUI.click(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)- (3)/a_'))

'删除部件'
WebUI.click(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)-/i_fa-self-icon fa-self-trash'))

'输入删除部件的原因'
WebUI.setText(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)-/textarea_deletereason'), 'test')

'确定'
WebUI.click(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)-/button_ (3)'))

'点击部件回收站'
WebUI.click(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)-/a_'))

'查看删除原因'
WebUI.click(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)- (4)/i_fa-self-icon fa-self-eye'))

'关闭弹框'
WebUI.click(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)- (4)/span_'))

'还原部件'
WebUI.click(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)- (4)/i_fa-self-icon fa-self-recycle'))

'返回列表'
WebUI.click(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)- (4)/a_'))

'多选部件'
WebUI.click(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)-/input'))

'多选部件'
WebUI.click(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)-/input (1)'))

'多选部件'
WebUI.click(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)-/input (2)'))

'批量上架'
WebUI.click(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)-/button_ (4)'))

'删除部件'
WebUI.click(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)-/i_fa-self-icon fa-self-trash'))

'输入删除原因'
WebUI.setText(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)-/textarea_deletereason'), 'test')

'确定'
WebUI.click(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)-/button_ (3)'))

'点击部件回收站'
WebUI.click(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)-/a_'))

'彻底删除'
WebUI.click(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)- (4)/i_fa-self-icon fa-self-trash'))

'返回列表\r\n'
WebUI.click(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)- (4)/a_'))

'输入部件名称'
WebUI.setText(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)- (5)/input_form-control col-xs-4'), '屏风')

'点击搜索'
WebUI.click(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)- (5)/i_fa fa-search'))

'删除关键字'
WebUI.setText(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)- (5)/input_form-control col-xs-4'), '')

'点击搜索'
WebUI.click(findTestObject('changshanghoutai/lingbujianguanli/Page_(50)- (5)/i_fa fa-search'))

