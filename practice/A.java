package practice;

public class A {

    public static int call(String[] ops){
        int res[] = new int[ops.length];
        for (int i = 0,j=0; i < ops.length; i++) {
            if (ops[i]=="C") {
                res[j-1]=0;
                j--;
            }else if (ops[i]=="D") {
                res[j]=res[j-1]*2;
                j++;
            }else if (ops[i]=="+") {
                res[j]=res[j-1]+res[j-2];
                j++;
            } else  {
                res[j] = Integer.parseInt(ops[i]);
                j++;
            } 
        }
        int ree =0;
        for (int i = 0; i < ops.length; i++) {
            ree+=res[i];
        }
        return ree;
    }

    public static void main(String[] args) {
        System.out.println(call(new String[]{"5","2","C","D","+"}));
    }
}
