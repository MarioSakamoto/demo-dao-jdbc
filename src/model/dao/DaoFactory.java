package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	public static DepartmentDao createrDepartmentDao;

	public static SellerDao createrSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}

	public static DepartmentDao createrDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}
	
}
