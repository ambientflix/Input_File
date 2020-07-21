package sb_example.sb;







import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.Objects;
import java.util.Properties;
import java.io.File;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;



@SpringBootApplication
public class SbApplication {
    ;
    private static final String INPUT_FILENAME = "test_1.txt";
    private static final String INPUT_FILEPATH = "C:\\Ambient_5\\src\\main\\java\\sb_example.sb\\";

    private static ResourceLoader resourceLoader;
     public static void main(String[] args) throws IOException
         {
             SpringApplication.run(SbApplication.class, args);

            File words = getwords();
            if (words.exists()){
                System.out.println("Eureka!");
            }
            else {
                System.out.println(";///");
            }
         }


    //continuously prompts user to input path for txt file


    public SbApplication(ResourceLoader resourceLoader) {
         SbApplication.resourceLoader = resourceLoader;
    }

    public static File getwords() throws IOException {

            Resource resource = resourceLoader.getResource("classpath:static/test_1.txt");
            InputStream dbAsStream = resource.getInputStream();
            return resource.getFile();
        }



            //grabs keywords from txt file and adds to ArrayList in order to have a dynamic array.
            public static ArrayList<String> getKeywords(File inputFile, Scanner fileScan){
                ArrayList<String> keywords = new ArrayList<String>();

                while (fileScan.hasNext()){
                    keywords.add(fileScan.next());
                }
                return keywords;
            }

            //fix input file issues
            //create keyword class.


        }

