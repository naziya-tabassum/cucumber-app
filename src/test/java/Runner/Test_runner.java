package Runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\naziy\\.eclipse\\Practice_Cucumber\\src\\test\\resource\\Features\\Compay Registration.feature",
glue={"StepDefinition","App_Hooks"},
plugin={"pretty",
		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)
public class Test_runner {

}
