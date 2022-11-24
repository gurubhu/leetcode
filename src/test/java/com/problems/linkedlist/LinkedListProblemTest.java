package com.problems.linkedlist;

import org.junit.Test;

public class LinkedListProblemTest {

	@Test
	public void addTwoNumbersTest() {
		
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(7);
		l1.next.next = new ListNode(9);
		
		ListNode l2 = new ListNode(4);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(5);
		
		ListNode l3 = LinkedListProblem.addTwoNumbers(l1, l2);
		System.out.println(l3);
		
		ListNode l4 = new ListNode(7);
		l4.next = new ListNode(5);
		l4.next.next = new ListNode(3);
		l4.next.next.next = new ListNode(4);
		
		ListNode l5 = new ListNode(2);
		l5.next = new ListNode(9);
		l5.next.next = new ListNode(8);
		
		ListNode l6 = LinkedListProblem.addTwoNumbers(l4, l5);
		System.out.println(l6);
		
		ListNode l7 = new ListNode(1);
		l7.next = new ListNode(2);
		l7.next.next = new ListNode(3);
		
		ListNode l8 = new ListNode(7);
		l8.next = new ListNode(5);
		l8.next.next = new ListNode(3);
		l8.next.next.next = new ListNode(4);
		
		ListNode l9 = LinkedListProblem.addTwoNumbers(l7, l8);
		System.out.println(l9);
	}
	
	@Test
	public void removeNthFromEnd() {
		ListNode l1= new ListNode(1);
		ListNode l2 = LinkedListProblem.removeNthFromEnd(l1, 0);
		
		System.out.println(l2);
		
		ListNode l3= new ListNode(1);
		ListNode l4 = LinkedListProblem.removeNthFromEnd(l3, 1);
		
		System.out.println(l4);
		
		ListNode l5= new ListNode(1);
		ListNode l6 = LinkedListProblem.removeNthFromEnd(l5, 2);
		
		System.out.println(l6);
		
		ListNode l7= new ListNode(1);
		l7.next = new ListNode(2);
		ListNode l8 = LinkedListProblem.removeNthFromEnd(l7, 1);
		
		System.out.println(l8);
		
		ListNode l9= new ListNode(1);
		l9.next = new ListNode(2);
		ListNode l10 = LinkedListProblem.removeNthFromEnd(l9, 2);
		
		System.out.println(l10);
		
		ListNode l11= new ListNode(1);
		l11.next = new ListNode(2);
		ListNode l12 = LinkedListProblem.removeNthFromEnd(l11, 3);
		
		System.out.println(l12);
	}
	
	@Test
	public void mergeTwoSortedList() {
		ListNode l1= new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(4);
		
		ListNode l2= new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);
		
		ListNode l3 = LinkedListProblem.mergeTwoSortedList(l1, l2);
		
		System.out.println(l3);
		
		ListNode l4= new ListNode(1);
		l4.next = new ListNode(2);
		l4.next.next = new ListNode(4);
		l4.next.next.next = new ListNode(5);
		
		ListNode l5= new ListNode(1);
		l5.next = new ListNode(3);
		l5.next.next = new ListNode(3);
		
		ListNode l6 = LinkedListProblem.mergeTwoSortedList(l4, l5);
		
		System.out.println(l6);
		
		ListNode l7= new ListNode(1);
		l7.next = new ListNode(5);
		l7.next.next = new ListNode(7);
		
		ListNode l8= new ListNode(2);
		l8.next = new ListNode(3);
		l8.next.next = new ListNode(5);
		l8.next.next.next = new ListNode(8);
		
		ListNode l9 = LinkedListProblem.mergeTwoSortedList(l7, l8);
		
		System.out.println(l9);
	}
	
	@Test
	public void mergeKSortedListTest() {
		
		ListNode l1= new ListNode(1);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(5);
		
		ListNode l2= new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);
		
		ListNode l3= new ListNode(2);
		l3.next = new ListNode(6);
		
		ListNode[] lists = {l1, l2, l3};
		
		ListNode l4 = LinkedListProblem.mergeKSortedList(lists);
		
		System.out.println(l4);
	}
}
