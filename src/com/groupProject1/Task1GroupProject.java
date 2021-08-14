package com.groupProject1;

public class Task1GroupProject {

	public static void main(String[] args) {
		
		int [][] a= {
				{10,20,30},
				{1,3,2}
		};
				
				int []array=new int[2];
				int sum=0;
				for(int i=0; i<a.length; i++ ) {
					for(int j=0; j<a[i].length;j++){
						sum=sum+a[i][j];
						
					}
				}
		
				System.out.println(sum);

	}

}
