/*
*把只包含质因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含质因子7。 习惯上我们把1当做是第一个丑数。现在请你帮度度熊求解出第n个丑数是什么？
*例如：
*n=5，输出5，表示第5个丑数是5
*n=7，输出8，表示第7个丑数是8
*/ 

#include<iostream>
using namespace std;
int getMin(int a,int b,int c){ 
	if(a<=b&&a<=c){
		return a;
	}else if(b<=a&&b<=c){
		return b;
	}else if(c<=a&&c<=b){
		return c;
	}
}
int main(){
	int num;
	cin>>num;
    int p2 = 0, p3 = 0, p5 = 0;//三个指针 
    int uglyNumber[num];
    uglyNumber[0] = 1;
    for (int i = 1; i < num; i++) {
    	uglyNumber[i] = getMin(uglyNumber[p2]*2,uglyNumber[p3]*3,uglyNumber[p5]*5);//求当前最小因子数 
            if (uglyNumber[i] == uglyNumber[p2]*2) {
                p2++;
            }
            if (uglyNumber[i] == uglyNumber[p3]*3) {
                p3++;
            }
            if (uglyNumber[i] == uglyNumber[p5]*5) {
                p5++;
            }
        }
    cout<<uglyNumber[num-1];
	return 0;
}
