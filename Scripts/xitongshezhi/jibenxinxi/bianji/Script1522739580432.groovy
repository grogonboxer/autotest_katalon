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

WebUI.callTestCase(findTestCase('xitongshezhi/jibenxinxi/jibenxinxi_jinru'), [:], FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.delay(2)

WebUI.uploadFile(findTestObject('changshanghoutai/系统设置/基本信息/编辑/input_files_公司logo'), PathHelper.getProjectAbsolutePath(findTestData(
            '图片/yuanliaotupianku').getValue('路径', 1)))

if (true) {
    WebUI.click(findTestObject('changshanghoutai/系统设置/基本信息/编辑/button_三证合一'))

    WebUiBuiltInKeywords.delay(1)

    WebUiBuiltInKeywords.waitForElementClickable(findTestObject('changshanghoutai/系统设置/基本信息/编辑/input_files_三证合一'), 0)

    WebUI.uploadFile(findTestObject('changshanghoutai/系统设置/基本信息/编辑/input_files_三证合一'), PathHelper.getProjectAbsolutePath(
            findTestData('图片/yuanliaotupianku').getValue('路径', 1)))

    WebUiBuiltInKeywords.delay(2)
} else {
    WebUI.click(findTestObject('changshanghoutai/系统设置/基本信息/编辑/button_分开上传'))

    WebUiBuiltInKeywords.delay(1)

    WebUiBuiltInKeywords.waitForElementClickable(findTestObject('changshanghoutai/系统设置/基本信息/编辑/input_files_营业执照'), 0)

    WebUI.uploadFile(findTestObject('changshanghoutai/系统设置/基本信息/编辑/input_files_营业执照'), PathHelper.getProjectAbsolutePath(
            findTestData('图片/yuanliaotupianku').getValue('路径', 1)))

    WebUiBuiltInKeywords.delay(2)

    WebUI.uploadFile(findTestObject('changshanghoutai/系统设置/基本信息/编辑/input_files_组织机构代码证'), PathHelper.getProjectAbsolutePath(
            findTestData('图片/yuanliaotupianku').getValue('路径', 1)))

    WebUiBuiltInKeywords.delay(2)

    WebUI.uploadFile(findTestObject('changshanghoutai/系统设置/基本信息/编辑/input_files_税务登记证'), PathHelper.getProjectAbsolutePath(
            findTestData('图片/yuanliaotupianku').getValue('路径', 1)))

    WebUiBuiltInKeywords.delay(2)
}

WebUI.setText(findTestObject('changshanghoutai/系统设置/基本信息/编辑/input_公司简称'), '京乐科技')

WebUI.setText(findTestObject('changshanghoutai/系统设置/基本信息/编辑/input_公司全称'), '搭配家')

WebUI.selectOptionByValue(findTestObject('changshanghoutai/系统设置/基本信息/编辑/select_省'), '1', true)

WebUI.selectOptionByValue(findTestObject('changshanghoutai/系统设置/基本信息/编辑/select_市'), '1', true)

WebUI.selectOptionByValue(findTestObject('changshanghoutai/系统设置/基本信息/编辑/select_区'), '8', true)

WebUI.setText(findTestObject('changshanghoutai/系统设置/基本信息/编辑/input_form-control-详细地址'), '北京市海淀区学院路7号')

WebUI.setText(findTestObject('changshanghoutai/系统设置/基本信息/编辑/input_form-control-负责人'), '肖敏')

WebUI.setText(findTestObject('changshanghoutai/系统设置/基本信息/编辑/input_form-control-联系电话'), '010-82306781')

WebUI.setText(findTestObject('changshanghoutai/系统设置/基本信息/编辑/input_form-control-电话'), '1')

WebUI.setText(findTestObject('changshanghoutai/系统设置/基本信息/编辑/input_form-control-开户银行'), '1')

WebUI.setText(findTestObject('changshanghoutai/系统设置/基本信息/编辑/input_form-control-银行开户名'), '1')

WebUI.setText(findTestObject('changshanghoutai/系统设置/基本信息/编辑/input_form-control-银行对公账户'), '1')

WebUI.setText(findTestObject('changshanghoutai/系统设置/基本信息/编辑/input_form-control-有效期'), '1')

WebUI.setText(findTestObject('changshanghoutai/系统设置/基本信息/编辑/input_form-control pull-right-创建时间'), '2018-04-03')

WebUI.setText(findTestObject('changshanghoutai/系统设置/基本信息/编辑/textarea_form-control-简介'), '搭配家隶属于北京京乐网络技术有限公司，以3D虚拟现实技术和云计算为技术核心，推动整个家居行业互联网化业务的高新技术企业。搭配家首创云设计、云量房、云展示、云制造，于2015年年初逐步上线迭代，并应用到家居行业，帮助家具企业在营销，管理，服务上全面互联网化。\n搭配家帮助家居企业利用现有的产品、体验店、品牌价值以及研发能力的资源，结合搭配家提供的管理工具、评价体系、订单系统、3D设计、网络平台等进行有机融合，加速产业互联网推动。')

WebUI.click(findTestObject('changshanghoutai/系统设置/基本信息/编辑/button_提交'))

