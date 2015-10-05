package datalogger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public interface DataLogger {
	
	final int SIZE_LAST_DATA = 5;
	
	void readValue() throws IOException, FileNotFoundException;
	
	double getCurrentValue();
	
	Double[] getLastData();
	
	String getDataName();
	
	String getDataUnit();
	
	void stop() throws IOException;
	
	BufferedReader getbr();
	
	void setBr(BufferedReader br);
	
	String getDataEngineeringUnit();
	
	String getDriverName();
	
	boolean isActivated();
	
	void activate();

}
