package di.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import di.soundsystem.CDPlayer;

/**
 * 利用@ComponentScan开启组件扫描<br>
 * 不加任何配置，@ComponentScan默认扫描配置类相同的包<br>
 * XML配置利用<context:component-scan base-package="soundsystem">标签配置<br>
 * 利用@ComponentScan的basePackages属性可设置扫描包的数组，但重构代码时工作量大，
 *     建议采用basePackageClasses属性设置扫描包的数组，CDPlayer可以只是为了扫包而新建的类
 * @author Rebecca 2018年4月2日 上午6:31:59
 * @version 1.0
 */
@Configuration
@ComponentScan(basePackageClasses = {CDPlayer.class})
//@ComponentScan(basePackages = { "di.soundsystem", "video" })
public class CDPlayerConfig {
}
