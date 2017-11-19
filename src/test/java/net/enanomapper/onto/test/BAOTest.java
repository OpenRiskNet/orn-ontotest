package net.enanomapper.onto.test;

import org.junit.Ignore;

import java.util.Arrays;
import java.util.List;

@Ignore("BAO is currently not included")
public class BAOTest extends AbstractOntologyTest {

	@Override
	protected List<String> getOntologyResource() {
		String root = AbstractOntologyTest.ROOT;
		if (System.getProperty("ROOT") != null) {
			root = System.getProperty("ROOT");
		}
		return Arrays.asList(
		    root + "BAO/bao-slim.owl"
		);
	}

}
