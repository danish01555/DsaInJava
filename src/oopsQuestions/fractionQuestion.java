
package oopsQuestions;


public class fractionQuestion {
    public static class fraction{
        int num;
        int dem;
        public fraction(int num,int dem){
            this.num=num;
            this.dem=dem;
        }
        public void simplify(){
            if(num<dem){
                if(dem%num==0){
                    dem=dem/num;
                    num=1 ;
                }
            }

        }

    }

    public static void main(String[] args) {
//        fraction f1=new fraction();
//        f1.num=3;
//        f1.dem=7;
        fraction f3=new fraction(3,30);
       // System.out.println(f1.num+"/"+f1.dem);
        System.out.print(f3.num+"/"+f3.dem);
        f3.simplify() ;
        System.out.println();
        System.out.print(f3.num+"/"+f3.dem);

    }
}
