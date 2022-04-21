/**
 * Test case for the User object
 */
package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Objects;
import model.User;
import org.junit.Before;
import org.junit.Test;



/**
 * @author Martin Lillo
 * @version Winter 2021
 */
public class UserTest {

    /**
     * User object 1.
     */
    private User myUser1;
    
    /**
     * User object 2.
     */
    private User myUser2;
    
    /**
     * Set Up method to initialize objects.
     */
    @Before
    public void setUp() {
        myUser1 = new User("Martin", "KarlJcbs3");
        myUser2 = new User("Quackity", "Firework5", true);
    }
    
    /**
     * Test method for {@link model.User#hashCode()}.
     */
    @Test
    public void testHashCode() {
        // test hash code method for myUser1
        assertEquals("Hash Code Failed", Objects.hash(myUser1.getMyName(), 
                      myUser1.getMyPassword(), myUser1.isMyVIPStatus()), myUser1.hashCode());
        
        // test hash code method for myUser2
        assertEquals("Hash Code Failed", Objects.hash(myUser2.getMyName(), 
                      myUser2.getMyPassword(), myUser2.isMyVIPStatus()), myUser2.hashCode());
    }

    /**
     * Test method for {@link model.User#User(java.lang.String, java.lang.String)}.
     */
    @Test
    public void testUserStringString() {
        // test if objects are null
        assertNotNull("Null Object", myUser1.getMyName());
        assertNotNull("Null Object", myUser1.getMyPassword());
        
        // test if constructor works
        assertEquals("Parameterized Constructor Failed", "Martin", myUser1.getMyName());
        assertEquals("Parameterized Constructor Failed", "KarlJcbs3", myUser1.getMyPassword());
    }
    
    /**
     * Test method for {@link model.User#User(java.lang.String, java.lang.String, java.lang.Boolean)}.
     */
    @Test
    public void testUserStringStringBoolean() {
        // test if objects are null
        assertNotNull("Null Object", myUser2.getMyName());
        assertNotNull("Null Object", myUser2.getMyPassword());
        assertNotNull("Null Object", myUser2.isMyVIPStatus());
        
        // test if constructor works
        assertEquals("Parameterized Constructor Failed", "Quackity", myUser2.getMyName());
        assertEquals("Parameterized Constructor Failed", "Firework5", myUser2.getMyPassword());
        assertEquals("Parameterized Constructor Failed", true, myUser2.isMyVIPStatus());
    }

    /**
     * Test method for {@link model.User#getMyVIPStatus()}.
     */
    @Test
    public void testGetMyVIPStatus() {
        // test getting vip status method for myUser1
        assertEquals("GetVIP Failed", false, myUser1.isMyVIPStatus());
        
        // test getting vip status method for myUser2
        assertEquals("GetVIP Failed", true, myUser2.isMyVIPStatus());
    }

    /**
     * Test method for {@link model.User#getMyName()}.
     */
    @Test
    public void testGetMyName() {
        // test getting name method for myUser1
        assertEquals("GetName Failed", "Martin", myUser1.getMyName());
        
        // test getting name method for myUser1
        assertEquals("GetName Failed", "Quackity", myUser2.getMyName());
    }

    /**
     * Test method for {@link model.User#getMyPassword()}.
     */
    @Test
    public void testGetMyPassword() {
        // test getting password method for myUser1
        assertEquals("GetPassword Failed", "KarlJcbs3", myUser1.getMyPassword());
        
        // test getting password method for myUser1
        assertEquals("GetPassword Failed", "Firework5", myUser2.getMyPassword());
    }

    /**
     * Test method for {@link model.User#toString()}.
     */
    @Test
    public void testToString() {
        // test to string method for myUser1
        assertEquals("toString Failed", "User(Martin, KarlJcbs3, false)", myUser1.toString());
        
        // test to string method for myUser1
        assertEquals("toString Failed", "User(Quackity, Firework5, true)", myUser2.toString());
    }

    /**
     * Test method for {@link model.User#equals(java.lang.Object)}.
     */
    @Test
    public void testEqualsObjectPositive() {
        final User user2Copy = new User("Quackity", "Firework5", true);
        
        // test equals method for myUser1
        assertEquals("Equals Failed", myUser1, myUser1);
        
        // test equals method for myUser2
        assertEquals("Equals Failed", myUser2, myUser2);
        
        // test similar objects with same values
        assertEquals("Equals Failed", myUser2, user2Copy);
    }
    
    /**
     * Test method for {@link model.User#equals(java.lang.Object)}.
     */
    @Test
    public void testEqualsObjectNegative() {
        // test for null objects
        assertNotEquals("Equals Failed", myUser1, null);
        
        // test for objects with different values
        assertNotEquals("Equals Failed", myUser1, myUser2);
        
        // test for objects in different classes
        assertNotEquals("Equals Failed", myUser1, new ArrayList<Integer>());
    }

}
