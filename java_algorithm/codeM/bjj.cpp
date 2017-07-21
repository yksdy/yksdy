#include <iostream>
#include <cstdio>

using namespace std;

int main(){
	//freopen("1.in","r",stdin);
	int n,m = 0;
	cin >> n;
	cout << n <<endl;
    vector<int> num1 = new vector<int>;
	vector<int> num2 = new vector<int>;

	for(int i=0;i<n;i++){
		cin >> num1[i];
		cout << num1[i]<< " " <<endl;
	}
    cin >> m;
	cout << m <<endl;
	for(int i=0;i<m;i++){
		cin >> num2[i];
		cout << num2[i]<< " " <<endl;
	}
	return 0;
}