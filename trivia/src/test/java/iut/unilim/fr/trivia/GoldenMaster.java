package iut.unilim.fr.trivia;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Random;

public class GoldenMaster {
	public String getGameResult(long seed) {
		ByteArrayOutputStream consoleStream = new ByteArrayOutputStream();
		PrintStream printStream = new PrintStream(consoleStream);
		System.setOut(printStream);
		GameRunner.play(new Random(seed));
		return consoleStream.toString();
	}
}
