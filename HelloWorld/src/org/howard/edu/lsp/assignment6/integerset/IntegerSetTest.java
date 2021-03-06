/**
 * 
 */
package org.howard.edu.lsp.assignment6.integerset;
import  org.howard.edu.lsp.assignment6.integerset.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

/**
 * @author Tolulope Akinlabi
 *
 */
class IntegerSetTest {
	
	//Test case if a case fail
	@Test
	@DisplayName("This will Fail, don't worry!")
	void testFail() {
		fail();
		fail("Not yet implemented");
		fail(() -> {
			return "Not yet implemented";
		});
		fail("Not Yet Implemented", new RuntimeException("Explicitly Failed"));
		fail(new RuntimeException("Explicitly Failed"));

	}
	

	@Test
	@DisplayName("Test case for clear")
	void testClear() {
		assertEqual(set, []);
	}

	
	@Test
	@DisplayName("Test case for Length")
	 void testSize() {
        assertEquals(4, this.s.size());
        assertEquals(0, new IntegerSet(new Integer[]{}).size());
        this.myList.add(10);
        assertEquals(5, this.s.size());
    
	
	@Test
	@DisplayName("Test case to return set")
	void testReturnSet() {
		assertEqual(s, [3,5,2,0]);
	}
	
	@Test
	@DisplayName("Test case if two sets are equal")
	void testEquals() {
		assertTrue(s, a);
		assertTrue(() -> {
			return true;
		});
		
		assertTrue(s, a, "set not equal");
		assertTrue(s, a, () -> {
			return "s, a";
		});

		assertTrue(() -> {
			return true;
		}, "set not equal");
		assertTrue(() -> {
			return true;
		}, () -> {
			return "set not equal";
		});
	}
	
	@Test
	@DisplayName("Test case if contains a value")
	void testContains() {
		assertTrue(s, 5);
		assertTrue(() -> {
			return true;
		});

		assertTrue(s, 5, "does not contain value");
		assertTrue(s, 5, () -> {
			return "s, 5";
		});

		assertTrue(() -> {
			return true;
		}, "does not contain value");
		assertTrue(() -> {
			return true;
		}, () -> {
			return "does not contain value";
		});
	}
	
	@Test
	@DisplayName("Test case for the largest number")
    public void testSmallest() {
		IntegerSet s = new IntegerSet();
        assertEquals(0, set.findMin(s));
        assertNotEquals(5, set.findMin(s));
    }
    
    @Test (expected = IllegalArgumentException.class)
    void testFindMinShouldThrowException() {
    	IntegerSet s = new IntegerSet();
        s.findMin(new int[]{});
        
    
	@Test
	@DisplayName("Test case for the largest number")
    void testLargest() {
		IntegerSet s = new IntegerSet();
        assertEquals(5, set.findMax(s));
        assertNotEquals(0, set.findMax(s));
    }
    
    @Test (expected = IllegalArgumentException.class)
    void testFindMinShouldThrowException() {
    	IntegerSet s = new IntegerSet();
        s.findMax(new int[]{}); 
        
	
	@Test
	@DisplayName("Test case to add a value to set")
	void testAdd() {
        Testcases testcases = new Testcases();
        assertEquals(Arrays.asList(12,6,9,8), testcases.a());
    }
	
	@Test
	@DisplayName("Test case to remove a value to set")
	void testRemove() {
		assertEqual(s, 5);
	}
	
	@Test
	@DisplayName("Test case check union of set s and a")
	void testUnion() {
		union = [3,5,2,0,12,6,9,8];
		assertEqual(b, union);
	}
	
	@Test
	@DisplayName("Test case check intersect of set s and a")
	void testIntersect() {
		intersect = [];
		assertEqual(b, intersect);
	}
	
	@Test
	@DisplayName("Test case check difference of set s and a")
	void testDiffernce() {
		difference = [];
		assertEqual(b, difference);
	}
	
	
	@Test
	@DisplayName("Test case if set is empty")
	void testIsEmpty() {
		assertTrue(s, []);
		assertTrue(() -> {
			return true;
		});

		assertTrue(s, [], "set is empty");
		assertTrue(s, [], () -> {
			return "s, []";
		});

		assertTrue(() -> {
			return true;
		}, "set is empty");
		assertTrue(() -> {
			return true;
		}, () -> {
			return "set is empty";
		});
	}
	
	
	@Test
	@DisplayName("Test case check if value is string")
	void testString() {
		assertEqual(set, String);
	}
	
}
