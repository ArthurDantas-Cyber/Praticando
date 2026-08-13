package Estruturas.exc13;

public class Main{
    public static void main (String[] Args){
        int[] v1 = new int[] {
    2, 5, 8, 11, 14, 17, 20, 23, 26, 29,
    32, 35, 38, 41, 44, 47, 50, 53, 56, 59,
    62, 65, 68, 71, 74, 77, 80, 83, 86, 89,
    92, 95, 98, 101, 104, 107, 110, 113, 116, 119,
    122, 125, 128, 131, 134, 137, 140, 143, 146, 149
};
        int[] v2 = new int[] {
    1, 4, 7, 10, 13, 16, 19, 22, 25, 28,
    31, 34, 37, 40, 43, 46, 49, 52, 55, 58,
    61, 64, 67, 70, 73, 76, 79, 82, 85, 88,
    91, 94, 97, 100, 103, 106, 109, 112, 115, 118,
    121, 124, 127, 130, 133, 136, 139, 142, 145, 148
};
        int[] v3 = new int[100];

        int j=0, k=0, i=0;


        while (j < v1.length && k < v2.length){
            if(v1[j] < v2[k]){
                v3[i] = v1[j];
                i++;
                j++;
            }
            else{
                v3[i] = v2[k];
                i++;
                k++;
            }
        }
        if (k < v2.length){
            for (; k < v2.length; k++) {
                v3[i] = v2[k];
                i++;
            }
        }else if (j < v1.length){
            for (; j < v1.length; j++) {
                v3[i] = v1[j];
                i++;
            }
        }
        
        for (i = 0; i < v3.length; i++) {
            System.out.printf("%d ",v3[i]);
        }
        

    }
}