package done.tasks.done.done.list;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyArrayListTest {

    private done.tasks.done.done.MyArrayList<String> list = new done.tasks.done.done.MyArrayList<String>();

    @Before
    public void initialiseArray() {
        for (int i = 0; i < 10; i++) {
            list.add("e" + i);
        }
    }

    @Test
    public void testAdd() throws Exception {
        //then
        for (int i = 0; i < 10; i++) {
            assertEquals("e" + i, list.get(i));
        }
        assertEquals(list.size(), 10);
    }

    @Test
    public void testGet() throws Exception {
        //then
        assertEquals("e0", list.get(0));
        assertEquals("e7", list.get(7));
        assertEquals("e8", list.get(8));
    }

    @Test
    public void testRemove() throws Exception {
        //when
        list.remove(2);
        list.remove(3);

        //then
       assertEquals(8, list.size());
    }

    @Test
    public void testSet() throws Exception {
       //when
        list.set(7,"Swat");

        //then
        assertEquals("Swat",list.get(7));
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void shouldGetExceptionWhenRemoveNotExistElement(){
        //then
        list.remove(12);
    }
}