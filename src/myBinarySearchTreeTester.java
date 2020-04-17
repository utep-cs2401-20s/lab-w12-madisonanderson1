import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class myBinarySearchTreeTester {

    @Test
    public void testBinarySearchTree(){// I want to test the constructor that just passes in a single int value and insert values into that tree
        // this is my inital test case because I believe these are important things to test, if these dont work my whole program will not work at all
        myBinarySearchTreeNode test = new myBinarySearchTreeNode(7);
        test.insert(2);
        test.insert(3);
        test.print(); // help see exactly what was going on inside the tree
        assertEquals(3, test.size()); //after a few changes this test passed I also made sure that the size method works as well
    }

    @Test
    public void testBinarySearchTree2(){ //now I must test the other constructor that takes in an array since that is a fundamental part of my program
        // that must be proven to work, I know now that the other method of size works so if this test fails it is due to the constructor
        int[] a = {5,6,7,4};
        myBinarySearchTreeNode test = new myBinarySearchTreeNode(a);
        test.print(); //I want to see what is going on in the binary tree to help me debug
        test.size();
        assertEquals(4, test.size()); //after many changes this test finally passed
    }

    @Test
    public void testBinarySearchTree3(){// since I had a lot of trouble with the last constructor inserting all the values of the array into the tree
        // I want to make sure that it works for certain! So I tested the same constructor with a longer array
        int[] a = {2,3,4,1,9,7};
        myBinarySearchTreeNode test = new myBinarySearchTreeNode(a);
        assertEquals(6, test.size()); //passed
    }

    @Test
    public void testBinarySearchTree4(){ //Now that I have tested the fundamental parts of my program I can move on to other methods, starting with height
        int[] a = {5,6,7,4};
        myBinarySearchTreeNode test = new myBinarySearchTreeNode(a);
        assertEquals(2,test.height()); //test passed
    }

    @Test
    public void testBinarySearchTree5() {//Now I can test my final method of depth
        int[] a = {2,3,4,1,9,7};
        myBinarySearchTreeNode test = new myBinarySearchTreeNode(a);
        assertEquals(4, test.depth(7)); //passed
    }
}
