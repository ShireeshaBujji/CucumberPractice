package MySteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class MyStepdefs {
    public WebDriver driver;


    @Given("the user lunch the browser")
    public void the_user_lunch_the_browser() {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @When("user hit the url")
    public void user_hit_the_url() throws InterruptedException {
        Thread.sleep(5000);
        driver.get("http://demo.automationtesting.in/Register.html");

    }

    @Then("the user able to see register form")
    public void the_user_able_to_see_register_form() throws InterruptedException {
        Thread.sleep(5000);
        String heding = driver.findElement(By.xpath("//h2[text()='Register']")).getText();
        System.out.println("Header : " + heding);
        if (!heding.equalsIgnoreCase("Register")) {
            Assert.assertTrue(false);
        }

    }

    @Given("open url")
    public void openUrl() {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        driver = new ChromeDriver();
       driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");

    }

    @When("enter username")
    public void enterUsername() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
    }

    @And("enter password")
    public void enterPassword() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
    }

    @And("click on login button")
    public void clickOnLoginButton() {
        driver.findElement(By.id("btnLogin")).click();
    }

    @Then("user login successfull")
    public void userLoginSuccessfull() {
        String title=driver.getTitle();
        System.out.println(title);
    }



    @And("the user see {string}")
    public void theUserSee(String str) {
        System.out.println("Message : "+str);
    }
}









//
//    @Given("the user lunch the browser")
//    public void the_user_lunch_the_browser() {
//
//    }
//
//    @When("user hit the url")
//    public void userHitTheUrl() throws InterruptedException {
//
//    }
//
//    @Then("the user able to see register form")
//    public void theUserAbleToSeeRegisterForm() throws InterruptedException {
//
//    }

//    @When("user hit the (.+)")
//    public void userHitTheURL(String url) throws InterruptedException {
//        Thread.sleep(5000);
//        System.out.println(url);
//        driver.get(url);
//    }

