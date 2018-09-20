package com.runExeFile;

import java.io.File;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;





public class ClassA {
	
	

	public static void main(String[] args) throws Exception {
		// Runtime.getRuntime().exec("C:\\FlashBuild\\14_09_2017_play_27_0_r0_137\\FF_32Release\\Something.exe");
		 String Path = "C:\\FlashBuild\\14_09_2017_play_27_0_r0_137\\FF_32Release\\install_flash_player_27_plugin.exe";
		// Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+path);
		runExe(Path);
	}
	
	public static void runExe(String Path) {
		try {
			System.out.println("executeing exe file");
			Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+Path);
		} catch (IOException e) {
			System.out.println("exe file not found");
		}
	}

}
