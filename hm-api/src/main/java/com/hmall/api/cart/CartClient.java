package com.hmall.api.cart;

import com.hmall.api.item.dto.OrderDetailDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.List;

@FeignClient(name = "cart-service", path = "/carts")
public interface CartClient {

    @DeleteMapping
    void removeByItemIds(@RequestParam("ids") Collection<Long> ids);

    @PutMapping("/deduct")
    void deductItems(@RequestBody List<OrderDetailDTO> items);
}
