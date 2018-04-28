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

WebUI.openBrowser(url)

WebUI.waitForElementVisible(findTestObject('changshanghoutai/login/username'), 4)

WebUI.setText(findTestObject('changshanghoutai/login/username'), 'cdzy')

WebUI.setText(findTestObject('changshanghoutai/login/password'), '123456')

'登录拆单账号cdzy\r\n'
WebUI.click(findTestObject('changshanghoutai/login/login_button'))

'点击拆单管理'
WebUI.click(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)/span_'))

'等等拆分子订单出现'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)/a_'), 30)

'点击拆分子订单'
WebUI.click(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)/a_'))

'等等列表订单详情按钮出现'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)/Page_(8)-/a_dingdanxiangqing'), 
    30)

'选择待拆单tab'
WebUI.click(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)-/a_'))

'等等列表订单详情按钮出现'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)/Page_(8)-/a_dingdanxiangqing'), 
    30)

'点击拆分订单'
WebUI.click(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)-/a_ (1)'))

'等待商品列表出现\r\n'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)/Page_(8)-/td_shangpinliebiao'), 
    30)

'选择拆成商品零部件'
WebUI.click(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/input'))

'等待部件列表出现\r\n'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)/Page_(8)-/th_bujianliebiao'), 
    30)

'点击添加部件'
WebUI.click(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/div_'))

'等待从零部件库添加按钮出现\r\n'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/button_'), 30)

'选择从零部件库中添加'
WebUI.click(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/button_'))

'等待部件列表出现\r\n'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)/Page_(8)-/th_bujianliebiao'), 
    30)

'选择一级分类为零件类'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/select_form-yijifenlei'), 
    '2', true)

'选择一级分类为板件类'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/select_form-yijifenlei'), 
    '3', true)

'选择二级分类为一般板材'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/select_form-erjifenlei'), 
    '4', true)

'输入颜色'
WebUI.setText(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/input_form-control col-xs-yanse'), 
    '木质')

'点击搜索'
WebUI.click(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/span_'))

'等待搜索结果'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/Page_(8)-/td_bujianliebiao'), 
    30)

'输入板部件材质'
WebUI.setText(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/input_form-control col-xs-caizhi'), 
    '木质')

'点击搜索'
WebUI.click(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/span_'))

'等待搜索结果'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/Page_(8)-/td_bujianliebiao'), 
    30)

