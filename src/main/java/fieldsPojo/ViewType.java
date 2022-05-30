package fieldsPojo;

public class ViewType{
    private boolean view;
    private boolean edit;
    private boolean quick_create;
    private boolean create;
	public boolean isView() {
		return view;
	}
	public void setView(boolean view) {
		this.view = view;
	}
	public boolean isEdit() {
		return edit;
	}
	public void setEdit(boolean edit) {
		this.edit = edit;
	}
	public boolean isQuick_create() {
		return quick_create;
	}
	public void setQuick_create(boolean quick_create) {
		this.quick_create = quick_create;
	}
	public boolean isCreate() {
		return create;
	}
	public void setCreate(boolean create) {
		this.create = create;
	}
    
}
