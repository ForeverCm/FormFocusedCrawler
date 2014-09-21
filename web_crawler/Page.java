package web_crawler;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Page implements Serializable {

	private String html;// ��¼ҳ���html����
	private Set<String> backlinks = new HashSet<String>();// ��ҳ��ĺ�������
	private String url;// ��ҳ���ͳһ��Դ��λ��
	private int depth;
	private double score;
	private String title;//����ʶ����Ȼ�������
	private String langid;// ���ҳ���������

	public Page(int value) {
		depth = value;
	}

	public String get_langid() {
		return langid;
	}

	public String get_title() {
		return title;
	}

	public double get_score() {
		return score;
	}

	public String get_html() {
		return html;
	}

	public void set_langid(String value)
	{
		langid = value;
	}
	public void set_title(String value) {
		title = value;
	}

	public void set_html(String value) {
		html = value;
	}

	public void set_url(String value) {
		url = value;
	}

	public String get_url() {
		return url;
	}

	public void set_depth(int value) {
		depth = value;
	}

	public void set_score(double value) {
		score = value;
	}

	public int get_depth() {
		return depth;
	}

	public void Add_backlink(String value) {
		backlinks.add(value);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
