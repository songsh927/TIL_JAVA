package ch6_4_overloading;

public class VarArgsEx {
    public static void main(String[] args) {
        String[] strArr = {"100", "200", "300"};

        System.out.println(concatenate("","100","200","300"));
        System.out.println(concatenate("-", strArr));
        System.out.println(concatenate(",", new String[]{"1","2","3"}));
        System.out.println("["+concatenate(",", new String[]{"1","2","3"})+"]");
        System.out.println("["+concatenate(",")+"]");
    }

    static String concatenate(String delim, String... args) {
        String result = "";

        for(String str: args){
            result += str+delim;
        }
        return result;
    }
    //가변인자를 사용한 메서드는 오버로딩을 가급적 피할것!
    /*
    static String concatenate(String... args){
        return concatenate("",args);
    }
     */
}
