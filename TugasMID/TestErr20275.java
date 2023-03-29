//Putri Aulia Arif 13020210275

public class TestErr20275 {

    public static void main(String[] args) {
		int j = 0;
		int tot = 0;
		for(int i=0; i<10;i++) {
		tot += i;
		if(i<j) {
			System.out.println(i);
		}else
			System.out.println(j);
		do{
			j++;
			}while(j<10);
		}
		
	}
}