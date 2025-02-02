import java.util.Scanner;

public class Binarytree{
    public Binarytree(){


    }
    private static class Node{
        private int value;
        private Node left;
        private Node right;

        public Node(int value){
            this.value = value;
        }
    }
    private Node root;

    public void populate(Scanner scanner){
        System.out.println("Enter the root node: ");
         int value = scanner.nextInt();
         root = new Node(value);
         populate(scanner,root);
    }

    public void populate(Scanner scanner, Node node){
        System.out.println("Do you want to enter left of " + node.value);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value of the left node: ");
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner,node.left);
        }
        System.out.println("Do you want to enter right of " + node.value);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value of the right node: ");
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner,node.right);
        }
    }

    public void display(){
        display(root,"     ");
    }

    private void display(Node node , String indent){
        if(node == null){
            return; 
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");

    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Binarytree tree = new Binarytree();
        tree.populate(scanner);
        tree.display();
    }
    



}