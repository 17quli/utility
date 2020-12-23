// ORM class for table 'tblnz_rtnprovisional'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 00:49:38 NZDT 2020
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

public class tblnz_rtnprovisional extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnprovisional.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fcurLossToCarryForward", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnprovisional.this.fcurLossToCarryForward = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurResidualIncomeTax", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnprovisional.this.fcurResidualIncomeTax = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTerminalTax", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnprovisional.this.fcurTerminalTax = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurFurtherIncomeTax", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnprovisional.this.fcurFurtherIncomeTax = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPriorYearRIT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnprovisional.this.fcurPriorYearRIT = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnVoluntaryProv", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnprovisional.this.fblnVoluntaryProv = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnprovisional.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnprovisional.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_rtnprovisional() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_rtnprovisional with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private java.math.BigDecimal fcurLossToCarryForward;
  public java.math.BigDecimal get_fcurLossToCarryForward() {
    return fcurLossToCarryForward;
  }
  public void set_fcurLossToCarryForward(java.math.BigDecimal fcurLossToCarryForward) {
    this.fcurLossToCarryForward = fcurLossToCarryForward;
  }
  public tblnz_rtnprovisional with_fcurLossToCarryForward(java.math.BigDecimal fcurLossToCarryForward) {
    this.fcurLossToCarryForward = fcurLossToCarryForward;
    return this;
  }
  private java.math.BigDecimal fcurResidualIncomeTax;
  public java.math.BigDecimal get_fcurResidualIncomeTax() {
    return fcurResidualIncomeTax;
  }
  public void set_fcurResidualIncomeTax(java.math.BigDecimal fcurResidualIncomeTax) {
    this.fcurResidualIncomeTax = fcurResidualIncomeTax;
  }
  public tblnz_rtnprovisional with_fcurResidualIncomeTax(java.math.BigDecimal fcurResidualIncomeTax) {
    this.fcurResidualIncomeTax = fcurResidualIncomeTax;
    return this;
  }
  private java.math.BigDecimal fcurTerminalTax;
  public java.math.BigDecimal get_fcurTerminalTax() {
    return fcurTerminalTax;
  }
  public void set_fcurTerminalTax(java.math.BigDecimal fcurTerminalTax) {
    this.fcurTerminalTax = fcurTerminalTax;
  }
  public tblnz_rtnprovisional with_fcurTerminalTax(java.math.BigDecimal fcurTerminalTax) {
    this.fcurTerminalTax = fcurTerminalTax;
    return this;
  }
  private java.math.BigDecimal fcurFurtherIncomeTax;
  public java.math.BigDecimal get_fcurFurtherIncomeTax() {
    return fcurFurtherIncomeTax;
  }
  public void set_fcurFurtherIncomeTax(java.math.BigDecimal fcurFurtherIncomeTax) {
    this.fcurFurtherIncomeTax = fcurFurtherIncomeTax;
  }
  public tblnz_rtnprovisional with_fcurFurtherIncomeTax(java.math.BigDecimal fcurFurtherIncomeTax) {
    this.fcurFurtherIncomeTax = fcurFurtherIncomeTax;
    return this;
  }
  private java.math.BigDecimal fcurPriorYearRIT;
  public java.math.BigDecimal get_fcurPriorYearRIT() {
    return fcurPriorYearRIT;
  }
  public void set_fcurPriorYearRIT(java.math.BigDecimal fcurPriorYearRIT) {
    this.fcurPriorYearRIT = fcurPriorYearRIT;
  }
  public tblnz_rtnprovisional with_fcurPriorYearRIT(java.math.BigDecimal fcurPriorYearRIT) {
    this.fcurPriorYearRIT = fcurPriorYearRIT;
    return this;
  }
  private Integer fblnVoluntaryProv;
  public Integer get_fblnVoluntaryProv() {
    return fblnVoluntaryProv;
  }
  public void set_fblnVoluntaryProv(Integer fblnVoluntaryProv) {
    this.fblnVoluntaryProv = fblnVoluntaryProv;
  }
  public tblnz_rtnprovisional with_fblnVoluntaryProv(Integer fblnVoluntaryProv) {
    this.fblnVoluntaryProv = fblnVoluntaryProv;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_rtnprovisional with_fstrWho(String fstrWho) {
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
  public tblnz_rtnprovisional with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnprovisional)) {
      return false;
    }
    tblnz_rtnprovisional that = (tblnz_rtnprovisional) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fcurLossToCarryForward == null ? that.fcurLossToCarryForward == null : this.fcurLossToCarryForward.equals(that.fcurLossToCarryForward));
    equal = equal && (this.fcurResidualIncomeTax == null ? that.fcurResidualIncomeTax == null : this.fcurResidualIncomeTax.equals(that.fcurResidualIncomeTax));
    equal = equal && (this.fcurTerminalTax == null ? that.fcurTerminalTax == null : this.fcurTerminalTax.equals(that.fcurTerminalTax));
    equal = equal && (this.fcurFurtherIncomeTax == null ? that.fcurFurtherIncomeTax == null : this.fcurFurtherIncomeTax.equals(that.fcurFurtherIncomeTax));
    equal = equal && (this.fcurPriorYearRIT == null ? that.fcurPriorYearRIT == null : this.fcurPriorYearRIT.equals(that.fcurPriorYearRIT));
    equal = equal && (this.fblnVoluntaryProv == null ? that.fblnVoluntaryProv == null : this.fblnVoluntaryProv.equals(that.fblnVoluntaryProv));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnprovisional)) {
      return false;
    }
    tblnz_rtnprovisional that = (tblnz_rtnprovisional) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fcurLossToCarryForward == null ? that.fcurLossToCarryForward == null : this.fcurLossToCarryForward.equals(that.fcurLossToCarryForward));
    equal = equal && (this.fcurResidualIncomeTax == null ? that.fcurResidualIncomeTax == null : this.fcurResidualIncomeTax.equals(that.fcurResidualIncomeTax));
    equal = equal && (this.fcurTerminalTax == null ? that.fcurTerminalTax == null : this.fcurTerminalTax.equals(that.fcurTerminalTax));
    equal = equal && (this.fcurFurtherIncomeTax == null ? that.fcurFurtherIncomeTax == null : this.fcurFurtherIncomeTax.equals(that.fcurFurtherIncomeTax));
    equal = equal && (this.fcurPriorYearRIT == null ? that.fcurPriorYearRIT == null : this.fcurPriorYearRIT.equals(that.fcurPriorYearRIT));
    equal = equal && (this.fblnVoluntaryProv == null ? that.fblnVoluntaryProv == null : this.fblnVoluntaryProv.equals(that.fblnVoluntaryProv));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fcurLossToCarryForward = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.fcurResidualIncomeTax = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.fcurTerminalTax = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurFurtherIncomeTax = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurPriorYearRIT = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fblnVoluntaryProv = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(8, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(9, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fcurLossToCarryForward = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.fcurResidualIncomeTax = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.fcurTerminalTax = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurFurtherIncomeTax = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurPriorYearRIT = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fblnVoluntaryProv = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(8, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(9, __dbResults);
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
    JdbcWritableBridge.writeBigDecimal(fcurLossToCarryForward, 2 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResidualIncomeTax, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTerminalTax, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFurtherIncomeTax, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPriorYearRIT, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnVoluntaryProv, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 9 + __off, 93, __dbStmt);
    return 9;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLossToCarryForward, 2 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurResidualIncomeTax, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTerminalTax, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFurtherIncomeTax, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPriorYearRIT, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnVoluntaryProv, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 9 + __off, 93, __dbStmt);
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
        this.fcurLossToCarryForward = null;
    } else {
    this.fcurLossToCarryForward = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurResidualIncomeTax = null;
    } else {
    this.fcurResidualIncomeTax = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTerminalTax = null;
    } else {
    this.fcurTerminalTax = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurFurtherIncomeTax = null;
    } else {
    this.fcurFurtherIncomeTax = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPriorYearRIT = null;
    } else {
    this.fcurPriorYearRIT = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnVoluntaryProv = null;
    } else {
    this.fblnVoluntaryProv = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.fcurLossToCarryForward) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLossToCarryForward, __dataOut);
    }
    if (null == this.fcurResidualIncomeTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurResidualIncomeTax, __dataOut);
    }
    if (null == this.fcurTerminalTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTerminalTax, __dataOut);
    }
    if (null == this.fcurFurtherIncomeTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFurtherIncomeTax, __dataOut);
    }
    if (null == this.fcurPriorYearRIT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPriorYearRIT, __dataOut);
    }
    if (null == this.fblnVoluntaryProv) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnVoluntaryProv);
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
    if (null == this.fcurLossToCarryForward) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLossToCarryForward, __dataOut);
    }
    if (null == this.fcurResidualIncomeTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurResidualIncomeTax, __dataOut);
    }
    if (null == this.fcurTerminalTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTerminalTax, __dataOut);
    }
    if (null == this.fcurFurtherIncomeTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFurtherIncomeTax, __dataOut);
    }
    if (null == this.fcurPriorYearRIT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPriorYearRIT, __dataOut);
    }
    if (null == this.fblnVoluntaryProv) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnVoluntaryProv);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLossToCarryForward==null?"\\N":fcurLossToCarryForward.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurResidualIncomeTax==null?"\\N":fcurResidualIncomeTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTerminalTax==null?"\\N":fcurTerminalTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFurtherIncomeTax==null?"\\N":fcurFurtherIncomeTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPriorYearRIT==null?"\\N":fcurPriorYearRIT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnVoluntaryProv==null?"\\N":"" + fblnVoluntaryProv, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLossToCarryForward==null?"\\N":fcurLossToCarryForward.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurResidualIncomeTax==null?"\\N":fcurResidualIncomeTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTerminalTax==null?"\\N":fcurTerminalTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFurtherIncomeTax==null?"\\N":fcurFurtherIncomeTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPriorYearRIT==null?"\\N":fcurPriorYearRIT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnVoluntaryProv==null?"\\N":"" + fblnVoluntaryProv, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLossToCarryForward = null; } else {
      this.fcurLossToCarryForward = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurResidualIncomeTax = null; } else {
      this.fcurResidualIncomeTax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTerminalTax = null; } else {
      this.fcurTerminalTax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFurtherIncomeTax = null; } else {
      this.fcurFurtherIncomeTax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPriorYearRIT = null; } else {
      this.fcurPriorYearRIT = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnVoluntaryProv = null; } else {
      this.fblnVoluntaryProv = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLossToCarryForward = null; } else {
      this.fcurLossToCarryForward = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurResidualIncomeTax = null; } else {
      this.fcurResidualIncomeTax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTerminalTax = null; } else {
      this.fcurTerminalTax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFurtherIncomeTax = null; } else {
      this.fcurFurtherIncomeTax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPriorYearRIT = null; } else {
      this.fcurPriorYearRIT = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnVoluntaryProv = null; } else {
      this.fblnVoluntaryProv = Integer.valueOf(__cur_str);
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
    tblnz_rtnprovisional o = (tblnz_rtnprovisional) super.clone();
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_rtnprovisional o) throws CloneNotSupportedException {
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fcurLossToCarryForward", this.fcurLossToCarryForward);
    __sqoop$field_map.put("fcurResidualIncomeTax", this.fcurResidualIncomeTax);
    __sqoop$field_map.put("fcurTerminalTax", this.fcurTerminalTax);
    __sqoop$field_map.put("fcurFurtherIncomeTax", this.fcurFurtherIncomeTax);
    __sqoop$field_map.put("fcurPriorYearRIT", this.fcurPriorYearRIT);
    __sqoop$field_map.put("fblnVoluntaryProv", this.fblnVoluntaryProv);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fcurLossToCarryForward", this.fcurLossToCarryForward);
    __sqoop$field_map.put("fcurResidualIncomeTax", this.fcurResidualIncomeTax);
    __sqoop$field_map.put("fcurTerminalTax", this.fcurTerminalTax);
    __sqoop$field_map.put("fcurFurtherIncomeTax", this.fcurFurtherIncomeTax);
    __sqoop$field_map.put("fcurPriorYearRIT", this.fcurPriorYearRIT);
    __sqoop$field_map.put("fblnVoluntaryProv", this.fblnVoluntaryProv);
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
