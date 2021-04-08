package com.company.list;
/**
 * Lista doblemente ligada
 **/
public class LinkedList {
    private Node head;
    private Node tail;
    private int size;
    /**
     * Al final
     **/
    public void add(int dato){
        Node node=new Node(dato);
        node.setPrevious(tail);
        if(tail!=null){
            node.setNext(node);
        }
        if(head==null){
            head=node;
        }
        tail=node;
        size++;
    }

    public int getSize() {
        return size;
    }

    public int get(int index) {
        Node currentNode = head;
        int currentIndex=0;
        while(currentNode ! = null && currentIndex < index)
        {
            currentNode=currentNode.getNext();
            currentIndex++;
        }
        return currentNode.getDato();
    }
}
