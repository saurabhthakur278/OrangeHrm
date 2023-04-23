package testreunner;

import org.junit.runner.RunWith;



import io.cucumber.core.options.CucumberOptionsAnnotationParser.CucumberOptions;
import io.cucumber.junit.*;


@RunWith(Cucumber.class)

@io.cucumber.junit.CucumberOptions(
		features = ".//Feature/Login.feature",
		glue= "step",
		dryRun=false
		)



public class Run {

}
