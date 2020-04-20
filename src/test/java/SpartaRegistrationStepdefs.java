
import com.sparta.alm.Pages.SpartaRegistrationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpartaRegistrationStepdefs {
    WebDriver webDriver = new ChromeDriver();
    SpartaRegistrationPage spartaRegistrationPage = new SpartaRegistrationPage(webDriver);

    @Given("I am on the form page")
    public void iAmOnTheFormPage() {
    }

    @When("I enter a valid string into the first name text box")
    public void iEnterAValidStringIntoTheFirstNameTextBox() {
        spartaRegistrationPage.enterIntoFirstName("Alonso");
    }

    @Then("The input is accepted for the first name text box")
    public void theInputIsAcceptedForTheFirstNameTextBox() {
        spartaRegistrationPage.clickSignIn();
        Assertions.assertEquals(false, spartaRegistrationPage.firstNameErrorMessageVisible());
    }

    @Then("The input is not accepted for the first name text box")
    public void theInputIsNotAcceptedForTheFirstNameTextBox() {
        spartaRegistrationPage.clickSignIn();
        Assertions.assertEquals(true, spartaRegistrationPage.firstNameErrorMessageVisible());
    }

    @When("I don't enter anything into the first name text box")
    public void iDonTEnterAnythingIntoTheFirstNameTextBox() {
    }

    @When("I enter a valid string into the last name text box")
    public void iEnterAValidStringIntoTheLastNameTextBox() {
        spartaRegistrationPage.enterIntoLastName("Lopez Mendoza");
    }

    @Then("The input is accepted for the last name text box")
    public void theInputIsAcceptedForTheLastNameTextBox() {
        spartaRegistrationPage.clickSignIn();
        Assertions.assertEquals(false,spartaRegistrationPage.lastNameErrorMessageVisible());
    }

    @When("I don't enter anything into the last name text box")
    public void iDonTEnterAnythingIntoTheLastNameTextBox() {
    }

    @Then("The input is not accepted for the last name text box")
    public void theInputIsNotAcceptedForTheLastNameTextBox() {
        spartaRegistrationPage.clickSignIn();
        Assertions.assertEquals(true,spartaRegistrationPage.lastNameErrorMessageVisible());
    }

    @When("I enter a valid string into the age text box")
    public void iEnterAValidStringIntoTheAgeTextBox() {
        spartaRegistrationPage.enterIntoAge("24");
    }

    @When("I enter an invalid string into the age text box")
    public void iEnterAnInvalidStringIntoTheAgeTextBox() {
        spartaRegistrationPage.enterIntoAge("-24");
    }

    @Then("The input is accepted for the age text box")
    public void theInputIsAcceptedForTheAgeTextBox() {
        spartaRegistrationPage.clickSignIn();
        Assertions.assertEquals(false,spartaRegistrationPage.ageErrorMessageVisible());
    }

    @When("I don't enter anything into the age text box")
    public void iDonTEnterAnythingIntoTheAgeTextBox() {
    }

    @Then("The input is not accepted for the age text box")
    public void theInputIsNotAcceptedForTheAgeTextBox() {
        spartaRegistrationPage.clickSignIn();
        Assertions.assertEquals(true,spartaRegistrationPage.ageErrorMessageVisible());
    }



    @When("I select the male option in the gender radio buttons")
    public void iSelectTheMaleOptionInTheGenderRadioButtons() {
        spartaRegistrationPage.clickMaleRadioButton();
    }

    @Then("The male input is accepted for the gender radio buttons")
    public void theMaleInputIsAcceptedForTheGenderRadioButtons() {
        spartaRegistrationPage.clickSignIn();
        Assertions.assertEquals(false, spartaRegistrationPage.maleRadioButtonLabelIsRed());
    }

    @When("I select the female option in the gender radio buttons")
    public void iSelectTheFemaleOptionInTheGenderRadioButtons() {
        spartaRegistrationPage.clickFemaleRadioButton();
    }

    @Then("The female input is accepted for the gender radio buttons")
    public void theFemaleInputIsAcceptedForTheGenderRadioButtons() {
        spartaRegistrationPage.clickSignIn();
        Assertions.assertEquals(false, spartaRegistrationPage.femaleRadioButtonLabelIsRed());
    }

    @When("I don't select a gender radio button")
    public void iDonTSelectAGenderRadioButton() {
    }

    @Then("The input for gender radio buttons is not accepted")
    public void theInputForRadioButtonsIsNotAccepted() {
        spartaRegistrationPage.clickSignIn();
        Assertions.assertEquals(true, (spartaRegistrationPage.maleRadioButtonLabelIsRed() && spartaRegistrationPage.femaleRadioButtonLabelIsRed()));
    }

    @When("I enter a valid string into the degree text box")
    public void iEnterAValidStringIntoTheDegreeTextBox() {
        spartaRegistrationPage.enterIntoDegreeTextBox("Computer Science");
    }

    @Then("The input is accepted for the degree text box")
    public void theInputIsAcceptedForTheDegreeTextBox() {
        spartaRegistrationPage.clickSignIn();
        Assertions.assertEquals(false, spartaRegistrationPage.degreeBorderIsRed());
    }

    @When("I don't enter anything into the degree text box")
    public void iDonTEnterAnythingIntoTheDegreeTextBox() {
    }

    @Then("The input is not accepted for the degree text box")
    public void theInputIsNotAcceptedForTheDegreeTextBox() {
        spartaRegistrationPage.clickSignIn();
        Assertions.assertEquals(true, spartaRegistrationPage.degreeBorderIsRed());
    }


    @When("I enter a valid string into the address text box")
    public void iEnterAValidStringIntoTheAddressTextBox() {
        spartaRegistrationPage.enterIntoAddressTextBox("18 Assertion Place");
    }

    @Then("The input is accepted for the address text box")
    public void theInputIsAcceptedForTheAddressTextBox() {
        spartaRegistrationPage.clickSignIn();
        Assertions.assertEquals(false, spartaRegistrationPage.addressErrorMessageVisible());
    }

    @When("I don't enter anything into the address text box")
    public void iDonTEnterAnythingIntoTheAddressTextBox() {
    }

    @Then("The input is not accepted for the address text box")
    public void theInputIsNotAcceptedForTheAddressTextBox() {
        spartaRegistrationPage.clickSignIn();
        Assertions.assertEquals(true, spartaRegistrationPage.addressErrorMessageVisible());
    }

    @When("I enter a valid string into the city text box")
    public void iEnterAValidStringIntoTheCityTextBox() {
        spartaRegistrationPage.enterIntoCityTextBox("London");
    }

    @Then("The input is accepted for the city text box")
    public void theInputIsAcceptedForTheCityTextBox() {
        spartaRegistrationPage.clickSignIn();
        Assertions.assertEquals(false, spartaRegistrationPage.cityBorderIsRed());
    }

    @When("I don't enter anything into the city text box")
    public void iDonTEnterAnythingIntoTheCityTextBox() {
    }

    @Then("The input is not accepted for the city text box")
    public void theInputIsNotAcceptedForTheCityTextBox() {
        spartaRegistrationPage.clickSignIn();
        Assertions.assertEquals(true, spartaRegistrationPage.cityBorderIsRed());
    }

    @When("I enter a valid string into the postcode text box")
    public void iEnterAValidStringIntoThePostcodeTextBox() {
        spartaRegistrationPage.enterIntoPostcodeTextBox("ex45ds");
    }

    @Then("The input is accepted for the postcode text box")
    public void theInputIsAcceptedForThePostcodeTextBox() {
        spartaRegistrationPage.clickSignIn();
        Assertions.assertEquals(false, spartaRegistrationPage.postcodeErrorMessageVisible());
    }

    @When("I don't enter anything into the postcode text box")
    public void iDonTEnterAnythingIntoThePostcodeTextBox() {
    }

    @Then("The input is not accepted for the postcode text box")
    public void theInputIsNotAcceptedForThePostcodeTextBox() {
        spartaRegistrationPage.clickSignIn();
        Assertions.assertEquals(true, spartaRegistrationPage.postcodeErrorMessageVisible());
    }

    @When("I enter a valid string into the email text box")
    public void iEnterAValidStringIntoTheEmailTextBox() {
        spartaRegistrationPage.enterIntoEmailTextBox("al@google.com");
    }

    @When("I enter a invalid string into the email text box")
    public void iEnterAInvalidStringIntoTheEmailTextBox() {
        spartaRegistrationPage.enterIntoEmailTextBox("asd");
    }

    @Then("The input is accepted for the email text box")
    public void theInputIsAcceptedForTheEmailTextBox() {
        spartaRegistrationPage.clickSignIn();
        Assertions.assertEquals(false, spartaRegistrationPage.emailErrorMessageVisible());
    }

    @When("I don't enter anything into the email text box")
    public void iDonTEnterAnythingIntoTheEmailTextBox() {
    }

    @Then("The input is not accepted for the email text box")
    public void theInputIsNotAcceptedForTheEmailTextBox() {
        spartaRegistrationPage.clickSignIn();
        Assertions.assertEquals(true, spartaRegistrationPage.emailErrorMessageVisible());
    }

    @When("I enter a valid string into the phone number text box")
    public void iEnterAValidStringIntoThePhoneNumberTextBox() {
        spartaRegistrationPage.enterIntoPhoneNumberTextBox("07923592030");
    }

    @When("I enter a invalid string into the phone number text box")
    public void iEnterAInvalidStringIntoThePhoneNumberTextBox() {
        spartaRegistrationPage.enterIntoPhoneNumberTextBox("asd");
    }

    @Then("The input is accepted for the phone number text box")
    public void theInputIsAcceptedForThePhoneNumberTextBox() {
        spartaRegistrationPage.clickSignIn();
        Assertions.assertEquals(false, spartaRegistrationPage.phoneNumberErrorMessageVisible());
    }

    @When("I don't enter anything into the phone number text box")
    public void iDonTEnterAnythingIntoThePhoneNumberTextBox() {
    }

    @Then("The input is not accepted for the phone number text box")
    public void theInputIsNotAcceptedForThePhoneNumberTextBox() {
        spartaRegistrationPage.clickSignIn();
        Assertions.assertEquals(true, spartaRegistrationPage.phoneNumberErrorMessageVisible());
    }


    @When("I select the sdet option in the stream radio buttons")
    public void iSelectTheSdetOptionInTheStreamRadioButtons() {
        spartaRegistrationPage.clickSdetRadioButton();
    }

    @When("I select the devops option in the stream radio buttons")
    public void iSelectTheDevopsOptionInTheStreamRadioButtons() {
        spartaRegistrationPage.clickDevopsRadioButton();
    }

    @Then("The sdet input is accepted for the stream radio buttons")
    public void theSdetInputIsAcceptedForTheStreamRadioButtons() {
        spartaRegistrationPage.clickSignIn();
        Assertions.assertEquals(false, spartaRegistrationPage.sdetRadioButtonLabelIsRed());
    }

    @Then("The devops input is accepted for the stream radio buttons")
    public void theDevopsInputIsAcceptedForTheStreamRadioButtons() {
        spartaRegistrationPage.clickSignIn();
        Assertions.assertEquals(false, spartaRegistrationPage.devOpsRadioButtonLabelIsRed());
    }

    @When("I don't select a stream radio button")
    public void iDonTSelectAStreamRadioButton() {
    }

    @Then("The input for stream radio buttons is not accepted")
    public void theInputForStreamRadioButtonsIsNotAccepted() {
        spartaRegistrationPage.clickSignIn();
        Assertions.assertEquals(true, (spartaRegistrationPage.sdetRadioButtonLabelIsRed() && spartaRegistrationPage.devOpsRadioButtonLabelIsRed()));
    }


    @When("I click the terms and conditions toggle button")
    public void iClickTheTermsAndConditionsToggleButton() {
        spartaRegistrationPage.clickTermsAndCondtionsButton();
    }

    @Then("The input is accepted for the terms and conditions toggle button")
    public void theInputIsAcceptedForTheTermsAndConditionsToggleButton() {
        spartaRegistrationPage.clickSignIn();
        Assertions.assertEquals(false, spartaRegistrationPage.termsAndConditionsButtonLabelIsRed());
    }

    @When("I don't click the terms and conditions")
    public void iDonTClickTheTermsAndConditions() {
    }

    @Then("The input is not accepted for the terms and conditions toggle buttons")
    public void theInputIsNotAcceptedForTheTermsAndConditionsToggleButtons() {
        spartaRegistrationPage.clickSignIn();
        Assertions.assertEquals(true, spartaRegistrationPage.termsAndConditionsButtonLabelIsRed());
    }


}
