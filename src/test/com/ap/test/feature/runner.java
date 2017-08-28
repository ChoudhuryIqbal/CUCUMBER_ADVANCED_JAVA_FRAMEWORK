/**
 * 
 */
package test.com.ap.test.feature;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * @author choudhuryIqbal
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/com/ap/test/feature",

glue={"test.com.ap.test.steps"}
		
		)
public class runner {

}
