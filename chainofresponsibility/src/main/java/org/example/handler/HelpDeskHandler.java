package org.example.handler;

import org.example.domain.CustomerSupportRequest;

import java.util.Objects;

public abstract class HelpDeskHandler {
    private HelpDeskHandler nextHelpDeskHandler;
    public abstract void handleRequest(CustomerSupportRequest customerSupportRequest);
    protected void handleNext(CustomerSupportRequest customerSupportRequest){
        if(Objects.nonNull(nextHelpDeskHandler)){
           nextHelpDeskHandler.handleRequest(customerSupportRequest);
        }
    }
    public HelpDeskHandler setNext(HelpDeskHandler helpDeskHandler){
        this.nextHelpDeskHandler=helpDeskHandler;
        return helpDeskHandler;
    }
}
