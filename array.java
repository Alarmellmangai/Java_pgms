public class array {
    public static void main(String[] args){
        
        // int[] a={2,4,6,4,7,3,7};

        // int n=a.length;
        // // System.out.println(n);

        // for(int i=0; i<n; i++){
        //     System.out.println(a[i]);
        // }
        // int[] a={2,4,6,4,7,3,7};
        // for(int n : a){
        //     System.out.println(n);
        // }

        int[][] matrix = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = i * 10 + j;
                 System.out.print(matrix[i][j] + " ");
            }
        System.out.println();
       
    }
}
}

/*
for i in range(1,5):
    print(i)  // 1,2,3,4
*/
