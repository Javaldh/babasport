package ldh.core.controller.admin;

import java.util.List;

import ldh.core.bean.product.Brand;
import ldh.core.query.BrandQuery;
import ldh.core.query.ProductQuery;
import ldh.core.service.product.BrandService;
import ldh.core.service.product.ProductService;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.common.page.Pagination;

/**
 * 商品管理 商品添加 商品上下架
 * 
 * @author ldh
 * 
 * @date 2017-2-7 下午8:07:50
 */
@Controller
public class ProductController {

	@Autowired
	private BrandService brandService;
	@Autowired
	private ProductService productService;

	// 商品列表
	@RequestMapping(value = "/product/list.do")
	public String list(Integer pageNo, String name, Integer brandid,
			Integer isShow, ModelMap model) {
		// 加载品牌；
		BrandQuery brandQuery = new BrandQuery();

		// 设置查询条件；
		brandQuery.setFields("id,name");
		List<Brand> brands = brandService.getBrandList(brandQuery);

		// 返回到页面；
		model.addAttribute("brands", brands);

		// 分页参数；
		StringBuffer params = new StringBuffer();

		// 商品对象；
		ProductQuery productQuery = new ProductQuery();
		// 判断条件是否为空；
		if (StringUtils.isNotBlank(name)) {
			productQuery.setName(name);

			// 添加参数；
			params.append("&name=").append(name);
			
			//model到前台；
			model.addAttribute("name",name);
			
			// 模糊查询开启；
			productQuery.setNameLike(true);
		}
		// 判断品牌ID；
		if (null != brandid) {
			productQuery.setBrandId(brandid);
			
			// 添加参数；
			params.append("&brandid=").append(brandid);
			
			//回显查询条件
			model.addAttribute("brandid", brandid);
		}
		// 判断上下架；
		if (null != isShow) {
			productQuery.setIsShow(isShow);
			
			// 添加参数；
			params.append("&isShow=").append(isShow);
			
			//回显查询条件
			model.addAttribute("isShow", isShow);
		} else {
			productQuery.setIsShow(0);
			
			// 添加参数；
			params.append("&isShow=").append(0);
			
			//回显查询条件
			model.addAttribute("isShow", 0);
		}
		
		//设置分页页号；
		productQuery.setPageNo(Pagination.cpn(pageNo));
		
		//设置每页数；
		productQuery.setPageSize(5);
		
		//加载带分页的商品；
		Pagination pagination = productService.getProductListWithPage(productQuery);
		
		//分页页面展示；
		String url = "/product/list.do";
		pagination.pageView(url, params.toString());
		
		//model到前台；
		model.addAttribute("pagination", pagination);
		
		return "product/list";
	}
}
