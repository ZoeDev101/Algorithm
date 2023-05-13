package B001;

public class ArrayImpl {

    private Integer array[];
    private Integer endIndex; // record the index of the last value

    // constructor
    public ArrayImpl(int size){
        array = new Integer[size];
        endIndex = -1; // -1 represent no value in this array
    }

    public void addByIndex(int addIndex,int val){

        if(addIndex > endIndex + 1 || addIndex < 0) return;
        if(endIndex + 1 == array.length) expandSpace(); // if array space not enough we need expand space

        // ** Step 01: move all value one slot after ** //
        for(int i = endIndex; i>= addIndex; i--) {
            array[i + 1] = array[i];
            array[i] = null;
        }
        array[addIndex] = val;
        endIndex ++;

    }

    public void addByValue(int val){
        addByIndex(endIndex+1,val);
    }
    
    public void expandSpace(){
        Integer newArray[] = new Integer[array.length * 2];
        System.arraycopy(array,0,newArray,0,array.length);
        this.array = newArray;
    }

    public void removeByIndex(Integer removeIndex){

        if(removeIndex>endIndex || removeIndex<0){
            return;
        }

        /** move everything after one slot ahead **/
        for(int i=removeIndex; i<=endIndex; i++){
            array[i-1] = array[i];
        }
        endIndex --;
    }

    public void removeByValue(Integer val){

       for(int i=0; i<=endIndex; i++){
           if(array[i] == val){
               removeByIndex(i);
               return;
           }
       }
    }


    public Integer searchByIndex(int searchIndex){

        if(searchIndex > endIndex || searchIndex < 0) return null;
        return  array[searchIndex];
     }

    public Integer searchByValue(int searchVal){
        for (int i = 0; i <= endIndex ; i++) {
            if(array[i] == searchVal){
                return i;
            }
        }
        return null;
     }



    public void printArray(){
        for (Integer i : array) {
            if(i== null) break;
            System.out.print(i + " ");
        }
    }


}
