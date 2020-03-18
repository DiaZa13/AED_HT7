import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    @org.junit.Test
    public void add() {
        BinarySearchTree<String, String> test = new BinarySearchTree<>();

        test.add("aguacate","verdura");
        test.add("manzana","fruta");
        test.add("Lucas","dulce");
        test.add("fisica","materia");

    }

    @org.junit.Test
    public void search() {
        BinarySearchTree<String, String> test = new BinarySearchTree<>();

        test.add("aguacate","verdura");
        test.add("manzana","fruta");
        test.add("Lucas","dulce");
        test.add("fisica","materia");

        assertEquals(test.search("Lucas"),"dulce");
    }
}