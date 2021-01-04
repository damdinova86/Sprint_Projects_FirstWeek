import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //Path to your feature files
        features = {"src/test/resources/features"},

        //Specify the step definition package name (Note:
        glue = {"stepDefinition", "DriverWrapper"},

        //specify tags to be  executed
        tags = {"@smoke"},

        //readable console logs
        monochrome = true,

        //This creates cucumber reports
        plugin = {"pretty","html: Reports/Default/" },

        //This create auto method name in camelCase
        //snippets = cucumber.api.SnippetType.Camelcase
        snippets = SnippetType.CAMELCASE



)
public class TestRunner {
}
