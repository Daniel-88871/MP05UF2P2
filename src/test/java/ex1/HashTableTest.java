package ex1;

import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;

class HashTableTest {

    @org.junit.jupiter.api.Test
    void count() {
        HashTable hashTable = new HashTable();
        hashTable.put("Hola", "Adios");
        hashTable.put("Buenas", "Chao");
        Assertions.assertEquals(2, hashTable.count());
    }

    @org.junit.jupiter.api.Test
    void size() {
        for (int i = 5; i < 12; i++);
    }
}