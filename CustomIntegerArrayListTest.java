import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class CustomIntegerArrayListTest {

	@Test
	void testGetArrayList() {
		//create a new empty CustomIntegerArrayList
		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(0, 5);
		arr1.add(1, 5);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(0, 5);
		lst1.add(1, 5);
		assertEquals(lst1, arr1.getArrayList());

		ArrayList<Integer> arr4Elements = new ArrayList<Integer>();
		arr4Elements.add(100);
		arr4Elements.add(200);
		arr4Elements.add(500);
		
		//create a new CustomIntegerArrayList with the elements in the given ArrayList
		CustomIntegerArrayList arr4 = new CustomIntegerArrayList(arr4Elements);

		ArrayList<Integer> lst4 = new ArrayList<Integer>();
		lst4.add(100);
		lst4.add(200);
		lst4.add(500);
		
		assertEquals(lst4, arr4.getArrayList());
		
		//create a new empty CustomIntegerArrayList
		CustomIntegerArrayList arr11 = new CustomIntegerArrayList();
		arr11.add(200);
		arr11.add(0, 55);
		arr11.add(1, 45);
		
		ArrayList<Integer> lst11 = new ArrayList<Integer>();
		lst11.add(200);
		lst11.add(0, 55);
		lst11.add(1, 45);
		
		assertEquals(lst11, arr11.getArrayList());
		
		//create a new CustomIntegerArrayList with the elements in the given ArrayList
		CustomIntegerArrayList arr12 = new CustomIntegerArrayList();
		arr12.add(99);
		arr12.add(88);
		arr12.add(77);
		

		ArrayList<Integer> lst12 = new ArrayList<Integer>();
		lst12.add(99);
		lst12.add(88);
		lst12.add(77);

		assertEquals(lst12, arr12.getArrayList());
		
		//create a new CustomIntegerArrayList with the elements in the given ArrayList
		CustomIntegerArrayList arr13 = new CustomIntegerArrayList(lst12);
		arr13.add(66);
		arr13.add(55);
		arr13.add(44);
		
		ArrayList<Integer> lst13 = new ArrayList<Integer>(lst12);
		lst13.add(66);
		lst13.add(55);
		lst13.add(44);

		assertEquals(lst13, arr13.getArrayList());
	}

	@Test
	void testGet() {
		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(0, 5);
		arr1.add(1, 5);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(0, 5);
		lst1.add(1, 5);

		assertEquals(5, arr1.get(0));
		assertEquals(5, arr1.get(1));
		assertEquals(2, arr1.get(2));
		
		CustomIntegerArrayList arr21 = new CustomIntegerArrayList();
		arr21.add(200);
		arr21.add(1, 55);
		arr21.add(2, 45);
		arr21.add(3, 35);
		arr21.add(4,555);

		ArrayList<Integer> lst21 = new ArrayList<Integer>();
		lst21.add(200);
		lst21.add(1, 55);
		lst21.add(2, 45);
		lst21.add(3, 35);
		lst21.add(4, 555);
		
		assertEquals(45, arr21.get(2));
		assertEquals(35, arr21.get(3));
		assertEquals(555, arr21.get(4));
	}

	@Test
	void testAddInt() {
		
		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(0, 2);
		arr1.add(0, 3);
		arr1.add(0, 4);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(0, 2);
		lst1.add(0, 3);
		lst1.add(0, 4);

		assertEquals(4, arr1.get(0));
		assertEquals(3, arr1.get(1));
		assertEquals(2, arr1.get(2));

		CustomIntegerArrayList arr2 = new CustomIntegerArrayList(lst1);
		arr2.add(3, 5);
		arr2.add(3, 6);
		arr2.add(3, 7);
		
		ArrayList<Integer> lst2 = new ArrayList<Integer>(lst1);
		lst2.add(3, 5);
		lst2.add(3, 6);
		lst2.add(3, 7);

		assertEquals(7, arr2.get(3));
		assertEquals(6, arr2.get(4));
		assertEquals(5, arr2.get(5));
	}

	@Test
	void testAddIntInt() {
		
		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(0, 2);
		arr1.add(0, 3);
		arr1.add(0, 4);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(0, 2);
		lst1.add(0, 3);
		lst1.add(0, 4);		

		assertEquals(4, arr1.get(0));
		assertEquals(3, arr1.get(1));
		assertEquals(2, arr1.get(2));

		CustomIntegerArrayList arr2 = new CustomIntegerArrayList(lst1);
		arr2.add(2, 7);
		arr2.add(2, 8);
		arr2.add(2, 9);
		
		ArrayList<Integer> lst2 = new ArrayList<Integer>(lst1);
		lst2.add(2, 7);
		lst2.add(2, 8);
		lst2.add(2, 9);

		assertEquals(8, arr2.get(3));
		assertEquals(7, arr2.get(4));
		assertEquals(2, arr2.get(5));
	}

	@Test
	void testRemoveInt() {

		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(0, 2);
		arr1.add(0, 3);
		arr1.add(0, 4);
		arr1.remove(0);
		arr1.remove(1);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(0, 2);
		lst1.add(0, 3);
		lst1.add(0, 4);
		lst1.remove(0);
		lst1.remove(1);

		assertEquals(3, arr1.get(0));

		arr1.add(1, 5);
		arr1.add(1, 6);
		arr1.add(2, 7);
		arr1.add(2, 8);
		arr1.remove(1);
		arr1.remove(2);
		
		lst1.add(1, 5);
		lst1.add(1, 6);
		lst1.add(2, 7);
		lst1.add(2, 8);
		lst1.remove(1);
		lst1.remove(2);
	
		assertEquals(8, arr1.get(1));
		
		arr1.add(3, 11);
		arr1.add(3, 22);
		arr1.add(3, 33);
		arr1.remove(2);
		arr1.remove(3);
		
		lst1.add(3, 11);
		lst1.add(3, 22);
		lst1.add(3, 33);
		lst1.remove(2);
		lst1.remove(3);

		assertEquals(11, arr1.get(3));

		arr1.add(0, 101);
		arr1.add(0, 101);
		arr1.add(4, 102);
		arr1.add(4, 102);
		arr1.remove(4);
		arr1.remove(4);
		
		lst1.add(0, 101);
		lst1.add(0, 101);
		lst1.add(4, 102);
		lst1.add(4, 102);
		lst1.remove(4);
		lst1.remove(4);
		
		assertEquals(3, arr1.get(2));
	}

	@Test
	void testRemoveIntInt() {

		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(0, 2);
		arr1.add(0, 3);
		arr1.add(0, 3);
		arr1.add(0, 3);
		arr1.add(0, 3);
		arr1.add(0, 4);
		arr1.remove(3, 3);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(0, 2);
		lst1.add(0, 3);
		lst1.add(0, 4);

		assertEquals(lst1, arr1.getArrayList());
		
		CustomIntegerArrayList arr2 = new CustomIntegerArrayList(lst1);
		arr2.add(3, 6);
		arr2.add(3, 6);
		arr2.add(3, 6);
		arr2.add(3, 6);
		arr2.add(3, 5);
		arr2.add(3, 4);
		arr2.remove(4, 6);
		
		ArrayList<Integer> lst2 = new ArrayList<Integer>(lst1);
		lst2.add(3, 5);
		lst2.add(3, 4);

		assertEquals(lst2, arr2.getArrayList());

		arr2.add(2, 99);
		arr2.add(3, 99);
		arr2.add(4, 99);
		arr2.remove(4, 99);

		assertEquals(lst2, arr2.getArrayList());
		
		arr2.add(0, 101);
		arr2.remove(4, 99);
		lst2.add(0, 101);

		assertEquals(lst2, arr2.getArrayList());
	}

	@Test
	void testSpliceIntInt() {

		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		arr1.add(5);
		arr1.add(6);
		arr1.splice(3, 2);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(3);
		lst1.add(4);
		
		assertEquals(2, arr1.get(0));
		assertEquals(3, arr1.get(1));
		assertEquals(4, arr1.get(2));
		
		CustomIntegerArrayList arr2 = new CustomIntegerArrayList(lst1);
		arr2.add(99);
		arr2.add(98);
		arr2.add(97);
		arr2.add(5);
		arr2.add(6);
		arr2.splice(5, 9);
		
		ArrayList<Integer> lst2 = new ArrayList<Integer>(lst1);
		lst2.add(99);
		lst2.add(98);
		lst2.add(97);
		lst2.remove(5);
		
		assertEquals(3, arr2.get(1));
		assertEquals(4, arr2.get(2));
		
		arr2.add(88);
		arr2.add(99);
		arr2.add(999);
		arr2.splice(5, 2);
		
		lst2.add(999);
		
		assertEquals(99, arr2.get(3));
	}

	@Test
	void testSpliceIntIntIntArray() {
		
		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		arr1.add(5);
		arr1.add(6);
		arr1.splice(3, 1, new int[] { 4, 5 });
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(3);
		lst1.add(4);
		lst1.add(4);
		lst1.add(5);
		lst1.add(6);
		
		assertEquals(lst1, arr1.getArrayList());

		CustomIntegerArrayList arr2 = new CustomIntegerArrayList(lst1);
		arr2.add(99);
		arr2.add(98);
		arr2.add(97);
		arr2.splice(3, 3, new int[] {102, 101, 100});
		
		ArrayList<Integer> lst2 = new ArrayList<Integer>(lst1);
		lst2.remove(3);
		lst2.remove(3);
		lst2.remove(3);
		lst2.add(102);
		lst2.add(101);
		lst2.add(100);		
		lst2.add(99);
		lst2.add(98);
		lst2.add(97);
		
		assertEquals(lst2, arr2.getArrayList());
		
		CustomIntegerArrayList arr3 = new CustomIntegerArrayList(lst1);
		arr3.add(99);
		arr3.add(98);
		arr3.add(97);
		arr3.splice(3, 0, new int[] {102, 101, 100});
		
		ArrayList<Integer> lst3 = new ArrayList<Integer>(lst1);	
		lst3.add(99);
		lst3.add(98);
		lst3.add(97);
		
		assertEquals(lst3, arr3.getArrayList());
		
		CustomIntegerArrayList arr4 = new CustomIntegerArrayList(lst1);
		arr4.add(4);
		arr4.add(5);
		arr4.add(6);
		arr4.splice(3, 3, new int[] {});
		
		assertEquals(lst1, arr4.getArrayList());		
	}

}
