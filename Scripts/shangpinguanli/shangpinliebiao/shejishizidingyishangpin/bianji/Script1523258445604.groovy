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

WebUI.callTestCase(findTestCase('shangpinguanli/shangpinliebiao/shejishizidingyishangpin/shejishizidingyishangpinliebiao'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('changshanghoutai/商品管理/商品列表/设计师自定义商品/编辑/i_编辑'))

WebUI.delay(5)

WebUI.uploadFile(findTestObject('changshanghoutai/商品管理/商品列表/设计师自定义商品/新增/input_商品图片'), PathHelper.getProjectAbsolutePath(
        url))

WebUI.delay(3)

WebUI.setText(findTestObject('changshanghoutai/商品管理/商品列表/设计师自定义商品/新增/input_商品名称'), '桌子01')

WebUI.setText(findTestObject('changshanghoutai/商品管理/商品列表/设计师自定义商品/新增/input_颜色'), '红色')

WebUI.setText(findTestObject('changshanghoutai/商品管理/商品列表/设计师自定义商品/新增/input_长'), '134')

WebUI.setText(findTestObject('changshanghoutai/商品管理/商品列表/设计师自定义商品/新增/input_宽'), '13455')

WebUI.setText(findTestObject('changshanghoutai/商品管理/商品列表/设计师自定义商品/新增/input_高'), '3874')

WebUI.setText(findTestObject('changshanghoutai/商品管理/商品列表/设计师自定义商品/新增/input_价格'), '10000')

WebUI.setText(findTestObject('changshanghoutai/商品管理/商品列表/设计师自定义商品/新增/input_数量'), '123')

WebUI.setText(findTestObject('changshanghoutai/商品管理/商品列表/设计师自定义商品/新增/textarea_材质'), 'mutou')

WebUI.setText(findTestObject('changshanghoutai/商品管理/商品列表/设计师自定义商品/新增/textarea_备注'), '青马轻纺')

WebUI.check(findTestObject('changshanghoutai/商品管理/商品列表/设计师自定义商品/新增/input_门店归属'))

WebUI.delay(3)

WebUI.selectOptionByIndex(findTestObject('changshanghoutai/商品管理/商品列表/设计师自定义商品/新增/select_所属门店'), 2)

WebUI.delay(5)

WebUI.selectOptionByIndex(findTestObject('changshanghoutai/商品管理/商品列表/设计师自定义商品/新增/select_所属销售员'), 1)

WebUI.delay(2)

WebUI.click(findTestObject('changshanghoutai/商品管理/商品列表/设计师自定义商品/新增/button_提交'))

