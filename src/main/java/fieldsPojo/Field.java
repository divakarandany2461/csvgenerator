package fieldsPojo;

import java.util.ArrayList;

public class Field{
    private boolean system_mandatory;
    private boolean webhook;
    private String json_type;
    private Object crypt;
    private String field_label;
    private Object tooltip;
    private String created_source;
    private boolean field_read_only;
    private String display_label;
    private int ui_type;
    private boolean read_only;
    private Object association_details;
    private boolean businesscard_supported;
    private Currency currency;
    private String id;
    private boolean custom_field;
    private Lookup lookup;
    private ConvertMapping convert_mapping;
    private boolean visible;
    private int length;
    private ViewType view_type;
    private Object subform;
    private Object external;
    private String api_name;
    private Unique unique;
    private boolean history_tracking;
    private String data_type;
    private Formula formula;
    private SubModule sub_module;
    private int decimal_place;
    private boolean mass_update;
    private Multiselectlookup multiselectlookup;
    private ArrayList<PickListValue> pick_list_values;
    private AutoNumber auto_number;
    private String quick_sequence_number;
    private boolean blueprint_supported;
    private String column_name;
	public boolean isSystem_mandatory() {
		return system_mandatory;
	}
	public void setSystem_mandatory(boolean system_mandatory) {
		this.system_mandatory = system_mandatory;
	}
	public boolean isWebhook() {
		return webhook;
	}
	public void setWebhook(boolean webhook) {
		this.webhook = webhook;
	}
	public String getJson_type() {
		return json_type;
	}
	public void setJson_type(String json_type) {
		this.json_type = json_type;
	}
	public Object getCrypt() {
		return crypt;
	}
	public void setCrypt(Object crypt) {
		this.crypt = crypt;
	}
	public String getField_label() {
		return field_label;
	}
	public void setField_label(String field_label) {
		this.field_label = field_label;
	}
	public Object getTooltip() {
		return tooltip;
	}
	public void setTooltip(Object tooltip) {
		this.tooltip = tooltip;
	}
	public String getCreated_source() {
		return created_source;
	}
	public void setCreated_source(String created_source) {
		this.created_source = created_source;
	}
	public boolean isField_read_only() {
		return field_read_only;
	}
	public void setField_read_only(boolean field_read_only) {
		this.field_read_only = field_read_only;
	}
	public String getDisplay_label() {
		return display_label;
	}
	public void setDisplay_label(String display_label) {
		this.display_label = display_label;
	}
	public int getUi_type() {
		return ui_type;
	}
	public void setUi_type(int ui_type) {
		this.ui_type = ui_type;
	}
	public boolean isRead_only() {
		return read_only;
	}
	public void setRead_only(boolean read_only) {
		this.read_only = read_only;
	}
	public Object getAssociation_details() {
		return association_details;
	}
	public void setAssociation_details(Object association_details) {
		this.association_details = association_details;
	}
	public boolean isBusinesscard_supported() {
		return businesscard_supported;
	}
	public void setBusinesscard_supported(boolean businesscard_supported) {
		this.businesscard_supported = businesscard_supported;
	}
	public Currency getCurrency() {
		return currency;
	}
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public boolean isCustom_field() {
		return custom_field;
	}
	public void setCustom_field(boolean custom_field) {
		this.custom_field = custom_field;
	}
	public Lookup getLookup() {
		return lookup;
	}
	public void setLookup(Lookup lookup) {
		this.lookup = lookup;
	}
	public ConvertMapping getConvert_mapping() {
		return convert_mapping;
	}
	public void setConvert_mapping(ConvertMapping convert_mapping) {
		this.convert_mapping = convert_mapping;
	}
	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public ViewType getView_type() {
		return view_type;
	}
	public void setView_type(ViewType view_type) {
		this.view_type = view_type;
	}
	public Object getSubform() {
		return subform;
	}
	public void setSubform(Object subform) {
		this.subform = subform;
	}
	public Object getExternal() {
		return external;
	}
	public void setExternal(Object external) {
		this.external = external;
	}
	public String getApi_name() {
		return api_name;
	}
	public void setApi_name(String api_name) {
		this.api_name = api_name;
	}
	public Unique getUnique() {
		return unique;
	}
	public void setUnique(Unique unique) {
		this.unique = unique;
	}
	public boolean isHistory_tracking() {
		return history_tracking;
	}
	public void setHistory_tracking(boolean history_tracking) {
		this.history_tracking = history_tracking;
	}
	public String getData_type() {
		return data_type;
	}
	public void setData_type(String data_type) {
		this.data_type = data_type;
	}
	public Formula getFormula() {
		return formula;
	}
	public void setFormula(Formula formula) {
		this.formula = formula;
	}
	public SubModule getSub_module() {
		return sub_module;
	}
	public void setSub_module(SubModule sub_module) {
		this.sub_module = sub_module;
	}
	public int getDecimal_place() {
		return decimal_place;
	}
	public void setDecimal_place(int decimal_place) {
		this.decimal_place = decimal_place;
	}
	public boolean isMass_update() {
		return mass_update;
	}
	public void setMass_update(boolean mass_update) {
		this.mass_update = mass_update;
	}
	public Multiselectlookup getMultiselectlookup() {
		return multiselectlookup;
	}
	public void setMultiselectlookup(Multiselectlookup multiselectlookup) {
		this.multiselectlookup = multiselectlookup;
	}
	public ArrayList<PickListValue> getPick_list_values() {
		return pick_list_values;
	}
	public void setPick_list_values(ArrayList<PickListValue> pick_list_values) {
		this.pick_list_values = pick_list_values;
	}
	public AutoNumber getAuto_number() {
		return auto_number;
	}
	public void setAuto_number(AutoNumber auto_number) {
		this.auto_number = auto_number;
	}
	public String getQuick_sequence_number() {
		return quick_sequence_number;
	}
	public void setQuick_sequence_number(String quick_sequence_number) {
		this.quick_sequence_number = quick_sequence_number;
	}
	public boolean isBlueprint_supported() {
		return blueprint_supported;
	}
	public void setBlueprint_supported(boolean blueprint_supported) {
		this.blueprint_supported = blueprint_supported;
	}
	public String getColumn_name() {
		return column_name;
	}
	public void setColumn_name(String column_name) {
		this.column_name = column_name;
	}
    
}
