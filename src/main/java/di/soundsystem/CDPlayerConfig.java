package di.soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 利用@ComponentScan开启组件扫描<br>
 * 不加任何配置，@ComponentScan默认扫描配置类相同的包<br>
 * XML配置利用<context:component-scan base-package="soundsystem">标签配置
 * @author Rebecca 2018年4月2日 上午6:31:59
 * @version 1.0
 */
@Configuration
@ComponentScan
public class CDPlayerConfig {
}
