package com.sunbeam;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.NClob;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import com.mysql.cj.xdevapi.Result;

public class CandidateDAO  implements AutoCloseable{
	
	private Connection com;
	Scanner sc=new Scanner(System.in);
	public CandidateDAO() throws SQLException {
		com=Dbutil.getConnection();
	}
	@Override
	public void close() throws Exception {

		try {
			if(com!=null)
			{
				com.close();
			}

		}catch (Exception e) {
			e.printStackTrace();
		}

	}
	public int addNewCandidate(int id,String name,String party,int vote) throws SQLException{
		 int cnt;
		 String sql="INSERT INTO candidates VALUES(?,?,?,?)";
		 try(PreparedStatement stm =com.prepareStatement(sql)){
			
			 stm.setInt(1, id);
			 stm.setString(2, name);
			 stm.setString(3, party);
			 stm.setInt(4, vote);
			 cnt=stm.executeUpdate();	 
		 }
		return cnt;
		
	}
	public int DeleteCandidateById(int id) throws SQLException {
		int cnt;
		String sql="DELETE FROM candidates WHERE ID=?";
		try(PreparedStatement stm=com.prepareStatement(sql)){
			stm.setInt(1, id);
			cnt=stm.executeUpdate();
		}
		
		return cnt;
	}
	
	public int updateCandidate(int id ,String name ,String party) throws SQLException{
		int cnt;
		String sql="UPDATE candidates set name=?,party=? WHERE id = ?";
		try(PreparedStatement stm= com.prepareStatement(sql)){
			stm.setString(1,name);
			stm.setString(2, party);
			stm.setInt(3, id);
			cnt=stm.executeUpdate();
		}
		return cnt;
		
	}
	public List<Candidate> displayAllCandidate()throws SQLException{
		List<Candidate> list =new ArrayList<Candidate>();
		String sql="SELECT * FROM candidates";
		try(PreparedStatement stm =com.prepareStatement(sql))
		{
			 try(ResultSet rs= stm.executeQuery()){
				 while(rs.next())
				 {
					 int id =rs.getInt("id");
					 String name =rs.getString("name");
					 String party =rs.getString("party");
					 int votes =rs.getInt("votes");
					 Candidate c =new Candidate(id,name,party,votes);
					 list.add(c); 
				 }
				 
			 }
			
		}
		return list;
	}
	
	public int incrementCandidateVote(int id ,int votes)throws SQLException{
		String sql="UPDATE candidates SET votes=votes+? WHERE id=?";
		int ctn;
		try(PreparedStatement stm =com.prepareStatement(sql)){
			stm.setInt(1, id);
			stm.setInt(2, votes);
			 ctn=stm.executeUpdate();
			 
		}
		return ctn;
	}
	public List<Candidate> findByParty(String givenParty) throws SQLException {
		List<Candidate> list = new ArrayList<>();
		String sql = "SELECT * FROM candidates WHERE party=?";
		try(PreparedStatement stmt = com.prepareStatement(sql)) {
			stmt.setString(1, givenParty);
			try(ResultSet rs = stmt.executeQuery()) {
				while(rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String party = rs.getString("party");
					int votes = rs.getInt("votes");
					Candidate c = new Candidate(id, name, party, votes);
					list.add(c);
				}
			} // rs.close();
		}
		return list;
	}// stmt.close();
	public List<PartyVotes> allCandidateByParty() throws SQLException{
		String sql="SELECT SUM(votes)votes,party FROM candidates GROUP BY(party)";
		int ctn;
		List<PartyVotes> list =new ArrayList<PartyVotes>();
		try(PreparedStatement stm =com.prepareStatement(sql))
		{     try(ResultSet rs = stm.executeQuery()){
			    while(rs.next())
			    {
			    	String party=rs.getNString("party");
			    	int votes=rs.getInt("votes");
			    
			    PartyVotes p=new PartyVotes(party,votes);
			    list.add(p);
			    }
			    
		}
			
		}
		return list;
	}
	

}
