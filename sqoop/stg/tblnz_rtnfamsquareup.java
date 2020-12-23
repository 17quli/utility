// ORM class for table 'tblnz_rtnfamsquareup'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Dec 03 23:55:58 NZDT 2020
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

public class tblnz_rtnfamsquareup extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfamsquareup.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fintSeq", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfamsquareup.this.fintSeq = (Integer)value;
      }
    });
    setters.put("fstrCategory", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfamsquareup.this.fstrCategory = (String)value;
      }
    });
    setters.put("fcurFTC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfamsquareup.this.fcurFTC = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurIWTC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfamsquareup.this.fcurIWTC = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurCTC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfamsquareup.this.fcurCTC = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurMFTC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfamsquareup.this.fcurMFTC = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPTC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfamsquareup.this.fcurPTC = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurBSTC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfamsquareup.this.fcurBSTC = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfamsquareup.this.fcurAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("flngFAMEntitlementKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfamsquareup.this.flngFAMEntitlementKey = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfamsquareup.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfamsquareup.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_rtnfamsquareup() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_rtnfamsquareup with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private Integer fintSeq;
  public Integer get_fintSeq() {
    return fintSeq;
  }
  public void set_fintSeq(Integer fintSeq) {
    this.fintSeq = fintSeq;
  }
  public tblnz_rtnfamsquareup with_fintSeq(Integer fintSeq) {
    this.fintSeq = fintSeq;
    return this;
  }
  private String fstrCategory;
  public String get_fstrCategory() {
    return fstrCategory;
  }
  public void set_fstrCategory(String fstrCategory) {
    this.fstrCategory = fstrCategory;
  }
  public tblnz_rtnfamsquareup with_fstrCategory(String fstrCategory) {
    this.fstrCategory = fstrCategory;
    return this;
  }
  private java.math.BigDecimal fcurFTC;
  public java.math.BigDecimal get_fcurFTC() {
    return fcurFTC;
  }
  public void set_fcurFTC(java.math.BigDecimal fcurFTC) {
    this.fcurFTC = fcurFTC;
  }
  public tblnz_rtnfamsquareup with_fcurFTC(java.math.BigDecimal fcurFTC) {
    this.fcurFTC = fcurFTC;
    return this;
  }
  private java.math.BigDecimal fcurIWTC;
  public java.math.BigDecimal get_fcurIWTC() {
    return fcurIWTC;
  }
  public void set_fcurIWTC(java.math.BigDecimal fcurIWTC) {
    this.fcurIWTC = fcurIWTC;
  }
  public tblnz_rtnfamsquareup with_fcurIWTC(java.math.BigDecimal fcurIWTC) {
    this.fcurIWTC = fcurIWTC;
    return this;
  }
  private java.math.BigDecimal fcurCTC;
  public java.math.BigDecimal get_fcurCTC() {
    return fcurCTC;
  }
  public void set_fcurCTC(java.math.BigDecimal fcurCTC) {
    this.fcurCTC = fcurCTC;
  }
  public tblnz_rtnfamsquareup with_fcurCTC(java.math.BigDecimal fcurCTC) {
    this.fcurCTC = fcurCTC;
    return this;
  }
  private java.math.BigDecimal fcurMFTC;
  public java.math.BigDecimal get_fcurMFTC() {
    return fcurMFTC;
  }
  public void set_fcurMFTC(java.math.BigDecimal fcurMFTC) {
    this.fcurMFTC = fcurMFTC;
  }
  public tblnz_rtnfamsquareup with_fcurMFTC(java.math.BigDecimal fcurMFTC) {
    this.fcurMFTC = fcurMFTC;
    return this;
  }
  private java.math.BigDecimal fcurPTC;
  public java.math.BigDecimal get_fcurPTC() {
    return fcurPTC;
  }
  public void set_fcurPTC(java.math.BigDecimal fcurPTC) {
    this.fcurPTC = fcurPTC;
  }
  public tblnz_rtnfamsquareup with_fcurPTC(java.math.BigDecimal fcurPTC) {
    this.fcurPTC = fcurPTC;
    return this;
  }
  private java.math.BigDecimal fcurBSTC;
  public java.math.BigDecimal get_fcurBSTC() {
    return fcurBSTC;
  }
  public void set_fcurBSTC(java.math.BigDecimal fcurBSTC) {
    this.fcurBSTC = fcurBSTC;
  }
  public tblnz_rtnfamsquareup with_fcurBSTC(java.math.BigDecimal fcurBSTC) {
    this.fcurBSTC = fcurBSTC;
    return this;
  }
  private java.math.BigDecimal fcurAmount;
  public java.math.BigDecimal get_fcurAmount() {
    return fcurAmount;
  }
  public void set_fcurAmount(java.math.BigDecimal fcurAmount) {
    this.fcurAmount = fcurAmount;
  }
  public tblnz_rtnfamsquareup with_fcurAmount(java.math.BigDecimal fcurAmount) {
    this.fcurAmount = fcurAmount;
    return this;
  }
  private Integer flngFAMEntitlementKey;
  public Integer get_flngFAMEntitlementKey() {
    return flngFAMEntitlementKey;
  }
  public void set_flngFAMEntitlementKey(Integer flngFAMEntitlementKey) {
    this.flngFAMEntitlementKey = flngFAMEntitlementKey;
  }
  public tblnz_rtnfamsquareup with_flngFAMEntitlementKey(Integer flngFAMEntitlementKey) {
    this.flngFAMEntitlementKey = flngFAMEntitlementKey;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_rtnfamsquareup with_fstrWho(String fstrWho) {
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
  public tblnz_rtnfamsquareup with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnfamsquareup)) {
      return false;
    }
    tblnz_rtnfamsquareup that = (tblnz_rtnfamsquareup) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fintSeq == null ? that.fintSeq == null : this.fintSeq.equals(that.fintSeq));
    equal = equal && (this.fstrCategory == null ? that.fstrCategory == null : this.fstrCategory.equals(that.fstrCategory));
    equal = equal && (this.fcurFTC == null ? that.fcurFTC == null : this.fcurFTC.equals(that.fcurFTC));
    equal = equal && (this.fcurIWTC == null ? that.fcurIWTC == null : this.fcurIWTC.equals(that.fcurIWTC));
    equal = equal && (this.fcurCTC == null ? that.fcurCTC == null : this.fcurCTC.equals(that.fcurCTC));
    equal = equal && (this.fcurMFTC == null ? that.fcurMFTC == null : this.fcurMFTC.equals(that.fcurMFTC));
    equal = equal && (this.fcurPTC == null ? that.fcurPTC == null : this.fcurPTC.equals(that.fcurPTC));
    equal = equal && (this.fcurBSTC == null ? that.fcurBSTC == null : this.fcurBSTC.equals(that.fcurBSTC));
    equal = equal && (this.fcurAmount == null ? that.fcurAmount == null : this.fcurAmount.equals(that.fcurAmount));
    equal = equal && (this.flngFAMEntitlementKey == null ? that.flngFAMEntitlementKey == null : this.flngFAMEntitlementKey.equals(that.flngFAMEntitlementKey));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnfamsquareup)) {
      return false;
    }
    tblnz_rtnfamsquareup that = (tblnz_rtnfamsquareup) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fintSeq == null ? that.fintSeq == null : this.fintSeq.equals(that.fintSeq));
    equal = equal && (this.fstrCategory == null ? that.fstrCategory == null : this.fstrCategory.equals(that.fstrCategory));
    equal = equal && (this.fcurFTC == null ? that.fcurFTC == null : this.fcurFTC.equals(that.fcurFTC));
    equal = equal && (this.fcurIWTC == null ? that.fcurIWTC == null : this.fcurIWTC.equals(that.fcurIWTC));
    equal = equal && (this.fcurCTC == null ? that.fcurCTC == null : this.fcurCTC.equals(that.fcurCTC));
    equal = equal && (this.fcurMFTC == null ? that.fcurMFTC == null : this.fcurMFTC.equals(that.fcurMFTC));
    equal = equal && (this.fcurPTC == null ? that.fcurPTC == null : this.fcurPTC.equals(that.fcurPTC));
    equal = equal && (this.fcurBSTC == null ? that.fcurBSTC == null : this.fcurBSTC.equals(that.fcurBSTC));
    equal = equal && (this.fcurAmount == null ? that.fcurAmount == null : this.fcurAmount.equals(that.fcurAmount));
    equal = equal && (this.flngFAMEntitlementKey == null ? that.flngFAMEntitlementKey == null : this.flngFAMEntitlementKey.equals(that.flngFAMEntitlementKey));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fintSeq = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fstrCategory = JdbcWritableBridge.readString(3, __dbResults);
    this.fcurFTC = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurIWTC = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurCTC = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurMFTC = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurPTC = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurBSTC = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurAmount = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.flngFAMEntitlementKey = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(12, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(13, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fintSeq = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fstrCategory = JdbcWritableBridge.readString(3, __dbResults);
    this.fcurFTC = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurIWTC = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurCTC = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurMFTC = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurPTC = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurBSTC = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurAmount = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.flngFAMEntitlementKey = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(12, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(13, __dbResults);
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
    JdbcWritableBridge.writeInteger(fintSeq, 2 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrCategory, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFTC, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurIWTC, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCTC, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurMFTC, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPTC, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBSTC, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmount, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFAMEntitlementKey, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 13 + __off, 93, __dbStmt);
    return 13;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintSeq, 2 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrCategory, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFTC, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurIWTC, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCTC, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurMFTC, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPTC, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBSTC, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmount, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFAMEntitlementKey, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 13 + __off, 93, __dbStmt);
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
        this.fintSeq = null;
    } else {
    this.fintSeq = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCategory = null;
    } else {
    this.fstrCategory = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurFTC = null;
    } else {
    this.fcurFTC = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurIWTC = null;
    } else {
    this.fcurIWTC = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurCTC = null;
    } else {
    this.fcurCTC = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurMFTC = null;
    } else {
    this.fcurMFTC = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPTC = null;
    } else {
    this.fcurPTC = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurBSTC = null;
    } else {
    this.fcurBSTC = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAmount = null;
    } else {
    this.fcurAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngFAMEntitlementKey = null;
    } else {
    this.flngFAMEntitlementKey = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.fintSeq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintSeq);
    }
    if (null == this.fstrCategory) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCategory);
    }
    if (null == this.fcurFTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFTC, __dataOut);
    }
    if (null == this.fcurIWTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurIWTC, __dataOut);
    }
    if (null == this.fcurCTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCTC, __dataOut);
    }
    if (null == this.fcurMFTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurMFTC, __dataOut);
    }
    if (null == this.fcurPTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPTC, __dataOut);
    }
    if (null == this.fcurBSTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBSTC, __dataOut);
    }
    if (null == this.fcurAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmount, __dataOut);
    }
    if (null == this.flngFAMEntitlementKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFAMEntitlementKey);
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
    if (null == this.fintSeq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintSeq);
    }
    if (null == this.fstrCategory) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCategory);
    }
    if (null == this.fcurFTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFTC, __dataOut);
    }
    if (null == this.fcurIWTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurIWTC, __dataOut);
    }
    if (null == this.fcurCTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCTC, __dataOut);
    }
    if (null == this.fcurMFTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurMFTC, __dataOut);
    }
    if (null == this.fcurPTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPTC, __dataOut);
    }
    if (null == this.fcurBSTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBSTC, __dataOut);
    }
    if (null == this.fcurAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmount, __dataOut);
    }
    if (null == this.flngFAMEntitlementKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFAMEntitlementKey);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fintSeq==null?"\\N":"" + fintSeq, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCategory==null?"\\N":fstrCategory, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFTC==null?"\\N":fcurFTC.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurIWTC==null?"\\N":fcurIWTC.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCTC==null?"\\N":fcurCTC.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurMFTC==null?"\\N":fcurMFTC.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPTC==null?"\\N":fcurPTC.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBSTC==null?"\\N":fcurBSTC.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmount==null?"\\N":fcurAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFAMEntitlementKey==null?"\\N":"" + flngFAMEntitlementKey, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fintSeq==null?"\\N":"" + fintSeq, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCategory==null?"\\N":fstrCategory, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFTC==null?"\\N":fcurFTC.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurIWTC==null?"\\N":fcurIWTC.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCTC==null?"\\N":fcurCTC.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurMFTC==null?"\\N":fcurMFTC.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPTC==null?"\\N":fcurPTC.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBSTC==null?"\\N":fcurBSTC.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmount==null?"\\N":fcurAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFAMEntitlementKey==null?"\\N":"" + flngFAMEntitlementKey, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintSeq = null; } else {
      this.fintSeq = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCategory = null; } else {
      this.fstrCategory = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFTC = null; } else {
      this.fcurFTC = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurIWTC = null; } else {
      this.fcurIWTC = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCTC = null; } else {
      this.fcurCTC = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurMFTC = null; } else {
      this.fcurMFTC = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPTC = null; } else {
      this.fcurPTC = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBSTC = null; } else {
      this.fcurBSTC = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFAMEntitlementKey = null; } else {
      this.flngFAMEntitlementKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintSeq = null; } else {
      this.fintSeq = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCategory = null; } else {
      this.fstrCategory = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFTC = null; } else {
      this.fcurFTC = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurIWTC = null; } else {
      this.fcurIWTC = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCTC = null; } else {
      this.fcurCTC = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurMFTC = null; } else {
      this.fcurMFTC = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPTC = null; } else {
      this.fcurPTC = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBSTC = null; } else {
      this.fcurBSTC = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFAMEntitlementKey = null; } else {
      this.flngFAMEntitlementKey = Integer.valueOf(__cur_str);
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
    tblnz_rtnfamsquareup o = (tblnz_rtnfamsquareup) super.clone();
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_rtnfamsquareup o) throws CloneNotSupportedException {
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fintSeq", this.fintSeq);
    __sqoop$field_map.put("fstrCategory", this.fstrCategory);
    __sqoop$field_map.put("fcurFTC", this.fcurFTC);
    __sqoop$field_map.put("fcurIWTC", this.fcurIWTC);
    __sqoop$field_map.put("fcurCTC", this.fcurCTC);
    __sqoop$field_map.put("fcurMFTC", this.fcurMFTC);
    __sqoop$field_map.put("fcurPTC", this.fcurPTC);
    __sqoop$field_map.put("fcurBSTC", this.fcurBSTC);
    __sqoop$field_map.put("fcurAmount", this.fcurAmount);
    __sqoop$field_map.put("flngFAMEntitlementKey", this.flngFAMEntitlementKey);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fintSeq", this.fintSeq);
    __sqoop$field_map.put("fstrCategory", this.fstrCategory);
    __sqoop$field_map.put("fcurFTC", this.fcurFTC);
    __sqoop$field_map.put("fcurIWTC", this.fcurIWTC);
    __sqoop$field_map.put("fcurCTC", this.fcurCTC);
    __sqoop$field_map.put("fcurMFTC", this.fcurMFTC);
    __sqoop$field_map.put("fcurPTC", this.fcurPTC);
    __sqoop$field_map.put("fcurBSTC", this.fcurBSTC);
    __sqoop$field_map.put("fcurAmount", this.fcurAmount);
    __sqoop$field_map.put("flngFAMEntitlementKey", this.flngFAMEntitlementKey);
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
