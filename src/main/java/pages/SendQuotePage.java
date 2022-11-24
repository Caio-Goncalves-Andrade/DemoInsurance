package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SendQuotePage
{

    WebDriver driver;

    public SendQuotePage(WebDriver driver)
    {
        this.driver = driver;
    }

    @FindBy (how = How.ID, using = "email")
    WebElement txtEmail;
    @FindBy (how = How.ID, using = "phone")
    WebElement txtPhone;
    @FindBy (how = How.ID, using = "username")
    WebElement txtUsername;
    @FindBy (how = How.ID, using = "password")
    WebElement txtPassword;
    @FindBy (how = How.ID, using = "confirmpassword")
    WebElement txtConfirmPassword;
    @FindBy (how = How.ID, using = "sendemail")
    WebElement btnSendEmail;
    @FindBy (how = How.XPATH, using = "/html/body/div[4]/h2" )
    WebElement txtConfirmation;

    public void Fill_txtEmail(String strEmail)
    {
        txtEmail.sendKeys(strEmail);
    }
    public void Fill_txtPhone(String strPhone)
    {
        txtPhone.sendKeys(strPhone);
    }
    public void Fill_txtUsername(String strUsername)
    {
        txtUsername.sendKeys(strUsername);
    }
    public void Fill_txtPassword(String strPassword)
    {
        txtPassword.sendKeys(strPassword);
    }
    public void Fill_txtConfirmPassword(String strConfirmPassword)
    {
        txtConfirmPassword.sendKeys(strConfirmPassword);
    }

    public void Click_btnSendEmail()
    {
        btnSendEmail.click();
    }

    public void Wait_for_txtConfirmation()
    {
        new WebDriverWait(driver, Duration.ofSeconds(60)).
                until(ExpectedConditions.visibilityOf(txtConfirmation));
    }
    public void check_txtConfirmation(String messageExpected)
    {
     String confirmation = txtConfirmation.getText();
     String message = messageExpected;
        Assert.assertTrue(confirmation.contains(messageExpected));
    }
}
