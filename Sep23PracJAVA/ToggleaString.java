class Main {
    public static void main(String[] args) {

        String s = "JaVa";
        String res = "";

        for(int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if(Character.isUpperCase(ch)) {
                res += Character.toLowerCase(ch);
            } else {
                res += Character.toUpperCase(ch);
            }
        }

        System.out.println(res);
    }
}
