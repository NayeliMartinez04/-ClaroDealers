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

//Lamando al CP-001_Login
WebUI.callTestCase(findTestCase('CP-001_Login'), [:], FailureHandling.STOP_ON_FAILURE)

//Validando Perfil de Socio
WebUI.verifyElementPresent(findTestObject('Configuración/Page_Tienda DAC/button_Alejandro Germosn'), 0)

//Validando que sea clickable
WebUI.verifyElementClickable(findTestObject('Configuración/Page_Tienda DAC/button_Alejandro Germosn'))

//Haciendo click en Perfil de Socio
WebUI.click(findTestObject('Configuración/Page_Tienda DAC/button_Alejandro Germosn'))

//Validando Perfil de Socio
WebUI.verifyElementPresent(findTestObject('Configuración/Page_Tienda DAC/p_Alejandro Germosn'), 0)

//Validando que sea clickable
WebUI.verifyElementClickable(findTestObject('Configuración/Page_Tienda DAC/p_Alejandro Germosn'))

//Haciendo click en Perfil de Socio
WebUI.click(findTestObject('Configuración/Page_Tienda DAC/p_Alejandro Germosn'))

//Validando Configuración
WebUI.verifyElementPresent(findTestObject('Configuración/Page_Tienda DAC/span_Configuracin'), 0)

//Validando que sea clickable
WebUI.verifyElementClickable(findTestObject('Configuración/Page_Tienda DAC/span_Configuracin'))

//Haciendo click en Configuración
WebUI.click(findTestObject('Configuración/Page_Tienda DAC/span_Configuracin'))

//Validando SMS
WebUI.verifyElementPresent(findTestObject('Configuración/Page_Tienda DAC/label_SMS'), 0)

//Validando que sea clickable
WebUI.verifyElementClickable(findTestObject('Configuración/Page_Tienda DAC/label_SMS'))

//Haciendo click en SMS
WebUI.click(findTestObject('Configuración/Page_Tienda DAC/label_SMS'))

//Validando Perfil de Correo Electrónico
WebUI.verifyElementPresent(findTestObject('Configuración/Page_Tienda DAC/label_Correo electronico'), 0)

//Validando que sea clickable
WebUI.verifyElementClickable(findTestObject('Configuración/Page_Tienda DAC/label_Correo electronico'))

//Haciendo click en Correo Electrónico
WebUI.click(findTestObject('Configuración/Page_Tienda DAC/label_Correo electronico'))

//Validando Aplicación
WebUI.verifyElementPresent(findTestObject('Configuración/Page_Tienda DAC/label_Aplicacion'), 0)

//Validando que sea clickable
WebUI.verifyElementClickable(findTestObject('Configuración/Page_Tienda DAC/label_Aplicacion'))

//Haciendo click en Aplicación
WebUI.click(findTestObject('Configuración/Page_Tienda DAC/label_Aplicacion'))

//Validando botón Guardar configuración
WebUI.verifyElementPresent(findTestObject('Configuración/Page_Tienda DAC/button_Guardar configuracin'), 0)

//Validando que sea clickable
WebUI.verifyElementClickable(findTestObject('Configuración/Page_Tienda DAC/button_Guardar configuracin'))

//Haciendo click en Guardar configuración
WebUI.click(findTestObject('Configuración/Page_Tienda DAC/button_Guardar configuracin'))

