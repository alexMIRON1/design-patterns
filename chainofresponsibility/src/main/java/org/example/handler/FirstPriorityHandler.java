package org.example.handler;

import org.example.domain.CustomerSupportRequest;

public class FirstPriorityHandler extends HelpDeskHandler{
    @Override
    public void handleRequest(CustomerSupportRequest customerSupportRequest) {
        if(isFirstPriority(customerSupportRequest)){
            System.out.println("First priority was handled");
        }
        handleNext(customerSupportRequest);
    }
    private boolean isFirstPriority(CustomerSupportRequest customerSupportRequest){
        return customerSupportRequest.getPriority()==1;
    }
}
