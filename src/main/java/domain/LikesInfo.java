package domain;

public class LikesInfo {
	private int likesCount;
	private boolean canLike;

	public boolean isCanLike() {
		return canLike;
	}

	public void setCanLike(boolean canLike) {
		this.canLike = canLike;
	}

	public int getLikesCount() {
		return likesCount;
	}

	public void setLikesCount(int likesCount) {
		this.likesCount = likesCount;
	}
}
