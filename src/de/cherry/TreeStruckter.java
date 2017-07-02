package de.cherry;

import de.cherry.internal.Branch;

/**
 * Created by mbaaxur on 02.07.17.
 */
public class TreeStruckter <V>{
    public static final String SPLITTER = "/";
    private Branch<V> masterBranch = new Branch<V>("");


    public void addElement(String struckterString, V content){
        masterBranch.addElement(struckterString, content);
    }
}
