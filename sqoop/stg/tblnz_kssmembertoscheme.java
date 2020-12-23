// ORM class for table 'tblnz_kssmembertoscheme'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 02:58:48 NZDT 2020
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

public class tblnz_kssmembertoscheme extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngRelationshipKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_kssmembertoscheme.this.flngRelationshipKey = (Integer)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_kssmembertoscheme.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_kssmembertoscheme.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("flngMemberCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_kssmembertoscheme.this.flngMemberCustomerKey = (Integer)value;
      }
    });
    setters.put("flngMemberAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_kssmembertoscheme.this.flngMemberAccountKey = (Integer)value;
      }
    });
    setters.put("flngIDKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_kssmembertoscheme.this.flngIDKey = (Integer)value;
      }
    });
    setters.put("flngSchemeCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_kssmembertoscheme.this.flngSchemeCustomerKey = (Integer)value;
      }
    });
    setters.put("flngSchemeAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_kssmembertoscheme.this.flngSchemeAccountKey = (Integer)value;
      }
    });
    setters.put("fdtmCommence", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_kssmembertoscheme.this.fdtmCommence = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmCease", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_kssmembertoscheme.this.fdtmCease = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmSchemeLinkDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_kssmembertoscheme.this.fdtmSchemeLinkDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fblnProvisional", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_kssmembertoscheme.this.fblnProvisional = (Integer)value;
      }
    });
    setters.put("fstrSchemeChoiceType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_kssmembertoscheme.this.fstrSchemeChoiceType = (String)value;
      }
    });
    setters.put("fstrCeaseReason", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_kssmembertoscheme.this.fstrCeaseReason = (String)value;
      }
    });
    setters.put("fstrClosureReason", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_kssmembertoscheme.this.fstrClosureReason = (String)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_kssmembertoscheme.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_kssmembertoscheme.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_kssmembertoscheme() {
    init0();
  }
  private Integer flngRelationshipKey;
  public Integer get_flngRelationshipKey() {
    return flngRelationshipKey;
  }
  public void set_flngRelationshipKey(Integer flngRelationshipKey) {
    this.flngRelationshipKey = flngRelationshipKey;
  }
  public tblnz_kssmembertoscheme with_flngRelationshipKey(Integer flngRelationshipKey) {
    this.flngRelationshipKey = flngRelationshipKey;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblnz_kssmembertoscheme with_flngVer(Integer flngVer) {
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
  public tblnz_kssmembertoscheme with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private Integer flngMemberCustomerKey;
  public Integer get_flngMemberCustomerKey() {
    return flngMemberCustomerKey;
  }
  public void set_flngMemberCustomerKey(Integer flngMemberCustomerKey) {
    this.flngMemberCustomerKey = flngMemberCustomerKey;
  }
  public tblnz_kssmembertoscheme with_flngMemberCustomerKey(Integer flngMemberCustomerKey) {
    this.flngMemberCustomerKey = flngMemberCustomerKey;
    return this;
  }
  private Integer flngMemberAccountKey;
  public Integer get_flngMemberAccountKey() {
    return flngMemberAccountKey;
  }
  public void set_flngMemberAccountKey(Integer flngMemberAccountKey) {
    this.flngMemberAccountKey = flngMemberAccountKey;
  }
  public tblnz_kssmembertoscheme with_flngMemberAccountKey(Integer flngMemberAccountKey) {
    this.flngMemberAccountKey = flngMemberAccountKey;
    return this;
  }
  private Integer flngIDKey;
  public Integer get_flngIDKey() {
    return flngIDKey;
  }
  public void set_flngIDKey(Integer flngIDKey) {
    this.flngIDKey = flngIDKey;
  }
  public tblnz_kssmembertoscheme with_flngIDKey(Integer flngIDKey) {
    this.flngIDKey = flngIDKey;
    return this;
  }
  private Integer flngSchemeCustomerKey;
  public Integer get_flngSchemeCustomerKey() {
    return flngSchemeCustomerKey;
  }
  public void set_flngSchemeCustomerKey(Integer flngSchemeCustomerKey) {
    this.flngSchemeCustomerKey = flngSchemeCustomerKey;
  }
  public tblnz_kssmembertoscheme with_flngSchemeCustomerKey(Integer flngSchemeCustomerKey) {
    this.flngSchemeCustomerKey = flngSchemeCustomerKey;
    return this;
  }
  private Integer flngSchemeAccountKey;
  public Integer get_flngSchemeAccountKey() {
    return flngSchemeAccountKey;
  }
  public void set_flngSchemeAccountKey(Integer flngSchemeAccountKey) {
    this.flngSchemeAccountKey = flngSchemeAccountKey;
  }
  public tblnz_kssmembertoscheme with_flngSchemeAccountKey(Integer flngSchemeAccountKey) {
    this.flngSchemeAccountKey = flngSchemeAccountKey;
    return this;
  }
  private java.sql.Timestamp fdtmCommence;
  public java.sql.Timestamp get_fdtmCommence() {
    return fdtmCommence;
  }
  public void set_fdtmCommence(java.sql.Timestamp fdtmCommence) {
    this.fdtmCommence = fdtmCommence;
  }
  public tblnz_kssmembertoscheme with_fdtmCommence(java.sql.Timestamp fdtmCommence) {
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
  public tblnz_kssmembertoscheme with_fdtmCease(java.sql.Timestamp fdtmCease) {
    this.fdtmCease = fdtmCease;
    return this;
  }
  private java.sql.Timestamp fdtmSchemeLinkDate;
  public java.sql.Timestamp get_fdtmSchemeLinkDate() {
    return fdtmSchemeLinkDate;
  }
  public void set_fdtmSchemeLinkDate(java.sql.Timestamp fdtmSchemeLinkDate) {
    this.fdtmSchemeLinkDate = fdtmSchemeLinkDate;
  }
  public tblnz_kssmembertoscheme with_fdtmSchemeLinkDate(java.sql.Timestamp fdtmSchemeLinkDate) {
    this.fdtmSchemeLinkDate = fdtmSchemeLinkDate;
    return this;
  }
  private Integer fblnProvisional;
  public Integer get_fblnProvisional() {
    return fblnProvisional;
  }
  public void set_fblnProvisional(Integer fblnProvisional) {
    this.fblnProvisional = fblnProvisional;
  }
  public tblnz_kssmembertoscheme with_fblnProvisional(Integer fblnProvisional) {
    this.fblnProvisional = fblnProvisional;
    return this;
  }
  private String fstrSchemeChoiceType;
  public String get_fstrSchemeChoiceType() {
    return fstrSchemeChoiceType;
  }
  public void set_fstrSchemeChoiceType(String fstrSchemeChoiceType) {
    this.fstrSchemeChoiceType = fstrSchemeChoiceType;
  }
  public tblnz_kssmembertoscheme with_fstrSchemeChoiceType(String fstrSchemeChoiceType) {
    this.fstrSchemeChoiceType = fstrSchemeChoiceType;
    return this;
  }
  private String fstrCeaseReason;
  public String get_fstrCeaseReason() {
    return fstrCeaseReason;
  }
  public void set_fstrCeaseReason(String fstrCeaseReason) {
    this.fstrCeaseReason = fstrCeaseReason;
  }
  public tblnz_kssmembertoscheme with_fstrCeaseReason(String fstrCeaseReason) {
    this.fstrCeaseReason = fstrCeaseReason;
    return this;
  }
  private String fstrClosureReason;
  public String get_fstrClosureReason() {
    return fstrClosureReason;
  }
  public void set_fstrClosureReason(String fstrClosureReason) {
    this.fstrClosureReason = fstrClosureReason;
  }
  public tblnz_kssmembertoscheme with_fstrClosureReason(String fstrClosureReason) {
    this.fstrClosureReason = fstrClosureReason;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_kssmembertoscheme with_fstrWho(String fstrWho) {
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
  public tblnz_kssmembertoscheme with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_kssmembertoscheme)) {
      return false;
    }
    tblnz_kssmembertoscheme that = (tblnz_kssmembertoscheme) o;
    boolean equal = true;
    equal = equal && (this.flngRelationshipKey == null ? that.flngRelationshipKey == null : this.flngRelationshipKey.equals(that.flngRelationshipKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngMemberCustomerKey == null ? that.flngMemberCustomerKey == null : this.flngMemberCustomerKey.equals(that.flngMemberCustomerKey));
    equal = equal && (this.flngMemberAccountKey == null ? that.flngMemberAccountKey == null : this.flngMemberAccountKey.equals(that.flngMemberAccountKey));
    equal = equal && (this.flngIDKey == null ? that.flngIDKey == null : this.flngIDKey.equals(that.flngIDKey));
    equal = equal && (this.flngSchemeCustomerKey == null ? that.flngSchemeCustomerKey == null : this.flngSchemeCustomerKey.equals(that.flngSchemeCustomerKey));
    equal = equal && (this.flngSchemeAccountKey == null ? that.flngSchemeAccountKey == null : this.flngSchemeAccountKey.equals(that.flngSchemeAccountKey));
    equal = equal && (this.fdtmCommence == null ? that.fdtmCommence == null : this.fdtmCommence.equals(that.fdtmCommence));
    equal = equal && (this.fdtmCease == null ? that.fdtmCease == null : this.fdtmCease.equals(that.fdtmCease));
    equal = equal && (this.fdtmSchemeLinkDate == null ? that.fdtmSchemeLinkDate == null : this.fdtmSchemeLinkDate.equals(that.fdtmSchemeLinkDate));
    equal = equal && (this.fblnProvisional == null ? that.fblnProvisional == null : this.fblnProvisional.equals(that.fblnProvisional));
    equal = equal && (this.fstrSchemeChoiceType == null ? that.fstrSchemeChoiceType == null : this.fstrSchemeChoiceType.equals(that.fstrSchemeChoiceType));
    equal = equal && (this.fstrCeaseReason == null ? that.fstrCeaseReason == null : this.fstrCeaseReason.equals(that.fstrCeaseReason));
    equal = equal && (this.fstrClosureReason == null ? that.fstrClosureReason == null : this.fstrClosureReason.equals(that.fstrClosureReason));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_kssmembertoscheme)) {
      return false;
    }
    tblnz_kssmembertoscheme that = (tblnz_kssmembertoscheme) o;
    boolean equal = true;
    equal = equal && (this.flngRelationshipKey == null ? that.flngRelationshipKey == null : this.flngRelationshipKey.equals(that.flngRelationshipKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngMemberCustomerKey == null ? that.flngMemberCustomerKey == null : this.flngMemberCustomerKey.equals(that.flngMemberCustomerKey));
    equal = equal && (this.flngMemberAccountKey == null ? that.flngMemberAccountKey == null : this.flngMemberAccountKey.equals(that.flngMemberAccountKey));
    equal = equal && (this.flngIDKey == null ? that.flngIDKey == null : this.flngIDKey.equals(that.flngIDKey));
    equal = equal && (this.flngSchemeCustomerKey == null ? that.flngSchemeCustomerKey == null : this.flngSchemeCustomerKey.equals(that.flngSchemeCustomerKey));
    equal = equal && (this.flngSchemeAccountKey == null ? that.flngSchemeAccountKey == null : this.flngSchemeAccountKey.equals(that.flngSchemeAccountKey));
    equal = equal && (this.fdtmCommence == null ? that.fdtmCommence == null : this.fdtmCommence.equals(that.fdtmCommence));
    equal = equal && (this.fdtmCease == null ? that.fdtmCease == null : this.fdtmCease.equals(that.fdtmCease));
    equal = equal && (this.fdtmSchemeLinkDate == null ? that.fdtmSchemeLinkDate == null : this.fdtmSchemeLinkDate.equals(that.fdtmSchemeLinkDate));
    equal = equal && (this.fblnProvisional == null ? that.fblnProvisional == null : this.fblnProvisional.equals(that.fblnProvisional));
    equal = equal && (this.fstrSchemeChoiceType == null ? that.fstrSchemeChoiceType == null : this.fstrSchemeChoiceType.equals(that.fstrSchemeChoiceType));
    equal = equal && (this.fstrCeaseReason == null ? that.fstrCeaseReason == null : this.fstrCeaseReason.equals(that.fstrCeaseReason));
    equal = equal && (this.fstrClosureReason == null ? that.fstrClosureReason == null : this.fstrClosureReason.equals(that.fstrClosureReason));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngRelationshipKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngMemberCustomerKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngMemberAccountKey = JdbcWritableBridge.readInteger(5, __dbResults);
    this.flngIDKey = JdbcWritableBridge.readInteger(6, __dbResults);
    this.flngSchemeCustomerKey = JdbcWritableBridge.readInteger(7, __dbResults);
    this.flngSchemeAccountKey = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fdtmCommence = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.fdtmCease = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.fdtmSchemeLinkDate = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.fblnProvisional = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fstrSchemeChoiceType = JdbcWritableBridge.readString(13, __dbResults);
    this.fstrCeaseReason = JdbcWritableBridge.readString(14, __dbResults);
    this.fstrClosureReason = JdbcWritableBridge.readString(15, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(16, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(17, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngRelationshipKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngMemberCustomerKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngMemberAccountKey = JdbcWritableBridge.readInteger(5, __dbResults);
    this.flngIDKey = JdbcWritableBridge.readInteger(6, __dbResults);
    this.flngSchemeCustomerKey = JdbcWritableBridge.readInteger(7, __dbResults);
    this.flngSchemeAccountKey = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fdtmCommence = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.fdtmCease = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.fdtmSchemeLinkDate = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.fblnProvisional = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fstrSchemeChoiceType = JdbcWritableBridge.readString(13, __dbResults);
    this.fstrCeaseReason = JdbcWritableBridge.readString(14, __dbResults);
    this.fstrClosureReason = JdbcWritableBridge.readString(15, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(16, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(17, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngRelationshipKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngMemberCustomerKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngMemberAccountKey, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngIDKey, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngSchemeCustomerKey, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngSchemeAccountKey, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCommence, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCease, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmSchemeLinkDate, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnProvisional, 12 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrSchemeChoiceType, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCeaseReason, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrClosureReason, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 17 + __off, 93, __dbStmt);
    return 17;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngRelationshipKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngMemberCustomerKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngMemberAccountKey, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngIDKey, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngSchemeCustomerKey, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngSchemeAccountKey, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCommence, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCease, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmSchemeLinkDate, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnProvisional, 12 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrSchemeChoiceType, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCeaseReason, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrClosureReason, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 17 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngRelationshipKey = null;
    } else {
    this.flngRelationshipKey = Integer.valueOf(__dataIn.readInt());
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
        this.flngMemberCustomerKey = null;
    } else {
    this.flngMemberCustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngMemberAccountKey = null;
    } else {
    this.flngMemberAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngIDKey = null;
    } else {
    this.flngIDKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngSchemeCustomerKey = null;
    } else {
    this.flngSchemeCustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngSchemeAccountKey = null;
    } else {
    this.flngSchemeAccountKey = Integer.valueOf(__dataIn.readInt());
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
        this.fdtmSchemeLinkDate = null;
    } else {
    this.fdtmSchemeLinkDate = new Timestamp(__dataIn.readLong());
    this.fdtmSchemeLinkDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnProvisional = null;
    } else {
    this.fblnProvisional = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSchemeChoiceType = null;
    } else {
    this.fstrSchemeChoiceType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCeaseReason = null;
    } else {
    this.fstrCeaseReason = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrClosureReason = null;
    } else {
    this.fstrClosureReason = Text.readString(__dataIn);
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
    if (null == this.flngRelationshipKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngRelationshipKey);
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
    if (null == this.flngMemberCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngMemberCustomerKey);
    }
    if (null == this.flngMemberAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngMemberAccountKey);
    }
    if (null == this.flngIDKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngIDKey);
    }
    if (null == this.flngSchemeCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngSchemeCustomerKey);
    }
    if (null == this.flngSchemeAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngSchemeAccountKey);
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
    if (null == this.fdtmSchemeLinkDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmSchemeLinkDate.getTime());
    __dataOut.writeInt(this.fdtmSchemeLinkDate.getNanos());
    }
    if (null == this.fblnProvisional) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnProvisional);
    }
    if (null == this.fstrSchemeChoiceType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSchemeChoiceType);
    }
    if (null == this.fstrCeaseReason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCeaseReason);
    }
    if (null == this.fstrClosureReason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrClosureReason);
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
    if (null == this.flngRelationshipKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngRelationshipKey);
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
    if (null == this.flngMemberCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngMemberCustomerKey);
    }
    if (null == this.flngMemberAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngMemberAccountKey);
    }
    if (null == this.flngIDKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngIDKey);
    }
    if (null == this.flngSchemeCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngSchemeCustomerKey);
    }
    if (null == this.flngSchemeAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngSchemeAccountKey);
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
    if (null == this.fdtmSchemeLinkDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmSchemeLinkDate.getTime());
    __dataOut.writeInt(this.fdtmSchemeLinkDate.getNanos());
    }
    if (null == this.fblnProvisional) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnProvisional);
    }
    if (null == this.fstrSchemeChoiceType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSchemeChoiceType);
    }
    if (null == this.fstrCeaseReason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCeaseReason);
    }
    if (null == this.fstrClosureReason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrClosureReason);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngRelationshipKey==null?"\\N":"" + flngRelationshipKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngMemberCustomerKey==null?"\\N":"" + flngMemberCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngMemberAccountKey==null?"\\N":"" + flngMemberAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngIDKey==null?"\\N":"" + flngIDKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngSchemeCustomerKey==null?"\\N":"" + flngSchemeCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngSchemeAccountKey==null?"\\N":"" + flngSchemeAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCommence==null?"\\N":"" + fdtmCommence, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCease==null?"\\N":"" + fdtmCease, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmSchemeLinkDate==null?"\\N":"" + fdtmSchemeLinkDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnProvisional==null?"\\N":"" + fblnProvisional, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSchemeChoiceType==null?"\\N":fstrSchemeChoiceType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCeaseReason==null?"\\N":fstrCeaseReason, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrClosureReason==null?"\\N":fstrClosureReason, " ", delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngRelationshipKey==null?"\\N":"" + flngRelationshipKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngMemberCustomerKey==null?"\\N":"" + flngMemberCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngMemberAccountKey==null?"\\N":"" + flngMemberAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngIDKey==null?"\\N":"" + flngIDKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngSchemeCustomerKey==null?"\\N":"" + flngSchemeCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngSchemeAccountKey==null?"\\N":"" + flngSchemeAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCommence==null?"\\N":"" + fdtmCommence, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCease==null?"\\N":"" + fdtmCease, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmSchemeLinkDate==null?"\\N":"" + fdtmSchemeLinkDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnProvisional==null?"\\N":"" + fblnProvisional, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSchemeChoiceType==null?"\\N":fstrSchemeChoiceType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCeaseReason==null?"\\N":fstrCeaseReason, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrClosureReason==null?"\\N":fstrClosureReason, " ", delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngRelationshipKey = null; } else {
      this.flngRelationshipKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngMemberCustomerKey = null; } else {
      this.flngMemberCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngMemberAccountKey = null; } else {
      this.flngMemberAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngIDKey = null; } else {
      this.flngIDKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngSchemeCustomerKey = null; } else {
      this.flngSchemeCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngSchemeAccountKey = null; } else {
      this.flngSchemeAccountKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmSchemeLinkDate = null; } else {
      this.fdtmSchemeLinkDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnProvisional = null; } else {
      this.fblnProvisional = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSchemeChoiceType = null; } else {
      this.fstrSchemeChoiceType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCeaseReason = null; } else {
      this.fstrCeaseReason = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrClosureReason = null; } else {
      this.fstrClosureReason = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngRelationshipKey = null; } else {
      this.flngRelationshipKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngMemberCustomerKey = null; } else {
      this.flngMemberCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngMemberAccountKey = null; } else {
      this.flngMemberAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngIDKey = null; } else {
      this.flngIDKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngSchemeCustomerKey = null; } else {
      this.flngSchemeCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngSchemeAccountKey = null; } else {
      this.flngSchemeAccountKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmSchemeLinkDate = null; } else {
      this.fdtmSchemeLinkDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnProvisional = null; } else {
      this.fblnProvisional = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSchemeChoiceType = null; } else {
      this.fstrSchemeChoiceType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCeaseReason = null; } else {
      this.fstrCeaseReason = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrClosureReason = null; } else {
      this.fstrClosureReason = __cur_str;
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
    tblnz_kssmembertoscheme o = (tblnz_kssmembertoscheme) super.clone();
    o.fdtmCommence = (o.fdtmCommence != null) ? (java.sql.Timestamp) o.fdtmCommence.clone() : null;
    o.fdtmCease = (o.fdtmCease != null) ? (java.sql.Timestamp) o.fdtmCease.clone() : null;
    o.fdtmSchemeLinkDate = (o.fdtmSchemeLinkDate != null) ? (java.sql.Timestamp) o.fdtmSchemeLinkDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_kssmembertoscheme o) throws CloneNotSupportedException {
    o.fdtmCommence = (o.fdtmCommence != null) ? (java.sql.Timestamp) o.fdtmCommence.clone() : null;
    o.fdtmCease = (o.fdtmCease != null) ? (java.sql.Timestamp) o.fdtmCease.clone() : null;
    o.fdtmSchemeLinkDate = (o.fdtmSchemeLinkDate != null) ? (java.sql.Timestamp) o.fdtmSchemeLinkDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngRelationshipKey", this.flngRelationshipKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngMemberCustomerKey", this.flngMemberCustomerKey);
    __sqoop$field_map.put("flngMemberAccountKey", this.flngMemberAccountKey);
    __sqoop$field_map.put("flngIDKey", this.flngIDKey);
    __sqoop$field_map.put("flngSchemeCustomerKey", this.flngSchemeCustomerKey);
    __sqoop$field_map.put("flngSchemeAccountKey", this.flngSchemeAccountKey);
    __sqoop$field_map.put("fdtmCommence", this.fdtmCommence);
    __sqoop$field_map.put("fdtmCease", this.fdtmCease);
    __sqoop$field_map.put("fdtmSchemeLinkDate", this.fdtmSchemeLinkDate);
    __sqoop$field_map.put("fblnProvisional", this.fblnProvisional);
    __sqoop$field_map.put("fstrSchemeChoiceType", this.fstrSchemeChoiceType);
    __sqoop$field_map.put("fstrCeaseReason", this.fstrCeaseReason);
    __sqoop$field_map.put("fstrClosureReason", this.fstrClosureReason);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngRelationshipKey", this.flngRelationshipKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngMemberCustomerKey", this.flngMemberCustomerKey);
    __sqoop$field_map.put("flngMemberAccountKey", this.flngMemberAccountKey);
    __sqoop$field_map.put("flngIDKey", this.flngIDKey);
    __sqoop$field_map.put("flngSchemeCustomerKey", this.flngSchemeCustomerKey);
    __sqoop$field_map.put("flngSchemeAccountKey", this.flngSchemeAccountKey);
    __sqoop$field_map.put("fdtmCommence", this.fdtmCommence);
    __sqoop$field_map.put("fdtmCease", this.fdtmCease);
    __sqoop$field_map.put("fdtmSchemeLinkDate", this.fdtmSchemeLinkDate);
    __sqoop$field_map.put("fblnProvisional", this.fblnProvisional);
    __sqoop$field_map.put("fstrSchemeChoiceType", this.fstrSchemeChoiceType);
    __sqoop$field_map.put("fstrCeaseReason", this.fstrCeaseReason);
    __sqoop$field_map.put("fstrClosureReason", this.fstrClosureReason);
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
