package com.tests;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class OverrideLog extends TestListenerAdapter {
    @Override
    public void onTestSuccess(ITestResult tr){
        log("Overridden Log");
    }

    private void log(String string){
        System.out.println(string);
    }
}
