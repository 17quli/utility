// ORM class for table 'tblbankaccount'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 01:51:17 NZDT 2020
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

public class tblbankaccount extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngBankAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbankaccount.this.flngBankAccountKey = (Integer)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbankaccount.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbankaccount.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("flngCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbankaccount.this.flngCustomerKey = (Integer)value;
      }
    });
    setters.put("fstrBankAccountStandard", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbankaccount.this.fstrBankAccountStandard = (String)value;
      }
    });
    setters.put("fstrRoutingNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbankaccount.this.fstrRoutingNumber = (String)value;
      }
    });
    setters.put("fstrBankAccountNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbankaccount.this.fstrBankAccountNumber = (String)value;
      }
    });
    setters.put("fstrBankAccountType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbankaccount.this.fstrBankAccountType = (String)value;
      }
    });
    setters.put("fblnInternational", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbankaccount.this.fblnInternational = (Integer)value;
      }
    });
    setters.put("fblnPreNote", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbankaccount.this.fblnPreNote = (Integer)value;
      }
    });
    setters.put("fdtmPreNoteSent", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbankaccount.this.fdtmPreNoteSent = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrBankCountryCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbankaccount.this.fstrBankCountryCode = (String)value;
      }
    });
    setters.put("fstrBankAccNumQualifier", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbankaccount.this.fstrBankAccNumQualifier = (String)value;
      }
    });
    setters.put("fstrCurrencyType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbankaccount.this.fstrCurrencyType = (String)value;
      }
    });
    setters.put("fi64BankNameKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbankaccount.this.fi64BankNameKey = (Long)value;
      }
    });
    setters.put("fstrBankName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbankaccount.this.fstrBankName = (String)value;
      }
    });
    setters.put("fi64NameOnAccountNameKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbankaccount.this.fi64NameOnAccountNameKey = (Long)value;
      }
    });
    setters.put("fstrNameOnAcc", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbankaccount.this.fstrNameOnAcc = (String)value;
      }
    });
    setters.put("fstrPhoneType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbankaccount.this.fstrPhoneType = (String)value;
      }
    });
    setters.put("fstrPhoneCountry", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbankaccount.this.fstrPhoneCountry = (String)value;
      }
    });
    setters.put("fintPhoneCountryCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbankaccount.this.fintPhoneCountryCode = (Integer)value;
      }
    });
    setters.put("fstrPhoneAreaCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbankaccount.this.fstrPhoneAreaCode = (String)value;
      }
    });
    setters.put("fstrPhoneNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbankaccount.this.fstrPhoneNumber = (String)value;
      }
    });
    setters.put("fstrPhoneExtension", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbankaccount.this.fstrPhoneExtension = (String)value;
      }
    });
    setters.put("fi64AddressKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbankaccount.this.fi64AddressKey = (Long)value;
      }
    });
    setters.put("fstrStreet", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbankaccount.this.fstrStreet = (String)value;
      }
    });
    setters.put("fstrStreet2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbankaccount.this.fstrStreet2 = (String)value;
      }
    });
    setters.put("fstrUnit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbankaccount.this.fstrUnit = (String)value;
      }
    });
    setters.put("fstrUnitType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbankaccount.this.fstrUnitType = (String)value;
      }
    });
    setters.put("fstrCity", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbankaccount.this.fstrCity = (String)value;
      }
    });
    setters.put("fstrCounty", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbankaccount.this.fstrCounty = (String)value;
      }
    });
    setters.put("fstrState", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbankaccount.this.fstrState = (String)value;
      }
    });
    setters.put("fstrZip", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbankaccount.this.fstrZip = (String)value;
      }
    });
    setters.put("fstrCountry", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbankaccount.this.fstrCountry = (String)value;
      }
    });
    setters.put("fstrAttention", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbankaccount.this.fstrAttention = (String)value;
      }
    });
    setters.put("fstrUrbanization", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbankaccount.this.fstrUrbanization = (String)value;
      }
    });
    setters.put("fblnVerified", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbankaccount.this.fblnVerified = (Integer)value;
      }
    });
    setters.put("fdtmVerified", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbankaccount.this.fdtmVerified = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrDistrictOffice", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbankaccount.this.fstrDistrictOffice = (String)value;
      }
    });
    setters.put("fstrLocationCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbankaccount.this.fstrLocationCode = (String)value;
      }
    });
    setters.put("fstrMunicipality", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbankaccount.this.fstrMunicipality = (String)value;
      }
    });
    setters.put("fstrDistrict", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbankaccount.this.fstrDistrict = (String)value;
      }
    });
    setters.put("fstrSubDistrict", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbankaccount.this.fstrSubDistrict = (String)value;
      }
    });
    setters.put("fstrSubProvince", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbankaccount.this.fstrSubProvince = (String)value;
      }
    });
    setters.put("fstrAddressDescription", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbankaccount.this.fstrAddressDescription = (String)value;
      }
    });
    setters.put("fstrRowId", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbankaccount.this.fstrRowId = (String)value;
      }
    });
    setters.put("fdtmCommence", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbankaccount.this.fdtmCommence = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmCease", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbankaccount.this.fdtmCease = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrInvalidationReason", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbankaccount.this.fstrInvalidationReason = (String)value;
      }
    });
    setters.put("fblnActive", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbankaccount.this.fblnActive = (Integer)value;
      }
    });
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbankaccount.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fdtmExpire", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbankaccount.this.fdtmExpire = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbankaccount.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbankaccount.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblbankaccount() {
    init0();
  }
  private Integer flngBankAccountKey;
  public Integer get_flngBankAccountKey() {
    return flngBankAccountKey;
  }
  public void set_flngBankAccountKey(Integer flngBankAccountKey) {
    this.flngBankAccountKey = flngBankAccountKey;
  }
  public tblbankaccount with_flngBankAccountKey(Integer flngBankAccountKey) {
    this.flngBankAccountKey = flngBankAccountKey;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblbankaccount with_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
    return this;
  }
  private Integer flngVerLast;
  public Integer get_flngVerLast() {
    return flngVerLast;
  }
  public void set_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
  }
  public tblbankaccount with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private Integer flngCustomerKey;
  public Integer get_flngCustomerKey() {
    return flngCustomerKey;
  }
  public void set_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
  }
  public tblbankaccount with_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
    return this;
  }
  private String fstrBankAccountStandard;
  public String get_fstrBankAccountStandard() {
    return fstrBankAccountStandard;
  }
  public void set_fstrBankAccountStandard(String fstrBankAccountStandard) {
    this.fstrBankAccountStandard = fstrBankAccountStandard;
  }
  public tblbankaccount with_fstrBankAccountStandard(String fstrBankAccountStandard) {
    this.fstrBankAccountStandard = fstrBankAccountStandard;
    return this;
  }
  private String fstrRoutingNumber;
  public String get_fstrRoutingNumber() {
    return fstrRoutingNumber;
  }
  public void set_fstrRoutingNumber(String fstrRoutingNumber) {
    this.fstrRoutingNumber = fstrRoutingNumber;
  }
  public tblbankaccount with_fstrRoutingNumber(String fstrRoutingNumber) {
    this.fstrRoutingNumber = fstrRoutingNumber;
    return this;
  }
  private String fstrBankAccountNumber;
  public String get_fstrBankAccountNumber() {
    return fstrBankAccountNumber;
  }
  public void set_fstrBankAccountNumber(String fstrBankAccountNumber) {
    this.fstrBankAccountNumber = fstrBankAccountNumber;
  }
  public tblbankaccount with_fstrBankAccountNumber(String fstrBankAccountNumber) {
    this.fstrBankAccountNumber = fstrBankAccountNumber;
    return this;
  }
  private String fstrBankAccountType;
  public String get_fstrBankAccountType() {
    return fstrBankAccountType;
  }
  public void set_fstrBankAccountType(String fstrBankAccountType) {
    this.fstrBankAccountType = fstrBankAccountType;
  }
  public tblbankaccount with_fstrBankAccountType(String fstrBankAccountType) {
    this.fstrBankAccountType = fstrBankAccountType;
    return this;
  }
  private Integer fblnInternational;
  public Integer get_fblnInternational() {
    return fblnInternational;
  }
  public void set_fblnInternational(Integer fblnInternational) {
    this.fblnInternational = fblnInternational;
  }
  public tblbankaccount with_fblnInternational(Integer fblnInternational) {
    this.fblnInternational = fblnInternational;
    return this;
  }
  private Integer fblnPreNote;
  public Integer get_fblnPreNote() {
    return fblnPreNote;
  }
  public void set_fblnPreNote(Integer fblnPreNote) {
    this.fblnPreNote = fblnPreNote;
  }
  public tblbankaccount with_fblnPreNote(Integer fblnPreNote) {
    this.fblnPreNote = fblnPreNote;
    return this;
  }
  private java.sql.Timestamp fdtmPreNoteSent;
  public java.sql.Timestamp get_fdtmPreNoteSent() {
    return fdtmPreNoteSent;
  }
  public void set_fdtmPreNoteSent(java.sql.Timestamp fdtmPreNoteSent) {
    this.fdtmPreNoteSent = fdtmPreNoteSent;
  }
  public tblbankaccount with_fdtmPreNoteSent(java.sql.Timestamp fdtmPreNoteSent) {
    this.fdtmPreNoteSent = fdtmPreNoteSent;
    return this;
  }
  private String fstrBankCountryCode;
  public String get_fstrBankCountryCode() {
    return fstrBankCountryCode;
  }
  public void set_fstrBankCountryCode(String fstrBankCountryCode) {
    this.fstrBankCountryCode = fstrBankCountryCode;
  }
  public tblbankaccount with_fstrBankCountryCode(String fstrBankCountryCode) {
    this.fstrBankCountryCode = fstrBankCountryCode;
    return this;
  }
  private String fstrBankAccNumQualifier;
  public String get_fstrBankAccNumQualifier() {
    return fstrBankAccNumQualifier;
  }
  public void set_fstrBankAccNumQualifier(String fstrBankAccNumQualifier) {
    this.fstrBankAccNumQualifier = fstrBankAccNumQualifier;
  }
  public tblbankaccount with_fstrBankAccNumQualifier(String fstrBankAccNumQualifier) {
    this.fstrBankAccNumQualifier = fstrBankAccNumQualifier;
    return this;
  }
  private String fstrCurrencyType;
  public String get_fstrCurrencyType() {
    return fstrCurrencyType;
  }
  public void set_fstrCurrencyType(String fstrCurrencyType) {
    this.fstrCurrencyType = fstrCurrencyType;
  }
  public tblbankaccount with_fstrCurrencyType(String fstrCurrencyType) {
    this.fstrCurrencyType = fstrCurrencyType;
    return this;
  }
  private Long fi64BankNameKey;
  public Long get_fi64BankNameKey() {
    return fi64BankNameKey;
  }
  public void set_fi64BankNameKey(Long fi64BankNameKey) {
    this.fi64BankNameKey = fi64BankNameKey;
  }
  public tblbankaccount with_fi64BankNameKey(Long fi64BankNameKey) {
    this.fi64BankNameKey = fi64BankNameKey;
    return this;
  }
  private String fstrBankName;
  public String get_fstrBankName() {
    return fstrBankName;
  }
  public void set_fstrBankName(String fstrBankName) {
    this.fstrBankName = fstrBankName;
  }
  public tblbankaccount with_fstrBankName(String fstrBankName) {
    this.fstrBankName = fstrBankName;
    return this;
  }
  private Long fi64NameOnAccountNameKey;
  public Long get_fi64NameOnAccountNameKey() {
    return fi64NameOnAccountNameKey;
  }
  public void set_fi64NameOnAccountNameKey(Long fi64NameOnAccountNameKey) {
    this.fi64NameOnAccountNameKey = fi64NameOnAccountNameKey;
  }
  public tblbankaccount with_fi64NameOnAccountNameKey(Long fi64NameOnAccountNameKey) {
    this.fi64NameOnAccountNameKey = fi64NameOnAccountNameKey;
    return this;
  }
  private String fstrNameOnAcc;
  public String get_fstrNameOnAcc() {
    return fstrNameOnAcc;
  }
  public void set_fstrNameOnAcc(String fstrNameOnAcc) {
    this.fstrNameOnAcc = fstrNameOnAcc;
  }
  public tblbankaccount with_fstrNameOnAcc(String fstrNameOnAcc) {
    this.fstrNameOnAcc = fstrNameOnAcc;
    return this;
  }
  private String fstrPhoneType;
  public String get_fstrPhoneType() {
    return fstrPhoneType;
  }
  public void set_fstrPhoneType(String fstrPhoneType) {
    this.fstrPhoneType = fstrPhoneType;
  }
  public tblbankaccount with_fstrPhoneType(String fstrPhoneType) {
    this.fstrPhoneType = fstrPhoneType;
    return this;
  }
  private String fstrPhoneCountry;
  public String get_fstrPhoneCountry() {
    return fstrPhoneCountry;
  }
  public void set_fstrPhoneCountry(String fstrPhoneCountry) {
    this.fstrPhoneCountry = fstrPhoneCountry;
  }
  public tblbankaccount with_fstrPhoneCountry(String fstrPhoneCountry) {
    this.fstrPhoneCountry = fstrPhoneCountry;
    return this;
  }
  private Integer fintPhoneCountryCode;
  public Integer get_fintPhoneCountryCode() {
    return fintPhoneCountryCode;
  }
  public void set_fintPhoneCountryCode(Integer fintPhoneCountryCode) {
    this.fintPhoneCountryCode = fintPhoneCountryCode;
  }
  public tblbankaccount with_fintPhoneCountryCode(Integer fintPhoneCountryCode) {
    this.fintPhoneCountryCode = fintPhoneCountryCode;
    return this;
  }
  private String fstrPhoneAreaCode;
  public String get_fstrPhoneAreaCode() {
    return fstrPhoneAreaCode;
  }
  public void set_fstrPhoneAreaCode(String fstrPhoneAreaCode) {
    this.fstrPhoneAreaCode = fstrPhoneAreaCode;
  }
  public tblbankaccount with_fstrPhoneAreaCode(String fstrPhoneAreaCode) {
    this.fstrPhoneAreaCode = fstrPhoneAreaCode;
    return this;
  }
  private String fstrPhoneNumber;
  public String get_fstrPhoneNumber() {
    return fstrPhoneNumber;
  }
  public void set_fstrPhoneNumber(String fstrPhoneNumber) {
    this.fstrPhoneNumber = fstrPhoneNumber;
  }
  public tblbankaccount with_fstrPhoneNumber(String fstrPhoneNumber) {
    this.fstrPhoneNumber = fstrPhoneNumber;
    return this;
  }
  private String fstrPhoneExtension;
  public String get_fstrPhoneExtension() {
    return fstrPhoneExtension;
  }
  public void set_fstrPhoneExtension(String fstrPhoneExtension) {
    this.fstrPhoneExtension = fstrPhoneExtension;
  }
  public tblbankaccount with_fstrPhoneExtension(String fstrPhoneExtension) {
    this.fstrPhoneExtension = fstrPhoneExtension;
    return this;
  }
  private Long fi64AddressKey;
  public Long get_fi64AddressKey() {
    return fi64AddressKey;
  }
  public void set_fi64AddressKey(Long fi64AddressKey) {
    this.fi64AddressKey = fi64AddressKey;
  }
  public tblbankaccount with_fi64AddressKey(Long fi64AddressKey) {
    this.fi64AddressKey = fi64AddressKey;
    return this;
  }
  private String fstrStreet;
  public String get_fstrStreet() {
    return fstrStreet;
  }
  public void set_fstrStreet(String fstrStreet) {
    this.fstrStreet = fstrStreet;
  }
  public tblbankaccount with_fstrStreet(String fstrStreet) {
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
  public tblbankaccount with_fstrStreet2(String fstrStreet2) {
    this.fstrStreet2 = fstrStreet2;
    return this;
  }
  private String fstrUnit;
  public String get_fstrUnit() {
    return fstrUnit;
  }
  public void set_fstrUnit(String fstrUnit) {
    this.fstrUnit = fstrUnit;
  }
  public tblbankaccount with_fstrUnit(String fstrUnit) {
    this.fstrUnit = fstrUnit;
    return this;
  }
  private String fstrUnitType;
  public String get_fstrUnitType() {
    return fstrUnitType;
  }
  public void set_fstrUnitType(String fstrUnitType) {
    this.fstrUnitType = fstrUnitType;
  }
  public tblbankaccount with_fstrUnitType(String fstrUnitType) {
    this.fstrUnitType = fstrUnitType;
    return this;
  }
  private String fstrCity;
  public String get_fstrCity() {
    return fstrCity;
  }
  public void set_fstrCity(String fstrCity) {
    this.fstrCity = fstrCity;
  }
  public tblbankaccount with_fstrCity(String fstrCity) {
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
  public tblbankaccount with_fstrCounty(String fstrCounty) {
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
  public tblbankaccount with_fstrState(String fstrState) {
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
  public tblbankaccount with_fstrZip(String fstrZip) {
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
  public tblbankaccount with_fstrCountry(String fstrCountry) {
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
  public tblbankaccount with_fstrAttention(String fstrAttention) {
    this.fstrAttention = fstrAttention;
    return this;
  }
  private String fstrUrbanization;
  public String get_fstrUrbanization() {
    return fstrUrbanization;
  }
  public void set_fstrUrbanization(String fstrUrbanization) {
    this.fstrUrbanization = fstrUrbanization;
  }
  public tblbankaccount with_fstrUrbanization(String fstrUrbanization) {
    this.fstrUrbanization = fstrUrbanization;
    return this;
  }
  private Integer fblnVerified;
  public Integer get_fblnVerified() {
    return fblnVerified;
  }
  public void set_fblnVerified(Integer fblnVerified) {
    this.fblnVerified = fblnVerified;
  }
  public tblbankaccount with_fblnVerified(Integer fblnVerified) {
    this.fblnVerified = fblnVerified;
    return this;
  }
  private java.sql.Timestamp fdtmVerified;
  public java.sql.Timestamp get_fdtmVerified() {
    return fdtmVerified;
  }
  public void set_fdtmVerified(java.sql.Timestamp fdtmVerified) {
    this.fdtmVerified = fdtmVerified;
  }
  public tblbankaccount with_fdtmVerified(java.sql.Timestamp fdtmVerified) {
    this.fdtmVerified = fdtmVerified;
    return this;
  }
  private String fstrDistrictOffice;
  public String get_fstrDistrictOffice() {
    return fstrDistrictOffice;
  }
  public void set_fstrDistrictOffice(String fstrDistrictOffice) {
    this.fstrDistrictOffice = fstrDistrictOffice;
  }
  public tblbankaccount with_fstrDistrictOffice(String fstrDistrictOffice) {
    this.fstrDistrictOffice = fstrDistrictOffice;
    return this;
  }
  private String fstrLocationCode;
  public String get_fstrLocationCode() {
    return fstrLocationCode;
  }
  public void set_fstrLocationCode(String fstrLocationCode) {
    this.fstrLocationCode = fstrLocationCode;
  }
  public tblbankaccount with_fstrLocationCode(String fstrLocationCode) {
    this.fstrLocationCode = fstrLocationCode;
    return this;
  }
  private String fstrMunicipality;
  public String get_fstrMunicipality() {
    return fstrMunicipality;
  }
  public void set_fstrMunicipality(String fstrMunicipality) {
    this.fstrMunicipality = fstrMunicipality;
  }
  public tblbankaccount with_fstrMunicipality(String fstrMunicipality) {
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
  public tblbankaccount with_fstrDistrict(String fstrDistrict) {
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
  public tblbankaccount with_fstrSubDistrict(String fstrSubDistrict) {
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
  public tblbankaccount with_fstrSubProvince(String fstrSubProvince) {
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
  public tblbankaccount with_fstrAddressDescription(String fstrAddressDescription) {
    this.fstrAddressDescription = fstrAddressDescription;
    return this;
  }
  private String fstrRowId;
  public String get_fstrRowId() {
    return fstrRowId;
  }
  public void set_fstrRowId(String fstrRowId) {
    this.fstrRowId = fstrRowId;
  }
  public tblbankaccount with_fstrRowId(String fstrRowId) {
    this.fstrRowId = fstrRowId;
    return this;
  }
  private java.sql.Timestamp fdtmCommence;
  public java.sql.Timestamp get_fdtmCommence() {
    return fdtmCommence;
  }
  public void set_fdtmCommence(java.sql.Timestamp fdtmCommence) {
    this.fdtmCommence = fdtmCommence;
  }
  public tblbankaccount with_fdtmCommence(java.sql.Timestamp fdtmCommence) {
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
  public tblbankaccount with_fdtmCease(java.sql.Timestamp fdtmCease) {
    this.fdtmCease = fdtmCease;
    return this;
  }
  private String fstrInvalidationReason;
  public String get_fstrInvalidationReason() {
    return fstrInvalidationReason;
  }
  public void set_fstrInvalidationReason(String fstrInvalidationReason) {
    this.fstrInvalidationReason = fstrInvalidationReason;
  }
  public tblbankaccount with_fstrInvalidationReason(String fstrInvalidationReason) {
    this.fstrInvalidationReason = fstrInvalidationReason;
    return this;
  }
  private Integer fblnActive;
  public Integer get_fblnActive() {
    return fblnActive;
  }
  public void set_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
  }
  public tblbankaccount with_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
    return this;
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblbankaccount with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private java.sql.Timestamp fdtmExpire;
  public java.sql.Timestamp get_fdtmExpire() {
    return fdtmExpire;
  }
  public void set_fdtmExpire(java.sql.Timestamp fdtmExpire) {
    this.fdtmExpire = fdtmExpire;
  }
  public tblbankaccount with_fdtmExpire(java.sql.Timestamp fdtmExpire) {
    this.fdtmExpire = fdtmExpire;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblbankaccount with_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
    return this;
  }
  private java.sql.Timestamp fdtmWhen;
  public java.sql.Timestamp get_fdtmWhen() {
    return fdtmWhen;
  }
  public void set_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
  }
  public tblbankaccount with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblbankaccount)) {
      return false;
    }
    tblbankaccount that = (tblbankaccount) o;
    boolean equal = true;
    equal = equal && (this.flngBankAccountKey == null ? that.flngBankAccountKey == null : this.flngBankAccountKey.equals(that.flngBankAccountKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.fstrBankAccountStandard == null ? that.fstrBankAccountStandard == null : this.fstrBankAccountStandard.equals(that.fstrBankAccountStandard));
    equal = equal && (this.fstrRoutingNumber == null ? that.fstrRoutingNumber == null : this.fstrRoutingNumber.equals(that.fstrRoutingNumber));
    equal = equal && (this.fstrBankAccountNumber == null ? that.fstrBankAccountNumber == null : this.fstrBankAccountNumber.equals(that.fstrBankAccountNumber));
    equal = equal && (this.fstrBankAccountType == null ? that.fstrBankAccountType == null : this.fstrBankAccountType.equals(that.fstrBankAccountType));
    equal = equal && (this.fblnInternational == null ? that.fblnInternational == null : this.fblnInternational.equals(that.fblnInternational));
    equal = equal && (this.fblnPreNote == null ? that.fblnPreNote == null : this.fblnPreNote.equals(that.fblnPreNote));
    equal = equal && (this.fdtmPreNoteSent == null ? that.fdtmPreNoteSent == null : this.fdtmPreNoteSent.equals(that.fdtmPreNoteSent));
    equal = equal && (this.fstrBankCountryCode == null ? that.fstrBankCountryCode == null : this.fstrBankCountryCode.equals(that.fstrBankCountryCode));
    equal = equal && (this.fstrBankAccNumQualifier == null ? that.fstrBankAccNumQualifier == null : this.fstrBankAccNumQualifier.equals(that.fstrBankAccNumQualifier));
    equal = equal && (this.fstrCurrencyType == null ? that.fstrCurrencyType == null : this.fstrCurrencyType.equals(that.fstrCurrencyType));
    equal = equal && (this.fi64BankNameKey == null ? that.fi64BankNameKey == null : this.fi64BankNameKey.equals(that.fi64BankNameKey));
    equal = equal && (this.fstrBankName == null ? that.fstrBankName == null : this.fstrBankName.equals(that.fstrBankName));
    equal = equal && (this.fi64NameOnAccountNameKey == null ? that.fi64NameOnAccountNameKey == null : this.fi64NameOnAccountNameKey.equals(that.fi64NameOnAccountNameKey));
    equal = equal && (this.fstrNameOnAcc == null ? that.fstrNameOnAcc == null : this.fstrNameOnAcc.equals(that.fstrNameOnAcc));
    equal = equal && (this.fstrPhoneType == null ? that.fstrPhoneType == null : this.fstrPhoneType.equals(that.fstrPhoneType));
    equal = equal && (this.fstrPhoneCountry == null ? that.fstrPhoneCountry == null : this.fstrPhoneCountry.equals(that.fstrPhoneCountry));
    equal = equal && (this.fintPhoneCountryCode == null ? that.fintPhoneCountryCode == null : this.fintPhoneCountryCode.equals(that.fintPhoneCountryCode));
    equal = equal && (this.fstrPhoneAreaCode == null ? that.fstrPhoneAreaCode == null : this.fstrPhoneAreaCode.equals(that.fstrPhoneAreaCode));
    equal = equal && (this.fstrPhoneNumber == null ? that.fstrPhoneNumber == null : this.fstrPhoneNumber.equals(that.fstrPhoneNumber));
    equal = equal && (this.fstrPhoneExtension == null ? that.fstrPhoneExtension == null : this.fstrPhoneExtension.equals(that.fstrPhoneExtension));
    equal = equal && (this.fi64AddressKey == null ? that.fi64AddressKey == null : this.fi64AddressKey.equals(that.fi64AddressKey));
    equal = equal && (this.fstrStreet == null ? that.fstrStreet == null : this.fstrStreet.equals(that.fstrStreet));
    equal = equal && (this.fstrStreet2 == null ? that.fstrStreet2 == null : this.fstrStreet2.equals(that.fstrStreet2));
    equal = equal && (this.fstrUnit == null ? that.fstrUnit == null : this.fstrUnit.equals(that.fstrUnit));
    equal = equal && (this.fstrUnitType == null ? that.fstrUnitType == null : this.fstrUnitType.equals(that.fstrUnitType));
    equal = equal && (this.fstrCity == null ? that.fstrCity == null : this.fstrCity.equals(that.fstrCity));
    equal = equal && (this.fstrCounty == null ? that.fstrCounty == null : this.fstrCounty.equals(that.fstrCounty));
    equal = equal && (this.fstrState == null ? that.fstrState == null : this.fstrState.equals(that.fstrState));
    equal = equal && (this.fstrZip == null ? that.fstrZip == null : this.fstrZip.equals(that.fstrZip));
    equal = equal && (this.fstrCountry == null ? that.fstrCountry == null : this.fstrCountry.equals(that.fstrCountry));
    equal = equal && (this.fstrAttention == null ? that.fstrAttention == null : this.fstrAttention.equals(that.fstrAttention));
    equal = equal && (this.fstrUrbanization == null ? that.fstrUrbanization == null : this.fstrUrbanization.equals(that.fstrUrbanization));
    equal = equal && (this.fblnVerified == null ? that.fblnVerified == null : this.fblnVerified.equals(that.fblnVerified));
    equal = equal && (this.fdtmVerified == null ? that.fdtmVerified == null : this.fdtmVerified.equals(that.fdtmVerified));
    equal = equal && (this.fstrDistrictOffice == null ? that.fstrDistrictOffice == null : this.fstrDistrictOffice.equals(that.fstrDistrictOffice));
    equal = equal && (this.fstrLocationCode == null ? that.fstrLocationCode == null : this.fstrLocationCode.equals(that.fstrLocationCode));
    equal = equal && (this.fstrMunicipality == null ? that.fstrMunicipality == null : this.fstrMunicipality.equals(that.fstrMunicipality));
    equal = equal && (this.fstrDistrict == null ? that.fstrDistrict == null : this.fstrDistrict.equals(that.fstrDistrict));
    equal = equal && (this.fstrSubDistrict == null ? that.fstrSubDistrict == null : this.fstrSubDistrict.equals(that.fstrSubDistrict));
    equal = equal && (this.fstrSubProvince == null ? that.fstrSubProvince == null : this.fstrSubProvince.equals(that.fstrSubProvince));
    equal = equal && (this.fstrAddressDescription == null ? that.fstrAddressDescription == null : this.fstrAddressDescription.equals(that.fstrAddressDescription));
    equal = equal && (this.fstrRowId == null ? that.fstrRowId == null : this.fstrRowId.equals(that.fstrRowId));
    equal = equal && (this.fdtmCommence == null ? that.fdtmCommence == null : this.fdtmCommence.equals(that.fdtmCommence));
    equal = equal && (this.fdtmCease == null ? that.fdtmCease == null : this.fdtmCease.equals(that.fdtmCease));
    equal = equal && (this.fstrInvalidationReason == null ? that.fstrInvalidationReason == null : this.fstrInvalidationReason.equals(that.fstrInvalidationReason));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fdtmExpire == null ? that.fdtmExpire == null : this.fdtmExpire.equals(that.fdtmExpire));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblbankaccount)) {
      return false;
    }
    tblbankaccount that = (tblbankaccount) o;
    boolean equal = true;
    equal = equal && (this.flngBankAccountKey == null ? that.flngBankAccountKey == null : this.flngBankAccountKey.equals(that.flngBankAccountKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.fstrBankAccountStandard == null ? that.fstrBankAccountStandard == null : this.fstrBankAccountStandard.equals(that.fstrBankAccountStandard));
    equal = equal && (this.fstrRoutingNumber == null ? that.fstrRoutingNumber == null : this.fstrRoutingNumber.equals(that.fstrRoutingNumber));
    equal = equal && (this.fstrBankAccountNumber == null ? that.fstrBankAccountNumber == null : this.fstrBankAccountNumber.equals(that.fstrBankAccountNumber));
    equal = equal && (this.fstrBankAccountType == null ? that.fstrBankAccountType == null : this.fstrBankAccountType.equals(that.fstrBankAccountType));
    equal = equal && (this.fblnInternational == null ? that.fblnInternational == null : this.fblnInternational.equals(that.fblnInternational));
    equal = equal && (this.fblnPreNote == null ? that.fblnPreNote == null : this.fblnPreNote.equals(that.fblnPreNote));
    equal = equal && (this.fdtmPreNoteSent == null ? that.fdtmPreNoteSent == null : this.fdtmPreNoteSent.equals(that.fdtmPreNoteSent));
    equal = equal && (this.fstrBankCountryCode == null ? that.fstrBankCountryCode == null : this.fstrBankCountryCode.equals(that.fstrBankCountryCode));
    equal = equal && (this.fstrBankAccNumQualifier == null ? that.fstrBankAccNumQualifier == null : this.fstrBankAccNumQualifier.equals(that.fstrBankAccNumQualifier));
    equal = equal && (this.fstrCurrencyType == null ? that.fstrCurrencyType == null : this.fstrCurrencyType.equals(that.fstrCurrencyType));
    equal = equal && (this.fi64BankNameKey == null ? that.fi64BankNameKey == null : this.fi64BankNameKey.equals(that.fi64BankNameKey));
    equal = equal && (this.fstrBankName == null ? that.fstrBankName == null : this.fstrBankName.equals(that.fstrBankName));
    equal = equal && (this.fi64NameOnAccountNameKey == null ? that.fi64NameOnAccountNameKey == null : this.fi64NameOnAccountNameKey.equals(that.fi64NameOnAccountNameKey));
    equal = equal && (this.fstrNameOnAcc == null ? that.fstrNameOnAcc == null : this.fstrNameOnAcc.equals(that.fstrNameOnAcc));
    equal = equal && (this.fstrPhoneType == null ? that.fstrPhoneType == null : this.fstrPhoneType.equals(that.fstrPhoneType));
    equal = equal && (this.fstrPhoneCountry == null ? that.fstrPhoneCountry == null : this.fstrPhoneCountry.equals(that.fstrPhoneCountry));
    equal = equal && (this.fintPhoneCountryCode == null ? that.fintPhoneCountryCode == null : this.fintPhoneCountryCode.equals(that.fintPhoneCountryCode));
    equal = equal && (this.fstrPhoneAreaCode == null ? that.fstrPhoneAreaCode == null : this.fstrPhoneAreaCode.equals(that.fstrPhoneAreaCode));
    equal = equal && (this.fstrPhoneNumber == null ? that.fstrPhoneNumber == null : this.fstrPhoneNumber.equals(that.fstrPhoneNumber));
    equal = equal && (this.fstrPhoneExtension == null ? that.fstrPhoneExtension == null : this.fstrPhoneExtension.equals(that.fstrPhoneExtension));
    equal = equal && (this.fi64AddressKey == null ? that.fi64AddressKey == null : this.fi64AddressKey.equals(that.fi64AddressKey));
    equal = equal && (this.fstrStreet == null ? that.fstrStreet == null : this.fstrStreet.equals(that.fstrStreet));
    equal = equal && (this.fstrStreet2 == null ? that.fstrStreet2 == null : this.fstrStreet2.equals(that.fstrStreet2));
    equal = equal && (this.fstrUnit == null ? that.fstrUnit == null : this.fstrUnit.equals(that.fstrUnit));
    equal = equal && (this.fstrUnitType == null ? that.fstrUnitType == null : this.fstrUnitType.equals(that.fstrUnitType));
    equal = equal && (this.fstrCity == null ? that.fstrCity == null : this.fstrCity.equals(that.fstrCity));
    equal = equal && (this.fstrCounty == null ? that.fstrCounty == null : this.fstrCounty.equals(that.fstrCounty));
    equal = equal && (this.fstrState == null ? that.fstrState == null : this.fstrState.equals(that.fstrState));
    equal = equal && (this.fstrZip == null ? that.fstrZip == null : this.fstrZip.equals(that.fstrZip));
    equal = equal && (this.fstrCountry == null ? that.fstrCountry == null : this.fstrCountry.equals(that.fstrCountry));
    equal = equal && (this.fstrAttention == null ? that.fstrAttention == null : this.fstrAttention.equals(that.fstrAttention));
    equal = equal && (this.fstrUrbanization == null ? that.fstrUrbanization == null : this.fstrUrbanization.equals(that.fstrUrbanization));
    equal = equal && (this.fblnVerified == null ? that.fblnVerified == null : this.fblnVerified.equals(that.fblnVerified));
    equal = equal && (this.fdtmVerified == null ? that.fdtmVerified == null : this.fdtmVerified.equals(that.fdtmVerified));
    equal = equal && (this.fstrDistrictOffice == null ? that.fstrDistrictOffice == null : this.fstrDistrictOffice.equals(that.fstrDistrictOffice));
    equal = equal && (this.fstrLocationCode == null ? that.fstrLocationCode == null : this.fstrLocationCode.equals(that.fstrLocationCode));
    equal = equal && (this.fstrMunicipality == null ? that.fstrMunicipality == null : this.fstrMunicipality.equals(that.fstrMunicipality));
    equal = equal && (this.fstrDistrict == null ? that.fstrDistrict == null : this.fstrDistrict.equals(that.fstrDistrict));
    equal = equal && (this.fstrSubDistrict == null ? that.fstrSubDistrict == null : this.fstrSubDistrict.equals(that.fstrSubDistrict));
    equal = equal && (this.fstrSubProvince == null ? that.fstrSubProvince == null : this.fstrSubProvince.equals(that.fstrSubProvince));
    equal = equal && (this.fstrAddressDescription == null ? that.fstrAddressDescription == null : this.fstrAddressDescription.equals(that.fstrAddressDescription));
    equal = equal && (this.fstrRowId == null ? that.fstrRowId == null : this.fstrRowId.equals(that.fstrRowId));
    equal = equal && (this.fdtmCommence == null ? that.fdtmCommence == null : this.fdtmCommence.equals(that.fdtmCommence));
    equal = equal && (this.fdtmCease == null ? that.fdtmCease == null : this.fdtmCease.equals(that.fdtmCease));
    equal = equal && (this.fstrInvalidationReason == null ? that.fstrInvalidationReason == null : this.fstrInvalidationReason.equals(that.fstrInvalidationReason));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fdtmExpire == null ? that.fdtmExpire == null : this.fdtmExpire.equals(that.fdtmExpire));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngBankAccountKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngCustomerKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fstrBankAccountStandard = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrRoutingNumber = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrBankAccountNumber = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrBankAccountType = JdbcWritableBridge.readString(8, __dbResults);
    this.fblnInternational = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fblnPreNote = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fdtmPreNoteSent = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.fstrBankCountryCode = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrBankAccNumQualifier = JdbcWritableBridge.readString(13, __dbResults);
    this.fstrCurrencyType = JdbcWritableBridge.readString(14, __dbResults);
    this.fi64BankNameKey = JdbcWritableBridge.readLong(15, __dbResults);
    this.fstrBankName = JdbcWritableBridge.readString(16, __dbResults);
    this.fi64NameOnAccountNameKey = JdbcWritableBridge.readLong(17, __dbResults);
    this.fstrNameOnAcc = JdbcWritableBridge.readString(18, __dbResults);
    this.fstrPhoneType = JdbcWritableBridge.readString(19, __dbResults);
    this.fstrPhoneCountry = JdbcWritableBridge.readString(20, __dbResults);
    this.fintPhoneCountryCode = JdbcWritableBridge.readInteger(21, __dbResults);
    this.fstrPhoneAreaCode = JdbcWritableBridge.readString(22, __dbResults);
    this.fstrPhoneNumber = JdbcWritableBridge.readString(23, __dbResults);
    this.fstrPhoneExtension = JdbcWritableBridge.readString(24, __dbResults);
    this.fi64AddressKey = JdbcWritableBridge.readLong(25, __dbResults);
    this.fstrStreet = JdbcWritableBridge.readString(26, __dbResults);
    this.fstrStreet2 = JdbcWritableBridge.readString(27, __dbResults);
    this.fstrUnit = JdbcWritableBridge.readString(28, __dbResults);
    this.fstrUnitType = JdbcWritableBridge.readString(29, __dbResults);
    this.fstrCity = JdbcWritableBridge.readString(30, __dbResults);
    this.fstrCounty = JdbcWritableBridge.readString(31, __dbResults);
    this.fstrState = JdbcWritableBridge.readString(32, __dbResults);
    this.fstrZip = JdbcWritableBridge.readString(33, __dbResults);
    this.fstrCountry = JdbcWritableBridge.readString(34, __dbResults);
    this.fstrAttention = JdbcWritableBridge.readString(35, __dbResults);
    this.fstrUrbanization = JdbcWritableBridge.readString(36, __dbResults);
    this.fblnVerified = JdbcWritableBridge.readInteger(37, __dbResults);
    this.fdtmVerified = JdbcWritableBridge.readTimestamp(38, __dbResults);
    this.fstrDistrictOffice = JdbcWritableBridge.readString(39, __dbResults);
    this.fstrLocationCode = JdbcWritableBridge.readString(40, __dbResults);
    this.fstrMunicipality = JdbcWritableBridge.readString(41, __dbResults);
    this.fstrDistrict = JdbcWritableBridge.readString(42, __dbResults);
    this.fstrSubDistrict = JdbcWritableBridge.readString(43, __dbResults);
    this.fstrSubProvince = JdbcWritableBridge.readString(44, __dbResults);
    this.fstrAddressDescription = JdbcWritableBridge.readString(45, __dbResults);
    this.fstrRowId = JdbcWritableBridge.readString(46, __dbResults);
    this.fdtmCommence = JdbcWritableBridge.readTimestamp(47, __dbResults);
    this.fdtmCease = JdbcWritableBridge.readTimestamp(48, __dbResults);
    this.fstrInvalidationReason = JdbcWritableBridge.readString(49, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(50, __dbResults);
    this.flngDocKey = JdbcWritableBridge.readInteger(51, __dbResults);
    this.fdtmExpire = JdbcWritableBridge.readTimestamp(52, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(53, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(54, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngBankAccountKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngCustomerKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fstrBankAccountStandard = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrRoutingNumber = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrBankAccountNumber = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrBankAccountType = JdbcWritableBridge.readString(8, __dbResults);
    this.fblnInternational = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fblnPreNote = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fdtmPreNoteSent = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.fstrBankCountryCode = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrBankAccNumQualifier = JdbcWritableBridge.readString(13, __dbResults);
    this.fstrCurrencyType = JdbcWritableBridge.readString(14, __dbResults);
    this.fi64BankNameKey = JdbcWritableBridge.readLong(15, __dbResults);
    this.fstrBankName = JdbcWritableBridge.readString(16, __dbResults);
    this.fi64NameOnAccountNameKey = JdbcWritableBridge.readLong(17, __dbResults);
    this.fstrNameOnAcc = JdbcWritableBridge.readString(18, __dbResults);
    this.fstrPhoneType = JdbcWritableBridge.readString(19, __dbResults);
    this.fstrPhoneCountry = JdbcWritableBridge.readString(20, __dbResults);
    this.fintPhoneCountryCode = JdbcWritableBridge.readInteger(21, __dbResults);
    this.fstrPhoneAreaCode = JdbcWritableBridge.readString(22, __dbResults);
    this.fstrPhoneNumber = JdbcWritableBridge.readString(23, __dbResults);
    this.fstrPhoneExtension = JdbcWritableBridge.readString(24, __dbResults);
    this.fi64AddressKey = JdbcWritableBridge.readLong(25, __dbResults);
    this.fstrStreet = JdbcWritableBridge.readString(26, __dbResults);
    this.fstrStreet2 = JdbcWritableBridge.readString(27, __dbResults);
    this.fstrUnit = JdbcWritableBridge.readString(28, __dbResults);
    this.fstrUnitType = JdbcWritableBridge.readString(29, __dbResults);
    this.fstrCity = JdbcWritableBridge.readString(30, __dbResults);
    this.fstrCounty = JdbcWritableBridge.readString(31, __dbResults);
    this.fstrState = JdbcWritableBridge.readString(32, __dbResults);
    this.fstrZip = JdbcWritableBridge.readString(33, __dbResults);
    this.fstrCountry = JdbcWritableBridge.readString(34, __dbResults);
    this.fstrAttention = JdbcWritableBridge.readString(35, __dbResults);
    this.fstrUrbanization = JdbcWritableBridge.readString(36, __dbResults);
    this.fblnVerified = JdbcWritableBridge.readInteger(37, __dbResults);
    this.fdtmVerified = JdbcWritableBridge.readTimestamp(38, __dbResults);
    this.fstrDistrictOffice = JdbcWritableBridge.readString(39, __dbResults);
    this.fstrLocationCode = JdbcWritableBridge.readString(40, __dbResults);
    this.fstrMunicipality = JdbcWritableBridge.readString(41, __dbResults);
    this.fstrDistrict = JdbcWritableBridge.readString(42, __dbResults);
    this.fstrSubDistrict = JdbcWritableBridge.readString(43, __dbResults);
    this.fstrSubProvince = JdbcWritableBridge.readString(44, __dbResults);
    this.fstrAddressDescription = JdbcWritableBridge.readString(45, __dbResults);
    this.fstrRowId = JdbcWritableBridge.readString(46, __dbResults);
    this.fdtmCommence = JdbcWritableBridge.readTimestamp(47, __dbResults);
    this.fdtmCease = JdbcWritableBridge.readTimestamp(48, __dbResults);
    this.fstrInvalidationReason = JdbcWritableBridge.readString(49, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(50, __dbResults);
    this.flngDocKey = JdbcWritableBridge.readInteger(51, __dbResults);
    this.fdtmExpire = JdbcWritableBridge.readTimestamp(52, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(53, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(54, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngBankAccountKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrBankAccountStandard, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRoutingNumber, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrBankAccountNumber, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrBankAccountType, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnInternational, 9 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPreNote, 10 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPreNoteSent, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrBankCountryCode, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrBankAccNumQualifier, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCurrencyType, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeLong(fi64BankNameKey, 15 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(fstrBankName, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeLong(fi64NameOnAccountNameKey, 17 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(fstrNameOnAcc, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneType, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneCountry, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintPhoneCountryCode, 21 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneAreaCode, 22 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneNumber, 23 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneExtension, 24 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeLong(fi64AddressKey, 25 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(fstrStreet, 26 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrStreet2, 27 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrUnit, 28 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrUnitType, 29 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCity, 30 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCounty, 31 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrState, 32 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrZip, 33 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCountry, 34 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAttention, 35 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrUrbanization, 36 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnVerified, 37 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmVerified, 38 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrDistrictOffice, 39 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLocationCode, 40 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMunicipality, 41 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDistrict, 42 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSubDistrict, 43 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSubProvince, 44 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAddressDescription, 45 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRowId, 46 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCommence, 47 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCease, 48 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrInvalidationReason, 49 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 50 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDocKey, 51 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmExpire, 52 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 53 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 54 + __off, 93, __dbStmt);
    return 54;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngBankAccountKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrBankAccountStandard, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRoutingNumber, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrBankAccountNumber, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrBankAccountType, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnInternational, 9 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPreNote, 10 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPreNoteSent, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrBankCountryCode, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrBankAccNumQualifier, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCurrencyType, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeLong(fi64BankNameKey, 15 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(fstrBankName, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeLong(fi64NameOnAccountNameKey, 17 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(fstrNameOnAcc, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneType, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneCountry, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintPhoneCountryCode, 21 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneAreaCode, 22 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneNumber, 23 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneExtension, 24 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeLong(fi64AddressKey, 25 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(fstrStreet, 26 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrStreet2, 27 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrUnit, 28 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrUnitType, 29 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCity, 30 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCounty, 31 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrState, 32 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrZip, 33 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCountry, 34 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAttention, 35 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrUrbanization, 36 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnVerified, 37 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmVerified, 38 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrDistrictOffice, 39 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLocationCode, 40 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMunicipality, 41 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDistrict, 42 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSubDistrict, 43 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSubProvince, 44 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAddressDescription, 45 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRowId, 46 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCommence, 47 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCease, 48 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrInvalidationReason, 49 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 50 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDocKey, 51 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmExpire, 52 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 53 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 54 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngBankAccountKey = null;
    } else {
    this.flngBankAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngVer = null;
    } else {
    this.flngVer = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngVerLast = null;
    } else {
    this.flngVerLast = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngCustomerKey = null;
    } else {
    this.flngCustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrBankAccountStandard = null;
    } else {
    this.fstrBankAccountStandard = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRoutingNumber = null;
    } else {
    this.fstrRoutingNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrBankAccountNumber = null;
    } else {
    this.fstrBankAccountNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrBankAccountType = null;
    } else {
    this.fstrBankAccountType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnInternational = null;
    } else {
    this.fblnInternational = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnPreNote = null;
    } else {
    this.fblnPreNote = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmPreNoteSent = null;
    } else {
    this.fdtmPreNoteSent = new Timestamp(__dataIn.readLong());
    this.fdtmPreNoteSent.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrBankCountryCode = null;
    } else {
    this.fstrBankCountryCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrBankAccNumQualifier = null;
    } else {
    this.fstrBankAccNumQualifier = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCurrencyType = null;
    } else {
    this.fstrCurrencyType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fi64BankNameKey = null;
    } else {
    this.fi64BankNameKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrBankName = null;
    } else {
    this.fstrBankName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fi64NameOnAccountNameKey = null;
    } else {
    this.fi64NameOnAccountNameKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrNameOnAcc = null;
    } else {
    this.fstrNameOnAcc = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPhoneType = null;
    } else {
    this.fstrPhoneType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPhoneCountry = null;
    } else {
    this.fstrPhoneCountry = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fintPhoneCountryCode = null;
    } else {
    this.fintPhoneCountryCode = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPhoneAreaCode = null;
    } else {
    this.fstrPhoneAreaCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPhoneNumber = null;
    } else {
    this.fstrPhoneNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPhoneExtension = null;
    } else {
    this.fstrPhoneExtension = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fi64AddressKey = null;
    } else {
    this.fi64AddressKey = Long.valueOf(__dataIn.readLong());
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
        this.fstrUnit = null;
    } else {
    this.fstrUnit = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrUnitType = null;
    } else {
    this.fstrUnitType = Text.readString(__dataIn);
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
        this.fstrUrbanization = null;
    } else {
    this.fstrUrbanization = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnVerified = null;
    } else {
    this.fblnVerified = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmVerified = null;
    } else {
    this.fdtmVerified = new Timestamp(__dataIn.readLong());
    this.fdtmVerified.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDistrictOffice = null;
    } else {
    this.fstrDistrictOffice = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrLocationCode = null;
    } else {
    this.fstrLocationCode = Text.readString(__dataIn);
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
        this.fstrRowId = null;
    } else {
    this.fstrRowId = Text.readString(__dataIn);
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
        this.fstrInvalidationReason = null;
    } else {
    this.fstrInvalidationReason = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnActive = null;
    } else {
    this.fblnActive = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngDocKey = null;
    } else {
    this.flngDocKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmExpire = null;
    } else {
    this.fdtmExpire = new Timestamp(__dataIn.readLong());
    this.fdtmExpire.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrWho = null;
    } else {
    this.fstrWho = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmWhen = null;
    } else {
    this.fdtmWhen = new Timestamp(__dataIn.readLong());
    this.fdtmWhen.setNanos(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.flngBankAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngBankAccountKey);
    }
    if (null == this.flngVer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVer);
    }
    if (null == this.flngVerLast) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVerLast);
    }
    if (null == this.flngCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey);
    }
    if (null == this.fstrBankAccountStandard) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBankAccountStandard);
    }
    if (null == this.fstrRoutingNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRoutingNumber);
    }
    if (null == this.fstrBankAccountNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBankAccountNumber);
    }
    if (null == this.fstrBankAccountType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBankAccountType);
    }
    if (null == this.fblnInternational) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnInternational);
    }
    if (null == this.fblnPreNote) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPreNote);
    }
    if (null == this.fdtmPreNoteSent) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPreNoteSent.getTime());
    __dataOut.writeInt(this.fdtmPreNoteSent.getNanos());
    }
    if (null == this.fstrBankCountryCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBankCountryCode);
    }
    if (null == this.fstrBankAccNumQualifier) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBankAccNumQualifier);
    }
    if (null == this.fstrCurrencyType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCurrencyType);
    }
    if (null == this.fi64BankNameKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64BankNameKey);
    }
    if (null == this.fstrBankName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBankName);
    }
    if (null == this.fi64NameOnAccountNameKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64NameOnAccountNameKey);
    }
    if (null == this.fstrNameOnAcc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrNameOnAcc);
    }
    if (null == this.fstrPhoneType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneType);
    }
    if (null == this.fstrPhoneCountry) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneCountry);
    }
    if (null == this.fintPhoneCountryCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintPhoneCountryCode);
    }
    if (null == this.fstrPhoneAreaCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneAreaCode);
    }
    if (null == this.fstrPhoneNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneNumber);
    }
    if (null == this.fstrPhoneExtension) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneExtension);
    }
    if (null == this.fi64AddressKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64AddressKey);
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
    if (null == this.fstrUnit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrUnit);
    }
    if (null == this.fstrUnitType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrUnitType);
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
    if (null == this.fstrUrbanization) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrUrbanization);
    }
    if (null == this.fblnVerified) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnVerified);
    }
    if (null == this.fdtmVerified) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmVerified.getTime());
    __dataOut.writeInt(this.fdtmVerified.getNanos());
    }
    if (null == this.fstrDistrictOffice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDistrictOffice);
    }
    if (null == this.fstrLocationCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLocationCode);
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
    if (null == this.fstrRowId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRowId);
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
    if (null == this.fstrInvalidationReason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrInvalidationReason);
    }
    if (null == this.fblnActive) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnActive);
    }
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.fdtmExpire) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmExpire.getTime());
    __dataOut.writeInt(this.fdtmExpire.getNanos());
    }
    if (null == this.fstrWho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWho);
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
    if (null == this.flngBankAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngBankAccountKey);
    }
    if (null == this.flngVer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVer);
    }
    if (null == this.flngVerLast) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVerLast);
    }
    if (null == this.flngCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey);
    }
    if (null == this.fstrBankAccountStandard) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBankAccountStandard);
    }
    if (null == this.fstrRoutingNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRoutingNumber);
    }
    if (null == this.fstrBankAccountNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBankAccountNumber);
    }
    if (null == this.fstrBankAccountType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBankAccountType);
    }
    if (null == this.fblnInternational) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnInternational);
    }
    if (null == this.fblnPreNote) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPreNote);
    }
    if (null == this.fdtmPreNoteSent) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPreNoteSent.getTime());
    __dataOut.writeInt(this.fdtmPreNoteSent.getNanos());
    }
    if (null == this.fstrBankCountryCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBankCountryCode);
    }
    if (null == this.fstrBankAccNumQualifier) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBankAccNumQualifier);
    }
    if (null == this.fstrCurrencyType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCurrencyType);
    }
    if (null == this.fi64BankNameKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64BankNameKey);
    }
    if (null == this.fstrBankName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBankName);
    }
    if (null == this.fi64NameOnAccountNameKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64NameOnAccountNameKey);
    }
    if (null == this.fstrNameOnAcc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrNameOnAcc);
    }
    if (null == this.fstrPhoneType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneType);
    }
    if (null == this.fstrPhoneCountry) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneCountry);
    }
    if (null == this.fintPhoneCountryCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintPhoneCountryCode);
    }
    if (null == this.fstrPhoneAreaCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneAreaCode);
    }
    if (null == this.fstrPhoneNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneNumber);
    }
    if (null == this.fstrPhoneExtension) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneExtension);
    }
    if (null == this.fi64AddressKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64AddressKey);
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
    if (null == this.fstrUnit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrUnit);
    }
    if (null == this.fstrUnitType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrUnitType);
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
    if (null == this.fstrUrbanization) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrUrbanization);
    }
    if (null == this.fblnVerified) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnVerified);
    }
    if (null == this.fdtmVerified) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmVerified.getTime());
    __dataOut.writeInt(this.fdtmVerified.getNanos());
    }
    if (null == this.fstrDistrictOffice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDistrictOffice);
    }
    if (null == this.fstrLocationCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLocationCode);
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
    if (null == this.fstrRowId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRowId);
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
    if (null == this.fstrInvalidationReason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrInvalidationReason);
    }
    if (null == this.fblnActive) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnActive);
    }
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.fdtmExpire) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmExpire.getTime());
    __dataOut.writeInt(this.fdtmExpire.getNanos());
    }
    if (null == this.fstrWho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWho);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngBankAccountKey==null?"\\N":"" + flngBankAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBankAccountStandard==null?"\\N":fstrBankAccountStandard, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRoutingNumber==null?"\\N":fstrRoutingNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBankAccountNumber==null?"\\N":fstrBankAccountNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBankAccountType==null?"\\N":fstrBankAccountType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnInternational==null?"\\N":"" + fblnInternational, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPreNote==null?"\\N":"" + fblnPreNote, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPreNoteSent==null?"\\N":"" + fdtmPreNoteSent, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBankCountryCode==null?"\\N":fstrBankCountryCode, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBankAccNumQualifier==null?"\\N":fstrBankAccNumQualifier, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCurrencyType==null?"\\N":fstrCurrencyType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64BankNameKey==null?"\\N":"" + fi64BankNameKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBankName==null?"\\N":fstrBankName, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64NameOnAccountNameKey==null?"\\N":"" + fi64NameOnAccountNameKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrNameOnAcc==null?"\\N":fstrNameOnAcc, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneType==null?"\\N":fstrPhoneType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneCountry==null?"\\N":fstrPhoneCountry, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintPhoneCountryCode==null?"\\N":"" + fintPhoneCountryCode, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneAreaCode==null?"\\N":fstrPhoneAreaCode, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneNumber==null?"\\N":fstrPhoneNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneExtension==null?"\\N":fstrPhoneExtension, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64AddressKey==null?"\\N":"" + fi64AddressKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStreet==null?"\\N":fstrStreet, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStreet2==null?"\\N":fstrStreet2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrUnit==null?"\\N":fstrUnit, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrUnitType==null?"\\N":fstrUnitType, " ", delimiters));
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
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrUrbanization==null?"\\N":fstrUrbanization, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnVerified==null?"\\N":"" + fblnVerified, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmVerified==null?"\\N":"" + fdtmVerified, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDistrictOffice==null?"\\N":fstrDistrictOffice, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLocationCode==null?"\\N":fstrLocationCode, " ", delimiters));
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
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRowId==null?"\\N":fstrRowId, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCommence==null?"\\N":"" + fdtmCommence, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCease==null?"\\N":"" + fdtmCease, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrInvalidationReason==null?"\\N":fstrInvalidationReason, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnActive==null?"\\N":"" + fblnActive, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmExpire==null?"\\N":"" + fdtmExpire, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWho==null?"\\N":fstrWho, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmWhen==null?"\\N":"" + fdtmWhen, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(flngBankAccountKey==null?"\\N":"" + flngBankAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBankAccountStandard==null?"\\N":fstrBankAccountStandard, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRoutingNumber==null?"\\N":fstrRoutingNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBankAccountNumber==null?"\\N":fstrBankAccountNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBankAccountType==null?"\\N":fstrBankAccountType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnInternational==null?"\\N":"" + fblnInternational, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPreNote==null?"\\N":"" + fblnPreNote, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPreNoteSent==null?"\\N":"" + fdtmPreNoteSent, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBankCountryCode==null?"\\N":fstrBankCountryCode, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBankAccNumQualifier==null?"\\N":fstrBankAccNumQualifier, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCurrencyType==null?"\\N":fstrCurrencyType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64BankNameKey==null?"\\N":"" + fi64BankNameKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBankName==null?"\\N":fstrBankName, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64NameOnAccountNameKey==null?"\\N":"" + fi64NameOnAccountNameKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrNameOnAcc==null?"\\N":fstrNameOnAcc, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneType==null?"\\N":fstrPhoneType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneCountry==null?"\\N":fstrPhoneCountry, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintPhoneCountryCode==null?"\\N":"" + fintPhoneCountryCode, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneAreaCode==null?"\\N":fstrPhoneAreaCode, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneNumber==null?"\\N":fstrPhoneNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneExtension==null?"\\N":fstrPhoneExtension, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64AddressKey==null?"\\N":"" + fi64AddressKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStreet==null?"\\N":fstrStreet, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStreet2==null?"\\N":fstrStreet2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrUnit==null?"\\N":fstrUnit, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrUnitType==null?"\\N":fstrUnitType, " ", delimiters));
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
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrUrbanization==null?"\\N":fstrUrbanization, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnVerified==null?"\\N":"" + fblnVerified, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmVerified==null?"\\N":"" + fdtmVerified, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDistrictOffice==null?"\\N":fstrDistrictOffice, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLocationCode==null?"\\N":fstrLocationCode, " ", delimiters));
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
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRowId==null?"\\N":fstrRowId, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCommence==null?"\\N":"" + fdtmCommence, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCease==null?"\\N":"" + fdtmCease, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrInvalidationReason==null?"\\N":fstrInvalidationReason, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnActive==null?"\\N":"" + fblnActive, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmExpire==null?"\\N":"" + fdtmExpire, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWho==null?"\\N":fstrWho, " ", delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngBankAccountKey = null; } else {
      this.flngBankAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngVer = null; } else {
      this.flngVer = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngVerLast = null; } else {
      this.flngVerLast = Integer.valueOf(__cur_str);
    }

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
    if (__cur_str.equals("null")) { this.fstrBankAccountStandard = null; } else {
      this.fstrBankAccountStandard = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRoutingNumber = null; } else {
      this.fstrRoutingNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrBankAccountNumber = null; } else {
      this.fstrBankAccountNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrBankAccountType = null; } else {
      this.fstrBankAccountType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnInternational = null; } else {
      this.fblnInternational = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPreNote = null; } else {
      this.fblnPreNote = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPreNoteSent = null; } else {
      this.fdtmPreNoteSent = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrBankCountryCode = null; } else {
      this.fstrBankCountryCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrBankAccNumQualifier = null; } else {
      this.fstrBankAccNumQualifier = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCurrencyType = null; } else {
      this.fstrCurrencyType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64BankNameKey = null; } else {
      this.fi64BankNameKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrBankName = null; } else {
      this.fstrBankName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64NameOnAccountNameKey = null; } else {
      this.fi64NameOnAccountNameKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrNameOnAcc = null; } else {
      this.fstrNameOnAcc = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneType = null; } else {
      this.fstrPhoneType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneCountry = null; } else {
      this.fstrPhoneCountry = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintPhoneCountryCode = null; } else {
      this.fintPhoneCountryCode = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneAreaCode = null; } else {
      this.fstrPhoneAreaCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneNumber = null; } else {
      this.fstrPhoneNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneExtension = null; } else {
      this.fstrPhoneExtension = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrUnit = null; } else {
      this.fstrUnit = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrUrbanization = null; } else {
      this.fstrUrbanization = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnVerified = null; } else {
      this.fblnVerified = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmVerified = null; } else {
      this.fdtmVerified = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrLocationCode = null; } else {
      this.fstrLocationCode = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrRowId = null; } else {
      this.fstrRowId = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrInvalidationReason = null; } else {
      this.fstrInvalidationReason = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnActive = null; } else {
      this.fblnActive = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmExpire = null; } else {
      this.fdtmExpire = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrWho = null; } else {
      this.fstrWho = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngBankAccountKey = null; } else {
      this.flngBankAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngVer = null; } else {
      this.flngVer = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngVerLast = null; } else {
      this.flngVerLast = Integer.valueOf(__cur_str);
    }

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
    if (__cur_str.equals("null")) { this.fstrBankAccountStandard = null; } else {
      this.fstrBankAccountStandard = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRoutingNumber = null; } else {
      this.fstrRoutingNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrBankAccountNumber = null; } else {
      this.fstrBankAccountNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrBankAccountType = null; } else {
      this.fstrBankAccountType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnInternational = null; } else {
      this.fblnInternational = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPreNote = null; } else {
      this.fblnPreNote = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPreNoteSent = null; } else {
      this.fdtmPreNoteSent = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrBankCountryCode = null; } else {
      this.fstrBankCountryCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrBankAccNumQualifier = null; } else {
      this.fstrBankAccNumQualifier = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCurrencyType = null; } else {
      this.fstrCurrencyType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64BankNameKey = null; } else {
      this.fi64BankNameKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrBankName = null; } else {
      this.fstrBankName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64NameOnAccountNameKey = null; } else {
      this.fi64NameOnAccountNameKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrNameOnAcc = null; } else {
      this.fstrNameOnAcc = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneType = null; } else {
      this.fstrPhoneType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneCountry = null; } else {
      this.fstrPhoneCountry = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintPhoneCountryCode = null; } else {
      this.fintPhoneCountryCode = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneAreaCode = null; } else {
      this.fstrPhoneAreaCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneNumber = null; } else {
      this.fstrPhoneNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneExtension = null; } else {
      this.fstrPhoneExtension = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrUnit = null; } else {
      this.fstrUnit = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrUrbanization = null; } else {
      this.fstrUrbanization = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnVerified = null; } else {
      this.fblnVerified = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmVerified = null; } else {
      this.fdtmVerified = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrLocationCode = null; } else {
      this.fstrLocationCode = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrRowId = null; } else {
      this.fstrRowId = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrInvalidationReason = null; } else {
      this.fstrInvalidationReason = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnActive = null; } else {
      this.fblnActive = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmExpire = null; } else {
      this.fdtmExpire = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrWho = null; } else {
      this.fstrWho = __cur_str;
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
    tblbankaccount o = (tblbankaccount) super.clone();
    o.fdtmPreNoteSent = (o.fdtmPreNoteSent != null) ? (java.sql.Timestamp) o.fdtmPreNoteSent.clone() : null;
    o.fdtmVerified = (o.fdtmVerified != null) ? (java.sql.Timestamp) o.fdtmVerified.clone() : null;
    o.fdtmCommence = (o.fdtmCommence != null) ? (java.sql.Timestamp) o.fdtmCommence.clone() : null;
    o.fdtmCease = (o.fdtmCease != null) ? (java.sql.Timestamp) o.fdtmCease.clone() : null;
    o.fdtmExpire = (o.fdtmExpire != null) ? (java.sql.Timestamp) o.fdtmExpire.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblbankaccount o) throws CloneNotSupportedException {
    o.fdtmPreNoteSent = (o.fdtmPreNoteSent != null) ? (java.sql.Timestamp) o.fdtmPreNoteSent.clone() : null;
    o.fdtmVerified = (o.fdtmVerified != null) ? (java.sql.Timestamp) o.fdtmVerified.clone() : null;
    o.fdtmCommence = (o.fdtmCommence != null) ? (java.sql.Timestamp) o.fdtmCommence.clone() : null;
    o.fdtmCease = (o.fdtmCease != null) ? (java.sql.Timestamp) o.fdtmCease.clone() : null;
    o.fdtmExpire = (o.fdtmExpire != null) ? (java.sql.Timestamp) o.fdtmExpire.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngBankAccountKey", this.flngBankAccountKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("fstrBankAccountStandard", this.fstrBankAccountStandard);
    __sqoop$field_map.put("fstrRoutingNumber", this.fstrRoutingNumber);
    __sqoop$field_map.put("fstrBankAccountNumber", this.fstrBankAccountNumber);
    __sqoop$field_map.put("fstrBankAccountType", this.fstrBankAccountType);
    __sqoop$field_map.put("fblnInternational", this.fblnInternational);
    __sqoop$field_map.put("fblnPreNote", this.fblnPreNote);
    __sqoop$field_map.put("fdtmPreNoteSent", this.fdtmPreNoteSent);
    __sqoop$field_map.put("fstrBankCountryCode", this.fstrBankCountryCode);
    __sqoop$field_map.put("fstrBankAccNumQualifier", this.fstrBankAccNumQualifier);
    __sqoop$field_map.put("fstrCurrencyType", this.fstrCurrencyType);
    __sqoop$field_map.put("fi64BankNameKey", this.fi64BankNameKey);
    __sqoop$field_map.put("fstrBankName", this.fstrBankName);
    __sqoop$field_map.put("fi64NameOnAccountNameKey", this.fi64NameOnAccountNameKey);
    __sqoop$field_map.put("fstrNameOnAcc", this.fstrNameOnAcc);
    __sqoop$field_map.put("fstrPhoneType", this.fstrPhoneType);
    __sqoop$field_map.put("fstrPhoneCountry", this.fstrPhoneCountry);
    __sqoop$field_map.put("fintPhoneCountryCode", this.fintPhoneCountryCode);
    __sqoop$field_map.put("fstrPhoneAreaCode", this.fstrPhoneAreaCode);
    __sqoop$field_map.put("fstrPhoneNumber", this.fstrPhoneNumber);
    __sqoop$field_map.put("fstrPhoneExtension", this.fstrPhoneExtension);
    __sqoop$field_map.put("fi64AddressKey", this.fi64AddressKey);
    __sqoop$field_map.put("fstrStreet", this.fstrStreet);
    __sqoop$field_map.put("fstrStreet2", this.fstrStreet2);
    __sqoop$field_map.put("fstrUnit", this.fstrUnit);
    __sqoop$field_map.put("fstrUnitType", this.fstrUnitType);
    __sqoop$field_map.put("fstrCity", this.fstrCity);
    __sqoop$field_map.put("fstrCounty", this.fstrCounty);
    __sqoop$field_map.put("fstrState", this.fstrState);
    __sqoop$field_map.put("fstrZip", this.fstrZip);
    __sqoop$field_map.put("fstrCountry", this.fstrCountry);
    __sqoop$field_map.put("fstrAttention", this.fstrAttention);
    __sqoop$field_map.put("fstrUrbanization", this.fstrUrbanization);
    __sqoop$field_map.put("fblnVerified", this.fblnVerified);
    __sqoop$field_map.put("fdtmVerified", this.fdtmVerified);
    __sqoop$field_map.put("fstrDistrictOffice", this.fstrDistrictOffice);
    __sqoop$field_map.put("fstrLocationCode", this.fstrLocationCode);
    __sqoop$field_map.put("fstrMunicipality", this.fstrMunicipality);
    __sqoop$field_map.put("fstrDistrict", this.fstrDistrict);
    __sqoop$field_map.put("fstrSubDistrict", this.fstrSubDistrict);
    __sqoop$field_map.put("fstrSubProvince", this.fstrSubProvince);
    __sqoop$field_map.put("fstrAddressDescription", this.fstrAddressDescription);
    __sqoop$field_map.put("fstrRowId", this.fstrRowId);
    __sqoop$field_map.put("fdtmCommence", this.fdtmCommence);
    __sqoop$field_map.put("fdtmCease", this.fdtmCease);
    __sqoop$field_map.put("fstrInvalidationReason", this.fstrInvalidationReason);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fdtmExpire", this.fdtmExpire);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngBankAccountKey", this.flngBankAccountKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("fstrBankAccountStandard", this.fstrBankAccountStandard);
    __sqoop$field_map.put("fstrRoutingNumber", this.fstrRoutingNumber);
    __sqoop$field_map.put("fstrBankAccountNumber", this.fstrBankAccountNumber);
    __sqoop$field_map.put("fstrBankAccountType", this.fstrBankAccountType);
    __sqoop$field_map.put("fblnInternational", this.fblnInternational);
    __sqoop$field_map.put("fblnPreNote", this.fblnPreNote);
    __sqoop$field_map.put("fdtmPreNoteSent", this.fdtmPreNoteSent);
    __sqoop$field_map.put("fstrBankCountryCode", this.fstrBankCountryCode);
    __sqoop$field_map.put("fstrBankAccNumQualifier", this.fstrBankAccNumQualifier);
    __sqoop$field_map.put("fstrCurrencyType", this.fstrCurrencyType);
    __sqoop$field_map.put("fi64BankNameKey", this.fi64BankNameKey);
    __sqoop$field_map.put("fstrBankName", this.fstrBankName);
    __sqoop$field_map.put("fi64NameOnAccountNameKey", this.fi64NameOnAccountNameKey);
    __sqoop$field_map.put("fstrNameOnAcc", this.fstrNameOnAcc);
    __sqoop$field_map.put("fstrPhoneType", this.fstrPhoneType);
    __sqoop$field_map.put("fstrPhoneCountry", this.fstrPhoneCountry);
    __sqoop$field_map.put("fintPhoneCountryCode", this.fintPhoneCountryCode);
    __sqoop$field_map.put("fstrPhoneAreaCode", this.fstrPhoneAreaCode);
    __sqoop$field_map.put("fstrPhoneNumber", this.fstrPhoneNumber);
    __sqoop$field_map.put("fstrPhoneExtension", this.fstrPhoneExtension);
    __sqoop$field_map.put("fi64AddressKey", this.fi64AddressKey);
    __sqoop$field_map.put("fstrStreet", this.fstrStreet);
    __sqoop$field_map.put("fstrStreet2", this.fstrStreet2);
    __sqoop$field_map.put("fstrUnit", this.fstrUnit);
    __sqoop$field_map.put("fstrUnitType", this.fstrUnitType);
    __sqoop$field_map.put("fstrCity", this.fstrCity);
    __sqoop$field_map.put("fstrCounty", this.fstrCounty);
    __sqoop$field_map.put("fstrState", this.fstrState);
    __sqoop$field_map.put("fstrZip", this.fstrZip);
    __sqoop$field_map.put("fstrCountry", this.fstrCountry);
    __sqoop$field_map.put("fstrAttention", this.fstrAttention);
    __sqoop$field_map.put("fstrUrbanization", this.fstrUrbanization);
    __sqoop$field_map.put("fblnVerified", this.fblnVerified);
    __sqoop$field_map.put("fdtmVerified", this.fdtmVerified);
    __sqoop$field_map.put("fstrDistrictOffice", this.fstrDistrictOffice);
    __sqoop$field_map.put("fstrLocationCode", this.fstrLocationCode);
    __sqoop$field_map.put("fstrMunicipality", this.fstrMunicipality);
    __sqoop$field_map.put("fstrDistrict", this.fstrDistrict);
    __sqoop$field_map.put("fstrSubDistrict", this.fstrSubDistrict);
    __sqoop$field_map.put("fstrSubProvince", this.fstrSubProvince);
    __sqoop$field_map.put("fstrAddressDescription", this.fstrAddressDescription);
    __sqoop$field_map.put("fstrRowId", this.fstrRowId);
    __sqoop$field_map.put("fdtmCommence", this.fdtmCommence);
    __sqoop$field_map.put("fdtmCease", this.fdtmCease);
    __sqoop$field_map.put("fstrInvalidationReason", this.fstrInvalidationReason);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fdtmExpire", this.fdtmExpire);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
