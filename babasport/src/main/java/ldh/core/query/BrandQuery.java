package ldh.core.query;

import java.util.ArrayList;
import java.util.List;

/**
 * 品牌查询
 * @author ldh
 *
 * @date 2017-2-7 下午3:33:54
 */
public class BrandQuery {

	private Integer id;
	private String name;
	private String description;
	private String imgUrl;
	private String webSite;
	private Integer sort;
	private Integer isDisplay;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getWebSite() {
		return webSite;
	}
	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	public Integer getIsDisplay() {
		return isDisplay;
	}
	public void setIsDisplay(Integer isDisplay) {
		this.isDisplay = isDisplay;
	}
	/**********************查询字段指定******************************/
	private String fields;
	public String getFields() {
		return fields;
	}
	public void setFields(String fields) {
		this.fields = fields;
	}
	/**********************查询字段指定******************************/
	private boolean namelike;
	public boolean isNamelike() {
		return namelike;
	}
	public void setNamelike(boolean namelike) {
		this.namelike = namelike;
	}
	@Override
	public String toString() {
		return "BrandQuery [id=" + id + ", name=" + name + ", description="
				+ description + ", imgUrl=" + imgUrl + ", webSite=" + webSite
				+ ", sort=" + sort + ", isDisplay=" + isDisplay + "]";
	}
	
	/**********************order by******************************/
	class FieldOrder{
		private String field;
		private String order;
		
		public String getField() {
			return field;
		}
		public void setField(String field) {
			this.field = field;
		}
		public String getOrder() {
			return order;
		}
		public void setOrder(String order) {
			this.order = order;
		}
		public FieldOrder(String field, String order) {
			super();
			this.field = field;
			this.order = order;
		}
		
	}
	//orderby集合
	private List<FieldOrder> fieldOrders = new ArrayList<FieldOrder>();
	
	//ID排序
	public void orderById(boolean isAsc){
		fieldOrders.add(new FieldOrder("id", isAsc==true?"asc":"desc"));
	}
	/**********************limit******************************/
	
		// 页号
		private Integer pageNo = 1;
		// 开始行
		private Integer startRow;
		// 每页数
		private Integer pageSize = 10;

		

		public Integer getPageNo() {
			return pageNo;
		}

		public void setPageNo(Integer pageNo) {
			// 计算一次开始行
			this.startRow = (pageNo - 1) * pageSize;
			this.pageNo = pageNo;
		}

		public Integer getStartRow() {
			return startRow;
		}

		public void setStartRow(Integer startRow) {
			this.startRow = startRow;
		}

		public Integer getPageSize() {
			return pageSize;
		}

		public void setPageSize(Integer pageSize) {
			// 计算一次开始行
			this.startRow = (pageNo - 1) * pageSize;
			this.pageSize = pageSize;
		}

}
