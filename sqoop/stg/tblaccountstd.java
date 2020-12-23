// ORM class for table 'tblaccountstd'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 06:23:39 NZDT 2020
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

public class tblaccountstd extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("FLNGDOCKEY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblaccountstd.this.FLNGDOCKEY = (Integer)value;
      }
    });
    setters.put("FDTMCOMMENCE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblaccountstd.this.FDTMCOMMENCE = (java.sql.Timestamp)value;
      }
    });
    setters.put("FDTMCEASE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblaccountstd.this.FDTMCEASE = (java.sql.Timestamp)value;
      }
    });
    setters.put("FSTRSTATUS", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblaccountstd.this.FSTRSTATUS = (String)value;
      }
    });
    setters.put("FSTRCLOSUREREASON", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblaccountstd.this.FSTRCLOSUREREASON = (String)value;
      }
    });
    setters.put("FSTRFILINGFRQ", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblaccountstd.this.FSTRFILINGFRQ = (String)value;
      }
    });
    setters.put("fblnMailForm", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblaccountstd.this.fblnMailForm = (Integer)value;
      }
    });
    setters.put("FBLNREGISTERED", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblaccountstd.this.FBLNREGISTERED = (Integer)value;
      }
    });
    setters.put("FSTRCITY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblaccountstd.this.FSTRCITY = (String)value;
      }
    });
    setters.put("FSTRDISTRICT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblaccountstd.this.FSTRDISTRICT = (String)value;
      }
    });
    setters.put("FSTRGOVTAGENT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblaccountstd.this.FSTRGOVTAGENT = (String)value;
      }
    });
    setters.put("FINTPROCESSINGDAY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblaccountstd.this.FINTPROCESSINGDAY = (Integer)value;
      }
    });
    setters.put("fstrSIC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblaccountstd.this.fstrSIC = (String)value;
      }
    });
    setters.put("fblnNoRtnPnlInt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblaccountstd.this.fblnNoRtnPnlInt = (Integer)value;
      }
    });
    setters.put("FSTRWHO", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblaccountstd.this.FSTRWHO = (String)value;
      }
    });
    setters.put("FDTMWHEN", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblaccountstd.this.FDTMWHEN = (java.sql.Timestamp)value;
      }
    });
  }
  public tblaccountstd() {
    init0();
  }
  private Integer FLNGDOCKEY;
  public Integer get_FLNGDOCKEY() {
    return FLNGDOCKEY;
  }
  public void set_FLNGDOCKEY(Integer FLNGDOCKEY) {
    this.FLNGDOCKEY = FLNGDOCKEY;
  }
  public tblaccountstd with_FLNGDOCKEY(Integer FLNGDOCKEY) {
    this.FLNGDOCKEY = FLNGDOCKEY;
    return this;
  }
  private java.sql.Timestamp FDTMCOMMENCE;
  public java.sql.Timestamp get_FDTMCOMMENCE() {
    return FDTMCOMMENCE;
  }
  public void set_FDTMCOMMENCE(java.sql.Timestamp FDTMCOMMENCE) {
    this.FDTMCOMMENCE = FDTMCOMMENCE;
  }
  public tblaccountstd with_FDTMCOMMENCE(java.sql.Timestamp FDTMCOMMENCE) {
    this.FDTMCOMMENCE = FDTMCOMMENCE;
    return this;
  }
  private java.sql.Timestamp FDTMCEASE;
  public java.sql.Timestamp get_FDTMCEASE() {
    return FDTMCEASE;
  }
  public void set_FDTMCEASE(java.sql.Timestamp FDTMCEASE) {
    this.FDTMCEASE = FDTMCEASE;
  }
  public tblaccountstd with_FDTMCEASE(java.sql.Timestamp FDTMCEASE) {
    this.FDTMCEASE = FDTMCEASE;
    return this;
  }
  private String FSTRSTATUS;
  public String get_FSTRSTATUS() {
    return FSTRSTATUS;
  }
  public void set_FSTRSTATUS(String FSTRSTATUS) {
    this.FSTRSTATUS = FSTRSTATUS;
  }
  public tblaccountstd with_FSTRSTATUS(String FSTRSTATUS) {
    this.FSTRSTATUS = FSTRSTATUS;
    return this;
  }
  private String FSTRCLOSUREREASON;
  public String get_FSTRCLOSUREREASON() {
    return FSTRCLOSUREREASON;
  }
  public void set_FSTRCLOSUREREASON(String FSTRCLOSUREREASON) {
    this.FSTRCLOSUREREASON = FSTRCLOSUREREASON;
  }
  public tblaccountstd with_FSTRCLOSUREREASON(String FSTRCLOSUREREASON) {
    this.FSTRCLOSUREREASON = FSTRCLOSUREREASON;
    return this;
  }
  private String FSTRFILINGFRQ;
  public String get_FSTRFILINGFRQ() {
    return FSTRFILINGFRQ;
  }
  public void set_FSTRFILINGFRQ(String FSTRFILINGFRQ) {
    this.FSTRFILINGFRQ = FSTRFILINGFRQ;
  }
  public tblaccountstd with_FSTRFILINGFRQ(String FSTRFILINGFRQ) {
    this.FSTRFILINGFRQ = FSTRFILINGFRQ;
    return this;
  }
  private Integer fblnMailForm;
  public Integer get_fblnMailForm() {
    return fblnMailForm;
  }
  public void set_fblnMailForm(Integer fblnMailForm) {
    this.fblnMailForm = fblnMailForm;
  }
  public tblaccountstd with_fblnMailForm(Integer fblnMailForm) {
    this.fblnMailForm = fblnMailForm;
    return this;
  }
  private Integer FBLNREGISTERED;
  public Integer get_FBLNREGISTERED() {
    return FBLNREGISTERED;
  }
  public void set_FBLNREGISTERED(Integer FBLNREGISTERED) {
    this.FBLNREGISTERED = FBLNREGISTERED;
  }
  public tblaccountstd with_FBLNREGISTERED(Integer FBLNREGISTERED) {
    this.FBLNREGISTERED = FBLNREGISTERED;
    return this;
  }
  private String FSTRCITY;
  public String get_FSTRCITY() {
    return FSTRCITY;
  }
  public void set_FSTRCITY(String FSTRCITY) {
    this.FSTRCITY = FSTRCITY;
  }
  public tblaccountstd with_FSTRCITY(String FSTRCITY) {
    this.FSTRCITY = FSTRCITY;
    return this;
  }
  private String FSTRDISTRICT;
  public String get_FSTRDISTRICT() {
    return FSTRDISTRICT;
  }
  public void set_FSTRDISTRICT(String FSTRDISTRICT) {
    this.FSTRDISTRICT = FSTRDISTRICT;
  }
  public tblaccountstd with_FSTRDISTRICT(String FSTRDISTRICT) {
    this.FSTRDISTRICT = FSTRDISTRICT;
    return this;
  }
  private String FSTRGOVTAGENT;
  public String get_FSTRGOVTAGENT() {
    return FSTRGOVTAGENT;
  }
  public void set_FSTRGOVTAGENT(String FSTRGOVTAGENT) {
    this.FSTRGOVTAGENT = FSTRGOVTAGENT;
  }
  public tblaccountstd with_FSTRGOVTAGENT(String FSTRGOVTAGENT) {
    this.FSTRGOVTAGENT = FSTRGOVTAGENT;
    return this;
  }
  private Integer FINTPROCESSINGDAY;
  public Integer get_FINTPROCESSINGDAY() {
    return FINTPROCESSINGDAY;
  }
  public void set_FINTPROCESSINGDAY(Integer FINTPROCESSINGDAY) {
    this.FINTPROCESSINGDAY = FINTPROCESSINGDAY;
  }
  public tblaccountstd with_FINTPROCESSINGDAY(Integer FINTPROCESSINGDAY) {
    this.FINTPROCESSINGDAY = FINTPROCESSINGDAY;
    return this;
  }
  private String fstrSIC;
  public String get_fstrSIC() {
    return fstrSIC;
  }
  public void set_fstrSIC(String fstrSIC) {
    this.fstrSIC = fstrSIC;
  }
  public tblaccountstd with_fstrSIC(String fstrSIC) {
    this.fstrSIC = fstrSIC;
    return this;
  }
  private Integer fblnNoRtnPnlInt;
  public Integer get_fblnNoRtnPnlInt() {
    return fblnNoRtnPnlInt;
  }
  public void set_fblnNoRtnPnlInt(Integer fblnNoRtnPnlInt) {
    this.fblnNoRtnPnlInt = fblnNoRtnPnlInt;
  }
  public tblaccountstd with_fblnNoRtnPnlInt(Integer fblnNoRtnPnlInt) {
    this.fblnNoRtnPnlInt = fblnNoRtnPnlInt;
    return this;
  }
  private String FSTRWHO;
  public String get_FSTRWHO() {
    return FSTRWHO;
  }
  public void set_FSTRWHO(String FSTRWHO) {
    this.FSTRWHO = FSTRWHO;
  }
  public tblaccountstd with_FSTRWHO(String FSTRWHO) {
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
  public tblaccountstd with_FDTMWHEN(java.sql.Timestamp FDTMWHEN) {
    this.FDTMWHEN = FDTMWHEN;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblaccountstd)) {
      return false;
    }
    tblaccountstd that = (tblaccountstd) o;
    boolean equal = true;
    equal = equal && (this.FLNGDOCKEY == null ? that.FLNGDOCKEY == null : this.FLNGDOCKEY.equals(that.FLNGDOCKEY));
    equal = equal && (this.FDTMCOMMENCE == null ? that.FDTMCOMMENCE == null : this.FDTMCOMMENCE.equals(that.FDTMCOMMENCE));
    equal = equal && (this.FDTMCEASE == null ? that.FDTMCEASE == null : this.FDTMCEASE.equals(that.FDTMCEASE));
    equal = equal && (this.FSTRSTATUS == null ? that.FSTRSTATUS == null : this.FSTRSTATUS.equals(that.FSTRSTATUS));
    equal = equal && (this.FSTRCLOSUREREASON == null ? that.FSTRCLOSUREREASON == null : this.FSTRCLOSUREREASON.equals(that.FSTRCLOSUREREASON));
    equal = equal && (this.FSTRFILINGFRQ == null ? that.FSTRFILINGFRQ == null : this.FSTRFILINGFRQ.equals(that.FSTRFILINGFRQ));
    equal = equal && (this.fblnMailForm == null ? that.fblnMailForm == null : this.fblnMailForm.equals(that.fblnMailForm));
    equal = equal && (this.FBLNREGISTERED == null ? that.FBLNREGISTERED == null : this.FBLNREGISTERED.equals(that.FBLNREGISTERED));
    equal = equal && (this.FSTRCITY == null ? that.FSTRCITY == null : this.FSTRCITY.equals(that.FSTRCITY));
    equal = equal && (this.FSTRDISTRICT == null ? that.FSTRDISTRICT == null : this.FSTRDISTRICT.equals(that.FSTRDISTRICT));
    equal = equal && (this.FSTRGOVTAGENT == null ? that.FSTRGOVTAGENT == null : this.FSTRGOVTAGENT.equals(that.FSTRGOVTAGENT));
    equal = equal && (this.FINTPROCESSINGDAY == null ? that.FINTPROCESSINGDAY == null : this.FINTPROCESSINGDAY.equals(that.FINTPROCESSINGDAY));
    equal = equal && (this.fstrSIC == null ? that.fstrSIC == null : this.fstrSIC.equals(that.fstrSIC));
    equal = equal && (this.fblnNoRtnPnlInt == null ? that.fblnNoRtnPnlInt == null : this.fblnNoRtnPnlInt.equals(that.fblnNoRtnPnlInt));
    equal = equal && (this.FSTRWHO == null ? that.FSTRWHO == null : this.FSTRWHO.equals(that.FSTRWHO));
    equal = equal && (this.FDTMWHEN == null ? that.FDTMWHEN == null : this.FDTMWHEN.equals(that.FDTMWHEN));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblaccountstd)) {
      return false;
    }
    tblaccountstd that = (tblaccountstd) o;
    boolean equal = true;
    equal = equal && (this.FLNGDOCKEY == null ? that.FLNGDOCKEY == null : this.FLNGDOCKEY.equals(that.FLNGDOCKEY));
    equal = equal && (this.FDTMCOMMENCE == null ? that.FDTMCOMMENCE == null : this.FDTMCOMMENCE.equals(that.FDTMCOMMENCE));
    equal = equal && (this.FDTMCEASE == null ? that.FDTMCEASE == null : this.FDTMCEASE.equals(that.FDTMCEASE));
    equal = equal && (this.FSTRSTATUS == null ? that.FSTRSTATUS == null : this.FSTRSTATUS.equals(that.FSTRSTATUS));
    equal = equal && (this.FSTRCLOSUREREASON == null ? that.FSTRCLOSUREREASON == null : this.FSTRCLOSUREREASON.equals(that.FSTRCLOSUREREASON));
    equal = equal && (this.FSTRFILINGFRQ == null ? that.FSTRFILINGFRQ == null : this.FSTRFILINGFRQ.equals(that.FSTRFILINGFRQ));
    equal = equal && (this.fblnMailForm == null ? that.fblnMailForm == null : this.fblnMailForm.equals(that.fblnMailForm));
    equal = equal && (this.FBLNREGISTERED == null ? that.FBLNREGISTERED == null : this.FBLNREGISTERED.equals(that.FBLNREGISTERED));
    equal = equal && (this.FSTRCITY == null ? that.FSTRCITY == null : this.FSTRCITY.equals(that.FSTRCITY));
    equal = equal && (this.FSTRDISTRICT == null ? that.FSTRDISTRICT == null : this.FSTRDISTRICT.equals(that.FSTRDISTRICT));
    equal = equal && (this.FSTRGOVTAGENT == null ? that.FSTRGOVTAGENT == null : this.FSTRGOVTAGENT.equals(that.FSTRGOVTAGENT));
    equal = equal && (this.FINTPROCESSINGDAY == null ? that.FINTPROCESSINGDAY == null : this.FINTPROCESSINGDAY.equals(that.FINTPROCESSINGDAY));
    equal = equal && (this.fstrSIC == null ? that.fstrSIC == null : this.fstrSIC.equals(that.fstrSIC));
    equal = equal && (this.fblnNoRtnPnlInt == null ? that.fblnNoRtnPnlInt == null : this.fblnNoRtnPnlInt.equals(that.fblnNoRtnPnlInt));
    equal = equal && (this.FSTRWHO == null ? that.FSTRWHO == null : this.FSTRWHO.equals(that.FSTRWHO));
    equal = equal && (this.FDTMWHEN == null ? that.FDTMWHEN == null : this.FDTMWHEN.equals(that.FDTMWHEN));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.FLNGDOCKEY = JdbcWritableBridge.readInteger(1, __dbResults);
    this.FDTMCOMMENCE = JdbcWritableBridge.readTimestamp(2, __dbResults);
    this.FDTMCEASE = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.FSTRSTATUS = JdbcWritableBridge.readString(4, __dbResults);
    this.FSTRCLOSUREREASON = JdbcWritableBridge.readString(5, __dbResults);
    this.FSTRFILINGFRQ = JdbcWritableBridge.readString(6, __dbResults);
    this.fblnMailForm = JdbcWritableBridge.readInteger(7, __dbResults);
    this.FBLNREGISTERED = JdbcWritableBridge.readInteger(8, __dbResults);
    this.FSTRCITY = JdbcWritableBridge.readString(9, __dbResults);
    this.FSTRDISTRICT = JdbcWritableBridge.readString(10, __dbResults);
    this.FSTRGOVTAGENT = JdbcWritableBridge.readString(11, __dbResults);
    this.FINTPROCESSINGDAY = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fstrSIC = JdbcWritableBridge.readString(13, __dbResults);
    this.fblnNoRtnPnlInt = JdbcWritableBridge.readInteger(14, __dbResults);
    this.FSTRWHO = JdbcWritableBridge.readString(15, __dbResults);
    this.FDTMWHEN = JdbcWritableBridge.readTimestamp(16, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.FLNGDOCKEY = JdbcWritableBridge.readInteger(1, __dbResults);
    this.FDTMCOMMENCE = JdbcWritableBridge.readTimestamp(2, __dbResults);
    this.FDTMCEASE = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.FSTRSTATUS = JdbcWritableBridge.readString(4, __dbResults);
    this.FSTRCLOSUREREASON = JdbcWritableBridge.readString(5, __dbResults);
    this.FSTRFILINGFRQ = JdbcWritableBridge.readString(6, __dbResults);
    this.fblnMailForm = JdbcWritableBridge.readInteger(7, __dbResults);
    this.FBLNREGISTERED = JdbcWritableBridge.readInteger(8, __dbResults);
    this.FSTRCITY = JdbcWritableBridge.readString(9, __dbResults);
    this.FSTRDISTRICT = JdbcWritableBridge.readString(10, __dbResults);
    this.FSTRGOVTAGENT = JdbcWritableBridge.readString(11, __dbResults);
    this.FINTPROCESSINGDAY = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fstrSIC = JdbcWritableBridge.readString(13, __dbResults);
    this.fblnNoRtnPnlInt = JdbcWritableBridge.readInteger(14, __dbResults);
    this.FSTRWHO = JdbcWritableBridge.readString(15, __dbResults);
    this.FDTMWHEN = JdbcWritableBridge.readTimestamp(16, __dbResults);
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
    JdbcWritableBridge.writeInteger(FLNGDOCKEY, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMCOMMENCE, 2 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMCEASE, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(FSTRSTATUS, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(FSTRCLOSUREREASON, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(FSTRFILINGFRQ, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnMailForm, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(FBLNREGISTERED, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(FSTRCITY, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(FSTRDISTRICT, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(FSTRGOVTAGENT, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(FINTPROCESSINGDAY, 12 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrSIC, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnNoRtnPnlInt, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(FSTRWHO, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMWHEN, 16 + __off, 93, __dbStmt);
    return 16;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(FLNGDOCKEY, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMCOMMENCE, 2 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMCEASE, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(FSTRSTATUS, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(FSTRCLOSUREREASON, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(FSTRFILINGFRQ, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnMailForm, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(FBLNREGISTERED, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(FSTRCITY, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(FSTRDISTRICT, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(FSTRGOVTAGENT, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(FINTPROCESSINGDAY, 12 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrSIC, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnNoRtnPnlInt, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(FSTRWHO, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMWHEN, 16 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.FLNGDOCKEY = null;
    } else {
    this.FLNGDOCKEY = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FDTMCOMMENCE = null;
    } else {
    this.FDTMCOMMENCE = new Timestamp(__dataIn.readLong());
    this.FDTMCOMMENCE.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FDTMCEASE = null;
    } else {
    this.FDTMCEASE = new Timestamp(__dataIn.readLong());
    this.FDTMCEASE.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FSTRSTATUS = null;
    } else {
    this.FSTRSTATUS = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FSTRCLOSUREREASON = null;
    } else {
    this.FSTRCLOSUREREASON = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FSTRFILINGFRQ = null;
    } else {
    this.FSTRFILINGFRQ = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnMailForm = null;
    } else {
    this.fblnMailForm = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FBLNREGISTERED = null;
    } else {
    this.FBLNREGISTERED = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FSTRCITY = null;
    } else {
    this.FSTRCITY = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FSTRDISTRICT = null;
    } else {
    this.FSTRDISTRICT = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FSTRGOVTAGENT = null;
    } else {
    this.FSTRGOVTAGENT = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FINTPROCESSINGDAY = null;
    } else {
    this.FINTPROCESSINGDAY = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSIC = null;
    } else {
    this.fstrSIC = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnNoRtnPnlInt = null;
    } else {
    this.fblnNoRtnPnlInt = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.FLNGDOCKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGDOCKEY);
    }
    if (null == this.FDTMCOMMENCE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMCOMMENCE.getTime());
    __dataOut.writeInt(this.FDTMCOMMENCE.getNanos());
    }
    if (null == this.FDTMCEASE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMCEASE.getTime());
    __dataOut.writeInt(this.FDTMCEASE.getNanos());
    }
    if (null == this.FSTRSTATUS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRSTATUS);
    }
    if (null == this.FSTRCLOSUREREASON) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRCLOSUREREASON);
    }
    if (null == this.FSTRFILINGFRQ) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRFILINGFRQ);
    }
    if (null == this.fblnMailForm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnMailForm);
    }
    if (null == this.FBLNREGISTERED) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FBLNREGISTERED);
    }
    if (null == this.FSTRCITY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRCITY);
    }
    if (null == this.FSTRDISTRICT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRDISTRICT);
    }
    if (null == this.FSTRGOVTAGENT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRGOVTAGENT);
    }
    if (null == this.FINTPROCESSINGDAY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FINTPROCESSINGDAY);
    }
    if (null == this.fstrSIC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSIC);
    }
    if (null == this.fblnNoRtnPnlInt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnNoRtnPnlInt);
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
    if (null == this.FLNGDOCKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGDOCKEY);
    }
    if (null == this.FDTMCOMMENCE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMCOMMENCE.getTime());
    __dataOut.writeInt(this.FDTMCOMMENCE.getNanos());
    }
    if (null == this.FDTMCEASE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMCEASE.getTime());
    __dataOut.writeInt(this.FDTMCEASE.getNanos());
    }
    if (null == this.FSTRSTATUS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRSTATUS);
    }
    if (null == this.FSTRCLOSUREREASON) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRCLOSUREREASON);
    }
    if (null == this.FSTRFILINGFRQ) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRFILINGFRQ);
    }
    if (null == this.fblnMailForm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnMailForm);
    }
    if (null == this.FBLNREGISTERED) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FBLNREGISTERED);
    }
    if (null == this.FSTRCITY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRCITY);
    }
    if (null == this.FSTRDISTRICT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRDISTRICT);
    }
    if (null == this.FSTRGOVTAGENT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRGOVTAGENT);
    }
    if (null == this.FINTPROCESSINGDAY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FINTPROCESSINGDAY);
    }
    if (null == this.fstrSIC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSIC);
    }
    if (null == this.fblnNoRtnPnlInt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnNoRtnPnlInt);
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
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGDOCKEY==null?"\\N":"" + FLNGDOCKEY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMCOMMENCE==null?"\\N":"" + FDTMCOMMENCE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMCEASE==null?"\\N":"" + FDTMCEASE, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRSTATUS==null?"\\N":FSTRSTATUS, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRCLOSUREREASON==null?"\\N":FSTRCLOSUREREASON, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRFILINGFRQ==null?"\\N":FSTRFILINGFRQ, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnMailForm==null?"\\N":"" + fblnMailForm, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FBLNREGISTERED==null?"\\N":"" + FBLNREGISTERED, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRCITY==null?"\\N":FSTRCITY, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRDISTRICT==null?"\\N":FSTRDISTRICT, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRGOVTAGENT==null?"\\N":FSTRGOVTAGENT, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FINTPROCESSINGDAY==null?"\\N":"" + FINTPROCESSINGDAY, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSIC==null?"\\N":fstrSIC, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnNoRtnPnlInt==null?"\\N":"" + fblnNoRtnPnlInt, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGDOCKEY==null?"\\N":"" + FLNGDOCKEY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMCOMMENCE==null?"\\N":"" + FDTMCOMMENCE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMCEASE==null?"\\N":"" + FDTMCEASE, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRSTATUS==null?"\\N":FSTRSTATUS, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRCLOSUREREASON==null?"\\N":FSTRCLOSUREREASON, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRFILINGFRQ==null?"\\N":FSTRFILINGFRQ, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnMailForm==null?"\\N":"" + fblnMailForm, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FBLNREGISTERED==null?"\\N":"" + FBLNREGISTERED, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRCITY==null?"\\N":FSTRCITY, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRDISTRICT==null?"\\N":FSTRDISTRICT, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRGOVTAGENT==null?"\\N":FSTRGOVTAGENT, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FINTPROCESSINGDAY==null?"\\N":"" + FINTPROCESSINGDAY, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSIC==null?"\\N":fstrSIC, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnNoRtnPnlInt==null?"\\N":"" + fblnNoRtnPnlInt, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGDOCKEY = null; } else {
      this.FLNGDOCKEY = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMCOMMENCE = null; } else {
      this.FDTMCOMMENCE = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMCEASE = null; } else {
      this.FDTMCEASE = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRSTATUS = null; } else {
      this.FSTRSTATUS = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRCLOSUREREASON = null; } else {
      this.FSTRCLOSUREREASON = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRFILINGFRQ = null; } else {
      this.FSTRFILINGFRQ = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnMailForm = null; } else {
      this.fblnMailForm = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FBLNREGISTERED = null; } else {
      this.FBLNREGISTERED = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRCITY = null; } else {
      this.FSTRCITY = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRDISTRICT = null; } else {
      this.FSTRDISTRICT = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRGOVTAGENT = null; } else {
      this.FSTRGOVTAGENT = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FINTPROCESSINGDAY = null; } else {
      this.FINTPROCESSINGDAY = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSIC = null; } else {
      this.fstrSIC = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnNoRtnPnlInt = null; } else {
      this.fblnNoRtnPnlInt = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGDOCKEY = null; } else {
      this.FLNGDOCKEY = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMCOMMENCE = null; } else {
      this.FDTMCOMMENCE = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMCEASE = null; } else {
      this.FDTMCEASE = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRSTATUS = null; } else {
      this.FSTRSTATUS = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRCLOSUREREASON = null; } else {
      this.FSTRCLOSUREREASON = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRFILINGFRQ = null; } else {
      this.FSTRFILINGFRQ = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnMailForm = null; } else {
      this.fblnMailForm = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FBLNREGISTERED = null; } else {
      this.FBLNREGISTERED = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRCITY = null; } else {
      this.FSTRCITY = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRDISTRICT = null; } else {
      this.FSTRDISTRICT = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRGOVTAGENT = null; } else {
      this.FSTRGOVTAGENT = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FINTPROCESSINGDAY = null; } else {
      this.FINTPROCESSINGDAY = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSIC = null; } else {
      this.fstrSIC = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnNoRtnPnlInt = null; } else {
      this.fblnNoRtnPnlInt = Integer.valueOf(__cur_str);
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
    tblaccountstd o = (tblaccountstd) super.clone();
    o.FDTMCOMMENCE = (o.FDTMCOMMENCE != null) ? (java.sql.Timestamp) o.FDTMCOMMENCE.clone() : null;
    o.FDTMCEASE = (o.FDTMCEASE != null) ? (java.sql.Timestamp) o.FDTMCEASE.clone() : null;
    o.FDTMWHEN = (o.FDTMWHEN != null) ? (java.sql.Timestamp) o.FDTMWHEN.clone() : null;
    return o;
  }

  public void clone0(tblaccountstd o) throws CloneNotSupportedException {
    o.FDTMCOMMENCE = (o.FDTMCOMMENCE != null) ? (java.sql.Timestamp) o.FDTMCOMMENCE.clone() : null;
    o.FDTMCEASE = (o.FDTMCEASE != null) ? (java.sql.Timestamp) o.FDTMCEASE.clone() : null;
    o.FDTMWHEN = (o.FDTMWHEN != null) ? (java.sql.Timestamp) o.FDTMWHEN.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("FLNGDOCKEY", this.FLNGDOCKEY);
    __sqoop$field_map.put("FDTMCOMMENCE", this.FDTMCOMMENCE);
    __sqoop$field_map.put("FDTMCEASE", this.FDTMCEASE);
    __sqoop$field_map.put("FSTRSTATUS", this.FSTRSTATUS);
    __sqoop$field_map.put("FSTRCLOSUREREASON", this.FSTRCLOSUREREASON);
    __sqoop$field_map.put("FSTRFILINGFRQ", this.FSTRFILINGFRQ);
    __sqoop$field_map.put("fblnMailForm", this.fblnMailForm);
    __sqoop$field_map.put("FBLNREGISTERED", this.FBLNREGISTERED);
    __sqoop$field_map.put("FSTRCITY", this.FSTRCITY);
    __sqoop$field_map.put("FSTRDISTRICT", this.FSTRDISTRICT);
    __sqoop$field_map.put("FSTRGOVTAGENT", this.FSTRGOVTAGENT);
    __sqoop$field_map.put("FINTPROCESSINGDAY", this.FINTPROCESSINGDAY);
    __sqoop$field_map.put("fstrSIC", this.fstrSIC);
    __sqoop$field_map.put("fblnNoRtnPnlInt", this.fblnNoRtnPnlInt);
    __sqoop$field_map.put("FSTRWHO", this.FSTRWHO);
    __sqoop$field_map.put("FDTMWHEN", this.FDTMWHEN);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("FLNGDOCKEY", this.FLNGDOCKEY);
    __sqoop$field_map.put("FDTMCOMMENCE", this.FDTMCOMMENCE);
    __sqoop$field_map.put("FDTMCEASE", this.FDTMCEASE);
    __sqoop$field_map.put("FSTRSTATUS", this.FSTRSTATUS);
    __sqoop$field_map.put("FSTRCLOSUREREASON", this.FSTRCLOSUREREASON);
    __sqoop$field_map.put("FSTRFILINGFRQ", this.FSTRFILINGFRQ);
    __sqoop$field_map.put("fblnMailForm", this.fblnMailForm);
    __sqoop$field_map.put("FBLNREGISTERED", this.FBLNREGISTERED);
    __sqoop$field_map.put("FSTRCITY", this.FSTRCITY);
    __sqoop$field_map.put("FSTRDISTRICT", this.FSTRDISTRICT);
    __sqoop$field_map.put("FSTRGOVTAGENT", this.FSTRGOVTAGENT);
    __sqoop$field_map.put("FINTPROCESSINGDAY", this.FINTPROCESSINGDAY);
    __sqoop$field_map.put("fstrSIC", this.fstrSIC);
    __sqoop$field_map.put("fblnNoRtnPnlInt", this.fblnNoRtnPnlInt);
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
