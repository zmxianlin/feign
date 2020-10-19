package org.cjy.client;
 
import org.cjy.common.entity.RestfulResult;
import org.springframework.stereotype.Component;
import org.cjy.entity.ServiceInfo;
 
@Component
public class ServiceFallback implements ServiceFeignClient{
 
    public RestfulResult hello(ServiceInfo serviceInfo) {
        RestfulResult result = new RestfulResult();
        result.setData("服务调用失败");
        return result;
    }
}