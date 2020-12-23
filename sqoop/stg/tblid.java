// ORM class for table 'tblid'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 00:14:18 NZDT 2020
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

public class tblid extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("FLNGIDKEY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblid.this.FLNGIDKEY = (Integer)value;
      }
    });
    setters.put("FLNGVER", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblid.this.FLNGVER = (Integer)value;
      }
    });
    setters.put("FLNGCUSTOMERKEY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblid.this.FLNGCUSTOMERKEY = (Integer)value;
      }
    });
    setters.put("FSTRIDTYPE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblid.this.FSTRIDTYPE = (String)value;
      }
    });
    setters.put("FSTRID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblid.this.FSTRID = (String)value;
      }
    });
    setters.put("FLNGACCOUNTKEY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblid.this.FLNGACCOUNTKEY = (Integer)value;
      }
    });
    setters.put("FLNGVERLAST", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblid.this.FLNGVERLAST = (Integer)value;
      }
    });
    setters.put("FBLNVALIDATED", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblid.this.FBLNVALIDATED = (Integer)value;
      }
    });
    setters.put("FBLNACTIVE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblid.this.FBLNACTIVE = (Integer)value;
      }
    });
    setters.put("FINTPROFILENUMBER", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblid.this.FINTPROFILENUMBER = (Integer)value;
      }
    });
    setters.put("FBLNDEFAULT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblid.this.FBLNDEFAULT = (Integer)value;
      }
    });
    setters.put("fdtmCommence", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblid.this.fdtmCommence = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmCease", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblid.this.fdtmCease = (java.sql.Timestamp)value;
      }
    });
    setters.put("flngImageKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblid.this.flngImageKey = (Integer)value;
      }
    });
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblid.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("flngCrmKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblid.this.flngCrmKey = (Integer)value;
      }
    });
    setters.put("fi64ProtectedDataSource", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblid.this.fi64ProtectedDataSource = (Long)value;
      }
    });
    setters.put("fintProtectLevel", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblid.this.fintProtectLevel = (Integer)value;
      }
    });
    setters.put("FSTRWHO", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblid.this.FSTRWHO = (String)value;
      }
    });
    setters.put("FDTMWHEN", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblid.this.FDTMWHEN = (java.sql.Timestamp)value;
      }
    });
  }
  public tblid() {
    init0();
  }
  private Integer FLNGIDKEY;
  public Integer get_FLNGIDKEY() {
    return FLNGIDKEY;
  }
  public void set_FLNGIDKEY(Integer FLNGIDKEY) {
    this.FLNGIDKEY = FLNGIDKEY;
  }
  public tblid with_FLNGIDKEY(Integer FLNGIDKEY) {
    this.FLNGIDKEY = FLNGIDKEY;
    return this;
  }
  private Integer FLNGVER;
  public Integer get_FLNGVER() {
    return FLNGVER;
  }
  public void set_FLNGVER(Integer FLNGVER) {
    this.FLNGVER = FLNGVER;
  }
  public tblid with_FLNGVER(Integer FLNGVER) {
    this.FLNGVER = FLNGVER;
    return this;
  }
  private Integer FLNGCUSTOMERKEY;
  public Integer get_FLNGCUSTOMERKEY() {
    return FLNGCUSTOMERKEY;
  }
  public void set_FLNGCUSTOMERKEY(Integer FLNGCUSTOMERKEY) {
    this.FLNGCUSTOMERKEY = FLNGCUSTOMERKEY;
  }
  public tblid with_FLNGCUSTOMERKEY(Integer FLNGCUSTOMERKEY) {
    this.FLNGCUSTOMERKEY = FLNGCUSTOMERKEY;
    return this;
  }
  private String FSTRIDTYPE;
  public String get_FSTRIDTYPE() {
    return FSTRIDTYPE;
  }
  public void set_FSTRIDTYPE(String FSTRIDTYPE) {
    this.FSTRIDTYPE = FSTRIDTYPE;
  }
  public tblid with_FSTRIDTYPE(String FSTRIDTYPE) {
    this.FSTRIDTYPE = FSTRIDTYPE;
    return this;
  }
  private String FSTRID;
  public String get_FSTRID() {
    return FSTRID;
  }
  public void set_FSTRID(String FSTRID) {
    this.FSTRID = FSTRID;
  }
  public tblid with_FSTRID(String FSTRID) {
    this.FSTRID = FSTRID;
    return this;
  }
  private Integer FLNGACCOUNTKEY;
  public Integer get_FLNGACCOUNTKEY() {
    return FLNGACCOUNTKEY;
  }
  public void set_FLNGACCOUNTKEY(Integer FLNGACCOUNTKEY) {
    this.FLNGACCOUNTKEY = FLNGACCOUNTKEY;
  }
  public tblid with_FLNGACCOUNTKEY(Integer FLNGACCOUNTKEY) {
    this.FLNGACCOUNTKEY = FLNGACCOUNTKEY;
    return this;
  }
  private Integer FLNGVERLAST;
  public Integer get_FLNGVERLAST() {
    return FLNGVERLAST;
  }
  public void set_FLNGVERLAST(Integer FLNGVERLAST) {
    this.FLNGVERLAST = FLNGVERLAST;
  }
  public tblid with_FLNGVERLAST(Integer FLNGVERLAST) {
    this.FLNGVERLAST = FLNGVERLAST;
    return this;
  }
  private Integer FBLNVALIDATED;
  public Integer get_FBLNVALIDATED() {
    return FBLNVALIDATED;
  }
  public void set_FBLNVALIDATED(Integer FBLNVALIDATED) {
    this.FBLNVALIDATED = FBLNVALIDATED;
  }
  public tblid with_FBLNVALIDATED(Integer FBLNVALIDATED) {
    this.FBLNVALIDATED = FBLNVALIDATED;
    return this;
  }
  private Integer FBLNACTIVE;
  public Integer get_FBLNACTIVE() {
    return FBLNACTIVE;
  }
  public void set_FBLNACTIVE(Integer FBLNACTIVE) {
    this.FBLNACTIVE = FBLNACTIVE;
  }
  public tblid with_FBLNACTIVE(Integer FBLNACTIVE) {
    this.FBLNACTIVE = FBLNACTIVE;
    return this;
  }
  private Integer FINTPROFILENUMBER;
  public Integer get_FINTPROFILENUMBER() {
    return FINTPROFILENUMBER;
  }
  public void set_FINTPROFILENUMBER(Integer FINTPROFILENUMBER) {
    this.FINTPROFILENUMBER = FINTPROFILENUMBER;
  }
  public tblid with_FINTPROFILENUMBER(Integer FINTPROFILENUMBER) {
    this.FINTPROFILENUMBER = FINTPROFILENUMBER;
    return this;
  }
  private Integer FBLNDEFAULT;
  public Integer get_FBLNDEFAULT() {
    return FBLNDEFAULT;
  }
  public void set_FBLNDEFAULT(Integer FBLNDEFAULT) {
    this.FBLNDEFAULT = FBLNDEFAULT;
  }
  public tblid with_FBLNDEFAULT(Integer FBLNDEFAULT) {
    this.FBLNDEFAULT = FBLNDEFAULT;
    return this;
  }
  private java.sql.Timestamp fdtmCommence;
  public java.sql.Timestamp get_fdtmCommence() {
    return fdtmCommence;
  }
  public void set_fdtmCommence(java.sql.Timestamp fdtmCommence) {
    this.fdtmCommence = fdtmCommence;
  }
  public tblid with_fdtmCommence(java.sql.Timestamp fdtmCommence) {
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
  public tblid with_fdtmCease(java.sql.Timestamp fdtmCease) {
    this.fdtmCease = fdtmCease;
    return this;
  }
  private Integer flngImageKey;
  public Integer get_flngImageKey() {
    return flngImageKey;
  }
  public void set_flngImageKey(Integer flngImageKey) {
    this.flngImageKey = flngImageKey;
  }
  public tblid with_flngImageKey(Integer flngImageKey) {
    this.flngImageKey = flngImageKey;
    return this;
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblid with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private Integer flngCrmKey;
  public Integer get_flngCrmKey() {
    return flngCrmKey;
  }
  public void set_flngCrmKey(Integer flngCrmKey) {
    this.flngCrmKey = flngCrmKey;
  }
  public tblid with_flngCrmKey(Integer flngCrmKey) {
    this.flngCrmKey = flngCrmKey;
    return this;
  }
  private Long fi64ProtectedDataSource;
  public Long get_fi64ProtectedDataSource() {
    return fi64ProtectedDataSource;
  }
  public void set_fi64ProtectedDataSource(Long fi64ProtectedDataSource) {
    this.fi64ProtectedDataSource = fi64ProtectedDataSource;
  }
  public tblid with_fi64ProtectedDataSource(Long fi64ProtectedDataSource) {
    this.fi64ProtectedDataSource = fi64ProtectedDataSource;
    return this;
  }
  private Integer fintProtectLevel;
  public Integer get_fintProtectLevel() {
    return fintProtectLevel;
  }
  public void set_fintProtectLevel(Integer fintProtectLevel) {
    this.fintProtectLevel = fintProtectLevel;
  }
  public tblid with_fintProtectLevel(Integer fintProtectLevel) {
    this.fintProtectLevel = fintProtectLevel;
    return this;
  }
  private String FSTRWHO;
  public String get_FSTRWHO() {
    return FSTRWHO;
  }
  public void set_FSTRWHO(String FSTRWHO) {
    this.FSTRWHO = FSTRWHO;
  }
  public tblid with_FSTRWHO(String FSTRWHO) {
    this.FSTRWHO = FSTRWHO;
    return this;
  }
  private java.sql.Timestamp FDTMWHEN;
  public java.sql.Timestamp get_FDTMWHEN() {
    return FDTMWHEN;
  }
  public void set_FDTMWHEN(java.sql.Timestamp FDTMWHEN) {
    this.FDTMWHEN = FDTMWHEN;
  }
  public tblid with_FDTMWHEN(java.sql.Timestamp FDTMWHEN) {
    this.FDTMWHEN = FDTMWHEN;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblid)) {
      return false;
    }
    tblid that = (tblid) o;
    boolean equal = true;
    equal = equal && (this.FLNGIDKEY == null ? that.FLNGIDKEY == null : this.FLNGIDKEY.equals(that.FLNGIDKEY));
    equal = equal && (this.FLNGVER == null ? that.FLNGVER == null : this.FLNGVER.equals(that.FLNGVER));
    equal = equal && (this.FLNGCUSTOMERKEY == null ? that.FLNGCUSTOMERKEY == null : this.FLNGCUSTOMERKEY.equals(that.FLNGCUSTOMERKEY));
    equal = equal && (this.FSTRIDTYPE == null ? that.FSTRIDTYPE == null : this.FSTRIDTYPE.equals(that.FSTRIDTYPE));
    equal = equal && (this.FSTRID == null ? that.FSTRID == null : this.FSTRID.equals(that.FSTRID));
    equal = equal && (this.FLNGACCOUNTKEY == null ? that.FLNGACCOUNTKEY == null : this.FLNGACCOUNTKEY.equals(that.FLNGACCOUNTKEY));
    equal = equal && (this.FLNGVERLAST == null ? that.FLNGVERLAST == null : this.FLNGVERLAST.equals(that.FLNGVERLAST));
    equal = equal && (this.FBLNVALIDATED == null ? that.FBLNVALIDATED == null : this.FBLNVALIDATED.equals(that.FBLNVALIDATED));
    equal = equal && (this.FBLNACTIVE == null ? that.FBLNACTIVE == null : this.FBLNACTIVE.equals(that.FBLNACTIVE));
    equal = equal && (this.FINTPROFILENUMBER == null ? that.FINTPROFILENUMBER == null : this.FINTPROFILENUMBER.equals(that.FINTPROFILENUMBER));
    equal = equal && (this.FBLNDEFAULT == null ? that.FBLNDEFAULT == null : this.FBLNDEFAULT.equals(that.FBLNDEFAULT));
    equal = equal && (this.fdtmCommence == null ? that.fdtmCommence == null : this.fdtmCommence.equals(that.fdtmCommence));
    equal = equal && (this.fdtmCease == null ? that.fdtmCease == null : this.fdtmCease.equals(that.fdtmCease));
    equal = equal && (this.flngImageKey == null ? that.flngImageKey == null : this.flngImageKey.equals(that.flngImageKey));
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.flngCrmKey == null ? that.flngCrmKey == null : this.flngCrmKey.equals(that.flngCrmKey));
    equal = equal && (this.fi64ProtectedDataSource == null ? that.fi64ProtectedDataSource == null : this.fi64ProtectedDataSource.equals(that.fi64ProtectedDataSource));
    equal = equal && (this.fintProtectLevel == null ? that.fintProtectLevel == null : this.fintProtectLevel.equals(that.fintProtectLevel));
    equal = equal && (this.FSTRWHO == null ? that.FSTRWHO == null : this.FSTRWHO.equals(that.FSTRWHO));
    equal = equal && (this.FDTMWHEN == null ? that.FDTMWHEN == null : this.FDTMWHEN.equals(that.FDTMWHEN));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblid)) {
      return false;
    }
    tblid that = (tblid) o;
    boolean equal = true;
    equal = equal && (this.FLNGIDKEY == null ? that.FLNGIDKEY == null : this.FLNGIDKEY.equals(that.FLNGIDKEY));
    equal = equal && (this.FLNGVER == null ? that.FLNGVER == null : this.FLNGVER.equals(that.FLNGVER));
    equal = equal && (this.FLNGCUSTOMERKEY == null ? that.FLNGCUSTOMERKEY == null : this.FLNGCUSTOMERKEY.equals(that.FLNGCUSTOMERKEY));
    equal = equal && (this.FSTRIDTYPE == null ? that.FSTRIDTYPE == null : this.FSTRIDTYPE.equals(that.FSTRIDTYPE));
    equal = equal && (this.FSTRID == null ? that.FSTRID == null : this.FSTRID.equals(that.FSTRID));
    equal = equal && (this.FLNGACCOUNTKEY == null ? that.FLNGACCOUNTKEY == null : this.FLNGACCOUNTKEY.equals(that.FLNGACCOUNTKEY));
    equal = equal && (this.FLNGVERLAST == null ? that.FLNGVERLAST == null : this.FLNGVERLAST.equals(that.FLNGVERLAST));
    equal = equal && (this.FBLNVALIDATED == null ? that.FBLNVALIDATED == null : this.FBLNVALIDATED.equals(that.FBLNVALIDATED));
    equal = equal && (this.FBLNACTIVE == null ? that.FBLNACTIVE == null : this.FBLNACTIVE.equals(that.FBLNACTIVE));
    equal = equal && (this.FINTPROFILENUMBER == null ? that.FINTPROFILENUMBER == null : this.FINTPROFILENUMBER.equals(that.FINTPROFILENUMBER));
    equal = equal && (this.FBLNDEFAULT == null ? that.FBLNDEFAULT == null : this.FBLNDEFAULT.equals(that.FBLNDEFAULT));
    equal = equal && (this.fdtmCommence == null ? that.fdtmCommence == null : this.fdtmCommence.equals(that.fdtmCommence));
    equal = equal && (this.fdtmCease == null ? that.fdtmCease == null : this.fdtmCease.equals(that.fdtmCease));
    equal = equal && (this.flngImageKey == null ? that.flngImageKey == null : this.flngImageKey.equals(that.flngImageKey));
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.flngCrmKey == null ? that.flngCrmKey == null : this.flngCrmKey.equals(that.flngCrmKey));
    equal = equal && (this.fi64ProtectedDataSource == null ? that.fi64ProtectedDataSource == null : this.fi64ProtectedDataSource.equals(that.fi64ProtectedDataSource));
    equal = equal && (this.fintProtectLevel == null ? that.fintProtectLevel == null : this.fintProtectLevel.equals(that.fintProtectLevel));
    equal = equal && (this.FSTRWHO == null ? that.FSTRWHO == null : this.FSTRWHO.equals(that.FSTRWHO));
    equal = equal && (this.FDTMWHEN == null ? that.FDTMWHEN == null : this.FDTMWHEN.equals(that.FDTMWHEN));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.FLNGIDKEY = JdbcWritableBridge.readInteger(1, __dbResults);
    this.FLNGVER = JdbcWritableBridge.readInteger(2, __dbResults);
    this.FLNGCUSTOMERKEY = JdbcWritableBridge.readInteger(3, __dbResults);
    this.FSTRIDTYPE = JdbcWritableBridge.readString(4, __dbResults);
    this.FSTRID = JdbcWritableBridge.readString(5, __dbResults);
    this.FLNGACCOUNTKEY = JdbcWritableBridge.readInteger(6, __dbResults);
    this.FLNGVERLAST = JdbcWritableBridge.readInteger(7, __dbResults);
    this.FBLNVALIDATED = JdbcWritableBridge.readInteger(8, __dbResults);
    this.FBLNACTIVE = JdbcWritableBridge.readInteger(9, __dbResults);
    this.FINTPROFILENUMBER = JdbcWritableBridge.readInteger(10, __dbResults);
    this.FBLNDEFAULT = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fdtmCommence = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.fdtmCease = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.flngImageKey = JdbcWritableBridge.readInteger(14, __dbResults);
    this.flngDocKey = JdbcWritableBridge.readInteger(15, __dbResults);
    this.flngCrmKey = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fi64ProtectedDataSource = JdbcWritableBridge.readLong(17, __dbResults);
    this.fintProtectLevel = JdbcWritableBridge.readInteger(18, __dbResults);
    this.FSTRWHO = JdbcWritableBridge.readString(19, __dbResults);
    this.FDTMWHEN = JdbcWritableBridge.readTimestamp(20, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.FLNGIDKEY = JdbcWritableBridge.readInteger(1, __dbResults);
    this.FLNGVER = JdbcWritableBridge.readInteger(2, __dbResults);
    this.FLNGCUSTOMERKEY = JdbcWritableBridge.readInteger(3, __dbResults);
    this.FSTRIDTYPE = JdbcWritableBridge.readString(4, __dbResults);
    this.FSTRID = JdbcWritableBridge.readString(5, __dbResults);
    this.FLNGACCOUNTKEY = JdbcWritableBridge.readInteger(6, __dbResults);
    this.FLNGVERLAST = JdbcWritableBridge.readInteger(7, __dbResults);
    this.FBLNVALIDATED = JdbcWritableBridge.readInteger(8, __dbResults);
    this.FBLNACTIVE = JdbcWritableBridge.readInteger(9, __dbResults);
    this.FINTPROFILENUMBER = JdbcWritableBridge.readInteger(10, __dbResults);
    this.FBLNDEFAULT = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fdtmCommence = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.fdtmCease = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.flngImageKey = JdbcWritableBridge.readInteger(14, __dbResults);
    this.flngDocKey = JdbcWritableBridge.readInteger(15, __dbResults);
    this.flngCrmKey = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fi64ProtectedDataSource = JdbcWritableBridge.readLong(17, __dbResults);
    this.fintProtectLevel = JdbcWritableBridge.readInteger(18, __dbResults);
    this.FSTRWHO = JdbcWritableBridge.readString(19, __dbResults);
    this.FDTMWHEN = JdbcWritableBridge.readTimestamp(20, __dbResults);
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
    JdbcWritableBridge.writeInteger(FLNGIDKEY, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGVER, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGCUSTOMERKEY, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(FSTRIDTYPE, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(FSTRID, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGACCOUNTKEY, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGVERLAST, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FBLNVALIDATED, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(FBLNACTIVE, 9 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(FINTPROFILENUMBER, 10 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(FBLNDEFAULT, 11 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCommence, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCease, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngImageKey, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDocKey, 15 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCrmKey, 16 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(fi64ProtectedDataSource, 17 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintProtectLevel, 18 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(FSTRWHO, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMWHEN, 20 + __off, 93, __dbStmt);
    return 20;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(FLNGIDKEY, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGVER, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGCUSTOMERKEY, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(FSTRIDTYPE, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(FSTRID, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGACCOUNTKEY, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGVERLAST, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FBLNVALIDATED, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(FBLNACTIVE, 9 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(FINTPROFILENUMBER, 10 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(FBLNDEFAULT, 11 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCommence, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCease, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngImageKey, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDocKey, 15 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCrmKey, 16 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(fi64ProtectedDataSource, 17 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintProtectLevel, 18 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(FSTRWHO, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMWHEN, 20 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.FLNGIDKEY = null;
    } else {
    this.FLNGIDKEY = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FLNGVER = null;
    } else {
    this.FLNGVER = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FLNGCUSTOMERKEY = null;
    } else {
    this.FLNGCUSTOMERKEY = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FSTRIDTYPE = null;
    } else {
    this.FSTRIDTYPE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FSTRID = null;
    } else {
    this.FSTRID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FLNGACCOUNTKEY = null;
    } else {
    this.FLNGACCOUNTKEY = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FLNGVERLAST = null;
    } else {
    this.FLNGVERLAST = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FBLNVALIDATED = null;
    } else {
    this.FBLNVALIDATED = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FBLNACTIVE = null;
    } else {
    this.FBLNACTIVE = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FINTPROFILENUMBER = null;
    } else {
    this.FINTPROFILENUMBER = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FBLNDEFAULT = null;
    } else {
    this.FBLNDEFAULT = Integer.valueOf(__dataIn.readInt());
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
        this.flngImageKey = null;
    } else {
    this.flngImageKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngDocKey = null;
    } else {
    this.flngDocKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngCrmKey = null;
    } else {
    this.flngCrmKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fi64ProtectedDataSource = null;
    } else {
    this.fi64ProtectedDataSource = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.fintProtectLevel = null;
    } else {
    this.fintProtectLevel = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FSTRWHO = null;
    } else {
    this.FSTRWHO = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FDTMWHEN = null;
    } else {
    this.FDTMWHEN = new Timestamp(__dataIn.readLong());
    this.FDTMWHEN.setNanos(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.FLNGIDKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGIDKEY);
    }
    if (null == this.FLNGVER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGVER);
    }
    if (null == this.FLNGCUSTOMERKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGCUSTOMERKEY);
    }
    if (null == this.FSTRIDTYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRIDTYPE);
    }
    if (null == this.FSTRID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRID);
    }
    if (null == this.FLNGACCOUNTKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGACCOUNTKEY);
    }
    if (null == this.FLNGVERLAST) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGVERLAST);
    }
    if (null == this.FBLNVALIDATED) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FBLNVALIDATED);
    }
    if (null == this.FBLNACTIVE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FBLNACTIVE);
    }
    if (null == this.FINTPROFILENUMBER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FINTPROFILENUMBER);
    }
    if (null == this.FBLNDEFAULT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FBLNDEFAULT);
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
    if (null == this.flngImageKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngImageKey);
    }
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.flngCrmKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCrmKey);
    }
    if (null == this.fi64ProtectedDataSource) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64ProtectedDataSource);
    }
    if (null == this.fintProtectLevel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintProtectLevel);
    }
    if (null == this.FSTRWHO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRWHO);
    }
    if (null == this.FDTMWHEN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMWHEN.getTime());
    __dataOut.writeInt(this.FDTMWHEN.getNanos());
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.FLNGIDKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGIDKEY);
    }
    if (null == this.FLNGVER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGVER);
    }
    if (null == this.FLNGCUSTOMERKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGCUSTOMERKEY);
    }
    if (null == this.FSTRIDTYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRIDTYPE);
    }
    if (null == this.FSTRID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRID);
    }
    if (null == this.FLNGACCOUNTKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGACCOUNTKEY);
    }
    if (null == this.FLNGVERLAST) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGVERLAST);
    }
    if (null == this.FBLNVALIDATED) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FBLNVALIDATED);
    }
    if (null == this.FBLNACTIVE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FBLNACTIVE);
    }
    if (null == this.FINTPROFILENUMBER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FINTPROFILENUMBER);
    }
    if (null == this.FBLNDEFAULT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FBLNDEFAULT);
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
    if (null == this.flngImageKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngImageKey);
    }
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.flngCrmKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCrmKey);
    }
    if (null == this.fi64ProtectedDataSource) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64ProtectedDataSource);
    }
    if (null == this.fintProtectLevel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintProtectLevel);
    }
    if (null == this.FSTRWHO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRWHO);
    }
    if (null == this.FDTMWHEN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMWHEN.getTime());
    __dataOut.writeInt(this.FDTMWHEN.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGIDKEY==null?"\\N":"" + FLNGIDKEY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGVER==null?"\\N":"" + FLNGVER, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGCUSTOMERKEY==null?"\\N":"" + FLNGCUSTOMERKEY, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRIDTYPE==null?"\\N":FSTRIDTYPE, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRID==null?"\\N":FSTRID, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGACCOUNTKEY==null?"\\N":"" + FLNGACCOUNTKEY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGVERLAST==null?"\\N":"" + FLNGVERLAST, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FBLNVALIDATED==null?"\\N":"" + FBLNVALIDATED, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FBLNACTIVE==null?"\\N":"" + FBLNACTIVE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FINTPROFILENUMBER==null?"\\N":"" + FINTPROFILENUMBER, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FBLNDEFAULT==null?"\\N":"" + FBLNDEFAULT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCommence==null?"\\N":"" + fdtmCommence, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCease==null?"\\N":"" + fdtmCease, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngImageKey==null?"\\N":"" + flngImageKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCrmKey==null?"\\N":"" + flngCrmKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64ProtectedDataSource==null?"\\N":"" + fi64ProtectedDataSource, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintProtectLevel==null?"\\N":"" + fintProtectLevel, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRWHO==null?"\\N":FSTRWHO, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMWHEN==null?"\\N":"" + FDTMWHEN, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGIDKEY==null?"\\N":"" + FLNGIDKEY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGVER==null?"\\N":"" + FLNGVER, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGCUSTOMERKEY==null?"\\N":"" + FLNGCUSTOMERKEY, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRIDTYPE==null?"\\N":FSTRIDTYPE, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRID==null?"\\N":FSTRID, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGACCOUNTKEY==null?"\\N":"" + FLNGACCOUNTKEY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGVERLAST==null?"\\N":"" + FLNGVERLAST, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FBLNVALIDATED==null?"\\N":"" + FBLNVALIDATED, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FBLNACTIVE==null?"\\N":"" + FBLNACTIVE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FINTPROFILENUMBER==null?"\\N":"" + FINTPROFILENUMBER, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FBLNDEFAULT==null?"\\N":"" + FBLNDEFAULT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCommence==null?"\\N":"" + fdtmCommence, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCease==null?"\\N":"" + fdtmCease, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngImageKey==null?"\\N":"" + flngImageKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCrmKey==null?"\\N":"" + flngCrmKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64ProtectedDataSource==null?"\\N":"" + fi64ProtectedDataSource, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintProtectLevel==null?"\\N":"" + fintProtectLevel, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRWHO==null?"\\N":FSTRWHO, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMWHEN==null?"\\N":"" + FDTMWHEN, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGIDKEY = null; } else {
      this.FLNGIDKEY = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGVER = null; } else {
      this.FLNGVER = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGCUSTOMERKEY = null; } else {
      this.FLNGCUSTOMERKEY = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRIDTYPE = null; } else {
      this.FSTRIDTYPE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRID = null; } else {
      this.FSTRID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGACCOUNTKEY = null; } else {
      this.FLNGACCOUNTKEY = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGVERLAST = null; } else {
      this.FLNGVERLAST = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FBLNVALIDATED = null; } else {
      this.FBLNVALIDATED = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FBLNACTIVE = null; } else {
      this.FBLNACTIVE = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FINTPROFILENUMBER = null; } else {
      this.FINTPROFILENUMBER = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FBLNDEFAULT = null; } else {
      this.FBLNDEFAULT = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngImageKey = null; } else {
      this.flngImageKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCrmKey = null; } else {
      this.flngCrmKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64ProtectedDataSource = null; } else {
      this.fi64ProtectedDataSource = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintProtectLevel = null; } else {
      this.fintProtectLevel = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRWHO = null; } else {
      this.FSTRWHO = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMWHEN = null; } else {
      this.FDTMWHEN = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGIDKEY = null; } else {
      this.FLNGIDKEY = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGVER = null; } else {
      this.FLNGVER = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGCUSTOMERKEY = null; } else {
      this.FLNGCUSTOMERKEY = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRIDTYPE = null; } else {
      this.FSTRIDTYPE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRID = null; } else {
      this.FSTRID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGACCOUNTKEY = null; } else {
      this.FLNGACCOUNTKEY = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGVERLAST = null; } else {
      this.FLNGVERLAST = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FBLNVALIDATED = null; } else {
      this.FBLNVALIDATED = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FBLNACTIVE = null; } else {
      this.FBLNACTIVE = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FINTPROFILENUMBER = null; } else {
      this.FINTPROFILENUMBER = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FBLNDEFAULT = null; } else {
      this.FBLNDEFAULT = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngImageKey = null; } else {
      this.flngImageKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCrmKey = null; } else {
      this.flngCrmKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64ProtectedDataSource = null; } else {
      this.fi64ProtectedDataSource = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintProtectLevel = null; } else {
      this.fintProtectLevel = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRWHO = null; } else {
      this.FSTRWHO = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMWHEN = null; } else {
      this.FDTMWHEN = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    tblid o = (tblid) super.clone();
    o.fdtmCommence = (o.fdtmCommence != null) ? (java.sql.Timestamp) o.fdtmCommence.clone() : null;
    o.fdtmCease = (o.fdtmCease != null) ? (java.sql.Timestamp) o.fdtmCease.clone() : null;
    o.FDTMWHEN = (o.FDTMWHEN != null) ? (java.sql.Timestamp) o.FDTMWHEN.clone() : null;
    return o;
  }

  public void clone0(tblid o) throws CloneNotSupportedException {
    o.fdtmCommence = (o.fdtmCommence != null) ? (java.sql.Timestamp) o.fdtmCommence.clone() : null;
    o.fdtmCease = (o.fdtmCease != null) ? (java.sql.Timestamp) o.fdtmCease.clone() : null;
    o.FDTMWHEN = (o.FDTMWHEN != null) ? (java.sql.Timestamp) o.FDTMWHEN.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("FLNGIDKEY", this.FLNGIDKEY);
    __sqoop$field_map.put("FLNGVER", this.FLNGVER);
    __sqoop$field_map.put("FLNGCUSTOMERKEY", this.FLNGCUSTOMERKEY);
    __sqoop$field_map.put("FSTRIDTYPE", this.FSTRIDTYPE);
    __sqoop$field_map.put("FSTRID", this.FSTRID);
    __sqoop$field_map.put("FLNGACCOUNTKEY", this.FLNGACCOUNTKEY);
    __sqoop$field_map.put("FLNGVERLAST", this.FLNGVERLAST);
    __sqoop$field_map.put("FBLNVALIDATED", this.FBLNVALIDATED);
    __sqoop$field_map.put("FBLNACTIVE", this.FBLNACTIVE);
    __sqoop$field_map.put("FINTPROFILENUMBER", this.FINTPROFILENUMBER);
    __sqoop$field_map.put("FBLNDEFAULT", this.FBLNDEFAULT);
    __sqoop$field_map.put("fdtmCommence", this.fdtmCommence);
    __sqoop$field_map.put("fdtmCease", this.fdtmCease);
    __sqoop$field_map.put("flngImageKey", this.flngImageKey);
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("flngCrmKey", this.flngCrmKey);
    __sqoop$field_map.put("fi64ProtectedDataSource", this.fi64ProtectedDataSource);
    __sqoop$field_map.put("fintProtectLevel", this.fintProtectLevel);
    __sqoop$field_map.put("FSTRWHO", this.FSTRWHO);
    __sqoop$field_map.put("FDTMWHEN", this.FDTMWHEN);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("FLNGIDKEY", this.FLNGIDKEY);
    __sqoop$field_map.put("FLNGVER", this.FLNGVER);
    __sqoop$field_map.put("FLNGCUSTOMERKEY", this.FLNGCUSTOMERKEY);
    __sqoop$field_map.put("FSTRIDTYPE", this.FSTRIDTYPE);
    __sqoop$field_map.put("FSTRID", this.FSTRID);
    __sqoop$field_map.put("FLNGACCOUNTKEY", this.FLNGACCOUNTKEY);
    __sqoop$field_map.put("FLNGVERLAST", this.FLNGVERLAST);
    __sqoop$field_map.put("FBLNVALIDATED", this.FBLNVALIDATED);
    __sqoop$field_map.put("FBLNACTIVE", this.FBLNACTIVE);
    __sqoop$field_map.put("FINTPROFILENUMBER", this.FINTPROFILENUMBER);
    __sqoop$field_map.put("FBLNDEFAULT", this.FBLNDEFAULT);
    __sqoop$field_map.put("fdtmCommence", this.fdtmCommence);
    __sqoop$field_map.put("fdtmCease", this.fdtmCease);
    __sqoop$field_map.put("flngImageKey", this.flngImageKey);
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("flngCrmKey", this.flngCrmKey);
    __sqoop$field_map.put("fi64ProtectedDataSource", this.fi64ProtectedDataSource);
    __sqoop$field_map.put("fintProtectLevel", this.fintProtectLevel);
    __sqoop$field_map.put("FSTRWHO", this.FSTRWHO);
    __sqoop$field_map.put("FDTMWHEN", this.FDTMWHEN);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
