package com.company;

public class Main {

    public static void main(String[] args) {

        BinarySearchTree b = new BinarySearchTree(10);

        b.insert(4,b.root);
        b.insert(15,b.root);
        b.insert(6,b.root);
        b.insert(11,b.root);

        b.walk(b.root);
    }
}
