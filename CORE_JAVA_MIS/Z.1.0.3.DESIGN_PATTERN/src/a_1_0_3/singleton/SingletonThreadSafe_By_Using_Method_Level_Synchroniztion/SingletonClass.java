package a_1_0_3.singleton.SingletonThreadSafe_By_Using_Method_Level_Synchroniztion;

public class SingletonClass {

	private static SingletonClass sSoleInstance;

	// private constructor.

	private SingletonClass() {

		// Prevent form the reflection api.

		if (sSoleInstance != null) {

			throw new RuntimeException("Use getInstance() method to get the single instance of this class.");

		}

	}

	public synchronized static SingletonClass getInstance() {

		if (sSoleInstance == null) { // if there is no instance available... create new one

			sSoleInstance = new SingletonClass();

		}

		return sSoleInstance;

	}

}