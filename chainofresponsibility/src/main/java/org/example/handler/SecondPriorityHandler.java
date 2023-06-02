package org.example.handler;

import org.example.domain.CustomerSupportRequest;

public class SecondPriorityHandler extends HelpDeskHandler {

    @Override
    public void handleRequest(CustomerSupportRequest customerSupportRequest) {
        if (isSecondPriority(customerSupportRequest)) {
            System.out.println("Second priority was handled");
        }
        handleNext(customerSupportRequest);
    }

    private boolean isSecondPriority(CustomerSupportRequest customerSupportRequest) {
        return customerSupportRequest.getPriority() == 2;
    }
}
