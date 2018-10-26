package cn.imp.bootplus.util;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

/**
 * 文件上传工具类
 * 
 * @author 纪立宁 2018年10月26日 09:56:24
 *
 */
public class FileUtils {
	
	/**
	 * 	文件上传
	 * @param file
	 * @return
	 */
	public static String fileUpload(MultipartFile file) {
		if (!file.isEmpty()) {
			String saveFileName = file.getOriginalFilename();
			// File saveFile = new
			// File(request.getSession().getServletContext().getRealPath("/upload/") +
			// saveFileName);
			File saveFile = new File("E://upload//temp//" + saveFileName);
			if (!saveFile.getParentFile().exists()) {
				saveFile.getParentFile().mkdirs();
			}
			try {
				BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(saveFile));
				out.write(file.getBytes());
				out.flush();
				out.close();
				return saveFile.getName() + " 上传成功";
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				return "上传失败," + e.getMessage();
			} catch (IOException e) {
				e.printStackTrace();
				return "上传失败," + e.getMessage();
			}
		} else {
			return "上传失败，因为文件为空.";
		}
	}
}
