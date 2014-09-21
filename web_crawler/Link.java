package web_crawler;

import java.io.Serializable;

public class Link implements Serializable{

	private String link ;// ��link���ı�����,��anchor��ȫ��
	private int depth;// ��link������ҳ������
	private double score;// �Ա����ӵĴ��
	private String url;// ��¼��link�ľ���url
	private boolean belong;// �Ǳ���վΪ1,����Ϊ0.
	private int distance;// �����Ӿ���Ŀ��ľ���1��2��3

	public Link(int value) {
		depth = value;// ��link����ȼ�¼��
	}

	public void set_distance(int value) {
		distance = value;
	}

	public void set_belong(boolean value) {
		belong = value;
	}

	public String get_url() {
		return url;
	}

	public String get_link() {
		return link;
	}

	public int get_depth() {
		return depth;
	}

	public void set_url(String value) {
		url = value;
	}

	public void set_depth(int value) {
		depth = value;
	}

	public void set_link(String value) {
		link = value;
	}

	public void set_score(double value) {
		score = value;
	}

	public double get_score() {
		return score;
	}

	public boolean get_belong() {
		return belong;
	}

	public int get_distance() {
		return distance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
