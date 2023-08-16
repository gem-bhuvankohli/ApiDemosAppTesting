package stepdefinition;

import implementations.ApiDemosAppImplementation;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ApiDemosStepDefinition {
    @Given("the ApiDemo application is open")
    public void openTheApiDemoApplication() {
        ApiDemosAppImplementation.openApplication();
    }

    @When("performing scroll action")
    public void performScrollAction() {
        ApiDemosAppImplementation.scrollAction();
    }

    @Then("performing drag and drop")
    public void performDragAndDrop() {
        ApiDemosAppImplementation.dragAndDropAction();
    }

    @And("double tapping")
    public void doubleTapping() {
        ApiDemosAppImplementation.doubleTapAction();
    }

    @And("performing scroll up action")
    public void performScrollUpAction() {
        ApiDemosAppImplementation.scrollUpAction();
    }

    @Then("performing swipe right")
    public void peformSwipeRight(){ApiDemosAppImplementation.swipeAction();}
}
