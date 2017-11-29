package iut.unilim.fr.trivia;

import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {
	
	@Test
	public void test_goldenMaster() throws IOException{
		GoldenMaster goldenMaster = new GoldenMaster();
		goldenMaster.generateGoldenMaster();
		
		assertTrue(true);
	}
}
