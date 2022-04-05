import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('AñadirAlCarrito/Page_Tienda DAC/button_Todos'), 0)

WebUI.verifyElementClickable(findTestObject('AñadirAlCarrito/Page_Tienda DAC/button_Todos'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/AñadirAlCarrito/Page_Tienda DAC/button_Todos'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('AñadirAlCarrito/Page_Tienda DAC/div_Apple MacBook Pro 13-inch'), 0)

WebUI.verifyElementClickable(findTestObject('AñadirAlCarrito/Page_Tienda DAC/div_Apple MacBook Pro 13-inch'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/AñadirAlCarrito/Page_Tienda DAC/div_Apple MacBook Pro 13-inch'))

WebUI.verifyElementPresent(findTestObject('AñadirAlCarrito/Page_Tienda DAC/button_Ver disponibilidad'), 0)

WebUI.verifyElementClickable(findTestObject('AñadirAlCarrito/Page_Tienda DAC/button_Ver disponibilidad'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/AñadirAlCarrito/Page_Tienda DAC/button_Ver disponibilidad'))

WebUI.verifyElementPresent(findTestObject('AñadirAlCarrito/Page_Tienda DAC/span_No tiene tipos de ordenes disponibles'), 
    0)

WebUI.click(findTestObject('Object Repository/AñadirAlCarrito/Page_Tienda DAC/span_No tiene tipos de ordenes disponibles'))

WebUI.verifyElementPresent(findTestObject('AñadirAlCarrito/Page_Tienda DAC/i_Santo Domingo_mdi mdi-plus mdi-24px'), 0)

WebUI.verifyElementClickable(findTestObject('AñadirAlCarrito/Page_Tienda DAC/i_Santo Domingo_mdi mdi-plus mdi-24px'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/AñadirAlCarrito/Page_Tienda DAC/i_Santo Domingo_mdi mdi-plus mdi-24px'))

WebUI.verifyElementPresent(findTestObject('AñadirAlCarrito/Page_Tienda DAC/button_Aadir al carrito'), 0)

WebUI.verifyElementClickable(findTestObject('AñadirAlCarrito/Page_Tienda DAC/button_Aadir al carrito'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/AñadirAlCarrito/Page_Tienda DAC/button_Aadir al carrito'))

WebUI.verifyElementPresent(findTestObject('AñadirAlCarrito/Page_Tienda DAC/div_Se ha agregado al carrito de compras'), 0)

WebUI.click(findTestObject('Object Repository/AñadirAlCarrito/Page_Tienda DAC/div_Se ha agregado al carrito de compras'))

WebUI.verifyElementPresent(findTestObject('AñadirAlCarrito/Page_Tienda DAC/i_Ver disponibilidad_mdi mdi-close'), 0)

WebUI.verifyElementClickable(findTestObject('AñadirAlCarrito/Page_Tienda DAC/i_Ver disponibilidad_mdi mdi-close'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/AñadirAlCarrito/Page_Tienda DAC/i_Ver disponibilidad_mdi mdi-close'))

WebUI.verifyElementPresent(findTestObject('AñadirAlCarrito/Page_Tienda DAC/button_Carrito 238'), 0)

WebUI.verifyElementClickable(findTestObject('AñadirAlCarrito/Page_Tienda DAC/button_Carrito 238'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/AñadirAlCarrito/Page_Tienda DAC/button_Carrito 238'))

WebUI.verifyElementPresent(findTestObject('AñadirAlCarrito/Page_Tienda DAC/div_Apple MacBook Pro 13-inch    Item ID 70_ce90e5'), 
    0)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/AñadirAlCarrito/Page_Tienda DAC/div_Apple MacBook Pro 13-inch    Item ID 70_ce90e5'))

WebUI.delay(3)

WebUI.closeBrowser()

