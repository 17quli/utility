// ORM class for table 'tblauditgroupdetail'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 00:03:28 NZDT 2020
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

public class tblauditgroupdetail extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngAuditGroupKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditgroupdetail.this.flngAuditGroupKey = (Integer)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditgroupdetail.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditgroupdetail.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("fstrExternalId", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditgroupdetail.this.fstrExternalId = (String)value;
      }
    });
    setters.put("fstrAuditGroupStatus", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditgroupdetail.this.fstrAuditGroupStatus = (String)value;
      }
    });
    setters.put("fstrAuditGroupStage", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditgroupdetail.this.fstrAuditGroupStage = (String)value;
      }
    });
    setters.put("fstrAuditGroupProgram", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditgroupdetail.this.fstrAuditGroupProgram = (String)value;
      }
    });
    setters.put("fstrAuditGroupSource", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditgroupdetail.this.fstrAuditGroupSource = (String)value;
      }
    });
    setters.put("fblnOpen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditgroupdetail.this.fblnOpen = (Integer)value;
      }
    });
    setters.put("fstrManager", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditgroupdetail.this.fstrManager = (String)value;
      }
    });
    setters.put("fstrDescription", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditgroupdetail.this.fstrDescription = (String)value;
      }
    });
    setters.put("fdtmWorkDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditgroupdetail.this.fdtmWorkDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fblnActive", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditgroupdetail.this.fblnActive = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditgroupdetail.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditgroupdetail.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblauditgroupdetail() {
    init0();
  }
  private Integer flngAuditGroupKey;
  public Integer get_flngAuditGroupKey() {
    return flngAuditGroupKey;
  }
  public void set_flngAuditGroupKey(Integer flngAuditGroupKey) {
    this.flngAuditGroupKey = flngAuditGroupKey;
  }
  public tblauditgroupdetail with_flngAuditGroupKey(Integer flngAuditGroupKey) {
    this.flngAuditGroupKey = flngAuditGroupKey;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblauditgroupdetail with_flngVer(Integer flngVer) {
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
  public tblauditgroupdetail with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private String fstrExternalId;
  public String get_fstrExternalId() {
    return fstrExternalId;
  }
  public void set_fstrExternalId(String fstrExternalId) {
    this.fstrExternalId = fstrExternalId;
  }
  public tblauditgroupdetail with_fstrExternalId(String fstrExternalId) {
    this.fstrExternalId = fstrExternalId;
    return this;
  }
  private String fstrAuditGroupStatus;
  public String get_fstrAuditGroupStatus() {
    return fstrAuditGroupStatus;
  }
  public void set_fstrAuditGroupStatus(String fstrAuditGroupStatus) {
    this.fstrAuditGroupStatus = fstrAuditGroupStatus;
  }
  public tblauditgroupdetail with_fstrAuditGroupStatus(String fstrAuditGroupStatus) {
    this.fstrAuditGroupStatus = fstrAuditGroupStatus;
    return this;
  }
  private String fstrAuditGroupStage;
  public String get_fstrAuditGroupStage() {
    return fstrAuditGroupStage;
  }
  public void set_fstrAuditGroupStage(String fstrAuditGroupStage) {
    this.fstrAuditGroupStage = fstrAuditGroupStage;
  }
  public tblauditgroupdetail with_fstrAuditGroupStage(String fstrAuditGroupStage) {
    this.fstrAuditGroupStage = fstrAuditGroupStage;
    return this;
  }
  private String fstrAuditGroupProgram;
  public String get_fstrAuditGroupProgram() {
    return fstrAuditGroupProgram;
  }
  public void set_fstrAuditGroupProgram(String fstrAuditGroupProgram) {
    this.fstrAuditGroupProgram = fstrAuditGroupProgram;
  }
  public tblauditgroupdetail with_fstrAuditGroupProgram(String fstrAuditGroupProgram) {
    this.fstrAuditGroupProgram = fstrAuditGroupProgram;
    return this;
  }
  private String fstrAuditGroupSource;
  public String get_fstrAuditGroupSource() {
    return fstrAuditGroupSource;
  }
  public void set_fstrAuditGroupSource(String fstrAuditGroupSource) {
    this.fstrAuditGroupSource = fstrAuditGroupSource;
  }
  public tblauditgroupdetail with_fstrAuditGroupSource(String fstrAuditGroupSource) {
    this.fstrAuditGroupSource = fstrAuditGroupSource;
    return this;
  }
  private Integer fblnOpen;
  public Integer get_fblnOpen() {
    return fblnOpen;
  }
  public void set_fblnOpen(Integer fblnOpen) {
    this.fblnOpen = fblnOpen;
  }
  public tblauditgroupdetail with_fblnOpen(Integer fblnOpen) {
    this.fblnOpen = fblnOpen;
    return this;
  }
  private String fstrManager;
  public String get_fstrManager() {
    return fstrManager;
  }
  public void set_fstrManager(String fstrManager) {
    this.fstrManager = fstrManager;
  }
  public tblauditgroupdetail with_fstrManager(String fstrManager) {
    this.fstrManager = fstrManager;
    return this;
  }
  private String fstrDescription;
  public String get_fstrDescription() {
    return fstrDescription;
  }
  public void set_fstrDescription(String fstrDescription) {
    this.fstrDescription = fstrDescription;
  }
  public tblauditgroupdetail with_fstrDescription(String fstrDescription) {
    this.fstrDescription = fstrDescription;
    return this;
  }
  private java.sql.Timestamp fdtmWorkDate;
  public java.sql.Timestamp get_fdtmWorkDate() {
    return fdtmWorkDate;
  }
  public void set_fdtmWorkDate(java.sql.Timestamp fdtmWorkDate) {
    this.fdtmWorkDate = fdtmWorkDate;
  }
  public tblauditgroupdetail with_fdtmWorkDate(java.sql.Timestamp fdtmWorkDate) {
    this.fdtmWorkDate = fdtmWorkDate;
    return this;
  }
  private Integer fblnActive;
  public Integer get_fblnActive() {
    return fblnActive;
  }
  public void set_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
  }
  public tblauditgroupdetail with_fblnActive(Integer fblnActive) {
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
  public tblauditgroupdetail with_fstrWho(String fstrWho) {
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
  public tblauditgroupdetail with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblauditgroupdetail)) {
      return false;
    }
    tblauditgroupdetail that = (tblauditgroupdetail) o;
    boolean equal = true;
    equal = equal && (this.flngAuditGroupKey == null ? that.flngAuditGroupKey == null : this.flngAuditGroupKey.equals(that.flngAuditGroupKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fstrExternalId == null ? that.fstrExternalId == null : this.fstrExternalId.equals(that.fstrExternalId));
    equal = equal && (this.fstrAuditGroupStatus == null ? that.fstrAuditGroupStatus == null : this.fstrAuditGroupStatus.equals(that.fstrAuditGroupStatus));
    equal = equal && (this.fstrAuditGroupStage == null ? that.fstrAuditGroupStage == null : this.fstrAuditGroupStage.equals(that.fstrAuditGroupStage));
    equal = equal && (this.fstrAuditGroupProgram == null ? that.fstrAuditGroupProgram == null : this.fstrAuditGroupProgram.equals(that.fstrAuditGroupProgram));
    equal = equal && (this.fstrAuditGroupSource == null ? that.fstrAuditGroupSource == null : this.fstrAuditGroupSource.equals(that.fstrAuditGroupSource));
    equal = equal && (this.fblnOpen == null ? that.fblnOpen == null : this.fblnOpen.equals(that.fblnOpen));
    equal = equal && (this.fstrManager == null ? that.fstrManager == null : this.fstrManager.equals(that.fstrManager));
    equal = equal && (this.fstrDescription == null ? that.fstrDescription == null : this.fstrDescription.equals(that.fstrDescription));
    equal = equal && (this.fdtmWorkDate == null ? that.fdtmWorkDate == null : this.fdtmWorkDate.equals(that.fdtmWorkDate));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblauditgroupdetail)) {
      return false;
    }
    tblauditgroupdetail that = (tblauditgroupdetail) o;
    boolean equal = true;
    equal = equal && (this.flngAuditGroupKey == null ? that.flngAuditGroupKey == null : this.flngAuditGroupKey.equals(that.flngAuditGroupKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fstrExternalId == null ? that.fstrExternalId == null : this.fstrExternalId.equals(that.fstrExternalId));
    equal = equal && (this.fstrAuditGroupStatus == null ? that.fstrAuditGroupStatus == null : this.fstrAuditGroupStatus.equals(that.fstrAuditGroupStatus));
    equal = equal && (this.fstrAuditGroupStage == null ? that.fstrAuditGroupStage == null : this.fstrAuditGroupStage.equals(that.fstrAuditGroupStage));
    equal = equal && (this.fstrAuditGroupProgram == null ? that.fstrAuditGroupProgram == null : this.fstrAuditGroupProgram.equals(that.fstrAuditGroupProgram));
    equal = equal && (this.fstrAuditGroupSource == null ? that.fstrAuditGroupSource == null : this.fstrAuditGroupSource.equals(that.fstrAuditGroupSource));
    equal = equal && (this.fblnOpen == null ? that.fblnOpen == null : this.fblnOpen.equals(that.fblnOpen));
    equal = equal && (this.fstrManager == null ? that.fstrManager == null : this.fstrManager.equals(that.fstrManager));
    equal = equal && (this.fstrDescription == null ? that.fstrDescription == null : this.fstrDescription.equals(that.fstrDescription));
    equal = equal && (this.fdtmWorkDate == null ? that.fdtmWorkDate == null : this.fdtmWorkDate.equals(that.fdtmWorkDate));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngAuditGroupKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrExternalId = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrAuditGroupStatus = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrAuditGroupStage = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrAuditGroupProgram = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrAuditGroupSource = JdbcWritableBridge.readString(8, __dbResults);
    this.fblnOpen = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fstrManager = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrDescription = JdbcWritableBridge.readString(11, __dbResults);
    this.fdtmWorkDate = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(13, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(14, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(15, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngAuditGroupKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrExternalId = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrAuditGroupStatus = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrAuditGroupStage = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrAuditGroupProgram = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrAuditGroupSource = JdbcWritableBridge.readString(8, __dbResults);
    this.fblnOpen = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fstrManager = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrDescription = JdbcWritableBridge.readString(11, __dbResults);
    this.fdtmWorkDate = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(13, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngAuditGroupKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrExternalId, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAuditGroupStatus, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAuditGroupStage, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAuditGroupProgram, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAuditGroupSource, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnOpen, 9 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrManager, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDescription, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWorkDate, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 13 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 15 + __off, 93, __dbStmt);
    return 15;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngAuditGroupKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrExternalId, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAuditGroupStatus, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAuditGroupStage, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAuditGroupProgram, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAuditGroupSource, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnOpen, 9 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrManager, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDescription, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWorkDate, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 13 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 15 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngAuditGroupKey = null;
    } else {
    this.flngAuditGroupKey = Integer.valueOf(__dataIn.readInt());
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
        this.fstrExternalId = null;
    } else {
    this.fstrExternalId = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAuditGroupStatus = null;
    } else {
    this.fstrAuditGroupStatus = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAuditGroupStage = null;
    } else {
    this.fstrAuditGroupStage = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAuditGroupProgram = null;
    } else {
    this.fstrAuditGroupProgram = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAuditGroupSource = null;
    } else {
    this.fstrAuditGroupSource = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnOpen = null;
    } else {
    this.fblnOpen = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrManager = null;
    } else {
    this.fstrManager = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDescription = null;
    } else {
    this.fstrDescription = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmWorkDate = null;
    } else {
    this.fdtmWorkDate = new Timestamp(__dataIn.readLong());
    this.fdtmWorkDate.setNanos(__dataIn.readInt());
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
    if (null == this.flngAuditGroupKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAuditGroupKey);
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
    if (null == this.fstrExternalId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExternalId);
    }
    if (null == this.fstrAuditGroupStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAuditGroupStatus);
    }
    if (null == this.fstrAuditGroupStage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAuditGroupStage);
    }
    if (null == this.fstrAuditGroupProgram) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAuditGroupProgram);
    }
    if (null == this.fstrAuditGroupSource) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAuditGroupSource);
    }
    if (null == this.fblnOpen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnOpen);
    }
    if (null == this.fstrManager) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrManager);
    }
    if (null == this.fstrDescription) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDescription);
    }
    if (null == this.fdtmWorkDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmWorkDate.getTime());
    __dataOut.writeInt(this.fdtmWorkDate.getNanos());
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
    if (null == this.flngAuditGroupKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAuditGroupKey);
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
    if (null == this.fstrExternalId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExternalId);
    }
    if (null == this.fstrAuditGroupStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAuditGroupStatus);
    }
    if (null == this.fstrAuditGroupStage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAuditGroupStage);
    }
    if (null == this.fstrAuditGroupProgram) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAuditGroupProgram);
    }
    if (null == this.fstrAuditGroupSource) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAuditGroupSource);
    }
    if (null == this.fblnOpen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnOpen);
    }
    if (null == this.fstrManager) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrManager);
    }
    if (null == this.fstrDescription) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDescription);
    }
    if (null == this.fdtmWorkDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmWorkDate.getTime());
    __dataOut.writeInt(this.fdtmWorkDate.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngAuditGroupKey==null?"\\N":"" + flngAuditGroupKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExternalId==null?"\\N":fstrExternalId, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAuditGroupStatus==null?"\\N":fstrAuditGroupStatus, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAuditGroupStage==null?"\\N":fstrAuditGroupStage, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAuditGroupProgram==null?"\\N":fstrAuditGroupProgram, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAuditGroupSource==null?"\\N":fstrAuditGroupSource, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnOpen==null?"\\N":"" + fblnOpen, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrManager==null?"\\N":fstrManager, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDescription==null?"\\N":fstrDescription, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmWorkDate==null?"\\N":"" + fdtmWorkDate, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngAuditGroupKey==null?"\\N":"" + flngAuditGroupKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExternalId==null?"\\N":fstrExternalId, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAuditGroupStatus==null?"\\N":fstrAuditGroupStatus, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAuditGroupStage==null?"\\N":fstrAuditGroupStage, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAuditGroupProgram==null?"\\N":fstrAuditGroupProgram, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAuditGroupSource==null?"\\N":fstrAuditGroupSource, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnOpen==null?"\\N":"" + fblnOpen, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrManager==null?"\\N":fstrManager, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDescription==null?"\\N":fstrDescription, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmWorkDate==null?"\\N":"" + fdtmWorkDate, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAuditGroupKey = null; } else {
      this.flngAuditGroupKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrExternalId = null; } else {
      this.fstrExternalId = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAuditGroupStatus = null; } else {
      this.fstrAuditGroupStatus = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAuditGroupStage = null; } else {
      this.fstrAuditGroupStage = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAuditGroupProgram = null; } else {
      this.fstrAuditGroupProgram = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAuditGroupSource = null; } else {
      this.fstrAuditGroupSource = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnOpen = null; } else {
      this.fblnOpen = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrManager = null; } else {
      this.fstrManager = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmWorkDate = null; } else {
      this.fdtmWorkDate = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAuditGroupKey = null; } else {
      this.flngAuditGroupKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrExternalId = null; } else {
      this.fstrExternalId = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAuditGroupStatus = null; } else {
      this.fstrAuditGroupStatus = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAuditGroupStage = null; } else {
      this.fstrAuditGroupStage = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAuditGroupProgram = null; } else {
      this.fstrAuditGroupProgram = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAuditGroupSource = null; } else {
      this.fstrAuditGroupSource = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnOpen = null; } else {
      this.fblnOpen = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrManager = null; } else {
      this.fstrManager = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmWorkDate = null; } else {
      this.fdtmWorkDate = java.sql.Timestamp.valueOf(__cur_str);
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
    tblauditgroupdetail o = (tblauditgroupdetail) super.clone();
    o.fdtmWorkDate = (o.fdtmWorkDate != null) ? (java.sql.Timestamp) o.fdtmWorkDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblauditgroupdetail o) throws CloneNotSupportedException {
    o.fdtmWorkDate = (o.fdtmWorkDate != null) ? (java.sql.Timestamp) o.fdtmWorkDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngAuditGroupKey", this.flngAuditGroupKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fstrExternalId", this.fstrExternalId);
    __sqoop$field_map.put("fstrAuditGroupStatus", this.fstrAuditGroupStatus);
    __sqoop$field_map.put("fstrAuditGroupStage", this.fstrAuditGroupStage);
    __sqoop$field_map.put("fstrAuditGroupProgram", this.fstrAuditGroupProgram);
    __sqoop$field_map.put("fstrAuditGroupSource", this.fstrAuditGroupSource);
    __sqoop$field_map.put("fblnOpen", this.fblnOpen);
    __sqoop$field_map.put("fstrManager", this.fstrManager);
    __sqoop$field_map.put("fstrDescription", this.fstrDescription);
    __sqoop$field_map.put("fdtmWorkDate", this.fdtmWorkDate);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngAuditGroupKey", this.flngAuditGroupKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fstrExternalId", this.fstrExternalId);
    __sqoop$field_map.put("fstrAuditGroupStatus", this.fstrAuditGroupStatus);
    __sqoop$field_map.put("fstrAuditGroupStage", this.fstrAuditGroupStage);
    __sqoop$field_map.put("fstrAuditGroupProgram", this.fstrAuditGroupProgram);
    __sqoop$field_map.put("fstrAuditGroupSource", this.fstrAuditGroupSource);
    __sqoop$field_map.put("fblnOpen", this.fblnOpen);
    __sqoop$field_map.put("fstrManager", this.fstrManager);
    __sqoop$field_map.put("fstrDescription", this.fstrDescription);
    __sqoop$field_map.put("fdtmWorkDate", this.fdtmWorkDate);
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
