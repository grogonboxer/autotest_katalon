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

WebUI.callTestCase(findTestCase('xiaoxiguanli/tuisongguanli/xiaoxituisong'), [:], FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.delay(3)

WebUiBuiltInKeywords.waitForElementClickable(findTestObject('changshanghoutai/推送管理/翻页/a_第二页'), 0)

WebUI.click(findTestObject('changshanghoutai/推送管理/翻页/a_第二页'))

WebUiBuiltInKeywords.delay(1)

WebUiBuiltInKeywords.waitForElementClickable(findTestObject('changshanghoutai/推送管理/翻页/a__末页'), 0)

WebUI.click(findTestObject('changshanghoutai/推送管理/翻页/a__末页'))

WebUiBuiltInKeywords.delay(1)

WebUiBuiltInKeywords.waitForElementClickable(findTestObject('changshanghoutai/推送管理/翻页/a__首页'), 0)

WebUI.click(findTestObject('changshanghoutai/推送管理/翻页/a__首页'))

WebUiBuiltInKeywords.delay(1)

WebUiBuiltInKeywords.waitForElementVisible(findTestObject('changshanghoutai/推送管理/翻页/input_输入框'), 0)

WebUI.setText(findTestObject('changshanghoutai/推送管理/翻页/input_输入框'), '3')

WebUiBuiltInKeywords.waitForElementClickable(findTestObject('changshanghoutai/推送管理/翻页/a__跳转'), 0)

WebUI.click(findTestObject('changshanghoutai/推送管理/翻页/a__跳转'))

