import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DetectorPhishing {
	private static final Map<String, Integer> phishingKeywords = new HashMap<>();
	public static void main(String[] args) {
		initializePhishingKeywords();
        int totalPoints = exploreTextFile("C:\\Users\\Alex\\IdeaProjects\\Actividad 6\\src\\mensaje.txt");
        System.out.println("Total de puntos para todo el mensaje: " + totalPoints);

	}

}
