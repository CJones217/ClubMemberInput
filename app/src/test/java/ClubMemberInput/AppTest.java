/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ClubMemberInput;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test 
    public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }

    @Test 
    public void testAppGreetingHelloWorld() {
        App classUnderTest = new App();
        assertEquals("Hello World!",  classUnderTest.getGreeting());
    }
}
