package cn.level.entity;

import javax.ws.rs.core.MultivaluedMap;

public class Clansman {

	public Integer id;
	public String name;
	public String profile;
	public Integer parentId;
	public Integer lft;
	public Integer rgt;
	public Long createTime;
	
	public Clansman(){}
	
	public Clansman(Integer id) {
		super();
		this.id = id;
	}

	public static Clansman newInstance(MultivaluedMap<String, String> fieldSet){
		
		String name = fieldSet.getFirst("name");
		String profile = fieldSet.getFirst("profile");
		
		Clansman clansman = new Clansman();
		clansman.setName(name);
		clansman.setProfile(profile);
		clansman.setCreateTime(System.currentTimeMillis());
		
		return clansman;
		
	}
	
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

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Integer getLft() {
		return lft;
	}

	public void setLft(Integer lft) {
		this.lft = lft;
	}

	public Integer getRgt() {
		return rgt;
	}

	public void setRgt(Integer rgt) {
		this.rgt = rgt;
	}
	
	public Long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

}
