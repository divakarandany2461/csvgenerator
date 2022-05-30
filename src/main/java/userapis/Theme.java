package userapis;

public class Theme{
	private NormalTab normal_tab;
	private SelectedTab selected_tab;
	private Object new_background;
	private String background;
	private String screen;
	private String type;
	public NormalTab getNormal_tab() {
		return normal_tab;
	}
	public void setNormal_tab(NormalTab normal_tab) {
		this.normal_tab = normal_tab;
	}
	public SelectedTab getSelected_tab() {
		return selected_tab;
	}
	public void setSelected_tab(SelectedTab selected_tab) {
		this.selected_tab = selected_tab;
	}
	public Object getNew_background() {
		return new_background;
	}
	public void setNew_background(Object new_background) {
		this.new_background = new_background;
	}
	public String getBackground() {
		return background;
	}
	public void setBackground(String background) {
		this.background = background;
	}
	public String getScreen() {
		return screen;
	}
	public void setScreen(String screen) {
		this.screen = screen;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
