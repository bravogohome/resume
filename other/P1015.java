//度度熊和他的朋友们（人数为n）去野外露营，很快天黑了，他们需要过一座桥，桥很窄，每次最多允许两人通过，但是他们只有1个手电筒，所以每次过完桥，需要有人带回手电筒，设第i号小朋友的过桥时间为T[i]，两人过桥的时间为耗时最长者，问所有人过桥的最短耗时是多少？ 假设n为10，且他们每个人的耗时为：{1, 2, 5, 10, 12, 23, 43, 50, 120, 122}
//输入：1<=n<=10，表示前n个人进行过桥
//输出：前n个人的最短耗时

package com.demo.pak1;

import java.util.Scanner;

public class P1015 {
	static class Demo{
		int[] times= {1, 2, 5, 10, 12, 23, 43, 50, 120, 122};
		int allTime=0;
		int notCount;//未过桥人数
		int throughCount=0;//过桥次数
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
