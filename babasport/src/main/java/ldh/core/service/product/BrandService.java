package ldh.core.service.product;

import java.util.List;

import ldh.core.bean.product.Brand;
import ldh.core.query.BrandQuery;
import cn.itcast.common.page.Pagination;

public interface BrandService {
	// List集合
	public Pagination getBrandListWithPage(Brand brand);
	
	//List集合
	public List<Brand> getBrandList(BrandQuery brandQuery);

	// 添加品牌
	public void addBrand(Brand brand);

	// 单个删除
	public void deleteBrandByKey(Integer id);

	// 批量删除
	public void deleteBrandByKeys(Integer[] ids);

	// 修改
	public void updateBrandByKey(Brand brand);

	// 通过ID查询单个品牌
	public Brand getBrandByKey(Integer id);
}
