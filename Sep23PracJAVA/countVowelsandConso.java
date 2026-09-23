class Main {
    public static void main(String[] args) {
       String s = "kjwek";
        int vo = 0;
        int co = 0;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vo++;
            }
            else{
                co++;
            }
        }
        System.out.println("Volwels: "+vo + " Consonents: "+co);
    

    }
}