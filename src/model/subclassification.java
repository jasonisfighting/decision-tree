package model;

import java.util.ArrayList;

/*
 * ����ķ���洢
 */
public class subclassification {
	private String subclassifyID; // datasetĳ���Ե�ȡֵ
	private int subnum = 0; //ӵ�и�ȡֵ�Ķ������
	private ArrayList<classification> sub; //���ӷ����еĹ���Ҷ�ڵ�ķ���
	public String getSubclassicifyID() {
		return subclassifyID;
	}
	public void setSubclassicifyID(String subclassifyID) {
		this.subclassifyID = subclassifyID;
	}
	public int getSubnum() {
		return subnum;
	}
	public void addSubnum() {
		this.subnum ++;
	}
	public ArrayList<classification> getSub() {
		return sub;
	}
	public void setSub(ArrayList<classification> sub) {
		this.sub = sub;
	}
}
