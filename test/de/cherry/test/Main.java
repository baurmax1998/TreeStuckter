package de.cherry.test;

import de.cherry.TreeStruckter;

public class Main {

    public static void main(String[] args) {
	// write your code here

        TreeStruckter treeStruckter = new TreeStruckter();

        treeStruckter.addElement("hallo", 1);
        treeStruckter.addElement("hallo/welt", 2);
        treeStruckter.addElement("welt",3);
        treeStruckter.addElement("welt/hallo",4);
        treeStruckter.addElement("Test/test/Test",5);

        System.out.println("hallo");
    }
}
