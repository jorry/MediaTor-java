package com.lc.mediatore;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import android.content.Context;
import android.os.Environment;

public class Log {
	private static String PATH_LOGCAT;
	private static Log INSTANCE = null;
	private File logFile;

	private Log(Context con) {
		init(con);
	}

	public static Log getInstance(Context con) {
		if (INSTANCE == null) {
			INSTANCE = new Log(con);
		}
		return INSTANCE;
	}

	public void init(Context context) {
		StringBuffer sb = new StringBuffer();
		sb.append(Environment.getExternalStorageDirectory());
		sb.append("/Android/data/");
		sb.append(context.getPackageName()).append("/");
		sb.append("logs").append("/");
		PATH_LOGCAT = sb.toString();
		File file = new File(PATH_LOGCAT);
		if (!file.exists()) {
			file.mkdirs();
		}

	}

	FileOutputStream fos;

	public Log creatFile(String logFileName) {
		logFile = new File(PATH_LOGCAT, logFileName);
		if (!logFile.exists()) {
			try {
				logFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				fos = new FileOutputStream(logFile);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return this;
	}

	public void writeLog(String netLog) {
		try {
			fos.write(netLog.getBytes());
			fos.write("\n".getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
