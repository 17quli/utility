// ORM class for table 'tblcustomerinfo'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Dec 03 23:31:29 NZDT 2020
// For connector: org.apache.sqoop.manager.SQLServerManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import org.apache.sqoop.lib.JdbcWritableBridge;
import org.apache.sqoop.lib.DelimiterSet;
import org.apache.sqoop.lib.FieldFormatter;
import org.apache.sqoop.lib.RecordParser;
import org.apache.sqoop.lib.BooleanParser;
import org.apache.sqoop.lib.BlobRef;
import org.apache.sqoop.lib.ClobRef;
import org.apache.sqoop.lib.LargeObjectLoader;
import org.apache.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class tblcustomerinfo extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.flngCustomerKey = (Integer)value;
      }
    });
    setters.put("flngJointCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.flngJointCustomerKey = (Integer)value;
      }
    });
    setters.put("fblnPrime", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.fblnPrime = (Integer)value;
      }
    });
    setters.put("fstrCustomerType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.fstrCustomerType = (String)value;
      }
    });
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("flngFolderKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.flngFolderKey = (Integer)value;
      }
    });
    setters.put("fblnDefault", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.fblnDefault = (Integer)value;
      }
    });
    setters.put("fintProfileNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.fintProfileNumber = (Integer)value;
      }
    });
    setters.put("fdtmCommence", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.fdtmCommence = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmCease", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.fdtmCease = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmCreated", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.fdtmCreated = (java.sql.Timestamp)value;
      }
    });
    setters.put("fi64NameKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.fi64NameKey = (Long)value;
      }
    });
    setters.put("fintNameKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.fintNameKey = (Integer)value;
      }
    });
    setters.put("fstrDisplay", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.fstrDisplay = (String)value;
      }
    });
    setters.put("fblnFormatted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.fblnFormatted = (Integer)value;
      }
    });
    setters.put("fstrNameType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.fstrNameType = (String)value;
      }
    });
    setters.put("fstrFamilyName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.fstrFamilyName = (String)value;
      }
    });
    setters.put("fstrMiddleName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.fstrMiddleName = (String)value;
      }
    });
    setters.put("fstrFirstName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.fstrFirstName = (String)value;
      }
    });
    setters.put("fstrNameControl", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.fstrNameControl = (String)value;
      }
    });
    setters.put("fstrTitle", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.fstrTitle = (String)value;
      }
    });
    setters.put("fstrSuffix", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.fstrSuffix = (String)value;
      }
    });
    setters.put("fstrFreeFormatName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.fstrFreeFormatName = (String)value;
      }
    });
    setters.put("fstrListFormatName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.fstrListFormatName = (String)value;
      }
    });
    setters.put("fstrAdditionalName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.fstrAdditionalName = (String)value;
      }
    });
    setters.put("fstrAdditionalName2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.fstrAdditionalName2 = (String)value;
      }
    });
    setters.put("fi64AddressKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.fi64AddressKey = (Long)value;
      }
    });
    setters.put("fintAddressKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.fintAddressKey = (Integer)value;
      }
    });
    setters.put("fstrAddressType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.fstrAddressType = (String)value;
      }
    });
    setters.put("fstrStreet", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.fstrStreet = (String)value;
      }
    });
    setters.put("fstrStreet2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.fstrStreet2 = (String)value;
      }
    });
    setters.put("fstrUnitType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.fstrUnitType = (String)value;
      }
    });
    setters.put("fstrUnit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.fstrUnit = (String)value;
      }
    });
    setters.put("fstrCity", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.fstrCity = (String)value;
      }
    });
    setters.put("fstrCounty", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.fstrCounty = (String)value;
      }
    });
    setters.put("fstrState", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.fstrState = (String)value;
      }
    });
    setters.put("fstrZip", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.fstrZip = (String)value;
      }
    });
    setters.put("fstrCountry", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.fstrCountry = (String)value;
      }
    });
    setters.put("fstrAttention", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.fstrAttention = (String)value;
      }
    });
    setters.put("fstrLocationCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.fstrLocationCode = (String)value;
      }
    });
    setters.put("fstrUrbanization", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.fstrUrbanization = (String)value;
      }
    });
    setters.put("fstrMunicipality", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.fstrMunicipality = (String)value;
      }
    });
    setters.put("fstrDistrict", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.fstrDistrict = (String)value;
      }
    });
    setters.put("fstrSubDistrict", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.fstrSubDistrict = (String)value;
      }
    });
    setters.put("fstrSubProvince", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.fstrSubProvince = (String)value;
      }
    });
    setters.put("fstrAddressDescription", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.fstrAddressDescription = (String)value;
      }
    });
    setters.put("fstrListFormatAddress", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.fstrListFormatAddress = (String)value;
      }
    });
    setters.put("flngIDKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.flngIDKey = (Integer)value;
      }
    });
    setters.put("fstrIDType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.fstrIDType = (String)value;
      }
    });
    setters.put("fstrID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.fstrID = (String)value;
      }
    });
    setters.put("fstrFormattedID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.fstrFormattedID = (String)value;
      }
    });
    setters.put("fstrDistrictOffice", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.fstrDistrictOffice = (String)value;
      }
    });
    setters.put("fstrCollectDistrictOffice", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.fstrCollectDistrictOffice = (String)value;
      }
    });
    setters.put("fstrReviewType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.fstrReviewType = (String)value;
      }
    });
    setters.put("fstrCustomerLevel", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.fstrCustomerLevel = (String)value;
      }
    });
    setters.put("fi64ProtectedDataSource", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.fi64ProtectedDataSource = (Long)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomerinfo.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblcustomerinfo() {
    init0();
  }
  private Integer flngCustomerKey;
  public Integer get_flngCustomerKey() {
    return flngCustomerKey;
  }
  public void set_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
  }
  public tblcustomerinfo with_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
    return this;
  }
  private Integer flngJointCustomerKey;
  public Integer get_flngJointCustomerKey() {
    return flngJointCustomerKey;
  }
  public void set_flngJointCustomerKey(Integer flngJointCustomerKey) {
    this.flngJointCustomerKey = flngJointCustomerKey;
  }
  public tblcustomerinfo with_flngJointCustomerKey(Integer flngJointCustomerKey) {
    this.flngJointCustomerKey = flngJointCustomerKey;
    return this;
  }
  private Integer fblnPrime;
  public Integer get_fblnPrime() {
    return fblnPrime;
  }
  public void set_fblnPrime(Integer fblnPrime) {
    this.fblnPrime = fblnPrime;
  }
  public tblcustomerinfo with_fblnPrime(Integer fblnPrime) {
    this.fblnPrime = fblnPrime;
    return this;
  }
  private String fstrCustomerType;
  public String get_fstrCustomerType() {
    return fstrCustomerType;
  }
  public void set_fstrCustomerType(String fstrCustomerType) {
    this.fstrCustomerType = fstrCustomerType;
  }
  public tblcustomerinfo with_fstrCustomerType(String fstrCustomerType) {
    this.fstrCustomerType = fstrCustomerType;
    return this;
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblcustomerinfo with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private Integer flngFolderKey;
  public Integer get_flngFolderKey() {
    return flngFolderKey;
  }
  public void set_flngFolderKey(Integer flngFolderKey) {
    this.flngFolderKey = flngFolderKey;
  }
  public tblcustomerinfo with_flngFolderKey(Integer flngFolderKey) {
    this.flngFolderKey = flngFolderKey;
    return this;
  }
  private Integer fblnDefault;
  public Integer get_fblnDefault() {
    return fblnDefault;
  }
  public void set_fblnDefault(Integer fblnDefault) {
    this.fblnDefault = fblnDefault;
  }
  public tblcustomerinfo with_fblnDefault(Integer fblnDefault) {
    this.fblnDefault = fblnDefault;
    return this;
  }
  private Integer fintProfileNumber;
  public Integer get_fintProfileNumber() {
    return fintProfileNumber;
  }
  public void set_fintProfileNumber(Integer fintProfileNumber) {
    this.fintProfileNumber = fintProfileNumber;
  }
  public tblcustomerinfo with_fintProfileNumber(Integer fintProfileNumber) {
    this.fintProfileNumber = fintProfileNumber;
    return this;
  }
  private java.sql.Timestamp fdtmCommence;
  public java.sql.Timestamp get_fdtmCommence() {
    return fdtmCommence;
  }
  public void set_fdtmCommence(java.sql.Timestamp fdtmCommence) {
    this.fdtmCommence = fdtmCommence;
  }
  public tblcustomerinfo with_fdtmCommence(java.sql.Timestamp fdtmCommence) {
    this.fdtmCommence = fdtmCommence;
    return this;
  }
  private java.sql.Timestamp fdtmCease;
  public java.sql.Timestamp get_fdtmCease() {
    return fdtmCease;
  }
  public void set_fdtmCease(java.sql.Timestamp fdtmCease) {
    this.fdtmCease = fdtmCease;
  }
  public tblcustomerinfo with_fdtmCease(java.sql.Timestamp fdtmCease) {
    this.fdtmCease = fdtmCease;
    return this;
  }
  private java.sql.Timestamp fdtmCreated;
  public java.sql.Timestamp get_fdtmCreated() {
    return fdtmCreated;
  }
  public void set_fdtmCreated(java.sql.Timestamp fdtmCreated) {
    this.fdtmCreated = fdtmCreated;
  }
  public tblcustomerinfo with_fdtmCreated(java.sql.Timestamp fdtmCreated) {
    this.fdtmCreated = fdtmCreated;
    return this;
  }
  private Long fi64NameKey;
  public Long get_fi64NameKey() {
    return fi64NameKey;
  }
  public void set_fi64NameKey(Long fi64NameKey) {
    this.fi64NameKey = fi64NameKey;
  }
  public tblcustomerinfo with_fi64NameKey(Long fi64NameKey) {
    this.fi64NameKey = fi64NameKey;
    return this;
  }
  private Integer fintNameKey;
  public Integer get_fintNameKey() {
    return fintNameKey;
  }
  public void set_fintNameKey(Integer fintNameKey) {
    this.fintNameKey = fintNameKey;
  }
  public tblcustomerinfo with_fintNameKey(Integer fintNameKey) {
    this.fintNameKey = fintNameKey;
    return this;
  }
  private String fstrDisplay;
  public String get_fstrDisplay() {
    return fstrDisplay;
  }
  public void set_fstrDisplay(String fstrDisplay) {
    this.fstrDisplay = fstrDisplay;
  }
  public tblcustomerinfo with_fstrDisplay(String fstrDisplay) {
    this.fstrDisplay = fstrDisplay;
    return this;
  }
  private Integer fblnFormatted;
  public Integer get_fblnFormatted() {
    return fblnFormatted;
  }
  public void set_fblnFormatted(Integer fblnFormatted) {
    this.fblnFormatted = fblnFormatted;
  }
  public tblcustomerinfo with_fblnFormatted(Integer fblnFormatted) {
    this.fblnFormatted = fblnFormatted;
    return this;
  }
  private String fstrNameType;
  public String get_fstrNameType() {
    return fstrNameType;
  }
  public void set_fstrNameType(String fstrNameType) {
    this.fstrNameType = fstrNameType;
  }
  public tblcustomerinfo with_fstrNameType(String fstrNameType) {
    this.fstrNameType = fstrNameType;
    return this;
  }
  private String fstrFamilyName;
  public String get_fstrFamilyName() {
    return fstrFamilyName;
  }
  public void set_fstrFamilyName(String fstrFamilyName) {
    this.fstrFamilyName = fstrFamilyName;
  }
  public tblcustomerinfo with_fstrFamilyName(String fstrFamilyName) {
    this.fstrFamilyName = fstrFamilyName;
    return this;
  }
  private String fstrMiddleName;
  public String get_fstrMiddleName() {
    return fstrMiddleName;
  }
  public void set_fstrMiddleName(String fstrMiddleName) {
    this.fstrMiddleName = fstrMiddleName;
  }
  public tblcustomerinfo with_fstrMiddleName(String fstrMiddleName) {
    this.fstrMiddleName = fstrMiddleName;
    return this;
  }
  private String fstrFirstName;
  public String get_fstrFirstName() {
    return fstrFirstName;
  }
  public void set_fstrFirstName(String fstrFirstName) {
    this.fstrFirstName = fstrFirstName;
  }
  public tblcustomerinfo with_fstrFirstName(String fstrFirstName) {
    this.fstrFirstName = fstrFirstName;
    return this;
  }
  private String fstrNameControl;
  public String get_fstrNameControl() {
    return fstrNameControl;
  }
  public void set_fstrNameControl(String fstrNameControl) {
    this.fstrNameControl = fstrNameControl;
  }
  public tblcustomerinfo with_fstrNameControl(String fstrNameControl) {
    this.fstrNameControl = fstrNameControl;
    return this;
  }
  private String fstrTitle;
  public String get_fstrTitle() {
    return fstrTitle;
  }
  public void set_fstrTitle(String fstrTitle) {
    this.fstrTitle = fstrTitle;
  }
  public tblcustomerinfo with_fstrTitle(String fstrTitle) {
    this.fstrTitle = fstrTitle;
    return this;
  }
  private String fstrSuffix;
  public String get_fstrSuffix() {
    return fstrSuffix;
  }
  public void set_fstrSuffix(String fstrSuffix) {
    this.fstrSuffix = fstrSuffix;
  }
  public tblcustomerinfo with_fstrSuffix(String fstrSuffix) {
    this.fstrSuffix = fstrSuffix;
    return this;
  }
  private String fstrFreeFormatName;
  public String get_fstrFreeFormatName() {
    return fstrFreeFormatName;
  }
  public void set_fstrFreeFormatName(String fstrFreeFormatName) {
    this.fstrFreeFormatName = fstrFreeFormatName;
  }
  public tblcustomerinfo with_fstrFreeFormatName(String fstrFreeFormatName) {
    this.fstrFreeFormatName = fstrFreeFormatName;
    return this;
  }
  private String fstrListFormatName;
  public String get_fstrListFormatName() {
    return fstrListFormatName;
  }
  public void set_fstrListFormatName(String fstrListFormatName) {
    this.fstrListFormatName = fstrListFormatName;
  }
  public tblcustomerinfo with_fstrListFormatName(String fstrListFormatName) {
    this.fstrListFormatName = fstrListFormatName;
    return this;
  }
  private String fstrAdditionalName;
  public String get_fstrAdditionalName() {
    return fstrAdditionalName;
  }
  public void set_fstrAdditionalName(String fstrAdditionalName) {
    this.fstrAdditionalName = fstrAdditionalName;
  }
  public tblcustomerinfo with_fstrAdditionalName(String fstrAdditionalName) {
    this.fstrAdditionalName = fstrAdditionalName;
    return this;
  }
  private String fstrAdditionalName2;
  public String get_fstrAdditionalName2() {
    return fstrAdditionalName2;
  }
  public void set_fstrAdditionalName2(String fstrAdditionalName2) {
    this.fstrAdditionalName2 = fstrAdditionalName2;
  }
  public tblcustomerinfo with_fstrAdditionalName2(String fstrAdditionalName2) {
    this.fstrAdditionalName2 = fstrAdditionalName2;
    return this;
  }
  private Long fi64AddressKey;
  public Long get_fi64AddressKey() {
    return fi64AddressKey;
  }
  public void set_fi64AddressKey(Long fi64AddressKey) {
    this.fi64AddressKey = fi64AddressKey;
  }
  public tblcustomerinfo with_fi64AddressKey(Long fi64AddressKey) {
    this.fi64AddressKey = fi64AddressKey;
    return this;
  }
  private Integer fintAddressKey;
  public Integer get_fintAddressKey() {
    return fintAddressKey;
  }
  public void set_fintAddressKey(Integer fintAddressKey) {
    this.fintAddressKey = fintAddressKey;
  }
  public tblcustomerinfo with_fintAddressKey(Integer fintAddressKey) {
    this.fintAddressKey = fintAddressKey;
    return this;
  }
  private String fstrAddressType;
  public String get_fstrAddressType() {
    return fstrAddressType;
  }
  public void set_fstrAddressType(String fstrAddressType) {
    this.fstrAddressType = fstrAddressType;
  }
  public tblcustomerinfo with_fstrAddressType(String fstrAddressType) {
    this.fstrAddressType = fstrAddressType;
    return this;
  }
  private String fstrStreet;
  public String get_fstrStreet() {
    return fstrStreet;
  }
  public void set_fstrStreet(String fstrStreet) {
    this.fstrStreet = fstrStreet;
  }
  public tblcustomerinfo with_fstrStreet(String fstrStreet) {
    this.fstrStreet = fstrStreet;
    return this;
  }
  private String fstrStreet2;
  public String get_fstrStreet2() {
    return fstrStreet2;
  }
  public void set_fstrStreet2(String fstrStreet2) {
    this.fstrStreet2 = fstrStreet2;
  }
  public tblcustomerinfo with_fstrStreet2(String fstrStreet2) {
    this.fstrStreet2 = fstrStreet2;
    return this;
  }
  private String fstrUnitType;
  public String get_fstrUnitType() {
    return fstrUnitType;
  }
  public void set_fstrUnitType(String fstrUnitType) {
    this.fstrUnitType = fstrUnitType;
  }
  public tblcustomerinfo with_fstrUnitType(String fstrUnitType) {
    this.fstrUnitType = fstrUnitType;
    return this;
  }
  private String fstrUnit;
  public String get_fstrUnit() {
    return fstrUnit;
  }
  public void set_fstrUnit(String fstrUnit) {
    this.fstrUnit = fstrUnit;
  }
  public tblcustomerinfo with_fstrUnit(String fstrUnit) {
    this.fstrUnit = fstrUnit;
    return this;
  }
  private String fstrCity;
  public String get_fstrCity() {
    return fstrCity;
  }
  public void set_fstrCity(String fstrCity) {
    this.fstrCity = fstrCity;
  }
  public tblcustomerinfo with_fstrCity(String fstrCity) {
    this.fstrCity = fstrCity;
    return this;
  }
  private String fstrCounty;
  public String get_fstrCounty() {
    return fstrCounty;
  }
  public void set_fstrCounty(String fstrCounty) {
    this.fstrCounty = fstrCounty;
  }
  public tblcustomerinfo with_fstrCounty(String fstrCounty) {
    this.fstrCounty = fstrCounty;
    return this;
  }
  private String fstrState;
  public String get_fstrState() {
    return fstrState;
  }
  public void set_fstrState(String fstrState) {
    this.fstrState = fstrState;
  }
  public tblcustomerinfo with_fstrState(String fstrState) {
    this.fstrState = fstrState;
    return this;
  }
  private String fstrZip;
  public String get_fstrZip() {
    return fstrZip;
  }
  public void set_fstrZip(String fstrZip) {
    this.fstrZip = fstrZip;
  }
  public tblcustomerinfo with_fstrZip(String fstrZip) {
    this.fstrZip = fstrZip;
    return this;
  }
  private String fstrCountry;
  public String get_fstrCountry() {
    return fstrCountry;
  }
  public void set_fstrCountry(String fstrCountry) {
    this.fstrCountry = fstrCountry;
  }
  public tblcustomerinfo with_fstrCountry(String fstrCountry) {
    this.fstrCountry = fstrCountry;
    return this;
  }
  private String fstrAttention;
  public String get_fstrAttention() {
    return fstrAttention;
  }
  public void set_fstrAttention(String fstrAttention) {
    this.fstrAttention = fstrAttention;
  }
  public tblcustomerinfo with_fstrAttention(String fstrAttention) {
    this.fstrAttention = fstrAttention;
    return this;
  }
  private String fstrLocationCode;
  public String get_fstrLocationCode() {
    return fstrLocationCode;
  }
  public void set_fstrLocationCode(String fstrLocationCode) {
    this.fstrLocationCode = fstrLocationCode;
  }
  public tblcustomerinfo with_fstrLocationCode(String fstrLocationCode) {
    this.fstrLocationCode = fstrLocationCode;
    return this;
  }
  private String fstrUrbanization;
  public String get_fstrUrbanization() {
    return fstrUrbanization;
  }
  public void set_fstrUrbanization(String fstrUrbanization) {
    this.fstrUrbanization = fstrUrbanization;
  }
  public tblcustomerinfo with_fstrUrbanization(String fstrUrbanization) {
    this.fstrUrbanization = fstrUrbanization;
    return this;
  }
  private String fstrMunicipality;
  public String get_fstrMunicipality() {
    return fstrMunicipality;
  }
  public void set_fstrMunicipality(String fstrMunicipality) {
    this.fstrMunicipality = fstrMunicipality;
  }
  public tblcustomerinfo with_fstrMunicipality(String fstrMunicipality) {
    this.fstrMunicipality = fstrMunicipality;
    return this;
  }
  private String fstrDistrict;
  public String get_fstrDistrict() {
    return fstrDistrict;
  }
  public void set_fstrDistrict(String fstrDistrict) {
    this.fstrDistrict = fstrDistrict;
  }
  public tblcustomerinfo with_fstrDistrict(String fstrDistrict) {
    this.fstrDistrict = fstrDistrict;
    return this;
  }
  private String fstrSubDistrict;
  public String get_fstrSubDistrict() {
    return fstrSubDistrict;
  }
  public void set_fstrSubDistrict(String fstrSubDistrict) {
    this.fstrSubDistrict = fstrSubDistrict;
  }
  public tblcustomerinfo with_fstrSubDistrict(String fstrSubDistrict) {
    this.fstrSubDistrict = fstrSubDistrict;
    return this;
  }
  private String fstrSubProvince;
  public String get_fstrSubProvince() {
    return fstrSubProvince;
  }
  public void set_fstrSubProvince(String fstrSubProvince) {
    this.fstrSubProvince = fstrSubProvince;
  }
  public tblcustomerinfo with_fstrSubProvince(String fstrSubProvince) {
    this.fstrSubProvince = fstrSubProvince;
    return this;
  }
  private String fstrAddressDescription;
  public String get_fstrAddressDescription() {
    return fstrAddressDescription;
  }
  public void set_fstrAddressDescription(String fstrAddressDescription) {
    this.fstrAddressDescription = fstrAddressDescription;
  }
  public tblcustomerinfo with_fstrAddressDescription(String fstrAddressDescription) {
    this.fstrAddressDescription = fstrAddressDescription;
    return this;
  }
  private String fstrListFormatAddress;
  public String get_fstrListFormatAddress() {
    return fstrListFormatAddress;
  }
  public void set_fstrListFormatAddress(String fstrListFormatAddress) {
    this.fstrListFormatAddress = fstrListFormatAddress;
  }
  public tblcustomerinfo with_fstrListFormatAddress(String fstrListFormatAddress) {
    this.fstrListFormatAddress = fstrListFormatAddress;
    return this;
  }
  private Integer flngIDKey;
  public Integer get_flngIDKey() {
    return flngIDKey;
  }
  public void set_flngIDKey(Integer flngIDKey) {
    this.flngIDKey = flngIDKey;
  }
  public tblcustomerinfo with_flngIDKey(Integer flngIDKey) {
    this.flngIDKey = flngIDKey;
    return this;
  }
  private String fstrIDType;
  public String get_fstrIDType() {
    return fstrIDType;
  }
  public void set_fstrIDType(String fstrIDType) {
    this.fstrIDType = fstrIDType;
  }
  public tblcustomerinfo with_fstrIDType(String fstrIDType) {
    this.fstrIDType = fstrIDType;
    return this;
  }
  private String fstrID;
  public String get_fstrID() {
    return fstrID;
  }
  public void set_fstrID(String fstrID) {
    this.fstrID = fstrID;
  }
  public tblcustomerinfo with_fstrID(String fstrID) {
    this.fstrID = fstrID;
    return this;
  }
  private String fstrFormattedID;
  public String get_fstrFormattedID() {
    return fstrFormattedID;
  }
  public void set_fstrFormattedID(String fstrFormattedID) {
    this.fstrFormattedID = fstrFormattedID;
  }
  public tblcustomerinfo with_fstrFormattedID(String fstrFormattedID) {
    this.fstrFormattedID = fstrFormattedID;
    return this;
  }
  private String fstrDistrictOffice;
  public String get_fstrDistrictOffice() {
    return fstrDistrictOffice;
  }
  public void set_fstrDistrictOffice(String fstrDistrictOffice) {
    this.fstrDistrictOffice = fstrDistrictOffice;
  }
  public tblcustomerinfo with_fstrDistrictOffice(String fstrDistrictOffice) {
    this.fstrDistrictOffice = fstrDistrictOffice;
    return this;
  }
  private String fstrCollectDistrictOffice;
  public String get_fstrCollectDistrictOffice() {
    return fstrCollectDistrictOffice;
  }
  public void set_fstrCollectDistrictOffice(String fstrCollectDistrictOffice) {
    this.fstrCollectDistrictOffice = fstrCollectDistrictOffice;
  }
  public tblcustomerinfo with_fstrCollectDistrictOffice(String fstrCollectDistrictOffice) {
    this.fstrCollectDistrictOffice = fstrCollectDistrictOffice;
    return this;
  }
  private String fstrReviewType;
  public String get_fstrReviewType() {
    return fstrReviewType;
  }
  public void set_fstrReviewType(String fstrReviewType) {
    this.fstrReviewType = fstrReviewType;
  }
  public tblcustomerinfo with_fstrReviewType(String fstrReviewType) {
    this.fstrReviewType = fstrReviewType;
    return this;
  }
  private String fstrCustomerLevel;
  public String get_fstrCustomerLevel() {
    return fstrCustomerLevel;
  }
  public void set_fstrCustomerLevel(String fstrCustomerLevel) {
    this.fstrCustomerLevel = fstrCustomerLevel;
  }
  public tblcustomerinfo with_fstrCustomerLevel(String fstrCustomerLevel) {
    this.fstrCustomerLevel = fstrCustomerLevel;
    return this;
  }
  private Long fi64ProtectedDataSource;
  public Long get_fi64ProtectedDataSource() {
    return fi64ProtectedDataSource;
  }
  public void set_fi64ProtectedDataSource(Long fi64ProtectedDataSource) {
    this.fi64ProtectedDataSource = fi64ProtectedDataSource;
  }
  public tblcustomerinfo with_fi64ProtectedDataSource(Long fi64ProtectedDataSource) {
    this.fi64ProtectedDataSource = fi64ProtectedDataSource;
    return this;
  }
  private java.sql.Timestamp fdtmWhen;
  public java.sql.Timestamp get_fdtmWhen() {
    return fdtmWhen;
  }
  public void set_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
  }
  public tblcustomerinfo with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblcustomerinfo)) {
      return false;
    }
    tblcustomerinfo that = (tblcustomerinfo) o;
    boolean equal = true;
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.flngJointCustomerKey == null ? that.flngJointCustomerKey == null : this.flngJointCustomerKey.equals(that.flngJointCustomerKey));
    equal = equal && (this.fblnPrime == null ? that.fblnPrime == null : this.fblnPrime.equals(that.fblnPrime));
    equal = equal && (this.fstrCustomerType == null ? that.fstrCustomerType == null : this.fstrCustomerType.equals(that.fstrCustomerType));
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.flngFolderKey == null ? that.flngFolderKey == null : this.flngFolderKey.equals(that.flngFolderKey));
    equal = equal && (this.fblnDefault == null ? that.fblnDefault == null : this.fblnDefault.equals(that.fblnDefault));
    equal = equal && (this.fintProfileNumber == null ? that.fintProfileNumber == null : this.fintProfileNumber.equals(that.fintProfileNumber));
    equal = equal && (this.fdtmCommence == null ? that.fdtmCommence == null : this.fdtmCommence.equals(that.fdtmCommence));
    equal = equal && (this.fdtmCease == null ? that.fdtmCease == null : this.fdtmCease.equals(that.fdtmCease));
    equal = equal && (this.fdtmCreated == null ? that.fdtmCreated == null : this.fdtmCreated.equals(that.fdtmCreated));
    equal = equal && (this.fi64NameKey == null ? that.fi64NameKey == null : this.fi64NameKey.equals(that.fi64NameKey));
    equal = equal && (this.fintNameKey == null ? that.fintNameKey == null : this.fintNameKey.equals(that.fintNameKey));
    equal = equal && (this.fstrDisplay == null ? that.fstrDisplay == null : this.fstrDisplay.equals(that.fstrDisplay));
    equal = equal && (this.fblnFormatted == null ? that.fblnFormatted == null : this.fblnFormatted.equals(that.fblnFormatted));
    equal = equal && (this.fstrNameType == null ? that.fstrNameType == null : this.fstrNameType.equals(that.fstrNameType));
    equal = equal && (this.fstrFamilyName == null ? that.fstrFamilyName == null : this.fstrFamilyName.equals(that.fstrFamilyName));
    equal = equal && (this.fstrMiddleName == null ? that.fstrMiddleName == null : this.fstrMiddleName.equals(that.fstrMiddleName));
    equal = equal && (this.fstrFirstName == null ? that.fstrFirstName == null : this.fstrFirstName.equals(that.fstrFirstName));
    equal = equal && (this.fstrNameControl == null ? that.fstrNameControl == null : this.fstrNameControl.equals(that.fstrNameControl));
    equal = equal && (this.fstrTitle == null ? that.fstrTitle == null : this.fstrTitle.equals(that.fstrTitle));
    equal = equal && (this.fstrSuffix == null ? that.fstrSuffix == null : this.fstrSuffix.equals(that.fstrSuffix));
    equal = equal && (this.fstrFreeFormatName == null ? that.fstrFreeFormatName == null : this.fstrFreeFormatName.equals(that.fstrFreeFormatName));
    equal = equal && (this.fstrListFormatName == null ? that.fstrListFormatName == null : this.fstrListFormatName.equals(that.fstrListFormatName));
    equal = equal && (this.fstrAdditionalName == null ? that.fstrAdditionalName == null : this.fstrAdditionalName.equals(that.fstrAdditionalName));
    equal = equal && (this.fstrAdditionalName2 == null ? that.fstrAdditionalName2 == null : this.fstrAdditionalName2.equals(that.fstrAdditionalName2));
    equal = equal && (this.fi64AddressKey == null ? that.fi64AddressKey == null : this.fi64AddressKey.equals(that.fi64AddressKey));
    equal = equal && (this.fintAddressKey == null ? that.fintAddressKey == null : this.fintAddressKey.equals(that.fintAddressKey));
    equal = equal && (this.fstrAddressType == null ? that.fstrAddressType == null : this.fstrAddressType.equals(that.fstrAddressType));
    equal = equal && (this.fstrStreet == null ? that.fstrStreet == null : this.fstrStreet.equals(that.fstrStreet));
    equal = equal && (this.fstrStreet2 == null ? that.fstrStreet2 == null : this.fstrStreet2.equals(that.fstrStreet2));
    equal = equal && (this.fstrUnitType == null ? that.fstrUnitType == null : this.fstrUnitType.equals(that.fstrUnitType));
    equal = equal && (this.fstrUnit == null ? that.fstrUnit == null : this.fstrUnit.equals(that.fstrUnit));
    equal = equal && (this.fstrCity == null ? that.fstrCity == null : this.fstrCity.equals(that.fstrCity));
    equal = equal && (this.fstrCounty == null ? that.fstrCounty == null : this.fstrCounty.equals(that.fstrCounty));
    equal = equal && (this.fstrState == null ? that.fstrState == null : this.fstrState.equals(that.fstrState));
    equal = equal && (this.fstrZip == null ? that.fstrZip == null : this.fstrZip.equals(that.fstrZip));
    equal = equal && (this.fstrCountry == null ? that.fstrCountry == null : this.fstrCountry.equals(that.fstrCountry));
    equal = equal && (this.fstrAttention == null ? that.fstrAttention == null : this.fstrAttention.equals(that.fstrAttention));
    equal = equal && (this.fstrLocationCode == null ? that.fstrLocationCode == null : this.fstrLocationCode.equals(that.fstrLocationCode));
    equal = equal && (this.fstrUrbanization == null ? that.fstrUrbanization == null : this.fstrUrbanization.equals(that.fstrUrbanization));
    equal = equal && (this.fstrMunicipality == null ? that.fstrMunicipality == null : this.fstrMunicipality.equals(that.fstrMunicipality));
    equal = equal && (this.fstrDistrict == null ? that.fstrDistrict == null : this.fstrDistrict.equals(that.fstrDistrict));
    equal = equal && (this.fstrSubDistrict == null ? that.fstrSubDistrict == null : this.fstrSubDistrict.equals(that.fstrSubDistrict));
    equal = equal && (this.fstrSubProvince == null ? that.fstrSubProvince == null : this.fstrSubProvince.equals(that.fstrSubProvince));
    equal = equal && (this.fstrAddressDescription == null ? that.fstrAddressDescription == null : this.fstrAddressDescription.equals(that.fstrAddressDescription));
    equal = equal && (this.fstrListFormatAddress == null ? that.fstrListFormatAddress == null : this.fstrListFormatAddress.equals(that.fstrListFormatAddress));
    equal = equal && (this.flngIDKey == null ? that.flngIDKey == null : this.flngIDKey.equals(that.flngIDKey));
    equal = equal && (this.fstrIDType == null ? that.fstrIDType == null : this.fstrIDType.equals(that.fstrIDType));
    equal = equal && (this.fstrID == null ? that.fstrID == null : this.fstrID.equals(that.fstrID));
    equal = equal && (this.fstrFormattedID == null ? that.fstrFormattedID == null : this.fstrFormattedID.equals(that.fstrFormattedID));
    equal = equal && (this.fstrDistrictOffice == null ? that.fstrDistrictOffice == null : this.fstrDistrictOffice.equals(that.fstrDistrictOffice));
    equal = equal && (this.fstrCollectDistrictOffice == null ? that.fstrCollectDistrictOffice == null : this.fstrCollectDistrictOffice.equals(that.fstrCollectDistrictOffice));
    equal = equal && (this.fstrReviewType == null ? that.fstrReviewType == null : this.fstrReviewType.equals(that.fstrReviewType));
    equal = equal && (this.fstrCustomerLevel == null ? that.fstrCustomerLevel == null : this.fstrCustomerLevel.equals(that.fstrCustomerLevel));
    equal = equal && (this.fi64ProtectedDataSource == null ? that.fi64ProtectedDataSource == null : this.fi64ProtectedDataSource.equals(that.fi64ProtectedDataSource));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblcustomerinfo)) {
      return false;
    }
    tblcustomerinfo that = (tblcustomerinfo) o;
    boolean equal = true;
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.flngJointCustomerKey == null ? that.flngJointCustomerKey == null : this.flngJointCustomerKey.equals(that.flngJointCustomerKey));
    equal = equal && (this.fblnPrime == null ? that.fblnPrime == null : this.fblnPrime.equals(that.fblnPrime));
    equal = equal && (this.fstrCustomerType == null ? that.fstrCustomerType == null : this.fstrCustomerType.equals(that.fstrCustomerType));
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.flngFolderKey == null ? that.flngFolderKey == null : this.flngFolderKey.equals(that.flngFolderKey));
    equal = equal && (this.fblnDefault == null ? that.fblnDefault == null : this.fblnDefault.equals(that.fblnDefault));
    equal = equal && (this.fintProfileNumber == null ? that.fintProfileNumber == null : this.fintProfileNumber.equals(that.fintProfileNumber));
    equal = equal && (this.fdtmCommence == null ? that.fdtmCommence == null : this.fdtmCommence.equals(that.fdtmCommence));
    equal = equal && (this.fdtmCease == null ? that.fdtmCease == null : this.fdtmCease.equals(that.fdtmCease));
    equal = equal && (this.fdtmCreated == null ? that.fdtmCreated == null : this.fdtmCreated.equals(that.fdtmCreated));
    equal = equal && (this.fi64NameKey == null ? that.fi64NameKey == null : this.fi64NameKey.equals(that.fi64NameKey));
    equal = equal && (this.fintNameKey == null ? that.fintNameKey == null : this.fintNameKey.equals(that.fintNameKey));
    equal = equal && (this.fstrDisplay == null ? that.fstrDisplay == null : this.fstrDisplay.equals(that.fstrDisplay));
    equal = equal && (this.fblnFormatted == null ? that.fblnFormatted == null : this.fblnFormatted.equals(that.fblnFormatted));
    equal = equal && (this.fstrNameType == null ? that.fstrNameType == null : this.fstrNameType.equals(that.fstrNameType));
    equal = equal && (this.fstrFamilyName == null ? that.fstrFamilyName == null : this.fstrFamilyName.equals(that.fstrFamilyName));
    equal = equal && (this.fstrMiddleName == null ? that.fstrMiddleName == null : this.fstrMiddleName.equals(that.fstrMiddleName));
    equal = equal && (this.fstrFirstName == null ? that.fstrFirstName == null : this.fstrFirstName.equals(that.fstrFirstName));
    equal = equal && (this.fstrNameControl == null ? that.fstrNameControl == null : this.fstrNameControl.equals(that.fstrNameControl));
    equal = equal && (this.fstrTitle == null ? that.fstrTitle == null : this.fstrTitle.equals(that.fstrTitle));
    equal = equal && (this.fstrSuffix == null ? that.fstrSuffix == null : this.fstrSuffix.equals(that.fstrSuffix));
    equal = equal && (this.fstrFreeFormatName == null ? that.fstrFreeFormatName == null : this.fstrFreeFormatName.equals(that.fstrFreeFormatName));
    equal = equal && (this.fstrListFormatName == null ? that.fstrListFormatName == null : this.fstrListFormatName.equals(that.fstrListFormatName));
    equal = equal && (this.fstrAdditionalName == null ? that.fstrAdditionalName == null : this.fstrAdditionalName.equals(that.fstrAdditionalName));
    equal = equal && (this.fstrAdditionalName2 == null ? that.fstrAdditionalName2 == null : this.fstrAdditionalName2.equals(that.fstrAdditionalName2));
    equal = equal && (this.fi64AddressKey == null ? that.fi64AddressKey == null : this.fi64AddressKey.equals(that.fi64AddressKey));
    equal = equal && (this.fintAddressKey == null ? that.fintAddressKey == null : this.fintAddressKey.equals(that.fintAddressKey));
    equal = equal && (this.fstrAddressType == null ? that.fstrAddressType == null : this.fstrAddressType.equals(that.fstrAddressType));
    equal = equal && (this.fstrStreet == null ? that.fstrStreet == null : this.fstrStreet.equals(that.fstrStreet));
    equal = equal && (this.fstrStreet2 == null ? that.fstrStreet2 == null : this.fstrStreet2.equals(that.fstrStreet2));
    equal = equal && (this.fstrUnitType == null ? that.fstrUnitType == null : this.fstrUnitType.equals(that.fstrUnitType));
    equal = equal && (this.fstrUnit == null ? that.fstrUnit == null : this.fstrUnit.equals(that.fstrUnit));
    equal = equal && (this.fstrCity == null ? that.fstrCity == null : this.fstrCity.equals(that.fstrCity));
    equal = equal && (this.fstrCounty == null ? that.fstrCounty == null : this.fstrCounty.equals(that.fstrCounty));
    equal = equal && (this.fstrState == null ? that.fstrState == null : this.fstrState.equals(that.fstrState));
    equal = equal && (this.fstrZip == null ? that.fstrZip == null : this.fstrZip.equals(that.fstrZip));
    equal = equal && (this.fstrCountry == null ? that.fstrCountry == null : this.fstrCountry.equals(that.fstrCountry));
    equal = equal && (this.fstrAttention == null ? that.fstrAttention == null : this.fstrAttention.equals(that.fstrAttention));
    equal = equal && (this.fstrLocationCode == null ? that.fstrLocationCode == null : this.fstrLocationCode.equals(that.fstrLocationCode));
    equal = equal && (this.fstrUrbanization == null ? that.fstrUrbanization == null : this.fstrUrbanization.equals(that.fstrUrbanization));
    equal = equal && (this.fstrMunicipality == null ? that.fstrMunicipality == null : this.fstrMunicipality.equals(that.fstrMunicipality));
    equal = equal && (this.fstrDistrict == null ? that.fstrDistrict == null : this.fstrDistrict.equals(that.fstrDistrict));
    equal = equal && (this.fstrSubDistrict == null ? that.fstrSubDistrict == null : this.fstrSubDistrict.equals(that.fstrSubDistrict));
    equal = equal && (this.fstrSubProvince == null ? that.fstrSubProvince == null : this.fstrSubProvince.equals(that.fstrSubProvince));
    equal = equal && (this.fstrAddressDescription == null ? that.fstrAddressDescription == null : this.fstrAddressDescription.equals(that.fstrAddressDescription));
    equal = equal && (this.fstrListFormatAddress == null ? that.fstrListFormatAddress == null : this.fstrListFormatAddress.equals(that.fstrListFormatAddress));
    equal = equal && (this.flngIDKey == null ? that.flngIDKey == null : this.flngIDKey.equals(that.flngIDKey));
    equal = equal && (this.fstrIDType == null ? that.fstrIDType == null : this.fstrIDType.equals(that.fstrIDType));
    equal = equal && (this.fstrID == null ? that.fstrID == null : this.fstrID.equals(that.fstrID));
    equal = equal && (this.fstrFormattedID == null ? that.fstrFormattedID == null : this.fstrFormattedID.equals(that.fstrFormattedID));
    equal = equal && (this.fstrDistrictOffice == null ? that.fstrDistrictOffice == null : this.fstrDistrictOffice.equals(that.fstrDistrictOffice));
    equal = equal && (this.fstrCollectDistrictOffice == null ? that.fstrCollectDistrictOffice == null : this.fstrCollectDistrictOffice.equals(that.fstrCollectDistrictOffice));
    equal = equal && (this.fstrReviewType == null ? that.fstrReviewType == null : this.fstrReviewType.equals(that.fstrReviewType));
    equal = equal && (this.fstrCustomerLevel == null ? that.fstrCustomerLevel == null : this.fstrCustomerLevel.equals(that.fstrCustomerLevel));
    equal = equal && (this.fi64ProtectedDataSource == null ? that.fi64ProtectedDataSource == null : this.fi64ProtectedDataSource.equals(that.fi64ProtectedDataSource));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngCustomerKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngJointCustomerKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fblnPrime = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrCustomerType = JdbcWritableBridge.readString(4, __dbResults);
    this.flngDocKey = JdbcWritableBridge.readInteger(5, __dbResults);
    this.flngFolderKey = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fblnDefault = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fintProfileNumber = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fdtmCommence = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.fdtmCease = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.fdtmCreated = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.fi64NameKey = JdbcWritableBridge.readLong(12, __dbResults);
    this.fintNameKey = JdbcWritableBridge.readInteger(13, __dbResults);
    this.fstrDisplay = JdbcWritableBridge.readString(14, __dbResults);
    this.fblnFormatted = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fstrNameType = JdbcWritableBridge.readString(16, __dbResults);
    this.fstrFamilyName = JdbcWritableBridge.readString(17, __dbResults);
    this.fstrMiddleName = JdbcWritableBridge.readString(18, __dbResults);
    this.fstrFirstName = JdbcWritableBridge.readString(19, __dbResults);
    this.fstrNameControl = JdbcWritableBridge.readString(20, __dbResults);
    this.fstrTitle = JdbcWritableBridge.readString(21, __dbResults);
    this.fstrSuffix = JdbcWritableBridge.readString(22, __dbResults);
    this.fstrFreeFormatName = JdbcWritableBridge.readString(23, __dbResults);
    this.fstrListFormatName = JdbcWritableBridge.readString(24, __dbResults);
    this.fstrAdditionalName = JdbcWritableBridge.readString(25, __dbResults);
    this.fstrAdditionalName2 = JdbcWritableBridge.readString(26, __dbResults);
    this.fi64AddressKey = JdbcWritableBridge.readLong(27, __dbResults);
    this.fintAddressKey = JdbcWritableBridge.readInteger(28, __dbResults);
    this.fstrAddressType = JdbcWritableBridge.readString(29, __dbResults);
    this.fstrStreet = JdbcWritableBridge.readString(30, __dbResults);
    this.fstrStreet2 = JdbcWritableBridge.readString(31, __dbResults);
    this.fstrUnitType = JdbcWritableBridge.readString(32, __dbResults);
    this.fstrUnit = JdbcWritableBridge.readString(33, __dbResults);
    this.fstrCity = JdbcWritableBridge.readString(34, __dbResults);
    this.fstrCounty = JdbcWritableBridge.readString(35, __dbResults);
    this.fstrState = JdbcWritableBridge.readString(36, __dbResults);
    this.fstrZip = JdbcWritableBridge.readString(37, __dbResults);
    this.fstrCountry = JdbcWritableBridge.readString(38, __dbResults);
    this.fstrAttention = JdbcWritableBridge.readString(39, __dbResults);
    this.fstrLocationCode = JdbcWritableBridge.readString(40, __dbResults);
    this.fstrUrbanization = JdbcWritableBridge.readString(41, __dbResults);
    this.fstrMunicipality = JdbcWritableBridge.readString(42, __dbResults);
    this.fstrDistrict = JdbcWritableBridge.readString(43, __dbResults);
    this.fstrSubDistrict = JdbcWritableBridge.readString(44, __dbResults);
    this.fstrSubProvince = JdbcWritableBridge.readString(45, __dbResults);
    this.fstrAddressDescription = JdbcWritableBridge.readString(46, __dbResults);
    this.fstrListFormatAddress = JdbcWritableBridge.readString(47, __dbResults);
    this.flngIDKey = JdbcWritableBridge.readInteger(48, __dbResults);
    this.fstrIDType = JdbcWritableBridge.readString(49, __dbResults);
    this.fstrID = JdbcWritableBridge.readString(50, __dbResults);
    this.fstrFormattedID = JdbcWritableBridge.readString(51, __dbResults);
    this.fstrDistrictOffice = JdbcWritableBridge.readString(52, __dbResults);
    this.fstrCollectDistrictOffice = JdbcWritableBridge.readString(53, __dbResults);
    this.fstrReviewType = JdbcWritableBridge.readString(54, __dbResults);
    this.fstrCustomerLevel = JdbcWritableBridge.readString(55, __dbResults);
    this.fi64ProtectedDataSource = JdbcWritableBridge.readLong(56, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(57, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngCustomerKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngJointCustomerKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fblnPrime = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrCustomerType = JdbcWritableBridge.readString(4, __dbResults);
    this.flngDocKey = JdbcWritableBridge.readInteger(5, __dbResults);
    this.flngFolderKey = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fblnDefault = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fintProfileNumber = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fdtmCommence = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.fdtmCease = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.fdtmCreated = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.fi64NameKey = JdbcWritableBridge.readLong(12, __dbResults);
    this.fintNameKey = JdbcWritableBridge.readInteger(13, __dbResults);
    this.fstrDisplay = JdbcWritableBridge.readString(14, __dbResults);
    this.fblnFormatted = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fstrNameType = JdbcWritableBridge.readString(16, __dbResults);
    this.fstrFamilyName = JdbcWritableBridge.readString(17, __dbResults);
    this.fstrMiddleName = JdbcWritableBridge.readString(18, __dbResults);
    this.fstrFirstName = JdbcWritableBridge.readString(19, __dbResults);
    this.fstrNameControl = JdbcWritableBridge.readString(20, __dbResults);
    this.fstrTitle = JdbcWritableBridge.readString(21, __dbResults);
    this.fstrSuffix = JdbcWritableBridge.readString(22, __dbResults);
    this.fstrFreeFormatName = JdbcWritableBridge.readString(23, __dbResults);
    this.fstrListFormatName = JdbcWritableBridge.readString(24, __dbResults);
    this.fstrAdditionalName = JdbcWritableBridge.readString(25, __dbResults);
    this.fstrAdditionalName2 = JdbcWritableBridge.readString(26, __dbResults);
    this.fi64AddressKey = JdbcWritableBridge.readLong(27, __dbResults);
    this.fintAddressKey = JdbcWritableBridge.readInteger(28, __dbResults);
    this.fstrAddressType = JdbcWritableBridge.readString(29, __dbResults);
    this.fstrStreet = JdbcWritableBridge.readString(30, __dbResults);
    this.fstrStreet2 = JdbcWritableBridge.readString(31, __dbResults);
    this.fstrUnitType = JdbcWritableBridge.readString(32, __dbResults);
    this.fstrUnit = JdbcWritableBridge.readString(33, __dbResults);
    this.fstrCity = JdbcWritableBridge.readString(34, __dbResults);
    this.fstrCounty = JdbcWritableBridge.readString(35, __dbResults);
    this.fstrState = JdbcWritableBridge.readString(36, __dbResults);
    this.fstrZip = JdbcWritableBridge.readString(37, __dbResults);
    this.fstrCountry = JdbcWritableBridge.readString(38, __dbResults);
    this.fstrAttention = JdbcWritableBridge.readString(39, __dbResults);
    this.fstrLocationCode = JdbcWritableBridge.readString(40, __dbResults);
    this.fstrUrbanization = JdbcWritableBridge.readString(41, __dbResults);
    this.fstrMunicipality = JdbcWritableBridge.readString(42, __dbResults);
    this.fstrDistrict = JdbcWritableBridge.readString(43, __dbResults);
    this.fstrSubDistrict = JdbcWritableBridge.readString(44, __dbResults);
    this.fstrSubProvince = JdbcWritableBridge.readString(45, __dbResults);
    this.fstrAddressDescription = JdbcWritableBridge.readString(46, __dbResults);
    this.fstrListFormatAddress = JdbcWritableBridge.readString(47, __dbResults);
    this.flngIDKey = JdbcWritableBridge.readInteger(48, __dbResults);
    this.fstrIDType = JdbcWritableBridge.readString(49, __dbResults);
    this.fstrID = JdbcWritableBridge.readString(50, __dbResults);
    this.fstrFormattedID = JdbcWritableBridge.readString(51, __dbResults);
    this.fstrDistrictOffice = JdbcWritableBridge.readString(52, __dbResults);
    this.fstrCollectDistrictOffice = JdbcWritableBridge.readString(53, __dbResults);
    this.fstrReviewType = JdbcWritableBridge.readString(54, __dbResults);
    this.fstrCustomerLevel = JdbcWritableBridge.readString(55, __dbResults);
    this.fi64ProtectedDataSource = JdbcWritableBridge.readLong(56, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(57, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngCustomerKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngJointCustomerKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPrime, 3 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrCustomerType, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDocKey, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFolderKey, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDefault, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fintProfileNumber, 8 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCommence, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCease, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCreated, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeLong(fi64NameKey, 12 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintNameKey, 13 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrDisplay, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnFormatted, 15 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrNameType, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFamilyName, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMiddleName, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFirstName, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrNameControl, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTitle, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSuffix, 22 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFreeFormatName, 23 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrListFormatName, 24 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAdditionalName, 25 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAdditionalName2, 26 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeLong(fi64AddressKey, 27 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintAddressKey, 28 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrAddressType, 29 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrStreet, 30 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrStreet2, 31 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrUnitType, 32 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrUnit, 33 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCity, 34 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCounty, 35 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrState, 36 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrZip, 37 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCountry, 38 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAttention, 39 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLocationCode, 40 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrUrbanization, 41 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMunicipality, 42 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDistrict, 43 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSubDistrict, 44 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSubProvince, 45 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAddressDescription, 46 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrListFormatAddress, 47 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngIDKey, 48 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrIDType, 49 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrID, 50 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFormattedID, 51 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDistrictOffice, 52 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCollectDistrictOffice, 53 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrReviewType, 54 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCustomerLevel, 55 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeLong(fi64ProtectedDataSource, 56 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 57 + __off, 93, __dbStmt);
    return 57;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngCustomerKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngJointCustomerKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPrime, 3 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrCustomerType, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDocKey, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFolderKey, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDefault, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fintProfileNumber, 8 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCommence, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCease, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCreated, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeLong(fi64NameKey, 12 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintNameKey, 13 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrDisplay, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnFormatted, 15 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrNameType, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFamilyName, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMiddleName, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFirstName, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrNameControl, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTitle, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSuffix, 22 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFreeFormatName, 23 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrListFormatName, 24 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAdditionalName, 25 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAdditionalName2, 26 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeLong(fi64AddressKey, 27 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintAddressKey, 28 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrAddressType, 29 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrStreet, 30 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrStreet2, 31 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrUnitType, 32 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrUnit, 33 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCity, 34 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCounty, 35 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrState, 36 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrZip, 37 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCountry, 38 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAttention, 39 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLocationCode, 40 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrUrbanization, 41 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMunicipality, 42 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDistrict, 43 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSubDistrict, 44 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSubProvince, 45 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAddressDescription, 46 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrListFormatAddress, 47 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngIDKey, 48 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrIDType, 49 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrID, 50 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFormattedID, 51 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDistrictOffice, 52 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCollectDistrictOffice, 53 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrReviewType, 54 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCustomerLevel, 55 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeLong(fi64ProtectedDataSource, 56 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 57 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngCustomerKey = null;
    } else {
    this.flngCustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngJointCustomerKey = null;
    } else {
    this.flngJointCustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnPrime = null;
    } else {
    this.fblnPrime = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCustomerType = null;
    } else {
    this.fstrCustomerType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngDocKey = null;
    } else {
    this.flngDocKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngFolderKey = null;
    } else {
    this.flngFolderKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnDefault = null;
    } else {
    this.fblnDefault = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintProfileNumber = null;
    } else {
    this.fintProfileNumber = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmCommence = null;
    } else {
    this.fdtmCommence = new Timestamp(__dataIn.readLong());
    this.fdtmCommence.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmCease = null;
    } else {
    this.fdtmCease = new Timestamp(__dataIn.readLong());
    this.fdtmCease.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmCreated = null;
    } else {
    this.fdtmCreated = new Timestamp(__dataIn.readLong());
    this.fdtmCreated.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fi64NameKey = null;
    } else {
    this.fi64NameKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.fintNameKey = null;
    } else {
    this.fintNameKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDisplay = null;
    } else {
    this.fstrDisplay = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnFormatted = null;
    } else {
    this.fblnFormatted = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrNameType = null;
    } else {
    this.fstrNameType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrFamilyName = null;
    } else {
    this.fstrFamilyName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrMiddleName = null;
    } else {
    this.fstrMiddleName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrFirstName = null;
    } else {
    this.fstrFirstName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrNameControl = null;
    } else {
    this.fstrNameControl = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrTitle = null;
    } else {
    this.fstrTitle = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSuffix = null;
    } else {
    this.fstrSuffix = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrFreeFormatName = null;
    } else {
    this.fstrFreeFormatName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrListFormatName = null;
    } else {
    this.fstrListFormatName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAdditionalName = null;
    } else {
    this.fstrAdditionalName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAdditionalName2 = null;
    } else {
    this.fstrAdditionalName2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fi64AddressKey = null;
    } else {
    this.fi64AddressKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.fintAddressKey = null;
    } else {
    this.fintAddressKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAddressType = null;
    } else {
    this.fstrAddressType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrStreet = null;
    } else {
    this.fstrStreet = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrStreet2 = null;
    } else {
    this.fstrStreet2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrUnitType = null;
    } else {
    this.fstrUnitType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrUnit = null;
    } else {
    this.fstrUnit = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCity = null;
    } else {
    this.fstrCity = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCounty = null;
    } else {
    this.fstrCounty = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrState = null;
    } else {
    this.fstrState = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrZip = null;
    } else {
    this.fstrZip = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCountry = null;
    } else {
    this.fstrCountry = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAttention = null;
    } else {
    this.fstrAttention = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrLocationCode = null;
    } else {
    this.fstrLocationCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrUrbanization = null;
    } else {
    this.fstrUrbanization = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrMunicipality = null;
    } else {
    this.fstrMunicipality = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDistrict = null;
    } else {
    this.fstrDistrict = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSubDistrict = null;
    } else {
    this.fstrSubDistrict = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSubProvince = null;
    } else {
    this.fstrSubProvince = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAddressDescription = null;
    } else {
    this.fstrAddressDescription = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrListFormatAddress = null;
    } else {
    this.fstrListFormatAddress = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngIDKey = null;
    } else {
    this.flngIDKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrIDType = null;
    } else {
    this.fstrIDType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrID = null;
    } else {
    this.fstrID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrFormattedID = null;
    } else {
    this.fstrFormattedID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDistrictOffice = null;
    } else {
    this.fstrDistrictOffice = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCollectDistrictOffice = null;
    } else {
    this.fstrCollectDistrictOffice = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrReviewType = null;
    } else {
    this.fstrReviewType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCustomerLevel = null;
    } else {
    this.fstrCustomerLevel = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fi64ProtectedDataSource = null;
    } else {
    this.fi64ProtectedDataSource = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmWhen = null;
    } else {
    this.fdtmWhen = new Timestamp(__dataIn.readLong());
    this.fdtmWhen.setNanos(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.flngCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey);
    }
    if (null == this.flngJointCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngJointCustomerKey);
    }
    if (null == this.fblnPrime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPrime);
    }
    if (null == this.fstrCustomerType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCustomerType);
    }
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.flngFolderKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFolderKey);
    }
    if (null == this.fblnDefault) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDefault);
    }
    if (null == this.fintProfileNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintProfileNumber);
    }
    if (null == this.fdtmCommence) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCommence.getTime());
    __dataOut.writeInt(this.fdtmCommence.getNanos());
    }
    if (null == this.fdtmCease) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCease.getTime());
    __dataOut.writeInt(this.fdtmCease.getNanos());
    }
    if (null == this.fdtmCreated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCreated.getTime());
    __dataOut.writeInt(this.fdtmCreated.getNanos());
    }
    if (null == this.fi64NameKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64NameKey);
    }
    if (null == this.fintNameKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintNameKey);
    }
    if (null == this.fstrDisplay) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDisplay);
    }
    if (null == this.fblnFormatted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnFormatted);
    }
    if (null == this.fstrNameType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrNameType);
    }
    if (null == this.fstrFamilyName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFamilyName);
    }
    if (null == this.fstrMiddleName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMiddleName);
    }
    if (null == this.fstrFirstName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFirstName);
    }
    if (null == this.fstrNameControl) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrNameControl);
    }
    if (null == this.fstrTitle) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTitle);
    }
    if (null == this.fstrSuffix) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSuffix);
    }
    if (null == this.fstrFreeFormatName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFreeFormatName);
    }
    if (null == this.fstrListFormatName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrListFormatName);
    }
    if (null == this.fstrAdditionalName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAdditionalName);
    }
    if (null == this.fstrAdditionalName2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAdditionalName2);
    }
    if (null == this.fi64AddressKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64AddressKey);
    }
    if (null == this.fintAddressKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintAddressKey);
    }
    if (null == this.fstrAddressType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAddressType);
    }
    if (null == this.fstrStreet) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStreet);
    }
    if (null == this.fstrStreet2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStreet2);
    }
    if (null == this.fstrUnitType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrUnitType);
    }
    if (null == this.fstrUnit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrUnit);
    }
    if (null == this.fstrCity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCity);
    }
    if (null == this.fstrCounty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCounty);
    }
    if (null == this.fstrState) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrState);
    }
    if (null == this.fstrZip) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrZip);
    }
    if (null == this.fstrCountry) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCountry);
    }
    if (null == this.fstrAttention) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAttention);
    }
    if (null == this.fstrLocationCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLocationCode);
    }
    if (null == this.fstrUrbanization) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrUrbanization);
    }
    if (null == this.fstrMunicipality) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMunicipality);
    }
    if (null == this.fstrDistrict) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDistrict);
    }
    if (null == this.fstrSubDistrict) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSubDistrict);
    }
    if (null == this.fstrSubProvince) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSubProvince);
    }
    if (null == this.fstrAddressDescription) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAddressDescription);
    }
    if (null == this.fstrListFormatAddress) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrListFormatAddress);
    }
    if (null == this.flngIDKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngIDKey);
    }
    if (null == this.fstrIDType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIDType);
    }
    if (null == this.fstrID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrID);
    }
    if (null == this.fstrFormattedID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFormattedID);
    }
    if (null == this.fstrDistrictOffice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDistrictOffice);
    }
    if (null == this.fstrCollectDistrictOffice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCollectDistrictOffice);
    }
    if (null == this.fstrReviewType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrReviewType);
    }
    if (null == this.fstrCustomerLevel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCustomerLevel);
    }
    if (null == this.fi64ProtectedDataSource) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64ProtectedDataSource);
    }
    if (null == this.fdtmWhen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmWhen.getTime());
    __dataOut.writeInt(this.fdtmWhen.getNanos());
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.flngCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey);
    }
    if (null == this.flngJointCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngJointCustomerKey);
    }
    if (null == this.fblnPrime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPrime);
    }
    if (null == this.fstrCustomerType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCustomerType);
    }
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.flngFolderKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFolderKey);
    }
    if (null == this.fblnDefault) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDefault);
    }
    if (null == this.fintProfileNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintProfileNumber);
    }
    if (null == this.fdtmCommence) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCommence.getTime());
    __dataOut.writeInt(this.fdtmCommence.getNanos());
    }
    if (null == this.fdtmCease) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCease.getTime());
    __dataOut.writeInt(this.fdtmCease.getNanos());
    }
    if (null == this.fdtmCreated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCreated.getTime());
    __dataOut.writeInt(this.fdtmCreated.getNanos());
    }
    if (null == this.fi64NameKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64NameKey);
    }
    if (null == this.fintNameKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintNameKey);
    }
    if (null == this.fstrDisplay) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDisplay);
    }
    if (null == this.fblnFormatted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnFormatted);
    }
    if (null == this.fstrNameType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrNameType);
    }
    if (null == this.fstrFamilyName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFamilyName);
    }
    if (null == this.fstrMiddleName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMiddleName);
    }
    if (null == this.fstrFirstName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFirstName);
    }
    if (null == this.fstrNameControl) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrNameControl);
    }
    if (null == this.fstrTitle) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTitle);
    }
    if (null == this.fstrSuffix) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSuffix);
    }
    if (null == this.fstrFreeFormatName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFreeFormatName);
    }
    if (null == this.fstrListFormatName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrListFormatName);
    }
    if (null == this.fstrAdditionalName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAdditionalName);
    }
    if (null == this.fstrAdditionalName2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAdditionalName2);
    }
    if (null == this.fi64AddressKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64AddressKey);
    }
    if (null == this.fintAddressKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintAddressKey);
    }
    if (null == this.fstrAddressType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAddressType);
    }
    if (null == this.fstrStreet) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStreet);
    }
    if (null == this.fstrStreet2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStreet2);
    }
    if (null == this.fstrUnitType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrUnitType);
    }
    if (null == this.fstrUnit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrUnit);
    }
    if (null == this.fstrCity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCity);
    }
    if (null == this.fstrCounty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCounty);
    }
    if (null == this.fstrState) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrState);
    }
    if (null == this.fstrZip) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrZip);
    }
    if (null == this.fstrCountry) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCountry);
    }
    if (null == this.fstrAttention) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAttention);
    }
    if (null == this.fstrLocationCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLocationCode);
    }
    if (null == this.fstrUrbanization) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrUrbanization);
    }
    if (null == this.fstrMunicipality) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMunicipality);
    }
    if (null == this.fstrDistrict) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDistrict);
    }
    if (null == this.fstrSubDistrict) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSubDistrict);
    }
    if (null == this.fstrSubProvince) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSubProvince);
    }
    if (null == this.fstrAddressDescription) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAddressDescription);
    }
    if (null == this.fstrListFormatAddress) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrListFormatAddress);
    }
    if (null == this.flngIDKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngIDKey);
    }
    if (null == this.fstrIDType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIDType);
    }
    if (null == this.fstrID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrID);
    }
    if (null == this.fstrFormattedID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFormattedID);
    }
    if (null == this.fstrDistrictOffice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDistrictOffice);
    }
    if (null == this.fstrCollectDistrictOffice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCollectDistrictOffice);
    }
    if (null == this.fstrReviewType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrReviewType);
    }
    if (null == this.fstrCustomerLevel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCustomerLevel);
    }
    if (null == this.fi64ProtectedDataSource) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64ProtectedDataSource);
    }
    if (null == this.fdtmWhen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmWhen.getTime());
    __dataOut.writeInt(this.fdtmWhen.getNanos());
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 34, (char) 92, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngJointCustomerKey==null?"\\N":"" + flngJointCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPrime==null?"\\N":"" + fblnPrime, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCustomerType==null?"\\N":fstrCustomerType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFolderKey==null?"\\N":"" + flngFolderKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDefault==null?"\\N":"" + fblnDefault, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintProfileNumber==null?"\\N":"" + fintProfileNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCommence==null?"\\N":"" + fdtmCommence, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCease==null?"\\N":"" + fdtmCease, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCreated==null?"\\N":"" + fdtmCreated, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64NameKey==null?"\\N":"" + fi64NameKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintNameKey==null?"\\N":"" + fintNameKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDisplay==null?"\\N":fstrDisplay, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnFormatted==null?"\\N":"" + fblnFormatted, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrNameType==null?"\\N":fstrNameType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFamilyName==null?"\\N":fstrFamilyName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMiddleName==null?"\\N":fstrMiddleName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFirstName==null?"\\N":fstrFirstName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrNameControl==null?"\\N":fstrNameControl, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTitle==null?"\\N":fstrTitle, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSuffix==null?"\\N":fstrSuffix, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFreeFormatName==null?"\\N":fstrFreeFormatName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrListFormatName==null?"\\N":fstrListFormatName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAdditionalName==null?"\\N":fstrAdditionalName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAdditionalName2==null?"\\N":fstrAdditionalName2, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64AddressKey==null?"\\N":"" + fi64AddressKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintAddressKey==null?"\\N":"" + fintAddressKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAddressType==null?"\\N":fstrAddressType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStreet==null?"\\N":fstrStreet, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStreet2==null?"\\N":fstrStreet2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrUnitType==null?"\\N":fstrUnitType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrUnit==null?"\\N":fstrUnit, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCity==null?"\\N":fstrCity, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCounty==null?"\\N":fstrCounty, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrState==null?"\\N":fstrState, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrZip==null?"\\N":fstrZip, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCountry==null?"\\N":fstrCountry, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAttention==null?"\\N":fstrAttention, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLocationCode==null?"\\N":fstrLocationCode, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrUrbanization==null?"\\N":fstrUrbanization, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMunicipality==null?"\\N":fstrMunicipality, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDistrict==null?"\\N":fstrDistrict, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSubDistrict==null?"\\N":fstrSubDistrict, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSubProvince==null?"\\N":fstrSubProvince, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAddressDescription==null?"\\N":fstrAddressDescription, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrListFormatAddress==null?"\\N":fstrListFormatAddress, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngIDKey==null?"\\N":"" + flngIDKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIDType==null?"\\N":fstrIDType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrID==null?"\\N":fstrID, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFormattedID==null?"\\N":fstrFormattedID, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDistrictOffice==null?"\\N":fstrDistrictOffice, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCollectDistrictOffice==null?"\\N":fstrCollectDistrictOffice, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrReviewType==null?"\\N":fstrReviewType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCustomerLevel==null?"\\N":fstrCustomerLevel, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64ProtectedDataSource==null?"\\N":"" + fi64ProtectedDataSource, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmWhen==null?"\\N":"" + fdtmWhen, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngJointCustomerKey==null?"\\N":"" + flngJointCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPrime==null?"\\N":"" + fblnPrime, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCustomerType==null?"\\N":fstrCustomerType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFolderKey==null?"\\N":"" + flngFolderKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDefault==null?"\\N":"" + fblnDefault, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintProfileNumber==null?"\\N":"" + fintProfileNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCommence==null?"\\N":"" + fdtmCommence, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCease==null?"\\N":"" + fdtmCease, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCreated==null?"\\N":"" + fdtmCreated, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64NameKey==null?"\\N":"" + fi64NameKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintNameKey==null?"\\N":"" + fintNameKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDisplay==null?"\\N":fstrDisplay, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnFormatted==null?"\\N":"" + fblnFormatted, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrNameType==null?"\\N":fstrNameType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFamilyName==null?"\\N":fstrFamilyName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMiddleName==null?"\\N":fstrMiddleName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFirstName==null?"\\N":fstrFirstName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrNameControl==null?"\\N":fstrNameControl, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTitle==null?"\\N":fstrTitle, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSuffix==null?"\\N":fstrSuffix, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFreeFormatName==null?"\\N":fstrFreeFormatName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrListFormatName==null?"\\N":fstrListFormatName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAdditionalName==null?"\\N":fstrAdditionalName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAdditionalName2==null?"\\N":fstrAdditionalName2, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64AddressKey==null?"\\N":"" + fi64AddressKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintAddressKey==null?"\\N":"" + fintAddressKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAddressType==null?"\\N":fstrAddressType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStreet==null?"\\N":fstrStreet, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStreet2==null?"\\N":fstrStreet2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrUnitType==null?"\\N":fstrUnitType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrUnit==null?"\\N":fstrUnit, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCity==null?"\\N":fstrCity, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCounty==null?"\\N":fstrCounty, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrState==null?"\\N":fstrState, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrZip==null?"\\N":fstrZip, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCountry==null?"\\N":fstrCountry, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAttention==null?"\\N":fstrAttention, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLocationCode==null?"\\N":fstrLocationCode, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrUrbanization==null?"\\N":fstrUrbanization, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMunicipality==null?"\\N":fstrMunicipality, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDistrict==null?"\\N":fstrDistrict, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSubDistrict==null?"\\N":fstrSubDistrict, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSubProvince==null?"\\N":fstrSubProvince, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAddressDescription==null?"\\N":fstrAddressDescription, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrListFormatAddress==null?"\\N":fstrListFormatAddress, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngIDKey==null?"\\N":"" + flngIDKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIDType==null?"\\N":fstrIDType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrID==null?"\\N":fstrID, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFormattedID==null?"\\N":fstrFormattedID, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDistrictOffice==null?"\\N":fstrDistrictOffice, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCollectDistrictOffice==null?"\\N":fstrCollectDistrictOffice, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrReviewType==null?"\\N":fstrReviewType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCustomerLevel==null?"\\N":fstrCustomerLevel, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64ProtectedDataSource==null?"\\N":"" + fi64ProtectedDataSource, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmWhen==null?"\\N":"" + fdtmWhen, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 34, (char) 92, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCustomerKey = null; } else {
      this.flngCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngJointCustomerKey = null; } else {
      this.flngJointCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPrime = null; } else {
      this.fblnPrime = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCustomerType = null; } else {
      this.fstrCustomerType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDocKey = null; } else {
      this.flngDocKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFolderKey = null; } else {
      this.flngFolderKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnDefault = null; } else {
      this.fblnDefault = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintProfileNumber = null; } else {
      this.fintProfileNumber = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCommence = null; } else {
      this.fdtmCommence = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCease = null; } else {
      this.fdtmCease = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCreated = null; } else {
      this.fdtmCreated = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64NameKey = null; } else {
      this.fi64NameKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintNameKey = null; } else {
      this.fintNameKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDisplay = null; } else {
      this.fstrDisplay = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnFormatted = null; } else {
      this.fblnFormatted = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrNameType = null; } else {
      this.fstrNameType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFamilyName = null; } else {
      this.fstrFamilyName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMiddleName = null; } else {
      this.fstrMiddleName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFirstName = null; } else {
      this.fstrFirstName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrNameControl = null; } else {
      this.fstrNameControl = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTitle = null; } else {
      this.fstrTitle = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSuffix = null; } else {
      this.fstrSuffix = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFreeFormatName = null; } else {
      this.fstrFreeFormatName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrListFormatName = null; } else {
      this.fstrListFormatName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAdditionalName = null; } else {
      this.fstrAdditionalName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAdditionalName2 = null; } else {
      this.fstrAdditionalName2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64AddressKey = null; } else {
      this.fi64AddressKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintAddressKey = null; } else {
      this.fintAddressKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAddressType = null; } else {
      this.fstrAddressType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrStreet = null; } else {
      this.fstrStreet = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrStreet2 = null; } else {
      this.fstrStreet2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrUnitType = null; } else {
      this.fstrUnitType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrUnit = null; } else {
      this.fstrUnit = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCity = null; } else {
      this.fstrCity = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCounty = null; } else {
      this.fstrCounty = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrState = null; } else {
      this.fstrState = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrZip = null; } else {
      this.fstrZip = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCountry = null; } else {
      this.fstrCountry = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAttention = null; } else {
      this.fstrAttention = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLocationCode = null; } else {
      this.fstrLocationCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrUrbanization = null; } else {
      this.fstrUrbanization = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMunicipality = null; } else {
      this.fstrMunicipality = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDistrict = null; } else {
      this.fstrDistrict = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSubDistrict = null; } else {
      this.fstrSubDistrict = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSubProvince = null; } else {
      this.fstrSubProvince = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAddressDescription = null; } else {
      this.fstrAddressDescription = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrListFormatAddress = null; } else {
      this.fstrListFormatAddress = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngIDKey = null; } else {
      this.flngIDKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIDType = null; } else {
      this.fstrIDType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrID = null; } else {
      this.fstrID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFormattedID = null; } else {
      this.fstrFormattedID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDistrictOffice = null; } else {
      this.fstrDistrictOffice = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCollectDistrictOffice = null; } else {
      this.fstrCollectDistrictOffice = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrReviewType = null; } else {
      this.fstrReviewType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCustomerLevel = null; } else {
      this.fstrCustomerLevel = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64ProtectedDataSource = null; } else {
      this.fi64ProtectedDataSource = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmWhen = null; } else {
      this.fdtmWhen = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCustomerKey = null; } else {
      this.flngCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngJointCustomerKey = null; } else {
      this.flngJointCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPrime = null; } else {
      this.fblnPrime = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCustomerType = null; } else {
      this.fstrCustomerType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDocKey = null; } else {
      this.flngDocKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFolderKey = null; } else {
      this.flngFolderKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnDefault = null; } else {
      this.fblnDefault = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintProfileNumber = null; } else {
      this.fintProfileNumber = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCommence = null; } else {
      this.fdtmCommence = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCease = null; } else {
      this.fdtmCease = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCreated = null; } else {
      this.fdtmCreated = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64NameKey = null; } else {
      this.fi64NameKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintNameKey = null; } else {
      this.fintNameKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDisplay = null; } else {
      this.fstrDisplay = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnFormatted = null; } else {
      this.fblnFormatted = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrNameType = null; } else {
      this.fstrNameType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFamilyName = null; } else {
      this.fstrFamilyName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMiddleName = null; } else {
      this.fstrMiddleName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFirstName = null; } else {
      this.fstrFirstName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrNameControl = null; } else {
      this.fstrNameControl = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTitle = null; } else {
      this.fstrTitle = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSuffix = null; } else {
      this.fstrSuffix = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFreeFormatName = null; } else {
      this.fstrFreeFormatName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrListFormatName = null; } else {
      this.fstrListFormatName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAdditionalName = null; } else {
      this.fstrAdditionalName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAdditionalName2 = null; } else {
      this.fstrAdditionalName2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64AddressKey = null; } else {
      this.fi64AddressKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintAddressKey = null; } else {
      this.fintAddressKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAddressType = null; } else {
      this.fstrAddressType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrStreet = null; } else {
      this.fstrStreet = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrStreet2 = null; } else {
      this.fstrStreet2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrUnitType = null; } else {
      this.fstrUnitType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrUnit = null; } else {
      this.fstrUnit = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCity = null; } else {
      this.fstrCity = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCounty = null; } else {
      this.fstrCounty = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrState = null; } else {
      this.fstrState = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrZip = null; } else {
      this.fstrZip = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCountry = null; } else {
      this.fstrCountry = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAttention = null; } else {
      this.fstrAttention = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLocationCode = null; } else {
      this.fstrLocationCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrUrbanization = null; } else {
      this.fstrUrbanization = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMunicipality = null; } else {
      this.fstrMunicipality = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDistrict = null; } else {
      this.fstrDistrict = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSubDistrict = null; } else {
      this.fstrSubDistrict = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSubProvince = null; } else {
      this.fstrSubProvince = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAddressDescription = null; } else {
      this.fstrAddressDescription = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrListFormatAddress = null; } else {
      this.fstrListFormatAddress = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngIDKey = null; } else {
      this.flngIDKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIDType = null; } else {
      this.fstrIDType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrID = null; } else {
      this.fstrID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFormattedID = null; } else {
      this.fstrFormattedID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDistrictOffice = null; } else {
      this.fstrDistrictOffice = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCollectDistrictOffice = null; } else {
      this.fstrCollectDistrictOffice = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrReviewType = null; } else {
      this.fstrReviewType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCustomerLevel = null; } else {
      this.fstrCustomerLevel = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64ProtectedDataSource = null; } else {
      this.fi64ProtectedDataSource = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmWhen = null; } else {
      this.fdtmWhen = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    tblcustomerinfo o = (tblcustomerinfo) super.clone();
    o.fdtmCommence = (o.fdtmCommence != null) ? (java.sql.Timestamp) o.fdtmCommence.clone() : null;
    o.fdtmCease = (o.fdtmCease != null) ? (java.sql.Timestamp) o.fdtmCease.clone() : null;
    o.fdtmCreated = (o.fdtmCreated != null) ? (java.sql.Timestamp) o.fdtmCreated.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblcustomerinfo o) throws CloneNotSupportedException {
    o.fdtmCommence = (o.fdtmCommence != null) ? (java.sql.Timestamp) o.fdtmCommence.clone() : null;
    o.fdtmCease = (o.fdtmCease != null) ? (java.sql.Timestamp) o.fdtmCease.clone() : null;
    o.fdtmCreated = (o.fdtmCreated != null) ? (java.sql.Timestamp) o.fdtmCreated.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("flngJointCustomerKey", this.flngJointCustomerKey);
    __sqoop$field_map.put("fblnPrime", this.fblnPrime);
    __sqoop$field_map.put("fstrCustomerType", this.fstrCustomerType);
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("flngFolderKey", this.flngFolderKey);
    __sqoop$field_map.put("fblnDefault", this.fblnDefault);
    __sqoop$field_map.put("fintProfileNumber", this.fintProfileNumber);
    __sqoop$field_map.put("fdtmCommence", this.fdtmCommence);
    __sqoop$field_map.put("fdtmCease", this.fdtmCease);
    __sqoop$field_map.put("fdtmCreated", this.fdtmCreated);
    __sqoop$field_map.put("fi64NameKey", this.fi64NameKey);
    __sqoop$field_map.put("fintNameKey", this.fintNameKey);
    __sqoop$field_map.put("fstrDisplay", this.fstrDisplay);
    __sqoop$field_map.put("fblnFormatted", this.fblnFormatted);
    __sqoop$field_map.put("fstrNameType", this.fstrNameType);
    __sqoop$field_map.put("fstrFamilyName", this.fstrFamilyName);
    __sqoop$field_map.put("fstrMiddleName", this.fstrMiddleName);
    __sqoop$field_map.put("fstrFirstName", this.fstrFirstName);
    __sqoop$field_map.put("fstrNameControl", this.fstrNameControl);
    __sqoop$field_map.put("fstrTitle", this.fstrTitle);
    __sqoop$field_map.put("fstrSuffix", this.fstrSuffix);
    __sqoop$field_map.put("fstrFreeFormatName", this.fstrFreeFormatName);
    __sqoop$field_map.put("fstrListFormatName", this.fstrListFormatName);
    __sqoop$field_map.put("fstrAdditionalName", this.fstrAdditionalName);
    __sqoop$field_map.put("fstrAdditionalName2", this.fstrAdditionalName2);
    __sqoop$field_map.put("fi64AddressKey", this.fi64AddressKey);
    __sqoop$field_map.put("fintAddressKey", this.fintAddressKey);
    __sqoop$field_map.put("fstrAddressType", this.fstrAddressType);
    __sqoop$field_map.put("fstrStreet", this.fstrStreet);
    __sqoop$field_map.put("fstrStreet2", this.fstrStreet2);
    __sqoop$field_map.put("fstrUnitType", this.fstrUnitType);
    __sqoop$field_map.put("fstrUnit", this.fstrUnit);
    __sqoop$field_map.put("fstrCity", this.fstrCity);
    __sqoop$field_map.put("fstrCounty", this.fstrCounty);
    __sqoop$field_map.put("fstrState", this.fstrState);
    __sqoop$field_map.put("fstrZip", this.fstrZip);
    __sqoop$field_map.put("fstrCountry", this.fstrCountry);
    __sqoop$field_map.put("fstrAttention", this.fstrAttention);
    __sqoop$field_map.put("fstrLocationCode", this.fstrLocationCode);
    __sqoop$field_map.put("fstrUrbanization", this.fstrUrbanization);
    __sqoop$field_map.put("fstrMunicipality", this.fstrMunicipality);
    __sqoop$field_map.put("fstrDistrict", this.fstrDistrict);
    __sqoop$field_map.put("fstrSubDistrict", this.fstrSubDistrict);
    __sqoop$field_map.put("fstrSubProvince", this.fstrSubProvince);
    __sqoop$field_map.put("fstrAddressDescription", this.fstrAddressDescription);
    __sqoop$field_map.put("fstrListFormatAddress", this.fstrListFormatAddress);
    __sqoop$field_map.put("flngIDKey", this.flngIDKey);
    __sqoop$field_map.put("fstrIDType", this.fstrIDType);
    __sqoop$field_map.put("fstrID", this.fstrID);
    __sqoop$field_map.put("fstrFormattedID", this.fstrFormattedID);
    __sqoop$field_map.put("fstrDistrictOffice", this.fstrDistrictOffice);
    __sqoop$field_map.put("fstrCollectDistrictOffice", this.fstrCollectDistrictOffice);
    __sqoop$field_map.put("fstrReviewType", this.fstrReviewType);
    __sqoop$field_map.put("fstrCustomerLevel", this.fstrCustomerLevel);
    __sqoop$field_map.put("fi64ProtectedDataSource", this.fi64ProtectedDataSource);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("flngJointCustomerKey", this.flngJointCustomerKey);
    __sqoop$field_map.put("fblnPrime", this.fblnPrime);
    __sqoop$field_map.put("fstrCustomerType", this.fstrCustomerType);
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("flngFolderKey", this.flngFolderKey);
    __sqoop$field_map.put("fblnDefault", this.fblnDefault);
    __sqoop$field_map.put("fintProfileNumber", this.fintProfileNumber);
    __sqoop$field_map.put("fdtmCommence", this.fdtmCommence);
    __sqoop$field_map.put("fdtmCease", this.fdtmCease);
    __sqoop$field_map.put("fdtmCreated", this.fdtmCreated);
    __sqoop$field_map.put("fi64NameKey", this.fi64NameKey);
    __sqoop$field_map.put("fintNameKey", this.fintNameKey);
    __sqoop$field_map.put("fstrDisplay", this.fstrDisplay);
    __sqoop$field_map.put("fblnFormatted", this.fblnFormatted);
    __sqoop$field_map.put("fstrNameType", this.fstrNameType);
    __sqoop$field_map.put("fstrFamilyName", this.fstrFamilyName);
    __sqoop$field_map.put("fstrMiddleName", this.fstrMiddleName);
    __sqoop$field_map.put("fstrFirstName", this.fstrFirstName);
    __sqoop$field_map.put("fstrNameControl", this.fstrNameControl);
    __sqoop$field_map.put("fstrTitle", this.fstrTitle);
    __sqoop$field_map.put("fstrSuffix", this.fstrSuffix);
    __sqoop$field_map.put("fstrFreeFormatName", this.fstrFreeFormatName);
    __sqoop$field_map.put("fstrListFormatName", this.fstrListFormatName);
    __sqoop$field_map.put("fstrAdditionalName", this.fstrAdditionalName);
    __sqoop$field_map.put("fstrAdditionalName2", this.fstrAdditionalName2);
    __sqoop$field_map.put("fi64AddressKey", this.fi64AddressKey);
    __sqoop$field_map.put("fintAddressKey", this.fintAddressKey);
    __sqoop$field_map.put("fstrAddressType", this.fstrAddressType);
    __sqoop$field_map.put("fstrStreet", this.fstrStreet);
    __sqoop$field_map.put("fstrStreet2", this.fstrStreet2);
    __sqoop$field_map.put("fstrUnitType", this.fstrUnitType);
    __sqoop$field_map.put("fstrUnit", this.fstrUnit);
    __sqoop$field_map.put("fstrCity", this.fstrCity);
    __sqoop$field_map.put("fstrCounty", this.fstrCounty);
    __sqoop$field_map.put("fstrState", this.fstrState);
    __sqoop$field_map.put("fstrZip", this.fstrZip);
    __sqoop$field_map.put("fstrCountry", this.fstrCountry);
    __sqoop$field_map.put("fstrAttention", this.fstrAttention);
    __sqoop$field_map.put("fstrLocationCode", this.fstrLocationCode);
    __sqoop$field_map.put("fstrUrbanization", this.fstrUrbanization);
    __sqoop$field_map.put("fstrMunicipality", this.fstrMunicipality);
    __sqoop$field_map.put("fstrDistrict", this.fstrDistrict);
    __sqoop$field_map.put("fstrSubDistrict", this.fstrSubDistrict);
    __sqoop$field_map.put("fstrSubProvince", this.fstrSubProvince);
    __sqoop$field_map.put("fstrAddressDescription", this.fstrAddressDescription);
    __sqoop$field_map.put("fstrListFormatAddress", this.fstrListFormatAddress);
    __sqoop$field_map.put("flngIDKey", this.flngIDKey);
    __sqoop$field_map.put("fstrIDType", this.fstrIDType);
    __sqoop$field_map.put("fstrID", this.fstrID);
    __sqoop$field_map.put("fstrFormattedID", this.fstrFormattedID);
    __sqoop$field_map.put("fstrDistrictOffice", this.fstrDistrictOffice);
    __sqoop$field_map.put("fstrCollectDistrictOffice", this.fstrCollectDistrictOffice);
    __sqoop$field_map.put("fstrReviewType", this.fstrReviewType);
    __sqoop$field_map.put("fstrCustomerLevel", this.fstrCustomerLevel);
    __sqoop$field_map.put("fi64ProtectedDataSource", this.fi64ProtectedDataSource);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
