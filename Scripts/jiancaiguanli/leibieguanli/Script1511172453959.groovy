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

'点击建材管理'
WebUI.click(findTestObject('changshanghoutai/jiancaiguanli/leibieguanli/Page_(50)/span_'))

'点击类别管理'
WebUI.click(findTestObject('changshanghoutai/jiancaiguanli/leibieguanli/Page_(50)/a_'))

'点击二级分类-外墙管理'
WebUI.click(findTestObject('changshanghoutai/jiancaiguanli/leibieguanli/Page_(50)-/a_'))

'点击三级分类-民用外墙的启用按钮'
WebUI.click(findTestObject('changshanghoutai/jiancaiguanli/leibieguanli/Page_(50)-/span_switch-plug'))

'点击用途办公'
WebUI.click(findTestObject('changshanghoutai/jiancaiguanli/leibieguanli/Page_(50)-/a_ (1)'))

'点击墙面管理'
WebUI.click(findTestObject('changshanghoutai/jiancaiguanli/leibieguanli/Page_(50)-/a_'))

'禁用三级分类-墙面'
WebUI.click(findTestObject('changshanghoutai/jiancaiguanli/leibieguanli/Page_(50)-/span_switch-plug'))

'启用三级分类-墙面'
WebUI.click(findTestObject('changshanghoutai/jiancaiguanli/leibieguanli/Page_(50)-/span_switch-plug'))

'切换用途为民用'
WebUI.click(findTestObject('changshanghoutai/jiancaiguanli/leibieguanli/Page_(50)-/a_ (1)'))

'点击二级分类-外墙管理'
WebUI.click(findTestObject('changshanghoutai/jiancaiguanli/leibieguanli/Page_(50)-/a_'))

'点击三级分类-民用外墙的禁用按钮'
WebUI.click(findTestObject('changshanghoutai/jiancaiguanli/leibieguanli/Page_(50)-/span_switch-plug'))

