class Main {
    public static void main(String[] args) {
        int[] arr = {1,-2,2,43,11};
        int lar = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;
        
        for(int i= 0;i<arr.length;i++){
            if(arr[i]>lar){
                sec = lar;
                lar = arr[i];
            }else if(arr[i]>sec && arr[i]<lar){
                sec = arr[i];
            }
            
        }
        System.out.println("Second Largest: "+sec);
    }
}