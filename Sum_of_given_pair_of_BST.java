package GL_Lab_3_Sum_of_BST;

import java.io.*;
import java.util.ArrayList;

// A binary tree node
class Node {

	int data;
	Node left, right;

	Node(int val) {
		data = val;
		left = right = null;
	}
}

public class Sum_of_given_pair_of_BST {

	// Root of BST
	Node root;

	// Constructor
	Sum_of_given_pair_of_BST() {
		root = null;
	}

	void insert(int key) {
		root = insertion(root, key);
	}

	/* A recursive function to insert a new key in BST */
	Node insertion(Node root, int data) {

		/* If the tree is empty, return a new node */
		if (root == null) {
			root = new Node(data);
			return root;
		}

		/* or else return the tree nodes */
		if (data < root.data)
			root.left = insertion(root.left, data);
		else if (data > root.data)
			root.right = insertion(root.right, data);

		return root;
	}

	boolean Pairnotfound(Node root, Node temp, int Sum) {
		if (temp == null)
			return false;

		return pairfound(root, temp, Sum - temp.data) || Pairnotfound(root, temp.left, Sum)
				|| Pairnotfound(root, temp.right, Sum);
	}

	boolean pairfound(Node root, Node temp, int p) {

		if (root == null)
			return false;

		Node var = root;
		boolean mark = false;
		while (var != null && mark != true) {
			if (var.data == p && temp != var) {
				mark = true;
				System.out.println("Pair is " + "(" + temp.data + " , " + var.data + ")");
				return true;
			} else if (p < var.data)
				var = var.left;
			else
				var = var.right;
		}

		return false;
	}

}
