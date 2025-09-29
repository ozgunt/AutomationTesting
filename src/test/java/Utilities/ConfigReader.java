package Utilities;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    static Properties properties;

    static
    String dosyaYolu ="config.properties";
    {try {

        FileInputStream fis = new FileInputStream(dosyaYolu);
        properties = new Properties();
        properties.load(fis);


    }catch(IOException e){
        System.out.println("Error in reading properties file");


    }



    }
    public static String  getProperty (String Key) {
        return properties.getProperty(Key);

    }
}
