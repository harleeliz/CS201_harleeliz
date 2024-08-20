package Part_I;

/* Lab Exercises No.7
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */

public class DateList {
    private Date[] listItems;
    private int numItems;
    private int currentPos;
    private static final int DEFAULT_SIZE = 100;

    public DateList() {
        listItems = new Date[DEFAULT_SIZE];
        numItems = 0;
        currentPos = 0;
    }

    public DateList(int maxItems) {
        if (maxItems > 0) {
            listItems = new Date[maxItems];
        } else {
            listItems = new Date[DEFAULT_SIZE];
        }
        numItems = 0;
        currentPos = 0;
    }

    public boolean isEmpty() {
        return (numItems == 0);
    }

    public int length() {
        return numItems;
    }

    public boolean isFull() {
        return (numItems == listItems.length);
    }

    public boolean isThere(Date item) {
        int index = 0;
        while (index < numItems && !listItems[index].equals(item)) {
            index++;
        }
        return (index < numItems);
    }

    public void resetList() {
        currentPos = 0;
    }

    public boolean insert(Date item) {
        if (!isFull()) {
            int index = 0;

            // Find the correct index to insert the date while maintaining sorted order using a do-while loop
            do {
                if (index < numItems && item.compareTo(listItems[index]) > 0) {
                    index++;
                } else {
                    break; // stop the loop if the correct index is found
                }
            } while (true);

            // move elements to create space for new dates
            for (int i = numItems; i > index; i--) {
                listItems[i] = listItems[i - 1];
            }

            // place the date in the correct index
            listItems[index] = new Date(item.getMonth(), item.getDay(), item.getYear());
            numItems++;

            return true;
        } else {
            return false;
        }
    }


    public String toString() {
        StringBuilder temp = new StringBuilder();
        if (numItems > 0) {
            for (int i = 0; i < numItems; i++) {
                temp.append(listItems[i]).append("\n");
            }
        }
        return temp.toString();
    }
}
