package May5;

import java.util.Scanner;
class Main
{
    Node head = null;
    Node temp = null;
    class Node{
        int data;
        Node next;
        Node(int val){
            data = val;
            next = null;
        }
    }

    void insertAtEnd(int data){
        Node newNode = new Node(data);
        Node temp = head;
        if(head==null){
            head = newNode;
            temp = newNode;
        }
        else{
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void deleteAtBeginning(){
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        if(head!=temp){
            head = head.next;
        }
    }

    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void main(String args[])
    {
        Main list = new Main();
        //Try out your code here
        Scanner scan = new Scanner(System.in);
        int data = scan.nextInt();
        do{
            if(data>=0){
                list.insertAtEnd(data);
            }
            data = scan.nextInt();
        }while(data>=0);
        list.deleteAtBeginning();
        list.display();
    }
}