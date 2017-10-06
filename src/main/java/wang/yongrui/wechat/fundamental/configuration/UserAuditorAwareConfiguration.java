/**
 * 
 */
package wang.yongrui.wechat.fundamental.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;

/**
 * @author Wang Yongrui
 *
 */
@Configuration
public class UserAuditorAwareConfiguration implements AuditorAware<String> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.data.domain.AuditorAware#getCurrentAuditor()
	 */
	@Override
	public String getCurrentAuditor() {
		SecurityContext context = SecurityContextHolder.getContext();
		String auditorUserName = null;
		if (null != context && null != context.getAuthentication() && null != context.getAuthentication().getPrincipal()
				&& !"anonymousUser".equals(context.getAuthentication().getPrincipal())) {
			auditorUserName = ((User) context.getAuthentication().getPrincipal()).getUsername();
		}

		return auditorUserName;
	}

}
