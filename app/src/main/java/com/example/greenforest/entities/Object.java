package com.example.greenforest.entities;

import com.example.greenforest.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Object {
    private String name;
    private int gif;
    private int rendable;
    public static List<Object> objects=new ArrayList<>(Arrays.asList(
            new Object("frog", R.drawable.apple_tree,R.raw.frog),
            new Object("tree",R.drawable.apple_tree,R.raw.tree)));


    public Object(String name, int gif, int rendable) {
        this.name = name;
        this.gif = gif;
        this.rendable = rendable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGif() {
        return gif;
    }

    public void setGif(int gif) {
        this.gif = gif;
    }

    public int getRendable() {
        return rendable;
    }

    public void setRendable(int rendable) {
        this.rendable = rendable;
    }


        public static List<Object> getObjectsList(){
        return new ArrayList<>(Arrays.asList(
                new Object("frog", R.drawable.apple_tree,R.raw.frog),
                new Object("tree",R.drawable.apple_tree,R.raw.tree)));

}
}
