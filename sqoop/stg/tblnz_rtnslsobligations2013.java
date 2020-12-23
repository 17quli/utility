// ORM class for table 'tblnz_rtnslsobligations2013'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 03:49:02 NZDT 2020
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

public class tblnz_rtnslsobligations2013 extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnslsobligations2013.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fcurTotalIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnslsobligations2013.this.fcurTotalIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPreviouslyAssessedIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnslsobligations2013.this.fcurPreviouslyAssessedIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurNZBAssessment", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnslsobligations2013.this.fcurNZBAssessment = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOBBInstalmentAmount1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnslsobligations2013.this.fcurOBBInstalmentAmount1 = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOBBInstalmentAmount2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnslsobligations2013.this.fcurOBBInstalmentAmount2 = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurBracket", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnslsobligations2013.this.fcurBracket = (java.math.BigDecimal)value;
      }
    });
    setters.put("fdtmObbBegin2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnslsobligations2013.this.fdtmObbBegin2 = (java.sql.Timestamp)value;
      }
    });
    setters.put("fcurBracket2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnslsobligations2013.this.fcurBracket2 = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnCnv", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnslsobligations2013.this.fblnCnv = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnslsobligations2013.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnslsobligations2013.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_rtnslsobligations2013() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_rtnslsobligations2013 with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private java.math.BigDecimal fcurTotalIncome;
  public java.math.BigDecimal get_fcurTotalIncome() {
    return fcurTotalIncome;
  }
  public void set_fcurTotalIncome(java.math.BigDecimal fcurTotalIncome) {
    this.fcurTotalIncome = fcurTotalIncome;
  }
  public tblnz_rtnslsobligations2013 with_fcurTotalIncome(java.math.BigDecimal fcurTotalIncome) {
    this.fcurTotalIncome = fcurTotalIncome;
    return this;
  }
  private java.math.BigDecimal fcurPreviouslyAssessedIncome;
  public java.math.BigDecimal get_fcurPreviouslyAssessedIncome() {
    return fcurPreviouslyAssessedIncome;
  }
  public void set_fcurPreviouslyAssessedIncome(java.math.BigDecimal fcurPreviouslyAssessedIncome) {
    this.fcurPreviouslyAssessedIncome = fcurPreviouslyAssessedIncome;
  }
  public tblnz_rtnslsobligations2013 with_fcurPreviouslyAssessedIncome(java.math.BigDecimal fcurPreviouslyAssessedIncome) {
    this.fcurPreviouslyAssessedIncome = fcurPreviouslyAssessedIncome;
    return this;
  }
  private java.math.BigDecimal fcurNZBAssessment;
  public java.math.BigDecimal get_fcurNZBAssessment() {
    return fcurNZBAssessment;
  }
  public void set_fcurNZBAssessment(java.math.BigDecimal fcurNZBAssessment) {
    this.fcurNZBAssessment = fcurNZBAssessment;
  }
  public tblnz_rtnslsobligations2013 with_fcurNZBAssessment(java.math.BigDecimal fcurNZBAssessment) {
    this.fcurNZBAssessment = fcurNZBAssessment;
    return this;
  }
  private java.math.BigDecimal fcurOBBInstalmentAmount1;
  public java.math.BigDecimal get_fcurOBBInstalmentAmount1() {
    return fcurOBBInstalmentAmount1;
  }
  public void set_fcurOBBInstalmentAmount1(java.math.BigDecimal fcurOBBInstalmentAmount1) {
    this.fcurOBBInstalmentAmount1 = fcurOBBInstalmentAmount1;
  }
  public tblnz_rtnslsobligations2013 with_fcurOBBInstalmentAmount1(java.math.BigDecimal fcurOBBInstalmentAmount1) {
    this.fcurOBBInstalmentAmount1 = fcurOBBInstalmentAmount1;
    return this;
  }
  private java.math.BigDecimal fcurOBBInstalmentAmount2;
  public java.math.BigDecimal get_fcurOBBInstalmentAmount2() {
    return fcurOBBInstalmentAmount2;
  }
  public void set_fcurOBBInstalmentAmount2(java.math.BigDecimal fcurOBBInstalmentAmount2) {
    this.fcurOBBInstalmentAmount2 = fcurOBBInstalmentAmount2;
  }
  public tblnz_rtnslsobligations2013 with_fcurOBBInstalmentAmount2(java.math.BigDecimal fcurOBBInstalmentAmount2) {
    this.fcurOBBInstalmentAmount2 = fcurOBBInstalmentAmount2;
    return this;
  }
  private java.math.BigDecimal fcurBracket;
  public java.math.BigDecimal get_fcurBracket() {
    return fcurBracket;
  }
  public void set_fcurBracket(java.math.BigDecimal fcurBracket) {
    this.fcurBracket = fcurBracket;
  }
  public tblnz_rtnslsobligations2013 with_fcurBracket(java.math.BigDecimal fcurBracket) {
    this.fcurBracket = fcurBracket;
    return this;
  }
  private java.sql.Timestamp fdtmObbBegin2;
  public java.sql.Timestamp get_fdtmObbBegin2() {
    return fdtmObbBegin2;
  }
  public void set_fdtmObbBegin2(java.sql.Timestamp fdtmObbBegin2) {
    this.fdtmObbBegin2 = fdtmObbBegin2;
  }
  public tblnz_rtnslsobligations2013 with_fdtmObbBegin2(java.sql.Timestamp fdtmObbBegin2) {
    this.fdtmObbBegin2 = fdtmObbBegin2;
    return this;
  }
  private java.math.BigDecimal fcurBracket2;
  public java.math.BigDecimal get_fcurBracket2() {
    return fcurBracket2;
  }
  public void set_fcurBracket2(java.math.BigDecimal fcurBracket2) {
    this.fcurBracket2 = fcurBracket2;
  }
  public tblnz_rtnslsobligations2013 with_fcurBracket2(java.math.BigDecimal fcurBracket2) {
    this.fcurBracket2 = fcurBracket2;
    return this;
  }
  private Integer fblnCnv;
  public Integer get_fblnCnv() {
    return fblnCnv;
  }
  public void set_fblnCnv(Integer fblnCnv) {
    this.fblnCnv = fblnCnv;
  }
  public tblnz_rtnslsobligations2013 with_fblnCnv(Integer fblnCnv) {
    this.fblnCnv = fblnCnv;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_rtnslsobligations2013 with_fstrWho(String fstrWho) {
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
  public tblnz_rtnslsobligations2013 with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnslsobligations2013)) {
      return false;
    }
    tblnz_rtnslsobligations2013 that = (tblnz_rtnslsobligations2013) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fcurTotalIncome == null ? that.fcurTotalIncome == null : this.fcurTotalIncome.equals(that.fcurTotalIncome));
    equal = equal && (this.fcurPreviouslyAssessedIncome == null ? that.fcurPreviouslyAssessedIncome == null : this.fcurPreviouslyAssessedIncome.equals(that.fcurPreviouslyAssessedIncome));
    equal = equal && (this.fcurNZBAssessment == null ? that.fcurNZBAssessment == null : this.fcurNZBAssessment.equals(that.fcurNZBAssessment));
    equal = equal && (this.fcurOBBInstalmentAmount1 == null ? that.fcurOBBInstalmentAmount1 == null : this.fcurOBBInstalmentAmount1.equals(that.fcurOBBInstalmentAmount1));
    equal = equal && (this.fcurOBBInstalmentAmount2 == null ? that.fcurOBBInstalmentAmount2 == null : this.fcurOBBInstalmentAmount2.equals(that.fcurOBBInstalmentAmount2));
    equal = equal && (this.fcurBracket == null ? that.fcurBracket == null : this.fcurBracket.equals(that.fcurBracket));
    equal = equal && (this.fdtmObbBegin2 == null ? that.fdtmObbBegin2 == null : this.fdtmObbBegin2.equals(that.fdtmObbBegin2));
    equal = equal && (this.fcurBracket2 == null ? that.fcurBracket2 == null : this.fcurBracket2.equals(that.fcurBracket2));
    equal = equal && (this.fblnCnv == null ? that.fblnCnv == null : this.fblnCnv.equals(that.fblnCnv));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnslsobligations2013)) {
      return false;
    }
    tblnz_rtnslsobligations2013 that = (tblnz_rtnslsobligations2013) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fcurTotalIncome == null ? that.fcurTotalIncome == null : this.fcurTotalIncome.equals(that.fcurTotalIncome));
    equal = equal && (this.fcurPreviouslyAssessedIncome == null ? that.fcurPreviouslyAssessedIncome == null : this.fcurPreviouslyAssessedIncome.equals(that.fcurPreviouslyAssessedIncome));
    equal = equal && (this.fcurNZBAssessment == null ? that.fcurNZBAssessment == null : this.fcurNZBAssessment.equals(that.fcurNZBAssessment));
    equal = equal && (this.fcurOBBInstalmentAmount1 == null ? that.fcurOBBInstalmentAmount1 == null : this.fcurOBBInstalmentAmount1.equals(that.fcurOBBInstalmentAmount1));
    equal = equal && (this.fcurOBBInstalmentAmount2 == null ? that.fcurOBBInstalmentAmount2 == null : this.fcurOBBInstalmentAmount2.equals(that.fcurOBBInstalmentAmount2));
    equal = equal && (this.fcurBracket == null ? that.fcurBracket == null : this.fcurBracket.equals(that.fcurBracket));
    equal = equal && (this.fdtmObbBegin2 == null ? that.fdtmObbBegin2 == null : this.fdtmObbBegin2.equals(that.fdtmObbBegin2));
    equal = equal && (this.fcurBracket2 == null ? that.fcurBracket2 == null : this.fcurBracket2.equals(that.fcurBracket2));
    equal = equal && (this.fblnCnv == null ? that.fblnCnv == null : this.fblnCnv.equals(that.fblnCnv));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fcurTotalIncome = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.fcurPreviouslyAssessedIncome = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.fcurNZBAssessment = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurOBBInstalmentAmount1 = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurOBBInstalmentAmount2 = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurBracket = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fdtmObbBegin2 = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.fcurBracket2 = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fblnCnv = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(11, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(12, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fcurTotalIncome = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.fcurPreviouslyAssessedIncome = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.fcurNZBAssessment = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurOBBInstalmentAmount1 = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurOBBInstalmentAmount2 = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurBracket = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fdtmObbBegin2 = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.fcurBracket2 = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fblnCnv = JdbcWritableBridge.readInteger(10, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalIncome, 2 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPreviouslyAssessedIncome, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNZBAssessment, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOBBInstalmentAmount1, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOBBInstalmentAmount2, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBracket, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmObbBegin2, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBracket2, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCnv, 10 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 12 + __off, 93, __dbStmt);
    return 12;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalIncome, 2 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPreviouslyAssessedIncome, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNZBAssessment, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOBBInstalmentAmount1, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOBBInstalmentAmount2, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBracket, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmObbBegin2, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBracket2, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCnv, 10 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 12 + __off, 93, __dbStmt);
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
        this.fcurTotalIncome = null;
    } else {
    this.fcurTotalIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPreviouslyAssessedIncome = null;
    } else {
    this.fcurPreviouslyAssessedIncome = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurNZBAssessment = null;
    } else {
    this.fcurNZBAssessment = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOBBInstalmentAmount1 = null;
    } else {
    this.fcurOBBInstalmentAmount1 = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOBBInstalmentAmount2 = null;
    } else {
    this.fcurOBBInstalmentAmount2 = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurBracket = null;
    } else {
    this.fcurBracket = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmObbBegin2 = null;
    } else {
    this.fdtmObbBegin2 = new Timestamp(__dataIn.readLong());
    this.fdtmObbBegin2.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurBracket2 = null;
    } else {
    this.fcurBracket2 = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnCnv = null;
    } else {
    this.fblnCnv = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.fcurTotalIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalIncome, __dataOut);
    }
    if (null == this.fcurPreviouslyAssessedIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPreviouslyAssessedIncome, __dataOut);
    }
    if (null == this.fcurNZBAssessment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNZBAssessment, __dataOut);
    }
    if (null == this.fcurOBBInstalmentAmount1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOBBInstalmentAmount1, __dataOut);
    }
    if (null == this.fcurOBBInstalmentAmount2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOBBInstalmentAmount2, __dataOut);
    }
    if (null == this.fcurBracket) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBracket, __dataOut);
    }
    if (null == this.fdtmObbBegin2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmObbBegin2.getTime());
    __dataOut.writeInt(this.fdtmObbBegin2.getNanos());
    }
    if (null == this.fcurBracket2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBracket2, __dataOut);
    }
    if (null == this.fblnCnv) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCnv);
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
    if (null == this.fcurTotalIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalIncome, __dataOut);
    }
    if (null == this.fcurPreviouslyAssessedIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPreviouslyAssessedIncome, __dataOut);
    }
    if (null == this.fcurNZBAssessment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNZBAssessment, __dataOut);
    }
    if (null == this.fcurOBBInstalmentAmount1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOBBInstalmentAmount1, __dataOut);
    }
    if (null == this.fcurOBBInstalmentAmount2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOBBInstalmentAmount2, __dataOut);
    }
    if (null == this.fcurBracket) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBracket, __dataOut);
    }
    if (null == this.fdtmObbBegin2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmObbBegin2.getTime());
    __dataOut.writeInt(this.fdtmObbBegin2.getNanos());
    }
    if (null == this.fcurBracket2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBracket2, __dataOut);
    }
    if (null == this.fblnCnv) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCnv);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalIncome==null?"\\N":fcurTotalIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPreviouslyAssessedIncome==null?"\\N":fcurPreviouslyAssessedIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNZBAssessment==null?"\\N":fcurNZBAssessment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOBBInstalmentAmount1==null?"\\N":fcurOBBInstalmentAmount1.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOBBInstalmentAmount2==null?"\\N":fcurOBBInstalmentAmount2.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBracket==null?"\\N":fcurBracket.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmObbBegin2==null?"\\N":"" + fdtmObbBegin2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBracket2==null?"\\N":fcurBracket2.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCnv==null?"\\N":"" + fblnCnv, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalIncome==null?"\\N":fcurTotalIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPreviouslyAssessedIncome==null?"\\N":fcurPreviouslyAssessedIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNZBAssessment==null?"\\N":fcurNZBAssessment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOBBInstalmentAmount1==null?"\\N":fcurOBBInstalmentAmount1.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOBBInstalmentAmount2==null?"\\N":fcurOBBInstalmentAmount2.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBracket==null?"\\N":fcurBracket.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmObbBegin2==null?"\\N":"" + fdtmObbBegin2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBracket2==null?"\\N":fcurBracket2.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCnv==null?"\\N":"" + fblnCnv, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalIncome = null; } else {
      this.fcurTotalIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPreviouslyAssessedIncome = null; } else {
      this.fcurPreviouslyAssessedIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNZBAssessment = null; } else {
      this.fcurNZBAssessment = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOBBInstalmentAmount1 = null; } else {
      this.fcurOBBInstalmentAmount1 = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOBBInstalmentAmount2 = null; } else {
      this.fcurOBBInstalmentAmount2 = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBracket = null; } else {
      this.fcurBracket = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmObbBegin2 = null; } else {
      this.fdtmObbBegin2 = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBracket2 = null; } else {
      this.fcurBracket2 = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCnv = null; } else {
      this.fblnCnv = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalIncome = null; } else {
      this.fcurTotalIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPreviouslyAssessedIncome = null; } else {
      this.fcurPreviouslyAssessedIncome = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNZBAssessment = null; } else {
      this.fcurNZBAssessment = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOBBInstalmentAmount1 = null; } else {
      this.fcurOBBInstalmentAmount1 = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOBBInstalmentAmount2 = null; } else {
      this.fcurOBBInstalmentAmount2 = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBracket = null; } else {
      this.fcurBracket = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmObbBegin2 = null; } else {
      this.fdtmObbBegin2 = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBracket2 = null; } else {
      this.fcurBracket2 = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCnv = null; } else {
      this.fblnCnv = Integer.valueOf(__cur_str);
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
    tblnz_rtnslsobligations2013 o = (tblnz_rtnslsobligations2013) super.clone();
    o.fdtmObbBegin2 = (o.fdtmObbBegin2 != null) ? (java.sql.Timestamp) o.fdtmObbBegin2.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_rtnslsobligations2013 o) throws CloneNotSupportedException {
    o.fdtmObbBegin2 = (o.fdtmObbBegin2 != null) ? (java.sql.Timestamp) o.fdtmObbBegin2.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fcurTotalIncome", this.fcurTotalIncome);
    __sqoop$field_map.put("fcurPreviouslyAssessedIncome", this.fcurPreviouslyAssessedIncome);
    __sqoop$field_map.put("fcurNZBAssessment", this.fcurNZBAssessment);
    __sqoop$field_map.put("fcurOBBInstalmentAmount1", this.fcurOBBInstalmentAmount1);
    __sqoop$field_map.put("fcurOBBInstalmentAmount2", this.fcurOBBInstalmentAmount2);
    __sqoop$field_map.put("fcurBracket", this.fcurBracket);
    __sqoop$field_map.put("fdtmObbBegin2", this.fdtmObbBegin2);
    __sqoop$field_map.put("fcurBracket2", this.fcurBracket2);
    __sqoop$field_map.put("fblnCnv", this.fblnCnv);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fcurTotalIncome", this.fcurTotalIncome);
    __sqoop$field_map.put("fcurPreviouslyAssessedIncome", this.fcurPreviouslyAssessedIncome);
    __sqoop$field_map.put("fcurNZBAssessment", this.fcurNZBAssessment);
    __sqoop$field_map.put("fcurOBBInstalmentAmount1", this.fcurOBBInstalmentAmount1);
    __sqoop$field_map.put("fcurOBBInstalmentAmount2", this.fcurOBBInstalmentAmount2);
    __sqoop$field_map.put("fcurBracket", this.fcurBracket);
    __sqoop$field_map.put("fdtmObbBegin2", this.fdtmObbBegin2);
    __sqoop$field_map.put("fcurBracket2", this.fcurBracket2);
    __sqoop$field_map.put("fblnCnv", this.fblnCnv);
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
