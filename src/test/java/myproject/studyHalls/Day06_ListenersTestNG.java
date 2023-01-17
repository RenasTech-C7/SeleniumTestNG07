package myproject.studyHalls;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Day06_ListenersTestNG implements ITestListener {

    ExtentReports reports;
    ExtentTest extentTest;


    @Override
    public void onTestStart(ITestResult result) {
       String testName= result.getName();
        System.out.println("Test has started " + testName);
        extentTest=reports.createTest(testName);
        extentTest.log(Status.INFO,testName+ " Test has started");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ITestListener.super.onTestSuccess(result);
        String testName= result.getName();
        System.out.println("Test is successful " + testName);
        extentTest.log(Status.PASS,testName+" Test is successful");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ITestListener.super.onTestFailure(result);
        String testName= result.getName();
        System.out.println("Test is failed " + testName);
        WebDriver driver=null;
        try {
            driver = (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }

        File srcScreenShot= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String screenShotsPath="/Users/aatug/IdeaProjects/SeleniumTestNG07/screenshots/"+testName+".png";

        try {
            FileHandler.copy(srcScreenShot,new File(screenShotsPath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        extentTest.addScreenCaptureFromPath(screenShotsPath);
        extentTest.log(Status.INFO,result.getThrowable());
        extentTest.log(Status.FAIL,testName+" Test is failed");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ITestListener.super.onTestSkipped(result);
        String testName= result.getName();
        System.out.println("Test is skipped " + testName);
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout(result);
    }

    @Override
    public void onStart(ITestContext context) {
        reports=day07_ExtentReport.generateExtentReport();
    }

    @Override
    public void onFinish(ITestContext context) {

        reports.flush();
    }
}
