 class armstrong {
    public  static void main(String args[]){
        int a;
        for(a = 100; a<1000; a++){
            int x=a/100;
            int m=a%100;
            int y=m/10;
            int z=m%10;
            if(x*x*x + y*y*y + z*z*z ==a)
            System.out.println(a);
        }

    }
    
}
