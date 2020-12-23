// ORM class for table 'tblnz_provisionaldetails'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 05:49:26 NZDT 2020
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

public class tblnz_provisionaldetails extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_provisionaldetails.this.flngAccountKey = (Integer)value;
      }
    });
    setters.put("fdtmFilingPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_provisionaldetails.this.fdtmFilingPeriod = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmDue", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_provisionaldetails.this.fdtmDue = (java.sql.Timestamp)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_provisionaldetails.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_provisionaldetails.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("fcurAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_provisionaldetails.this.fcurAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurFITReduction", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_provisionaldetails.this.fcurFITReduction = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrMethod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_provisionaldetails.this.fstrMethod = (String)value;
      }
    });
    setters.put("fdtmReversed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_provisionaldetails.this.fdtmReversed = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmProcessed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_provisionaldetails.this.fdtmProcessed = (java.sql.Timestamp)value;
      }
    });
    setters.put("flngTransKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_provisionaldetails.this.flngTransKey = (Integer)value;
      }
    });
    setters.put("flngReturnKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_provisionaldetails.this.flngReturnKey = (Integer)value;
      }
    });
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_provisionaldetails.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_provisionaldetails.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_provisionaldetails.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_provisionaldetails() {
    init0();
  }
  private Integer flngAccountKey;
  public Integer get_flngAccountKey() {
    return flngAccountKey;
  }
  public void set_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
  }
  public tblnz_provisionaldetails with_flngAccountKey(Integer flngAccountKey) {
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
  public tblnz_provisionaldetails with_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
    return this;
  }
  private java.sql.Timestamp fdtmDue;
  public java.sql.Timestamp get_fdtmDue() {
    return fdtmDue;
  }
  public void set_fdtmDue(java.sql.Timestamp fdtmDue) {
    this.fdtmDue = fdtmDue;
  }
  public tblnz_provisionaldetails with_fdtmDue(java.sql.Timestamp fdtmDue) {
    this.fdtmDue = fdtmDue;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblnz_provisionaldetails with_flngVer(Integer flngVer) {
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
  public tblnz_provisionaldetails with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private java.math.BigDecimal fcurAmount;
  public java.math.BigDecimal get_fcurAmount() {
    return fcurAmount;
  }
  public void set_fcurAmount(java.math.BigDecimal fcurAmount) {
    this.fcurAmount = fcurAmount;
  }
  public tblnz_provisionaldetails with_fcurAmount(java.math.BigDecimal fcurAmount) {
    this.fcurAmount = fcurAmount;
    return this;
  }
  private java.math.BigDecimal fcurFITReduction;
  public java.math.BigDecimal get_fcurFITReduction() {
    return fcurFITReduction;
  }
  public void set_fcurFITReduction(java.math.BigDecimal fcurFITReduction) {
    this.fcurFITReduction = fcurFITReduction;
  }
  public tblnz_provisionaldetails with_fcurFITReduction(java.math.BigDecimal fcurFITReduction) {
    this.fcurFITReduction = fcurFITReduction;
    return this;
  }
  private String fstrMethod;
  public String get_fstrMethod() {
    return fstrMethod;
  }
  public void set_fstrMethod(String fstrMethod) {
    this.fstrMethod = fstrMethod;
  }
  public tblnz_provisionaldetails with_fstrMethod(String fstrMethod) {
    this.fstrMethod = fstrMethod;
    return this;
  }
  private java.sql.Timestamp fdtmReversed;
  public java.sql.Timestamp get_fdtmReversed() {
    return fdtmReversed;
  }
  public void set_fdtmReversed(java.sql.Timestamp fdtmReversed) {
    this.fdtmReversed = fdtmReversed;
  }
  public tblnz_provisionaldetails with_fdtmReversed(java.sql.Timestamp fdtmReversed) {
    this.fdtmReversed = fdtmReversed;
    return this;
  }
  private java.sql.Timestamp fdtmProcessed;
  public java.sql.Timestamp get_fdtmProcessed() {
    return fdtmProcessed;
  }
  public void set_fdtmProcessed(java.sql.Timestamp fdtmProcessed) {
    this.fdtmProcessed = fdtmProcessed;
  }
  public tblnz_provisionaldetails with_fdtmProcessed(java.sql.Timestamp fdtmProcessed) {
    this.fdtmProcessed = fdtmProcessed;
    return this;
  }
  private Integer flngTransKey;
  public Integer get_flngTransKey() {
    return flngTransKey;
  }
  public void set_flngTransKey(Integer flngTransKey) {
    this.flngTransKey = flngTransKey;
  }
  public tblnz_provisionaldetails with_flngTransKey(Integer flngTransKey) {
    this.flngTransKey = flngTransKey;
    return this;
  }
  private Integer flngReturnKey;
  public Integer get_flngReturnKey() {
    return flngReturnKey;
  }
  public void set_flngReturnKey(Integer flngReturnKey) {
    this.flngReturnKey = flngReturnKey;
  }
  public tblnz_provisionaldetails with_flngReturnKey(Integer flngReturnKey) {
    this.flngReturnKey = flngReturnKey;
    return this;
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_provisionaldetails with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_provisionaldetails with_fstrWho(String fstrWho) {
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
  public tblnz_provisionaldetails with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_provisionaldetails)) {
      return false;
    }
    tblnz_provisionaldetails that = (tblnz_provisionaldetails) o;
    boolean equal = true;
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.fdtmDue == null ? that.fdtmDue == null : this.fdtmDue.equals(that.fdtmDue));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fcurAmount == null ? that.fcurAmount == null : this.fcurAmount.equals(that.fcurAmount));
    equal = equal && (this.fcurFITReduction == null ? that.fcurFITReduction == null : this.fcurFITReduction.equals(that.fcurFITReduction));
    equal = equal && (this.fstrMethod == null ? that.fstrMethod == null : this.fstrMethod.equals(that.fstrMethod));
    equal = equal && (this.fdtmReversed == null ? that.fdtmReversed == null : this.fdtmReversed.equals(that.fdtmReversed));
    equal = equal && (this.fdtmProcessed == null ? that.fdtmProcessed == null : this.fdtmProcessed.equals(that.fdtmProcessed));
    equal = equal && (this.flngTransKey == null ? that.flngTransKey == null : this.flngTransKey.equals(that.flngTransKey));
    equal = equal && (this.flngReturnKey == null ? that.flngReturnKey == null : this.flngReturnKey.equals(that.flngReturnKey));
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_provisionaldetails)) {
      return false;
    }
    tblnz_provisionaldetails that = (tblnz_provisionaldetails) o;
    boolean equal = true;
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.fdtmDue == null ? that.fdtmDue == null : this.fdtmDue.equals(that.fdtmDue));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fcurAmount == null ? that.fcurAmount == null : this.fcurAmount.equals(that.fcurAmount));
    equal = equal && (this.fcurFITReduction == null ? that.fcurFITReduction == null : this.fcurFITReduction.equals(that.fcurFITReduction));
    equal = equal && (this.fstrMethod == null ? that.fstrMethod == null : this.fstrMethod.equals(that.fstrMethod));
    equal = equal && (this.fdtmReversed == null ? that.fdtmReversed == null : this.fdtmReversed.equals(that.fdtmReversed));
    equal = equal && (this.fdtmProcessed == null ? that.fdtmProcessed == null : this.fdtmProcessed.equals(that.fdtmProcessed));
    equal = equal && (this.flngTransKey == null ? that.flngTransKey == null : this.flngTransKey.equals(that.flngTransKey));
    equal = equal && (this.flngReturnKey == null ? that.flngReturnKey == null : this.flngReturnKey.equals(that.flngReturnKey));
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngAccountKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(2, __dbResults);
    this.fdtmDue = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fcurAmount = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurFITReduction = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fstrMethod = JdbcWritableBridge.readString(8, __dbResults);
    this.fdtmReversed = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.fdtmProcessed = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.flngTransKey = JdbcWritableBridge.readInteger(11, __dbResults);
    this.flngReturnKey = JdbcWritableBridge.readInteger(12, __dbResults);
    this.flngDocKey = JdbcWritableBridge.readInteger(13, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(14, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(15, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngAccountKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(2, __dbResults);
    this.fdtmDue = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fcurAmount = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurFITReduction = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fstrMethod = JdbcWritableBridge.readString(8, __dbResults);
    this.fdtmReversed = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.fdtmProcessed = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.flngTransKey = JdbcWritableBridge.readInteger(11, __dbResults);
    this.flngReturnKey = JdbcWritableBridge.readInteger(12, __dbResults);
    this.flngDocKey = JdbcWritableBridge.readInteger(13, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngAccountKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 2 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDue, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmount, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFITReduction, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrMethod, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReversed, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmProcessed, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngTransKey, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngReturnKey, 12 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDocKey, 13 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 15 + __off, 93, __dbStmt);
    return 15;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngAccountKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 2 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDue, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmount, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFITReduction, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrMethod, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReversed, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmProcessed, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngTransKey, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngReturnKey, 12 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDocKey, 13 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 15 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
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
        this.fdtmDue = null;
    } else {
    this.fdtmDue = new Timestamp(__dataIn.readLong());
    this.fdtmDue.setNanos(__dataIn.readInt());
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
        this.fcurAmount = null;
    } else {
    this.fcurAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurFITReduction = null;
    } else {
    this.fcurFITReduction = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrMethod = null;
    } else {
    this.fstrMethod = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmReversed = null;
    } else {
    this.fdtmReversed = new Timestamp(__dataIn.readLong());
    this.fdtmReversed.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmProcessed = null;
    } else {
    this.fdtmProcessed = new Timestamp(__dataIn.readLong());
    this.fdtmProcessed.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngTransKey = null;
    } else {
    this.flngTransKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngReturnKey = null;
    } else {
    this.flngReturnKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngDocKey = null;
    } else {
    this.flngDocKey = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.fdtmDue) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDue.getTime());
    __dataOut.writeInt(this.fdtmDue.getNanos());
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
    if (null == this.fcurAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmount, __dataOut);
    }
    if (null == this.fcurFITReduction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFITReduction, __dataOut);
    }
    if (null == this.fstrMethod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMethod);
    }
    if (null == this.fdtmReversed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReversed.getTime());
    __dataOut.writeInt(this.fdtmReversed.getNanos());
    }
    if (null == this.fdtmProcessed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmProcessed.getTime());
    __dataOut.writeInt(this.fdtmProcessed.getNanos());
    }
    if (null == this.flngTransKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTransKey);
    }
    if (null == this.flngReturnKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngReturnKey);
    }
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
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
    if (null == this.fdtmDue) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDue.getTime());
    __dataOut.writeInt(this.fdtmDue.getNanos());
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
    if (null == this.fcurAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmount, __dataOut);
    }
    if (null == this.fcurFITReduction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFITReduction, __dataOut);
    }
    if (null == this.fstrMethod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMethod);
    }
    if (null == this.fdtmReversed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReversed.getTime());
    __dataOut.writeInt(this.fdtmReversed.getNanos());
    }
    if (null == this.fdtmProcessed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmProcessed.getTime());
    __dataOut.writeInt(this.fdtmProcessed.getNanos());
    }
    if (null == this.flngTransKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTransKey);
    }
    if (null == this.flngReturnKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngReturnKey);
    }
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDue==null?"\\N":"" + fdtmDue, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmount==null?"\\N":fcurAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFITReduction==null?"\\N":fcurFITReduction.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMethod==null?"\\N":fstrMethod, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReversed==null?"\\N":"" + fdtmReversed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmProcessed==null?"\\N":"" + fdtmProcessed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngTransKey==null?"\\N":"" + flngTransKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngReturnKey==null?"\\N":"" + flngReturnKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDue==null?"\\N":"" + fdtmDue, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmount==null?"\\N":fcurAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFITReduction==null?"\\N":fcurFITReduction.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMethod==null?"\\N":fstrMethod, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReversed==null?"\\N":"" + fdtmReversed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmProcessed==null?"\\N":"" + fdtmProcessed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngTransKey==null?"\\N":"" + flngTransKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngReturnKey==null?"\\N":"" + flngReturnKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDue = null; } else {
      this.fdtmDue = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmount = null; } else {
      this.fcurAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFITReduction = null; } else {
      this.fcurFITReduction = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMethod = null; } else {
      this.fstrMethod = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReversed = null; } else {
      this.fdtmReversed = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmProcessed = null; } else {
      this.fdtmProcessed = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTransKey = null; } else {
      this.flngTransKey = Integer.valueOf(__cur_str);
    }

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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDocKey = null; } else {
      this.flngDocKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDue = null; } else {
      this.fdtmDue = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmount = null; } else {
      this.fcurAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFITReduction = null; } else {
      this.fcurFITReduction = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMethod = null; } else {
      this.fstrMethod = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReversed = null; } else {
      this.fdtmReversed = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmProcessed = null; } else {
      this.fdtmProcessed = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTransKey = null; } else {
      this.flngTransKey = Integer.valueOf(__cur_str);
    }

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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDocKey = null; } else {
      this.flngDocKey = Integer.valueOf(__cur_str);
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
    tblnz_provisionaldetails o = (tblnz_provisionaldetails) super.clone();
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmDue = (o.fdtmDue != null) ? (java.sql.Timestamp) o.fdtmDue.clone() : null;
    o.fdtmReversed = (o.fdtmReversed != null) ? (java.sql.Timestamp) o.fdtmReversed.clone() : null;
    o.fdtmProcessed = (o.fdtmProcessed != null) ? (java.sql.Timestamp) o.fdtmProcessed.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_provisionaldetails o) throws CloneNotSupportedException {
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmDue = (o.fdtmDue != null) ? (java.sql.Timestamp) o.fdtmDue.clone() : null;
    o.fdtmReversed = (o.fdtmReversed != null) ? (java.sql.Timestamp) o.fdtmReversed.clone() : null;
    o.fdtmProcessed = (o.fdtmProcessed != null) ? (java.sql.Timestamp) o.fdtmProcessed.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("fdtmDue", this.fdtmDue);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fcurAmount", this.fcurAmount);
    __sqoop$field_map.put("fcurFITReduction", this.fcurFITReduction);
    __sqoop$field_map.put("fstrMethod", this.fstrMethod);
    __sqoop$field_map.put("fdtmReversed", this.fdtmReversed);
    __sqoop$field_map.put("fdtmProcessed", this.fdtmProcessed);
    __sqoop$field_map.put("flngTransKey", this.flngTransKey);
    __sqoop$field_map.put("flngReturnKey", this.flngReturnKey);
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("fdtmDue", this.fdtmDue);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fcurAmount", this.fcurAmount);
    __sqoop$field_map.put("fcurFITReduction", this.fcurFITReduction);
    __sqoop$field_map.put("fstrMethod", this.fstrMethod);
    __sqoop$field_map.put("fdtmReversed", this.fdtmReversed);
    __sqoop$field_map.put("fdtmProcessed", this.fdtmProcessed);
    __sqoop$field_map.put("flngTransKey", this.flngTransKey);
    __sqoop$field_map.put("flngReturnKey", this.flngReturnKey);
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
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
