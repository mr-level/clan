package cn.level.dao;

import java.util.List;

import cn.level.common.DAO;
import cn.level.entity.Clansman;

public class ClansmanDao extends DAO<Clansman> {
	
	public void insertClansman(Clansman clansman) throws Exception {
		
		Integer parentId = clansman.getParentId();
		
		if(parentId != null) {
			
			Clansman parent = new Clansman(parentId);
			parent = this.selectClansmanById(parent);
			
			resetOrderNums(parent);
			
			clansman.setLft(parent.getLft() + 2);
			clansman.setRgt(parent.getRgt() + 2);
			
		}
		
		insert("cn.level.entity.Clansman.insert", clansman);
		
	}
	
	public Clansman selectClansmanById(Clansman clansman) throws Exception {
		
		Clansman resultMan = selectOne("cn.level.entity.Clansman.selectOneById", clansman);
		return resultMan;
		
	}
	
	public List<Clansman> selectClansmanListById(Clansman clansman) throws Exception {
		
		List<Clansman> clansmansList = selectList("cn.level.entity.Clansman.selectOffspringByOrderNum", clansman);
		return clansmansList;
		
	}
	
	public List<Clansman> selectEldersByOrderNum (Clansman clansman) throws Exception {
		
		List<Clansman> clansmanList = selectList("cn.level.entity.Clansman.selectEldersByOrderNum", clansman);
		return clansmanList;
		
	}
	
	public void updateInfoById(Clansman clansman) throws Exception {
		update("cn.level.entity.Clansman.updateInfoById", clansman);
	}
	
	public void deleteClansmanById(Clansman clansman) throws Exception {
		
		delete("cn.level.entity.Clansman.deleteClansmanById", clansman);
		
		Integer parentId = clansman.getParentId();
		
		if(parentId != null) {
			
			Clansman parent = new Clansman(parentId);
			parent = this.selectClansmanById(parent);
			resetOrderNums(clansman);
			
		}
	}
	
	private void resetOrderNums(Clansman clansman) throws Exception {
		
		update("cn.level.entity.Clansman.resetLftOrderNum", clansman);
		update("cn.level.entity.Clansman.resetRgtOrderNum", clansman);
		
	}

}
