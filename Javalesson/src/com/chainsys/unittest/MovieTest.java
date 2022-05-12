package com.chainsys.unittest;

import com.chainsys.classandmethods.Movie;

public class MovieTest {

		public static void testMovie() {
		   Movie mv=new Movie("spiderman");
		   mv.setLanguage("Tamil");
		   mv.setSeatNo(2);
		   mv.setTicketPrice(200);
		   mv.setLocation("Chennai");
		   System.out.println(mv.movieName);
		   System.out.println(mv.getLanguage());
		   System.out.println(mv.getSeatNo());
		   System.out.println(mv.getTicketPrice());
		   System.out.println(mv.getLocation());
		}
		}