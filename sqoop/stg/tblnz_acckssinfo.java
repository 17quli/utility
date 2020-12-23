// ORM class for table 'tblnz_acckssinfo'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 03:10:35 NZDT 2020
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

public class tblnz_acckssinfo extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_acckssinfo.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fblnAutoEnrolled", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_acckssinfo.this.fblnAutoEnrolled = (Integer)value;
      }
    });
    setters.put("fstrSource", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_acckssinfo.this.fstrSource = (String)value;
      }
    });
    setters.put("fdtmActiveChoiceDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_acckssinfo.this.fdtmActiveChoiceDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmIRFirstContribution", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_acckssinfo.this.fdtmIRFirstContribution = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmProviderFirstContribution", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_acckssinfo.this.fdtmProviderFirstContribution = (java.sql.Timestamp)value;
      }
    });
    setters.put("fblnHoldingPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_acckssinfo.this.fblnHoldingPeriod = (Integer)value;
      }
    });
    setters.put("fdtmHoldingPeriodStart", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_acckssinfo.this.fdtmHoldingPeriodStart = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmHoldingPeriodEnd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_acckssinfo.this.fdtmHoldingPeriodEnd = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_acckssinfo.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_acckssinfo.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_acckssinfo() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_acckssinfo with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private Integer fblnAutoEnrolled;
  public Integer get_fblnAutoEnrolled() {
    return fblnAutoEnrolled;
  }
  public void set_fblnAutoEnrolled(Integer fblnAutoEnrolled) {
    this.fblnAutoEnrolled = fblnAutoEnrolled;
  }
  public tblnz_acckssinfo with_fblnAutoEnrolled(Integer fblnAutoEnrolled) {
    this.fblnAutoEnrolled = fblnAutoEnrolled;
    return this;
  }
  private String fstrSource;
  public String get_fstrSource() {
    return fstrSource;
  }
  public void set_fstrSource(String fstrSource) {
    this.fstrSource = fstrSource;
  }
  public tblnz_acckssinfo with_fstrSource(String fstrSource) {
    this.fstrSource = fstrSource;
    return this;
  }
  private java.sql.Timestamp fdtmActiveChoiceDate;
  public java.sql.Timestamp get_fdtmActiveChoiceDate() {
    return fdtmActiveChoiceDate;
  }
  public void set_fdtmActiveChoiceDate(java.sql.Timestamp fdtmActiveChoiceDate) {
    this.fdtmActiveChoiceDate = fdtmActiveChoiceDate;
  }
  public tblnz_acckssinfo with_fdtmActiveChoiceDate(java.sql.Timestamp fdtmActiveChoiceDate) {
    this.fdtmActiveChoiceDate = fdtmActiveChoiceDate;
    return this;
  }
  private java.sql.Timestamp fdtmIRFirstContribution;
  public java.sql.Timestamp get_fdtmIRFirstContribution() {
    return fdtmIRFirstContribution;
  }
  public void set_fdtmIRFirstContribution(java.sql.Timestamp fdtmIRFirstContribution) {
    this.fdtmIRFirstContribution = fdtmIRFirstContribution;
  }
  public tblnz_acckssinfo with_fdtmIRFirstContribution(java.sql.Timestamp fdtmIRFirstContribution) {
    this.fdtmIRFirstContribution = fdtmIRFirstContribution;
    return this;
  }
  private java.sql.Timestamp fdtmProviderFirstContribution;
  public java.sql.Timestamp get_fdtmProviderFirstContribution() {
    return fdtmProviderFirstContribution;
  }
  public void set_fdtmProviderFirstContribution(java.sql.Timestamp fdtmProviderFirstContribution) {
    this.fdtmProviderFirstContribution = fdtmProviderFirstContribution;
  }
  public tblnz_acckssinfo with_fdtmProviderFirstContribution(java.sql.Timestamp fdtmProviderFirstContribution) {
    this.fdtmProviderFirstContribution = fdtmProviderFirstContribution;
    return this;
  }
  private Integer fblnHoldingPeriod;
  public Integer get_fblnHoldingPeriod() {
    return fblnHoldingPeriod;
  }
  public void set_fblnHoldingPeriod(Integer fblnHoldingPeriod) {
    this.fblnHoldingPeriod = fblnHoldingPeriod;
  }
  public tblnz_acckssinfo with_fblnHoldingPeriod(Integer fblnHoldingPeriod) {
    this.fblnHoldingPeriod = fblnHoldingPeriod;
    return this;
  }
  private java.sql.Timestamp fdtmHoldingPeriodStart;
  public java.sql.Timestamp get_fdtmHoldingPeriodStart() {
    return fdtmHoldingPeriodStart;
  }
  public void set_fdtmHoldingPeriodStart(java.sql.Timestamp fdtmHoldingPeriodStart) {
    this.fdtmHoldingPeriodStart = fdtmHoldingPeriodStart;
  }
  public tblnz_acckssinfo with_fdtmHoldingPeriodStart(java.sql.Timestamp fdtmHoldingPeriodStart) {
    this.fdtmHoldingPeriodStart = fdtmHoldingPeriodStart;
    return this;
  }
  private java.sql.Timestamp fdtmHoldingPeriodEnd;
  public java.sql.Timestamp get_fdtmHoldingPeriodEnd() {
    return fdtmHoldingPeriodEnd;
  }
  public void set_fdtmHoldingPeriodEnd(java.sql.Timestamp fdtmHoldingPeriodEnd) {
    this.fdtmHoldingPeriodEnd = fdtmHoldingPeriodEnd;
  }
  public tblnz_acckssinfo with_fdtmHoldingPeriodEnd(java.sql.Timestamp fdtmHoldingPeriodEnd) {
    this.fdtmHoldingPeriodEnd = fdtmHoldingPeriodEnd;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_acckssinfo with_fstrWho(String fstrWho) {
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
  public tblnz_acckssinfo with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_acckssinfo)) {
      return false;
    }
    tblnz_acckssinfo that = (tblnz_acckssinfo) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fblnAutoEnrolled == null ? that.fblnAutoEnrolled == null : this.fblnAutoEnrolled.equals(that.fblnAutoEnrolled));
    equal = equal && (this.fstrSource == null ? that.fstrSource == null : this.fstrSource.equals(that.fstrSource));
    equal = equal && (this.fdtmActiveChoiceDate == null ? that.fdtmActiveChoiceDate == null : this.fdtmActiveChoiceDate.equals(that.fdtmActiveChoiceDate));
    equal = equal && (this.fdtmIRFirstContribution == null ? that.fdtmIRFirstContribution == null : this.fdtmIRFirstContribution.equals(that.fdtmIRFirstContribution));
    equal = equal && (this.fdtmProviderFirstContribution == null ? that.fdtmProviderFirstContribution == null : this.fdtmProviderFirstContribution.equals(that.fdtmProviderFirstContribution));
    equal = equal && (this.fblnHoldingPeriod == null ? that.fblnHoldingPeriod == null : this.fblnHoldingPeriod.equals(that.fblnHoldingPeriod));
    equal = equal && (this.fdtmHoldingPeriodStart == null ? that.fdtmHoldingPeriodStart == null : this.fdtmHoldingPeriodStart.equals(that.fdtmHoldingPeriodStart));
    equal = equal && (this.fdtmHoldingPeriodEnd == null ? that.fdtmHoldingPeriodEnd == null : this.fdtmHoldingPeriodEnd.equals(that.fdtmHoldingPeriodEnd));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_acckssinfo)) {
      return false;
    }
    tblnz_acckssinfo that = (tblnz_acckssinfo) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fblnAutoEnrolled == null ? that.fblnAutoEnrolled == null : this.fblnAutoEnrolled.equals(that.fblnAutoEnrolled));
    equal = equal && (this.fstrSource == null ? that.fstrSource == null : this.fstrSource.equals(that.fstrSource));
    equal = equal && (this.fdtmActiveChoiceDate == null ? that.fdtmActiveChoiceDate == null : this.fdtmActiveChoiceDate.equals(that.fdtmActiveChoiceDate));
    equal = equal && (this.fdtmIRFirstContribution == null ? that.fdtmIRFirstContribution == null : this.fdtmIRFirstContribution.equals(that.fdtmIRFirstContribution));
    equal = equal && (this.fdtmProviderFirstContribution == null ? that.fdtmProviderFirstContribution == null : this.fdtmProviderFirstContribution.equals(that.fdtmProviderFirstContribution));
    equal = equal && (this.fblnHoldingPeriod == null ? that.fblnHoldingPeriod == null : this.fblnHoldingPeriod.equals(that.fblnHoldingPeriod));
    equal = equal && (this.fdtmHoldingPeriodStart == null ? that.fdtmHoldingPeriodStart == null : this.fdtmHoldingPeriodStart.equals(that.fdtmHoldingPeriodStart));
    equal = equal && (this.fdtmHoldingPeriodEnd == null ? that.fdtmHoldingPeriodEnd == null : this.fdtmHoldingPeriodEnd.equals(that.fdtmHoldingPeriodEnd));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fblnAutoEnrolled = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fstrSource = JdbcWritableBridge.readString(3, __dbResults);
    this.fdtmActiveChoiceDate = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.fdtmIRFirstContribution = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.fdtmProviderFirstContribution = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.fblnHoldingPeriod = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fdtmHoldingPeriodStart = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.fdtmHoldingPeriodEnd = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(10, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(11, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fblnAutoEnrolled = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fstrSource = JdbcWritableBridge.readString(3, __dbResults);
    this.fdtmActiveChoiceDate = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.fdtmIRFirstContribution = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.fdtmProviderFirstContribution = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.fblnHoldingPeriod = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fdtmHoldingPeriodStart = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.fdtmHoldingPeriodEnd = JdbcWritableBridge.readTimestamp(9, __dbResults);
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
    JdbcWritableBridge.writeInteger(fblnAutoEnrolled, 2 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrSource, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmActiveChoiceDate, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmIRFirstContribution, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmProviderFirstContribution, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnHoldingPeriod, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmHoldingPeriodStart, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmHoldingPeriodEnd, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 11 + __off, 93, __dbStmt);
    return 11;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAutoEnrolled, 2 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrSource, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmActiveChoiceDate, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmIRFirstContribution, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmProviderFirstContribution, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnHoldingPeriod, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmHoldingPeriodStart, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmHoldingPeriodEnd, 9 + __off, 93, __dbStmt);
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
        this.fblnAutoEnrolled = null;
    } else {
    this.fblnAutoEnrolled = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSource = null;
    } else {
    this.fstrSource = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmActiveChoiceDate = null;
    } else {
    this.fdtmActiveChoiceDate = new Timestamp(__dataIn.readLong());
    this.fdtmActiveChoiceDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmIRFirstContribution = null;
    } else {
    this.fdtmIRFirstContribution = new Timestamp(__dataIn.readLong());
    this.fdtmIRFirstContribution.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmProviderFirstContribution = null;
    } else {
    this.fdtmProviderFirstContribution = new Timestamp(__dataIn.readLong());
    this.fdtmProviderFirstContribution.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnHoldingPeriod = null;
    } else {
    this.fblnHoldingPeriod = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmHoldingPeriodStart = null;
    } else {
    this.fdtmHoldingPeriodStart = new Timestamp(__dataIn.readLong());
    this.fdtmHoldingPeriodStart.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmHoldingPeriodEnd = null;
    } else {
    this.fdtmHoldingPeriodEnd = new Timestamp(__dataIn.readLong());
    this.fdtmHoldingPeriodEnd.setNanos(__dataIn.readInt());
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
    if (null == this.fblnAutoEnrolled) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAutoEnrolled);
    }
    if (null == this.fstrSource) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSource);
    }
    if (null == this.fdtmActiveChoiceDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmActiveChoiceDate.getTime());
    __dataOut.writeInt(this.fdtmActiveChoiceDate.getNanos());
    }
    if (null == this.fdtmIRFirstContribution) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmIRFirstContribution.getTime());
    __dataOut.writeInt(this.fdtmIRFirstContribution.getNanos());
    }
    if (null == this.fdtmProviderFirstContribution) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmProviderFirstContribution.getTime());
    __dataOut.writeInt(this.fdtmProviderFirstContribution.getNanos());
    }
    if (null == this.fblnHoldingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnHoldingPeriod);
    }
    if (null == this.fdtmHoldingPeriodStart) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmHoldingPeriodStart.getTime());
    __dataOut.writeInt(this.fdtmHoldingPeriodStart.getNanos());
    }
    if (null == this.fdtmHoldingPeriodEnd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmHoldingPeriodEnd.getTime());
    __dataOut.writeInt(this.fdtmHoldingPeriodEnd.getNanos());
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
    if (null == this.fblnAutoEnrolled) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAutoEnrolled);
    }
    if (null == this.fstrSource) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSource);
    }
    if (null == this.fdtmActiveChoiceDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmActiveChoiceDate.getTime());
    __dataOut.writeInt(this.fdtmActiveChoiceDate.getNanos());
    }
    if (null == this.fdtmIRFirstContribution) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmIRFirstContribution.getTime());
    __dataOut.writeInt(this.fdtmIRFirstContribution.getNanos());
    }
    if (null == this.fdtmProviderFirstContribution) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmProviderFirstContribution.getTime());
    __dataOut.writeInt(this.fdtmProviderFirstContribution.getNanos());
    }
    if (null == this.fblnHoldingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnHoldingPeriod);
    }
    if (null == this.fdtmHoldingPeriodStart) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmHoldingPeriodStart.getTime());
    __dataOut.writeInt(this.fdtmHoldingPeriodStart.getNanos());
    }
    if (null == this.fdtmHoldingPeriodEnd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmHoldingPeriodEnd.getTime());
    __dataOut.writeInt(this.fdtmHoldingPeriodEnd.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAutoEnrolled==null?"\\N":"" + fblnAutoEnrolled, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSource==null?"\\N":fstrSource, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmActiveChoiceDate==null?"\\N":"" + fdtmActiveChoiceDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmIRFirstContribution==null?"\\N":"" + fdtmIRFirstContribution, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmProviderFirstContribution==null?"\\N":"" + fdtmProviderFirstContribution, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnHoldingPeriod==null?"\\N":"" + fblnHoldingPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmHoldingPeriodStart==null?"\\N":"" + fdtmHoldingPeriodStart, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmHoldingPeriodEnd==null?"\\N":"" + fdtmHoldingPeriodEnd, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAutoEnrolled==null?"\\N":"" + fblnAutoEnrolled, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSource==null?"\\N":fstrSource, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmActiveChoiceDate==null?"\\N":"" + fdtmActiveChoiceDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmIRFirstContribution==null?"\\N":"" + fdtmIRFirstContribution, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmProviderFirstContribution==null?"\\N":"" + fdtmProviderFirstContribution, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnHoldingPeriod==null?"\\N":"" + fblnHoldingPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmHoldingPeriodStart==null?"\\N":"" + fdtmHoldingPeriodStart, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmHoldingPeriodEnd==null?"\\N":"" + fdtmHoldingPeriodEnd, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAutoEnrolled = null; } else {
      this.fblnAutoEnrolled = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSource = null; } else {
      this.fstrSource = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmActiveChoiceDate = null; } else {
      this.fdtmActiveChoiceDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmIRFirstContribution = null; } else {
      this.fdtmIRFirstContribution = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmProviderFirstContribution = null; } else {
      this.fdtmProviderFirstContribution = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnHoldingPeriod = null; } else {
      this.fblnHoldingPeriod = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmHoldingPeriodStart = null; } else {
      this.fdtmHoldingPeriodStart = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmHoldingPeriodEnd = null; } else {
      this.fdtmHoldingPeriodEnd = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAutoEnrolled = null; } else {
      this.fblnAutoEnrolled = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSource = null; } else {
      this.fstrSource = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmActiveChoiceDate = null; } else {
      this.fdtmActiveChoiceDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmIRFirstContribution = null; } else {
      this.fdtmIRFirstContribution = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmProviderFirstContribution = null; } else {
      this.fdtmProviderFirstContribution = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnHoldingPeriod = null; } else {
      this.fblnHoldingPeriod = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmHoldingPeriodStart = null; } else {
      this.fdtmHoldingPeriodStart = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmHoldingPeriodEnd = null; } else {
      this.fdtmHoldingPeriodEnd = java.sql.Timestamp.valueOf(__cur_str);
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
    tblnz_acckssinfo o = (tblnz_acckssinfo) super.clone();
    o.fdtmActiveChoiceDate = (o.fdtmActiveChoiceDate != null) ? (java.sql.Timestamp) o.fdtmActiveChoiceDate.clone() : null;
    o.fdtmIRFirstContribution = (o.fdtmIRFirstContribution != null) ? (java.sql.Timestamp) o.fdtmIRFirstContribution.clone() : null;
    o.fdtmProviderFirstContribution = (o.fdtmProviderFirstContribution != null) ? (java.sql.Timestamp) o.fdtmProviderFirstContribution.clone() : null;
    o.fdtmHoldingPeriodStart = (o.fdtmHoldingPeriodStart != null) ? (java.sql.Timestamp) o.fdtmHoldingPeriodStart.clone() : null;
    o.fdtmHoldingPeriodEnd = (o.fdtmHoldingPeriodEnd != null) ? (java.sql.Timestamp) o.fdtmHoldingPeriodEnd.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_acckssinfo o) throws CloneNotSupportedException {
    o.fdtmActiveChoiceDate = (o.fdtmActiveChoiceDate != null) ? (java.sql.Timestamp) o.fdtmActiveChoiceDate.clone() : null;
    o.fdtmIRFirstContribution = (o.fdtmIRFirstContribution != null) ? (java.sql.Timestamp) o.fdtmIRFirstContribution.clone() : null;
    o.fdtmProviderFirstContribution = (o.fdtmProviderFirstContribution != null) ? (java.sql.Timestamp) o.fdtmProviderFirstContribution.clone() : null;
    o.fdtmHoldingPeriodStart = (o.fdtmHoldingPeriodStart != null) ? (java.sql.Timestamp) o.fdtmHoldingPeriodStart.clone() : null;
    o.fdtmHoldingPeriodEnd = (o.fdtmHoldingPeriodEnd != null) ? (java.sql.Timestamp) o.fdtmHoldingPeriodEnd.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fblnAutoEnrolled", this.fblnAutoEnrolled);
    __sqoop$field_map.put("fstrSource", this.fstrSource);
    __sqoop$field_map.put("fdtmActiveChoiceDate", this.fdtmActiveChoiceDate);
    __sqoop$field_map.put("fdtmIRFirstContribution", this.fdtmIRFirstContribution);
    __sqoop$field_map.put("fdtmProviderFirstContribution", this.fdtmProviderFirstContribution);
    __sqoop$field_map.put("fblnHoldingPeriod", this.fblnHoldingPeriod);
    __sqoop$field_map.put("fdtmHoldingPeriodStart", this.fdtmHoldingPeriodStart);
    __sqoop$field_map.put("fdtmHoldingPeriodEnd", this.fdtmHoldingPeriodEnd);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fblnAutoEnrolled", this.fblnAutoEnrolled);
    __sqoop$field_map.put("fstrSource", this.fstrSource);
    __sqoop$field_map.put("fdtmActiveChoiceDate", this.fdtmActiveChoiceDate);
    __sqoop$field_map.put("fdtmIRFirstContribution", this.fdtmIRFirstContribution);
    __sqoop$field_map.put("fdtmProviderFirstContribution", this.fdtmProviderFirstContribution);
    __sqoop$field_map.put("fblnHoldingPeriod", this.fblnHoldingPeriod);
    __sqoop$field_map.put("fdtmHoldingPeriodStart", this.fdtmHoldingPeriodStart);
    __sqoop$field_map.put("fdtmHoldingPeriodEnd", this.fdtmHoldingPeriodEnd);
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
