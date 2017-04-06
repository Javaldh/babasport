package ldh;

import java.util.Date;

import ldh.common.junit.SpringJunitTest;
import ldh.core.bean.TestTb;
import ldh.core.service.TestTbService;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * junit测试
 * @author ldh
 *
 * @date 2017-1-23 下午11:31:22
 */

public class TestBrand extends SpringJunitTest{
	@Autowired
	private TestTbService testTbService;
	@Test
	public void testAdd() throws Exception {
		
	TestTb testTb = new TestTb();
		testTb.setName("李文杰");
		testTb.setBirthday(new Date());
		testTbService.addTestTb(testTb);
	}
}
