package com.example.greenforest.entities;

import com.example.greenforest.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Object {
    public static List<Object> objects = new ArrayList<>(Arrays.asList(
            new Object("Ivory", R.drawable.ivory, R.raw.evory),
            new Object("Cherry", R.drawable.cherry_tree, R.raw.cherry),
            new Object("Bubinga", R.drawable.tiger, R.raw.bubinga),
            new Object("Pine tree", R.drawable.cristmas_tree, R.raw.pushilin),
            new Object("Palm", R.drawable.palm_tree, R.raw.queen),
            new Object("Lady", R.drawable.lady, R.raw.lady),
            new Object("Emu", R.drawable.emu, R.raw.emu),
            new Object("Frog", R.drawable.frog, R.raw.frog),
            new Object("Egret", R.drawable.egret, R.raw.egret),
            new Object("Tiger", R.drawable.tiger, R.raw.tiger),
            new Object("Hyena", R.drawable.hyena, R.raw.hyena)));
    private String name;
    private int image;
    private int rendable;


    public Object(String name, int image, int rendable) {
        this.name = name;
        this.image = image;
        this.rendable = rendable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getRendable() {
        return rendable;
    }

    public void setRendable(int rendable) {
        this.rendable = rendable;
    }


    public static List<Object> getObjectsList() {
        return new ArrayList<>(Arrays.asList(
                new Object("frog", R.drawable.apple_tree, R.raw.frog),
                new Object("tree", R.drawable.apple_tree, R.raw.tree)));

    }
}
