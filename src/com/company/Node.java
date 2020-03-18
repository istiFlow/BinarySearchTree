package com.company;

public class Node {

    int number;
    Node left;
    Node right;

    public Node(int number){
        this.number = number;
    }

    @Override
    public String toString() {
        return "Node{" +
                "number=" + number +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
