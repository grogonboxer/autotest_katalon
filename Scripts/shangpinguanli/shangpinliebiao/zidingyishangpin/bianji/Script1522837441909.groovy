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

WebUI.callTestCase(findTestCase('shangpinguanli/shangpinliebiao/zidingyishangpin/zidingyishangpin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/编辑/i_编辑'))

WebUI.delay(3)

WebUI.setText(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/新增/input_商品名称'), '商品名称01')

WebUI.setText(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/新增/input_商品型号'), 'xinghao-1')

not_run: WebUI.selectOptionByIndex(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/新增/select_商品用途'), 1)

not_run: WebUI.delay(3)

WebUI.setText(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/新增/input_商品编码'), 'spbm01')

not_run: WebUI.selectOptionByIndex(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/新增/select_所属品牌'), 3)

not_run: WebUI.delay(3)

not_run: WebUI.selectOptionByIndex(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/新增/select_所属系列'), 1)

not_run: WebUI.delay(3)

not_run: WebUI.selectOptionByIndex(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/新增/select_商品分类一级'), 8)

not_run: WebUI.delay(3)

not_run: WebUI.selectOptionByIndex(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/新增/select_商品分类二级'), 9)

WebUI.delay(2)

WebUI.check(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/新增/input_行业分类'))

WebUI.delay(2)

WebUI.check(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/新增/input_风格分类'))

WebUI.delay(2)

WebUI.check(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/新增/input_空间分类'))

WebUI.delay(2)

WebUI.check(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/新增/input_材质分类'))

WebUI.click(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/新增/span_开启规格'))

WebUI.delay(4)

WebUI.check(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/新增/input_颜色'))

WebUI.delay(1)

WebUI.check(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/新增/input_尺寸'))

WebUI.delay(1)

WebUI.check(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/新增/input_版本'))

WebUI.delay(1)

WebUI.click(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/新增/button_提交'))

WebUI.delay(3)

WebUI.setText(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/新增/input_名称必填1'), '名称1')

WebUI.setText(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/新增/input_商城价1'), '111')

WebUI.setText(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/新增/input_折扣价1'), '11')

WebUI.setText(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/新增/input_库存1'), '11')

WebUI.setText(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/新增/input_货号1'), 'huohao0001')

WebUI.setText(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/新增/input_文字介绍'), 'wenzjjieshao')

WebUI.uploadFile(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/新增/input_预览图1'), PathHelper.getProjectAbsolutePath(url))

WebUI.delay(3)

WebUI.click(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/新增/i_添加'))

WebUI.delay(5)

WebUI.check(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/新增/input_默认sku2'))

WebUI.setText(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/新增/input_名称2'), '名称2')

WebUI.click(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/新增/td_颜色'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/新增/li_颜色'))

WebUI.click(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/新增/td_尺寸'))

WebUI.delay(2)

WebUI.click(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/新增/li_尺寸'))

WebUI.delay(1)

WebUI.click(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/新增/td_版本'))

WebUI.delay(2)

WebUI.click(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/新增/li_版本'))

WebUI.setText(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/新增/input_商城价2'), '2222')

WebUI.setText(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/新增/input_折扣价2'), '222')

WebUI.setText(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/新增/input_库存2'), '22')

WebUI.setText(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/新增/input_货号2'), 'huohao2')

WebUI.setText(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/新增/input_文字介绍2'), 'wenzijiesho222')

WebUI.delay(3)

not_run: WebUI.uploadFile(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/新增/input_预览图2'), PathHelper.getProjectAbsolutePath(
        url2))

WebUI.delay(3)

WebUI.check(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/新增/input_默认sku2'))

WebUI.click(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/新增/i_删除2'))

WebUI.delay(2)

WebUI.click(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/新增/i_删除1'))

WebUI.acceptAlert()

WebUI.delay(1)

WebUI.setText(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/新增/input_包装毛重'), '100')

WebUI.delay(1)

WebUI.setText(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/新增/input_包装体积'), '2323')

WebUI.setText(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/新增/textarea_商品广告语'), '商品广告语')

WebUI.uploadFile(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/新增/input_商品首页效果图'), PathHelper.getProjectAbsolutePath(
        url))

WebUI.delay(3)

WebUI.uploadFile(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/新增/input_商品介绍图'), PathHelper.getProjectAbsolutePath(url2))

WebUI.delay(3)

WebUI.uploadFile(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/新增/input_商品情景图'), PathHelper.getProjectAbsolutePath(url))

WebUI.delay(3)

WebUI.uploadFile(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/新增/input_尺寸图解图'), PathHelper.getProjectAbsolutePath(url))

WebUI.delay(3)

WebUI.uploadFile(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/新增/input_家具对比图'), PathHelper.getProjectAbsolutePath(url2))

WebUI.delay(3)

WebUI.uploadFile(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/新增/input_配货安装图'), PathHelper.getProjectAbsolutePath(url2))

WebUI.delay(3)

not_run: WebUI.setText(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/新增/p_文字介绍'), 'wenzijieshao')

WebUI.click(findTestObject('changshanghoutai/商品管理/商品列表/自定义商品/新增/button_提交保存'))

