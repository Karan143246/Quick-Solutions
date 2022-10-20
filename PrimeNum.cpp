#include<bits/stdc++.h>
int main(){
    int a,i,count=0;
    std::cout <<"Enter a number :";
    std::cin >>a;
    for(i=a;i>0;i--){
        if(a%i==0){
            count+=1;
        }
    }
    if(count==2){
        std::cout << "The number is prime .";
    }
    else{
        std::cout << "The number is not prime .";
    }
}
