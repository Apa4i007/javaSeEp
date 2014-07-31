package mentoring.hashTable;

import org.junit.Test;

import static org.junit.Assert.*;

public class HashTableTest {

    private static final int INITIAL_CAPASITY = 10;

    @Test
    public void testRemove() throws Exception {
        //given
        HashTable hashMap = createTestHashMap();

        //when
        hashMap.remove(11);
        hashMap.remove(22);

        //then
        assertTrue(hashMap.isEmpty());
    }

    @Test
    public void testPut() throws Exception {
        //given
        HashTable hashMap = createTestHashMap();

        //then
        assertTrue(!hashMap.isEmpty());
        assertEquals(hashMap.getSize(), 2);
    }

    @Test
    public void testPutWithResize() throws Exception {
        //given
        HashTable hashMap = new HashTable(INITIAL_CAPASITY);
        for (int i = 0; i < INITIAL_CAPASITY + 1; i++) {
            hashMap.put(i);
        }

        //then
        assertEquals(hashMap.getSize(), INITIAL_CAPASITY + 1);
    }

    @Test
    public void testGet() throws Exception {
        //given
        HashTable hashMap = createTestHashMap();

        //then
        assertEquals(hashMap.get(11),11);
        assertEquals(hashMap.get(22),22);
    }

    private HashTable createTestHashMap() {
        HashTable hashMap = new HashTable(INITIAL_CAPASITY);
        hashMap.put(11);
        hashMap.put(22);
        return hashMap;
    }

}