import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\i.salem.ext\\Desktop\\ibrahim\\My chrom driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        
		driver.get("https:\\Booking.com");
		Thread.sleep(3000);
		driver.findElement(By.id("ss")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("ss")).sendKeys("Amman"+Keys.ARROW_DOWN);
	}

}
