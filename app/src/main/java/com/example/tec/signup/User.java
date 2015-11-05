package com.example.tec.signup;
/**
 * Created by SHINE on 9/22/2015.
 */

import com.google.gson.annotations.SerializedName;

/**


 This is a pojo class for table User in your azure mobile service table/

 I suggest you to make same name table as this pojo class and same column names as gson
 serialsised name . Eg : name , email  (@com.google.gson.annotations.SerializedName("name"))


 */




public class User {

    /**
     * Item text
     */
    @com.google.gson.annotations.SerializedName("name")
    private String mname;
    
    
    /**
     * Item email
     */
    @com.google.gson.annotations.SerializedName("email")
    private String memail;

    /**
     * Item password
     */
    @com.google.gson.annotations.SerializedName("password")
    private String mpassword;

    /**
     * Item Id
     *
     * An id is required and it is automaticaly generated by mobile servuce table
     */
    @com.google.gson.annotations.SerializedName("id")
    private String mId;

    /**
     * Indicates if the item is completed
     */
    @com.google.gson.annotations.SerializedName("complete")
    private boolean mComplete;
    /**
     * User constructor
     */
    public User() {

    }



    @Override


    public String toString() {
        return getText();
    }

    /**
     * Initializes a new User
     *
     * @param name
     *            The item text
     * @param id
     *            The item id
     */
    public User(String name, String id, String email, String password ) {
        this.setText(name);
        this.setemail(email);
        this.setpassword(password);


    }

    /**
     * Returns the item id
     */
    public String getId() {
        return mId;
    }


    /**
     * Returns the item text
     */
    public String getText() {
        return mname;
    }




    /**
     * Returns the item password
     */
    public String getpassword() {
        return mpassword;
    }


    /**
     * Returns the item email
     */

    public String getemail() {
        return memail;
    }



    //SET METHODS




    /**
     * Sets the item id
     *
     * @param id
     *            id to set
     */
    public final void setId(String id) {
        mId = id;
    }


    /**
     * Sets the item email
     *
     * @param email
     *            text to set
     */
    public final void setemail(String email) {
        memail = email;
    }


    /**
     * Sets the item password
     *
     * @param password
     *            text to set
     */
    public final void setpassword(String password) {
        mpassword = password;
    }

    /**
     * Sets the item text
     *
     * @param name
     *            text to set
     */
    public final void setText(String name) {
        mname = name;
    }




    /**
     * Indicates if the item is marked as completed
     */
    public boolean isComplete() {
        return mComplete;
    }

    /**
     * Marks the item as completed or incompleted
     */
    public void setComplete(boolean complete) {
        mComplete = complete;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof User && ((User) o).mname == mname;
    }
}

