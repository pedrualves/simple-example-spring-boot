package simple.example.bean;

import java.io.Serializable;

import org.springframework.boot.jackson.JsonComponent;

@JsonComponent
public class Bean implements Serializable {
	private static final long serialVersionUID = -6062949883080261376L;

	private String abc;
	private int num;

	public String getAbc() {
		return abc;
	}

	public void setAbc(String abc) {
		this.abc = abc;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}
