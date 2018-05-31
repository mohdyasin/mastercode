package a_1_0_6.singleton.SingletonThreadSafe_Serialization_Safe;

import java.io.Serializable;

public class SingletonClassSerializedSafe	implements Serializable {

	private static volatile SingletonClassSerializedSafe sSoleInstance;

	// private constructor.

	private SingletonClassSerializedSafe() {

		// Prevent form the reflection api.

		if (sSoleInstance != null) {

			throw new RuntimeException("Use getInstance() method to get the single instance of this class.");

		}

	}

	public static SingletonClassSerializedSafe getInstance() {

		if (sSoleInstance == null) { // if there is no instance available... create new one

			synchronized (SingletonClass.class) {

				if (sSoleInstance == null)
					sSoleInstance = new SingletonClassSerializedSafe();

			}

		}

		return sSoleInstance;

	}

	// Make singleton from serialize and deserialize operation.

	protected SingletonClassSerializedSafe readResolve() {

		return getInstance();

	}

}
