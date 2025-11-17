import java.io.*;
import java.net.*;
import java.util.*;

public class FileOperator {
    private Scanner fileReader;
    private BufferedReader urlReader;
    private boolean online;

    public FileOperator(String f) throws IOException {
        setFile(f);
    }

    public FileOperator(String source, boolean isOnline) throws IOException, URISyntaxException {
        if (isOnline) {
            setUrl(source);
        } else {
            setFile(source);
        }
    }

    public void setUrl(String f) throws IOException, URISyntaxException {
        URL url = new URI(f).toURL();
        urlReader = new BufferedReader(new InputStreamReader(url.openStream()));
        online = true;
    }

    public void setFile(String f) throws IOException {
        fileReader = new Scanner(new File(f));
        online = false;
    }

    public String readLine() throws IOException {
        if (online) {
            return urlReader.readLine(); // returns null at EOF
        } else {
            if (fileReader.hasNextLine()) {
                return fileReader.nextLine();
            } else {
                return null;
            }
        }
    }

    public static void main(String[] args) throws IOException, URISyntaxException {
        FileOperator onlineFile = new FileOperator(
            "https://people.sc.fsu.edu/~jburkardt/data/csv/airtravel.csv", true
        );

        String row;
        while ((row = onlineFile.readLine()) != null) {
            System.out.println(row);
        }
    }
}