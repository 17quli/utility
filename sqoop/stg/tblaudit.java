// ORM class for table 'tblaudit'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 04:09:12 NZDT 2020
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

public class tblaudit extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngAuditkey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblaudit.this.flngAuditkey = (Integer)value;
      }
    });
    setters.put("fstrAuditType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblaudit.this.fstrAuditType = (String)value;
      }
    });
    setters.put("fstrAuditId", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblaudit.this.fstrAuditId = (String)value;
      }
    });
    setters.put("fstrExternalID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblaudit.this.fstrExternalID = (String)value;
      }
    });
    setters.put("flngAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblaudit.this.flngAccountKey = (Integer)value;
      }
    });
    setters.put("flngFolderKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblaudit.this.flngFolderKey = (Integer)value;
      }
    });
    setters.put("flngTeamKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblaudit.this.flngTeamKey = (Integer)value;
      }
    });
    setters.put("flngJournalKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblaudit.this.flngJournalKey = (Integer)value;
      }
    });
    setters.put("fblnPosted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblaudit.this.fblnPosted = (Integer)value;
      }
    });
    setters.put("fdtmPosted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblaudit.this.fdtmPosted = (java.sql.Timestamp)value;
      }
    });
    setters.put("fcurTotal", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblaudit.this.fcurTotal = (java.math.BigDecimal)value;
      }
    });
    setters.put("fdblHours", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblaudit.this.fdblHours = (Double)value;
      }
    });
    setters.put("flngIndicatorKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblaudit.this.flngIndicatorKey = (Integer)value;
      }
    });
    setters.put("flngPeriodIndKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblaudit.this.flngPeriodIndKey = (Integer)value;
      }
    });
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblaudit.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fdtmWorkDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblaudit.this.fdtmWorkDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("flngAuditGroupKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblaudit.this.flngAuditGroupKey = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblaudit.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblaudit.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblaudit() {
    init0();
  }
  private Integer flngAuditkey;
  public Integer get_flngAuditkey() {
    return flngAuditkey;
  }
  public void set_flngAuditkey(Integer flngAuditkey) {
    this.flngAuditkey = flngAuditkey;
  }
  public tblaudit with_flngAuditkey(Integer flngAuditkey) {
    this.flngAuditkey = flngAuditkey;
    return this;
  }
  private String fstrAuditType;
  public String get_fstrAuditType() {
    return fstrAuditType;
  }
  public void set_fstrAuditType(String fstrAuditType) {
    this.fstrAuditType = fstrAuditType;
  }
  public tblaudit with_fstrAuditType(String fstrAuditType) {
    this.fstrAuditType = fstrAuditType;
    return this;
  }
  private String fstrAuditId;
  public String get_fstrAuditId() {
    return fstrAuditId;
  }
  public void set_fstrAuditId(String fstrAuditId) {
    this.fstrAuditId = fstrAuditId;
  }
  public tblaudit with_fstrAuditId(String fstrAuditId) {
    this.fstrAuditId = fstrAuditId;
    return this;
  }
  private String fstrExternalID;
  public String get_fstrExternalID() {
    return fstrExternalID;
  }
  public void set_fstrExternalID(String fstrExternalID) {
    this.fstrExternalID = fstrExternalID;
  }
  public tblaudit with_fstrExternalID(String fstrExternalID) {
    this.fstrExternalID = fstrExternalID;
    return this;
  }
  private Integer flngAccountKey;
  public Integer get_flngAccountKey() {
    return flngAccountKey;
  }
  public void set_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
  }
  public tblaudit with_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
    return this;
  }
  private Integer flngFolderKey;
  public Integer get_flngFolderKey() {
    return flngFolderKey;
  }
  public void set_flngFolderKey(Integer flngFolderKey) {
    this.flngFolderKey = flngFolderKey;
  }
  public tblaudit with_flngFolderKey(Integer flngFolderKey) {
    this.flngFolderKey = flngFolderKey;
    return this;
  }
  private Integer flngTeamKey;
  public Integer get_flngTeamKey() {
    return flngTeamKey;
  }
  public void set_flngTeamKey(Integer flngTeamKey) {
    this.flngTeamKey = flngTeamKey;
  }
  public tblaudit with_flngTeamKey(Integer flngTeamKey) {
    this.flngTeamKey = flngTeamKey;
    return this;
  }
  private Integer flngJournalKey;
  public Integer get_flngJournalKey() {
    return flngJournalKey;
  }
  public void set_flngJournalKey(Integer flngJournalKey) {
    this.flngJournalKey = flngJournalKey;
  }
  public tblaudit with_flngJournalKey(Integer flngJournalKey) {
    this.flngJournalKey = flngJournalKey;
    return this;
  }
  private Integer fblnPosted;
  public Integer get_fblnPosted() {
    return fblnPosted;
  }
  public void set_fblnPosted(Integer fblnPosted) {
    this.fblnPosted = fblnPosted;
  }
  public tblaudit with_fblnPosted(Integer fblnPosted) {
    this.fblnPosted = fblnPosted;
    return this;
  }
  private java.sql.Timestamp fdtmPosted;
  public java.sql.Timestamp get_fdtmPosted() {
    return fdtmPosted;
  }
  public void set_fdtmPosted(java.sql.Timestamp fdtmPosted) {
    this.fdtmPosted = fdtmPosted;
  }
  public tblaudit with_fdtmPosted(java.sql.Timestamp fdtmPosted) {
    this.fdtmPosted = fdtmPosted;
    return this;
  }
  private java.math.BigDecimal fcurTotal;
  public java.math.BigDecimal get_fcurTotal() {
    return fcurTotal;
  }
  public void set_fcurTotal(java.math.BigDecimal fcurTotal) {
    this.fcurTotal = fcurTotal;
  }
  public tblaudit with_fcurTotal(java.math.BigDecimal fcurTotal) {
    this.fcurTotal = fcurTotal;
    return this;
  }
  private Double fdblHours;
  public Double get_fdblHours() {
    return fdblHours;
  }
  public void set_fdblHours(Double fdblHours) {
    this.fdblHours = fdblHours;
  }
  public tblaudit with_fdblHours(Double fdblHours) {
    this.fdblHours = fdblHours;
    return this;
  }
  private Integer flngIndicatorKey;
  public Integer get_flngIndicatorKey() {
    return flngIndicatorKey;
  }
  public void set_flngIndicatorKey(Integer flngIndicatorKey) {
    this.flngIndicatorKey = flngIndicatorKey;
  }
  public tblaudit with_flngIndicatorKey(Integer flngIndicatorKey) {
    this.flngIndicatorKey = flngIndicatorKey;
    return this;
  }
  private Integer flngPeriodIndKey;
  public Integer get_flngPeriodIndKey() {
    return flngPeriodIndKey;
  }
  public void set_flngPeriodIndKey(Integer flngPeriodIndKey) {
    this.flngPeriodIndKey = flngPeriodIndKey;
  }
  public tblaudit with_flngPeriodIndKey(Integer flngPeriodIndKey) {
    this.flngPeriodIndKey = flngPeriodIndKey;
    return this;
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblaudit with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private java.sql.Timestamp fdtmWorkDate;
  public java.sql.Timestamp get_fdtmWorkDate() {
    return fdtmWorkDate;
  }
  public void set_fdtmWorkDate(java.sql.Timestamp fdtmWorkDate) {
    this.fdtmWorkDate = fdtmWorkDate;
  }
  public tblaudit with_fdtmWorkDate(java.sql.Timestamp fdtmWorkDate) {
    this.fdtmWorkDate = fdtmWorkDate;
    return this;
  }
  private Integer flngAuditGroupKey;
  public Integer get_flngAuditGroupKey() {
    return flngAuditGroupKey;
  }
  public void set_flngAuditGroupKey(Integer flngAuditGroupKey) {
    this.flngAuditGroupKey = flngAuditGroupKey;
  }
  public tblaudit with_flngAuditGroupKey(Integer flngAuditGroupKey) {
    this.flngAuditGroupKey = flngAuditGroupKey;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblaudit with_fstrWho(String fstrWho) {
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
  public tblaudit with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblaudit)) {
      return false;
    }
    tblaudit that = (tblaudit) o;
    boolean equal = true;
    equal = equal && (this.flngAuditkey == null ? that.flngAuditkey == null : this.flngAuditkey.equals(that.flngAuditkey));
    equal = equal && (this.fstrAuditType == null ? that.fstrAuditType == null : this.fstrAuditType.equals(that.fstrAuditType));
    equal = equal && (this.fstrAuditId == null ? that.fstrAuditId == null : this.fstrAuditId.equals(that.fstrAuditId));
    equal = equal && (this.fstrExternalID == null ? that.fstrExternalID == null : this.fstrExternalID.equals(that.fstrExternalID));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.flngFolderKey == null ? that.flngFolderKey == null : this.flngFolderKey.equals(that.flngFolderKey));
    equal = equal && (this.flngTeamKey == null ? that.flngTeamKey == null : this.flngTeamKey.equals(that.flngTeamKey));
    equal = equal && (this.flngJournalKey == null ? that.flngJournalKey == null : this.flngJournalKey.equals(that.flngJournalKey));
    equal = equal && (this.fblnPosted == null ? that.fblnPosted == null : this.fblnPosted.equals(that.fblnPosted));
    equal = equal && (this.fdtmPosted == null ? that.fdtmPosted == null : this.fdtmPosted.equals(that.fdtmPosted));
    equal = equal && (this.fcurTotal == null ? that.fcurTotal == null : this.fcurTotal.equals(that.fcurTotal));
    equal = equal && (this.fdblHours == null ? that.fdblHours == null : this.fdblHours.equals(that.fdblHours));
    equal = equal && (this.flngIndicatorKey == null ? that.flngIndicatorKey == null : this.flngIndicatorKey.equals(that.flngIndicatorKey));
    equal = equal && (this.flngPeriodIndKey == null ? that.flngPeriodIndKey == null : this.flngPeriodIndKey.equals(that.flngPeriodIndKey));
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fdtmWorkDate == null ? that.fdtmWorkDate == null : this.fdtmWorkDate.equals(that.fdtmWorkDate));
    equal = equal && (this.flngAuditGroupKey == null ? that.flngAuditGroupKey == null : this.flngAuditGroupKey.equals(that.flngAuditGroupKey));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblaudit)) {
      return false;
    }
    tblaudit that = (tblaudit) o;
    boolean equal = true;
    equal = equal && (this.flngAuditkey == null ? that.flngAuditkey == null : this.flngAuditkey.equals(that.flngAuditkey));
    equal = equal && (this.fstrAuditType == null ? that.fstrAuditType == null : this.fstrAuditType.equals(that.fstrAuditType));
    equal = equal && (this.fstrAuditId == null ? that.fstrAuditId == null : this.fstrAuditId.equals(that.fstrAuditId));
    equal = equal && (this.fstrExternalID == null ? that.fstrExternalID == null : this.fstrExternalID.equals(that.fstrExternalID));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.flngFolderKey == null ? that.flngFolderKey == null : this.flngFolderKey.equals(that.flngFolderKey));
    equal = equal && (this.flngTeamKey == null ? that.flngTeamKey == null : this.flngTeamKey.equals(that.flngTeamKey));
    equal = equal && (this.flngJournalKey == null ? that.flngJournalKey == null : this.flngJournalKey.equals(that.flngJournalKey));
    equal = equal && (this.fblnPosted == null ? that.fblnPosted == null : this.fblnPosted.equals(that.fblnPosted));
    equal = equal && (this.fdtmPosted == null ? that.fdtmPosted == null : this.fdtmPosted.equals(that.fdtmPosted));
    equal = equal && (this.fcurTotal == null ? that.fcurTotal == null : this.fcurTotal.equals(that.fcurTotal));
    equal = equal && (this.fdblHours == null ? that.fdblHours == null : this.fdblHours.equals(that.fdblHours));
    equal = equal && (this.flngIndicatorKey == null ? that.flngIndicatorKey == null : this.flngIndicatorKey.equals(that.flngIndicatorKey));
    equal = equal && (this.flngPeriodIndKey == null ? that.flngPeriodIndKey == null : this.flngPeriodIndKey.equals(that.flngPeriodIndKey));
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fdtmWorkDate == null ? that.fdtmWorkDate == null : this.fdtmWorkDate.equals(that.fdtmWorkDate));
    equal = equal && (this.flngAuditGroupKey == null ? that.flngAuditGroupKey == null : this.flngAuditGroupKey.equals(that.flngAuditGroupKey));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngAuditkey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fstrAuditType = JdbcWritableBridge.readString(2, __dbResults);
    this.fstrAuditId = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrExternalID = JdbcWritableBridge.readString(4, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(5, __dbResults);
    this.flngFolderKey = JdbcWritableBridge.readInteger(6, __dbResults);
    this.flngTeamKey = JdbcWritableBridge.readInteger(7, __dbResults);
    this.flngJournalKey = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fblnPosted = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fdtmPosted = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.fcurTotal = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fdblHours = JdbcWritableBridge.readDouble(12, __dbResults);
    this.flngIndicatorKey = JdbcWritableBridge.readInteger(13, __dbResults);
    this.flngPeriodIndKey = JdbcWritableBridge.readInteger(14, __dbResults);
    this.flngDocKey = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fdtmWorkDate = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.flngAuditGroupKey = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(18, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(19, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngAuditkey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fstrAuditType = JdbcWritableBridge.readString(2, __dbResults);
    this.fstrAuditId = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrExternalID = JdbcWritableBridge.readString(4, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(5, __dbResults);
    this.flngFolderKey = JdbcWritableBridge.readInteger(6, __dbResults);
    this.flngTeamKey = JdbcWritableBridge.readInteger(7, __dbResults);
    this.flngJournalKey = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fblnPosted = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fdtmPosted = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.fcurTotal = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fdblHours = JdbcWritableBridge.readDouble(12, __dbResults);
    this.flngIndicatorKey = JdbcWritableBridge.readInteger(13, __dbResults);
    this.flngPeriodIndKey = JdbcWritableBridge.readInteger(14, __dbResults);
    this.flngDocKey = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fdtmWorkDate = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.flngAuditGroupKey = JdbcWritableBridge.readInteger(17, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngAuditkey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrAuditType, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAuditId, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrExternalID, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFolderKey, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngTeamKey, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngJournalKey, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPosted, 9 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPosted, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotal, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeDouble(fdblHours, 12 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeInteger(flngIndicatorKey, 13 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngPeriodIndKey, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDocKey, 15 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWorkDate, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAuditGroupKey, 17 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 19 + __off, 93, __dbStmt);
    return 19;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngAuditkey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrAuditType, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAuditId, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrExternalID, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFolderKey, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngTeamKey, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngJournalKey, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPosted, 9 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPosted, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotal, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeDouble(fdblHours, 12 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeInteger(flngIndicatorKey, 13 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngPeriodIndKey, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDocKey, 15 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWorkDate, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAuditGroupKey, 17 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 19 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngAuditkey = null;
    } else {
    this.flngAuditkey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAuditType = null;
    } else {
    this.fstrAuditType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAuditId = null;
    } else {
    this.fstrAuditId = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrExternalID = null;
    } else {
    this.fstrExternalID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngAccountKey = null;
    } else {
    this.flngAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngFolderKey = null;
    } else {
    this.flngFolderKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngTeamKey = null;
    } else {
    this.flngTeamKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngJournalKey = null;
    } else {
    this.flngJournalKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnPosted = null;
    } else {
    this.fblnPosted = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmPosted = null;
    } else {
    this.fdtmPosted = new Timestamp(__dataIn.readLong());
    this.fdtmPosted.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotal = null;
    } else {
    this.fcurTotal = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdblHours = null;
    } else {
    this.fdblHours = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.flngIndicatorKey = null;
    } else {
    this.flngIndicatorKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngPeriodIndKey = null;
    } else {
    this.flngPeriodIndKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngDocKey = null;
    } else {
    this.flngDocKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmWorkDate = null;
    } else {
    this.fdtmWorkDate = new Timestamp(__dataIn.readLong());
    this.fdtmWorkDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngAuditGroupKey = null;
    } else {
    this.flngAuditGroupKey = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.flngAuditkey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAuditkey);
    }
    if (null == this.fstrAuditType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAuditType);
    }
    if (null == this.fstrAuditId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAuditId);
    }
    if (null == this.fstrExternalID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExternalID);
    }
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
    }
    if (null == this.flngFolderKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFolderKey);
    }
    if (null == this.flngTeamKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTeamKey);
    }
    if (null == this.flngJournalKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngJournalKey);
    }
    if (null == this.fblnPosted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPosted);
    }
    if (null == this.fdtmPosted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPosted.getTime());
    __dataOut.writeInt(this.fdtmPosted.getNanos());
    }
    if (null == this.fcurTotal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotal, __dataOut);
    }
    if (null == this.fdblHours) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.fdblHours);
    }
    if (null == this.flngIndicatorKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngIndicatorKey);
    }
    if (null == this.flngPeriodIndKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngPeriodIndKey);
    }
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.fdtmWorkDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmWorkDate.getTime());
    __dataOut.writeInt(this.fdtmWorkDate.getNanos());
    }
    if (null == this.flngAuditGroupKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAuditGroupKey);
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
    if (null == this.flngAuditkey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAuditkey);
    }
    if (null == this.fstrAuditType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAuditType);
    }
    if (null == this.fstrAuditId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAuditId);
    }
    if (null == this.fstrExternalID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExternalID);
    }
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
    }
    if (null == this.flngFolderKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFolderKey);
    }
    if (null == this.flngTeamKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTeamKey);
    }
    if (null == this.flngJournalKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngJournalKey);
    }
    if (null == this.fblnPosted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPosted);
    }
    if (null == this.fdtmPosted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPosted.getTime());
    __dataOut.writeInt(this.fdtmPosted.getNanos());
    }
    if (null == this.fcurTotal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotal, __dataOut);
    }
    if (null == this.fdblHours) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.fdblHours);
    }
    if (null == this.flngIndicatorKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngIndicatorKey);
    }
    if (null == this.flngPeriodIndKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngPeriodIndKey);
    }
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.fdtmWorkDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmWorkDate.getTime());
    __dataOut.writeInt(this.fdtmWorkDate.getNanos());
    }
    if (null == this.flngAuditGroupKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAuditGroupKey);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngAuditkey==null?"\\N":"" + flngAuditkey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAuditType==null?"\\N":fstrAuditType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAuditId==null?"\\N":fstrAuditId, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExternalID==null?"\\N":fstrExternalID, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFolderKey==null?"\\N":"" + flngFolderKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngTeamKey==null?"\\N":"" + flngTeamKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngJournalKey==null?"\\N":"" + flngJournalKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPosted==null?"\\N":"" + fblnPosted, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPosted==null?"\\N":"" + fdtmPosted, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotal==null?"\\N":fcurTotal.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdblHours==null?"\\N":"" + fdblHours, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngIndicatorKey==null?"\\N":"" + flngIndicatorKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngPeriodIndKey==null?"\\N":"" + flngPeriodIndKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmWorkDate==null?"\\N":"" + fdtmWorkDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAuditGroupKey==null?"\\N":"" + flngAuditGroupKey, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngAuditkey==null?"\\N":"" + flngAuditkey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAuditType==null?"\\N":fstrAuditType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAuditId==null?"\\N":fstrAuditId, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExternalID==null?"\\N":fstrExternalID, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFolderKey==null?"\\N":"" + flngFolderKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngTeamKey==null?"\\N":"" + flngTeamKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngJournalKey==null?"\\N":"" + flngJournalKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPosted==null?"\\N":"" + fblnPosted, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPosted==null?"\\N":"" + fdtmPosted, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotal==null?"\\N":fcurTotal.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdblHours==null?"\\N":"" + fdblHours, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngIndicatorKey==null?"\\N":"" + flngIndicatorKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngPeriodIndKey==null?"\\N":"" + flngPeriodIndKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmWorkDate==null?"\\N":"" + fdtmWorkDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAuditGroupKey==null?"\\N":"" + flngAuditGroupKey, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAuditkey = null; } else {
      this.flngAuditkey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAuditType = null; } else {
      this.fstrAuditType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAuditId = null; } else {
      this.fstrAuditId = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrExternalID = null; } else {
      this.fstrExternalID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAccountKey = null; } else {
      this.flngAccountKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTeamKey = null; } else {
      this.flngTeamKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngJournalKey = null; } else {
      this.flngJournalKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPosted = null; } else {
      this.fblnPosted = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPosted = null; } else {
      this.fdtmPosted = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotal = null; } else {
      this.fcurTotal = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdblHours = null; } else {
      this.fdblHours = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngIndicatorKey = null; } else {
      this.flngIndicatorKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngPeriodIndKey = null; } else {
      this.flngPeriodIndKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmWorkDate = null; } else {
      this.fdtmWorkDate = java.sql.Timestamp.valueOf(__cur_str);
    }

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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAuditkey = null; } else {
      this.flngAuditkey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAuditType = null; } else {
      this.fstrAuditType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAuditId = null; } else {
      this.fstrAuditId = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrExternalID = null; } else {
      this.fstrExternalID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAccountKey = null; } else {
      this.flngAccountKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTeamKey = null; } else {
      this.flngTeamKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngJournalKey = null; } else {
      this.flngJournalKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPosted = null; } else {
      this.fblnPosted = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPosted = null; } else {
      this.fdtmPosted = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotal = null; } else {
      this.fcurTotal = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdblHours = null; } else {
      this.fdblHours = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngIndicatorKey = null; } else {
      this.flngIndicatorKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngPeriodIndKey = null; } else {
      this.flngPeriodIndKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmWorkDate = null; } else {
      this.fdtmWorkDate = java.sql.Timestamp.valueOf(__cur_str);
    }

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
    tblaudit o = (tblaudit) super.clone();
    o.fdtmPosted = (o.fdtmPosted != null) ? (java.sql.Timestamp) o.fdtmPosted.clone() : null;
    o.fdtmWorkDate = (o.fdtmWorkDate != null) ? (java.sql.Timestamp) o.fdtmWorkDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblaudit o) throws CloneNotSupportedException {
    o.fdtmPosted = (o.fdtmPosted != null) ? (java.sql.Timestamp) o.fdtmPosted.clone() : null;
    o.fdtmWorkDate = (o.fdtmWorkDate != null) ? (java.sql.Timestamp) o.fdtmWorkDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngAuditkey", this.flngAuditkey);
    __sqoop$field_map.put("fstrAuditType", this.fstrAuditType);
    __sqoop$field_map.put("fstrAuditId", this.fstrAuditId);
    __sqoop$field_map.put("fstrExternalID", this.fstrExternalID);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("flngFolderKey", this.flngFolderKey);
    __sqoop$field_map.put("flngTeamKey", this.flngTeamKey);
    __sqoop$field_map.put("flngJournalKey", this.flngJournalKey);
    __sqoop$field_map.put("fblnPosted", this.fblnPosted);
    __sqoop$field_map.put("fdtmPosted", this.fdtmPosted);
    __sqoop$field_map.put("fcurTotal", this.fcurTotal);
    __sqoop$field_map.put("fdblHours", this.fdblHours);
    __sqoop$field_map.put("flngIndicatorKey", this.flngIndicatorKey);
    __sqoop$field_map.put("flngPeriodIndKey", this.flngPeriodIndKey);
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fdtmWorkDate", this.fdtmWorkDate);
    __sqoop$field_map.put("flngAuditGroupKey", this.flngAuditGroupKey);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngAuditkey", this.flngAuditkey);
    __sqoop$field_map.put("fstrAuditType", this.fstrAuditType);
    __sqoop$field_map.put("fstrAuditId", this.fstrAuditId);
    __sqoop$field_map.put("fstrExternalID", this.fstrExternalID);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("flngFolderKey", this.flngFolderKey);
    __sqoop$field_map.put("flngTeamKey", this.flngTeamKey);
    __sqoop$field_map.put("flngJournalKey", this.flngJournalKey);
    __sqoop$field_map.put("fblnPosted", this.fblnPosted);
    __sqoop$field_map.put("fdtmPosted", this.fdtmPosted);
    __sqoop$field_map.put("fcurTotal", this.fcurTotal);
    __sqoop$field_map.put("fdblHours", this.fdblHours);
    __sqoop$field_map.put("flngIndicatorKey", this.flngIndicatorKey);
    __sqoop$field_map.put("flngPeriodIndKey", this.flngPeriodIndKey);
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fdtmWorkDate", this.fdtmWorkDate);
    __sqoop$field_map.put("flngAuditGroupKey", this.flngAuditGroupKey);
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
