package org.cjy.client;

import org.cjy.common.entity.RestfulResult;
import org.cjy.entity.ServiceInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(value = "springcloudservice", fallback=ServiceFallback.class) //这里的value对应调用服务的spring.applicatoin.name
public interface ServiceFeignClient {
 
    @RequestMapping(value = "/service/hello")
    RestfulResult hello(@RequestBody ServiceInfo serviceInfo);
 
}