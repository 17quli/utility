// ORM class for table 'tbltaskgroupqueue'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 06:32:43 NZDT 2020
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

public class tbltaskgroupqueue extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngGroupKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltaskgroupqueue.this.flngGroupKey = (Integer)value;
      }
    });
    setters.put("flngQueueKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltaskgroupqueue.this.flngQueueKey = (Integer)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltaskgroupqueue.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltaskgroupqueue.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("flngOrder", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltaskgroupqueue.this.flngOrder = (Integer)value;
      }
    });
    setters.put("fintPriority", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltaskgroupqueue.this.fintPriority = (Integer)value;
      }
    });
    setters.put("fstrQueueMethod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltaskgroupqueue.this.fstrQueueMethod = (String)value;
      }
    });
    setters.put("fintNotificationType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltaskgroupqueue.this.fintNotificationType = (Integer)value;
      }
    });
    setters.put("fblnInteractive", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltaskgroupqueue.this.fblnInteractive = (Integer)value;
      }
    });
    setters.put("fblnActive", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltaskgroupqueue.this.fblnActive = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltaskgroupqueue.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltaskgroupqueue.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tbltaskgroupqueue() {
    init0();
  }
  private Integer flngGroupKey;
  public Integer get_flngGroupKey() {
    return flngGroupKey;
  }
  public void set_flngGroupKey(Integer flngGroupKey) {
    this.flngGroupKey = flngGroupKey;
  }
  public tbltaskgroupqueue with_flngGroupKey(Integer flngGroupKey) {
    this.flngGroupKey = flngGroupKey;
    return this;
  }
  private Integer flngQueueKey;
  public Integer get_flngQueueKey() {
    return flngQueueKey;
  }
  public void set_flngQueueKey(Integer flngQueueKey) {
    this.flngQueueKey = flngQueueKey;
  }
  public tbltaskgroupqueue with_flngQueueKey(Integer flngQueueKey) {
    this.flngQueueKey = flngQueueKey;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tbltaskgroupqueue with_flngVer(Integer flngVer) {
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
  public tbltaskgroupqueue with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private Integer flngOrder;
  public Integer get_flngOrder() {
    return flngOrder;
  }
  public void set_flngOrder(Integer flngOrder) {
    this.flngOrder = flngOrder;
  }
  public tbltaskgroupqueue with_flngOrder(Integer flngOrder) {
    this.flngOrder = flngOrder;
    return this;
  }
  private Integer fintPriority;
  public Integer get_fintPriority() {
    return fintPriority;
  }
  public void set_fintPriority(Integer fintPriority) {
    this.fintPriority = fintPriority;
  }
  public tbltaskgroupqueue with_fintPriority(Integer fintPriority) {
    this.fintPriority = fintPriority;
    return this;
  }
  private String fstrQueueMethod;
  public String get_fstrQueueMethod() {
    return fstrQueueMethod;
  }
  public void set_fstrQueueMethod(String fstrQueueMethod) {
    this.fstrQueueMethod = fstrQueueMethod;
  }
  public tbltaskgroupqueue with_fstrQueueMethod(String fstrQueueMethod) {
    this.fstrQueueMethod = fstrQueueMethod;
    return this;
  }
  private Integer fintNotificationType;
  public Integer get_fintNotificationType() {
    return fintNotificationType;
  }
  public void set_fintNotificationType(Integer fintNotificationType) {
    this.fintNotificationType = fintNotificationType;
  }
  public tbltaskgroupqueue with_fintNotificationType(Integer fintNotificationType) {
    this.fintNotificationType = fintNotificationType;
    return this;
  }
  private Integer fblnInteractive;
  public Integer get_fblnInteractive() {
    return fblnInteractive;
  }
  public void set_fblnInteractive(Integer fblnInteractive) {
    this.fblnInteractive = fblnInteractive;
  }
  public tbltaskgroupqueue with_fblnInteractive(Integer fblnInteractive) {
    this.fblnInteractive = fblnInteractive;
    return this;
  }
  private Integer fblnActive;
  public Integer get_fblnActive() {
    return fblnActive;
  }
  public void set_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
  }
  public tbltaskgroupqueue with_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tbltaskgroupqueue with_fstrWho(String fstrWho) {
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
  public tbltaskgroupqueue with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tbltaskgroupqueue)) {
      return false;
    }
    tbltaskgroupqueue that = (tbltaskgroupqueue) o;
    boolean equal = true;
    equal = equal && (this.flngGroupKey == null ? that.flngGroupKey == null : this.flngGroupKey.equals(that.flngGroupKey));
    equal = equal && (this.flngQueueKey == null ? that.flngQueueKey == null : this.flngQueueKey.equals(that.flngQueueKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngOrder == null ? that.flngOrder == null : this.flngOrder.equals(that.flngOrder));
    equal = equal && (this.fintPriority == null ? that.fintPriority == null : this.fintPriority.equals(that.fintPriority));
    equal = equal && (this.fstrQueueMethod == null ? that.fstrQueueMethod == null : this.fstrQueueMethod.equals(that.fstrQueueMethod));
    equal = equal && (this.fintNotificationType == null ? that.fintNotificationType == null : this.fintNotificationType.equals(that.fintNotificationType));
    equal = equal && (this.fblnInteractive == null ? that.fblnInteractive == null : this.fblnInteractive.equals(that.fblnInteractive));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tbltaskgroupqueue)) {
      return false;
    }
    tbltaskgroupqueue that = (tbltaskgroupqueue) o;
    boolean equal = true;
    equal = equal && (this.flngGroupKey == null ? that.flngGroupKey == null : this.flngGroupKey.equals(that.flngGroupKey));
    equal = equal && (this.flngQueueKey == null ? that.flngQueueKey == null : this.flngQueueKey.equals(that.flngQueueKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngOrder == null ? that.flngOrder == null : this.flngOrder.equals(that.flngOrder));
    equal = equal && (this.fintPriority == null ? that.fintPriority == null : this.fintPriority.equals(that.fintPriority));
    equal = equal && (this.fstrQueueMethod == null ? that.fstrQueueMethod == null : this.fstrQueueMethod.equals(that.fstrQueueMethod));
    equal = equal && (this.fintNotificationType == null ? that.fintNotificationType == null : this.fintNotificationType.equals(that.fintNotificationType));
    equal = equal && (this.fblnInteractive == null ? that.fblnInteractive == null : this.fblnInteractive.equals(that.fblnInteractive));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngGroupKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngQueueKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngOrder = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fintPriority = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fstrQueueMethod = JdbcWritableBridge.readString(7, __dbResults);
    this.fintNotificationType = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fblnInteractive = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(11, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(12, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngGroupKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngQueueKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngOrder = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fintPriority = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fstrQueueMethod = JdbcWritableBridge.readString(7, __dbResults);
    this.fintNotificationType = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fblnInteractive = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(10, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngGroupKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngQueueKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngOrder, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintPriority, 6 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrQueueMethod, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintNotificationType, 8 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnInteractive, 9 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 10 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 12 + __off, 93, __dbStmt);
    return 12;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngGroupKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngQueueKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngOrder, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintPriority, 6 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrQueueMethod, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintNotificationType, 8 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnInteractive, 9 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 10 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 12 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngGroupKey = null;
    } else {
    this.flngGroupKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngQueueKey = null;
    } else {
    this.flngQueueKey = Integer.valueOf(__dataIn.readInt());
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
        this.flngOrder = null;
    } else {
    this.flngOrder = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintPriority = null;
    } else {
    this.fintPriority = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrQueueMethod = null;
    } else {
    this.fstrQueueMethod = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fintNotificationType = null;
    } else {
    this.fintNotificationType = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnInteractive = null;
    } else {
    this.fblnInteractive = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnActive = null;
    } else {
    this.fblnActive = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.flngGroupKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngGroupKey);
    }
    if (null == this.flngQueueKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngQueueKey);
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
    if (null == this.flngOrder) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngOrder);
    }
    if (null == this.fintPriority) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintPriority);
    }
    if (null == this.fstrQueueMethod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrQueueMethod);
    }
    if (null == this.fintNotificationType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintNotificationType);
    }
    if (null == this.fblnInteractive) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnInteractive);
    }
    if (null == this.fblnActive) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnActive);
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
    if (null == this.flngGroupKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngGroupKey);
    }
    if (null == this.flngQueueKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngQueueKey);
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
    if (null == this.flngOrder) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngOrder);
    }
    if (null == this.fintPriority) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintPriority);
    }
    if (null == this.fstrQueueMethod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrQueueMethod);
    }
    if (null == this.fintNotificationType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintNotificationType);
    }
    if (null == this.fblnInteractive) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnInteractive);
    }
    if (null == this.fblnActive) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnActive);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngGroupKey==null?"\\N":"" + flngGroupKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngQueueKey==null?"\\N":"" + flngQueueKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngOrder==null?"\\N":"" + flngOrder, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintPriority==null?"\\N":"" + fintPriority, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrQueueMethod==null?"\\N":fstrQueueMethod, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintNotificationType==null?"\\N":"" + fintNotificationType, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnInteractive==null?"\\N":"" + fblnInteractive, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnActive==null?"\\N":"" + fblnActive, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngGroupKey==null?"\\N":"" + flngGroupKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngQueueKey==null?"\\N":"" + flngQueueKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngOrder==null?"\\N":"" + flngOrder, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintPriority==null?"\\N":"" + fintPriority, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrQueueMethod==null?"\\N":fstrQueueMethod, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintNotificationType==null?"\\N":"" + fintNotificationType, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnInteractive==null?"\\N":"" + fblnInteractive, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnActive==null?"\\N":"" + fblnActive, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngGroupKey = null; } else {
      this.flngGroupKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngQueueKey = null; } else {
      this.flngQueueKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngOrder = null; } else {
      this.flngOrder = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintPriority = null; } else {
      this.fintPriority = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrQueueMethod = null; } else {
      this.fstrQueueMethod = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintNotificationType = null; } else {
      this.fintNotificationType = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnInteractive = null; } else {
      this.fblnInteractive = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnActive = null; } else {
      this.fblnActive = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngGroupKey = null; } else {
      this.flngGroupKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngQueueKey = null; } else {
      this.flngQueueKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngOrder = null; } else {
      this.flngOrder = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintPriority = null; } else {
      this.fintPriority = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrQueueMethod = null; } else {
      this.fstrQueueMethod = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintNotificationType = null; } else {
      this.fintNotificationType = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnInteractive = null; } else {
      this.fblnInteractive = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnActive = null; } else {
      this.fblnActive = Integer.valueOf(__cur_str);
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
    tbltaskgroupqueue o = (tbltaskgroupqueue) super.clone();
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tbltaskgroupqueue o) throws CloneNotSupportedException {
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngGroupKey", this.flngGroupKey);
    __sqoop$field_map.put("flngQueueKey", this.flngQueueKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngOrder", this.flngOrder);
    __sqoop$field_map.put("fintPriority", this.fintPriority);
    __sqoop$field_map.put("fstrQueueMethod", this.fstrQueueMethod);
    __sqoop$field_map.put("fintNotificationType", this.fintNotificationType);
    __sqoop$field_map.put("fblnInteractive", this.fblnInteractive);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngGroupKey", this.flngGroupKey);
    __sqoop$field_map.put("flngQueueKey", this.flngQueueKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngOrder", this.flngOrder);
    __sqoop$field_map.put("fintPriority", this.fintPriority);
    __sqoop$field_map.put("fstrQueueMethod", this.fstrQueueMethod);
    __sqoop$field_map.put("fintNotificationType", this.fintNotificationType);
    __sqoop$field_map.put("fblnInteractive", this.fblnInteractive);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
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
