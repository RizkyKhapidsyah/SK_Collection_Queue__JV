package com.rizkykhapidsyah;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_Collection {
    public static void main(String[] args) {
        Queue Q = new LinkedList();

        Q.add("Elemen 1");
        Q.add("Elemen 2");
        Q.add("Elemen 3");

        /* Cara 1 */
        System.out.println("======\nCARA 1\n======");
        Object ElemenPertama = Q.element();
        System.out.println("Elemen 1  = " + ElemenPertama + "\n");

        /* Cara 2 */
        System.out.println("======\nCARA 2\n======");
        Iterator i = Q.iterator();

        while (i.hasNext()) {
            String elemen = (String) i.next();
            System.out.println("Elemen  = " + elemen);
        }

        Object hapusElemen = Q.remove();
        System.out.println("Elemen yang dihapus : " + hapusElemen + "\n");

        /* Mengambil head queue */
        Object h = Q.peek();
        System.out.println("Elemen head  : " + h);

        /* Mengambil head Queue dan menghapusnya */
        Object h2 = Q.poll();
        System.out.println("Elemen head  : " + h2);

    }
}
