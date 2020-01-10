package googleRandomWordSearch;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GooglePage {
	
    private static final String URL = "https://www.google.com";
    private RandomGenerator randomgenerator = new RandomGenerator();
    
    void searchGoogle() throws IOException{
    	String randomWord = randomgenerator.getRandomWord("src\\main\\resources\\words.txt");
        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        driver.findElement(By.name("q")).sendKeys(randomWord);
        driver.manage().window().maximize();
        driver.findElement(By.name("btnK")).click();
        System.out.println(driver.getTitle());
        driver.close();
    }
    
    

    
    
   
    

}