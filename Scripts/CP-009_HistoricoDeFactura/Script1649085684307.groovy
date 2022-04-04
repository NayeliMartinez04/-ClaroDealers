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

//Validando Histórico de factura
WebUI.verifyElementPresent(findTestObject('Hitórico de factura/Page_Tienda DAC/a_Histrico de factura'), 0)

//Validando que el elemento sea clickable
WebUI.verifyElementClickable(findTestObject('Hitórico de factura/Page_Tienda DAC/a_Histrico de factura'))

//Haciendo click en Histórico de factura
WebUI.click(findTestObject('Hitórico de factura/Page_Tienda DAC/a_Histrico de factura'))

//Validando botón Visualizar
WebUI.verifyElementPresent(findTestObject('Hitórico de factura/Page_Tienda DAC/a_Visualizar'), 0)

//Validando que el botón sea clickable
WebUI.verifyElementClickable(findTestObject('Hitórico de factura/Page_Tienda DAC/a_Visualizar'))

//Haciendo click en Visualizar
WebUI.click(findTestObject('Hitórico de factura/Page_Tienda DAC/a_Visualizar'))

