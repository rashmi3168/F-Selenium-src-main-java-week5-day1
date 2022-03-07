package week5.day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EditLead extends BaseClass{
	
	@Test(priority = 2,enabled = true)
	public void editLead() throws InterruptedException {
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Rashmi");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		Thread.sleep(3000);
		System.out.println("Page Title:-"+driver.getTitle());
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Atomation Testing");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		driver.close();

	}

}
