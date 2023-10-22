package com.sunbeam;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CandidateMain {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int choice;
		do {
			System.out.println("*******************************");
			System.out.println("Press zero for Exit ");
			System.out.println("1.Add Candidate into Database");
			System.out.println("2.Delete Candidate from Database");
			System.out.println("3 Update Candidate from database");
			System.out.println("4 Get all Candidate from DataBase");
			System.out.println("5 Increment Candidate vote from Database ");
			System.out.println("6 Get all candidate of a given party ");
			System.out.println("7 Get partywise vote count");
			System.out.print("Enter the choice");
			choice=sc.nextInt();
			System.out.println("***********************************");
			
			switch (choice) {
			case 1:
				try(CandidateDAO dao =new CandidateDAO()){
					 System.out.print("Enter id ");
					 int id=sc.nextInt();
					 System.out.println("Enter the name ");
					 String  name =sc.next();
					 System.out.println("Enter the Party ");
					 String party=sc.next();
					 System.out.println("Enter the vote");
					 int vote=sc.nextInt();
				System.out.println(dao.addNewCandidate(id,name,party,vote));
				}catch (Exception e) {
					e.printStackTrace();
					// TODO: handle exception
				}
				break;
			case 2:
			  try(CandidateDAO deo=new CandidateDAO()){
				  System.out.print("Enter the id ");
				  int id =sc.nextInt();
			      System.out.println(deo.DeleteCandidateById(id));
			  }catch (Exception e) {
				  e.printStackTrace();
				// TODO: handle exception
			}
			 break;
			case 3:
				try(CandidateDAO dao=new CandidateDAO()){
					System.out.println("Enter the id ");
					int id =sc.nextInt();
					System.out.println("Enter the Name");
					String name =sc.next();
					System.out.println("Enter the party");
					String party=sc.next();
				System.out.println(dao.updateCandidate(id, name, party));
					
				}catch (Exception e) {
					e.printStackTrace();
					// TODO: handle exception
				}
				break;
				
			case 4:
				try(CandidateDAO deo =new CandidateDAO()){
					List<Candidate> list =deo.displayAllCandidate();
					for (Candidate candidate : list) {
						System.out.println(candidate);
					}
					
					
				}catch (Exception e) {
					e.printStackTrace();
					
					// TODO: handle exception
				}
				break;
			case 5:
				try(CandidateDAO dao =new CandidateDAO()){
					System.out.println("Enter the id ");
					int id=sc.nextInt();
					System.out.println("Enter the votes you want to add(NUMBER)");
					int votes=sc.nextInt();
					int cnt=dao.incrementCandidateVote(id, votes);
					System.out.println(cnt);
				}catch (Exception e) {
					e.printStackTrace();
					// TODO: handle exception
				}
				break;
			case 6:
				try(CandidateDAO deo=new CandidateDAO())
				{
					System.out.println("Enter the party Name");
					String party=sc.next();
					List<Candidate> list =deo.findByParty(party);
					for (Candidate candidate : list) {
						System.out.println(candidate);
					}
				}catch (Exception e) {
					e.printStackTrace();
					// TODO: handle exception
				}
               break;
               
			case 7:
				try(CandidateDAO dao =new CandidateDAO()){
					List<PartyVotes> party= dao.allCandidateByParty();
					for (PartyVotes partyVotes : party) {
						System.out.println(partyVotes);
						
					}
				}
				catch (Exception e) {
					e.printStackTrace();
					// TODO: handle exception
				}
				break;
				
				
			default:
				break;
			}
		}while(choice!=0);
		
		
		
		
		 

	}

}
