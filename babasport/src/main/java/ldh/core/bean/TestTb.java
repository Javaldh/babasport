package ldh.core.bean;

import java.util.Date;

/**
 * 测试类
 * @author ldh
 *
 * @date 2017-1-23 下午11:12:36
 */
public class TestTb {
	private Integer id;
	private String name;
	private Date birthday;
	
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
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
}
