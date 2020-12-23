// ORM class for table 'tblnz_rtnfifinc'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 06:50:06 NZDT 2020
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

public class tblnz_rtnfifinc extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfifinc.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fintSeq", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfifinc.this.fintSeq = (Integer)value;
      }
    });
    setters.put("fstrName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfifinc.this.fstrName = (String)value;
      }
    });
    setters.put("fdtmBalanceDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfifinc.this.fdtmBalanceDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrPrimaryActivity", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfifinc.this.fstrPrimaryActivity = (String)value;
      }
    });
    setters.put("fstrPrimaryActivityOther", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfifinc.this.fstrPrimaryActivityOther = (String)value;
      }
    });
    setters.put("fstrJurisdiction", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfifinc.this.fstrJurisdiction = (String)value;
      }
    });
    setters.put("fstrJurisdictionOther", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfifinc.this.fstrJurisdictionOther = (String)value;
      }
    });
    setters.put("fstrCurrency", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfifinc.this.fstrCurrency = (String)value;
      }
    });
    setters.put("fstrCurrencyOther", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfifinc.this.fstrCurrencyOther = (String)value;
      }
    });
    setters.put("fstrFifEx35", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfifinc.this.fstrFifEx35 = (String)value;
      }
    });
    setters.put("fstrFifEntity", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfifinc.this.fstrFifEntity = (String)value;
      }
    });
    setters.put("fcurIncomeInterest", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfifinc.this.fcurIncomeInterest = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAttributedIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfifinc.this.fcurAttributedIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurIncomeAfterLoss", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfifinc.this.fcurIncomeAfterLoss = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurCreditsEarned", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfifinc.this.fcurCreditsEarned = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurCreditsUsed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfifinc.this.fcurCreditsUsed = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfifinc.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfifinc.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_rtnfifinc() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_rtnfifinc with_flngDocKey(Integer flngDocKey) {
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
  public tblnz_rtnfifinc with_fintSeq(Integer fintSeq) {
    this.fintSeq = fintSeq;
    return this;
  }
  private String fstrName;
  public String get_fstrName() {
    return fstrName;
  }
  public void set_fstrName(String fstrName) {
    this.fstrName = fstrName;
  }
  public tblnz_rtnfifinc with_fstrName(String fstrName) {
    this.fstrName = fstrName;
    return this;
  }
  private java.sql.Timestamp fdtmBalanceDate;
  public java.sql.Timestamp get_fdtmBalanceDate() {
    return fdtmBalanceDate;
  }
  public void set_fdtmBalanceDate(java.sql.Timestamp fdtmBalanceDate) {
    this.fdtmBalanceDate = fdtmBalanceDate;
  }
  public tblnz_rtnfifinc with_fdtmBalanceDate(java.sql.Timestamp fdtmBalanceDate) {
    this.fdtmBalanceDate = fdtmBalanceDate;
    return this;
  }
  private String fstrPrimaryActivity;
  public String get_fstrPrimaryActivity() {
    return fstrPrimaryActivity;
  }
  public void set_fstrPrimaryActivity(String fstrPrimaryActivity) {
    this.fstrPrimaryActivity = fstrPrimaryActivity;
  }
  public tblnz_rtnfifinc with_fstrPrimaryActivity(String fstrPrimaryActivity) {
    this.fstrPrimaryActivity = fstrPrimaryActivity;
    return this;
  }
  private String fstrPrimaryActivityOther;
  public String get_fstrPrimaryActivityOther() {
    return fstrPrimaryActivityOther;
  }
  public void set_fstrPrimaryActivityOther(String fstrPrimaryActivityOther) {
    this.fstrPrimaryActivityOther = fstrPrimaryActivityOther;
  }
  public tblnz_rtnfifinc with_fstrPrimaryActivityOther(String fstrPrimaryActivityOther) {
    this.fstrPrimaryActivityOther = fstrPrimaryActivityOther;
    return this;
  }
  private String fstrJurisdiction;
  public String get_fstrJurisdiction() {
    return fstrJurisdiction;
  }
  public void set_fstrJurisdiction(String fstrJurisdiction) {
    this.fstrJurisdiction = fstrJurisdiction;
  }
  public tblnz_rtnfifinc with_fstrJurisdiction(String fstrJurisdiction) {
    this.fstrJurisdiction = fstrJurisdiction;
    return this;
  }
  private String fstrJurisdictionOther;
  public String get_fstrJurisdictionOther() {
    return fstrJurisdictionOther;
  }
  public void set_fstrJurisdictionOther(String fstrJurisdictionOther) {
    this.fstrJurisdictionOther = fstrJurisdictionOther;
  }
  public tblnz_rtnfifinc with_fstrJurisdictionOther(String fstrJurisdictionOther) {
    this.fstrJurisdictionOther = fstrJurisdictionOther;
    return this;
  }
  private String fstrCurrency;
  public String get_fstrCurrency() {
    return fstrCurrency;
  }
  public void set_fstrCurrency(String fstrCurrency) {
    this.fstrCurrency = fstrCurrency;
  }
  public tblnz_rtnfifinc with_fstrCurrency(String fstrCurrency) {
    this.fstrCurrency = fstrCurrency;
    return this;
  }
  private String fstrCurrencyOther;
  public String get_fstrCurrencyOther() {
    return fstrCurrencyOther;
  }
  public void set_fstrCurrencyOther(String fstrCurrencyOther) {
    this.fstrCurrencyOther = fstrCurrencyOther;
  }
  public tblnz_rtnfifinc with_fstrCurrencyOther(String fstrCurrencyOther) {
    this.fstrCurrencyOther = fstrCurrencyOther;
    return this;
  }
  private String fstrFifEx35;
  public String get_fstrFifEx35() {
    return fstrFifEx35;
  }
  public void set_fstrFifEx35(String fstrFifEx35) {
    this.fstrFifEx35 = fstrFifEx35;
  }
  public tblnz_rtnfifinc with_fstrFifEx35(String fstrFifEx35) {
    this.fstrFifEx35 = fstrFifEx35;
    return this;
  }
  private String fstrFifEntity;
  public String get_fstrFifEntity() {
    return fstrFifEntity;
  }
  public void set_fstrFifEntity(String fstrFifEntity) {
    this.fstrFifEntity = fstrFifEntity;
  }
  public tblnz_rtnfifinc with_fstrFifEntity(String fstrFifEntity) {
    this.fstrFifEntity = fstrFifEntity;
    return this;
  }
  private java.math.BigDecimal fcurIncomeInterest;
  public java.math.BigDecimal get_fcurIncomeInterest() {
    return fcurIncomeInterest;
  }
  public void set_fcurIncomeInterest(java.math.BigDecimal fcurIncomeInterest) {
    this.fcurIncomeInterest = fcurIncomeInterest;
  }
  public tblnz_rtnfifinc with_fcurIncomeInterest(java.math.BigDecimal fcurIncomeInterest) {
    this.fcurIncomeInterest = fcurIncomeInterest;
    return this;
  }
  private java.math.BigDecimal fcurAttributedIncome;
  public java.math.BigDecimal get_fcurAttributedIncome() {
    return fcurAttributedIncome;
  }
  public void set_fcurAttributedIncome(java.math.BigDecimal fcurAttributedIncome) {
    this.fcurAttributedIncome = fcurAttributedIncome;
  }
  public tblnz_rtnfifinc with_fcurAttributedIncome(java.math.BigDecimal fcurAttributedIncome) {
    this.fcurAttributedIncome = fcurAttributedIncome;
    return this;
  }
  private java.math.BigDecimal fcurIncomeAfterLoss;
  public java.math.BigDecimal get_fcurIncomeAfterLoss() {
    return fcurIncomeAfterLoss;
  }
  public void set_fcurIncomeAfterLoss(java.math.BigDecimal fcurIncomeAfterLoss) {
    this.fcurIncomeAfterLoss = fcurIncomeAfterLoss;
  }
  public tblnz_rtnfifinc with_fcurIncomeAfterLoss(java.math.BigDecimal fcurIncomeAfterLoss) {
    this.fcurIncomeAfterLoss = fcurIncomeAfterLoss;
    return this;
  }
  private java.math.BigDecimal fcurCreditsEarned;
  public java.math.BigDecimal get_fcurCreditsEarned() {
    return fcurCreditsEarned;
  }
  public void set_fcurCreditsEarned(java.math.BigDecimal fcurCreditsEarned) {
    this.fcurCreditsEarned = fcurCreditsEarned;
  }
  public tblnz_rtnfifinc with_fcurCreditsEarned(java.math.BigDecimal fcurCreditsEarned) {
    this.fcurCreditsEarned = fcurCreditsEarned;
    return this;
  }
  private java.math.BigDecimal fcurCreditsUsed;
  public java.math.BigDecimal get_fcurCreditsUsed() {
    return fcurCreditsUsed;
  }
  public void set_fcurCreditsUsed(java.math.BigDecimal fcurCreditsUsed) {
    this.fcurCreditsUsed = fcurCreditsUsed;
  }
  public tblnz_rtnfifinc with_fcurCreditsUsed(java.math.BigDecimal fcurCreditsUsed) {
    this.fcurCreditsUsed = fcurCreditsUsed;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_rtnfifinc with_fstrWho(String fstrWho) {
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
  public tblnz_rtnfifinc with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnfifinc)) {
      return false;
    }
    tblnz_rtnfifinc that = (tblnz_rtnfifinc) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fintSeq == null ? that.fintSeq == null : this.fintSeq.equals(that.fintSeq));
    equal = equal && (this.fstrName == null ? that.fstrName == null : this.fstrName.equals(that.fstrName));
    equal = equal && (this.fdtmBalanceDate == null ? that.fdtmBalanceDate == null : this.fdtmBalanceDate.equals(that.fdtmBalanceDate));
    equal = equal && (this.fstrPrimaryActivity == null ? that.fstrPrimaryActivity == null : this.fstrPrimaryActivity.equals(that.fstrPrimaryActivity));
    equal = equal && (this.fstrPrimaryActivityOther == null ? that.fstrPrimaryActivityOther == null : this.fstrPrimaryActivityOther.equals(that.fstrPrimaryActivityOther));
    equal = equal && (this.fstrJurisdiction == null ? that.fstrJurisdiction == null : this.fstrJurisdiction.equals(that.fstrJurisdiction));
    equal = equal && (this.fstrJurisdictionOther == null ? that.fstrJurisdictionOther == null : this.fstrJurisdictionOther.equals(that.fstrJurisdictionOther));
    equal = equal && (this.fstrCurrency == null ? that.fstrCurrency == null : this.fstrCurrency.equals(that.fstrCurrency));
    equal = equal && (this.fstrCurrencyOther == null ? that.fstrCurrencyOther == null : this.fstrCurrencyOther.equals(that.fstrCurrencyOther));
    equal = equal && (this.fstrFifEx35 == null ? that.fstrFifEx35 == null : this.fstrFifEx35.equals(that.fstrFifEx35));
    equal = equal && (this.fstrFifEntity == null ? that.fstrFifEntity == null : this.fstrFifEntity.equals(that.fstrFifEntity));
    equal = equal && (this.fcurIncomeInterest == null ? that.fcurIncomeInterest == null : this.fcurIncomeInterest.equals(that.fcurIncomeInterest));
    equal = equal && (this.fcurAttributedIncome == null ? that.fcurAttributedIncome == null : this.fcurAttributedIncome.equals(that.fcurAttributedIncome));
    equal = equal && (this.fcurIncomeAfterLoss == null ? that.fcurIncomeAfterLoss == null : this.fcurIncomeAfterLoss.equals(that.fcurIncomeAfterLoss));
    equal = equal && (this.fcurCreditsEarned == null ? that.fcurCreditsEarned == null : this.fcurCreditsEarned.equals(that.fcurCreditsEarned));
    equal = equal && (this.fcurCreditsUsed == null ? that.fcurCreditsUsed == null : this.fcurCreditsUsed.equals(that.fcurCreditsUsed));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnfifinc)) {
      return false;
    }
    tblnz_rtnfifinc that = (tblnz_rtnfifinc) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fintSeq == null ? that.fintSeq == null : this.fintSeq.equals(that.fintSeq));
    equal = equal && (this.fstrName == null ? that.fstrName == null : this.fstrName.equals(that.fstrName));
    equal = equal && (this.fdtmBalanceDate == null ? that.fdtmBalanceDate == null : this.fdtmBalanceDate.equals(that.fdtmBalanceDate));
    equal = equal && (this.fstrPrimaryActivity == null ? that.fstrPrimaryActivity == null : this.fstrPrimaryActivity.equals(that.fstrPrimaryActivity));
    equal = equal && (this.fstrPrimaryActivityOther == null ? that.fstrPrimaryActivityOther == null : this.fstrPrimaryActivityOther.equals(that.fstrPrimaryActivityOther));
    equal = equal && (this.fstrJurisdiction == null ? that.fstrJurisdiction == null : this.fstrJurisdiction.equals(that.fstrJurisdiction));
    equal = equal && (this.fstrJurisdictionOther == null ? that.fstrJurisdictionOther == null : this.fstrJurisdictionOther.equals(that.fstrJurisdictionOther));
    equal = equal && (this.fstrCurrency == null ? that.fstrCurrency == null : this.fstrCurrency.equals(that.fstrCurrency));
    equal = equal && (this.fstrCurrencyOther == null ? that.fstrCurrencyOther == null : this.fstrCurrencyOther.equals(that.fstrCurrencyOther));
    equal = equal && (this.fstrFifEx35 == null ? that.fstrFifEx35 == null : this.fstrFifEx35.equals(that.fstrFifEx35));
    equal = equal && (this.fstrFifEntity == null ? that.fstrFifEntity == null : this.fstrFifEntity.equals(that.fstrFifEntity));
    equal = equal && (this.fcurIncomeInterest == null ? that.fcurIncomeInterest == null : this.fcurIncomeInterest.equals(that.fcurIncomeInterest));
    equal = equal && (this.fcurAttributedIncome == null ? that.fcurAttributedIncome == null : this.fcurAttributedIncome.equals(that.fcurAttributedIncome));
    equal = equal && (this.fcurIncomeAfterLoss == null ? that.fcurIncomeAfterLoss == null : this.fcurIncomeAfterLoss.equals(that.fcurIncomeAfterLoss));
    equal = equal && (this.fcurCreditsEarned == null ? that.fcurCreditsEarned == null : this.fcurCreditsEarned.equals(that.fcurCreditsEarned));
    equal = equal && (this.fcurCreditsUsed == null ? that.fcurCreditsUsed == null : this.fcurCreditsUsed.equals(that.fcurCreditsUsed));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fintSeq = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fstrName = JdbcWritableBridge.readString(3, __dbResults);
    this.fdtmBalanceDate = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.fstrPrimaryActivity = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrPrimaryActivityOther = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrJurisdiction = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrJurisdictionOther = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrCurrency = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrCurrencyOther = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrFifEx35 = JdbcWritableBridge.readString(11, __dbResults);
    this.fstrFifEntity = JdbcWritableBridge.readString(12, __dbResults);
    this.fcurIncomeInterest = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurAttributedIncome = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurIncomeAfterLoss = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurCreditsEarned = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurCreditsUsed = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(18, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(19, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fintSeq = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fstrName = JdbcWritableBridge.readString(3, __dbResults);
    this.fdtmBalanceDate = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.fstrPrimaryActivity = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrPrimaryActivityOther = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrJurisdiction = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrJurisdictionOther = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrCurrency = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrCurrencyOther = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrFifEx35 = JdbcWritableBridge.readString(11, __dbResults);
    this.fstrFifEntity = JdbcWritableBridge.readString(12, __dbResults);
    this.fcurIncomeInterest = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurAttributedIncome = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurIncomeAfterLoss = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurCreditsEarned = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurCreditsUsed = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(18, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(19, __dbResults);
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
    JdbcWritableBridge.writeString(fstrName, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmBalanceDate, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrPrimaryActivity, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPrimaryActivityOther, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrJurisdiction, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrJurisdictionOther, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCurrency, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCurrencyOther, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFifEx35, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFifEntity, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurIncomeInterest, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAttributedIncome, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurIncomeAfterLoss, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCreditsEarned, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCreditsUsed, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 19 + __off, 93, __dbStmt);
    return 19;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintSeq, 2 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrName, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmBalanceDate, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrPrimaryActivity, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPrimaryActivityOther, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrJurisdiction, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrJurisdictionOther, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCurrency, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCurrencyOther, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFifEx35, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFifEntity, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurIncomeInterest, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAttributedIncome, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurIncomeAfterLoss, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCreditsEarned, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCreditsUsed, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 19 + __off, 93, __dbStmt);
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
        this.fstrName = null;
    } else {
    this.fstrName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmBalanceDate = null;
    } else {
    this.fdtmBalanceDate = new Timestamp(__dataIn.readLong());
    this.fdtmBalanceDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPrimaryActivity = null;
    } else {
    this.fstrPrimaryActivity = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPrimaryActivityOther = null;
    } else {
    this.fstrPrimaryActivityOther = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrJurisdiction = null;
    } else {
    this.fstrJurisdiction = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrJurisdictionOther = null;
    } else {
    this.fstrJurisdictionOther = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCurrency = null;
    } else {
    this.fstrCurrency = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCurrencyOther = null;
    } else {
    this.fstrCurrencyOther = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrFifEx35 = null;
    } else {
    this.fstrFifEx35 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrFifEntity = null;
    } else {
    this.fstrFifEntity = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurIncomeInterest = null;
    } else {
    this.fcurIncomeInterest = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAttributedIncome = null;
    } else {
    this.fcurAttributedIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurIncomeAfterLoss = null;
    } else {
    this.fcurIncomeAfterLoss = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurCreditsEarned = null;
    } else {
    this.fcurCreditsEarned = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurCreditsUsed = null;
    } else {
    this.fcurCreditsUsed = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.fstrName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrName);
    }
    if (null == this.fdtmBalanceDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmBalanceDate.getTime());
    __dataOut.writeInt(this.fdtmBalanceDate.getNanos());
    }
    if (null == this.fstrPrimaryActivity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPrimaryActivity);
    }
    if (null == this.fstrPrimaryActivityOther) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPrimaryActivityOther);
    }
    if (null == this.fstrJurisdiction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrJurisdiction);
    }
    if (null == this.fstrJurisdictionOther) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrJurisdictionOther);
    }
    if (null == this.fstrCurrency) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCurrency);
    }
    if (null == this.fstrCurrencyOther) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCurrencyOther);
    }
    if (null == this.fstrFifEx35) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFifEx35);
    }
    if (null == this.fstrFifEntity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFifEntity);
    }
    if (null == this.fcurIncomeInterest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurIncomeInterest, __dataOut);
    }
    if (null == this.fcurAttributedIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAttributedIncome, __dataOut);
    }
    if (null == this.fcurIncomeAfterLoss) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurIncomeAfterLoss, __dataOut);
    }
    if (null == this.fcurCreditsEarned) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCreditsEarned, __dataOut);
    }
    if (null == this.fcurCreditsUsed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCreditsUsed, __dataOut);
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
    if (null == this.fstrName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrName);
    }
    if (null == this.fdtmBalanceDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmBalanceDate.getTime());
    __dataOut.writeInt(this.fdtmBalanceDate.getNanos());
    }
    if (null == this.fstrPrimaryActivity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPrimaryActivity);
    }
    if (null == this.fstrPrimaryActivityOther) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPrimaryActivityOther);
    }
    if (null == this.fstrJurisdiction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrJurisdiction);
    }
    if (null == this.fstrJurisdictionOther) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrJurisdictionOther);
    }
    if (null == this.fstrCurrency) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCurrency);
    }
    if (null == this.fstrCurrencyOther) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCurrencyOther);
    }
    if (null == this.fstrFifEx35) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFifEx35);
    }
    if (null == this.fstrFifEntity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFifEntity);
    }
    if (null == this.fcurIncomeInterest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurIncomeInterest, __dataOut);
    }
    if (null == this.fcurAttributedIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAttributedIncome, __dataOut);
    }
    if (null == this.fcurIncomeAfterLoss) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurIncomeAfterLoss, __dataOut);
    }
    if (null == this.fcurCreditsEarned) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCreditsEarned, __dataOut);
    }
    if (null == this.fcurCreditsUsed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCreditsUsed, __dataOut);
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
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrName==null?"\\N":fstrName, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmBalanceDate==null?"\\N":"" + fdtmBalanceDate, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPrimaryActivity==null?"\\N":fstrPrimaryActivity, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPrimaryActivityOther==null?"\\N":fstrPrimaryActivityOther, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrJurisdiction==null?"\\N":fstrJurisdiction, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrJurisdictionOther==null?"\\N":fstrJurisdictionOther, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCurrency==null?"\\N":fstrCurrency, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCurrencyOther==null?"\\N":fstrCurrencyOther, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFifEx35==null?"\\N":fstrFifEx35, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFifEntity==null?"\\N":fstrFifEntity, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurIncomeInterest==null?"\\N":fcurIncomeInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAttributedIncome==null?"\\N":fcurAttributedIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurIncomeAfterLoss==null?"\\N":fcurIncomeAfterLoss.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCreditsEarned==null?"\\N":fcurCreditsEarned.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCreditsUsed==null?"\\N":fcurCreditsUsed.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrName==null?"\\N":fstrName, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmBalanceDate==null?"\\N":"" + fdtmBalanceDate, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPrimaryActivity==null?"\\N":fstrPrimaryActivity, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPrimaryActivityOther==null?"\\N":fstrPrimaryActivityOther, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrJurisdiction==null?"\\N":fstrJurisdiction, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrJurisdictionOther==null?"\\N":fstrJurisdictionOther, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCurrency==null?"\\N":fstrCurrency, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCurrencyOther==null?"\\N":fstrCurrencyOther, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFifEx35==null?"\\N":fstrFifEx35, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFifEntity==null?"\\N":fstrFifEntity, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurIncomeInterest==null?"\\N":fcurIncomeInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAttributedIncome==null?"\\N":fcurAttributedIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurIncomeAfterLoss==null?"\\N":fcurIncomeAfterLoss.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCreditsEarned==null?"\\N":fcurCreditsEarned.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCreditsUsed==null?"\\N":fcurCreditsUsed.toPlainString(), delimiters));
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
    if (__cur_str.equals("null")) { this.fstrName = null; } else {
      this.fstrName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmBalanceDate = null; } else {
      this.fdtmBalanceDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPrimaryActivity = null; } else {
      this.fstrPrimaryActivity = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPrimaryActivityOther = null; } else {
      this.fstrPrimaryActivityOther = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrJurisdiction = null; } else {
      this.fstrJurisdiction = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrJurisdictionOther = null; } else {
      this.fstrJurisdictionOther = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCurrency = null; } else {
      this.fstrCurrency = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCurrencyOther = null; } else {
      this.fstrCurrencyOther = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFifEx35 = null; } else {
      this.fstrFifEx35 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFifEntity = null; } else {
      this.fstrFifEntity = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurIncomeInterest = null; } else {
      this.fcurIncomeInterest = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAttributedIncome = null; } else {
      this.fcurAttributedIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurIncomeAfterLoss = null; } else {
      this.fcurIncomeAfterLoss = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCreditsEarned = null; } else {
      this.fcurCreditsEarned = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCreditsUsed = null; } else {
      this.fcurCreditsUsed = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrName = null; } else {
      this.fstrName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmBalanceDate = null; } else {
      this.fdtmBalanceDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPrimaryActivity = null; } else {
      this.fstrPrimaryActivity = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPrimaryActivityOther = null; } else {
      this.fstrPrimaryActivityOther = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrJurisdiction = null; } else {
      this.fstrJurisdiction = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrJurisdictionOther = null; } else {
      this.fstrJurisdictionOther = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCurrency = null; } else {
      this.fstrCurrency = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCurrencyOther = null; } else {
      this.fstrCurrencyOther = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFifEx35 = null; } else {
      this.fstrFifEx35 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFifEntity = null; } else {
      this.fstrFifEntity = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurIncomeInterest = null; } else {
      this.fcurIncomeInterest = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAttributedIncome = null; } else {
      this.fcurAttributedIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurIncomeAfterLoss = null; } else {
      this.fcurIncomeAfterLoss = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCreditsEarned = null; } else {
      this.fcurCreditsEarned = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCreditsUsed = null; } else {
      this.fcurCreditsUsed = new java.math.BigDecimal(__cur_str);
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
    tblnz_rtnfifinc o = (tblnz_rtnfifinc) super.clone();
    o.fdtmBalanceDate = (o.fdtmBalanceDate != null) ? (java.sql.Timestamp) o.fdtmBalanceDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_rtnfifinc o) throws CloneNotSupportedException {
    o.fdtmBalanceDate = (o.fdtmBalanceDate != null) ? (java.sql.Timestamp) o.fdtmBalanceDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fintSeq", this.fintSeq);
    __sqoop$field_map.put("fstrName", this.fstrName);
    __sqoop$field_map.put("fdtmBalanceDate", this.fdtmBalanceDate);
    __sqoop$field_map.put("fstrPrimaryActivity", this.fstrPrimaryActivity);
    __sqoop$field_map.put("fstrPrimaryActivityOther", this.fstrPrimaryActivityOther);
    __sqoop$field_map.put("fstrJurisdiction", this.fstrJurisdiction);
    __sqoop$field_map.put("fstrJurisdictionOther", this.fstrJurisdictionOther);
    __sqoop$field_map.put("fstrCurrency", this.fstrCurrency);
    __sqoop$field_map.put("fstrCurrencyOther", this.fstrCurrencyOther);
    __sqoop$field_map.put("fstrFifEx35", this.fstrFifEx35);
    __sqoop$field_map.put("fstrFifEntity", this.fstrFifEntity);
    __sqoop$field_map.put("fcurIncomeInterest", this.fcurIncomeInterest);
    __sqoop$field_map.put("fcurAttributedIncome", this.fcurAttributedIncome);
    __sqoop$field_map.put("fcurIncomeAfterLoss", this.fcurIncomeAfterLoss);
    __sqoop$field_map.put("fcurCreditsEarned", this.fcurCreditsEarned);
    __sqoop$field_map.put("fcurCreditsUsed", this.fcurCreditsUsed);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fintSeq", this.fintSeq);
    __sqoop$field_map.put("fstrName", this.fstrName);
    __sqoop$field_map.put("fdtmBalanceDate", this.fdtmBalanceDate);
    __sqoop$field_map.put("fstrPrimaryActivity", this.fstrPrimaryActivity);
    __sqoop$field_map.put("fstrPrimaryActivityOther", this.fstrPrimaryActivityOther);
    __sqoop$field_map.put("fstrJurisdiction", this.fstrJurisdiction);
    __sqoop$field_map.put("fstrJurisdictionOther", this.fstrJurisdictionOther);
    __sqoop$field_map.put("fstrCurrency", this.fstrCurrency);
    __sqoop$field_map.put("fstrCurrencyOther", this.fstrCurrencyOther);
    __sqoop$field_map.put("fstrFifEx35", this.fstrFifEx35);
    __sqoop$field_map.put("fstrFifEntity", this.fstrFifEntity);
    __sqoop$field_map.put("fcurIncomeInterest", this.fcurIncomeInterest);
    __sqoop$field_map.put("fcurAttributedIncome", this.fcurAttributedIncome);
    __sqoop$field_map.put("fcurIncomeAfterLoss", this.fcurIncomeAfterLoss);
    __sqoop$field_map.put("fcurCreditsEarned", this.fcurCreditsEarned);
    __sqoop$field_map.put("fcurCreditsUsed", this.fcurCreditsUsed);
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
