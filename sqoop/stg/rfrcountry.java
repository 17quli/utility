// ORM class for table 'rfrcountry'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Dec 03 22:56:59 NZDT 2020
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

public class rfrcountry extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("fstrCountry", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrcountry.this.fstrCountry = (String)value;
      }
    });
    setters.put("fintCountryCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrcountry.this.fintCountryCode = (Integer)value;
      }
    });
    setters.put("fstrZipMask", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrcountry.this.fstrZipMask = (String)value;
      }
    });
    setters.put("fstrZipClipChars", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrcountry.this.fstrZipClipChars = (String)value;
      }
    });
    setters.put("fstrAreaCodeMask", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrcountry.this.fstrAreaCodeMask = (String)value;
      }
    });
    setters.put("fstrAreaCodeClipChars", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrcountry.this.fstrAreaCodeClipChars = (String)value;
      }
    });
    setters.put("fstrPhoneMask", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrcountry.this.fstrPhoneMask = (String)value;
      }
    });
    setters.put("fstrPhoneClipChars", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrcountry.this.fstrPhoneClipChars = (String)value;
      }
    });
    setters.put("fstrPhoneValidation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrcountry.this.fstrPhoneValidation = (String)value;
      }
    });
    setters.put("fstrPhoneFormat", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrcountry.this.fstrPhoneFormat = (String)value;
      }
    });
    setters.put("fstrSearchBo", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrcountry.this.fstrSearchBo = (String)value;
      }
    });
    setters.put("fstrAddressView", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrcountry.this.fstrAddressView = (String)value;
      }
    });
    setters.put("fstrValidationBo", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrcountry.this.fstrValidationBo = (String)value;
      }
    });
    setters.put("fblnAddressConfirm", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrcountry.this.fblnAddressConfirm = (Integer)value;
      }
    });
    setters.put("fstrMailValidationBo", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrcountry.this.fstrMailValidationBo = (String)value;
      }
    });
    setters.put("fstrSingleLineParseObject", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrcountry.this.fstrSingleLineParseObject = (String)value;
      }
    });
    setters.put("fstrRequiredFields", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrcountry.this.fstrRequiredFields = (String)value;
      }
    });
    setters.put("fstrHiddenFields", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrcountry.this.fstrHiddenFields = (String)value;
      }
    });
    setters.put("fstrIso2A", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrcountry.this.fstrIso2A = (String)value;
      }
    });
    setters.put("fstrIso3A", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrcountry.this.fstrIso3A = (String)value;
      }
    });
    setters.put("flngIsoNumeric", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrcountry.this.flngIsoNumeric = (Integer)value;
      }
    });
    setters.put("fstrIRSCountryCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrcountry.this.fstrIRSCountryCode = (String)value;
      }
    });
    setters.put("fblnHasVirtualState", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrcountry.this.fblnHasVirtualState = (Integer)value;
      }
    });
    setters.put("fstrAddressSearchIndex", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrcountry.this.fstrAddressSearchIndex = (String)value;
      }
    });
    setters.put("fstrDefaultLanguage", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrcountry.this.fstrDefaultLanguage = (String)value;
      }
    });
    setters.put("fblnActive", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrcountry.this.fblnActive = (Integer)value;
      }
    });
  }
  public rfrcountry() {
    init0();
  }
  private String fstrCountry;
  public String get_fstrCountry() {
    return fstrCountry;
  }
  public void set_fstrCountry(String fstrCountry) {
    this.fstrCountry = fstrCountry;
  }
  public rfrcountry with_fstrCountry(String fstrCountry) {
    this.fstrCountry = fstrCountry;
    return this;
  }
  private Integer fintCountryCode;
  public Integer get_fintCountryCode() {
    return fintCountryCode;
  }
  public void set_fintCountryCode(Integer fintCountryCode) {
    this.fintCountryCode = fintCountryCode;
  }
  public rfrcountry with_fintCountryCode(Integer fintCountryCode) {
    this.fintCountryCode = fintCountryCode;
    return this;
  }
  private String fstrZipMask;
  public String get_fstrZipMask() {
    return fstrZipMask;
  }
  public void set_fstrZipMask(String fstrZipMask) {
    this.fstrZipMask = fstrZipMask;
  }
  public rfrcountry with_fstrZipMask(String fstrZipMask) {
    this.fstrZipMask = fstrZipMask;
    return this;
  }
  private String fstrZipClipChars;
  public String get_fstrZipClipChars() {
    return fstrZipClipChars;
  }
  public void set_fstrZipClipChars(String fstrZipClipChars) {
    this.fstrZipClipChars = fstrZipClipChars;
  }
  public rfrcountry with_fstrZipClipChars(String fstrZipClipChars) {
    this.fstrZipClipChars = fstrZipClipChars;
    return this;
  }
  private String fstrAreaCodeMask;
  public String get_fstrAreaCodeMask() {
    return fstrAreaCodeMask;
  }
  public void set_fstrAreaCodeMask(String fstrAreaCodeMask) {
    this.fstrAreaCodeMask = fstrAreaCodeMask;
  }
  public rfrcountry with_fstrAreaCodeMask(String fstrAreaCodeMask) {
    this.fstrAreaCodeMask = fstrAreaCodeMask;
    return this;
  }
  private String fstrAreaCodeClipChars;
  public String get_fstrAreaCodeClipChars() {
    return fstrAreaCodeClipChars;
  }
  public void set_fstrAreaCodeClipChars(String fstrAreaCodeClipChars) {
    this.fstrAreaCodeClipChars = fstrAreaCodeClipChars;
  }
  public rfrcountry with_fstrAreaCodeClipChars(String fstrAreaCodeClipChars) {
    this.fstrAreaCodeClipChars = fstrAreaCodeClipChars;
    return this;
  }
  private String fstrPhoneMask;
  public String get_fstrPhoneMask() {
    return fstrPhoneMask;
  }
  public void set_fstrPhoneMask(String fstrPhoneMask) {
    this.fstrPhoneMask = fstrPhoneMask;
  }
  public rfrcountry with_fstrPhoneMask(String fstrPhoneMask) {
    this.fstrPhoneMask = fstrPhoneMask;
    return this;
  }
  private String fstrPhoneClipChars;
  public String get_fstrPhoneClipChars() {
    return fstrPhoneClipChars;
  }
  public void set_fstrPhoneClipChars(String fstrPhoneClipChars) {
    this.fstrPhoneClipChars = fstrPhoneClipChars;
  }
  public rfrcountry with_fstrPhoneClipChars(String fstrPhoneClipChars) {
    this.fstrPhoneClipChars = fstrPhoneClipChars;
    return this;
  }
  private String fstrPhoneValidation;
  public String get_fstrPhoneValidation() {
    return fstrPhoneValidation;
  }
  public void set_fstrPhoneValidation(String fstrPhoneValidation) {
    this.fstrPhoneValidation = fstrPhoneValidation;
  }
  public rfrcountry with_fstrPhoneValidation(String fstrPhoneValidation) {
    this.fstrPhoneValidation = fstrPhoneValidation;
    return this;
  }
  private String fstrPhoneFormat;
  public String get_fstrPhoneFormat() {
    return fstrPhoneFormat;
  }
  public void set_fstrPhoneFormat(String fstrPhoneFormat) {
    this.fstrPhoneFormat = fstrPhoneFormat;
  }
  public rfrcountry with_fstrPhoneFormat(String fstrPhoneFormat) {
    this.fstrPhoneFormat = fstrPhoneFormat;
    return this;
  }
  private String fstrSearchBo;
  public String get_fstrSearchBo() {
    return fstrSearchBo;
  }
  public void set_fstrSearchBo(String fstrSearchBo) {
    this.fstrSearchBo = fstrSearchBo;
  }
  public rfrcountry with_fstrSearchBo(String fstrSearchBo) {
    this.fstrSearchBo = fstrSearchBo;
    return this;
  }
  private String fstrAddressView;
  public String get_fstrAddressView() {
    return fstrAddressView;
  }
  public void set_fstrAddressView(String fstrAddressView) {
    this.fstrAddressView = fstrAddressView;
  }
  public rfrcountry with_fstrAddressView(String fstrAddressView) {
    this.fstrAddressView = fstrAddressView;
    return this;
  }
  private String fstrValidationBo;
  public String get_fstrValidationBo() {
    return fstrValidationBo;
  }
  public void set_fstrValidationBo(String fstrValidationBo) {
    this.fstrValidationBo = fstrValidationBo;
  }
  public rfrcountry with_fstrValidationBo(String fstrValidationBo) {
    this.fstrValidationBo = fstrValidationBo;
    return this;
  }
  private Integer fblnAddressConfirm;
  public Integer get_fblnAddressConfirm() {
    return fblnAddressConfirm;
  }
  public void set_fblnAddressConfirm(Integer fblnAddressConfirm) {
    this.fblnAddressConfirm = fblnAddressConfirm;
  }
  public rfrcountry with_fblnAddressConfirm(Integer fblnAddressConfirm) {
    this.fblnAddressConfirm = fblnAddressConfirm;
    return this;
  }
  private String fstrMailValidationBo;
  public String get_fstrMailValidationBo() {
    return fstrMailValidationBo;
  }
  public void set_fstrMailValidationBo(String fstrMailValidationBo) {
    this.fstrMailValidationBo = fstrMailValidationBo;
  }
  public rfrcountry with_fstrMailValidationBo(String fstrMailValidationBo) {
    this.fstrMailValidationBo = fstrMailValidationBo;
    return this;
  }
  private String fstrSingleLineParseObject;
  public String get_fstrSingleLineParseObject() {
    return fstrSingleLineParseObject;
  }
  public void set_fstrSingleLineParseObject(String fstrSingleLineParseObject) {
    this.fstrSingleLineParseObject = fstrSingleLineParseObject;
  }
  public rfrcountry with_fstrSingleLineParseObject(String fstrSingleLineParseObject) {
    this.fstrSingleLineParseObject = fstrSingleLineParseObject;
    return this;
  }
  private String fstrRequiredFields;
  public String get_fstrRequiredFields() {
    return fstrRequiredFields;
  }
  public void set_fstrRequiredFields(String fstrRequiredFields) {
    this.fstrRequiredFields = fstrRequiredFields;
  }
  public rfrcountry with_fstrRequiredFields(String fstrRequiredFields) {
    this.fstrRequiredFields = fstrRequiredFields;
    return this;
  }
  private String fstrHiddenFields;
  public String get_fstrHiddenFields() {
    return fstrHiddenFields;
  }
  public void set_fstrHiddenFields(String fstrHiddenFields) {
    this.fstrHiddenFields = fstrHiddenFields;
  }
  public rfrcountry with_fstrHiddenFields(String fstrHiddenFields) {
    this.fstrHiddenFields = fstrHiddenFields;
    return this;
  }
  private String fstrIso2A;
  public String get_fstrIso2A() {
    return fstrIso2A;
  }
  public void set_fstrIso2A(String fstrIso2A) {
    this.fstrIso2A = fstrIso2A;
  }
  public rfrcountry with_fstrIso2A(String fstrIso2A) {
    this.fstrIso2A = fstrIso2A;
    return this;
  }
  private String fstrIso3A;
  public String get_fstrIso3A() {
    return fstrIso3A;
  }
  public void set_fstrIso3A(String fstrIso3A) {
    this.fstrIso3A = fstrIso3A;
  }
  public rfrcountry with_fstrIso3A(String fstrIso3A) {
    this.fstrIso3A = fstrIso3A;
    return this;
  }
  private Integer flngIsoNumeric;
  public Integer get_flngIsoNumeric() {
    return flngIsoNumeric;
  }
  public void set_flngIsoNumeric(Integer flngIsoNumeric) {
    this.flngIsoNumeric = flngIsoNumeric;
  }
  public rfrcountry with_flngIsoNumeric(Integer flngIsoNumeric) {
    this.flngIsoNumeric = flngIsoNumeric;
    return this;
  }
  private String fstrIRSCountryCode;
  public String get_fstrIRSCountryCode() {
    return fstrIRSCountryCode;
  }
  public void set_fstrIRSCountryCode(String fstrIRSCountryCode) {
    this.fstrIRSCountryCode = fstrIRSCountryCode;
  }
  public rfrcountry with_fstrIRSCountryCode(String fstrIRSCountryCode) {
    this.fstrIRSCountryCode = fstrIRSCountryCode;
    return this;
  }
  private Integer fblnHasVirtualState;
  public Integer get_fblnHasVirtualState() {
    return fblnHasVirtualState;
  }
  public void set_fblnHasVirtualState(Integer fblnHasVirtualState) {
    this.fblnHasVirtualState = fblnHasVirtualState;
  }
  public rfrcountry with_fblnHasVirtualState(Integer fblnHasVirtualState) {
    this.fblnHasVirtualState = fblnHasVirtualState;
    return this;
  }
  private String fstrAddressSearchIndex;
  public String get_fstrAddressSearchIndex() {
    return fstrAddressSearchIndex;
  }
  public void set_fstrAddressSearchIndex(String fstrAddressSearchIndex) {
    this.fstrAddressSearchIndex = fstrAddressSearchIndex;
  }
  public rfrcountry with_fstrAddressSearchIndex(String fstrAddressSearchIndex) {
    this.fstrAddressSearchIndex = fstrAddressSearchIndex;
    return this;
  }
  private String fstrDefaultLanguage;
  public String get_fstrDefaultLanguage() {
    return fstrDefaultLanguage;
  }
  public void set_fstrDefaultLanguage(String fstrDefaultLanguage) {
    this.fstrDefaultLanguage = fstrDefaultLanguage;
  }
  public rfrcountry with_fstrDefaultLanguage(String fstrDefaultLanguage) {
    this.fstrDefaultLanguage = fstrDefaultLanguage;
    return this;
  }
  private Integer fblnActive;
  public Integer get_fblnActive() {
    return fblnActive;
  }
  public void set_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
  }
  public rfrcountry with_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof rfrcountry)) {
      return false;
    }
    rfrcountry that = (rfrcountry) o;
    boolean equal = true;
    equal = equal && (this.fstrCountry == null ? that.fstrCountry == null : this.fstrCountry.equals(that.fstrCountry));
    equal = equal && (this.fintCountryCode == null ? that.fintCountryCode == null : this.fintCountryCode.equals(that.fintCountryCode));
    equal = equal && (this.fstrZipMask == null ? that.fstrZipMask == null : this.fstrZipMask.equals(that.fstrZipMask));
    equal = equal && (this.fstrZipClipChars == null ? that.fstrZipClipChars == null : this.fstrZipClipChars.equals(that.fstrZipClipChars));
    equal = equal && (this.fstrAreaCodeMask == null ? that.fstrAreaCodeMask == null : this.fstrAreaCodeMask.equals(that.fstrAreaCodeMask));
    equal = equal && (this.fstrAreaCodeClipChars == null ? that.fstrAreaCodeClipChars == null : this.fstrAreaCodeClipChars.equals(that.fstrAreaCodeClipChars));
    equal = equal && (this.fstrPhoneMask == null ? that.fstrPhoneMask == null : this.fstrPhoneMask.equals(that.fstrPhoneMask));
    equal = equal && (this.fstrPhoneClipChars == null ? that.fstrPhoneClipChars == null : this.fstrPhoneClipChars.equals(that.fstrPhoneClipChars));
    equal = equal && (this.fstrPhoneValidation == null ? that.fstrPhoneValidation == null : this.fstrPhoneValidation.equals(that.fstrPhoneValidation));
    equal = equal && (this.fstrPhoneFormat == null ? that.fstrPhoneFormat == null : this.fstrPhoneFormat.equals(that.fstrPhoneFormat));
    equal = equal && (this.fstrSearchBo == null ? that.fstrSearchBo == null : this.fstrSearchBo.equals(that.fstrSearchBo));
    equal = equal && (this.fstrAddressView == null ? that.fstrAddressView == null : this.fstrAddressView.equals(that.fstrAddressView));
    equal = equal && (this.fstrValidationBo == null ? that.fstrValidationBo == null : this.fstrValidationBo.equals(that.fstrValidationBo));
    equal = equal && (this.fblnAddressConfirm == null ? that.fblnAddressConfirm == null : this.fblnAddressConfirm.equals(that.fblnAddressConfirm));
    equal = equal && (this.fstrMailValidationBo == null ? that.fstrMailValidationBo == null : this.fstrMailValidationBo.equals(that.fstrMailValidationBo));
    equal = equal && (this.fstrSingleLineParseObject == null ? that.fstrSingleLineParseObject == null : this.fstrSingleLineParseObject.equals(that.fstrSingleLineParseObject));
    equal = equal && (this.fstrRequiredFields == null ? that.fstrRequiredFields == null : this.fstrRequiredFields.equals(that.fstrRequiredFields));
    equal = equal && (this.fstrHiddenFields == null ? that.fstrHiddenFields == null : this.fstrHiddenFields.equals(that.fstrHiddenFields));
    equal = equal && (this.fstrIso2A == null ? that.fstrIso2A == null : this.fstrIso2A.equals(that.fstrIso2A));
    equal = equal && (this.fstrIso3A == null ? that.fstrIso3A == null : this.fstrIso3A.equals(that.fstrIso3A));
    equal = equal && (this.flngIsoNumeric == null ? that.flngIsoNumeric == null : this.flngIsoNumeric.equals(that.flngIsoNumeric));
    equal = equal && (this.fstrIRSCountryCode == null ? that.fstrIRSCountryCode == null : this.fstrIRSCountryCode.equals(that.fstrIRSCountryCode));
    equal = equal && (this.fblnHasVirtualState == null ? that.fblnHasVirtualState == null : this.fblnHasVirtualState.equals(that.fblnHasVirtualState));
    equal = equal && (this.fstrAddressSearchIndex == null ? that.fstrAddressSearchIndex == null : this.fstrAddressSearchIndex.equals(that.fstrAddressSearchIndex));
    equal = equal && (this.fstrDefaultLanguage == null ? that.fstrDefaultLanguage == null : this.fstrDefaultLanguage.equals(that.fstrDefaultLanguage));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof rfrcountry)) {
      return false;
    }
    rfrcountry that = (rfrcountry) o;
    boolean equal = true;
    equal = equal && (this.fstrCountry == null ? that.fstrCountry == null : this.fstrCountry.equals(that.fstrCountry));
    equal = equal && (this.fintCountryCode == null ? that.fintCountryCode == null : this.fintCountryCode.equals(that.fintCountryCode));
    equal = equal && (this.fstrZipMask == null ? that.fstrZipMask == null : this.fstrZipMask.equals(that.fstrZipMask));
    equal = equal && (this.fstrZipClipChars == null ? that.fstrZipClipChars == null : this.fstrZipClipChars.equals(that.fstrZipClipChars));
    equal = equal && (this.fstrAreaCodeMask == null ? that.fstrAreaCodeMask == null : this.fstrAreaCodeMask.equals(that.fstrAreaCodeMask));
    equal = equal && (this.fstrAreaCodeClipChars == null ? that.fstrAreaCodeClipChars == null : this.fstrAreaCodeClipChars.equals(that.fstrAreaCodeClipChars));
    equal = equal && (this.fstrPhoneMask == null ? that.fstrPhoneMask == null : this.fstrPhoneMask.equals(that.fstrPhoneMask));
    equal = equal && (this.fstrPhoneClipChars == null ? that.fstrPhoneClipChars == null : this.fstrPhoneClipChars.equals(that.fstrPhoneClipChars));
    equal = equal && (this.fstrPhoneValidation == null ? that.fstrPhoneValidation == null : this.fstrPhoneValidation.equals(that.fstrPhoneValidation));
    equal = equal && (this.fstrPhoneFormat == null ? that.fstrPhoneFormat == null : this.fstrPhoneFormat.equals(that.fstrPhoneFormat));
    equal = equal && (this.fstrSearchBo == null ? that.fstrSearchBo == null : this.fstrSearchBo.equals(that.fstrSearchBo));
    equal = equal && (this.fstrAddressView == null ? that.fstrAddressView == null : this.fstrAddressView.equals(that.fstrAddressView));
    equal = equal && (this.fstrValidationBo == null ? that.fstrValidationBo == null : this.fstrValidationBo.equals(that.fstrValidationBo));
    equal = equal && (this.fblnAddressConfirm == null ? that.fblnAddressConfirm == null : this.fblnAddressConfirm.equals(that.fblnAddressConfirm));
    equal = equal && (this.fstrMailValidationBo == null ? that.fstrMailValidationBo == null : this.fstrMailValidationBo.equals(that.fstrMailValidationBo));
    equal = equal && (this.fstrSingleLineParseObject == null ? that.fstrSingleLineParseObject == null : this.fstrSingleLineParseObject.equals(that.fstrSingleLineParseObject));
    equal = equal && (this.fstrRequiredFields == null ? that.fstrRequiredFields == null : this.fstrRequiredFields.equals(that.fstrRequiredFields));
    equal = equal && (this.fstrHiddenFields == null ? that.fstrHiddenFields == null : this.fstrHiddenFields.equals(that.fstrHiddenFields));
    equal = equal && (this.fstrIso2A == null ? that.fstrIso2A == null : this.fstrIso2A.equals(that.fstrIso2A));
    equal = equal && (this.fstrIso3A == null ? that.fstrIso3A == null : this.fstrIso3A.equals(that.fstrIso3A));
    equal = equal && (this.flngIsoNumeric == null ? that.flngIsoNumeric == null : this.flngIsoNumeric.equals(that.flngIsoNumeric));
    equal = equal && (this.fstrIRSCountryCode == null ? that.fstrIRSCountryCode == null : this.fstrIRSCountryCode.equals(that.fstrIRSCountryCode));
    equal = equal && (this.fblnHasVirtualState == null ? that.fblnHasVirtualState == null : this.fblnHasVirtualState.equals(that.fblnHasVirtualState));
    equal = equal && (this.fstrAddressSearchIndex == null ? that.fstrAddressSearchIndex == null : this.fstrAddressSearchIndex.equals(that.fstrAddressSearchIndex));
    equal = equal && (this.fstrDefaultLanguage == null ? that.fstrDefaultLanguage == null : this.fstrDefaultLanguage.equals(that.fstrDefaultLanguage));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.fstrCountry = JdbcWritableBridge.readString(1, __dbResults);
    this.fintCountryCode = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fstrZipMask = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrZipClipChars = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrAreaCodeMask = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrAreaCodeClipChars = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrPhoneMask = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrPhoneClipChars = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrPhoneValidation = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrPhoneFormat = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrSearchBo = JdbcWritableBridge.readString(11, __dbResults);
    this.fstrAddressView = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrValidationBo = JdbcWritableBridge.readString(13, __dbResults);
    this.fblnAddressConfirm = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fstrMailValidationBo = JdbcWritableBridge.readString(15, __dbResults);
    this.fstrSingleLineParseObject = JdbcWritableBridge.readString(16, __dbResults);
    this.fstrRequiredFields = JdbcWritableBridge.readString(17, __dbResults);
    this.fstrHiddenFields = JdbcWritableBridge.readString(18, __dbResults);
    this.fstrIso2A = JdbcWritableBridge.readString(19, __dbResults);
    this.fstrIso3A = JdbcWritableBridge.readString(20, __dbResults);
    this.flngIsoNumeric = JdbcWritableBridge.readInteger(21, __dbResults);
    this.fstrIRSCountryCode = JdbcWritableBridge.readString(22, __dbResults);
    this.fblnHasVirtualState = JdbcWritableBridge.readInteger(23, __dbResults);
    this.fstrAddressSearchIndex = JdbcWritableBridge.readString(24, __dbResults);
    this.fstrDefaultLanguage = JdbcWritableBridge.readString(25, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(26, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.fstrCountry = JdbcWritableBridge.readString(1, __dbResults);
    this.fintCountryCode = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fstrZipMask = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrZipClipChars = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrAreaCodeMask = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrAreaCodeClipChars = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrPhoneMask = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrPhoneClipChars = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrPhoneValidation = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrPhoneFormat = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrSearchBo = JdbcWritableBridge.readString(11, __dbResults);
    this.fstrAddressView = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrValidationBo = JdbcWritableBridge.readString(13, __dbResults);
    this.fblnAddressConfirm = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fstrMailValidationBo = JdbcWritableBridge.readString(15, __dbResults);
    this.fstrSingleLineParseObject = JdbcWritableBridge.readString(16, __dbResults);
    this.fstrRequiredFields = JdbcWritableBridge.readString(17, __dbResults);
    this.fstrHiddenFields = JdbcWritableBridge.readString(18, __dbResults);
    this.fstrIso2A = JdbcWritableBridge.readString(19, __dbResults);
    this.fstrIso3A = JdbcWritableBridge.readString(20, __dbResults);
    this.flngIsoNumeric = JdbcWritableBridge.readInteger(21, __dbResults);
    this.fstrIRSCountryCode = JdbcWritableBridge.readString(22, __dbResults);
    this.fblnHasVirtualState = JdbcWritableBridge.readInteger(23, __dbResults);
    this.fstrAddressSearchIndex = JdbcWritableBridge.readString(24, __dbResults);
    this.fstrDefaultLanguage = JdbcWritableBridge.readString(25, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(26, __dbResults);
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
    JdbcWritableBridge.writeString(fstrCountry, 1 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintCountryCode, 2 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrZipMask, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrZipClipChars, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAreaCodeMask, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAreaCodeClipChars, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneMask, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneClipChars, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneValidation, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneFormat, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSearchBo, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAddressView, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrValidationBo, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAddressConfirm, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrMailValidationBo, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSingleLineParseObject, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRequiredFields, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrHiddenFields, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrIso2A, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrIso3A, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngIsoNumeric, 21 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrIRSCountryCode, 22 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnHasVirtualState, 23 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrAddressSearchIndex, 24 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDefaultLanguage, 25 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 26 + __off, -6, __dbStmt);
    return 26;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(fstrCountry, 1 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintCountryCode, 2 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrZipMask, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrZipClipChars, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAreaCodeMask, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAreaCodeClipChars, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneMask, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneClipChars, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneValidation, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneFormat, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSearchBo, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAddressView, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrValidationBo, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAddressConfirm, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrMailValidationBo, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSingleLineParseObject, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRequiredFields, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrHiddenFields, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrIso2A, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrIso3A, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngIsoNumeric, 21 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrIRSCountryCode, 22 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnHasVirtualState, 23 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrAddressSearchIndex, 24 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDefaultLanguage, 25 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 26 + __off, -6, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.fstrCountry = null;
    } else {
    this.fstrCountry = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fintCountryCode = null;
    } else {
    this.fintCountryCode = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrZipMask = null;
    } else {
    this.fstrZipMask = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrZipClipChars = null;
    } else {
    this.fstrZipClipChars = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAreaCodeMask = null;
    } else {
    this.fstrAreaCodeMask = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAreaCodeClipChars = null;
    } else {
    this.fstrAreaCodeClipChars = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPhoneMask = null;
    } else {
    this.fstrPhoneMask = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPhoneClipChars = null;
    } else {
    this.fstrPhoneClipChars = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPhoneValidation = null;
    } else {
    this.fstrPhoneValidation = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPhoneFormat = null;
    } else {
    this.fstrPhoneFormat = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSearchBo = null;
    } else {
    this.fstrSearchBo = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAddressView = null;
    } else {
    this.fstrAddressView = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrValidationBo = null;
    } else {
    this.fstrValidationBo = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnAddressConfirm = null;
    } else {
    this.fblnAddressConfirm = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrMailValidationBo = null;
    } else {
    this.fstrMailValidationBo = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSingleLineParseObject = null;
    } else {
    this.fstrSingleLineParseObject = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRequiredFields = null;
    } else {
    this.fstrRequiredFields = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrHiddenFields = null;
    } else {
    this.fstrHiddenFields = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrIso2A = null;
    } else {
    this.fstrIso2A = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrIso3A = null;
    } else {
    this.fstrIso3A = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngIsoNumeric = null;
    } else {
    this.flngIsoNumeric = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrIRSCountryCode = null;
    } else {
    this.fstrIRSCountryCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnHasVirtualState = null;
    } else {
    this.fblnHasVirtualState = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAddressSearchIndex = null;
    } else {
    this.fstrAddressSearchIndex = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDefaultLanguage = null;
    } else {
    this.fstrDefaultLanguage = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnActive = null;
    } else {
    this.fblnActive = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.fstrCountry) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCountry);
    }
    if (null == this.fintCountryCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintCountryCode);
    }
    if (null == this.fstrZipMask) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrZipMask);
    }
    if (null == this.fstrZipClipChars) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrZipClipChars);
    }
    if (null == this.fstrAreaCodeMask) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAreaCodeMask);
    }
    if (null == this.fstrAreaCodeClipChars) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAreaCodeClipChars);
    }
    if (null == this.fstrPhoneMask) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneMask);
    }
    if (null == this.fstrPhoneClipChars) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneClipChars);
    }
    if (null == this.fstrPhoneValidation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneValidation);
    }
    if (null == this.fstrPhoneFormat) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneFormat);
    }
    if (null == this.fstrSearchBo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSearchBo);
    }
    if (null == this.fstrAddressView) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAddressView);
    }
    if (null == this.fstrValidationBo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrValidationBo);
    }
    if (null == this.fblnAddressConfirm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAddressConfirm);
    }
    if (null == this.fstrMailValidationBo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMailValidationBo);
    }
    if (null == this.fstrSingleLineParseObject) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSingleLineParseObject);
    }
    if (null == this.fstrRequiredFields) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRequiredFields);
    }
    if (null == this.fstrHiddenFields) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrHiddenFields);
    }
    if (null == this.fstrIso2A) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIso2A);
    }
    if (null == this.fstrIso3A) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIso3A);
    }
    if (null == this.flngIsoNumeric) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngIsoNumeric);
    }
    if (null == this.fstrIRSCountryCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIRSCountryCode);
    }
    if (null == this.fblnHasVirtualState) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnHasVirtualState);
    }
    if (null == this.fstrAddressSearchIndex) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAddressSearchIndex);
    }
    if (null == this.fstrDefaultLanguage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDefaultLanguage);
    }
    if (null == this.fblnActive) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnActive);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.fstrCountry) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCountry);
    }
    if (null == this.fintCountryCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintCountryCode);
    }
    if (null == this.fstrZipMask) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrZipMask);
    }
    if (null == this.fstrZipClipChars) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrZipClipChars);
    }
    if (null == this.fstrAreaCodeMask) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAreaCodeMask);
    }
    if (null == this.fstrAreaCodeClipChars) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAreaCodeClipChars);
    }
    if (null == this.fstrPhoneMask) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneMask);
    }
    if (null == this.fstrPhoneClipChars) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneClipChars);
    }
    if (null == this.fstrPhoneValidation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneValidation);
    }
    if (null == this.fstrPhoneFormat) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneFormat);
    }
    if (null == this.fstrSearchBo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSearchBo);
    }
    if (null == this.fstrAddressView) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAddressView);
    }
    if (null == this.fstrValidationBo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrValidationBo);
    }
    if (null == this.fblnAddressConfirm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAddressConfirm);
    }
    if (null == this.fstrMailValidationBo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMailValidationBo);
    }
    if (null == this.fstrSingleLineParseObject) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSingleLineParseObject);
    }
    if (null == this.fstrRequiredFields) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRequiredFields);
    }
    if (null == this.fstrHiddenFields) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrHiddenFields);
    }
    if (null == this.fstrIso2A) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIso2A);
    }
    if (null == this.fstrIso3A) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIso3A);
    }
    if (null == this.flngIsoNumeric) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngIsoNumeric);
    }
    if (null == this.fstrIRSCountryCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIRSCountryCode);
    }
    if (null == this.fblnHasVirtualState) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnHasVirtualState);
    }
    if (null == this.fstrAddressSearchIndex) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAddressSearchIndex);
    }
    if (null == this.fstrDefaultLanguage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDefaultLanguage);
    }
    if (null == this.fblnActive) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnActive);
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
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCountry==null?"\\N":fstrCountry, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintCountryCode==null?"\\N":"" + fintCountryCode, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrZipMask==null?"\\N":fstrZipMask, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrZipClipChars==null?"\\N":fstrZipClipChars, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAreaCodeMask==null?"\\N":fstrAreaCodeMask, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAreaCodeClipChars==null?"\\N":fstrAreaCodeClipChars, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneMask==null?"\\N":fstrPhoneMask, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneClipChars==null?"\\N":fstrPhoneClipChars, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneValidation==null?"\\N":fstrPhoneValidation, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneFormat==null?"\\N":fstrPhoneFormat, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSearchBo==null?"\\N":fstrSearchBo, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAddressView==null?"\\N":fstrAddressView, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrValidationBo==null?"\\N":fstrValidationBo, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAddressConfirm==null?"\\N":"" + fblnAddressConfirm, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMailValidationBo==null?"\\N":fstrMailValidationBo, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSingleLineParseObject==null?"\\N":fstrSingleLineParseObject, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRequiredFields==null?"\\N":fstrRequiredFields, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrHiddenFields==null?"\\N":fstrHiddenFields, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIso2A==null?"\\N":fstrIso2A, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIso3A==null?"\\N":fstrIso3A, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngIsoNumeric==null?"\\N":"" + flngIsoNumeric, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIRSCountryCode==null?"\\N":fstrIRSCountryCode, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnHasVirtualState==null?"\\N":"" + fblnHasVirtualState, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAddressSearchIndex==null?"\\N":fstrAddressSearchIndex, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDefaultLanguage==null?"\\N":fstrDefaultLanguage, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnActive==null?"\\N":"" + fblnActive, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCountry==null?"\\N":fstrCountry, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintCountryCode==null?"\\N":"" + fintCountryCode, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrZipMask==null?"\\N":fstrZipMask, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrZipClipChars==null?"\\N":fstrZipClipChars, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAreaCodeMask==null?"\\N":fstrAreaCodeMask, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAreaCodeClipChars==null?"\\N":fstrAreaCodeClipChars, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneMask==null?"\\N":fstrPhoneMask, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneClipChars==null?"\\N":fstrPhoneClipChars, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneValidation==null?"\\N":fstrPhoneValidation, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneFormat==null?"\\N":fstrPhoneFormat, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSearchBo==null?"\\N":fstrSearchBo, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAddressView==null?"\\N":fstrAddressView, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrValidationBo==null?"\\N":fstrValidationBo, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAddressConfirm==null?"\\N":"" + fblnAddressConfirm, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMailValidationBo==null?"\\N":fstrMailValidationBo, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSingleLineParseObject==null?"\\N":fstrSingleLineParseObject, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRequiredFields==null?"\\N":fstrRequiredFields, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrHiddenFields==null?"\\N":fstrHiddenFields, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIso2A==null?"\\N":fstrIso2A, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIso3A==null?"\\N":fstrIso3A, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngIsoNumeric==null?"\\N":"" + flngIsoNumeric, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIRSCountryCode==null?"\\N":fstrIRSCountryCode, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnHasVirtualState==null?"\\N":"" + fblnHasVirtualState, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAddressSearchIndex==null?"\\N":fstrAddressSearchIndex, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDefaultLanguage==null?"\\N":fstrDefaultLanguage, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnActive==null?"\\N":"" + fblnActive, delimiters));
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
    if (__cur_str.equals("null")) { this.fstrCountry = null; } else {
      this.fstrCountry = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintCountryCode = null; } else {
      this.fintCountryCode = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrZipMask = null; } else {
      this.fstrZipMask = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrZipClipChars = null; } else {
      this.fstrZipClipChars = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAreaCodeMask = null; } else {
      this.fstrAreaCodeMask = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAreaCodeClipChars = null; } else {
      this.fstrAreaCodeClipChars = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneMask = null; } else {
      this.fstrPhoneMask = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneClipChars = null; } else {
      this.fstrPhoneClipChars = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneValidation = null; } else {
      this.fstrPhoneValidation = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneFormat = null; } else {
      this.fstrPhoneFormat = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSearchBo = null; } else {
      this.fstrSearchBo = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAddressView = null; } else {
      this.fstrAddressView = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrValidationBo = null; } else {
      this.fstrValidationBo = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAddressConfirm = null; } else {
      this.fblnAddressConfirm = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMailValidationBo = null; } else {
      this.fstrMailValidationBo = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSingleLineParseObject = null; } else {
      this.fstrSingleLineParseObject = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRequiredFields = null; } else {
      this.fstrRequiredFields = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrHiddenFields = null; } else {
      this.fstrHiddenFields = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIso2A = null; } else {
      this.fstrIso2A = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIso3A = null; } else {
      this.fstrIso3A = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngIsoNumeric = null; } else {
      this.flngIsoNumeric = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIRSCountryCode = null; } else {
      this.fstrIRSCountryCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnHasVirtualState = null; } else {
      this.fblnHasVirtualState = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAddressSearchIndex = null; } else {
      this.fstrAddressSearchIndex = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDefaultLanguage = null; } else {
      this.fstrDefaultLanguage = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnActive = null; } else {
      this.fblnActive = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrCountry = null; } else {
      this.fstrCountry = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintCountryCode = null; } else {
      this.fintCountryCode = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrZipMask = null; } else {
      this.fstrZipMask = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrZipClipChars = null; } else {
      this.fstrZipClipChars = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAreaCodeMask = null; } else {
      this.fstrAreaCodeMask = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAreaCodeClipChars = null; } else {
      this.fstrAreaCodeClipChars = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneMask = null; } else {
      this.fstrPhoneMask = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneClipChars = null; } else {
      this.fstrPhoneClipChars = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneValidation = null; } else {
      this.fstrPhoneValidation = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneFormat = null; } else {
      this.fstrPhoneFormat = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSearchBo = null; } else {
      this.fstrSearchBo = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAddressView = null; } else {
      this.fstrAddressView = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrValidationBo = null; } else {
      this.fstrValidationBo = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAddressConfirm = null; } else {
      this.fblnAddressConfirm = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMailValidationBo = null; } else {
      this.fstrMailValidationBo = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSingleLineParseObject = null; } else {
      this.fstrSingleLineParseObject = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRequiredFields = null; } else {
      this.fstrRequiredFields = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrHiddenFields = null; } else {
      this.fstrHiddenFields = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIso2A = null; } else {
      this.fstrIso2A = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIso3A = null; } else {
      this.fstrIso3A = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngIsoNumeric = null; } else {
      this.flngIsoNumeric = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIRSCountryCode = null; } else {
      this.fstrIRSCountryCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnHasVirtualState = null; } else {
      this.fblnHasVirtualState = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAddressSearchIndex = null; } else {
      this.fstrAddressSearchIndex = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDefaultLanguage = null; } else {
      this.fstrDefaultLanguage = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnActive = null; } else {
      this.fblnActive = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    rfrcountry o = (rfrcountry) super.clone();
    return o;
  }

  public void clone0(rfrcountry o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("fstrCountry", this.fstrCountry);
    __sqoop$field_map.put("fintCountryCode", this.fintCountryCode);
    __sqoop$field_map.put("fstrZipMask", this.fstrZipMask);
    __sqoop$field_map.put("fstrZipClipChars", this.fstrZipClipChars);
    __sqoop$field_map.put("fstrAreaCodeMask", this.fstrAreaCodeMask);
    __sqoop$field_map.put("fstrAreaCodeClipChars", this.fstrAreaCodeClipChars);
    __sqoop$field_map.put("fstrPhoneMask", this.fstrPhoneMask);
    __sqoop$field_map.put("fstrPhoneClipChars", this.fstrPhoneClipChars);
    __sqoop$field_map.put("fstrPhoneValidation", this.fstrPhoneValidation);
    __sqoop$field_map.put("fstrPhoneFormat", this.fstrPhoneFormat);
    __sqoop$field_map.put("fstrSearchBo", this.fstrSearchBo);
    __sqoop$field_map.put("fstrAddressView", this.fstrAddressView);
    __sqoop$field_map.put("fstrValidationBo", this.fstrValidationBo);
    __sqoop$field_map.put("fblnAddressConfirm", this.fblnAddressConfirm);
    __sqoop$field_map.put("fstrMailValidationBo", this.fstrMailValidationBo);
    __sqoop$field_map.put("fstrSingleLineParseObject", this.fstrSingleLineParseObject);
    __sqoop$field_map.put("fstrRequiredFields", this.fstrRequiredFields);
    __sqoop$field_map.put("fstrHiddenFields", this.fstrHiddenFields);
    __sqoop$field_map.put("fstrIso2A", this.fstrIso2A);
    __sqoop$field_map.put("fstrIso3A", this.fstrIso3A);
    __sqoop$field_map.put("flngIsoNumeric", this.flngIsoNumeric);
    __sqoop$field_map.put("fstrIRSCountryCode", this.fstrIRSCountryCode);
    __sqoop$field_map.put("fblnHasVirtualState", this.fblnHasVirtualState);
    __sqoop$field_map.put("fstrAddressSearchIndex", this.fstrAddressSearchIndex);
    __sqoop$field_map.put("fstrDefaultLanguage", this.fstrDefaultLanguage);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("fstrCountry", this.fstrCountry);
    __sqoop$field_map.put("fintCountryCode", this.fintCountryCode);
    __sqoop$field_map.put("fstrZipMask", this.fstrZipMask);
    __sqoop$field_map.put("fstrZipClipChars", this.fstrZipClipChars);
    __sqoop$field_map.put("fstrAreaCodeMask", this.fstrAreaCodeMask);
    __sqoop$field_map.put("fstrAreaCodeClipChars", this.fstrAreaCodeClipChars);
    __sqoop$field_map.put("fstrPhoneMask", this.fstrPhoneMask);
    __sqoop$field_map.put("fstrPhoneClipChars", this.fstrPhoneClipChars);
    __sqoop$field_map.put("fstrPhoneValidation", this.fstrPhoneValidation);
    __sqoop$field_map.put("fstrPhoneFormat", this.fstrPhoneFormat);
    __sqoop$field_map.put("fstrSearchBo", this.fstrSearchBo);
    __sqoop$field_map.put("fstrAddressView", this.fstrAddressView);
    __sqoop$field_map.put("fstrValidationBo", this.fstrValidationBo);
    __sqoop$field_map.put("fblnAddressConfirm", this.fblnAddressConfirm);
    __sqoop$field_map.put("fstrMailValidationBo", this.fstrMailValidationBo);
    __sqoop$field_map.put("fstrSingleLineParseObject", this.fstrSingleLineParseObject);
    __sqoop$field_map.put("fstrRequiredFields", this.fstrRequiredFields);
    __sqoop$field_map.put("fstrHiddenFields", this.fstrHiddenFields);
    __sqoop$field_map.put("fstrIso2A", this.fstrIso2A);
    __sqoop$field_map.put("fstrIso3A", this.fstrIso3A);
    __sqoop$field_map.put("flngIsoNumeric", this.flngIsoNumeric);
    __sqoop$field_map.put("fstrIRSCountryCode", this.fstrIRSCountryCode);
    __sqoop$field_map.put("fblnHasVirtualState", this.fblnHasVirtualState);
    __sqoop$field_map.put("fstrAddressSearchIndex", this.fstrAddressSearchIndex);
    __sqoop$field_map.put("fstrDefaultLanguage", this.fstrDefaultLanguage);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
