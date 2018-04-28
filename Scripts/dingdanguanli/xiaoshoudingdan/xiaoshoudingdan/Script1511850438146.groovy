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

WebUI.callTestCase(findTestCase('denglu'), [:], FailureHandling.STOP_ON_FAILURE)

'等待左侧列表刷新出来'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/basicsetting/Page_ (1)/sidebar-product'), 30)

'1.点击订单管理'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(51)/span_'))

'等待响应\r\n'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_/a_'), 30)

'2.点击订单列表'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(51)/a_'))

'等待列表数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_/Page_(92)-/li_daishenhe'), 
    30)

'3.切换TAB为待审核'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(51)-/a_'))

'等待列表数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_/Page_(92)-/li_daishenhe'), 
    30)

'4.点击订单号进入详情'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(51)-/a_1711271535546302796'))

'等待详情数据出现'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_/Page_(92)-/span_tijiaodingdandaishenhe'), 
    30)

'5.点击返回列表'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(51)- (1)/a_'))

'等待列表数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_/Page_(92)-/li_daishenhe'), 
    30)

'3.切换TAB为待审核'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(51)-/a_'))

'等待列表数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_/Page_(92)-/li_daishenhe'), 
    30)

'6.点击查看详情'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(51)-/a_ (2)'))

'等待详情数据出现'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_/Page_(92)-/span_tijiaodingdandaishenhe'), 
    30)

'7.点击返回列表'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(51)- (1)/a_'))

'等待列表数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_/Page_(92)-/li_daishenhe'), 
    30)

'3.切换TAB为待审核'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(51)-/a_'))

'等待列表数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_/Page_(92)-/li_daishenhe'), 
    30)

'8.点击取消订单'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(51)-/a_ (2) - quxiaodingdan'))

'等待取消订单弹出框'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_/Page_(92)-/h4_quxiaodingdan'), 
    30)

'9.输入取消原因'
WebUI.setText(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(51)-/textarea_inputopinion'), '取消原因')

'10，点击取消'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(51)-/button_quxiaoanniu'))

'等待列表数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_/Page_(92)-/li_daishenhe'), 
    30)

'3.切换TAB为待审核'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(51)-/a_'))

'等待列表数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_/Page_(92)-/li_daishenhe'), 
    30)

'11.点击取消订单'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(51)-/a_ (2) - quxiaodingdan'))

'等待取消订单弹出框'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_/Page_(92)-/h4_quxiaodingdan'), 
    30)

'12.输入取消原因'
WebUI.setText(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(51)-/textarea_inputopinion'), '取消原因')

'13.点击确定'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(51)-/button_ (1)'))

'等待列表数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_/Page_(92)-/a_'), 30)

'14.点击查看原因'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(51)-/a_ (2) -chakanyuanyin'))

'等待查看原因弹出框'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_/Page_(92)-/h4_chakanquxiaoyuanyin'), 
    30)

'15.点击关闭按钮'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(51)-/span_'))

'16.选择待审核tab'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(51)-/a_'))

'等待待审核数据出现'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_/Page_(92)-/li_daishenhe'), 
    30)

'17.选择订单，点击确认订单'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(51)-/a_ (2) - querendingdan'))

'等待确认按钮出现'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_/Page_(92)-/button_querendingdan'), 
    30)

'18.点击改价'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(51)- (2)/a_'))

'19.调整单价+'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(51)- (2)/select_selecttype'), 
    '+', true)

'20.输入加的价格'
WebUI.setText(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(51)- (2)/input_inputmoney'), '120')

'21.点击确认'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(51)- (2)/a_ (1)'))

'22.添加运费价格'
WebUI.setText(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(51)- (2)/input'), '186')

'23.输入优惠金额'
WebUI.setText(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(51)- (2)/input'), '48')

'24.确认'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(51)- (2)/button_'))

'等待待传合同列表出现\r\n'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_/Page_(92)-/li_daichuanhetong'), 
    30)

'25.选择待传合同tab'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(53)-/a_'))

'等待待传合同列表出现\r\n'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_/Page_(92)-/li_daichuanhetong'), 
    30)

'26.点击上传合同按钮'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(53)-/a_ (1)'))

'等待上传合同弹框\r\n'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_/Page_(92)-/h4_hetongtankuang'), 
    30)

