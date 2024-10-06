package interview;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;
public class sample {

	



	    public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("lg soundbar",Keys.ENTER);
/*
	        try {
	            // Open Amazon.in and search for LG soundbar
	            driver.get("https://www.amazon.in/s?k=lg+soundbar");
	            // Extract product names and prices
	            List<Product> products = new ArrayList<>();
	            List<WebElement> items = driver.findElements(By.cssSelector("div.s-result-item"));

	            for (WebElement item : items) {
	                try {
	                    String name = item.findElement(By.cssSelector("h2 .a-text-normal")).getText();
	                    String priceWhole = item.findElement(By.cssSelector(".a-price-whole")).getText();
	                    String priceFraction = item.findElement(By.cssSelector(".a-price-fraction")).getText();
	                    System.out.println(name);
	                    
	                    // Combine whole and fractional parts of the price
	                    String price = priceWhole + priceFraction;
	                    System.out.println(price);
	                    int priceValue = Integer.parseInt(price.replaceAll("[^0-9]", ""));

	                    products.add(new Product(name, priceValue));
	                } catch (Exception e) {
	                    // Handle missing price or name
	                    products.add(new Product("Unknown", 0));
	                }
	            }

	            // Sort products by price
	            Collections.sort(products, Comparator.comparingInt(Product::getPrice));

	            // Print the sorted products
	            for (Product product : products) {
	                System.out.println("Product Name: " + product.getName() + ", Price: " + product.getPrice());
	            }

	        } finally {
	            // Close the WebDriver
	            driver.quit();
	        }
	    }
	}

	class Product {
	    private String name;
	    private int price;

	    public Product(String name, int price) {
	        this.name = name;
	        this.price = price;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getPrice() {
	        return price;*/
			HashMap<String,Integer> map= new HashMap();
			String productName;
			Integer productprice;
			List<WebElement> products = driver.findElements(By.xpath("//div[@data-component-type='s-search-result']"));
			for(WebElement e:products) {
				JavascriptExecutor js = (JavascriptExecutor) driver;

		        // Scroll the element into view
		        js.executeScript("arguments[0].scrollIntoView(true);", e);
				// productName = e.findElement(By.cssSelector("h2 .a-size-medium.a-color-base.a-text-normal")).getText();
		        productName=e.findElement(By.xpath(".//span[@class='a-size-medium a-color-base a-text-normal']")).getText();
				//System.out.println(productName);
				
		if( !(e.findElements(By.cssSelector(".a-price-whole"))).isEmpty()) {
		productprice =Integer.valueOf( e.findElement(By.cssSelector(".a-price-whole")).getText().replace(",", ""));
		}
		else {
			 productprice=0;
			} 
	//	System.out.println(productName);
	//	System.out.println(productprice);

		map.put(productName, productprice);
			//	System.out.println(productName);
				//System.out.println(productprice);
		
			}
		//	System.out.println(map.size());
	//	map.forEach((k,v)-> System.out.println(k +" "+v) );
		List list=new ArrayList(map.entrySet());
		list.sort(Entry.comparingByValue());
		list.forEach(System.out::println);
	

	    } 
	}

