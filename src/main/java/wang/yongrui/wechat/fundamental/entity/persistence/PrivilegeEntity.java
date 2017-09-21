/**
 * 
 */
package wang.yongrui.wechat.fundamental.entity.persistence;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.Getter;
import lombok.Setter;
import wang.yongrui.wechat.fundamental.entity.basic.PrivilegeBasic;

/**
 * @author Wang Yongrui
 *
 */
@Entity(name = "PRIVILEGE")
@Getter
@Setter
public class PrivilegeEntity extends PrivilegeBasic {

	@ManyToMany
	@JoinTable(name = "ROLE_PRIVILEGE", joinColumns = { @JoinColumn(name = "privilege_id") }, inverseJoinColumns = {
			@JoinColumn(name = "role_id") })
	private Set<RoleEntity> roleEntitySet;

}
