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

//Llamando al CP-001_Login
WebUI.callTestCase(findTestCase('CP-001_Login'), [:], FailureHandling.STOP_ON_FAILURE)

//Validando input del Buscador
WebUI.verifyElementPresent(findTestObject('Buscador/Page_Tienda DAC/input_Cell phones_input'), 0)

//Escribiendo apple en el Buscador
WebUI.setText(findTestObject('Buscador/Page_Tienda DAC/input_Cell phones_input'), 'apple')

//Validando botón Buscar
WebUI.verifyElementPresent(findTestObject('Buscador/Page_Tienda DAC/button_Cell phones_button search-button'), 0)

//Validando que el botón sea clickable
WebUI.verifyElementClickable(findTestObject('Buscador/Page_Tienda DAC/button_Cell phones_button search-button'))

//Haciendo click en el bontón Buscar
WebUI.click(findTestObject('Buscador/Page_Tienda DAC/button_Cell phones_button search-button'))

//Delay de 7 segundos
WebUI.delay(7)

//Validando input del Buscador
WebUI.verifyElementPresent(findTestObject('Buscador/Page_Tienda DAC/input_Cell phones_input'), 0)

//Escribiendo asus en el Buscador
WebUI.setText(findTestObject('Buscador/Page_Tienda DAC/input_Cell phones_input'), 'asus')

//Presionando la tecla ENTER
WebUI.sendKeys(findTestObject('Buscador/Page_Tienda DAC/input_Cell phones_input'), Keys.chord(Keys.ENTER))

