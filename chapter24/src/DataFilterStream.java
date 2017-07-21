/**
 * Created by kmj on 17. 7. 21.
 */
import java.io.*;

class DataFilterStream {

    public static void main(String[] args) throws IOException
    {
        OutputStream out = new FileOutputStream("data.bin");
        DataOutputStream filter = new DataOutputStream(out);

        filter.writeInt(275);
        filter.writeDouble(45.79);
        filter.close();

        InputStream in = new FileInputStream("data.bin");
        DataInputStream fitlerIn = new DataInputStream(in);
        int num1=fitlerIn.readInt();
        double num2=fitlerIn.readDouble();
        fitlerIn.close();

        System.out.println(num1);
        System.out.println(num2);

        }
    }
