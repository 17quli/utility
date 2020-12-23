// ORM class for table 'tblnz_ksslineitem'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 03:12:18 NZDT 2020
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

public class tblnz_ksslineitem extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngReturnKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksslineitem.this.flngReturnKey = (Integer)value;
      }
    });
    setters.put("flngItemNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksslineitem.this.flngItemNumber = (Integer)value;
      }
    });
    setters.put("flngAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksslineitem.this.flngAccountKey = (Integer)value;
      }
    });
    setters.put("fdtmFilingPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksslineitem.this.fdtmFilingPeriod = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmPayDayPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksslineitem.this.fdtmPayDayPeriod = (java.sql.Timestamp)value;
      }
    });
    setters.put("fi64KSEContributionKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksslineitem.this.fi64KSEContributionKey = (Long)value;
      }
    });
    setters.put("fi64KSRContributionKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksslineitem.this.fi64KSRContributionKey = (Long)value;
      }
    });
    setters.put("fblnReversed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksslineitem.this.fblnReversed = (Integer)value;
      }
    });
    setters.put("fblnKSEConverted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksslineitem.this.fblnKSEConverted = (Integer)value;
      }
    });
    setters.put("fblnKSRConverted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksslineitem.this.fblnKSRConverted = (Integer)value;
      }
    });
    setters.put("fstrCnvIRDNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksslineitem.this.fstrCnvIRDNumber = (String)value;
      }
    });
    setters.put("fstrCnvEmployeeName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksslineitem.this.fstrCnvEmployeeName = (String)value;
      }
    });
    setters.put("fstrCnvTaxCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksslineitem.this.fstrCnvTaxCode = (String)value;
      }
    });
    setters.put("fcurCnvKiwiSaverDeductions", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksslineitem.this.fcurCnvKiwiSaverDeductions = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurCnvKiwiSaverContributions", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksslineitem.this.fcurCnvKiwiSaverContributions = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksslineitem.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksslineitem.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_ksslineitem() {
    init0();
  }
  private Integer flngReturnKey;
  public Integer get_flngReturnKey() {
    return flngReturnKey;
  }
  public void set_flngReturnKey(Integer flngReturnKey) {
    this.flngReturnKey = flngReturnKey;
  }
  public tblnz_ksslineitem with_flngReturnKey(Integer flngReturnKey) {
    this.flngReturnKey = flngReturnKey;
    return this;
  }
  private Integer flngItemNumber;
  public Integer get_flngItemNumber() {
    return flngItemNumber;
  }
  public void set_flngItemNumber(Integer flngItemNumber) {
    this.flngItemNumber = flngItemNumber;
  }
  public tblnz_ksslineitem with_flngItemNumber(Integer flngItemNumber) {
    this.flngItemNumber = flngItemNumber;
    return this;
  }
  private Integer flngAccountKey;
  public Integer get_flngAccountKey() {
    return flngAccountKey;
  }
  public void set_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
  }
  public tblnz_ksslineitem with_flngAccountKey(Integer flngAccountKey) {
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
  public tblnz_ksslineitem with_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
    return this;
  }
  private java.sql.Timestamp fdtmPayDayPeriod;
  public java.sql.Timestamp get_fdtmPayDayPeriod() {
    return fdtmPayDayPeriod;
  }
  public void set_fdtmPayDayPeriod(java.sql.Timestamp fdtmPayDayPeriod) {
    this.fdtmPayDayPeriod = fdtmPayDayPeriod;
  }
  public tblnz_ksslineitem with_fdtmPayDayPeriod(java.sql.Timestamp fdtmPayDayPeriod) {
    this.fdtmPayDayPeriod = fdtmPayDayPeriod;
    return this;
  }
  private Long fi64KSEContributionKey;
  public Long get_fi64KSEContributionKey() {
    return fi64KSEContributionKey;
  }
  public void set_fi64KSEContributionKey(Long fi64KSEContributionKey) {
    this.fi64KSEContributionKey = fi64KSEContributionKey;
  }
  public tblnz_ksslineitem with_fi64KSEContributionKey(Long fi64KSEContributionKey) {
    this.fi64KSEContributionKey = fi64KSEContributionKey;
    return this;
  }
  private Long fi64KSRContributionKey;
  public Long get_fi64KSRContributionKey() {
    return fi64KSRContributionKey;
  }
  public void set_fi64KSRContributionKey(Long fi64KSRContributionKey) {
    this.fi64KSRContributionKey = fi64KSRContributionKey;
  }
  public tblnz_ksslineitem with_fi64KSRContributionKey(Long fi64KSRContributionKey) {
    this.fi64KSRContributionKey = fi64KSRContributionKey;
    return this;
  }
  private Integer fblnReversed;
  public Integer get_fblnReversed() {
    return fblnReversed;
  }
  public void set_fblnReversed(Integer fblnReversed) {
    this.fblnReversed = fblnReversed;
  }
  public tblnz_ksslineitem with_fblnReversed(Integer fblnReversed) {
    this.fblnReversed = fblnReversed;
    return this;
  }
  private Integer fblnKSEConverted;
  public Integer get_fblnKSEConverted() {
    return fblnKSEConverted;
  }
  public void set_fblnKSEConverted(Integer fblnKSEConverted) {
    this.fblnKSEConverted = fblnKSEConverted;
  }
  public tblnz_ksslineitem with_fblnKSEConverted(Integer fblnKSEConverted) {
    this.fblnKSEConverted = fblnKSEConverted;
    return this;
  }
  private Integer fblnKSRConverted;
  public Integer get_fblnKSRConverted() {
    return fblnKSRConverted;
  }
  public void set_fblnKSRConverted(Integer fblnKSRConverted) {
    this.fblnKSRConverted = fblnKSRConverted;
  }
  public tblnz_ksslineitem with_fblnKSRConverted(Integer fblnKSRConverted) {
    this.fblnKSRConverted = fblnKSRConverted;
    return this;
  }
  private String fstrCnvIRDNumber;
  public String get_fstrCnvIRDNumber() {
    return fstrCnvIRDNumber;
  }
  public void set_fstrCnvIRDNumber(String fstrCnvIRDNumber) {
    this.fstrCnvIRDNumber = fstrCnvIRDNumber;
  }
  public tblnz_ksslineitem with_fstrCnvIRDNumber(String fstrCnvIRDNumber) {
    this.fstrCnvIRDNumber = fstrCnvIRDNumber;
    return this;
  }
  private String fstrCnvEmployeeName;
  public String get_fstrCnvEmployeeName() {
    return fstrCnvEmployeeName;
  }
  public void set_fstrCnvEmployeeName(String fstrCnvEmployeeName) {
    this.fstrCnvEmployeeName = fstrCnvEmployeeName;
  }
  public tblnz_ksslineitem with_fstrCnvEmployeeName(String fstrCnvEmployeeName) {
    this.fstrCnvEmployeeName = fstrCnvEmployeeName;
    return this;
  }
  private String fstrCnvTaxCode;
  public String get_fstrCnvTaxCode() {
    return fstrCnvTaxCode;
  }
  public void set_fstrCnvTaxCode(String fstrCnvTaxCode) {
    this.fstrCnvTaxCode = fstrCnvTaxCode;
  }
  public tblnz_ksslineitem with_fstrCnvTaxCode(String fstrCnvTaxCode) {
    this.fstrCnvTaxCode = fstrCnvTaxCode;
    return this;
  }
  private java.math.BigDecimal fcurCnvKiwiSaverDeductions;
  public java.math.BigDecimal get_fcurCnvKiwiSaverDeductions() {
    return fcurCnvKiwiSaverDeductions;
  }
  public void set_fcurCnvKiwiSaverDeductions(java.math.BigDecimal fcurCnvKiwiSaverDeductions) {
    this.fcurCnvKiwiSaverDeductions = fcurCnvKiwiSaverDeductions;
  }
  public tblnz_ksslineitem with_fcurCnvKiwiSaverDeductions(java.math.BigDecimal fcurCnvKiwiSaverDeductions) {
    this.fcurCnvKiwiSaverDeductions = fcurCnvKiwiSaverDeductions;
    return this;
  }
  private java.math.BigDecimal fcurCnvKiwiSaverContributions;
  public java.math.BigDecimal get_fcurCnvKiwiSaverContributions() {
    return fcurCnvKiwiSaverContributions;
  }
  public void set_fcurCnvKiwiSaverContributions(java.math.BigDecimal fcurCnvKiwiSaverContributions) {
    this.fcurCnvKiwiSaverContributions = fcurCnvKiwiSaverContributions;
  }
  public tblnz_ksslineitem with_fcurCnvKiwiSaverContributions(java.math.BigDecimal fcurCnvKiwiSaverContributions) {
    this.fcurCnvKiwiSaverContributions = fcurCnvKiwiSaverContributions;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_ksslineitem with_fstrWho(String fstrWho) {
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
  public tblnz_ksslineitem with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_ksslineitem)) {
      return false;
    }
    tblnz_ksslineitem that = (tblnz_ksslineitem) o;
    boolean equal = true;
    equal = equal && (this.flngReturnKey == null ? that.flngReturnKey == null : this.flngReturnKey.equals(that.flngReturnKey));
    equal = equal && (this.flngItemNumber == null ? that.flngItemNumber == null : this.flngItemNumber.equals(that.flngItemNumber));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.fdtmPayDayPeriod == null ? that.fdtmPayDayPeriod == null : this.fdtmPayDayPeriod.equals(that.fdtmPayDayPeriod));
    equal = equal && (this.fi64KSEContributionKey == null ? that.fi64KSEContributionKey == null : this.fi64KSEContributionKey.equals(that.fi64KSEContributionKey));
    equal = equal && (this.fi64KSRContributionKey == null ? that.fi64KSRContributionKey == null : this.fi64KSRContributionKey.equals(that.fi64KSRContributionKey));
    equal = equal && (this.fblnReversed == null ? that.fblnReversed == null : this.fblnReversed.equals(that.fblnReversed));
    equal = equal && (this.fblnKSEConverted == null ? that.fblnKSEConverted == null : this.fblnKSEConverted.equals(that.fblnKSEConverted));
    equal = equal && (this.fblnKSRConverted == null ? that.fblnKSRConverted == null : this.fblnKSRConverted.equals(that.fblnKSRConverted));
    equal = equal && (this.fstrCnvIRDNumber == null ? that.fstrCnvIRDNumber == null : this.fstrCnvIRDNumber.equals(that.fstrCnvIRDNumber));
    equal = equal && (this.fstrCnvEmployeeName == null ? that.fstrCnvEmployeeName == null : this.fstrCnvEmployeeName.equals(that.fstrCnvEmployeeName));
    equal = equal && (this.fstrCnvTaxCode == null ? that.fstrCnvTaxCode == null : this.fstrCnvTaxCode.equals(that.fstrCnvTaxCode));
    equal = equal && (this.fcurCnvKiwiSaverDeductions == null ? that.fcurCnvKiwiSaverDeductions == null : this.fcurCnvKiwiSaverDeductions.equals(that.fcurCnvKiwiSaverDeductions));
    equal = equal && (this.fcurCnvKiwiSaverContributions == null ? that.fcurCnvKiwiSaverContributions == null : this.fcurCnvKiwiSaverContributions.equals(that.fcurCnvKiwiSaverContributions));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_ksslineitem)) {
      return false;
    }
    tblnz_ksslineitem that = (tblnz_ksslineitem) o;
    boolean equal = true;
    equal = equal && (this.flngReturnKey == null ? that.flngReturnKey == null : this.flngReturnKey.equals(that.flngReturnKey));
    equal = equal && (this.flngItemNumber == null ? that.flngItemNumber == null : this.flngItemNumber.equals(that.flngItemNumber));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.fdtmPayDayPeriod == null ? that.fdtmPayDayPeriod == null : this.fdtmPayDayPeriod.equals(that.fdtmPayDayPeriod));
    equal = equal && (this.fi64KSEContributionKey == null ? that.fi64KSEContributionKey == null : this.fi64KSEContributionKey.equals(that.fi64KSEContributionKey));
    equal = equal && (this.fi64KSRContributionKey == null ? that.fi64KSRContributionKey == null : this.fi64KSRContributionKey.equals(that.fi64KSRContributionKey));
    equal = equal && (this.fblnReversed == null ? that.fblnReversed == null : this.fblnReversed.equals(that.fblnReversed));
    equal = equal && (this.fblnKSEConverted == null ? that.fblnKSEConverted == null : this.fblnKSEConverted.equals(that.fblnKSEConverted));
    equal = equal && (this.fblnKSRConverted == null ? that.fblnKSRConverted == null : this.fblnKSRConverted.equals(that.fblnKSRConverted));
    equal = equal && (this.fstrCnvIRDNumber == null ? that.fstrCnvIRDNumber == null : this.fstrCnvIRDNumber.equals(that.fstrCnvIRDNumber));
    equal = equal && (this.fstrCnvEmployeeName == null ? that.fstrCnvEmployeeName == null : this.fstrCnvEmployeeName.equals(that.fstrCnvEmployeeName));
    equal = equal && (this.fstrCnvTaxCode == null ? that.fstrCnvTaxCode == null : this.fstrCnvTaxCode.equals(that.fstrCnvTaxCode));
    equal = equal && (this.fcurCnvKiwiSaverDeductions == null ? that.fcurCnvKiwiSaverDeductions == null : this.fcurCnvKiwiSaverDeductions.equals(that.fcurCnvKiwiSaverDeductions));
    equal = equal && (this.fcurCnvKiwiSaverContributions == null ? that.fcurCnvKiwiSaverContributions == null : this.fcurCnvKiwiSaverContributions.equals(that.fcurCnvKiwiSaverContributions));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngReturnKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngItemNumber = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.fdtmPayDayPeriod = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.fi64KSEContributionKey = JdbcWritableBridge.readLong(6, __dbResults);
    this.fi64KSRContributionKey = JdbcWritableBridge.readLong(7, __dbResults);
    this.fblnReversed = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fblnKSEConverted = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fblnKSRConverted = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fstrCnvIRDNumber = JdbcWritableBridge.readString(11, __dbResults);
    this.fstrCnvEmployeeName = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrCnvTaxCode = JdbcWritableBridge.readString(13, __dbResults);
    this.fcurCnvKiwiSaverDeductions = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurCnvKiwiSaverContributions = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(16, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(17, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngReturnKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngItemNumber = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.fdtmPayDayPeriod = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.fi64KSEContributionKey = JdbcWritableBridge.readLong(6, __dbResults);
    this.fi64KSRContributionKey = JdbcWritableBridge.readLong(7, __dbResults);
    this.fblnReversed = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fblnKSEConverted = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fblnKSRConverted = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fstrCnvIRDNumber = JdbcWritableBridge.readString(11, __dbResults);
    this.fstrCnvEmployeeName = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrCnvTaxCode = JdbcWritableBridge.readString(13, __dbResults);
    this.fcurCnvKiwiSaverDeductions = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurCnvKiwiSaverContributions = JdbcWritableBridge.readBigDecimal(15, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngReturnKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngItemNumber, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPayDayPeriod, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeLong(fi64KSEContributionKey, 6 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(fi64KSRContributionKey, 7 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnReversed, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnKSEConverted, 9 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnKSRConverted, 10 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrCnvIRDNumber, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCnvEmployeeName, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCnvTaxCode, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCnvKiwiSaverDeductions, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCnvKiwiSaverContributions, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 17 + __off, 93, __dbStmt);
    return 17;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngReturnKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngItemNumber, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPayDayPeriod, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeLong(fi64KSEContributionKey, 6 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(fi64KSRContributionKey, 7 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnReversed, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnKSEConverted, 9 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnKSRConverted, 10 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrCnvIRDNumber, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCnvEmployeeName, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCnvTaxCode, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCnvKiwiSaverDeductions, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCnvKiwiSaverContributions, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 17 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngReturnKey = null;
    } else {
    this.flngReturnKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngItemNumber = null;
    } else {
    this.flngItemNumber = Integer.valueOf(__dataIn.readInt());
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
        this.fdtmPayDayPeriod = null;
    } else {
    this.fdtmPayDayPeriod = new Timestamp(__dataIn.readLong());
    this.fdtmPayDayPeriod.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fi64KSEContributionKey = null;
    } else {
    this.fi64KSEContributionKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.fi64KSRContributionKey = null;
    } else {
    this.fi64KSRContributionKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnReversed = null;
    } else {
    this.fblnReversed = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnKSEConverted = null;
    } else {
    this.fblnKSEConverted = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnKSRConverted = null;
    } else {
    this.fblnKSRConverted = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCnvIRDNumber = null;
    } else {
    this.fstrCnvIRDNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCnvEmployeeName = null;
    } else {
    this.fstrCnvEmployeeName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCnvTaxCode = null;
    } else {
    this.fstrCnvTaxCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurCnvKiwiSaverDeductions = null;
    } else {
    this.fcurCnvKiwiSaverDeductions = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurCnvKiwiSaverContributions = null;
    } else {
    this.fcurCnvKiwiSaverContributions = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.flngReturnKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngReturnKey);
    }
    if (null == this.flngItemNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngItemNumber);
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
    if (null == this.fdtmPayDayPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPayDayPeriod.getTime());
    __dataOut.writeInt(this.fdtmPayDayPeriod.getNanos());
    }
    if (null == this.fi64KSEContributionKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64KSEContributionKey);
    }
    if (null == this.fi64KSRContributionKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64KSRContributionKey);
    }
    if (null == this.fblnReversed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnReversed);
    }
    if (null == this.fblnKSEConverted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnKSEConverted);
    }
    if (null == this.fblnKSRConverted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnKSRConverted);
    }
    if (null == this.fstrCnvIRDNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCnvIRDNumber);
    }
    if (null == this.fstrCnvEmployeeName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCnvEmployeeName);
    }
    if (null == this.fstrCnvTaxCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCnvTaxCode);
    }
    if (null == this.fcurCnvKiwiSaverDeductions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCnvKiwiSaverDeductions, __dataOut);
    }
    if (null == this.fcurCnvKiwiSaverContributions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCnvKiwiSaverContributions, __dataOut);
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
    if (null == this.flngReturnKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngReturnKey);
    }
    if (null == this.flngItemNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngItemNumber);
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
    if (null == this.fdtmPayDayPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPayDayPeriod.getTime());
    __dataOut.writeInt(this.fdtmPayDayPeriod.getNanos());
    }
    if (null == this.fi64KSEContributionKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64KSEContributionKey);
    }
    if (null == this.fi64KSRContributionKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64KSRContributionKey);
    }
    if (null == this.fblnReversed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnReversed);
    }
    if (null == this.fblnKSEConverted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnKSEConverted);
    }
    if (null == this.fblnKSRConverted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnKSRConverted);
    }
    if (null == this.fstrCnvIRDNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCnvIRDNumber);
    }
    if (null == this.fstrCnvEmployeeName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCnvEmployeeName);
    }
    if (null == this.fstrCnvTaxCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCnvTaxCode);
    }
    if (null == this.fcurCnvKiwiSaverDeductions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCnvKiwiSaverDeductions, __dataOut);
    }
    if (null == this.fcurCnvKiwiSaverContributions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCnvKiwiSaverContributions, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngReturnKey==null?"\\N":"" + flngReturnKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngItemNumber==null?"\\N":"" + flngItemNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPayDayPeriod==null?"\\N":"" + fdtmPayDayPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64KSEContributionKey==null?"\\N":"" + fi64KSEContributionKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64KSRContributionKey==null?"\\N":"" + fi64KSRContributionKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnReversed==null?"\\N":"" + fblnReversed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnKSEConverted==null?"\\N":"" + fblnKSEConverted, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnKSRConverted==null?"\\N":"" + fblnKSRConverted, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCnvIRDNumber==null?"\\N":fstrCnvIRDNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCnvEmployeeName==null?"\\N":fstrCnvEmployeeName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCnvTaxCode==null?"\\N":fstrCnvTaxCode, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCnvKiwiSaverDeductions==null?"\\N":fcurCnvKiwiSaverDeductions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCnvKiwiSaverContributions==null?"\\N":fcurCnvKiwiSaverContributions.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngReturnKey==null?"\\N":"" + flngReturnKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngItemNumber==null?"\\N":"" + flngItemNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPayDayPeriod==null?"\\N":"" + fdtmPayDayPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64KSEContributionKey==null?"\\N":"" + fi64KSEContributionKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64KSRContributionKey==null?"\\N":"" + fi64KSRContributionKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnReversed==null?"\\N":"" + fblnReversed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnKSEConverted==null?"\\N":"" + fblnKSEConverted, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnKSRConverted==null?"\\N":"" + fblnKSRConverted, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCnvIRDNumber==null?"\\N":fstrCnvIRDNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCnvEmployeeName==null?"\\N":fstrCnvEmployeeName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCnvTaxCode==null?"\\N":fstrCnvTaxCode, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCnvKiwiSaverDeductions==null?"\\N":fcurCnvKiwiSaverDeductions.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCnvKiwiSaverContributions==null?"\\N":fcurCnvKiwiSaverContributions.toPlainString(), delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngReturnKey = null; } else {
      this.flngReturnKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngItemNumber = null; } else {
      this.flngItemNumber = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPayDayPeriod = null; } else {
      this.fdtmPayDayPeriod = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64KSEContributionKey = null; } else {
      this.fi64KSEContributionKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64KSRContributionKey = null; } else {
      this.fi64KSRContributionKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnReversed = null; } else {
      this.fblnReversed = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnKSEConverted = null; } else {
      this.fblnKSEConverted = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnKSRConverted = null; } else {
      this.fblnKSRConverted = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCnvIRDNumber = null; } else {
      this.fstrCnvIRDNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCnvEmployeeName = null; } else {
      this.fstrCnvEmployeeName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCnvTaxCode = null; } else {
      this.fstrCnvTaxCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCnvKiwiSaverDeductions = null; } else {
      this.fcurCnvKiwiSaverDeductions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCnvKiwiSaverContributions = null; } else {
      this.fcurCnvKiwiSaverContributions = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngReturnKey = null; } else {
      this.flngReturnKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngItemNumber = null; } else {
      this.flngItemNumber = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPayDayPeriod = null; } else {
      this.fdtmPayDayPeriod = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64KSEContributionKey = null; } else {
      this.fi64KSEContributionKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64KSRContributionKey = null; } else {
      this.fi64KSRContributionKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnReversed = null; } else {
      this.fblnReversed = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnKSEConverted = null; } else {
      this.fblnKSEConverted = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnKSRConverted = null; } else {
      this.fblnKSRConverted = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCnvIRDNumber = null; } else {
      this.fstrCnvIRDNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCnvEmployeeName = null; } else {
      this.fstrCnvEmployeeName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCnvTaxCode = null; } else {
      this.fstrCnvTaxCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCnvKiwiSaverDeductions = null; } else {
      this.fcurCnvKiwiSaverDeductions = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCnvKiwiSaverContributions = null; } else {
      this.fcurCnvKiwiSaverContributions = new java.math.BigDecimal(__cur_str);
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
    tblnz_ksslineitem o = (tblnz_ksslineitem) super.clone();
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmPayDayPeriod = (o.fdtmPayDayPeriod != null) ? (java.sql.Timestamp) o.fdtmPayDayPeriod.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_ksslineitem o) throws CloneNotSupportedException {
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmPayDayPeriod = (o.fdtmPayDayPeriod != null) ? (java.sql.Timestamp) o.fdtmPayDayPeriod.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngReturnKey", this.flngReturnKey);
    __sqoop$field_map.put("flngItemNumber", this.flngItemNumber);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("fdtmPayDayPeriod", this.fdtmPayDayPeriod);
    __sqoop$field_map.put("fi64KSEContributionKey", this.fi64KSEContributionKey);
    __sqoop$field_map.put("fi64KSRContributionKey", this.fi64KSRContributionKey);
    __sqoop$field_map.put("fblnReversed", this.fblnReversed);
    __sqoop$field_map.put("fblnKSEConverted", this.fblnKSEConverted);
    __sqoop$field_map.put("fblnKSRConverted", this.fblnKSRConverted);
    __sqoop$field_map.put("fstrCnvIRDNumber", this.fstrCnvIRDNumber);
    __sqoop$field_map.put("fstrCnvEmployeeName", this.fstrCnvEmployeeName);
    __sqoop$field_map.put("fstrCnvTaxCode", this.fstrCnvTaxCode);
    __sqoop$field_map.put("fcurCnvKiwiSaverDeductions", this.fcurCnvKiwiSaverDeductions);
    __sqoop$field_map.put("fcurCnvKiwiSaverContributions", this.fcurCnvKiwiSaverContributions);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngReturnKey", this.flngReturnKey);
    __sqoop$field_map.put("flngItemNumber", this.flngItemNumber);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("fdtmPayDayPeriod", this.fdtmPayDayPeriod);
    __sqoop$field_map.put("fi64KSEContributionKey", this.fi64KSEContributionKey);
    __sqoop$field_map.put("fi64KSRContributionKey", this.fi64KSRContributionKey);
    __sqoop$field_map.put("fblnReversed", this.fblnReversed);
    __sqoop$field_map.put("fblnKSEConverted", this.fblnKSEConverted);
    __sqoop$field_map.put("fblnKSRConverted", this.fblnKSRConverted);
    __sqoop$field_map.put("fstrCnvIRDNumber", this.fstrCnvIRDNumber);
    __sqoop$field_map.put("fstrCnvEmployeeName", this.fstrCnvEmployeeName);
    __sqoop$field_map.put("fstrCnvTaxCode", this.fstrCnvTaxCode);
    __sqoop$field_map.put("fcurCnvKiwiSaverDeductions", this.fcurCnvKiwiSaverDeductions);
    __sqoop$field_map.put("fcurCnvKiwiSaverContributions", this.fcurCnvKiwiSaverContributions);
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
