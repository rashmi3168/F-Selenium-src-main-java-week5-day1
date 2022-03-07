package week5.day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DeleteLead extends BaseClass{

	@Test(priority = 1, enabled = false)
	public void deleteLead() throws InterruptedException
	{
				
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9007721864");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		String text = driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		//driver.findElement(By.xpath("//span[text()='Phone']")).click();
		System.out.println(text);
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//input[@class=' x-form-text x-form-field ']")).sendKeys(text);
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(text);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String s=driver.findElement(By.className("x-paging-info")).getText();
				
		if(s.equals("No records to display"))
		{
			System.out.println("Text Matched");
		}
		else
		{
			System.out.println("Text not Matched");
		}
		driver.close();
	}
		//driver.findElement(By.linkText("")).click();

}


