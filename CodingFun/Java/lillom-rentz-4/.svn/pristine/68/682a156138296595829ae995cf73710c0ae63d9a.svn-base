/**
 * Test case for the Registration object
 */
package tests;

import static org.junit.Assert.*;

import java.io.IOException;
import model.Registration;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Martin Lillo
 * @version Winter 2021
 */
public class RegistrationTest {

    /**
     * Registration object to test.
     */
    private Registration myRegister;
    
    /**
     * Set Up registration object. 
     */
    @Before
    public void setup() throws IOException {
        this.myRegister = new Registration();
    }
    
    /**
     * Test method for {@link model.Registration#getMyUserList()}.
     */
    @Test
    public void testGetMyUserList() {
        // test if method return user list
        assertNotNull("GetList Failed", myRegister.getMyUserList());
        assertEquals("GetList Failed", 7, myRegister.getMyUserList().size());
    }

    /**
     * Test method for {@link model.Registration#login(java.lang.String, java.lang.String)}.
     */
    @Test
    public void testLoginTrue() {
        // test if login works with correct values
        assertTrue("Login Failed", myRegister.login("gary", "3245"));
    }
    
    /**
     * Test method for {@link model.Registration#login(java.lang.String, java.lang.String)}.
     */
    @Test
    public void testLoginFalse() {
        // test if login fails with incorrect values
        assertFalse("Login Failed", myRegister.login("User-does-not-exist", "password"));
    }
    
    /**
     * Test if name is null.
     */
    @Test(expected = NullPointerException.class)
    public void nameNullParameter() {
        myRegister.login(null, "password");
    }
    
    /**
     * Test if password is null.
     */
    @Test(expected = NullPointerException.class)
    public void passwordNullParameter() {
        myRegister.login("name", null);
    }
    
    /**
     * Test if name string is empty.
     */
    @Test(expected = IllegalArgumentException.class)
    public void nameIsEmptyString() {
        myRegister.login("", "password1");

    }
    
    /**
     * Test if password string is empty.
     */
    @Test(expected = IllegalArgumentException.class)
    public void passwordIsEmptyString() {
        myRegister.login("name1", "");
    }

    /**
     * Test method for {@link model.Registration#clear()}.
     * @throws IOException 
     */
    @Test
    public void testClear() throws IOException {
        // test if the myUserList has zero elements once the clear method has been called
        final Registration reg1 = new Registration();
        reg1.clear();

        assertEquals("Clear method failed", 0, reg1.getMyUserList().size());
    }

    /**
     * Test method for {@link model.Registration#toString()}.
     */
    @Test
    public void testToString() {
        // test if toString method works
        assertEquals("toString Failed", "Registered User List: " + myRegister.getMyUserList().toString(), myRegister.toString());
    }
}
