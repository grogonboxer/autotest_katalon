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

'点击调度管理'
WebUI.click(findTestObject('changshanghoutai/diaoduguanli/Page_(91)/span_'))

'等待派分销售订单按钮出现\r\n'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/diaoduguanli/Page_(91)/a_'), 30)

'点击派分销售订单'
WebUI.click(findTestObject('changshanghoutai/diaoduguanli/Page_(91)/a_'))

'等待列表数据出现\r\n'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/diaoduguanli/Page_/Page_(94)-/a_dingdanxiangqing'), 30)

'切换待派单tab'
WebUI.click(findTestObject('changshanghoutai/diaoduguanli/Page_(91)-/a_'))

'等待列表数据出现\r\n'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/diaoduguanli/Page_/Page_(94)-/a_dingdanxiangqing'), 30)

'切换备货中tab'
WebUI.click(findTestObject('changshanghoutai/diaoduguanli/Page_(91)-/a_ (1)'))

'等待列表数据出现\r\n'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/diaoduguanli/Page_/Page_(94)-/a_dingdanxiangqing'), 30)

'切换已取消tab'
WebUI.click(findTestObject('changshanghoutai/diaoduguanli/Page_(91)-/a_ (2)'))

'等待列表数据出现\r\n'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/diaoduguanli/Page_/Page_(94)-/a_dingdanxiangqing'), 30)

'切换已终止tab'
WebUI.click(findTestObject('changshanghoutai/diaoduguanli/Page_(91)-/a_ (3)'))

'等待列表数据出现\r\n'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/diaoduguanli/Page_/Page_(94)-/a_dingdanxiangqing'), 30)

'切换会全部订单'
WebUI.click(findTestObject('changshanghoutai/diaoduguanli/Page_(91)-/a_ (4)'))

'等待列表数据出现\r\n'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/diaoduguanli/Page_/Page_(94)-/a_dingdanxiangqing'), 30)

'点击订单详情'
WebUI.click(findTestObject('changshanghoutai/diaoduguanli/Page_(91)-/a_ (5)'))

'等待详情数据\r\n'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/diaoduguanli/Page_/Page_(94)-/span_492'), 30)

'点击返回列表'
WebUI.click(findTestObject('changshanghoutai/diaoduguanli/Page_(91)- (1)/a_'))

'等待列表数据出现\r\n'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/diaoduguanli/Page_/Page_(94)-/a_dingdanxiangqing'), 30)

'点击派单按钮'
WebUI.click(findTestObject('changshanghoutai/diaoduguanli/Page_(91)-/a_ (5)'))

'添加商品指派人'
WebUI.click(findTestObject('changshanghoutai/diaoduguanli/Page_(91)- (2)/span_add-sup fa fa-plus'))

'选择角色'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/diaoduguanli/Page_(91)- (2)/select_form-control'), '110', true)

'选择子账号名称'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/diaoduguanli/Page_(91)- (2)/select_form-control (1)'), '236', 
    true)

'修改商品数量'
WebUI.setText(findTestObject('changshanghoutai/diaoduguanli/Page_(91)- (2)/input_form-control'), '10')

'调整价格+'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/diaoduguanli/Page_(91)- (2)/select_selecttype'), '1', true)

'输入价格'
WebUI.setText(findTestObject('changshanghoutai/diaoduguanli/Page_(91)- (2)/input_select-input form-contro'), '500')

'输入备注'
WebUI.setText(findTestObject('changshanghoutai/diaoduguanli/Page_(91)- (2)/input_form-control (1)'), '备注备注备注备注备注备注备注备注备注备注备注备注备注备注备注备注备注备注备注备注')

'点击下一步'
WebUI.click(findTestObject('changshanghoutai/diaoduguanli/Page_(91)- (2)/a_'))

'等待隐藏价格开关出现'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/diaoduguanli/Page_/Page_(94)-/span_switch-plug'), 30)

'关闭一个订单的隐藏价格开关'
WebUI.click(findTestObject('changshanghoutai/diaoduguanli/Page_(91)- (2)/span_switch-plug'))

'点击完成'
WebUI.click(findTestObject('changshanghoutai/diaoduguanli/Page_(91)- (2)/a_'))

'等待列表数据出现\r\n'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/diaoduguanli/Page_/Page_(94)-/a_dingdanxiangqing'), 30)

'找到完成派单的订单'
WebUI.acceptAlert()

