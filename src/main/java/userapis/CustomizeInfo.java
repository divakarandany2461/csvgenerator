package userapis;

public class CustomizeInfo{
	 private Object notes_desc;
	 private Object show_right_panel;
	 private Object bc_view;
	 private boolean show_home;
	 private boolean show_detail_view;
	 private Object unpin_recent_item;
	public Object getNotes_desc() {
		return notes_desc;
	}
	public void setNotes_desc(Object notes_desc) {
		this.notes_desc = notes_desc;
	}
	public Object getShow_right_panel() {
		return show_right_panel;
	}
	public void setShow_right_panel(Object show_right_panel) {
		this.show_right_panel = show_right_panel;
	}
	public Object getBc_view() {
		return bc_view;
	}
	public void setBc_view(Object bc_view) {
		this.bc_view = bc_view;
	}
	public boolean isShow_home() {
		return show_home;
	}
	public void setShow_home(boolean show_home) {
		this.show_home = show_home;
	}
	public boolean isShow_detail_view() {
		return show_detail_view;
	}
	public void setShow_detail_view(boolean show_detail_view) {
		this.show_detail_view = show_detail_view;
	}
	public Object getUnpin_recent_item() {
		return unpin_recent_item;
	}
	public void setUnpin_recent_item(Object unpin_recent_item) {
		this.unpin_recent_item = unpin_recent_item;
	}
}
