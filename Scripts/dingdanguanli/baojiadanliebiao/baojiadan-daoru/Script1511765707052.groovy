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
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50) (1)/span_'))

'2.点击报价单管理'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50) (1)/a_'))

'3.点击导入按钮旁边的？'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (2)/i_fa fa-question-circle'))

'4.点击下载EXCEL模板'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (2)/a_excel'))

'5.点击关闭按钮'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (2)/span_'))

'6.点击导入按钮'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (2)/span_'))

'7.导入错误格式的文件'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (2)/div_...'))

'8.点击导入按钮'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (2)/span_'))

'9.导入内容不符合要求的EXCEL文件'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (2)/div_'))

'10.导入正确格式的EXCEL文件'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (2)/ol_breadcrumb'))

'11.点击报价单记录中的来源-展开按钮'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (3)/a_'))

'12.选择一个自动匹配的商品：员工位（6人位'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (3)/input_selects0'))

'13.选择导入的商品员工椅的一级分类-办公'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (3)/select'), '2', 
    true)

'14.选择导入的商品员工椅的二级分类-椅类'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (3)/select (1)'), '23', 
    true)

'15.选择导入的商品员工椅的三级分类-办公椅'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (3)/select (2)'), '141', 
    true)

'16.选择导入商品背柜的一级分类-民用'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (3)/select (3)'), '1', 
    true)

'17.选择导入的商品员工椅的二级分类-梯柜'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (3)/select (4)'), '11', 
    true)

'18.选择导入的商品员工椅的三级分类-抽屉柜/斗柜'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (3)/select (5)'), '116', 
    true)

'19.点击确定\r\n'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)- (3)/div_'))

