package ClubMemberInput;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import jdk.jfr.Timestamp;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class dojoUserTest {

    private dojoUser user;
    private String s1, s2;
    private String email = "test@test.com";
    private String name = "collin";
    private String id = "12345678";
    private String gradYear = "2021";
    private String major = "comp sci";

    @Before
    public void setUp() {
        user = new dojoUser(email, name, id, gradYear, major);
    }

    @After
    public void tearDown() {
        user = null;
        assertNull(user);
        s1 = null; s2 = null;
    }

    @Test
    public void testGetLucEmail() {
        assertTrue(user.getLucEmail().equals(email));
    }

    @Test
    public void testGetName() {
        assertTrue(user.getName().equals(name));
    }

    @Test
    public void testGetId() {
        assertTrue(user.getId().equals(id));
    }

    @Test
    public void testGetGradYear() {
        assertTrue(user.getGradYear().equals(gradYear));
    }

    @Test
    public void testGetMajor() {
        assertTrue(user.getMajor().equals(major));
    }

    @Test
    public void testToString() {
        s1 = "Email: "+email+" name: "+name+" ID: " +id+ " gradYear: "+gradYear+" Major: "+major;
        assertTrue(s1.equals(user.toString()));
    }

    
}
