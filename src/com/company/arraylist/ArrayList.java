package com.company.arraylist;

public class ArrayList {

    private int arr[];
    // capacity of the ArrayList
    private int capacity;

    // current is the number of elements, currently present in the ArrayList
    private int current;

    public ArrayList() {
        arr = new int[1];
        capacity = 1;
        current = 0;
    }
    // Function to add an element at the last
    public void add(int data) {

        // if the number of elements equal to capacity then we double the capacity
        if (current == capacity) {
            int temp[] = new int[2 * capacity];
            // copying old array elements to new array
            for (int i = 0; i < capacity; i++)
                temp[i] = arr[i];
            capacity *= 2;
            arr = temp;
        }

        // Inserting data
        arr[current] = data;
        current++;
    }

    // function to add element at any index
    void add(int data, int index) {
        if (index == capacity)
            add(data);
        else
            arr[index] = data;
    }

    // Function to extract element at any index
    int get(int index) {

        // if index is within the range
        if (index < current)
            return arr[index];

        // if index is outside the range
        return -1;
    }
    // function to delete last element
    void remove() {
        current--;
    }
    // function to get size of the ArrayList
    int size() {
        return current;
    }

    // function to get capacity of the ArrayList
    int getcapacity() {
        return capacity;
    }
    // function to print ArrayList elements
    void print() {
        for (int i = 0; i < current; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        ArrayList arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);

        System.out.println("ArrayList size: " + arrayList.size());
        System.out.println("ArrayList capacity: " + arrayList.getcapacity());
        System.out.println("ArrayList elements: ");
        arrayList.print();
        arrayList.add(100, 1);

        System.out.println("\nAfter updating 1st index");

        System.out.println("ArrayList elements: ");
        arrayList.print();
        System.out.println("Element at 1st index: " + arrayList.get(1));

        arrayList.remove();

        System.out.println("\nAfter deleting the" + " last element");

        System.out.println("ArrayList size: " + arrayList.size());
        System.out.println("ArrayList capacity: " + arrayList.getcapacity());

        System.out.println("ArrayList elements: ");
        arrayList.print();
    }
}