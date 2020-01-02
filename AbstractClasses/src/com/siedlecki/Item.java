package com.siedlecki;

public abstract class Item {
    protected Item previous;
    protected Item next;
    public String value;


    abstract Item getPrevious();
    abstract void setPrevious(Item previous);
    abstract Item getNext();
    abstract void setNext(Item next);
    abstract String getValue();
    abstract boolean isHead();
    abstract boolean isTail();

}
