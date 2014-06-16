package done.tasks.done.done.queue;

import done.tasks.done.queue.MyQueue;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyQueueTest {

    private MyQueue<String> q;

    @Before
    public void createTestQueue() {
        q = new MyQueue<String>(10);
        q.add("Vasa1");
        q.add("Vasa2");
        q.add("Vasa3");
    }

    @Test
    public void testAdd() throws Exception {
        //then
        assertTrue(!q.isEmpty());
    }



    @Test
    public void testExtract() throws Exception {
        //then
        assertEquals("Vasa1",q.extract());
        assertEquals("Vasa2",q.extract());
    }
}