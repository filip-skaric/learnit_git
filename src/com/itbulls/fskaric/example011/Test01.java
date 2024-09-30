package com.itbulls.fskaric.example011;

import java.io.Console;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		System.out.println("koju transackiju zelis: \r\n "
				+ "MONEY_TRANSFER_SEND,\r\n "
				+ "MONEY_TRANSFER_RECEIVE,\r\n "
				+ "WITHDRAW");
		
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		
		StandardAccountOperations sao = StandardAccountOperations.valueOf(name);
		switch (sao) {
		case MONEY_TRANSFER_RECEIVE:
			System.out.println("money transfer recieve");
			break;
		case MONEY_TRANSFER_SEND:
			System.out.println("money transfer send");
			break;
		case WITHDRAW:
			System.out.println("withdraw");
			break;
		default:
			System.out.println("wrong");
		
		
		}
		

	}
}
