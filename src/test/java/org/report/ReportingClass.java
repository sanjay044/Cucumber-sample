package org.report;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportingClass {
public static void generateReport(String json) {
	File file = new File("target");
	Configuration con = new Configuration(file,"Adacctin Hotel WebPage Validation");
	con.addClassifications("Author", "Sanjay");
	con.addClassifications("Tool", "BDD Cucumber");
	
	
	//To create New Empty LIst
	List<String> list = new LinkedList<String>();
	list.add(json);
	
	//To generate Report
	ReportBuilder report = new ReportBuilder(list,con);
	report.generateReports();
}
}
