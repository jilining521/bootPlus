package cn.imp.bootplus.enums.system;

/**
 * 删除状态
 * @author 纪立宁
 * 2018年10月26日 15:56:14
 *
 */
public enum DelState {
	S00_NORMAL("正常"),S01_DELETE("删除");
	private String label;
	private DelState(String label) {
		this.label = label;
	}
	public String getLabel() {
		return this.label;
	}
}
