package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.security.Key;
import java.time.Duration;

public class VeiculeDataPage {
    WebDriver driver;

    public VeiculeDataPage(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(how = How.ID, using = "make")
    WebElement dropMake;
    @FindBy(how = How.ID, using = "model")
    WebElement dropModel;
    @FindBy(how = How.ID, using = "cylindercapacity")
    WebElement txtCylinder;
    @FindBy(how = How.ID, using = "engineperformance")
    WebElement txtEngine;
    @FindBy(how = How.ID, using = "dateofmanufacture")
    WebElement dateManufacture;
    @FindBy(how = How.ID, using = "numberofseats")
    WebElement dropSeats;
    @FindBy(how = How.ID, using = "righthanddriveyes")
    WebElement radioYes;
    @FindBy(how = How.ID, using = "righthanddriveno")
    WebElement radioNo;
    @FindBy(how = How.ID, using = "numberofseatsmotorcycle")
    WebElement dropSeatsMoto;
    @FindBy(how = How.ID, using = "fuel")
    WebElement dropFuel;
    @FindBy(how = How.ID, using = "payload")
    WebElement txtPayload;
    @FindBy(how = How.ID, using = "totalweight")
    WebElement txtTotalWeight;
    @FindBy(how = How.ID, using = "listprice")
    WebElement txtListPrice;
    @FindBy(how = How.ID, using = "licenseplatenumber")
    WebElement txtLicensePlateNumber;
    @FindBy(how = How.ID, using = "annualmileage")
    WebElement txtAnnualMileage;
    @FindBy(how = How.ID, using = "nextenterinsurantdata")
    WebElement btnNext;
    @FindBy(how = How.ID, using = "enterinsurantdata")
    WebElement tabInsurantData;
    public void Select_dropMake(String strMake)
    {
        Select selMake = new Select(dropMake);
        selMake.selectByValue(strMake);
    }
    public void Select_dropModel(String strModel)
    {
        Select selModel = new Select(dropModel);
        selModel.selectByValue(strModel);
    }
    public void Fill_txtCylinder(String strCylinder)
    {
        txtCylinder.sendKeys(strCylinder);
    }

    public void Fill_txtEngine(String strEngine)
    {
        txtEngine.sendKeys(strEngine);
    }

    public void Fill_dateManufacture(String strManufacture)
    {
        dateManufacture.sendKeys(strManufacture);
    }

    public void Select_dropSeats(String strSeats)
    {
        Select selSeats = new Select(dropSeats);
        selSeats.selectByValue(strSeats);
    }

    public void Select_dropFuel(String strFuel)
    {
        Select selFuel = new Select(dropFuel);
        selFuel.selectByValue(strFuel);
    }

    public void Click_On_Radio_Yes_Right_Hand() throws InterruptedException
    {
        radioYes.sendKeys(Keys.SPACE);
    }

    public void Click_On_Radio_No_Right_Hand(){
        radioNo.sendKeys(Keys.SPACE);
    }

    public void Select_dropSeatsMoto(String strSeatsMoto)
    {
        Select selSeatsMoto = new Select(dropSeatsMoto);
        selSeatsMoto.selectByValue(strSeatsMoto);
    }

    public void Fill_Payload(String strPayload)
    {
        txtPayload.sendKeys(strPayload);
    }

    public void Fill_TotalWeight(String strTotalWeight)
    {
        txtTotalWeight.sendKeys(strTotalWeight);
    }

    public void Fill_ListPrice(String strListPrice)
    {
        txtListPrice.sendKeys(strListPrice);
    }

    public void Fill_LicensePlateNumber(String strLicensePlateNumber)
    {
        txtLicensePlateNumber.sendKeys(strLicensePlateNumber);
    }

    public void Fill_AnnualMileage(String strAnnualMileage)
    {
        txtAnnualMileage.sendKeys(strAnnualMileage);
    }

    public void Click_btnNext()
    {
        btnNext.click();
    }
    public void WaitForInsurantDataTab()
    {
        Duration timeout = Duration.ofSeconds(60);
        new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeSelected(tabInsurantData));
    }
}
