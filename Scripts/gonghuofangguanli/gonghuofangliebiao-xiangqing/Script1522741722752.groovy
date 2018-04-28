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

WebUI.callTestCase(findTestCase('gonghuofangguanli/gonghuofangliebiao-xinzeng'), [('gonghuofangzhanghao') : findTestData('变量EXCEL/供货方管理/供货方管理').getValue('供货方账号', 1)
        , ('mima') : findTestData('变量EXCEL/供货方管理/供货方管理').getValue('密码', 1), ('gonghuofangquancheng') : findTestData('变量EXCEL/供货方管理/供货方管理').getValue('供货方全称', 1)
        , ('gonghuofangjiancheng') : findTestData('变量EXCEL/供货方管理/供货方管理').getValue('供货方简称', 1), ('gonghuofanwei') : findTestData('变量EXCEL/供货方管理/供货方管理').getValue('供货范围', 1)
        , ('gonghuofanglianxiren') : findTestData('变量EXCEL/供货方管理/供货方管理').getValue('供货方联系人', 1), ('gonghuofanglianxidianhua') : findTestData('变量EXCEL/供货方管理/供货方管理').getValue('供货方联系电话', 1)
        , ('gonghuofangdizhi') : findTestData('变量EXCEL/供货方管理/供货方管理').getValue('供货方地址', 1), ('beizhu') : findTestData('变量EXCEL/供货方管理/供货方管理').getValue('备注', 1)], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('changshanghoutai/供货方管理/供货方列表页/a_详情'))

WebUI.delay(5)

WebUI.verifyTextPresent(quancheng, true)

