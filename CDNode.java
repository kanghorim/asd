package week_6;

public class CDNode<T> {
	public CDNode<T> leftLink;
	public T data;
	public CDNode<T> rightLink;
	public CDNode ( CDNode leftLink, T data, CDNode rightLink) {
		this.leftLink = leftLink;
		this.data = data;
		this.rightLink = rightLink;
	}
	public CDNode<T> getLeftLink() {
		return leftLink;
	}
	public void setLeftLink(CDNode<T> leftLink) {
		this.leftLink = leftLink;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public CDNode<T> getRightLink() {
		return rightLink;
	}
	public void setRightLink(CDNode<T> rightLink) {
		this.rightLink = rightLink;
	}
}
