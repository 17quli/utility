// ORM class for table 'tblnz_kssprorataposting'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 05:00:56 NZDT 2020
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

public class tblnz_kssprorataposting extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("fi64ProRataKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_kssprorataposting.this.fi64ProRataKey = (Long)value;
      }
    });
    setters.put("fstrProRataType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_kssprorataposting.this.fstrProRataType = (String)value;
      }
    });
    setters.put("fi64ContributionKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_kssprorataposting.this.fi64ContributionKey = (Long)value;
      }
    });
    setters.put("flngTransKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_kssprorataposting.this.flngTransKey = (Integer)value;
      }
    });
    setters.put("fdtmEffectiveDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_kssprorataposting.this.fdtmEffectiveDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fcurAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_kssprorataposting.this.fcurAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnProcessed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_kssprorataposting.this.fblnProcessed = (Integer)value;
      }
    });
    setters.put("fi64ContributionDetailKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_kssprorataposting.this.fi64ContributionDetailKey = (Long)value;
      }
    });
    setters.put("fi64RvsContributionDetailKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_kssprorataposting.this.fi64RvsContributionDetailKey = (Long)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_kssprorataposting.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_kssprorataposting.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_kssprorataposting() {
    init0();
  }
  private Long fi64ProRataKey;
  public Long get_fi64ProRataKey() {
    return fi64ProRataKey;
  }
  public void set_fi64ProRataKey(Long fi64ProRataKey) {
    this.fi64ProRataKey = fi64ProRataKey;
  }
  public tblnz_kssprorataposting with_fi64ProRataKey(Long fi64ProRataKey) {
    this.fi64ProRataKey = fi64ProRataKey;
    return this;
  }
  private String fstrProRataType;
  public String get_fstrProRataType() {
    return fstrProRataType;
  }
  public void set_fstrProRataType(String fstrProRataType) {
    this.fstrProRataType = fstrProRataType;
  }
  public tblnz_kssprorataposting with_fstrProRataType(String fstrProRataType) {
    this.fstrProRataType = fstrProRataType;
    return this;
  }
  private Long fi64ContributionKey;
  public Long get_fi64ContributionKey() {
    return fi64ContributionKey;
  }
  public void set_fi64ContributionKey(Long fi64ContributionKey) {
    this.fi64ContributionKey = fi64ContributionKey;
  }
  public tblnz_kssprorataposting with_fi64ContributionKey(Long fi64ContributionKey) {
    this.fi64ContributionKey = fi64ContributionKey;
    return this;
  }
  private Integer flngTransKey;
  public Integer get_flngTransKey() {
    return flngTransKey;
  }
  public void set_flngTransKey(Integer flngTransKey) {
    this.flngTransKey = flngTransKey;
  }
  public tblnz_kssprorataposting with_flngTransKey(Integer flngTransKey) {
    this.flngTransKey = flngTransKey;
    return this;
  }
  private java.sql.Timestamp fdtmEffectiveDate;
  public java.sql.Timestamp get_fdtmEffectiveDate() {
    return fdtmEffectiveDate;
  }
  public void set_fdtmEffectiveDate(java.sql.Timestamp fdtmEffectiveDate) {
    this.fdtmEffectiveDate = fdtmEffectiveDate;
  }
  public tblnz_kssprorataposting with_fdtmEffectiveDate(java.sql.Timestamp fdtmEffectiveDate) {
    this.fdtmEffectiveDate = fdtmEffectiveDate;
    return this;
  }
  private java.math.BigDecimal fcurAmount;
  public java.math.BigDecimal get_fcurAmount() {
    return fcurAmount;
  }
  public void set_fcurAmount(java.math.BigDecimal fcurAmount) {
    this.fcurAmount = fcurAmount;
  }
  public tblnz_kssprorataposting with_fcurAmount(java.math.BigDecimal fcurAmount) {
    this.fcurAmount = fcurAmount;
    return this;
  }
  private Integer fblnProcessed;
  public Integer get_fblnProcessed() {
    return fblnProcessed;
  }
  public void set_fblnProcessed(Integer fblnProcessed) {
    this.fblnProcessed = fblnProcessed;
  }
  public tblnz_kssprorataposting with_fblnProcessed(Integer fblnProcessed) {
    this.fblnProcessed = fblnProcessed;
    return this;
  }
  private Long fi64ContributionDetailKey;
  public Long get_fi64ContributionDetailKey() {
    return fi64ContributionDetailKey;
  }
  public void set_fi64ContributionDetailKey(Long fi64ContributionDetailKey) {
    this.fi64ContributionDetailKey = fi64ContributionDetailKey;
  }
  public tblnz_kssprorataposting with_fi64ContributionDetailKey(Long fi64ContributionDetailKey) {
    this.fi64ContributionDetailKey = fi64ContributionDetailKey;
    return this;
  }
  private Long fi64RvsContributionDetailKey;
  public Long get_fi64RvsContributionDetailKey() {
    return fi64RvsContributionDetailKey;
  }
  public void set_fi64RvsContributionDetailKey(Long fi64RvsContributionDetailKey) {
    this.fi64RvsContributionDetailKey = fi64RvsContributionDetailKey;
  }
  public tblnz_kssprorataposting with_fi64RvsContributionDetailKey(Long fi64RvsContributionDetailKey) {
    this.fi64RvsContributionDetailKey = fi64RvsContributionDetailKey;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_kssprorataposting with_fstrWho(String fstrWho) {
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
  public tblnz_kssprorataposting with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_kssprorataposting)) {
      return false;
    }
    tblnz_kssprorataposting that = (tblnz_kssprorataposting) o;
    boolean equal = true;
    equal = equal && (this.fi64ProRataKey == null ? that.fi64ProRataKey == null : this.fi64ProRataKey.equals(that.fi64ProRataKey));
    equal = equal && (this.fstrProRataType == null ? that.fstrProRataType == null : this.fstrProRataType.equals(that.fstrProRataType));
    equal = equal && (this.fi64ContributionKey == null ? that.fi64ContributionKey == null : this.fi64ContributionKey.equals(that.fi64ContributionKey));
    equal = equal && (this.flngTransKey == null ? that.flngTransKey == null : this.flngTransKey.equals(that.flngTransKey));
    equal = equal && (this.fdtmEffectiveDate == null ? that.fdtmEffectiveDate == null : this.fdtmEffectiveDate.equals(that.fdtmEffectiveDate));
    equal = equal && (this.fcurAmount == null ? that.fcurAmount == null : this.fcurAmount.equals(that.fcurAmount));
    equal = equal && (this.fblnProcessed == null ? that.fblnProcessed == null : this.fblnProcessed.equals(that.fblnProcessed));
    equal = equal && (this.fi64ContributionDetailKey == null ? that.fi64ContributionDetailKey == null : this.fi64ContributionDetailKey.equals(that.fi64ContributionDetailKey));
    equal = equal && (this.fi64RvsContributionDetailKey == null ? that.fi64RvsContributionDetailKey == null : this.fi64RvsContributionDetailKey.equals(that.fi64RvsContributionDetailKey));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_kssprorataposting)) {
      return false;
    }
    tblnz_kssprorataposting that = (tblnz_kssprorataposting) o;
    boolean equal = true;
    equal = equal && (this.fi64ProRataKey == null ? that.fi64ProRataKey == null : this.fi64ProRataKey.equals(that.fi64ProRataKey));
    equal = equal && (this.fstrProRataType == null ? that.fstrProRataType == null : this.fstrProRataType.equals(that.fstrProRataType));
    equal = equal && (this.fi64ContributionKey == null ? that.fi64ContributionKey == null : this.fi64ContributionKey.equals(that.fi64ContributionKey));
    equal = equal && (this.flngTransKey == null ? that.flngTransKey == null : this.flngTransKey.equals(that.flngTransKey));
    equal = equal && (this.fdtmEffectiveDate == null ? that.fdtmEffectiveDate == null : this.fdtmEffectiveDate.equals(that.fdtmEffectiveDate));
    equal = equal && (this.fcurAmount == null ? that.fcurAmount == null : this.fcurAmount.equals(that.fcurAmount));
    equal = equal && (this.fblnProcessed == null ? that.fblnProcessed == null : this.fblnProcessed.equals(that.fblnProcessed));
    equal = equal && (this.fi64ContributionDetailKey == null ? that.fi64ContributionDetailKey == null : this.fi64ContributionDetailKey.equals(that.fi64ContributionDetailKey));
    equal = equal && (this.fi64RvsContributionDetailKey == null ? that.fi64RvsContributionDetailKey == null : this.fi64RvsContributionDetailKey.equals(that.fi64RvsContributionDetailKey));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.fi64ProRataKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.fstrProRataType = JdbcWritableBridge.readString(2, __dbResults);
    this.fi64ContributionKey = JdbcWritableBridge.readLong(3, __dbResults);
    this.flngTransKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fdtmEffectiveDate = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.fcurAmount = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fblnProcessed = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fi64ContributionDetailKey = JdbcWritableBridge.readLong(8, __dbResults);
    this.fi64RvsContributionDetailKey = JdbcWritableBridge.readLong(9, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(10, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(11, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.fi64ProRataKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.fstrProRataType = JdbcWritableBridge.readString(2, __dbResults);
    this.fi64ContributionKey = JdbcWritableBridge.readLong(3, __dbResults);
    this.flngTransKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fdtmEffectiveDate = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.fcurAmount = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fblnProcessed = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fi64ContributionDetailKey = JdbcWritableBridge.readLong(8, __dbResults);
    this.fi64RvsContributionDetailKey = JdbcWritableBridge.readLong(9, __dbResults);
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
    JdbcWritableBridge.writeLong(fi64ProRataKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(fstrProRataType, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeLong(fi64ContributionKey, 3 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngTransKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEffectiveDate, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmount, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnProcessed, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeLong(fi64ContributionDetailKey, 8 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(fi64RvsContributionDetailKey, 9 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 11 + __off, 93, __dbStmt);
    return 11;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(fi64ProRataKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(fstrProRataType, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeLong(fi64ContributionKey, 3 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngTransKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEffectiveDate, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmount, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnProcessed, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeLong(fi64ContributionDetailKey, 8 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(fi64RvsContributionDetailKey, 9 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 11 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.fi64ProRataKey = null;
    } else {
    this.fi64ProRataKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrProRataType = null;
    } else {
    this.fstrProRataType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fi64ContributionKey = null;
    } else {
    this.fi64ContributionKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.flngTransKey = null;
    } else {
    this.flngTransKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmEffectiveDate = null;
    } else {
    this.fdtmEffectiveDate = new Timestamp(__dataIn.readLong());
    this.fdtmEffectiveDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAmount = null;
    } else {
    this.fcurAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnProcessed = null;
    } else {
    this.fblnProcessed = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fi64ContributionDetailKey = null;
    } else {
    this.fi64ContributionDetailKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.fi64RvsContributionDetailKey = null;
    } else {
    this.fi64RvsContributionDetailKey = Long.valueOf(__dataIn.readLong());
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
    if (null == this.fi64ProRataKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64ProRataKey);
    }
    if (null == this.fstrProRataType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrProRataType);
    }
    if (null == this.fi64ContributionKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64ContributionKey);
    }
    if (null == this.flngTransKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTransKey);
    }
    if (null == this.fdtmEffectiveDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEffectiveDate.getTime());
    __dataOut.writeInt(this.fdtmEffectiveDate.getNanos());
    }
    if (null == this.fcurAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmount, __dataOut);
    }
    if (null == this.fblnProcessed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnProcessed);
    }
    if (null == this.fi64ContributionDetailKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64ContributionDetailKey);
    }
    if (null == this.fi64RvsContributionDetailKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64RvsContributionDetailKey);
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
    if (null == this.fi64ProRataKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64ProRataKey);
    }
    if (null == this.fstrProRataType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrProRataType);
    }
    if (null == this.fi64ContributionKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64ContributionKey);
    }
    if (null == this.flngTransKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTransKey);
    }
    if (null == this.fdtmEffectiveDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEffectiveDate.getTime());
    __dataOut.writeInt(this.fdtmEffectiveDate.getNanos());
    }
    if (null == this.fcurAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmount, __dataOut);
    }
    if (null == this.fblnProcessed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnProcessed);
    }
    if (null == this.fi64ContributionDetailKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64ContributionDetailKey);
    }
    if (null == this.fi64RvsContributionDetailKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64RvsContributionDetailKey);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64ProRataKey==null?"\\N":"" + fi64ProRataKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrProRataType==null?"\\N":fstrProRataType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64ContributionKey==null?"\\N":"" + fi64ContributionKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngTransKey==null?"\\N":"" + flngTransKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEffectiveDate==null?"\\N":"" + fdtmEffectiveDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmount==null?"\\N":fcurAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnProcessed==null?"\\N":"" + fblnProcessed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64ContributionDetailKey==null?"\\N":"" + fi64ContributionDetailKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64RvsContributionDetailKey==null?"\\N":"" + fi64RvsContributionDetailKey, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64ProRataKey==null?"\\N":"" + fi64ProRataKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrProRataType==null?"\\N":fstrProRataType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64ContributionKey==null?"\\N":"" + fi64ContributionKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngTransKey==null?"\\N":"" + flngTransKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEffectiveDate==null?"\\N":"" + fdtmEffectiveDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmount==null?"\\N":fcurAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnProcessed==null?"\\N":"" + fblnProcessed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64ContributionDetailKey==null?"\\N":"" + fi64ContributionDetailKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64RvsContributionDetailKey==null?"\\N":"" + fi64RvsContributionDetailKey, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64ProRataKey = null; } else {
      this.fi64ProRataKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrProRataType = null; } else {
      this.fstrProRataType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64ContributionKey = null; } else {
      this.fi64ContributionKey = Long.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmEffectiveDate = null; } else {
      this.fdtmEffectiveDate = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnProcessed = null; } else {
      this.fblnProcessed = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64ContributionDetailKey = null; } else {
      this.fi64ContributionDetailKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64RvsContributionDetailKey = null; } else {
      this.fi64RvsContributionDetailKey = Long.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64ProRataKey = null; } else {
      this.fi64ProRataKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrProRataType = null; } else {
      this.fstrProRataType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64ContributionKey = null; } else {
      this.fi64ContributionKey = Long.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmEffectiveDate = null; } else {
      this.fdtmEffectiveDate = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnProcessed = null; } else {
      this.fblnProcessed = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64ContributionDetailKey = null; } else {
      this.fi64ContributionDetailKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64RvsContributionDetailKey = null; } else {
      this.fi64RvsContributionDetailKey = Long.valueOf(__cur_str);
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
    tblnz_kssprorataposting o = (tblnz_kssprorataposting) super.clone();
    o.fdtmEffectiveDate = (o.fdtmEffectiveDate != null) ? (java.sql.Timestamp) o.fdtmEffectiveDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_kssprorataposting o) throws CloneNotSupportedException {
    o.fdtmEffectiveDate = (o.fdtmEffectiveDate != null) ? (java.sql.Timestamp) o.fdtmEffectiveDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("fi64ProRataKey", this.fi64ProRataKey);
    __sqoop$field_map.put("fstrProRataType", this.fstrProRataType);
    __sqoop$field_map.put("fi64ContributionKey", this.fi64ContributionKey);
    __sqoop$field_map.put("flngTransKey", this.flngTransKey);
    __sqoop$field_map.put("fdtmEffectiveDate", this.fdtmEffectiveDate);
    __sqoop$field_map.put("fcurAmount", this.fcurAmount);
    __sqoop$field_map.put("fblnProcessed", this.fblnProcessed);
    __sqoop$field_map.put("fi64ContributionDetailKey", this.fi64ContributionDetailKey);
    __sqoop$field_map.put("fi64RvsContributionDetailKey", this.fi64RvsContributionDetailKey);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("fi64ProRataKey", this.fi64ProRataKey);
    __sqoop$field_map.put("fstrProRataType", this.fstrProRataType);
    __sqoop$field_map.put("fi64ContributionKey", this.fi64ContributionKey);
    __sqoop$field_map.put("flngTransKey", this.flngTransKey);
    __sqoop$field_map.put("fdtmEffectiveDate", this.fdtmEffectiveDate);
    __sqoop$field_map.put("fcurAmount", this.fcurAmount);
    __sqoop$field_map.put("fblnProcessed", this.fblnProcessed);
    __sqoop$field_map.put("fi64ContributionDetailKey", this.fi64ContributionDetailKey);
    __sqoop$field_map.put("fi64RvsContributionDetailKey", this.fi64RvsContributionDetailKey);
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
