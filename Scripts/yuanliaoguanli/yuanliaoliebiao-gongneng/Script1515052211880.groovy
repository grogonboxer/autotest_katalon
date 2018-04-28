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

WebUI.callTestCase(findTestCase('denglu'), [('url') : findTestData('account/登录').getValue('网址', 1), ('username') : findTestData(
            'account/登录').getValue('用户名', 1), ('password') : findTestData('account/登录').getValue('密码', 1)], FailureHandling.STOP_ON_FAILURE)

'等待左侧栏列表出现'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/原料管理/span_原料管理'), 30)

'滚动到元素'
WebUI.scrollToElement(findTestObject('changshanghoutai/左侧菜单/原料管理/span_原料管理'), 5)

'点击原料管理'
WebUI.click(findTestObject('changshanghoutai/左侧菜单/原料管理/span_原料管理'))

'等待原料列表按钮出现\r\n'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/原料管理/a_原料列表'), 30)

'点击原料列表'
WebUI.click(findTestObject('changshanghoutai/左侧菜单/原料管理/a_原料列表'))

'等待原料列表出现\r\n'
WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

'选择一级分类-线条'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/原料管理/原料列表页/select_一级分类'), '7', true)

'点击搜索'
WebUI.click(findTestObject('changshanghoutai/原料管理/原料列表页/button_搜索'))

'等待原料列表出现\r\n'
WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextNotPresent('五金 -', false, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextNotPresent('板材 -', false, FailureHandling.STOP_ON_FAILURE)

'选择二级分类-封边条'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/原料管理/原料列表页/select_二级分类'), '17', true)

'点击搜索'
WebUI.click(findTestObject('changshanghoutai/原料管理/原料列表页/button_搜索'))

'等待原料列表出现\r\n'
WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextNotPresent('五金 -', false, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextNotPresent('板材 -', false, FailureHandling.STOP_ON_FAILURE)

'选择三级分类-天然木皮封边条'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/原料管理/原料列表页/select_三级分类'), '19', true)

'点击搜索'
WebUI.click(findTestObject('changshanghoutai/原料管理/原料列表页/button_搜索'))

'等待原料列表出现\r\n'
WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextNotPresent('五金 -', false, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextNotPresent('板材 -', false, FailureHandling.STOP_ON_FAILURE)

'输入原料名称'
WebUI.setText(findTestObject('changshanghoutai/原料管理/原料列表页/input_搜索框'), mingcheng)

'点击搜索'
WebUI.click(findTestObject('changshanghoutai/原料管理/原料列表页/button_搜索'))

'等待原料列表出现\r\n'
WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('changshanghoutai/原料管理/新增页/a_验证新建'), mingcheng)

'输入型号'
WebUI.setText(findTestObject('changshanghoutai/原料管理/原料列表页/input_搜索框'), xinghao)

'点击搜索'
WebUI.click(findTestObject('changshanghoutai/原料管理/原料列表页/button_搜索'))

'等待原料列表出现\r\n'
WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('changshanghoutai/原料管理/新增页/a_验证新建'), mingcheng)

'点击刷新按钮'
WebUI.click(findTestObject('changshanghoutai/原料管理/原料列表页/button_刷新'))

'等待原料列表出现\r\n'
WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'点击禁用按钮'
WebUI.click(findTestObject('changshanghoutai/原料管理/原料列表页/span_启用禁用开关'))

WebUI.waitForElementVisible(findTestObject('changshanghoutai/原料管理/原料列表页/div_禁用成功提示'), 10)

WebUI.verifyElementVisible(findTestObject('changshanghoutai/原料管理/原料列表页/td_公司禁用状态'))

'出现禁用状态'
WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'点击启用按钮'
WebUI.click(findTestObject('changshanghoutai/原料管理/原料列表页/span_启用禁用开关'))

WebUI.waitForElementVisible(findTestObject('changshanghoutai/原料管理/原料列表页/div_启用成功提示'), 10)

WebUI.verifyElementVisible(findTestObject('changshanghoutai/原料管理/原料列表页/td_启用状态'))

