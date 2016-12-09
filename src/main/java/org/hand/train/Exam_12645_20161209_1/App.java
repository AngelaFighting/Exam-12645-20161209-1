package org.hand.train.Exam_12645_20161209_1;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{

	/**
	 * 求min到n之间的所有素数
	 * @param min 起始数
	 * @param n 结束数
	 * @return List
	 */
    public static List<Integer> getPrime(int min,int n){
    	List<Integer> list=new ArrayList<Integer>();
        boolean[] primes = new boolean[n + 1]; 
        //初始化primes数组
        for (int i = 0; i <=n; i++) {
            primes[i] = true; 
        }
        for (int k = 2; k <= n / k; k++) {
            if (primes[k]) {//是素数
                for (int i = k; i <= n / k; i++) {
                    primes[k * i] = false; // k * i 不是素数
                }
            }
        }
        for (int i = 2; i <=n; i++) {
        	if(primes[i]&&i>=min){
        		list.add(i);//添加大于min小于n的素数到List
        	}
        }
        return list;
    }
	
    public static void main( String[] args )
    {
    	List<Integer> list=getPrime(101,200);
    	int size=list.size();
        System.out.print( "101-200间总共有"+size
        +"个素数，分别是：");
        for(int i=0;i<size-1;i++)
        	System.out.print(list.get(i)+",");
        System.out.println(list.get(size-1));
    }
}
