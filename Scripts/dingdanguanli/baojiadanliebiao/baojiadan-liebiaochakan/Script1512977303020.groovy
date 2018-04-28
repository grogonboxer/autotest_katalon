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

'点击订单管理'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)/i_fa fa-calculator'))

'等待响应\r\n'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_/a_'), 30)

'点击报价单列表'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)/a_'))

'等待列表出现\r\n'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_/li_baojiazhong'), 30)

'点击报价中tab'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)-/a_'))

'等待列表报价中元素出现\r\n'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_/li_baojiazhong'), 30)

'点击已下单tab'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)-/a_ (1)'))

'已下单元素出现'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_/Page_(83)-/li_yixiadan'), 
    30)

'点击已取消tab'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)-/a_ (2)'))

'已取消标签出现\r\n'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_/Page_(83)-/li_yiquxiao'), 
    30)

'点击全部订单tab'
WebUI.click(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_(50)-/a_ (3)'))

'等待列表出现'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/dingdanguanli/baojiadanliebiao/Page_/li_baojiazhong'), 30)

WebUI.closeBrowser()

