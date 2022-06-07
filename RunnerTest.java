package mvn;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ={"/home/rlt/eclipse-workspace/mvn/src/test/resources/features"}, monochrome=true,
plugin = {"pretty",
        "junit:target/JunitsReport/report.xml"}

    )
public class RunnerTest {

}
