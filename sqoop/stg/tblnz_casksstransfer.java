// ORM class for table 'tblnz_casksstransfer'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 05:28:19 NZDT 2020
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

public class tblnz_casksstransfer extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casksstransfer.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("flngCaseKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casksstransfer.this.flngCaseKey = (Integer)value;
      }
    });
    setters.put("fi64KSB2BKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casksstransfer.this.fi64KSB2BKey = (Long)value;
      }
    });
    setters.put("flngOldSchemeCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casksstransfer.this.flngOldSchemeCustomerKey = (Integer)value;
      }
    });
    setters.put("flngOldSchemeAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casksstransfer.this.flngOldSchemeAccountKey = (Integer)value;
      }
    });
    setters.put("flngOldSchemeRelationshipKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casksstransfer.this.flngOldSchemeRelationshipKey = (Integer)value;
      }
    });
    setters.put("fi64OldSchemeB2BKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casksstransfer.this.fi64OldSchemeB2BKey = (Long)value;
      }
    });
    setters.put("fi64ProviderClosurePaperKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casksstransfer.this.fi64ProviderClosurePaperKey = (Long)value;
      }
    });
    setters.put("flngNewSchemeCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casksstransfer.this.flngNewSchemeCustomerKey = (Integer)value;
      }
    });
    setters.put("flngNewSchemeAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casksstransfer.this.flngNewSchemeAccountKey = (Integer)value;
      }
    });
    setters.put("flngNewSchemeRelationshipKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casksstransfer.this.flngNewSchemeRelationshipKey = (Integer)value;
      }
    });
    setters.put("fi64NewSchemeB2BKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casksstransfer.this.fi64NewSchemeB2BKey = (Long)value;
      }
    });
    setters.put("fi64TransferNoticePaperKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casksstransfer.this.fi64TransferNoticePaperKey = (Long)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casksstransfer.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casksstransfer.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_casksstransfer() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_casksstransfer with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private Integer flngCaseKey;
  public Integer get_flngCaseKey() {
    return flngCaseKey;
  }
  public void set_flngCaseKey(Integer flngCaseKey) {
    this.flngCaseKey = flngCaseKey;
  }
  public tblnz_casksstransfer with_flngCaseKey(Integer flngCaseKey) {
    this.flngCaseKey = flngCaseKey;
    return this;
  }
  private Long fi64KSB2BKey;
  public Long get_fi64KSB2BKey() {
    return fi64KSB2BKey;
  }
  public void set_fi64KSB2BKey(Long fi64KSB2BKey) {
    this.fi64KSB2BKey = fi64KSB2BKey;
  }
  public tblnz_casksstransfer with_fi64KSB2BKey(Long fi64KSB2BKey) {
    this.fi64KSB2BKey = fi64KSB2BKey;
    return this;
  }
  private Integer flngOldSchemeCustomerKey;
  public Integer get_flngOldSchemeCustomerKey() {
    return flngOldSchemeCustomerKey;
  }
  public void set_flngOldSchemeCustomerKey(Integer flngOldSchemeCustomerKey) {
    this.flngOldSchemeCustomerKey = flngOldSchemeCustomerKey;
  }
  public tblnz_casksstransfer with_flngOldSchemeCustomerKey(Integer flngOldSchemeCustomerKey) {
    this.flngOldSchemeCustomerKey = flngOldSchemeCustomerKey;
    return this;
  }
  private Integer flngOldSchemeAccountKey;
  public Integer get_flngOldSchemeAccountKey() {
    return flngOldSchemeAccountKey;
  }
  public void set_flngOldSchemeAccountKey(Integer flngOldSchemeAccountKey) {
    this.flngOldSchemeAccountKey = flngOldSchemeAccountKey;
  }
  public tblnz_casksstransfer with_flngOldSchemeAccountKey(Integer flngOldSchemeAccountKey) {
    this.flngOldSchemeAccountKey = flngOldSchemeAccountKey;
    return this;
  }
  private Integer flngOldSchemeRelationshipKey;
  public Integer get_flngOldSchemeRelationshipKey() {
    return flngOldSchemeRelationshipKey;
  }
  public void set_flngOldSchemeRelationshipKey(Integer flngOldSchemeRelationshipKey) {
    this.flngOldSchemeRelationshipKey = flngOldSchemeRelationshipKey;
  }
  public tblnz_casksstransfer with_flngOldSchemeRelationshipKey(Integer flngOldSchemeRelationshipKey) {
    this.flngOldSchemeRelationshipKey = flngOldSchemeRelationshipKey;
    return this;
  }
  private Long fi64OldSchemeB2BKey;
  public Long get_fi64OldSchemeB2BKey() {
    return fi64OldSchemeB2BKey;
  }
  public void set_fi64OldSchemeB2BKey(Long fi64OldSchemeB2BKey) {
    this.fi64OldSchemeB2BKey = fi64OldSchemeB2BKey;
  }
  public tblnz_casksstransfer with_fi64OldSchemeB2BKey(Long fi64OldSchemeB2BKey) {
    this.fi64OldSchemeB2BKey = fi64OldSchemeB2BKey;
    return this;
  }
  private Long fi64ProviderClosurePaperKey;
  public Long get_fi64ProviderClosurePaperKey() {
    return fi64ProviderClosurePaperKey;
  }
  public void set_fi64ProviderClosurePaperKey(Long fi64ProviderClosurePaperKey) {
    this.fi64ProviderClosurePaperKey = fi64ProviderClosurePaperKey;
  }
  public tblnz_casksstransfer with_fi64ProviderClosurePaperKey(Long fi64ProviderClosurePaperKey) {
    this.fi64ProviderClosurePaperKey = fi64ProviderClosurePaperKey;
    return this;
  }
  private Integer flngNewSchemeCustomerKey;
  public Integer get_flngNewSchemeCustomerKey() {
    return flngNewSchemeCustomerKey;
  }
  public void set_flngNewSchemeCustomerKey(Integer flngNewSchemeCustomerKey) {
    this.flngNewSchemeCustomerKey = flngNewSchemeCustomerKey;
  }
  public tblnz_casksstransfer with_flngNewSchemeCustomerKey(Integer flngNewSchemeCustomerKey) {
    this.flngNewSchemeCustomerKey = flngNewSchemeCustomerKey;
    return this;
  }
  private Integer flngNewSchemeAccountKey;
  public Integer get_flngNewSchemeAccountKey() {
    return flngNewSchemeAccountKey;
  }
  public void set_flngNewSchemeAccountKey(Integer flngNewSchemeAccountKey) {
    this.flngNewSchemeAccountKey = flngNewSchemeAccountKey;
  }
  public tblnz_casksstransfer with_flngNewSchemeAccountKey(Integer flngNewSchemeAccountKey) {
    this.flngNewSchemeAccountKey = flngNewSchemeAccountKey;
    return this;
  }
  private Integer flngNewSchemeRelationshipKey;
  public Integer get_flngNewSchemeRelationshipKey() {
    return flngNewSchemeRelationshipKey;
  }
  public void set_flngNewSchemeRelationshipKey(Integer flngNewSchemeRelationshipKey) {
    this.flngNewSchemeRelationshipKey = flngNewSchemeRelationshipKey;
  }
  public tblnz_casksstransfer with_flngNewSchemeRelationshipKey(Integer flngNewSchemeRelationshipKey) {
    this.flngNewSchemeRelationshipKey = flngNewSchemeRelationshipKey;
    return this;
  }
  private Long fi64NewSchemeB2BKey;
  public Long get_fi64NewSchemeB2BKey() {
    return fi64NewSchemeB2BKey;
  }
  public void set_fi64NewSchemeB2BKey(Long fi64NewSchemeB2BKey) {
    this.fi64NewSchemeB2BKey = fi64NewSchemeB2BKey;
  }
  public tblnz_casksstransfer with_fi64NewSchemeB2BKey(Long fi64NewSchemeB2BKey) {
    this.fi64NewSchemeB2BKey = fi64NewSchemeB2BKey;
    return this;
  }
  private Long fi64TransferNoticePaperKey;
  public Long get_fi64TransferNoticePaperKey() {
    return fi64TransferNoticePaperKey;
  }
  public void set_fi64TransferNoticePaperKey(Long fi64TransferNoticePaperKey) {
    this.fi64TransferNoticePaperKey = fi64TransferNoticePaperKey;
  }
  public tblnz_casksstransfer with_fi64TransferNoticePaperKey(Long fi64TransferNoticePaperKey) {
    this.fi64TransferNoticePaperKey = fi64TransferNoticePaperKey;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_casksstransfer with_fstrWho(String fstrWho) {
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
  public tblnz_casksstransfer with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_casksstransfer)) {
      return false;
    }
    tblnz_casksstransfer that = (tblnz_casksstransfer) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.flngCaseKey == null ? that.flngCaseKey == null : this.flngCaseKey.equals(that.flngCaseKey));
    equal = equal && (this.fi64KSB2BKey == null ? that.fi64KSB2BKey == null : this.fi64KSB2BKey.equals(that.fi64KSB2BKey));
    equal = equal && (this.flngOldSchemeCustomerKey == null ? that.flngOldSchemeCustomerKey == null : this.flngOldSchemeCustomerKey.equals(that.flngOldSchemeCustomerKey));
    equal = equal && (this.flngOldSchemeAccountKey == null ? that.flngOldSchemeAccountKey == null : this.flngOldSchemeAccountKey.equals(that.flngOldSchemeAccountKey));
    equal = equal && (this.flngOldSchemeRelationshipKey == null ? that.flngOldSchemeRelationshipKey == null : this.flngOldSchemeRelationshipKey.equals(that.flngOldSchemeRelationshipKey));
    equal = equal && (this.fi64OldSchemeB2BKey == null ? that.fi64OldSchemeB2BKey == null : this.fi64OldSchemeB2BKey.equals(that.fi64OldSchemeB2BKey));
    equal = equal && (this.fi64ProviderClosurePaperKey == null ? that.fi64ProviderClosurePaperKey == null : this.fi64ProviderClosurePaperKey.equals(that.fi64ProviderClosurePaperKey));
    equal = equal && (this.flngNewSchemeCustomerKey == null ? that.flngNewSchemeCustomerKey == null : this.flngNewSchemeCustomerKey.equals(that.flngNewSchemeCustomerKey));
    equal = equal && (this.flngNewSchemeAccountKey == null ? that.flngNewSchemeAccountKey == null : this.flngNewSchemeAccountKey.equals(that.flngNewSchemeAccountKey));
    equal = equal && (this.flngNewSchemeRelationshipKey == null ? that.flngNewSchemeRelationshipKey == null : this.flngNewSchemeRelationshipKey.equals(that.flngNewSchemeRelationshipKey));
    equal = equal && (this.fi64NewSchemeB2BKey == null ? that.fi64NewSchemeB2BKey == null : this.fi64NewSchemeB2BKey.equals(that.fi64NewSchemeB2BKey));
    equal = equal && (this.fi64TransferNoticePaperKey == null ? that.fi64TransferNoticePaperKey == null : this.fi64TransferNoticePaperKey.equals(that.fi64TransferNoticePaperKey));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_casksstransfer)) {
      return false;
    }
    tblnz_casksstransfer that = (tblnz_casksstransfer) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.flngCaseKey == null ? that.flngCaseKey == null : this.flngCaseKey.equals(that.flngCaseKey));
    equal = equal && (this.fi64KSB2BKey == null ? that.fi64KSB2BKey == null : this.fi64KSB2BKey.equals(that.fi64KSB2BKey));
    equal = equal && (this.flngOldSchemeCustomerKey == null ? that.flngOldSchemeCustomerKey == null : this.flngOldSchemeCustomerKey.equals(that.flngOldSchemeCustomerKey));
    equal = equal && (this.flngOldSchemeAccountKey == null ? that.flngOldSchemeAccountKey == null : this.flngOldSchemeAccountKey.equals(that.flngOldSchemeAccountKey));
    equal = equal && (this.flngOldSchemeRelationshipKey == null ? that.flngOldSchemeRelationshipKey == null : this.flngOldSchemeRelationshipKey.equals(that.flngOldSchemeRelationshipKey));
    equal = equal && (this.fi64OldSchemeB2BKey == null ? that.fi64OldSchemeB2BKey == null : this.fi64OldSchemeB2BKey.equals(that.fi64OldSchemeB2BKey));
    equal = equal && (this.fi64ProviderClosurePaperKey == null ? that.fi64ProviderClosurePaperKey == null : this.fi64ProviderClosurePaperKey.equals(that.fi64ProviderClosurePaperKey));
    equal = equal && (this.flngNewSchemeCustomerKey == null ? that.flngNewSchemeCustomerKey == null : this.flngNewSchemeCustomerKey.equals(that.flngNewSchemeCustomerKey));
    equal = equal && (this.flngNewSchemeAccountKey == null ? that.flngNewSchemeAccountKey == null : this.flngNewSchemeAccountKey.equals(that.flngNewSchemeAccountKey));
    equal = equal && (this.flngNewSchemeRelationshipKey == null ? that.flngNewSchemeRelationshipKey == null : this.flngNewSchemeRelationshipKey.equals(that.flngNewSchemeRelationshipKey));
    equal = equal && (this.fi64NewSchemeB2BKey == null ? that.fi64NewSchemeB2BKey == null : this.fi64NewSchemeB2BKey.equals(that.fi64NewSchemeB2BKey));
    equal = equal && (this.fi64TransferNoticePaperKey == null ? that.fi64TransferNoticePaperKey == null : this.fi64TransferNoticePaperKey.equals(that.fi64TransferNoticePaperKey));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngCaseKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fi64KSB2BKey = JdbcWritableBridge.readLong(3, __dbResults);
    this.flngOldSchemeCustomerKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngOldSchemeAccountKey = JdbcWritableBridge.readInteger(5, __dbResults);
    this.flngOldSchemeRelationshipKey = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fi64OldSchemeB2BKey = JdbcWritableBridge.readLong(7, __dbResults);
    this.fi64ProviderClosurePaperKey = JdbcWritableBridge.readLong(8, __dbResults);
    this.flngNewSchemeCustomerKey = JdbcWritableBridge.readInteger(9, __dbResults);
    this.flngNewSchemeAccountKey = JdbcWritableBridge.readInteger(10, __dbResults);
    this.flngNewSchemeRelationshipKey = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fi64NewSchemeB2BKey = JdbcWritableBridge.readLong(12, __dbResults);
    this.fi64TransferNoticePaperKey = JdbcWritableBridge.readLong(13, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(14, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(15, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngCaseKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fi64KSB2BKey = JdbcWritableBridge.readLong(3, __dbResults);
    this.flngOldSchemeCustomerKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngOldSchemeAccountKey = JdbcWritableBridge.readInteger(5, __dbResults);
    this.flngOldSchemeRelationshipKey = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fi64OldSchemeB2BKey = JdbcWritableBridge.readLong(7, __dbResults);
    this.fi64ProviderClosurePaperKey = JdbcWritableBridge.readLong(8, __dbResults);
    this.flngNewSchemeCustomerKey = JdbcWritableBridge.readInteger(9, __dbResults);
    this.flngNewSchemeAccountKey = JdbcWritableBridge.readInteger(10, __dbResults);
    this.flngNewSchemeRelationshipKey = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fi64NewSchemeB2BKey = JdbcWritableBridge.readLong(12, __dbResults);
    this.fi64TransferNoticePaperKey = JdbcWritableBridge.readLong(13, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCaseKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(fi64KSB2BKey, 3 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngOldSchemeCustomerKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngOldSchemeAccountKey, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngOldSchemeRelationshipKey, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(fi64OldSchemeB2BKey, 7 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(fi64ProviderClosurePaperKey, 8 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngNewSchemeCustomerKey, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngNewSchemeAccountKey, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngNewSchemeRelationshipKey, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(fi64NewSchemeB2BKey, 12 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(fi64TransferNoticePaperKey, 13 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 15 + __off, 93, __dbStmt);
    return 15;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCaseKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(fi64KSB2BKey, 3 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngOldSchemeCustomerKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngOldSchemeAccountKey, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngOldSchemeRelationshipKey, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(fi64OldSchemeB2BKey, 7 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(fi64ProviderClosurePaperKey, 8 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngNewSchemeCustomerKey, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngNewSchemeAccountKey, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngNewSchemeRelationshipKey, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(fi64NewSchemeB2BKey, 12 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(fi64TransferNoticePaperKey, 13 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 15 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngDocKey = null;
    } else {
    this.flngDocKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngCaseKey = null;
    } else {
    this.flngCaseKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fi64KSB2BKey = null;
    } else {
    this.fi64KSB2BKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.flngOldSchemeCustomerKey = null;
    } else {
    this.flngOldSchemeCustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngOldSchemeAccountKey = null;
    } else {
    this.flngOldSchemeAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngOldSchemeRelationshipKey = null;
    } else {
    this.flngOldSchemeRelationshipKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fi64OldSchemeB2BKey = null;
    } else {
    this.fi64OldSchemeB2BKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.fi64ProviderClosurePaperKey = null;
    } else {
    this.fi64ProviderClosurePaperKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.flngNewSchemeCustomerKey = null;
    } else {
    this.flngNewSchemeCustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngNewSchemeAccountKey = null;
    } else {
    this.flngNewSchemeAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngNewSchemeRelationshipKey = null;
    } else {
    this.flngNewSchemeRelationshipKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fi64NewSchemeB2BKey = null;
    } else {
    this.fi64NewSchemeB2BKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.fi64TransferNoticePaperKey = null;
    } else {
    this.fi64TransferNoticePaperKey = Long.valueOf(__dataIn.readLong());
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
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.flngCaseKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCaseKey);
    }
    if (null == this.fi64KSB2BKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64KSB2BKey);
    }
    if (null == this.flngOldSchemeCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngOldSchemeCustomerKey);
    }
    if (null == this.flngOldSchemeAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngOldSchemeAccountKey);
    }
    if (null == this.flngOldSchemeRelationshipKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngOldSchemeRelationshipKey);
    }
    if (null == this.fi64OldSchemeB2BKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64OldSchemeB2BKey);
    }
    if (null == this.fi64ProviderClosurePaperKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64ProviderClosurePaperKey);
    }
    if (null == this.flngNewSchemeCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngNewSchemeCustomerKey);
    }
    if (null == this.flngNewSchemeAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngNewSchemeAccountKey);
    }
    if (null == this.flngNewSchemeRelationshipKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngNewSchemeRelationshipKey);
    }
    if (null == this.fi64NewSchemeB2BKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64NewSchemeB2BKey);
    }
    if (null == this.fi64TransferNoticePaperKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64TransferNoticePaperKey);
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
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.flngCaseKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCaseKey);
    }
    if (null == this.fi64KSB2BKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64KSB2BKey);
    }
    if (null == this.flngOldSchemeCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngOldSchemeCustomerKey);
    }
    if (null == this.flngOldSchemeAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngOldSchemeAccountKey);
    }
    if (null == this.flngOldSchemeRelationshipKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngOldSchemeRelationshipKey);
    }
    if (null == this.fi64OldSchemeB2BKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64OldSchemeB2BKey);
    }
    if (null == this.fi64ProviderClosurePaperKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64ProviderClosurePaperKey);
    }
    if (null == this.flngNewSchemeCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngNewSchemeCustomerKey);
    }
    if (null == this.flngNewSchemeAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngNewSchemeAccountKey);
    }
    if (null == this.flngNewSchemeRelationshipKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngNewSchemeRelationshipKey);
    }
    if (null == this.fi64NewSchemeB2BKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64NewSchemeB2BKey);
    }
    if (null == this.fi64TransferNoticePaperKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64TransferNoticePaperKey);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCaseKey==null?"\\N":"" + flngCaseKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64KSB2BKey==null?"\\N":"" + fi64KSB2BKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngOldSchemeCustomerKey==null?"\\N":"" + flngOldSchemeCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngOldSchemeAccountKey==null?"\\N":"" + flngOldSchemeAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngOldSchemeRelationshipKey==null?"\\N":"" + flngOldSchemeRelationshipKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64OldSchemeB2BKey==null?"\\N":"" + fi64OldSchemeB2BKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64ProviderClosurePaperKey==null?"\\N":"" + fi64ProviderClosurePaperKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngNewSchemeCustomerKey==null?"\\N":"" + flngNewSchemeCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngNewSchemeAccountKey==null?"\\N":"" + flngNewSchemeAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngNewSchemeRelationshipKey==null?"\\N":"" + flngNewSchemeRelationshipKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64NewSchemeB2BKey==null?"\\N":"" + fi64NewSchemeB2BKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64TransferNoticePaperKey==null?"\\N":"" + fi64TransferNoticePaperKey, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCaseKey==null?"\\N":"" + flngCaseKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64KSB2BKey==null?"\\N":"" + fi64KSB2BKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngOldSchemeCustomerKey==null?"\\N":"" + flngOldSchemeCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngOldSchemeAccountKey==null?"\\N":"" + flngOldSchemeAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngOldSchemeRelationshipKey==null?"\\N":"" + flngOldSchemeRelationshipKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64OldSchemeB2BKey==null?"\\N":"" + fi64OldSchemeB2BKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64ProviderClosurePaperKey==null?"\\N":"" + fi64ProviderClosurePaperKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngNewSchemeCustomerKey==null?"\\N":"" + flngNewSchemeCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngNewSchemeAccountKey==null?"\\N":"" + flngNewSchemeAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngNewSchemeRelationshipKey==null?"\\N":"" + flngNewSchemeRelationshipKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64NewSchemeB2BKey==null?"\\N":"" + fi64NewSchemeB2BKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64TransferNoticePaperKey==null?"\\N":"" + fi64TransferNoticePaperKey, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDocKey = null; } else {
      this.flngDocKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCaseKey = null; } else {
      this.flngCaseKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64KSB2BKey = null; } else {
      this.fi64KSB2BKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngOldSchemeCustomerKey = null; } else {
      this.flngOldSchemeCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngOldSchemeAccountKey = null; } else {
      this.flngOldSchemeAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngOldSchemeRelationshipKey = null; } else {
      this.flngOldSchemeRelationshipKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64OldSchemeB2BKey = null; } else {
      this.fi64OldSchemeB2BKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64ProviderClosurePaperKey = null; } else {
      this.fi64ProviderClosurePaperKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngNewSchemeCustomerKey = null; } else {
      this.flngNewSchemeCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngNewSchemeAccountKey = null; } else {
      this.flngNewSchemeAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngNewSchemeRelationshipKey = null; } else {
      this.flngNewSchemeRelationshipKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64NewSchemeB2BKey = null; } else {
      this.fi64NewSchemeB2BKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64TransferNoticePaperKey = null; } else {
      this.fi64TransferNoticePaperKey = Long.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDocKey = null; } else {
      this.flngDocKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCaseKey = null; } else {
      this.flngCaseKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64KSB2BKey = null; } else {
      this.fi64KSB2BKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngOldSchemeCustomerKey = null; } else {
      this.flngOldSchemeCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngOldSchemeAccountKey = null; } else {
      this.flngOldSchemeAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngOldSchemeRelationshipKey = null; } else {
      this.flngOldSchemeRelationshipKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64OldSchemeB2BKey = null; } else {
      this.fi64OldSchemeB2BKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64ProviderClosurePaperKey = null; } else {
      this.fi64ProviderClosurePaperKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngNewSchemeCustomerKey = null; } else {
      this.flngNewSchemeCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngNewSchemeAccountKey = null; } else {
      this.flngNewSchemeAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngNewSchemeRelationshipKey = null; } else {
      this.flngNewSchemeRelationshipKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64NewSchemeB2BKey = null; } else {
      this.fi64NewSchemeB2BKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64TransferNoticePaperKey = null; } else {
      this.fi64TransferNoticePaperKey = Long.valueOf(__cur_str);
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
    tblnz_casksstransfer o = (tblnz_casksstransfer) super.clone();
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_casksstransfer o) throws CloneNotSupportedException {
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("flngCaseKey", this.flngCaseKey);
    __sqoop$field_map.put("fi64KSB2BKey", this.fi64KSB2BKey);
    __sqoop$field_map.put("flngOldSchemeCustomerKey", this.flngOldSchemeCustomerKey);
    __sqoop$field_map.put("flngOldSchemeAccountKey", this.flngOldSchemeAccountKey);
    __sqoop$field_map.put("flngOldSchemeRelationshipKey", this.flngOldSchemeRelationshipKey);
    __sqoop$field_map.put("fi64OldSchemeB2BKey", this.fi64OldSchemeB2BKey);
    __sqoop$field_map.put("fi64ProviderClosurePaperKey", this.fi64ProviderClosurePaperKey);
    __sqoop$field_map.put("flngNewSchemeCustomerKey", this.flngNewSchemeCustomerKey);
    __sqoop$field_map.put("flngNewSchemeAccountKey", this.flngNewSchemeAccountKey);
    __sqoop$field_map.put("flngNewSchemeRelationshipKey", this.flngNewSchemeRelationshipKey);
    __sqoop$field_map.put("fi64NewSchemeB2BKey", this.fi64NewSchemeB2BKey);
    __sqoop$field_map.put("fi64TransferNoticePaperKey", this.fi64TransferNoticePaperKey);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("flngCaseKey", this.flngCaseKey);
    __sqoop$field_map.put("fi64KSB2BKey", this.fi64KSB2BKey);
    __sqoop$field_map.put("flngOldSchemeCustomerKey", this.flngOldSchemeCustomerKey);
    __sqoop$field_map.put("flngOldSchemeAccountKey", this.flngOldSchemeAccountKey);
    __sqoop$field_map.put("flngOldSchemeRelationshipKey", this.flngOldSchemeRelationshipKey);
    __sqoop$field_map.put("fi64OldSchemeB2BKey", this.fi64OldSchemeB2BKey);
    __sqoop$field_map.put("fi64ProviderClosurePaperKey", this.fi64ProviderClosurePaperKey);
    __sqoop$field_map.put("flngNewSchemeCustomerKey", this.flngNewSchemeCustomerKey);
    __sqoop$field_map.put("flngNewSchemeAccountKey", this.flngNewSchemeAccountKey);
    __sqoop$field_map.put("flngNewSchemeRelationshipKey", this.flngNewSchemeRelationshipKey);
    __sqoop$field_map.put("fi64NewSchemeB2BKey", this.fi64NewSchemeB2BKey);
    __sqoop$field_map.put("fi64TransferNoticePaperKey", this.fi64TransferNoticePaperKey);
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
