package org.example.handler;

import org.example.domain.CustomerSupportRequest;

public class ShrekNameHandler extends HelpDeskHandler {
    @Override
    public void handleRequest(CustomerSupportRequest customerSupportRequest) {
        if (isShrekName(customerSupportRequest)) {
            System.out.println("Shrek name was handled");
        }
        handleNext(customerSupportRequest);
    }

    private boolean isShrekName(CustomerSupportRequest customerSupportRequest) {
        return customerSupportRequest.getName().equalsIgnoreCase("shrek");
    }
}
