// ORM class for table 'tblitemassociation'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 06:08:20 NZDT 2020
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

public class tblitemassociation extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("fi64AssociationKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblitemassociation.this.fi64AssociationKey = (Long)value;
      }
    });
    setters.put("fintSequence", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblitemassociation.this.fintSequence = (Integer)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblitemassociation.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblitemassociation.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("fstrItemAssociationType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblitemassociation.this.fstrItemAssociationType = (String)value;
      }
    });
    setters.put("fstrSource", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblitemassociation.this.fstrSource = (String)value;
      }
    });
    setters.put("fi64SourceKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblitemassociation.this.fi64SourceKey = (Long)value;
      }
    });
    setters.put("fstrSourceType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblitemassociation.this.fstrSourceType = (String)value;
      }
    });
    setters.put("fstrSourceId", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblitemassociation.this.fstrSourceId = (String)value;
      }
    });
    setters.put("fstrDestination", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblitemassociation.this.fstrDestination = (String)value;
      }
    });
    setters.put("fi64Destinationkey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblitemassociation.this.fi64Destinationkey = (Long)value;
      }
    });
    setters.put("fstrDestinationType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblitemassociation.this.fstrDestinationType = (String)value;
      }
    });
    setters.put("fstrDestinationId", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblitemassociation.this.fstrDestinationId = (String)value;
      }
    });
    setters.put("fdtmCreated", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblitemassociation.this.fdtmCreated = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrCreatedBy", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblitemassociation.this.fstrCreatedBy = (String)value;
      }
    });
    setters.put("fdtmReversed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblitemassociation.this.fdtmReversed = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrReversedWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblitemassociation.this.fstrReversedWho = (String)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblitemassociation.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblitemassociation.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblitemassociation() {
    init0();
  }
  private Long fi64AssociationKey;
  public Long get_fi64AssociationKey() {
    return fi64AssociationKey;
  }
  public void set_fi64AssociationKey(Long fi64AssociationKey) {
    this.fi64AssociationKey = fi64AssociationKey;
  }
  public tblitemassociation with_fi64AssociationKey(Long fi64AssociationKey) {
    this.fi64AssociationKey = fi64AssociationKey;
    return this;
  }
  private Integer fintSequence;
  public Integer get_fintSequence() {
    return fintSequence;
  }
  public void set_fintSequence(Integer fintSequence) {
    this.fintSequence = fintSequence;
  }
  public tblitemassociation with_fintSequence(Integer fintSequence) {
    this.fintSequence = fintSequence;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblitemassociation with_flngVer(Integer flngVer) {
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
  public tblitemassociation with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private String fstrItemAssociationType;
  public String get_fstrItemAssociationType() {
    return fstrItemAssociationType;
  }
  public void set_fstrItemAssociationType(String fstrItemAssociationType) {
    this.fstrItemAssociationType = fstrItemAssociationType;
  }
  public tblitemassociation with_fstrItemAssociationType(String fstrItemAssociationType) {
    this.fstrItemAssociationType = fstrItemAssociationType;
    return this;
  }
  private String fstrSource;
  public String get_fstrSource() {
    return fstrSource;
  }
  public void set_fstrSource(String fstrSource) {
    this.fstrSource = fstrSource;
  }
  public tblitemassociation with_fstrSource(String fstrSource) {
    this.fstrSource = fstrSource;
    return this;
  }
  private Long fi64SourceKey;
  public Long get_fi64SourceKey() {
    return fi64SourceKey;
  }
  public void set_fi64SourceKey(Long fi64SourceKey) {
    this.fi64SourceKey = fi64SourceKey;
  }
  public tblitemassociation with_fi64SourceKey(Long fi64SourceKey) {
    this.fi64SourceKey = fi64SourceKey;
    return this;
  }
  private String fstrSourceType;
  public String get_fstrSourceType() {
    return fstrSourceType;
  }
  public void set_fstrSourceType(String fstrSourceType) {
    this.fstrSourceType = fstrSourceType;
  }
  public tblitemassociation with_fstrSourceType(String fstrSourceType) {
    this.fstrSourceType = fstrSourceType;
    return this;
  }
  private String fstrSourceId;
  public String get_fstrSourceId() {
    return fstrSourceId;
  }
  public void set_fstrSourceId(String fstrSourceId) {
    this.fstrSourceId = fstrSourceId;
  }
  public tblitemassociation with_fstrSourceId(String fstrSourceId) {
    this.fstrSourceId = fstrSourceId;
    return this;
  }
  private String fstrDestination;
  public String get_fstrDestination() {
    return fstrDestination;
  }
  public void set_fstrDestination(String fstrDestination) {
    this.fstrDestination = fstrDestination;
  }
  public tblitemassociation with_fstrDestination(String fstrDestination) {
    this.fstrDestination = fstrDestination;
    return this;
  }
  private Long fi64Destinationkey;
  public Long get_fi64Destinationkey() {
    return fi64Destinationkey;
  }
  public void set_fi64Destinationkey(Long fi64Destinationkey) {
    this.fi64Destinationkey = fi64Destinationkey;
  }
  public tblitemassociation with_fi64Destinationkey(Long fi64Destinationkey) {
    this.fi64Destinationkey = fi64Destinationkey;
    return this;
  }
  private String fstrDestinationType;
  public String get_fstrDestinationType() {
    return fstrDestinationType;
  }
  public void set_fstrDestinationType(String fstrDestinationType) {
    this.fstrDestinationType = fstrDestinationType;
  }
  public tblitemassociation with_fstrDestinationType(String fstrDestinationType) {
    this.fstrDestinationType = fstrDestinationType;
    return this;
  }
  private String fstrDestinationId;
  public String get_fstrDestinationId() {
    return fstrDestinationId;
  }
  public void set_fstrDestinationId(String fstrDestinationId) {
    this.fstrDestinationId = fstrDestinationId;
  }
  public tblitemassociation with_fstrDestinationId(String fstrDestinationId) {
    this.fstrDestinationId = fstrDestinationId;
    return this;
  }
  private java.sql.Timestamp fdtmCreated;
  public java.sql.Timestamp get_fdtmCreated() {
    return fdtmCreated;
  }
  public void set_fdtmCreated(java.sql.Timestamp fdtmCreated) {
    this.fdtmCreated = fdtmCreated;
  }
  public tblitemassociation with_fdtmCreated(java.sql.Timestamp fdtmCreated) {
    this.fdtmCreated = fdtmCreated;
    return this;
  }
  private String fstrCreatedBy;
  public String get_fstrCreatedBy() {
    return fstrCreatedBy;
  }
  public void set_fstrCreatedBy(String fstrCreatedBy) {
    this.fstrCreatedBy = fstrCreatedBy;
  }
  public tblitemassociation with_fstrCreatedBy(String fstrCreatedBy) {
    this.fstrCreatedBy = fstrCreatedBy;
    return this;
  }
  private java.sql.Timestamp fdtmReversed;
  public java.sql.Timestamp get_fdtmReversed() {
    return fdtmReversed;
  }
  public void set_fdtmReversed(java.sql.Timestamp fdtmReversed) {
    this.fdtmReversed = fdtmReversed;
  }
  public tblitemassociation with_fdtmReversed(java.sql.Timestamp fdtmReversed) {
    this.fdtmReversed = fdtmReversed;
    return this;
  }
  private String fstrReversedWho;
  public String get_fstrReversedWho() {
    return fstrReversedWho;
  }
  public void set_fstrReversedWho(String fstrReversedWho) {
    this.fstrReversedWho = fstrReversedWho;
  }
  public tblitemassociation with_fstrReversedWho(String fstrReversedWho) {
    this.fstrReversedWho = fstrReversedWho;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblitemassociation with_fstrWho(String fstrWho) {
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
  public tblitemassociation with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblitemassociation)) {
      return false;
    }
    tblitemassociation that = (tblitemassociation) o;
    boolean equal = true;
    equal = equal && (this.fi64AssociationKey == null ? that.fi64AssociationKey == null : this.fi64AssociationKey.equals(that.fi64AssociationKey));
    equal = equal && (this.fintSequence == null ? that.fintSequence == null : this.fintSequence.equals(that.fintSequence));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fstrItemAssociationType == null ? that.fstrItemAssociationType == null : this.fstrItemAssociationType.equals(that.fstrItemAssociationType));
    equal = equal && (this.fstrSource == null ? that.fstrSource == null : this.fstrSource.equals(that.fstrSource));
    equal = equal && (this.fi64SourceKey == null ? that.fi64SourceKey == null : this.fi64SourceKey.equals(that.fi64SourceKey));
    equal = equal && (this.fstrSourceType == null ? that.fstrSourceType == null : this.fstrSourceType.equals(that.fstrSourceType));
    equal = equal && (this.fstrSourceId == null ? that.fstrSourceId == null : this.fstrSourceId.equals(that.fstrSourceId));
    equal = equal && (this.fstrDestination == null ? that.fstrDestination == null : this.fstrDestination.equals(that.fstrDestination));
    equal = equal && (this.fi64Destinationkey == null ? that.fi64Destinationkey == null : this.fi64Destinationkey.equals(that.fi64Destinationkey));
    equal = equal && (this.fstrDestinationType == null ? that.fstrDestinationType == null : this.fstrDestinationType.equals(that.fstrDestinationType));
    equal = equal && (this.fstrDestinationId == null ? that.fstrDestinationId == null : this.fstrDestinationId.equals(that.fstrDestinationId));
    equal = equal && (this.fdtmCreated == null ? that.fdtmCreated == null : this.fdtmCreated.equals(that.fdtmCreated));
    equal = equal && (this.fstrCreatedBy == null ? that.fstrCreatedBy == null : this.fstrCreatedBy.equals(that.fstrCreatedBy));
    equal = equal && (this.fdtmReversed == null ? that.fdtmReversed == null : this.fdtmReversed.equals(that.fdtmReversed));
    equal = equal && (this.fstrReversedWho == null ? that.fstrReversedWho == null : this.fstrReversedWho.equals(that.fstrReversedWho));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblitemassociation)) {
      return false;
    }
    tblitemassociation that = (tblitemassociation) o;
    boolean equal = true;
    equal = equal && (this.fi64AssociationKey == null ? that.fi64AssociationKey == null : this.fi64AssociationKey.equals(that.fi64AssociationKey));
    equal = equal && (this.fintSequence == null ? that.fintSequence == null : this.fintSequence.equals(that.fintSequence));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fstrItemAssociationType == null ? that.fstrItemAssociationType == null : this.fstrItemAssociationType.equals(that.fstrItemAssociationType));
    equal = equal && (this.fstrSource == null ? that.fstrSource == null : this.fstrSource.equals(that.fstrSource));
    equal = equal && (this.fi64SourceKey == null ? that.fi64SourceKey == null : this.fi64SourceKey.equals(that.fi64SourceKey));
    equal = equal && (this.fstrSourceType == null ? that.fstrSourceType == null : this.fstrSourceType.equals(that.fstrSourceType));
    equal = equal && (this.fstrSourceId == null ? that.fstrSourceId == null : this.fstrSourceId.equals(that.fstrSourceId));
    equal = equal && (this.fstrDestination == null ? that.fstrDestination == null : this.fstrDestination.equals(that.fstrDestination));
    equal = equal && (this.fi64Destinationkey == null ? that.fi64Destinationkey == null : this.fi64Destinationkey.equals(that.fi64Destinationkey));
    equal = equal && (this.fstrDestinationType == null ? that.fstrDestinationType == null : this.fstrDestinationType.equals(that.fstrDestinationType));
    equal = equal && (this.fstrDestinationId == null ? that.fstrDestinationId == null : this.fstrDestinationId.equals(that.fstrDestinationId));
    equal = equal && (this.fdtmCreated == null ? that.fdtmCreated == null : this.fdtmCreated.equals(that.fdtmCreated));
    equal = equal && (this.fstrCreatedBy == null ? that.fstrCreatedBy == null : this.fstrCreatedBy.equals(that.fstrCreatedBy));
    equal = equal && (this.fdtmReversed == null ? that.fdtmReversed == null : this.fdtmReversed.equals(that.fdtmReversed));
    equal = equal && (this.fstrReversedWho == null ? that.fstrReversedWho == null : this.fstrReversedWho.equals(that.fstrReversedWho));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.fi64AssociationKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.fintSequence = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fstrItemAssociationType = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrSource = JdbcWritableBridge.readString(6, __dbResults);
    this.fi64SourceKey = JdbcWritableBridge.readLong(7, __dbResults);
    this.fstrSourceType = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrSourceId = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrDestination = JdbcWritableBridge.readString(10, __dbResults);
    this.fi64Destinationkey = JdbcWritableBridge.readLong(11, __dbResults);
    this.fstrDestinationType = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrDestinationId = JdbcWritableBridge.readString(13, __dbResults);
    this.fdtmCreated = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.fstrCreatedBy = JdbcWritableBridge.readString(15, __dbResults);
    this.fdtmReversed = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.fstrReversedWho = JdbcWritableBridge.readString(17, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(18, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(19, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.fi64AssociationKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.fintSequence = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fstrItemAssociationType = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrSource = JdbcWritableBridge.readString(6, __dbResults);
    this.fi64SourceKey = JdbcWritableBridge.readLong(7, __dbResults);
    this.fstrSourceType = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrSourceId = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrDestination = JdbcWritableBridge.readString(10, __dbResults);
    this.fi64Destinationkey = JdbcWritableBridge.readLong(11, __dbResults);
    this.fstrDestinationType = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrDestinationId = JdbcWritableBridge.readString(13, __dbResults);
    this.fdtmCreated = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.fstrCreatedBy = JdbcWritableBridge.readString(15, __dbResults);
    this.fdtmReversed = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.fstrReversedWho = JdbcWritableBridge.readString(17, __dbResults);
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
    JdbcWritableBridge.writeLong(fi64AssociationKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintSequence, 2 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrItemAssociationType, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSource, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeLong(fi64SourceKey, 7 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(fstrSourceType, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSourceId, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDestination, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeLong(fi64Destinationkey, 11 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(fstrDestinationType, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDestinationId, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCreated, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrCreatedBy, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReversed, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrReversedWho, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 19 + __off, 93, __dbStmt);
    return 19;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(fi64AssociationKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintSequence, 2 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrItemAssociationType, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSource, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeLong(fi64SourceKey, 7 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(fstrSourceType, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSourceId, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDestination, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeLong(fi64Destinationkey, 11 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(fstrDestinationType, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDestinationId, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCreated, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrCreatedBy, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReversed, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrReversedWho, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 19 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.fi64AssociationKey = null;
    } else {
    this.fi64AssociationKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.fintSequence = null;
    } else {
    this.fintSequence = Integer.valueOf(__dataIn.readInt());
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
        this.fstrItemAssociationType = null;
    } else {
    this.fstrItemAssociationType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSource = null;
    } else {
    this.fstrSource = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fi64SourceKey = null;
    } else {
    this.fi64SourceKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSourceType = null;
    } else {
    this.fstrSourceType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSourceId = null;
    } else {
    this.fstrSourceId = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDestination = null;
    } else {
    this.fstrDestination = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fi64Destinationkey = null;
    } else {
    this.fi64Destinationkey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDestinationType = null;
    } else {
    this.fstrDestinationType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDestinationId = null;
    } else {
    this.fstrDestinationId = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmCreated = null;
    } else {
    this.fdtmCreated = new Timestamp(__dataIn.readLong());
    this.fdtmCreated.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCreatedBy = null;
    } else {
    this.fstrCreatedBy = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmReversed = null;
    } else {
    this.fdtmReversed = new Timestamp(__dataIn.readLong());
    this.fdtmReversed.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrReversedWho = null;
    } else {
    this.fstrReversedWho = Text.readString(__dataIn);
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
    if (null == this.fi64AssociationKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64AssociationKey);
    }
    if (null == this.fintSequence) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintSequence);
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
    if (null == this.fstrItemAssociationType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrItemAssociationType);
    }
    if (null == this.fstrSource) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSource);
    }
    if (null == this.fi64SourceKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64SourceKey);
    }
    if (null == this.fstrSourceType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSourceType);
    }
    if (null == this.fstrSourceId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSourceId);
    }
    if (null == this.fstrDestination) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDestination);
    }
    if (null == this.fi64Destinationkey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64Destinationkey);
    }
    if (null == this.fstrDestinationType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDestinationType);
    }
    if (null == this.fstrDestinationId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDestinationId);
    }
    if (null == this.fdtmCreated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCreated.getTime());
    __dataOut.writeInt(this.fdtmCreated.getNanos());
    }
    if (null == this.fstrCreatedBy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCreatedBy);
    }
    if (null == this.fdtmReversed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReversed.getTime());
    __dataOut.writeInt(this.fdtmReversed.getNanos());
    }
    if (null == this.fstrReversedWho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrReversedWho);
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
    if (null == this.fi64AssociationKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64AssociationKey);
    }
    if (null == this.fintSequence) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintSequence);
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
    if (null == this.fstrItemAssociationType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrItemAssociationType);
    }
    if (null == this.fstrSource) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSource);
    }
    if (null == this.fi64SourceKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64SourceKey);
    }
    if (null == this.fstrSourceType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSourceType);
    }
    if (null == this.fstrSourceId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSourceId);
    }
    if (null == this.fstrDestination) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDestination);
    }
    if (null == this.fi64Destinationkey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64Destinationkey);
    }
    if (null == this.fstrDestinationType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDestinationType);
    }
    if (null == this.fstrDestinationId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDestinationId);
    }
    if (null == this.fdtmCreated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCreated.getTime());
    __dataOut.writeInt(this.fdtmCreated.getNanos());
    }
    if (null == this.fstrCreatedBy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCreatedBy);
    }
    if (null == this.fdtmReversed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReversed.getTime());
    __dataOut.writeInt(this.fdtmReversed.getNanos());
    }
    if (null == this.fstrReversedWho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrReversedWho);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64AssociationKey==null?"\\N":"" + fi64AssociationKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintSequence==null?"\\N":"" + fintSequence, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrItemAssociationType==null?"\\N":fstrItemAssociationType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSource==null?"\\N":fstrSource, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64SourceKey==null?"\\N":"" + fi64SourceKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSourceType==null?"\\N":fstrSourceType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSourceId==null?"\\N":fstrSourceId, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDestination==null?"\\N":fstrDestination, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64Destinationkey==null?"\\N":"" + fi64Destinationkey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDestinationType==null?"\\N":fstrDestinationType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDestinationId==null?"\\N":fstrDestinationId, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCreated==null?"\\N":"" + fdtmCreated, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCreatedBy==null?"\\N":fstrCreatedBy, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReversed==null?"\\N":"" + fdtmReversed, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrReversedWho==null?"\\N":fstrReversedWho, " ", delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64AssociationKey==null?"\\N":"" + fi64AssociationKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintSequence==null?"\\N":"" + fintSequence, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrItemAssociationType==null?"\\N":fstrItemAssociationType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSource==null?"\\N":fstrSource, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64SourceKey==null?"\\N":"" + fi64SourceKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSourceType==null?"\\N":fstrSourceType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSourceId==null?"\\N":fstrSourceId, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDestination==null?"\\N":fstrDestination, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64Destinationkey==null?"\\N":"" + fi64Destinationkey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDestinationType==null?"\\N":fstrDestinationType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDestinationId==null?"\\N":fstrDestinationId, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCreated==null?"\\N":"" + fdtmCreated, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCreatedBy==null?"\\N":fstrCreatedBy, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReversed==null?"\\N":"" + fdtmReversed, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrReversedWho==null?"\\N":fstrReversedWho, " ", delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64AssociationKey = null; } else {
      this.fi64AssociationKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintSequence = null; } else {
      this.fintSequence = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrItemAssociationType = null; } else {
      this.fstrItemAssociationType = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64SourceKey = null; } else {
      this.fi64SourceKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSourceType = null; } else {
      this.fstrSourceType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSourceId = null; } else {
      this.fstrSourceId = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDestination = null; } else {
      this.fstrDestination = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64Destinationkey = null; } else {
      this.fi64Destinationkey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDestinationType = null; } else {
      this.fstrDestinationType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDestinationId = null; } else {
      this.fstrDestinationId = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCreated = null; } else {
      this.fdtmCreated = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReversed = null; } else {
      this.fdtmReversed = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrReversedWho = null; } else {
      this.fstrReversedWho = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64AssociationKey = null; } else {
      this.fi64AssociationKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintSequence = null; } else {
      this.fintSequence = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrItemAssociationType = null; } else {
      this.fstrItemAssociationType = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64SourceKey = null; } else {
      this.fi64SourceKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSourceType = null; } else {
      this.fstrSourceType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSourceId = null; } else {
      this.fstrSourceId = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDestination = null; } else {
      this.fstrDestination = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64Destinationkey = null; } else {
      this.fi64Destinationkey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDestinationType = null; } else {
      this.fstrDestinationType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDestinationId = null; } else {
      this.fstrDestinationId = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCreated = null; } else {
      this.fdtmCreated = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReversed = null; } else {
      this.fdtmReversed = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrReversedWho = null; } else {
      this.fstrReversedWho = __cur_str;
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
    tblitemassociation o = (tblitemassociation) super.clone();
    o.fdtmCreated = (o.fdtmCreated != null) ? (java.sql.Timestamp) o.fdtmCreated.clone() : null;
    o.fdtmReversed = (o.fdtmReversed != null) ? (java.sql.Timestamp) o.fdtmReversed.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblitemassociation o) throws CloneNotSupportedException {
    o.fdtmCreated = (o.fdtmCreated != null) ? (java.sql.Timestamp) o.fdtmCreated.clone() : null;
    o.fdtmReversed = (o.fdtmReversed != null) ? (java.sql.Timestamp) o.fdtmReversed.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("fi64AssociationKey", this.fi64AssociationKey);
    __sqoop$field_map.put("fintSequence", this.fintSequence);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fstrItemAssociationType", this.fstrItemAssociationType);
    __sqoop$field_map.put("fstrSource", this.fstrSource);
    __sqoop$field_map.put("fi64SourceKey", this.fi64SourceKey);
    __sqoop$field_map.put("fstrSourceType", this.fstrSourceType);
    __sqoop$field_map.put("fstrSourceId", this.fstrSourceId);
    __sqoop$field_map.put("fstrDestination", this.fstrDestination);
    __sqoop$field_map.put("fi64Destinationkey", this.fi64Destinationkey);
    __sqoop$field_map.put("fstrDestinationType", this.fstrDestinationType);
    __sqoop$field_map.put("fstrDestinationId", this.fstrDestinationId);
    __sqoop$field_map.put("fdtmCreated", this.fdtmCreated);
    __sqoop$field_map.put("fstrCreatedBy", this.fstrCreatedBy);
    __sqoop$field_map.put("fdtmReversed", this.fdtmReversed);
    __sqoop$field_map.put("fstrReversedWho", this.fstrReversedWho);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("fi64AssociationKey", this.fi64AssociationKey);
    __sqoop$field_map.put("fintSequence", this.fintSequence);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fstrItemAssociationType", this.fstrItemAssociationType);
    __sqoop$field_map.put("fstrSource", this.fstrSource);
    __sqoop$field_map.put("fi64SourceKey", this.fi64SourceKey);
    __sqoop$field_map.put("fstrSourceType", this.fstrSourceType);
    __sqoop$field_map.put("fstrSourceId", this.fstrSourceId);
    __sqoop$field_map.put("fstrDestination", this.fstrDestination);
    __sqoop$field_map.put("fi64Destinationkey", this.fi64Destinationkey);
    __sqoop$field_map.put("fstrDestinationType", this.fstrDestinationType);
    __sqoop$field_map.put("fstrDestinationId", this.fstrDestinationId);
    __sqoop$field_map.put("fdtmCreated", this.fdtmCreated);
    __sqoop$field_map.put("fstrCreatedBy", this.fstrCreatedBy);
    __sqoop$field_map.put("fdtmReversed", this.fdtmReversed);
    __sqoop$field_map.put("fstrReversedWho", this.fstrReversedWho);
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
