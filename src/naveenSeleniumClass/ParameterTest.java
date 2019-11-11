package naveenSeleniumClass;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

	@Test
	@Parameters({"sampleParamName"})
	public void parameterTest(String paramValue) {
		System.out.println("the value of Parameter is: "+paramValue);
	}
	
}
