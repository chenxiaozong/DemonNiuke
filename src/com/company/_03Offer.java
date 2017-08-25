package com.company;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class _03Offer {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> values = new ArrayList<>();



        values.add(1);
        values.add(1);
        values.add(1);
        values.add(1);
        values.add(1);
        values.add(8);

        Collections.reverse(values);

        return (ArrayList<Integer>) values;


    }


    @Test
    public  void test(){
       // ListNode listNode = generateListNode();
        ArrayList<Integer> integers = printListFromTailToHead(new ListNode(12));

        System.out.println(integers);


    }


    public ListNode generateListNode(){
        ListNode listNode = new ListNode(0);

        for (int i=0;i<10;i++){
            listNode.next = new ListNode(i+1);
        }

        while (listNode.next!=null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
        return listNode;


    }

         public class ListNode {
             int val;
             ListNode next = null;

             ListNode(int val) {
                 this.val = val;
             }
         }


}
