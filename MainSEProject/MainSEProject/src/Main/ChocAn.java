package Main;

import Graphics.graphicsStart;

/**
 * The is the ChocAn Main Class. This simply will be the connector for the GUI.
 * 
 * @author sgill
 */
public class ChocAn {

	static DCOperator operator;
	static ReportViewer reports;
	static SPRecordProcess sPRecord;
	static SPReportProcess sPReport;
	static ServiceRecordProcess services;
	static MemReportProcess memReport;
	static MngReportProcess mngReport;

	/**
	 * starts by creating the gui, then connecting to the database? or the other
	 * way around.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		graphicsStart.main(args);

	}

	public static DCOperator getOperator() {
		return operator;
	}

	public static DCOperator setOperator(DCOperator operator) {
		return ChocAn.operator = operator;
	}

	public static ReportViewer getReports() {
		return reports;
	}

	public static ReportViewer setReports(ReportViewer reports) {
		return ChocAn.reports = reports;
	}

	public static SPRecordProcess getSPRecord() {
		return sPRecord;
	}

	public static SPRecordProcess setSPRecord(SPRecordProcess sPRecord) {
		return ChocAn.sPRecord = sPRecord;
	}

	public static SPReportProcess getSPReport() {
		return sPReport;
	}

	public static SPReportProcess setSPReport(SPReportProcess sPReport) {
		return ChocAn.sPReport = sPReport;
	}

	public static ServiceRecordProcess getServices() {
		return services;
	}

	public static ServiceRecordProcess setServices(ServiceRecordProcess services) {
		return ChocAn.services = services;
	}

	public static MemReportProcess getMemReport() {
		return memReport;
	}

	public static MemReportProcess setMemReport(MemReportProcess memReport) {
		return ChocAn.memReport = memReport;
	}

	public static MngReportProcess getMngReport() {
		return mngReport;
	}

	public static MngReportProcess setMngReport(MngReportProcess mngReport) {
		return ChocAn.mngReport = mngReport;
	}
}
