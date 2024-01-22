package in.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///Users/apple/Downloads/wingdent%20final%201/WingDent2-master/index.html");
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//i[@class='fas fa-calendar-plus'])[2]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("yeshwant");
		driver.findElement(By.id("phoneNumber")).sendKeys("1234567890");
		driver.findElement(By.id("emailInput")).sendKeys("yesh@gmail.com");
		driver.findElement(By.id("date")).sendKeys("20/20/2024");
		driver.findElement(By.xpath("//option[@value='7:00am-8:00am']")).click();
		driver.findElement(By.id("message")).sendKeys("Appointment");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='bn p-1']")).click();
		System.out.println("sucessfully booked an appointment");
		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='About']")).click();
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,3000)");
        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Service']")).click();
        JavascriptExecutor js1= (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,3000)");
        driver.navigate().back();
        
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='nav-item dropdown']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Our Dentist']")).click();
        Thread.sleep(2000);
        JavascriptExecutor js2= (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,3000)");
        driver.navigate().back();
        driver.findElement(By.xpath("//div[@class='nav-item dropdown']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Blog']")).click();
        Thread.sleep(2000);
        JavascriptExecutor js3= (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,3000)");
        driver.navigate().back();
        driver.findElement(By.xpath("//div[@class='nav-item dropdown']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Testimonial']")).click();
        Thread.sleep(2000);
        JavascriptExecutor js4= (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,3000)");
        driver.navigate().back();
        driver.findElement(By.xpath("//div[@class='nav-item dropdown']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Gallery']")).click();
        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Contact']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Full Name']")).sendKeys("Rocky");
        driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("rocky@kgf.com");
        driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("8884893326");
        driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys("Root Canals​");
        driver.findElement(By.xpath("//textarea[@placeholder='Your Message: '] ")).sendKeys("E SALA CUP NAMDHE RCB");
        driver.navigate().back();
        driver.findElement(By.xpath("(//i[@class='fas fa-calendar-plus'])[1]")).click();
        driver.navigate().back();
        JavascriptExecutor js41= (JavascriptExecutor) driver;
        js41.executeScript("window.scrollBy(0,3800)");
        System.out.println("sucessfully completed");
        driver.quit();
        //Thread.sleep(200);
        //driver.findElement(By.xpath("(//a[.='Know More'])[4]")).click();
        
       // Thread.sleep(5000);
       // driver.findElement(By.xpath("//button[.='Send Message']")).click();


}
}
