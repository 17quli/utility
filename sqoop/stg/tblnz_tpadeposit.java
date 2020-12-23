// ORM class for table 'tblnz_tpadeposit'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 00:52:34 NZDT 2020
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

public class tblnz_tpadeposit extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngTPAKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tpadeposit.this.flngTPAKey = (Integer)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tpadeposit.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tpadeposit.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("flngAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tpadeposit.this.flngAccountKey = (Integer)value;
      }
    });
    setters.put("fcurDepositAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tpadeposit.this.fcurDepositAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDirectedAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tpadeposit.this.fcurDirectedAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurUndirectedAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tpadeposit.this.fcurUndirectedAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPostedAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tpadeposit.this.fcurPostedAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurUnpostedAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tpadeposit.this.fcurUnpostedAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fdtmEffectiveDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tpadeposit.this.fdtmEffectiveDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmReceived", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tpadeposit.this.fdtmReceived = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmScheduleDueDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tpadeposit.this.fdtmScheduleDueDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fblnConverted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tpadeposit.this.fblnConverted = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tpadeposit.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_tpadeposit.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_tpadeposit() {
    init0();
  }
  private Integer flngTPAKey;
  public Integer get_flngTPAKey() {
    return flngTPAKey;
  }
  public void set_flngTPAKey(Integer flngTPAKey) {
    this.flngTPAKey = flngTPAKey;
  }
  public tblnz_tpadeposit with_flngTPAKey(Integer flngTPAKey) {
    this.flngTPAKey = flngTPAKey;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblnz_tpadeposit with_flngVer(Integer flngVer) {
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
  public tblnz_tpadeposit with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private Integer flngAccountKey;
  public Integer get_flngAccountKey() {
    return flngAccountKey;
  }
  public void set_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
  }
  public tblnz_tpadeposit with_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
    return this;
  }
  private java.math.BigDecimal fcurDepositAmount;
  public java.math.BigDecimal get_fcurDepositAmount() {
    return fcurDepositAmount;
  }
  public void set_fcurDepositAmount(java.math.BigDecimal fcurDepositAmount) {
    this.fcurDepositAmount = fcurDepositAmount;
  }
  public tblnz_tpadeposit with_fcurDepositAmount(java.math.BigDecimal fcurDepositAmount) {
    this.fcurDepositAmount = fcurDepositAmount;
    return this;
  }
  private java.math.BigDecimal fcurDirectedAmount;
  public java.math.BigDecimal get_fcurDirectedAmount() {
    return fcurDirectedAmount;
  }
  public void set_fcurDirectedAmount(java.math.BigDecimal fcurDirectedAmount) {
    this.fcurDirectedAmount = fcurDirectedAmount;
  }
  public tblnz_tpadeposit with_fcurDirectedAmount(java.math.BigDecimal fcurDirectedAmount) {
    this.fcurDirectedAmount = fcurDirectedAmount;
    return this;
  }
  private java.math.BigDecimal fcurUndirectedAmount;
  public java.math.BigDecimal get_fcurUndirectedAmount() {
    return fcurUndirectedAmount;
  }
  public void set_fcurUndirectedAmount(java.math.BigDecimal fcurUndirectedAmount) {
    this.fcurUndirectedAmount = fcurUndirectedAmount;
  }
  public tblnz_tpadeposit with_fcurUndirectedAmount(java.math.BigDecimal fcurUndirectedAmount) {
    this.fcurUndirectedAmount = fcurUndirectedAmount;
    return this;
  }
  private java.math.BigDecimal fcurPostedAmount;
  public java.math.BigDecimal get_fcurPostedAmount() {
    return fcurPostedAmount;
  }
  public void set_fcurPostedAmount(java.math.BigDecimal fcurPostedAmount) {
    this.fcurPostedAmount = fcurPostedAmount;
  }
  public tblnz_tpadeposit with_fcurPostedAmount(java.math.BigDecimal fcurPostedAmount) {
    this.fcurPostedAmount = fcurPostedAmount;
    return this;
  }
  private java.math.BigDecimal fcurUnpostedAmount;
  public java.math.BigDecimal get_fcurUnpostedAmount() {
    return fcurUnpostedAmount;
  }
  public void set_fcurUnpostedAmount(java.math.BigDecimal fcurUnpostedAmount) {
    this.fcurUnpostedAmount = fcurUnpostedAmount;
  }
  public tblnz_tpadeposit with_fcurUnpostedAmount(java.math.BigDecimal fcurUnpostedAmount) {
    this.fcurUnpostedAmount = fcurUnpostedAmount;
    return this;
  }
  private java.sql.Timestamp fdtmEffectiveDate;
  public java.sql.Timestamp get_fdtmEffectiveDate() {
    return fdtmEffectiveDate;
  }
  public void set_fdtmEffectiveDate(java.sql.Timestamp fdtmEffectiveDate) {
    this.fdtmEffectiveDate = fdtmEffectiveDate;
  }
  public tblnz_tpadeposit with_fdtmEffectiveDate(java.sql.Timestamp fdtmEffectiveDate) {
    this.fdtmEffectiveDate = fdtmEffectiveDate;
    return this;
  }
  private java.sql.Timestamp fdtmReceived;
  public java.sql.Timestamp get_fdtmReceived() {
    return fdtmReceived;
  }
  public void set_fdtmReceived(java.sql.Timestamp fdtmReceived) {
    this.fdtmReceived = fdtmReceived;
  }
  public tblnz_tpadeposit with_fdtmReceived(java.sql.Timestamp fdtmReceived) {
    this.fdtmReceived = fdtmReceived;
    return this;
  }
  private java.sql.Timestamp fdtmScheduleDueDate;
  public java.sql.Timestamp get_fdtmScheduleDueDate() {
    return fdtmScheduleDueDate;
  }
  public void set_fdtmScheduleDueDate(java.sql.Timestamp fdtmScheduleDueDate) {
    this.fdtmScheduleDueDate = fdtmScheduleDueDate;
  }
  public tblnz_tpadeposit with_fdtmScheduleDueDate(java.sql.Timestamp fdtmScheduleDueDate) {
    this.fdtmScheduleDueDate = fdtmScheduleDueDate;
    return this;
  }
  private Integer fblnConverted;
  public Integer get_fblnConverted() {
    return fblnConverted;
  }
  public void set_fblnConverted(Integer fblnConverted) {
    this.fblnConverted = fblnConverted;
  }
  public tblnz_tpadeposit with_fblnConverted(Integer fblnConverted) {
    this.fblnConverted = fblnConverted;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_tpadeposit with_fstrWho(String fstrWho) {
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
  public tblnz_tpadeposit with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_tpadeposit)) {
      return false;
    }
    tblnz_tpadeposit that = (tblnz_tpadeposit) o;
    boolean equal = true;
    equal = equal && (this.flngTPAKey == null ? that.flngTPAKey == null : this.flngTPAKey.equals(that.flngTPAKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fcurDepositAmount == null ? that.fcurDepositAmount == null : this.fcurDepositAmount.equals(that.fcurDepositAmount));
    equal = equal && (this.fcurDirectedAmount == null ? that.fcurDirectedAmount == null : this.fcurDirectedAmount.equals(that.fcurDirectedAmount));
    equal = equal && (this.fcurUndirectedAmount == null ? that.fcurUndirectedAmount == null : this.fcurUndirectedAmount.equals(that.fcurUndirectedAmount));
    equal = equal && (this.fcurPostedAmount == null ? that.fcurPostedAmount == null : this.fcurPostedAmount.equals(that.fcurPostedAmount));
    equal = equal && (this.fcurUnpostedAmount == null ? that.fcurUnpostedAmount == null : this.fcurUnpostedAmount.equals(that.fcurUnpostedAmount));
    equal = equal && (this.fdtmEffectiveDate == null ? that.fdtmEffectiveDate == null : this.fdtmEffectiveDate.equals(that.fdtmEffectiveDate));
    equal = equal && (this.fdtmReceived == null ? that.fdtmReceived == null : this.fdtmReceived.equals(that.fdtmReceived));
    equal = equal && (this.fdtmScheduleDueDate == null ? that.fdtmScheduleDueDate == null : this.fdtmScheduleDueDate.equals(that.fdtmScheduleDueDate));
    equal = equal && (this.fblnConverted == null ? that.fblnConverted == null : this.fblnConverted.equals(that.fblnConverted));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_tpadeposit)) {
      return false;
    }
    tblnz_tpadeposit that = (tblnz_tpadeposit) o;
    boolean equal = true;
    equal = equal && (this.flngTPAKey == null ? that.flngTPAKey == null : this.flngTPAKey.equals(that.flngTPAKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fcurDepositAmount == null ? that.fcurDepositAmount == null : this.fcurDepositAmount.equals(that.fcurDepositAmount));
    equal = equal && (this.fcurDirectedAmount == null ? that.fcurDirectedAmount == null : this.fcurDirectedAmount.equals(that.fcurDirectedAmount));
    equal = equal && (this.fcurUndirectedAmount == null ? that.fcurUndirectedAmount == null : this.fcurUndirectedAmount.equals(that.fcurUndirectedAmount));
    equal = equal && (this.fcurPostedAmount == null ? that.fcurPostedAmount == null : this.fcurPostedAmount.equals(that.fcurPostedAmount));
    equal = equal && (this.fcurUnpostedAmount == null ? that.fcurUnpostedAmount == null : this.fcurUnpostedAmount.equals(that.fcurUnpostedAmount));
    equal = equal && (this.fdtmEffectiveDate == null ? that.fdtmEffectiveDate == null : this.fdtmEffectiveDate.equals(that.fdtmEffectiveDate));
    equal = equal && (this.fdtmReceived == null ? that.fdtmReceived == null : this.fdtmReceived.equals(that.fdtmReceived));
    equal = equal && (this.fdtmScheduleDueDate == null ? that.fdtmScheduleDueDate == null : this.fdtmScheduleDueDate.equals(that.fdtmScheduleDueDate));
    equal = equal && (this.fblnConverted == null ? that.fblnConverted == null : this.fblnConverted.equals(that.fblnConverted));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngTPAKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fcurDepositAmount = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurDirectedAmount = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurUndirectedAmount = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurPostedAmount = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurUnpostedAmount = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fdtmEffectiveDate = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.fdtmReceived = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.fdtmScheduleDueDate = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.fblnConverted = JdbcWritableBridge.readInteger(13, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(14, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(15, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngTPAKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fcurDepositAmount = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurDirectedAmount = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurUndirectedAmount = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurPostedAmount = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurUnpostedAmount = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fdtmEffectiveDate = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.fdtmReceived = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.fdtmScheduleDueDate = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.fblnConverted = JdbcWritableBridge.readInteger(13, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngTPAKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDepositAmount, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDirectedAmount, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurUndirectedAmount, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPostedAmount, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurUnpostedAmount, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEffectiveDate, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReceived, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmScheduleDueDate, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnConverted, 13 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 15 + __off, 93, __dbStmt);
    return 15;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngTPAKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDepositAmount, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDirectedAmount, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurUndirectedAmount, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPostedAmount, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurUnpostedAmount, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEffectiveDate, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReceived, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmScheduleDueDate, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnConverted, 13 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 15 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngTPAKey = null;
    } else {
    this.flngTPAKey = Integer.valueOf(__dataIn.readInt());
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
        this.flngAccountKey = null;
    } else {
    this.flngAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDepositAmount = null;
    } else {
    this.fcurDepositAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDirectedAmount = null;
    } else {
    this.fcurDirectedAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurUndirectedAmount = null;
    } else {
    this.fcurUndirectedAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPostedAmount = null;
    } else {
    this.fcurPostedAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurUnpostedAmount = null;
    } else {
    this.fcurUnpostedAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmEffectiveDate = null;
    } else {
    this.fdtmEffectiveDate = new Timestamp(__dataIn.readLong());
    this.fdtmEffectiveDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmReceived = null;
    } else {
    this.fdtmReceived = new Timestamp(__dataIn.readLong());
    this.fdtmReceived.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmScheduleDueDate = null;
    } else {
    this.fdtmScheduleDueDate = new Timestamp(__dataIn.readLong());
    this.fdtmScheduleDueDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnConverted = null;
    } else {
    this.fblnConverted = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.flngTPAKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTPAKey);
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
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
    }
    if (null == this.fcurDepositAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDepositAmount, __dataOut);
    }
    if (null == this.fcurDirectedAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDirectedAmount, __dataOut);
    }
    if (null == this.fcurUndirectedAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurUndirectedAmount, __dataOut);
    }
    if (null == this.fcurPostedAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPostedAmount, __dataOut);
    }
    if (null == this.fcurUnpostedAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurUnpostedAmount, __dataOut);
    }
    if (null == this.fdtmEffectiveDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEffectiveDate.getTime());
    __dataOut.writeInt(this.fdtmEffectiveDate.getNanos());
    }
    if (null == this.fdtmReceived) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReceived.getTime());
    __dataOut.writeInt(this.fdtmReceived.getNanos());
    }
    if (null == this.fdtmScheduleDueDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmScheduleDueDate.getTime());
    __dataOut.writeInt(this.fdtmScheduleDueDate.getNanos());
    }
    if (null == this.fblnConverted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnConverted);
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
    if (null == this.flngTPAKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTPAKey);
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
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
    }
    if (null == this.fcurDepositAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDepositAmount, __dataOut);
    }
    if (null == this.fcurDirectedAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDirectedAmount, __dataOut);
    }
    if (null == this.fcurUndirectedAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurUndirectedAmount, __dataOut);
    }
    if (null == this.fcurPostedAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPostedAmount, __dataOut);
    }
    if (null == this.fcurUnpostedAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurUnpostedAmount, __dataOut);
    }
    if (null == this.fdtmEffectiveDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEffectiveDate.getTime());
    __dataOut.writeInt(this.fdtmEffectiveDate.getNanos());
    }
    if (null == this.fdtmReceived) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReceived.getTime());
    __dataOut.writeInt(this.fdtmReceived.getNanos());
    }
    if (null == this.fdtmScheduleDueDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmScheduleDueDate.getTime());
    __dataOut.writeInt(this.fdtmScheduleDueDate.getNanos());
    }
    if (null == this.fblnConverted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnConverted);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngTPAKey==null?"\\N":"" + flngTPAKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDepositAmount==null?"\\N":fcurDepositAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDirectedAmount==null?"\\N":fcurDirectedAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurUndirectedAmount==null?"\\N":fcurUndirectedAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPostedAmount==null?"\\N":fcurPostedAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurUnpostedAmount==null?"\\N":fcurUnpostedAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEffectiveDate==null?"\\N":"" + fdtmEffectiveDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReceived==null?"\\N":"" + fdtmReceived, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmScheduleDueDate==null?"\\N":"" + fdtmScheduleDueDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnConverted==null?"\\N":"" + fblnConverted, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngTPAKey==null?"\\N":"" + flngTPAKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDepositAmount==null?"\\N":fcurDepositAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDirectedAmount==null?"\\N":fcurDirectedAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurUndirectedAmount==null?"\\N":fcurUndirectedAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPostedAmount==null?"\\N":fcurPostedAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurUnpostedAmount==null?"\\N":fcurUnpostedAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEffectiveDate==null?"\\N":"" + fdtmEffectiveDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReceived==null?"\\N":"" + fdtmReceived, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmScheduleDueDate==null?"\\N":"" + fdtmScheduleDueDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnConverted==null?"\\N":"" + fblnConverted, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTPAKey = null; } else {
      this.flngTPAKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAccountKey = null; } else {
      this.flngAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDepositAmount = null; } else {
      this.fcurDepositAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDirectedAmount = null; } else {
      this.fcurDirectedAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurUndirectedAmount = null; } else {
      this.fcurUndirectedAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPostedAmount = null; } else {
      this.fcurPostedAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurUnpostedAmount = null; } else {
      this.fcurUnpostedAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmEffectiveDate = null; } else {
      this.fdtmEffectiveDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReceived = null; } else {
      this.fdtmReceived = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmScheduleDueDate = null; } else {
      this.fdtmScheduleDueDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnConverted = null; } else {
      this.fblnConverted = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTPAKey = null; } else {
      this.flngTPAKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAccountKey = null; } else {
      this.flngAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDepositAmount = null; } else {
      this.fcurDepositAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDirectedAmount = null; } else {
      this.fcurDirectedAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurUndirectedAmount = null; } else {
      this.fcurUndirectedAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPostedAmount = null; } else {
      this.fcurPostedAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurUnpostedAmount = null; } else {
      this.fcurUnpostedAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmEffectiveDate = null; } else {
      this.fdtmEffectiveDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReceived = null; } else {
      this.fdtmReceived = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmScheduleDueDate = null; } else {
      this.fdtmScheduleDueDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnConverted = null; } else {
      this.fblnConverted = Integer.valueOf(__cur_str);
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
    tblnz_tpadeposit o = (tblnz_tpadeposit) super.clone();
    o.fdtmEffectiveDate = (o.fdtmEffectiveDate != null) ? (java.sql.Timestamp) o.fdtmEffectiveDate.clone() : null;
    o.fdtmReceived = (o.fdtmReceived != null) ? (java.sql.Timestamp) o.fdtmReceived.clone() : null;
    o.fdtmScheduleDueDate = (o.fdtmScheduleDueDate != null) ? (java.sql.Timestamp) o.fdtmScheduleDueDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_tpadeposit o) throws CloneNotSupportedException {
    o.fdtmEffectiveDate = (o.fdtmEffectiveDate != null) ? (java.sql.Timestamp) o.fdtmEffectiveDate.clone() : null;
    o.fdtmReceived = (o.fdtmReceived != null) ? (java.sql.Timestamp) o.fdtmReceived.clone() : null;
    o.fdtmScheduleDueDate = (o.fdtmScheduleDueDate != null) ? (java.sql.Timestamp) o.fdtmScheduleDueDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngTPAKey", this.flngTPAKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fcurDepositAmount", this.fcurDepositAmount);
    __sqoop$field_map.put("fcurDirectedAmount", this.fcurDirectedAmount);
    __sqoop$field_map.put("fcurUndirectedAmount", this.fcurUndirectedAmount);
    __sqoop$field_map.put("fcurPostedAmount", this.fcurPostedAmount);
    __sqoop$field_map.put("fcurUnpostedAmount", this.fcurUnpostedAmount);
    __sqoop$field_map.put("fdtmEffectiveDate", this.fdtmEffectiveDate);
    __sqoop$field_map.put("fdtmReceived", this.fdtmReceived);
    __sqoop$field_map.put("fdtmScheduleDueDate", this.fdtmScheduleDueDate);
    __sqoop$field_map.put("fblnConverted", this.fblnConverted);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngTPAKey", this.flngTPAKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fcurDepositAmount", this.fcurDepositAmount);
    __sqoop$field_map.put("fcurDirectedAmount", this.fcurDirectedAmount);
    __sqoop$field_map.put("fcurUndirectedAmount", this.fcurUndirectedAmount);
    __sqoop$field_map.put("fcurPostedAmount", this.fcurPostedAmount);
    __sqoop$field_map.put("fcurUnpostedAmount", this.fcurUnpostedAmount);
    __sqoop$field_map.put("fdtmEffectiveDate", this.fdtmEffectiveDate);
    __sqoop$field_map.put("fdtmReceived", this.fdtmReceived);
    __sqoop$field_map.put("fdtmScheduleDueDate", this.fdtmScheduleDueDate);
    __sqoop$field_map.put("fblnConverted", this.fblnConverted);
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