'27.输入甲方信息'
WebUI.setText(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(53)-/input_form-jiafang'), '甲方')

'28.输入乙方信息'
WebUI.setText(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(53)-/input_form-yifang'), '乙方')

'29.输入合同编号'
WebUI.setText(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(53)-/input_form-hetongbianhao'), '11896321')

'30.输入合同金额'
WebUI.setText(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(53)-/input_form-hetongjine'), '3500')

'31.输入合同名称'
WebUI.setText(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(53)-/input_form-jiafang - hetongmingcheng'), 
    '名称')

'32.选择合同要求交货时间'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(53)-/td_30'))

'33.选择预计交货时间'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(53)-/td_9'))

'34.选择订货日期'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(53)-/td_15'))

'35.输入预付定金'
WebUI.setText(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(53)-/input_form-jiafang -yufudingjin'), 
    '5000')

'36.选择支付方式'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(53)-/select_form-control'), 
    'alipay', true)

'37.选择是否提供发票'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(53)-/select_form-control-fapiao'), 
    '1', true)

'38.上传合同附件'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(53)-/div_form-group'))

'39.点击确定'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(53)-/button_'))

'等待列表数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_/Page_(92)-/li_daishenhe'), 
    30)

'40.点击待派单tab'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(55)-/a_'))

'等待列表数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_/Page_(92)-/li_daipaidan'), 
    30)

'42.找到刚刚编辑的订单，查看合同'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(55)-/a_ (1)'))

'等待列表数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_/Page_(92)-/h4_hetongtankuang'), 
    30)

'43.点击关闭'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(55)-/span_'))

'等待列表数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_/Page_(92)-/li_daipaidan'), 
    30)

'44.点击管理变更'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(55)-/a_ (1)'))

'45.选择变更后的值'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(55)-/td_9'))

'46.选择变更发生的时间'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(55)-/td_14'))

'47.输入变更记录'
WebUI.setText(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(55)-/textarea_form-control'), '工厂无法按时完成')

'48.点击确定'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(55)-/button_'))

'等待列表数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_/Page_(92)-/li_daipaidan'), 
    30)

'49.点击查看变更'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(55)-/a_ (1)'))

'等待弹框出现'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_/Page_(93)-/div_modal-header'), 
    30)

'50.点击关闭按钮'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(55)-/span_ (1)'))

'等待列表数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_/Page_(92)-/li_daipaidan'), 
    30)

'51.点击确认收款'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(55)-/a_ (1)'))

'52.选择交易类型'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(55)-/select_form-control'), 
    'quality_retention', true)

'53.选择交易方式'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(55)-/select_form-control2'), 
    'wechat', true)

'54.输入交易金额'
WebUI.setText(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(55)-/input_form-control'), '2500')

'55.输入交易人'
WebUI.setText(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(55)-/input_jiaoyiren'), '熊')

'56.输入交易时间'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(55)-/td_21'))

'57.输入备注'
WebUI.setText(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(55)-/textarea_form-control (1)'), '第一笔款项到账')

'58.提交'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(55)-/button_ (1)'))

'59.点击关闭按钮'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(55)-/span_ (2)'))

'等待列表数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_/Page_(92)-/li_daipaidan'), 
    30)

'60.点击查看详情'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(55)-/a_ (1)'))

'等待详情数据出现'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_/Page_(92)-/span_tijiaodingdandaishenhe'), 
    30)

'61.点击返回列表'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_(55)- (1)/a_'))

'等待列表数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/dingdanliebiao/Page_/Page_(92)-/li_daipaidan'), 
    30)

WebUI.closeBrowser()

