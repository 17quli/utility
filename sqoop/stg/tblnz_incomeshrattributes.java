// ORM class for table 'tblnz_incomeshrattributes'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 01:37:57 NZDT 2020
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

public class tblnz_incomeshrattributes extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("fi64IncomeKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomeshrattributes.this.fi64IncomeKey = (Long)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomeshrattributes.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomeshrattributes.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("fcurAIMShareholderTaxCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomeshrattributes.this.fcurAIMShareholderTaxCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRemuneration", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomeshrattributes.this.fcurRemuneration = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurLoans", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomeshrattributes.this.fcurLoans = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAccountBalance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomeshrattributes.this.fcurAccountBalance = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurLossOffsets", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomeshrattributes.this.fcurLossOffsets = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurSubventionPayments", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomeshrattributes.this.fcurSubventionPayments = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomeshrattributes.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_incomeshrattributes.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_incomeshrattributes() {
    init0();
  }
  private Long fi64IncomeKey;
  public Long get_fi64IncomeKey() {
    return fi64IncomeKey;
  }
  public void set_fi64IncomeKey(Long fi64IncomeKey) {
    this.fi64IncomeKey = fi64IncomeKey;
  }
  public tblnz_incomeshrattributes with_fi64IncomeKey(Long fi64IncomeKey) {
    this.fi64IncomeKey = fi64IncomeKey;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblnz_incomeshrattributes with_flngVer(Integer flngVer) {
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
  public tblnz_incomeshrattributes with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private java.math.BigDecimal fcurAIMShareholderTaxCredits;
  public java.math.BigDecimal get_fcurAIMShareholderTaxCredits() {
    return fcurAIMShareholderTaxCredits;
  }
  public void set_fcurAIMShareholderTaxCredits(java.math.BigDecimal fcurAIMShareholderTaxCredits) {
    this.fcurAIMShareholderTaxCredits = fcurAIMShareholderTaxCredits;
  }
  public tblnz_incomeshrattributes with_fcurAIMShareholderTaxCredits(java.math.BigDecimal fcurAIMShareholderTaxCredits) {
    this.fcurAIMShareholderTaxCredits = fcurAIMShareholderTaxCredits;
    return this;
  }
  private java.math.BigDecimal fcurRemuneration;
  public java.math.BigDecimal get_fcurRemuneration() {
    return fcurRemuneration;
  }
  public void set_fcurRemuneration(java.math.BigDecimal fcurRemuneration) {
    this.fcurRemuneration = fcurRemuneration;
  }
  public tblnz_incomeshrattributes with_fcurRemuneration(java.math.BigDecimal fcurRemuneration) {
    this.fcurRemuneration = fcurRemuneration;
    return this;
  }
  private java.math.BigDecimal fcurLoans;
  public java.math.BigDecimal get_fcurLoans() {
    return fcurLoans;
  }
  public void set_fcurLoans(java.math.BigDecimal fcurLoans) {
    this.fcurLoans = fcurLoans;
  }
  public tblnz_incomeshrattributes with_fcurLoans(java.math.BigDecimal fcurLoans) {
    this.fcurLoans = fcurLoans;
    return this;
  }
  private java.math.BigDecimal fcurAccountBalance;
  public java.math.BigDecimal get_fcurAccountBalance() {
    return fcurAccountBalance;
  }
  public void set_fcurAccountBalance(java.math.BigDecimal fcurAccountBalance) {
    this.fcurAccountBalance = fcurAccountBalance;
  }
  public tblnz_incomeshrattributes with_fcurAccountBalance(java.math.BigDecimal fcurAccountBalance) {
    this.fcurAccountBalance = fcurAccountBalance;
    return this;
  }
  private java.math.BigDecimal fcurLossOffsets;
  public java.math.BigDecimal get_fcurLossOffsets() {
    return fcurLossOffsets;
  }
  public void set_fcurLossOffsets(java.math.BigDecimal fcurLossOffsets) {
    this.fcurLossOffsets = fcurLossOffsets;
  }
  public tblnz_incomeshrattributes with_fcurLossOffsets(java.math.BigDecimal fcurLossOffsets) {
    this.fcurLossOffsets = fcurLossOffsets;
    return this;
  }
  private java.math.BigDecimal fcurSubventionPayments;
  public java.math.BigDecimal get_fcurSubventionPayments() {
    return fcurSubventionPayments;
  }
  public void set_fcurSubventionPayments(java.math.BigDecimal fcurSubventionPayments) {
    this.fcurSubventionPayments = fcurSubventionPayments;
  }
  public tblnz_incomeshrattributes with_fcurSubventionPayments(java.math.BigDecimal fcurSubventionPayments) {
    this.fcurSubventionPayments = fcurSubventionPayments;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_incomeshrattributes with_fstrWho(String fstrWho) {
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
  public tblnz_incomeshrattributes with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_incomeshrattributes)) {
      return false;
    }
    tblnz_incomeshrattributes that = (tblnz_incomeshrattributes) o;
    boolean equal = true;
    equal = equal && (this.fi64IncomeKey == null ? that.fi64IncomeKey == null : this.fi64IncomeKey.equals(that.fi64IncomeKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fcurAIMShareholderTaxCredits == null ? that.fcurAIMShareholderTaxCredits == null : this.fcurAIMShareholderTaxCredits.equals(that.fcurAIMShareholderTaxCredits));
    equal = equal && (this.fcurRemuneration == null ? that.fcurRemuneration == null : this.fcurRemuneration.equals(that.fcurRemuneration));
    equal = equal && (this.fcurLoans == null ? that.fcurLoans == null : this.fcurLoans.equals(that.fcurLoans));
    equal = equal && (this.fcurAccountBalance == null ? that.fcurAccountBalance == null : this.fcurAccountBalance.equals(that.fcurAccountBalance));
    equal = equal && (this.fcurLossOffsets == null ? that.fcurLossOffsets == null : this.fcurLossOffsets.equals(that.fcurLossOffsets));
    equal = equal && (this.fcurSubventionPayments == null ? that.fcurSubventionPayments == null : this.fcurSubventionPayments.equals(that.fcurSubventionPayments));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_incomeshrattributes)) {
      return false;
    }
    tblnz_incomeshrattributes that = (tblnz_incomeshrattributes) o;
    boolean equal = true;
    equal = equal && (this.fi64IncomeKey == null ? that.fi64IncomeKey == null : this.fi64IncomeKey.equals(that.fi64IncomeKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fcurAIMShareholderTaxCredits == null ? that.fcurAIMShareholderTaxCredits == null : this.fcurAIMShareholderTaxCredits.equals(that.fcurAIMShareholderTaxCredits));
    equal = equal && (this.fcurRemuneration == null ? that.fcurRemuneration == null : this.fcurRemuneration.equals(that.fcurRemuneration));
    equal = equal && (this.fcurLoans == null ? that.fcurLoans == null : this.fcurLoans.equals(that.fcurLoans));
    equal = equal && (this.fcurAccountBalance == null ? that.fcurAccountBalance == null : this.fcurAccountBalance.equals(that.fcurAccountBalance));
    equal = equal && (this.fcurLossOffsets == null ? that.fcurLossOffsets == null : this.fcurLossOffsets.equals(that.fcurLossOffsets));
    equal = equal && (this.fcurSubventionPayments == null ? that.fcurSubventionPayments == null : this.fcurSubventionPayments.equals(that.fcurSubventionPayments));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.fi64IncomeKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fcurAIMShareholderTaxCredits = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurRemuneration = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurLoans = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurAccountBalance = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurLossOffsets = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurSubventionPayments = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(10, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(11, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.fi64IncomeKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fcurAIMShareholderTaxCredits = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurRemuneration = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurLoans = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurAccountBalance = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurLossOffsets = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurSubventionPayments = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(10, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(11, __dbResults);
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
    JdbcWritableBridge.writeLong(fi64IncomeKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAIMShareholderTaxCredits, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRemuneration, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLoans, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAccountBalance, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLossOffsets, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSubventionPayments, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 11 + __off, 93, __dbStmt);
    return 11;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(fi64IncomeKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAIMShareholderTaxCredits, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRemuneration, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLoans, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAccountBalance, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLossOffsets, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSubventionPayments, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 11 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.fi64IncomeKey = null;
    } else {
    this.fi64IncomeKey = Long.valueOf(__dataIn.readLong());
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
        this.fcurAIMShareholderTaxCredits = null;
    } else {
    this.fcurAIMShareholderTaxCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRemuneration = null;
    } else {
    this.fcurRemuneration = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurLoans = null;
    } else {
    this.fcurLoans = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAccountBalance = null;
    } else {
    this.fcurAccountBalance = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurLossOffsets = null;
    } else {
    this.fcurLossOffsets = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurSubventionPayments = null;
    } else {
    this.fcurSubventionPayments = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.fi64IncomeKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64IncomeKey);
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
    if (null == this.fcurAIMShareholderTaxCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAIMShareholderTaxCredits, __dataOut);
    }
    if (null == this.fcurRemuneration) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRemuneration, __dataOut);
    }
    if (null == this.fcurLoans) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLoans, __dataOut);
    }
    if (null == this.fcurAccountBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAccountBalance, __dataOut);
    }
    if (null == this.fcurLossOffsets) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLossOffsets, __dataOut);
    }
    if (null == this.fcurSubventionPayments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSubventionPayments, __dataOut);
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
    if (null == this.fi64IncomeKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64IncomeKey);
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
    if (null == this.fcurAIMShareholderTaxCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAIMShareholderTaxCredits, __dataOut);
    }
    if (null == this.fcurRemuneration) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRemuneration, __dataOut);
    }
    if (null == this.fcurLoans) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLoans, __dataOut);
    }
    if (null == this.fcurAccountBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAccountBalance, __dataOut);
    }
    if (null == this.fcurLossOffsets) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLossOffsets, __dataOut);
    }
    if (null == this.fcurSubventionPayments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSubventionPayments, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64IncomeKey==null?"\\N":"" + fi64IncomeKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAIMShareholderTaxCredits==null?"\\N":fcurAIMShareholderTaxCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRemuneration==null?"\\N":fcurRemuneration.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLoans==null?"\\N":fcurLoans.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAccountBalance==null?"\\N":fcurAccountBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLossOffsets==null?"\\N":fcurLossOffsets.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSubventionPayments==null?"\\N":fcurSubventionPayments.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64IncomeKey==null?"\\N":"" + fi64IncomeKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAIMShareholderTaxCredits==null?"\\N":fcurAIMShareholderTaxCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRemuneration==null?"\\N":fcurRemuneration.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLoans==null?"\\N":fcurLoans.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAccountBalance==null?"\\N":fcurAccountBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLossOffsets==null?"\\N":fcurLossOffsets.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSubventionPayments==null?"\\N":fcurSubventionPayments.toPlainString(), delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64IncomeKey = null; } else {
      this.fi64IncomeKey = Long.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAIMShareholderTaxCredits = null; } else {
      this.fcurAIMShareholderTaxCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRemuneration = null; } else {
      this.fcurRemuneration = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLoans = null; } else {
      this.fcurLoans = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAccountBalance = null; } else {
      this.fcurAccountBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLossOffsets = null; } else {
      this.fcurLossOffsets = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSubventionPayments = null; } else {
      this.fcurSubventionPayments = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64IncomeKey = null; } else {
      this.fi64IncomeKey = Long.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAIMShareholderTaxCredits = null; } else {
      this.fcurAIMShareholderTaxCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRemuneration = null; } else {
      this.fcurRemuneration = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLoans = null; } else {
      this.fcurLoans = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAccountBalance = null; } else {
      this.fcurAccountBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLossOffsets = null; } else {
      this.fcurLossOffsets = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSubventionPayments = null; } else {
      this.fcurSubventionPayments = new java.math.BigDecimal(__cur_str);
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
    tblnz_incomeshrattributes o = (tblnz_incomeshrattributes) super.clone();
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_incomeshrattributes o) throws CloneNotSupportedException {
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("fi64IncomeKey", this.fi64IncomeKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fcurAIMShareholderTaxCredits", this.fcurAIMShareholderTaxCredits);
    __sqoop$field_map.put("fcurRemuneration", this.fcurRemuneration);
    __sqoop$field_map.put("fcurLoans", this.fcurLoans);
    __sqoop$field_map.put("fcurAccountBalance", this.fcurAccountBalance);
    __sqoop$field_map.put("fcurLossOffsets", this.fcurLossOffsets);
    __sqoop$field_map.put("fcurSubventionPayments", this.fcurSubventionPayments);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("fi64IncomeKey", this.fi64IncomeKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fcurAIMShareholderTaxCredits", this.fcurAIMShareholderTaxCredits);
    __sqoop$field_map.put("fcurRemuneration", this.fcurRemuneration);
    __sqoop$field_map.put("fcurLoans", this.fcurLoans);
    __sqoop$field_map.put("fcurAccountBalance", this.fcurAccountBalance);
    __sqoop$field_map.put("fcurLossOffsets", this.fcurLossOffsets);
    __sqoop$field_map.put("fcurSubventionPayments", this.fcurSubventionPayments);
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
