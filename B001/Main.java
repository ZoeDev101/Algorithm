package B001;

public class Main {

    public static void main(String[] args) {

        /** initialize **/
        ArrayImpl array = new ArrayImpl(5);

        array.addByValue(5);
        array.addByValue(98);
        array.addByValue(2);
        array.addByValue(3);
        array.addByValue(79);
        System.out.println("array value：");
        array.printArray();
        System.out.println();

        System.out.println("---------------------------------------------");

        /** add by value O(1) + expand O(n), Time Complexity => O(n) **/
        System.out.println("Insert 44");
        array.addByValue(44);
        array.printArray();
        System.out.println();

        System.out.println("---------------------------------------------");

        System.out.println("Find the value = 44");
        array.searchByValue(44);
        System.out.printf("index = %d%n",array.searchByValue(44));

        System.out.println("Find the value = 79");
        array.searchByValue(79);
        System.out.printf("index = %d%n",array.searchByValue(79));

        System.out.println("---------------------------------------------");

        /** add by index O(n) **/
        int addIndex = 2;
        array.addByIndex(addIndex, 50);
        System.out.println("Insert 50 at index 2");
        array.printArray();
        System.out.println();

        System.out.println("---------------------------------------------");

        array.addByValue(88);
        System.out.println("Insert 88");
        array.printArray();
        System.out.println();

        System.out.println("---------------------------------------------");

        /** search by value O(n) **/
        Integer val = array.searchByValue(2882);
        System.out.println("Find the 2882 in this array");

        if (val == null) {
            System.out.print("This value not exist in array！");
        } else {
            System.out.print(val);
        }
        System.out.println();

        System.out.println("---------------------------------------------");

        /** search by index O(1) **/
        System.out.println("Find the value of index is 4");
        Integer val2 = array.searchByIndex(4);
        if (val2 == null) {
            System.out.print("This value not exist in array！");
        } else {
            System.out.print(val2);
        }
        System.out.println();

        System.out.println("---------------------------------------------");

        /** remove by value O(n) **/
        System.out.println("Delete the value = 2");
        array.removeByValue(2);
        array.printArray();
        System.out.println();

        System.out.println("---------------------------------------------");

        /** remove by index O(n) **/
        int i_remove = 3;
        System.out.println("Delete the value of index is 3");
        array.removeByIndex(i_remove);
        array.printArray();
        System.out.println();

    }
}
