class Main {
    public static void main(String[] args) {

        String s = "aba";
        String res = "";

        for(int i = s.length() - 1; i >= 0; i--) {
            res += s.charAt(i);
        }

        if(res.equals(s)) {
            System.out.println("PAlli");
        } else {
            System.out.println("NOT");
        }
    }
}