package cn.imp.bootplus.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * json 工具类
 * @author 纪立宁
 * 2018年10月26日 16:29:00
 *
 */
public class JsonUtils {
	
	private JsonUtils() {
		
	}
	
	/**
	 * 对象转换json
	 * @param object
	 * @return
	 */
	public static String Object2Json(Object object) {
		ObjectMapper mapper = new ObjectMapper();
		String json = null;
		try {
			json = mapper.writeValueAsString(object);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return json;
	}
}
