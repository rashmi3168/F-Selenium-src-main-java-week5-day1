package week5.day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DuplicateLead extends BaseClass{

	@Test(priority = 4, enabled = true)
	public void duplicateLead() throws InterruptedException {
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		String s=driver.getTitle();
		System.out.println(s);
		String s1=driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		System.out.println(s1);
		if (s.contains(s1))
		{
			driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
			Thread.sleep(3000);
			driver.close();
		}
		else
			driver.close();

	}

}
