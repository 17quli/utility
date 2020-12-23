// ORM class for table 'tblnz_virtualremission'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 05:33:25 NZDT 2020
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

public class tblnz_virtualremission extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngCustomRateKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_virtualremission.this.flngCustomRateKey = (Integer)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_virtualremission.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_virtualremission.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("fstrCustomRateType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_virtualremission.this.fstrCustomRateType = (String)value;
      }
    });
    setters.put("flngAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_virtualremission.this.flngAccountKey = (Integer)value;
      }
    });
    setters.put("fdtmFilingPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_virtualremission.this.fdtmFilingPeriod = (java.sql.Timestamp)value;
      }
    });
    setters.put("flngBillItemKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_virtualremission.this.flngBillItemKey = (Integer)value;
      }
    });
    setters.put("fdtmRemissionApplied", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_virtualremission.this.fdtmRemissionApplied = (java.sql.Timestamp)value;
      }
    });
    setters.put("fcurInterestRemitted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_virtualremission.this.fcurInterestRemitted = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPenaltiesRemitted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_virtualremission.this.fcurPenaltiesRemitted = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurLatePaymentPenalty", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_virtualremission.this.fcurLatePaymentPenalty = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurNonPaymentPenalty", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_virtualremission.this.fcurNonPaymentPenalty = (java.math.BigDecimal)value;
      }
    });
    setters.put("fdtmReportingMonth", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_virtualremission.this.fdtmReportingMonth = (java.sql.Timestamp)value;
      }
    });
    setters.put("fblnFinal", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_virtualremission.this.fblnFinal = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_virtualremission.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_virtualremission.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_virtualremission() {
    init0();
  }
  private Integer flngCustomRateKey;
  public Integer get_flngCustomRateKey() {
    return flngCustomRateKey;
  }
  public void set_flngCustomRateKey(Integer flngCustomRateKey) {
    this.flngCustomRateKey = flngCustomRateKey;
  }
  public tblnz_virtualremission with_flngCustomRateKey(Integer flngCustomRateKey) {
    this.flngCustomRateKey = flngCustomRateKey;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblnz_virtualremission with_flngVer(Integer flngVer) {
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
  public tblnz_virtualremission with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private String fstrCustomRateType;
  public String get_fstrCustomRateType() {
    return fstrCustomRateType;
  }
  public void set_fstrCustomRateType(String fstrCustomRateType) {
    this.fstrCustomRateType = fstrCustomRateType;
  }
  public tblnz_virtualremission with_fstrCustomRateType(String fstrCustomRateType) {
    this.fstrCustomRateType = fstrCustomRateType;
    return this;
  }
  private Integer flngAccountKey;
  public Integer get_flngAccountKey() {
    return flngAccountKey;
  }
  public void set_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
  }
  public tblnz_virtualremission with_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
    return this;
  }
  private java.sql.Timestamp fdtmFilingPeriod;
  public java.sql.Timestamp get_fdtmFilingPeriod() {
    return fdtmFilingPeriod;
  }
  public void set_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
  }
  public tblnz_virtualremission with_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
    return this;
  }
  private Integer flngBillItemKey;
  public Integer get_flngBillItemKey() {
    return flngBillItemKey;
  }
  public void set_flngBillItemKey(Integer flngBillItemKey) {
    this.flngBillItemKey = flngBillItemKey;
  }
  public tblnz_virtualremission with_flngBillItemKey(Integer flngBillItemKey) {
    this.flngBillItemKey = flngBillItemKey;
    return this;
  }
  private java.sql.Timestamp fdtmRemissionApplied;
  public java.sql.Timestamp get_fdtmRemissionApplied() {
    return fdtmRemissionApplied;
  }
  public void set_fdtmRemissionApplied(java.sql.Timestamp fdtmRemissionApplied) {
    this.fdtmRemissionApplied = fdtmRemissionApplied;
  }
  public tblnz_virtualremission with_fdtmRemissionApplied(java.sql.Timestamp fdtmRemissionApplied) {
    this.fdtmRemissionApplied = fdtmRemissionApplied;
    return this;
  }
  private java.math.BigDecimal fcurInterestRemitted;
  public java.math.BigDecimal get_fcurInterestRemitted() {
    return fcurInterestRemitted;
  }
  public void set_fcurInterestRemitted(java.math.BigDecimal fcurInterestRemitted) {
    this.fcurInterestRemitted = fcurInterestRemitted;
  }
  public tblnz_virtualremission with_fcurInterestRemitted(java.math.BigDecimal fcurInterestRemitted) {
    this.fcurInterestRemitted = fcurInterestRemitted;
    return this;
  }
  private java.math.BigDecimal fcurPenaltiesRemitted;
  public java.math.BigDecimal get_fcurPenaltiesRemitted() {
    return fcurPenaltiesRemitted;
  }
  public void set_fcurPenaltiesRemitted(java.math.BigDecimal fcurPenaltiesRemitted) {
    this.fcurPenaltiesRemitted = fcurPenaltiesRemitted;
  }
  public tblnz_virtualremission with_fcurPenaltiesRemitted(java.math.BigDecimal fcurPenaltiesRemitted) {
    this.fcurPenaltiesRemitted = fcurPenaltiesRemitted;
    return this;
  }
  private java.math.BigDecimal fcurLatePaymentPenalty;
  public java.math.BigDecimal get_fcurLatePaymentPenalty() {
    return fcurLatePaymentPenalty;
  }
  public void set_fcurLatePaymentPenalty(java.math.BigDecimal fcurLatePaymentPenalty) {
    this.fcurLatePaymentPenalty = fcurLatePaymentPenalty;
  }
  public tblnz_virtualremission with_fcurLatePaymentPenalty(java.math.BigDecimal fcurLatePaymentPenalty) {
    this.fcurLatePaymentPenalty = fcurLatePaymentPenalty;
    return this;
  }
  private java.math.BigDecimal fcurNonPaymentPenalty;
  public java.math.BigDecimal get_fcurNonPaymentPenalty() {
    return fcurNonPaymentPenalty;
  }
  public void set_fcurNonPaymentPenalty(java.math.BigDecimal fcurNonPaymentPenalty) {
    this.fcurNonPaymentPenalty = fcurNonPaymentPenalty;
  }
  public tblnz_virtualremission with_fcurNonPaymentPenalty(java.math.BigDecimal fcurNonPaymentPenalty) {
    this.fcurNonPaymentPenalty = fcurNonPaymentPenalty;
    return this;
  }
  private java.sql.Timestamp fdtmReportingMonth;
  public java.sql.Timestamp get_fdtmReportingMonth() {
    return fdtmReportingMonth;
  }
  public void set_fdtmReportingMonth(java.sql.Timestamp fdtmReportingMonth) {
    this.fdtmReportingMonth = fdtmReportingMonth;
  }
  public tblnz_virtualremission with_fdtmReportingMonth(java.sql.Timestamp fdtmReportingMonth) {
    this.fdtmReportingMonth = fdtmReportingMonth;
    return this;
  }
  private Integer fblnFinal;
  public Integer get_fblnFinal() {
    return fblnFinal;
  }
  public void set_fblnFinal(Integer fblnFinal) {
    this.fblnFinal = fblnFinal;
  }
  public tblnz_virtualremission with_fblnFinal(Integer fblnFinal) {
    this.fblnFinal = fblnFinal;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_virtualremission with_fstrWho(String fstrWho) {
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
  public tblnz_virtualremission with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_virtualremission)) {
      return false;
    }
    tblnz_virtualremission that = (tblnz_virtualremission) o;
    boolean equal = true;
    equal = equal && (this.flngCustomRateKey == null ? that.flngCustomRateKey == null : this.flngCustomRateKey.equals(that.flngCustomRateKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fstrCustomRateType == null ? that.fstrCustomRateType == null : this.fstrCustomRateType.equals(that.fstrCustomRateType));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.flngBillItemKey == null ? that.flngBillItemKey == null : this.flngBillItemKey.equals(that.flngBillItemKey));
    equal = equal && (this.fdtmRemissionApplied == null ? that.fdtmRemissionApplied == null : this.fdtmRemissionApplied.equals(that.fdtmRemissionApplied));
    equal = equal && (this.fcurInterestRemitted == null ? that.fcurInterestRemitted == null : this.fcurInterestRemitted.equals(that.fcurInterestRemitted));
    equal = equal && (this.fcurPenaltiesRemitted == null ? that.fcurPenaltiesRemitted == null : this.fcurPenaltiesRemitted.equals(that.fcurPenaltiesRemitted));
    equal = equal && (this.fcurLatePaymentPenalty == null ? that.fcurLatePaymentPenalty == null : this.fcurLatePaymentPenalty.equals(that.fcurLatePaymentPenalty));
    equal = equal && (this.fcurNonPaymentPenalty == null ? that.fcurNonPaymentPenalty == null : this.fcurNonPaymentPenalty.equals(that.fcurNonPaymentPenalty));
    equal = equal && (this.fdtmReportingMonth == null ? that.fdtmReportingMonth == null : this.fdtmReportingMonth.equals(that.fdtmReportingMonth));
    equal = equal && (this.fblnFinal == null ? that.fblnFinal == null : this.fblnFinal.equals(that.fblnFinal));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_virtualremission)) {
      return false;
    }
    tblnz_virtualremission that = (tblnz_virtualremission) o;
    boolean equal = true;
    equal = equal && (this.flngCustomRateKey == null ? that.flngCustomRateKey == null : this.flngCustomRateKey.equals(that.flngCustomRateKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fstrCustomRateType == null ? that.fstrCustomRateType == null : this.fstrCustomRateType.equals(that.fstrCustomRateType));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.flngBillItemKey == null ? that.flngBillItemKey == null : this.flngBillItemKey.equals(that.flngBillItemKey));
    equal = equal && (this.fdtmRemissionApplied == null ? that.fdtmRemissionApplied == null : this.fdtmRemissionApplied.equals(that.fdtmRemissionApplied));
    equal = equal && (this.fcurInterestRemitted == null ? that.fcurInterestRemitted == null : this.fcurInterestRemitted.equals(that.fcurInterestRemitted));
    equal = equal && (this.fcurPenaltiesRemitted == null ? that.fcurPenaltiesRemitted == null : this.fcurPenaltiesRemitted.equals(that.fcurPenaltiesRemitted));
    equal = equal && (this.fcurLatePaymentPenalty == null ? that.fcurLatePaymentPenalty == null : this.fcurLatePaymentPenalty.equals(that.fcurLatePaymentPenalty));
    equal = equal && (this.fcurNonPaymentPenalty == null ? that.fcurNonPaymentPenalty == null : this.fcurNonPaymentPenalty.equals(that.fcurNonPaymentPenalty));
    equal = equal && (this.fdtmReportingMonth == null ? that.fdtmReportingMonth == null : this.fdtmReportingMonth.equals(that.fdtmReportingMonth));
    equal = equal && (this.fblnFinal == null ? that.fblnFinal == null : this.fblnFinal.equals(that.fblnFinal));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngCustomRateKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrCustomRateType = JdbcWritableBridge.readString(4, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.flngBillItemKey = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fdtmRemissionApplied = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.fcurInterestRemitted = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurPenaltiesRemitted = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurLatePaymentPenalty = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurNonPaymentPenalty = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fdtmReportingMonth = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.fblnFinal = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(15, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(16, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngCustomRateKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrCustomRateType = JdbcWritableBridge.readString(4, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.flngBillItemKey = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fdtmRemissionApplied = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.fcurInterestRemitted = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurPenaltiesRemitted = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurLatePaymentPenalty = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurNonPaymentPenalty = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fdtmReportingMonth = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.fblnFinal = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(15, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(16, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngCustomRateKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrCustomRateType, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngBillItemKey, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmRemissionApplied, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterestRemitted, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPenaltiesRemitted, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLatePaymentPenalty, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNonPaymentPenalty, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReportingMonth, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnFinal, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 16 + __off, 93, __dbStmt);
    return 16;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngCustomRateKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrCustomRateType, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngBillItemKey, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmRemissionApplied, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterestRemitted, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPenaltiesRemitted, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLatePaymentPenalty, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNonPaymentPenalty, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReportingMonth, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnFinal, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 16 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngCustomRateKey = null;
    } else {
    this.flngCustomRateKey = Integer.valueOf(__dataIn.readInt());
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
        this.fstrCustomRateType = null;
    } else {
    this.fstrCustomRateType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngAccountKey = null;
    } else {
    this.flngAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmFilingPeriod = null;
    } else {
    this.fdtmFilingPeriod = new Timestamp(__dataIn.readLong());
    this.fdtmFilingPeriod.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngBillItemKey = null;
    } else {
    this.flngBillItemKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmRemissionApplied = null;
    } else {
    this.fdtmRemissionApplied = new Timestamp(__dataIn.readLong());
    this.fdtmRemissionApplied.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurInterestRemitted = null;
    } else {
    this.fcurInterestRemitted = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPenaltiesRemitted = null;
    } else {
    this.fcurPenaltiesRemitted = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurLatePaymentPenalty = null;
    } else {
    this.fcurLatePaymentPenalty = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurNonPaymentPenalty = null;
    } else {
    this.fcurNonPaymentPenalty = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmReportingMonth = null;
    } else {
    this.fdtmReportingMonth = new Timestamp(__dataIn.readLong());
    this.fdtmReportingMonth.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnFinal = null;
    } else {
    this.fblnFinal = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.flngCustomRateKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomRateKey);
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
    if (null == this.fstrCustomRateType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCustomRateType);
    }
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
    }
    if (null == this.fdtmFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriod.getNanos());
    }
    if (null == this.flngBillItemKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngBillItemKey);
    }
    if (null == this.fdtmRemissionApplied) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmRemissionApplied.getTime());
    __dataOut.writeInt(this.fdtmRemissionApplied.getNanos());
    }
    if (null == this.fcurInterestRemitted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInterestRemitted, __dataOut);
    }
    if (null == this.fcurPenaltiesRemitted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPenaltiesRemitted, __dataOut);
    }
    if (null == this.fcurLatePaymentPenalty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLatePaymentPenalty, __dataOut);
    }
    if (null == this.fcurNonPaymentPenalty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNonPaymentPenalty, __dataOut);
    }
    if (null == this.fdtmReportingMonth) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReportingMonth.getTime());
    __dataOut.writeInt(this.fdtmReportingMonth.getNanos());
    }
    if (null == this.fblnFinal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnFinal);
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
    if (null == this.flngCustomRateKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomRateKey);
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
    if (null == this.fstrCustomRateType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCustomRateType);
    }
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
    }
    if (null == this.fdtmFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriod.getNanos());
    }
    if (null == this.flngBillItemKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngBillItemKey);
    }
    if (null == this.fdtmRemissionApplied) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmRemissionApplied.getTime());
    __dataOut.writeInt(this.fdtmRemissionApplied.getNanos());
    }
    if (null == this.fcurInterestRemitted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInterestRemitted, __dataOut);
    }
    if (null == this.fcurPenaltiesRemitted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPenaltiesRemitted, __dataOut);
    }
    if (null == this.fcurLatePaymentPenalty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLatePaymentPenalty, __dataOut);
    }
    if (null == this.fcurNonPaymentPenalty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNonPaymentPenalty, __dataOut);
    }
    if (null == this.fdtmReportingMonth) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReportingMonth.getTime());
    __dataOut.writeInt(this.fdtmReportingMonth.getNanos());
    }
    if (null == this.fblnFinal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnFinal);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomRateKey==null?"\\N":"" + flngCustomRateKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCustomRateType==null?"\\N":fstrCustomRateType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngBillItemKey==null?"\\N":"" + flngBillItemKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmRemissionApplied==null?"\\N":"" + fdtmRemissionApplied, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterestRemitted==null?"\\N":fcurInterestRemitted.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPenaltiesRemitted==null?"\\N":fcurPenaltiesRemitted.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLatePaymentPenalty==null?"\\N":fcurLatePaymentPenalty.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNonPaymentPenalty==null?"\\N":fcurNonPaymentPenalty.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReportingMonth==null?"\\N":"" + fdtmReportingMonth, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnFinal==null?"\\N":"" + fblnFinal, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomRateKey==null?"\\N":"" + flngCustomRateKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCustomRateType==null?"\\N":fstrCustomRateType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngBillItemKey==null?"\\N":"" + flngBillItemKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmRemissionApplied==null?"\\N":"" + fdtmRemissionApplied, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterestRemitted==null?"\\N":fcurInterestRemitted.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPenaltiesRemitted==null?"\\N":fcurPenaltiesRemitted.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLatePaymentPenalty==null?"\\N":fcurLatePaymentPenalty.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNonPaymentPenalty==null?"\\N":fcurNonPaymentPenalty.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReportingMonth==null?"\\N":"" + fdtmReportingMonth, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnFinal==null?"\\N":"" + fblnFinal, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCustomRateKey = null; } else {
      this.flngCustomRateKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrCustomRateType = null; } else {
      this.fstrCustomRateType = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFilingPeriod = null; } else {
      this.fdtmFilingPeriod = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmRemissionApplied = null; } else {
      this.fdtmRemissionApplied = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInterestRemitted = null; } else {
      this.fcurInterestRemitted = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPenaltiesRemitted = null; } else {
      this.fcurPenaltiesRemitted = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLatePaymentPenalty = null; } else {
      this.fcurLatePaymentPenalty = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNonPaymentPenalty = null; } else {
      this.fcurNonPaymentPenalty = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReportingMonth = null; } else {
      this.fdtmReportingMonth = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnFinal = null; } else {
      this.fblnFinal = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCustomRateKey = null; } else {
      this.flngCustomRateKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrCustomRateType = null; } else {
      this.fstrCustomRateType = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFilingPeriod = null; } else {
      this.fdtmFilingPeriod = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmRemissionApplied = null; } else {
      this.fdtmRemissionApplied = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInterestRemitted = null; } else {
      this.fcurInterestRemitted = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPenaltiesRemitted = null; } else {
      this.fcurPenaltiesRemitted = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLatePaymentPenalty = null; } else {
      this.fcurLatePaymentPenalty = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNonPaymentPenalty = null; } else {
      this.fcurNonPaymentPenalty = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReportingMonth = null; } else {
      this.fdtmReportingMonth = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnFinal = null; } else {
      this.fblnFinal = Integer.valueOf(__cur_str);
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
    tblnz_virtualremission o = (tblnz_virtualremission) super.clone();
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmRemissionApplied = (o.fdtmRemissionApplied != null) ? (java.sql.Timestamp) o.fdtmRemissionApplied.clone() : null;
    o.fdtmReportingMonth = (o.fdtmReportingMonth != null) ? (java.sql.Timestamp) o.fdtmReportingMonth.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_virtualremission o) throws CloneNotSupportedException {
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmRemissionApplied = (o.fdtmRemissionApplied != null) ? (java.sql.Timestamp) o.fdtmRemissionApplied.clone() : null;
    o.fdtmReportingMonth = (o.fdtmReportingMonth != null) ? (java.sql.Timestamp) o.fdtmReportingMonth.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngCustomRateKey", this.flngCustomRateKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fstrCustomRateType", this.fstrCustomRateType);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("flngBillItemKey", this.flngBillItemKey);
    __sqoop$field_map.put("fdtmRemissionApplied", this.fdtmRemissionApplied);
    __sqoop$field_map.put("fcurInterestRemitted", this.fcurInterestRemitted);
    __sqoop$field_map.put("fcurPenaltiesRemitted", this.fcurPenaltiesRemitted);
    __sqoop$field_map.put("fcurLatePaymentPenalty", this.fcurLatePaymentPenalty);
    __sqoop$field_map.put("fcurNonPaymentPenalty", this.fcurNonPaymentPenalty);
    __sqoop$field_map.put("fdtmReportingMonth", this.fdtmReportingMonth);
    __sqoop$field_map.put("fblnFinal", this.fblnFinal);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngCustomRateKey", this.flngCustomRateKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fstrCustomRateType", this.fstrCustomRateType);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("flngBillItemKey", this.flngBillItemKey);
    __sqoop$field_map.put("fdtmRemissionApplied", this.fdtmRemissionApplied);
    __sqoop$field_map.put("fcurInterestRemitted", this.fcurInterestRemitted);
    __sqoop$field_map.put("fcurPenaltiesRemitted", this.fcurPenaltiesRemitted);
    __sqoop$field_map.put("fcurLatePaymentPenalty", this.fcurLatePaymentPenalty);
    __sqoop$field_map.put("fcurNonPaymentPenalty", this.fcurNonPaymentPenalty);
    __sqoop$field_map.put("fdtmReportingMonth", this.fdtmReportingMonth);
    __sqoop$field_map.put("fblnFinal", this.fblnFinal);
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
