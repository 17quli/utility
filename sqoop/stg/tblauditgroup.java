// ORM class for table 'tblauditgroup'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Dec 03 23:59:58 NZDT 2020
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

public class tblauditgroup extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngAuditGroupKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditgroup.this.flngAuditGroupKey = (Integer)value;
      }
    });
    setters.put("fstrAuditGroupId", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditgroup.this.fstrAuditGroupId = (String)value;
      }
    });
    setters.put("fstrAuditGroupType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditgroup.this.fstrAuditGroupType = (String)value;
      }
    });
    setters.put("flngCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditgroup.this.flngCustomerKey = (Integer)value;
      }
    });
    setters.put("flngFolderKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditgroup.this.flngFolderKey = (Integer)value;
      }
    });
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditgroup.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("flngTeamKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditgroup.this.flngTeamKey = (Integer)value;
      }
    });
    setters.put("fstrApprovedBy", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditgroup.this.fstrApprovedBy = (String)value;
      }
    });
    setters.put("fdtmApprovedWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditgroup.this.fdtmApprovedWhen = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmCreatedWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditgroup.this.fdtmCreatedWhen = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrCreatedBy", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditgroup.this.fstrCreatedBy = (String)value;
      }
    });
    setters.put("fdtmClosedWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditgroup.this.fdtmClosedWhen = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrClosedby", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditgroup.this.fstrClosedby = (String)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditgroup.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblauditgroup.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblauditgroup() {
    init0();
  }
  private Integer flngAuditGroupKey;
  public Integer get_flngAuditGroupKey() {
    return flngAuditGroupKey;
  }
  public void set_flngAuditGroupKey(Integer flngAuditGroupKey) {
    this.flngAuditGroupKey = flngAuditGroupKey;
  }
  public tblauditgroup with_flngAuditGroupKey(Integer flngAuditGroupKey) {
    this.flngAuditGroupKey = flngAuditGroupKey;
    return this;
  }
  private String fstrAuditGroupId;
  public String get_fstrAuditGroupId() {
    return fstrAuditGroupId;
  }
  public void set_fstrAuditGroupId(String fstrAuditGroupId) {
    this.fstrAuditGroupId = fstrAuditGroupId;
  }
  public tblauditgroup with_fstrAuditGroupId(String fstrAuditGroupId) {
    this.fstrAuditGroupId = fstrAuditGroupId;
    return this;
  }
  private String fstrAuditGroupType;
  public String get_fstrAuditGroupType() {
    return fstrAuditGroupType;
  }
  public void set_fstrAuditGroupType(String fstrAuditGroupType) {
    this.fstrAuditGroupType = fstrAuditGroupType;
  }
  public tblauditgroup with_fstrAuditGroupType(String fstrAuditGroupType) {
    this.fstrAuditGroupType = fstrAuditGroupType;
    return this;
  }
  private Integer flngCustomerKey;
  public Integer get_flngCustomerKey() {
    return flngCustomerKey;
  }
  public void set_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
  }
  public tblauditgroup with_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
    return this;
  }
  private Integer flngFolderKey;
  public Integer get_flngFolderKey() {
    return flngFolderKey;
  }
  public void set_flngFolderKey(Integer flngFolderKey) {
    this.flngFolderKey = flngFolderKey;
  }
  public tblauditgroup with_flngFolderKey(Integer flngFolderKey) {
    this.flngFolderKey = flngFolderKey;
    return this;
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblauditgroup with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private Integer flngTeamKey;
  public Integer get_flngTeamKey() {
    return flngTeamKey;
  }
  public void set_flngTeamKey(Integer flngTeamKey) {
    this.flngTeamKey = flngTeamKey;
  }
  public tblauditgroup with_flngTeamKey(Integer flngTeamKey) {
    this.flngTeamKey = flngTeamKey;
    return this;
  }
  private String fstrApprovedBy;
  public String get_fstrApprovedBy() {
    return fstrApprovedBy;
  }
  public void set_fstrApprovedBy(String fstrApprovedBy) {
    this.fstrApprovedBy = fstrApprovedBy;
  }
  public tblauditgroup with_fstrApprovedBy(String fstrApprovedBy) {
    this.fstrApprovedBy = fstrApprovedBy;
    return this;
  }
  private java.sql.Timestamp fdtmApprovedWhen;
  public java.sql.Timestamp get_fdtmApprovedWhen() {
    return fdtmApprovedWhen;
  }
  public void set_fdtmApprovedWhen(java.sql.Timestamp fdtmApprovedWhen) {
    this.fdtmApprovedWhen = fdtmApprovedWhen;
  }
  public tblauditgroup with_fdtmApprovedWhen(java.sql.Timestamp fdtmApprovedWhen) {
    this.fdtmApprovedWhen = fdtmApprovedWhen;
    return this;
  }
  private java.sql.Timestamp fdtmCreatedWhen;
  public java.sql.Timestamp get_fdtmCreatedWhen() {
    return fdtmCreatedWhen;
  }
  public void set_fdtmCreatedWhen(java.sql.Timestamp fdtmCreatedWhen) {
    this.fdtmCreatedWhen = fdtmCreatedWhen;
  }
  public tblauditgroup with_fdtmCreatedWhen(java.sql.Timestamp fdtmCreatedWhen) {
    this.fdtmCreatedWhen = fdtmCreatedWhen;
    return this;
  }
  private String fstrCreatedBy;
  public String get_fstrCreatedBy() {
    return fstrCreatedBy;
  }
  public void set_fstrCreatedBy(String fstrCreatedBy) {
    this.fstrCreatedBy = fstrCreatedBy;
  }
  public tblauditgroup with_fstrCreatedBy(String fstrCreatedBy) {
    this.fstrCreatedBy = fstrCreatedBy;
    return this;
  }
  private java.sql.Timestamp fdtmClosedWhen;
  public java.sql.Timestamp get_fdtmClosedWhen() {
    return fdtmClosedWhen;
  }
  public void set_fdtmClosedWhen(java.sql.Timestamp fdtmClosedWhen) {
    this.fdtmClosedWhen = fdtmClosedWhen;
  }
  public tblauditgroup with_fdtmClosedWhen(java.sql.Timestamp fdtmClosedWhen) {
    this.fdtmClosedWhen = fdtmClosedWhen;
    return this;
  }
  private String fstrClosedby;
  public String get_fstrClosedby() {
    return fstrClosedby;
  }
  public void set_fstrClosedby(String fstrClosedby) {
    this.fstrClosedby = fstrClosedby;
  }
  public tblauditgroup with_fstrClosedby(String fstrClosedby) {
    this.fstrClosedby = fstrClosedby;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblauditgroup with_fstrWho(String fstrWho) {
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
  public tblauditgroup with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblauditgroup)) {
      return false;
    }
    tblauditgroup that = (tblauditgroup) o;
    boolean equal = true;
    equal = equal && (this.flngAuditGroupKey == null ? that.flngAuditGroupKey == null : this.flngAuditGroupKey.equals(that.flngAuditGroupKey));
    equal = equal && (this.fstrAuditGroupId == null ? that.fstrAuditGroupId == null : this.fstrAuditGroupId.equals(that.fstrAuditGroupId));
    equal = equal && (this.fstrAuditGroupType == null ? that.fstrAuditGroupType == null : this.fstrAuditGroupType.equals(that.fstrAuditGroupType));
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.flngFolderKey == null ? that.flngFolderKey == null : this.flngFolderKey.equals(that.flngFolderKey));
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.flngTeamKey == null ? that.flngTeamKey == null : this.flngTeamKey.equals(that.flngTeamKey));
    equal = equal && (this.fstrApprovedBy == null ? that.fstrApprovedBy == null : this.fstrApprovedBy.equals(that.fstrApprovedBy));
    equal = equal && (this.fdtmApprovedWhen == null ? that.fdtmApprovedWhen == null : this.fdtmApprovedWhen.equals(that.fdtmApprovedWhen));
    equal = equal && (this.fdtmCreatedWhen == null ? that.fdtmCreatedWhen == null : this.fdtmCreatedWhen.equals(that.fdtmCreatedWhen));
    equal = equal && (this.fstrCreatedBy == null ? that.fstrCreatedBy == null : this.fstrCreatedBy.equals(that.fstrCreatedBy));
    equal = equal && (this.fdtmClosedWhen == null ? that.fdtmClosedWhen == null : this.fdtmClosedWhen.equals(that.fdtmClosedWhen));
    equal = equal && (this.fstrClosedby == null ? that.fstrClosedby == null : this.fstrClosedby.equals(that.fstrClosedby));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblauditgroup)) {
      return false;
    }
    tblauditgroup that = (tblauditgroup) o;
    boolean equal = true;
    equal = equal && (this.flngAuditGroupKey == null ? that.flngAuditGroupKey == null : this.flngAuditGroupKey.equals(that.flngAuditGroupKey));
    equal = equal && (this.fstrAuditGroupId == null ? that.fstrAuditGroupId == null : this.fstrAuditGroupId.equals(that.fstrAuditGroupId));
    equal = equal && (this.fstrAuditGroupType == null ? that.fstrAuditGroupType == null : this.fstrAuditGroupType.equals(that.fstrAuditGroupType));
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.flngFolderKey == null ? that.flngFolderKey == null : this.flngFolderKey.equals(that.flngFolderKey));
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.flngTeamKey == null ? that.flngTeamKey == null : this.flngTeamKey.equals(that.flngTeamKey));
    equal = equal && (this.fstrApprovedBy == null ? that.fstrApprovedBy == null : this.fstrApprovedBy.equals(that.fstrApprovedBy));
    equal = equal && (this.fdtmApprovedWhen == null ? that.fdtmApprovedWhen == null : this.fdtmApprovedWhen.equals(that.fdtmApprovedWhen));
    equal = equal && (this.fdtmCreatedWhen == null ? that.fdtmCreatedWhen == null : this.fdtmCreatedWhen.equals(that.fdtmCreatedWhen));
    equal = equal && (this.fstrCreatedBy == null ? that.fstrCreatedBy == null : this.fstrCreatedBy.equals(that.fstrCreatedBy));
    equal = equal && (this.fdtmClosedWhen == null ? that.fdtmClosedWhen == null : this.fdtmClosedWhen.equals(that.fdtmClosedWhen));
    equal = equal && (this.fstrClosedby == null ? that.fstrClosedby == null : this.fstrClosedby.equals(that.fstrClosedby));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngAuditGroupKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fstrAuditGroupId = JdbcWritableBridge.readString(2, __dbResults);
    this.fstrAuditGroupType = JdbcWritableBridge.readString(3, __dbResults);
    this.flngCustomerKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngFolderKey = JdbcWritableBridge.readInteger(5, __dbResults);
    this.flngDocKey = JdbcWritableBridge.readInteger(6, __dbResults);
    this.flngTeamKey = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fstrApprovedBy = JdbcWritableBridge.readString(8, __dbResults);
    this.fdtmApprovedWhen = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.fdtmCreatedWhen = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.fstrCreatedBy = JdbcWritableBridge.readString(11, __dbResults);
    this.fdtmClosedWhen = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.fstrClosedby = JdbcWritableBridge.readString(13, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(14, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(15, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngAuditGroupKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fstrAuditGroupId = JdbcWritableBridge.readString(2, __dbResults);
    this.fstrAuditGroupType = JdbcWritableBridge.readString(3, __dbResults);
    this.flngCustomerKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngFolderKey = JdbcWritableBridge.readInteger(5, __dbResults);
    this.flngDocKey = JdbcWritableBridge.readInteger(6, __dbResults);
    this.flngTeamKey = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fstrApprovedBy = JdbcWritableBridge.readString(8, __dbResults);
    this.fdtmApprovedWhen = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.fdtmCreatedWhen = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.fstrCreatedBy = JdbcWritableBridge.readString(11, __dbResults);
    this.fdtmClosedWhen = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.fstrClosedby = JdbcWritableBridge.readString(13, __dbResults);
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
    JdbcWritableBridge.writeString(fstrAuditGroupId, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAuditGroupType, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFolderKey, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDocKey, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngTeamKey, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrApprovedBy, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmApprovedWhen, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCreatedWhen, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrCreatedBy, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmClosedWhen, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrClosedby, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 15 + __off, 93, __dbStmt);
    return 15;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngAuditGroupKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrAuditGroupId, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAuditGroupType, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFolderKey, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDocKey, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngTeamKey, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrApprovedBy, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmApprovedWhen, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCreatedWhen, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrCreatedBy, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmClosedWhen, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrClosedby, 13 + __off, -9, __dbStmt);
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
        this.fstrAuditGroupId = null;
    } else {
    this.fstrAuditGroupId = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAuditGroupType = null;
    } else {
    this.fstrAuditGroupType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngCustomerKey = null;
    } else {
    this.flngCustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngFolderKey = null;
    } else {
    this.flngFolderKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngDocKey = null;
    } else {
    this.flngDocKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngTeamKey = null;
    } else {
    this.flngTeamKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrApprovedBy = null;
    } else {
    this.fstrApprovedBy = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmApprovedWhen = null;
    } else {
    this.fdtmApprovedWhen = new Timestamp(__dataIn.readLong());
    this.fdtmApprovedWhen.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmCreatedWhen = null;
    } else {
    this.fdtmCreatedWhen = new Timestamp(__dataIn.readLong());
    this.fdtmCreatedWhen.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCreatedBy = null;
    } else {
    this.fstrCreatedBy = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmClosedWhen = null;
    } else {
    this.fdtmClosedWhen = new Timestamp(__dataIn.readLong());
    this.fdtmClosedWhen.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrClosedby = null;
    } else {
    this.fstrClosedby = Text.readString(__dataIn);
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
    if (null == this.fstrAuditGroupId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAuditGroupId);
    }
    if (null == this.fstrAuditGroupType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAuditGroupType);
    }
    if (null == this.flngCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey);
    }
    if (null == this.flngFolderKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFolderKey);
    }
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.flngTeamKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTeamKey);
    }
    if (null == this.fstrApprovedBy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrApprovedBy);
    }
    if (null == this.fdtmApprovedWhen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmApprovedWhen.getTime());
    __dataOut.writeInt(this.fdtmApprovedWhen.getNanos());
    }
    if (null == this.fdtmCreatedWhen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCreatedWhen.getTime());
    __dataOut.writeInt(this.fdtmCreatedWhen.getNanos());
    }
    if (null == this.fstrCreatedBy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCreatedBy);
    }
    if (null == this.fdtmClosedWhen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmClosedWhen.getTime());
    __dataOut.writeInt(this.fdtmClosedWhen.getNanos());
    }
    if (null == this.fstrClosedby) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrClosedby);
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
    if (null == this.fstrAuditGroupId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAuditGroupId);
    }
    if (null == this.fstrAuditGroupType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAuditGroupType);
    }
    if (null == this.flngCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey);
    }
    if (null == this.flngFolderKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFolderKey);
    }
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.flngTeamKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTeamKey);
    }
    if (null == this.fstrApprovedBy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrApprovedBy);
    }
    if (null == this.fdtmApprovedWhen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmApprovedWhen.getTime());
    __dataOut.writeInt(this.fdtmApprovedWhen.getNanos());
    }
    if (null == this.fdtmCreatedWhen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCreatedWhen.getTime());
    __dataOut.writeInt(this.fdtmCreatedWhen.getNanos());
    }
    if (null == this.fstrCreatedBy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCreatedBy);
    }
    if (null == this.fdtmClosedWhen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmClosedWhen.getTime());
    __dataOut.writeInt(this.fdtmClosedWhen.getNanos());
    }
    if (null == this.fstrClosedby) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrClosedby);
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
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAuditGroupId==null?"\\N":fstrAuditGroupId, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAuditGroupType==null?"\\N":fstrAuditGroupType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFolderKey==null?"\\N":"" + flngFolderKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngTeamKey==null?"\\N":"" + flngTeamKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrApprovedBy==null?"\\N":fstrApprovedBy, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmApprovedWhen==null?"\\N":"" + fdtmApprovedWhen, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCreatedWhen==null?"\\N":"" + fdtmCreatedWhen, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCreatedBy==null?"\\N":fstrCreatedBy, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmClosedWhen==null?"\\N":"" + fdtmClosedWhen, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrClosedby==null?"\\N":fstrClosedby, " ", delimiters));
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
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAuditGroupId==null?"\\N":fstrAuditGroupId, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAuditGroupType==null?"\\N":fstrAuditGroupType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFolderKey==null?"\\N":"" + flngFolderKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngTeamKey==null?"\\N":"" + flngTeamKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrApprovedBy==null?"\\N":fstrApprovedBy, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmApprovedWhen==null?"\\N":"" + fdtmApprovedWhen, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCreatedWhen==null?"\\N":"" + fdtmCreatedWhen, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCreatedBy==null?"\\N":fstrCreatedBy, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmClosedWhen==null?"\\N":"" + fdtmClosedWhen, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrClosedby==null?"\\N":fstrClosedby, " ", delimiters));
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
    if (__cur_str.equals("null")) { this.fstrAuditGroupId = null; } else {
      this.fstrAuditGroupId = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAuditGroupType = null; } else {
      this.fstrAuditGroupType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCustomerKey = null; } else {
      this.flngCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFolderKey = null; } else {
      this.flngFolderKey = Integer.valueOf(__cur_str);
    }

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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTeamKey = null; } else {
      this.flngTeamKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrApprovedBy = null; } else {
      this.fstrApprovedBy = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmApprovedWhen = null; } else {
      this.fdtmApprovedWhen = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCreatedWhen = null; } else {
      this.fdtmCreatedWhen = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCreatedBy = null; } else {
      this.fstrCreatedBy = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmClosedWhen = null; } else {
      this.fdtmClosedWhen = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrClosedby = null; } else {
      this.fstrClosedby = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrAuditGroupId = null; } else {
      this.fstrAuditGroupId = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAuditGroupType = null; } else {
      this.fstrAuditGroupType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCustomerKey = null; } else {
      this.flngCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFolderKey = null; } else {
      this.flngFolderKey = Integer.valueOf(__cur_str);
    }

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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTeamKey = null; } else {
      this.flngTeamKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrApprovedBy = null; } else {
      this.fstrApprovedBy = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmApprovedWhen = null; } else {
      this.fdtmApprovedWhen = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCreatedWhen = null; } else {
      this.fdtmCreatedWhen = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCreatedBy = null; } else {
      this.fstrCreatedBy = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmClosedWhen = null; } else {
      this.fdtmClosedWhen = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrClosedby = null; } else {
      this.fstrClosedby = __cur_str;
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
    tblauditgroup o = (tblauditgroup) super.clone();
    o.fdtmApprovedWhen = (o.fdtmApprovedWhen != null) ? (java.sql.Timestamp) o.fdtmApprovedWhen.clone() : null;
    o.fdtmCreatedWhen = (o.fdtmCreatedWhen != null) ? (java.sql.Timestamp) o.fdtmCreatedWhen.clone() : null;
    o.fdtmClosedWhen = (o.fdtmClosedWhen != null) ? (java.sql.Timestamp) o.fdtmClosedWhen.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblauditgroup o) throws CloneNotSupportedException {
    o.fdtmApprovedWhen = (o.fdtmApprovedWhen != null) ? (java.sql.Timestamp) o.fdtmApprovedWhen.clone() : null;
    o.fdtmCreatedWhen = (o.fdtmCreatedWhen != null) ? (java.sql.Timestamp) o.fdtmCreatedWhen.clone() : null;
    o.fdtmClosedWhen = (o.fdtmClosedWhen != null) ? (java.sql.Timestamp) o.fdtmClosedWhen.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngAuditGroupKey", this.flngAuditGroupKey);
    __sqoop$field_map.put("fstrAuditGroupId", this.fstrAuditGroupId);
    __sqoop$field_map.put("fstrAuditGroupType", this.fstrAuditGroupType);
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("flngFolderKey", this.flngFolderKey);
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("flngTeamKey", this.flngTeamKey);
    __sqoop$field_map.put("fstrApprovedBy", this.fstrApprovedBy);
    __sqoop$field_map.put("fdtmApprovedWhen", this.fdtmApprovedWhen);
    __sqoop$field_map.put("fdtmCreatedWhen", this.fdtmCreatedWhen);
    __sqoop$field_map.put("fstrCreatedBy", this.fstrCreatedBy);
    __sqoop$field_map.put("fdtmClosedWhen", this.fdtmClosedWhen);
    __sqoop$field_map.put("fstrClosedby", this.fstrClosedby);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngAuditGroupKey", this.flngAuditGroupKey);
    __sqoop$field_map.put("fstrAuditGroupId", this.fstrAuditGroupId);
    __sqoop$field_map.put("fstrAuditGroupType", this.fstrAuditGroupType);
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("flngFolderKey", this.flngFolderKey);
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("flngTeamKey", this.flngTeamKey);
    __sqoop$field_map.put("fstrApprovedBy", this.fstrApprovedBy);
    __sqoop$field_map.put("fdtmApprovedWhen", this.fdtmApprovedWhen);
    __sqoop$field_map.put("fdtmCreatedWhen", this.fdtmCreatedWhen);
    __sqoop$field_map.put("fstrCreatedBy", this.fstrCreatedBy);
    __sqoop$field_map.put("fdtmClosedWhen", this.fdtmClosedWhen);
    __sqoop$field_map.put("fstrClosedby", this.fstrClosedby);
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
