import java.io.*;

class TestData implements Serializable {
    private static final long serialVersionUID = 1L;
    String username = "tester";
}
public class SerializationDemo {
    public static void main(String[] args) throws Exception {
        TestData data = new TestData();
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data.ser"))) {
            out.writeObject(data);
        }
        System.out.println("Serialized test data");
        new File("data.ser").delete();
    }
}