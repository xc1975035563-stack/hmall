package com.hmall.api.config;

import com.hmall.api.item.ItemClientFallbackFactory;
import org.springframework.context.annotation.Bean;

public class DefaultFeignConfig {

    @Bean
    public ItemClientFallbackFactory itemClientFallbackFactory() {
        return new ItemClientFallbackFactory();
    }
}
