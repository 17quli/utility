// ORM class for table 'tblnz_rtnipsslineitem'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 05:20:39 NZDT 2020
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

public class tblnz_rtnipsslineitem extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("fi64LineItemKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnipsslineitem.this.fi64LineItemKey = (Long)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnipsslineitem.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnipsslineitem.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("fdtmPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnipsslineitem.this.fdtmPeriod = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrRecipientName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnipsslineitem.this.fstrRecipientName = (String)value;
      }
    });
    setters.put("fstrRecipientIRD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnipsslineitem.this.fstrRecipientIRD = (String)value;
      }
    });
    setters.put("fstrRecipientAddress1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnipsslineitem.this.fstrRecipientAddress1 = (String)value;
      }
    });
    setters.put("fstrRecipientAddress2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnipsslineitem.this.fstrRecipientAddress2 = (String)value;
      }
    });
    setters.put("fstrRecipientStatus", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnipsslineitem.this.fstrRecipientStatus = (String)value;
      }
    });
    setters.put("fcurInterestLiable1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnipsslineitem.this.fcurInterestLiable1 = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurInterestLiable2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnipsslineitem.this.fcurInterestLiable2 = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurInterestLiable3", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnipsslineitem.this.fcurInterestLiable3 = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalInterestLiable", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnipsslineitem.this.fcurTotalInterestLiable = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRWTDeducted1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnipsslineitem.this.fcurRWTDeducted1 = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRWTDeducted2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnipsslineitem.this.fcurRWTDeducted2 = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRWTDeducted3", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnipsslineitem.this.fcurRWTDeducted3 = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalRWTDeducted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnipsslineitem.this.fcurTotalRWTDeducted = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRWTRate1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnipsslineitem.this.fcurRWTRate1 = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRWTRate2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnipsslineitem.this.fcurRWTRate2 = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRWTRate3", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnipsslineitem.this.fcurRWTRate3 = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRWTRateAverage", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnipsslineitem.this.fcurRWTRateAverage = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrBankAccountID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnipsslineitem.this.fstrBankAccountID = (String)value;
      }
    });
    setters.put("fstrBankAccountBranch", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnipsslineitem.this.fstrBankAccountBranch = (String)value;
      }
    });
    setters.put("fstrBankAccountNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnipsslineitem.this.fstrBankAccountNumber = (String)value;
      }
    });
    setters.put("fstrBankAccountSuffix", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnipsslineitem.this.fstrBankAccountSuffix = (String)value;
      }
    });
    setters.put("fstrAccountNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnipsslineitem.this.fstrAccountNumber = (String)value;
      }
    });
    setters.put("fblnJointAccountIndicator", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnipsslineitem.this.fblnJointAccountIndicator = (Integer)value;
      }
    });
    setters.put("fstrPayerIRD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnipsslineitem.this.fstrPayerIRD = (String)value;
      }
    });
    setters.put("fstrPayerName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnipsslineitem.this.fstrPayerName = (String)value;
      }
    });
    setters.put("fstrPayerAddress1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnipsslineitem.this.fstrPayerAddress1 = (String)value;
      }
    });
    setters.put("fstrPayerAddress2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnipsslineitem.this.fstrPayerAddress2 = (String)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnipsslineitem.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnipsslineitem.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_rtnipsslineitem() {
    init0();
  }
  private Long fi64LineItemKey;
  public Long get_fi64LineItemKey() {
    return fi64LineItemKey;
  }
  public void set_fi64LineItemKey(Long fi64LineItemKey) {
    this.fi64LineItemKey = fi64LineItemKey;
  }
  public tblnz_rtnipsslineitem with_fi64LineItemKey(Long fi64LineItemKey) {
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
  public tblnz_rtnipsslineitem with_flngVer(Integer flngVer) {
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
  public tblnz_rtnipsslineitem with_flngVerLast(Integer flngVerLast) {
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
  public tblnz_rtnipsslineitem with_fdtmPeriod(java.sql.Timestamp fdtmPeriod) {
    this.fdtmPeriod = fdtmPeriod;
    return this;
  }
  private String fstrRecipientName;
  public String get_fstrRecipientName() {
    return fstrRecipientName;
  }
  public void set_fstrRecipientName(String fstrRecipientName) {
    this.fstrRecipientName = fstrRecipientName;
  }
  public tblnz_rtnipsslineitem with_fstrRecipientName(String fstrRecipientName) {
    this.fstrRecipientName = fstrRecipientName;
    return this;
  }
  private String fstrRecipientIRD;
  public String get_fstrRecipientIRD() {
    return fstrRecipientIRD;
  }
  public void set_fstrRecipientIRD(String fstrRecipientIRD) {
    this.fstrRecipientIRD = fstrRecipientIRD;
  }
  public tblnz_rtnipsslineitem with_fstrRecipientIRD(String fstrRecipientIRD) {
    this.fstrRecipientIRD = fstrRecipientIRD;
    return this;
  }
  private String fstrRecipientAddress1;
  public String get_fstrRecipientAddress1() {
    return fstrRecipientAddress1;
  }
  public void set_fstrRecipientAddress1(String fstrRecipientAddress1) {
    this.fstrRecipientAddress1 = fstrRecipientAddress1;
  }
  public tblnz_rtnipsslineitem with_fstrRecipientAddress1(String fstrRecipientAddress1) {
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
  public tblnz_rtnipsslineitem with_fstrRecipientAddress2(String fstrRecipientAddress2) {
    this.fstrRecipientAddress2 = fstrRecipientAddress2;
    return this;
  }
  private String fstrRecipientStatus;
  public String get_fstrRecipientStatus() {
    return fstrRecipientStatus;
  }
  public void set_fstrRecipientStatus(String fstrRecipientStatus) {
    this.fstrRecipientStatus = fstrRecipientStatus;
  }
  public tblnz_rtnipsslineitem with_fstrRecipientStatus(String fstrRecipientStatus) {
    this.fstrRecipientStatus = fstrRecipientStatus;
    return this;
  }
  private java.math.BigDecimal fcurInterestLiable1;
  public java.math.BigDecimal get_fcurInterestLiable1() {
    return fcurInterestLiable1;
  }
  public void set_fcurInterestLiable1(java.math.BigDecimal fcurInterestLiable1) {
    this.fcurInterestLiable1 = fcurInterestLiable1;
  }
  public tblnz_rtnipsslineitem with_fcurInterestLiable1(java.math.BigDecimal fcurInterestLiable1) {
    this.fcurInterestLiable1 = fcurInterestLiable1;
    return this;
  }
  private java.math.BigDecimal fcurInterestLiable2;
  public java.math.BigDecimal get_fcurInterestLiable2() {
    return fcurInterestLiable2;
  }
  public void set_fcurInterestLiable2(java.math.BigDecimal fcurInterestLiable2) {
    this.fcurInterestLiable2 = fcurInterestLiable2;
  }
  public tblnz_rtnipsslineitem with_fcurInterestLiable2(java.math.BigDecimal fcurInterestLiable2) {
    this.fcurInterestLiable2 = fcurInterestLiable2;
    return this;
  }
  private java.math.BigDecimal fcurInterestLiable3;
  public java.math.BigDecimal get_fcurInterestLiable3() {
    return fcurInterestLiable3;
  }
  public void set_fcurInterestLiable3(java.math.BigDecimal fcurInterestLiable3) {
    this.fcurInterestLiable3 = fcurInterestLiable3;
  }
  public tblnz_rtnipsslineitem with_fcurInterestLiable3(java.math.BigDecimal fcurInterestLiable3) {
    this.fcurInterestLiable3 = fcurInterestLiable3;
    return this;
  }
  private java.math.BigDecimal fcurTotalInterestLiable;
  public java.math.BigDecimal get_fcurTotalInterestLiable() {
    return fcurTotalInterestLiable;
  }
  public void set_fcurTotalInterestLiable(java.math.BigDecimal fcurTotalInterestLiable) {
    this.fcurTotalInterestLiable = fcurTotalInterestLiable;
  }
  public tblnz_rtnipsslineitem with_fcurTotalInterestLiable(java.math.BigDecimal fcurTotalInterestLiable) {
    this.fcurTotalInterestLiable = fcurTotalInterestLiable;
    return this;
  }
  private java.math.BigDecimal fcurRWTDeducted1;
  public java.math.BigDecimal get_fcurRWTDeducted1() {
    return fcurRWTDeducted1;
  }
  public void set_fcurRWTDeducted1(java.math.BigDecimal fcurRWTDeducted1) {
    this.fcurRWTDeducted1 = fcurRWTDeducted1;
  }
  public tblnz_rtnipsslineitem with_fcurRWTDeducted1(java.math.BigDecimal fcurRWTDeducted1) {
    this.fcurRWTDeducted1 = fcurRWTDeducted1;
    return this;
  }
  private java.math.BigDecimal fcurRWTDeducted2;
  public java.math.BigDecimal get_fcurRWTDeducted2() {
    return fcurRWTDeducted2;
  }
  public void set_fcurRWTDeducted2(java.math.BigDecimal fcurRWTDeducted2) {
    this.fcurRWTDeducted2 = fcurRWTDeducted2;
  }
  public tblnz_rtnipsslineitem with_fcurRWTDeducted2(java.math.BigDecimal fcurRWTDeducted2) {
    this.fcurRWTDeducted2 = fcurRWTDeducted2;
    return this;
  }
  private java.math.BigDecimal fcurRWTDeducted3;
  public java.math.BigDecimal get_fcurRWTDeducted3() {
    return fcurRWTDeducted3;
  }
  public void set_fcurRWTDeducted3(java.math.BigDecimal fcurRWTDeducted3) {
    this.fcurRWTDeducted3 = fcurRWTDeducted3;
  }
  public tblnz_rtnipsslineitem with_fcurRWTDeducted3(java.math.BigDecimal fcurRWTDeducted3) {
    this.fcurRWTDeducted3 = fcurRWTDeducted3;
    return this;
  }
  private java.math.BigDecimal fcurTotalRWTDeducted;
  public java.math.BigDecimal get_fcurTotalRWTDeducted() {
    return fcurTotalRWTDeducted;
  }
  public void set_fcurTotalRWTDeducted(java.math.BigDecimal fcurTotalRWTDeducted) {
    this.fcurTotalRWTDeducted = fcurTotalRWTDeducted;
  }
  public tblnz_rtnipsslineitem with_fcurTotalRWTDeducted(java.math.BigDecimal fcurTotalRWTDeducted) {
    this.fcurTotalRWTDeducted = fcurTotalRWTDeducted;
    return this;
  }
  private java.math.BigDecimal fcurRWTRate1;
  public java.math.BigDecimal get_fcurRWTRate1() {
    return fcurRWTRate1;
  }
  public void set_fcurRWTRate1(java.math.BigDecimal fcurRWTRate1) {
    this.fcurRWTRate1 = fcurRWTRate1;
  }
  public tblnz_rtnipsslineitem with_fcurRWTRate1(java.math.BigDecimal fcurRWTRate1) {
    this.fcurRWTRate1 = fcurRWTRate1;
    return this;
  }
  private java.math.BigDecimal fcurRWTRate2;
  public java.math.BigDecimal get_fcurRWTRate2() {
    return fcurRWTRate2;
  }
  public void set_fcurRWTRate2(java.math.BigDecimal fcurRWTRate2) {
    this.fcurRWTRate2 = fcurRWTRate2;
  }
  public tblnz_rtnipsslineitem with_fcurRWTRate2(java.math.BigDecimal fcurRWTRate2) {
    this.fcurRWTRate2 = fcurRWTRate2;
    return this;
  }
  private java.math.BigDecimal fcurRWTRate3;
  public java.math.BigDecimal get_fcurRWTRate3() {
    return fcurRWTRate3;
  }
  public void set_fcurRWTRate3(java.math.BigDecimal fcurRWTRate3) {
    this.fcurRWTRate3 = fcurRWTRate3;
  }
  public tblnz_rtnipsslineitem with_fcurRWTRate3(java.math.BigDecimal fcurRWTRate3) {
    this.fcurRWTRate3 = fcurRWTRate3;
    return this;
  }
  private java.math.BigDecimal fcurRWTRateAverage;
  public java.math.BigDecimal get_fcurRWTRateAverage() {
    return fcurRWTRateAverage;
  }
  public void set_fcurRWTRateAverage(java.math.BigDecimal fcurRWTRateAverage) {
    this.fcurRWTRateAverage = fcurRWTRateAverage;
  }
  public tblnz_rtnipsslineitem with_fcurRWTRateAverage(java.math.BigDecimal fcurRWTRateAverage) {
    this.fcurRWTRateAverage = fcurRWTRateAverage;
    return this;
  }
  private String fstrBankAccountID;
  public String get_fstrBankAccountID() {
    return fstrBankAccountID;
  }
  public void set_fstrBankAccountID(String fstrBankAccountID) {
    this.fstrBankAccountID = fstrBankAccountID;
  }
  public tblnz_rtnipsslineitem with_fstrBankAccountID(String fstrBankAccountID) {
    this.fstrBankAccountID = fstrBankAccountID;
    return this;
  }
  private String fstrBankAccountBranch;
  public String get_fstrBankAccountBranch() {
    return fstrBankAccountBranch;
  }
  public void set_fstrBankAccountBranch(String fstrBankAccountBranch) {
    this.fstrBankAccountBranch = fstrBankAccountBranch;
  }
  public tblnz_rtnipsslineitem with_fstrBankAccountBranch(String fstrBankAccountBranch) {
    this.fstrBankAccountBranch = fstrBankAccountBranch;
    return this;
  }
  private String fstrBankAccountNumber;
  public String get_fstrBankAccountNumber() {
    return fstrBankAccountNumber;
  }
  public void set_fstrBankAccountNumber(String fstrBankAccountNumber) {
    this.fstrBankAccountNumber = fstrBankAccountNumber;
  }
  public tblnz_rtnipsslineitem with_fstrBankAccountNumber(String fstrBankAccountNumber) {
    this.fstrBankAccountNumber = fstrBankAccountNumber;
    return this;
  }
  private String fstrBankAccountSuffix;
  public String get_fstrBankAccountSuffix() {
    return fstrBankAccountSuffix;
  }
  public void set_fstrBankAccountSuffix(String fstrBankAccountSuffix) {
    this.fstrBankAccountSuffix = fstrBankAccountSuffix;
  }
  public tblnz_rtnipsslineitem with_fstrBankAccountSuffix(String fstrBankAccountSuffix) {
    this.fstrBankAccountSuffix = fstrBankAccountSuffix;
    return this;
  }
  private String fstrAccountNumber;
  public String get_fstrAccountNumber() {
    return fstrAccountNumber;
  }
  public void set_fstrAccountNumber(String fstrAccountNumber) {
    this.fstrAccountNumber = fstrAccountNumber;
  }
  public tblnz_rtnipsslineitem with_fstrAccountNumber(String fstrAccountNumber) {
    this.fstrAccountNumber = fstrAccountNumber;
    return this;
  }
  private Integer fblnJointAccountIndicator;
  public Integer get_fblnJointAccountIndicator() {
    return fblnJointAccountIndicator;
  }
  public void set_fblnJointAccountIndicator(Integer fblnJointAccountIndicator) {
    this.fblnJointAccountIndicator = fblnJointAccountIndicator;
  }
  public tblnz_rtnipsslineitem with_fblnJointAccountIndicator(Integer fblnJointAccountIndicator) {
    this.fblnJointAccountIndicator = fblnJointAccountIndicator;
    return this;
  }
  private String fstrPayerIRD;
  public String get_fstrPayerIRD() {
    return fstrPayerIRD;
  }
  public void set_fstrPayerIRD(String fstrPayerIRD) {
    this.fstrPayerIRD = fstrPayerIRD;
  }
  public tblnz_rtnipsslineitem with_fstrPayerIRD(String fstrPayerIRD) {
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
  public tblnz_rtnipsslineitem with_fstrPayerName(String fstrPayerName) {
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
  public tblnz_rtnipsslineitem with_fstrPayerAddress1(String fstrPayerAddress1) {
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
  public tblnz_rtnipsslineitem with_fstrPayerAddress2(String fstrPayerAddress2) {
    this.fstrPayerAddress2 = fstrPayerAddress2;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_rtnipsslineitem with_fstrWho(String fstrWho) {
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
  public tblnz_rtnipsslineitem with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnipsslineitem)) {
      return false;
    }
    tblnz_rtnipsslineitem that = (tblnz_rtnipsslineitem) o;
    boolean equal = true;
    equal = equal && (this.fi64LineItemKey == null ? that.fi64LineItemKey == null : this.fi64LineItemKey.equals(that.fi64LineItemKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fdtmPeriod == null ? that.fdtmPeriod == null : this.fdtmPeriod.equals(that.fdtmPeriod));
    equal = equal && (this.fstrRecipientName == null ? that.fstrRecipientName == null : this.fstrRecipientName.equals(that.fstrRecipientName));
    equal = equal && (this.fstrRecipientIRD == null ? that.fstrRecipientIRD == null : this.fstrRecipientIRD.equals(that.fstrRecipientIRD));
    equal = equal && (this.fstrRecipientAddress1 == null ? that.fstrRecipientAddress1 == null : this.fstrRecipientAddress1.equals(that.fstrRecipientAddress1));
    equal = equal && (this.fstrRecipientAddress2 == null ? that.fstrRecipientAddress2 == null : this.fstrRecipientAddress2.equals(that.fstrRecipientAddress2));
    equal = equal && (this.fstrRecipientStatus == null ? that.fstrRecipientStatus == null : this.fstrRecipientStatus.equals(that.fstrRecipientStatus));
    equal = equal && (this.fcurInterestLiable1 == null ? that.fcurInterestLiable1 == null : this.fcurInterestLiable1.equals(that.fcurInterestLiable1));
    equal = equal && (this.fcurInterestLiable2 == null ? that.fcurInterestLiable2 == null : this.fcurInterestLiable2.equals(that.fcurInterestLiable2));
    equal = equal && (this.fcurInterestLiable3 == null ? that.fcurInterestLiable3 == null : this.fcurInterestLiable3.equals(that.fcurInterestLiable3));
    equal = equal && (this.fcurTotalInterestLiable == null ? that.fcurTotalInterestLiable == null : this.fcurTotalInterestLiable.equals(that.fcurTotalInterestLiable));
    equal = equal && (this.fcurRWTDeducted1 == null ? that.fcurRWTDeducted1 == null : this.fcurRWTDeducted1.equals(that.fcurRWTDeducted1));
    equal = equal && (this.fcurRWTDeducted2 == null ? that.fcurRWTDeducted2 == null : this.fcurRWTDeducted2.equals(that.fcurRWTDeducted2));
    equal = equal && (this.fcurRWTDeducted3 == null ? that.fcurRWTDeducted3 == null : this.fcurRWTDeducted3.equals(that.fcurRWTDeducted3));
    equal = equal && (this.fcurTotalRWTDeducted == null ? that.fcurTotalRWTDeducted == null : this.fcurTotalRWTDeducted.equals(that.fcurTotalRWTDeducted));
    equal = equal && (this.fcurRWTRate1 == null ? that.fcurRWTRate1 == null : this.fcurRWTRate1.equals(that.fcurRWTRate1));
    equal = equal && (this.fcurRWTRate2 == null ? that.fcurRWTRate2 == null : this.fcurRWTRate2.equals(that.fcurRWTRate2));
    equal = equal && (this.fcurRWTRate3 == null ? that.fcurRWTRate3 == null : this.fcurRWTRate3.equals(that.fcurRWTRate3));
    equal = equal && (this.fcurRWTRateAverage == null ? that.fcurRWTRateAverage == null : this.fcurRWTRateAverage.equals(that.fcurRWTRateAverage));
    equal = equal && (this.fstrBankAccountID == null ? that.fstrBankAccountID == null : this.fstrBankAccountID.equals(that.fstrBankAccountID));
    equal = equal && (this.fstrBankAccountBranch == null ? that.fstrBankAccountBranch == null : this.fstrBankAccountBranch.equals(that.fstrBankAccountBranch));
    equal = equal && (this.fstrBankAccountNumber == null ? that.fstrBankAccountNumber == null : this.fstrBankAccountNumber.equals(that.fstrBankAccountNumber));
    equal = equal && (this.fstrBankAccountSuffix == null ? that.fstrBankAccountSuffix == null : this.fstrBankAccountSuffix.equals(that.fstrBankAccountSuffix));
    equal = equal && (this.fstrAccountNumber == null ? that.fstrAccountNumber == null : this.fstrAccountNumber.equals(that.fstrAccountNumber));
    equal = equal && (this.fblnJointAccountIndicator == null ? that.fblnJointAccountIndicator == null : this.fblnJointAccountIndicator.equals(that.fblnJointAccountIndicator));
    equal = equal && (this.fstrPayerIRD == null ? that.fstrPayerIRD == null : this.fstrPayerIRD.equals(that.fstrPayerIRD));
    equal = equal && (this.fstrPayerName == null ? that.fstrPayerName == null : this.fstrPayerName.equals(that.fstrPayerName));
    equal = equal && (this.fstrPayerAddress1 == null ? that.fstrPayerAddress1 == null : this.fstrPayerAddress1.equals(that.fstrPayerAddress1));
    equal = equal && (this.fstrPayerAddress2 == null ? that.fstrPayerAddress2 == null : this.fstrPayerAddress2.equals(that.fstrPayerAddress2));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnipsslineitem)) {
      return false;
    }
    tblnz_rtnipsslineitem that = (tblnz_rtnipsslineitem) o;
    boolean equal = true;
    equal = equal && (this.fi64LineItemKey == null ? that.fi64LineItemKey == null : this.fi64LineItemKey.equals(that.fi64LineItemKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fdtmPeriod == null ? that.fdtmPeriod == null : this.fdtmPeriod.equals(that.fdtmPeriod));
    equal = equal && (this.fstrRecipientName == null ? that.fstrRecipientName == null : this.fstrRecipientName.equals(that.fstrRecipientName));
    equal = equal && (this.fstrRecipientIRD == null ? that.fstrRecipientIRD == null : this.fstrRecipientIRD.equals(that.fstrRecipientIRD));
    equal = equal && (this.fstrRecipientAddress1 == null ? that.fstrRecipientAddress1 == null : this.fstrRecipientAddress1.equals(that.fstrRecipientAddress1));
    equal = equal && (this.fstrRecipientAddress2 == null ? that.fstrRecipientAddress2 == null : this.fstrRecipientAddress2.equals(that.fstrRecipientAddress2));
    equal = equal && (this.fstrRecipientStatus == null ? that.fstrRecipientStatus == null : this.fstrRecipientStatus.equals(that.fstrRecipientStatus));
    equal = equal && (this.fcurInterestLiable1 == null ? that.fcurInterestLiable1 == null : this.fcurInterestLiable1.equals(that.fcurInterestLiable1));
    equal = equal && (this.fcurInterestLiable2 == null ? that.fcurInterestLiable2 == null : this.fcurInterestLiable2.equals(that.fcurInterestLiable2));
    equal = equal && (this.fcurInterestLiable3 == null ? that.fcurInterestLiable3 == null : this.fcurInterestLiable3.equals(that.fcurInterestLiable3));
    equal = equal && (this.fcurTotalInterestLiable == null ? that.fcurTotalInterestLiable == null : this.fcurTotalInterestLiable.equals(that.fcurTotalInterestLiable));
    equal = equal && (this.fcurRWTDeducted1 == null ? that.fcurRWTDeducted1 == null : this.fcurRWTDeducted1.equals(that.fcurRWTDeducted1));
    equal = equal && (this.fcurRWTDeducted2 == null ? that.fcurRWTDeducted2 == null : this.fcurRWTDeducted2.equals(that.fcurRWTDeducted2));
    equal = equal && (this.fcurRWTDeducted3 == null ? that.fcurRWTDeducted3 == null : this.fcurRWTDeducted3.equals(that.fcurRWTDeducted3));
    equal = equal && (this.fcurTotalRWTDeducted == null ? that.fcurTotalRWTDeducted == null : this.fcurTotalRWTDeducted.equals(that.fcurTotalRWTDeducted));
    equal = equal && (this.fcurRWTRate1 == null ? that.fcurRWTRate1 == null : this.fcurRWTRate1.equals(that.fcurRWTRate1));
    equal = equal && (this.fcurRWTRate2 == null ? that.fcurRWTRate2 == null : this.fcurRWTRate2.equals(that.fcurRWTRate2));
    equal = equal && (this.fcurRWTRate3 == null ? that.fcurRWTRate3 == null : this.fcurRWTRate3.equals(that.fcurRWTRate3));
    equal = equal && (this.fcurRWTRateAverage == null ? that.fcurRWTRateAverage == null : this.fcurRWTRateAverage.equals(that.fcurRWTRateAverage));
    equal = equal && (this.fstrBankAccountID == null ? that.fstrBankAccountID == null : this.fstrBankAccountID.equals(that.fstrBankAccountID));
    equal = equal && (this.fstrBankAccountBranch == null ? that.fstrBankAccountBranch == null : this.fstrBankAccountBranch.equals(that.fstrBankAccountBranch));
    equal = equal && (this.fstrBankAccountNumber == null ? that.fstrBankAccountNumber == null : this.fstrBankAccountNumber.equals(that.fstrBankAccountNumber));
    equal = equal && (this.fstrBankAccountSuffix == null ? that.fstrBankAccountSuffix == null : this.fstrBankAccountSuffix.equals(that.fstrBankAccountSuffix));
    equal = equal && (this.fstrAccountNumber == null ? that.fstrAccountNumber == null : this.fstrAccountNumber.equals(that.fstrAccountNumber));
    equal = equal && (this.fblnJointAccountIndicator == null ? that.fblnJointAccountIndicator == null : this.fblnJointAccountIndicator.equals(that.fblnJointAccountIndicator));
    equal = equal && (this.fstrPayerIRD == null ? that.fstrPayerIRD == null : this.fstrPayerIRD.equals(that.fstrPayerIRD));
    equal = equal && (this.fstrPayerName == null ? that.fstrPayerName == null : this.fstrPayerName.equals(that.fstrPayerName));
    equal = equal && (this.fstrPayerAddress1 == null ? that.fstrPayerAddress1 == null : this.fstrPayerAddress1.equals(that.fstrPayerAddress1));
    equal = equal && (this.fstrPayerAddress2 == null ? that.fstrPayerAddress2 == null : this.fstrPayerAddress2.equals(that.fstrPayerAddress2));
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
    this.fstrRecipientName = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrRecipientIRD = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrRecipientAddress1 = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrRecipientAddress2 = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrRecipientStatus = JdbcWritableBridge.readString(9, __dbResults);
    this.fcurInterestLiable1 = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurInterestLiable2 = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurInterestLiable3 = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurTotalInterestLiable = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurRWTDeducted1 = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurRWTDeducted2 = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurRWTDeducted3 = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurTotalRWTDeducted = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fcurRWTRate1 = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.fcurRWTRate2 = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fcurRWTRate3 = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.fcurRWTRateAverage = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fstrBankAccountID = JdbcWritableBridge.readString(22, __dbResults);
    this.fstrBankAccountBranch = JdbcWritableBridge.readString(23, __dbResults);
    this.fstrBankAccountNumber = JdbcWritableBridge.readString(24, __dbResults);
    this.fstrBankAccountSuffix = JdbcWritableBridge.readString(25, __dbResults);
    this.fstrAccountNumber = JdbcWritableBridge.readString(26, __dbResults);
    this.fblnJointAccountIndicator = JdbcWritableBridge.readInteger(27, __dbResults);
    this.fstrPayerIRD = JdbcWritableBridge.readString(28, __dbResults);
    this.fstrPayerName = JdbcWritableBridge.readString(29, __dbResults);
    this.fstrPayerAddress1 = JdbcWritableBridge.readString(30, __dbResults);
    this.fstrPayerAddress2 = JdbcWritableBridge.readString(31, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(32, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(33, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.fi64LineItemKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fdtmPeriod = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.fstrRecipientName = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrRecipientIRD = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrRecipientAddress1 = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrRecipientAddress2 = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrRecipientStatus = JdbcWritableBridge.readString(9, __dbResults);
    this.fcurInterestLiable1 = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurInterestLiable2 = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurInterestLiable3 = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurTotalInterestLiable = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurRWTDeducted1 = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurRWTDeducted2 = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurRWTDeducted3 = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurTotalRWTDeducted = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fcurRWTRate1 = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.fcurRWTRate2 = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fcurRWTRate3 = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.fcurRWTRateAverage = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fstrBankAccountID = JdbcWritableBridge.readString(22, __dbResults);
    this.fstrBankAccountBranch = JdbcWritableBridge.readString(23, __dbResults);
    this.fstrBankAccountNumber = JdbcWritableBridge.readString(24, __dbResults);
    this.fstrBankAccountSuffix = JdbcWritableBridge.readString(25, __dbResults);
    this.fstrAccountNumber = JdbcWritableBridge.readString(26, __dbResults);
    this.fblnJointAccountIndicator = JdbcWritableBridge.readInteger(27, __dbResults);
    this.fstrPayerIRD = JdbcWritableBridge.readString(28, __dbResults);
    this.fstrPayerName = JdbcWritableBridge.readString(29, __dbResults);
    this.fstrPayerAddress1 = JdbcWritableBridge.readString(30, __dbResults);
    this.fstrPayerAddress2 = JdbcWritableBridge.readString(31, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(32, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(33, __dbResults);
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
    JdbcWritableBridge.writeString(fstrRecipientName, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientIRD, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientAddress1, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientAddress2, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientStatus, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterestLiable1, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterestLiable2, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterestLiable3, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalInterestLiable, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRWTDeducted1, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRWTDeducted2, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRWTDeducted3, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalRWTDeducted, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRWTRate1, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRWTRate2, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRWTRate3, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRWTRateAverage, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrBankAccountID, 22 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrBankAccountBranch, 23 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrBankAccountNumber, 24 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrBankAccountSuffix, 25 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountNumber, 26 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnJointAccountIndicator, 27 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrPayerIRD, 28 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPayerName, 29 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPayerAddress1, 30 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPayerAddress2, 31 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 32 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 33 + __off, 93, __dbStmt);
    return 33;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(fi64LineItemKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPeriod, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientName, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientIRD, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientAddress1, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientAddress2, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientStatus, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterestLiable1, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterestLiable2, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterestLiable3, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalInterestLiable, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRWTDeducted1, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRWTDeducted2, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRWTDeducted3, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalRWTDeducted, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRWTRate1, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRWTRate2, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRWTRate3, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRWTRateAverage, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrBankAccountID, 22 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrBankAccountBranch, 23 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrBankAccountNumber, 24 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrBankAccountSuffix, 25 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountNumber, 26 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnJointAccountIndicator, 27 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrPayerIRD, 28 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPayerName, 29 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPayerAddress1, 30 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPayerAddress2, 31 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 32 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 33 + __off, 93, __dbStmt);
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
        this.fstrRecipientName = null;
    } else {
    this.fstrRecipientName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRecipientIRD = null;
    } else {
    this.fstrRecipientIRD = Text.readString(__dataIn);
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
        this.fstrRecipientStatus = null;
    } else {
    this.fstrRecipientStatus = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurInterestLiable1 = null;
    } else {
    this.fcurInterestLiable1 = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurInterestLiable2 = null;
    } else {
    this.fcurInterestLiable2 = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurInterestLiable3 = null;
    } else {
    this.fcurInterestLiable3 = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalInterestLiable = null;
    } else {
    this.fcurTotalInterestLiable = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRWTDeducted1 = null;
    } else {
    this.fcurRWTDeducted1 = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRWTDeducted2 = null;
    } else {
    this.fcurRWTDeducted2 = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRWTDeducted3 = null;
    } else {
    this.fcurRWTDeducted3 = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalRWTDeducted = null;
    } else {
    this.fcurTotalRWTDeducted = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRWTRate1 = null;
    } else {
    this.fcurRWTRate1 = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRWTRate2 = null;
    } else {
    this.fcurRWTRate2 = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRWTRate3 = null;
    } else {
    this.fcurRWTRate3 = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRWTRateAverage = null;
    } else {
    this.fcurRWTRateAverage = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrBankAccountID = null;
    } else {
    this.fstrBankAccountID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrBankAccountBranch = null;
    } else {
    this.fstrBankAccountBranch = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrBankAccountNumber = null;
    } else {
    this.fstrBankAccountNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrBankAccountSuffix = null;
    } else {
    this.fstrBankAccountSuffix = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAccountNumber = null;
    } else {
    this.fstrAccountNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnJointAccountIndicator = null;
    } else {
    this.fblnJointAccountIndicator = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.fstrRecipientName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientName);
    }
    if (null == this.fstrRecipientIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientIRD);
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
    if (null == this.fstrRecipientStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientStatus);
    }
    if (null == this.fcurInterestLiable1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInterestLiable1, __dataOut);
    }
    if (null == this.fcurInterestLiable2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInterestLiable2, __dataOut);
    }
    if (null == this.fcurInterestLiable3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInterestLiable3, __dataOut);
    }
    if (null == this.fcurTotalInterestLiable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalInterestLiable, __dataOut);
    }
    if (null == this.fcurRWTDeducted1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRWTDeducted1, __dataOut);
    }
    if (null == this.fcurRWTDeducted2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRWTDeducted2, __dataOut);
    }
    if (null == this.fcurRWTDeducted3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRWTDeducted3, __dataOut);
    }
    if (null == this.fcurTotalRWTDeducted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalRWTDeducted, __dataOut);
    }
    if (null == this.fcurRWTRate1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRWTRate1, __dataOut);
    }
    if (null == this.fcurRWTRate2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRWTRate2, __dataOut);
    }
    if (null == this.fcurRWTRate3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRWTRate3, __dataOut);
    }
    if (null == this.fcurRWTRateAverage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRWTRateAverage, __dataOut);
    }
    if (null == this.fstrBankAccountID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBankAccountID);
    }
    if (null == this.fstrBankAccountBranch) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBankAccountBranch);
    }
    if (null == this.fstrBankAccountNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBankAccountNumber);
    }
    if (null == this.fstrBankAccountSuffix) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBankAccountSuffix);
    }
    if (null == this.fstrAccountNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAccountNumber);
    }
    if (null == this.fblnJointAccountIndicator) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnJointAccountIndicator);
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
    if (null == this.fstrRecipientName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientName);
    }
    if (null == this.fstrRecipientIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientIRD);
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
    if (null == this.fstrRecipientStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientStatus);
    }
    if (null == this.fcurInterestLiable1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInterestLiable1, __dataOut);
    }
    if (null == this.fcurInterestLiable2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInterestLiable2, __dataOut);
    }
    if (null == this.fcurInterestLiable3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInterestLiable3, __dataOut);
    }
    if (null == this.fcurTotalInterestLiable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalInterestLiable, __dataOut);
    }
    if (null == this.fcurRWTDeducted1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRWTDeducted1, __dataOut);
    }
    if (null == this.fcurRWTDeducted2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRWTDeducted2, __dataOut);
    }
    if (null == this.fcurRWTDeducted3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRWTDeducted3, __dataOut);
    }
    if (null == this.fcurTotalRWTDeducted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalRWTDeducted, __dataOut);
    }
    if (null == this.fcurRWTRate1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRWTRate1, __dataOut);
    }
    if (null == this.fcurRWTRate2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRWTRate2, __dataOut);
    }
    if (null == this.fcurRWTRate3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRWTRate3, __dataOut);
    }
    if (null == this.fcurRWTRateAverage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRWTRateAverage, __dataOut);
    }
    if (null == this.fstrBankAccountID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBankAccountID);
    }
    if (null == this.fstrBankAccountBranch) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBankAccountBranch);
    }
    if (null == this.fstrBankAccountNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBankAccountNumber);
    }
    if (null == this.fstrBankAccountSuffix) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBankAccountSuffix);
    }
    if (null == this.fstrAccountNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAccountNumber);
    }
    if (null == this.fblnJointAccountIndicator) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnJointAccountIndicator);
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
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientName==null?"\\N":fstrRecipientName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientIRD==null?"\\N":fstrRecipientIRD, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientAddress1==null?"\\N":fstrRecipientAddress1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientAddress2==null?"\\N":fstrRecipientAddress2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientStatus==null?"\\N":fstrRecipientStatus, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterestLiable1==null?"\\N":fcurInterestLiable1.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterestLiable2==null?"\\N":fcurInterestLiable2.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterestLiable3==null?"\\N":fcurInterestLiable3.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalInterestLiable==null?"\\N":fcurTotalInterestLiable.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRWTDeducted1==null?"\\N":fcurRWTDeducted1.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRWTDeducted2==null?"\\N":fcurRWTDeducted2.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRWTDeducted3==null?"\\N":fcurRWTDeducted3.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalRWTDeducted==null?"\\N":fcurTotalRWTDeducted.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRWTRate1==null?"\\N":fcurRWTRate1.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRWTRate2==null?"\\N":fcurRWTRate2.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRWTRate3==null?"\\N":fcurRWTRate3.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRWTRateAverage==null?"\\N":fcurRWTRateAverage.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBankAccountID==null?"\\N":fstrBankAccountID, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBankAccountBranch==null?"\\N":fstrBankAccountBranch, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBankAccountNumber==null?"\\N":fstrBankAccountNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBankAccountSuffix==null?"\\N":fstrBankAccountSuffix, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAccountNumber==null?"\\N":fstrAccountNumber, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnJointAccountIndicator==null?"\\N":"" + fblnJointAccountIndicator, delimiters));
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
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientName==null?"\\N":fstrRecipientName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientIRD==null?"\\N":fstrRecipientIRD, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientAddress1==null?"\\N":fstrRecipientAddress1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientAddress2==null?"\\N":fstrRecipientAddress2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientStatus==null?"\\N":fstrRecipientStatus, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterestLiable1==null?"\\N":fcurInterestLiable1.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterestLiable2==null?"\\N":fcurInterestLiable2.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterestLiable3==null?"\\N":fcurInterestLiable3.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalInterestLiable==null?"\\N":fcurTotalInterestLiable.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRWTDeducted1==null?"\\N":fcurRWTDeducted1.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRWTDeducted2==null?"\\N":fcurRWTDeducted2.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRWTDeducted3==null?"\\N":fcurRWTDeducted3.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalRWTDeducted==null?"\\N":fcurTotalRWTDeducted.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRWTRate1==null?"\\N":fcurRWTRate1.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRWTRate2==null?"\\N":fcurRWTRate2.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRWTRate3==null?"\\N":fcurRWTRate3.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRWTRateAverage==null?"\\N":fcurRWTRateAverage.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBankAccountID==null?"\\N":fstrBankAccountID, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBankAccountBranch==null?"\\N":fstrBankAccountBranch, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBankAccountNumber==null?"\\N":fstrBankAccountNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBankAccountSuffix==null?"\\N":fstrBankAccountSuffix, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAccountNumber==null?"\\N":fstrAccountNumber, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnJointAccountIndicator==null?"\\N":"" + fblnJointAccountIndicator, delimiters));
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
    if (__cur_str.equals("null")) { this.fstrRecipientName = null; } else {
      this.fstrRecipientName = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrRecipientStatus = null; } else {
      this.fstrRecipientStatus = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInterestLiable1 = null; } else {
      this.fcurInterestLiable1 = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInterestLiable2 = null; } else {
      this.fcurInterestLiable2 = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInterestLiable3 = null; } else {
      this.fcurInterestLiable3 = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalInterestLiable = null; } else {
      this.fcurTotalInterestLiable = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRWTDeducted1 = null; } else {
      this.fcurRWTDeducted1 = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRWTDeducted2 = null; } else {
      this.fcurRWTDeducted2 = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRWTDeducted3 = null; } else {
      this.fcurRWTDeducted3 = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalRWTDeducted = null; } else {
      this.fcurTotalRWTDeducted = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRWTRate1 = null; } else {
      this.fcurRWTRate1 = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRWTRate2 = null; } else {
      this.fcurRWTRate2 = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRWTRate3 = null; } else {
      this.fcurRWTRate3 = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRWTRateAverage = null; } else {
      this.fcurRWTRateAverage = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrBankAccountID = null; } else {
      this.fstrBankAccountID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrBankAccountBranch = null; } else {
      this.fstrBankAccountBranch = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrBankAccountSuffix = null; } else {
      this.fstrBankAccountSuffix = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAccountNumber = null; } else {
      this.fstrAccountNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnJointAccountIndicator = null; } else {
      this.fblnJointAccountIndicator = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrRecipientName = null; } else {
      this.fstrRecipientName = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrRecipientStatus = null; } else {
      this.fstrRecipientStatus = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInterestLiable1 = null; } else {
      this.fcurInterestLiable1 = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInterestLiable2 = null; } else {
      this.fcurInterestLiable2 = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInterestLiable3 = null; } else {
      this.fcurInterestLiable3 = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalInterestLiable = null; } else {
      this.fcurTotalInterestLiable = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRWTDeducted1 = null; } else {
      this.fcurRWTDeducted1 = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRWTDeducted2 = null; } else {
      this.fcurRWTDeducted2 = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRWTDeducted3 = null; } else {
      this.fcurRWTDeducted3 = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalRWTDeducted = null; } else {
      this.fcurTotalRWTDeducted = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRWTRate1 = null; } else {
      this.fcurRWTRate1 = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRWTRate2 = null; } else {
      this.fcurRWTRate2 = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRWTRate3 = null; } else {
      this.fcurRWTRate3 = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRWTRateAverage = null; } else {
      this.fcurRWTRateAverage = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrBankAccountID = null; } else {
      this.fstrBankAccountID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrBankAccountBranch = null; } else {
      this.fstrBankAccountBranch = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrBankAccountSuffix = null; } else {
      this.fstrBankAccountSuffix = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAccountNumber = null; } else {
      this.fstrAccountNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnJointAccountIndicator = null; } else {
      this.fblnJointAccountIndicator = Integer.valueOf(__cur_str);
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
    tblnz_rtnipsslineitem o = (tblnz_rtnipsslineitem) super.clone();
    o.fdtmPeriod = (o.fdtmPeriod != null) ? (java.sql.Timestamp) o.fdtmPeriod.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_rtnipsslineitem o) throws CloneNotSupportedException {
    o.fdtmPeriod = (o.fdtmPeriod != null) ? (java.sql.Timestamp) o.fdtmPeriod.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("fi64LineItemKey", this.fi64LineItemKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fdtmPeriod", this.fdtmPeriod);
    __sqoop$field_map.put("fstrRecipientName", this.fstrRecipientName);
    __sqoop$field_map.put("fstrRecipientIRD", this.fstrRecipientIRD);
    __sqoop$field_map.put("fstrRecipientAddress1", this.fstrRecipientAddress1);
    __sqoop$field_map.put("fstrRecipientAddress2", this.fstrRecipientAddress2);
    __sqoop$field_map.put("fstrRecipientStatus", this.fstrRecipientStatus);
    __sqoop$field_map.put("fcurInterestLiable1", this.fcurInterestLiable1);
    __sqoop$field_map.put("fcurInterestLiable2", this.fcurInterestLiable2);
    __sqoop$field_map.put("fcurInterestLiable3", this.fcurInterestLiable3);
    __sqoop$field_map.put("fcurTotalInterestLiable", this.fcurTotalInterestLiable);
    __sqoop$field_map.put("fcurRWTDeducted1", this.fcurRWTDeducted1);
    __sqoop$field_map.put("fcurRWTDeducted2", this.fcurRWTDeducted2);
    __sqoop$field_map.put("fcurRWTDeducted3", this.fcurRWTDeducted3);
    __sqoop$field_map.put("fcurTotalRWTDeducted", this.fcurTotalRWTDeducted);
    __sqoop$field_map.put("fcurRWTRate1", this.fcurRWTRate1);
    __sqoop$field_map.put("fcurRWTRate2", this.fcurRWTRate2);
    __sqoop$field_map.put("fcurRWTRate3", this.fcurRWTRate3);
    __sqoop$field_map.put("fcurRWTRateAverage", this.fcurRWTRateAverage);
    __sqoop$field_map.put("fstrBankAccountID", this.fstrBankAccountID);
    __sqoop$field_map.put("fstrBankAccountBranch", this.fstrBankAccountBranch);
    __sqoop$field_map.put("fstrBankAccountNumber", this.fstrBankAccountNumber);
    __sqoop$field_map.put("fstrBankAccountSuffix", this.fstrBankAccountSuffix);
    __sqoop$field_map.put("fstrAccountNumber", this.fstrAccountNumber);
    __sqoop$field_map.put("fblnJointAccountIndicator", this.fblnJointAccountIndicator);
    __sqoop$field_map.put("fstrPayerIRD", this.fstrPayerIRD);
    __sqoop$field_map.put("fstrPayerName", this.fstrPayerName);
    __sqoop$field_map.put("fstrPayerAddress1", this.fstrPayerAddress1);
    __sqoop$field_map.put("fstrPayerAddress2", this.fstrPayerAddress2);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("fi64LineItemKey", this.fi64LineItemKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fdtmPeriod", this.fdtmPeriod);
    __sqoop$field_map.put("fstrRecipientName", this.fstrRecipientName);
    __sqoop$field_map.put("fstrRecipientIRD", this.fstrRecipientIRD);
    __sqoop$field_map.put("fstrRecipientAddress1", this.fstrRecipientAddress1);
    __sqoop$field_map.put("fstrRecipientAddress2", this.fstrRecipientAddress2);
    __sqoop$field_map.put("fstrRecipientStatus", this.fstrRecipientStatus);
    __sqoop$field_map.put("fcurInterestLiable1", this.fcurInterestLiable1);
    __sqoop$field_map.put("fcurInterestLiable2", this.fcurInterestLiable2);
    __sqoop$field_map.put("fcurInterestLiable3", this.fcurInterestLiable3);
    __sqoop$field_map.put("fcurTotalInterestLiable", this.fcurTotalInterestLiable);
    __sqoop$field_map.put("fcurRWTDeducted1", this.fcurRWTDeducted1);
    __sqoop$field_map.put("fcurRWTDeducted2", this.fcurRWTDeducted2);
    __sqoop$field_map.put("fcurRWTDeducted3", this.fcurRWTDeducted3);
    __sqoop$field_map.put("fcurTotalRWTDeducted", this.fcurTotalRWTDeducted);
    __sqoop$field_map.put("fcurRWTRate1", this.fcurRWTRate1);
    __sqoop$field_map.put("fcurRWTRate2", this.fcurRWTRate2);
    __sqoop$field_map.put("fcurRWTRate3", this.fcurRWTRate3);
    __sqoop$field_map.put("fcurRWTRateAverage", this.fcurRWTRateAverage);
    __sqoop$field_map.put("fstrBankAccountID", this.fstrBankAccountID);
    __sqoop$field_map.put("fstrBankAccountBranch", this.fstrBankAccountBranch);
    __sqoop$field_map.put("fstrBankAccountNumber", this.fstrBankAccountNumber);
    __sqoop$field_map.put("fstrBankAccountSuffix", this.fstrBankAccountSuffix);
    __sqoop$field_map.put("fstrAccountNumber", this.fstrAccountNumber);
    __sqoop$field_map.put("fblnJointAccountIndicator", this.fblnJointAccountIndicator);
    __sqoop$field_map.put("fstrPayerIRD", this.fstrPayerIRD);
    __sqoop$field_map.put("fstrPayerName", this.fstrPayerName);
    __sqoop$field_map.put("fstrPayerAddress1", this.fstrPayerAddress1);
    __sqoop$field_map.put("fstrPayerAddress2", this.fstrPayerAddress2);
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
