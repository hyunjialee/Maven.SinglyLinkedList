package com.zipcodewilmington.singlylinkedlist;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> {

    public Node head;
    static class Node<T>{
        // node holds the data and next.
        // data can be anything
        // next is the node that follows

        T data;
        Node next;

        public Node (T data){
            this.data = data;
            this.next = null;
        }
    }
    public void add(T data){

        if (head == null) {
            Node<T> newNode = new Node<>(data);
            head = newNode;
        }
        Node<T> node = head;

        while (node.next != null) {
            node = node.next;
        }

        Node<T> nodeAdd = new Node<>(data);

        node.next = nodeAdd;

    }

    public void remove(Integer index) {
        //remove an element (specified by numeric index) from the list
        if (head != null && index == 0) {
            // head is removed -> the next node after head becomes the new head
            head = this.head.next;
            // If I didn't refer back to the specific "THIS HEAD" then
        } else {
            Node<T> node = head; // Making a reference to the other nodes...
            // TRAIN CARTS. HEAD (FIRST CART) -> NODE -> NODE -> NODE

            while (index - 1 > 0 && node.next != null){
                node = node.next;
                index--;
                // 2 node.next, -> node.next.next ->
            }
            // head , 1, 2, 3
            if (node == null || node.next == null) {
                return;
            }

            node.next = node.next.next;


//            Node<T> previous  = null;
//            for (int i = 0 ; i < index; i++){
//                previous = node;  // Previous = Node1
//                node = node.next; // node = Node2
//                                 // How do you make Node1 point to Node3
//            }
//            previous.next = node.next;
            // ^^POINT TO NODE2  POINT TO NODE3

            // head - > node -> node1 -> node2
            // NODE 1 -> NODE3 if im looking for index 0
            // NODE 2 -> NODE4 if im looking for index 1
            // NODE 3 -> NODE5 if im looking for index 2
        }
    }

    public void contains(){
    }

    public void find(){

    }

    public void size(){

    }

    public void get(){

    }

    public void copy(){

    }

    public void sort(){

    }
}
