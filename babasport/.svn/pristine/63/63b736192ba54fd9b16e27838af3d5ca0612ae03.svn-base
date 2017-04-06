package ldh;

import java.util.List;

import ldh.common.junit.SpringJunitTest;
import ldh.core.bean.product.Brand;
import ldh.core.query.BrandQuery;
import ldh.core.service.product.BrandService;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 测试品牌
 * @author ldh
 *
 * @date 2017-1-23 下午11:31:22
 */

public class TestTestTb extends SpringJunitTest{
	@Autowired
	private BrandService brandService;
	@Test
	public void testGetBrand() throws Exception {
		BrandQuery brandQuery = new BrandQuery();
		//brandQuery.setFields("id");
		//brandQuery.setNamelike(true);
		//brandQuery.setName("丹");
		brandQuery.orderById(false);
		brandQuery.setPageNo(2);
		brandQuery.setPageSize(7);
		List<Brand> brands = brandService.getBrandList(brandQuery);
		for (Brand b:brands) {
			System.out.println(b);
		}
	}
}
