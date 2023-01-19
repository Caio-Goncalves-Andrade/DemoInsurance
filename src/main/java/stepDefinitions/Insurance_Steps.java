package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pages.VeiculeDataPage;
import pages.InsurantDataPage;
import pages.ProductDataPage;
import pages.PriceOptionPage;
import pages.SendQuotePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

public class Insurance_Steps {

    private WebDriver driver;
    VeiculeDataPage insurance;

    private VeiculeDataPage getLoginPage() {
        if (insurance == null) {
            insurance = PageFactory.initElements(driver, VeiculeDataPage.class);
        }

        return insurance;
    }


    @Before
    public void setup()
    {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/java/Drivers/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @After
    public void tearDown()
    {
        driver.quit();
    }

    @Given("Im in insurance page")
    public void im_in_insurance_page()

    {
        driver.get("http://sampleapp.tricentis.com/101/app.php");
    }

    @When("Fill all fields in Veicule Data and click in Next button")
    public void fill_all_fields_in_veicule_data_and_click_in_next_button() throws InterruptedException {
        VeiculeDataPage Veicule = PageFactory.initElements(driver, VeiculeDataPage.class);
        Veicule.Select_dropMake("Ford");
        Veicule.Select_dropModel("Moped");
        Veicule.Fill_txtCylinder("500");
        Veicule.Fill_txtEngine("1500");
        Veicule.Fill_dateManufacture("08/10/2020");
        Veicule.Select_dropSeats("2");
        Veicule.Click_On_Radio_Yes_Right_Hand();
        Veicule.Select_dropSeatsMoto("1");
        Veicule.Select_dropFuel("Diesel");
        Veicule.Fill_Payload("300");
        Veicule.Fill_TotalWeight("3000");
        Veicule.Fill_ListPrice("25000");
        Veicule.Fill_LicensePlateNumber("123456");
        Veicule.Fill_AnnualMileage("5000");
        Veicule.Click_btnNext();
        Thread.sleep(1000);
    }
    @When("Fill all fields in Insurant Data and click in Next button")
    public void fill_all_fields_in_insurant_data_and_click_in_next_button() throws InterruptedException {
        InsurantDataPage Insurant = PageFactory.initElements(driver, InsurantDataPage.class);
        Insurant.Fill_txtFirstName("Joao");
        Insurant.Fill_txtLastName("Silva");
        Insurant.Fill_dateBirth("05/15/1990");
        Insurant.Select_RadioGenderMale();
        Insurant.Fill_txtStreetAdress("Celso Garcia");
        Insurant.Select_dropCountry("Brazil");
        Insurant.Fill_txtZipCode("12345678");
        Insurant.Fill_txtCity("São Paulo");
        Insurant.Select_dropOccupation("Farmer");
        Insurant.Select_comboSpeeding();
        Insurant.Select_comboSkyDiving();
        Insurant.Fill_txtWebsite("http://sampleapp.tricentis.com/101/app.php");
        Insurant.Click_btnNext();
        Thread.sleep(1000);
    }
    @When("Fill all fields in Product Data and click in Next button")
    public void fill_all_fields_in_product_data_and_click_in_next_button() throws InterruptedException {
        ProductDataPage Product = PageFactory.initElements(driver, ProductDataPage.class);
        Product.Fill_dateStart("02/20/2023");
        Product.Select_dropInsuranceSum("5000000");
        Product.Select_dropMeritRating("Bonus 1");
        Product.Select_dropDamageInsurance("Partial Coverage");
        Product.Select_comboEuroProtection();
        Product.Select_comboLegalDefenseInsurance();
        Product.Select_dropCourtesyCar("Yes");
        Product.Click_btnNext();
        Thread.sleep(1000);
    }
    @When("Fill all fields in Price Option and click in Next button")
    public void fill_all_fields_in_price_option_and_click_in_next_button() throws InterruptedException {
        PriceOptionPage Price = PageFactory.initElements(driver, PriceOptionPage.class);
        Price.Wait_forRadioPlatinum();
        Price.Select_radioPlatinum();
        Price.Wait_btnNext();
        Price.Click_btnNext();
        Thread.sleep(1000);

    }
    @When("Fill all fields in Send Quote and click in Send button")
    public void fill_all_fields_in_send_quote_and_click_in_send_button() throws InterruptedException {
        SendQuotePage Send = PageFactory.initElements(driver, SendQuotePage.class);
        Send.Fill_txtEmail("teste@teste.com");
        Send.Fill_txtPhone("123456789");
        Send.Fill_txtUsername("Teste");
        Send.Fill_txtPassword("Abcd1234");
        Send.Fill_txtConfirmPassword("Abcd1234");
        Send.Click_btnSendEmail();
        Thread.sleep(2000);
    }
    @Then("Check the successful message")
    public void check_the_successful_message() throws InterruptedException {
        SendQuotePage Send = PageFactory.initElements(driver, SendQuotePage.class);
        Send.Wait_for_txtConfirmation();
        Send.check_txtConfirmation("Sending e-mail success!");
    }
}
