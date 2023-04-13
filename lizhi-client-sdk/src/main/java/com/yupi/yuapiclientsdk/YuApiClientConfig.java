package com.lizhi.yuapiclientsdk;

import com.lizhi.yuapiclientsdk.client.YuApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// 读取 application 配置
@ConfigurationProperties("yuapi.client")
@Data
@ComponentScan
public class YuApiClientConfig {

    private String accessKey;

    private String secretKey;

    @Bean
    public YuApiClient yuApiClient() {
        return new YuApiClient(accessKey, secretKey);
    }

}
