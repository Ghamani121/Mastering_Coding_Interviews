//we have 2 arrays
//if both the array have 1 or more common characteres return true
//else return fasle

//note down key points of the question
//know your input and output
//ask main goal of the quesqtion(is it time,space, ask if the array will get bigger or else no need to worry aobut complexity unnessarily)
//speak out brute force  O(a*b)
//why its not good approach takes up a lot of time as the array incrreases

import java.util.HashSet;
public class L3_Coding_Interview {

    /**
     * @param arr1 First array
     * @param arr2 Second array
     * @return True if there is at least one common element in both arrays
     */
    public static boolean find(char arr1[],char arr2[]) {
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                return true;
            }
        }
        return false;
        
    }

    public static void main(String[] args) {
        char[] arr1={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','u','v','w','x','y','z'};
        char[] arr2={'u','v'};
        System.out.println(find(arr1,arr2));
    }
}
