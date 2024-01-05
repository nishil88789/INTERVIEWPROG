package InputOutput;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PrimitiveDataWrite {

	public static void main(String[] args) throws IOException {
		
DataOutputStream out = new DataOutputStream(new FileOutputStream("C:/TestingIO/binary.txt"));
		
    out.writeInt(2);
    out.writeBoolean(false);
    out.writeChar('c');
    out.writeDouble(1.2);
    
    out.close();
    
    System.out.println("Set Data Successfully");
	}
}
