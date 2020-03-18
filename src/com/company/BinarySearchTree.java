package com.company;

public class BinarySearchTree {
    public Node root;

    public BinarySearchTree(int num){
        root = new Node(num);
    }

    //keresés
    public Node search(int num, Node root){
        if(root.number == num){
            return root;
        }
        if(root.number < num && root.left != null){
            return search(num, root.left);
        }
        if(root.number > num && root.right != null){
            return search(num,root.right);
        }
        return null;
    }

    //beszúrás
    public void insert(int num, Node root){
        if(num < root.number){
            if(root.left != null){
                insert(num,root.left);
            } else {
                root.left = new Node(num);
            }
        }
        if(num > root.number){
            if(root.right != null){
                insert(num, root.right);
            } else{
                root.right = new Node(num);
            }
        }
    }

    //bejárás
    public void walk(Node root){
        if(root.left != null){
            walk(root.left);
        }
        System.out.println(root);
        if(root.right != null){
            walk(root.right);
        }
    }
}
