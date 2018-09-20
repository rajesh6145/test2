package com.Adobe_FlashBuilds.Download;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class MainClass {

	WebDriver driver;
	/** Define WebDrivre instance */

	// Define/declare all required strings
	static String excelPath = "BuildsPath.xlsx";
	/** Define path/Name of excel which is to be read */
	static String[][] excelData;
	static String flashBuild_rootDirPath = "C:\\FlashBuild\\";
	static String dateWiseBuildPath;
	static String BuildToBeDownload;
	static String WindowBuildPath;
	static String MacBuildPath;
	static String releaseName;
	static String str1;

	// declare File class object
	static File file;

	// define settings for chromePrefs
	static HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
	static ChromeOptions options = new ChromeOptions();
	static DesiredCapabilities cap = DesiredCapabilities.chrome();

	// make objects of all required classes
	static SjStrore obj_SjStrore;

	// Define constructor for MainClass Class.
	private int j;

	//Constructor for mainClass...
	public MainClass(int j) {
		this.j = j;
	}

	static {

		// read excel sheet completely which is having build name and generic urls
		try {
			excelData = Utilility.readExcel(excelPath);
		} catch (InvalidFormatException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		// tell your machine which build you want to download in
		// type=release/debugger(r/d) buildNumber" format.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter release number:  ");
		str1 = scanner.nextLine().trim().toLowerCase(); // 27
		System.out.println("enter r for release or d for debugger:  ");
		String str2 = scanner.nextLine().trim().toLowerCase(); // r
		System.out.println("enter build number:  ");
		String str3 = scanner.nextLine().trim().toLowerCase(); // 137
		BuildToBeDownload = "play_" + str1 + "_0_" + str2 + "0_" + str3;
		scanner.close();

		// now make folder indicating the build number you want to download
		Utilility.createFolder(flashBuild_rootDirPath); /** Create root directory */
		dateWiseBuildPath = Utilility.createFolder(flashBuild_rootDirPath.concat(Utilility.findDate())
				+ "_".concat(BuildToBeDownload)); /** create date-wise folders */
		WindowBuildPath = Utilility.createFolder(dateWiseBuildPath.concat("\\Windows"));
		MacBuildPath = Utilility.createFolder(dateWiseBuildPath).concat("\\Mac");

		// set chromePrefs for safe browsing
		chromePrefs.put("safebrowsing.enabled", "true");

		// make final relaseName/buildName
		if (str1.equalsIgnoreCase("27")) {
			releaseName = "27.0-zoe";
		}
		if (str1.equalsIgnoreCase("28")) {
			releaseName = "28.0-atka";
		}
		if (str1.equalsIgnoreCase("29")) {
			releaseName = "29.0-byron";
		}
		if (str1.equalsIgnoreCase("30")) {
			releaseName = "30.0-capri";
		}
		if (str1.equalsIgnoreCase("31")) {
			releaseName = "31.0-duke";
		}
	}

	public static void main(String[] args) {

		downloadBuild();

	}
	
	public static DesiredCapabilities setChromePref(String pathAtBuildToBeDownloaded) {
		//options.addArguments("headless");
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("safebrowsing.enabled", "true");
		chromePrefs.put("download.default_directory", pathAtBuildToBeDownloaded);
		options.setExperimentalOption("prefs", chromePrefs);
		

		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		return cap;
	}

	public static void downloadBuild() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		for (int i = 1; i <= 12; i++) {
			String windowpathAtBuildToBeDownloaded = Utilility
					.createFolder(WindowBuildPath + "\\" + excelData[i][0] + excelData[i][1] + excelData[i][2]);
			WebDriver driver = new ChromeDriver(setChromePref(windowpathAtBuildToBeDownloaded));
			obj_SjStrore = new SjStrore(driver);
			String url = excelData[i][3].replace("BuildName", BuildToBeDownload);
			obj_SjStrore.goToBuildPathFor(url.replace("releasename", releaseName));

			try {
				obj_SjStrore.andDownloadBuild(excelData[i][4].replace("buildNumber", str1));
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

			try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}

			driver.close();
		}
	}

}