'点击派单详情'
WebUI.click(findTestObject('changshanghoutai/diaoduguanli/Page_(91)-/a_ (5)'))

'等待派单详情出现'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/diaoduguanli/Page_/Page_(94)-/td_1'), 30)

'点击返回列表'
WebUI.click(findTestObject('changshanghoutai/diaoduguanli/Page_(91)- (3)/a_'))

'等待列表数据出现\r\n'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/diaoduguanli/Page_/Page_(94)-/a_dingdanxiangqing'), 30)

'点击完成备货'
WebUI.click(findTestObject('changshanghoutai/diaoduguanli/Page_(91)-/a_ (5)'))

'等待列表数据出现\r\n'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/diaoduguanli/Page_/Page_(94)-/a_dingdanxiangqing'), 30)

'点击调度管理'
WebUI.click(findTestObject('changshanghoutai/diaoduguanli/yipaizidingdan/Page_(94)/span_'))

'等待列表数据出现\r\n'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/diaoduguanli/yipaizidingdan/Page_(94)- (3)/a_yipai'), 30)

'点击已派的子订单'
WebUI.click(findTestObject('changshanghoutai/diaoduguanli/yipaizidingdan/Page_(94)/a_'))

'等待列表数据出现\r\n'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/diaoduguanli/yipaizidingdan/Page_(94)- (3)/a_zidingdanxiangqing'), 
    30)

'点击订单号查看详情'
WebUI.click(findTestObject('changshanghoutai/diaoduguanli/yipaizidingdan/Page_(94)-/a_1712271435567402807'))

'等待列表数据出现\r\n'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/diaoduguanli/yipaizidingdan/Page_(94)- (3)/div_send-line'), 
    30)

'点击返回按钮'
WebUI.click(findTestObject('changshanghoutai/diaoduguanli/yipaizidingdan/Page_(94)- (1)/a_'))

'等待列表数据出现\r\n'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/diaoduguanli/yipaizidingdan/Page_(94)- (3)/a_zidingdanxiangqing'), 
    30)

'点击子订单详情'
WebUI.click(findTestObject('changshanghoutai/diaoduguanli/yipaizidingdan/Page_(94)-/a_'))

'等待列表数据出现\r\n'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/diaoduguanli/yipaizidingdan/Page_(94)- (3)/td_1'), 30)

'点击返回按钮'
WebUI.click(findTestObject('changshanghoutai/diaoduguanli/yipaizidingdan/Page_(94)- (2)/a_'))

'等待列表数据出现\r\n'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/diaoduguanli/yipaizidingdan/Page_(94)- (3)/a_zidingdanxiangqing'), 
    30)

'切换待拆单tab'
WebUI.click(findTestObject('changshanghoutai/diaoduguanli/yipaizidingdan/Page_(94)-/a_ (1)'))

'等待列表数据出现\r\n'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/diaoduguanli/yipaizidingdan/Page_(94)- (3)/Page_(94)-/li_daichaidan'), 
    30)

'切换备货中tab'
WebUI.click(findTestObject('changshanghoutai/diaoduguanli/yipaizidingdan/Page_(94)-/a_ (2)'))

'等待列表数据出现\r\n'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/diaoduguanli/yipaizidingdan/Page_(94)- (3)/Page_(94)-/li_beihuozhong'), 
    30)

'切换备货完成tab'
WebUI.click(findTestObject('changshanghoutai/diaoduguanli/yipaizidingdan/Page_(94)-/a_ (3)'))

'等待列表数据出现\r\n'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/diaoduguanli/yipaizidingdan/Page_(94)- (3)/Page_(94)-/li_beihuowancheng'), 
    30)

'切换已终止tab'
WebUI.click(findTestObject('changshanghoutai/diaoduguanli/yipaizidingdan/Page_(94)-/a_ (4)'))

'等待列表数据出现\r\n'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/diaoduguanli/yipaizidingdan/Page_(94)- (3)/Page_(94)-/li_zhongzhi'), 
    30)

'切换回全部订单tab'
WebUI.click(findTestObject('changshanghoutai/diaoduguanli/yipaizidingdan/Page_(94)-/a_ (5)'))

'等待列表数据出现\r\n'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/diaoduguanli/yipaizidingdan/Page_(94)- (3)/a_zidingdanxiangqing'), 
    30)

WebUI.closeBrowser()

