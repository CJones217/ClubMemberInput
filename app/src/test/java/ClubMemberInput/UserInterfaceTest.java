package ClubMemberInput;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import jdk.jfr.Timestamp;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;



public class UserInterfaceTest{

    private dojoUser user;
    private UserInterface emptyPanel;


    @Before
    public void setUp() {
        this.emptyPanel = new UserInterface();
        this.user = new dojoUser();
    }

    @After
    public void tearDown() {
        this.user = null;
        this.emptyPanel = null;
        assertNull(this.emptyPanel);
    }

    /*@Test
    public void testSetAndReturnUser() {
        emptyPanel.setUser("defaultUser","password", "000000000", "earth", "stemLOL");
        dojoUser user2 = emptyPanel.returnUser();
        //assertNull(user2);
        assertTrue(this.user.getLucEmail().equals(user2.getLucEmail()));
        //assertEquals(1,1);
    }*/


}