package TemperatureTranslate;

import java.util.Scanner;

public class Program {

	private static double TemperatureTranslate;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Введите температуру");
		double temperatureTranslate = scanner.nextDouble();
		
		System.out.println("Выберите шкалу ввода: ");
		System.out.println("1. Цельсия");
		System.out.println("2. Фаренгейта");
		System.out.println("3. Кельвина");
		int scale = scanner.nextInt();
		
		switch (scale) {
		
		case 1: //Если выбрана шкала Цельсия
			System.out.printf("Температура в Фаренгейтах: %.2f/n", CtoF(TemperatureTranslate));
			System.out.printf("Температура в Кельвинах: %.2f/n", CtoK(TemperatureTranslate));
		break;
		
		case 2: //Если выбрана шкала Фаренгейта
			System.out.printf("Температура в Цельсии: %.2f/n", FtoC(TemperatureTranslate));
			System.out.printf("Температура в Кельвинах: %.2f/n", FtoK(TemperatureTranslate));
		break;
		
		case 3: //Если выбрана шкала Кельвина
			System.out.printf("Температура в Цельсии: %.2f/n", KtoC(TemperatureTranslate));
			System.out.printf("Температура в Фаренгейтах: %.2f/n", KtoF(TemperatureTranslate));
		break;
		
		default: 
			System.out.println("Некорректный ввод, выберите 1, 2 или 3.");
		break;
		
		}
		
		scanner.close();
		
	}
	
	public static double CtoF(double C) {
		return (C * 9 / 5) + 32;
	}
	
	public static double FtoC(double F) {
		return (F - 32) * 5 / 9;
	}
	
	public static double CtoK(double C) {
		return C + 273.15;
	}
	
	public static double KtoC(double K) {
		return K - 273.15;
	}
	
	public static double FtoK(double F) {
		return (F - 32) * 5 / 9 + 273.15;
	}
	
	public static double KtoF(double K) {
		return (K - 273.15) * 9 / 5 + 32;
	}

}
