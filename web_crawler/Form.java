package web_crawler;

import java.util.ArrayList;

import extract_info.Extr_QI_Attr;

public class Form {

	private Extr_QI_Attr QI_Attr = new Extr_QI_Attr();
	private String url;// ���ñ�form��url
	private String html;// form��Ӧ��html����
	private boolean belong;// ���ӿ��Ƿ����ڿɲ�ѯ�ӿ�
	private ArrayList<Integer> Attribute;

	public void set_url(String value) {
		url = value;
	}

	public void set_belong(boolean value) {
		belong = value;
	}

	public void set_attribute(ArrayList<Integer> value) {
		Attribute = value;
	}

	public ArrayList<Integer> get_attribute() {
		return Attribute;
	}

	public String get_url() {
		return url;
	}

	public void set_html(String value) {
		html = value;
	}

	public String get_html() {
		return html;
	}

	public boolean get_belong() {
		return belong;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
