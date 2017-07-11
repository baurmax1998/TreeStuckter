package de.cherry;

import de.cherry.internal.Branch;

import java.util.HashMap;

/**
 * Created by mbaaxur on 02.07.17.
 */
public class TreeStruckter <V>{
    public static final String SPLITTER = "/";
    private Branch<V> masterBranch = new Branch<V>("");

    public HashMap<String, Branch> getBranches() {
        return masterBranch.getBranches();
    }

    public void addElement(String struckterString, V content){
        masterBranch.addElement(struckterString, content);
    }
}
