// ORM class for table 'tblleadaction'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 06:00:53 NZDT 2020
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

public class tblleadaction extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngLeadKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblleadaction.this.flngLeadKey = (Integer)value;
      }
    });
    setters.put("flngSequence", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblleadaction.this.flngSequence = (Integer)value;
      }
    });
    setters.put("fstrLeadActionType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblleadaction.this.fstrLeadActionType = (String)value;
      }
    });
    setters.put("flngTaskKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblleadaction.this.flngTaskKey = (Integer)value;
      }
    });
    setters.put("fstrLeadActionWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblleadaction.this.fstrLeadActionWho = (String)value;
      }
    });
    setters.put("fdtmLeadActionDue", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblleadaction.this.fdtmLeadActionDue = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmLeadActionActual", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblleadaction.this.fdtmLeadActionActual = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrLeadActionOutCome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblleadaction.this.fstrLeadActionOutCome = (String)value;
      }
    });
    setters.put("fblnLeadClosed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblleadaction.this.fblnLeadClosed = (Integer)value;
      }
    });
    setters.put("fstrLetterId", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblleadaction.this.fstrLetterId = (String)value;
      }
    });
    setters.put("flngMailItemKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblleadaction.this.flngMailItemKey = (Integer)value;
      }
    });
    setters.put("fstrMailType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblleadaction.this.fstrMailType = (String)value;
      }
    });
    setters.put("fstrLog", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblleadaction.this.fstrLog = (String)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblleadaction.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblleadaction.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblleadaction() {
    init0();
  }
  private Integer flngLeadKey;
  public Integer get_flngLeadKey() {
    return flngLeadKey;
  }
  public void set_flngLeadKey(Integer flngLeadKey) {
    this.flngLeadKey = flngLeadKey;
  }
  public tblleadaction with_flngLeadKey(Integer flngLeadKey) {
    this.flngLeadKey = flngLeadKey;
    return this;
  }
  private Integer flngSequence;
  public Integer get_flngSequence() {
    return flngSequence;
  }
  public void set_flngSequence(Integer flngSequence) {
    this.flngSequence = flngSequence;
  }
  public tblleadaction with_flngSequence(Integer flngSequence) {
    this.flngSequence = flngSequence;
    return this;
  }
  private String fstrLeadActionType;
  public String get_fstrLeadActionType() {
    return fstrLeadActionType;
  }
  public void set_fstrLeadActionType(String fstrLeadActionType) {
    this.fstrLeadActionType = fstrLeadActionType;
  }
  public tblleadaction with_fstrLeadActionType(String fstrLeadActionType) {
    this.fstrLeadActionType = fstrLeadActionType;
    return this;
  }
  private Integer flngTaskKey;
  public Integer get_flngTaskKey() {
    return flngTaskKey;
  }
  public void set_flngTaskKey(Integer flngTaskKey) {
    this.flngTaskKey = flngTaskKey;
  }
  public tblleadaction with_flngTaskKey(Integer flngTaskKey) {
    this.flngTaskKey = flngTaskKey;
    return this;
  }
  private String fstrLeadActionWho;
  public String get_fstrLeadActionWho() {
    return fstrLeadActionWho;
  }
  public void set_fstrLeadActionWho(String fstrLeadActionWho) {
    this.fstrLeadActionWho = fstrLeadActionWho;
  }
  public tblleadaction with_fstrLeadActionWho(String fstrLeadActionWho) {
    this.fstrLeadActionWho = fstrLeadActionWho;
    return this;
  }
  private java.sql.Timestamp fdtmLeadActionDue;
  public java.sql.Timestamp get_fdtmLeadActionDue() {
    return fdtmLeadActionDue;
  }
  public void set_fdtmLeadActionDue(java.sql.Timestamp fdtmLeadActionDue) {
    this.fdtmLeadActionDue = fdtmLeadActionDue;
  }
  public tblleadaction with_fdtmLeadActionDue(java.sql.Timestamp fdtmLeadActionDue) {
    this.fdtmLeadActionDue = fdtmLeadActionDue;
    return this;
  }
  private java.sql.Timestamp fdtmLeadActionActual;
  public java.sql.Timestamp get_fdtmLeadActionActual() {
    return fdtmLeadActionActual;
  }
  public void set_fdtmLeadActionActual(java.sql.Timestamp fdtmLeadActionActual) {
    this.fdtmLeadActionActual = fdtmLeadActionActual;
  }
  public tblleadaction with_fdtmLeadActionActual(java.sql.Timestamp fdtmLeadActionActual) {
    this.fdtmLeadActionActual = fdtmLeadActionActual;
    return this;
  }
  private String fstrLeadActionOutCome;
  public String get_fstrLeadActionOutCome() {
    return fstrLeadActionOutCome;
  }
  public void set_fstrLeadActionOutCome(String fstrLeadActionOutCome) {
    this.fstrLeadActionOutCome = fstrLeadActionOutCome;
  }
  public tblleadaction with_fstrLeadActionOutCome(String fstrLeadActionOutCome) {
    this.fstrLeadActionOutCome = fstrLeadActionOutCome;
    return this;
  }
  private Integer fblnLeadClosed;
  public Integer get_fblnLeadClosed() {
    return fblnLeadClosed;
  }
  public void set_fblnLeadClosed(Integer fblnLeadClosed) {
    this.fblnLeadClosed = fblnLeadClosed;
  }
  public tblleadaction with_fblnLeadClosed(Integer fblnLeadClosed) {
    this.fblnLeadClosed = fblnLeadClosed;
    return this;
  }
  private String fstrLetterId;
  public String get_fstrLetterId() {
    return fstrLetterId;
  }
  public void set_fstrLetterId(String fstrLetterId) {
    this.fstrLetterId = fstrLetterId;
  }
  public tblleadaction with_fstrLetterId(String fstrLetterId) {
    this.fstrLetterId = fstrLetterId;
    return this;
  }
  private Integer flngMailItemKey;
  public Integer get_flngMailItemKey() {
    return flngMailItemKey;
  }
  public void set_flngMailItemKey(Integer flngMailItemKey) {
    this.flngMailItemKey = flngMailItemKey;
  }
  public tblleadaction with_flngMailItemKey(Integer flngMailItemKey) {
    this.flngMailItemKey = flngMailItemKey;
    return this;
  }
  private String fstrMailType;
  public String get_fstrMailType() {
    return fstrMailType;
  }
  public void set_fstrMailType(String fstrMailType) {
    this.fstrMailType = fstrMailType;
  }
  public tblleadaction with_fstrMailType(String fstrMailType) {
    this.fstrMailType = fstrMailType;
    return this;
  }
  private String fstrLog;
  public String get_fstrLog() {
    return fstrLog;
  }
  public void set_fstrLog(String fstrLog) {
    this.fstrLog = fstrLog;
  }
  public tblleadaction with_fstrLog(String fstrLog) {
    this.fstrLog = fstrLog;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblleadaction with_fstrWho(String fstrWho) {
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
  public tblleadaction with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblleadaction)) {
      return false;
    }
    tblleadaction that = (tblleadaction) o;
    boolean equal = true;
    equal = equal && (this.flngLeadKey == null ? that.flngLeadKey == null : this.flngLeadKey.equals(that.flngLeadKey));
    equal = equal && (this.flngSequence == null ? that.flngSequence == null : this.flngSequence.equals(that.flngSequence));
    equal = equal && (this.fstrLeadActionType == null ? that.fstrLeadActionType == null : this.fstrLeadActionType.equals(that.fstrLeadActionType));
    equal = equal && (this.flngTaskKey == null ? that.flngTaskKey == null : this.flngTaskKey.equals(that.flngTaskKey));
    equal = equal && (this.fstrLeadActionWho == null ? that.fstrLeadActionWho == null : this.fstrLeadActionWho.equals(that.fstrLeadActionWho));
    equal = equal && (this.fdtmLeadActionDue == null ? that.fdtmLeadActionDue == null : this.fdtmLeadActionDue.equals(that.fdtmLeadActionDue));
    equal = equal && (this.fdtmLeadActionActual == null ? that.fdtmLeadActionActual == null : this.fdtmLeadActionActual.equals(that.fdtmLeadActionActual));
    equal = equal && (this.fstrLeadActionOutCome == null ? that.fstrLeadActionOutCome == null : this.fstrLeadActionOutCome.equals(that.fstrLeadActionOutCome));
    equal = equal && (this.fblnLeadClosed == null ? that.fblnLeadClosed == null : this.fblnLeadClosed.equals(that.fblnLeadClosed));
    equal = equal && (this.fstrLetterId == null ? that.fstrLetterId == null : this.fstrLetterId.equals(that.fstrLetterId));
    equal = equal && (this.flngMailItemKey == null ? that.flngMailItemKey == null : this.flngMailItemKey.equals(that.flngMailItemKey));
    equal = equal && (this.fstrMailType == null ? that.fstrMailType == null : this.fstrMailType.equals(that.fstrMailType));
    equal = equal && (this.fstrLog == null ? that.fstrLog == null : this.fstrLog.equals(that.fstrLog));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblleadaction)) {
      return false;
    }
    tblleadaction that = (tblleadaction) o;
    boolean equal = true;
    equal = equal && (this.flngLeadKey == null ? that.flngLeadKey == null : this.flngLeadKey.equals(that.flngLeadKey));
    equal = equal && (this.flngSequence == null ? that.flngSequence == null : this.flngSequence.equals(that.flngSequence));
    equal = equal && (this.fstrLeadActionType == null ? that.fstrLeadActionType == null : this.fstrLeadActionType.equals(that.fstrLeadActionType));
    equal = equal && (this.flngTaskKey == null ? that.flngTaskKey == null : this.flngTaskKey.equals(that.flngTaskKey));
    equal = equal && (this.fstrLeadActionWho == null ? that.fstrLeadActionWho == null : this.fstrLeadActionWho.equals(that.fstrLeadActionWho));
    equal = equal && (this.fdtmLeadActionDue == null ? that.fdtmLeadActionDue == null : this.fdtmLeadActionDue.equals(that.fdtmLeadActionDue));
    equal = equal && (this.fdtmLeadActionActual == null ? that.fdtmLeadActionActual == null : this.fdtmLeadActionActual.equals(that.fdtmLeadActionActual));
    equal = equal && (this.fstrLeadActionOutCome == null ? that.fstrLeadActionOutCome == null : this.fstrLeadActionOutCome.equals(that.fstrLeadActionOutCome));
    equal = equal && (this.fblnLeadClosed == null ? that.fblnLeadClosed == null : this.fblnLeadClosed.equals(that.fblnLeadClosed));
    equal = equal && (this.fstrLetterId == null ? that.fstrLetterId == null : this.fstrLetterId.equals(that.fstrLetterId));
    equal = equal && (this.flngMailItemKey == null ? that.flngMailItemKey == null : this.flngMailItemKey.equals(that.flngMailItemKey));
    equal = equal && (this.fstrMailType == null ? that.fstrMailType == null : this.fstrMailType.equals(that.fstrMailType));
    equal = equal && (this.fstrLog == null ? that.fstrLog == null : this.fstrLog.equals(that.fstrLog));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngLeadKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngSequence = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fstrLeadActionType = JdbcWritableBridge.readString(3, __dbResults);
    this.flngTaskKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fstrLeadActionWho = JdbcWritableBridge.readString(5, __dbResults);
    this.fdtmLeadActionDue = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.fdtmLeadActionActual = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.fstrLeadActionOutCome = JdbcWritableBridge.readString(8, __dbResults);
    this.fblnLeadClosed = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fstrLetterId = JdbcWritableBridge.readString(10, __dbResults);
    this.flngMailItemKey = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fstrMailType = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrLog = JdbcWritableBridge.readString(13, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(14, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(15, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngLeadKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngSequence = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fstrLeadActionType = JdbcWritableBridge.readString(3, __dbResults);
    this.flngTaskKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fstrLeadActionWho = JdbcWritableBridge.readString(5, __dbResults);
    this.fdtmLeadActionDue = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.fdtmLeadActionActual = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.fstrLeadActionOutCome = JdbcWritableBridge.readString(8, __dbResults);
    this.fblnLeadClosed = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fstrLetterId = JdbcWritableBridge.readString(10, __dbResults);
    this.flngMailItemKey = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fstrMailType = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrLog = JdbcWritableBridge.readString(13, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngLeadKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngSequence, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrLeadActionType, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngTaskKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrLeadActionWho, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmLeadActionDue, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmLeadActionActual, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrLeadActionOutCome, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnLeadClosed, 9 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrLetterId, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngMailItemKey, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrMailType, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLog, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 15 + __off, 93, __dbStmt);
    return 15;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngLeadKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngSequence, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrLeadActionType, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngTaskKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrLeadActionWho, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmLeadActionDue, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmLeadActionActual, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrLeadActionOutCome, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnLeadClosed, 9 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrLetterId, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngMailItemKey, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrMailType, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLog, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 15 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngLeadKey = null;
    } else {
    this.flngLeadKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngSequence = null;
    } else {
    this.flngSequence = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrLeadActionType = null;
    } else {
    this.fstrLeadActionType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngTaskKey = null;
    } else {
    this.flngTaskKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrLeadActionWho = null;
    } else {
    this.fstrLeadActionWho = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmLeadActionDue = null;
    } else {
    this.fdtmLeadActionDue = new Timestamp(__dataIn.readLong());
    this.fdtmLeadActionDue.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmLeadActionActual = null;
    } else {
    this.fdtmLeadActionActual = new Timestamp(__dataIn.readLong());
    this.fdtmLeadActionActual.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrLeadActionOutCome = null;
    } else {
    this.fstrLeadActionOutCome = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnLeadClosed = null;
    } else {
    this.fblnLeadClosed = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrLetterId = null;
    } else {
    this.fstrLetterId = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngMailItemKey = null;
    } else {
    this.flngMailItemKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrMailType = null;
    } else {
    this.fstrMailType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrLog = null;
    } else {
    this.fstrLog = Text.readString(__dataIn);
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
    if (null == this.flngLeadKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngLeadKey);
    }
    if (null == this.flngSequence) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngSequence);
    }
    if (null == this.fstrLeadActionType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLeadActionType);
    }
    if (null == this.flngTaskKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTaskKey);
    }
    if (null == this.fstrLeadActionWho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLeadActionWho);
    }
    if (null == this.fdtmLeadActionDue) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmLeadActionDue.getTime());
    __dataOut.writeInt(this.fdtmLeadActionDue.getNanos());
    }
    if (null == this.fdtmLeadActionActual) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmLeadActionActual.getTime());
    __dataOut.writeInt(this.fdtmLeadActionActual.getNanos());
    }
    if (null == this.fstrLeadActionOutCome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLeadActionOutCome);
    }
    if (null == this.fblnLeadClosed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnLeadClosed);
    }
    if (null == this.fstrLetterId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLetterId);
    }
    if (null == this.flngMailItemKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngMailItemKey);
    }
    if (null == this.fstrMailType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMailType);
    }
    if (null == this.fstrLog) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLog);
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
    if (null == this.flngLeadKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngLeadKey);
    }
    if (null == this.flngSequence) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngSequence);
    }
    if (null == this.fstrLeadActionType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLeadActionType);
    }
    if (null == this.flngTaskKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTaskKey);
    }
    if (null == this.fstrLeadActionWho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLeadActionWho);
    }
    if (null == this.fdtmLeadActionDue) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmLeadActionDue.getTime());
    __dataOut.writeInt(this.fdtmLeadActionDue.getNanos());
    }
    if (null == this.fdtmLeadActionActual) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmLeadActionActual.getTime());
    __dataOut.writeInt(this.fdtmLeadActionActual.getNanos());
    }
    if (null == this.fstrLeadActionOutCome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLeadActionOutCome);
    }
    if (null == this.fblnLeadClosed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnLeadClosed);
    }
    if (null == this.fstrLetterId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLetterId);
    }
    if (null == this.flngMailItemKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngMailItemKey);
    }
    if (null == this.fstrMailType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMailType);
    }
    if (null == this.fstrLog) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLog);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngLeadKey==null?"\\N":"" + flngLeadKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngSequence==null?"\\N":"" + flngSequence, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLeadActionType==null?"\\N":fstrLeadActionType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngTaskKey==null?"\\N":"" + flngTaskKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLeadActionWho==null?"\\N":fstrLeadActionWho, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmLeadActionDue==null?"\\N":"" + fdtmLeadActionDue, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmLeadActionActual==null?"\\N":"" + fdtmLeadActionActual, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLeadActionOutCome==null?"\\N":fstrLeadActionOutCome, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnLeadClosed==null?"\\N":"" + fblnLeadClosed, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLetterId==null?"\\N":fstrLetterId, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngMailItemKey==null?"\\N":"" + flngMailItemKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMailType==null?"\\N":fstrMailType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLog==null?"\\N":fstrLog, " ", delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngLeadKey==null?"\\N":"" + flngLeadKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngSequence==null?"\\N":"" + flngSequence, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLeadActionType==null?"\\N":fstrLeadActionType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngTaskKey==null?"\\N":"" + flngTaskKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLeadActionWho==null?"\\N":fstrLeadActionWho, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmLeadActionDue==null?"\\N":"" + fdtmLeadActionDue, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmLeadActionActual==null?"\\N":"" + fdtmLeadActionActual, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLeadActionOutCome==null?"\\N":fstrLeadActionOutCome, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnLeadClosed==null?"\\N":"" + fblnLeadClosed, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLetterId==null?"\\N":fstrLetterId, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngMailItemKey==null?"\\N":"" + flngMailItemKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMailType==null?"\\N":fstrMailType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLog==null?"\\N":fstrLog, " ", delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngLeadKey = null; } else {
      this.flngLeadKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngSequence = null; } else {
      this.flngSequence = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLeadActionType = null; } else {
      this.fstrLeadActionType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTaskKey = null; } else {
      this.flngTaskKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLeadActionWho = null; } else {
      this.fstrLeadActionWho = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmLeadActionDue = null; } else {
      this.fdtmLeadActionDue = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmLeadActionActual = null; } else {
      this.fdtmLeadActionActual = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLeadActionOutCome = null; } else {
      this.fstrLeadActionOutCome = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnLeadClosed = null; } else {
      this.fblnLeadClosed = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLetterId = null; } else {
      this.fstrLetterId = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngMailItemKey = null; } else {
      this.flngMailItemKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMailType = null; } else {
      this.fstrMailType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLog = null; } else {
      this.fstrLog = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngLeadKey = null; } else {
      this.flngLeadKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngSequence = null; } else {
      this.flngSequence = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLeadActionType = null; } else {
      this.fstrLeadActionType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTaskKey = null; } else {
      this.flngTaskKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLeadActionWho = null; } else {
      this.fstrLeadActionWho = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmLeadActionDue = null; } else {
      this.fdtmLeadActionDue = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmLeadActionActual = null; } else {
      this.fdtmLeadActionActual = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLeadActionOutCome = null; } else {
      this.fstrLeadActionOutCome = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnLeadClosed = null; } else {
      this.fblnLeadClosed = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLetterId = null; } else {
      this.fstrLetterId = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngMailItemKey = null; } else {
      this.flngMailItemKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMailType = null; } else {
      this.fstrMailType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLog = null; } else {
      this.fstrLog = __cur_str;
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
    tblleadaction o = (tblleadaction) super.clone();
    o.fdtmLeadActionDue = (o.fdtmLeadActionDue != null) ? (java.sql.Timestamp) o.fdtmLeadActionDue.clone() : null;
    o.fdtmLeadActionActual = (o.fdtmLeadActionActual != null) ? (java.sql.Timestamp) o.fdtmLeadActionActual.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblleadaction o) throws CloneNotSupportedException {
    o.fdtmLeadActionDue = (o.fdtmLeadActionDue != null) ? (java.sql.Timestamp) o.fdtmLeadActionDue.clone() : null;
    o.fdtmLeadActionActual = (o.fdtmLeadActionActual != null) ? (java.sql.Timestamp) o.fdtmLeadActionActual.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngLeadKey", this.flngLeadKey);
    __sqoop$field_map.put("flngSequence", this.flngSequence);
    __sqoop$field_map.put("fstrLeadActionType", this.fstrLeadActionType);
    __sqoop$field_map.put("flngTaskKey", this.flngTaskKey);
    __sqoop$field_map.put("fstrLeadActionWho", this.fstrLeadActionWho);
    __sqoop$field_map.put("fdtmLeadActionDue", this.fdtmLeadActionDue);
    __sqoop$field_map.put("fdtmLeadActionActual", this.fdtmLeadActionActual);
    __sqoop$field_map.put("fstrLeadActionOutCome", this.fstrLeadActionOutCome);
    __sqoop$field_map.put("fblnLeadClosed", this.fblnLeadClosed);
    __sqoop$field_map.put("fstrLetterId", this.fstrLetterId);
    __sqoop$field_map.put("flngMailItemKey", this.flngMailItemKey);
    __sqoop$field_map.put("fstrMailType", this.fstrMailType);
    __sqoop$field_map.put("fstrLog", this.fstrLog);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngLeadKey", this.flngLeadKey);
    __sqoop$field_map.put("flngSequence", this.flngSequence);
    __sqoop$field_map.put("fstrLeadActionType", this.fstrLeadActionType);
    __sqoop$field_map.put("flngTaskKey", this.flngTaskKey);
    __sqoop$field_map.put("fstrLeadActionWho", this.fstrLeadActionWho);
    __sqoop$field_map.put("fdtmLeadActionDue", this.fdtmLeadActionDue);
    __sqoop$field_map.put("fdtmLeadActionActual", this.fdtmLeadActionActual);
    __sqoop$field_map.put("fstrLeadActionOutCome", this.fstrLeadActionOutCome);
    __sqoop$field_map.put("fblnLeadClosed", this.fblnLeadClosed);
    __sqoop$field_map.put("fstrLetterId", this.fstrLetterId);
    __sqoop$field_map.put("flngMailItemKey", this.flngMailItemKey);
    __sqoop$field_map.put("fstrMailType", this.fstrMailType);
    __sqoop$field_map.put("fstrLog", this.fstrLog);
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
