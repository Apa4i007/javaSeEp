package done.tasks.done.stack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedStackTest {
    private LinkedStack s;

    @Before
    public void createStack(){
        s = new LinkedStack();
        s.push("e" + 1);
        s.push("e" + 2);
        s.push("e" + 3);
    }

    @Test
    public void testPopS() throws Exception {
        //then
        assertTrue(s.pop().equals("e3"));
        assertTrue(s.pop().equals("e2"));
        assertTrue(s.pop().equals("e1"));
    }

    @Test
    public void testPush() throws Exception {
        //then
        assertTrue(s.size()==3);
    }

    @Test
    public void testPeek() throws Exception {
        //then
        assertTrue(s.peek().equals("e3"));
    }
}