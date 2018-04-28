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

WebUI.callTestCase(findTestCase('chanpinguanli/chanpinku/chanpinku_jinru'), [:], FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.delay(2)

WebUiBuiltInKeywords.waitForElementVisible(findTestObject('changshanghoutai/产品管理/产品库/编辑标品/td_序号'), 0)

WebUI.click(findTestObject('changshanghoutai/产品管理/产品库/编辑标品/td_序号'))

WebUiBuiltInKeywords.waitForElementClickable(findTestObject('changshanghoutai/产品管理/产品库/编辑标品/i_fa-self-icon fa-self-编辑图标'), 
    0)

WebUI.click(findTestObject('changshanghoutai/产品管理/产品库/编辑标品/i_fa-self-icon fa-self-编辑图标'))

WebUiBuiltInKeywords.delay(5)

WebUiBuiltInKeywords.waitForElementClickable(findTestObject('changshanghoutai/产品管理/产品库/编辑标品/button_编辑'), 0)

WebUI.click(findTestObject('changshanghoutai/产品管理/产品库/编辑标品/button_编辑'))

WebUiBuiltInKeywords.delay(2)

WebUI.setText(findTestObject('changshanghoutai/产品管理/产品库/编辑标品/input_form-control-名称'), '一把椅子5')

WebUiBuiltInKeywords.waitForElementClickable(findTestObject('changshanghoutai/产品管理/产品库/编辑标品/button_完成'), 0)

WebUI.click(findTestObject('changshanghoutai/产品管理/产品库/编辑标品/button_完成'))

WebUiBuiltInKeywords.waitForElementClickable(findTestObject('changshanghoutai/产品管理/产品库/编辑标品/button_细节编辑'), 0)

WebUI.click(findTestObject('changshanghoutai/产品管理/产品库/编辑标品/button_细节编辑'))

WebUI.setText(findTestObject('changshanghoutai/产品管理/产品库/编辑标品/input_form-control-颜色'), '白米色')

WebUiBuiltInKeywords.waitForElementClickable(findTestObject('changshanghoutai/产品管理/产品库/编辑标品/button_细节完成'), 0)

WebUI.click(findTestObject('changshanghoutai/产品管理/产品库/编辑标品/button_细节完成'))

WebUiBuiltInKeywords.delay(3)

WebUI.click(findTestObject('changshanghoutai/产品管理/产品库/编辑标品/a_产品图册'))

WebUiBuiltInKeywords.delay(2)

WebUI.click(findTestObject('changshanghoutai/产品管理/产品库/编辑标品/a_产品附件'))

WebUiBuiltInKeywords.delay(2)

WebUiBuiltInKeywords.waitForElementClickable(findTestObject('changshanghoutai/产品管理/产品库/编辑标品/a_返回列表'), 0)

WebUI.click(findTestObject('changshanghoutai/产品管理/产品库/编辑标品/a_返回列表'))

WebUiBuiltInKeywords.delay(3)

WebUiBuiltInKeywords.waitForElementClickable(findTestObject('changshanghoutai/产品管理/产品库/编辑标品/i_fa-self-icon fa-check-self-审核图标'), 
    0)

WebUI.click(findTestObject('changshanghoutai/产品管理/产品库/编辑标品/i_fa-self-icon fa-check-self-审核图标'))

WebUiBuiltInKeywords.delay(2)

WebUI.setText(findTestObject('changshanghoutai/产品管理/产品库/编辑标品/textarea_addopinion-审核意见'), '通过编辑审核')

WebUI.click(findTestObject('changshanghoutai/产品管理/产品库/编辑标品/button_通过审核'))

