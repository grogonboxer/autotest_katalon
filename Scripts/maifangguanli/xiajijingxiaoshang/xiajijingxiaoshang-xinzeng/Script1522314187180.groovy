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

WebUI.callTestCase(findTestCase('maifangguanli/xiajijingxiaoshang/xiajijingxiaoshang-dakaiyemian'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('changshanghoutai/卖方管理/下级经销商/a_新增'), 10)

WebUI.click(findTestObject('changshanghoutai/卖方管理/下级经销商/a_新增'))

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('changshanghoutai/卖方管理/下级经销商/新增/input_logo'), 10)

WebUI.uploadFile(findTestObject('changshanghoutai/卖方管理/下级经销商/新增/input_logo'), logo)

WebUI.waitForElementVisible(findTestObject('changshanghoutai/卖方管理/下级经销商/新增/input_三证合一'), 10)

WebUI.uploadFile(findTestObject('changshanghoutai/卖方管理/下级经销商/新增/input_三证合一'), allimages)

WebUI.waitForElementVisible(findTestObject('changshanghoutai/卖方管理/下级经销商/新增/input_经销商名称'), 10)

WebUI.setText(findTestObject('changshanghoutai/卖方管理/下级经销商/新增/input_经销商名称'), name)

WebUI.setText(findTestObject('changshanghoutai/卖方管理/下级经销商/新增/input_经销商账号'), number)

WebUI.setText(findTestObject('changshanghoutai/卖方管理/下级经销商/新增/input_密码'), pwd)

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('changshanghoutai/卖方管理/下级经销商/新增/select_服务区域'), serarea, false)

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('changshanghoutai/卖方管理/下级经销商/新增/select_服务区域省'), ser_pro, false)

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('changshanghoutai/卖方管理/下级经销商/新增/select_服务区域市'), ser_city, false)

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('changshanghoutai/卖方管理/下级经销商/新增/select_服务区域区'), ser_area, false)

WebUI.click(findTestObject('changshanghoutai/卖方管理/下级经销商/新增/button_添加服务区域按钮'))

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('changshanghoutai/卖方管理/下级经销商/新增/select_办公地址省'), office_pro, false)

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('changshanghoutai/卖方管理/下级经销商/新增/select_办公地址市'), office_city, false)

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('changshanghoutai/卖方管理/下级经销商/新增/select_办公地址区'), office_area, false)

WebUI.setText(findTestObject('changshanghoutai/卖方管理/下级经销商/新增/input_详细地址'), address)

WebUI.setText(findTestObject('changshanghoutai/卖方管理/下级经销商/新增/input_负责人'), header)

WebUI.setText(findTestObject('changshanghoutai/卖方管理/下级经销商/新增/input_联系电话'), link_mobile)

WebUI.setText(findTestObject('changshanghoutai/卖方管理/下级经销商/新增/input_电话'), tel)

WebUI.setText(findTestObject('changshanghoutai/卖方管理/下级经销商/新增/input_开户银行名称'), bank)

WebUI.setText(findTestObject('changshanghoutai/卖方管理/下级经销商/新增/input_银行开户名'), accountname)

WebUI.setText(findTestObject('changshanghoutai/卖方管理/下级经销商/新增/input_银行对公账户'), banknum)

WebUI.setText(findTestObject('changshanghoutai/卖方管理/下级经销商/新增/input_法人代表'), legaler)

WebUI.setText(findTestObject('changshanghoutai/卖方管理/下级经销商/新增/input_注册资金'), money)

WebUI.setText(findTestObject('changshanghoutai/卖方管理/下级经销商/新增/input_员工总数'), employees)

WebUI.setText(findTestObject('changshanghoutai/卖方管理/下级经销商/新增/input_有效期'), validity)

WebUI.setText(findTestObject('changshanghoutai/卖方管理/下级经销商/新增/input_创建时间'), createtime)

WebUI.setText(findTestObject('changshanghoutai/卖方管理/下级经销商/新增/textarea_文字介绍'), content)

WebUI.click(findTestObject('changshanghoutai/卖方管理/下级经销商/新增/button_提交'))

