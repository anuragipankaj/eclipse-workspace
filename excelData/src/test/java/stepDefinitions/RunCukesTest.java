package stepDefinitions;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)	
@CucumberOptions(features="Features",glue={"stepDefinitions"},monochrome=true)						
public class RunCukesTest 
{

	
}