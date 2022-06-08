package SeventhHW.Testing;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Comparator;

public class TestSettings {
    private static Object object;

    public static void start(Class<?> c) {

        try {
            object = c.getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        Method before = null;
        Method after = null;
        ArrayList<Method> methods = new ArrayList<>();
        Method[] objMethods = c.getDeclaredMethods();

        for (Method method : objMethods) {
            if (method.isAnnotationPresent(Test.class)) {
                int priority = method.getAnnotation(Test.class).priority();
                if (priority < 1 || priority > 10) {
                    throw new RuntimeException();
                }
                methods.add(method);
            } else if (method.getAnnotation(BeforeSuite.class) != null) {
                before = method;
            } else if (method.getAnnotation(AfterSuite.class) != null) {
                after = method;
            }
        }

        methods.sort(Comparator.comparingInt(o -> o.getAnnotation(Test.class).priority()));
        if (before != null) {
            methods.add(0, before);
        }
        if (after != null) {
            methods.add(after);
        }

        try {
            for (Method testMethod : methods) {
                if (Modifier.isPrivate(testMethod.getModifiers())) {
                    testMethod.setAccessible(true);
                }
                testMethod.invoke(object);
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

}
