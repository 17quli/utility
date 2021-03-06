// ORM class for table 'tblnz_incorrectdedcasedetails'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 03:32:04 NZDT 2020
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

public class tblnz_incorrectdedcasedetails extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incorrectdedcasedetails.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("flngCaseKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incorrectdedcasedetails.this.flngCaseKey = (Integer)value;
      }
    });
    setters.put("flngAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incorrectdedcasedetails.this.flngAccountKey = (Integer)value;
      }
    });
    setters.put("flngGarnishKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incorrectdedcasedetails.this.flngGarnishKey = (Integer)value;
      }
    });
    setters.put("fdtmPaymentFrom", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incorrectdedcasedetails.this.fdtmPaymentFrom = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmPaymentTo", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incorrectdedcasedetails.this.fdtmPaymentTo = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrEmployerIRD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incorrectdedcasedetails.this.fstrEmployerIRD = (String)value;
      }
    });
    setters.put("fstrEmployerName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incorrectdedcasedetails.this.fstrEmployerName = (String)value;
      }
    });
    setters.put("fstrInterventionReason", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incorrectdedcasedetails.this.fstrInterventionReason = (String)value;
      }
    });
    setters.put("fblnUnderDeduction", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incorrectdedcasedetails.this.fblnUnderDeduction = (Integer)value;
      }
    });
    setters.put("fcurUnderDeductionAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incorrectdedcasedetails.this.fcurUnderDeductionAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurUnderDeductionExpected", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incorrectdedcasedetails.this.fcurUnderDeductionExpected = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurUnderDeductionReceived", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incorrectdedcasedetails.this.fcurUnderDeductionReceived = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incorrectdedcasedetails.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incorrectdedcasedetails.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_incorrectdedcasedetails() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_incorrectdedcasedetails with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private Integer flngCaseKey;
  public Integer get_flngCaseKey() {
    return flngCaseKey;
  }
  public void set_flngCaseKey(Integer flngCaseKey) {
    this.flngCaseKey = flngCaseKey;
  }
  public tblnz_incorrectdedcasedetails with_flngCaseKey(Integer flngCaseKey) {
    this.flngCaseKey = flngCaseKey;
    return this;
  }
  private Integer flngAccountKey;
  public Integer get_flngAccountKey() {
    return flngAccountKey;
  }
  public void set_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
  }
  public tblnz_incorrectdedcasedetails with_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
    return this;
  }
  private Integer flngGarnishKey;
  public Integer get_flngGarnishKey() {
    return flngGarnishKey;
  }
  public void set_flngGarnishKey(Integer flngGarnishKey) {
    this.flngGarnishKey = flngGarnishKey;
  }
  public tblnz_incorrectdedcasedetails with_flngGarnishKey(Integer flngGarnishKey) {
    this.flngGarnishKey = flngGarnishKey;
    return this;
  }
  private java.sql.Timestamp fdtmPaymentFrom;
  public java.sql.Timestamp get_fdtmPaymentFrom() {
    return fdtmPaymentFrom;
  }
  public void set_fdtmPaymentFrom(java.sql.Timestamp fdtmPaymentFrom) {
    this.fdtmPaymentFrom = fdtmPaymentFrom;
  }
  public tblnz_incorrectdedcasedetails with_fdtmPaymentFrom(java.sql.Timestamp fdtmPaymentFrom) {
    this.fdtmPaymentFrom = fdtmPaymentFrom;
    return this;
  }
  private java.sql.Timestamp fdtmPaymentTo;
  public java.sql.Timestamp get_fdtmPaymentTo() {
    return fdtmPaymentTo;
  }
  public void set_fdtmPaymentTo(java.sql.Timestamp fdtmPaymentTo) {
    this.fdtmPaymentTo = fdtmPaymentTo;
  }
  public tblnz_incorrectdedcasedetails with_fdtmPaymentTo(java.sql.Timestamp fdtmPaymentTo) {
    this.fdtmPaymentTo = fdtmPaymentTo;
    return this;
  }
  private String fstrEmployerIRD;
  public String get_fstrEmployerIRD() {
    return fstrEmployerIRD;
  }
  public void set_fstrEmployerIRD(String fstrEmployerIRD) {
    this.fstrEmployerIRD = fstrEmployerIRD;
  }
  public tblnz_incorrectdedcasedetails with_fstrEmployerIRD(String fstrEmployerIRD) {
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
  public tblnz_incorrectdedcasedetails with_fstrEmployerName(String fstrEmployerName) {
    this.fstrEmployerName = fstrEmployerName;
    return this;
  }
  private String fstrInterventionReason;
  public String get_fstrInterventionReason() {
    return fstrInterventionReason;
  }
  public void set_fstrInterventionReason(String fstrInterventionReason) {
    this.fstrInterventionReason = fstrInterventionReason;
  }
  public tblnz_incorrectdedcasedetails with_fstrInterventionReason(String fstrInterventionReason) {
    this.fstrInterventionReason = fstrInterventionReason;
    return this;
  }
  private Integer fblnUnderDeduction;
  public Integer get_fblnUnderDeduction() {
    return fblnUnderDeduction;
  }
  public void set_fblnUnderDeduction(Integer fblnUnderDeduction) {
    this.fblnUnderDeduction = fblnUnderDeduction;
  }
  public tblnz_incorrectdedcasedetails with_fblnUnderDeduction(Integer fblnUnderDeduction) {
    this.fblnUnderDeduction = fblnUnderDeduction;
    return this;
  }
  private java.math.BigDecimal fcurUnderDeductionAmount;
  public java.math.BigDecimal get_fcurUnderDeductionAmount() {
    return fcurUnderDeductionAmount;
  }
  public void set_fcurUnderDeductionAmount(java.math.BigDecimal fcurUnderDeductionAmount) {
    this.fcurUnderDeductionAmount = fcurUnderDeductionAmount;
  }
  public tblnz_incorrectdedcasedetails with_fcurUnderDeductionAmount(java.math.BigDecimal fcurUnderDeductionAmount) {
    this.fcurUnderDeductionAmount = fcurUnderDeductionAmount;
    return this;
  }
  private java.math.BigDecimal fcurUnderDeductionExpected;
  public java.math.BigDecimal get_fcurUnderDeductionExpected() {
    return fcurUnderDeductionExpected;
  }
  public void set_fcurUnderDeductionExpected(java.math.BigDecimal fcurUnderDeductionExpected) {
    this.fcurUnderDeductionExpected = fcurUnderDeductionExpected;
  }
  public tblnz_incorrectdedcasedetails with_fcurUnderDeductionExpected(java.math.BigDecimal fcurUnderDeductionExpected) {
    this.fcurUnderDeductionExpected = fcurUnderDeductionExpected;
    return this;
  }
  private java.math.BigDecimal fcurUnderDeductionReceived;
  public java.math.BigDecimal get_fcurUnderDeductionReceived() {
    return fcurUnderDeductionReceived;
  }
  public void set_fcurUnderDeductionReceived(java.math.BigDecimal fcurUnderDeductionReceived) {
    this.fcurUnderDeductionReceived = fcurUnderDeductionReceived;
  }
  public tblnz_incorrectdedcasedetails with_fcurUnderDeductionReceived(java.math.BigDecimal fcurUnderDeductionReceived) {
    this.fcurUnderDeductionReceived = fcurUnderDeductionReceived;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_incorrectdedcasedetails with_fstrWho(String fstrWho) {
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
  public tblnz_incorrectdedcasedetails with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_incorrectdedcasedetails)) {
      return false;
    }
    tblnz_incorrectdedcasedetails that = (tblnz_incorrectdedcasedetails) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.flngCaseKey == null ? that.flngCaseKey == null : this.flngCaseKey.equals(that.flngCaseKey));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.flngGarnishKey == null ? that.flngGarnishKey == null : this.flngGarnishKey.equals(that.flngGarnishKey));
    equal = equal && (this.fdtmPaymentFrom == null ? that.fdtmPaymentFrom == null : this.fdtmPaymentFrom.equals(that.fdtmPaymentFrom));
    equal = equal && (this.fdtmPaymentTo == null ? that.fdtmPaymentTo == null : this.fdtmPaymentTo.equals(that.fdtmPaymentTo));
    equal = equal && (this.fstrEmployerIRD == null ? that.fstrEmployerIRD == null : this.fstrEmployerIRD.equals(that.fstrEmployerIRD));
    equal = equal && (this.fstrEmployerName == null ? that.fstrEmployerName == null : this.fstrEmployerName.equals(that.fstrEmployerName));
    equal = equal && (this.fstrInterventionReason == null ? that.fstrInterventionReason == null : this.fstrInterventionReason.equals(that.fstrInterventionReason));
    equal = equal && (this.fblnUnderDeduction == null ? that.fblnUnderDeduction == null : this.fblnUnderDeduction.equals(that.fblnUnderDeduction));
    equal = equal && (this.fcurUnderDeductionAmount == null ? that.fcurUnderDeductionAmount == null : this.fcurUnderDeductionAmount.equals(that.fcurUnderDeductionAmount));
    equal = equal && (this.fcurUnderDeductionExpected == null ? that.fcurUnderDeductionExpected == null : this.fcurUnderDeductionExpected.equals(that.fcurUnderDeductionExpected));
    equal = equal && (this.fcurUnderDeductionReceived == null ? that.fcurUnderDeductionReceived == null : this.fcurUnderDeductionReceived.equals(that.fcurUnderDeductionReceived));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_incorrectdedcasedetails)) {
      return false;
    }
    tblnz_incorrectdedcasedetails that = (tblnz_incorrectdedcasedetails) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.flngCaseKey == null ? that.flngCaseKey == null : this.flngCaseKey.equals(that.flngCaseKey));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.flngGarnishKey == null ? that.flngGarnishKey == null : this.flngGarnishKey.equals(that.flngGarnishKey));
    equal = equal && (this.fdtmPaymentFrom == null ? that.fdtmPaymentFrom == null : this.fdtmPaymentFrom.equals(that.fdtmPaymentFrom));
    equal = equal && (this.fdtmPaymentTo == null ? that.fdtmPaymentTo == null : this.fdtmPaymentTo.equals(that.fdtmPaymentTo));
    equal = equal && (this.fstrEmployerIRD == null ? that.fstrEmployerIRD == null : this.fstrEmployerIRD.equals(that.fstrEmployerIRD));
    equal = equal && (this.fstrEmployerName == null ? that.fstrEmployerName == null : this.fstrEmployerName.equals(that.fstrEmployerName));
    equal = equal && (this.fstrInterventionReason == null ? that.fstrInterventionReason == null : this.fstrInterventionReason.equals(that.fstrInterventionReason));
    equal = equal && (this.fblnUnderDeduction == null ? that.fblnUnderDeduction == null : this.fblnUnderDeduction.equals(that.fblnUnderDeduction));
    equal = equal && (this.fcurUnderDeductionAmount == null ? that.fcurUnderDeductionAmount == null : this.fcurUnderDeductionAmount.equals(that.fcurUnderDeductionAmount));
    equal = equal && (this.fcurUnderDeductionExpected == null ? that.fcurUnderDeductionExpected == null : this.fcurUnderDeductionExpected.equals(that.fcurUnderDeductionExpected));
    equal = equal && (this.fcurUnderDeductionReceived == null ? that.fcurUnderDeductionReceived == null : this.fcurUnderDeductionReceived.equals(that.fcurUnderDeductionReceived));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngCaseKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngGarnishKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fdtmPaymentFrom = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.fdtmPaymentTo = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.fstrEmployerIRD = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrEmployerName = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrInterventionReason = JdbcWritableBridge.readString(9, __dbResults);
    this.fblnUnderDeduction = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fcurUnderDeductionAmount = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurUnderDeductionExpected = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurUnderDeductionReceived = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(14, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(15, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngCaseKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngGarnishKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fdtmPaymentFrom = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.fdtmPaymentTo = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.fstrEmployerIRD = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrEmployerName = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrInterventionReason = JdbcWritableBridge.readString(9, __dbResults);
    this.fblnUnderDeduction = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fcurUnderDeductionAmount = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurUnderDeductionExpected = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurUnderDeductionReceived = JdbcWritableBridge.readBigDecimal(13, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCaseKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngGarnishKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPaymentFrom, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPaymentTo, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmployerIRD, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmployerName, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrInterventionReason, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnUnderDeduction, 10 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurUnderDeductionAmount, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurUnderDeductionExpected, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurUnderDeductionReceived, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 15 + __off, 93, __dbStmt);
    return 15;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCaseKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngGarnishKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPaymentFrom, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPaymentTo, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmployerIRD, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmployerName, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrInterventionReason, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnUnderDeduction, 10 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurUnderDeductionAmount, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurUnderDeductionExpected, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurUnderDeductionReceived, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 15 + __off, 93, __dbStmt);
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
        this.flngCaseKey = null;
    } else {
    this.flngCaseKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngAccountKey = null;
    } else {
    this.flngAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngGarnishKey = null;
    } else {
    this.flngGarnishKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmPaymentFrom = null;
    } else {
    this.fdtmPaymentFrom = new Timestamp(__dataIn.readLong());
    this.fdtmPaymentFrom.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmPaymentTo = null;
    } else {
    this.fdtmPaymentTo = new Timestamp(__dataIn.readLong());
    this.fdtmPaymentTo.setNanos(__dataIn.readInt());
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
        this.fstrInterventionReason = null;
    } else {
    this.fstrInterventionReason = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnUnderDeduction = null;
    } else {
    this.fblnUnderDeduction = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurUnderDeductionAmount = null;
    } else {
    this.fcurUnderDeductionAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurUnderDeductionExpected = null;
    } else {
    this.fcurUnderDeductionExpected = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurUnderDeductionReceived = null;
    } else {
    this.fcurUnderDeductionReceived = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.flngCaseKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCaseKey);
    }
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
    }
    if (null == this.flngGarnishKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngGarnishKey);
    }
    if (null == this.fdtmPaymentFrom) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPaymentFrom.getTime());
    __dataOut.writeInt(this.fdtmPaymentFrom.getNanos());
    }
    if (null == this.fdtmPaymentTo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPaymentTo.getTime());
    __dataOut.writeInt(this.fdtmPaymentTo.getNanos());
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
    if (null == this.fstrInterventionReason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrInterventionReason);
    }
    if (null == this.fblnUnderDeduction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnUnderDeduction);
    }
    if (null == this.fcurUnderDeductionAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurUnderDeductionAmount, __dataOut);
    }
    if (null == this.fcurUnderDeductionExpected) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurUnderDeductionExpected, __dataOut);
    }
    if (null == this.fcurUnderDeductionReceived) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurUnderDeductionReceived, __dataOut);
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
    if (null == this.flngCaseKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCaseKey);
    }
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
    }
    if (null == this.flngGarnishKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngGarnishKey);
    }
    if (null == this.fdtmPaymentFrom) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPaymentFrom.getTime());
    __dataOut.writeInt(this.fdtmPaymentFrom.getNanos());
    }
    if (null == this.fdtmPaymentTo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPaymentTo.getTime());
    __dataOut.writeInt(this.fdtmPaymentTo.getNanos());
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
    if (null == this.fstrInterventionReason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrInterventionReason);
    }
    if (null == this.fblnUnderDeduction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnUnderDeduction);
    }
    if (null == this.fcurUnderDeductionAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurUnderDeductionAmount, __dataOut);
    }
    if (null == this.fcurUnderDeductionExpected) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurUnderDeductionExpected, __dataOut);
    }
    if (null == this.fcurUnderDeductionReceived) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurUnderDeductionReceived, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngCaseKey==null?"\\N":"" + flngCaseKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngGarnishKey==null?"\\N":"" + flngGarnishKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPaymentFrom==null?"\\N":"" + fdtmPaymentFrom, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPaymentTo==null?"\\N":"" + fdtmPaymentTo, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmployerIRD==null?"\\N":fstrEmployerIRD, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmployerName==null?"\\N":fstrEmployerName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrInterventionReason==null?"\\N":fstrInterventionReason, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnUnderDeduction==null?"\\N":"" + fblnUnderDeduction, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurUnderDeductionAmount==null?"\\N":fcurUnderDeductionAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurUnderDeductionExpected==null?"\\N":fcurUnderDeductionExpected.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurUnderDeductionReceived==null?"\\N":fcurUnderDeductionReceived.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngCaseKey==null?"\\N":"" + flngCaseKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngGarnishKey==null?"\\N":"" + flngGarnishKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPaymentFrom==null?"\\N":"" + fdtmPaymentFrom, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPaymentTo==null?"\\N":"" + fdtmPaymentTo, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmployerIRD==null?"\\N":fstrEmployerIRD, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmployerName==null?"\\N":fstrEmployerName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrInterventionReason==null?"\\N":fstrInterventionReason, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnUnderDeduction==null?"\\N":"" + fblnUnderDeduction, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurUnderDeductionAmount==null?"\\N":fcurUnderDeductionAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurUnderDeductionExpected==null?"\\N":fcurUnderDeductionExpected.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurUnderDeductionReceived==null?"\\N":fcurUnderDeductionReceived.toPlainString(), delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCaseKey = null; } else {
      this.flngCaseKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngGarnishKey = null; } else {
      this.flngGarnishKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPaymentFrom = null; } else {
      this.fdtmPaymentFrom = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPaymentTo = null; } else {
      this.fdtmPaymentTo = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrInterventionReason = null; } else {
      this.fstrInterventionReason = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnUnderDeduction = null; } else {
      this.fblnUnderDeduction = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurUnderDeductionAmount = null; } else {
      this.fcurUnderDeductionAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurUnderDeductionExpected = null; } else {
      this.fcurUnderDeductionExpected = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurUnderDeductionReceived = null; } else {
      this.fcurUnderDeductionReceived = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCaseKey = null; } else {
      this.flngCaseKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngGarnishKey = null; } else {
      this.flngGarnishKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPaymentFrom = null; } else {
      this.fdtmPaymentFrom = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPaymentTo = null; } else {
      this.fdtmPaymentTo = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrInterventionReason = null; } else {
      this.fstrInterventionReason = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnUnderDeduction = null; } else {
      this.fblnUnderDeduction = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurUnderDeductionAmount = null; } else {
      this.fcurUnderDeductionAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurUnderDeductionExpected = null; } else {
      this.fcurUnderDeductionExpected = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurUnderDeductionReceived = null; } else {
      this.fcurUnderDeductionReceived = new java.math.BigDecimal(__cur_str);
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
    tblnz_incorrectdedcasedetails o = (tblnz_incorrectdedcasedetails) super.clone();
    o.fdtmPaymentFrom = (o.fdtmPaymentFrom != null) ? (java.sql.Timestamp) o.fdtmPaymentFrom.clone() : null;
    o.fdtmPaymentTo = (o.fdtmPaymentTo != null) ? (java.sql.Timestamp) o.fdtmPaymentTo.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_incorrectdedcasedetails o) throws CloneNotSupportedException {
    o.fdtmPaymentFrom = (o.fdtmPaymentFrom != null) ? (java.sql.Timestamp) o.fdtmPaymentFrom.clone() : null;
    o.fdtmPaymentTo = (o.fdtmPaymentTo != null) ? (java.sql.Timestamp) o.fdtmPaymentTo.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("flngCaseKey", this.flngCaseKey);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("flngGarnishKey", this.flngGarnishKey);
    __sqoop$field_map.put("fdtmPaymentFrom", this.fdtmPaymentFrom);
    __sqoop$field_map.put("fdtmPaymentTo", this.fdtmPaymentTo);
    __sqoop$field_map.put("fstrEmployerIRD", this.fstrEmployerIRD);
    __sqoop$field_map.put("fstrEmployerName", this.fstrEmployerName);
    __sqoop$field_map.put("fstrInterventionReason", this.fstrInterventionReason);
    __sqoop$field_map.put("fblnUnderDeduction", this.fblnUnderDeduction);
    __sqoop$field_map.put("fcurUnderDeductionAmount", this.fcurUnderDeductionAmount);
    __sqoop$field_map.put("fcurUnderDeductionExpected", this.fcurUnderDeductionExpected);
    __sqoop$field_map.put("fcurUnderDeductionReceived", this.fcurUnderDeductionReceived);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("flngCaseKey", this.flngCaseKey);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("flngGarnishKey", this.flngGarnishKey);
    __sqoop$field_map.put("fdtmPaymentFrom", this.fdtmPaymentFrom);
    __sqoop$field_map.put("fdtmPaymentTo", this.fdtmPaymentTo);
    __sqoop$field_map.put("fstrEmployerIRD", this.fstrEmployerIRD);
    __sqoop$field_map.put("fstrEmployerName", this.fstrEmployerName);
    __sqoop$field_map.put("fstrInterventionReason", this.fstrInterventionReason);
    __sqoop$field_map.put("fblnUnderDeduction", this.fblnUnderDeduction);
    __sqoop$field_map.put("fcurUnderDeductionAmount", this.fcurUnderDeductionAmount);
    __sqoop$field_map.put("fcurUnderDeductionExpected", this.fcurUnderDeductionExpected);
    __sqoop$field_map.put("fcurUnderDeductionReceived", this.fcurUnderDeductionReceived);
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
