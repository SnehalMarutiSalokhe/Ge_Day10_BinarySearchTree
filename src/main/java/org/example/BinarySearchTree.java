package org.example;

public class BinarySearchTree<K extends Comparable<K>> {
    private MyBinaryNode<K> root;

    public void add(K key) {
        root = addRecursive(root, key);
    }

    private MyBinaryNode<K> addRecursive(MyBinaryNode<K> current, K key) {
        if (current == null) {
            return new MyBinaryNode<>(key);
        }

        if (key.compareTo(current.key) < 0) {
            current.left = addRecursive(current.left, key);
        } else if (key.compareTo(current.key) > 0) {
            current.right = addRecursive(current.right, key);
        }
        return current;
    }

    public void printTree() {
        printRecursive(root);
    }

    private void printRecursive(MyBinaryNode<K> node) {
        if (node != null) {
            printRecursive(node.left);
            System.out.print(node.key + " ");
            printRecursive(node.right);
        }
    }


}

