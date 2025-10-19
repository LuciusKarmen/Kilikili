package com.easylive.filter;

import com.easylive.entity.constants.Constants;
import com.easylive.entity.enums.ResponseCodeEnum;
import com.easylive.exception.BusinessException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Component
@Slf4j
public class GatewayGlobalRequestFilter implements GlobalFilter, Ordered {


    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        String rawpath = exchange.getRequest().getURI().getRawPath();
        if (rawpath.indexOf(Constants.INNER_API_PREFIX) != -1) {
            throw new BusinessException(ResponseCodeEnum.CODE_404);
        }
        log.info("这个是全局过滤器", rawpath);
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
