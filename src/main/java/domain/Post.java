package domain;

public class Post {
	private int id;
	private int date;
	private int ownerId;
	private int fromId;
	private int createdBy;
	private int signerId;
	private int replyOwnerId;
	private int replyPostId;
	private int postponedId;
	private boolean friendsOnly;
	private boolean canPin;
	private boolean canDelete;
	private boolean canEdit;
	private boolean isPinned;
	private boolean markedAsAds;
	private boolean isFavorite;
	private Copyright copyright;
	private String[] postType;
	private Geo geo;
	private HeaderInfo headerInfo;
	private ActionsInfo actionsInfo;
	private String name;
	private String text;
	private boolean image;
	private CommentsInfo commentsInfo;
	private LikesInfo likesInfo;
	private RepostsInfo repostsInfo;
	private ViewsInfo viewsInfo;

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	public int getFromId() {
		return fromId;
	}

	public void setFromId(int fromId) {
		this.fromId = fromId;
	}

	public int getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public int getSignerId() {
		return signerId;
	}

	public void setSignerId(int signerId) {
		this.signerId = signerId;
	}

	public int getReplyOwnerId() {
		return replyOwnerId;
	}

	public void setReplyOwnerId(int replyOwnerId) {
		this.replyOwnerId = replyOwnerId;
	}

	public int getReplyPostId() {
		return replyPostId;
	}

	public void setReplyPostId(int replyPostId) {
		this.replyPostId = replyPostId;
	}

	public int getPostponedId() {
		return postponedId;
	}

	public void setPostponedId(int postponedId) {
		this.postponedId = postponedId;
	}

	public boolean isFriendsOnly() {
		return friendsOnly;
	}

	public void setFriendsOnly(boolean friendsOnly) {
		this.friendsOnly = friendsOnly;
	}

	public boolean isCanPin() {
		return canPin;
	}

	public void setCanPin(boolean canPin) {
		this.canPin = canPin;
	}

	public boolean isCanDelete() {
		return canDelete;
	}

	public void setCanDelete(boolean canDelete) {
		this.canDelete = canDelete;
	}

	public boolean isCanEdit() {
		return canEdit;
	}

	public void setCanEdit(boolean canEdit) {
		this.canEdit = canEdit;
	}

	public boolean isPinned() {
		return isPinned;
	}

	public void setPinned(boolean pinned) {
		isPinned = pinned;
	}

	public boolean isMarkedAsAds() {
		return markedAsAds;
	}

	public void setMarkedAsAds(boolean markedAsAds) {
		this.markedAsAds = markedAsAds;
	}

	public boolean isFavorite() {
		return isFavorite;
	}

	public void setFavorite(boolean favorite) {
		isFavorite = favorite;
	}

	public Copyright getCopyright() {
		return copyright;
	}

	public void setCopyright(Copyright copyright) {
		this.copyright = copyright;
	}

	public String[] getPostType() {
		return postType;
	}

	public void setPostType(String[] postType) {
		this.postType = postType;
	}

	public Geo getGeo() {
		return geo;
	}

	public void setGeo(Geo geo) {
		this.geo = geo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public HeaderInfo getHeaderInfo() {
		return headerInfo;
	}

	public void setHeaderInfo(HeaderInfo headerInfo) {
		this.headerInfo = headerInfo;
	}

	public ActionsInfo getActionsInfo() {
		return actionsInfo;
	}

	public void setActionsInfo(ActionsInfo actionsInfo) {
		this.actionsInfo = actionsInfo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public boolean isImage() {
		return image;
	}

	public void setImage(boolean image) {
		this.image = image;
	}

	public CommentsInfo getCommentsInfo() {
		return commentsInfo;
	}

	public void setCommentsInfo(CommentsInfo commentsInfo) {
		this.commentsInfo = commentsInfo;
	}

	public LikesInfo getLikesInfo() {
		return likesInfo;
	}

	public void setLikesInfo(LikesInfo likesInfo) {
		this.likesInfo = likesInfo;
	}

	public RepostsInfo getRepostsInfo() {
		return repostsInfo;
	}

	public void setRepostsInfo(RepostsInfo repostsInfo) {
		this.repostsInfo = repostsInfo;
	}

	public ViewsInfo getViewsInfo() {
		return viewsInfo;
	}

	public void setViewsInfo(ViewsInfo viewsInfo) {
		this.viewsInfo = viewsInfo;
	}
}
