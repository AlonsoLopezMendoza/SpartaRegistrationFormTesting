package com.sparta.alm.Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.pagefactory.ByChained;

public class SpartaRegistrationPage {

    WebDriver webDriver;
    By firstName = new By.ById("firstName");
    By firstNameErrorMessage = new By.ByCssSelector("div:nth-of-type(1) > .form-group > .invalid-feedback");

    By lastName = new By.ById("lastName");
    By lastNameErrorMessage = new By.ByCssSelector("div:nth-of-type(2) > .form-group > .invalid-feedback");

    By age = new By.ByClassName("form-control");
    By ageErrorMessage = new By.ByCssSelector("div:nth-of-type(3) > .form-group > .invalid-feedback");

    By dob = new By.ByCssSelector("input[name='dob']");

    By maleRadioButton = new By.ByCssSelector(".needs-validation > div:nth-of-type(5)");
    By femaleRadioButton = new By.ByCssSelector(".needs-validation > div:nth-of-type(6)");

    By maleRadioButtonLabel = new By.ByCssSelector("div:nth-of-type(5) > .custom-control-label");
    By femaleRadioButtonLabel = new By.ByCssSelector("div:nth-of-type(6) > .custom-control-label");

    By degree = new By.ByCssSelector("body > div > form > div:nth-child(8) > div > input");

    By university = new By.ByCssSelector("");

    By address = new By.ByCssSelector("input#inputAddress");;
    By addressErrorMessage = new By.ByCssSelector("div:nth-of-type(9) > .invalid-feedback");

    By address2 = new By.ByCssSelector("input#inputAddress2");

    By city = new By.ByCssSelector("input#inputCity");
    By cityErrorMessage = new By.ByCssSelector("");

    By county = new By.ByCssSelector("");

    By postcode = new By.ByCssSelector("input#inputPostcode");
    By postcodeErrorMessage = new By.ByCssSelector(".col-md-2.form-group > .invalid-feedback");

    By email = new By.ByCssSelector("input#inputemailaddress");
    By emailErrorMessage = new By.ByCssSelector("div:nth-of-type(14) > .form-group > .invalid-feedback");

    By skills = new By.ByCssSelector("textarea#exampleFormControlTextarea1");

    By phoneNumber = new By.ByCssSelector("input#exampleFormControlInput1");
    By phoneNumberErrorMessage = new By.ByCssSelector("div:nth-of-type(16) > .form-group > .invalid-feedback");

    By linkedInURL = new By.ByCssSelector("div:nth-of-type(16) > .form-group > .invalid-feedback");

    By cvUpload = new By.ByCssSelector("input[name='cv']");

    By sdetRadioButton = new By.ByCssSelector("body > div > form > div:nth-child(21) > div:nth-child(1)");
    By devOpsRadioButton = new By.ByCssSelector("body > div > form > div:nth-child(21) > div:nth-child(2)");

    By sdetRadioButtonLabel = new By.ByCssSelector("body > div > form > div:nth-child(21) > div:nth-child(1) > label");
    By devOpsRadioButtonLabel = new By.ByCssSelector("body > div > form > div:nth-child(21) > div:nth-child(2) > label");

    By TAC = new By.ByCssSelector("input#terms");
    By TACLabel = new By.ByCssSelector("body > div > form > div:nth-child(22) > div > div > label");

    By signIn = new By.ByCssSelector("button");

    private static final String REDTEXTCOLOURSTRING = "rgba(220, 53, 69, 1)";
    private static final String REDBORDERCOLOURSTRING = "rgb(220, 53, 69, 1)";

    public SpartaRegistrationPage(WebDriver webDriver){
        this.webDriver = webDriver;
        webDriver.manage().window().maximize();
        webDriver.get("http://localhost:9292/");
    }

    public void enterIntoFirstName(String s){
        webDriver.findElement(firstName).sendKeys(s);
    }

