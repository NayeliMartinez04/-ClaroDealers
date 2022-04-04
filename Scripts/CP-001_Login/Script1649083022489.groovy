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

//Abriendo navegador
WebUI.openBrowser('')

//Navegando a la URL de Claro Dealer
WebUI.navigateToUrl(GlobalVariable.url)

//Validando input correo
WebUI.verifyElementPresent(findTestObject('Login/Page_Tienda DAC/input_Correo_input'), 0)

//Agregando el correo
WebUI.setText(findTestObject('Login/Page_Tienda DAC/input_Correo_input'), GlobalVariable.user)

//Validando input contraseña
WebUI.verifyElementPresent(findTestObject('Login/Page_Tienda DAC/input_Contrasea_input'), 0)

//Agregando la contraseña
WebUI.setEncryptedText(findTestObject('Login/Page_Tienda DAC/input_Contrasea_input'), GlobalVariable.password)

//Validando el botón de iniciar sesión
WebUI.verifyElementPresent(findTestObject('Login/Page_Tienda DAC/button_Iniciar'), 0)

//Validando que el botón sea clickable
WebUI.verifyElementClickable(findTestObject('Login/Page_Tienda DAC/button_Iniciar'))

//Haciendo click en inicar sesión
WebUI.click(findTestObject('Login/Page_Tienda DAC/button_Iniciar'))

//Validando la cadena comercial
WebUI.verifyElementPresent(findTestObject('Login/Page_Tienda DAC/div_Plaza Lama1234'), 0)

//Validando que el elemento sea clickable
WebUI.verifyElementClickable(findTestObject('Login/Page_Tienda DAC/div_Plaza Lama1234'))

//Haciendo click en la cadena comercial
WebUI.click(findTestObject('Login/Page_Tienda DAC/div_Plaza Lama1234'))

//Maximizando
WebUI.maximizeWindow()

