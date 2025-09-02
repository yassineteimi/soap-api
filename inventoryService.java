package com.example.inventory;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Service Endpoint Interface (SEI) for InventoryService.
 */
@WebService(
    targetNamespace = "http://inventory.example.com/", 
    name = "InventoryService"
)
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL)
public interface InventoryService {
    /** 
     * Sample operation to check inventory quantity for an item. 
     */
    @WebMethod
    int getInventoryQuantity(String itemId);
}