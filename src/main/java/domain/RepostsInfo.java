package domain;

public class RepostsInfo {
	private  int repostsCount;
	private boolean canRepost;

	public boolean isCanPost() {
		return canRepost;
	}

	public void setCanPost(boolean canPost) {
		this.canRepost = canPost;
	}

	public int getRepostsCount() {
		return repostsCount;
	}

	public void setRepostsCount(int repostsCount) {
		this.repostsCount = repostsCount;
	}
}
