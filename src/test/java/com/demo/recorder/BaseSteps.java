package com.demo.recorder;

import cucumber.api.PendingException;
import cucumber.api.java8.Zh_cn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class BaseSteps implements Zh_cn {

    private WebDriver driver;

    private String username = "";
    private String psw = "";

    public BaseSteps() {
//        Properties properties = System.getProperties();
//        System.out.println(properties.getProperty("os.name"));
        System.setProperty(
                "webdriver.chrome.driver",
                "src/test/resources/web-driver/chromedriver");
        driver = new ChromeDriver();

        假如("^我有用户名 \"([^\"]*)\" 和 密码 \"([^\"]*)\"$", (String arg1, String arg2) -> {
            username = arg1;
            psw = arg2;
        });

        当("^访问网址 \"([^\"]*)\"$", (String arg1) -> {
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.get("http://www.baidu.com/");
        });

        并且("^输入用户名和密码$", () -> {
            driver.findElement(By.id("kw")).clear();
            driver.findElement(By.id("kw")).sendKeys(username + "," + psw);
        });

        并且("^点击登录按钮$", () -> {

        });

        那么("^访问正常$", () -> {

        });
    }


//
//    @当("^Go to baidu home$")
//    public void go_to_baidu_home() throws Exception {
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        driver.get("http://www.baidu.com/");
//    }
//
//    @Given("^Go to baidu home$")
//    public void go_to_baidu_home() throws Exception {
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        driver.get("http://www.baidu.com/");
//    }
//
//    @When("^I find baidu logo")
//    public WebElement i_find_baidu_logo() {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement element = wait.until(ExpectedConditions.visibilityOf
//                (driver.findElement(By.xpath("//div[@id='lg']/img"))));
//
//        return element;
//    }
//
//
//    @And("^Type the search text \"([^\"]*)\"$")
//    public void type_the_search_text(String searchText) throws Throwable {
//        driver.findElement(By.id("kw")).clear();
//        driver.findElement(By.id("kw")).sendKeys(searchText);
//    }
//
//    @And("^Click the submit$")
//    public void click_the_submit() {
//        driver.findElement(By.id("su")).click();
//    }
//
//    @Then("^Wait the query result")
//    public void wait_the_query_result() throws InterruptedException {
//        Thread.sleep(10000);
//        Assert.assertEquals("selenium_百度搜索", driver.getTitle());
//        driver.close();
//        driver.quit();
//    }
}
