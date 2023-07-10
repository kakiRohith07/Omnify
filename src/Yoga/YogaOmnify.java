package Yoga;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YogaOmnify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.getomnify.com");
		driver.manage().window().maximize();
		WebElement SignUp = driver.findElement(By.className("nav-primary-button w-button"));
		SignUp.click();
		WebElement googleButton = driver.findElement(By.xpath("//p[contains(text(),'Continue with Google')]"));
		googleButton.click();
		WebElement servicesDiv = driver.findElement(By.xpath("//div[contains(text(),'Services')]"));
		servicesDiv.click();
		WebElement createaServiceElement = driver.findElement(By.className("service-empty-state-button-text"));
		createaServiceElement.click();
		WebElement serviceTemplateCopyElement = driver.findElement(By.className("service-template-copy"));
		serviceTemplateCopyElement.click();
		WebElement classTitle = driver.findElement(By.id("title"));
		classTitle.sendKeys("YogaOmnifyClasses");
		WebElement ClassDescription = driver.findElement(By.cssSelector("div.ql-editor.ql-blank[data-placeholder='Write something awesome...']"));
		ClassDescription.sendKeys("Daily Workout");
		WebElement arrowIcon = driver.findElement(By.xpath("//mat-icon[contains(@class, 'mat-icon-no-color')]"));
		arrowIcon.click();
		WebElement AddLocation = driver.findElement(By.xpath("//div[@class='trainer-name' and text()='Online with Zoom']"));
		WebElement AddTrainer = driver.findElement(By.cssSelector("mat-select[formcontrolname='trainers']"));
		AddTrainer.click();
		WebElement trainerName = driver.findElement(By.className("trainer-name"));
		trainerName.click();
		WebElement trainerOption = driver.findElement(By.xpath("//mat-option[contains(text(),'Aditya Sai Rohith Kaki')]"));
		trainerOption.click();
		WebElement toggleButton = driver.findElement(By.className("mat-slide-toggle-thumb"));
		toggleButton.click();
		WebElement SellClassIndividually = driver.findElement(By.className("form__simple-text"));
		WebElement Servicetype = driver.findElement(By.xpath("//div[@class='select-option' and text()='Paid']"));
		Servicetype.click();
		WebElement AddPrice = driver.findElement(By.id("mat-input-1"));
		AddPrice.sendKeys("20");
		WebElement attendeeLimit = driver.findElement(By.id("mat-input-2"));
		attendeeLimit.sendKeys("10");
		WebElement toggle = driver.findElement(By.className("mat-slide-toggle"));
		toggle.click();
		WebElement dropdown = driver.findElement(By.xpath("//div[@class='mat-select-value ng-tns-c140-10']"));
		dropdown.click();
		WebElement Dayoftheweek = driver.findElement(By.xpath("//div[@class='select-option' and text()='Weekdays']"));
		Dayoftheweek.click();
		WebElement StartDate = driver.findElement(By.xpath("//div[@class='select-option' and text()='Today']"));
		StartDate.click();
		WebElement StartTime = driver.findElement(By.xpath("//span[text()='12:30 AM']"));
		StartTime.click();
		WebElement EndDate = driver.findElement(By.xpath("//div[@class='select-option' and text()='Never']"));
		EndDate.click();
		WebElement EndTime = driver.findElement(By.xpath("//span[@class='mat-option-text' and text()='01:00 AM']"));
		EndTime.click();
		WebElement BookingWindowOpens = driver.findElement(By.xpath("//div[@class='select-option' and text()='3 Weeks']"));
		BookingWindowOpens.click();
		WebElement BookingWindowCloses = driver.findElement(By.xpath("//select[@formcontrolname='scheduleStartType']"));
		BookingWindowCloses.click();
		WebElement refundableText = driver.findElement(By.xpath("//span[contains(text(),'The Class is refundable')]"));
		WebElement publishButton = driver.findElement(By.id("w-dropdown-toggle-0"));
		publishButton.click();
		WebElement Public = driver.findElement(By.cssSelector("div[_ngcontent-tgy-c245].option-wrap__content"));
		Public.click();
		WebElement publish = driver.findElement(By.xpath("//span[text()='Publish']"));
		publish.click();
		driver.close();
		driver.quit();
		
	
	}

}
