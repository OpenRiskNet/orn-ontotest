package net.enanomapper.onto.test;

import org.junit.Ignore;

import java.util.Arrays;
import java.util.List;

@Ignore("CHEMINF is not included at this moment")
public class CHEMINFTest extends AbstractOntologyTest {

	@Override
	protected List<String> getOntologyResource() {
		String root = AbstractOntologyTest.ROOT;
		if (System.getProperty("ROOT") != null) {
			root = System.getProperty("ROOT");
		}
		return Arrays.asList(
		    root + "CHEMINF/cheminf-slim.owl"
		);
	}
}
