// ORM class for table 'tbldocset'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 07:45:46 NZDT 2020
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

public class tbldocset extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("fi64DocSetKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbldocset.this.fi64DocSetKey = (Long)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbldocset.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbldocset.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("fstrDocSetType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbldocset.this.fstrDocSetType = (String)value;
      }
    });
    setters.put("fintDocSetVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbldocset.this.fintDocSetVer = (Integer)value;
      }
    });
    setters.put("fintVersion", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbldocset.this.fintVersion = (Integer)value;
      }
    });
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbldocset.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fstrDocType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbldocset.this.fstrDocType = (String)value;
      }
    });
    setters.put("fintDocVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbldocset.this.fintDocVer = (Integer)value;
      }
    });
    setters.put("fblnPreliminary", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbldocset.this.fblnPreliminary = (Integer)value;
      }
    });
    setters.put("flngCount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbldocset.this.flngCount = (Integer)value;
      }
    });
    setters.put("flngErrorCount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbldocset.this.flngErrorCount = (Integer)value;
      }
    });
    setters.put("flngWarningCount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbldocset.this.flngWarningCount = (Integer)value;
      }
    });
    setters.put("flngInformationCount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbldocset.this.flngInformationCount = (Integer)value;
      }
    });
    setters.put("fdtmReversed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbldocset.this.fdtmReversed = (java.sql.Timestamp)value;
      }
    });
    setters.put("fvntFieldShare", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbldocset.this.fvntFieldShare = (org.apache.hadoop.io.BytesWritable)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbldocset.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbldocset.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tbldocset() {
    init0();
  }
  private Long fi64DocSetKey;
  public Long get_fi64DocSetKey() {
    return fi64DocSetKey;
  }
  public void set_fi64DocSetKey(Long fi64DocSetKey) {
    this.fi64DocSetKey = fi64DocSetKey;
  }
  public tbldocset with_fi64DocSetKey(Long fi64DocSetKey) {
    this.fi64DocSetKey = fi64DocSetKey;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tbldocset with_flngVer(Integer flngVer) {
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
  public tbldocset with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private String fstrDocSetType;
  public String get_fstrDocSetType() {
    return fstrDocSetType;
  }
  public void set_fstrDocSetType(String fstrDocSetType) {
    this.fstrDocSetType = fstrDocSetType;
  }
  public tbldocset with_fstrDocSetType(String fstrDocSetType) {
    this.fstrDocSetType = fstrDocSetType;
    return this;
  }
  private Integer fintDocSetVer;
  public Integer get_fintDocSetVer() {
    return fintDocSetVer;
  }
  public void set_fintDocSetVer(Integer fintDocSetVer) {
    this.fintDocSetVer = fintDocSetVer;
  }
  public tbldocset with_fintDocSetVer(Integer fintDocSetVer) {
    this.fintDocSetVer = fintDocSetVer;
    return this;
  }
  private Integer fintVersion;
  public Integer get_fintVersion() {
    return fintVersion;
  }
  public void set_fintVersion(Integer fintVersion) {
    this.fintVersion = fintVersion;
  }
  public tbldocset with_fintVersion(Integer fintVersion) {
    this.fintVersion = fintVersion;
    return this;
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tbldocset with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private String fstrDocType;
  public String get_fstrDocType() {
    return fstrDocType;
  }
  public void set_fstrDocType(String fstrDocType) {
    this.fstrDocType = fstrDocType;
  }
  public tbldocset with_fstrDocType(String fstrDocType) {
    this.fstrDocType = fstrDocType;
    return this;
  }
  private Integer fintDocVer;
  public Integer get_fintDocVer() {
    return fintDocVer;
  }
  public void set_fintDocVer(Integer fintDocVer) {
    this.fintDocVer = fintDocVer;
  }
  public tbldocset with_fintDocVer(Integer fintDocVer) {
    this.fintDocVer = fintDocVer;
    return this;
  }
  private Integer fblnPreliminary;
  public Integer get_fblnPreliminary() {
    return fblnPreliminary;
  }
  public void set_fblnPreliminary(Integer fblnPreliminary) {
    this.fblnPreliminary = fblnPreliminary;
  }
  public tbldocset with_fblnPreliminary(Integer fblnPreliminary) {
    this.fblnPreliminary = fblnPreliminary;
    return this;
  }
  private Integer flngCount;
  public Integer get_flngCount() {
    return flngCount;
  }
  public void set_flngCount(Integer flngCount) {
    this.flngCount = flngCount;
  }
  public tbldocset with_flngCount(Integer flngCount) {
    this.flngCount = flngCount;
    return this;
  }
  private Integer flngErrorCount;
  public Integer get_flngErrorCount() {
    return flngErrorCount;
  }
  public void set_flngErrorCount(Integer flngErrorCount) {
    this.flngErrorCount = flngErrorCount;
  }
  public tbldocset with_flngErrorCount(Integer flngErrorCount) {
    this.flngErrorCount = flngErrorCount;
    return this;
  }
  private Integer flngWarningCount;
  public Integer get_flngWarningCount() {
    return flngWarningCount;
  }
  public void set_flngWarningCount(Integer flngWarningCount) {
    this.flngWarningCount = flngWarningCount;
  }
  public tbldocset with_flngWarningCount(Integer flngWarningCount) {
    this.flngWarningCount = flngWarningCount;
    return this;
  }
  private Integer flngInformationCount;
  public Integer get_flngInformationCount() {
    return flngInformationCount;
  }
  public void set_flngInformationCount(Integer flngInformationCount) {
    this.flngInformationCount = flngInformationCount;
  }
  public tbldocset with_flngInformationCount(Integer flngInformationCount) {
    this.flngInformationCount = flngInformationCount;
    return this;
  }
  private java.sql.Timestamp fdtmReversed;
  public java.sql.Timestamp get_fdtmReversed() {
    return fdtmReversed;
  }
  public void set_fdtmReversed(java.sql.Timestamp fdtmReversed) {
    this.fdtmReversed = fdtmReversed;
  }
  public tbldocset with_fdtmReversed(java.sql.Timestamp fdtmReversed) {
    this.fdtmReversed = fdtmReversed;
    return this;
  }
  private org.apache.hadoop.io.BytesWritable fvntFieldShare;
  public org.apache.hadoop.io.BytesWritable get_fvntFieldShare() {
    return fvntFieldShare;
  }
  public void set_fvntFieldShare(org.apache.hadoop.io.BytesWritable fvntFieldShare) {
    this.fvntFieldShare = fvntFieldShare;
  }
  public tbldocset with_fvntFieldShare(org.apache.hadoop.io.BytesWritable fvntFieldShare) {
    this.fvntFieldShare = fvntFieldShare;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tbldocset with_fstrWho(String fstrWho) {
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
  public tbldocset with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tbldocset)) {
      return false;
    }
    tbldocset that = (tbldocset) o;
    boolean equal = true;
    equal = equal && (this.fi64DocSetKey == null ? that.fi64DocSetKey == null : this.fi64DocSetKey.equals(that.fi64DocSetKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fstrDocSetType == null ? that.fstrDocSetType == null : this.fstrDocSetType.equals(that.fstrDocSetType));
    equal = equal && (this.fintDocSetVer == null ? that.fintDocSetVer == null : this.fintDocSetVer.equals(that.fintDocSetVer));
    equal = equal && (this.fintVersion == null ? that.fintVersion == null : this.fintVersion.equals(that.fintVersion));
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fstrDocType == null ? that.fstrDocType == null : this.fstrDocType.equals(that.fstrDocType));
    equal = equal && (this.fintDocVer == null ? that.fintDocVer == null : this.fintDocVer.equals(that.fintDocVer));
    equal = equal && (this.fblnPreliminary == null ? that.fblnPreliminary == null : this.fblnPreliminary.equals(that.fblnPreliminary));
    equal = equal && (this.flngCount == null ? that.flngCount == null : this.flngCount.equals(that.flngCount));
    equal = equal && (this.flngErrorCount == null ? that.flngErrorCount == null : this.flngErrorCount.equals(that.flngErrorCount));
    equal = equal && (this.flngWarningCount == null ? that.flngWarningCount == null : this.flngWarningCount.equals(that.flngWarningCount));
    equal = equal && (this.flngInformationCount == null ? that.flngInformationCount == null : this.flngInformationCount.equals(that.flngInformationCount));
    equal = equal && (this.fdtmReversed == null ? that.fdtmReversed == null : this.fdtmReversed.equals(that.fdtmReversed));
    equal = equal && (this.fvntFieldShare == null ? that.fvntFieldShare == null : this.fvntFieldShare.equals(that.fvntFieldShare));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tbldocset)) {
      return false;
    }
    tbldocset that = (tbldocset) o;
    boolean equal = true;
    equal = equal && (this.fi64DocSetKey == null ? that.fi64DocSetKey == null : this.fi64DocSetKey.equals(that.fi64DocSetKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fstrDocSetType == null ? that.fstrDocSetType == null : this.fstrDocSetType.equals(that.fstrDocSetType));
    equal = equal && (this.fintDocSetVer == null ? that.fintDocSetVer == null : this.fintDocSetVer.equals(that.fintDocSetVer));
    equal = equal && (this.fintVersion == null ? that.fintVersion == null : this.fintVersion.equals(that.fintVersion));
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fstrDocType == null ? that.fstrDocType == null : this.fstrDocType.equals(that.fstrDocType));
    equal = equal && (this.fintDocVer == null ? that.fintDocVer == null : this.fintDocVer.equals(that.fintDocVer));
    equal = equal && (this.fblnPreliminary == null ? that.fblnPreliminary == null : this.fblnPreliminary.equals(that.fblnPreliminary));
    equal = equal && (this.flngCount == null ? that.flngCount == null : this.flngCount.equals(that.flngCount));
    equal = equal && (this.flngErrorCount == null ? that.flngErrorCount == null : this.flngErrorCount.equals(that.flngErrorCount));
    equal = equal && (this.flngWarningCount == null ? that.flngWarningCount == null : this.flngWarningCount.equals(that.flngWarningCount));
    equal = equal && (this.flngInformationCount == null ? that.flngInformationCount == null : this.flngInformationCount.equals(that.flngInformationCount));
    equal = equal && (this.fdtmReversed == null ? that.fdtmReversed == null : this.fdtmReversed.equals(that.fdtmReversed));
    equal = equal && (this.fvntFieldShare == null ? that.fvntFieldShare == null : this.fvntFieldShare.equals(that.fvntFieldShare));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.fi64DocSetKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrDocSetType = JdbcWritableBridge.readString(4, __dbResults);
    this.fintDocSetVer = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fintVersion = JdbcWritableBridge.readInteger(6, __dbResults);
    this.flngDocKey = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fstrDocType = JdbcWritableBridge.readString(8, __dbResults);
    this.fintDocVer = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fblnPreliminary = JdbcWritableBridge.readInteger(10, __dbResults);
    this.flngCount = JdbcWritableBridge.readInteger(11, __dbResults);
    this.flngErrorCount = JdbcWritableBridge.readInteger(12, __dbResults);
    this.flngWarningCount = JdbcWritableBridge.readInteger(13, __dbResults);
    this.flngInformationCount = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fdtmReversed = JdbcWritableBridge.readTimestamp(15, __dbResults);
    this.fvntFieldShare = JdbcWritableBridge.readBytesWritable(16, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(17, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(18, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.fi64DocSetKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrDocSetType = JdbcWritableBridge.readString(4, __dbResults);
    this.fintDocSetVer = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fintVersion = JdbcWritableBridge.readInteger(6, __dbResults);
    this.flngDocKey = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fstrDocType = JdbcWritableBridge.readString(8, __dbResults);
    this.fintDocVer = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fblnPreliminary = JdbcWritableBridge.readInteger(10, __dbResults);
    this.flngCount = JdbcWritableBridge.readInteger(11, __dbResults);
    this.flngErrorCount = JdbcWritableBridge.readInteger(12, __dbResults);
    this.flngWarningCount = JdbcWritableBridge.readInteger(13, __dbResults);
    this.flngInformationCount = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fdtmReversed = JdbcWritableBridge.readTimestamp(15, __dbResults);
    this.fvntFieldShare = JdbcWritableBridge.readBytesWritable(16, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(17, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(18, __dbResults);
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
    JdbcWritableBridge.writeLong(fi64DocSetKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrDocSetType, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintDocSetVer, 5 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintVersion, 6 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDocKey, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrDocType, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintDocVer, 9 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPreliminary, 10 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCount, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngErrorCount, 12 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngWarningCount, 13 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngInformationCount, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReversed, 15 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBytesWritable(fvntFieldShare, 16 + __off, -3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 18 + __off, 93, __dbStmt);
    return 18;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(fi64DocSetKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrDocSetType, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintDocSetVer, 5 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintVersion, 6 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDocKey, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrDocType, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintDocVer, 9 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPreliminary, 10 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCount, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngErrorCount, 12 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngWarningCount, 13 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngInformationCount, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReversed, 15 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBytesWritable(fvntFieldShare, 16 + __off, -3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 18 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.fi64DocSetKey = null;
    } else {
    this.fi64DocSetKey = Long.valueOf(__dataIn.readLong());
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
        this.fstrDocSetType = null;
    } else {
    this.fstrDocSetType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fintDocSetVer = null;
    } else {
    this.fintDocSetVer = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintVersion = null;
    } else {
    this.fintVersion = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngDocKey = null;
    } else {
    this.flngDocKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDocType = null;
    } else {
    this.fstrDocType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fintDocVer = null;
    } else {
    this.fintDocVer = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnPreliminary = null;
    } else {
    this.fblnPreliminary = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngCount = null;
    } else {
    this.flngCount = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngErrorCount = null;
    } else {
    this.flngErrorCount = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngWarningCount = null;
    } else {
    this.flngWarningCount = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngInformationCount = null;
    } else {
    this.flngInformationCount = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmReversed = null;
    } else {
    this.fdtmReversed = new Timestamp(__dataIn.readLong());
    this.fdtmReversed.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fvntFieldShare = null;
    } else {
    this.fvntFieldShare = new BytesWritable();
    this.fvntFieldShare.readFields(__dataIn);
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
    if (null == this.fi64DocSetKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64DocSetKey);
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
    if (null == this.fstrDocSetType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDocSetType);
    }
    if (null == this.fintDocSetVer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintDocSetVer);
    }
    if (null == this.fintVersion) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintVersion);
    }
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.fstrDocType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDocType);
    }
    if (null == this.fintDocVer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintDocVer);
    }
    if (null == this.fblnPreliminary) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPreliminary);
    }
    if (null == this.flngCount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCount);
    }
    if (null == this.flngErrorCount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngErrorCount);
    }
    if (null == this.flngWarningCount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngWarningCount);
    }
    if (null == this.flngInformationCount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngInformationCount);
    }
    if (null == this.fdtmReversed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReversed.getTime());
    __dataOut.writeInt(this.fdtmReversed.getNanos());
    }
    if (null == this.fvntFieldShare) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    this.fvntFieldShare.write(__dataOut);
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
    if (null == this.fi64DocSetKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64DocSetKey);
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
    if (null == this.fstrDocSetType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDocSetType);
    }
    if (null == this.fintDocSetVer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintDocSetVer);
    }
    if (null == this.fintVersion) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintVersion);
    }
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.fstrDocType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDocType);
    }
    if (null == this.fintDocVer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintDocVer);
    }
    if (null == this.fblnPreliminary) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPreliminary);
    }
    if (null == this.flngCount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCount);
    }
    if (null == this.flngErrorCount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngErrorCount);
    }
    if (null == this.flngWarningCount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngWarningCount);
    }
    if (null == this.flngInformationCount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngInformationCount);
    }
    if (null == this.fdtmReversed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReversed.getTime());
    __dataOut.writeInt(this.fdtmReversed.getNanos());
    }
    if (null == this.fvntFieldShare) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    this.fvntFieldShare.write(__dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64DocSetKey==null?"\\N":"" + fi64DocSetKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDocSetType==null?"\\N":fstrDocSetType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintDocSetVer==null?"\\N":"" + fintDocSetVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintVersion==null?"\\N":"" + fintVersion, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDocType==null?"\\N":fstrDocType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintDocVer==null?"\\N":"" + fintDocVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPreliminary==null?"\\N":"" + fblnPreliminary, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCount==null?"\\N":"" + flngCount, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngErrorCount==null?"\\N":"" + flngErrorCount, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngWarningCount==null?"\\N":"" + flngWarningCount, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngInformationCount==null?"\\N":"" + flngInformationCount, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReversed==null?"\\N":"" + fdtmReversed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fvntFieldShare==null?"\\N":"" + fvntFieldShare, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64DocSetKey==null?"\\N":"" + fi64DocSetKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDocSetType==null?"\\N":fstrDocSetType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintDocSetVer==null?"\\N":"" + fintDocSetVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintVersion==null?"\\N":"" + fintVersion, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDocType==null?"\\N":fstrDocType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintDocVer==null?"\\N":"" + fintDocVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPreliminary==null?"\\N":"" + fblnPreliminary, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCount==null?"\\N":"" + flngCount, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngErrorCount==null?"\\N":"" + flngErrorCount, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngWarningCount==null?"\\N":"" + flngWarningCount, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngInformationCount==null?"\\N":"" + flngInformationCount, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReversed==null?"\\N":"" + fdtmReversed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fvntFieldShare==null?"\\N":"" + fvntFieldShare, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64DocSetKey = null; } else {
      this.fi64DocSetKey = Long.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrDocSetType = null; } else {
      this.fstrDocSetType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintDocSetVer = null; } else {
      this.fintDocSetVer = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintVersion = null; } else {
      this.fintVersion = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrDocType = null; } else {
      this.fstrDocType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintDocVer = null; } else {
      this.fintDocVer = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPreliminary = null; } else {
      this.fblnPreliminary = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCount = null; } else {
      this.flngCount = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngErrorCount = null; } else {
      this.flngErrorCount = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngWarningCount = null; } else {
      this.flngWarningCount = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngInformationCount = null; } else {
      this.flngInformationCount = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fvntFieldShare = null; } else {
      String[] strByteVal = __cur_str.trim().split(" ");
      byte [] byteVal = new byte[strByteVal.length];
      for (int i = 0; i < byteVal.length; ++i) {
          byteVal[i] = (byte)Integer.parseInt(strByteVal[i], 16);
      }
      this.fvntFieldShare = new BytesWritable(byteVal);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64DocSetKey = null; } else {
      this.fi64DocSetKey = Long.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrDocSetType = null; } else {
      this.fstrDocSetType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintDocSetVer = null; } else {
      this.fintDocSetVer = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintVersion = null; } else {
      this.fintVersion = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrDocType = null; } else {
      this.fstrDocType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintDocVer = null; } else {
      this.fintDocVer = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPreliminary = null; } else {
      this.fblnPreliminary = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCount = null; } else {
      this.flngCount = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngErrorCount = null; } else {
      this.flngErrorCount = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngWarningCount = null; } else {
      this.flngWarningCount = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngInformationCount = null; } else {
      this.flngInformationCount = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fvntFieldShare = null; } else {
      String[] strByteVal = __cur_str.trim().split(" ");
      byte [] byteVal = new byte[strByteVal.length];
      for (int i = 0; i < byteVal.length; ++i) {
          byteVal[i] = (byte)Integer.parseInt(strByteVal[i], 16);
      }
      this.fvntFieldShare = new BytesWritable(byteVal);
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
    tbldocset o = (tbldocset) super.clone();
    o.fdtmReversed = (o.fdtmReversed != null) ? (java.sql.Timestamp) o.fdtmReversed.clone() : null;
    o.fvntFieldShare = (o.fvntFieldShare != null) ? new BytesWritable(Arrays.copyOf(fvntFieldShare.getBytes(), fvntFieldShare.getLength())) : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tbldocset o) throws CloneNotSupportedException {
    o.fdtmReversed = (o.fdtmReversed != null) ? (java.sql.Timestamp) o.fdtmReversed.clone() : null;
    o.fvntFieldShare = (o.fvntFieldShare != null) ? new BytesWritable(Arrays.copyOf(fvntFieldShare.getBytes(), fvntFieldShare.getLength())) : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("fi64DocSetKey", this.fi64DocSetKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fstrDocSetType", this.fstrDocSetType);
    __sqoop$field_map.put("fintDocSetVer", this.fintDocSetVer);
    __sqoop$field_map.put("fintVersion", this.fintVersion);
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fstrDocType", this.fstrDocType);
    __sqoop$field_map.put("fintDocVer", this.fintDocVer);
    __sqoop$field_map.put("fblnPreliminary", this.fblnPreliminary);
    __sqoop$field_map.put("flngCount", this.flngCount);
    __sqoop$field_map.put("flngErrorCount", this.flngErrorCount);
    __sqoop$field_map.put("flngWarningCount", this.flngWarningCount);
    __sqoop$field_map.put("flngInformationCount", this.flngInformationCount);
    __sqoop$field_map.put("fdtmReversed", this.fdtmReversed);
    __sqoop$field_map.put("fvntFieldShare", this.fvntFieldShare);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("fi64DocSetKey", this.fi64DocSetKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fstrDocSetType", this.fstrDocSetType);
    __sqoop$field_map.put("fintDocSetVer", this.fintDocSetVer);
    __sqoop$field_map.put("fintVersion", this.fintVersion);
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fstrDocType", this.fstrDocType);
    __sqoop$field_map.put("fintDocVer", this.fintDocVer);
    __sqoop$field_map.put("fblnPreliminary", this.fblnPreliminary);
    __sqoop$field_map.put("flngCount", this.flngCount);
    __sqoop$field_map.put("flngErrorCount", this.flngErrorCount);
    __sqoop$field_map.put("flngWarningCount", this.flngWarningCount);
    __sqoop$field_map.put("flngInformationCount", this.flngInformationCount);
    __sqoop$field_map.put("fdtmReversed", this.fdtmReversed);
    __sqoop$field_map.put("fvntFieldShare", this.fvntFieldShare);
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
