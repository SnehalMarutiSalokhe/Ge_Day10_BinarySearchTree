package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.add(56);
        bst.add(30);
        bst.add(70);

        System.out.println("BST Structure:");
        bst.printTree();
    }
}