package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import models.marks;

public class marksservice {

	private Connection conn;
	
	public marksservice(Connection conn) {
		super();
		this.conn = conn;
		
	}
	
	
	
	public boolean addmarks(marks mar) {
		boolean f = false;
		try {
			String sql = "insert into marks(pinnumber,cns,bda,ml,ads,swm,ipr) values (?,?,?,?,?,?,?)";
			PreparedStatement pmst = conn.prepareStatement(sql);
			pmst.setString(1, mar.getPinnumber());
			pmst.setInt(2, mar.getCns());
			pmst.setInt(3, mar.getBda());
			pmst.setInt(4, mar.getMl());
			pmst.setInt(5, mar.getAds());
			pmst.setInt(6, mar.getSwm());
			pmst.setInt(7, mar.getIpr());
			
			int i = pmst.executeUpdate();
			if(i==1) {
				
				f = true;
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	
	
	
	
	public List<marks> getall(){
		List<marks> list = new ArrayList<marks>();
		marks m = null;
		try {
			
			String sql = "select * from marks";
			PreparedStatement pmst = conn.prepareStatement(sql);
			ResultSet rs = pmst.executeQuery();
			while (rs.next()) {
				
				m = new marks();
				
				m.setPinnumber(rs.getString(1));
				m.setCns(rs.getInt(2));
				m.setBda(rs.getInt(3));
				m.setMl(rs.getInt(4));
				m.setAds(rs.getInt(5));
				m.setSwm(rs.getInt(6));
				m.setIpr(rs.getInt(7));
				
				list.add(m);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	
	
	public marks getbypinnumber(String pinnumber) {
		marks m = null;
		
		try {
			String sql = "select * from marks where pinnumber = ?";
			PreparedStatement pmst = conn.prepareStatement(sql);
			pmst.setString(1, pinnumber);
			
			ResultSet rs = pmst.executeQuery();
			while (rs.next()) {
				
				m = new marks();
				
				m.setPinnumber(rs.getNString(1));
				m.setCns(rs.getInt(2));
				m.setBda(rs.getInt(3));
				m.setMl(rs.getInt(4));
				m.setAds(rs.getInt(5));
				m.setSwm(rs.getInt(6));
				m.setIpr(rs.getInt(7));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return m;
	}
	
	
	
	public boolean  updatemarks(marks m) {
		
		boolean f = false;
		
		try {
			
			String sql = "update marks set cns=?,bda=?,ml=?,ads=?,swm=?,ipr=? where pinnumber=?";
			PreparedStatement pmst = conn.prepareStatement(sql);
			
			pmst.setInt(1, m.getCns());
			pmst.setInt(2, m.getBda());
			pmst.setInt(3, m.getMl());
			pmst.setInt(4, m.getAds());
			pmst.setInt(5, m.getSwm());
			pmst.setInt(6, m.getIpr());
			pmst.setString(7, m.getPinnumber());
			
			int i = pmst.executeUpdate();
			if(i>0) {
				
				f = true;
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	
	
	
	public boolean deletemarks(String pinnumber) {
		
		boolean f = true;
		
		try {
			
			String sql = "delete from marks where pinnumber = ?";
			PreparedStatement pmst = conn.prepareStatement(sql);
			
			pmst.setString(1, pinnumber);
			
			int i = pmst.executeUpdate();
			if(i>0) {
				
				f = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	
}
