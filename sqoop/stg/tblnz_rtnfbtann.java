// ORM class for table 'tblnz_rtnfbtann'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 05:53:12 NZDT 2020
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

public class tblnz_rtnfbtann extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfbtann.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fcurTaxableBenefits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfbtann.this.fcurTaxableBenefits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurFBTTaxRate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfbtann.this.fcurFBTTaxRate = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnAlternateCalc", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfbtann.this.fblnAlternateCalc = (Integer)value;
      }
    });
    setters.put("fcurFringeTaxCalculation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfbtann.this.fcurFringeTaxCalculation = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurExemptFringeBenefits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfbtann.this.fcurExemptFringeBenefits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnGSTAmended", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfbtann.this.fblnGSTAmended = (Integer)value;
      }
    });
    setters.put("fcurGSTPayable", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfbtann.this.fcurGSTPayable = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfbtann.this.fcurTotalAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfbtann.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnfbtann.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_rtnfbtann() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_rtnfbtann with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private java.math.BigDecimal fcurTaxableBenefits;
  public java.math.BigDecimal get_fcurTaxableBenefits() {
    return fcurTaxableBenefits;
  }
  public void set_fcurTaxableBenefits(java.math.BigDecimal fcurTaxableBenefits) {
    this.fcurTaxableBenefits = fcurTaxableBenefits;
  }
  public tblnz_rtnfbtann with_fcurTaxableBenefits(java.math.BigDecimal fcurTaxableBenefits) {
    this.fcurTaxableBenefits = fcurTaxableBenefits;
    return this;
  }
  private java.math.BigDecimal fcurFBTTaxRate;
  public java.math.BigDecimal get_fcurFBTTaxRate() {
    return fcurFBTTaxRate;
  }
  public void set_fcurFBTTaxRate(java.math.BigDecimal fcurFBTTaxRate) {
    this.fcurFBTTaxRate = fcurFBTTaxRate;
  }
  public tblnz_rtnfbtann with_fcurFBTTaxRate(java.math.BigDecimal fcurFBTTaxRate) {
    this.fcurFBTTaxRate = fcurFBTTaxRate;
    return this;
  }
  private Integer fblnAlternateCalc;
  public Integer get_fblnAlternateCalc() {
    return fblnAlternateCalc;
  }
  public void set_fblnAlternateCalc(Integer fblnAlternateCalc) {
    this.fblnAlternateCalc = fblnAlternateCalc;
  }
  public tblnz_rtnfbtann with_fblnAlternateCalc(Integer fblnAlternateCalc) {
    this.fblnAlternateCalc = fblnAlternateCalc;
    return this;
  }
  private java.math.BigDecimal fcurFringeTaxCalculation;
  public java.math.BigDecimal get_fcurFringeTaxCalculation() {
    return fcurFringeTaxCalculation;
  }
  public void set_fcurFringeTaxCalculation(java.math.BigDecimal fcurFringeTaxCalculation) {
    this.fcurFringeTaxCalculation = fcurFringeTaxCalculation;
  }
  public tblnz_rtnfbtann with_fcurFringeTaxCalculation(java.math.BigDecimal fcurFringeTaxCalculation) {
    this.fcurFringeTaxCalculation = fcurFringeTaxCalculation;
    return this;
  }
  private java.math.BigDecimal fcurExemptFringeBenefits;
  public java.math.BigDecimal get_fcurExemptFringeBenefits() {
    return fcurExemptFringeBenefits;
  }
  public void set_fcurExemptFringeBenefits(java.math.BigDecimal fcurExemptFringeBenefits) {
    this.fcurExemptFringeBenefits = fcurExemptFringeBenefits;
  }
  public tblnz_rtnfbtann with_fcurExemptFringeBenefits(java.math.BigDecimal fcurExemptFringeBenefits) {
    this.fcurExemptFringeBenefits = fcurExemptFringeBenefits;
    return this;
  }
  private Integer fblnGSTAmended;
  public Integer get_fblnGSTAmended() {
    return fblnGSTAmended;
  }
  public void set_fblnGSTAmended(Integer fblnGSTAmended) {
    this.fblnGSTAmended = fblnGSTAmended;
  }
  public tblnz_rtnfbtann with_fblnGSTAmended(Integer fblnGSTAmended) {
    this.fblnGSTAmended = fblnGSTAmended;
    return this;
  }
  private java.math.BigDecimal fcurGSTPayable;
  public java.math.BigDecimal get_fcurGSTPayable() {
    return fcurGSTPayable;
  }
  public void set_fcurGSTPayable(java.math.BigDecimal fcurGSTPayable) {
    this.fcurGSTPayable = fcurGSTPayable;
  }
  public tblnz_rtnfbtann with_fcurGSTPayable(java.math.BigDecimal fcurGSTPayable) {
    this.fcurGSTPayable = fcurGSTPayable;
    return this;
  }
  private java.math.BigDecimal fcurTotalAmount;
  public java.math.BigDecimal get_fcurTotalAmount() {
    return fcurTotalAmount;
  }
  public void set_fcurTotalAmount(java.math.BigDecimal fcurTotalAmount) {
    this.fcurTotalAmount = fcurTotalAmount;
  }
  public tblnz_rtnfbtann with_fcurTotalAmount(java.math.BigDecimal fcurTotalAmount) {
    this.fcurTotalAmount = fcurTotalAmount;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_rtnfbtann with_fstrWho(String fstrWho) {
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
  public tblnz_rtnfbtann with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnfbtann)) {
      return false;
    }
    tblnz_rtnfbtann that = (tblnz_rtnfbtann) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fcurTaxableBenefits == null ? that.fcurTaxableBenefits == null : this.fcurTaxableBenefits.equals(that.fcurTaxableBenefits));
    equal = equal && (this.fcurFBTTaxRate == null ? that.fcurFBTTaxRate == null : this.fcurFBTTaxRate.equals(that.fcurFBTTaxRate));
    equal = equal && (this.fblnAlternateCalc == null ? that.fblnAlternateCalc == null : this.fblnAlternateCalc.equals(that.fblnAlternateCalc));
    equal = equal && (this.fcurFringeTaxCalculation == null ? that.fcurFringeTaxCalculation == null : this.fcurFringeTaxCalculation.equals(that.fcurFringeTaxCalculation));
    equal = equal && (this.fcurExemptFringeBenefits == null ? that.fcurExemptFringeBenefits == null : this.fcurExemptFringeBenefits.equals(that.fcurExemptFringeBenefits));
    equal = equal && (this.fblnGSTAmended == null ? that.fblnGSTAmended == null : this.fblnGSTAmended.equals(that.fblnGSTAmended));
    equal = equal && (this.fcurGSTPayable == null ? that.fcurGSTPayable == null : this.fcurGSTPayable.equals(that.fcurGSTPayable));
    equal = equal && (this.fcurTotalAmount == null ? that.fcurTotalAmount == null : this.fcurTotalAmount.equals(that.fcurTotalAmount));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnfbtann)) {
      return false;
    }
    tblnz_rtnfbtann that = (tblnz_rtnfbtann) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fcurTaxableBenefits == null ? that.fcurTaxableBenefits == null : this.fcurTaxableBenefits.equals(that.fcurTaxableBenefits));
    equal = equal && (this.fcurFBTTaxRate == null ? that.fcurFBTTaxRate == null : this.fcurFBTTaxRate.equals(that.fcurFBTTaxRate));
    equal = equal && (this.fblnAlternateCalc == null ? that.fblnAlternateCalc == null : this.fblnAlternateCalc.equals(that.fblnAlternateCalc));
    equal = equal && (this.fcurFringeTaxCalculation == null ? that.fcurFringeTaxCalculation == null : this.fcurFringeTaxCalculation.equals(that.fcurFringeTaxCalculation));
    equal = equal && (this.fcurExemptFringeBenefits == null ? that.fcurExemptFringeBenefits == null : this.fcurExemptFringeBenefits.equals(that.fcurExemptFringeBenefits));
    equal = equal && (this.fblnGSTAmended == null ? that.fblnGSTAmended == null : this.fblnGSTAmended.equals(that.fblnGSTAmended));
    equal = equal && (this.fcurGSTPayable == null ? that.fcurGSTPayable == null : this.fcurGSTPayable.equals(that.fcurGSTPayable));
    equal = equal && (this.fcurTotalAmount == null ? that.fcurTotalAmount == null : this.fcurTotalAmount.equals(that.fcurTotalAmount));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fcurTaxableBenefits = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.fcurFBTTaxRate = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.fblnAlternateCalc = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fcurFringeTaxCalculation = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurExemptFringeBenefits = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fblnGSTAmended = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fcurGSTPayable = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurTotalAmount = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(10, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(11, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fcurTaxableBenefits = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.fcurFBTTaxRate = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.fblnAlternateCalc = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fcurFringeTaxCalculation = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurExemptFringeBenefits = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fblnGSTAmended = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fcurGSTPayable = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurTotalAmount = JdbcWritableBridge.readBigDecimal(9, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxableBenefits, 2 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFBTTaxRate, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAlternateCalc, 4 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFringeTaxCalculation, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurExemptFringeBenefits, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnGSTAmended, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGSTPayable, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalAmount, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 11 + __off, 93, __dbStmt);
    return 11;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxableBenefits, 2 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFBTTaxRate, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAlternateCalc, 4 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFringeTaxCalculation, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurExemptFringeBenefits, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnGSTAmended, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGSTPayable, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalAmount, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 11 + __off, 93, __dbStmt);
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
        this.fcurTaxableBenefits = null;
    } else {
    this.fcurTaxableBenefits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurFBTTaxRate = null;
    } else {
    this.fcurFBTTaxRate = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnAlternateCalc = null;
    } else {
    this.fblnAlternateCalc = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurFringeTaxCalculation = null;
    } else {
    this.fcurFringeTaxCalculation = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurExemptFringeBenefits = null;
    } else {
    this.fcurExemptFringeBenefits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnGSTAmended = null;
    } else {
    this.fblnGSTAmended = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurGSTPayable = null;
    } else {
    this.fcurGSTPayable = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalAmount = null;
    } else {
    this.fcurTotalAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.fcurTaxableBenefits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxableBenefits, __dataOut);
    }
    if (null == this.fcurFBTTaxRate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFBTTaxRate, __dataOut);
    }
    if (null == this.fblnAlternateCalc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAlternateCalc);
    }
    if (null == this.fcurFringeTaxCalculation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFringeTaxCalculation, __dataOut);
    }
    if (null == this.fcurExemptFringeBenefits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurExemptFringeBenefits, __dataOut);
    }
    if (null == this.fblnGSTAmended) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnGSTAmended);
    }
    if (null == this.fcurGSTPayable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGSTPayable, __dataOut);
    }
    if (null == this.fcurTotalAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalAmount, __dataOut);
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
    if (null == this.fcurTaxableBenefits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxableBenefits, __dataOut);
    }
    if (null == this.fcurFBTTaxRate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFBTTaxRate, __dataOut);
    }
    if (null == this.fblnAlternateCalc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAlternateCalc);
    }
    if (null == this.fcurFringeTaxCalculation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFringeTaxCalculation, __dataOut);
    }
    if (null == this.fcurExemptFringeBenefits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurExemptFringeBenefits, __dataOut);
    }
    if (null == this.fblnGSTAmended) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnGSTAmended);
    }
    if (null == this.fcurGSTPayable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGSTPayable, __dataOut);
    }
    if (null == this.fcurTotalAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalAmount, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxableBenefits==null?"\\N":fcurTaxableBenefits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFBTTaxRate==null?"\\N":fcurFBTTaxRate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAlternateCalc==null?"\\N":"" + fblnAlternateCalc, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFringeTaxCalculation==null?"\\N":fcurFringeTaxCalculation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurExemptFringeBenefits==null?"\\N":fcurExemptFringeBenefits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnGSTAmended==null?"\\N":"" + fblnGSTAmended, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGSTPayable==null?"\\N":fcurGSTPayable.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalAmount==null?"\\N":fcurTotalAmount.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxableBenefits==null?"\\N":fcurTaxableBenefits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFBTTaxRate==null?"\\N":fcurFBTTaxRate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAlternateCalc==null?"\\N":"" + fblnAlternateCalc, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFringeTaxCalculation==null?"\\N":fcurFringeTaxCalculation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurExemptFringeBenefits==null?"\\N":fcurExemptFringeBenefits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnGSTAmended==null?"\\N":"" + fblnGSTAmended, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGSTPayable==null?"\\N":fcurGSTPayable.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalAmount==null?"\\N":fcurTotalAmount.toPlainString(), delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxableBenefits = null; } else {
      this.fcurTaxableBenefits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFBTTaxRate = null; } else {
      this.fcurFBTTaxRate = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAlternateCalc = null; } else {
      this.fblnAlternateCalc = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFringeTaxCalculation = null; } else {
      this.fcurFringeTaxCalculation = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurExemptFringeBenefits = null; } else {
      this.fcurExemptFringeBenefits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnGSTAmended = null; } else {
      this.fblnGSTAmended = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGSTPayable = null; } else {
      this.fcurGSTPayable = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalAmount = null; } else {
      this.fcurTotalAmount = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxableBenefits = null; } else {
      this.fcurTaxableBenefits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFBTTaxRate = null; } else {
      this.fcurFBTTaxRate = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAlternateCalc = null; } else {
      this.fblnAlternateCalc = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFringeTaxCalculation = null; } else {
      this.fcurFringeTaxCalculation = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurExemptFringeBenefits = null; } else {
      this.fcurExemptFringeBenefits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnGSTAmended = null; } else {
      this.fblnGSTAmended = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGSTPayable = null; } else {
      this.fcurGSTPayable = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalAmount = null; } else {
      this.fcurTotalAmount = new java.math.BigDecimal(__cur_str);
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
    tblnz_rtnfbtann o = (tblnz_rtnfbtann) super.clone();
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_rtnfbtann o) throws CloneNotSupportedException {
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fcurTaxableBenefits", this.fcurTaxableBenefits);
    __sqoop$field_map.put("fcurFBTTaxRate", this.fcurFBTTaxRate);
    __sqoop$field_map.put("fblnAlternateCalc", this.fblnAlternateCalc);
    __sqoop$field_map.put("fcurFringeTaxCalculation", this.fcurFringeTaxCalculation);
    __sqoop$field_map.put("fcurExemptFringeBenefits", this.fcurExemptFringeBenefits);
    __sqoop$field_map.put("fblnGSTAmended", this.fblnGSTAmended);
    __sqoop$field_map.put("fcurGSTPayable", this.fcurGSTPayable);
    __sqoop$field_map.put("fcurTotalAmount", this.fcurTotalAmount);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fcurTaxableBenefits", this.fcurTaxableBenefits);
    __sqoop$field_map.put("fcurFBTTaxRate", this.fcurFBTTaxRate);
    __sqoop$field_map.put("fblnAlternateCalc", this.fblnAlternateCalc);
    __sqoop$field_map.put("fcurFringeTaxCalculation", this.fcurFringeTaxCalculation);
    __sqoop$field_map.put("fcurExemptFringeBenefits", this.fcurExemptFringeBenefits);
    __sqoop$field_map.put("fblnGSTAmended", this.fblnGSTAmended);
    __sqoop$field_map.put("fcurGSTPayable", this.fcurGSTPayable);
    __sqoop$field_map.put("fcurTotalAmount", this.fcurTotalAmount);
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
