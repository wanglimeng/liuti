package com.gaoyuan.liuti;

import com.gaoyuan.liuti.entity.SysUser;
import com.gaoyuan.liuti.service.ISysUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LiutiApplicationTests {


	@Autowired
	ISysUserService iSysUserService;

	@Test
	public void contextLoads() {

		SysUser sysUser = iSysUserService.findRoleAndPerByUsername("wlm");

		System.out.println(sysUser);

	}

}
