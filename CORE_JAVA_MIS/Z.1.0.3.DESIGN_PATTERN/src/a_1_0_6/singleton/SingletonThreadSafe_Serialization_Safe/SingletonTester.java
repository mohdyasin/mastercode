package a_1_0_6.singleton.SingletonThreadSafe_Serialization_Safe;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SingletonTester {
	public static void main(String[] args) {

		try {

			SingletonClass instance1 = SingletonClass.getInstance();

			ObjectOutput out = null;

			out = new ObjectOutputStream(new FileOutputStream("filename.ser"));

			out.writeObject(instance1);

			out.close();

			// deserialize from file to object

			ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));

			SingletonClass instance2 = (SingletonClass) in.readObject();

			in.close();

			System.out.println("instance1 hashCode=" + instance1.hashCode());

			System.out.println("instance2 hashCode=" + instance2.hashCode());

		} catch (IOException | ClassNotFoundException e) {

			e.printStackTrace();

		}

	}

}