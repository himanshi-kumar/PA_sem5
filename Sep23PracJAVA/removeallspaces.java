class Main {
    public static void main(String[] args) {

        String s = "My name is Himanshi";
        String res = "";

        for(int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if(ch != ' ') {
                res += ch;
            }
        }

        System.out.println(res);
    }
}
