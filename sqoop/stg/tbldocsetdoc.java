// ORM class for table 'tbldocsetdoc'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Dec 03 23:01:49 NZDT 2020
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

public class tbldocsetdoc extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("fi64DocSetKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbldocsetdoc.this.fi64DocSetKey = (Long)value;
      }
    });
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbldocsetdoc.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbldocsetdoc.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbldocsetdoc.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("fstrDocSetType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbldocsetdoc.this.fstrDocSetType = (String)value;
      }
    });
    setters.put("fintDocSetVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbldocsetdoc.this.fintDocSetVer = (Integer)value;
      }
    });
    setters.put("fintVersion", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbldocsetdoc.this.fintVersion = (Integer)value;
      }
    });
    setters.put("fstrDoc", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbldocsetdoc.this.fstrDoc = (String)value;
      }
    });
    setters.put("fintDocSequence", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbldocsetdoc.this.fintDocSequence = (Integer)value;
      }
    });
    setters.put("fstrDocSequenceName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbldocsetdoc.this.fstrDocSequenceName = (String)value;
      }
    });
    setters.put("fstrDocType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbldocsetdoc.this.fstrDocType = (String)value;
      }
    });
    setters.put("fintDocVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbldocsetdoc.this.fintDocVer = (Integer)value;
      }
    });
    setters.put("fintDocVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbldocsetdoc.this.fintDocVerLast = (Integer)value;
      }
    });
    setters.put("fblnError", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbldocsetdoc.this.fblnError = (Integer)value;
      }
    });
    setters.put("fblnWarning", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbldocsetdoc.this.fblnWarning = (Integer)value;
      }
    });
    setters.put("fblnInformation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbldocsetdoc.this.fblnInformation = (Integer)value;
      }
    });
    setters.put("fblnRevoked", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbldocsetdoc.this.fblnRevoked = (Integer)value;
      }
    });
    setters.put("fdtmReversed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbldocsetdoc.this.fdtmReversed = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbldocsetdoc.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbldocsetdoc.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tbldocsetdoc() {
    init0();
  }
  private Long fi64DocSetKey;
  public Long get_fi64DocSetKey() {
    return fi64DocSetKey;
  }
  public void set_fi64DocSetKey(Long fi64DocSetKey) {
    this.fi64DocSetKey = fi64DocSetKey;
  }
  public tbldocsetdoc with_fi64DocSetKey(Long fi64DocSetKey) {
    this.fi64DocSetKey = fi64DocSetKey;
    return this;
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tbldocsetdoc with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tbldocsetdoc with_flngVer(Integer flngVer) {
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
  public tbldocsetdoc with_flngVerLast(Integer flngVerLast) {
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
  public tbldocsetdoc with_fstrDocSetType(String fstrDocSetType) {
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
  public tbldocsetdoc with_fintDocSetVer(Integer fintDocSetVer) {
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
  public tbldocsetdoc with_fintVersion(Integer fintVersion) {
    this.fintVersion = fintVersion;
    return this;
  }
  private String fstrDoc;
  public String get_fstrDoc() {
    return fstrDoc;
  }
  public void set_fstrDoc(String fstrDoc) {
    this.fstrDoc = fstrDoc;
  }
  public tbldocsetdoc with_fstrDoc(String fstrDoc) {
    this.fstrDoc = fstrDoc;
    return this;
  }
  private Integer fintDocSequence;
  public Integer get_fintDocSequence() {
    return fintDocSequence;
  }
  public void set_fintDocSequence(Integer fintDocSequence) {
    this.fintDocSequence = fintDocSequence;
  }
  public tbldocsetdoc with_fintDocSequence(Integer fintDocSequence) {
    this.fintDocSequence = fintDocSequence;
    return this;
  }
  private String fstrDocSequenceName;
  public String get_fstrDocSequenceName() {
    return fstrDocSequenceName;
  }
  public void set_fstrDocSequenceName(String fstrDocSequenceName) {
    this.fstrDocSequenceName = fstrDocSequenceName;
  }
  public tbldocsetdoc with_fstrDocSequenceName(String fstrDocSequenceName) {
    this.fstrDocSequenceName = fstrDocSequenceName;
    return this;
  }
  private String fstrDocType;
  public String get_fstrDocType() {
    return fstrDocType;
  }
  public void set_fstrDocType(String fstrDocType) {
    this.fstrDocType = fstrDocType;
  }
  public tbldocsetdoc with_fstrDocType(String fstrDocType) {
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
  public tbldocsetdoc with_fintDocVer(Integer fintDocVer) {
    this.fintDocVer = fintDocVer;
    return this;
  }
  private Integer fintDocVerLast;
  public Integer get_fintDocVerLast() {
    return fintDocVerLast;
  }
  public void set_fintDocVerLast(Integer fintDocVerLast) {
    this.fintDocVerLast = fintDocVerLast;
  }
  public tbldocsetdoc with_fintDocVerLast(Integer fintDocVerLast) {
    this.fintDocVerLast = fintDocVerLast;
    return this;
  }
  private Integer fblnError;
  public Integer get_fblnError() {
    return fblnError;
  }
  public void set_fblnError(Integer fblnError) {
    this.fblnError = fblnError;
  }
  public tbldocsetdoc with_fblnError(Integer fblnError) {
    this.fblnError = fblnError;
    return this;
  }
  private Integer fblnWarning;
  public Integer get_fblnWarning() {
    return fblnWarning;
  }
  public void set_fblnWarning(Integer fblnWarning) {
    this.fblnWarning = fblnWarning;
  }
  public tbldocsetdoc with_fblnWarning(Integer fblnWarning) {
    this.fblnWarning = fblnWarning;
    return this;
  }
  private Integer fblnInformation;
  public Integer get_fblnInformation() {
    return fblnInformation;
  }
  public void set_fblnInformation(Integer fblnInformation) {
    this.fblnInformation = fblnInformation;
  }
  public tbldocsetdoc with_fblnInformation(Integer fblnInformation) {
    this.fblnInformation = fblnInformation;
    return this;
  }
  private Integer fblnRevoked;
  public Integer get_fblnRevoked() {
    return fblnRevoked;
  }
  public void set_fblnRevoked(Integer fblnRevoked) {
    this.fblnRevoked = fblnRevoked;
  }
  public tbldocsetdoc with_fblnRevoked(Integer fblnRevoked) {
    this.fblnRevoked = fblnRevoked;
    return this;
  }
  private java.sql.Timestamp fdtmReversed;
  public java.sql.Timestamp get_fdtmReversed() {
    return fdtmReversed;
  }
  public void set_fdtmReversed(java.sql.Timestamp fdtmReversed) {
    this.fdtmReversed = fdtmReversed;
  }
  public tbldocsetdoc with_fdtmReversed(java.sql.Timestamp fdtmReversed) {
    this.fdtmReversed = fdtmReversed;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tbldocsetdoc with_fstrWho(String fstrWho) {
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
  public tbldocsetdoc with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tbldocsetdoc)) {
      return false;
    }
    tbldocsetdoc that = (tbldocsetdoc) o;
    boolean equal = true;
    equal = equal && (this.fi64DocSetKey == null ? that.fi64DocSetKey == null : this.fi64DocSetKey.equals(that.fi64DocSetKey));
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fstrDocSetType == null ? that.fstrDocSetType == null : this.fstrDocSetType.equals(that.fstrDocSetType));
    equal = equal && (this.fintDocSetVer == null ? that.fintDocSetVer == null : this.fintDocSetVer.equals(that.fintDocSetVer));
    equal = equal && (this.fintVersion == null ? that.fintVersion == null : this.fintVersion.equals(that.fintVersion));
    equal = equal && (this.fstrDoc == null ? that.fstrDoc == null : this.fstrDoc.equals(that.fstrDoc));
    equal = equal && (this.fintDocSequence == null ? that.fintDocSequence == null : this.fintDocSequence.equals(that.fintDocSequence));
    equal = equal && (this.fstrDocSequenceName == null ? that.fstrDocSequenceName == null : this.fstrDocSequenceName.equals(that.fstrDocSequenceName));
    equal = equal && (this.fstrDocType == null ? that.fstrDocType == null : this.fstrDocType.equals(that.fstrDocType));
    equal = equal && (this.fintDocVer == null ? that.fintDocVer == null : this.fintDocVer.equals(that.fintDocVer));
    equal = equal && (this.fintDocVerLast == null ? that.fintDocVerLast == null : this.fintDocVerLast.equals(that.fintDocVerLast));
    equal = equal && (this.fblnError == null ? that.fblnError == null : this.fblnError.equals(that.fblnError));
    equal = equal && (this.fblnWarning == null ? that.fblnWarning == null : this.fblnWarning.equals(that.fblnWarning));
    equal = equal && (this.fblnInformation == null ? that.fblnInformation == null : this.fblnInformation.equals(that.fblnInformation));
    equal = equal && (this.fblnRevoked == null ? that.fblnRevoked == null : this.fblnRevoked.equals(that.fblnRevoked));
    equal = equal && (this.fdtmReversed == null ? that.fdtmReversed == null : this.fdtmReversed.equals(that.fdtmReversed));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tbldocsetdoc)) {
      return false;
    }
    tbldocsetdoc that = (tbldocsetdoc) o;
    boolean equal = true;
    equal = equal && (this.fi64DocSetKey == null ? that.fi64DocSetKey == null : this.fi64DocSetKey.equals(that.fi64DocSetKey));
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fstrDocSetType == null ? that.fstrDocSetType == null : this.fstrDocSetType.equals(that.fstrDocSetType));
    equal = equal && (this.fintDocSetVer == null ? that.fintDocSetVer == null : this.fintDocSetVer.equals(that.fintDocSetVer));
    equal = equal && (this.fintVersion == null ? that.fintVersion == null : this.fintVersion.equals(that.fintVersion));
    equal = equal && (this.fstrDoc == null ? that.fstrDoc == null : this.fstrDoc.equals(that.fstrDoc));
    equal = equal && (this.fintDocSequence == null ? that.fintDocSequence == null : this.fintDocSequence.equals(that.fintDocSequence));
    equal = equal && (this.fstrDocSequenceName == null ? that.fstrDocSequenceName == null : this.fstrDocSequenceName.equals(that.fstrDocSequenceName));
    equal = equal && (this.fstrDocType == null ? that.fstrDocType == null : this.fstrDocType.equals(that.fstrDocType));
    equal = equal && (this.fintDocVer == null ? that.fintDocVer == null : this.fintDocVer.equals(that.fintDocVer));
    equal = equal && (this.fintDocVerLast == null ? that.fintDocVerLast == null : this.fintDocVerLast.equals(that.fintDocVerLast));
    equal = equal && (this.fblnError == null ? that.fblnError == null : this.fblnError.equals(that.fblnError));
    equal = equal && (this.fblnWarning == null ? that.fblnWarning == null : this.fblnWarning.equals(that.fblnWarning));
    equal = equal && (this.fblnInformation == null ? that.fblnInformation == null : this.fblnInformation.equals(that.fblnInformation));
    equal = equal && (this.fblnRevoked == null ? that.fblnRevoked == null : this.fblnRevoked.equals(that.fblnRevoked));
    equal = equal && (this.fdtmReversed == null ? that.fdtmReversed == null : this.fdtmReversed.equals(that.fdtmReversed));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.fi64DocSetKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.flngDocKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fstrDocSetType = JdbcWritableBridge.readString(5, __dbResults);
    this.fintDocSetVer = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fintVersion = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fstrDoc = JdbcWritableBridge.readString(8, __dbResults);
    this.fintDocSequence = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fstrDocSequenceName = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrDocType = JdbcWritableBridge.readString(11, __dbResults);
    this.fintDocVer = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fintDocVerLast = JdbcWritableBridge.readInteger(13, __dbResults);
    this.fblnError = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fblnWarning = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fblnInformation = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fblnRevoked = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fdtmReversed = JdbcWritableBridge.readTimestamp(18, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(19, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(20, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.fi64DocSetKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.flngDocKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fstrDocSetType = JdbcWritableBridge.readString(5, __dbResults);
    this.fintDocSetVer = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fintVersion = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fstrDoc = JdbcWritableBridge.readString(8, __dbResults);
    this.fintDocSequence = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fstrDocSequenceName = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrDocType = JdbcWritableBridge.readString(11, __dbResults);
    this.fintDocVer = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fintDocVerLast = JdbcWritableBridge.readInteger(13, __dbResults);
    this.fblnError = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fblnWarning = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fblnInformation = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fblnRevoked = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fdtmReversed = JdbcWritableBridge.readTimestamp(18, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(19, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(20, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngDocKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrDocSetType, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintDocSetVer, 6 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintVersion, 7 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrDoc, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintDocSequence, 9 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrDocSequenceName, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDocType, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintDocVer, 12 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintDocVerLast, 13 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnError, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnWarning, 15 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnInformation, 16 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnRevoked, 17 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReversed, 18 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 20 + __off, 93, __dbStmt);
    return 20;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(fi64DocSetKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDocKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrDocSetType, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintDocSetVer, 6 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintVersion, 7 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrDoc, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintDocSequence, 9 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrDocSequenceName, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDocType, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintDocVer, 12 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintDocVerLast, 13 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnError, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnWarning, 15 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnInformation, 16 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnRevoked, 17 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReversed, 18 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 20 + __off, 93, __dbStmt);
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
        this.flngDocKey = null;
    } else {
    this.flngDocKey = Integer.valueOf(__dataIn.readInt());
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
        this.fstrDoc = null;
    } else {
    this.fstrDoc = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fintDocSequence = null;
    } else {
    this.fintDocSequence = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDocSequenceName = null;
    } else {
    this.fstrDocSequenceName = Text.readString(__dataIn);
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
        this.fintDocVerLast = null;
    } else {
    this.fintDocVerLast = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnError = null;
    } else {
    this.fblnError = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnWarning = null;
    } else {
    this.fblnWarning = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnInformation = null;
    } else {
    this.fblnInformation = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnRevoked = null;
    } else {
    this.fblnRevoked = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmReversed = null;
    } else {
    this.fdtmReversed = new Timestamp(__dataIn.readLong());
    this.fdtmReversed.setNanos(__dataIn.readInt());
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
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
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
    if (null == this.fstrDoc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDoc);
    }
    if (null == this.fintDocSequence) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintDocSequence);
    }
    if (null == this.fstrDocSequenceName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDocSequenceName);
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
    if (null == this.fintDocVerLast) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintDocVerLast);
    }
    if (null == this.fblnError) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnError);
    }
    if (null == this.fblnWarning) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnWarning);
    }
    if (null == this.fblnInformation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnInformation);
    }
    if (null == this.fblnRevoked) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnRevoked);
    }
    if (null == this.fdtmReversed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReversed.getTime());
    __dataOut.writeInt(this.fdtmReversed.getNanos());
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
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
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
    if (null == this.fstrDoc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDoc);
    }
    if (null == this.fintDocSequence) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintDocSequence);
    }
    if (null == this.fstrDocSequenceName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDocSequenceName);
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
    if (null == this.fintDocVerLast) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintDocVerLast);
    }
    if (null == this.fblnError) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnError);
    }
    if (null == this.fblnWarning) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnWarning);
    }
    if (null == this.fblnInformation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnInformation);
    }
    if (null == this.fblnRevoked) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnRevoked);
    }
    if (null == this.fdtmReversed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReversed.getTime());
    __dataOut.writeInt(this.fdtmReversed.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
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
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDoc==null?"\\N":fstrDoc, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintDocSequence==null?"\\N":"" + fintDocSequence, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDocSequenceName==null?"\\N":fstrDocSequenceName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDocType==null?"\\N":fstrDocType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintDocVer==null?"\\N":"" + fintDocVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintDocVerLast==null?"\\N":"" + fintDocVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnError==null?"\\N":"" + fblnError, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnWarning==null?"\\N":"" + fblnWarning, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnInformation==null?"\\N":"" + fblnInformation, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnRevoked==null?"\\N":"" + fblnRevoked, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReversed==null?"\\N":"" + fdtmReversed, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
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
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDoc==null?"\\N":fstrDoc, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintDocSequence==null?"\\N":"" + fintDocSequence, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDocSequenceName==null?"\\N":fstrDocSequenceName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDocType==null?"\\N":fstrDocType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintDocVer==null?"\\N":"" + fintDocVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintDocVerLast==null?"\\N":"" + fintDocVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnError==null?"\\N":"" + fblnError, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnWarning==null?"\\N":"" + fblnWarning, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnInformation==null?"\\N":"" + fblnInformation, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnRevoked==null?"\\N":"" + fblnRevoked, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReversed==null?"\\N":"" + fdtmReversed, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDocKey = null; } else {
      this.flngDocKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrDoc = null; } else {
      this.fstrDoc = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintDocSequence = null; } else {
      this.fintDocSequence = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDocSequenceName = null; } else {
      this.fstrDocSequenceName = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintDocVerLast = null; } else {
      this.fintDocVerLast = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnError = null; } else {
      this.fblnError = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnWarning = null; } else {
      this.fblnWarning = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnInformation = null; } else {
      this.fblnInformation = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnRevoked = null; } else {
      this.fblnRevoked = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDocKey = null; } else {
      this.flngDocKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrDoc = null; } else {
      this.fstrDoc = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintDocSequence = null; } else {
      this.fintDocSequence = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDocSequenceName = null; } else {
      this.fstrDocSequenceName = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintDocVerLast = null; } else {
      this.fintDocVerLast = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnError = null; } else {
      this.fblnError = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnWarning = null; } else {
      this.fblnWarning = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnInformation = null; } else {
      this.fblnInformation = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnRevoked = null; } else {
      this.fblnRevoked = Integer.valueOf(__cur_str);
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
    tbldocsetdoc o = (tbldocsetdoc) super.clone();
    o.fdtmReversed = (o.fdtmReversed != null) ? (java.sql.Timestamp) o.fdtmReversed.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tbldocsetdoc o) throws CloneNotSupportedException {
    o.fdtmReversed = (o.fdtmReversed != null) ? (java.sql.Timestamp) o.fdtmReversed.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("fi64DocSetKey", this.fi64DocSetKey);
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fstrDocSetType", this.fstrDocSetType);
    __sqoop$field_map.put("fintDocSetVer", this.fintDocSetVer);
    __sqoop$field_map.put("fintVersion", this.fintVersion);
    __sqoop$field_map.put("fstrDoc", this.fstrDoc);
    __sqoop$field_map.put("fintDocSequence", this.fintDocSequence);
    __sqoop$field_map.put("fstrDocSequenceName", this.fstrDocSequenceName);
    __sqoop$field_map.put("fstrDocType", this.fstrDocType);
    __sqoop$field_map.put("fintDocVer", this.fintDocVer);
    __sqoop$field_map.put("fintDocVerLast", this.fintDocVerLast);
    __sqoop$field_map.put("fblnError", this.fblnError);
    __sqoop$field_map.put("fblnWarning", this.fblnWarning);
    __sqoop$field_map.put("fblnInformation", this.fblnInformation);
    __sqoop$field_map.put("fblnRevoked", this.fblnRevoked);
    __sqoop$field_map.put("fdtmReversed", this.fdtmReversed);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("fi64DocSetKey", this.fi64DocSetKey);
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fstrDocSetType", this.fstrDocSetType);
    __sqoop$field_map.put("fintDocSetVer", this.fintDocSetVer);
    __sqoop$field_map.put("fintVersion", this.fintVersion);
    __sqoop$field_map.put("fstrDoc", this.fstrDoc);
    __sqoop$field_map.put("fintDocSequence", this.fintDocSequence);
    __sqoop$field_map.put("fstrDocSequenceName", this.fstrDocSequenceName);
    __sqoop$field_map.put("fstrDocType", this.fstrDocType);
    __sqoop$field_map.put("fintDocVer", this.fintDocVer);
    __sqoop$field_map.put("fintDocVerLast", this.fintDocVerLast);
    __sqoop$field_map.put("fblnError", this.fblnError);
    __sqoop$field_map.put("fblnWarning", this.fblnWarning);
    __sqoop$field_map.put("fblnInformation", this.fblnInformation);
    __sqoop$field_map.put("fblnRevoked", this.fblnRevoked);
    __sqoop$field_map.put("fdtmReversed", this.fdtmReversed);
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
