package a_1_0_1.singleton.SingletonWithEagerinitialization;

public class SingletonClass {

	private static volatile SingletonClass sSoleInstance = new SingletonClass();

	// private constructor.

	private SingletonClass() {
	}

	public static SingletonClass getInstance() {

		return sSoleInstance;

	}
}
