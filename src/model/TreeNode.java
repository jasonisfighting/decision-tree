package model;

import java.util.ArrayList;

/*
 * ���о������ڵ�ĳ�����
 * ���ݸýڵ��ID�͸��ڵ���������һ��·����,����Ҷ�ڵ㣬ȷ��������
 */
public class TreeNode {
	private String Character; // ����
	private String ID; // root�ڵ�Ϊ-1,����Ϊ�ϲ�character��ȡֵ
	//private data dataset; //���е��ж����ݶ���
	private ArrayList<TreeNode> children = new ArrayList<TreeNode>(); // �ӽڵ������
	private TreeNode parenet; // ���ڵ�
	public TreeNode(){
		this.ID = "";
		this.parenet = null;
		this.Character = "";
	}
	public ArrayList<TreeNode> getChildren() {
		return children;
	}
	public void setChildren(TreeNode children) {// ����һ���ӽڵ�
		this.children.add(children);
	}
	public TreeNode getParenet() {
		return parenet;
	}
	public void setParenet(TreeNode parenet) {
		this.parenet = parenet;
	}
	public String getCharacter() {
		return Character;
	}
	public void setCharacter(String character) {
		Character = character;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
}
