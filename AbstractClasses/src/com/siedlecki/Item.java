package com.siedlecki;

public abstract class Item {
    private Value value;
    private Item previous;
    private Item next;

    public Item(Value value) {
        this.value = value;
    }

    public Item getPrevious() {
        return previous;
    }

    public void setPrevious(Item previous) {
        this.previous = previous;
    }

    public Item getNext() {
        return next;
    }

    public void setNext(Item next) {
        this.next = next;
    }
    
}
