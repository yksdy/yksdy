#include <iostream>

int main()
{
  std::cout << "Please input two numbers:" << std::endl;
  int n1, n2;
  std::cin >> n1 >> n2;
  if(n1 >= n2)
    while( n1 >= n2) 
    {
      std::cout << n1 << "\t";
      n1--;
    }
  else
    while( n1 <= n2)
    {
      std::cout << n1 << "\t";
      n1++;
    }
  std::cout << std::endl;\
  return 0;
}
