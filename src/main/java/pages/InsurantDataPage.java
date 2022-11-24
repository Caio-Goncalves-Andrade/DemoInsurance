package pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class InsurantDataPage
{
    WebDriver driver;

    public InsurantDataPage(WebDriver driver)
    {
        this.driver = driver;
    }

    @FindBy (how = How.ID, using = "firstname")
    WebElement txtFirstName;
    @FindBy (how = How.ID, using = "lastname")
    WebElement txtLastName;
    @FindBy (how = How.ID, using = "birthdate")
    WebElement dateBirth;
    @FindBy (how = How.ID, using = "gendermale")
    WebElement radioGenderMale;
    @FindBy (how = How.ID, using = "genderfemale")
    WebElement radioGenderFemale;
    @FindBy (how = How.ID, using = "streetaddress")
    WebElement txtStreetAdress;
    @FindBy (how = How.ID, using = "country")
    WebElement dropCountry;
    @FindBy (how = How.ID, using = "zipcode")
    WebElement txtZipCode;
    @FindBy (how = How.ID, using = "city")
    WebElement txtCity;
    @FindBy (how = How.ID, using = "occupation")
    WebElement dropOccupation;
    @FindBy (how = How.ID, using = "speeding")
    WebElement comboSpeeding;
    @FindBy (how = How.ID, using = "bungeejumping")
    WebElement comboBungeeJumping;
    @FindBy (how = How.ID, using = "cliffdiving")
    WebElement comboCliffDiving;
    @FindBy (how = How.ID, using = "skydiving")
    WebElement comboSkyDiving;
    @FindBy (how = How.ID, using = "other")
    WebElement comboOther;
    @FindBy (how = How.ID, using = "website")
    WebElement txtWebSite;
    @FindBy (how = How.ID, using = "nextenterproductdata")
    WebElement btnNext;
    public void Fill_txtFirstName(String strFirstName)
    {
        txtFirstName.sendKeys(strFirstName);
    }

    public void Fill_txtLastName(String strLastName)
    {
        txtLastName.sendKeys(strLastName);
    }

    public void Fill_dateBirth(String strDateBirth)
    {
        dateBirth.sendKeys(strDateBirth);
    }

    public void Select_RadioGenderMale()
    {
        radioGenderMale.sendKeys(Keys.SPACE);
        Assert.assertTrue
                ("The field Gender Male is not selected",radioGenderMale.isSelected());

    }

    public void Select_RadioGenderFemale()
    {
        radioGenderFemale.sendKeys(Keys.SPACE);
        Assert.assertTrue
                ("The Field Gender Female is not selected", radioGenderFemale.isSelected());
    }

    public void Fill_txtStreetAdress(String strStreetAdress)
    {
        txtStreetAdress.sendKeys(strStreetAdress);
    }

    public void Select_dropCountry(String strCountry)
    {
        Select selCountry = new Select(dropCountry);
        selCountry.selectByValue(strCountry);
    }

    public void Fill_txtZipCode (String strZipCode)
    {
        txtZipCode.sendKeys(strZipCode);
    }

    public void Fill_txtCity (String strCity)
    {
        txtCity.sendKeys(strCity);
    }

    public void Select_dropOccupation(String strOccupation)
    {
        Select selOccupation = new Select(dropOccupation);
        selOccupation.selectByValue(strOccupation);
    }

    public void Select_comboSpeeding()
    {
        if (comboSpeeding.isSelected()){

        }
        else {
            comboSpeeding.sendKeys(Keys.SPACE);
            Assert.assertTrue
                    ("The combo Speeding is not selected", comboSpeeding.isSelected());
        }
    }

    public void Select_comboBungeeJumping()
    {
        if (comboBungeeJumping.isSelected()){

        }
        else {
            comboBungeeJumping.sendKeys(Keys.SPACE);
            Assert.assertTrue
                    ("The combo Bungee Jumping is not selected", comboBungeeJumping.isSelected());
        }
    }

    public void Select_comboCliffDiving()
    {
        if (comboCliffDiving.isSelected()){

        }
        else {
            comboCliffDiving.sendKeys(Keys.SPACE);
            Assert.assertTrue
                    ("The combo Cliff Diving is not selected", comboCliffDiving.isSelected());
        }
    }

    public void Select_comboSkyDiving()
    {
        if (comboSkyDiving.isSelected()){

        }
        else {
            comboSkyDiving.sendKeys(Keys.SPACE);
            Assert.assertTrue
                    ("The combo Sky Diving is not selected", comboSkyDiving.isSelected());
        }
    }

    public void Select_comboOther()
    {
        if (comboOther.isSelected()){

        }
        else {
            comboOther.sendKeys(Keys.SPACE);
            Assert.assertTrue
                    ("The combo Other is not selected", comboOther.isSelected());
        }
    }

    public void Fill_txtWebsite(String strWebsite)
    {
        txtWebSite.sendKeys(strWebsite);
    }

    public void Click_btnNext()
    {
        btnNext.click();
    }
}
