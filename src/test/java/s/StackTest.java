package s;


import static org.junit.Assert.assertTrue;

public class StackTest {
    private static final Stack s;

    static {
        s = new Stack();
        s.push("e" + 1);
        s.push("e" + 2);
        s.push("e" + 3);
    }

    @org.junit.Test
    public void testPush() throws Exception {
        //then
        assertTrue(s.size()==3);
    }

    @org.junit.Test
    public void testPeek() throws Exception {
        //then
        assertTrue(s.peek().equals("e3"));
    }

    @org.junit.Test
    public void testPop() throws Exception {
        //then
        assertTrue(s.pop().equals("e3"));
        assertTrue(s.pop().equals("e2"));
        assertTrue(s.pop().equals("e1"));
    }

}