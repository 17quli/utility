// ORM class for table 'tblnaics'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Dec 03 23:39:17 NZDT 2020
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

public class tblnaics extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngNAICSKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnaics.this.flngNAICSKey = (Integer)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnaics.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnaics.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("fstrNAICSVersion", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnaics.this.fstrNAICSVersion = (String)value;
      }
    });
    setters.put("fstrNAICS", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnaics.this.fstrNAICS = (String)value;
      }
    });
    setters.put("fstrLevel1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnaics.this.fstrLevel1 = (String)value;
      }
    });
    setters.put("fstrLevel2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnaics.this.fstrLevel2 = (String)value;
      }
    });
    setters.put("fstrLevel3", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnaics.this.fstrLevel3 = (String)value;
      }
    });
    setters.put("fstrLevel4", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnaics.this.fstrLevel4 = (String)value;
      }
    });
    setters.put("fstrLevel5", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnaics.this.fstrLevel5 = (String)value;
      }
    });
    setters.put("fstrLevel6", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnaics.this.fstrLevel6 = (String)value;
      }
    });
    setters.put("flngCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnaics.this.flngCustomerKey = (Integer)value;
      }
    });
    setters.put("fintProfileNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnaics.this.fintProfileNumber = (Integer)value;
      }
    });
    setters.put("flngAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnaics.this.flngAccountKey = (Integer)value;
      }
    });
    setters.put("fdtmCommence", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnaics.this.fdtmCommence = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmCease", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnaics.this.fdtmCease = (java.sql.Timestamp)value;
      }
    });
    setters.put("fcurBusinessMakeup", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnaics.this.fcurBusinessMakeup = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnDefault", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnaics.this.fblnDefault = (Integer)value;
      }
    });
    setters.put("fblnActive", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnaics.this.fblnActive = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnaics.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnaics.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnaics() {
    init0();
  }
  private Integer flngNAICSKey;
  public Integer get_flngNAICSKey() {
    return flngNAICSKey;
  }
  public void set_flngNAICSKey(Integer flngNAICSKey) {
    this.flngNAICSKey = flngNAICSKey;
  }
  public tblnaics with_flngNAICSKey(Integer flngNAICSKey) {
    this.flngNAICSKey = flngNAICSKey;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblnaics with_flngVer(Integer flngVer) {
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
  public tblnaics with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private String fstrNAICSVersion;
  public String get_fstrNAICSVersion() {
    return fstrNAICSVersion;
  }
  public void set_fstrNAICSVersion(String fstrNAICSVersion) {
    this.fstrNAICSVersion = fstrNAICSVersion;
  }
  public tblnaics with_fstrNAICSVersion(String fstrNAICSVersion) {
    this.fstrNAICSVersion = fstrNAICSVersion;
    return this;
  }
  private String fstrNAICS;
  public String get_fstrNAICS() {
    return fstrNAICS;
  }
  public void set_fstrNAICS(String fstrNAICS) {
    this.fstrNAICS = fstrNAICS;
  }
  public tblnaics with_fstrNAICS(String fstrNAICS) {
    this.fstrNAICS = fstrNAICS;
    return this;
  }
  private String fstrLevel1;
  public String get_fstrLevel1() {
    return fstrLevel1;
  }
  public void set_fstrLevel1(String fstrLevel1) {
    this.fstrLevel1 = fstrLevel1;
  }
  public tblnaics with_fstrLevel1(String fstrLevel1) {
    this.fstrLevel1 = fstrLevel1;
    return this;
  }
  private String fstrLevel2;
  public String get_fstrLevel2() {
    return fstrLevel2;
  }
  public void set_fstrLevel2(String fstrLevel2) {
    this.fstrLevel2 = fstrLevel2;
  }
  public tblnaics with_fstrLevel2(String fstrLevel2) {
    this.fstrLevel2 = fstrLevel2;
    return this;
  }
  private String fstrLevel3;
  public String get_fstrLevel3() {
    return fstrLevel3;
  }
  public void set_fstrLevel3(String fstrLevel3) {
    this.fstrLevel3 = fstrLevel3;
  }
  public tblnaics with_fstrLevel3(String fstrLevel3) {
    this.fstrLevel3 = fstrLevel3;
    return this;
  }
  private String fstrLevel4;
  public String get_fstrLevel4() {
    return fstrLevel4;
  }
  public void set_fstrLevel4(String fstrLevel4) {
    this.fstrLevel4 = fstrLevel4;
  }
  public tblnaics with_fstrLevel4(String fstrLevel4) {
    this.fstrLevel4 = fstrLevel4;
    return this;
  }
  private String fstrLevel5;
  public String get_fstrLevel5() {
    return fstrLevel5;
  }
  public void set_fstrLevel5(String fstrLevel5) {
    this.fstrLevel5 = fstrLevel5;
  }
  public tblnaics with_fstrLevel5(String fstrLevel5) {
    this.fstrLevel5 = fstrLevel5;
    return this;
  }
  private String fstrLevel6;
  public String get_fstrLevel6() {
    return fstrLevel6;
  }
  public void set_fstrLevel6(String fstrLevel6) {
    this.fstrLevel6 = fstrLevel6;
  }
  public tblnaics with_fstrLevel6(String fstrLevel6) {
    this.fstrLevel6 = fstrLevel6;
    return this;
  }
  private Integer flngCustomerKey;
  public Integer get_flngCustomerKey() {
    return flngCustomerKey;
  }
  public void set_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
  }
  public tblnaics with_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
    return this;
  }
  private Integer fintProfileNumber;
  public Integer get_fintProfileNumber() {
    return fintProfileNumber;
  }
  public void set_fintProfileNumber(Integer fintProfileNumber) {
    this.fintProfileNumber = fintProfileNumber;
  }
  public tblnaics with_fintProfileNumber(Integer fintProfileNumber) {
    this.fintProfileNumber = fintProfileNumber;
    return this;
  }
  private Integer flngAccountKey;
  public Integer get_flngAccountKey() {
    return flngAccountKey;
  }
  public void set_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
  }
  public tblnaics with_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
    return this;
  }
  private java.sql.Timestamp fdtmCommence;
  public java.sql.Timestamp get_fdtmCommence() {
    return fdtmCommence;
  }
  public void set_fdtmCommence(java.sql.Timestamp fdtmCommence) {
    this.fdtmCommence = fdtmCommence;
  }
  public tblnaics with_fdtmCommence(java.sql.Timestamp fdtmCommence) {
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
  public tblnaics with_fdtmCease(java.sql.Timestamp fdtmCease) {
    this.fdtmCease = fdtmCease;
    return this;
  }
  private java.math.BigDecimal fcurBusinessMakeup;
  public java.math.BigDecimal get_fcurBusinessMakeup() {
    return fcurBusinessMakeup;
  }
  public void set_fcurBusinessMakeup(java.math.BigDecimal fcurBusinessMakeup) {
    this.fcurBusinessMakeup = fcurBusinessMakeup;
  }
  public tblnaics with_fcurBusinessMakeup(java.math.BigDecimal fcurBusinessMakeup) {
    this.fcurBusinessMakeup = fcurBusinessMakeup;
    return this;
  }
  private Integer fblnDefault;
  public Integer get_fblnDefault() {
    return fblnDefault;
  }
  public void set_fblnDefault(Integer fblnDefault) {
    this.fblnDefault = fblnDefault;
  }
  public tblnaics with_fblnDefault(Integer fblnDefault) {
    this.fblnDefault = fblnDefault;
    return this;
  }
  private Integer fblnActive;
  public Integer get_fblnActive() {
    return fblnActive;
  }
  public void set_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
  }
  public tblnaics with_fblnActive(Integer fblnActive) {
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
  public tblnaics with_fstrWho(String fstrWho) {
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
  public tblnaics with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnaics)) {
      return false;
    }
    tblnaics that = (tblnaics) o;
    boolean equal = true;
    equal = equal && (this.flngNAICSKey == null ? that.flngNAICSKey == null : this.flngNAICSKey.equals(that.flngNAICSKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fstrNAICSVersion == null ? that.fstrNAICSVersion == null : this.fstrNAICSVersion.equals(that.fstrNAICSVersion));
    equal = equal && (this.fstrNAICS == null ? that.fstrNAICS == null : this.fstrNAICS.equals(that.fstrNAICS));
    equal = equal && (this.fstrLevel1 == null ? that.fstrLevel1 == null : this.fstrLevel1.equals(that.fstrLevel1));
    equal = equal && (this.fstrLevel2 == null ? that.fstrLevel2 == null : this.fstrLevel2.equals(that.fstrLevel2));
    equal = equal && (this.fstrLevel3 == null ? that.fstrLevel3 == null : this.fstrLevel3.equals(that.fstrLevel3));
    equal = equal && (this.fstrLevel4 == null ? that.fstrLevel4 == null : this.fstrLevel4.equals(that.fstrLevel4));
    equal = equal && (this.fstrLevel5 == null ? that.fstrLevel5 == null : this.fstrLevel5.equals(that.fstrLevel5));
    equal = equal && (this.fstrLevel6 == null ? that.fstrLevel6 == null : this.fstrLevel6.equals(that.fstrLevel6));
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.fintProfileNumber == null ? that.fintProfileNumber == null : this.fintProfileNumber.equals(that.fintProfileNumber));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fdtmCommence == null ? that.fdtmCommence == null : this.fdtmCommence.equals(that.fdtmCommence));
    equal = equal && (this.fdtmCease == null ? that.fdtmCease == null : this.fdtmCease.equals(that.fdtmCease));
    equal = equal && (this.fcurBusinessMakeup == null ? that.fcurBusinessMakeup == null : this.fcurBusinessMakeup.equals(that.fcurBusinessMakeup));
    equal = equal && (this.fblnDefault == null ? that.fblnDefault == null : this.fblnDefault.equals(that.fblnDefault));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnaics)) {
      return false;
    }
    tblnaics that = (tblnaics) o;
    boolean equal = true;
    equal = equal && (this.flngNAICSKey == null ? that.flngNAICSKey == null : this.flngNAICSKey.equals(that.flngNAICSKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fstrNAICSVersion == null ? that.fstrNAICSVersion == null : this.fstrNAICSVersion.equals(that.fstrNAICSVersion));
    equal = equal && (this.fstrNAICS == null ? that.fstrNAICS == null : this.fstrNAICS.equals(that.fstrNAICS));
    equal = equal && (this.fstrLevel1 == null ? that.fstrLevel1 == null : this.fstrLevel1.equals(that.fstrLevel1));
    equal = equal && (this.fstrLevel2 == null ? that.fstrLevel2 == null : this.fstrLevel2.equals(that.fstrLevel2));
    equal = equal && (this.fstrLevel3 == null ? that.fstrLevel3 == null : this.fstrLevel3.equals(that.fstrLevel3));
    equal = equal && (this.fstrLevel4 == null ? that.fstrLevel4 == null : this.fstrLevel4.equals(that.fstrLevel4));
    equal = equal && (this.fstrLevel5 == null ? that.fstrLevel5 == null : this.fstrLevel5.equals(that.fstrLevel5));
    equal = equal && (this.fstrLevel6 == null ? that.fstrLevel6 == null : this.fstrLevel6.equals(that.fstrLevel6));
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.fintProfileNumber == null ? that.fintProfileNumber == null : this.fintProfileNumber.equals(that.fintProfileNumber));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fdtmCommence == null ? that.fdtmCommence == null : this.fdtmCommence.equals(that.fdtmCommence));
    equal = equal && (this.fdtmCease == null ? that.fdtmCease == null : this.fdtmCease.equals(that.fdtmCease));
    equal = equal && (this.fcurBusinessMakeup == null ? that.fcurBusinessMakeup == null : this.fcurBusinessMakeup.equals(that.fcurBusinessMakeup));
    equal = equal && (this.fblnDefault == null ? that.fblnDefault == null : this.fblnDefault.equals(that.fblnDefault));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngNAICSKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrNAICSVersion = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrNAICS = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrLevel1 = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrLevel2 = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrLevel3 = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrLevel4 = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrLevel5 = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrLevel6 = JdbcWritableBridge.readString(11, __dbResults);
    this.flngCustomerKey = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fintProfileNumber = JdbcWritableBridge.readInteger(13, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fdtmCommence = JdbcWritableBridge.readTimestamp(15, __dbResults);
    this.fdtmCease = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.fcurBusinessMakeup = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fblnDefault = JdbcWritableBridge.readInteger(18, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(19, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(20, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(21, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngNAICSKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrNAICSVersion = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrNAICS = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrLevel1 = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrLevel2 = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrLevel3 = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrLevel4 = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrLevel5 = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrLevel6 = JdbcWritableBridge.readString(11, __dbResults);
    this.flngCustomerKey = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fintProfileNumber = JdbcWritableBridge.readInteger(13, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fdtmCommence = JdbcWritableBridge.readTimestamp(15, __dbResults);
    this.fdtmCease = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.fcurBusinessMakeup = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fblnDefault = JdbcWritableBridge.readInteger(18, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(19, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(20, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(21, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngNAICSKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrNAICSVersion, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrNAICS, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLevel1, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLevel2, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLevel3, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLevel4, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLevel5, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLevel6, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey, 12 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintProfileNumber, 13 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCommence, 15 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCease, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBusinessMakeup, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDefault, 18 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 19 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 21 + __off, 93, __dbStmt);
    return 21;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngNAICSKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrNAICSVersion, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrNAICS, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLevel1, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLevel2, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLevel3, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLevel4, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLevel5, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLevel6, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey, 12 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintProfileNumber, 13 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCommence, 15 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCease, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBusinessMakeup, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDefault, 18 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 19 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 21 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngNAICSKey = null;
    } else {
    this.flngNAICSKey = Integer.valueOf(__dataIn.readInt());
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
        this.fstrNAICSVersion = null;
    } else {
    this.fstrNAICSVersion = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrNAICS = null;
    } else {
    this.fstrNAICS = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrLevel1 = null;
    } else {
    this.fstrLevel1 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrLevel2 = null;
    } else {
    this.fstrLevel2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrLevel3 = null;
    } else {
    this.fstrLevel3 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrLevel4 = null;
    } else {
    this.fstrLevel4 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrLevel5 = null;
    } else {
    this.fstrLevel5 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrLevel6 = null;
    } else {
    this.fstrLevel6 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngCustomerKey = null;
    } else {
    this.flngCustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintProfileNumber = null;
    } else {
    this.fintProfileNumber = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngAccountKey = null;
    } else {
    this.flngAccountKey = Integer.valueOf(__dataIn.readInt());
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
        this.fcurBusinessMakeup = null;
    } else {
    this.fcurBusinessMakeup = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnDefault = null;
    } else {
    this.fblnDefault = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.flngNAICSKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngNAICSKey);
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
    if (null == this.fstrNAICSVersion) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrNAICSVersion);
    }
    if (null == this.fstrNAICS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrNAICS);
    }
    if (null == this.fstrLevel1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLevel1);
    }
    if (null == this.fstrLevel2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLevel2);
    }
    if (null == this.fstrLevel3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLevel3);
    }
    if (null == this.fstrLevel4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLevel4);
    }
    if (null == this.fstrLevel5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLevel5);
    }
    if (null == this.fstrLevel6) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLevel6);
    }
    if (null == this.flngCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey);
    }
    if (null == this.fintProfileNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintProfileNumber);
    }
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
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
    if (null == this.fcurBusinessMakeup) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBusinessMakeup, __dataOut);
    }
    if (null == this.fblnDefault) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDefault);
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
    if (null == this.flngNAICSKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngNAICSKey);
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
    if (null == this.fstrNAICSVersion) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrNAICSVersion);
    }
    if (null == this.fstrNAICS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrNAICS);
    }
    if (null == this.fstrLevel1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLevel1);
    }
    if (null == this.fstrLevel2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLevel2);
    }
    if (null == this.fstrLevel3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLevel3);
    }
    if (null == this.fstrLevel4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLevel4);
    }
    if (null == this.fstrLevel5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLevel5);
    }
    if (null == this.fstrLevel6) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLevel6);
    }
    if (null == this.flngCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey);
    }
    if (null == this.fintProfileNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintProfileNumber);
    }
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
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
    if (null == this.fcurBusinessMakeup) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBusinessMakeup, __dataOut);
    }
    if (null == this.fblnDefault) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDefault);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngNAICSKey==null?"\\N":"" + flngNAICSKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrNAICSVersion==null?"\\N":fstrNAICSVersion, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrNAICS==null?"\\N":fstrNAICS, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLevel1==null?"\\N":fstrLevel1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLevel2==null?"\\N":fstrLevel2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLevel3==null?"\\N":fstrLevel3, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLevel4==null?"\\N":fstrLevel4, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLevel5==null?"\\N":fstrLevel5, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLevel6==null?"\\N":fstrLevel6, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintProfileNumber==null?"\\N":"" + fintProfileNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCommence==null?"\\N":"" + fdtmCommence, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCease==null?"\\N":"" + fdtmCease, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBusinessMakeup==null?"\\N":fcurBusinessMakeup.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDefault==null?"\\N":"" + fblnDefault, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngNAICSKey==null?"\\N":"" + flngNAICSKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrNAICSVersion==null?"\\N":fstrNAICSVersion, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrNAICS==null?"\\N":fstrNAICS, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLevel1==null?"\\N":fstrLevel1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLevel2==null?"\\N":fstrLevel2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLevel3==null?"\\N":fstrLevel3, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLevel4==null?"\\N":fstrLevel4, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLevel5==null?"\\N":fstrLevel5, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLevel6==null?"\\N":fstrLevel6, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintProfileNumber==null?"\\N":"" + fintProfileNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCommence==null?"\\N":"" + fdtmCommence, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCease==null?"\\N":"" + fdtmCease, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBusinessMakeup==null?"\\N":fcurBusinessMakeup.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDefault==null?"\\N":"" + fblnDefault, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngNAICSKey = null; } else {
      this.flngNAICSKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrNAICSVersion = null; } else {
      this.fstrNAICSVersion = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrNAICS = null; } else {
      this.fstrNAICS = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLevel1 = null; } else {
      this.fstrLevel1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLevel2 = null; } else {
      this.fstrLevel2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLevel3 = null; } else {
      this.fstrLevel3 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLevel4 = null; } else {
      this.fstrLevel4 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLevel5 = null; } else {
      this.fstrLevel5 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLevel6 = null; } else {
      this.fstrLevel6 = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintProfileNumber = null; } else {
      this.fintProfileNumber = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBusinessMakeup = null; } else {
      this.fcurBusinessMakeup = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnDefault = null; } else {
      this.fblnDefault = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngNAICSKey = null; } else {
      this.flngNAICSKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrNAICSVersion = null; } else {
      this.fstrNAICSVersion = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrNAICS = null; } else {
      this.fstrNAICS = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLevel1 = null; } else {
      this.fstrLevel1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLevel2 = null; } else {
      this.fstrLevel2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLevel3 = null; } else {
      this.fstrLevel3 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLevel4 = null; } else {
      this.fstrLevel4 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLevel5 = null; } else {
      this.fstrLevel5 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLevel6 = null; } else {
      this.fstrLevel6 = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintProfileNumber = null; } else {
      this.fintProfileNumber = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBusinessMakeup = null; } else {
      this.fcurBusinessMakeup = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnDefault = null; } else {
      this.fblnDefault = Integer.valueOf(__cur_str);
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
    tblnaics o = (tblnaics) super.clone();
    o.fdtmCommence = (o.fdtmCommence != null) ? (java.sql.Timestamp) o.fdtmCommence.clone() : null;
    o.fdtmCease = (o.fdtmCease != null) ? (java.sql.Timestamp) o.fdtmCease.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnaics o) throws CloneNotSupportedException {
    o.fdtmCommence = (o.fdtmCommence != null) ? (java.sql.Timestamp) o.fdtmCommence.clone() : null;
    o.fdtmCease = (o.fdtmCease != null) ? (java.sql.Timestamp) o.fdtmCease.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngNAICSKey", this.flngNAICSKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fstrNAICSVersion", this.fstrNAICSVersion);
    __sqoop$field_map.put("fstrNAICS", this.fstrNAICS);
    __sqoop$field_map.put("fstrLevel1", this.fstrLevel1);
    __sqoop$field_map.put("fstrLevel2", this.fstrLevel2);
    __sqoop$field_map.put("fstrLevel3", this.fstrLevel3);
    __sqoop$field_map.put("fstrLevel4", this.fstrLevel4);
    __sqoop$field_map.put("fstrLevel5", this.fstrLevel5);
    __sqoop$field_map.put("fstrLevel6", this.fstrLevel6);
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("fintProfileNumber", this.fintProfileNumber);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fdtmCommence", this.fdtmCommence);
    __sqoop$field_map.put("fdtmCease", this.fdtmCease);
    __sqoop$field_map.put("fcurBusinessMakeup", this.fcurBusinessMakeup);
    __sqoop$field_map.put("fblnDefault", this.fblnDefault);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngNAICSKey", this.flngNAICSKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fstrNAICSVersion", this.fstrNAICSVersion);
    __sqoop$field_map.put("fstrNAICS", this.fstrNAICS);
    __sqoop$field_map.put("fstrLevel1", this.fstrLevel1);
    __sqoop$field_map.put("fstrLevel2", this.fstrLevel2);
    __sqoop$field_map.put("fstrLevel3", this.fstrLevel3);
    __sqoop$field_map.put("fstrLevel4", this.fstrLevel4);
    __sqoop$field_map.put("fstrLevel5", this.fstrLevel5);
    __sqoop$field_map.put("fstrLevel6", this.fstrLevel6);
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("fintProfileNumber", this.fintProfileNumber);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fdtmCommence", this.fdtmCommence);
    __sqoop$field_map.put("fdtmCease", this.fdtmCease);
    __sqoop$field_map.put("fcurBusinessMakeup", this.fcurBusinessMakeup);
    __sqoop$field_map.put("fblnDefault", this.fblnDefault);
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
