#include <iostream>
int main()
{
	int x=0,y=0;
	std::cout<<"please input numbers to x and y:"<<std::endl;
	std::cin>>x>>y;
	while(y>x){
	
	std::cout<<x<<std::endl;
	x++;
	}
	while(y<=x){
	std::cout<<y<<std::endl;
	y++;
	}
	return 0;
}
