package cn.level.common;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class DAO<T> extends SqlSessionDaoSupport {
	
	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	
	protected void insert(String sql, T t) throws Exception {
		
		SqlSession session = null;
		
		try {
			
			session = this.getSqlSession();
			session.insert(sql, t);
			
		} catch (Exception e) {
			throw e;
		}
		
	}
	
	protected void insert(List<String> sqlList, List<T> tList) throws Exception {
		
		SqlSession session = null;
		
		try {
			
			session = this.getSqlSession();
			
			int size = sqlList.size();
			
			for (int i = 0; i < size; i++) {
				session.insert(sqlList.get(i), tList.get(i));
			}
			
		} catch (Exception e) {
			throw e;
		}
		
	}
	
	protected void insert(String sql, List<T> ts) throws Exception {
		
		SqlSession session = null;
		
		try {
			
			session = this.getSqlSession();
			
			for (T t : ts) {
				session.insert(sql, t);
			}
			
		} catch (Exception e) {
			
			throw e;
			
		}
		
	}
	
	protected void delete(String sql, T t) throws Exception {
		
		SqlSession session = null;
		
		try {
			
			session = this.getSqlSession();
			session.delete(sql, t);
			
		} catch (Exception e) {
			
			throw e;
			
		}
		
	}
	
	protected int update(String sql, T t) throws Exception {
		
		int result = 0;
		SqlSession session = null;
		
		try {
			
			session = this.getSqlSession();
			
			result = session.update(sql, t);
			
		} catch (Exception e) {
			throw e;
		}
		
		return result;
		
	}
	
	protected List<T> selectList(String sql) throws Exception {
		
		SqlSession session = null;
		
		try {
		
			session = this.getSqlSession();
			return session.selectList(sql);
			
		}catch (Exception e) {
			throw e;
		}
		
	}
	
	protected List<T> selectList(String sql, Object t) throws Exception {
		
		SqlSession session = null;
		
		try {
		
			session = this.getSqlSession();
			return session.selectList(sql, t);
			
		} catch (Exception e) {
			throw e;
		}
		
	}
	
	protected T selectOne(String sql, Object t) throws Exception {
		
		SqlSession session = null;
		
		try {
		
			session = this.getSqlSession();
			return session.selectOne(sql, t);
			
		} catch (Exception e) {
			throw e;
		}
		
	}
	
	protected int selectCount(String sql, Object t) throws Exception {
		
		SqlSession session = null;
		
		try {
			
			session = this.getSqlSession();
			return session.selectOne(sql, t);
			
		} catch (Exception e) {
			throw e;
		}
		
	}
	
	protected List<Map<Object, Object>> selectListMap(String sql, Object t) throws Exception {
		
		SqlSession session = null;
		
		try {
		
			session = this.getSqlSession();
			return session.selectList(sql, t);
			
		} catch (Exception e) {
			throw e;
		}
		
	}

}
