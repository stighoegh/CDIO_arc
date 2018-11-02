package entity;


public class MatadorRafleBaegerAutoTest extends MatadorRafleBaeger{
	int index;
	public MatadorRafleBaegerAutoTest(int index) {
		super();
		this.index = index;
	}
	public void rollDice()	{
		
		
		int[][] data = {{5,5},{5,6},{6,6},{1,2},{3,1},{1,2},{1,2},{2,1},{3,3}};
		terning1= data[index][0];
		terning2= data[index][1];
		index=++index % data.length;
		//System.out.println(index);
		//int[] data = {1,2,3,4,5,6};
//		int[] data = {5,5,
//					  6,6,
//					  6,6,
//					  1,2,
//					  3,1,
//					  1,2,
//					  1,2,
//					  2,1,
//					  3,3};
//		terning1 = data[index++ % data.length];
//		terning2 = data[index++ % data.length];
	}
}
