package a_1_0_4.singleton.SingletonThreadSafe_By_Using_Synchroniztion_Block_Or_Double_Locking;

public class SingletonClass {
	private static SingletonClass sSoleInstance;

	// private constructor.

	private SingletonClass() {

		// Prevent form the reflection api.

		if (sSoleInstance != null) {

			throw new RuntimeException("Use getInstance() method to get the single instance of this class.");

		}

	}

	public static SingletonClass getInstance() {

		// Double check locking pattern

		if (sSoleInstance == null) { // Check for the first time

			synchronized (SingletonClass.class) { // Check for the second time.

				// if there is no instance available... create new one

				if (sSoleInstance == null)
					sSoleInstance = new SingletonClass();

			}

		}

		return sSoleInstance;

	}

}