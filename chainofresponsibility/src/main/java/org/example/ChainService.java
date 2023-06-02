package org.example;

import org.example.domain.CustomerSupportRequest;
import org.example.handler.FirstPriorityHandler;
import org.example.handler.HelpDeskHandler;
import org.example.handler.SecondPriorityHandler;
import org.example.handler.ShrekNameHandler;

public class ChainService {
    private HelpDeskHandler helpDeskHandler;

    public ChainService() {
        helpDeskHandler = new FirstPriorityHandler();
        helpDeskHandler.setNext(new SecondPriorityHandler())
                .setNext(new ShrekNameHandler());
    }

    public void sendMessage(CustomerSupportRequest customerSupportRequest) {
        helpDeskHandler.handleRequest(customerSupportRequest);
    }
}
