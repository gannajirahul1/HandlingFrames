package testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) throws InterruptedException {
		//Handling Frames
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		/*
		//frame-1
		
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));//here we passing frame into webelement
		driver.switchTo().frame(frame1);//here we are calling frame
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("rahul");//in this we are entering values in the frame
		//after writing in frame 1 if we want to go frame 2 we need to write the deafultcontent method ..After that go to frame 2
		driver.switchTo().defaultContent();//go back to the page
		//frame-2
		WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));//here we passing frame into webelement
		driver.switchTo().frame(frame2);//here we are calling frame
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("rahul gannaji");//in this we are entering values in the frame

		driver.switchTo().defaultContent();//go back to the page
		//frmae-3
		WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));//here we passing frame into webelement
		driver.switchTo().frame(frame3);//here we are calling frame
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("rahul kumar");//in this we are entering values in the frame

		driver.switchTo().defaultContent();//go back to the page
		//frame-4
		WebElement frame4=driver.findElement(By.xpath("//frame[@src='frame_4.html']"));//here we passing frame into webelement
		driver.switchTo().frame(frame4);//here we are calling frame
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("rahul madvirat");//in this we are entering values in the frame
		 */
		
		
		//handling with inner iframes
		/*
		WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));//here we passing frame into webelement
		driver.switchTo().frame(frame3);//here we are calling frame
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("rahul kumar");//in this we are entering values in the frame
		*/
		//going to inner frame
		//driver.switchTo().frame(0);
		//driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']")).click();
		/*driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@id='i14']//div[@class='uHMk6b fsHoPb']")).click();
		*/
		//driver.findElement(By.xpath("//div[@class='RH5hzf RLS9Fe']//div[@class='o3Dpx']//form[@class='rq8Mwb']")).click();
		//frame5 clicking a link 
		/** */
		WebElement frame5=driver.findElement(By.xpath("//frame[@src='frame_5.html']"));//here we passing frame into webelement
		driver.switchTo().frame(frame5);//here we are calling frame
		driver.findElement(By.tagName("a")).click();
		//	driver.findElement(By.xpath("//f[@name='name5']//center/a")).click();
		 
	
		
		Thread.sleep(5000);
		//driver.quit();
	}

}
