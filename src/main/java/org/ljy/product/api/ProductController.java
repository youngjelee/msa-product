package org.ljy.product.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/products")
public class ProductController {

    // 전체 주문 목록 조회
    @GetMapping
    public ResponseEntity<List<String>> getProducts() {
        return ResponseEntity.ok(List.of("Laptop", "Phone", "Tablet"));
    }

    // 단일 주문 조회
    @GetMapping("/{productId}")
    public ResponseEntity<Map<String, String>> getOrder(@PathVariable String productId) {
        return ResponseEntity.ok(Map.of(
                "productId", productId
                , "name", "desk"
                ,"size" , "30"
                , "seller","123456"
        ));
    }

}