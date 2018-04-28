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
import dpjia.pathtool.PathHelper as PathHelper

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

'点击新增按钮'
WebUI.click(findTestObject('changshanghoutai/原料管理/原料列表页/a_新增'))

'等待新增页面出现\r\n'
WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'上传预览图'
WebUI.uploadFile(findTestObject('changshanghoutai/原料管理/新增页/input_files_原料预览图'), PathHelper.getProjectAbsolutePath(findTestData(
            '图片/yuanliaotupianku').getValue('路径', 2)))

'选择所属分类-线条'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/原料管理/新增页/select_所属分类'), '7', true)

WebUI.waitForElementPresent(findTestObject('changshanghoutai/原料管理/新增页/select_二级分类-选项'), 10, FailureHandling.STOP_ON_FAILURE)

'封边条'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/原料管理/新增页/select_二级分类'), '17', true)

WebUI.waitForElementPresent(findTestObject('changshanghoutai/原料管理/新增页/select_三级分类-选项'), 10, FailureHandling.STOP_ON_FAILURE)

'天然木皮封边条'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/原料管理/新增页/select_三级分类'), '19', true)

'输入原料名称'
WebUI.setText(findTestObject('changshanghoutai/原料管理/新增页/input_名称'), mingcheng)

'输入型号'
WebUI.setText(findTestObject('changshanghoutai/原料管理/新增页/input_原料型号'), xinghao)

'输入尺寸长'
WebUI.setText(findTestObject('changshanghoutai/原料管理/新增页/input_长度'), changdu)

'宽'
WebUI.setText(findTestObject('changshanghoutai/原料管理/新增页/input_宽度'), kuandu)

'厚'
WebUI.setText(findTestObject('changshanghoutai/原料管理/新增页/input_厚度'), houdu)

'输入主材'
WebUI.setText(findTestObject('changshanghoutai/原料管理/新增页/input_主材'), zhucai)

'选择计数单位'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/原料管理/新增页/select_计数单位'), jishudanwei, true)

'选择计价单位'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/原料管理/新增页/select_计价单位'), jijiadanwei, true)

WebUI.setText(findTestObject('changshanghoutai/原料管理/新增页/input_品牌'), pinpai)

WebUI.setText(findTestObject('changshanghoutai/原料管理/新增页/input_产地'), chandi)

WebUI.setText(findTestObject('changshanghoutai/原料管理/新增页/input_包装规格'), baozhuangguige)

'选择计价单位'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/原料管理/新增页/select_包装规格单位'), baozhuangguigedanwei, true)

'设置平均价格'
WebUI.setText(findTestObject('changshanghoutai/原料管理/新增页/input_平均价格'), pingjunjiage)

WebUI.setText(findTestObject('changshanghoutai/原料管理/新增页/input_折算系数'), zhesuanxishu)

WebUI.setText(findTestObject('changshanghoutai/原料管理/新增页/textarea_特性'), texing)

WebUI.setText(findTestObject('changshanghoutai/原料管理/新增页/textarea_备注'), beizhu)

'滚动到提交按钮'
WebUI.scrollToElement(findTestObject('changshanghoutai/原料管理/新增页/提交按钮'), 10)

'点击提交'
WebUI.click(findTestObject('changshanghoutai/原料管理/新增页/提交按钮'))

'等待原料列表出现\r\n'
WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('changshanghoutai/原料管理/新增页/a_验证新建'), mingcheng, FailureHandling.STOP_ON_FAILURE)

