#include <iostream>
int main()
{
  int sum = 0;
  int num = 50;
  while(num <= 100){
    sum = sum + num;
    num++;
  }
 std::cout << "50+51+...+100 = " << sum <<std::endl;
 return 0;
}
