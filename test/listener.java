package test;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class listener extends ClassLoader implements ISuiteListener{

    @Override
    public void onStart(ISuite iSuite) {
        System.out.println("start");
    }

    @Override
    public void onFinish(ISuite iSuite) {
        System.out.println("finish");
    }

}
