// ORM class for table 'tblnz_rtnrwtslineitem'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 07:49:43 NZDT 2020
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

public class tblnz_rtnrwtslineitem extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("fi64LineItemKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtslineitem.this.fi64LineItemKey = (Long)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtslineitem.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtslineitem.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("fdtmPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtslineitem.this.fdtmPeriod = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrRecipientIRD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtslineitem.this.fstrRecipientIRD = (String)value;
      }
    });
    setters.put("fstrRecipientStatus", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtslineitem.this.fstrRecipientStatus = (String)value;
      }
    });
    setters.put("fstrRecipientName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtslineitem.this.fstrRecipientName = (String)value;
      }
    });
    setters.put("fstrRecipientAddress1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtslineitem.this.fstrRecipientAddress1 = (String)value;
      }
    });
    setters.put("fstrRecipientAddress2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtslineitem.this.fstrRecipientAddress2 = (String)value;
      }
    });
    setters.put("fblnJointOwnership", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtslineitem.this.fblnJointOwnership = (Integer)value;
      }
    });
    setters.put("fcurGrossDividends", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtslineitem.this.fcurGrossDividends = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurImputationCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtslineitem.this.fcurImputationCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurFDPCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtslineitem.this.fcurFDPCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRWTDeducted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtslineitem.this.fcurRWTDeducted = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrPayerIRD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtslineitem.this.fstrPayerIRD = (String)value;
      }
    });
    setters.put("fstrPayerName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtslineitem.this.fstrPayerName = (String)value;
      }
    });
    setters.put("fstrPayerAddress1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtslineitem.this.fstrPayerAddress1 = (String)value;
      }
    });
    setters.put("fstrPayerAddress2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtslineitem.this.fstrPayerAddress2 = (String)value;
      }
    });
    setters.put("fdtmPayerDateDeducted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtslineitem.this.fdtmPayerDateDeducted = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtslineitem.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwtslineitem.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_rtnrwtslineitem() {
    init0();
  }
  private Long fi64LineItemKey;
  public Long get_fi64LineItemKey() {
    return fi64LineItemKey;
  }
  public void set_fi64LineItemKey(Long fi64LineItemKey) {
    this.fi64LineItemKey = fi64LineItemKey;
  }
  public tblnz_rtnrwtslineitem with_fi64LineItemKey(Long fi64LineItemKey) {
    this.fi64LineItemKey = fi64LineItemKey;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblnz_rtnrwtslineitem with_flngVer(Integer flngVer) {
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
  public tblnz_rtnrwtslineitem with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private java.sql.Timestamp fdtmPeriod;
  public java.sql.Timestamp get_fdtmPeriod() {
    return fdtmPeriod;
  }
  public void set_fdtmPeriod(java.sql.Timestamp fdtmPeriod) {
    this.fdtmPeriod = fdtmPeriod;
  }
  public tblnz_rtnrwtslineitem with_fdtmPeriod(java.sql.Timestamp fdtmPeriod) {
    this.fdtmPeriod = fdtmPeriod;
    return this;
  }
  private String fstrRecipientIRD;
  public String get_fstrRecipientIRD() {
    return fstrRecipientIRD;
  }
  public void set_fstrRecipientIRD(String fstrRecipientIRD) {
    this.fstrRecipientIRD = fstrRecipientIRD;
  }
  public tblnz_rtnrwtslineitem with_fstrRecipientIRD(String fstrRecipientIRD) {
    this.fstrRecipientIRD = fstrRecipientIRD;
    return this;
  }
  private String fstrRecipientStatus;
  public String get_fstrRecipientStatus() {
    return fstrRecipientStatus;
  }
  public void set_fstrRecipientStatus(String fstrRecipientStatus) {
    this.fstrRecipientStatus = fstrRecipientStatus;
  }
  public tblnz_rtnrwtslineitem with_fstrRecipientStatus(String fstrRecipientStatus) {
    this.fstrRecipientStatus = fstrRecipientStatus;
    return this;
  }
  private String fstrRecipientName;
  public String get_fstrRecipientName() {
    return fstrRecipientName;
  }
  public void set_fstrRecipientName(String fstrRecipientName) {
    this.fstrRecipientName = fstrRecipientName;
  }
  public tblnz_rtnrwtslineitem with_fstrRecipientName(String fstrRecipientName) {
    this.fstrRecipientName = fstrRecipientName;
    return this;
  }
  private String fstrRecipientAddress1;
  public String get_fstrRecipientAddress1() {
    return fstrRecipientAddress1;
  }
  public void set_fstrRecipientAddress1(String fstrRecipientAddress1) {
    this.fstrRecipientAddress1 = fstrRecipientAddress1;
  }
  public tblnz_rtnrwtslineitem with_fstrRecipientAddress1(String fstrRecipientAddress1) {
    this.fstrRecipientAddress1 = fstrRecipientAddress1;
    return this;
  }
  private String fstrRecipientAddress2;
  public String get_fstrRecipientAddress2() {
    return fstrRecipientAddress2;
  }
  public void set_fstrRecipientAddress2(String fstrRecipientAddress2) {
    this.fstrRecipientAddress2 = fstrRecipientAddress2;
  }
  public tblnz_rtnrwtslineitem with_fstrRecipientAddress2(String fstrRecipientAddress2) {
    this.fstrRecipientAddress2 = fstrRecipientAddress2;
    return this;
  }
  private Integer fblnJointOwnership;
  public Integer get_fblnJointOwnership() {
    return fblnJointOwnership;
  }
  public void set_fblnJointOwnership(Integer fblnJointOwnership) {
    this.fblnJointOwnership = fblnJointOwnership;
  }
  public tblnz_rtnrwtslineitem with_fblnJointOwnership(Integer fblnJointOwnership) {
    this.fblnJointOwnership = fblnJointOwnership;
    return this;
  }
  private java.math.BigDecimal fcurGrossDividends;
  public java.math.BigDecimal get_fcurGrossDividends() {
    return fcurGrossDividends;
  }
  public void set_fcurGrossDividends(java.math.BigDecimal fcurGrossDividends) {
    this.fcurGrossDividends = fcurGrossDividends;
  }
  public tblnz_rtnrwtslineitem with_fcurGrossDividends(java.math.BigDecimal fcurGrossDividends) {
    this.fcurGrossDividends = fcurGrossDividends;
    return this;
  }
  private java.math.BigDecimal fcurImputationCredits;
  public java.math.BigDecimal get_fcurImputationCredits() {
    return fcurImputationCredits;
  }
  public void set_fcurImputationCredits(java.math.BigDecimal fcurImputationCredits) {
    this.fcurImputationCredits = fcurImputationCredits;
  }
  public tblnz_rtnrwtslineitem with_fcurImputationCredits(java.math.BigDecimal fcurImputationCredits) {
    this.fcurImputationCredits = fcurImputationCredits;
    return this;
  }
  private java.math.BigDecimal fcurFDPCredits;
  public java.math.BigDecimal get_fcurFDPCredits() {
    return fcurFDPCredits;
  }
  public void set_fcurFDPCredits(java.math.BigDecimal fcurFDPCredits) {
    this.fcurFDPCredits = fcurFDPCredits;
  }
  public tblnz_rtnrwtslineitem with_fcurFDPCredits(java.math.BigDecimal fcurFDPCredits) {
    this.fcurFDPCredits = fcurFDPCredits;
    return this;
  }
  private java.math.BigDecimal fcurRWTDeducted;
  public java.math.BigDecimal get_fcurRWTDeducted() {
    return fcurRWTDeducted;
  }
  public void set_fcurRWTDeducted(java.math.BigDecimal fcurRWTDeducted) {
    this.fcurRWTDeducted = fcurRWTDeducted;
  }
  public tblnz_rtnrwtslineitem with_fcurRWTDeducted(java.math.BigDecimal fcurRWTDeducted) {
    this.fcurRWTDeducted = fcurRWTDeducted;
    return this;
  }
  private String fstrPayerIRD;
  public String get_fstrPayerIRD() {
    return fstrPayerIRD;
  }
  public void set_fstrPayerIRD(String fstrPayerIRD) {
    this.fstrPayerIRD = fstrPayerIRD;
  }
  public tblnz_rtnrwtslineitem with_fstrPayerIRD(String fstrPayerIRD) {
    this.fstrPayerIRD = fstrPayerIRD;
    return this;
  }
  private String fstrPayerName;
  public String get_fstrPayerName() {
    return fstrPayerName;
  }
  public void set_fstrPayerName(String fstrPayerName) {
    this.fstrPayerName = fstrPayerName;
  }
  public tblnz_rtnrwtslineitem with_fstrPayerName(String fstrPayerName) {
    this.fstrPayerName = fstrPayerName;
    return this;
  }
  private String fstrPayerAddress1;
  public String get_fstrPayerAddress1() {
    return fstrPayerAddress1;
  }
  public void set_fstrPayerAddress1(String fstrPayerAddress1) {
    this.fstrPayerAddress1 = fstrPayerAddress1;
  }
  public tblnz_rtnrwtslineitem with_fstrPayerAddress1(String fstrPayerAddress1) {
    this.fstrPayerAddress1 = fstrPayerAddress1;
    return this;
  }
  private String fstrPayerAddress2;
  public String get_fstrPayerAddress2() {
    return fstrPayerAddress2;
  }
  public void set_fstrPayerAddress2(String fstrPayerAddress2) {
    this.fstrPayerAddress2 = fstrPayerAddress2;
  }
  public tblnz_rtnrwtslineitem with_fstrPayerAddress2(String fstrPayerAddress2) {
    this.fstrPayerAddress2 = fstrPayerAddress2;
    return this;
  }
  private java.sql.Timestamp fdtmPayerDateDeducted;
  public java.sql.Timestamp get_fdtmPayerDateDeducted() {
    return fdtmPayerDateDeducted;
  }
  public void set_fdtmPayerDateDeducted(java.sql.Timestamp fdtmPayerDateDeducted) {
    this.fdtmPayerDateDeducted = fdtmPayerDateDeducted;
  }
  public tblnz_rtnrwtslineitem with_fdtmPayerDateDeducted(java.sql.Timestamp fdtmPayerDateDeducted) {
    this.fdtmPayerDateDeducted = fdtmPayerDateDeducted;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_rtnrwtslineitem with_fstrWho(String fstrWho) {
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
  public tblnz_rtnrwtslineitem with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnrwtslineitem)) {
      return false;
    }
    tblnz_rtnrwtslineitem that = (tblnz_rtnrwtslineitem) o;
    boolean equal = true;
    equal = equal && (this.fi64LineItemKey == null ? that.fi64LineItemKey == null : this.fi64LineItemKey.equals(that.fi64LineItemKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fdtmPeriod == null ? that.fdtmPeriod == null : this.fdtmPeriod.equals(that.fdtmPeriod));
    equal = equal && (this.fstrRecipientIRD == null ? that.fstrRecipientIRD == null : this.fstrRecipientIRD.equals(that.fstrRecipientIRD));
    equal = equal && (this.fstrRecipientStatus == null ? that.fstrRecipientStatus == null : this.fstrRecipientStatus.equals(that.fstrRecipientStatus));
    equal = equal && (this.fstrRecipientName == null ? that.fstrRecipientName == null : this.fstrRecipientName.equals(that.fstrRecipientName));
    equal = equal && (this.fstrRecipientAddress1 == null ? that.fstrRecipientAddress1 == null : this.fstrRecipientAddress1.equals(that.fstrRecipientAddress1));
    equal = equal && (this.fstrRecipientAddress2 == null ? that.fstrRecipientAddress2 == null : this.fstrRecipientAddress2.equals(that.fstrRecipientAddress2));
    equal = equal && (this.fblnJointOwnership == null ? that.fblnJointOwnership == null : this.fblnJointOwnership.equals(that.fblnJointOwnership));
    equal = equal && (this.fcurGrossDividends == null ? that.fcurGrossDividends == null : this.fcurGrossDividends.equals(that.fcurGrossDividends));
    equal = equal && (this.fcurImputationCredits == null ? that.fcurImputationCredits == null : this.fcurImputationCredits.equals(that.fcurImputationCredits));
    equal = equal && (this.fcurFDPCredits == null ? that.fcurFDPCredits == null : this.fcurFDPCredits.equals(that.fcurFDPCredits));
    equal = equal && (this.fcurRWTDeducted == null ? that.fcurRWTDeducted == null : this.fcurRWTDeducted.equals(that.fcurRWTDeducted));
    equal = equal && (this.fstrPayerIRD == null ? that.fstrPayerIRD == null : this.fstrPayerIRD.equals(that.fstrPayerIRD));
    equal = equal && (this.fstrPayerName == null ? that.fstrPayerName == null : this.fstrPayerName.equals(that.fstrPayerName));
    equal = equal && (this.fstrPayerAddress1 == null ? that.fstrPayerAddress1 == null : this.fstrPayerAddress1.equals(that.fstrPayerAddress1));
    equal = equal && (this.fstrPayerAddress2 == null ? that.fstrPayerAddress2 == null : this.fstrPayerAddress2.equals(that.fstrPayerAddress2));
    equal = equal && (this.fdtmPayerDateDeducted == null ? that.fdtmPayerDateDeducted == null : this.fdtmPayerDateDeducted.equals(that.fdtmPayerDateDeducted));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnrwtslineitem)) {
      return false;
    }
    tblnz_rtnrwtslineitem that = (tblnz_rtnrwtslineitem) o;
    boolean equal = true;
    equal = equal && (this.fi64LineItemKey == null ? that.fi64LineItemKey == null : this.fi64LineItemKey.equals(that.fi64LineItemKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fdtmPeriod == null ? that.fdtmPeriod == null : this.fdtmPeriod.equals(that.fdtmPeriod));
    equal = equal && (this.fstrRecipientIRD == null ? that.fstrRecipientIRD == null : this.fstrRecipientIRD.equals(that.fstrRecipientIRD));
    equal = equal && (this.fstrRecipientStatus == null ? that.fstrRecipientStatus == null : this.fstrRecipientStatus.equals(that.fstrRecipientStatus));
    equal = equal && (this.fstrRecipientName == null ? that.fstrRecipientName == null : this.fstrRecipientName.equals(that.fstrRecipientName));
    equal = equal && (this.fstrRecipientAddress1 == null ? that.fstrRecipientAddress1 == null : this.fstrRecipientAddress1.equals(that.fstrRecipientAddress1));
    equal = equal && (this.fstrRecipientAddress2 == null ? that.fstrRecipientAddress2 == null : this.fstrRecipientAddress2.equals(that.fstrRecipientAddress2));
    equal = equal && (this.fblnJointOwnership == null ? that.fblnJointOwnership == null : this.fblnJointOwnership.equals(that.fblnJointOwnership));
    equal = equal && (this.fcurGrossDividends == null ? that.fcurGrossDividends == null : this.fcurGrossDividends.equals(that.fcurGrossDividends));
    equal = equal && (this.fcurImputationCredits == null ? that.fcurImputationCredits == null : this.fcurImputationCredits.equals(that.fcurImputationCredits));
    equal = equal && (this.fcurFDPCredits == null ? that.fcurFDPCredits == null : this.fcurFDPCredits.equals(that.fcurFDPCredits));
    equal = equal && (this.fcurRWTDeducted == null ? that.fcurRWTDeducted == null : this.fcurRWTDeducted.equals(that.fcurRWTDeducted));
    equal = equal && (this.fstrPayerIRD == null ? that.fstrPayerIRD == null : this.fstrPayerIRD.equals(that.fstrPayerIRD));
    equal = equal && (this.fstrPayerName == null ? that.fstrPayerName == null : this.fstrPayerName.equals(that.fstrPayerName));
    equal = equal && (this.fstrPayerAddress1 == null ? that.fstrPayerAddress1 == null : this.fstrPayerAddress1.equals(that.fstrPayerAddress1));
    equal = equal && (this.fstrPayerAddress2 == null ? that.fstrPayerAddress2 == null : this.fstrPayerAddress2.equals(that.fstrPayerAddress2));
    equal = equal && (this.fdtmPayerDateDeducted == null ? that.fdtmPayerDateDeducted == null : this.fdtmPayerDateDeducted.equals(that.fdtmPayerDateDeducted));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.fi64LineItemKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fdtmPeriod = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.fstrRecipientIRD = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrRecipientStatus = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrRecipientName = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrRecipientAddress1 = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrRecipientAddress2 = JdbcWritableBridge.readString(9, __dbResults);
    this.fblnJointOwnership = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fcurGrossDividends = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurImputationCredits = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurFDPCredits = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurRWTDeducted = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fstrPayerIRD = JdbcWritableBridge.readString(15, __dbResults);
    this.fstrPayerName = JdbcWritableBridge.readString(16, __dbResults);
    this.fstrPayerAddress1 = JdbcWritableBridge.readString(17, __dbResults);
    this.fstrPayerAddress2 = JdbcWritableBridge.readString(18, __dbResults);
    this.fdtmPayerDateDeducted = JdbcWritableBridge.readTimestamp(19, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(20, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(21, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.fi64LineItemKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fdtmPeriod = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.fstrRecipientIRD = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrRecipientStatus = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrRecipientName = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrRecipientAddress1 = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrRecipientAddress2 = JdbcWritableBridge.readString(9, __dbResults);
    this.fblnJointOwnership = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fcurGrossDividends = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurImputationCredits = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurFDPCredits = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurRWTDeducted = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fstrPayerIRD = JdbcWritableBridge.readString(15, __dbResults);
    this.fstrPayerName = JdbcWritableBridge.readString(16, __dbResults);
    this.fstrPayerAddress1 = JdbcWritableBridge.readString(17, __dbResults);
    this.fstrPayerAddress2 = JdbcWritableBridge.readString(18, __dbResults);
    this.fdtmPayerDateDeducted = JdbcWritableBridge.readTimestamp(19, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(20, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(21, __dbResults);
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
    JdbcWritableBridge.writeLong(fi64LineItemKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPeriod, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientIRD, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientStatus, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientName, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientAddress1, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientAddress2, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnJointOwnership, 10 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGrossDividends, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurImputationCredits, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFDPCredits, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRWTDeducted, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrPayerIRD, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPayerName, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPayerAddress1, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPayerAddress2, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPayerDateDeducted, 19 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 21 + __off, 93, __dbStmt);
    return 21;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(fi64LineItemKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPeriod, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientIRD, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientStatus, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientName, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientAddress1, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientAddress2, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnJointOwnership, 10 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGrossDividends, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurImputationCredits, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFDPCredits, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRWTDeducted, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrPayerIRD, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPayerName, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPayerAddress1, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPayerAddress2, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPayerDateDeducted, 19 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 21 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.fi64LineItemKey = null;
    } else {
    this.fi64LineItemKey = Long.valueOf(__dataIn.readLong());
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
        this.fdtmPeriod = null;
    } else {
    this.fdtmPeriod = new Timestamp(__dataIn.readLong());
    this.fdtmPeriod.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRecipientIRD = null;
    } else {
    this.fstrRecipientIRD = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRecipientStatus = null;
    } else {
    this.fstrRecipientStatus = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRecipientName = null;
    } else {
    this.fstrRecipientName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRecipientAddress1 = null;
    } else {
    this.fstrRecipientAddress1 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRecipientAddress2 = null;
    } else {
    this.fstrRecipientAddress2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnJointOwnership = null;
    } else {
    this.fblnJointOwnership = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurGrossDividends = null;
    } else {
    this.fcurGrossDividends = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurImputationCredits = null;
    } else {
    this.fcurImputationCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurFDPCredits = null;
    } else {
    this.fcurFDPCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRWTDeducted = null;
    } else {
    this.fcurRWTDeducted = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPayerIRD = null;
    } else {
    this.fstrPayerIRD = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPayerName = null;
    } else {
    this.fstrPayerName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPayerAddress1 = null;
    } else {
    this.fstrPayerAddress1 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPayerAddress2 = null;
    } else {
    this.fstrPayerAddress2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmPayerDateDeducted = null;
    } else {
    this.fdtmPayerDateDeducted = new Timestamp(__dataIn.readLong());
    this.fdtmPayerDateDeducted.setNanos(__dataIn.readInt());
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
    if (null == this.fi64LineItemKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64LineItemKey);
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
    if (null == this.fdtmPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPeriod.getTime());
    __dataOut.writeInt(this.fdtmPeriod.getNanos());
    }
    if (null == this.fstrRecipientIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientIRD);
    }
    if (null == this.fstrRecipientStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientStatus);
    }
    if (null == this.fstrRecipientName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientName);
    }
    if (null == this.fstrRecipientAddress1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientAddress1);
    }
    if (null == this.fstrRecipientAddress2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientAddress2);
    }
    if (null == this.fblnJointOwnership) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnJointOwnership);
    }
    if (null == this.fcurGrossDividends) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGrossDividends, __dataOut);
    }
    if (null == this.fcurImputationCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurImputationCredits, __dataOut);
    }
    if (null == this.fcurFDPCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFDPCredits, __dataOut);
    }
    if (null == this.fcurRWTDeducted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRWTDeducted, __dataOut);
    }
    if (null == this.fstrPayerIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPayerIRD);
    }
    if (null == this.fstrPayerName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPayerName);
    }
    if (null == this.fstrPayerAddress1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPayerAddress1);
    }
    if (null == this.fstrPayerAddress2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPayerAddress2);
    }
    if (null == this.fdtmPayerDateDeducted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPayerDateDeducted.getTime());
    __dataOut.writeInt(this.fdtmPayerDateDeducted.getNanos());
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
    if (null == this.fi64LineItemKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64LineItemKey);
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
    if (null == this.fdtmPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPeriod.getTime());
    __dataOut.writeInt(this.fdtmPeriod.getNanos());
    }
    if (null == this.fstrRecipientIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientIRD);
    }
    if (null == this.fstrRecipientStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientStatus);
    }
    if (null == this.fstrRecipientName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientName);
    }
    if (null == this.fstrRecipientAddress1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientAddress1);
    }
    if (null == this.fstrRecipientAddress2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientAddress2);
    }
    if (null == this.fblnJointOwnership) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnJointOwnership);
    }
    if (null == this.fcurGrossDividends) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGrossDividends, __dataOut);
    }
    if (null == this.fcurImputationCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurImputationCredits, __dataOut);
    }
    if (null == this.fcurFDPCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFDPCredits, __dataOut);
    }
    if (null == this.fcurRWTDeducted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRWTDeducted, __dataOut);
    }
    if (null == this.fstrPayerIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPayerIRD);
    }
    if (null == this.fstrPayerName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPayerName);
    }
    if (null == this.fstrPayerAddress1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPayerAddress1);
    }
    if (null == this.fstrPayerAddress2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPayerAddress2);
    }
    if (null == this.fdtmPayerDateDeducted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPayerDateDeducted.getTime());
    __dataOut.writeInt(this.fdtmPayerDateDeducted.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64LineItemKey==null?"\\N":"" + fi64LineItemKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPeriod==null?"\\N":"" + fdtmPeriod, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientIRD==null?"\\N":fstrRecipientIRD, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientStatus==null?"\\N":fstrRecipientStatus, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientName==null?"\\N":fstrRecipientName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientAddress1==null?"\\N":fstrRecipientAddress1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientAddress2==null?"\\N":fstrRecipientAddress2, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnJointOwnership==null?"\\N":"" + fblnJointOwnership, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGrossDividends==null?"\\N":fcurGrossDividends.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurImputationCredits==null?"\\N":fcurImputationCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFDPCredits==null?"\\N":fcurFDPCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRWTDeducted==null?"\\N":fcurRWTDeducted.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPayerIRD==null?"\\N":fstrPayerIRD, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPayerName==null?"\\N":fstrPayerName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPayerAddress1==null?"\\N":fstrPayerAddress1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPayerAddress2==null?"\\N":fstrPayerAddress2, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPayerDateDeducted==null?"\\N":"" + fdtmPayerDateDeducted, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64LineItemKey==null?"\\N":"" + fi64LineItemKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPeriod==null?"\\N":"" + fdtmPeriod, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientIRD==null?"\\N":fstrRecipientIRD, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientStatus==null?"\\N":fstrRecipientStatus, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientName==null?"\\N":fstrRecipientName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientAddress1==null?"\\N":fstrRecipientAddress1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientAddress2==null?"\\N":fstrRecipientAddress2, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnJointOwnership==null?"\\N":"" + fblnJointOwnership, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGrossDividends==null?"\\N":fcurGrossDividends.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurImputationCredits==null?"\\N":fcurImputationCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFDPCredits==null?"\\N":fcurFDPCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRWTDeducted==null?"\\N":fcurRWTDeducted.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPayerIRD==null?"\\N":fstrPayerIRD, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPayerName==null?"\\N":fstrPayerName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPayerAddress1==null?"\\N":fstrPayerAddress1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPayerAddress2==null?"\\N":fstrPayerAddress2, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPayerDateDeducted==null?"\\N":"" + fdtmPayerDateDeducted, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64LineItemKey = null; } else {
      this.fi64LineItemKey = Long.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPeriod = null; } else {
      this.fdtmPeriod = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecipientIRD = null; } else {
      this.fstrRecipientIRD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecipientStatus = null; } else {
      this.fstrRecipientStatus = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecipientName = null; } else {
      this.fstrRecipientName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecipientAddress1 = null; } else {
      this.fstrRecipientAddress1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecipientAddress2 = null; } else {
      this.fstrRecipientAddress2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnJointOwnership = null; } else {
      this.fblnJointOwnership = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGrossDividends = null; } else {
      this.fcurGrossDividends = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurImputationCredits = null; } else {
      this.fcurImputationCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFDPCredits = null; } else {
      this.fcurFDPCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRWTDeducted = null; } else {
      this.fcurRWTDeducted = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPayerIRD = null; } else {
      this.fstrPayerIRD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPayerName = null; } else {
      this.fstrPayerName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPayerAddress1 = null; } else {
      this.fstrPayerAddress1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPayerAddress2 = null; } else {
      this.fstrPayerAddress2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPayerDateDeducted = null; } else {
      this.fdtmPayerDateDeducted = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64LineItemKey = null; } else {
      this.fi64LineItemKey = Long.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPeriod = null; } else {
      this.fdtmPeriod = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecipientIRD = null; } else {
      this.fstrRecipientIRD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecipientStatus = null; } else {
      this.fstrRecipientStatus = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecipientName = null; } else {
      this.fstrRecipientName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecipientAddress1 = null; } else {
      this.fstrRecipientAddress1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecipientAddress2 = null; } else {
      this.fstrRecipientAddress2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnJointOwnership = null; } else {
      this.fblnJointOwnership = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGrossDividends = null; } else {
      this.fcurGrossDividends = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurImputationCredits = null; } else {
      this.fcurImputationCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFDPCredits = null; } else {
      this.fcurFDPCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRWTDeducted = null; } else {
      this.fcurRWTDeducted = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPayerIRD = null; } else {
      this.fstrPayerIRD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPayerName = null; } else {
      this.fstrPayerName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPayerAddress1 = null; } else {
      this.fstrPayerAddress1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPayerAddress2 = null; } else {
      this.fstrPayerAddress2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPayerDateDeducted = null; } else {
      this.fdtmPayerDateDeducted = java.sql.Timestamp.valueOf(__cur_str);
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
    tblnz_rtnrwtslineitem o = (tblnz_rtnrwtslineitem) super.clone();
    o.fdtmPeriod = (o.fdtmPeriod != null) ? (java.sql.Timestamp) o.fdtmPeriod.clone() : null;
    o.fdtmPayerDateDeducted = (o.fdtmPayerDateDeducted != null) ? (java.sql.Timestamp) o.fdtmPayerDateDeducted.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_rtnrwtslineitem o) throws CloneNotSupportedException {
    o.fdtmPeriod = (o.fdtmPeriod != null) ? (java.sql.Timestamp) o.fdtmPeriod.clone() : null;
    o.fdtmPayerDateDeducted = (o.fdtmPayerDateDeducted != null) ? (java.sql.Timestamp) o.fdtmPayerDateDeducted.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("fi64LineItemKey", this.fi64LineItemKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fdtmPeriod", this.fdtmPeriod);
    __sqoop$field_map.put("fstrRecipientIRD", this.fstrRecipientIRD);
    __sqoop$field_map.put("fstrRecipientStatus", this.fstrRecipientStatus);
    __sqoop$field_map.put("fstrRecipientName", this.fstrRecipientName);
    __sqoop$field_map.put("fstrRecipientAddress1", this.fstrRecipientAddress1);
    __sqoop$field_map.put("fstrRecipientAddress2", this.fstrRecipientAddress2);
    __sqoop$field_map.put("fblnJointOwnership", this.fblnJointOwnership);
    __sqoop$field_map.put("fcurGrossDividends", this.fcurGrossDividends);
    __sqoop$field_map.put("fcurImputationCredits", this.fcurImputationCredits);
    __sqoop$field_map.put("fcurFDPCredits", this.fcurFDPCredits);
    __sqoop$field_map.put("fcurRWTDeducted", this.fcurRWTDeducted);
    __sqoop$field_map.put("fstrPayerIRD", this.fstrPayerIRD);
    __sqoop$field_map.put("fstrPayerName", this.fstrPayerName);
    __sqoop$field_map.put("fstrPayerAddress1", this.fstrPayerAddress1);
    __sqoop$field_map.put("fstrPayerAddress2", this.fstrPayerAddress2);
    __sqoop$field_map.put("fdtmPayerDateDeducted", this.fdtmPayerDateDeducted);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("fi64LineItemKey", this.fi64LineItemKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fdtmPeriod", this.fdtmPeriod);
    __sqoop$field_map.put("fstrRecipientIRD", this.fstrRecipientIRD);
    __sqoop$field_map.put("fstrRecipientStatus", this.fstrRecipientStatus);
    __sqoop$field_map.put("fstrRecipientName", this.fstrRecipientName);
    __sqoop$field_map.put("fstrRecipientAddress1", this.fstrRecipientAddress1);
    __sqoop$field_map.put("fstrRecipientAddress2", this.fstrRecipientAddress2);
    __sqoop$field_map.put("fblnJointOwnership", this.fblnJointOwnership);
    __sqoop$field_map.put("fcurGrossDividends", this.fcurGrossDividends);
    __sqoop$field_map.put("fcurImputationCredits", this.fcurImputationCredits);
    __sqoop$field_map.put("fcurFDPCredits", this.fcurFDPCredits);
    __sqoop$field_map.put("fcurRWTDeducted", this.fcurRWTDeducted);
    __sqoop$field_map.put("fstrPayerIRD", this.fstrPayerIRD);
    __sqoop$field_map.put("fstrPayerName", this.fstrPayerName);
    __sqoop$field_map.put("fstrPayerAddress1", this.fstrPayerAddress1);
    __sqoop$field_map.put("fstrPayerAddress2", this.fstrPayerAddress2);
    __sqoop$field_map.put("fdtmPayerDateDeducted", this.fdtmPayerDateDeducted);
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
