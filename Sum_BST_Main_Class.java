package GL_Lab_3_Sum_of_BST;

public class Sum_BST_Main_Class {
	public static void main(String[] args) {
		Sum_of_given_pair_of_BST nodes = new Sum_of_given_pair_of_BST();
		nodes.insert(40);
		nodes.insert(20);
		nodes.insert(60);
		nodes.insert(10);

		nodes.insert(30);

		nodes.insert(50);
		nodes.insert(70);

		boolean check = nodes.Pairnotfound(nodes.root, nodes.root, 130);
		if (!check)
			System.out.println("nodes are not found");
	}
}
