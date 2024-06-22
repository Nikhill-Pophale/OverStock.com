package org.Overstock.Resources;

import javax.imageio.stream.FileImageInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class prop {

    public static String getdata(String Key) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\nikpo\\IdeaProjects\\Overstock\\src\\main\\java\\org\\Overstock\\Utils\\data.properties");
        Properties prop = new Properties();
        prop.load(fis);
        String x = prop.getProperty(Key);
        return x;
    }

}
