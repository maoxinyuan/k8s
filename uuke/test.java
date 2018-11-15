package cn.com.srpingboot;


public class test {

    int a =0 ;
    int b =0 ;

    public int breakchain(int A[],int n){
        a = A[1];
        b = A[2];
        for(int i =3;i<(n-1);i++){
            int x = A[i];
            if(x<=a){
                b=a;
                a=i ;
            }else if (x <=b){
                b=x ;
            }
        }
        return (a+b) ;
    }


    public static void main(String [] args){

        int A[]  = {5,1,6,7,9,4,10,1,3};
        test te = new test();
        int result = te.breakchain(A,A.length);
        System.out.println(result);

    }
}
