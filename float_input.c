#include<stdio.h>
int main(){
  float num1;
  double num2;
  printf("enter an number:");
  scanf("%f",&num1);
  printf("\nenter another number:");
  scanf("%lf",&num2);
  printf("num1=%f",num1);
  printf("\nnum2=%lf",num2);
  return 0;
}