'选择部件'
WebUI.click(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/input_change_subpart'))

'点击确定'
WebUI.click(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/button_ (1)'))

'点击添加按钮'
WebUI.click(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/div_'))

'等待手动添加按钮出现\r\n'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/button_ (2)'), 
    30)

'选择手动输入添加'
WebUI.click(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/button_ (2)'))

'输入部件名称'
WebUI.setText(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/input (1)'), 'H8-YS085')

'输入部件型号'
WebUI.setText(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/input (2)'), 'YS.85')

'添加预览图'
WebUI.click(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/img'))

'添加备注'
WebUI.setText(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/input (3)'), '备注长一点备注长一点备注长一点备注长一点备注长一点备注长一点备注长一点备注长一点备注长一点备注长一点备注长一点备注长一点备注长一点备注长一点备注长一点备注长一点备注长一点备注长一点备注长一点备注长一点备注长一点备注长一点备注长一点备注长一点备注长一点备注长一点备注长一点备注长一点备注长一点备注长一点备注长一点备注长一点备注长一点')

'输入主色调'
WebUI.setText(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/input (4)'), '黄木')

'输入尺寸'
WebUI.setText(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/input (5)'), '800*50*30')

'输入其他规格'
WebUI.setText(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/input (6)'), '圆弧角度')

'输入数量'
WebUI.setText(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/input (7)'), '8')

'点击一个部件后方的删除操作按钮'
WebUI.click(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/a_fa-self-icon fa-self-trash'))

'在一个整个商品的拆分数据中修改颜色'
WebUI.setText(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/input (8)'), '布（黑色）')

'修改尺寸'
WebUI.setText(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/input (3)'), '700*630*840')

'修改规格'
WebUI.setText(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/input (4)'), '无靠背')

'修改数量'
WebUI.setText(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/input (5)'), '11')

'点击下一步'
WebUI.click(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/a_'))

'等待从零部件库添加按钮出现\r\n'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)/Page_(8)-/Page_(8)-/th_gonghuoshanglie'), 
    30)

'选择供货方类型'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/select_form-control -gonglei1'), 
    'manufacturer', true)

'选择供货商名称'
WebUI.selectOptionByValue(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/select_form-control-gong1'), 
    '55', true)

WebUI.selectOptionByValue(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/select_form-control -gonglei2'), 
    'supplier', true)

WebUI.selectOptionByValue(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/select_form-control-gong2'), 
    '58', true)

WebUI.selectOptionByValue(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/select_form-control -gonglei3'), 
    'supplier', true)

WebUI.selectOptionByValue(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/select_form-control-gong3'), 
    '58', true)

WebUI.selectOptionByValue(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/select_form-control -gonglei4'), 
    'warehouse', true)

WebUI.selectOptionByValue(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/select_form-control-gong4'), 
    '59', true)

WebUI.selectOptionByValue(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/select_form-control -gonglei5'), 
    'supplier', true)

WebUI.selectOptionByValue(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/select_form-control-gong5'), 
    '58', true)

WebUI.selectOptionByValue(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/select_form-control -gonglei6'), 
    'manufacturer', true)

WebUI.selectOptionByValue(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/select_form-control-gong6'), 
    '55', true)

WebUI.selectOptionByValue(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/select_form-control -gonglei7'), 
    'manufacturer', true)

WebUI.selectOptionByValue(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/select_form-control-gong7'), 
    '55', true)

WebUI.selectOptionByValue(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/select_form-control--gonglei2'), 
    'manufacturer', true)

WebUI.selectOptionByValue(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/select_form-control--gong2'), 
    '55', true)

WebUI.selectOptionByValue(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/select_form-control--gonglei3'), 
    'supplier', true)

WebUI.selectOptionByValue(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/select_form-control--gong3'), 
    '58', true)

WebUI.selectOptionByValue(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/select_form-control--gonglei4'), 
    'manufacturer', true)

WebUI.selectOptionByValue(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/select_form-control--gong4'), 
    '55', true)

WebUI.selectOptionByValue(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/select_form-control--gong5'), 
    'supplier', true)

WebUI.selectOptionByValue(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/select_form-control--gong2'), 
    '58', true)

'点击下一步'
WebUI.click(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/i_fa fa-angle-right'))

'等等完成按钮出现'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/a_'), 30)

'点击完成'
WebUI.click(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/a_'))

'等等列表订单详情按钮出现'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)/Page_(8)-/a_dingdanxiangqing'), 
    30)

'点击完成拆单'
WebUI.click(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)-/a_ (1)'))

'等等列表订单详情按钮出现'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)/Page_(8)-/a_dingdanxiangqing'), 
    30)

'点击拆单详情'
WebUI.click(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)-/a_ (1)'))

'等待拆单详情数据'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (1)/Page_(8)- (1)/td_chaidanxiangqingxuhao'), 
    30)

'点击返回列表'
WebUI.click(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (2)/a_'))

'等等列表订单详情按钮出现'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)/Page_(8)-/a_dingdanxiangqing'), 
    30)

'点击完成备货'
WebUI.click(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)-/a_ (1)'))

'等等列表订单详情按钮出现'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)/Page_(8)-/a_dingdanxiangqing'), 
    30)

'点击拆单管理'
WebUI.click(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8) (1)/span_'))

'等待已拆任务单按钮出现'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8) (1)/a_'), 30)

'点击已拆任务单'
WebUI.click(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8) (1)/a_'))

'等待已拆任务单列表出现'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8) (1)/Page_(8)-/td_yichairenwudanxuhao'), 
    30)

'点击供货单号'
WebUI.click(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (3)/a_1712281453334502871'))

'等待已拆任务单列表出现'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8) (1)/Page_(8)- (1)/td_xiangqingxuhao'), 
    30)

'点击返回列表'
WebUI.click(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (4)/a_'))

'等待已拆任务单列表出现'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8) (1)/Page_(8)-/td_yichairenwudanxuhao'), 
    30)

'点击操作中的查看详情'
WebUI.click(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (3)/i_fa fa-eye'))

'等待已拆任务单列表出现'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8) (1)/Page_(8)- (1)/td_xiangqingxuhao'), 
    30)

'点击返回列表'
WebUI.click(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8)- (4)/a_'))

'等待已拆任务单列表出现'
WebUI.waitForElementVisible(findTestObject('changshanghoutai/chaifendingdan/chaifenzidingdan/Page_(8) (1)/Page_(8)-/td_yichairenwudanxuhao'), 
    30)

