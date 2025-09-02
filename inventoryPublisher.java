package com.example.inventory;

import javax.xml.ws.Endpoint;

/**
 * Publishes the InventoryService at http://0.0.0.0:8081/InventoryRequest.
 */
public class InventoryPublisher {

    public static void main(String[] args) {
        String url = "http://0.0.0.0:8081/InventoryRequest";
        System.out.println("Publishing InventoryService at " + url);
        Endpoint.publish(url, new InventoryServiceImpl());
        System.out.println("InventoryService is published and listening...");
        // The service will keep running. Terminate the JVM to stop the service.
    }
}