/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uvigo.esei.dojos.swing.todo.core;

import java.util.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author comqsjb
 */
public class TodoListTest {
    
    public TodoListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of moveUp method, of class TodoList.
     */
    @Test
public void testMoveUp() 
{
        System.out.println("Move Up");
        TodoList instance = new TodoList();
        instance.add("111");
        instance.add("www");
        assertEquals(instance.elementAt(0), "111" );
        instance.moveUp(1);
        assertEquals(instance.elementAt(0), "www");
}

@Test
public void testMoveDown() 
{
    System.out.println("Move Down");
        TodoList instance = new TodoList();
        instance.add("111");
        instance.add("www");
        assertEquals(instance.elementAt(0), "111" );
        instance.moveDown(0);
        assertEquals(instance.elementAt(0), "www");
    
}

@Test
public void testAdd() 
{
           System.out.println(" Add");
           TodoList instance = new TodoList();
           assertEquals( instance.size(),0 );
           int i  = instance.size();
           instance.add("111");
           assertEquals(instance.size(), i);
            
}

@Test
public void testEditAt() 
{
fail("Not yet implemented");
}

@Test
public void testRemoveAt() 
{
        System.out.println(" Remove at");
        TodoList instance = new TodoList();
        instance.add("111");
        instance.add("222");
        instance.add("333");
        assertNotEquals( instance.size(), 0 );
        instance.removeAt(1);
        assertEquals( instance.elementAt(1), "333" );
        instance.removeAt(0);
        assertEquals( instance.elementAt(0), "333" );
}

@Test
public void testSize() 
{
        System.out.println(" Test Size");
        TodoList instance = new TodoList();
        instance.add("111");
        instance.add("222");
        instance.add("333");
        assertEquals( instance.size(), 3 );
        instance.removeAt(0);
        assertEquals(instance.size(), 2 );
       

}

}
