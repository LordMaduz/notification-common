package com.admin.notification.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@FeignClient(name = "mjml-server", url = "${feign.client.url}" )
public interface MJMLFeignClient {


    @PostMapping(value = "/v1/render")
    public Map<String, Object> render(Map<String, String> objectNode);
}



