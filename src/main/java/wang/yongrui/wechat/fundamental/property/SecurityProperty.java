/**
 * 
 */
package wang.yongrui.wechat.fundamental.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import lombok.Getter;

/**
 * @author Wang Yongrui
 *
 */
@Configuration
@ConfigurationProperties
@PropertySource({ "classpath:security.properties" })
@Getter
public class SecurityProperty {

	@Value("${security.forWeChat}")
	private boolean forWeChat;

}
