package seleniumEx;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sample {

	public static void main(String[] args) {
		// Today GOLD & SILVER Rate Per Gram in Chennai (INR)	 	
		System.setProperty("webdriver.chrome.driver",
				"C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// open google Browser
		driver.get("https://www.google.com");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		//switch to frame
		driver.switchTo().frame(0);
		WebElement click= driver.findElement(By.xpath("//button[text()='No thanks']"));
		click.click();
		// go to main Browser
		driver.switchTo().defaultContent();
		// search box enter Livechennai Website
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@title='Search']")));
		WebElement w = driver.findElement(By.xpath("(//input[@class='gLFyf gsfi'])"));
		w.sendKeys("livechennai"+Keys.ENTER);
		// click the Gold Rate Website
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='l'])[1]")));
		WebElement search = driver.findElement(By.xpath("(//a[@class='l'])[1]"));
		search.click(); 
		// find CHENNAI GOLD RATE header of table 
		System.out.println("TODAY CHENNAI GOLD RATE");
		List<WebElement> header = driver.findElements(By.xpath("(//span[@class='title-clr'])"));
		int hedsize = header.size();
		// find the header date
		for(int a=1;a<=1;a++) {
			WebElement headerG = driver.findElement(By.xpath("(//span[@class='title-clr'])["+a+"]"));
			String hd = headerG.getText();
			System.out.print("|   "+hd+"      |");
		}
		// find the Pure Gold (24 k)/ Standard Gold (22 K)
		for(int a=2;a<=3;a++) {
			WebElement headerG = driver.findElement(By.xpath("(//span[@class='title-clr'])["+a+"]"));
			String hd = headerG.getText();
			System.out.print(hd+"|");
		}
		System.out.println();
		// find the |1 grm||8 grm| pure
		for(int a=4;a<=4;a++) {
			WebElement headerG = driver.findElement(By.xpath("(//span[@class='title-clr'])["+a+"]"));
			String hd = headerG.getText();
			System.out.print("              |"+hd+"  |");
		}
		//find the |1 grm||8 grm| standard
		for(int a=5;a<=7;a++) {
			WebElement headerG = driver.findElement(By.xpath("(//span[@class='title-clr'])["+a+"]"));
			String hd = headerG.getText();
			System.out.print(" "+hd+"  |");
		}
		System.out.println();
		// find Cow & Coloum Gold Rate
		List<WebElement> goldTable = driver.findElements(By.xpath("(//td[@width='9%'])"));
		int data =goldTable.size();  
		// Row & Coloum find store the text one String value
		for(int i=1;i<=data;i++) {
			WebElement date = driver.findElement(By.xpath("(//td[@width='9%'])["+i+"]"));
			String value = date.getText();
			WebElement pure1gm = driver.findElement(By.xpath("(//td[@width='16%'])["+i+"]"));
			String value1 = pure1gm.getText();
			WebElement pure8gm = driver.findElement(By.xpath("(//td[@width='12%'])["+i+"]"));
			String value2 = pure8gm.getText();
			WebElement standard1gm = driver.findElement(By.xpath("(//td[@width='22%'])["+i+"]"));
			String value3 = standard1gm.getText();
			WebElement standard8gm = driver.findElement(By.xpath("(//td[@width='11%'])["+i+"]"));
			String value4 = standard8gm.getText();
			System.out.println(value+"|"+value1+"|"+value2+"|"+value3+"|"+value4+"|");
		}
		// Silver Table Header find and Print the text
		System.out.println("    -----------------------------------------------------------    ");
		System.out.println("TODAY CHENNAI SILVER RATE");
		WebElement date = driver.findElement(By.xpath("(//td[@bordercolor='#808080'])[1]"));
		String d= date.getText();
		WebElement grm = driver.findElement(By.xpath("(//td[@bordercolor='#808080'])[2]"));
		String d1= grm.getText();
		WebElement kg = driver.findElement(By.xpath("(//td[@bordercolor='#808080'])[3]"));
		String d2= kg.getText();
		System.out.println(d+"|"+d1+"|"+d2+"|");
		// Row & Coloum find the Size
		List<WebElement> silver = driver.findElements(By.xpath("(//font[@color='#484848' and  contains(text(),'August')])"));
		int hdS =silver.size();
		//Row & Coloum find store the text one String value 
		for(int i=1;i<=hdS;i++) {
			WebElement silverDate = driver.findElement(By.xpath("(//font[@color='#484848' and  contains(text(),'August')])["+i+"]"));
			String value = silverDate.getText();
			WebElement silverGrm1 = driver.findElement(By.xpath("(//font[@color='#484848' and text()>=55 and text()<70])["+i+"]"));
			String value1 = silverGrm1.getText();
			WebElement silver1Kg = driver.findElement(By.xpath("(//font[@color='#484848' and text()>=55000 and text()<70000])["+i+"]"));
			String value2 = silver1Kg.getText();
			System.out.println(value+ "|" +value1 +"|"+value2+"|");
		}	
	}
}


