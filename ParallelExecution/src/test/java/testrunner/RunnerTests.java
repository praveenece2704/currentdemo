package testrunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features = { "src/test/java/features" }, glue = {
"stepdefinitions", "hooks" }, monochrome = true, snippets = SnippetType.CAMELCASE, plugin = {
		"html:./reports/cucumber.html" })
public class RunnerTests extends AbstractTestNGCucumberTests{

 

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}























//@RunWith(Cucumber.class)
//@CucumberOptions(features = { "src/test/java/features" }, glue = { "stepdefinitions",
//		"hooks" }, monochrome = true, snippets = SnippetType.CAMELCASE, plugin = { "html:./reports/cucumber.html",
//				"timeline:test-output-thread/" })
//public class RunnerTests {
//
//}