import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class myBinarySearchTreeTester {

    @Test
    public void testBinarySearchTree(){
        myBinarySearchTreeNode test = new myBinarySearchTreeNode(7);
        test.insert(2);
        test.insert(3);
        assertEquals(3, test.size());
    }

}
