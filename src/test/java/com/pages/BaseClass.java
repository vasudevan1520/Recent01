package com.pages;

//1 DriverLaunch

//2 get
//3 getURL Navigation1
//4 getURL Navigation2
//5 forward
//6 back
//7 refresh
//8 Maximize
//9 implicit wait
//10 locateElementbyId
//11 locateElementbyname
//12 locateElementbyclassname
//13 locateElementbyxpath
//14 click
//15 getText
//16 getAttribute(1)
//17 getAttribute(1,2)
//18 sendKey
//19 Thread Sleep
//20 move to Element
//21 drag & Drop
//22 Right Click
//23 Double Click
//24 Tab
//25 Enter
//26 Shift
//27 up
//28 down
//29 AcceptAlert
//30 Dismiss Alert
//31 Promt Alert
//32 SetAttributeJS
//33 GetAttributeJS
//34 ClickJS
//35 ScrollDownJS
//36 ScrollUpJS
//37 FullScreenShot
//38 ElementScreenShot
//41 SelectByIndexDD
//42 SelectByValueDD
//43 SelectByVisibleTextDD
//44 getOption
//45 size
//46 getSelectedOption
//47 getFirstSelected
//48 isMultiple
//49 deSelectByIndexDD
//50 deSelectByValueDD
//51 deSelectByVisibleTextDD
//52 deSelectallDD
//53 quit
//54 close
//55 FrameId
//56 FrameElement
//57 FrameIndex
//58 FrameSelectByTagName
//59 exitfromFrame
//60 WindowHandeling 
//61 getHandle
//62 getHandles
//63 movetoParentWindow
//64 locateElementsbyId
//65 locateElementsbyname
//66 locateElementsbyclassname
//67 locateElementsbyxpath
//68 clear
//69 particularCell
//70 updateValue
//71 writeValueCreateCell
//39 writeValueCreateCellRow
//40 writeValueCreateSheet

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	// 1
	public static void driverLaunch(String BrowserType) {
		switch (BrowserType) {

		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "Ie":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		default:
			break;
		}

	}

	// 2
	public static void get(String value) {
		driver.get(value);
	}

	// 3
	public void getUrlNavigation(String url) {
		driver.navigate().to(url);
	}

	// 4
	public void getUrlNavigateClass(String url) throws MalformedURLException {
		URL u = new URL(url);
		driver.navigate().to(u);
	}

	// 5
	public void forward() {
		driver.navigate().forward();
	}

	// 6
	public void back() {
		driver.navigate().back();
	}

	// 7
	public void refresh() {
		driver.navigate().refresh();
	}

	// 8
	public static void maximize() {
		driver.manage().window().maximize();
	}

	// 9
	public static void implicitwait(int arg) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(arg));
	}

	// 10
	public WebElement locateElementById(String attribute) {
		WebElement element = driver.findElement(By.id(attribute));
		return element;
	}

	// 11
	public WebElement locateElementByName(String attribute) {
		WebElement element = driver.findElement(By.name(attribute));
		return element;
	}

	// 12
	public WebElement locateElementByClassName(String attribute) {
		WebElement element = driver.findElement(By.className(attribute));
		return element;
	}

	// 13
	public WebElement locateElementByxpath(String attribute) {
		WebElement element = driver.findElement(By.xpath(attribute));
		return element;
	}

	// 14
	public void click(WebElement element) {
		element.click();
	}

	// 15
	public String getText(WebElement element) {
		String text = element.getText();
		return text;
	}

	// 16
	public String getAttribute(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}

	// 17
	public String getAttribute(WebElement element, String value) {
		String attribute = element.getAttribute(value);
		return attribute;
	}

	// 18
	public void sendkey(WebElement element, String key) {
		element.sendKeys(key);
	}

	// 191
	public void sleep(int time) throws InterruptedException {
		Thread.sleep(time);
	}

	// 20
	public void moveToElement(WebElement target) {
		Actions action = new Actions(driver);
		action.moveToElement(target);
	}

	// 21
	public void dragAndDrop(WebElement source, WebElement target) {
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target);
	}

	// 22
	public void rightClick() {
		Actions action = new Actions(driver);
		action.contextClick();
	}

	// 23
	public void doubleClick() {
		Actions action = new Actions(driver);
		action.doubleClick();
	}

	// 24
	public void tab() throws AWTException {
		Robot robert = new Robot();
		robert.keyPress(KeyEvent.VK_TAB);
		robert.keyRelease(KeyEvent.VK_TAB);
	}

	// 25
	public void enter() throws AWTException {
		Robot robert = new Robot();
		robert.keyPress(KeyEvent.VK_ENTER);
		robert.keyRelease(KeyEvent.VK_ENTER);
	}

	// 26
	public void shift() throws AWTException {
		Robot robert = new Robot();
		robert.keyPress(KeyEvent.VK_SHIFT);
		robert.keyRelease(KeyEvent.VK_SHIFT);
	}

	// 27
	public void up() throws AWTException {
		Robot robert = new Robot();
		robert.keyPress(KeyEvent.VK_UP);
		robert.keyRelease(KeyEvent.VK_UP);
	}

	// 28
	public void down() throws AWTException {
		Robot robert = new Robot();
		robert.keyPress(KeyEvent.VK_DOWN);
		robert.keyRelease(KeyEvent.VK_DOWN);
	}

	// 29
	public void acceptAlert() {
		Alert al = driver.switchTo().alert();
		al.accept();
	}

	// 30
	public void dismissAlert() {
		Alert al = driver.switchTo().alert();
		al.dismiss();
		;
	}

	// 31
	public void promptAlert(String key) {
		Alert al = driver.switchTo().alert();
		al.sendKeys(key);
		al.accept();
	}

	// 32
	public void setAttribueJs(String text, WebElement args) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + text + "')", args);
	}

	// 33
	public String getAttribueJs(WebElement args) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Object es = js.executeScript("returnarguments[0].getAttribute('value')", args);
		String s = (String) es;
		return s;
	}

	// 34
	public void clickJs(WebElement args) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", args);
	}

	// 35
	public void downJs(WebElement args) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", args);
	}

	// 36
	public void upJs(WebElement args) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", args);
	}

	// 37
	public void fullScreenShot(String target) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(target);
		FileUtils.copyFile(source, des);
	}

	// 38
	public void elementScreenShot(WebElement element, String target) throws IOException {
		File source = element.getScreenshotAs(OutputType.FILE);
		File des = new File(target);
		FileUtils.copyFile(source, des);
	}

	// 41
	public void selectByIndexDD(WebElement element, int num) {
		Select s = new Select(element);
		s.selectByIndex(num);
	}

	// 42
	public void selectByValueDD(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}

	// 43
	public void selectByVisibleTextDD(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByVisibleText(value);
	}

	// 44
	public List<WebElement> getOptionDD(WebElement element) {
		Select s = new Select(element);
		List<WebElement> list = s.getOptions();
		return list;
	}

	// 45
	public int size(List<WebElement> list) {
		int size = list.size();
		return size;
	}

	// 46
	public List<WebElement> getAllSelectOption(WebElement element) {
		Select s = new Select(element);
		List<WebElement> list = s.getAllSelectedOptions();
		return list;
	}

	// 47
	public WebElement getFirstSelectedOption(WebElement element) {
		Select s = new Select(element);
		WebElement listElement = s.getFirstSelectedOption();
		return listElement;
	}

	// 48
	public boolean isMultiple(WebElement element) {
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		return multiple;
	}

	// 49
	public void deSelectByIndexDD(WebElement element, int num) {
		Select s = new Select(element);
		s.deselectByIndex(num);
	}

	// 50
	public void deSelectByValueDD(WebElement element, String value) {
		Select s = new Select(element);
		s.deselectByValue(value);
	}

	// 51
	public void deSelectByVisibleTextDD(WebElement element, String value) {
		Select s = new Select(element);
		s.deselectByVisibleText(value);
	}

	// 52
	public void deSelectAllDD(WebElement element) {
		Select s = new Select(element);
		s.deselectAll();
	}

	// 53
	public void quit() {
		driver.quit();
	}

	// 54
	public void close() {
		driver.close();
	}

	// 55
	public void selectFrameById(int num) {
		driver.switchTo().frame(num);
	}

	// 56
	public void selectFrameByElement(WebElement element) {
		driver.switchTo().frame(element);
	}

	// 57
	public void selectFrameByIndex(String nameOrId) {
		driver.switchTo().frame(nameOrId);
	}

	// 58
	public List<WebElement> locateByTagName(String tagName) {
		List<WebElement> elements = driver.findElements(By.tagName(tagName));
		return elements;
	}

	// 59
	public void exitFrame() {
		driver.switchTo().defaultContent();
	}

	// 60
	public void windowHandlingByURL(String name) {
		driver.switchTo().window(name);
	}

	// 61
	public String getParentURLId() {
		String handle = driver.getWindowHandle();
		return handle;
	}

	// 62
	public Set<String> getAllURLIds() {
		Set<String> handles = driver.getWindowHandles();
		return handles;
	}

	// 63
	public void gotoParentWindow(String handle) {
		driver.switchTo().window(handle);
	}

	// 64
	public List<WebElement> findElementsById(String attribute) {
		List<WebElement> elements = driver.findElements(By.id(attribute));
		return elements;
	}

	// 65
	public List<WebElement> findElementsByName(String attribute) {
		List<WebElement> elements = driver.findElements(By.name(attribute));
		return elements;
	}

	// 66
	public List<WebElement> findElementsByClassName(String attribute) {
		List<WebElement> elements = driver.findElements(By.className(attribute));
		return elements;
	}

	// 67
	public List<WebElement> findElementsByxpath(String attribute) {
		List<WebElement> elements = driver.findElements(By.xpath(attribute));
		return elements;
	}

	// 68
	public void clear(WebElement element) {
		element.clear();
	}

	// 69
	public String particularCell(String name, int i, int j) throws IOException {
		String res = null;
		File file = new File("C:\\Users\\user\\eclipse-workspace\\vasu\\JUnit\\Excelsheet\\Adactinhotelnew.xlsx");
		FileInputStream f = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(f);
		Sheet s = wb.getSheet(name);
		Row r = s.getRow(i);
		Cell c = r.getCell(j);
		CellType ct = c.getCellType();
		switch (ct) {
		case STRING:
			res = c.getStringCellValue();
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(c)) {
				Date date = c.getDateCellValue();
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YY");
				res = sdf.format(date);
			} else {
				double dob = c.getNumericCellValue();
				// BigDecimal bd = BigDecimal.valueOf(dob);
				long bd = (long) dob;
				res = String.valueOf(bd);
			}
			break;
		default:
			break;
		}
		return res;
	}

	// 70
	public void updateValue(String name, int i, int j, String name1, String name2) throws IOException {
		File f = new File("C:\\Users\\user\\eclipse-workspace\\vasu\\JUnit\\Excelsheet\\Adactinhotelnew.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fi);
		Sheet s = wb.getSheet(name);
		Row r = s.getRow(i);
		Cell c = r.getCell(j);
		String s1 = c.getStringCellValue();

		if (s1.equals(name1)) {
			c.setCellValue(name2);
		}
		FileOutputStream fo = new FileOutputStream(f);
		wb.write(fo);
	}

	// 71
	public void writeValueCreateCell(String name, int i, int j, String name1) throws IOException {
		File f = new File("C:\\Users\\user\\eclipse-workspace\\vasu\\JUnit\\Excelsheet\\Adactinhotelnew.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fi);
		Sheet s = wb.getSheet(name);
		Row r = s.getRow(i);
		Cell c = r.createCell(j);
		c.setCellValue(name1);
		FileOutputStream fo = new FileOutputStream(f);
		wb.write(fo);
	}

	// 39
	public void writeValueCreateCellRow(String name, int i, int j, String name1) throws IOException {
		File f = new File("C:\\Users\\user\\eclipse-workspace\\vasu\\JUnit\\Excelsheet\\Adactinhotelnew.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fi);
		Sheet s = wb.getSheet(name);
		Row r = s.createRow(i);
		Cell c = r.createCell(j);
		c.setCellValue(name1);
		FileOutputStream fo = new FileOutputStream(f);
		wb.write(fo);
	}

	// 40
	public void writeValueCreateSheet(String name, int i, int j, String name1) throws IOException {
		File f = new File("C:\\Users\\user\\eclipse-workspace\\vasu\\JUnit\\Excelsheet\\Adactinhotelnew.xlsx");
		// FileInputStream fi = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook();
		Sheet s = wb.createSheet(name);
		Row r = s.createRow(i);
		Cell c = r.createCell(j);
		c.setCellValue(name1);
		FileOutputStream fo = new FileOutputStream(f);
		wb.write(fo);
	}
}
