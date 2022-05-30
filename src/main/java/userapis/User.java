package userapis;

import java.sql.Date;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User{
    private String country;
    private Role role;
    private CustomizeInfo customize_info;
    private Object city;
    private Object signature;
    @JsonProperty("Current_Shift") 
    private Object current_Shift;
    private String name_format;
    private String language;
    private boolean microsoft;
    private String locale;
    private boolean personal_account;
    @JsonProperty("Isonline") 
    private boolean isonline;
    private String default_tab_group;
    @JsonProperty("Modified_By") 
    private ModifiedBy modified_By;
    private Object street;
    private Object alias;
    private Theme theme;
    private String id;
    private String state;
    private Object fax;
    private String country_locale;
    private boolean sandboxDeveloper;
    private String first_name;
    private String email;
    @JsonProperty("Reporting_To") 
    private Object reporting_To;
    private Object zip;
    private String decimal_separator;
    private Date created_time;
    private Object website;
    @JsonProperty("Modified_Time") 
    private Date modified_Time;
    private String time_format;
    private int offset;
    private Profile profile;
    private Object mobile;
    @JsonProperty("Next_Shift") 
    private Object next_Shift;
    private String last_name;
    private String time_zone;
    private CreatedBy created_by;
    @JsonProperty("Shift_Effective_From") 
    private Object shift_Effective_From;
    private String zuid;
    private boolean confirm;
    private String full_name;
    private ArrayList<Object> territories;
    private Object phone;
    private Object dob;
    private String date_format;
    private String status;
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public CustomizeInfo getCustomize_info() {
		return customize_info;
	}
	public void setCustomize_info(CustomizeInfo customize_info) {
		this.customize_info = customize_info;
	}
	public Object getCity() {
		return city;
	}
	public void setCity(Object city) {
		this.city = city;
	}
	public Object getSignature() {
		return signature;
	}
	public void setSignature(Object signature) {
		this.signature = signature;
	}
	public Object getCurrent_Shift() {
		return current_Shift;
	}
	public void setCurrent_Shift(Object current_Shift) {
		this.current_Shift = current_Shift;
	}
	public String getName_format() {
		return name_format;
	}
	public void setName_format(String name_format) {
		this.name_format = name_format;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public boolean isMicrosoft() {
		return microsoft;
	}
	public void setMicrosoft(boolean microsoft) {
		this.microsoft = microsoft;
	}
	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}
	public boolean isPersonal_account() {
		return personal_account;
	}
	public void setPersonal_account(boolean personal_account) {
		this.personal_account = personal_account;
	}
	public boolean isIsonline() {
		return isonline;
	}
	public void setIsonline(boolean isonline) {
		this.isonline = isonline;
	}
	public String getDefault_tab_group() {
		return default_tab_group;
	}
	public void setDefault_tab_group(String default_tab_group) {
		this.default_tab_group = default_tab_group;
	}
	public ModifiedBy getModified_By() {
		return modified_By;
	}
	public void setModified_By(ModifiedBy modified_By) {
		this.modified_By = modified_By;
	}
	public Object getStreet() {
		return street;
	}
	public void setStreet(Object street) {
		this.street = street;
	}
	public Object getAlias() {
		return alias;
	}
	public void setAlias(Object alias) {
		this.alias = alias;
	}
	public Theme getTheme() {
		return theme;
	}
	public void setTheme(Theme theme) {
		this.theme = theme;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Object getFax() {
		return fax;
	}
	public void setFax(Object fax) {
		this.fax = fax;
	}
	public String getCountry_locale() {
		return country_locale;
	}
	public void setCountry_locale(String country_locale) {
		this.country_locale = country_locale;
	}
	public boolean isSandboxDeveloper() {
		return sandboxDeveloper;
	}
	public void setSandboxDeveloper(boolean sandboxDeveloper) {
		this.sandboxDeveloper = sandboxDeveloper;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Object getReporting_To() {
		return reporting_To;
	}
	public void setReporting_To(Object reporting_To) {
		this.reporting_To = reporting_To;
	}
	public Object getZip() {
		return zip;
	}
	public void setZip(Object zip) {
		this.zip = zip;
	}
	public String getDecimal_separator() {
		return decimal_separator;
	}
	public void setDecimal_separator(String decimal_separator) {
		this.decimal_separator = decimal_separator;
	}
	public Date getCreated_time() {
		return created_time;
	}
	public void setCreated_time(Date created_time) {
		this.created_time = created_time;
	}
	public Object getWebsite() {
		return website;
	}
	public void setWebsite(Object website) {
		this.website = website;
	}
	public Date getModified_Time() {
		return modified_Time;
	}
	public void setModified_Time(Date modified_Time) {
		this.modified_Time = modified_Time;
	}
	public String getTime_format() {
		return time_format;
	}
	public void setTime_format(String time_format) {
		this.time_format = time_format;
	}
	public int getOffset() {
		return offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
	public Profile getProfile() {
		return profile;
	}
	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	public Object getMobile() {
		return mobile;
	}
	public void setMobile(Object mobile) {
		this.mobile = mobile;
	}
	public Object getNext_Shift() {
		return next_Shift;
	}
	public void setNext_Shift(Object next_Shift) {
		this.next_Shift = next_Shift;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getTime_zone() {
		return time_zone;
	}
	public void setTime_zone(String time_zone) {
		this.time_zone = time_zone;
	}
	public CreatedBy getCreated_by() {
		return created_by;
	}
	public void setCreated_by(CreatedBy created_by) {
		this.created_by = created_by;
	}
	public Object getShift_Effective_From() {
		return shift_Effective_From;
	}
	public void setShift_Effective_From(Object shift_Effective_From) {
		this.shift_Effective_From = shift_Effective_From;
	}
	public String getZuid() {
		return zuid;
	}
	public void setZuid(String zuid) {
		this.zuid = zuid;
	}
	public boolean isConfirm() {
		return confirm;
	}
	public void setConfirm(boolean confirm) {
		this.confirm = confirm;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public ArrayList<Object> getTerritories() {
		return territories;
	}
	public void setTerritories(ArrayList<Object> territories) {
		this.territories = territories;
	}
	public Object getPhone() {
		return phone;
	}
	public void setPhone(Object phone) {
		this.phone = phone;
	}
	public Object getDob() {
		return dob;
	}
	public void setDob(Object dob) {
		this.dob = dob;
	}
	public String getDate_format() {
		return date_format;
	}
	public void setDate_format(String date_format) {
		this.date_format = date_format;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
