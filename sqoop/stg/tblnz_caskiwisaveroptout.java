// ORM class for table 'tblnz_caskiwisaveroptout'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 05:27:04 NZDT 2020
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

public class tblnz_caskiwisaveroptout extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_caskiwisaveroptout.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("flngCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_caskiwisaveroptout.this.flngCustomerKey = (Integer)value;
      }
    });
    setters.put("flngAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_caskiwisaveroptout.this.flngAccountKey = (Integer)value;
      }
    });
    setters.put("flngEmployerCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_caskiwisaveroptout.this.flngEmployerCustomerKey = (Integer)value;
      }
    });
    setters.put("flngEmployerAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_caskiwisaveroptout.this.flngEmployerAccountKey = (Integer)value;
      }
    });
    setters.put("flngRelationshipKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_caskiwisaveroptout.this.flngRelationshipKey = (Integer)value;
      }
    });
    setters.put("fstrSource", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_caskiwisaveroptout.this.fstrSource = (String)value;
      }
    });
    setters.put("fblnManual", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_caskiwisaveroptout.this.fblnManual = (Integer)value;
      }
    });
    setters.put("fstrLateOptOutReason", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_caskiwisaveroptout.this.fstrLateOptOutReason = (String)value;
      }
    });
    setters.put("fstrLastOptOutReasonOther", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_caskiwisaveroptout.this.fstrLastOptOutReasonOther = (String)value;
      }
    });
    setters.put("fstrMemberIRD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_caskiwisaveroptout.this.fstrMemberIRD = (String)value;
      }
    });
    setters.put("fstrMemberFirstName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_caskiwisaveroptout.this.fstrMemberFirstName = (String)value;
      }
    });
    setters.put("fstrMemberLastName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_caskiwisaveroptout.this.fstrMemberLastName = (String)value;
      }
    });
    setters.put("fstrMemberTitle", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_caskiwisaveroptout.this.fstrMemberTitle = (String)value;
      }
    });
    setters.put("fstrMemberTitleOther", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_caskiwisaveroptout.this.fstrMemberTitleOther = (String)value;
      }
    });
    setters.put("fstrMemberDaytimeNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_caskiwisaveroptout.this.fstrMemberDaytimeNumber = (String)value;
      }
    });
    setters.put("fstrMemberMobileNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_caskiwisaveroptout.this.fstrMemberMobileNumber = (String)value;
      }
    });
    setters.put("fstrMemberEmail", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_caskiwisaveroptout.this.fstrMemberEmail = (String)value;
      }
    });
    setters.put("fstrEmployerIRD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_caskiwisaveroptout.this.fstrEmployerIRD = (String)value;
      }
    });
    setters.put("fstrEmployerName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_caskiwisaveroptout.this.fstrEmployerName = (String)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_caskiwisaveroptout.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_caskiwisaveroptout.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_caskiwisaveroptout() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_caskiwisaveroptout with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private Integer flngCustomerKey;
  public Integer get_flngCustomerKey() {
    return flngCustomerKey;
  }
  public void set_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
  }
  public tblnz_caskiwisaveroptout with_flngCustomerKey(Integer flngCustomerKey) {
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
  public tblnz_caskiwisaveroptout with_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
    return this;
  }
  private Integer flngEmployerCustomerKey;
  public Integer get_flngEmployerCustomerKey() {
    return flngEmployerCustomerKey;
  }
  public void set_flngEmployerCustomerKey(Integer flngEmployerCustomerKey) {
    this.flngEmployerCustomerKey = flngEmployerCustomerKey;
  }
  public tblnz_caskiwisaveroptout with_flngEmployerCustomerKey(Integer flngEmployerCustomerKey) {
    this.flngEmployerCustomerKey = flngEmployerCustomerKey;
    return this;
  }
  private Integer flngEmployerAccountKey;
  public Integer get_flngEmployerAccountKey() {
    return flngEmployerAccountKey;
  }
  public void set_flngEmployerAccountKey(Integer flngEmployerAccountKey) {
    this.flngEmployerAccountKey = flngEmployerAccountKey;
  }
  public tblnz_caskiwisaveroptout with_flngEmployerAccountKey(Integer flngEmployerAccountKey) {
    this.flngEmployerAccountKey = flngEmployerAccountKey;
    return this;
  }
  private Integer flngRelationshipKey;
  public Integer get_flngRelationshipKey() {
    return flngRelationshipKey;
  }
  public void set_flngRelationshipKey(Integer flngRelationshipKey) {
    this.flngRelationshipKey = flngRelationshipKey;
  }
  public tblnz_caskiwisaveroptout with_flngRelationshipKey(Integer flngRelationshipKey) {
    this.flngRelationshipKey = flngRelationshipKey;
    return this;
  }
  private String fstrSource;
  public String get_fstrSource() {
    return fstrSource;
  }
  public void set_fstrSource(String fstrSource) {
    this.fstrSource = fstrSource;
  }
  public tblnz_caskiwisaveroptout with_fstrSource(String fstrSource) {
    this.fstrSource = fstrSource;
    return this;
  }
  private Integer fblnManual;
  public Integer get_fblnManual() {
    return fblnManual;
  }
  public void set_fblnManual(Integer fblnManual) {
    this.fblnManual = fblnManual;
  }
  public tblnz_caskiwisaveroptout with_fblnManual(Integer fblnManual) {
    this.fblnManual = fblnManual;
    return this;
  }
  private String fstrLateOptOutReason;
  public String get_fstrLateOptOutReason() {
    return fstrLateOptOutReason;
  }
  public void set_fstrLateOptOutReason(String fstrLateOptOutReason) {
    this.fstrLateOptOutReason = fstrLateOptOutReason;
  }
  public tblnz_caskiwisaveroptout with_fstrLateOptOutReason(String fstrLateOptOutReason) {
    this.fstrLateOptOutReason = fstrLateOptOutReason;
    return this;
  }
  private String fstrLastOptOutReasonOther;
  public String get_fstrLastOptOutReasonOther() {
    return fstrLastOptOutReasonOther;
  }
  public void set_fstrLastOptOutReasonOther(String fstrLastOptOutReasonOther) {
    this.fstrLastOptOutReasonOther = fstrLastOptOutReasonOther;
  }
  public tblnz_caskiwisaveroptout with_fstrLastOptOutReasonOther(String fstrLastOptOutReasonOther) {
    this.fstrLastOptOutReasonOther = fstrLastOptOutReasonOther;
    return this;
  }
  private String fstrMemberIRD;
  public String get_fstrMemberIRD() {
    return fstrMemberIRD;
  }
  public void set_fstrMemberIRD(String fstrMemberIRD) {
    this.fstrMemberIRD = fstrMemberIRD;
  }
  public tblnz_caskiwisaveroptout with_fstrMemberIRD(String fstrMemberIRD) {
    this.fstrMemberIRD = fstrMemberIRD;
    return this;
  }
  private String fstrMemberFirstName;
  public String get_fstrMemberFirstName() {
    return fstrMemberFirstName;
  }
  public void set_fstrMemberFirstName(String fstrMemberFirstName) {
    this.fstrMemberFirstName = fstrMemberFirstName;
  }
  public tblnz_caskiwisaveroptout with_fstrMemberFirstName(String fstrMemberFirstName) {
    this.fstrMemberFirstName = fstrMemberFirstName;
    return this;
  }
  private String fstrMemberLastName;
  public String get_fstrMemberLastName() {
    return fstrMemberLastName;
  }
  public void set_fstrMemberLastName(String fstrMemberLastName) {
    this.fstrMemberLastName = fstrMemberLastName;
  }
  public tblnz_caskiwisaveroptout with_fstrMemberLastName(String fstrMemberLastName) {
    this.fstrMemberLastName = fstrMemberLastName;
    return this;
  }
  private String fstrMemberTitle;
  public String get_fstrMemberTitle() {
    return fstrMemberTitle;
  }
  public void set_fstrMemberTitle(String fstrMemberTitle) {
    this.fstrMemberTitle = fstrMemberTitle;
  }
  public tblnz_caskiwisaveroptout with_fstrMemberTitle(String fstrMemberTitle) {
    this.fstrMemberTitle = fstrMemberTitle;
    return this;
  }
  private String fstrMemberTitleOther;
  public String get_fstrMemberTitleOther() {
    return fstrMemberTitleOther;
  }
  public void set_fstrMemberTitleOther(String fstrMemberTitleOther) {
    this.fstrMemberTitleOther = fstrMemberTitleOther;
  }
  public tblnz_caskiwisaveroptout with_fstrMemberTitleOther(String fstrMemberTitleOther) {
    this.fstrMemberTitleOther = fstrMemberTitleOther;
    return this;
  }
  private String fstrMemberDaytimeNumber;
  public String get_fstrMemberDaytimeNumber() {
    return fstrMemberDaytimeNumber;
  }
  public void set_fstrMemberDaytimeNumber(String fstrMemberDaytimeNumber) {
    this.fstrMemberDaytimeNumber = fstrMemberDaytimeNumber;
  }
  public tblnz_caskiwisaveroptout with_fstrMemberDaytimeNumber(String fstrMemberDaytimeNumber) {
    this.fstrMemberDaytimeNumber = fstrMemberDaytimeNumber;
    return this;
  }
  private String fstrMemberMobileNumber;
  public String get_fstrMemberMobileNumber() {
    return fstrMemberMobileNumber;
  }
  public void set_fstrMemberMobileNumber(String fstrMemberMobileNumber) {
    this.fstrMemberMobileNumber = fstrMemberMobileNumber;
  }
  public tblnz_caskiwisaveroptout with_fstrMemberMobileNumber(String fstrMemberMobileNumber) {
    this.fstrMemberMobileNumber = fstrMemberMobileNumber;
    return this;
  }
  private String fstrMemberEmail;
  public String get_fstrMemberEmail() {
    return fstrMemberEmail;
  }
  public void set_fstrMemberEmail(String fstrMemberEmail) {
    this.fstrMemberEmail = fstrMemberEmail;
  }
  public tblnz_caskiwisaveroptout with_fstrMemberEmail(String fstrMemberEmail) {
    this.fstrMemberEmail = fstrMemberEmail;
    return this;
  }
  private String fstrEmployerIRD;
  public String get_fstrEmployerIRD() {
    return fstrEmployerIRD;
  }
  public void set_fstrEmployerIRD(String fstrEmployerIRD) {
    this.fstrEmployerIRD = fstrEmployerIRD;
  }
  public tblnz_caskiwisaveroptout with_fstrEmployerIRD(String fstrEmployerIRD) {
    this.fstrEmployerIRD = fstrEmployerIRD;
    return this;
  }
  private String fstrEmployerName;
  public String get_fstrEmployerName() {
    return fstrEmployerName;
  }
  public void set_fstrEmployerName(String fstrEmployerName) {
    this.fstrEmployerName = fstrEmployerName;
  }
  public tblnz_caskiwisaveroptout with_fstrEmployerName(String fstrEmployerName) {
    this.fstrEmployerName = fstrEmployerName;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_caskiwisaveroptout with_fstrWho(String fstrWho) {
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
  public tblnz_caskiwisaveroptout with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_caskiwisaveroptout)) {
      return false;
    }
    tblnz_caskiwisaveroptout that = (tblnz_caskiwisaveroptout) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.flngEmployerCustomerKey == null ? that.flngEmployerCustomerKey == null : this.flngEmployerCustomerKey.equals(that.flngEmployerCustomerKey));
    equal = equal && (this.flngEmployerAccountKey == null ? that.flngEmployerAccountKey == null : this.flngEmployerAccountKey.equals(that.flngEmployerAccountKey));
    equal = equal && (this.flngRelationshipKey == null ? that.flngRelationshipKey == null : this.flngRelationshipKey.equals(that.flngRelationshipKey));
    equal = equal && (this.fstrSource == null ? that.fstrSource == null : this.fstrSource.equals(that.fstrSource));
    equal = equal && (this.fblnManual == null ? that.fblnManual == null : this.fblnManual.equals(that.fblnManual));
    equal = equal && (this.fstrLateOptOutReason == null ? that.fstrLateOptOutReason == null : this.fstrLateOptOutReason.equals(that.fstrLateOptOutReason));
    equal = equal && (this.fstrLastOptOutReasonOther == null ? that.fstrLastOptOutReasonOther == null : this.fstrLastOptOutReasonOther.equals(that.fstrLastOptOutReasonOther));
    equal = equal && (this.fstrMemberIRD == null ? that.fstrMemberIRD == null : this.fstrMemberIRD.equals(that.fstrMemberIRD));
    equal = equal && (this.fstrMemberFirstName == null ? that.fstrMemberFirstName == null : this.fstrMemberFirstName.equals(that.fstrMemberFirstName));
    equal = equal && (this.fstrMemberLastName == null ? that.fstrMemberLastName == null : this.fstrMemberLastName.equals(that.fstrMemberLastName));
    equal = equal && (this.fstrMemberTitle == null ? that.fstrMemberTitle == null : this.fstrMemberTitle.equals(that.fstrMemberTitle));
    equal = equal && (this.fstrMemberTitleOther == null ? that.fstrMemberTitleOther == null : this.fstrMemberTitleOther.equals(that.fstrMemberTitleOther));
    equal = equal && (this.fstrMemberDaytimeNumber == null ? that.fstrMemberDaytimeNumber == null : this.fstrMemberDaytimeNumber.equals(that.fstrMemberDaytimeNumber));
    equal = equal && (this.fstrMemberMobileNumber == null ? that.fstrMemberMobileNumber == null : this.fstrMemberMobileNumber.equals(that.fstrMemberMobileNumber));
    equal = equal && (this.fstrMemberEmail == null ? that.fstrMemberEmail == null : this.fstrMemberEmail.equals(that.fstrMemberEmail));
    equal = equal && (this.fstrEmployerIRD == null ? that.fstrEmployerIRD == null : this.fstrEmployerIRD.equals(that.fstrEmployerIRD));
    equal = equal && (this.fstrEmployerName == null ? that.fstrEmployerName == null : this.fstrEmployerName.equals(that.fstrEmployerName));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_caskiwisaveroptout)) {
      return false;
    }
    tblnz_caskiwisaveroptout that = (tblnz_caskiwisaveroptout) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.flngEmployerCustomerKey == null ? that.flngEmployerCustomerKey == null : this.flngEmployerCustomerKey.equals(that.flngEmployerCustomerKey));
    equal = equal && (this.flngEmployerAccountKey == null ? that.flngEmployerAccountKey == null : this.flngEmployerAccountKey.equals(that.flngEmployerAccountKey));
    equal = equal && (this.flngRelationshipKey == null ? that.flngRelationshipKey == null : this.flngRelationshipKey.equals(that.flngRelationshipKey));
    equal = equal && (this.fstrSource == null ? that.fstrSource == null : this.fstrSource.equals(that.fstrSource));
    equal = equal && (this.fblnManual == null ? that.fblnManual == null : this.fblnManual.equals(that.fblnManual));
    equal = equal && (this.fstrLateOptOutReason == null ? that.fstrLateOptOutReason == null : this.fstrLateOptOutReason.equals(that.fstrLateOptOutReason));
    equal = equal && (this.fstrLastOptOutReasonOther == null ? that.fstrLastOptOutReasonOther == null : this.fstrLastOptOutReasonOther.equals(that.fstrLastOptOutReasonOther));
    equal = equal && (this.fstrMemberIRD == null ? that.fstrMemberIRD == null : this.fstrMemberIRD.equals(that.fstrMemberIRD));
    equal = equal && (this.fstrMemberFirstName == null ? that.fstrMemberFirstName == null : this.fstrMemberFirstName.equals(that.fstrMemberFirstName));
    equal = equal && (this.fstrMemberLastName == null ? that.fstrMemberLastName == null : this.fstrMemberLastName.equals(that.fstrMemberLastName));
    equal = equal && (this.fstrMemberTitle == null ? that.fstrMemberTitle == null : this.fstrMemberTitle.equals(that.fstrMemberTitle));
    equal = equal && (this.fstrMemberTitleOther == null ? that.fstrMemberTitleOther == null : this.fstrMemberTitleOther.equals(that.fstrMemberTitleOther));
    equal = equal && (this.fstrMemberDaytimeNumber == null ? that.fstrMemberDaytimeNumber == null : this.fstrMemberDaytimeNumber.equals(that.fstrMemberDaytimeNumber));
    equal = equal && (this.fstrMemberMobileNumber == null ? that.fstrMemberMobileNumber == null : this.fstrMemberMobileNumber.equals(that.fstrMemberMobileNumber));
    equal = equal && (this.fstrMemberEmail == null ? that.fstrMemberEmail == null : this.fstrMemberEmail.equals(that.fstrMemberEmail));
    equal = equal && (this.fstrEmployerIRD == null ? that.fstrEmployerIRD == null : this.fstrEmployerIRD.equals(that.fstrEmployerIRD));
    equal = equal && (this.fstrEmployerName == null ? that.fstrEmployerName == null : this.fstrEmployerName.equals(that.fstrEmployerName));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngCustomerKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngEmployerCustomerKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngEmployerAccountKey = JdbcWritableBridge.readInteger(5, __dbResults);
    this.flngRelationshipKey = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fstrSource = JdbcWritableBridge.readString(7, __dbResults);
    this.fblnManual = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fstrLateOptOutReason = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrLastOptOutReasonOther = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrMemberIRD = JdbcWritableBridge.readString(11, __dbResults);
    this.fstrMemberFirstName = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrMemberLastName = JdbcWritableBridge.readString(13, __dbResults);
    this.fstrMemberTitle = JdbcWritableBridge.readString(14, __dbResults);
    this.fstrMemberTitleOther = JdbcWritableBridge.readString(15, __dbResults);
    this.fstrMemberDaytimeNumber = JdbcWritableBridge.readString(16, __dbResults);
    this.fstrMemberMobileNumber = JdbcWritableBridge.readString(17, __dbResults);
    this.fstrMemberEmail = JdbcWritableBridge.readString(18, __dbResults);
    this.fstrEmployerIRD = JdbcWritableBridge.readString(19, __dbResults);
    this.fstrEmployerName = JdbcWritableBridge.readString(20, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(21, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(22, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngCustomerKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngEmployerCustomerKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngEmployerAccountKey = JdbcWritableBridge.readInteger(5, __dbResults);
    this.flngRelationshipKey = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fstrSource = JdbcWritableBridge.readString(7, __dbResults);
    this.fblnManual = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fstrLateOptOutReason = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrLastOptOutReasonOther = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrMemberIRD = JdbcWritableBridge.readString(11, __dbResults);
    this.fstrMemberFirstName = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrMemberLastName = JdbcWritableBridge.readString(13, __dbResults);
    this.fstrMemberTitle = JdbcWritableBridge.readString(14, __dbResults);
    this.fstrMemberTitleOther = JdbcWritableBridge.readString(15, __dbResults);
    this.fstrMemberDaytimeNumber = JdbcWritableBridge.readString(16, __dbResults);
    this.fstrMemberMobileNumber = JdbcWritableBridge.readString(17, __dbResults);
    this.fstrMemberEmail = JdbcWritableBridge.readString(18, __dbResults);
    this.fstrEmployerIRD = JdbcWritableBridge.readString(19, __dbResults);
    this.fstrEmployerName = JdbcWritableBridge.readString(20, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(21, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(22, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngEmployerCustomerKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngEmployerAccountKey, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngRelationshipKey, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrSource, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnManual, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrLateOptOutReason, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLastOptOutReasonOther, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberIRD, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberFirstName, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberLastName, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberTitle, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberTitleOther, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberDaytimeNumber, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberMobileNumber, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberEmail, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmployerIRD, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmployerName, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 22 + __off, 93, __dbStmt);
    return 22;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngEmployerCustomerKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngEmployerAccountKey, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngRelationshipKey, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrSource, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnManual, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrLateOptOutReason, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLastOptOutReasonOther, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberIRD, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberFirstName, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberLastName, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberTitle, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberTitleOther, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberDaytimeNumber, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberMobileNumber, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMemberEmail, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmployerIRD, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmployerName, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 22 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngDocKey = null;
    } else {
    this.flngDocKey = Integer.valueOf(__dataIn.readInt());
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
        this.flngEmployerCustomerKey = null;
    } else {
    this.flngEmployerCustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngEmployerAccountKey = null;
    } else {
    this.flngEmployerAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngRelationshipKey = null;
    } else {
    this.flngRelationshipKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSource = null;
    } else {
    this.fstrSource = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnManual = null;
    } else {
    this.fblnManual = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrLateOptOutReason = null;
    } else {
    this.fstrLateOptOutReason = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrLastOptOutReasonOther = null;
    } else {
    this.fstrLastOptOutReasonOther = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrMemberIRD = null;
    } else {
    this.fstrMemberIRD = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrMemberFirstName = null;
    } else {
    this.fstrMemberFirstName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrMemberLastName = null;
    } else {
    this.fstrMemberLastName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrMemberTitle = null;
    } else {
    this.fstrMemberTitle = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrMemberTitleOther = null;
    } else {
    this.fstrMemberTitleOther = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrMemberDaytimeNumber = null;
    } else {
    this.fstrMemberDaytimeNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrMemberMobileNumber = null;
    } else {
    this.fstrMemberMobileNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrMemberEmail = null;
    } else {
    this.fstrMemberEmail = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrEmployerIRD = null;
    } else {
    this.fstrEmployerIRD = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrEmployerName = null;
    } else {
    this.fstrEmployerName = Text.readString(__dataIn);
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
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
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
    if (null == this.flngEmployerCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngEmployerCustomerKey);
    }
    if (null == this.flngEmployerAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngEmployerAccountKey);
    }
    if (null == this.flngRelationshipKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngRelationshipKey);
    }
    if (null == this.fstrSource) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSource);
    }
    if (null == this.fblnManual) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnManual);
    }
    if (null == this.fstrLateOptOutReason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLateOptOutReason);
    }
    if (null == this.fstrLastOptOutReasonOther) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLastOptOutReasonOther);
    }
    if (null == this.fstrMemberIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMemberIRD);
    }
    if (null == this.fstrMemberFirstName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMemberFirstName);
    }
    if (null == this.fstrMemberLastName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMemberLastName);
    }
    if (null == this.fstrMemberTitle) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMemberTitle);
    }
    if (null == this.fstrMemberTitleOther) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMemberTitleOther);
    }
    if (null == this.fstrMemberDaytimeNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMemberDaytimeNumber);
    }
    if (null == this.fstrMemberMobileNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMemberMobileNumber);
    }
    if (null == this.fstrMemberEmail) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMemberEmail);
    }
    if (null == this.fstrEmployerIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmployerIRD);
    }
    if (null == this.fstrEmployerName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmployerName);
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
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
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
    if (null == this.flngEmployerCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngEmployerCustomerKey);
    }
    if (null == this.flngEmployerAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngEmployerAccountKey);
    }
    if (null == this.flngRelationshipKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngRelationshipKey);
    }
    if (null == this.fstrSource) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSource);
    }
    if (null == this.fblnManual) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnManual);
    }
    if (null == this.fstrLateOptOutReason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLateOptOutReason);
    }
    if (null == this.fstrLastOptOutReasonOther) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLastOptOutReasonOther);
    }
    if (null == this.fstrMemberIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMemberIRD);
    }
    if (null == this.fstrMemberFirstName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMemberFirstName);
    }
    if (null == this.fstrMemberLastName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMemberLastName);
    }
    if (null == this.fstrMemberTitle) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMemberTitle);
    }
    if (null == this.fstrMemberTitleOther) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMemberTitleOther);
    }
    if (null == this.fstrMemberDaytimeNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMemberDaytimeNumber);
    }
    if (null == this.fstrMemberMobileNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMemberMobileNumber);
    }
    if (null == this.fstrMemberEmail) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMemberEmail);
    }
    if (null == this.fstrEmployerIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmployerIRD);
    }
    if (null == this.fstrEmployerName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmployerName);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngEmployerCustomerKey==null?"\\N":"" + flngEmployerCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngEmployerAccountKey==null?"\\N":"" + flngEmployerAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngRelationshipKey==null?"\\N":"" + flngRelationshipKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSource==null?"\\N":fstrSource, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnManual==null?"\\N":"" + fblnManual, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLateOptOutReason==null?"\\N":fstrLateOptOutReason, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLastOptOutReasonOther==null?"\\N":fstrLastOptOutReasonOther, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMemberIRD==null?"\\N":fstrMemberIRD, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMemberFirstName==null?"\\N":fstrMemberFirstName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMemberLastName==null?"\\N":fstrMemberLastName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMemberTitle==null?"\\N":fstrMemberTitle, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMemberTitleOther==null?"\\N":fstrMemberTitleOther, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMemberDaytimeNumber==null?"\\N":fstrMemberDaytimeNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMemberMobileNumber==null?"\\N":fstrMemberMobileNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMemberEmail==null?"\\N":fstrMemberEmail, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmployerIRD==null?"\\N":fstrEmployerIRD, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmployerName==null?"\\N":fstrEmployerName, " ", delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngEmployerCustomerKey==null?"\\N":"" + flngEmployerCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngEmployerAccountKey==null?"\\N":"" + flngEmployerAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngRelationshipKey==null?"\\N":"" + flngRelationshipKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSource==null?"\\N":fstrSource, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnManual==null?"\\N":"" + fblnManual, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLateOptOutReason==null?"\\N":fstrLateOptOutReason, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLastOptOutReasonOther==null?"\\N":fstrLastOptOutReasonOther, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMemberIRD==null?"\\N":fstrMemberIRD, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMemberFirstName==null?"\\N":fstrMemberFirstName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMemberLastName==null?"\\N":fstrMemberLastName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMemberTitle==null?"\\N":fstrMemberTitle, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMemberTitleOther==null?"\\N":fstrMemberTitleOther, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMemberDaytimeNumber==null?"\\N":fstrMemberDaytimeNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMemberMobileNumber==null?"\\N":fstrMemberMobileNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMemberEmail==null?"\\N":fstrMemberEmail, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmployerIRD==null?"\\N":fstrEmployerIRD, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmployerName==null?"\\N":fstrEmployerName, " ", delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDocKey = null; } else {
      this.flngDocKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngEmployerCustomerKey = null; } else {
      this.flngEmployerCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngEmployerAccountKey = null; } else {
      this.flngEmployerAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngRelationshipKey = null; } else {
      this.flngRelationshipKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSource = null; } else {
      this.fstrSource = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnManual = null; } else {
      this.fblnManual = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLateOptOutReason = null; } else {
      this.fstrLateOptOutReason = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLastOptOutReasonOther = null; } else {
      this.fstrLastOptOutReasonOther = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMemberIRD = null; } else {
      this.fstrMemberIRD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMemberFirstName = null; } else {
      this.fstrMemberFirstName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMemberLastName = null; } else {
      this.fstrMemberLastName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMemberTitle = null; } else {
      this.fstrMemberTitle = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMemberTitleOther = null; } else {
      this.fstrMemberTitleOther = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMemberDaytimeNumber = null; } else {
      this.fstrMemberDaytimeNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMemberMobileNumber = null; } else {
      this.fstrMemberMobileNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMemberEmail = null; } else {
      this.fstrMemberEmail = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmployerIRD = null; } else {
      this.fstrEmployerIRD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmployerName = null; } else {
      this.fstrEmployerName = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDocKey = null; } else {
      this.flngDocKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngEmployerCustomerKey = null; } else {
      this.flngEmployerCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngEmployerAccountKey = null; } else {
      this.flngEmployerAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngRelationshipKey = null; } else {
      this.flngRelationshipKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSource = null; } else {
      this.fstrSource = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnManual = null; } else {
      this.fblnManual = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLateOptOutReason = null; } else {
      this.fstrLateOptOutReason = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLastOptOutReasonOther = null; } else {
      this.fstrLastOptOutReasonOther = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMemberIRD = null; } else {
      this.fstrMemberIRD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMemberFirstName = null; } else {
      this.fstrMemberFirstName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMemberLastName = null; } else {
      this.fstrMemberLastName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMemberTitle = null; } else {
      this.fstrMemberTitle = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMemberTitleOther = null; } else {
      this.fstrMemberTitleOther = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMemberDaytimeNumber = null; } else {
      this.fstrMemberDaytimeNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMemberMobileNumber = null; } else {
      this.fstrMemberMobileNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMemberEmail = null; } else {
      this.fstrMemberEmail = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmployerIRD = null; } else {
      this.fstrEmployerIRD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmployerName = null; } else {
      this.fstrEmployerName = __cur_str;
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
    tblnz_caskiwisaveroptout o = (tblnz_caskiwisaveroptout) super.clone();
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_caskiwisaveroptout o) throws CloneNotSupportedException {
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("flngEmployerCustomerKey", this.flngEmployerCustomerKey);
    __sqoop$field_map.put("flngEmployerAccountKey", this.flngEmployerAccountKey);
    __sqoop$field_map.put("flngRelationshipKey", this.flngRelationshipKey);
    __sqoop$field_map.put("fstrSource", this.fstrSource);
    __sqoop$field_map.put("fblnManual", this.fblnManual);
    __sqoop$field_map.put("fstrLateOptOutReason", this.fstrLateOptOutReason);
    __sqoop$field_map.put("fstrLastOptOutReasonOther", this.fstrLastOptOutReasonOther);
    __sqoop$field_map.put("fstrMemberIRD", this.fstrMemberIRD);
    __sqoop$field_map.put("fstrMemberFirstName", this.fstrMemberFirstName);
    __sqoop$field_map.put("fstrMemberLastName", this.fstrMemberLastName);
    __sqoop$field_map.put("fstrMemberTitle", this.fstrMemberTitle);
    __sqoop$field_map.put("fstrMemberTitleOther", this.fstrMemberTitleOther);
    __sqoop$field_map.put("fstrMemberDaytimeNumber", this.fstrMemberDaytimeNumber);
    __sqoop$field_map.put("fstrMemberMobileNumber", this.fstrMemberMobileNumber);
    __sqoop$field_map.put("fstrMemberEmail", this.fstrMemberEmail);
    __sqoop$field_map.put("fstrEmployerIRD", this.fstrEmployerIRD);
    __sqoop$field_map.put("fstrEmployerName", this.fstrEmployerName);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("flngEmployerCustomerKey", this.flngEmployerCustomerKey);
    __sqoop$field_map.put("flngEmployerAccountKey", this.flngEmployerAccountKey);
    __sqoop$field_map.put("flngRelationshipKey", this.flngRelationshipKey);
    __sqoop$field_map.put("fstrSource", this.fstrSource);
    __sqoop$field_map.put("fblnManual", this.fblnManual);
    __sqoop$field_map.put("fstrLateOptOutReason", this.fstrLateOptOutReason);
    __sqoop$field_map.put("fstrLastOptOutReasonOther", this.fstrLastOptOutReasonOther);
    __sqoop$field_map.put("fstrMemberIRD", this.fstrMemberIRD);
    __sqoop$field_map.put("fstrMemberFirstName", this.fstrMemberFirstName);
    __sqoop$field_map.put("fstrMemberLastName", this.fstrMemberLastName);
    __sqoop$field_map.put("fstrMemberTitle", this.fstrMemberTitle);
    __sqoop$field_map.put("fstrMemberTitleOther", this.fstrMemberTitleOther);
    __sqoop$field_map.put("fstrMemberDaytimeNumber", this.fstrMemberDaytimeNumber);
    __sqoop$field_map.put("fstrMemberMobileNumber", this.fstrMemberMobileNumber);
    __sqoop$field_map.put("fstrMemberEmail", this.fstrMemberEmail);
    __sqoop$field_map.put("fstrEmployerIRD", this.fstrEmployerIRD);
    __sqoop$field_map.put("fstrEmployerName", this.fstrEmployerName);
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
