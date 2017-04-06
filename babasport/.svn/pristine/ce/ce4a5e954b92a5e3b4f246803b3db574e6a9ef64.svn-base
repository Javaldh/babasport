package ldh.core.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ldh.common.junit.SpringJunitTest;
import ldh.core.bean.TestTb;
import ldh.core.dao.TestTbDao;

@Service
@Transactional
public class TestTbServiceImpl extends SpringJunitTest implements TestTbService {

	@Resource
	private TestTbDao testTbDao;

	@Override

	public void addTestTb(TestTb testTb) {
		
		testTbDao.addTestTb(testTb);

		

	}

}
