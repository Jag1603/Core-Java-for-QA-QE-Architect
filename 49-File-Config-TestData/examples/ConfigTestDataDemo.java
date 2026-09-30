import java.io.*;
import java.util.*;

public class ConfigTestDataDemo {
    public static void main(String[] args) throws Exception {
        Properties p = new Properties();
        p.setProperty("browser", "chrome");
        p.setProperty("environment", "QA");
        System.out.println(p.getProperty("browser"));
    }
}