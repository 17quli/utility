// ORM class for table 'tblnz_rtniitincomeselect'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 03:22:38 NZDT 2020
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

public class tblnz_rtniitincomeselect extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitincomeselect.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("flngAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitincomeselect.this.flngAccountKey = (Integer)value;
      }
    });
    setters.put("fdtmFilingPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitincomeselect.this.fdtmFilingPeriod = (java.sql.Timestamp)value;
      }
    });
    setters.put("flngSelectGroup", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitincomeselect.this.flngSelectGroup = (Integer)value;
      }
    });
    setters.put("fdtmSelectDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitincomeselect.this.fdtmSelectDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fblnGroup2Suspend", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitincomeselect.this.fblnGroup2Suspend = (Integer)value;
      }
    });
    setters.put("fblnConfirmed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitincomeselect.this.fblnConfirmed = (Integer)value;
      }
    });
    setters.put("fblnAutoCalcEOT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitincomeselect.this.fblnAutoCalcEOT = (Integer)value;
      }
    });
    setters.put("fstrFormTypeFiled", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitincomeselect.this.fstrFormTypeFiled = (String)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitincomeselect.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtniitincomeselect.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_rtniitincomeselect() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_rtniitincomeselect with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private Integer flngAccountKey;
  public Integer get_flngAccountKey() {
    return flngAccountKey;
  }
  public void set_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
  }
  public tblnz_rtniitincomeselect with_flngAccountKey(Integer flngAccountKey) {
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
  public tblnz_rtniitincomeselect with_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
    return this;
  }
  private Integer flngSelectGroup;
  public Integer get_flngSelectGroup() {
    return flngSelectGroup;
  }
  public void set_flngSelectGroup(Integer flngSelectGroup) {
    this.flngSelectGroup = flngSelectGroup;
  }
  public tblnz_rtniitincomeselect with_flngSelectGroup(Integer flngSelectGroup) {
    this.flngSelectGroup = flngSelectGroup;
    return this;
  }
  private java.sql.Timestamp fdtmSelectDate;
  public java.sql.Timestamp get_fdtmSelectDate() {
    return fdtmSelectDate;
  }
  public void set_fdtmSelectDate(java.sql.Timestamp fdtmSelectDate) {
    this.fdtmSelectDate = fdtmSelectDate;
  }
  public tblnz_rtniitincomeselect with_fdtmSelectDate(java.sql.Timestamp fdtmSelectDate) {
    this.fdtmSelectDate = fdtmSelectDate;
    return this;
  }
  private Integer fblnGroup2Suspend;
  public Integer get_fblnGroup2Suspend() {
    return fblnGroup2Suspend;
  }
  public void set_fblnGroup2Suspend(Integer fblnGroup2Suspend) {
    this.fblnGroup2Suspend = fblnGroup2Suspend;
  }
  public tblnz_rtniitincomeselect with_fblnGroup2Suspend(Integer fblnGroup2Suspend) {
    this.fblnGroup2Suspend = fblnGroup2Suspend;
    return this;
  }
  private Integer fblnConfirmed;
  public Integer get_fblnConfirmed() {
    return fblnConfirmed;
  }
  public void set_fblnConfirmed(Integer fblnConfirmed) {
    this.fblnConfirmed = fblnConfirmed;
  }
  public tblnz_rtniitincomeselect with_fblnConfirmed(Integer fblnConfirmed) {
    this.fblnConfirmed = fblnConfirmed;
    return this;
  }
  private Integer fblnAutoCalcEOT;
  public Integer get_fblnAutoCalcEOT() {
    return fblnAutoCalcEOT;
  }
  public void set_fblnAutoCalcEOT(Integer fblnAutoCalcEOT) {
    this.fblnAutoCalcEOT = fblnAutoCalcEOT;
  }
  public tblnz_rtniitincomeselect with_fblnAutoCalcEOT(Integer fblnAutoCalcEOT) {
    this.fblnAutoCalcEOT = fblnAutoCalcEOT;
    return this;
  }
  private String fstrFormTypeFiled;
  public String get_fstrFormTypeFiled() {
    return fstrFormTypeFiled;
  }
  public void set_fstrFormTypeFiled(String fstrFormTypeFiled) {
    this.fstrFormTypeFiled = fstrFormTypeFiled;
  }
  public tblnz_rtniitincomeselect with_fstrFormTypeFiled(String fstrFormTypeFiled) {
    this.fstrFormTypeFiled = fstrFormTypeFiled;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_rtniitincomeselect with_fstrWho(String fstrWho) {
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
  public tblnz_rtniitincomeselect with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtniitincomeselect)) {
      return false;
    }
    tblnz_rtniitincomeselect that = (tblnz_rtniitincomeselect) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.flngSelectGroup == null ? that.flngSelectGroup == null : this.flngSelectGroup.equals(that.flngSelectGroup));
    equal = equal && (this.fdtmSelectDate == null ? that.fdtmSelectDate == null : this.fdtmSelectDate.equals(that.fdtmSelectDate));
    equal = equal && (this.fblnGroup2Suspend == null ? that.fblnGroup2Suspend == null : this.fblnGroup2Suspend.equals(that.fblnGroup2Suspend));
    equal = equal && (this.fblnConfirmed == null ? that.fblnConfirmed == null : this.fblnConfirmed.equals(that.fblnConfirmed));
    equal = equal && (this.fblnAutoCalcEOT == null ? that.fblnAutoCalcEOT == null : this.fblnAutoCalcEOT.equals(that.fblnAutoCalcEOT));
    equal = equal && (this.fstrFormTypeFiled == null ? that.fstrFormTypeFiled == null : this.fstrFormTypeFiled.equals(that.fstrFormTypeFiled));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtniitincomeselect)) {
      return false;
    }
    tblnz_rtniitincomeselect that = (tblnz_rtniitincomeselect) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.flngSelectGroup == null ? that.flngSelectGroup == null : this.flngSelectGroup.equals(that.flngSelectGroup));
    equal = equal && (this.fdtmSelectDate == null ? that.fdtmSelectDate == null : this.fdtmSelectDate.equals(that.fdtmSelectDate));
    equal = equal && (this.fblnGroup2Suspend == null ? that.fblnGroup2Suspend == null : this.fblnGroup2Suspend.equals(that.fblnGroup2Suspend));
    equal = equal && (this.fblnConfirmed == null ? that.fblnConfirmed == null : this.fblnConfirmed.equals(that.fblnConfirmed));
    equal = equal && (this.fblnAutoCalcEOT == null ? that.fblnAutoCalcEOT == null : this.fblnAutoCalcEOT.equals(that.fblnAutoCalcEOT));
    equal = equal && (this.fstrFormTypeFiled == null ? that.fstrFormTypeFiled == null : this.fstrFormTypeFiled.equals(that.fstrFormTypeFiled));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.flngSelectGroup = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fdtmSelectDate = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.fblnGroup2Suspend = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fblnConfirmed = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fblnAutoCalcEOT = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fstrFormTypeFiled = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(10, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(11, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.flngSelectGroup = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fdtmSelectDate = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.fblnGroup2Suspend = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fblnConfirmed = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fblnAutoCalcEOT = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fstrFormTypeFiled = JdbcWritableBridge.readString(9, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngAccountKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngSelectGroup, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmSelectDate, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnGroup2Suspend, 6 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnConfirmed, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAutoCalcEOT, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrFormTypeFiled, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 11 + __off, 93, __dbStmt);
    return 11;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngSelectGroup, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmSelectDate, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnGroup2Suspend, 6 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnConfirmed, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAutoCalcEOT, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrFormTypeFiled, 9 + __off, -9, __dbStmt);
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
        this.flngSelectGroup = null;
    } else {
    this.flngSelectGroup = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmSelectDate = null;
    } else {
    this.fdtmSelectDate = new Timestamp(__dataIn.readLong());
    this.fdtmSelectDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnGroup2Suspend = null;
    } else {
    this.fblnGroup2Suspend = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnConfirmed = null;
    } else {
    this.fblnConfirmed = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnAutoCalcEOT = null;
    } else {
    this.fblnAutoCalcEOT = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrFormTypeFiled = null;
    } else {
    this.fstrFormTypeFiled = Text.readString(__dataIn);
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
    if (null == this.flngSelectGroup) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngSelectGroup);
    }
    if (null == this.fdtmSelectDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmSelectDate.getTime());
    __dataOut.writeInt(this.fdtmSelectDate.getNanos());
    }
    if (null == this.fblnGroup2Suspend) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnGroup2Suspend);
    }
    if (null == this.fblnConfirmed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnConfirmed);
    }
    if (null == this.fblnAutoCalcEOT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAutoCalcEOT);
    }
    if (null == this.fstrFormTypeFiled) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFormTypeFiled);
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
    if (null == this.flngSelectGroup) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngSelectGroup);
    }
    if (null == this.fdtmSelectDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmSelectDate.getTime());
    __dataOut.writeInt(this.fdtmSelectDate.getNanos());
    }
    if (null == this.fblnGroup2Suspend) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnGroup2Suspend);
    }
    if (null == this.fblnConfirmed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnConfirmed);
    }
    if (null == this.fblnAutoCalcEOT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAutoCalcEOT);
    }
    if (null == this.fstrFormTypeFiled) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFormTypeFiled);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngSelectGroup==null?"\\N":"" + flngSelectGroup, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmSelectDate==null?"\\N":"" + fdtmSelectDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnGroup2Suspend==null?"\\N":"" + fblnGroup2Suspend, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnConfirmed==null?"\\N":"" + fblnConfirmed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAutoCalcEOT==null?"\\N":"" + fblnAutoCalcEOT, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFormTypeFiled==null?"\\N":fstrFormTypeFiled, " ", delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngSelectGroup==null?"\\N":"" + flngSelectGroup, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmSelectDate==null?"\\N":"" + fdtmSelectDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnGroup2Suspend==null?"\\N":"" + fblnGroup2Suspend, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnConfirmed==null?"\\N":"" + fblnConfirmed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAutoCalcEOT==null?"\\N":"" + fblnAutoCalcEOT, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFormTypeFiled==null?"\\N":fstrFormTypeFiled, " ", delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngSelectGroup = null; } else {
      this.flngSelectGroup = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmSelectDate = null; } else {
      this.fdtmSelectDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnGroup2Suspend = null; } else {
      this.fblnGroup2Suspend = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnConfirmed = null; } else {
      this.fblnConfirmed = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAutoCalcEOT = null; } else {
      this.fblnAutoCalcEOT = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFormTypeFiled = null; } else {
      this.fstrFormTypeFiled = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngSelectGroup = null; } else {
      this.flngSelectGroup = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmSelectDate = null; } else {
      this.fdtmSelectDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnGroup2Suspend = null; } else {
      this.fblnGroup2Suspend = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnConfirmed = null; } else {
      this.fblnConfirmed = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAutoCalcEOT = null; } else {
      this.fblnAutoCalcEOT = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFormTypeFiled = null; } else {
      this.fstrFormTypeFiled = __cur_str;
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
    tblnz_rtniitincomeselect o = (tblnz_rtniitincomeselect) super.clone();
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmSelectDate = (o.fdtmSelectDate != null) ? (java.sql.Timestamp) o.fdtmSelectDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_rtniitincomeselect o) throws CloneNotSupportedException {
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmSelectDate = (o.fdtmSelectDate != null) ? (java.sql.Timestamp) o.fdtmSelectDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("flngSelectGroup", this.flngSelectGroup);
    __sqoop$field_map.put("fdtmSelectDate", this.fdtmSelectDate);
    __sqoop$field_map.put("fblnGroup2Suspend", this.fblnGroup2Suspend);
    __sqoop$field_map.put("fblnConfirmed", this.fblnConfirmed);
    __sqoop$field_map.put("fblnAutoCalcEOT", this.fblnAutoCalcEOT);
    __sqoop$field_map.put("fstrFormTypeFiled", this.fstrFormTypeFiled);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("flngSelectGroup", this.flngSelectGroup);
    __sqoop$field_map.put("fdtmSelectDate", this.fdtmSelectDate);
    __sqoop$field_map.put("fblnGroup2Suspend", this.fblnGroup2Suspend);
    __sqoop$field_map.put("fblnConfirmed", this.fblnConfirmed);
    __sqoop$field_map.put("fblnAutoCalcEOT", this.fblnAutoCalcEOT);
    __sqoop$field_map.put("fstrFormTypeFiled", this.fstrFormTypeFiled);
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
