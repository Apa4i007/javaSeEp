package mentoring.hashMap;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class HashMapImplTest {

    @Test
    public void testRemove() throws Exception {
        HashMapImpl hashMap = new HashMapImpl();
        hashMap.put(1, 11);
        hashMap.put(1, 111);
        hashMap.put(1, 0);
        hashMap.put(20, 1111);
        assertEquals(hashMap.get(20), 1111);
    }
}