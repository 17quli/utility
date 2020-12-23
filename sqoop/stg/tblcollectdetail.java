// ORM class for table 'tblcollectdetail'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 04:36:15 NZDT 2020
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

public class tblcollectdetail extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngCollectKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectdetail.this.flngCollectKey = (Integer)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectdetail.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectdetail.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("fdtmWorkDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectdetail.this.fdtmWorkDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmWorkDateTime", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectdetail.this.fdtmWorkDateTime = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmCreationDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectdetail.this.fdtmCreationDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmClosedDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectdetail.this.fdtmClosedDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fblnAutomated", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectdetail.this.fblnAutomated = (Integer)value;
      }
    });
    setters.put("fdtmNextStage", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectdetail.this.fdtmNextStage = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrStageFlow", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectdetail.this.fstrStageFlow = (String)value;
      }
    });
    setters.put("fstrStage", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectdetail.this.fstrStage = (String)value;
      }
    });
    setters.put("fstrOwner", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectdetail.this.fstrOwner = (String)value;
      }
    });
    setters.put("flngRisk", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectdetail.this.flngRisk = (Integer)value;
      }
    });
    setters.put("fstrCollectType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectdetail.this.fstrCollectType = (String)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectdetail.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectdetail.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblcollectdetail() {
    init0();
  }
  private Integer flngCollectKey;
  public Integer get_flngCollectKey() {
    return flngCollectKey;
  }
  public void set_flngCollectKey(Integer flngCollectKey) {
    this.flngCollectKey = flngCollectKey;
  }
  public tblcollectdetail with_flngCollectKey(Integer flngCollectKey) {
    this.flngCollectKey = flngCollectKey;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblcollectdetail with_flngVer(Integer flngVer) {
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
  public tblcollectdetail with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private java.sql.Timestamp fdtmWorkDate;
  public java.sql.Timestamp get_fdtmWorkDate() {
    return fdtmWorkDate;
  }
  public void set_fdtmWorkDate(java.sql.Timestamp fdtmWorkDate) {
    this.fdtmWorkDate = fdtmWorkDate;
  }
  public tblcollectdetail with_fdtmWorkDate(java.sql.Timestamp fdtmWorkDate) {
    this.fdtmWorkDate = fdtmWorkDate;
    return this;
  }
  private java.sql.Timestamp fdtmWorkDateTime;
  public java.sql.Timestamp get_fdtmWorkDateTime() {
    return fdtmWorkDateTime;
  }
  public void set_fdtmWorkDateTime(java.sql.Timestamp fdtmWorkDateTime) {
    this.fdtmWorkDateTime = fdtmWorkDateTime;
  }
  public tblcollectdetail with_fdtmWorkDateTime(java.sql.Timestamp fdtmWorkDateTime) {
    this.fdtmWorkDateTime = fdtmWorkDateTime;
    return this;
  }
  private java.sql.Timestamp fdtmCreationDate;
  public java.sql.Timestamp get_fdtmCreationDate() {
    return fdtmCreationDate;
  }
  public void set_fdtmCreationDate(java.sql.Timestamp fdtmCreationDate) {
    this.fdtmCreationDate = fdtmCreationDate;
  }
  public tblcollectdetail with_fdtmCreationDate(java.sql.Timestamp fdtmCreationDate) {
    this.fdtmCreationDate = fdtmCreationDate;
    return this;
  }
  private java.sql.Timestamp fdtmClosedDate;
  public java.sql.Timestamp get_fdtmClosedDate() {
    return fdtmClosedDate;
  }
  public void set_fdtmClosedDate(java.sql.Timestamp fdtmClosedDate) {
    this.fdtmClosedDate = fdtmClosedDate;
  }
  public tblcollectdetail with_fdtmClosedDate(java.sql.Timestamp fdtmClosedDate) {
    this.fdtmClosedDate = fdtmClosedDate;
    return this;
  }
  private Integer fblnAutomated;
  public Integer get_fblnAutomated() {
    return fblnAutomated;
  }
  public void set_fblnAutomated(Integer fblnAutomated) {
    this.fblnAutomated = fblnAutomated;
  }
  public tblcollectdetail with_fblnAutomated(Integer fblnAutomated) {
    this.fblnAutomated = fblnAutomated;
    return this;
  }
  private java.sql.Timestamp fdtmNextStage;
  public java.sql.Timestamp get_fdtmNextStage() {
    return fdtmNextStage;
  }
  public void set_fdtmNextStage(java.sql.Timestamp fdtmNextStage) {
    this.fdtmNextStage = fdtmNextStage;
  }
  public tblcollectdetail with_fdtmNextStage(java.sql.Timestamp fdtmNextStage) {
    this.fdtmNextStage = fdtmNextStage;
    return this;
  }
  private String fstrStageFlow;
  public String get_fstrStageFlow() {
    return fstrStageFlow;
  }
  public void set_fstrStageFlow(String fstrStageFlow) {
    this.fstrStageFlow = fstrStageFlow;
  }
  public tblcollectdetail with_fstrStageFlow(String fstrStageFlow) {
    this.fstrStageFlow = fstrStageFlow;
    return this;
  }
  private String fstrStage;
  public String get_fstrStage() {
    return fstrStage;
  }
  public void set_fstrStage(String fstrStage) {
    this.fstrStage = fstrStage;
  }
  public tblcollectdetail with_fstrStage(String fstrStage) {
    this.fstrStage = fstrStage;
    return this;
  }
  private String fstrOwner;
  public String get_fstrOwner() {
    return fstrOwner;
  }
  public void set_fstrOwner(String fstrOwner) {
    this.fstrOwner = fstrOwner;
  }
  public tblcollectdetail with_fstrOwner(String fstrOwner) {
    this.fstrOwner = fstrOwner;
    return this;
  }
  private Integer flngRisk;
  public Integer get_flngRisk() {
    return flngRisk;
  }
  public void set_flngRisk(Integer flngRisk) {
    this.flngRisk = flngRisk;
  }
  public tblcollectdetail with_flngRisk(Integer flngRisk) {
    this.flngRisk = flngRisk;
    return this;
  }
  private String fstrCollectType;
  public String get_fstrCollectType() {
    return fstrCollectType;
  }
  public void set_fstrCollectType(String fstrCollectType) {
    this.fstrCollectType = fstrCollectType;
  }
  public tblcollectdetail with_fstrCollectType(String fstrCollectType) {
    this.fstrCollectType = fstrCollectType;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblcollectdetail with_fstrWho(String fstrWho) {
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
  public tblcollectdetail with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblcollectdetail)) {
      return false;
    }
    tblcollectdetail that = (tblcollectdetail) o;
    boolean equal = true;
    equal = equal && (this.flngCollectKey == null ? that.flngCollectKey == null : this.flngCollectKey.equals(that.flngCollectKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fdtmWorkDate == null ? that.fdtmWorkDate == null : this.fdtmWorkDate.equals(that.fdtmWorkDate));
    equal = equal && (this.fdtmWorkDateTime == null ? that.fdtmWorkDateTime == null : this.fdtmWorkDateTime.equals(that.fdtmWorkDateTime));
    equal = equal && (this.fdtmCreationDate == null ? that.fdtmCreationDate == null : this.fdtmCreationDate.equals(that.fdtmCreationDate));
    equal = equal && (this.fdtmClosedDate == null ? that.fdtmClosedDate == null : this.fdtmClosedDate.equals(that.fdtmClosedDate));
    equal = equal && (this.fblnAutomated == null ? that.fblnAutomated == null : this.fblnAutomated.equals(that.fblnAutomated));
    equal = equal && (this.fdtmNextStage == null ? that.fdtmNextStage == null : this.fdtmNextStage.equals(that.fdtmNextStage));
    equal = equal && (this.fstrStageFlow == null ? that.fstrStageFlow == null : this.fstrStageFlow.equals(that.fstrStageFlow));
    equal = equal && (this.fstrStage == null ? that.fstrStage == null : this.fstrStage.equals(that.fstrStage));
    equal = equal && (this.fstrOwner == null ? that.fstrOwner == null : this.fstrOwner.equals(that.fstrOwner));
    equal = equal && (this.flngRisk == null ? that.flngRisk == null : this.flngRisk.equals(that.flngRisk));
    equal = equal && (this.fstrCollectType == null ? that.fstrCollectType == null : this.fstrCollectType.equals(that.fstrCollectType));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblcollectdetail)) {
      return false;
    }
    tblcollectdetail that = (tblcollectdetail) o;
    boolean equal = true;
    equal = equal && (this.flngCollectKey == null ? that.flngCollectKey == null : this.flngCollectKey.equals(that.flngCollectKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fdtmWorkDate == null ? that.fdtmWorkDate == null : this.fdtmWorkDate.equals(that.fdtmWorkDate));
    equal = equal && (this.fdtmWorkDateTime == null ? that.fdtmWorkDateTime == null : this.fdtmWorkDateTime.equals(that.fdtmWorkDateTime));
    equal = equal && (this.fdtmCreationDate == null ? that.fdtmCreationDate == null : this.fdtmCreationDate.equals(that.fdtmCreationDate));
    equal = equal && (this.fdtmClosedDate == null ? that.fdtmClosedDate == null : this.fdtmClosedDate.equals(that.fdtmClosedDate));
    equal = equal && (this.fblnAutomated == null ? that.fblnAutomated == null : this.fblnAutomated.equals(that.fblnAutomated));
    equal = equal && (this.fdtmNextStage == null ? that.fdtmNextStage == null : this.fdtmNextStage.equals(that.fdtmNextStage));
    equal = equal && (this.fstrStageFlow == null ? that.fstrStageFlow == null : this.fstrStageFlow.equals(that.fstrStageFlow));
    equal = equal && (this.fstrStage == null ? that.fstrStage == null : this.fstrStage.equals(that.fstrStage));
    equal = equal && (this.fstrOwner == null ? that.fstrOwner == null : this.fstrOwner.equals(that.fstrOwner));
    equal = equal && (this.flngRisk == null ? that.flngRisk == null : this.flngRisk.equals(that.flngRisk));
    equal = equal && (this.fstrCollectType == null ? that.fstrCollectType == null : this.fstrCollectType.equals(that.fstrCollectType));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngCollectKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fdtmWorkDate = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.fdtmWorkDateTime = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.fdtmCreationDate = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.fdtmClosedDate = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.fblnAutomated = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fdtmNextStage = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.fstrStageFlow = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrStage = JdbcWritableBridge.readString(11, __dbResults);
    this.fstrOwner = JdbcWritableBridge.readString(12, __dbResults);
    this.flngRisk = JdbcWritableBridge.readInteger(13, __dbResults);
    this.fstrCollectType = JdbcWritableBridge.readString(14, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(15, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(16, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngCollectKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fdtmWorkDate = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.fdtmWorkDateTime = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.fdtmCreationDate = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.fdtmClosedDate = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.fblnAutomated = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fdtmNextStage = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.fstrStageFlow = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrStage = JdbcWritableBridge.readString(11, __dbResults);
    this.fstrOwner = JdbcWritableBridge.readString(12, __dbResults);
    this.flngRisk = JdbcWritableBridge.readInteger(13, __dbResults);
    this.fstrCollectType = JdbcWritableBridge.readString(14, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(15, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(16, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngCollectKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWorkDate, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWorkDateTime, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCreationDate, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmClosedDate, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAutomated, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmNextStage, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrStageFlow, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrStage, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOwner, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngRisk, 13 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrCollectType, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 16 + __off, 93, __dbStmt);
    return 16;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngCollectKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWorkDate, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWorkDateTime, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCreationDate, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmClosedDate, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAutomated, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmNextStage, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrStageFlow, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrStage, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOwner, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngRisk, 13 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrCollectType, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 16 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngCollectKey = null;
    } else {
    this.flngCollectKey = Integer.valueOf(__dataIn.readInt());
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
        this.fdtmWorkDate = null;
    } else {
    this.fdtmWorkDate = new Timestamp(__dataIn.readLong());
    this.fdtmWorkDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmWorkDateTime = null;
    } else {
    this.fdtmWorkDateTime = new Timestamp(__dataIn.readLong());
    this.fdtmWorkDateTime.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmCreationDate = null;
    } else {
    this.fdtmCreationDate = new Timestamp(__dataIn.readLong());
    this.fdtmCreationDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmClosedDate = null;
    } else {
    this.fdtmClosedDate = new Timestamp(__dataIn.readLong());
    this.fdtmClosedDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnAutomated = null;
    } else {
    this.fblnAutomated = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmNextStage = null;
    } else {
    this.fdtmNextStage = new Timestamp(__dataIn.readLong());
    this.fdtmNextStage.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrStageFlow = null;
    } else {
    this.fstrStageFlow = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrStage = null;
    } else {
    this.fstrStage = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrOwner = null;
    } else {
    this.fstrOwner = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngRisk = null;
    } else {
    this.flngRisk = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCollectType = null;
    } else {
    this.fstrCollectType = Text.readString(__dataIn);
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
    if (null == this.flngCollectKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCollectKey);
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
    if (null == this.fdtmWorkDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmWorkDate.getTime());
    __dataOut.writeInt(this.fdtmWorkDate.getNanos());
    }
    if (null == this.fdtmWorkDateTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmWorkDateTime.getTime());
    __dataOut.writeInt(this.fdtmWorkDateTime.getNanos());
    }
    if (null == this.fdtmCreationDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCreationDate.getTime());
    __dataOut.writeInt(this.fdtmCreationDate.getNanos());
    }
    if (null == this.fdtmClosedDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmClosedDate.getTime());
    __dataOut.writeInt(this.fdtmClosedDate.getNanos());
    }
    if (null == this.fblnAutomated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAutomated);
    }
    if (null == this.fdtmNextStage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmNextStage.getTime());
    __dataOut.writeInt(this.fdtmNextStage.getNanos());
    }
    if (null == this.fstrStageFlow) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStageFlow);
    }
    if (null == this.fstrStage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStage);
    }
    if (null == this.fstrOwner) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOwner);
    }
    if (null == this.flngRisk) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngRisk);
    }
    if (null == this.fstrCollectType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCollectType);
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
    if (null == this.flngCollectKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCollectKey);
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
    if (null == this.fdtmWorkDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmWorkDate.getTime());
    __dataOut.writeInt(this.fdtmWorkDate.getNanos());
    }
    if (null == this.fdtmWorkDateTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmWorkDateTime.getTime());
    __dataOut.writeInt(this.fdtmWorkDateTime.getNanos());
    }
    if (null == this.fdtmCreationDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCreationDate.getTime());
    __dataOut.writeInt(this.fdtmCreationDate.getNanos());
    }
    if (null == this.fdtmClosedDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmClosedDate.getTime());
    __dataOut.writeInt(this.fdtmClosedDate.getNanos());
    }
    if (null == this.fblnAutomated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAutomated);
    }
    if (null == this.fdtmNextStage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmNextStage.getTime());
    __dataOut.writeInt(this.fdtmNextStage.getNanos());
    }
    if (null == this.fstrStageFlow) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStageFlow);
    }
    if (null == this.fstrStage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStage);
    }
    if (null == this.fstrOwner) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOwner);
    }
    if (null == this.flngRisk) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngRisk);
    }
    if (null == this.fstrCollectType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCollectType);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngCollectKey==null?"\\N":"" + flngCollectKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmWorkDate==null?"\\N":"" + fdtmWorkDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmWorkDateTime==null?"\\N":"" + fdtmWorkDateTime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCreationDate==null?"\\N":"" + fdtmCreationDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmClosedDate==null?"\\N":"" + fdtmClosedDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAutomated==null?"\\N":"" + fblnAutomated, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmNextStage==null?"\\N":"" + fdtmNextStage, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStageFlow==null?"\\N":fstrStageFlow, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStage==null?"\\N":fstrStage, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOwner==null?"\\N":fstrOwner, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngRisk==null?"\\N":"" + flngRisk, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCollectType==null?"\\N":fstrCollectType, " ", delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngCollectKey==null?"\\N":"" + flngCollectKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmWorkDate==null?"\\N":"" + fdtmWorkDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmWorkDateTime==null?"\\N":"" + fdtmWorkDateTime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCreationDate==null?"\\N":"" + fdtmCreationDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmClosedDate==null?"\\N":"" + fdtmClosedDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAutomated==null?"\\N":"" + fblnAutomated, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmNextStage==null?"\\N":"" + fdtmNextStage, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStageFlow==null?"\\N":fstrStageFlow, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStage==null?"\\N":fstrStage, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOwner==null?"\\N":fstrOwner, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngRisk==null?"\\N":"" + flngRisk, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCollectType==null?"\\N":fstrCollectType, " ", delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCollectKey = null; } else {
      this.flngCollectKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmWorkDate = null; } else {
      this.fdtmWorkDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmWorkDateTime = null; } else {
      this.fdtmWorkDateTime = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCreationDate = null; } else {
      this.fdtmCreationDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmClosedDate = null; } else {
      this.fdtmClosedDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAutomated = null; } else {
      this.fblnAutomated = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmNextStage = null; } else {
      this.fdtmNextStage = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrStageFlow = null; } else {
      this.fstrStageFlow = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrStage = null; } else {
      this.fstrStage = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngRisk = null; } else {
      this.flngRisk = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCollectType = null; } else {
      this.fstrCollectType = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCollectKey = null; } else {
      this.flngCollectKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmWorkDate = null; } else {
      this.fdtmWorkDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmWorkDateTime = null; } else {
      this.fdtmWorkDateTime = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCreationDate = null; } else {
      this.fdtmCreationDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmClosedDate = null; } else {
      this.fdtmClosedDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAutomated = null; } else {
      this.fblnAutomated = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmNextStage = null; } else {
      this.fdtmNextStage = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrStageFlow = null; } else {
      this.fstrStageFlow = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrStage = null; } else {
      this.fstrStage = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngRisk = null; } else {
      this.flngRisk = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCollectType = null; } else {
      this.fstrCollectType = __cur_str;
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
    tblcollectdetail o = (tblcollectdetail) super.clone();
    o.fdtmWorkDate = (o.fdtmWorkDate != null) ? (java.sql.Timestamp) o.fdtmWorkDate.clone() : null;
    o.fdtmWorkDateTime = (o.fdtmWorkDateTime != null) ? (java.sql.Timestamp) o.fdtmWorkDateTime.clone() : null;
    o.fdtmCreationDate = (o.fdtmCreationDate != null) ? (java.sql.Timestamp) o.fdtmCreationDate.clone() : null;
    o.fdtmClosedDate = (o.fdtmClosedDate != null) ? (java.sql.Timestamp) o.fdtmClosedDate.clone() : null;
    o.fdtmNextStage = (o.fdtmNextStage != null) ? (java.sql.Timestamp) o.fdtmNextStage.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblcollectdetail o) throws CloneNotSupportedException {
    o.fdtmWorkDate = (o.fdtmWorkDate != null) ? (java.sql.Timestamp) o.fdtmWorkDate.clone() : null;
    o.fdtmWorkDateTime = (o.fdtmWorkDateTime != null) ? (java.sql.Timestamp) o.fdtmWorkDateTime.clone() : null;
    o.fdtmCreationDate = (o.fdtmCreationDate != null) ? (java.sql.Timestamp) o.fdtmCreationDate.clone() : null;
    o.fdtmClosedDate = (o.fdtmClosedDate != null) ? (java.sql.Timestamp) o.fdtmClosedDate.clone() : null;
    o.fdtmNextStage = (o.fdtmNextStage != null) ? (java.sql.Timestamp) o.fdtmNextStage.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngCollectKey", this.flngCollectKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fdtmWorkDate", this.fdtmWorkDate);
    __sqoop$field_map.put("fdtmWorkDateTime", this.fdtmWorkDateTime);
    __sqoop$field_map.put("fdtmCreationDate", this.fdtmCreationDate);
    __sqoop$field_map.put("fdtmClosedDate", this.fdtmClosedDate);
    __sqoop$field_map.put("fblnAutomated", this.fblnAutomated);
    __sqoop$field_map.put("fdtmNextStage", this.fdtmNextStage);
    __sqoop$field_map.put("fstrStageFlow", this.fstrStageFlow);
    __sqoop$field_map.put("fstrStage", this.fstrStage);
    __sqoop$field_map.put("fstrOwner", this.fstrOwner);
    __sqoop$field_map.put("flngRisk", this.flngRisk);
    __sqoop$field_map.put("fstrCollectType", this.fstrCollectType);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngCollectKey", this.flngCollectKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fdtmWorkDate", this.fdtmWorkDate);
    __sqoop$field_map.put("fdtmWorkDateTime", this.fdtmWorkDateTime);
    __sqoop$field_map.put("fdtmCreationDate", this.fdtmCreationDate);
    __sqoop$field_map.put("fdtmClosedDate", this.fdtmClosedDate);
    __sqoop$field_map.put("fblnAutomated", this.fblnAutomated);
    __sqoop$field_map.put("fdtmNextStage", this.fdtmNextStage);
    __sqoop$field_map.put("fstrStageFlow", this.fstrStageFlow);
    __sqoop$field_map.put("fstrStage", this.fstrStage);
    __sqoop$field_map.put("fstrOwner", this.fstrOwner);
    __sqoop$field_map.put("flngRisk", this.flngRisk);
    __sqoop$field_map.put("fstrCollectType", this.fstrCollectType);
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
