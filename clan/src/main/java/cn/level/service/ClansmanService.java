package cn.level.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.level.dao.ClansmanDao;
import cn.level.entity.Clansman;

public class ClansmanService {

	@Autowired
	ClansmanDao clansmanDao;

	public void addClansman(Clansman clansman) throws Exception {
		clansmanDao.insertClansman(clansman);
	}
	
	public Clansman findClansmanById(Clansman clansman) throws Exception {
		return clansmanDao.selectClansmanById(clansman);
	}

	public List<Clansman> findClansmanListById(Clansman clansman) throws Exception {
		return clansmanDao.selectClansmanListById(clansman);
	}
	
	public List<Clansman> findEldersByOrderNum(Clansman clansman) throws Exception {
		return clansmanDao.selectEldersByOrderNum(clansman);
	}
	
	public void updateInfoById(Clansman clansman) throws Exception {
		clansmanDao.updateInfoById(clansman);
	}

	public void removeClansman(Clansman clansman) throws Exception {
		clansmanDao.deleteClansmanById(clansman);
	}
	
}
