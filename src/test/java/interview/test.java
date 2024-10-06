package interview;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {

	@Test
	public void verifyProductOrder() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("lg soundbar", Keys.ENTER);
		HashMap<String, Integer> map = new HashMap();
		String productName;
		Integer productprice;
		List<WebElement> products = driver.findElements(By.xpath("//div[@data-component-type='s-search-result']"));
		for (WebElement e : products) {

			productName = e.findElement(By.xpath(".//span[@class='a-size-medium a-color-base a-text-normal']"))
					.getText();

			if (!(e.findElements(By.cssSelector(".a-price-whole"))).isEmpty()) {
				productprice = Integer
						.valueOf(e.findElement(By.cssSelector(".a-price-whole")).getText().replace(",", ""));
			} else {
				productprice = 0;
			}

			map.put(productName, productprice);

		}

		List list = new ArrayList(map.entrySet());
		list.sort(Entry.comparingByValue());
		list.forEach(System.out::println);
		driver.quit();

	}
}
