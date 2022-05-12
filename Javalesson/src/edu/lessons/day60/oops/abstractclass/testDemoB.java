package edu.lessons.day60.oops.abstractclass;

public static void testDemoB() {
	// abstract class can not be instantiated
//	AbsDemoB objectDemob=new AbsDemoB();
	AbsDemoB objectDemob=new DemoBChild();
	objectDemob.echo();
}
