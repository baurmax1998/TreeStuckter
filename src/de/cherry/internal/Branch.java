package de.cherry.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static de.cherry.TreeStruckter.SPLITTER;

/**
 * Created by mbaaxur on 02.07.17.
 */
public class Branch <V>{


    private final String key;
    private HashMap<String,Branch> branches = new HashMap<>(5);
    private List<V> elements = new ArrayList<V>(5);

    public Branch(String key) {
        this.key = key;
    }

    public void addElement(String struckterString, V element){

        if (struckterString.isEmpty()) {
            elements.add(element);
            return;
        }

        String[] split = struckterString.split(SPLITTER);
        String firstElement = split[0];
        Branch branch = branches.get(firstElement);
        if (branch == null){
            branch = new Branch(firstElement);
            this.branches.put(firstElement, branch);
        }

        StringBuilder rest = new StringBuilder();
        for (int i = 1; i < split.length; i++) {
           rest.append(split[i]).append("/");
        }


        branch.addElement(rest.toString(),element);




    }
}
