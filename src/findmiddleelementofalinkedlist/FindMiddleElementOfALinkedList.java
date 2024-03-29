/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findmiddleelementofalinkedlist;

import java.util.LinkedList;

/**
 *
 * @author Abdi Mohammed
 */
public class FindMiddleElementOfALinkedList {

    // Tree Node Structure  
static class Node  
{  
    int data;  
    Node next;  
};  
  
// Create new Node  
static Node newLNode(int data)  
{  
    Node temp = new Node();  
    temp.data = data;  
    temp.next = null;  
    return temp;  
}  
  
static int n; 
static Node mid; 
  
// Function for finding midpoint recursively  
static void midpoint_util(Node head )  
{  
  
    // If we reached end of linked list  
    if (head == null)  
    {  
        n = (n) / 2;  
        return;  
    }  
  
    n = n + 1;  
  
    midpoint_util(head.next);  
  
    // Rolling back, decrement n by one  
    n = n - 1;  
    if (n == 0)  
    {  
  
        // Final answer  
        mid = head;  
    }  
}  
  
static Node midpoint(Node head)  
{  
    mid = null;  
    n = 1;  
    midpoint_util(head);  
    return mid;  
}  
  
// Driver code 
public static void main(String args[]) 
{  
    Node head = newLNode(1);  
    head.next = newLNode(2);  
    head.next.next = newLNode(3);  
    head.next.next.next = newLNode(4);  
    head.next.next.next.next = newLNode(5);  
    Node result = midpoint(head);  
    System.out.println( result.data );  
} 
}
