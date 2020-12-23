// ORM class for table 'tbltaskqueue'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 06:03:23 NZDT 2020
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

public class tbltaskqueue extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngQueueKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltaskqueue.this.flngQueueKey = (Integer)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltaskqueue.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltaskqueue.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("flngQueueId", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltaskqueue.this.flngQueueId = (Integer)value;
      }
    });
    setters.put("flngOrder", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltaskqueue.this.flngOrder = (Integer)value;
      }
    });
    setters.put("fstrName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltaskqueue.this.fstrName = (String)value;
      }
    });
    setters.put("fstrOwner", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltaskqueue.this.fstrOwner = (String)value;
      }
    });
    setters.put("fstrDescription", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltaskqueue.this.fstrDescription = (String)value;
      }
    });
    setters.put("flngCrmKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltaskqueue.this.flngCrmKey = (Integer)value;
      }
    });
    setters.put("fintNotificationType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltaskqueue.this.fintNotificationType = (Integer)value;
      }
    });
    setters.put("fblnInteractive", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltaskqueue.this.fblnInteractive = (Integer)value;
      }
    });
    setters.put("flngWeight", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltaskqueue.this.flngWeight = (Integer)value;
      }
    });
    setters.put("flngReminderDelay", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltaskqueue.this.flngReminderDelay = (Integer)value;
      }
    });
    setters.put("fstrUnitType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltaskqueue.this.fstrUnitType = (String)value;
      }
    });
    setters.put("fdtmCommence", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltaskqueue.this.fdtmCommence = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmCease", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltaskqueue.this.fdtmCease = (java.sql.Timestamp)value;
      }
    });
    setters.put("fblnActive", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltaskqueue.this.fblnActive = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltaskqueue.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltaskqueue.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tbltaskqueue() {
    init0();
  }
  private Integer flngQueueKey;
  public Integer get_flngQueueKey() {
    return flngQueueKey;
  }
  public void set_flngQueueKey(Integer flngQueueKey) {
    this.flngQueueKey = flngQueueKey;
  }
  public tbltaskqueue with_flngQueueKey(Integer flngQueueKey) {
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
  public tbltaskqueue with_flngVer(Integer flngVer) {
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
  public tbltaskqueue with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private Integer flngQueueId;
  public Integer get_flngQueueId() {
    return flngQueueId;
  }
  public void set_flngQueueId(Integer flngQueueId) {
    this.flngQueueId = flngQueueId;
  }
  public tbltaskqueue with_flngQueueId(Integer flngQueueId) {
    this.flngQueueId = flngQueueId;
    return this;
  }
  private Integer flngOrder;
  public Integer get_flngOrder() {
    return flngOrder;
  }
  public void set_flngOrder(Integer flngOrder) {
    this.flngOrder = flngOrder;
  }
  public tbltaskqueue with_flngOrder(Integer flngOrder) {
    this.flngOrder = flngOrder;
    return this;
  }
  private String fstrName;
  public String get_fstrName() {
    return fstrName;
  }
  public void set_fstrName(String fstrName) {
    this.fstrName = fstrName;
  }
  public tbltaskqueue with_fstrName(String fstrName) {
    this.fstrName = fstrName;
    return this;
  }
  private String fstrOwner;
  public String get_fstrOwner() {
    return fstrOwner;
  }
  public void set_fstrOwner(String fstrOwner) {
    this.fstrOwner = fstrOwner;
  }
  public tbltaskqueue with_fstrOwner(String fstrOwner) {
    this.fstrOwner = fstrOwner;
    return this;
  }
  private String fstrDescription;
  public String get_fstrDescription() {
    return fstrDescription;
  }
  public void set_fstrDescription(String fstrDescription) {
    this.fstrDescription = fstrDescription;
  }
  public tbltaskqueue with_fstrDescription(String fstrDescription) {
    this.fstrDescription = fstrDescription;
    return this;
  }
  private Integer flngCrmKey;
  public Integer get_flngCrmKey() {
    return flngCrmKey;
  }
  public void set_flngCrmKey(Integer flngCrmKey) {
    this.flngCrmKey = flngCrmKey;
  }
  public tbltaskqueue with_flngCrmKey(Integer flngCrmKey) {
    this.flngCrmKey = flngCrmKey;
    return this;
  }
  private Integer fintNotificationType;
  public Integer get_fintNotificationType() {
    return fintNotificationType;
  }
  public void set_fintNotificationType(Integer fintNotificationType) {
    this.fintNotificationType = fintNotificationType;
  }
  public tbltaskqueue with_fintNotificationType(Integer fintNotificationType) {
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
  public tbltaskqueue with_fblnInteractive(Integer fblnInteractive) {
    this.fblnInteractive = fblnInteractive;
    return this;
  }
  private Integer flngWeight;
  public Integer get_flngWeight() {
    return flngWeight;
  }
  public void set_flngWeight(Integer flngWeight) {
    this.flngWeight = flngWeight;
  }
  public tbltaskqueue with_flngWeight(Integer flngWeight) {
    this.flngWeight = flngWeight;
    return this;
  }
  private Integer flngReminderDelay;
  public Integer get_flngReminderDelay() {
    return flngReminderDelay;
  }
  public void set_flngReminderDelay(Integer flngReminderDelay) {
    this.flngReminderDelay = flngReminderDelay;
  }
  public tbltaskqueue with_flngReminderDelay(Integer flngReminderDelay) {
    this.flngReminderDelay = flngReminderDelay;
    return this;
  }
  private String fstrUnitType;
  public String get_fstrUnitType() {
    return fstrUnitType;
  }
  public void set_fstrUnitType(String fstrUnitType) {
    this.fstrUnitType = fstrUnitType;
  }
  public tbltaskqueue with_fstrUnitType(String fstrUnitType) {
    this.fstrUnitType = fstrUnitType;
    return this;
  }
  private java.sql.Timestamp fdtmCommence;
  public java.sql.Timestamp get_fdtmCommence() {
    return fdtmCommence;
  }
  public void set_fdtmCommence(java.sql.Timestamp fdtmCommence) {
    this.fdtmCommence = fdtmCommence;
  }
  public tbltaskqueue with_fdtmCommence(java.sql.Timestamp fdtmCommence) {
    this.fdtmCommence = fdtmCommence;
    return this;
  }
  private java.sql.Timestamp fdtmCease;
  public java.sql.Timestamp get_fdtmCease() {
    return fdtmCease;
  }
  public void set_fdtmCease(java.sql.Timestamp fdtmCease) {
    this.fdtmCease = fdtmCease;
  }
  public tbltaskqueue with_fdtmCease(java.sql.Timestamp fdtmCease) {
    this.fdtmCease = fdtmCease;
    return this;
  }
  private Integer fblnActive;
  public Integer get_fblnActive() {
    return fblnActive;
  }
  public void set_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
  }
  public tbltaskqueue with_fblnActive(Integer fblnActive) {
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
  public tbltaskqueue with_fstrWho(String fstrWho) {
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
  public tbltaskqueue with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tbltaskqueue)) {
      return false;
    }
    tbltaskqueue that = (tbltaskqueue) o;
    boolean equal = true;
    equal = equal && (this.flngQueueKey == null ? that.flngQueueKey == null : this.flngQueueKey.equals(that.flngQueueKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngQueueId == null ? that.flngQueueId == null : this.flngQueueId.equals(that.flngQueueId));
    equal = equal && (this.flngOrder == null ? that.flngOrder == null : this.flngOrder.equals(that.flngOrder));
    equal = equal && (this.fstrName == null ? that.fstrName == null : this.fstrName.equals(that.fstrName));
    equal = equal && (this.fstrOwner == null ? that.fstrOwner == null : this.fstrOwner.equals(that.fstrOwner));
    equal = equal && (this.fstrDescription == null ? that.fstrDescription == null : this.fstrDescription.equals(that.fstrDescription));
    equal = equal && (this.flngCrmKey == null ? that.flngCrmKey == null : this.flngCrmKey.equals(that.flngCrmKey));
    equal = equal && (this.fintNotificationType == null ? that.fintNotificationType == null : this.fintNotificationType.equals(that.fintNotificationType));
    equal = equal && (this.fblnInteractive == null ? that.fblnInteractive == null : this.fblnInteractive.equals(that.fblnInteractive));
    equal = equal && (this.flngWeight == null ? that.flngWeight == null : this.flngWeight.equals(that.flngWeight));
    equal = equal && (this.flngReminderDelay == null ? that.flngReminderDelay == null : this.flngReminderDelay.equals(that.flngReminderDelay));
    equal = equal && (this.fstrUnitType == null ? that.fstrUnitType == null : this.fstrUnitType.equals(that.fstrUnitType));
    equal = equal && (this.fdtmCommence == null ? that.fdtmCommence == null : this.fdtmCommence.equals(that.fdtmCommence));
    equal = equal && (this.fdtmCease == null ? that.fdtmCease == null : this.fdtmCease.equals(that.fdtmCease));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tbltaskqueue)) {
      return false;
    }
    tbltaskqueue that = (tbltaskqueue) o;
    boolean equal = true;
    equal = equal && (this.flngQueueKey == null ? that.flngQueueKey == null : this.flngQueueKey.equals(that.flngQueueKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngQueueId == null ? that.flngQueueId == null : this.flngQueueId.equals(that.flngQueueId));
    equal = equal && (this.flngOrder == null ? that.flngOrder == null : this.flngOrder.equals(that.flngOrder));
    equal = equal && (this.fstrName == null ? that.fstrName == null : this.fstrName.equals(that.fstrName));
    equal = equal && (this.fstrOwner == null ? that.fstrOwner == null : this.fstrOwner.equals(that.fstrOwner));
    equal = equal && (this.fstrDescription == null ? that.fstrDescription == null : this.fstrDescription.equals(that.fstrDescription));
    equal = equal && (this.flngCrmKey == null ? that.flngCrmKey == null : this.flngCrmKey.equals(that.flngCrmKey));
    equal = equal && (this.fintNotificationType == null ? that.fintNotificationType == null : this.fintNotificationType.equals(that.fintNotificationType));
    equal = equal && (this.fblnInteractive == null ? that.fblnInteractive == null : this.fblnInteractive.equals(that.fblnInteractive));
    equal = equal && (this.flngWeight == null ? that.flngWeight == null : this.flngWeight.equals(that.flngWeight));
    equal = equal && (this.flngReminderDelay == null ? that.flngReminderDelay == null : this.flngReminderDelay.equals(that.flngReminderDelay));
    equal = equal && (this.fstrUnitType == null ? that.fstrUnitType == null : this.fstrUnitType.equals(that.fstrUnitType));
    equal = equal && (this.fdtmCommence == null ? that.fdtmCommence == null : this.fdtmCommence.equals(that.fdtmCommence));
    equal = equal && (this.fdtmCease == null ? that.fdtmCease == null : this.fdtmCease.equals(that.fdtmCease));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngQueueKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngQueueId = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngOrder = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fstrName = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrOwner = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrDescription = JdbcWritableBridge.readString(8, __dbResults);
    this.flngCrmKey = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fintNotificationType = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fblnInteractive = JdbcWritableBridge.readInteger(11, __dbResults);
    this.flngWeight = JdbcWritableBridge.readInteger(12, __dbResults);
    this.flngReminderDelay = JdbcWritableBridge.readInteger(13, __dbResults);
    this.fstrUnitType = JdbcWritableBridge.readString(14, __dbResults);
    this.fdtmCommence = JdbcWritableBridge.readTimestamp(15, __dbResults);
    this.fdtmCease = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(18, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(19, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngQueueKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngQueueId = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngOrder = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fstrName = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrOwner = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrDescription = JdbcWritableBridge.readString(8, __dbResults);
    this.flngCrmKey = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fintNotificationType = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fblnInteractive = JdbcWritableBridge.readInteger(11, __dbResults);
    this.flngWeight = JdbcWritableBridge.readInteger(12, __dbResults);
    this.flngReminderDelay = JdbcWritableBridge.readInteger(13, __dbResults);
    this.fstrUnitType = JdbcWritableBridge.readString(14, __dbResults);
    this.fdtmCommence = JdbcWritableBridge.readTimestamp(15, __dbResults);
    this.fdtmCease = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(18, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(19, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngQueueKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngQueueId, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngOrder, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrName, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOwner, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDescription, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCrmKey, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintNotificationType, 10 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnInteractive, 11 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(flngWeight, 12 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngReminderDelay, 13 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrUnitType, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCommence, 15 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCease, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 17 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 19 + __off, 93, __dbStmt);
    return 19;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngQueueKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngQueueId, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngOrder, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrName, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOwner, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDescription, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCrmKey, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintNotificationType, 10 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnInteractive, 11 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(flngWeight, 12 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngReminderDelay, 13 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrUnitType, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCommence, 15 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCease, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 17 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 19 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
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
        this.flngQueueId = null;
    } else {
    this.flngQueueId = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngOrder = null;
    } else {
    this.flngOrder = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrName = null;
    } else {
    this.fstrName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrOwner = null;
    } else {
    this.fstrOwner = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDescription = null;
    } else {
    this.fstrDescription = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngCrmKey = null;
    } else {
    this.flngCrmKey = Integer.valueOf(__dataIn.readInt());
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
        this.flngWeight = null;
    } else {
    this.flngWeight = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngReminderDelay = null;
    } else {
    this.flngReminderDelay = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrUnitType = null;
    } else {
    this.fstrUnitType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmCommence = null;
    } else {
    this.fdtmCommence = new Timestamp(__dataIn.readLong());
    this.fdtmCommence.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmCease = null;
    } else {
    this.fdtmCease = new Timestamp(__dataIn.readLong());
    this.fdtmCease.setNanos(__dataIn.readInt());
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
    if (null == this.flngQueueId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngQueueId);
    }
    if (null == this.flngOrder) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngOrder);
    }
    if (null == this.fstrName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrName);
    }
    if (null == this.fstrOwner) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOwner);
    }
    if (null == this.fstrDescription) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDescription);
    }
    if (null == this.flngCrmKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCrmKey);
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
    if (null == this.flngWeight) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngWeight);
    }
    if (null == this.flngReminderDelay) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngReminderDelay);
    }
    if (null == this.fstrUnitType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrUnitType);
    }
    if (null == this.fdtmCommence) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCommence.getTime());
    __dataOut.writeInt(this.fdtmCommence.getNanos());
    }
    if (null == this.fdtmCease) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCease.getTime());
    __dataOut.writeInt(this.fdtmCease.getNanos());
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
    if (null == this.flngQueueId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngQueueId);
    }
    if (null == this.flngOrder) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngOrder);
    }
    if (null == this.fstrName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrName);
    }
    if (null == this.fstrOwner) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOwner);
    }
    if (null == this.fstrDescription) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDescription);
    }
    if (null == this.flngCrmKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCrmKey);
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
    if (null == this.flngWeight) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngWeight);
    }
    if (null == this.flngReminderDelay) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngReminderDelay);
    }
    if (null == this.fstrUnitType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrUnitType);
    }
    if (null == this.fdtmCommence) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCommence.getTime());
    __dataOut.writeInt(this.fdtmCommence.getNanos());
    }
    if (null == this.fdtmCease) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCease.getTime());
    __dataOut.writeInt(this.fdtmCease.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngQueueKey==null?"\\N":"" + flngQueueKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngQueueId==null?"\\N":"" + flngQueueId, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngOrder==null?"\\N":"" + flngOrder, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrName==null?"\\N":fstrName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOwner==null?"\\N":fstrOwner, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDescription==null?"\\N":fstrDescription, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCrmKey==null?"\\N":"" + flngCrmKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintNotificationType==null?"\\N":"" + fintNotificationType, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnInteractive==null?"\\N":"" + fblnInteractive, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngWeight==null?"\\N":"" + flngWeight, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngReminderDelay==null?"\\N":"" + flngReminderDelay, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrUnitType==null?"\\N":fstrUnitType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCommence==null?"\\N":"" + fdtmCommence, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCease==null?"\\N":"" + fdtmCease, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngQueueKey==null?"\\N":"" + flngQueueKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngQueueId==null?"\\N":"" + flngQueueId, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngOrder==null?"\\N":"" + flngOrder, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrName==null?"\\N":fstrName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOwner==null?"\\N":fstrOwner, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDescription==null?"\\N":fstrDescription, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCrmKey==null?"\\N":"" + flngCrmKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintNotificationType==null?"\\N":"" + fintNotificationType, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnInteractive==null?"\\N":"" + fblnInteractive, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngWeight==null?"\\N":"" + flngWeight, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngReminderDelay==null?"\\N":"" + flngReminderDelay, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrUnitType==null?"\\N":fstrUnitType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCommence==null?"\\N":"" + fdtmCommence, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCease==null?"\\N":"" + fdtmCease, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngQueueId = null; } else {
      this.flngQueueId = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrName = null; } else {
      this.fstrName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOwner = null; } else {
      this.fstrOwner = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDescription = null; } else {
      this.fstrDescription = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCrmKey = null; } else {
      this.flngCrmKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngWeight = null; } else {
      this.flngWeight = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngReminderDelay = null; } else {
      this.flngReminderDelay = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrUnitType = null; } else {
      this.fstrUnitType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCommence = null; } else {
      this.fdtmCommence = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCease = null; } else {
      this.fdtmCease = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngQueueId = null; } else {
      this.flngQueueId = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrName = null; } else {
      this.fstrName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOwner = null; } else {
      this.fstrOwner = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDescription = null; } else {
      this.fstrDescription = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCrmKey = null; } else {
      this.flngCrmKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngWeight = null; } else {
      this.flngWeight = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngReminderDelay = null; } else {
      this.flngReminderDelay = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrUnitType = null; } else {
      this.fstrUnitType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCommence = null; } else {
      this.fdtmCommence = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCease = null; } else {
      this.fdtmCease = java.sql.Timestamp.valueOf(__cur_str);
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
    tbltaskqueue o = (tbltaskqueue) super.clone();
    o.fdtmCommence = (o.fdtmCommence != null) ? (java.sql.Timestamp) o.fdtmCommence.clone() : null;
    o.fdtmCease = (o.fdtmCease != null) ? (java.sql.Timestamp) o.fdtmCease.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tbltaskqueue o) throws CloneNotSupportedException {
    o.fdtmCommence = (o.fdtmCommence != null) ? (java.sql.Timestamp) o.fdtmCommence.clone() : null;
    o.fdtmCease = (o.fdtmCease != null) ? (java.sql.Timestamp) o.fdtmCease.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngQueueKey", this.flngQueueKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngQueueId", this.flngQueueId);
    __sqoop$field_map.put("flngOrder", this.flngOrder);
    __sqoop$field_map.put("fstrName", this.fstrName);
    __sqoop$field_map.put("fstrOwner", this.fstrOwner);
    __sqoop$field_map.put("fstrDescription", this.fstrDescription);
    __sqoop$field_map.put("flngCrmKey", this.flngCrmKey);
    __sqoop$field_map.put("fintNotificationType", this.fintNotificationType);
    __sqoop$field_map.put("fblnInteractive", this.fblnInteractive);
    __sqoop$field_map.put("flngWeight", this.flngWeight);
    __sqoop$field_map.put("flngReminderDelay", this.flngReminderDelay);
    __sqoop$field_map.put("fstrUnitType", this.fstrUnitType);
    __sqoop$field_map.put("fdtmCommence", this.fdtmCommence);
    __sqoop$field_map.put("fdtmCease", this.fdtmCease);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngQueueKey", this.flngQueueKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngQueueId", this.flngQueueId);
    __sqoop$field_map.put("flngOrder", this.flngOrder);
    __sqoop$field_map.put("fstrName", this.fstrName);
    __sqoop$field_map.put("fstrOwner", this.fstrOwner);
    __sqoop$field_map.put("fstrDescription", this.fstrDescription);
    __sqoop$field_map.put("flngCrmKey", this.flngCrmKey);
    __sqoop$field_map.put("fintNotificationType", this.fintNotificationType);
    __sqoop$field_map.put("fblnInteractive", this.fblnInteractive);
    __sqoop$field_map.put("flngWeight", this.flngWeight);
    __sqoop$field_map.put("flngReminderDelay", this.flngReminderDelay);
    __sqoop$field_map.put("fstrUnitType", this.fstrUnitType);
    __sqoop$field_map.put("fdtmCommence", this.fdtmCommence);
    __sqoop$field_map.put("fdtmCease", this.fdtmCease);
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
