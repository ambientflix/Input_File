package sb_example.sb;

import java.io.IOException;
import java.io.InputStream;
import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.util.ArrayList;
import java.util.Scanner;


@SpringBootApplication
public class SbApplication {

    private static ResourceLoader resourceLoader;

    public static void main(String[] args) throws IOException {
        SpringApplication.run(SbApplication.class, args);

        File wordFile = getFile();

        Scanner fileScan = new Scanner(wordFile);
        ArrayList<Words> values = new ArrayList<>();
        if (wordFile.exists()) {
            System.out.println("Successfully found data file. ");
           values.add(getKeywords(wordFile, fileScan));
        } else {
            System.out.println("Could not find file. Please make sure repository is correct. ");
        }
    }


    public SbApplication(ResourceLoader resourceLoader) {
        SbApplication.resourceLoader = resourceLoader;
    }

    public static File getFile() throws IOException {

        Resource resource = resourceLoader.getResource("classpath:static/Twitter.txt");
        InputStream dbAsStream = resource.getInputStream();
        return resource.getFile();
    }

    //grabs keywords from txt file and creates Word object.
    public static Words getKeywords(File inputFile, Scanner fileScan) {
        Words keywords = new Words();
        while(fileScan.hasNext()){
            keywords.addWords(fileScan.next());
        }
        return keywords;
    }

}

