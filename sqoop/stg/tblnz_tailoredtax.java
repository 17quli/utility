// ORM class for table 'tblnz_tailoredtax'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 04:49:39 NZDT 2020
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

public class tblnz_tailoredtax extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngEmployeeAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tailoredtax.this.flngEmployeeAccountKey = (Integer)value;
      }
    });
    setters.put("flngEmployerAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tailoredtax.this.flngEmployerAccountKey = (Integer)value;
      }
    });
    setters.put("fintTaxYear", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tailoredtax.this.fintTaxYear = (Integer)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tailoredtax.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tailoredtax.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("flngCaseKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tailoredtax.this.flngCaseKey = (Integer)value;
      }
    });
    setters.put("fblnTailoredTaxCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tailoredtax.this.fblnTailoredTaxCode = (Integer)value;
      }
    });
    setters.put("fblnTailoredTaxRate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tailoredtax.this.fblnTailoredTaxRate = (Integer)value;
      }
    });
    setters.put("fdblRate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tailoredtax.this.fdblRate = (Double)value;
      }
    });
    setters.put("fdtmCommence", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tailoredtax.this.fdtmCommence = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmCease", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tailoredtax.this.fdtmCease = (java.sql.Timestamp)value;
      }
    });
    setters.put("flngEmployerMailItemKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tailoredtax.this.flngEmployerMailItemKey = (Integer)value;
      }
    });
    setters.put("fstrWorkAndIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tailoredtax.this.fstrWorkAndIncome = (String)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tailoredtax.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tailoredtax.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_tailoredtax() {
    init0();
  }
  private Integer flngEmployeeAccountKey;
  public Integer get_flngEmployeeAccountKey() {
    return flngEmployeeAccountKey;
  }
  public void set_flngEmployeeAccountKey(Integer flngEmployeeAccountKey) {
    this.flngEmployeeAccountKey = flngEmployeeAccountKey;
  }
  public tblnz_tailoredtax with_flngEmployeeAccountKey(Integer flngEmployeeAccountKey) {
    this.flngEmployeeAccountKey = flngEmployeeAccountKey;
    return this;
  }
  private Integer flngEmployerAccountKey;
  public Integer get_flngEmployerAccountKey() {
    return flngEmployerAccountKey;
  }
  public void set_flngEmployerAccountKey(Integer flngEmployerAccountKey) {
    this.flngEmployerAccountKey = flngEmployerAccountKey;
  }
  public tblnz_tailoredtax with_flngEmployerAccountKey(Integer flngEmployerAccountKey) {
    this.flngEmployerAccountKey = flngEmployerAccountKey;
    return this;
  }
  private Integer fintTaxYear;
  public Integer get_fintTaxYear() {
    return fintTaxYear;
  }
  public void set_fintTaxYear(Integer fintTaxYear) {
    this.fintTaxYear = fintTaxYear;
  }
  public tblnz_tailoredtax with_fintTaxYear(Integer fintTaxYear) {
    this.fintTaxYear = fintTaxYear;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblnz_tailoredtax with_flngVer(Integer flngVer) {
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
  public tblnz_tailoredtax with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private Integer flngCaseKey;
  public Integer get_flngCaseKey() {
    return flngCaseKey;
  }
  public void set_flngCaseKey(Integer flngCaseKey) {
    this.flngCaseKey = flngCaseKey;
  }
  public tblnz_tailoredtax with_flngCaseKey(Integer flngCaseKey) {
    this.flngCaseKey = flngCaseKey;
    return this;
  }
  private Integer fblnTailoredTaxCode;
  public Integer get_fblnTailoredTaxCode() {
    return fblnTailoredTaxCode;
  }
  public void set_fblnTailoredTaxCode(Integer fblnTailoredTaxCode) {
    this.fblnTailoredTaxCode = fblnTailoredTaxCode;
  }
  public tblnz_tailoredtax with_fblnTailoredTaxCode(Integer fblnTailoredTaxCode) {
    this.fblnTailoredTaxCode = fblnTailoredTaxCode;
    return this;
  }
  private Integer fblnTailoredTaxRate;
  public Integer get_fblnTailoredTaxRate() {
    return fblnTailoredTaxRate;
  }
  public void set_fblnTailoredTaxRate(Integer fblnTailoredTaxRate) {
    this.fblnTailoredTaxRate = fblnTailoredTaxRate;
  }
  public tblnz_tailoredtax with_fblnTailoredTaxRate(Integer fblnTailoredTaxRate) {
    this.fblnTailoredTaxRate = fblnTailoredTaxRate;
    return this;
  }
  private Double fdblRate;
  public Double get_fdblRate() {
    return fdblRate;
  }
  public void set_fdblRate(Double fdblRate) {
    this.fdblRate = fdblRate;
  }
  public tblnz_tailoredtax with_fdblRate(Double fdblRate) {
    this.fdblRate = fdblRate;
    return this;
  }
  private java.sql.Timestamp fdtmCommence;
  public java.sql.Timestamp get_fdtmCommence() {
    return fdtmCommence;
  }
  public void set_fdtmCommence(java.sql.Timestamp fdtmCommence) {
    this.fdtmCommence = fdtmCommence;
  }
  public tblnz_tailoredtax with_fdtmCommence(java.sql.Timestamp fdtmCommence) {
    this.fdtmCommence = fdtmCommence;
    return this;
  }
  private java.sql.Timestamp fdtmCease;
  public java.sql.Timestamp get_fdtmCease() {
    return fdtmCease;
  }
  public void set_fdtmCease(java.sql.Timestamp fdtmCease) {
    this.fdtmCease = fdtmCease;
  }
  public tblnz_tailoredtax with_fdtmCease(java.sql.Timestamp fdtmCease) {
    this.fdtmCease = fdtmCease;
    return this;
  }
  private Integer flngEmployerMailItemKey;
  public Integer get_flngEmployerMailItemKey() {
    return flngEmployerMailItemKey;
  }
  public void set_flngEmployerMailItemKey(Integer flngEmployerMailItemKey) {
    this.flngEmployerMailItemKey = flngEmployerMailItemKey;
  }
  public tblnz_tailoredtax with_flngEmployerMailItemKey(Integer flngEmployerMailItemKey) {
    this.flngEmployerMailItemKey = flngEmployerMailItemKey;
    return this;
  }
  private String fstrWorkAndIncome;
  public String get_fstrWorkAndIncome() {
    return fstrWorkAndIncome;
  }
  public void set_fstrWorkAndIncome(String fstrWorkAndIncome) {
    this.fstrWorkAndIncome = fstrWorkAndIncome;
  }
  public tblnz_tailoredtax with_fstrWorkAndIncome(String fstrWorkAndIncome) {
    this.fstrWorkAndIncome = fstrWorkAndIncome;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_tailoredtax with_fstrWho(String fstrWho) {
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
  public tblnz_tailoredtax with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_tailoredtax)) {
      return false;
    }
    tblnz_tailoredtax that = (tblnz_tailoredtax) o;
    boolean equal = true;
    equal = equal && (this.flngEmployeeAccountKey == null ? that.flngEmployeeAccountKey == null : this.flngEmployeeAccountKey.equals(that.flngEmployeeAccountKey));
    equal = equal && (this.flngEmployerAccountKey == null ? that.flngEmployerAccountKey == null : this.flngEmployerAccountKey.equals(that.flngEmployerAccountKey));
    equal = equal && (this.fintTaxYear == null ? that.fintTaxYear == null : this.fintTaxYear.equals(that.fintTaxYear));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngCaseKey == null ? that.flngCaseKey == null : this.flngCaseKey.equals(that.flngCaseKey));
    equal = equal && (this.fblnTailoredTaxCode == null ? that.fblnTailoredTaxCode == null : this.fblnTailoredTaxCode.equals(that.fblnTailoredTaxCode));
    equal = equal && (this.fblnTailoredTaxRate == null ? that.fblnTailoredTaxRate == null : this.fblnTailoredTaxRate.equals(that.fblnTailoredTaxRate));
    equal = equal && (this.fdblRate == null ? that.fdblRate == null : this.fdblRate.equals(that.fdblRate));
    equal = equal && (this.fdtmCommence == null ? that.fdtmCommence == null : this.fdtmCommence.equals(that.fdtmCommence));
    equal = equal && (this.fdtmCease == null ? that.fdtmCease == null : this.fdtmCease.equals(that.fdtmCease));
    equal = equal && (this.flngEmployerMailItemKey == null ? that.flngEmployerMailItemKey == null : this.flngEmployerMailItemKey.equals(that.flngEmployerMailItemKey));
    equal = equal && (this.fstrWorkAndIncome == null ? that.fstrWorkAndIncome == null : this.fstrWorkAndIncome.equals(that.fstrWorkAndIncome));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_tailoredtax)) {
      return false;
    }
    tblnz_tailoredtax that = (tblnz_tailoredtax) o;
    boolean equal = true;
    equal = equal && (this.flngEmployeeAccountKey == null ? that.flngEmployeeAccountKey == null : this.flngEmployeeAccountKey.equals(that.flngEmployeeAccountKey));
    equal = equal && (this.flngEmployerAccountKey == null ? that.flngEmployerAccountKey == null : this.flngEmployerAccountKey.equals(that.flngEmployerAccountKey));
    equal = equal && (this.fintTaxYear == null ? that.fintTaxYear == null : this.fintTaxYear.equals(that.fintTaxYear));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngCaseKey == null ? that.flngCaseKey == null : this.flngCaseKey.equals(that.flngCaseKey));
    equal = equal && (this.fblnTailoredTaxCode == null ? that.fblnTailoredTaxCode == null : this.fblnTailoredTaxCode.equals(that.fblnTailoredTaxCode));
    equal = equal && (this.fblnTailoredTaxRate == null ? that.fblnTailoredTaxRate == null : this.fblnTailoredTaxRate.equals(that.fblnTailoredTaxRate));
    equal = equal && (this.fdblRate == null ? that.fdblRate == null : this.fdblRate.equals(that.fdblRate));
    equal = equal && (this.fdtmCommence == null ? that.fdtmCommence == null : this.fdtmCommence.equals(that.fdtmCommence));
    equal = equal && (this.fdtmCease == null ? that.fdtmCease == null : this.fdtmCease.equals(that.fdtmCease));
    equal = equal && (this.flngEmployerMailItemKey == null ? that.flngEmployerMailItemKey == null : this.flngEmployerMailItemKey.equals(that.flngEmployerMailItemKey));
    equal = equal && (this.fstrWorkAndIncome == null ? that.fstrWorkAndIncome == null : this.fstrWorkAndIncome.equals(that.fstrWorkAndIncome));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngEmployeeAccountKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngEmployerAccountKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fintTaxYear = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(5, __dbResults);
    this.flngCaseKey = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fblnTailoredTaxCode = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fblnTailoredTaxRate = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fdblRate = JdbcWritableBridge.readDouble(9, __dbResults);
    this.fdtmCommence = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.fdtmCease = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.flngEmployerMailItemKey = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fstrWorkAndIncome = JdbcWritableBridge.readString(13, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(14, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(15, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngEmployeeAccountKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngEmployerAccountKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fintTaxYear = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(5, __dbResults);
    this.flngCaseKey = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fblnTailoredTaxCode = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fblnTailoredTaxRate = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fdblRate = JdbcWritableBridge.readDouble(9, __dbResults);
    this.fdtmCommence = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.fdtmCease = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.flngEmployerMailItemKey = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fstrWorkAndIncome = JdbcWritableBridge.readString(13, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(14, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(15, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngEmployeeAccountKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngEmployerAccountKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintTaxYear, 3 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCaseKey, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnTailoredTaxCode, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnTailoredTaxRate, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeDouble(fdblRate, 9 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCommence, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCease, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngEmployerMailItemKey, 12 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrWorkAndIncome, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 15 + __off, 93, __dbStmt);
    return 15;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngEmployeeAccountKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngEmployerAccountKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintTaxYear, 3 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCaseKey, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnTailoredTaxCode, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnTailoredTaxRate, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeDouble(fdblRate, 9 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCommence, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCease, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngEmployerMailItemKey, 12 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrWorkAndIncome, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 15 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngEmployeeAccountKey = null;
    } else {
    this.flngEmployeeAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngEmployerAccountKey = null;
    } else {
    this.flngEmployerAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintTaxYear = null;
    } else {
    this.fintTaxYear = Integer.valueOf(__dataIn.readInt());
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
        this.flngCaseKey = null;
    } else {
    this.flngCaseKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnTailoredTaxCode = null;
    } else {
    this.fblnTailoredTaxCode = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnTailoredTaxRate = null;
    } else {
    this.fblnTailoredTaxRate = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdblRate = null;
    } else {
    this.fdblRate = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmCommence = null;
    } else {
    this.fdtmCommence = new Timestamp(__dataIn.readLong());
    this.fdtmCommence.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmCease = null;
    } else {
    this.fdtmCease = new Timestamp(__dataIn.readLong());
    this.fdtmCease.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngEmployerMailItemKey = null;
    } else {
    this.flngEmployerMailItemKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrWorkAndIncome = null;
    } else {
    this.fstrWorkAndIncome = Text.readString(__dataIn);
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
    if (null == this.flngEmployeeAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngEmployeeAccountKey);
    }
    if (null == this.flngEmployerAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngEmployerAccountKey);
    }
    if (null == this.fintTaxYear) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintTaxYear);
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
    if (null == this.flngCaseKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCaseKey);
    }
    if (null == this.fblnTailoredTaxCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnTailoredTaxCode);
    }
    if (null == this.fblnTailoredTaxRate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnTailoredTaxRate);
    }
    if (null == this.fdblRate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.fdblRate);
    }
    if (null == this.fdtmCommence) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCommence.getTime());
    __dataOut.writeInt(this.fdtmCommence.getNanos());
    }
    if (null == this.fdtmCease) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCease.getTime());
    __dataOut.writeInt(this.fdtmCease.getNanos());
    }
    if (null == this.flngEmployerMailItemKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngEmployerMailItemKey);
    }
    if (null == this.fstrWorkAndIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWorkAndIncome);
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
    if (null == this.flngEmployeeAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngEmployeeAccountKey);
    }
    if (null == this.flngEmployerAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngEmployerAccountKey);
    }
    if (null == this.fintTaxYear) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintTaxYear);
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
    if (null == this.flngCaseKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCaseKey);
    }
    if (null == this.fblnTailoredTaxCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnTailoredTaxCode);
    }
    if (null == this.fblnTailoredTaxRate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnTailoredTaxRate);
    }
    if (null == this.fdblRate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.fdblRate);
    }
    if (null == this.fdtmCommence) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCommence.getTime());
    __dataOut.writeInt(this.fdtmCommence.getNanos());
    }
    if (null == this.fdtmCease) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCease.getTime());
    __dataOut.writeInt(this.fdtmCease.getNanos());
    }
    if (null == this.flngEmployerMailItemKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngEmployerMailItemKey);
    }
    if (null == this.fstrWorkAndIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWorkAndIncome);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngEmployeeAccountKey==null?"\\N":"" + flngEmployeeAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngEmployerAccountKey==null?"\\N":"" + flngEmployerAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintTaxYear==null?"\\N":"" + fintTaxYear, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCaseKey==null?"\\N":"" + flngCaseKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnTailoredTaxCode==null?"\\N":"" + fblnTailoredTaxCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnTailoredTaxRate==null?"\\N":"" + fblnTailoredTaxRate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdblRate==null?"\\N":"" + fdblRate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCommence==null?"\\N":"" + fdtmCommence, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCease==null?"\\N":"" + fdtmCease, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngEmployerMailItemKey==null?"\\N":"" + flngEmployerMailItemKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWorkAndIncome==null?"\\N":fstrWorkAndIncome, " ", delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngEmployeeAccountKey==null?"\\N":"" + flngEmployeeAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngEmployerAccountKey==null?"\\N":"" + flngEmployerAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintTaxYear==null?"\\N":"" + fintTaxYear, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCaseKey==null?"\\N":"" + flngCaseKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnTailoredTaxCode==null?"\\N":"" + fblnTailoredTaxCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnTailoredTaxRate==null?"\\N":"" + fblnTailoredTaxRate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdblRate==null?"\\N":"" + fdblRate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCommence==null?"\\N":"" + fdtmCommence, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCease==null?"\\N":"" + fdtmCease, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngEmployerMailItemKey==null?"\\N":"" + flngEmployerMailItemKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWorkAndIncome==null?"\\N":fstrWorkAndIncome, " ", delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngEmployeeAccountKey = null; } else {
      this.flngEmployeeAccountKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintTaxYear = null; } else {
      this.fintTaxYear = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCaseKey = null; } else {
      this.flngCaseKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnTailoredTaxCode = null; } else {
      this.fblnTailoredTaxCode = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnTailoredTaxRate = null; } else {
      this.fblnTailoredTaxRate = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdblRate = null; } else {
      this.fdblRate = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCommence = null; } else {
      this.fdtmCommence = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCease = null; } else {
      this.fdtmCease = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngEmployerMailItemKey = null; } else {
      this.flngEmployerMailItemKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrWorkAndIncome = null; } else {
      this.fstrWorkAndIncome = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngEmployeeAccountKey = null; } else {
      this.flngEmployeeAccountKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintTaxYear = null; } else {
      this.fintTaxYear = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCaseKey = null; } else {
      this.flngCaseKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnTailoredTaxCode = null; } else {
      this.fblnTailoredTaxCode = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnTailoredTaxRate = null; } else {
      this.fblnTailoredTaxRate = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdblRate = null; } else {
      this.fdblRate = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCommence = null; } else {
      this.fdtmCommence = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCease = null; } else {
      this.fdtmCease = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngEmployerMailItemKey = null; } else {
      this.flngEmployerMailItemKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrWorkAndIncome = null; } else {
      this.fstrWorkAndIncome = __cur_str;
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
    tblnz_tailoredtax o = (tblnz_tailoredtax) super.clone();
    o.fdtmCommence = (o.fdtmCommence != null) ? (java.sql.Timestamp) o.fdtmCommence.clone() : null;
    o.fdtmCease = (o.fdtmCease != null) ? (java.sql.Timestamp) o.fdtmCease.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_tailoredtax o) throws CloneNotSupportedException {
    o.fdtmCommence = (o.fdtmCommence != null) ? (java.sql.Timestamp) o.fdtmCommence.clone() : null;
    o.fdtmCease = (o.fdtmCease != null) ? (java.sql.Timestamp) o.fdtmCease.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngEmployeeAccountKey", this.flngEmployeeAccountKey);
    __sqoop$field_map.put("flngEmployerAccountKey", this.flngEmployerAccountKey);
    __sqoop$field_map.put("fintTaxYear", this.fintTaxYear);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngCaseKey", this.flngCaseKey);
    __sqoop$field_map.put("fblnTailoredTaxCode", this.fblnTailoredTaxCode);
    __sqoop$field_map.put("fblnTailoredTaxRate", this.fblnTailoredTaxRate);
    __sqoop$field_map.put("fdblRate", this.fdblRate);
    __sqoop$field_map.put("fdtmCommence", this.fdtmCommence);
    __sqoop$field_map.put("fdtmCease", this.fdtmCease);
    __sqoop$field_map.put("flngEmployerMailItemKey", this.flngEmployerMailItemKey);
    __sqoop$field_map.put("fstrWorkAndIncome", this.fstrWorkAndIncome);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngEmployeeAccountKey", this.flngEmployeeAccountKey);
    __sqoop$field_map.put("flngEmployerAccountKey", this.flngEmployerAccountKey);
    __sqoop$field_map.put("fintTaxYear", this.fintTaxYear);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngCaseKey", this.flngCaseKey);
    __sqoop$field_map.put("fblnTailoredTaxCode", this.fblnTailoredTaxCode);
    __sqoop$field_map.put("fblnTailoredTaxRate", this.fblnTailoredTaxRate);
    __sqoop$field_map.put("fdblRate", this.fdblRate);
    __sqoop$field_map.put("fdtmCommence", this.fdtmCommence);
    __sqoop$field_map.put("fdtmCease", this.fdtmCease);
    __sqoop$field_map.put("flngEmployerMailItemKey", this.flngEmployerMailItemKey);
    __sqoop$field_map.put("fstrWorkAndIncome", this.fstrWorkAndIncome);
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
