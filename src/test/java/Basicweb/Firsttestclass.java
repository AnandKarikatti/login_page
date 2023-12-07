package Basicweb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Firsttestclass {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://vistaslearning.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='auth-link filled']\r\n")).click();
		Thread.sleep(2000);
		
		//blank fields
		
		driver.findElement(By.xpath("//input[@class='el-input__inner']")).click();
		driver.findElement(By.xpath("//input[@class='el-input__inner']")).sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("");
		driver.findElement(By.xpath("//button[@class='el-button el-button--primary is-round']")).click();
		Thread.sleep(2000);
		
		//without mobile number and with password
		driver.findElement(By.xpath("//input[@class='el-input__inner']")).click();
		driver.findElement(By.xpath("//input[@class='el-input__inner']")).sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='el-button el-button--primary is-round']")).click();
		Thread.sleep(2000);
		
		//clear field
		driver.findElement(By.xpath("//input[@class='el-input__inner']")).clear();
		driver.findElement(By.xpath("//input[@type='password']")).clear();
		
		
		//with mobile number and without password
		driver.findElement(By.xpath("//input[@class='el-input__inner']")).click();
		driver.findElement(By.xpath("//input[@class='el-input__inner']")).sendKeys("8197496756");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='el-button el-button--primary is-round']")).click();
		Thread.sleep(2000);
		
		//clear field
		driver.findElement(By.xpath("//input[@class='el-input__inner']")).clear();
		driver.findElement(By.xpath("//input[@type='password']")).clear();
		
		
		//with Valid mobile no and invalid password
		driver.findElement(By.xpath("//input[@class='el-input__inner']")).click();
		driver.findElement(By.xpath("//input[@class='el-input__inner']")).sendKeys("8197496756");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='el-button el-button--primary is-round']")).click();
		Thread.sleep(2000);
		
		//clear field
		driver.findElement(By.xpath("//input[@class='el-input__inner']")).clear();
		driver.findElement(By.xpath("//input[@type='password']")).clear();

		// with invalid mobile no and valid password
		driver.findElement(By.xpath("//input[@class='el-input__inner']")).sendKeys("988697987");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='el-button el-button--primary is-round']")).click();
		Thread.sleep(2000);
		
		//clear field
				driver.findElement(By.xpath("//input[@class='el-input__inner']")).clear();
				driver.findElement(By.xpath("//input[@type='password']")).clear();
		Thread.sleep(2000);	
				
		//with valid mobile no and valid password
				driver.findElement(By.xpath("//input[@class='el-input__inner']")).click();
				driver.findElement(By.xpath("//input[@class='el-input__inner']")).sendKeys("9886979870");
				Thread.sleep(2000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[2]/div[3]/div/div[1]/form/div[2]/div/div/input")).sendKeys("123456");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@class='el-button el-button--primary is-round']")).click();
					

	}

}
