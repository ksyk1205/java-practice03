package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;



	public static void main(String[] args) {
		Goods[] gArray = new Goods[COUNT_GOODS];

		Scanner scanner = new Scanner(System.in);


		for(int i=0; i <COUNT_GOODS;i++) {
			String info = scanner.nextLine();
			String[] str = info.split(" ");

			String name = str[0];
			int price = Integer.parseInt(str[1]);
			int countStock = Integer.parseInt(str[2]);
			
			gArray[i] =new Goods(name,price,countStock);

		}
		
		for(int j=0; j<COUNT_GOODS;j++) {
			String name = gArray[j].getName();
			int price = gArray[j].getPrice();
			int countStock = gArray[j].getCountStock();
			System.out.println(name+"(가격:"+price+"원 ) 이 "+countStock+" 개 입고 되었습니다.");
		}
		scanner.close();
	}
}
