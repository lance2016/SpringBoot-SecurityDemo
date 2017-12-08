package com.lance.dao;

import com.lance.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by sang on 2017/1/10.
 */
public interface SysUserRepository extends JpaRepository<SysUser, Long> {
    SysUser findByUsername(String username);
}
