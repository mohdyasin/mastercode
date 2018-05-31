package a_1_0_0_singleton.SingletonWithLazyInitialization;

public class SingletonClass {
	private static SingletonClass sSoleInstance;

	private SingletonClass() {
	} // private constructor.

	public static SingletonClass getInstance() {

		if (sSoleInstance == null) { // if there is no instance available... create new one

			sSoleInstance = new SingletonClass();

		}

		return sSoleInstance;

	}
}
