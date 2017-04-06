package ldh.core.dao.product;

import java.util.List;

import ldh.core.bean.product.Brand;
import ldh.core.query.BrandQuery;

public interface BrandDao {

	// List limit0 5集合
	public List<Brand> getBrandListWithPage(Brand brand);

	// List limit0 5集合
	public List<Brand> getBrandList(BrandQuery brandQuery);

	// 查询总记录数
	public int getBrandCount(Brand brand);

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
