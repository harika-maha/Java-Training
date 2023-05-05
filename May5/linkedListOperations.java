package May5;
import java.util.*;

public class linkedListOperations {
    
    // Define the node structure for the linked list
    static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    // Function to insert a new node at the beginning of the list
    static Node insertAtBeginning(Node head, int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        return head;
    }
    
    // Function to insert a new node at the end of the list
    static Node insertAtEnd(Node head, int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return head;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return head;
    }
    
    // Function to insert a new node at the middle of the list
    static Node insertAtMiddle(Node head, int val, int pos) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return head;
        }
        Node current = head;
        int count = 1;
        while (count < pos && current.next != null) {
            current = current.next;
            count++;
        }
        newNode.next = current.next;
        current.next = newNode;
        return head;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int n, val, pos;
        
        System.out.print("Enter the number of nodes: ");
        n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value for node " + (i+1) + ": ");
            val = sc.nextInt();
            
            // Insert the new node at the beginning of the list
            head = insertAtBeginning(head, val);
            
            // Insert the new node at the end of the list
            head = insertAtEnd(head, val);
        }
        
        // Print the contents of the linked list
        System.out.print("Linked List: ");
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        
        // Insert a new node at the middle of the list
        System.out.print("\nEnter the value to insert: ");
        val = sc.nextInt();
        System.out.print("Enter the position to insert: ");
        pos = sc.nextInt();
        head = insertAtMiddle(head, val, pos);
        
        // Print the contents of the linked list again
        System.out.print("Linked List after insertion: ");
        current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
