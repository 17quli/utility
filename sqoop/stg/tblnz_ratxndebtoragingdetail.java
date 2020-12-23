// ORM class for table 'tblnz_ratxndebtoragingdetail'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 04:59:37 NZDT 2020
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

public class tblnz_ratxndebtoragingdetail extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ratxndebtoragingdetail.this.flngAccountKey = (Integer)value;
      }
    });
    setters.put("fdtmFilingPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ratxndebtoragingdetail.this.fdtmFilingPeriod = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmRevenuePeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ratxndebtoragingdetail.this.fdtmRevenuePeriod = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrDebtorRAKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ratxndebtoragingdetail.this.fstrDebtorRAKey = (String)value;
      }
    });
    setters.put("fstrRevenueGroup", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ratxndebtoragingdetail.this.fstrRevenueGroup = (String)value;
      }
    });
    setters.put("fcurBalanceRevPrdStart", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ratxndebtoragingdetail.this.fcurBalanceRevPrdStart = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurBalanceAtRevPrdEnd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ratxndebtoragingdetail.this.fcurBalanceAtRevPrdEnd = (java.math.BigDecimal)value;
      }
    });
    setters.put("flngDaysAgedAtRevPrdEnd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ratxndebtoragingdetail.this.flngDaysAgedAtRevPrdEnd = (Integer)value;
      }
    });
    setters.put("fstrAgingCategoryAtPeriodEnd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ratxndebtoragingdetail.this.fstrAgingCategoryAtPeriodEnd = (String)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ratxndebtoragingdetail.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ratxndebtoragingdetail.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_ratxndebtoragingdetail() {
    init0();
  }
  private Integer flngAccountKey;
  public Integer get_flngAccountKey() {
    return flngAccountKey;
  }
  public void set_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
  }
  public tblnz_ratxndebtoragingdetail with_flngAccountKey(Integer flngAccountKey) {
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
  public tblnz_ratxndebtoragingdetail with_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
    return this;
  }
  private java.sql.Timestamp fdtmRevenuePeriod;
  public java.sql.Timestamp get_fdtmRevenuePeriod() {
    return fdtmRevenuePeriod;
  }
  public void set_fdtmRevenuePeriod(java.sql.Timestamp fdtmRevenuePeriod) {
    this.fdtmRevenuePeriod = fdtmRevenuePeriod;
  }
  public tblnz_ratxndebtoragingdetail with_fdtmRevenuePeriod(java.sql.Timestamp fdtmRevenuePeriod) {
    this.fdtmRevenuePeriod = fdtmRevenuePeriod;
    return this;
  }
  private String fstrDebtorRAKey;
  public String get_fstrDebtorRAKey() {
    return fstrDebtorRAKey;
  }
  public void set_fstrDebtorRAKey(String fstrDebtorRAKey) {
    this.fstrDebtorRAKey = fstrDebtorRAKey;
  }
  public tblnz_ratxndebtoragingdetail with_fstrDebtorRAKey(String fstrDebtorRAKey) {
    this.fstrDebtorRAKey = fstrDebtorRAKey;
    return this;
  }
  private String fstrRevenueGroup;
  public String get_fstrRevenueGroup() {
    return fstrRevenueGroup;
  }
  public void set_fstrRevenueGroup(String fstrRevenueGroup) {
    this.fstrRevenueGroup = fstrRevenueGroup;
  }
  public tblnz_ratxndebtoragingdetail with_fstrRevenueGroup(String fstrRevenueGroup) {
    this.fstrRevenueGroup = fstrRevenueGroup;
    return this;
  }
  private java.math.BigDecimal fcurBalanceRevPrdStart;
  public java.math.BigDecimal get_fcurBalanceRevPrdStart() {
    return fcurBalanceRevPrdStart;
  }
  public void set_fcurBalanceRevPrdStart(java.math.BigDecimal fcurBalanceRevPrdStart) {
    this.fcurBalanceRevPrdStart = fcurBalanceRevPrdStart;
  }
  public tblnz_ratxndebtoragingdetail with_fcurBalanceRevPrdStart(java.math.BigDecimal fcurBalanceRevPrdStart) {
    this.fcurBalanceRevPrdStart = fcurBalanceRevPrdStart;
    return this;
  }
  private java.math.BigDecimal fcurBalanceAtRevPrdEnd;
  public java.math.BigDecimal get_fcurBalanceAtRevPrdEnd() {
    return fcurBalanceAtRevPrdEnd;
  }
  public void set_fcurBalanceAtRevPrdEnd(java.math.BigDecimal fcurBalanceAtRevPrdEnd) {
    this.fcurBalanceAtRevPrdEnd = fcurBalanceAtRevPrdEnd;
  }
  public tblnz_ratxndebtoragingdetail with_fcurBalanceAtRevPrdEnd(java.math.BigDecimal fcurBalanceAtRevPrdEnd) {
    this.fcurBalanceAtRevPrdEnd = fcurBalanceAtRevPrdEnd;
    return this;
  }
  private Integer flngDaysAgedAtRevPrdEnd;
  public Integer get_flngDaysAgedAtRevPrdEnd() {
    return flngDaysAgedAtRevPrdEnd;
  }
  public void set_flngDaysAgedAtRevPrdEnd(Integer flngDaysAgedAtRevPrdEnd) {
    this.flngDaysAgedAtRevPrdEnd = flngDaysAgedAtRevPrdEnd;
  }
  public tblnz_ratxndebtoragingdetail with_flngDaysAgedAtRevPrdEnd(Integer flngDaysAgedAtRevPrdEnd) {
    this.flngDaysAgedAtRevPrdEnd = flngDaysAgedAtRevPrdEnd;
    return this;
  }
  private String fstrAgingCategoryAtPeriodEnd;
  public String get_fstrAgingCategoryAtPeriodEnd() {
    return fstrAgingCategoryAtPeriodEnd;
  }
  public void set_fstrAgingCategoryAtPeriodEnd(String fstrAgingCategoryAtPeriodEnd) {
    this.fstrAgingCategoryAtPeriodEnd = fstrAgingCategoryAtPeriodEnd;
  }
  public tblnz_ratxndebtoragingdetail with_fstrAgingCategoryAtPeriodEnd(String fstrAgingCategoryAtPeriodEnd) {
    this.fstrAgingCategoryAtPeriodEnd = fstrAgingCategoryAtPeriodEnd;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_ratxndebtoragingdetail with_fstrWho(String fstrWho) {
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
  public tblnz_ratxndebtoragingdetail with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_ratxndebtoragingdetail)) {
      return false;
    }
    tblnz_ratxndebtoragingdetail that = (tblnz_ratxndebtoragingdetail) o;
    boolean equal = true;
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.fdtmRevenuePeriod == null ? that.fdtmRevenuePeriod == null : this.fdtmRevenuePeriod.equals(that.fdtmRevenuePeriod));
    equal = equal && (this.fstrDebtorRAKey == null ? that.fstrDebtorRAKey == null : this.fstrDebtorRAKey.equals(that.fstrDebtorRAKey));
    equal = equal && (this.fstrRevenueGroup == null ? that.fstrRevenueGroup == null : this.fstrRevenueGroup.equals(that.fstrRevenueGroup));
    equal = equal && (this.fcurBalanceRevPrdStart == null ? that.fcurBalanceRevPrdStart == null : this.fcurBalanceRevPrdStart.equals(that.fcurBalanceRevPrdStart));
    equal = equal && (this.fcurBalanceAtRevPrdEnd == null ? that.fcurBalanceAtRevPrdEnd == null : this.fcurBalanceAtRevPrdEnd.equals(that.fcurBalanceAtRevPrdEnd));
    equal = equal && (this.flngDaysAgedAtRevPrdEnd == null ? that.flngDaysAgedAtRevPrdEnd == null : this.flngDaysAgedAtRevPrdEnd.equals(that.flngDaysAgedAtRevPrdEnd));
    equal = equal && (this.fstrAgingCategoryAtPeriodEnd == null ? that.fstrAgingCategoryAtPeriodEnd == null : this.fstrAgingCategoryAtPeriodEnd.equals(that.fstrAgingCategoryAtPeriodEnd));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_ratxndebtoragingdetail)) {
      return false;
    }
    tblnz_ratxndebtoragingdetail that = (tblnz_ratxndebtoragingdetail) o;
    boolean equal = true;
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.fdtmRevenuePeriod == null ? that.fdtmRevenuePeriod == null : this.fdtmRevenuePeriod.equals(that.fdtmRevenuePeriod));
    equal = equal && (this.fstrDebtorRAKey == null ? that.fstrDebtorRAKey == null : this.fstrDebtorRAKey.equals(that.fstrDebtorRAKey));
    equal = equal && (this.fstrRevenueGroup == null ? that.fstrRevenueGroup == null : this.fstrRevenueGroup.equals(that.fstrRevenueGroup));
    equal = equal && (this.fcurBalanceRevPrdStart == null ? that.fcurBalanceRevPrdStart == null : this.fcurBalanceRevPrdStart.equals(that.fcurBalanceRevPrdStart));
    equal = equal && (this.fcurBalanceAtRevPrdEnd == null ? that.fcurBalanceAtRevPrdEnd == null : this.fcurBalanceAtRevPrdEnd.equals(that.fcurBalanceAtRevPrdEnd));
    equal = equal && (this.flngDaysAgedAtRevPrdEnd == null ? that.flngDaysAgedAtRevPrdEnd == null : this.flngDaysAgedAtRevPrdEnd.equals(that.flngDaysAgedAtRevPrdEnd));
    equal = equal && (this.fstrAgingCategoryAtPeriodEnd == null ? that.fstrAgingCategoryAtPeriodEnd == null : this.fstrAgingCategoryAtPeriodEnd.equals(that.fstrAgingCategoryAtPeriodEnd));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngAccountKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(2, __dbResults);
    this.fdtmRevenuePeriod = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.fstrDebtorRAKey = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrRevenueGroup = JdbcWritableBridge.readString(5, __dbResults);
    this.fcurBalanceRevPrdStart = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurBalanceAtRevPrdEnd = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.flngDaysAgedAtRevPrdEnd = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fstrAgingCategoryAtPeriodEnd = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(10, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(11, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngAccountKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(2, __dbResults);
    this.fdtmRevenuePeriod = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.fstrDebtorRAKey = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrRevenueGroup = JdbcWritableBridge.readString(5, __dbResults);
    this.fcurBalanceRevPrdStart = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurBalanceAtRevPrdEnd = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.flngDaysAgedAtRevPrdEnd = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fstrAgingCategoryAtPeriodEnd = JdbcWritableBridge.readString(9, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngAccountKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 2 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmRevenuePeriod, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrDebtorRAKey, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRevenueGroup, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBalanceRevPrdStart, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBalanceAtRevPrdEnd, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDaysAgedAtRevPrdEnd, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrAgingCategoryAtPeriodEnd, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 11 + __off, 93, __dbStmt);
    return 11;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngAccountKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 2 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmRevenuePeriod, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrDebtorRAKey, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRevenueGroup, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBalanceRevPrdStart, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBalanceAtRevPrdEnd, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDaysAgedAtRevPrdEnd, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrAgingCategoryAtPeriodEnd, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 11 + __off, 93, __dbStmt);
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
        this.fdtmRevenuePeriod = null;
    } else {
    this.fdtmRevenuePeriod = new Timestamp(__dataIn.readLong());
    this.fdtmRevenuePeriod.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDebtorRAKey = null;
    } else {
    this.fstrDebtorRAKey = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRevenueGroup = null;
    } else {
    this.fstrRevenueGroup = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurBalanceRevPrdStart = null;
    } else {
    this.fcurBalanceRevPrdStart = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurBalanceAtRevPrdEnd = null;
    } else {
    this.fcurBalanceAtRevPrdEnd = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngDaysAgedAtRevPrdEnd = null;
    } else {
    this.flngDaysAgedAtRevPrdEnd = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAgingCategoryAtPeriodEnd = null;
    } else {
    this.fstrAgingCategoryAtPeriodEnd = Text.readString(__dataIn);
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
    if (null == this.fdtmRevenuePeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmRevenuePeriod.getTime());
    __dataOut.writeInt(this.fdtmRevenuePeriod.getNanos());
    }
    if (null == this.fstrDebtorRAKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDebtorRAKey);
    }
    if (null == this.fstrRevenueGroup) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRevenueGroup);
    }
    if (null == this.fcurBalanceRevPrdStart) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBalanceRevPrdStart, __dataOut);
    }
    if (null == this.fcurBalanceAtRevPrdEnd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBalanceAtRevPrdEnd, __dataOut);
    }
    if (null == this.flngDaysAgedAtRevPrdEnd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDaysAgedAtRevPrdEnd);
    }
    if (null == this.fstrAgingCategoryAtPeriodEnd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAgingCategoryAtPeriodEnd);
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
    if (null == this.fdtmRevenuePeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmRevenuePeriod.getTime());
    __dataOut.writeInt(this.fdtmRevenuePeriod.getNanos());
    }
    if (null == this.fstrDebtorRAKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDebtorRAKey);
    }
    if (null == this.fstrRevenueGroup) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRevenueGroup);
    }
    if (null == this.fcurBalanceRevPrdStart) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBalanceRevPrdStart, __dataOut);
    }
    if (null == this.fcurBalanceAtRevPrdEnd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBalanceAtRevPrdEnd, __dataOut);
    }
    if (null == this.flngDaysAgedAtRevPrdEnd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDaysAgedAtRevPrdEnd);
    }
    if (null == this.fstrAgingCategoryAtPeriodEnd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAgingCategoryAtPeriodEnd);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmRevenuePeriod==null?"\\N":"" + fdtmRevenuePeriod, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDebtorRAKey==null?"\\N":fstrDebtorRAKey, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRevenueGroup==null?"\\N":fstrRevenueGroup, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBalanceRevPrdStart==null?"\\N":fcurBalanceRevPrdStart.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBalanceAtRevPrdEnd==null?"\\N":fcurBalanceAtRevPrdEnd.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDaysAgedAtRevPrdEnd==null?"\\N":"" + flngDaysAgedAtRevPrdEnd, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAgingCategoryAtPeriodEnd==null?"\\N":fstrAgingCategoryAtPeriodEnd, " ", delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmRevenuePeriod==null?"\\N":"" + fdtmRevenuePeriod, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDebtorRAKey==null?"\\N":fstrDebtorRAKey, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRevenueGroup==null?"\\N":fstrRevenueGroup, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBalanceRevPrdStart==null?"\\N":fcurBalanceRevPrdStart.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBalanceAtRevPrdEnd==null?"\\N":fcurBalanceAtRevPrdEnd.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDaysAgedAtRevPrdEnd==null?"\\N":"" + flngDaysAgedAtRevPrdEnd, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAgingCategoryAtPeriodEnd==null?"\\N":fstrAgingCategoryAtPeriodEnd, " ", delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmRevenuePeriod = null; } else {
      this.fdtmRevenuePeriod = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDebtorRAKey = null; } else {
      this.fstrDebtorRAKey = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRevenueGroup = null; } else {
      this.fstrRevenueGroup = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBalanceRevPrdStart = null; } else {
      this.fcurBalanceRevPrdStart = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBalanceAtRevPrdEnd = null; } else {
      this.fcurBalanceAtRevPrdEnd = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDaysAgedAtRevPrdEnd = null; } else {
      this.flngDaysAgedAtRevPrdEnd = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAgingCategoryAtPeriodEnd = null; } else {
      this.fstrAgingCategoryAtPeriodEnd = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmRevenuePeriod = null; } else {
      this.fdtmRevenuePeriod = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDebtorRAKey = null; } else {
      this.fstrDebtorRAKey = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRevenueGroup = null; } else {
      this.fstrRevenueGroup = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBalanceRevPrdStart = null; } else {
      this.fcurBalanceRevPrdStart = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBalanceAtRevPrdEnd = null; } else {
      this.fcurBalanceAtRevPrdEnd = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDaysAgedAtRevPrdEnd = null; } else {
      this.flngDaysAgedAtRevPrdEnd = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAgingCategoryAtPeriodEnd = null; } else {
      this.fstrAgingCategoryAtPeriodEnd = __cur_str;
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
    tblnz_ratxndebtoragingdetail o = (tblnz_ratxndebtoragingdetail) super.clone();
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmRevenuePeriod = (o.fdtmRevenuePeriod != null) ? (java.sql.Timestamp) o.fdtmRevenuePeriod.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_ratxndebtoragingdetail o) throws CloneNotSupportedException {
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmRevenuePeriod = (o.fdtmRevenuePeriod != null) ? (java.sql.Timestamp) o.fdtmRevenuePeriod.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("fdtmRevenuePeriod", this.fdtmRevenuePeriod);
    __sqoop$field_map.put("fstrDebtorRAKey", this.fstrDebtorRAKey);
    __sqoop$field_map.put("fstrRevenueGroup", this.fstrRevenueGroup);
    __sqoop$field_map.put("fcurBalanceRevPrdStart", this.fcurBalanceRevPrdStart);
    __sqoop$field_map.put("fcurBalanceAtRevPrdEnd", this.fcurBalanceAtRevPrdEnd);
    __sqoop$field_map.put("flngDaysAgedAtRevPrdEnd", this.flngDaysAgedAtRevPrdEnd);
    __sqoop$field_map.put("fstrAgingCategoryAtPeriodEnd", this.fstrAgingCategoryAtPeriodEnd);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("fdtmRevenuePeriod", this.fdtmRevenuePeriod);
    __sqoop$field_map.put("fstrDebtorRAKey", this.fstrDebtorRAKey);
    __sqoop$field_map.put("fstrRevenueGroup", this.fstrRevenueGroup);
    __sqoop$field_map.put("fcurBalanceRevPrdStart", this.fcurBalanceRevPrdStart);
    __sqoop$field_map.put("fcurBalanceAtRevPrdEnd", this.fcurBalanceAtRevPrdEnd);
    __sqoop$field_map.put("flngDaysAgedAtRevPrdEnd", this.flngDaysAgedAtRevPrdEnd);
    __sqoop$field_map.put("fstrAgingCategoryAtPeriodEnd", this.fstrAgingCategoryAtPeriodEnd);
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
