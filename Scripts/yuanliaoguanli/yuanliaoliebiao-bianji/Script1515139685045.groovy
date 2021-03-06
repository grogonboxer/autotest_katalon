import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.junit.After as After
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
WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/原料管理/span_原料管理'), 30)

'滚动到元素'
WebUI.scrollToElement(findTestObject('changshanghoutai/左侧菜单/原料管理/span_原料管理'), 5)

'点击原料管理'
WebUI.click(findTestObject('changshanghoutai/左侧菜单/原料管理/span_原料管理'))

'等待原料列表按钮出现\r\n'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/原料管理/a_原料列表'), 5)

'点击原料列表'
WebUI.click(findTestObject('changshanghoutai/左侧菜单/原料管理/a_原料列表'))

'等待原料列表出现\r\n'
WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('changshanghoutai/原料管理/新增页/a_验证新建'), yanzhengmingcheng)

'点击编辑按钮'
WebUI.click(findTestObject('changshanghoutai/原料管理/原料列表页/i_编辑'))

'等待编辑页面出现\r\n'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/原料管理/新增页/input_files_原料预览图'), 3)

'修改原料名称'
WebUI.setText(findTestObject('changshanghoutai/原料管理/新增页/input_名称'), mingcheng)

'修改原料型号'
WebUI.setText(findTestObject('changshanghoutai/原料管理/新增页/input_原料型号'), xinghao)

'输入平均价格'
WebUI.setText(findTestObject('changshanghoutai/原料管理/新增页/input_平均价格'), pingjunjiage)

'输入折算系数'
WebUI.setText(findTestObject('changshanghoutai/原料管理/新增页/input_折算系数'), '1.1')

'滚动到提交按钮'
WebUI.scrollToElement(findTestObject('changshanghoutai/原料管理/新增页/提交按钮'), 10)

'点击提交'
WebUI.click(findTestObject('changshanghoutai/原料管理/新增页/提交按钮'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('changshanghoutai/原料管理/新增页/a_验证新建'), mingcheng)

