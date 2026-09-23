class Main {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int[] arr2 = {33,2,1};
        int n1 = arr1.length;
        int n2 = arr2.length;       
        int[] res = new int[n1+n2];

        for(int i = 0 ;i<n1;i++){
            res[i] = arr1[i];
        }
        for(int i = 0;i<n2;i++){
            res[n1+i] = arr2[i];
        }
        for(int i = 0;i<n2+n1;i++){
            System.out.print(res[i] + " ");
        }
    }
}