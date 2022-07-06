package test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

import static org.testng.AssertJUnit.assertEquals;

@Listeners(listener.class)
public class Main extends listener{
    public void check () {
        Method[] methods = TestMethodInfo.class.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getDefaultValue());
        }
    }

    @Test
    @TestMethodInfo(priority = Priority.Critical, author = "Test user", lastModified = "20.08.2019")
    public void annotation() {
        check();
        assertEquals(1, 1);
    }
}