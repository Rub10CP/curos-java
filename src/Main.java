import java.util.Locale;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		//System.out.println("Obrigado Senhor por tudo, com fé em Ti, vamos consegir vencer e curar meu pai, Amém!");
		//System.out.print("Bom dia!");
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);// muda a , por . na variavel
		System.out.println("Digite o dia da semana");
		
		int x = sc.nextInt();
		String dia;
		
		switch (x) { // sintaxe opcional switch case
		case 1:
		  dia = "domingo";
		  break;
		case 2:
		  dia = "segunda";
		  break;
		case 3:
		  dia = "terça";
		  break;
		case 4:
		  dia = "Quarta";
		  break;
		case 5:
		  dia = "quinta";
		  break;
		case 6:
		   dia = "sexta";
		   break;
		case 7:
		   dia = "sabado";
		   break;
		default:
			dia = "invalido";
			break;
		   
		}
		
		System.out.println(" o dia da semana é " + dia);
		
		//int minutos = sc.nextInt();
		//System.out.println("Os minutos é " + minutos);
		//double conta = 50.0;
		
		//if ( minutos > 100) {
			//conta += ( minutos - 100) * 2.0;// sintaxe opcional -  operadores cumulativos em java
		//}
		//System.out.printf("O valor a ser pago é de %.2f%n", conta);
		
		
		//int hora;
		
		//System.out.println("Que horas são? ");
		//hora = sc.nextInt();
		
		//if (hora <= 12) { // condições compostas é um encadeamento
			
			//System.out.print("bom dia");
		//}
		//else if (hora <= 18) {
		//		System.out.print("boa tarde");
		//}
			//else {
				//System.out.print("boa noite");
			//}
		
		//int hora;
		
		//System.out.println("Que horas são? ");
		//hora = sc.nextInt();
		
		//if (hora < 12) {
			//System.out.print("bom dia");
		//}
		//else { // condição composta 
			//System.out.print("boa tarde");
		//}
		
		
		//int x = 5;
		
		//System.out.println("Bom dia");
		
		//if (x < 3) {
			//System.out.println("Boa tarde"); // condição simples
			
		//}
		//System .out.println("Boa noite");
		
		//double x, y, soma;
		
		//x = sc.nextDouble();
		//y = sc.nextDouble();
		
		//soma = x + y;
		//System.out.printf(" O valor de x é: %.2f%n",  x); // Escreve com virgula e depois o resultado si com ponto (.)
		//System.out.printf(" o valor de y é %.2f%n ",  y);
		//System .out.printf(" O valor da soma é de : %.2f%n", soma);
		
		//int x;
		//String s1, s2, s3;
		
		//x = sc.nextInt();
		//sc.nextLine();//Serve para recuperar uma linha
		//s1 = sc.nextLine();
		//s2 = sc.nextLine();
		//s3 = sc.nextLine();
		
		//System.out.println("Entrada de dados");
		//System.out.println(x);
		//System.out.println(s1);
		//System.out.println(s2);
		//System.out.println(s3);
		sc.close();
		//int a, b;
		//double resultado;
		//a = 5;
		//b = 2;
		//resultado = (double) a / b;
		//System.out.println(resultado); quanto a variavel é em inteiro e se torna double
		
		//int x, y;
		//double b, B, h, area;
		//b = 6.0;
		//B = 8.0;
		//h = 5.0;
		
		//area = (b + B)/2.0*h;
		//System.out.println(area);
		//x = 5;
		//y = x * 2;
		//System.out.println(x);
		//System.out.print(y);
		//String product1 = "Computer";
		//String product2 = "Office desk";
		
		//int age = 30;
		//int code = 5290;
		//char gender = 'f';
		
		//double price1 = 2100.0;
		//double price2 = 650.50;
		//double price3 = 53.234567;
		
		//System.out.println("Products:");
		//System.out.printf("%s, witch price is $ %.2f%n", product1, price1);
		//System.out.printf("%s, witch price is $ %.2f%n", product2, price2);
		//System.out.println("-------------------------------------------");
		//System.out.printf("Records: %d years old, code %d and gender: %s%n " , age, code, gender);
		//System.out.println("--------------------------------------------------------------");
		//System.out.printf("Measue with eight places: %.6f%n", price3);
		//System.out.printf("Rouled (three decimal places): %.2f%n", price3);
		//System.out.printf("US decimal point: %.3f%n", price3);
	//	int y = 32;
	//	double x = 10.35789;
	//	String nome = "Rubio";
	//	int idade = 24;
	//	double renda = 1300.0;
	//	System.out.println(x);
	//	System.out.printf("%.2f%n", x);
	//	System.out.printf("%.4f%n", x);
	//	System.out.printf("%.3f%n",x);
	//	System.out.println(y);
	//	System.out.println("RESULTADO = " + y + " METROS");//Concatenação
	//	System.out.printf("Resultado = %.2f metros%n", x);// Concatenação
	//	System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n ", nome, idade, renda);
	    }	
	}


