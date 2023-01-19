package pages;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class PriceOptionPage
{
    WebDriver driver;

    public PriceOptionPage(WebDriver driver)
    {
        this.driver = driver;
    }

    @FindBy (how = How.ID, using = "selectsilver")
    WebElement radioSilver;
    @FindBy (how = How.ID, using = "selectgold")
    WebElement radioGold;

    @FindBy (how = How.ID, using = "selectplatinum")
    WebElement radioPlatinum;
    @FindBy (how = How.ID, using = "selectultimate")
    WebElement radioUltimate;
    @FindBy (how = How.ID, using = "nextsendquote")
    WebElement btnNext;

    public void Select_radioSilver()
    {
        radioSilver.sendKeys(Keys.SPACE);
        Assert.assertTrue
                ("The field Silver is not selected",radioSilver.isSelected());

    }
    public void Select_radioGold()
    {
        radioGold.sendKeys(Keys.SPACE);
        Assert.assertTrue
                ("The field Gold is not selected",radioGold.isSelected());

    }

    public void Wait_forRadioPlatinum()
    {
        new WebDriverWait (driver, Duration.ofSeconds(60)).
                until(ExpectedConditions.elementToBeClickable(radioPlatinum));
    }
    public void Select_radioPlatinum()
    {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click()", radioPlatinum);

    }
    public void Select_radioUltimate()
    {
        radioUltimate.sendKeys(Keys.SPACE);
        Assert.assertTrue
                ("The field Ultimate is not selected",radioUltimate.isSelected());

    }

    public void Wait_btnNext()
    {
        new WebDriverWait (driver, Duration.ofSeconds(60)).
                until(ExpectedConditions.elementToBeClickable(btnNext));
    }

    public void Click_btnNext()
    {
        btnNext.click();
    }

}
