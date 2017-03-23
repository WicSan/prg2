package trees.Kap5;

/**
 * ETH Zürich, Leitprogramm, Binäre Suchbäume ---- Klasse um die rightrotation
 * und die leftrotation von AVL Bäumen zu testen
 *
 * @author Björn Steffen, Timur Erdag, Christina Class, Martin Klaper
 */
public class Aufgabe5_9 {

    /**
     * Hauptmethode
     *
     * @param args nicht verwendet
     */
    public static void main(String[] args) {
        System.out.println("Aufgabe 5.9\n*****\n");
        AVLNode root = makeTree1();
        
        AVLNode node1 = new AVLNode(1);
        AVLNode node2 = new AVLNode(1);
        
        boolean b = node1.equals(node2);
        
        root = root.insert(root, 1);
               
        System.out.println("Ausgabe insert: ");
        root.inorderWithBalance(root);

        System.out.println("Ausgabe delete: ");
        root = root.delete(root, 11);
        
        System.out.println("Ausgabe des unbalancierten Baumes: ");
        root.inorderWithBalance(root);
        System.out.println("\nAusgabe des balancierten Baumes (nach Aufruf der Methode rightrotation): ");
        root = root.rightrotation(root);
        root.inorderWithBalance(root);
        System.out.println("\nDie richtigen Balancewerte wären: 0 -1 0 0 0 0\n\n");

        root = makeTree2();

        System.out.println("Ausgabe des unbalancierten Baumes: ");
        root.inorderWithBalance(root);
        System.out.println("\nAusgabe des balancierten Baumes (nach Aufruf der Methode leftrotation): ");
        root = root.leftrotation(root);
        root.inorderWithBalance(root);

        System.out.println("\nDie richtigen Balancewerte wären: 0 0 0 0 1 0\n\n");
    }

    private static AVLNode makeTree1() {
        AVLNode root = new AVLNode(10);

        AVLNode node2 = new AVLNode(5);
        AVLNode node3 = new AVLNode(8);
        AVLNode node4 = new AVLNode(9);
        AVLNode node6 = new AVLNode(11);

        root.setLeft(node3);
        node3.setLeft(node2);
        node3.setRight(node4);
        root.setRight(node6);

        return root;
    }

    private static AVLNode makeTree2() {
        AVLNode root = new AVLNode(5);
        AVLNode node1 = new AVLNode(1);
        AVLNode node2 = new AVLNode(10);
        AVLNode node3 = new AVLNode(8);
        AVLNode node4 = new AVLNode(7);
        AVLNode node6 = new AVLNode(11);

        root.setLeft(node1);
        root.setRight(node3);
        node3.setLeft(node4);
        node3.setRight(node2);
        node2.setRight(node6);
        return root;
    }
}

