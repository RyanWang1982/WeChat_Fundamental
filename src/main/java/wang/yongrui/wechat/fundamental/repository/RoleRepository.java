/**
 *
 */
package wang.yongrui.wechat.fundamental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import wang.yongrui.wechat.fundamental.entity.persistence.RoleEntity;

/**
 * @author Wang Yongrui
 *
 */
@Repository
public interface RoleRepository extends JpaRepository<RoleEntity, Long>, JpaSpecificationExecutor<RoleEntity> {

}
