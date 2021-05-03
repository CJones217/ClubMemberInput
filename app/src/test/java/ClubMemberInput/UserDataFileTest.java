package ClubMemberInput;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class UserDataFileTest {
    private UserDataFile sut;
    private String s1, s2;

    @Before
    public void setUp() {
        sut = new UserDataFile();
    }

    @After
    public void tearDown() {
        sut = null;
        assertNull(sut);
        s1 = null; 
        s2 = null;
    }

    @Test
    public void testIfAccountReturnTrue() {
        // TODO
        s1 = "gradletest@test.com";
        s2 = "collin";
        assertTrue(sut.isAnAccount(s1, s2));
    }

    @Test
    public void testIfAccountReturnFalse() {
        // TODO
        s1 = "java@java.com";
        s2 = "not an account";
        assertFalse(sut.isAnAccount(s1, s2));
    }
}
