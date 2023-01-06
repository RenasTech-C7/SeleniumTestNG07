package myproject.studyHalls;

public class Day01 {
    /*Challenges with Selenium*/
    //1-) Sync Issue(Timeout) - > in order to handle sync issue I use Implicit and Explicit.
    //In My FrameWork I do not recommend using Thread.Sleep(5000) Because it comes from Java and it waits till time that we provided
    //2-)Locating elements
    //it is hard to find smart locators.
    //3-) Pop-up handling
    //we need to handle unwanted pop-ups which stops our execution.
    /*Why I cannot locate elements
     * 1-)NoSuchElementException
     * element is in hidden iframe(we need to switch to iframe)
     *  Sync issue(we need to use implicit(10) and explicit wait(15)) 7. 10,15,13 thread.sleep(150000)
     *  element is dynamic(we need to use dynamic locator)
     * */
    /*How do you handle dynamic element?
     * find the static parts of the element and write the locator(xpath or CSS)
     * then use starts-with,contains,ends with, text()
     */
    /* Using Listeners in TESTNG
     * */
}
