package com.problems.linkedlist;

public class LinkedListProblem {
		
		public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
			ListNode l3 = null;
			ListNode temp1 = l1;
			ListNode temp2 = l2;
			ListNode temp3 = l3;
			int carry = 0;
			
			while(temp1 != null && temp2 !=null) {
				int n1 = temp1.val;
				int n2 = temp2.val;
				int sum = n1 + n2 + carry;
				carry = sum / 10;
				int remainder = sum % 10;
				
				if(l3 == null) {
					l3 = new ListNode(remainder);
					temp3 = l3;
				}else {
					temp3.next = new ListNode(remainder);
					temp3 = temp3.next;
				}
				
				temp2 = temp2.next;
				temp1 = temp1.next;			
			}
			
			if(temp1 != null) {
				while(temp1 != null) {
					int sum = temp1.val + carry;
					carry = sum / 10;
					int remainder = sum % 10;
					
					if(l3 == null) {
						l3 = new ListNode(remainder);
						temp3 = l3;
					}else {
						temp3.next = new ListNode(remainder);
						temp3 = temp3.next;
					}
					temp1 = temp1.next;
				}
			}
			
			if(temp2 != null) {
				while(temp2 != null) {
					int sum = temp2.val + carry;
					carry = sum / 10;
					int remainder = sum % 10;
					
					if(l3 == null) {
						l3 = new ListNode(remainder);
						temp3 = l3;
					}else {
						temp3.next = new ListNode(remainder);
						temp3 = temp3.next;
					}
					temp2 = temp2.next;
				}
			}
			
			if(carry != 0) {
				temp3.next = new ListNode(carry);
				temp3 = temp3.next;
			}
			
			return l3;
			
		}
		
		//https://leetcode.com/problems/remove-nth-node-from-end-of-list/
		
		public static ListNode removeNthFromEnd(ListNode head, int n) {
			ListNode prev = null;
			ListNode curr = head;
			ListNode temp = curr;
			
			if(head == null || n <= 0)
				return head;
			
			for(int i = 0; i < n ; i++) {
				if(temp == null) {
					return head;
				}
				temp = temp.next;
			}
			
			while(temp != null) {
				prev = curr;
				curr = curr.next;
				temp = temp.next;
			}
			
			if(prev == null && curr != null) {
				prev = curr.next;
				head = prev;
			}else {
				prev.next = curr.next;
			}
			
			return head;
		}
		
		public static ListNode mergeTwoSortedList(ListNode l1, ListNode l2) {
			ListNode l3 = new ListNode(1);
			ListNode temp3 = l3;
			
			ListNode temp1 = l1;
			ListNode temp2 = l2;
			
			//base condition
			
			if(temp1 == null)
				return temp2;
			
			if(temp2 == null)
				return temp1;
			
			while(temp1 != null && temp2 != null) {
				
				if(temp1.val <= temp2.val) {
					temp3.next = new ListNode(temp1.val);
					temp3 = temp3.next;
					temp1 = temp1.next;
				}else {
					temp3.next = new ListNode(temp2.val);
					temp3 = temp3.next;
					temp2 = temp2.next;
				}
			}
			
			if(temp1 != null) {
				while(temp1 != null) {
					temp3.next = new ListNode(temp1.val);
					temp3 = temp3.next;
					temp1 = temp1.next;
				}
			}
			
			if(temp2 != null) {
				while(temp2 != null) {
					temp3.next = new ListNode(temp2.val);
					temp3 = temp3.next;
					temp2 = temp2.next;
				}
			}
			
			return l3.next;
		}
		
		public static ListNode mergeKSortedList(ListNode[] lists) {
			
			if(lists == null || lists.length == 0)
				return null;
			
			if(lists.length == 1)
				return lists[0];
			
			ListNode result = lists[0];
			ListNode temp = null;
			
			for(int i = 1; i < lists.length; i++) {
				temp = mergeTwoSortedList(result, lists[i]);
				result = temp;
			}
			
			return temp;
		}
}
