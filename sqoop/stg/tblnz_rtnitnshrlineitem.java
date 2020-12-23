// ORM class for table 'tblnz_rtnitnshrlineitem'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 00:05:17 NZDT 2020
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

public class tblnz_rtnitnshrlineitem extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("fi64LineItemKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnitnshrlineitem.this.fi64LineItemKey = (Long)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnitnshrlineitem.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnitnshrlineitem.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("fstrShareholderIRD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnitnshrlineitem.this.fstrShareholderIRD = (String)value;
      }
    });
    setters.put("fcurAIMShareholderTaxCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnitnshrlineitem.this.fcurAIMShareholderTaxCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurShareholderRemuneration", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnitnshrlineitem.this.fcurShareholderRemuneration = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurShareholderLoans", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnitnshrlineitem.this.fcurShareholderLoans = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurShareholderBalance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnitnshrlineitem.this.fcurShareholderBalance = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurShareholderOffsets", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnitnshrlineitem.this.fcurShareholderOffsets = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurShareholderSubventions", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnitnshrlineitem.this.fcurShareholderSubventions = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnitnshrlineitem.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnitnshrlineitem.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_rtnitnshrlineitem() {
    init0();
  }
  private Long fi64LineItemKey;
  public Long get_fi64LineItemKey() {
    return fi64LineItemKey;
  }
  public void set_fi64LineItemKey(Long fi64LineItemKey) {
    this.fi64LineItemKey = fi64LineItemKey;
  }
  public tblnz_rtnitnshrlineitem with_fi64LineItemKey(Long fi64LineItemKey) {
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
  public tblnz_rtnitnshrlineitem with_flngVer(Integer flngVer) {
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
  public tblnz_rtnitnshrlineitem with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private String fstrShareholderIRD;
  public String get_fstrShareholderIRD() {
    return fstrShareholderIRD;
  }
  public void set_fstrShareholderIRD(String fstrShareholderIRD) {
    this.fstrShareholderIRD = fstrShareholderIRD;
  }
  public tblnz_rtnitnshrlineitem with_fstrShareholderIRD(String fstrShareholderIRD) {
    this.fstrShareholderIRD = fstrShareholderIRD;
    return this;
  }
  private java.math.BigDecimal fcurAIMShareholderTaxCredits;
  public java.math.BigDecimal get_fcurAIMShareholderTaxCredits() {
    return fcurAIMShareholderTaxCredits;
  }
  public void set_fcurAIMShareholderTaxCredits(java.math.BigDecimal fcurAIMShareholderTaxCredits) {
    this.fcurAIMShareholderTaxCredits = fcurAIMShareholderTaxCredits;
  }
  public tblnz_rtnitnshrlineitem with_fcurAIMShareholderTaxCredits(java.math.BigDecimal fcurAIMShareholderTaxCredits) {
    this.fcurAIMShareholderTaxCredits = fcurAIMShareholderTaxCredits;
    return this;
  }
  private java.math.BigDecimal fcurShareholderRemuneration;
  public java.math.BigDecimal get_fcurShareholderRemuneration() {
    return fcurShareholderRemuneration;
  }
  public void set_fcurShareholderRemuneration(java.math.BigDecimal fcurShareholderRemuneration) {
    this.fcurShareholderRemuneration = fcurShareholderRemuneration;
  }
  public tblnz_rtnitnshrlineitem with_fcurShareholderRemuneration(java.math.BigDecimal fcurShareholderRemuneration) {
    this.fcurShareholderRemuneration = fcurShareholderRemuneration;
    return this;
  }
  private java.math.BigDecimal fcurShareholderLoans;
  public java.math.BigDecimal get_fcurShareholderLoans() {
    return fcurShareholderLoans;
  }
  public void set_fcurShareholderLoans(java.math.BigDecimal fcurShareholderLoans) {
    this.fcurShareholderLoans = fcurShareholderLoans;
  }
  public tblnz_rtnitnshrlineitem with_fcurShareholderLoans(java.math.BigDecimal fcurShareholderLoans) {
    this.fcurShareholderLoans = fcurShareholderLoans;
    return this;
  }
  private java.math.BigDecimal fcurShareholderBalance;
  public java.math.BigDecimal get_fcurShareholderBalance() {
    return fcurShareholderBalance;
  }
  public void set_fcurShareholderBalance(java.math.BigDecimal fcurShareholderBalance) {
    this.fcurShareholderBalance = fcurShareholderBalance;
  }
  public tblnz_rtnitnshrlineitem with_fcurShareholderBalance(java.math.BigDecimal fcurShareholderBalance) {
    this.fcurShareholderBalance = fcurShareholderBalance;
    return this;
  }
  private java.math.BigDecimal fcurShareholderOffsets;
  public java.math.BigDecimal get_fcurShareholderOffsets() {
    return fcurShareholderOffsets;
  }
  public void set_fcurShareholderOffsets(java.math.BigDecimal fcurShareholderOffsets) {
    this.fcurShareholderOffsets = fcurShareholderOffsets;
  }
  public tblnz_rtnitnshrlineitem with_fcurShareholderOffsets(java.math.BigDecimal fcurShareholderOffsets) {
    this.fcurShareholderOffsets = fcurShareholderOffsets;
    return this;
  }
  private java.math.BigDecimal fcurShareholderSubventions;
  public java.math.BigDecimal get_fcurShareholderSubventions() {
    return fcurShareholderSubventions;
  }
  public void set_fcurShareholderSubventions(java.math.BigDecimal fcurShareholderSubventions) {
    this.fcurShareholderSubventions = fcurShareholderSubventions;
  }
  public tblnz_rtnitnshrlineitem with_fcurShareholderSubventions(java.math.BigDecimal fcurShareholderSubventions) {
    this.fcurShareholderSubventions = fcurShareholderSubventions;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_rtnitnshrlineitem with_fstrWho(String fstrWho) {
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
  public tblnz_rtnitnshrlineitem with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnitnshrlineitem)) {
      return false;
    }
    tblnz_rtnitnshrlineitem that = (tblnz_rtnitnshrlineitem) o;
    boolean equal = true;
    equal = equal && (this.fi64LineItemKey == null ? that.fi64LineItemKey == null : this.fi64LineItemKey.equals(that.fi64LineItemKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fstrShareholderIRD == null ? that.fstrShareholderIRD == null : this.fstrShareholderIRD.equals(that.fstrShareholderIRD));
    equal = equal && (this.fcurAIMShareholderTaxCredits == null ? that.fcurAIMShareholderTaxCredits == null : this.fcurAIMShareholderTaxCredits.equals(that.fcurAIMShareholderTaxCredits));
    equal = equal && (this.fcurShareholderRemuneration == null ? that.fcurShareholderRemuneration == null : this.fcurShareholderRemuneration.equals(that.fcurShareholderRemuneration));
    equal = equal && (this.fcurShareholderLoans == null ? that.fcurShareholderLoans == null : this.fcurShareholderLoans.equals(that.fcurShareholderLoans));
    equal = equal && (this.fcurShareholderBalance == null ? that.fcurShareholderBalance == null : this.fcurShareholderBalance.equals(that.fcurShareholderBalance));
    equal = equal && (this.fcurShareholderOffsets == null ? that.fcurShareholderOffsets == null : this.fcurShareholderOffsets.equals(that.fcurShareholderOffsets));
    equal = equal && (this.fcurShareholderSubventions == null ? that.fcurShareholderSubventions == null : this.fcurShareholderSubventions.equals(that.fcurShareholderSubventions));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnitnshrlineitem)) {
      return false;
    }
    tblnz_rtnitnshrlineitem that = (tblnz_rtnitnshrlineitem) o;
    boolean equal = true;
    equal = equal && (this.fi64LineItemKey == null ? that.fi64LineItemKey == null : this.fi64LineItemKey.equals(that.fi64LineItemKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fstrShareholderIRD == null ? that.fstrShareholderIRD == null : this.fstrShareholderIRD.equals(that.fstrShareholderIRD));
    equal = equal && (this.fcurAIMShareholderTaxCredits == null ? that.fcurAIMShareholderTaxCredits == null : this.fcurAIMShareholderTaxCredits.equals(that.fcurAIMShareholderTaxCredits));
    equal = equal && (this.fcurShareholderRemuneration == null ? that.fcurShareholderRemuneration == null : this.fcurShareholderRemuneration.equals(that.fcurShareholderRemuneration));
    equal = equal && (this.fcurShareholderLoans == null ? that.fcurShareholderLoans == null : this.fcurShareholderLoans.equals(that.fcurShareholderLoans));
    equal = equal && (this.fcurShareholderBalance == null ? that.fcurShareholderBalance == null : this.fcurShareholderBalance.equals(that.fcurShareholderBalance));
    equal = equal && (this.fcurShareholderOffsets == null ? that.fcurShareholderOffsets == null : this.fcurShareholderOffsets.equals(that.fcurShareholderOffsets));
    equal = equal && (this.fcurShareholderSubventions == null ? that.fcurShareholderSubventions == null : this.fcurShareholderSubventions.equals(that.fcurShareholderSubventions));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.fi64LineItemKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrShareholderIRD = JdbcWritableBridge.readString(4, __dbResults);
    this.fcurAIMShareholderTaxCredits = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurShareholderRemuneration = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurShareholderLoans = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurShareholderBalance = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurShareholderOffsets = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurShareholderSubventions = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(11, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(12, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.fi64LineItemKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrShareholderIRD = JdbcWritableBridge.readString(4, __dbResults);
    this.fcurAIMShareholderTaxCredits = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurShareholderRemuneration = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurShareholderLoans = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurShareholderBalance = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurShareholderOffsets = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurShareholderSubventions = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(11, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(12, __dbResults);
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
    JdbcWritableBridge.writeString(fstrShareholderIRD, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAIMShareholderTaxCredits, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurShareholderRemuneration, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurShareholderLoans, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurShareholderBalance, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurShareholderOffsets, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurShareholderSubventions, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 12 + __off, 93, __dbStmt);
    return 12;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(fi64LineItemKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrShareholderIRD, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAIMShareholderTaxCredits, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurShareholderRemuneration, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurShareholderLoans, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurShareholderBalance, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurShareholderOffsets, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurShareholderSubventions, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 12 + __off, 93, __dbStmt);
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
        this.fstrShareholderIRD = null;
    } else {
    this.fstrShareholderIRD = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAIMShareholderTaxCredits = null;
    } else {
    this.fcurAIMShareholderTaxCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurShareholderRemuneration = null;
    } else {
    this.fcurShareholderRemuneration = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurShareholderLoans = null;
    } else {
    this.fcurShareholderLoans = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurShareholderBalance = null;
    } else {
    this.fcurShareholderBalance = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurShareholderOffsets = null;
    } else {
    this.fcurShareholderOffsets = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurShareholderSubventions = null;
    } else {
    this.fcurShareholderSubventions = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.fstrShareholderIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrShareholderIRD);
    }
    if (null == this.fcurAIMShareholderTaxCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAIMShareholderTaxCredits, __dataOut);
    }
    if (null == this.fcurShareholderRemuneration) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurShareholderRemuneration, __dataOut);
    }
    if (null == this.fcurShareholderLoans) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurShareholderLoans, __dataOut);
    }
    if (null == this.fcurShareholderBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurShareholderBalance, __dataOut);
    }
    if (null == this.fcurShareholderOffsets) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurShareholderOffsets, __dataOut);
    }
    if (null == this.fcurShareholderSubventions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurShareholderSubventions, __dataOut);
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
    if (null == this.fstrShareholderIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrShareholderIRD);
    }
    if (null == this.fcurAIMShareholderTaxCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAIMShareholderTaxCredits, __dataOut);
    }
    if (null == this.fcurShareholderRemuneration) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurShareholderRemuneration, __dataOut);
    }
    if (null == this.fcurShareholderLoans) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurShareholderLoans, __dataOut);
    }
    if (null == this.fcurShareholderBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurShareholderBalance, __dataOut);
    }
    if (null == this.fcurShareholderOffsets) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurShareholderOffsets, __dataOut);
    }
    if (null == this.fcurShareholderSubventions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurShareholderSubventions, __dataOut);
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
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrShareholderIRD==null?"\\N":fstrShareholderIRD, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAIMShareholderTaxCredits==null?"\\N":fcurAIMShareholderTaxCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurShareholderRemuneration==null?"\\N":fcurShareholderRemuneration.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurShareholderLoans==null?"\\N":fcurShareholderLoans.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurShareholderBalance==null?"\\N":fcurShareholderBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurShareholderOffsets==null?"\\N":fcurShareholderOffsets.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurShareholderSubventions==null?"\\N":fcurShareholderSubventions.toPlainString(), delimiters));
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
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrShareholderIRD==null?"\\N":fstrShareholderIRD, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAIMShareholderTaxCredits==null?"\\N":fcurAIMShareholderTaxCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurShareholderRemuneration==null?"\\N":fcurShareholderRemuneration.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurShareholderLoans==null?"\\N":fcurShareholderLoans.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurShareholderBalance==null?"\\N":fcurShareholderBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurShareholderOffsets==null?"\\N":fcurShareholderOffsets.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurShareholderSubventions==null?"\\N":fcurShareholderSubventions.toPlainString(), delimiters));
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
    if (__cur_str.equals("null")) { this.fstrShareholderIRD = null; } else {
      this.fstrShareholderIRD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAIMShareholderTaxCredits = null; } else {
      this.fcurAIMShareholderTaxCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurShareholderRemuneration = null; } else {
      this.fcurShareholderRemuneration = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurShareholderLoans = null; } else {
      this.fcurShareholderLoans = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurShareholderBalance = null; } else {
      this.fcurShareholderBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurShareholderOffsets = null; } else {
      this.fcurShareholderOffsets = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurShareholderSubventions = null; } else {
      this.fcurShareholderSubventions = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrShareholderIRD = null; } else {
      this.fstrShareholderIRD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAIMShareholderTaxCredits = null; } else {
      this.fcurAIMShareholderTaxCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurShareholderRemuneration = null; } else {
      this.fcurShareholderRemuneration = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurShareholderLoans = null; } else {
      this.fcurShareholderLoans = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurShareholderBalance = null; } else {
      this.fcurShareholderBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurShareholderOffsets = null; } else {
      this.fcurShareholderOffsets = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurShareholderSubventions = null; } else {
      this.fcurShareholderSubventions = new java.math.BigDecimal(__cur_str);
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
    tblnz_rtnitnshrlineitem o = (tblnz_rtnitnshrlineitem) super.clone();
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_rtnitnshrlineitem o) throws CloneNotSupportedException {
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("fi64LineItemKey", this.fi64LineItemKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fstrShareholderIRD", this.fstrShareholderIRD);
    __sqoop$field_map.put("fcurAIMShareholderTaxCredits", this.fcurAIMShareholderTaxCredits);
    __sqoop$field_map.put("fcurShareholderRemuneration", this.fcurShareholderRemuneration);
    __sqoop$field_map.put("fcurShareholderLoans", this.fcurShareholderLoans);
    __sqoop$field_map.put("fcurShareholderBalance", this.fcurShareholderBalance);
    __sqoop$field_map.put("fcurShareholderOffsets", this.fcurShareholderOffsets);
    __sqoop$field_map.put("fcurShareholderSubventions", this.fcurShareholderSubventions);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("fi64LineItemKey", this.fi64LineItemKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fstrShareholderIRD", this.fstrShareholderIRD);
    __sqoop$field_map.put("fcurAIMShareholderTaxCredits", this.fcurAIMShareholderTaxCredits);
    __sqoop$field_map.put("fcurShareholderRemuneration", this.fcurShareholderRemuneration);
    __sqoop$field_map.put("fcurShareholderLoans", this.fcurShareholderLoans);
    __sqoop$field_map.put("fcurShareholderBalance", this.fcurShareholderBalance);
    __sqoop$field_map.put("fcurShareholderOffsets", this.fcurShareholderOffsets);
    __sqoop$field_map.put("fcurShareholderSubventions", this.fcurShareholderSubventions);
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
