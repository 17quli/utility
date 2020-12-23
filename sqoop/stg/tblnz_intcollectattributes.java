// ORM class for table 'tblnz_intcollectattributes'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 06:27:34 NZDT 2020
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

public class tblnz_intcollectattributes extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_intcollectattributes.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fdtmDOB", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_intcollectattributes.this.fdtmDOB = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrOriginCountry", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_intcollectattributes.this.fstrOriginCountry = (String)value;
      }
    });
    setters.put("fstrCurrencyType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_intcollectattributes.this.fstrCurrencyType = (String)value;
      }
    });
    setters.put("fcurDebtAmountNZD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_intcollectattributes.this.fcurDebtAmountNZD = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDebtAmountOther", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_intcollectattributes.this.fcurDebtAmountOther = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDebtPaid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_intcollectattributes.this.fcurDebtPaid = (java.math.BigDecimal)value;
      }
    });
    setters.put("fdblCurrencyRate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_intcollectattributes.this.fdblCurrencyRate = (Double)value;
      }
    });
    setters.put("fblnGarnish", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_intcollectattributes.this.fblnGarnish = (Integer)value;
      }
    });
    setters.put("fblnPaymentPlan", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_intcollectattributes.this.fblnPaymentPlan = (Integer)value;
      }
    });
    setters.put("fdtmDateEntered", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_intcollectattributes.this.fdtmDateEntered = (java.sql.Timestamp)value;
      }
    });
    setters.put("fblnBankAccount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_intcollectattributes.this.fblnBankAccount = (Integer)value;
      }
    });
    setters.put("fdtmClosed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_intcollectattributes.this.fdtmClosed = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrClosedReason", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_intcollectattributes.this.fstrClosedReason = (String)value;
      }
    });
    setters.put("fstrReOpenReason", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_intcollectattributes.this.fstrReOpenReason = (String)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_intcollectattributes.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_intcollectattributes.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_intcollectattributes() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_intcollectattributes with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private java.sql.Timestamp fdtmDOB;
  public java.sql.Timestamp get_fdtmDOB() {
    return fdtmDOB;
  }
  public void set_fdtmDOB(java.sql.Timestamp fdtmDOB) {
    this.fdtmDOB = fdtmDOB;
  }
  public tblnz_intcollectattributes with_fdtmDOB(java.sql.Timestamp fdtmDOB) {
    this.fdtmDOB = fdtmDOB;
    return this;
  }
  private String fstrOriginCountry;
  public String get_fstrOriginCountry() {
    return fstrOriginCountry;
  }
  public void set_fstrOriginCountry(String fstrOriginCountry) {
    this.fstrOriginCountry = fstrOriginCountry;
  }
  public tblnz_intcollectattributes with_fstrOriginCountry(String fstrOriginCountry) {
    this.fstrOriginCountry = fstrOriginCountry;
    return this;
  }
  private String fstrCurrencyType;
  public String get_fstrCurrencyType() {
    return fstrCurrencyType;
  }
  public void set_fstrCurrencyType(String fstrCurrencyType) {
    this.fstrCurrencyType = fstrCurrencyType;
  }
  public tblnz_intcollectattributes with_fstrCurrencyType(String fstrCurrencyType) {
    this.fstrCurrencyType = fstrCurrencyType;
    return this;
  }
  private java.math.BigDecimal fcurDebtAmountNZD;
  public java.math.BigDecimal get_fcurDebtAmountNZD() {
    return fcurDebtAmountNZD;
  }
  public void set_fcurDebtAmountNZD(java.math.BigDecimal fcurDebtAmountNZD) {
    this.fcurDebtAmountNZD = fcurDebtAmountNZD;
  }
  public tblnz_intcollectattributes with_fcurDebtAmountNZD(java.math.BigDecimal fcurDebtAmountNZD) {
    this.fcurDebtAmountNZD = fcurDebtAmountNZD;
    return this;
  }
  private java.math.BigDecimal fcurDebtAmountOther;
  public java.math.BigDecimal get_fcurDebtAmountOther() {
    return fcurDebtAmountOther;
  }
  public void set_fcurDebtAmountOther(java.math.BigDecimal fcurDebtAmountOther) {
    this.fcurDebtAmountOther = fcurDebtAmountOther;
  }
  public tblnz_intcollectattributes with_fcurDebtAmountOther(java.math.BigDecimal fcurDebtAmountOther) {
    this.fcurDebtAmountOther = fcurDebtAmountOther;
    return this;
  }
  private java.math.BigDecimal fcurDebtPaid;
  public java.math.BigDecimal get_fcurDebtPaid() {
    return fcurDebtPaid;
  }
  public void set_fcurDebtPaid(java.math.BigDecimal fcurDebtPaid) {
    this.fcurDebtPaid = fcurDebtPaid;
  }
  public tblnz_intcollectattributes with_fcurDebtPaid(java.math.BigDecimal fcurDebtPaid) {
    this.fcurDebtPaid = fcurDebtPaid;
    return this;
  }
  private Double fdblCurrencyRate;
  public Double get_fdblCurrencyRate() {
    return fdblCurrencyRate;
  }
  public void set_fdblCurrencyRate(Double fdblCurrencyRate) {
    this.fdblCurrencyRate = fdblCurrencyRate;
  }
  public tblnz_intcollectattributes with_fdblCurrencyRate(Double fdblCurrencyRate) {
    this.fdblCurrencyRate = fdblCurrencyRate;
    return this;
  }
  private Integer fblnGarnish;
  public Integer get_fblnGarnish() {
    return fblnGarnish;
  }
  public void set_fblnGarnish(Integer fblnGarnish) {
    this.fblnGarnish = fblnGarnish;
  }
  public tblnz_intcollectattributes with_fblnGarnish(Integer fblnGarnish) {
    this.fblnGarnish = fblnGarnish;
    return this;
  }
  private Integer fblnPaymentPlan;
  public Integer get_fblnPaymentPlan() {
    return fblnPaymentPlan;
  }
  public void set_fblnPaymentPlan(Integer fblnPaymentPlan) {
    this.fblnPaymentPlan = fblnPaymentPlan;
  }
  public tblnz_intcollectattributes with_fblnPaymentPlan(Integer fblnPaymentPlan) {
    this.fblnPaymentPlan = fblnPaymentPlan;
    return this;
  }
  private java.sql.Timestamp fdtmDateEntered;
  public java.sql.Timestamp get_fdtmDateEntered() {
    return fdtmDateEntered;
  }
  public void set_fdtmDateEntered(java.sql.Timestamp fdtmDateEntered) {
    this.fdtmDateEntered = fdtmDateEntered;
  }
  public tblnz_intcollectattributes with_fdtmDateEntered(java.sql.Timestamp fdtmDateEntered) {
    this.fdtmDateEntered = fdtmDateEntered;
    return this;
  }
  private Integer fblnBankAccount;
  public Integer get_fblnBankAccount() {
    return fblnBankAccount;
  }
  public void set_fblnBankAccount(Integer fblnBankAccount) {
    this.fblnBankAccount = fblnBankAccount;
  }
  public tblnz_intcollectattributes with_fblnBankAccount(Integer fblnBankAccount) {
    this.fblnBankAccount = fblnBankAccount;
    return this;
  }
  private java.sql.Timestamp fdtmClosed;
  public java.sql.Timestamp get_fdtmClosed() {
    return fdtmClosed;
  }
  public void set_fdtmClosed(java.sql.Timestamp fdtmClosed) {
    this.fdtmClosed = fdtmClosed;
  }
  public tblnz_intcollectattributes with_fdtmClosed(java.sql.Timestamp fdtmClosed) {
    this.fdtmClosed = fdtmClosed;
    return this;
  }
  private String fstrClosedReason;
  public String get_fstrClosedReason() {
    return fstrClosedReason;
  }
  public void set_fstrClosedReason(String fstrClosedReason) {
    this.fstrClosedReason = fstrClosedReason;
  }
  public tblnz_intcollectattributes with_fstrClosedReason(String fstrClosedReason) {
    this.fstrClosedReason = fstrClosedReason;
    return this;
  }
  private String fstrReOpenReason;
  public String get_fstrReOpenReason() {
    return fstrReOpenReason;
  }
  public void set_fstrReOpenReason(String fstrReOpenReason) {
    this.fstrReOpenReason = fstrReOpenReason;
  }
  public tblnz_intcollectattributes with_fstrReOpenReason(String fstrReOpenReason) {
    this.fstrReOpenReason = fstrReOpenReason;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_intcollectattributes with_fstrWho(String fstrWho) {
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
  public tblnz_intcollectattributes with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_intcollectattributes)) {
      return false;
    }
    tblnz_intcollectattributes that = (tblnz_intcollectattributes) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fdtmDOB == null ? that.fdtmDOB == null : this.fdtmDOB.equals(that.fdtmDOB));
    equal = equal && (this.fstrOriginCountry == null ? that.fstrOriginCountry == null : this.fstrOriginCountry.equals(that.fstrOriginCountry));
    equal = equal && (this.fstrCurrencyType == null ? that.fstrCurrencyType == null : this.fstrCurrencyType.equals(that.fstrCurrencyType));
    equal = equal && (this.fcurDebtAmountNZD == null ? that.fcurDebtAmountNZD == null : this.fcurDebtAmountNZD.equals(that.fcurDebtAmountNZD));
    equal = equal && (this.fcurDebtAmountOther == null ? that.fcurDebtAmountOther == null : this.fcurDebtAmountOther.equals(that.fcurDebtAmountOther));
    equal = equal && (this.fcurDebtPaid == null ? that.fcurDebtPaid == null : this.fcurDebtPaid.equals(that.fcurDebtPaid));
    equal = equal && (this.fdblCurrencyRate == null ? that.fdblCurrencyRate == null : this.fdblCurrencyRate.equals(that.fdblCurrencyRate));
    equal = equal && (this.fblnGarnish == null ? that.fblnGarnish == null : this.fblnGarnish.equals(that.fblnGarnish));
    equal = equal && (this.fblnPaymentPlan == null ? that.fblnPaymentPlan == null : this.fblnPaymentPlan.equals(that.fblnPaymentPlan));
    equal = equal && (this.fdtmDateEntered == null ? that.fdtmDateEntered == null : this.fdtmDateEntered.equals(that.fdtmDateEntered));
    equal = equal && (this.fblnBankAccount == null ? that.fblnBankAccount == null : this.fblnBankAccount.equals(that.fblnBankAccount));
    equal = equal && (this.fdtmClosed == null ? that.fdtmClosed == null : this.fdtmClosed.equals(that.fdtmClosed));
    equal = equal && (this.fstrClosedReason == null ? that.fstrClosedReason == null : this.fstrClosedReason.equals(that.fstrClosedReason));
    equal = equal && (this.fstrReOpenReason == null ? that.fstrReOpenReason == null : this.fstrReOpenReason.equals(that.fstrReOpenReason));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_intcollectattributes)) {
      return false;
    }
    tblnz_intcollectattributes that = (tblnz_intcollectattributes) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fdtmDOB == null ? that.fdtmDOB == null : this.fdtmDOB.equals(that.fdtmDOB));
    equal = equal && (this.fstrOriginCountry == null ? that.fstrOriginCountry == null : this.fstrOriginCountry.equals(that.fstrOriginCountry));
    equal = equal && (this.fstrCurrencyType == null ? that.fstrCurrencyType == null : this.fstrCurrencyType.equals(that.fstrCurrencyType));
    equal = equal && (this.fcurDebtAmountNZD == null ? that.fcurDebtAmountNZD == null : this.fcurDebtAmountNZD.equals(that.fcurDebtAmountNZD));
    equal = equal && (this.fcurDebtAmountOther == null ? that.fcurDebtAmountOther == null : this.fcurDebtAmountOther.equals(that.fcurDebtAmountOther));
    equal = equal && (this.fcurDebtPaid == null ? that.fcurDebtPaid == null : this.fcurDebtPaid.equals(that.fcurDebtPaid));
    equal = equal && (this.fdblCurrencyRate == null ? that.fdblCurrencyRate == null : this.fdblCurrencyRate.equals(that.fdblCurrencyRate));
    equal = equal && (this.fblnGarnish == null ? that.fblnGarnish == null : this.fblnGarnish.equals(that.fblnGarnish));
    equal = equal && (this.fblnPaymentPlan == null ? that.fblnPaymentPlan == null : this.fblnPaymentPlan.equals(that.fblnPaymentPlan));
    equal = equal && (this.fdtmDateEntered == null ? that.fdtmDateEntered == null : this.fdtmDateEntered.equals(that.fdtmDateEntered));
    equal = equal && (this.fblnBankAccount == null ? that.fblnBankAccount == null : this.fblnBankAccount.equals(that.fblnBankAccount));
    equal = equal && (this.fdtmClosed == null ? that.fdtmClosed == null : this.fdtmClosed.equals(that.fdtmClosed));
    equal = equal && (this.fstrClosedReason == null ? that.fstrClosedReason == null : this.fstrClosedReason.equals(that.fstrClosedReason));
    equal = equal && (this.fstrReOpenReason == null ? that.fstrReOpenReason == null : this.fstrReOpenReason.equals(that.fstrReOpenReason));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fdtmDOB = JdbcWritableBridge.readTimestamp(2, __dbResults);
    this.fstrOriginCountry = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrCurrencyType = JdbcWritableBridge.readString(4, __dbResults);
    this.fcurDebtAmountNZD = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurDebtAmountOther = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurDebtPaid = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fdblCurrencyRate = JdbcWritableBridge.readDouble(8, __dbResults);
    this.fblnGarnish = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fblnPaymentPlan = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fdtmDateEntered = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.fblnBankAccount = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fdtmClosed = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.fstrClosedReason = JdbcWritableBridge.readString(14, __dbResults);
    this.fstrReOpenReason = JdbcWritableBridge.readString(15, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(16, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(17, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fdtmDOB = JdbcWritableBridge.readTimestamp(2, __dbResults);
    this.fstrOriginCountry = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrCurrencyType = JdbcWritableBridge.readString(4, __dbResults);
    this.fcurDebtAmountNZD = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurDebtAmountOther = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurDebtPaid = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fdblCurrencyRate = JdbcWritableBridge.readDouble(8, __dbResults);
    this.fblnGarnish = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fblnPaymentPlan = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fdtmDateEntered = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.fblnBankAccount = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fdtmClosed = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.fstrClosedReason = JdbcWritableBridge.readString(14, __dbResults);
    this.fstrReOpenReason = JdbcWritableBridge.readString(15, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(16, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(17, __dbResults);
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
    JdbcWritableBridge.writeTimestamp(fdtmDOB, 2 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrOriginCountry, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCurrencyType, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDebtAmountNZD, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDebtAmountOther, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDebtPaid, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeDouble(fdblCurrencyRate, 8 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnGarnish, 9 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPaymentPlan, 10 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDateEntered, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnBankAccount, 12 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmClosed, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrClosedReason, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrReOpenReason, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 17 + __off, 93, __dbStmt);
    return 17;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDOB, 2 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrOriginCountry, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCurrencyType, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDebtAmountNZD, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDebtAmountOther, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDebtPaid, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeDouble(fdblCurrencyRate, 8 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnGarnish, 9 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPaymentPlan, 10 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDateEntered, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnBankAccount, 12 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmClosed, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrClosedReason, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrReOpenReason, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 17 + __off, 93, __dbStmt);
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
        this.fdtmDOB = null;
    } else {
    this.fdtmDOB = new Timestamp(__dataIn.readLong());
    this.fdtmDOB.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrOriginCountry = null;
    } else {
    this.fstrOriginCountry = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCurrencyType = null;
    } else {
    this.fstrCurrencyType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDebtAmountNZD = null;
    } else {
    this.fcurDebtAmountNZD = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDebtAmountOther = null;
    } else {
    this.fcurDebtAmountOther = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDebtPaid = null;
    } else {
    this.fcurDebtPaid = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdblCurrencyRate = null;
    } else {
    this.fdblCurrencyRate = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnGarnish = null;
    } else {
    this.fblnGarnish = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnPaymentPlan = null;
    } else {
    this.fblnPaymentPlan = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmDateEntered = null;
    } else {
    this.fdtmDateEntered = new Timestamp(__dataIn.readLong());
    this.fdtmDateEntered.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnBankAccount = null;
    } else {
    this.fblnBankAccount = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmClosed = null;
    } else {
    this.fdtmClosed = new Timestamp(__dataIn.readLong());
    this.fdtmClosed.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrClosedReason = null;
    } else {
    this.fstrClosedReason = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrReOpenReason = null;
    } else {
    this.fstrReOpenReason = Text.readString(__dataIn);
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
    if (null == this.fdtmDOB) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDOB.getTime());
    __dataOut.writeInt(this.fdtmDOB.getNanos());
    }
    if (null == this.fstrOriginCountry) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOriginCountry);
    }
    if (null == this.fstrCurrencyType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCurrencyType);
    }
    if (null == this.fcurDebtAmountNZD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDebtAmountNZD, __dataOut);
    }
    if (null == this.fcurDebtAmountOther) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDebtAmountOther, __dataOut);
    }
    if (null == this.fcurDebtPaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDebtPaid, __dataOut);
    }
    if (null == this.fdblCurrencyRate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.fdblCurrencyRate);
    }
    if (null == this.fblnGarnish) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnGarnish);
    }
    if (null == this.fblnPaymentPlan) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPaymentPlan);
    }
    if (null == this.fdtmDateEntered) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDateEntered.getTime());
    __dataOut.writeInt(this.fdtmDateEntered.getNanos());
    }
    if (null == this.fblnBankAccount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnBankAccount);
    }
    if (null == this.fdtmClosed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmClosed.getTime());
    __dataOut.writeInt(this.fdtmClosed.getNanos());
    }
    if (null == this.fstrClosedReason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrClosedReason);
    }
    if (null == this.fstrReOpenReason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrReOpenReason);
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
    if (null == this.fdtmDOB) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDOB.getTime());
    __dataOut.writeInt(this.fdtmDOB.getNanos());
    }
    if (null == this.fstrOriginCountry) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOriginCountry);
    }
    if (null == this.fstrCurrencyType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCurrencyType);
    }
    if (null == this.fcurDebtAmountNZD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDebtAmountNZD, __dataOut);
    }
    if (null == this.fcurDebtAmountOther) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDebtAmountOther, __dataOut);
    }
    if (null == this.fcurDebtPaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDebtPaid, __dataOut);
    }
    if (null == this.fdblCurrencyRate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.fdblCurrencyRate);
    }
    if (null == this.fblnGarnish) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnGarnish);
    }
    if (null == this.fblnPaymentPlan) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPaymentPlan);
    }
    if (null == this.fdtmDateEntered) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDateEntered.getTime());
    __dataOut.writeInt(this.fdtmDateEntered.getNanos());
    }
    if (null == this.fblnBankAccount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnBankAccount);
    }
    if (null == this.fdtmClosed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmClosed.getTime());
    __dataOut.writeInt(this.fdtmClosed.getNanos());
    }
    if (null == this.fstrClosedReason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrClosedReason);
    }
    if (null == this.fstrReOpenReason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrReOpenReason);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDOB==null?"\\N":"" + fdtmDOB, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOriginCountry==null?"\\N":fstrOriginCountry, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCurrencyType==null?"\\N":fstrCurrencyType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDebtAmountNZD==null?"\\N":fcurDebtAmountNZD.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDebtAmountOther==null?"\\N":fcurDebtAmountOther.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDebtPaid==null?"\\N":fcurDebtPaid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdblCurrencyRate==null?"\\N":"" + fdblCurrencyRate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnGarnish==null?"\\N":"" + fblnGarnish, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPaymentPlan==null?"\\N":"" + fblnPaymentPlan, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDateEntered==null?"\\N":"" + fdtmDateEntered, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnBankAccount==null?"\\N":"" + fblnBankAccount, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmClosed==null?"\\N":"" + fdtmClosed, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrClosedReason==null?"\\N":fstrClosedReason, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrReOpenReason==null?"\\N":fstrReOpenReason, " ", delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDOB==null?"\\N":"" + fdtmDOB, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOriginCountry==null?"\\N":fstrOriginCountry, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCurrencyType==null?"\\N":fstrCurrencyType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDebtAmountNZD==null?"\\N":fcurDebtAmountNZD.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDebtAmountOther==null?"\\N":fcurDebtAmountOther.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDebtPaid==null?"\\N":fcurDebtPaid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdblCurrencyRate==null?"\\N":"" + fdblCurrencyRate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnGarnish==null?"\\N":"" + fblnGarnish, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPaymentPlan==null?"\\N":"" + fblnPaymentPlan, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDateEntered==null?"\\N":"" + fdtmDateEntered, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnBankAccount==null?"\\N":"" + fblnBankAccount, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmClosed==null?"\\N":"" + fdtmClosed, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrClosedReason==null?"\\N":fstrClosedReason, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrReOpenReason==null?"\\N":fstrReOpenReason, " ", delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDOB = null; } else {
      this.fdtmDOB = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOriginCountry = null; } else {
      this.fstrOriginCountry = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDebtAmountNZD = null; } else {
      this.fcurDebtAmountNZD = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDebtAmountOther = null; } else {
      this.fcurDebtAmountOther = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDebtPaid = null; } else {
      this.fcurDebtPaid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdblCurrencyRate = null; } else {
      this.fdblCurrencyRate = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnGarnish = null; } else {
      this.fblnGarnish = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPaymentPlan = null; } else {
      this.fblnPaymentPlan = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDateEntered = null; } else {
      this.fdtmDateEntered = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnBankAccount = null; } else {
      this.fblnBankAccount = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmClosed = null; } else {
      this.fdtmClosed = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrClosedReason = null; } else {
      this.fstrClosedReason = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrReOpenReason = null; } else {
      this.fstrReOpenReason = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDOB = null; } else {
      this.fdtmDOB = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOriginCountry = null; } else {
      this.fstrOriginCountry = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDebtAmountNZD = null; } else {
      this.fcurDebtAmountNZD = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDebtAmountOther = null; } else {
      this.fcurDebtAmountOther = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDebtPaid = null; } else {
      this.fcurDebtPaid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdblCurrencyRate = null; } else {
      this.fdblCurrencyRate = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnGarnish = null; } else {
      this.fblnGarnish = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPaymentPlan = null; } else {
      this.fblnPaymentPlan = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDateEntered = null; } else {
      this.fdtmDateEntered = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnBankAccount = null; } else {
      this.fblnBankAccount = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmClosed = null; } else {
      this.fdtmClosed = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrClosedReason = null; } else {
      this.fstrClosedReason = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrReOpenReason = null; } else {
      this.fstrReOpenReason = __cur_str;
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
    tblnz_intcollectattributes o = (tblnz_intcollectattributes) super.clone();
    o.fdtmDOB = (o.fdtmDOB != null) ? (java.sql.Timestamp) o.fdtmDOB.clone() : null;
    o.fdtmDateEntered = (o.fdtmDateEntered != null) ? (java.sql.Timestamp) o.fdtmDateEntered.clone() : null;
    o.fdtmClosed = (o.fdtmClosed != null) ? (java.sql.Timestamp) o.fdtmClosed.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_intcollectattributes o) throws CloneNotSupportedException {
    o.fdtmDOB = (o.fdtmDOB != null) ? (java.sql.Timestamp) o.fdtmDOB.clone() : null;
    o.fdtmDateEntered = (o.fdtmDateEntered != null) ? (java.sql.Timestamp) o.fdtmDateEntered.clone() : null;
    o.fdtmClosed = (o.fdtmClosed != null) ? (java.sql.Timestamp) o.fdtmClosed.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fdtmDOB", this.fdtmDOB);
    __sqoop$field_map.put("fstrOriginCountry", this.fstrOriginCountry);
    __sqoop$field_map.put("fstrCurrencyType", this.fstrCurrencyType);
    __sqoop$field_map.put("fcurDebtAmountNZD", this.fcurDebtAmountNZD);
    __sqoop$field_map.put("fcurDebtAmountOther", this.fcurDebtAmountOther);
    __sqoop$field_map.put("fcurDebtPaid", this.fcurDebtPaid);
    __sqoop$field_map.put("fdblCurrencyRate", this.fdblCurrencyRate);
    __sqoop$field_map.put("fblnGarnish", this.fblnGarnish);
    __sqoop$field_map.put("fblnPaymentPlan", this.fblnPaymentPlan);
    __sqoop$field_map.put("fdtmDateEntered", this.fdtmDateEntered);
    __sqoop$field_map.put("fblnBankAccount", this.fblnBankAccount);
    __sqoop$field_map.put("fdtmClosed", this.fdtmClosed);
    __sqoop$field_map.put("fstrClosedReason", this.fstrClosedReason);
    __sqoop$field_map.put("fstrReOpenReason", this.fstrReOpenReason);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fdtmDOB", this.fdtmDOB);
    __sqoop$field_map.put("fstrOriginCountry", this.fstrOriginCountry);
    __sqoop$field_map.put("fstrCurrencyType", this.fstrCurrencyType);
    __sqoop$field_map.put("fcurDebtAmountNZD", this.fcurDebtAmountNZD);
    __sqoop$field_map.put("fcurDebtAmountOther", this.fcurDebtAmountOther);
    __sqoop$field_map.put("fcurDebtPaid", this.fcurDebtPaid);
    __sqoop$field_map.put("fdblCurrencyRate", this.fdblCurrencyRate);
    __sqoop$field_map.put("fblnGarnish", this.fblnGarnish);
    __sqoop$field_map.put("fblnPaymentPlan", this.fblnPaymentPlan);
    __sqoop$field_map.put("fdtmDateEntered", this.fdtmDateEntered);
    __sqoop$field_map.put("fblnBankAccount", this.fblnBankAccount);
    __sqoop$field_map.put("fdtmClosed", this.fdtmClosed);
    __sqoop$field_map.put("fstrClosedReason", this.fstrClosedReason);
    __sqoop$field_map.put("fstrReOpenReason", this.fstrReOpenReason);
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
