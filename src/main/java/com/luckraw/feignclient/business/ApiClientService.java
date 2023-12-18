package com.luckraw.feignclient.business;

import com.luckraw.feignclient.apiv1.dto.ProductsDTO;
import com.luckraw.feignclient.infrastructure.ApiClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ApiClientService {

    private final ApiClient apiClient;

    public List<ProductsDTO> buscarProdutos() {
        return apiClient.buscarProdutos();
    }
}
