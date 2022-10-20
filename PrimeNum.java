public class PrimeNum{
    public static void main(String[] args){
            int i,j,count=0;
            System.out.println("Prime numbers from 1 to 10 are :");
            for(j=1;j<11;j++){
                count=0;
                for(i=j;i>0;i--){
                    if(i%j==0){
                        count+=1;
                    }
                }
                if(count==2){
                    System.out.println(j);
                }
            }
    } 
}
