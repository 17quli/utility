// ORM class for table 'tblnz_accailsecurities'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 04:26:11 NZDT 2020
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

public class tblnz_accailsecurities extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accailsecurities.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fintSeq", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accailsecurities.this.fintSeq = (Integer)value;
      }
    });
    setters.put("fstrSecurity", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accailsecurities.this.fstrSecurity = (String)value;
      }
    });
    setters.put("fstrDescription", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accailsecurities.this.fstrDescription = (String)value;
      }
    });
    setters.put("fcurAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accailsecurities.this.fcurAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrTerm", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accailsecurities.this.fstrTerm = (String)value;
      }
    });
    setters.put("fstrPurpose", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accailsecurities.this.fstrPurpose = (String)value;
      }
    });
    setters.put("fblnZeroRating", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accailsecurities.this.fblnZeroRating = (Integer)value;
      }
    });
    setters.put("fstrPrincipal", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accailsecurities.this.fstrPrincipal = (String)value;
      }
    });
    setters.put("fdtmIssue", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accailsecurities.this.fdtmIssue = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmRedemption", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accailsecurities.this.fdtmRedemption = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmCeaseDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accailsecurities.this.fdtmCeaseDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fcurValueFace", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accailsecurities.this.fcurValueFace = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurValueRedemption", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accailsecurities.this.fcurValueRedemption = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accailsecurities.this.fcurRate = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnAssociated", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accailsecurities.this.fblnAssociated = (Integer)value;
      }
    });
    setters.put("fstrBorrowerName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accailsecurities.this.fstrBorrowerName = (String)value;
      }
    });
    setters.put("fstrBorrowerType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accailsecurities.this.fstrBorrowerType = (String)value;
      }
    });
    setters.put("fstrLenderName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accailsecurities.this.fstrLenderName = (String)value;
      }
    });
    setters.put("fstrLenderType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accailsecurities.this.fstrLenderType = (String)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accailsecurities.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accailsecurities.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_accailsecurities() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_accailsecurities with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private Integer fintSeq;
  public Integer get_fintSeq() {
    return fintSeq;
  }
  public void set_fintSeq(Integer fintSeq) {
    this.fintSeq = fintSeq;
  }
  public tblnz_accailsecurities with_fintSeq(Integer fintSeq) {
    this.fintSeq = fintSeq;
    return this;
  }
  private String fstrSecurity;
  public String get_fstrSecurity() {
    return fstrSecurity;
  }
  public void set_fstrSecurity(String fstrSecurity) {
    this.fstrSecurity = fstrSecurity;
  }
  public tblnz_accailsecurities with_fstrSecurity(String fstrSecurity) {
    this.fstrSecurity = fstrSecurity;
    return this;
  }
  private String fstrDescription;
  public String get_fstrDescription() {
    return fstrDescription;
  }
  public void set_fstrDescription(String fstrDescription) {
    this.fstrDescription = fstrDescription;
  }
  public tblnz_accailsecurities with_fstrDescription(String fstrDescription) {
    this.fstrDescription = fstrDescription;
    return this;
  }
  private java.math.BigDecimal fcurAmount;
  public java.math.BigDecimal get_fcurAmount() {
    return fcurAmount;
  }
  public void set_fcurAmount(java.math.BigDecimal fcurAmount) {
    this.fcurAmount = fcurAmount;
  }
  public tblnz_accailsecurities with_fcurAmount(java.math.BigDecimal fcurAmount) {
    this.fcurAmount = fcurAmount;
    return this;
  }
  private String fstrTerm;
  public String get_fstrTerm() {
    return fstrTerm;
  }
  public void set_fstrTerm(String fstrTerm) {
    this.fstrTerm = fstrTerm;
  }
  public tblnz_accailsecurities with_fstrTerm(String fstrTerm) {
    this.fstrTerm = fstrTerm;
    return this;
  }
  private String fstrPurpose;
  public String get_fstrPurpose() {
    return fstrPurpose;
  }
  public void set_fstrPurpose(String fstrPurpose) {
    this.fstrPurpose = fstrPurpose;
  }
  public tblnz_accailsecurities with_fstrPurpose(String fstrPurpose) {
    this.fstrPurpose = fstrPurpose;
    return this;
  }
  private Integer fblnZeroRating;
  public Integer get_fblnZeroRating() {
    return fblnZeroRating;
  }
  public void set_fblnZeroRating(Integer fblnZeroRating) {
    this.fblnZeroRating = fblnZeroRating;
  }
  public tblnz_accailsecurities with_fblnZeroRating(Integer fblnZeroRating) {
    this.fblnZeroRating = fblnZeroRating;
    return this;
  }
  private String fstrPrincipal;
  public String get_fstrPrincipal() {
    return fstrPrincipal;
  }
  public void set_fstrPrincipal(String fstrPrincipal) {
    this.fstrPrincipal = fstrPrincipal;
  }
  public tblnz_accailsecurities with_fstrPrincipal(String fstrPrincipal) {
    this.fstrPrincipal = fstrPrincipal;
    return this;
  }
  private java.sql.Timestamp fdtmIssue;
  public java.sql.Timestamp get_fdtmIssue() {
    return fdtmIssue;
  }
  public void set_fdtmIssue(java.sql.Timestamp fdtmIssue) {
    this.fdtmIssue = fdtmIssue;
  }
  public tblnz_accailsecurities with_fdtmIssue(java.sql.Timestamp fdtmIssue) {
    this.fdtmIssue = fdtmIssue;
    return this;
  }
  private java.sql.Timestamp fdtmRedemption;
  public java.sql.Timestamp get_fdtmRedemption() {
    return fdtmRedemption;
  }
  public void set_fdtmRedemption(java.sql.Timestamp fdtmRedemption) {
    this.fdtmRedemption = fdtmRedemption;
  }
  public tblnz_accailsecurities with_fdtmRedemption(java.sql.Timestamp fdtmRedemption) {
    this.fdtmRedemption = fdtmRedemption;
    return this;
  }
  private java.sql.Timestamp fdtmCeaseDate;
  public java.sql.Timestamp get_fdtmCeaseDate() {
    return fdtmCeaseDate;
  }
  public void set_fdtmCeaseDate(java.sql.Timestamp fdtmCeaseDate) {
    this.fdtmCeaseDate = fdtmCeaseDate;
  }
  public tblnz_accailsecurities with_fdtmCeaseDate(java.sql.Timestamp fdtmCeaseDate) {
    this.fdtmCeaseDate = fdtmCeaseDate;
    return this;
  }
  private java.math.BigDecimal fcurValueFace;
  public java.math.BigDecimal get_fcurValueFace() {
    return fcurValueFace;
  }
  public void set_fcurValueFace(java.math.BigDecimal fcurValueFace) {
    this.fcurValueFace = fcurValueFace;
  }
  public tblnz_accailsecurities with_fcurValueFace(java.math.BigDecimal fcurValueFace) {
    this.fcurValueFace = fcurValueFace;
    return this;
  }
  private java.math.BigDecimal fcurValueRedemption;
  public java.math.BigDecimal get_fcurValueRedemption() {
    return fcurValueRedemption;
  }
  public void set_fcurValueRedemption(java.math.BigDecimal fcurValueRedemption) {
    this.fcurValueRedemption = fcurValueRedemption;
  }
  public tblnz_accailsecurities with_fcurValueRedemption(java.math.BigDecimal fcurValueRedemption) {
    this.fcurValueRedemption = fcurValueRedemption;
    return this;
  }
  private java.math.BigDecimal fcurRate;
  public java.math.BigDecimal get_fcurRate() {
    return fcurRate;
  }
  public void set_fcurRate(java.math.BigDecimal fcurRate) {
    this.fcurRate = fcurRate;
  }
  public tblnz_accailsecurities with_fcurRate(java.math.BigDecimal fcurRate) {
    this.fcurRate = fcurRate;
    return this;
  }
  private Integer fblnAssociated;
  public Integer get_fblnAssociated() {
    return fblnAssociated;
  }
  public void set_fblnAssociated(Integer fblnAssociated) {
    this.fblnAssociated = fblnAssociated;
  }
  public tblnz_accailsecurities with_fblnAssociated(Integer fblnAssociated) {
    this.fblnAssociated = fblnAssociated;
    return this;
  }
  private String fstrBorrowerName;
  public String get_fstrBorrowerName() {
    return fstrBorrowerName;
  }
  public void set_fstrBorrowerName(String fstrBorrowerName) {
    this.fstrBorrowerName = fstrBorrowerName;
  }
  public tblnz_accailsecurities with_fstrBorrowerName(String fstrBorrowerName) {
    this.fstrBorrowerName = fstrBorrowerName;
    return this;
  }
  private String fstrBorrowerType;
  public String get_fstrBorrowerType() {
    return fstrBorrowerType;
  }
  public void set_fstrBorrowerType(String fstrBorrowerType) {
    this.fstrBorrowerType = fstrBorrowerType;
  }
  public tblnz_accailsecurities with_fstrBorrowerType(String fstrBorrowerType) {
    this.fstrBorrowerType = fstrBorrowerType;
    return this;
  }
  private String fstrLenderName;
  public String get_fstrLenderName() {
    return fstrLenderName;
  }
  public void set_fstrLenderName(String fstrLenderName) {
    this.fstrLenderName = fstrLenderName;
  }
  public tblnz_accailsecurities with_fstrLenderName(String fstrLenderName) {
    this.fstrLenderName = fstrLenderName;
    return this;
  }
  private String fstrLenderType;
  public String get_fstrLenderType() {
    return fstrLenderType;
  }
  public void set_fstrLenderType(String fstrLenderType) {
    this.fstrLenderType = fstrLenderType;
  }
  public tblnz_accailsecurities with_fstrLenderType(String fstrLenderType) {
    this.fstrLenderType = fstrLenderType;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_accailsecurities with_fstrWho(String fstrWho) {
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
  public tblnz_accailsecurities with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_accailsecurities)) {
      return false;
    }
    tblnz_accailsecurities that = (tblnz_accailsecurities) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fintSeq == null ? that.fintSeq == null : this.fintSeq.equals(that.fintSeq));
    equal = equal && (this.fstrSecurity == null ? that.fstrSecurity == null : this.fstrSecurity.equals(that.fstrSecurity));
    equal = equal && (this.fstrDescription == null ? that.fstrDescription == null : this.fstrDescription.equals(that.fstrDescription));
    equal = equal && (this.fcurAmount == null ? that.fcurAmount == null : this.fcurAmount.equals(that.fcurAmount));
    equal = equal && (this.fstrTerm == null ? that.fstrTerm == null : this.fstrTerm.equals(that.fstrTerm));
    equal = equal && (this.fstrPurpose == null ? that.fstrPurpose == null : this.fstrPurpose.equals(that.fstrPurpose));
    equal = equal && (this.fblnZeroRating == null ? that.fblnZeroRating == null : this.fblnZeroRating.equals(that.fblnZeroRating));
    equal = equal && (this.fstrPrincipal == null ? that.fstrPrincipal == null : this.fstrPrincipal.equals(that.fstrPrincipal));
    equal = equal && (this.fdtmIssue == null ? that.fdtmIssue == null : this.fdtmIssue.equals(that.fdtmIssue));
    equal = equal && (this.fdtmRedemption == null ? that.fdtmRedemption == null : this.fdtmRedemption.equals(that.fdtmRedemption));
    equal = equal && (this.fdtmCeaseDate == null ? that.fdtmCeaseDate == null : this.fdtmCeaseDate.equals(that.fdtmCeaseDate));
    equal = equal && (this.fcurValueFace == null ? that.fcurValueFace == null : this.fcurValueFace.equals(that.fcurValueFace));
    equal = equal && (this.fcurValueRedemption == null ? that.fcurValueRedemption == null : this.fcurValueRedemption.equals(that.fcurValueRedemption));
    equal = equal && (this.fcurRate == null ? that.fcurRate == null : this.fcurRate.equals(that.fcurRate));
    equal = equal && (this.fblnAssociated == null ? that.fblnAssociated == null : this.fblnAssociated.equals(that.fblnAssociated));
    equal = equal && (this.fstrBorrowerName == null ? that.fstrBorrowerName == null : this.fstrBorrowerName.equals(that.fstrBorrowerName));
    equal = equal && (this.fstrBorrowerType == null ? that.fstrBorrowerType == null : this.fstrBorrowerType.equals(that.fstrBorrowerType));
    equal = equal && (this.fstrLenderName == null ? that.fstrLenderName == null : this.fstrLenderName.equals(that.fstrLenderName));
    equal = equal && (this.fstrLenderType == null ? that.fstrLenderType == null : this.fstrLenderType.equals(that.fstrLenderType));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_accailsecurities)) {
      return false;
    }
    tblnz_accailsecurities that = (tblnz_accailsecurities) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fintSeq == null ? that.fintSeq == null : this.fintSeq.equals(that.fintSeq));
    equal = equal && (this.fstrSecurity == null ? that.fstrSecurity == null : this.fstrSecurity.equals(that.fstrSecurity));
    equal = equal && (this.fstrDescription == null ? that.fstrDescription == null : this.fstrDescription.equals(that.fstrDescription));
    equal = equal && (this.fcurAmount == null ? that.fcurAmount == null : this.fcurAmount.equals(that.fcurAmount));
    equal = equal && (this.fstrTerm == null ? that.fstrTerm == null : this.fstrTerm.equals(that.fstrTerm));
    equal = equal && (this.fstrPurpose == null ? that.fstrPurpose == null : this.fstrPurpose.equals(that.fstrPurpose));
    equal = equal && (this.fblnZeroRating == null ? that.fblnZeroRating == null : this.fblnZeroRating.equals(that.fblnZeroRating));
    equal = equal && (this.fstrPrincipal == null ? that.fstrPrincipal == null : this.fstrPrincipal.equals(that.fstrPrincipal));
    equal = equal && (this.fdtmIssue == null ? that.fdtmIssue == null : this.fdtmIssue.equals(that.fdtmIssue));
    equal = equal && (this.fdtmRedemption == null ? that.fdtmRedemption == null : this.fdtmRedemption.equals(that.fdtmRedemption));
    equal = equal && (this.fdtmCeaseDate == null ? that.fdtmCeaseDate == null : this.fdtmCeaseDate.equals(that.fdtmCeaseDate));
    equal = equal && (this.fcurValueFace == null ? that.fcurValueFace == null : this.fcurValueFace.equals(that.fcurValueFace));
    equal = equal && (this.fcurValueRedemption == null ? that.fcurValueRedemption == null : this.fcurValueRedemption.equals(that.fcurValueRedemption));
    equal = equal && (this.fcurRate == null ? that.fcurRate == null : this.fcurRate.equals(that.fcurRate));
    equal = equal && (this.fblnAssociated == null ? that.fblnAssociated == null : this.fblnAssociated.equals(that.fblnAssociated));
    equal = equal && (this.fstrBorrowerName == null ? that.fstrBorrowerName == null : this.fstrBorrowerName.equals(that.fstrBorrowerName));
    equal = equal && (this.fstrBorrowerType == null ? that.fstrBorrowerType == null : this.fstrBorrowerType.equals(that.fstrBorrowerType));
    equal = equal && (this.fstrLenderName == null ? that.fstrLenderName == null : this.fstrLenderName.equals(that.fstrLenderName));
    equal = equal && (this.fstrLenderType == null ? that.fstrLenderType == null : this.fstrLenderType.equals(that.fstrLenderType));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fintSeq = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fstrSecurity = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrDescription = JdbcWritableBridge.readString(4, __dbResults);
    this.fcurAmount = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fstrTerm = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrPurpose = JdbcWritableBridge.readString(7, __dbResults);
    this.fblnZeroRating = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fstrPrincipal = JdbcWritableBridge.readString(9, __dbResults);
    this.fdtmIssue = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.fdtmRedemption = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.fdtmCeaseDate = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.fcurValueFace = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurValueRedemption = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurRate = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fblnAssociated = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fstrBorrowerName = JdbcWritableBridge.readString(17, __dbResults);
    this.fstrBorrowerType = JdbcWritableBridge.readString(18, __dbResults);
    this.fstrLenderName = JdbcWritableBridge.readString(19, __dbResults);
    this.fstrLenderType = JdbcWritableBridge.readString(20, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(21, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(22, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fintSeq = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fstrSecurity = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrDescription = JdbcWritableBridge.readString(4, __dbResults);
    this.fcurAmount = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fstrTerm = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrPurpose = JdbcWritableBridge.readString(7, __dbResults);
    this.fblnZeroRating = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fstrPrincipal = JdbcWritableBridge.readString(9, __dbResults);
    this.fdtmIssue = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.fdtmRedemption = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.fdtmCeaseDate = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.fcurValueFace = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurValueRedemption = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurRate = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fblnAssociated = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fstrBorrowerName = JdbcWritableBridge.readString(17, __dbResults);
    this.fstrBorrowerType = JdbcWritableBridge.readString(18, __dbResults);
    this.fstrLenderName = JdbcWritableBridge.readString(19, __dbResults);
    this.fstrLenderType = JdbcWritableBridge.readString(20, __dbResults);
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
    JdbcWritableBridge.writeInteger(fintSeq, 2 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrSecurity, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDescription, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmount, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrTerm, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPurpose, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnZeroRating, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrPrincipal, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmIssue, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmRedemption, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCeaseDate, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurValueFace, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurValueRedemption, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRate, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAssociated, 16 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrBorrowerName, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrBorrowerType, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLenderName, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLenderType, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 22 + __off, 93, __dbStmt);
    return 22;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintSeq, 2 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrSecurity, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDescription, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmount, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrTerm, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPurpose, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnZeroRating, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrPrincipal, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmIssue, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmRedemption, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCeaseDate, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurValueFace, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurValueRedemption, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRate, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAssociated, 16 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrBorrowerName, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrBorrowerType, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLenderName, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLenderType, 20 + __off, -9, __dbStmt);
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
        this.fintSeq = null;
    } else {
    this.fintSeq = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSecurity = null;
    } else {
    this.fstrSecurity = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDescription = null;
    } else {
    this.fstrDescription = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAmount = null;
    } else {
    this.fcurAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrTerm = null;
    } else {
    this.fstrTerm = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPurpose = null;
    } else {
    this.fstrPurpose = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnZeroRating = null;
    } else {
    this.fblnZeroRating = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPrincipal = null;
    } else {
    this.fstrPrincipal = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmIssue = null;
    } else {
    this.fdtmIssue = new Timestamp(__dataIn.readLong());
    this.fdtmIssue.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmRedemption = null;
    } else {
    this.fdtmRedemption = new Timestamp(__dataIn.readLong());
    this.fdtmRedemption.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmCeaseDate = null;
    } else {
    this.fdtmCeaseDate = new Timestamp(__dataIn.readLong());
    this.fdtmCeaseDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurValueFace = null;
    } else {
    this.fcurValueFace = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurValueRedemption = null;
    } else {
    this.fcurValueRedemption = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRate = null;
    } else {
    this.fcurRate = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnAssociated = null;
    } else {
    this.fblnAssociated = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrBorrowerName = null;
    } else {
    this.fstrBorrowerName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrBorrowerType = null;
    } else {
    this.fstrBorrowerType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrLenderName = null;
    } else {
    this.fstrLenderName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrLenderType = null;
    } else {
    this.fstrLenderType = Text.readString(__dataIn);
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
    if (null == this.fintSeq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintSeq);
    }
    if (null == this.fstrSecurity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSecurity);
    }
    if (null == this.fstrDescription) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDescription);
    }
    if (null == this.fcurAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmount, __dataOut);
    }
    if (null == this.fstrTerm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTerm);
    }
    if (null == this.fstrPurpose) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPurpose);
    }
    if (null == this.fblnZeroRating) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnZeroRating);
    }
    if (null == this.fstrPrincipal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPrincipal);
    }
    if (null == this.fdtmIssue) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmIssue.getTime());
    __dataOut.writeInt(this.fdtmIssue.getNanos());
    }
    if (null == this.fdtmRedemption) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmRedemption.getTime());
    __dataOut.writeInt(this.fdtmRedemption.getNanos());
    }
    if (null == this.fdtmCeaseDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCeaseDate.getTime());
    __dataOut.writeInt(this.fdtmCeaseDate.getNanos());
    }
    if (null == this.fcurValueFace) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurValueFace, __dataOut);
    }
    if (null == this.fcurValueRedemption) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurValueRedemption, __dataOut);
    }
    if (null == this.fcurRate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRate, __dataOut);
    }
    if (null == this.fblnAssociated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAssociated);
    }
    if (null == this.fstrBorrowerName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBorrowerName);
    }
    if (null == this.fstrBorrowerType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBorrowerType);
    }
    if (null == this.fstrLenderName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLenderName);
    }
    if (null == this.fstrLenderType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLenderType);
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
    if (null == this.fintSeq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintSeq);
    }
    if (null == this.fstrSecurity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSecurity);
    }
    if (null == this.fstrDescription) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDescription);
    }
    if (null == this.fcurAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmount, __dataOut);
    }
    if (null == this.fstrTerm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTerm);
    }
    if (null == this.fstrPurpose) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPurpose);
    }
    if (null == this.fblnZeroRating) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnZeroRating);
    }
    if (null == this.fstrPrincipal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPrincipal);
    }
    if (null == this.fdtmIssue) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmIssue.getTime());
    __dataOut.writeInt(this.fdtmIssue.getNanos());
    }
    if (null == this.fdtmRedemption) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmRedemption.getTime());
    __dataOut.writeInt(this.fdtmRedemption.getNanos());
    }
    if (null == this.fdtmCeaseDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCeaseDate.getTime());
    __dataOut.writeInt(this.fdtmCeaseDate.getNanos());
    }
    if (null == this.fcurValueFace) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurValueFace, __dataOut);
    }
    if (null == this.fcurValueRedemption) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurValueRedemption, __dataOut);
    }
    if (null == this.fcurRate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRate, __dataOut);
    }
    if (null == this.fblnAssociated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAssociated);
    }
    if (null == this.fstrBorrowerName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBorrowerName);
    }
    if (null == this.fstrBorrowerType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBorrowerType);
    }
    if (null == this.fstrLenderName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLenderName);
    }
    if (null == this.fstrLenderType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLenderType);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fintSeq==null?"\\N":"" + fintSeq, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSecurity==null?"\\N":fstrSecurity, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDescription==null?"\\N":fstrDescription, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmount==null?"\\N":fcurAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTerm==null?"\\N":fstrTerm, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPurpose==null?"\\N":fstrPurpose, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnZeroRating==null?"\\N":"" + fblnZeroRating, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPrincipal==null?"\\N":fstrPrincipal, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmIssue==null?"\\N":"" + fdtmIssue, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmRedemption==null?"\\N":"" + fdtmRedemption, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCeaseDate==null?"\\N":"" + fdtmCeaseDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurValueFace==null?"\\N":fcurValueFace.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurValueRedemption==null?"\\N":fcurValueRedemption.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRate==null?"\\N":fcurRate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAssociated==null?"\\N":"" + fblnAssociated, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBorrowerName==null?"\\N":fstrBorrowerName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBorrowerType==null?"\\N":fstrBorrowerType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLenderName==null?"\\N":fstrLenderName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLenderType==null?"\\N":fstrLenderType, " ", delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fintSeq==null?"\\N":"" + fintSeq, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSecurity==null?"\\N":fstrSecurity, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDescription==null?"\\N":fstrDescription, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmount==null?"\\N":fcurAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTerm==null?"\\N":fstrTerm, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPurpose==null?"\\N":fstrPurpose, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnZeroRating==null?"\\N":"" + fblnZeroRating, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPrincipal==null?"\\N":fstrPrincipal, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmIssue==null?"\\N":"" + fdtmIssue, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmRedemption==null?"\\N":"" + fdtmRedemption, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCeaseDate==null?"\\N":"" + fdtmCeaseDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurValueFace==null?"\\N":fcurValueFace.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurValueRedemption==null?"\\N":fcurValueRedemption.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRate==null?"\\N":fcurRate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAssociated==null?"\\N":"" + fblnAssociated, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBorrowerName==null?"\\N":fstrBorrowerName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBorrowerType==null?"\\N":fstrBorrowerType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLenderName==null?"\\N":fstrLenderName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLenderType==null?"\\N":fstrLenderType, " ", delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintSeq = null; } else {
      this.fintSeq = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSecurity = null; } else {
      this.fstrSecurity = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDescription = null; } else {
      this.fstrDescription = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmount = null; } else {
      this.fcurAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTerm = null; } else {
      this.fstrTerm = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPurpose = null; } else {
      this.fstrPurpose = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnZeroRating = null; } else {
      this.fblnZeroRating = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPrincipal = null; } else {
      this.fstrPrincipal = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmIssue = null; } else {
      this.fdtmIssue = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmRedemption = null; } else {
      this.fdtmRedemption = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCeaseDate = null; } else {
      this.fdtmCeaseDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurValueFace = null; } else {
      this.fcurValueFace = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurValueRedemption = null; } else {
      this.fcurValueRedemption = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRate = null; } else {
      this.fcurRate = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAssociated = null; } else {
      this.fblnAssociated = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrBorrowerName = null; } else {
      this.fstrBorrowerName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrBorrowerType = null; } else {
      this.fstrBorrowerType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLenderName = null; } else {
      this.fstrLenderName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLenderType = null; } else {
      this.fstrLenderType = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintSeq = null; } else {
      this.fintSeq = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSecurity = null; } else {
      this.fstrSecurity = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDescription = null; } else {
      this.fstrDescription = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmount = null; } else {
      this.fcurAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTerm = null; } else {
      this.fstrTerm = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPurpose = null; } else {
      this.fstrPurpose = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnZeroRating = null; } else {
      this.fblnZeroRating = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPrincipal = null; } else {
      this.fstrPrincipal = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmIssue = null; } else {
      this.fdtmIssue = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmRedemption = null; } else {
      this.fdtmRedemption = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCeaseDate = null; } else {
      this.fdtmCeaseDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurValueFace = null; } else {
      this.fcurValueFace = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurValueRedemption = null; } else {
      this.fcurValueRedemption = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRate = null; } else {
      this.fcurRate = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAssociated = null; } else {
      this.fblnAssociated = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrBorrowerName = null; } else {
      this.fstrBorrowerName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrBorrowerType = null; } else {
      this.fstrBorrowerType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLenderName = null; } else {
      this.fstrLenderName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLenderType = null; } else {
      this.fstrLenderType = __cur_str;
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
    tblnz_accailsecurities o = (tblnz_accailsecurities) super.clone();
    o.fdtmIssue = (o.fdtmIssue != null) ? (java.sql.Timestamp) o.fdtmIssue.clone() : null;
    o.fdtmRedemption = (o.fdtmRedemption != null) ? (java.sql.Timestamp) o.fdtmRedemption.clone() : null;
    o.fdtmCeaseDate = (o.fdtmCeaseDate != null) ? (java.sql.Timestamp) o.fdtmCeaseDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_accailsecurities o) throws CloneNotSupportedException {
    o.fdtmIssue = (o.fdtmIssue != null) ? (java.sql.Timestamp) o.fdtmIssue.clone() : null;
    o.fdtmRedemption = (o.fdtmRedemption != null) ? (java.sql.Timestamp) o.fdtmRedemption.clone() : null;
    o.fdtmCeaseDate = (o.fdtmCeaseDate != null) ? (java.sql.Timestamp) o.fdtmCeaseDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fintSeq", this.fintSeq);
    __sqoop$field_map.put("fstrSecurity", this.fstrSecurity);
    __sqoop$field_map.put("fstrDescription", this.fstrDescription);
    __sqoop$field_map.put("fcurAmount", this.fcurAmount);
    __sqoop$field_map.put("fstrTerm", this.fstrTerm);
    __sqoop$field_map.put("fstrPurpose", this.fstrPurpose);
    __sqoop$field_map.put("fblnZeroRating", this.fblnZeroRating);
    __sqoop$field_map.put("fstrPrincipal", this.fstrPrincipal);
    __sqoop$field_map.put("fdtmIssue", this.fdtmIssue);
    __sqoop$field_map.put("fdtmRedemption", this.fdtmRedemption);
    __sqoop$field_map.put("fdtmCeaseDate", this.fdtmCeaseDate);
    __sqoop$field_map.put("fcurValueFace", this.fcurValueFace);
    __sqoop$field_map.put("fcurValueRedemption", this.fcurValueRedemption);
    __sqoop$field_map.put("fcurRate", this.fcurRate);
    __sqoop$field_map.put("fblnAssociated", this.fblnAssociated);
    __sqoop$field_map.put("fstrBorrowerName", this.fstrBorrowerName);
    __sqoop$field_map.put("fstrBorrowerType", this.fstrBorrowerType);
    __sqoop$field_map.put("fstrLenderName", this.fstrLenderName);
    __sqoop$field_map.put("fstrLenderType", this.fstrLenderType);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fintSeq", this.fintSeq);
    __sqoop$field_map.put("fstrSecurity", this.fstrSecurity);
    __sqoop$field_map.put("fstrDescription", this.fstrDescription);
    __sqoop$field_map.put("fcurAmount", this.fcurAmount);
    __sqoop$field_map.put("fstrTerm", this.fstrTerm);
    __sqoop$field_map.put("fstrPurpose", this.fstrPurpose);
    __sqoop$field_map.put("fblnZeroRating", this.fblnZeroRating);
    __sqoop$field_map.put("fstrPrincipal", this.fstrPrincipal);
    __sqoop$field_map.put("fdtmIssue", this.fdtmIssue);
    __sqoop$field_map.put("fdtmRedemption", this.fdtmRedemption);
    __sqoop$field_map.put("fdtmCeaseDate", this.fdtmCeaseDate);
    __sqoop$field_map.put("fcurValueFace", this.fcurValueFace);
    __sqoop$field_map.put("fcurValueRedemption", this.fcurValueRedemption);
    __sqoop$field_map.put("fcurRate", this.fcurRate);
    __sqoop$field_map.put("fblnAssociated", this.fblnAssociated);
    __sqoop$field_map.put("fstrBorrowerName", this.fstrBorrowerName);
    __sqoop$field_map.put("fstrBorrowerType", this.fstrBorrowerType);
    __sqoop$field_map.put("fstrLenderName", this.fstrLenderName);
    __sqoop$field_map.put("fstrLenderType", this.fstrLenderType);
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
