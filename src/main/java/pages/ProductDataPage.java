package pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class ProductDataPage
{
    WebDriver driver;

    public ProductDataPage(WebDriver driver)
    {
        this.driver = driver;
    }

    @FindBy (how = How.ID, using = "startdate")
    WebElement dateStart;
    @FindBy (how = How.ID, using = "insurancesum")
    WebElement dropInsuranceSum;
    @FindBy (how = How.ID, using = "meritrating")
    WebElement dropMeritRating;
    @FindBy (how = How.ID, using = "damageinsurance")
    WebElement dropDamageInsurance;
    @FindBy (how = How.ID, using = "EuroProtection")
    WebElement comboEuroProtection;
    @FindBy (how = How.ID, using = "LegalDefenseInsurance")
    WebElement comboLegalDefenseInsurance;
    @FindBy (how = How.ID, using = "courtesycar")
    WebElement dropCourtesyCar;
    @FindBy (how = How.ID, using = "nextselectpriceoption")
    WebElement btnNext;

    public void Fill_dateStart(String strDate)
    {
        dateStart.sendKeys(strDate);
    }

    public void Select_dropInsuranceSum(String strInsuranceSum)
    {
        Select selInsuranceSum = new Select(dropInsuranceSum);
        selInsuranceSum.selectByValue(strInsuranceSum);
    }

    public void Select_dropMeritRating(String strMeritRating)
    {
        Select selMeritRating = new Select(dropMeritRating);
        selMeritRating.selectByValue(strMeritRating);
    }

    public void Select_dropDamageInsurance(String strDamageInsurance)
    {
        Select selDamageInsurance = new Select(dropDamageInsurance);
        selDamageInsurance.selectByValue(strDamageInsurance);
    }

    public void Select_comboEuroProtection()
    {
        if (comboEuroProtection.isSelected()){

        }
        else {
            comboEuroProtection.sendKeys(Keys.SPACE);
            Assert.assertTrue
                    ("The combo Euro Protection is not selected", comboEuroProtection.isSelected());
        }
    }

    public void Select_comboLegalDefenseInsurance()
    {
        if (comboLegalDefenseInsurance.isSelected()){

        }
        else {
            comboLegalDefenseInsurance.sendKeys(Keys.SPACE);
            Assert.assertTrue
                    ("The combo LegalDefenseInsurance is not selected", comboLegalDefenseInsurance.isSelected());
        }



    }

    public void Select_dropCourtesyCar (String strCourtesyCar)
    {
        Select selCourtesyCar = new Select(dropCourtesyCar);
        selCourtesyCar.selectByValue(strCourtesyCar);
    }

    public void Click_btnNext()
    {
        btnNext.click();
    }




}
