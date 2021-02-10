package domain;

public class LikesInfo {
	private int likesCount;
	private boolean canLike;
	private boolean userLikes;
	private boolean canPublish;

	public boolean isUserLikes() {
		return userLikes;
	}

	public void setUserLikes(boolean userLikes) {
		this.userLikes = userLikes;
	}

	public boolean isCanPublish() {
		return canPublish;
	}

	public void setCanPublish(boolean canPublish) {
		this.canPublish = canPublish;
	}


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
