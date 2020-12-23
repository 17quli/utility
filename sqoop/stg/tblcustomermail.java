// ORM class for table 'tblcustomermail'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 00:06:35 NZDT 2020
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

public class tblcustomermail extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngMailItemKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomermail.this.flngMailItemKey = (Integer)value;
      }
    });
    setters.put("fstrFormat", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomermail.this.fstrFormat = (String)value;
      }
    });
    setters.put("flngMailCategoryKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomermail.this.flngMailCategoryKey = (Integer)value;
      }
    });
    setters.put("flngCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomermail.this.flngCustomerKey = (Integer)value;
      }
    });
    setters.put("flngAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomermail.this.flngAccountKey = (Integer)value;
      }
    });
    setters.put("fintAddressKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomermail.this.fintAddressKey = (Integer)value;
      }
    });
    setters.put("fintAddressProfile", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomermail.this.fintAddressProfile = (Integer)value;
      }
    });
    setters.put("fintNameKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomermail.this.fintNameKey = (Integer)value;
      }
    });
    setters.put("fintNameProfile", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomermail.this.fintNameProfile = (Integer)value;
      }
    });
    setters.put("flngBillItemKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomermail.this.flngBillItemKey = (Integer)value;
      }
    });
    setters.put("fdtmFilingPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomermail.this.fdtmFilingPeriod = (java.sql.Timestamp)value;
      }
    });
    setters.put("flngMailItemTypeKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomermail.this.flngMailItemTypeKey = (Integer)value;
      }
    });
    setters.put("flngTemplateKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomermail.this.flngTemplateKey = (Integer)value;
      }
    });
    setters.put("fstrLetterId", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomermail.this.fstrLetterId = (String)value;
      }
    });
    setters.put("fstrMailType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomermail.this.fstrMailType = (String)value;
      }
    });
    setters.put("fdtmRequest", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomermail.this.fdtmRequest = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmReady", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomermail.this.fdtmReady = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmPrinted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomermail.this.fdtmPrinted = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmRePrinted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomermail.this.fdtmRePrinted = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmResend", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomermail.this.fdtmResend = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmEmailed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomermail.this.fdtmEmailed = (java.sql.Timestamp)value;
      }
    });
    setters.put("fblnValid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomermail.this.fblnValid = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomermail.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomermail.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblcustomermail() {
    init0();
  }
  private Integer flngMailItemKey;
  public Integer get_flngMailItemKey() {
    return flngMailItemKey;
  }
  public void set_flngMailItemKey(Integer flngMailItemKey) {
    this.flngMailItemKey = flngMailItemKey;
  }
  public tblcustomermail with_flngMailItemKey(Integer flngMailItemKey) {
    this.flngMailItemKey = flngMailItemKey;
    return this;
  }
  private String fstrFormat;
  public String get_fstrFormat() {
    return fstrFormat;
  }
  public void set_fstrFormat(String fstrFormat) {
    this.fstrFormat = fstrFormat;
  }
  public tblcustomermail with_fstrFormat(String fstrFormat) {
    this.fstrFormat = fstrFormat;
    return this;
  }
  private Integer flngMailCategoryKey;
  public Integer get_flngMailCategoryKey() {
    return flngMailCategoryKey;
  }
  public void set_flngMailCategoryKey(Integer flngMailCategoryKey) {
    this.flngMailCategoryKey = flngMailCategoryKey;
  }
  public tblcustomermail with_flngMailCategoryKey(Integer flngMailCategoryKey) {
    this.flngMailCategoryKey = flngMailCategoryKey;
    return this;
  }
  private Integer flngCustomerKey;
  public Integer get_flngCustomerKey() {
    return flngCustomerKey;
  }
  public void set_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
  }
  public tblcustomermail with_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
    return this;
  }
  private Integer flngAccountKey;
  public Integer get_flngAccountKey() {
    return flngAccountKey;
  }
  public void set_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
  }
  public tblcustomermail with_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
    return this;
  }
  private Integer fintAddressKey;
  public Integer get_fintAddressKey() {
    return fintAddressKey;
  }
  public void set_fintAddressKey(Integer fintAddressKey) {
    this.fintAddressKey = fintAddressKey;
  }
  public tblcustomermail with_fintAddressKey(Integer fintAddressKey) {
    this.fintAddressKey = fintAddressKey;
    return this;
  }
  private Integer fintAddressProfile;
  public Integer get_fintAddressProfile() {
    return fintAddressProfile;
  }
  public void set_fintAddressProfile(Integer fintAddressProfile) {
    this.fintAddressProfile = fintAddressProfile;
  }
  public tblcustomermail with_fintAddressProfile(Integer fintAddressProfile) {
    this.fintAddressProfile = fintAddressProfile;
    return this;
  }
  private Integer fintNameKey;
  public Integer get_fintNameKey() {
    return fintNameKey;
  }
  public void set_fintNameKey(Integer fintNameKey) {
    this.fintNameKey = fintNameKey;
  }
  public tblcustomermail with_fintNameKey(Integer fintNameKey) {
    this.fintNameKey = fintNameKey;
    return this;
  }
  private Integer fintNameProfile;
  public Integer get_fintNameProfile() {
    return fintNameProfile;
  }
  public void set_fintNameProfile(Integer fintNameProfile) {
    this.fintNameProfile = fintNameProfile;
  }
  public tblcustomermail with_fintNameProfile(Integer fintNameProfile) {
    this.fintNameProfile = fintNameProfile;
    return this;
  }
  private Integer flngBillItemKey;
  public Integer get_flngBillItemKey() {
    return flngBillItemKey;
  }
  public void set_flngBillItemKey(Integer flngBillItemKey) {
    this.flngBillItemKey = flngBillItemKey;
  }
  public tblcustomermail with_flngBillItemKey(Integer flngBillItemKey) {
    this.flngBillItemKey = flngBillItemKey;
    return this;
  }
  private java.sql.Timestamp fdtmFilingPeriod;
  public java.sql.Timestamp get_fdtmFilingPeriod() {
    return fdtmFilingPeriod;
  }
  public void set_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
  }
  public tblcustomermail with_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
    return this;
  }
  private Integer flngMailItemTypeKey;
  public Integer get_flngMailItemTypeKey() {
    return flngMailItemTypeKey;
  }
  public void set_flngMailItemTypeKey(Integer flngMailItemTypeKey) {
    this.flngMailItemTypeKey = flngMailItemTypeKey;
  }
  public tblcustomermail with_flngMailItemTypeKey(Integer flngMailItemTypeKey) {
    this.flngMailItemTypeKey = flngMailItemTypeKey;
    return this;
  }
  private Integer flngTemplateKey;
  public Integer get_flngTemplateKey() {
    return flngTemplateKey;
  }
  public void set_flngTemplateKey(Integer flngTemplateKey) {
    this.flngTemplateKey = flngTemplateKey;
  }
  public tblcustomermail with_flngTemplateKey(Integer flngTemplateKey) {
    this.flngTemplateKey = flngTemplateKey;
    return this;
  }
  private String fstrLetterId;
  public String get_fstrLetterId() {
    return fstrLetterId;
  }
  public void set_fstrLetterId(String fstrLetterId) {
    this.fstrLetterId = fstrLetterId;
  }
  public tblcustomermail with_fstrLetterId(String fstrLetterId) {
    this.fstrLetterId = fstrLetterId;
    return this;
  }
  private String fstrMailType;
  public String get_fstrMailType() {
    return fstrMailType;
  }
  public void set_fstrMailType(String fstrMailType) {
    this.fstrMailType = fstrMailType;
  }
  public tblcustomermail with_fstrMailType(String fstrMailType) {
    this.fstrMailType = fstrMailType;
    return this;
  }
  private java.sql.Timestamp fdtmRequest;
  public java.sql.Timestamp get_fdtmRequest() {
    return fdtmRequest;
  }
  public void set_fdtmRequest(java.sql.Timestamp fdtmRequest) {
    this.fdtmRequest = fdtmRequest;
  }
  public tblcustomermail with_fdtmRequest(java.sql.Timestamp fdtmRequest) {
    this.fdtmRequest = fdtmRequest;
    return this;
  }
  private java.sql.Timestamp fdtmReady;
  public java.sql.Timestamp get_fdtmReady() {
    return fdtmReady;
  }
  public void set_fdtmReady(java.sql.Timestamp fdtmReady) {
    this.fdtmReady = fdtmReady;
  }
  public tblcustomermail with_fdtmReady(java.sql.Timestamp fdtmReady) {
    this.fdtmReady = fdtmReady;
    return this;
  }
  private java.sql.Timestamp fdtmPrinted;
  public java.sql.Timestamp get_fdtmPrinted() {
    return fdtmPrinted;
  }
  public void set_fdtmPrinted(java.sql.Timestamp fdtmPrinted) {
    this.fdtmPrinted = fdtmPrinted;
  }
  public tblcustomermail with_fdtmPrinted(java.sql.Timestamp fdtmPrinted) {
    this.fdtmPrinted = fdtmPrinted;
    return this;
  }
  private java.sql.Timestamp fdtmRePrinted;
  public java.sql.Timestamp get_fdtmRePrinted() {
    return fdtmRePrinted;
  }
  public void set_fdtmRePrinted(java.sql.Timestamp fdtmRePrinted) {
    this.fdtmRePrinted = fdtmRePrinted;
  }
  public tblcustomermail with_fdtmRePrinted(java.sql.Timestamp fdtmRePrinted) {
    this.fdtmRePrinted = fdtmRePrinted;
    return this;
  }
  private java.sql.Timestamp fdtmResend;
  public java.sql.Timestamp get_fdtmResend() {
    return fdtmResend;
  }
  public void set_fdtmResend(java.sql.Timestamp fdtmResend) {
    this.fdtmResend = fdtmResend;
  }
  public tblcustomermail with_fdtmResend(java.sql.Timestamp fdtmResend) {
    this.fdtmResend = fdtmResend;
    return this;
  }
  private java.sql.Timestamp fdtmEmailed;
  public java.sql.Timestamp get_fdtmEmailed() {
    return fdtmEmailed;
  }
  public void set_fdtmEmailed(java.sql.Timestamp fdtmEmailed) {
    this.fdtmEmailed = fdtmEmailed;
  }
  public tblcustomermail with_fdtmEmailed(java.sql.Timestamp fdtmEmailed) {
    this.fdtmEmailed = fdtmEmailed;
    return this;
  }
  private Integer fblnValid;
  public Integer get_fblnValid() {
    return fblnValid;
  }
  public void set_fblnValid(Integer fblnValid) {
    this.fblnValid = fblnValid;
  }
  public tblcustomermail with_fblnValid(Integer fblnValid) {
    this.fblnValid = fblnValid;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblcustomermail with_fstrWho(String fstrWho) {
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
  public tblcustomermail with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblcustomermail)) {
      return false;
    }
    tblcustomermail that = (tblcustomermail) o;
    boolean equal = true;
    equal = equal && (this.flngMailItemKey == null ? that.flngMailItemKey == null : this.flngMailItemKey.equals(that.flngMailItemKey));
    equal = equal && (this.fstrFormat == null ? that.fstrFormat == null : this.fstrFormat.equals(that.fstrFormat));
    equal = equal && (this.flngMailCategoryKey == null ? that.flngMailCategoryKey == null : this.flngMailCategoryKey.equals(that.flngMailCategoryKey));
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fintAddressKey == null ? that.fintAddressKey == null : this.fintAddressKey.equals(that.fintAddressKey));
    equal = equal && (this.fintAddressProfile == null ? that.fintAddressProfile == null : this.fintAddressProfile.equals(that.fintAddressProfile));
    equal = equal && (this.fintNameKey == null ? that.fintNameKey == null : this.fintNameKey.equals(that.fintNameKey));
    equal = equal && (this.fintNameProfile == null ? that.fintNameProfile == null : this.fintNameProfile.equals(that.fintNameProfile));
    equal = equal && (this.flngBillItemKey == null ? that.flngBillItemKey == null : this.flngBillItemKey.equals(that.flngBillItemKey));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.flngMailItemTypeKey == null ? that.flngMailItemTypeKey == null : this.flngMailItemTypeKey.equals(that.flngMailItemTypeKey));
    equal = equal && (this.flngTemplateKey == null ? that.flngTemplateKey == null : this.flngTemplateKey.equals(that.flngTemplateKey));
    equal = equal && (this.fstrLetterId == null ? that.fstrLetterId == null : this.fstrLetterId.equals(that.fstrLetterId));
    equal = equal && (this.fstrMailType == null ? that.fstrMailType == null : this.fstrMailType.equals(that.fstrMailType));
    equal = equal && (this.fdtmRequest == null ? that.fdtmRequest == null : this.fdtmRequest.equals(that.fdtmRequest));
    equal = equal && (this.fdtmReady == null ? that.fdtmReady == null : this.fdtmReady.equals(that.fdtmReady));
    equal = equal && (this.fdtmPrinted == null ? that.fdtmPrinted == null : this.fdtmPrinted.equals(that.fdtmPrinted));
    equal = equal && (this.fdtmRePrinted == null ? that.fdtmRePrinted == null : this.fdtmRePrinted.equals(that.fdtmRePrinted));
    equal = equal && (this.fdtmResend == null ? that.fdtmResend == null : this.fdtmResend.equals(that.fdtmResend));
    equal = equal && (this.fdtmEmailed == null ? that.fdtmEmailed == null : this.fdtmEmailed.equals(that.fdtmEmailed));
    equal = equal && (this.fblnValid == null ? that.fblnValid == null : this.fblnValid.equals(that.fblnValid));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblcustomermail)) {
      return false;
    }
    tblcustomermail that = (tblcustomermail) o;
    boolean equal = true;
    equal = equal && (this.flngMailItemKey == null ? that.flngMailItemKey == null : this.flngMailItemKey.equals(that.flngMailItemKey));
    equal = equal && (this.fstrFormat == null ? that.fstrFormat == null : this.fstrFormat.equals(that.fstrFormat));
    equal = equal && (this.flngMailCategoryKey == null ? that.flngMailCategoryKey == null : this.flngMailCategoryKey.equals(that.flngMailCategoryKey));
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fintAddressKey == null ? that.fintAddressKey == null : this.fintAddressKey.equals(that.fintAddressKey));
    equal = equal && (this.fintAddressProfile == null ? that.fintAddressProfile == null : this.fintAddressProfile.equals(that.fintAddressProfile));
    equal = equal && (this.fintNameKey == null ? that.fintNameKey == null : this.fintNameKey.equals(that.fintNameKey));
    equal = equal && (this.fintNameProfile == null ? that.fintNameProfile == null : this.fintNameProfile.equals(that.fintNameProfile));
    equal = equal && (this.flngBillItemKey == null ? that.flngBillItemKey == null : this.flngBillItemKey.equals(that.flngBillItemKey));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.flngMailItemTypeKey == null ? that.flngMailItemTypeKey == null : this.flngMailItemTypeKey.equals(that.flngMailItemTypeKey));
    equal = equal && (this.flngTemplateKey == null ? that.flngTemplateKey == null : this.flngTemplateKey.equals(that.flngTemplateKey));
    equal = equal && (this.fstrLetterId == null ? that.fstrLetterId == null : this.fstrLetterId.equals(that.fstrLetterId));
    equal = equal && (this.fstrMailType == null ? that.fstrMailType == null : this.fstrMailType.equals(that.fstrMailType));
    equal = equal && (this.fdtmRequest == null ? that.fdtmRequest == null : this.fdtmRequest.equals(that.fdtmRequest));
    equal = equal && (this.fdtmReady == null ? that.fdtmReady == null : this.fdtmReady.equals(that.fdtmReady));
    equal = equal && (this.fdtmPrinted == null ? that.fdtmPrinted == null : this.fdtmPrinted.equals(that.fdtmPrinted));
    equal = equal && (this.fdtmRePrinted == null ? that.fdtmRePrinted == null : this.fdtmRePrinted.equals(that.fdtmRePrinted));
    equal = equal && (this.fdtmResend == null ? that.fdtmResend == null : this.fdtmResend.equals(that.fdtmResend));
    equal = equal && (this.fdtmEmailed == null ? that.fdtmEmailed == null : this.fdtmEmailed.equals(that.fdtmEmailed));
    equal = equal && (this.fblnValid == null ? that.fblnValid == null : this.fblnValid.equals(that.fblnValid));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngMailItemKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fstrFormat = JdbcWritableBridge.readString(2, __dbResults);
    this.flngMailCategoryKey = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngCustomerKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fintAddressKey = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fintAddressProfile = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fintNameKey = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fintNameProfile = JdbcWritableBridge.readInteger(9, __dbResults);
    this.flngBillItemKey = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.flngMailItemTypeKey = JdbcWritableBridge.readInteger(12, __dbResults);
    this.flngTemplateKey = JdbcWritableBridge.readInteger(13, __dbResults);
    this.fstrLetterId = JdbcWritableBridge.readString(14, __dbResults);
    this.fstrMailType = JdbcWritableBridge.readString(15, __dbResults);
    this.fdtmRequest = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.fdtmReady = JdbcWritableBridge.readTimestamp(17, __dbResults);
    this.fdtmPrinted = JdbcWritableBridge.readTimestamp(18, __dbResults);
    this.fdtmRePrinted = JdbcWritableBridge.readTimestamp(19, __dbResults);
    this.fdtmResend = JdbcWritableBridge.readTimestamp(20, __dbResults);
    this.fdtmEmailed = JdbcWritableBridge.readTimestamp(21, __dbResults);
    this.fblnValid = JdbcWritableBridge.readInteger(22, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(23, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(24, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngMailItemKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fstrFormat = JdbcWritableBridge.readString(2, __dbResults);
    this.flngMailCategoryKey = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngCustomerKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fintAddressKey = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fintAddressProfile = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fintNameKey = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fintNameProfile = JdbcWritableBridge.readInteger(9, __dbResults);
    this.flngBillItemKey = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.flngMailItemTypeKey = JdbcWritableBridge.readInteger(12, __dbResults);
    this.flngTemplateKey = JdbcWritableBridge.readInteger(13, __dbResults);
    this.fstrLetterId = JdbcWritableBridge.readString(14, __dbResults);
    this.fstrMailType = JdbcWritableBridge.readString(15, __dbResults);
    this.fdtmRequest = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.fdtmReady = JdbcWritableBridge.readTimestamp(17, __dbResults);
    this.fdtmPrinted = JdbcWritableBridge.readTimestamp(18, __dbResults);
    this.fdtmRePrinted = JdbcWritableBridge.readTimestamp(19, __dbResults);
    this.fdtmResend = JdbcWritableBridge.readTimestamp(20, __dbResults);
    this.fdtmEmailed = JdbcWritableBridge.readTimestamp(21, __dbResults);
    this.fblnValid = JdbcWritableBridge.readInteger(22, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(23, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(24, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngMailItemKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrFormat, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngMailCategoryKey, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintAddressKey, 6 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintAddressProfile, 7 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintNameKey, 8 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintNameProfile, 9 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngBillItemKey, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngMailItemTypeKey, 12 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngTemplateKey, 13 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrLetterId, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMailType, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmRequest, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReady, 17 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPrinted, 18 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmRePrinted, 19 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmResend, 20 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEmailed, 21 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnValid, 22 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 23 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 24 + __off, 93, __dbStmt);
    return 24;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngMailItemKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrFormat, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngMailCategoryKey, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintAddressKey, 6 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintAddressProfile, 7 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintNameKey, 8 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintNameProfile, 9 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngBillItemKey, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngMailItemTypeKey, 12 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngTemplateKey, 13 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrLetterId, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMailType, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmRequest, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReady, 17 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPrinted, 18 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmRePrinted, 19 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmResend, 20 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEmailed, 21 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnValid, 22 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 23 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 24 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngMailItemKey = null;
    } else {
    this.flngMailItemKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrFormat = null;
    } else {
    this.fstrFormat = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngMailCategoryKey = null;
    } else {
    this.flngMailCategoryKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngCustomerKey = null;
    } else {
    this.flngCustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngAccountKey = null;
    } else {
    this.flngAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintAddressKey = null;
    } else {
    this.fintAddressKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintAddressProfile = null;
    } else {
    this.fintAddressProfile = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintNameKey = null;
    } else {
    this.fintNameKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintNameProfile = null;
    } else {
    this.fintNameProfile = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngBillItemKey = null;
    } else {
    this.flngBillItemKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmFilingPeriod = null;
    } else {
    this.fdtmFilingPeriod = new Timestamp(__dataIn.readLong());
    this.fdtmFilingPeriod.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngMailItemTypeKey = null;
    } else {
    this.flngMailItemTypeKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngTemplateKey = null;
    } else {
    this.flngTemplateKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrLetterId = null;
    } else {
    this.fstrLetterId = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrMailType = null;
    } else {
    this.fstrMailType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmRequest = null;
    } else {
    this.fdtmRequest = new Timestamp(__dataIn.readLong());
    this.fdtmRequest.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmReady = null;
    } else {
    this.fdtmReady = new Timestamp(__dataIn.readLong());
    this.fdtmReady.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmPrinted = null;
    } else {
    this.fdtmPrinted = new Timestamp(__dataIn.readLong());
    this.fdtmPrinted.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmRePrinted = null;
    } else {
    this.fdtmRePrinted = new Timestamp(__dataIn.readLong());
    this.fdtmRePrinted.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmResend = null;
    } else {
    this.fdtmResend = new Timestamp(__dataIn.readLong());
    this.fdtmResend.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmEmailed = null;
    } else {
    this.fdtmEmailed = new Timestamp(__dataIn.readLong());
    this.fdtmEmailed.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnValid = null;
    } else {
    this.fblnValid = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.flngMailItemKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngMailItemKey);
    }
    if (null == this.fstrFormat) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFormat);
    }
    if (null == this.flngMailCategoryKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngMailCategoryKey);
    }
    if (null == this.flngCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey);
    }
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
    }
    if (null == this.fintAddressKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintAddressKey);
    }
    if (null == this.fintAddressProfile) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintAddressProfile);
    }
    if (null == this.fintNameKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintNameKey);
    }
    if (null == this.fintNameProfile) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintNameProfile);
    }
    if (null == this.flngBillItemKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngBillItemKey);
    }
    if (null == this.fdtmFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriod.getNanos());
    }
    if (null == this.flngMailItemTypeKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngMailItemTypeKey);
    }
    if (null == this.flngTemplateKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTemplateKey);
    }
    if (null == this.fstrLetterId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLetterId);
    }
    if (null == this.fstrMailType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMailType);
    }
    if (null == this.fdtmRequest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmRequest.getTime());
    __dataOut.writeInt(this.fdtmRequest.getNanos());
    }
    if (null == this.fdtmReady) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReady.getTime());
    __dataOut.writeInt(this.fdtmReady.getNanos());
    }
    if (null == this.fdtmPrinted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPrinted.getTime());
    __dataOut.writeInt(this.fdtmPrinted.getNanos());
    }
    if (null == this.fdtmRePrinted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmRePrinted.getTime());
    __dataOut.writeInt(this.fdtmRePrinted.getNanos());
    }
    if (null == this.fdtmResend) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmResend.getTime());
    __dataOut.writeInt(this.fdtmResend.getNanos());
    }
    if (null == this.fdtmEmailed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEmailed.getTime());
    __dataOut.writeInt(this.fdtmEmailed.getNanos());
    }
    if (null == this.fblnValid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnValid);
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
    if (null == this.flngMailItemKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngMailItemKey);
    }
    if (null == this.fstrFormat) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFormat);
    }
    if (null == this.flngMailCategoryKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngMailCategoryKey);
    }
    if (null == this.flngCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey);
    }
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
    }
    if (null == this.fintAddressKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintAddressKey);
    }
    if (null == this.fintAddressProfile) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintAddressProfile);
    }
    if (null == this.fintNameKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintNameKey);
    }
    if (null == this.fintNameProfile) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintNameProfile);
    }
    if (null == this.flngBillItemKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngBillItemKey);
    }
    if (null == this.fdtmFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriod.getNanos());
    }
    if (null == this.flngMailItemTypeKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngMailItemTypeKey);
    }
    if (null == this.flngTemplateKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTemplateKey);
    }
    if (null == this.fstrLetterId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLetterId);
    }
    if (null == this.fstrMailType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMailType);
    }
    if (null == this.fdtmRequest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmRequest.getTime());
    __dataOut.writeInt(this.fdtmRequest.getNanos());
    }
    if (null == this.fdtmReady) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReady.getTime());
    __dataOut.writeInt(this.fdtmReady.getNanos());
    }
    if (null == this.fdtmPrinted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPrinted.getTime());
    __dataOut.writeInt(this.fdtmPrinted.getNanos());
    }
    if (null == this.fdtmRePrinted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmRePrinted.getTime());
    __dataOut.writeInt(this.fdtmRePrinted.getNanos());
    }
    if (null == this.fdtmResend) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmResend.getTime());
    __dataOut.writeInt(this.fdtmResend.getNanos());
    }
    if (null == this.fdtmEmailed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEmailed.getTime());
    __dataOut.writeInt(this.fdtmEmailed.getNanos());
    }
    if (null == this.fblnValid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnValid);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngMailItemKey==null?"\\N":"" + flngMailItemKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFormat==null?"\\N":fstrFormat, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngMailCategoryKey==null?"\\N":"" + flngMailCategoryKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintAddressKey==null?"\\N":"" + fintAddressKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintAddressProfile==null?"\\N":"" + fintAddressProfile, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintNameKey==null?"\\N":"" + fintNameKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintNameProfile==null?"\\N":"" + fintNameProfile, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngBillItemKey==null?"\\N":"" + flngBillItemKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngMailItemTypeKey==null?"\\N":"" + flngMailItemTypeKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngTemplateKey==null?"\\N":"" + flngTemplateKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLetterId==null?"\\N":fstrLetterId, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMailType==null?"\\N":fstrMailType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmRequest==null?"\\N":"" + fdtmRequest, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReady==null?"\\N":"" + fdtmReady, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPrinted==null?"\\N":"" + fdtmPrinted, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmRePrinted==null?"\\N":"" + fdtmRePrinted, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmResend==null?"\\N":"" + fdtmResend, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEmailed==null?"\\N":"" + fdtmEmailed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnValid==null?"\\N":"" + fblnValid, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngMailItemKey==null?"\\N":"" + flngMailItemKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFormat==null?"\\N":fstrFormat, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngMailCategoryKey==null?"\\N":"" + flngMailCategoryKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintAddressKey==null?"\\N":"" + fintAddressKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintAddressProfile==null?"\\N":"" + fintAddressProfile, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintNameKey==null?"\\N":"" + fintNameKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintNameProfile==null?"\\N":"" + fintNameProfile, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngBillItemKey==null?"\\N":"" + flngBillItemKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngMailItemTypeKey==null?"\\N":"" + flngMailItemTypeKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngTemplateKey==null?"\\N":"" + flngTemplateKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLetterId==null?"\\N":fstrLetterId, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMailType==null?"\\N":fstrMailType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmRequest==null?"\\N":"" + fdtmRequest, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReady==null?"\\N":"" + fdtmReady, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPrinted==null?"\\N":"" + fdtmPrinted, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmRePrinted==null?"\\N":"" + fdtmRePrinted, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmResend==null?"\\N":"" + fdtmResend, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEmailed==null?"\\N":"" + fdtmEmailed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnValid==null?"\\N":"" + fblnValid, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngMailItemKey = null; } else {
      this.flngMailItemKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFormat = null; } else {
      this.fstrFormat = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngMailCategoryKey = null; } else {
      this.flngMailCategoryKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAccountKey = null; } else {
      this.flngAccountKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintAddressProfile = null; } else {
      this.fintAddressProfile = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintNameProfile = null; } else {
      this.fintNameProfile = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngBillItemKey = null; } else {
      this.flngBillItemKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFilingPeriod = null; } else {
      this.fdtmFilingPeriod = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngMailItemTypeKey = null; } else {
      this.flngMailItemTypeKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTemplateKey = null; } else {
      this.flngTemplateKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLetterId = null; } else {
      this.fstrLetterId = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMailType = null; } else {
      this.fstrMailType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmRequest = null; } else {
      this.fdtmRequest = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReady = null; } else {
      this.fdtmReady = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPrinted = null; } else {
      this.fdtmPrinted = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmRePrinted = null; } else {
      this.fdtmRePrinted = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmResend = null; } else {
      this.fdtmResend = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmEmailed = null; } else {
      this.fdtmEmailed = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnValid = null; } else {
      this.fblnValid = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngMailItemKey = null; } else {
      this.flngMailItemKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFormat = null; } else {
      this.fstrFormat = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngMailCategoryKey = null; } else {
      this.flngMailCategoryKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAccountKey = null; } else {
      this.flngAccountKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintAddressProfile = null; } else {
      this.fintAddressProfile = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintNameProfile = null; } else {
      this.fintNameProfile = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngBillItemKey = null; } else {
      this.flngBillItemKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFilingPeriod = null; } else {
      this.fdtmFilingPeriod = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngMailItemTypeKey = null; } else {
      this.flngMailItemTypeKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTemplateKey = null; } else {
      this.flngTemplateKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLetterId = null; } else {
      this.fstrLetterId = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMailType = null; } else {
      this.fstrMailType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmRequest = null; } else {
      this.fdtmRequest = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReady = null; } else {
      this.fdtmReady = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPrinted = null; } else {
      this.fdtmPrinted = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmRePrinted = null; } else {
      this.fdtmRePrinted = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmResend = null; } else {
      this.fdtmResend = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmEmailed = null; } else {
      this.fdtmEmailed = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnValid = null; } else {
      this.fblnValid = Integer.valueOf(__cur_str);
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
    tblcustomermail o = (tblcustomermail) super.clone();
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmRequest = (o.fdtmRequest != null) ? (java.sql.Timestamp) o.fdtmRequest.clone() : null;
    o.fdtmReady = (o.fdtmReady != null) ? (java.sql.Timestamp) o.fdtmReady.clone() : null;
    o.fdtmPrinted = (o.fdtmPrinted != null) ? (java.sql.Timestamp) o.fdtmPrinted.clone() : null;
    o.fdtmRePrinted = (o.fdtmRePrinted != null) ? (java.sql.Timestamp) o.fdtmRePrinted.clone() : null;
    o.fdtmResend = (o.fdtmResend != null) ? (java.sql.Timestamp) o.fdtmResend.clone() : null;
    o.fdtmEmailed = (o.fdtmEmailed != null) ? (java.sql.Timestamp) o.fdtmEmailed.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblcustomermail o) throws CloneNotSupportedException {
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmRequest = (o.fdtmRequest != null) ? (java.sql.Timestamp) o.fdtmRequest.clone() : null;
    o.fdtmReady = (o.fdtmReady != null) ? (java.sql.Timestamp) o.fdtmReady.clone() : null;
    o.fdtmPrinted = (o.fdtmPrinted != null) ? (java.sql.Timestamp) o.fdtmPrinted.clone() : null;
    o.fdtmRePrinted = (o.fdtmRePrinted != null) ? (java.sql.Timestamp) o.fdtmRePrinted.clone() : null;
    o.fdtmResend = (o.fdtmResend != null) ? (java.sql.Timestamp) o.fdtmResend.clone() : null;
    o.fdtmEmailed = (o.fdtmEmailed != null) ? (java.sql.Timestamp) o.fdtmEmailed.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngMailItemKey", this.flngMailItemKey);
    __sqoop$field_map.put("fstrFormat", this.fstrFormat);
    __sqoop$field_map.put("flngMailCategoryKey", this.flngMailCategoryKey);
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fintAddressKey", this.fintAddressKey);
    __sqoop$field_map.put("fintAddressProfile", this.fintAddressProfile);
    __sqoop$field_map.put("fintNameKey", this.fintNameKey);
    __sqoop$field_map.put("fintNameProfile", this.fintNameProfile);
    __sqoop$field_map.put("flngBillItemKey", this.flngBillItemKey);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("flngMailItemTypeKey", this.flngMailItemTypeKey);
    __sqoop$field_map.put("flngTemplateKey", this.flngTemplateKey);
    __sqoop$field_map.put("fstrLetterId", this.fstrLetterId);
    __sqoop$field_map.put("fstrMailType", this.fstrMailType);
    __sqoop$field_map.put("fdtmRequest", this.fdtmRequest);
    __sqoop$field_map.put("fdtmReady", this.fdtmReady);
    __sqoop$field_map.put("fdtmPrinted", this.fdtmPrinted);
    __sqoop$field_map.put("fdtmRePrinted", this.fdtmRePrinted);
    __sqoop$field_map.put("fdtmResend", this.fdtmResend);
    __sqoop$field_map.put("fdtmEmailed", this.fdtmEmailed);
    __sqoop$field_map.put("fblnValid", this.fblnValid);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngMailItemKey", this.flngMailItemKey);
    __sqoop$field_map.put("fstrFormat", this.fstrFormat);
    __sqoop$field_map.put("flngMailCategoryKey", this.flngMailCategoryKey);
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fintAddressKey", this.fintAddressKey);
    __sqoop$field_map.put("fintAddressProfile", this.fintAddressProfile);
    __sqoop$field_map.put("fintNameKey", this.fintNameKey);
    __sqoop$field_map.put("fintNameProfile", this.fintNameProfile);
    __sqoop$field_map.put("flngBillItemKey", this.flngBillItemKey);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("flngMailItemTypeKey", this.flngMailItemTypeKey);
    __sqoop$field_map.put("flngTemplateKey", this.flngTemplateKey);
    __sqoop$field_map.put("fstrLetterId", this.fstrLetterId);
    __sqoop$field_map.put("fstrMailType", this.fstrMailType);
    __sqoop$field_map.put("fdtmRequest", this.fdtmRequest);
    __sqoop$field_map.put("fdtmReady", this.fdtmReady);
    __sqoop$field_map.put("fdtmPrinted", this.fdtmPrinted);
    __sqoop$field_map.put("fdtmRePrinted", this.fdtmRePrinted);
    __sqoop$field_map.put("fdtmResend", this.fdtmResend);
    __sqoop$field_map.put("fdtmEmailed", this.fdtmEmailed);
    __sqoop$field_map.put("fblnValid", this.fblnValid);
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
