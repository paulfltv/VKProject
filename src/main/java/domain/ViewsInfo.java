package domain;

public class ViewsInfo {
	private int viewsCount;
	private boolean canView;

	public boolean isCanView() {
		return canView;
	}

	public void setCanView(boolean canView) {
		this.canView = canView;
	}

	public int getViewsCount() {
		return viewsCount;
	}

	public void setViewsCount(int viewsCount) {
		this.viewsCount = viewsCount;
	}
}
