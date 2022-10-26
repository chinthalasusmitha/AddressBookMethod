package com.addressbook;

public class AddressBook {
    private int index;
    private int person;

    public AddressBook(int index, int person) {
        this.index = index;
        this.person = person;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getPerson() {
        return person;
    }

    public void setPerson(int person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "index=" + index +
                ", person=" + person +
                '}';
    }
}
