package googleRandomWordSearch;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RandomGenerator {

	public String getRandomWord(String file) throws IOException {
		final RandomAccessFile f = new RandomAccessFile(file, "r");
	    final long randomLocation = (long) (Math.random() * f.length());
	    f.seek(randomLocation);
	    f.readLine();
	    return f.readLine();
}
	
}
