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

WebUI.callTestCase(findTestCase('denglu'), [:], FailureHandling.STOP_ON_FAILURE)

'等待左侧列表刷新出来'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/basicsetting/Page_ (1)/sidebar-product'), 30)

'点击订单管理'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)/i_fa fa-calculator'))

'等待响应\r\n'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_/a_'), 30)

'点击报价单列表'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)/a_'))

'等待列表出现\r\n'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_/li_baojiazhong'), 30)

'点击新增按钮'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)-/i_fa fa-plus'))

'等待新增栏出现'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_/div_box-mendianxinxi'), 
    10)

'选择门店归属：公司直属'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/select_form-control'), 
    'company', true)

'等待门店选框出现数据'
WebUI.waitForAlert(2)

'选择所属门店：京乐家具学院路店'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_/Page_(83)-/select_form-MD'), 
    '167', true)

'等待数据刷新'
WebUI.waitForAlert(2, FailureHandling.STOP_ON_FAILURE)

'选择销售设计师：用户492'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_/Page_(83)-/select_form-SJS'), 
    '492', true)

'点击下一步'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/button_'))

'等按钮出现\r\n'
WebUI.waitForElementClickable(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(91)-/button_btn btn-xinzengkehu'), 
    30)

'点击新增按钮'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(91)-/button_btn btn-xinzengkehu'))

'等待新增客户页出现'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_/Page_(83)- (1)/div_modal-xinzengkehu'), 
    5)

'输入客户简称：熊'
WebUI.setText(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/input_form-control'), '熊')

'输入顾客全程：北京京乐技术有限公司'
WebUI.setText(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_/Page_(83)- (1)/input_form-quancheng'), 
    '北京京乐技术有限公司')

'选择顾客类型：办公'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_/Page_(83)- (1)/select_form-kehuleixing'), 
    '2', true)

'保存'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/button_ (1)'))

'd等待所属客户栏出现'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_/Page_(91)-/select_form-'), 
    5)

'选择新增的客户'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/select_form-control (2)'), 
    '2200', true)

'新增收货人地址'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_/button_btn btn-xinzengdizhi'))

'等待新增客户栏出现'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/input_form-control (1)'), 
    5)

'输入联系人：熊文征'
WebUI.setText(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/input_form-control (1)'), '熊文征')

'输入联系电话15910900357'
WebUI.setText(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/input_form-control-phone'), 
    '15910900357')

'选择送货地址：北京'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/select_form-control (sheng)'), 
    '1', true)

WebUI.waitForAlert(1)

'选择北京'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/select_form-control (shi) '), 
    '1', true)

WebUI.waitForAlert(2)

'选择海淀区'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/select_form-control (qu)'), 
    '8', true)

'输入详情地址：学院路7号弘彧大厦313'
WebUI.setText(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/input_form-control (xiangxidizhi)'), 
    '学院路7号弘彧大厦313')

'保存'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/button_ (2)'))

'选择新增的收货地址'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/select_form-control-dizhixuanze'), 
    '1045', true)

'输入收货人邮编：10000'
WebUI.setText(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/input_form-control-youbian'), 
    '10000')

'输入收货人备注：重要客户'
WebUI.setText(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/Page_(91)-/textarea_form-beizhu'), 
    '重要客户')

'点击下一步'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/button_ shouhuoxinxi'))

'点击从商品库添加'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/i_fa fa-plus (1)'))

'等待列表序号的出现'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/Page_(91)-/td_liebiaoxuhao'), 
    5)

'点击搜索'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/span_'))

WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/Page_(91)-/td_liebiaoxuhao'), 
    10)

'选择用途为办公'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/select_form-control (4)'), 
    '2', true)

'点击搜索'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/span_'))

WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/Page_(91)-/td_liebiaoxuhao'), 
    10)

'品牌为嘉利信德'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/select_form-control (5)'), 
    '198', true)

'点击搜索'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/span_'))

WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/Page_(91)-/td_liebiaoxuhao'), 
    10)

'系列为嘉利信得\r\n'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/select_form-control (6)'), 
    '317', true)

'点击搜索'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/span_'))

WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/Page_(91)-/td_liebiaoxuhao'), 
    10)

'选择二级分类：椅类'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/select_form-control-erjifenlei'), 
    '23', true)

'点击搜索'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/span_'))

WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/Page_(91)-/td_liebiaoxuhao'), 
    10)

'选择三级分类：礼堂椅'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/select_form-control-sanjifenlei'), 
    '243', true)

'点击搜索'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/span_'))

WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/Page_(91)-/td_liebiaoxuhao'), 
    10)

'点击商品：嘉利信得（JIALIXINDE）嘉利信得系列XD-XX-1003礼堂椅的操作按钮'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/i_fa fa-angle-down'))

WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/input'), 10)

'勾选SKU：布（蓝）'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/input'))

'点击添加按钮'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/button_ (3)'))

'等待添加的数据出现'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/Page_(91)-/td_tianjiashangpinliebiao'), 
    10)

'点击从商品库添加'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/button_ (4)'))

'等待输入框出现'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/input_form-control (3)'), 
    10)

'输入搜索条件：搭配家（Dpjia）搭配家系列定制工位'
WebUI.setText(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/input_form-control (3)'), '搭配家（Dpjia）搭配家系列定制工位')

'点击搜索'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/span_'))

WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/Page_(91)-/td_Dpjia'), 
    10)

'点击商品：搭配家（Dpjia）搭配家系列定制工位的操作按钮'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/i_fa fa-angle-down'))

'选中sku：单人工作位F6-BD407'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/input'))

'选中sku：私人工作位F6-BD403'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/input (1)'))

'点击添加按钮'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/button_ (3)'))

'等待添加的数据出现'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/Page_(91)-/td_tianjiashangpinliebiao'), 
    10)

'添加自定义商品'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/button_ (5)'))

'选择二级分类：椅类'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/select_form-control (zidingyierjifenlei)'), 
    '23', true)

'点击搜索'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/span_'))

WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/input'), 10)

'选择三级分类：课桌椅'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/select_form-control (zidingyisanjifenlei)'), 
    '240', true)

'点击搜索'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/span_'))

WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/input'), 10)

'勾选商品：员工椅'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/input (2)'))

'点击添加'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/button_ (3)'))

'等待添加的数据出现'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/Page_(91)-/td_tianjiashangpinliebiao'), 
    10)

'输入单价260'
WebUI.setText(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/input_form-control text-center'), 
    '260.00')

'输入单价1000'
WebUI.setText(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/input_form-control text-center (1)'), 
    '1000.00')

'输入单价2243'
WebUI.setText(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/input_form-control text-center (2)'), 
    '2243.00')

'输入单价1233'
WebUI.setText(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/input_form-control text-center (3)'), 
    '1233.00')

'点击出报价单'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/button_ (6)'))

'输入报价单备注：备注：快速出货'
WebUI.setText(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/textarea'), '备注：快速出库')

'输入合同编号20171121001'
WebUI.setText(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/input (3)'), '20171121001')

'选择订货日期2017-11-21'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/td_21'))

'输入预付定金1000'
WebUI.setText(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/input (4)'), '1000')

'选择交货日期2017-12-29'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/th_'))

'.选择交货日期2017-12-29'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/td_29'))

'点击导出'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/button_ (7)'))

'点击完成'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (1)/button_ (8)'))

