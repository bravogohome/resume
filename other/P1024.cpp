/*
*��ֻ����������2��3��5��������������Ugly Number��������6��8���ǳ�������14���ǣ���Ϊ������������7�� ϰ�������ǰ�1�����ǵ�һ�����������������ȶ���������n��������ʲô��
*���磺
*n=5�����5����ʾ��5��������5
*n=7�����8����ʾ��7��������8
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
    int p2 = 0, p3 = 0, p5 = 0;//����ָ�� 
    int uglyNumber[num];
    uglyNumber[0] = 1;
    for (int i = 1; i < num; i++) {
    	uglyNumber[i] = getMin(uglyNumber[p2]*2,uglyNumber[p3]*3,uglyNumber[p5]*5);//��ǰ��С������ 
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
