#include<iostream>
int main(){
    char c;
    int a,i,g;
    std::cout <<"Enter Lucky Number:\n";
    std::cin >>a;
        std::cout<<"The Game has Started !!\n";
    while(c!='N'){
        std::cout <<"Guess the Lucky number \nYou have only 3 chances\n";
        for(i=1;i<4;i++){
            std::cout<<"Enter your guess number "<<i<<"\n";
            std::cin>>g;
            if(g==a){
                std::cout<<"You guessed the right Lucky number \nCongratulations ! You won the game .\n";
                break;
            }
        }
        std::cout<<"If you want to play again enter 'Y' otherwise enter 'N' for exit:\n";
        std::cin>>c;
    }

}
