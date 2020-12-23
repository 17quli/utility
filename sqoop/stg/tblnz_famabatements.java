// ORM class for table 'tblnz_famabatements'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 02:05:01 NZDT 2020
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

public class tblnz_famabatements extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngFAMEntitlementKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famabatements.this.flngFAMEntitlementKey = (Integer)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famabatements.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famabatements.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("fintRelationshipPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famabatements.this.fintRelationshipPeriod = (Integer)value;
      }
    });
    setters.put("fintEntitlementPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famabatements.this.fintEntitlementPeriod = (Integer)value;
      }
    });
    setters.put("fcurIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famabatements.this.fcurIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAbatementThreshold", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famabatements.this.fcurAbatementThreshold = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAbatedIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famabatements.this.fcurAbatedIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAbatementRate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famabatements.this.fcurAbatementRate = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAbatementTotal", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famabatements.this.fcurAbatementTotal = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnProtected", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famabatements.this.fblnProtected = (Integer)value;
      }
    });
    setters.put("fblnActive", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famabatements.this.fblnActive = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famabatements.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famabatements.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_famabatements() {
    init0();
  }
  private Integer flngFAMEntitlementKey;
  public Integer get_flngFAMEntitlementKey() {
    return flngFAMEntitlementKey;
  }
  public void set_flngFAMEntitlementKey(Integer flngFAMEntitlementKey) {
    this.flngFAMEntitlementKey = flngFAMEntitlementKey;
  }
  public tblnz_famabatements with_flngFAMEntitlementKey(Integer flngFAMEntitlementKey) {
    this.flngFAMEntitlementKey = flngFAMEntitlementKey;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblnz_famabatements with_flngVer(Integer flngVer) {
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
  public tblnz_famabatements with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private Integer fintRelationshipPeriod;
  public Integer get_fintRelationshipPeriod() {
    return fintRelationshipPeriod;
  }
  public void set_fintRelationshipPeriod(Integer fintRelationshipPeriod) {
    this.fintRelationshipPeriod = fintRelationshipPeriod;
  }
  public tblnz_famabatements with_fintRelationshipPeriod(Integer fintRelationshipPeriod) {
    this.fintRelationshipPeriod = fintRelationshipPeriod;
    return this;
  }
  private Integer fintEntitlementPeriod;
  public Integer get_fintEntitlementPeriod() {
    return fintEntitlementPeriod;
  }
  public void set_fintEntitlementPeriod(Integer fintEntitlementPeriod) {
    this.fintEntitlementPeriod = fintEntitlementPeriod;
  }
  public tblnz_famabatements with_fintEntitlementPeriod(Integer fintEntitlementPeriod) {
    this.fintEntitlementPeriod = fintEntitlementPeriod;
    return this;
  }
  private java.math.BigDecimal fcurIncome;
  public java.math.BigDecimal get_fcurIncome() {
    return fcurIncome;
  }
  public void set_fcurIncome(java.math.BigDecimal fcurIncome) {
    this.fcurIncome = fcurIncome;
  }
  public tblnz_famabatements with_fcurIncome(java.math.BigDecimal fcurIncome) {
    this.fcurIncome = fcurIncome;
    return this;
  }
  private java.math.BigDecimal fcurAbatementThreshold;
  public java.math.BigDecimal get_fcurAbatementThreshold() {
    return fcurAbatementThreshold;
  }
  public void set_fcurAbatementThreshold(java.math.BigDecimal fcurAbatementThreshold) {
    this.fcurAbatementThreshold = fcurAbatementThreshold;
  }
  public tblnz_famabatements with_fcurAbatementThreshold(java.math.BigDecimal fcurAbatementThreshold) {
    this.fcurAbatementThreshold = fcurAbatementThreshold;
    return this;
  }
  private java.math.BigDecimal fcurAbatedIncome;
  public java.math.BigDecimal get_fcurAbatedIncome() {
    return fcurAbatedIncome;
  }
  public void set_fcurAbatedIncome(java.math.BigDecimal fcurAbatedIncome) {
    this.fcurAbatedIncome = fcurAbatedIncome;
  }
  public tblnz_famabatements with_fcurAbatedIncome(java.math.BigDecimal fcurAbatedIncome) {
    this.fcurAbatedIncome = fcurAbatedIncome;
    return this;
  }
  private java.math.BigDecimal fcurAbatementRate;
  public java.math.BigDecimal get_fcurAbatementRate() {
    return fcurAbatementRate;
  }
  public void set_fcurAbatementRate(java.math.BigDecimal fcurAbatementRate) {
    this.fcurAbatementRate = fcurAbatementRate;
  }
  public tblnz_famabatements with_fcurAbatementRate(java.math.BigDecimal fcurAbatementRate) {
    this.fcurAbatementRate = fcurAbatementRate;
    return this;
  }
  private java.math.BigDecimal fcurAbatementTotal;
  public java.math.BigDecimal get_fcurAbatementTotal() {
    return fcurAbatementTotal;
  }
  public void set_fcurAbatementTotal(java.math.BigDecimal fcurAbatementTotal) {
    this.fcurAbatementTotal = fcurAbatementTotal;
  }
  public tblnz_famabatements with_fcurAbatementTotal(java.math.BigDecimal fcurAbatementTotal) {
    this.fcurAbatementTotal = fcurAbatementTotal;
    return this;
  }
  private Integer fblnProtected;
  public Integer get_fblnProtected() {
    return fblnProtected;
  }
  public void set_fblnProtected(Integer fblnProtected) {
    this.fblnProtected = fblnProtected;
  }
  public tblnz_famabatements with_fblnProtected(Integer fblnProtected) {
    this.fblnProtected = fblnProtected;
    return this;
  }
  private Integer fblnActive;
  public Integer get_fblnActive() {
    return fblnActive;
  }
  public void set_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
  }
  public tblnz_famabatements with_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_famabatements with_fstrWho(String fstrWho) {
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
  public tblnz_famabatements with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_famabatements)) {
      return false;
    }
    tblnz_famabatements that = (tblnz_famabatements) o;
    boolean equal = true;
    equal = equal && (this.flngFAMEntitlementKey == null ? that.flngFAMEntitlementKey == null : this.flngFAMEntitlementKey.equals(that.flngFAMEntitlementKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fintRelationshipPeriod == null ? that.fintRelationshipPeriod == null : this.fintRelationshipPeriod.equals(that.fintRelationshipPeriod));
    equal = equal && (this.fintEntitlementPeriod == null ? that.fintEntitlementPeriod == null : this.fintEntitlementPeriod.equals(that.fintEntitlementPeriod));
    equal = equal && (this.fcurIncome == null ? that.fcurIncome == null : this.fcurIncome.equals(that.fcurIncome));
    equal = equal && (this.fcurAbatementThreshold == null ? that.fcurAbatementThreshold == null : this.fcurAbatementThreshold.equals(that.fcurAbatementThreshold));
    equal = equal && (this.fcurAbatedIncome == null ? that.fcurAbatedIncome == null : this.fcurAbatedIncome.equals(that.fcurAbatedIncome));
    equal = equal && (this.fcurAbatementRate == null ? that.fcurAbatementRate == null : this.fcurAbatementRate.equals(that.fcurAbatementRate));
    equal = equal && (this.fcurAbatementTotal == null ? that.fcurAbatementTotal == null : this.fcurAbatementTotal.equals(that.fcurAbatementTotal));
    equal = equal && (this.fblnProtected == null ? that.fblnProtected == null : this.fblnProtected.equals(that.fblnProtected));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_famabatements)) {
      return false;
    }
    tblnz_famabatements that = (tblnz_famabatements) o;
    boolean equal = true;
    equal = equal && (this.flngFAMEntitlementKey == null ? that.flngFAMEntitlementKey == null : this.flngFAMEntitlementKey.equals(that.flngFAMEntitlementKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fintRelationshipPeriod == null ? that.fintRelationshipPeriod == null : this.fintRelationshipPeriod.equals(that.fintRelationshipPeriod));
    equal = equal && (this.fintEntitlementPeriod == null ? that.fintEntitlementPeriod == null : this.fintEntitlementPeriod.equals(that.fintEntitlementPeriod));
    equal = equal && (this.fcurIncome == null ? that.fcurIncome == null : this.fcurIncome.equals(that.fcurIncome));
    equal = equal && (this.fcurAbatementThreshold == null ? that.fcurAbatementThreshold == null : this.fcurAbatementThreshold.equals(that.fcurAbatementThreshold));
    equal = equal && (this.fcurAbatedIncome == null ? that.fcurAbatedIncome == null : this.fcurAbatedIncome.equals(that.fcurAbatedIncome));
    equal = equal && (this.fcurAbatementRate == null ? that.fcurAbatementRate == null : this.fcurAbatementRate.equals(that.fcurAbatementRate));
    equal = equal && (this.fcurAbatementTotal == null ? that.fcurAbatementTotal == null : this.fcurAbatementTotal.equals(that.fcurAbatementTotal));
    equal = equal && (this.fblnProtected == null ? that.fblnProtected == null : this.fblnProtected.equals(that.fblnProtected));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngFAMEntitlementKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fintRelationshipPeriod = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fintEntitlementPeriod = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fcurIncome = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurAbatementThreshold = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurAbatedIncome = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurAbatementRate = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurAbatementTotal = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fblnProtected = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(13, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(14, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngFAMEntitlementKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fintRelationshipPeriod = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fintEntitlementPeriod = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fcurIncome = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurAbatementThreshold = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurAbatedIncome = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurAbatementRate = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurAbatementTotal = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fblnProtected = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(13, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(14, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngFAMEntitlementKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintRelationshipPeriod, 4 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintEntitlementPeriod, 5 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurIncome, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAbatementThreshold, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAbatedIncome, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAbatementRate, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAbatementTotal, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnProtected, 11 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 12 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 14 + __off, 93, __dbStmt);
    return 14;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngFAMEntitlementKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintRelationshipPeriod, 4 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintEntitlementPeriod, 5 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurIncome, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAbatementThreshold, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAbatedIncome, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAbatementRate, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAbatementTotal, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnProtected, 11 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 12 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 14 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngFAMEntitlementKey = null;
    } else {
    this.flngFAMEntitlementKey = Integer.valueOf(__dataIn.readInt());
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
        this.fintRelationshipPeriod = null;
    } else {
    this.fintRelationshipPeriod = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintEntitlementPeriod = null;
    } else {
    this.fintEntitlementPeriod = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurIncome = null;
    } else {
    this.fcurIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAbatementThreshold = null;
    } else {
    this.fcurAbatementThreshold = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAbatedIncome = null;
    } else {
    this.fcurAbatedIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAbatementRate = null;
    } else {
    this.fcurAbatementRate = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAbatementTotal = null;
    } else {
    this.fcurAbatementTotal = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnProtected = null;
    } else {
    this.fblnProtected = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnActive = null;
    } else {
    this.fblnActive = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.flngFAMEntitlementKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFAMEntitlementKey);
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
    if (null == this.fintRelationshipPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintRelationshipPeriod);
    }
    if (null == this.fintEntitlementPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintEntitlementPeriod);
    }
    if (null == this.fcurIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurIncome, __dataOut);
    }
    if (null == this.fcurAbatementThreshold) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAbatementThreshold, __dataOut);
    }
    if (null == this.fcurAbatedIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAbatedIncome, __dataOut);
    }
    if (null == this.fcurAbatementRate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAbatementRate, __dataOut);
    }
    if (null == this.fcurAbatementTotal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAbatementTotal, __dataOut);
    }
    if (null == this.fblnProtected) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnProtected);
    }
    if (null == this.fblnActive) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnActive);
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
    if (null == this.flngFAMEntitlementKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFAMEntitlementKey);
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
    if (null == this.fintRelationshipPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintRelationshipPeriod);
    }
    if (null == this.fintEntitlementPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintEntitlementPeriod);
    }
    if (null == this.fcurIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurIncome, __dataOut);
    }
    if (null == this.fcurAbatementThreshold) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAbatementThreshold, __dataOut);
    }
    if (null == this.fcurAbatedIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAbatedIncome, __dataOut);
    }
    if (null == this.fcurAbatementRate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAbatementRate, __dataOut);
    }
    if (null == this.fcurAbatementTotal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAbatementTotal, __dataOut);
    }
    if (null == this.fblnProtected) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnProtected);
    }
    if (null == this.fblnActive) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnActive);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngFAMEntitlementKey==null?"\\N":"" + flngFAMEntitlementKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintRelationshipPeriod==null?"\\N":"" + fintRelationshipPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintEntitlementPeriod==null?"\\N":"" + fintEntitlementPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurIncome==null?"\\N":fcurIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAbatementThreshold==null?"\\N":fcurAbatementThreshold.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAbatedIncome==null?"\\N":fcurAbatedIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAbatementRate==null?"\\N":fcurAbatementRate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAbatementTotal==null?"\\N":fcurAbatementTotal.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnProtected==null?"\\N":"" + fblnProtected, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnActive==null?"\\N":"" + fblnActive, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngFAMEntitlementKey==null?"\\N":"" + flngFAMEntitlementKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintRelationshipPeriod==null?"\\N":"" + fintRelationshipPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintEntitlementPeriod==null?"\\N":"" + fintEntitlementPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurIncome==null?"\\N":fcurIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAbatementThreshold==null?"\\N":fcurAbatementThreshold.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAbatedIncome==null?"\\N":fcurAbatedIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAbatementRate==null?"\\N":fcurAbatementRate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAbatementTotal==null?"\\N":fcurAbatementTotal.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnProtected==null?"\\N":"" + fblnProtected, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnActive==null?"\\N":"" + fblnActive, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFAMEntitlementKey = null; } else {
      this.flngFAMEntitlementKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintRelationshipPeriod = null; } else {
      this.fintRelationshipPeriod = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintEntitlementPeriod = null; } else {
      this.fintEntitlementPeriod = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurIncome = null; } else {
      this.fcurIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAbatementThreshold = null; } else {
      this.fcurAbatementThreshold = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAbatedIncome = null; } else {
      this.fcurAbatedIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAbatementRate = null; } else {
      this.fcurAbatementRate = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAbatementTotal = null; } else {
      this.fcurAbatementTotal = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnProtected = null; } else {
      this.fblnProtected = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnActive = null; } else {
      this.fblnActive = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFAMEntitlementKey = null; } else {
      this.flngFAMEntitlementKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintRelationshipPeriod = null; } else {
      this.fintRelationshipPeriod = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintEntitlementPeriod = null; } else {
      this.fintEntitlementPeriod = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurIncome = null; } else {
      this.fcurIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAbatementThreshold = null; } else {
      this.fcurAbatementThreshold = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAbatedIncome = null; } else {
      this.fcurAbatedIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAbatementRate = null; } else {
      this.fcurAbatementRate = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAbatementTotal = null; } else {
      this.fcurAbatementTotal = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnProtected = null; } else {
      this.fblnProtected = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnActive = null; } else {
      this.fblnActive = Integer.valueOf(__cur_str);
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
    tblnz_famabatements o = (tblnz_famabatements) super.clone();
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_famabatements o) throws CloneNotSupportedException {
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngFAMEntitlementKey", this.flngFAMEntitlementKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fintRelationshipPeriod", this.fintRelationshipPeriod);
    __sqoop$field_map.put("fintEntitlementPeriod", this.fintEntitlementPeriod);
    __sqoop$field_map.put("fcurIncome", this.fcurIncome);
    __sqoop$field_map.put("fcurAbatementThreshold", this.fcurAbatementThreshold);
    __sqoop$field_map.put("fcurAbatedIncome", this.fcurAbatedIncome);
    __sqoop$field_map.put("fcurAbatementRate", this.fcurAbatementRate);
    __sqoop$field_map.put("fcurAbatementTotal", this.fcurAbatementTotal);
    __sqoop$field_map.put("fblnProtected", this.fblnProtected);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngFAMEntitlementKey", this.flngFAMEntitlementKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fintRelationshipPeriod", this.fintRelationshipPeriod);
    __sqoop$field_map.put("fintEntitlementPeriod", this.fintEntitlementPeriod);
    __sqoop$field_map.put("fcurIncome", this.fcurIncome);
    __sqoop$field_map.put("fcurAbatementThreshold", this.fcurAbatementThreshold);
    __sqoop$field_map.put("fcurAbatedIncome", this.fcurAbatedIncome);
    __sqoop$field_map.put("fcurAbatementRate", this.fcurAbatementRate);
    __sqoop$field_map.put("fcurAbatementTotal", this.fcurAbatementTotal);
    __sqoop$field_map.put("fblnProtected", this.fblnProtected);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
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
