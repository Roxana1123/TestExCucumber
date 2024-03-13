package org.example.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.services.Calculator;

public class CalculatorSteps {
    public Calculator myCalculator;
    public float actualResult;

    @Given("I have a calculator")
    public void iHaveACalculator() {
        this.myCalculator = new Calculator("stiintific");
    }

    @When("I sum up {float} and {float}")
    public void iSumUp(float a, float b) {
this.actualResult = this.myCalculator.sum(a,b);;
    }
    @When("I substract {float} and {float}")
    public void iSubstract(float a, float b) {
        this.actualResult = this.myCalculator.substract(a,b);
    }
    @When("I divide {float} and {float}")
    public void iDivide(float a, float b) {
        this.actualResult = this.myCalculator.divide(a,b);
    }
    @When("I multiply {float} and {float}")
    public void iMultiply(float a, float b) {
        this.actualResult = this.myCalculator.multiply(a,b);
    }

    @Then("I expect the result to be {float}")
    public void iExpectTheResultToBe(float expectedResult) {
        if(this.actualResult == expectedResult) {
            System.out.println("Test paassed!");
        }else{
            System.out.println("Test Failed");
        }
    }
}
