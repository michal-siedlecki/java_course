package com.siedlecki;

public class OrderedList {
    private ListItem head;
    public int length;

    public OrderedList() {
        this.length = 0;
    }

    public int getLength() {
        return length;
    }


    public void add(String value){
        System.out.println("trying to add: " + value);
        if (getItemByValue(value)==null){
            ListItem newItem = new ListItem(value);
            if (this.length==0){
                this.head=newItem;
                this.length += 1;
            } else if (insertItem(newItem)) {
                this.length += 1;
            } else {
                appendItem(newItem);
                this.length += 1;
            }
        } else {
            System.out.println("Item with this value is already in the list");
        }

    }


    public boolean insertItem(ListItem newItem){
        ListItem current = this.head;
        int lowestRankNum = getRankDifference(this.head, newItem);
        if (this.length==1){
            if (getRankDifference(current,newItem)>0){
                insertBeforeCurrent(current, newItem);
                return true;
            }
        }
        while (current.getNext()!=null){

            System.out.println("comparing "
                    + current.getValue()
                    + newItem.getValue()
                    + " result => "
                    +getRankDifference(current, newItem));

            if (getRankDifference(current,newItem)>0){
                insertBeforeCurrent(current, newItem);
                return true;
            }
            current = (ListItem) current.getNext();
        }
        return false;
    }

    private int getRankDifference(ListItem first, ListItem second){
        return first.getValue().compareTo(second.getValue());
    }


    private void appendItem(ListItem newItem) {
        ListItem last = this.head;
        while (last.getNext()!=null){
            last = (ListItem) last.getNext();
        }
        last.setNext(newItem);
        newItem.setPrevious(last);
    }


    public int compareItems(ListItem first, ListItem second){
        int result = first.getValue().compareTo(second.getValue());
        if (result<0){
            return -1;
        } else if (result==0){
            return 0;
        } else{
            return 1;
        }
    }

    private void insertBeforeCurrent(ListItem current, ListItem newItem) {
        if (current.isHead()){
            current.setPrevious(newItem);
            newItem.setNext(current);
            this.head = newItem;
            return;
        }
        ListItem previous = (ListItem) current.getPrevious();
        current.setPrevious(newItem);
        previous.setNext(newItem);
        newItem.setNext(current);
        newItem.setPrevious(previous);
    }



    public void remove(String value){
        if ((this.length==0)&&(getItemByValue(value)==null)){
            System.out.println("there are no items in list");
        } else {
            ListItem itemToDelete = getItemByValue(value);
            delete(itemToDelete);
        }
    }

    private ListItem getItemByValue(String value){
        if (this.length==0){
            return null;
        } else {
            ListItem current = this.head;
            do {
                if (current.getValue().equals(value)){
                    return current;
                }
                current = (ListItem) current.getNext();

            }while (current!=null);
        }
        return null;
    }

    private void delete(ListItem itemToDelete){
        if (itemToDelete.isHead()){
            deleteHead();
        } else if (itemToDelete.isTail()){
            deleteTail(itemToDelete);
        } else {
            ListItem previous = (ListItem) itemToDelete.getPrevious();
            ListItem next = (ListItem) itemToDelete.getNext();
            previous.setNext(next);
            next.setPrevious(previous);
            itemToDelete.setPrevious(null);
            itemToDelete.setNext(null);
        }
        this.length -= 1;
    }

    private void deleteHead() {
        if (this.length == 1){
            this.head = null;
        } else {
            ListItem next = (ListItem) this.head.getNext();
            next.setPrevious(null);
            this.head = next;
        }
    }

    private void deleteTail(ListItem tail){
        if (this.length == 1){
            this.head = null;
        } else {
            ListItem previous = (ListItem) tail.getPrevious();
            previous.setNext(null);
            tail.setPrevious(null);
        }
    }

    public void printValues(){
        if (this.length==0){
            System.out.println("empty list");
        } else {
            System.out.println("there are: " + this.length + " positions in the list\n-----------------------");

            ListItem current = this.head;
            while (true){
                System.out.println(current.getValue());
                if (current.getNext()==null){
                    break;
                }
                current = (ListItem) current.getNext();
            }
            System.out.println("-----------------------");
        }
    }

}

