package domain;

public class RepostsInfo {
	private  int repostsCount;
	private boolean canRepost;
	private boolean userReposted;

	public boolean isCanRepost() {
		return canRepost;
	}

	public void setCanRepost(boolean canRepost) {
		this.canRepost = canRepost;
	}

	public boolean isUserReposted() {
		return userReposted;
	}

	public void setUserReposted(boolean userReposted) {
		this.userReposted = userReposted;
	}

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
