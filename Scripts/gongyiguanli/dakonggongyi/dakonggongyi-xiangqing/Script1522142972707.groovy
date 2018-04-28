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

WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/工艺管理/span_工艺管理'), 0)

WebUI.click(findTestObject('changshanghoutai/左侧菜单/工艺管理/span_工艺管理'))

WebUI.waitForElementVisible(findTestObject('changshanghoutai/左侧菜单/工艺管理/a_打孔工艺'), 0)

WebUI.click(findTestObject('changshanghoutai/左侧菜单/工艺管理/a_打孔工艺'))

WebUI.delay(4)

WebUI.click(findTestObject('changshanghoutai/工艺管理/打孔工艺/a_查看详情'))

<<<<<<< HEAD
WebUI.waitForElementVisible(findTestObject('changshanghoutai/工艺管理/打孔工艺/div_无权访问页面提示'), 0)

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('changshanghoutai/工艺管理/打孔工艺/a_上一页'), 10)

WebUI.click(findTestObject('changshanghoutai/工艺管理/打孔工艺/a_上一页'))
=======
//if (WebUI.verifyTextPresent(findTestObject('changshanghoutai/工艺管理/打孔工艺/a_返回列表'), true)) {
if (WebUI.verifyElementVisible(findTestObject('changshanghoutai/工艺管理/打孔工艺/a_上一页'))) {
    
    WebUI.waitForElementVisible(findTestObject('changshanghoutai/工艺管理/打孔工艺/a_上一页'), 10)

    WebUI.click(findTestObject('changshanghoutai/工艺管理/打孔工艺/a_上一页'))
} else {
    WebUI.waitForElementVisible(findTestObject('changshanghoutai/工艺管理/打孔工艺/a_返回列表'), 10)

    WebUI.click(findTestObject('changshanghoutai/工艺管理/打孔工艺/a_返回列表'), FailureHandling.STOP_ON_FAILURE)
}
>>>>>>> e168b2661b0b298e824358f0b99527f49bfbe2a1

WebUI.waitForElementVisible(findTestObject('changshanghoutai/工艺管理/打孔工艺/input_搜索框'), 0)

