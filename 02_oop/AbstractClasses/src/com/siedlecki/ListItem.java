package com.siedlecki;

public class ListItem extends Item {
    public ListItem(String value) {
        this.value = value;
    }

    @Override
    Item getPrevious() {
        return this.previous;
    }

    @Override
    void setPrevious(Item previous) {
        this.previous = previous;
    }

    @Override
    Item getNext() {
        return this.next;
    }

    @Override
    void setNext(Item next) {
        this.next = next;
    }

    @Override
    String getValue() {
        return this.value;
    }

    @Override
    boolean isHead() {
        return this.previous==null;
    }

    @Override
    boolean isTail() {
        return this.next==null;
    }
}
