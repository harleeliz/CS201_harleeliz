/* Lab Exercises No.6
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos*/
package PARTII;

import java.util.Arrays;

class ApplianceSet {
    private Object[] appliances;
    private int count;

    public ApplianceSet() {
        appliances = new Object[10000];
        count = 0;
    }

    public ApplianceSet(int size) {
        appliances = new Object[size];
        count = 0;
    }

    public int getCount() {
        return count;
    }

    public boolean addAppliance(AppliancePoly newA) {
        if (newA == null) {
            return false;
        }

        if (count >= appliances.length) {
            appliances = Arrays.copyOf(appliances, appliances.length * 2);
        }

        try {
            appliances[count++] = newA.clone();
            return true;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public String getCustomerAppliances(long keyLocation) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            if (appliances[i] instanceof AppliancePoly && ((AppliancePoly) appliances[i]).getApplianceID() == keyLocation) {
                result.append(((AppliancePoly) appliances[i]).toString()).append("\n");
            }
        }
        return result.toString();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Count=" + count + "\n");
        for (int i = 0; i < count; i++) {
            if (appliances[i] instanceof AppliancePoly) {
                result.append((i + 1)).append(" ").append(((AppliancePoly) appliances[i]).toString()).append("\n");
            }
        }
        return result.toString();
    }
}

