package com.mf;

public class TestFor13{
	public static void main(String[] args){
		/*
		长方形：
		*********
		*********
		*********
		*********
		*/
		for(int j=1;j<=4;j++){//j:控制行数
		    //加入空格：
			for(int i =1;i<=5;i++){//i:控制空格的个数
		      System.out.print(" ");//空格
				
			}
			//*********
			for(int i =1;i<=9;i++){//i:控制*的个数
			System.out.print("*");
		    }
			//换行：
			System.out.println();
		}
		 System.out.println("------分界线------");
		/*
		|平行四边形：
		|   ********* 第一行，空3个格   1+3=4---->4-行数（j）=空格数
		|  *********  第二行，空2个格   2+2=4
		| *********   第三行，空1个格   3+1=4
		|*********    第四行，空0个格   4+0=4
		*/
		for(int j=1;j<=4;j++){//j:控制行数
		    //加入空格：
			for(int i =1;i<=(4-j);i++){//i:控制空格的个数
		      System.out.print(" ");//空格
				
			}
			//*********
			for(int i =1;i<=9;i++){//i:控制*的个数
			System.out.print("*");
		    }
			//换行：
			System.out.println();
		}
		System.out.println("------分界线------");
		/*
		|三角形：
		|   *      第1行：1个*   1（行数j）*2-1=1（*个数）
		|  ***     第2行：3个*   2*2-1=3
		| *****    第3行：5个*   3*2-1=5
		|*******   第4行：7个*   4*2-1=7
		*/
		for(int j=1;j<=4;j++){//j:控制行数
		    //加入空格：
			for(int i =1;i<=(4-j);i++){//i:控制空格的个数
		      System.out.print(" ");//空格
				
			}
			//*********
			for(int i =1;i<=(j*2-1);i++){//i:控制*的个数
			System.out.print("*");
		    }
			//换行：
			System.out.println();
		}
		System.out.println("------分界线------");
		/*
		|菱形：//上三角形
		|   *      第1行：1个*   1（行数j）*2-1=1（*个数）
		|  ***     第2行：3个*   2*2-1=3
		| *****    第3行：5个*   3*2-1=5
		|*******   第4行：7个*   4*2-1=7		          
		| ***** //下三角形
		|  ***
		|   *
		*/
		//上三角形：
		for(int j=1;j<=4;j++){//j:控制行数
		    //加入空格：
			for(int i =1;i<=(4-j);i++){//i:控制空格的个数
		      System.out.print(" ");//空格
				
			}
			//*********
			for(int i =1;i<=(j*2-1);i++){//i:控制*的个数
			System.out.print("*");
		    }
			//换行：
			System.out.println();
		}
		/*下三角形：
		| *****    第1行：空1格（行数等于格数）；5颗星
		|  ***     第2行：空2格；3颗星  （行数*2+星数=7）
		|   *      第3行：空3格；1颗星   
		*/
		for(int j=1;j<=3;j++){//j:控制行数
		    //加入空格：
			for(int i =1;i<=j;i++){//i:控制空格的个数
		      System.out.print(" ");//空格
				
			}
			//*********
			for(int i =1;i<=(7-j*2);i++){//i:控制*的个数
			System.out.print("*");
		    }
			//换行：
			System.out.println();
		}
		System.out.println("------分界线------");
			/*
		|空心菱形：//上三角形
		|   *      行数不变；空格不变
		|  * *     
		| *   *    
		|*     *             
		| *   * //下三角形
		|  * *
		|   *
		*/
		//上三角形：
		for(int j=1;j<=4;j++){//j:控制行数
		    //加入空格：
			for(int i =1;i<=(4-j);i++){//i:控制空格的个数
		      System.out.print(" ");//空格
				
			}
			//*********
			for(int i =1;i<=(j*2-1);i++){//i:控制*的个数
			     if(i==1|i==(j*2-1)){
					 System.out.print("*");
				 }else{
					 System.out.print(" ");
				 }
				 
		    }
			//换行：
			System.out.println();
		}
		/*下三角形：  
		*/
		for(int j=1;j<=3;j++){//j:控制行数
		    //加入空格：
			for(int i =1;i<=j;i++){//i:控制空格的个数
		      System.out.print(" ");//空格
				
			}
			//*********
			for(int i =1;i<=(7-j*2);i++){//i:控制*的个数
			  if(i==1|i==(7-j*2)){
				  System.out.print("*");
			  }else{
				  System.out.print(" ");
			  }
		    }
			//换行：
			System.out.println();
		}		
	}
}