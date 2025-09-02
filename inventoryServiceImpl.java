package com.example.inventory;

import javax.jws.WebService;

/**
 * Implementation of the InventoryService interface.
 */
@WebService(
    endpointInterface = "com.example.inventory.InventoryService",
    targetNamespace   = "http://inventory.example.com/",
    serviceName       = "InventoryService"
)
public class InventoryServiceImpl implements InventoryService {

    @Override
    public int getInventoryQuantity(String itemId) {
        // TODO: Insert real inventory lookup logic here.
        // For this example, return a dummy value.
        return 42; 
    }
}