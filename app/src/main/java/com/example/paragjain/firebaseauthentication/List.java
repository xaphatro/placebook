package com.example.paragjain.firebaseauthentication;

import java.util.ArrayList;

/**
 * Created by rahul on 11/11/17.
 */

public class List {
    String listID;
    String listName;

    ArrayList<Item> items = null;

    public List(String listID, String listName)
    {
        this.listID = listID;
        this.listName = listName;
    }

    public List(String listID, String listName, ArrayList<Item> items)
    {
        this.listID = listID;
        this.listName = listName;
        this.items = items;
    }

}
