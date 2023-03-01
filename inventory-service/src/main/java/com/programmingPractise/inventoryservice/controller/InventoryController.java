package com.programmingPractise.inventoryservice.controller;

import com.programmingPractise.inventoryservice.dto.InventoryResponse;
import com.programmingPractise.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    //Pathvariable example: http://localhost:8082/inventory/iphone-13,iphone13-red
    //
    //RequestParam example: http://localhost:8082/inventory?skuCode=iphone-13&skuCode=iphone13-red




    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> isInStock(@RequestParam List<String> skuCode){
        return inventoryService.isInStock(skuCode);
    }
}
