package userapis;

public class Info{
	private int per_page;
	private int count;
	private int page;
	private boolean more_records;
	public int getPer_page() {
		return per_page;
	}
	public void setPer_page(int per_page) {
		this.per_page = per_page;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public boolean isMore_records() {
		return more_records;
	}
	public void setMore_records(boolean more_records) {
		this.more_records = more_records;
	}
}
