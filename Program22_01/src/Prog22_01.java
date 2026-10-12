
public class Prog22_01
{
    public static void main (String[] args)
    {
        new Prog22_01();
    }

    public Prog22_01()
    {
        BinarySearchTree bst = new BinarySearchTree();

        System.out.println("Is it empty? " + bst.isEmpty());

        bst.add(17);
        bst.add(10);
        bst.add(20);
        bst.add(11);
        bst.add(18);
        bst.add(23);

        System.out.println("Is it empty still? " + bst.isEmpty());

        bst.display();

        System.out.println(bst.contains(18));
        System.out.println(bst.contains(48));
    }
}
