/**
 * 
 */
package wang.yongrui.wechat.fundamental.entity.persistence;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;
import wang.yongrui.wechat.fundamental.entity.basic.ExtendedInfoBasic;

/**
 * @author Wang Yongrui
 *
 */
@Entity(name = "EXTENDED_INFO")
@Getter
@Setter
public class ExtendedInfoEntity extends ExtendedInfoBasic {

}
