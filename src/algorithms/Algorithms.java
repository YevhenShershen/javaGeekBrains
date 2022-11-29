package algorithms;

public class Algorithms {
    public static void main(String[] params) {
        int[] array1 = new int[]{1, 2, 3, 4, 5, 6, 111, 222, 33, 312};
        System.out.println(searchLine(array1, 114));
        System.out.println(searchBinary(array1,0,array1.length -1, 111));
    }
    //создаем функцию вне
    ///////////////searchLine
    public static int searchLine ( int[] array, int elementToFind){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToFind) {
                return i;
            }
        }
        return -1;
    }
    /////////////////////searchBinary
    public static int searchBinary(int array[], int startIndex, int endIndex, int elementToFind){
     if(endIndex >= startIndex){
         int middleIndex = startIndex + (endIndex - startIndex) / 2;
         if(array[middleIndex] == elementToFind){
             return middleIndex;
         }
         if(array[middleIndex] > elementToFind){
             return searchBinary( array, startIndex, middleIndex-1, elementToFind);
         }   else{
             return searchBinary( array, middleIndex+1, endIndex, elementToFind);
         }
     }
     return -1;
    }
    //////////////////////searchBinary2
public static int serachBinary2(int array[], int elementToFind){
        int startIndex = 0;
        int endIndex = array.length -1;
        int middleIndex;
        while(startIndex <= endIndex){
            middleIndex = startIndex + (endIndex - startIndex) / 2;
            if(array[middleIndex]== elementToFind){
                return middleIndex;
            }
            if(array[middleIndex]> elementToFind){
                endIndex = middleIndex -1;
            }else{
                startIndex = middleIndex +1;
            }
        }
        return -1;
}
}
