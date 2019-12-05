package com.mark.icohome.design.prototype;

/**
 * @author mjh
 */

public abstract class Shape implements Cloneable {

    private String id;
    protected String type;

    public Shape() {
        System.out.println("construct");
    }

    abstract void draw();

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
