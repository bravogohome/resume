//�ȶ��ܺ����������ǣ�����Ϊn��ȥҰ��¶Ӫ���ܿ�����ˣ�������Ҫ��һ���ţ��ź�խ��ÿ�������������ͨ������������ֻ��1���ֵ�Ͳ������ÿ�ι����ţ���Ҫ���˴����ֵ�Ͳ�����i��С���ѵĹ���ʱ��ΪT[i]�����˹��ŵ�ʱ��Ϊ��ʱ��ߣ��������˹��ŵ���̺�ʱ�Ƕ��٣� ����nΪ10��������ÿ���˵ĺ�ʱΪ��{1, 2, 5, 10, 12, 23, 43, 50, 120, 122}
//���룺1<=n<=10����ʾǰn���˽��й���
//�����ǰn���˵���̺�ʱ

package com.demo.pak1;

import java.util.Scanner;

public class P1015 {
	static class Demo{
		int[] times= {1, 2, 5, 10, 12, 23, 43, 50, 120, 122};
		int allTime=0;
		int notCount;//δ��������
		int throughCount=0;//���Ŵ���
		int maxTag;
		public int through() {
			if(notCount<=2) {
				allTime+=times[maxTag];
			}else {
				if(throughCount%2==0) {
					allTime+=3;
				}else{
					allTime+=(times[maxTag]+2);
					maxTag-=2;
				}
				throughCount++;
				notCount--;
				through();
			}
			return allTime;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scanner=new Scanner(System.in);
			Demo demo=new Demo();
			demo.notCount=scanner.nextInt();
			demo.maxTag=demo.notCount-1;
			System.out.println(demo.through());
		
	}

}
