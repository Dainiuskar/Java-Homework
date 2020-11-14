package edu;

public class CustomList {
    private int[] ints;

    public CustomList() {
        ints = new int[0];
    }

    public CustomList(int[] ints) {
        this.ints = ints;
    }

    public boolean any() {
        return ints.length > 0;
        // don't do this:
        // return !(ints.length < 1)
    }

    public int[] getAll() {
        return ints;
    }

    public void add(int param){

        int[] newInts = new int[this.ints.length+1];
        for (int i=0; i<ints.length; i++){
            newInts[i] = this.ints[i];
        }
        newInts[-1] = param;
        this.ints = newInts;
    }

    public void removeAt(int position){

        int[] newInts = new int[this.ints.length-1];
        for (int i=0; i<ints.length; i++) {
            if (i != position){
                newInts[i] = this.ints[i];
            }
        }
        this.ints = newInts;
    }


}
