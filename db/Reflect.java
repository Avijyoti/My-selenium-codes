package db;

import java.lang.reflect.Constructor;

public class Reflect {

	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> c1 = Class.forName("db.C2");
		Constructor<?>[] declaredConstructors = c1.getDeclaredConstructors();
		for (Constructor method : declaredConstructors) {
			System.out.println(method.getName());
		}

	}

}
