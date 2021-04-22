package org.howard.edu.lsp.exam.question41;
import org.howard.edu.lsp.exam.question41.RemoveZeros;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author Tolulope Akinlabi
 *
 */
class RemoveZerosTest {

	@Test
	@DisplayName("Test to show if list is stripped of 0 values")
	void stripZeros() {
		assertEqual(numbers, {7,2,4});
	}
	

	@Test
	@DisplayName("Test to show if list is stripped of 0 values")
	void stripZeros() {
		assertEqual(numbers, {0, 7, 2, 0, 0, 4, 0});
	}

}
