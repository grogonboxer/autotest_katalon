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

WebUI.openBrowser(url)

WebUI.waitForElementVisible(findTestObject('changshanghoutai/login/username'), 4)

WebUI.setText(findTestObject('changshanghoutai/login/username'), cdzy)

WebUI.setText(findTestObject('changshanghoutai/login/password'), 123456)

'登录拆单账号cdzy\r\n'
WebUI.click(findTestObject('changshanghoutai/login/login_button'))

'点击拆单管理'
WebUI.click(findTestObject('changshanghoutai/chaifendingdan/Page_(8)/span_'))

'等待拆分子订单出现'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/chaifendingdan/Page_(8)/a_'), 30)

'点击拆分子订单'
WebUI.click(findTestObject('changshanghoutai/chaifendingdan/Page_(8)/a_'))

'等待分配按钮出现'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/chaifendingdan/Page_(8)-/a_ (5)'), 30)

'点击全部订单tab'
WebUI.click(findTestObject('changshanghoutai/chaifendingdan/Page_(8)-/a_'))

'等待分配按钮出现'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/chaifendingdan/Page_(8)-/a_ (5)'), 30)

'点击待拆单tab'
WebUI.click(findTestObject('changshanghoutai/chaifendingdan/Page_(8)-/a_ (1)'))

'等待待拆单数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/chaifendingdan/Page_(8)/Page_(8)-/li_daichaidan'), 30)

'点击备货中tab'
WebUI.click(findTestObject('changshanghoutai/chaifendingdan/Page_(8)-/a_ (2)'))

'等待备货中数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/chaifendingdan/Page_(8)/Page_(8)-/li_beihuozhong'), 30)

'点击备货完成tab'
WebUI.click(findTestObject('changshanghoutai/chaifendingdan/Page_(8)-/a_ (3)'))

'等待备货完成数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/chaifendingdan/Page_(8)/Page_(8)-/li_beihuowancheng'), 30)

'点击已终止tab'
WebUI.click(findTestObject('changshanghoutai/chaifendingdan/Page_(8)-/a_ (4)'))

'等待已终止数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/chaifendingdan/Page_(8)/Page_(8)-/li_yizhongzhi'), 30)

'点击待拆单tab'
WebUI.click(findTestObject('changshanghoutai/chaifendingdan/Page_(8)-/a_ (1)'))

'等待待拆单数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/chaifendingdan/Page_(8)/Page_(8)-/li_daichaidan'), 30)

'点击分配订单'
WebUI.click(findTestObject('changshanghoutai/chaifendingdan/Page_(8)-/a_ (5)'))

'等待待拆单数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/chaifendingdan/Page_(8)/Page_(8)-/td_1'), 30)

'更换拆单子账号'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/chaifendingdan/Page_(8)- (1)/select_form-control'), '236', true)

'点击完成'
WebUI.click(findTestObject('changshanghoutai/chaifendingdan/Page_(8)- (1)/a_'))

'等待列表数据出现'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/chaifendingdan/Page_(8)-/a_ (5)'), 30)

'点击分配订单详情'
WebUI.click(findTestObject('changshanghoutai/chaifendingdan/Page_(8)-/a_ (5)'))

'等待分配详情数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/chaifendingdan/Page_(8)/Page_(8)-/td_fenpinxiangqing'), 30)

'点击拆分子订单列表'
WebUI.click(findTestObject('changshanghoutai/chaifendingdan/Page_(8)- (2)/a_'))

'等待分配按钮出现'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/chaifendingdan/Page_(8)-/a_ (5)'), 30)

'点击分配订单'
WebUI.click(findTestObject('changshanghoutai/chaifendingdan/Page_(8)-/a_ (5)'))

'等待待拆单数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/chaifendingdan/Page_(8)/Page_(8)-/td_1'), 30)

'更换分配的子账号'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/chaifendingdan/Page_(8)- (1)/select_form-control'), '262', true)

'点击完成'
WebUI.click(findTestObject('changshanghoutai/chaifendingdan/Page_(8)- (1)/a_'))

'等待列表出现'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/chaifendingdan/Page_(8)-/a_ (5)'), 30)

'查看分配详情\r\n'
WebUI.click(findTestObject('changshanghoutai/chaifendingdan/Page_(8)-/a_ (5)'))

'等待分配详情数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/chaifendingdan/Page_(8)/Page_(8)-/td_fenpinxiangqing'), 30)

