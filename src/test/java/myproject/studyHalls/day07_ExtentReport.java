package myproject.studyHalls;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.io.File;

public class day07_ExtentReport {

    public static ExtentReports generateExtentReport(){

        ExtentReports extentReports = new ExtentReports();
        File path=new File("/Users/aatug/IdeaProjects/SeleniumTestNG07/ExtentReports/"+"My Report"+".html");
        ExtentSparkReporter spark = new ExtentSparkReporter(path);

        spark.config().setTheme(Theme.DARK);
        spark.config().setReportName("RenasTech");
        spark.config().setDocumentTitle("Automation");
        spark.config().setTimeStampFormat("dd/MM/yyyy hh:mm:ss");

        extentReports.attachReporter(spark);
        extentReports.setSystemInfo("Application URL","https://www.ebay.com/");
        extentReports.setSystemInfo("Browser name","Chrome");

        return extentReports;
    }
}
