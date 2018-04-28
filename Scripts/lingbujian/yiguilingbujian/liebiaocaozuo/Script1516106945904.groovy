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

'等待左侧栏列表出现'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/零部件管理/左侧菜单/span_零部件管理'), 30)

'点击零部件管理'
WebUI.click(findTestObject('changshanghoutai/零部件管理/左侧菜单/span_零部件管理'))

'等待衣柜零部件按钮出现'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/零部件管理/左侧菜单/a_衣柜零部件列表'), 30)

'点击衣柜零部件'
WebUI.click(findTestObject('changshanghoutai/零部件管理/左侧菜单/a_衣柜零部件列表'))

'等待零部件列表出现'
WebUI.waitForAlert(2, FailureHandling.STOP_ON_FAILURE)

'审核'
WebUI.click(findTestObject('changshanghoutai/零部件管理/衣柜零部件/列表页/i_审核'))

WebUI.waitForElementVisible(findTestObject('changshanghoutai/零部件管理/衣柜零部件/列表页/button_通过审核'), 0)

'通过审核'
WebUI.click(findTestObject('changshanghoutai/零部件管理/衣柜零部件/列表页/button_通过审核'))

'上架'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/零部件管理/衣柜零部件/列表页/i_上架'), 30)

'上架'
WebUI.waitForElementClickable(findTestObject('changshanghoutai/零部件管理/衣柜零部件/列表页/i_上架'), 30)

'上架'
WebUI.click(findTestObject('changshanghoutai/零部件管理/衣柜零部件/列表页/i_上架'))

WebUI.waitForAlert(0)

WebUI.acceptAlert()

'下架'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/零部件管理/衣柜零部件/列表页/i_下架'), 30)

'下架'
WebUI.waitForElementClickable(findTestObject('changshanghoutai/零部件管理/衣柜零部件/列表页/i_下架'), 30)

'下架'
WebUI.click(findTestObject('changshanghoutai/零部件管理/衣柜零部件/列表页/i_下架'))

'输入违规原因'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/零部件管理/衣柜零部件/列表页/textarea_原因输入框'), 0)

'输入违规原因'
WebUI.setText(findTestObject('changshanghoutai/零部件管理/衣柜零部件/列表页/textarea_原因输入框'), '需要下架')

'确定'
WebUI.click(findTestObject('changshanghoutai/零部件管理/衣柜零部件/列表页/button_确认下架'))

'查看原因'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/零部件管理/衣柜零部件/列表页/i_查看原因'), 30)

'查看原因'
WebUI.waitForElementClickable(findTestObject('changshanghoutai/零部件管理/衣柜零部件/列表页/i_查看原因'), 30)

'查看原因'
WebUI.click(findTestObject('changshanghoutai/零部件管理/衣柜零部件/列表页/i_查看原因'))

'关闭弹框'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/零部件管理/衣柜零部件/列表页/button_关闭查看原因按钮'), 30)

'关闭弹框'
WebUI.click(findTestObject('changshanghoutai/零部件管理/衣柜零部件/列表页/button_关闭查看原因按钮'))

'删除'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/零部件管理/衣柜零部件/列表页/i_删除'), 30)

'删除'
WebUI.waitForElementClickable(findTestObject('changshanghoutai/零部件管理/衣柜零部件/列表页/i_删除'), 30)

'删除'
WebUI.click(findTestObject('changshanghoutai/零部件管理/衣柜零部件/列表页/i_删除'))

'输入删除原因'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/零部件管理/衣柜零部件/列表页/textarea_删除原因输入框'), 30)

'输入删除原因'
WebUI.setText(findTestObject('changshanghoutai/零部件管理/衣柜零部件/列表页/textarea_删除原因输入框'), '没用了，删了吧')

'确定'
WebUI.click(findTestObject('changshanghoutai/零部件管理/衣柜零部件/列表页/button_确定删除'))

'点击衣柜部件回收站'
WebUI.waitForElementNotVisible(findTestObject('changshanghoutai/零部件管理/衣柜零部件/列表页/button_确定删除'), 30)

'点击衣柜部件回收站\r\n'
WebUI.click(findTestObject('changshanghoutai/零部件管理/衣柜零部件/列表页/a_衣柜部件回收站'))

'等待页面跳转到回收站'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/零部件管理/衣柜零部件/列表页/i_回收站-查看原因'), 30)

'查看删除原因'
WebUI.click(findTestObject('changshanghoutai/零部件管理/衣柜零部件/列表页/i_回收站-查看原因'))

'关闭弹框'
WebUI.click(findTestObject('changshanghoutai/零部件管理/衣柜零部件/列表页/button_关闭查看原因按钮'))

'关闭弹框'
WebUI.waitForElementNotVisible(findTestObject('changshanghoutai/零部件管理/衣柜零部件/列表页/button_关闭查看原因按钮'), 0)

'还原'
WebUI.click(findTestObject('changshanghoutai/零部件管理/衣柜零部件/列表页/i_回收站-还原'))

WebUI.waitForAlert(0)

WebUI.acceptAlert()

'返回列表'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/零部件管理/衣柜零部件/列表页/a_衣柜部件回收站'), 30)

'返回列表'
WebUI.waitForElementClickable(findTestObject('changshanghoutai/零部件管理/衣柜零部件/列表页/a_衣柜部件回收站'), 30)

'返回列表'
WebUI.click(findTestObject('changshanghoutai/零部件管理/衣柜零部件/列表页/a_衣柜部件回收站'))

'删除'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/零部件管理/衣柜零部件/列表页/i_删除'), 30)

'删除'
WebUI.waitForElementClickable(findTestObject('changshanghoutai/零部件管理/衣柜零部件/列表页/i_删除'), 30)

'删除'
WebUI.click(findTestObject('changshanghoutai/零部件管理/衣柜零部件/列表页/i_删除'))

'输入删除原因'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/零部件管理/衣柜零部件/列表页/textarea_删除原因输入框'), 30)

'输入删除原因'
WebUI.setText(findTestObject('changshanghoutai/零部件管理/衣柜零部件/列表页/textarea_删除原因输入框'), '没用了，删了吧')

'确定'
WebUI.click(findTestObject('changshanghoutai/零部件管理/衣柜零部件/列表页/button_确定删除'))

'返回列表'
WebUI.click(findTestObject('changshanghoutai/零部件管理/衣柜零部件/列表页/a_衣柜部件回收站'))

'输入搜索关键字'
WebUI.setText(findTestObject('changshanghoutai/lingbujianguanli/yiguilingbujian/Page_(50)-/input_form-control col-xs-4'), 
    '踢脚�?')

'搜索'
WebUI.click(findTestObject('changshanghoutai/lingbujianguanli/yiguilingbujian/Page_(50)-/i_fa fa-search'))

'清除搜索关键�?'
WebUI.setText(findTestObject('changshanghoutai/lingbujianguanli/yiguilingbujian/Page_(50)-/input_form-control col-xs-4'), 
    '')

'搜索'
WebUI.click(findTestObject('changshanghoutai/lingbujianguanli/yiguilingbujian/Page_(50)-/i_fa fa-search'))

WebUI.closeBrowser()

