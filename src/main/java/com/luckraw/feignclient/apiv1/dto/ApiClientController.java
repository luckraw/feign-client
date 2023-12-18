package com.luckraw.feignclient.apiv1.dto;

import com.luckraw.feignclient.business.ApiClientService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produtos")
@RequiredArgsConstructor
@Tag(name = "api-client")
public class ApiClientController {

    private final ApiClientService apiClientService;

    @Operation(summary = "Retorna uma lista de produtos", method = "GET")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Busca realizada com sucesso"),
            @ApiResponse(responseCode = "500", description = "Erro ao realizar a busca dos dados")
    })
    @GetMapping
    public ResponseEntity<List<ProductsDTO>> buscarProdutos() {
        return ResponseEntity.ok(apiClientService.buscarProdutos());
    }
}
