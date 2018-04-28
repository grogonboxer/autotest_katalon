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

'1.点击订单管理'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50) (2)/span_'))

'2.点击报价单管理'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50) (2)/a_'))

'3.选择一个报价单，点击报价单号'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (4)/a_17112703024441701501'))

'4.返回列表'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (5)/a_'))

'5.点击修改按钮'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (4)/a_'))

'6.点击上一步'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (6)/button_'))

'7.输入收货人邮编'
WebUI.setText(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (6)/input_form-control'), '10005')

'8.输入收货人备注：重要，轻放'
WebUI.setText(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (6)/textarea_form-control'), '重要，轻放')

'9.点击下一步'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (6)/button_ (1)'))

'10.删除一个已有的商品：背柜'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (6)/i_fa fa-trash'))

'11.点击从商品库中添加'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (6)/i_fa fa-plus'))

'12.选择商品：搭配家（Dpjia）展会系列JLH7-TQ001前台（A区）'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (6)/i_fa fa-angle-down'))

'13.选中SKU：JLH7-TQ001'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (6)/input'))

'14.点击添加'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (6)/button_ (2)'))

'15.修改添加的商品价格'
WebUI.setText(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (6)/input_form-control text-center'), 
    '213.52')

'16.修改商品的数量'
WebUI.setText(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (6)/input_form-control text-center (1)'), 
    '7')

'17.点击出报价单'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (6)/button_ (3)'))

'18.修改报价单名称'
WebUI.setText(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (6)/input (1)'), '报价单00')

'19.修改合同编号'
WebUI.setText(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (6)/input (2)'), '886541127')

'20.修改订货日期'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (6)/td_15'))

'21.修改交货日期'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (6)/td_9'))

'22.修改付款方式'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (6)/select_form-control'), 
    'alipay', true)

'23.修改预付定金'
WebUI.setText(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (6)/input (3)'), '5000')

'24.修改报价单备注'
WebUI.setText(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (6)/textarea'), '报价单备注')

'25.点击完成'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (6)/button_ (5)'))

'26.点击查看详情'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (4)/a_'))

'27.点击返回列表'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (7)/a_'))

'28.点击报价记录'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (4)/a_'))

'29.点击返回列表'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (8)/a_'))

'30.点击取消报价单'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (4)/a_'))

'31.输入取消原因'
WebUI.setText(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (4)/textarea_checkopinion'), '不合格，暂时无法生产')

'32.点击确定'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (4)/button_'))

'33.点击查看取消原因'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (4)/a_'))

'34.点击关闭按钮'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (4)/span_'))

'35.点击已取消TAB'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (4)/a_ (1)'))

'36.点击还原报价单'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (4)/a_'))

'37.点击报价中tab'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (4)/a_ (2)'))

'38.点击下单'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (4)/a_'))

'39.点击已下单tab'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(51)-/a_'))

'40.输入报价单号：17112703303166605148'
WebUI.setText(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(51)-/input_form-control'), '17112703303166605148')

'41.点击搜索'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(51)-/i_fa fa-search'))

'42.清空搜索条件'
WebUI.setText(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(51)-/input_form-control'), '')

'43.点击搜索'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(51)-/i_fa fa-search'))

