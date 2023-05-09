package com.reports;

import java.util.List;
import java.io.File;
import java.util.ArrayList;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {
	public static void generateJVMReport(String jsonfile) {
		File file = new File("C:\\Users\\user\\eclipse-workspace\\vasu\\OMRBranchAdactinAutomation\\target");
		Configuration configuration = new Configuration(file, "AdactinHotel");
		configuration.addClassifications("Browser Name", "Chrome");
		configuration.addClassifications("Browser version", "5.12.4");
		configuration.addClassifications("OS", "Window8.1Pro");
		configuration.addClassifications("SystemID", "12000-00001-00003-AA59");
		List<String> a = new ArrayList<String>();
		a.add(jsonfile);
		ReportBuilder builder = new ReportBuilder(a, configuration);
		builder.generateReports();

	}
}
