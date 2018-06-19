package primeiro;

public class first {
public static void main(String [] args) {
	System.out.println(adicionar(1,36));
	System.out.println(adicionar(5.656,40.66));
	System.out.println(adicionar("hello","world"));
}
public static int adicionar (int a, int b) {
	return (a+b);
}
public static double adicionar (double a, double b) {
	return (a+b);
}
public static String adicionar (String a, String b) {
	return (a+b);
}
}//basicamente vc pode definir varios metodos para fazerem coisas diferentes ou algo do tipo
//sempre que definir metodos diferentes com mesmo nome usando a mesma logica mas que usam diferentes tipos de dados
