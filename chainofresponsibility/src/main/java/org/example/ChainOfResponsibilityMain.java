package org.example;


import org.example.domain.CustomerSupportRequest;

import java.util.Scanner;

public class ChainOfResponsibilityMain {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("What is name of your problem? ");
        String nameProblem = input.nextLine();
        System.out.println("\nWhat is the description of your problem? ");
        String descriptionProblem = input.nextLine();
        System.out.println("\nHow can you  rate urgency of you problem?(from 1-10, where 1 is very urgent)? ");
        int priorityProblem = Integer.parseInt(input.nextLine());
        CustomerSupportRequest customerSupportRequest = new CustomerSupportRequest(nameProblem,
                descriptionProblem, priorityProblem);
        ChainService chainService = new ChainService();
        chainService.sendMessage(customerSupportRequest);
    }
}
