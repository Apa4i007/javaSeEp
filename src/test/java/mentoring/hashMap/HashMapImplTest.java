package mentoring.hashMap;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class HashMapImplTest {

    private static final int MAX_SIZE = 128;

    @Test
    public void testRemove() throws Exception {
        //given
        HashMapImpl hashMap = createTestHashMap();

        //when
        hashMap.remove(1);
        hashMap.remove(2);

        //then
        assertTrue(hashMap.isEmpty());
    }

    @Test
    public void testGet() throws Exception {
        //given
        HashMapImpl hashMap = createTestHashMap();

        //then
        assertEquals(hashMap.get(1), 11);
        assertEquals(hashMap.get(2), 22);
    }

    @Test
    public void testPut() throws Exception {
        //given
        HashMapImpl hashMap = createTestHashMap();

        //then
        assertTrue(!hashMap.isEmpty());
        assertEquals(hashMap.getSize(), 2);
    }

    private HashMapImpl createTestHashMap() {
        HashMapImpl hashMap = new HashMapImpl();
        hashMap.put(1, 11);
        hashMap.put(2, 22);
        return hashMap;
    }

    @Test
    public void testPutWithResize() throws Exception {
        //given
        HashMapImpl hashMap = new HashMapImpl();
        for (int i = 0; i < MAX_SIZE + 1; i++) {
            hashMap.put(i, i);
        }

        //then
        assertEquals(hashMap.getSize(), MAX_SIZE + 1);
    }

    @Test
    public void testGetOnEmptyHashMap() throws Exception {
        //given
        HashMapImpl hashMap = new HashMapImpl();

        //then
        assertEquals(hashMap.get(1), -1);
    }

}