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

WebUI.openBrowser('http://b.dpjia.com')

WebUI.waitForElementVisible(findTestObject('changshanghoutai/登录/input_用户名'), 10)

WebUI.setText(findTestObject('changshanghoutai/登录/input_用户名'), 'jlxd')

WebUI.setText(findTestObject('changshanghoutai/登录/input_密码'), '123456')

WebUI.click(findTestObject('changshanghoutai/登录/button_登录'))

'等待左侧按钮'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/报备受理/span_项目报备'), 10)

'点击项目报备菜单'
WebUI.click(findTestObject('changshanghoutai/左侧菜单/报备受理/span_项目报备'))

'等待报备受理子菜单'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/报备受理/a_报备受理'), 10)

'点击报备受理'
WebUI.click(findTestObject('changshanghoutai/左侧菜单/报备受理/a_报备受理'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'点击查看详情'
WebUI.click(findTestObject('changshanghoutai/项目报备/报备受理/操作项/a_查看详情'))

'等待详情页'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/项目报备/报备受理/操作项/a_返回列表'), 10)

'点击返回列表'
WebUI.click(findTestObject('changshanghoutai/项目报备/报备受理/操作项/a_返回列表'))

'等待列表内容'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/项目报备/报备受理/搜索筛选/tbody_列表数据'), 10)

'点击报备记录按钮'
WebUI.click(findTestObject('changshanghoutai/项目报备/报备受理/操作项/a_报备记录'))

'等待报备记录内容'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/项目报备/报备受理/操作项/tbody_报备记录内容'), 10)

'点击关闭按钮'
WebUI.click(findTestObject('changshanghoutai/项目报备/报备受理/操作项/span_关闭报备记录'))

'等待列表数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/项目报备/报备受理/搜索筛选/tbody_列表数据'), 10)

'点击待受理标签'
WebUI.click(findTestObject('changshanghoutai/项目报备/报备受理/搜索筛选/a_待受理标签'))

'等待列表数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/项目报备/报备受理/搜索筛选/tbody_列表数据'), 10)

'点击受理按钮'
WebUI.click(findTestObject('changshanghoutai/项目报备/报备受理/操作项/a_受理按钮'))

'等待受理弹框'
WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

'点击已受理标签'
WebUI.click(findTestObject('changshanghoutai/项目报备/报备受理/搜索筛选/a_已受理标签'))

'等待列表数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/项目报备/报备受理/搜索筛选/tbody_列表数据'), 10)

'点击项目跟踪进度按钮'
WebUI.click(findTestObject('changshanghoutai/项目报备/报备受理/操作项/a_项目跟踪进度按钮'))

'等待项目跟踪记录弹框'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/项目报备/报备受理/操作项/tbody_项目跟踪列表'), 10)

'点击关闭进度弹框'
WebUI.click(findTestObject('changshanghoutai/项目报备/报备受理/操作项/span_关闭进度弹框'))

'等待列表数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/项目报备/报备受理/搜索筛选/tbody_列表数据'), 10)

'点击反馈按钮'
WebUI.click(findTestObject('changshanghoutai/项目报备/报备受理/操作项/a_反馈'))

'等待填写反馈弹框'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/项目报备/报备受理/操作项/textarea_备注'), 10)

'点击拒绝'
WebUI.click(findTestObject('changshanghoutai/项目报备/报备受理/操作项/span_拒绝'))

'输入备注'
WebUI.setText(findTestObject('changshanghoutai/项目报备/报备受理/操作项/textarea_备注'), "拒绝该项目")

'点击确认按钮'
WebUI.click(findTestObject('changshanghoutai/项目报备/报备受理/操作项/button_确认'))

'等待列表数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/项目报备/报备受理/搜索筛选/tbody_列表数据'), 10)

'点击已受理标签'
WebUI.click(findTestObject('changshanghoutai/项目报备/报备受理/搜索筛选/a_已受理标签'))

'等待列表数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/项目报备/报备受理/搜索筛选/tbody_列表数据'), 10)

'点击反馈按钮'
WebUI.click(findTestObject('changshanghoutai/项目报备/报备受理/操作项/a_反馈'))

'等待填写反馈弹框'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/项目报备/报备受理/操作项/textarea_备注'), 10)

'点击驳回'
WebUI.click(findTestObject('changshanghoutai/项目报备/报备受理/操作项/span_驳回'))

'输入备注'
WebUI.setText(findTestObject('changshanghoutai/项目报备/报备受理/操作项/textarea_备注'), "驳回该项目")

'点击确认按钮'
WebUI.click(findTestObject('changshanghoutai/项目报备/报备受理/操作项/button_确认'))

'等待列表数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/项目报备/报备受理/搜索筛选/tbody_列表数据'), 10)

'点击已受理标签'
WebUI.click(findTestObject('changshanghoutai/项目报备/报备受理/搜索筛选/a_已受理标签'))

'等待列表数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/项目报备/报备受理/搜索筛选/tbody_列表数据'), 10)

'点击反馈按钮'
WebUI.click(findTestObject('changshanghoutai/项目报备/报备受理/操作项/a_反馈'))

'等待填写反馈弹框'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/项目报备/报备受理/操作项/textarea_备注'), 10)

'点击采纳'
WebUI.click(findTestObject('changshanghoutai/项目报备/报备受理/操作项/span_采纳'))

'输入备注'
WebUI.setText(findTestObject('changshanghoutai/项目报备/报备受理/操作项/textarea_备注'), "采纳该项目")

'点击确认按钮'
WebUI.click(findTestObject('changshanghoutai/项目报备/报备受理/操作项/button_确认'))

'等待列表数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/项目报备/报备受理/搜索筛选/tbody_列表数据'), 10)

'点击已采纳标签'
WebUI.click(findTestObject('changshanghoutai/项目报备/报备受理/搜索筛选/a_已采纳标签'))

'等待列表数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/项目报备/报备受理/搜索筛选/tbody_列表数据'), 10)

'点击关闭按钮'
WebUI.click(findTestObject('changshanghoutai/项目报备/报备受理/操作项/a_关闭'))

'等待关闭弹框'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/项目报备/报备受理/操作项/textarea_关闭原因'), 10)

'输入关闭原因'
WebUI.setText(findTestObject('changshanghoutai/项目报备/报备受理/操作项/textarea_关闭原因'), "该人不合适跟踪项目")

'点击确定'
WebUI.click(findTestObject('changshanghoutai/项目报备/报备受理/操作项/button_确认关闭'))

'点击已关闭标签'
WebUI.click(findTestObject('changshanghoutai/项目报备/报备受理/搜索筛选/a_已关闭标签'))

'等待列表数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/项目报备/报备受理/搜索筛选/tbody_列表数据'), 10)

'点击查看原因按钮'
WebUI.click(findTestObject('changshanghoutai/项目报备/报备受理/操作项/a_查看原因'))

'等待查看原因弹框'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/项目报备/报备受理/操作项/div_查看原因弹框'), 10)

'关闭查看原因弹框'
WebUI.click(findTestObject('changshanghoutai/项目报备/报备受理/操作项/span_关闭查看原因'))
