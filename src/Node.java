/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c21q674
 */
class Node {

    public int iData; // data item (key)
    public char dData; // data item
    public Node leftChild; // this node's left child
    public Node rightChild; // this node's right child

    public void displayNode() // display ourself
    {
        System.out.print('{');
        System.out.print(iData);
        System.out.print(", ");
        System.out.print(dData);
        System.out.print("} ");
    }
}