    public boolean firstNameErrorMessageVisible(){
        return webDriver.findElement(firstNameErrorMessage).isDisplayed();
    }

    public void enterIntoLastName(String s){
        webDriver.findElement(lastName).sendKeys(s);
    }

    public boolean lastNameErrorMessageVisible(){
        return webDriver.findElement(lastNameErrorMessage).isDisplayed();
    }

    public void enterIntoAge(String s){
        webDriver.findElement(age).sendKeys(s);
    }

    public boolean ageErrorMessageVisible(){
        return webDriver.findElement(ageErrorMessage).isDisplayed();
    }

    public void enterIntoDateOfBirth(String s){
        webDriver.findElement(age).sendKeys(s);
    }

    public void clickMaleRadioButton(){
        webDriver.findElement(maleRadioButton).click();
    }

    public void clickFemaleRadioButton(){
        webDriver.findElement(femaleRadioButton).click();
    }


    public boolean maleRadioButtonLabelIsRed(){
        return webDriver.findElement(maleRadioButtonLabel).getCssValue("color").equals(REDTEXTCOLOURSTRING);
    }

    public boolean femaleRadioButtonLabelIsRed(){
        return webDriver.findElement(femaleRadioButtonLabel).getCssValue("color").equals(REDTEXTCOLOURSTRING);
    }

    public void enterIntoDegreeTextBox(String s){
        webDriver.findElement(degree).sendKeys(s);
    }

    public boolean degreeBorderIsRed(){
        System.out.println(webDriver.findElement(degree).getCssValue("border-color"));
        return webDriver.findElement(degree).getCssValue("border-color").equals(REDTEXTCOLOURSTRING);
    }

    public void enterIntoAddressTextBox(String s){
        webDriver.findElement(address).sendKeys(s);
    }

    public boolean addressErrorMessageVisible(){
        return webDriver.findElement(addressErrorMessage).isDisplayed();
    }

    public void enterIntoCityTextBox(String s){
        webDriver.findElement(city).sendKeys(s);
    }

    public boolean cityBorderIsRed(){

        return webDriver.findElement(city).getCssValue("border-color").equals(REDTEXTCOLOURSTRING);
    }

    public void enterIntoPostcodeTextBox(String s){
        webDriver.findElement(postcode).sendKeys(s);
    }

    public boolean postcodeErrorMessageVisible(){
        return webDriver.findElement(postcodeErrorMessage).isDisplayed();
    }

    public void enterIntoEmailTextBox(String s){
        webDriver.findElement(email).sendKeys(s);
    }

    public boolean emailErrorMessageVisible(){
        return webDriver.findElement(emailErrorMessage).isDisplayed();
    }

    public void enterIntoPhoneNumberTextBox(String s){
        webDriver.findElement(phoneNumber).sendKeys(s);
    }

    public boolean phoneNumberErrorMessageVisible(){
        return webDriver.findElement(phoneNumberErrorMessage).isDisplayed();
    }

    public void clickSdetRadioButton(){
        webDriver.findElement(sdetRadioButton).click();
    }

    public void clickDevopsRadioButton(){
        webDriver.findElement(devOpsRadioButton).click();
    }


    public boolean sdetRadioButtonLabelIsRed(){
        return webDriver.findElement(sdetRadioButtonLabel).getCssValue("color").equals(REDTEXTCOLOURSTRING);
    }

    public boolean devOpsRadioButtonLabelIsRed(){
        return webDriver.findElement(devOpsRadioButtonLabel).getCssValue("color").equals(REDTEXTCOLOURSTRING);
    }

    public void clickTermsAndCondtionsButton(){
        webDriver.findElement(TAC).click();
    }

    public boolean termsAndConditionsButtonLabelIsRed(){
        return webDriver.findElement(TACLabel).getCssValue("color").equals(REDTEXTCOLOURSTRING);
    }




    public void clickSignIn(){
        webDriver.findElement(signIn).click();
    }
}