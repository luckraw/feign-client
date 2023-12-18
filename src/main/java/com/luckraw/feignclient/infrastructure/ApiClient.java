package com.luckraw.feignclient.infrastructure;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "api-client", url = "${api-client.url:#{null}}")
public interface ApiClient {
}
