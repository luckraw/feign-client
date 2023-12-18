package com.luckraw.feignclient.infrastructure;

import com.luckraw.feignclient.apiv1.dto.ProductsDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "api-client", url = "${api-client.url:#{null}}")
public interface ApiClient {

    @GetMapping("/products")
    public List<ProductsDTO> buscarProdutos();
}
