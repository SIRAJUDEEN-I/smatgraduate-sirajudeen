#include<stdio.h>
int main(){
  int age;
  printf("enter you age :");
  scanf("%d",&age);
  if(age>=18){
    printf("you are eligible to vote");
  }
else{
  printf("you are not eligible to vote");
}
return 0;
}