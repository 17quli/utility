// ORM class for table 'tblworktoreturn'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 07:57:20 NZDT 2020
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

public class tblworktoreturn extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("FLNGRETURNKEY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworktoreturn.this.FLNGRETURNKEY = (Integer)value;
      }
    });
    setters.put("FLNGWORKKEY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworktoreturn.this.FLNGWORKKEY = (Integer)value;
      }
    });
    setters.put("FSTRRETURNTYPE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworktoreturn.this.FSTRRETURNTYPE = (String)value;
      }
    });
    setters.put("FLNGBATCHKEY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworktoreturn.this.FLNGBATCHKEY = (Integer)value;
      }
    });
    setters.put("FSTRBATCHID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworktoreturn.this.FSTRBATCHID = (String)value;
      }
    });
    setters.put("FINTSEQUENCE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworktoreturn.this.FINTSEQUENCE = (Integer)value;
      }
    });
    setters.put("FDTMFILINGPERIOD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworktoreturn.this.FDTMFILINGPERIOD = (java.sql.Timestamp)value;
      }
    });
    setters.put("FDTMRECEIVED", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworktoreturn.this.FDTMRECEIVED = (java.sql.Timestamp)value;
      }
    });
    setters.put("FDTMCOMPOSED", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworktoreturn.this.FDTMCOMPOSED = (java.sql.Timestamp)value;
      }
    });
    setters.put("FCURRISK", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworktoreturn.this.FCURRISK = (java.math.BigDecimal)value;
      }
    });
    setters.put("FBLNOPEN", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworktoreturn.this.FBLNOPEN = (Integer)value;
      }
    });
    setters.put("FSTRACCOUNTTYPE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworktoreturn.this.FSTRACCOUNTTYPE = (String)value;
      }
    });
    setters.put("FSTRWHO", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworktoreturn.this.FSTRWHO = (String)value;
      }
    });
    setters.put("FDTMWHEN", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworktoreturn.this.FDTMWHEN = (java.sql.Timestamp)value;
      }
    });
  }
  public tblworktoreturn() {
    init0();
  }
  private Integer FLNGRETURNKEY;
  public Integer get_FLNGRETURNKEY() {
    return FLNGRETURNKEY;
  }
  public void set_FLNGRETURNKEY(Integer FLNGRETURNKEY) {
    this.FLNGRETURNKEY = FLNGRETURNKEY;
  }
  public tblworktoreturn with_FLNGRETURNKEY(Integer FLNGRETURNKEY) {
    this.FLNGRETURNKEY = FLNGRETURNKEY;
    return this;
  }
  private Integer FLNGWORKKEY;
  public Integer get_FLNGWORKKEY() {
    return FLNGWORKKEY;
  }
  public void set_FLNGWORKKEY(Integer FLNGWORKKEY) {
    this.FLNGWORKKEY = FLNGWORKKEY;
  }
  public tblworktoreturn with_FLNGWORKKEY(Integer FLNGWORKKEY) {
    this.FLNGWORKKEY = FLNGWORKKEY;
    return this;
  }
  private String FSTRRETURNTYPE;
  public String get_FSTRRETURNTYPE() {
    return FSTRRETURNTYPE;
  }
  public void set_FSTRRETURNTYPE(String FSTRRETURNTYPE) {
    this.FSTRRETURNTYPE = FSTRRETURNTYPE;
  }
  public tblworktoreturn with_FSTRRETURNTYPE(String FSTRRETURNTYPE) {
    this.FSTRRETURNTYPE = FSTRRETURNTYPE;
    return this;
  }
  private Integer FLNGBATCHKEY;
  public Integer get_FLNGBATCHKEY() {
    return FLNGBATCHKEY;
  }
  public void set_FLNGBATCHKEY(Integer FLNGBATCHKEY) {
    this.FLNGBATCHKEY = FLNGBATCHKEY;
  }
  public tblworktoreturn with_FLNGBATCHKEY(Integer FLNGBATCHKEY) {
    this.FLNGBATCHKEY = FLNGBATCHKEY;
    return this;
  }
  private String FSTRBATCHID;
  public String get_FSTRBATCHID() {
    return FSTRBATCHID;
  }
  public void set_FSTRBATCHID(String FSTRBATCHID) {
    this.FSTRBATCHID = FSTRBATCHID;
  }
  public tblworktoreturn with_FSTRBATCHID(String FSTRBATCHID) {
    this.FSTRBATCHID = FSTRBATCHID;
    return this;
  }
  private Integer FINTSEQUENCE;
  public Integer get_FINTSEQUENCE() {
    return FINTSEQUENCE;
  }
  public void set_FINTSEQUENCE(Integer FINTSEQUENCE) {
    this.FINTSEQUENCE = FINTSEQUENCE;
  }
  public tblworktoreturn with_FINTSEQUENCE(Integer FINTSEQUENCE) {
    this.FINTSEQUENCE = FINTSEQUENCE;
    return this;
  }
  private java.sql.Timestamp FDTMFILINGPERIOD;
  public java.sql.Timestamp get_FDTMFILINGPERIOD() {
    return FDTMFILINGPERIOD;
  }
  public void set_FDTMFILINGPERIOD(java.sql.Timestamp FDTMFILINGPERIOD) {
    this.FDTMFILINGPERIOD = FDTMFILINGPERIOD;
  }
  public tblworktoreturn with_FDTMFILINGPERIOD(java.sql.Timestamp FDTMFILINGPERIOD) {
    this.FDTMFILINGPERIOD = FDTMFILINGPERIOD;
    return this;
  }
  private java.sql.Timestamp FDTMRECEIVED;
  public java.sql.Timestamp get_FDTMRECEIVED() {
    return FDTMRECEIVED;
  }
  public void set_FDTMRECEIVED(java.sql.Timestamp FDTMRECEIVED) {
    this.FDTMRECEIVED = FDTMRECEIVED;
  }
  public tblworktoreturn with_FDTMRECEIVED(java.sql.Timestamp FDTMRECEIVED) {
    this.FDTMRECEIVED = FDTMRECEIVED;
    return this;
  }
  private java.sql.Timestamp FDTMCOMPOSED;
  public java.sql.Timestamp get_FDTMCOMPOSED() {
    return FDTMCOMPOSED;
  }
  public void set_FDTMCOMPOSED(java.sql.Timestamp FDTMCOMPOSED) {
    this.FDTMCOMPOSED = FDTMCOMPOSED;
  }
  public tblworktoreturn with_FDTMCOMPOSED(java.sql.Timestamp FDTMCOMPOSED) {
    this.FDTMCOMPOSED = FDTMCOMPOSED;
    return this;
  }
  private java.math.BigDecimal FCURRISK;
  public java.math.BigDecimal get_FCURRISK() {
    return FCURRISK;
  }
  public void set_FCURRISK(java.math.BigDecimal FCURRISK) {
    this.FCURRISK = FCURRISK;
  }
  public tblworktoreturn with_FCURRISK(java.math.BigDecimal FCURRISK) {
    this.FCURRISK = FCURRISK;
    return this;
  }
  private Integer FBLNOPEN;
  public Integer get_FBLNOPEN() {
    return FBLNOPEN;
  }
  public void set_FBLNOPEN(Integer FBLNOPEN) {
    this.FBLNOPEN = FBLNOPEN;
  }
  public tblworktoreturn with_FBLNOPEN(Integer FBLNOPEN) {
    this.FBLNOPEN = FBLNOPEN;
    return this;
  }
  private String FSTRACCOUNTTYPE;
  public String get_FSTRACCOUNTTYPE() {
    return FSTRACCOUNTTYPE;
  }
  public void set_FSTRACCOUNTTYPE(String FSTRACCOUNTTYPE) {
    this.FSTRACCOUNTTYPE = FSTRACCOUNTTYPE;
  }
  public tblworktoreturn with_FSTRACCOUNTTYPE(String FSTRACCOUNTTYPE) {
    this.FSTRACCOUNTTYPE = FSTRACCOUNTTYPE;
    return this;
  }
  private String FSTRWHO;
  public String get_FSTRWHO() {
    return FSTRWHO;
  }
  public void set_FSTRWHO(String FSTRWHO) {
    this.FSTRWHO = FSTRWHO;
  }
  public tblworktoreturn with_FSTRWHO(String FSTRWHO) {
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
  public tblworktoreturn with_FDTMWHEN(java.sql.Timestamp FDTMWHEN) {
    this.FDTMWHEN = FDTMWHEN;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblworktoreturn)) {
      return false;
    }
    tblworktoreturn that = (tblworktoreturn) o;
    boolean equal = true;
    equal = equal && (this.FLNGRETURNKEY == null ? that.FLNGRETURNKEY == null : this.FLNGRETURNKEY.equals(that.FLNGRETURNKEY));
    equal = equal && (this.FLNGWORKKEY == null ? that.FLNGWORKKEY == null : this.FLNGWORKKEY.equals(that.FLNGWORKKEY));
    equal = equal && (this.FSTRRETURNTYPE == null ? that.FSTRRETURNTYPE == null : this.FSTRRETURNTYPE.equals(that.FSTRRETURNTYPE));
    equal = equal && (this.FLNGBATCHKEY == null ? that.FLNGBATCHKEY == null : this.FLNGBATCHKEY.equals(that.FLNGBATCHKEY));
    equal = equal && (this.FSTRBATCHID == null ? that.FSTRBATCHID == null : this.FSTRBATCHID.equals(that.FSTRBATCHID));
    equal = equal && (this.FINTSEQUENCE == null ? that.FINTSEQUENCE == null : this.FINTSEQUENCE.equals(that.FINTSEQUENCE));
    equal = equal && (this.FDTMFILINGPERIOD == null ? that.FDTMFILINGPERIOD == null : this.FDTMFILINGPERIOD.equals(that.FDTMFILINGPERIOD));
    equal = equal && (this.FDTMRECEIVED == null ? that.FDTMRECEIVED == null : this.FDTMRECEIVED.equals(that.FDTMRECEIVED));
    equal = equal && (this.FDTMCOMPOSED == null ? that.FDTMCOMPOSED == null : this.FDTMCOMPOSED.equals(that.FDTMCOMPOSED));
    equal = equal && (this.FCURRISK == null ? that.FCURRISK == null : this.FCURRISK.equals(that.FCURRISK));
    equal = equal && (this.FBLNOPEN == null ? that.FBLNOPEN == null : this.FBLNOPEN.equals(that.FBLNOPEN));
    equal = equal && (this.FSTRACCOUNTTYPE == null ? that.FSTRACCOUNTTYPE == null : this.FSTRACCOUNTTYPE.equals(that.FSTRACCOUNTTYPE));
    equal = equal && (this.FSTRWHO == null ? that.FSTRWHO == null : this.FSTRWHO.equals(that.FSTRWHO));
    equal = equal && (this.FDTMWHEN == null ? that.FDTMWHEN == null : this.FDTMWHEN.equals(that.FDTMWHEN));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblworktoreturn)) {
      return false;
    }
    tblworktoreturn that = (tblworktoreturn) o;
    boolean equal = true;
    equal = equal && (this.FLNGRETURNKEY == null ? that.FLNGRETURNKEY == null : this.FLNGRETURNKEY.equals(that.FLNGRETURNKEY));
    equal = equal && (this.FLNGWORKKEY == null ? that.FLNGWORKKEY == null : this.FLNGWORKKEY.equals(that.FLNGWORKKEY));
    equal = equal && (this.FSTRRETURNTYPE == null ? that.FSTRRETURNTYPE == null : this.FSTRRETURNTYPE.equals(that.FSTRRETURNTYPE));
    equal = equal && (this.FLNGBATCHKEY == null ? that.FLNGBATCHKEY == null : this.FLNGBATCHKEY.equals(that.FLNGBATCHKEY));
    equal = equal && (this.FSTRBATCHID == null ? that.FSTRBATCHID == null : this.FSTRBATCHID.equals(that.FSTRBATCHID));
    equal = equal && (this.FINTSEQUENCE == null ? that.FINTSEQUENCE == null : this.FINTSEQUENCE.equals(that.FINTSEQUENCE));
    equal = equal && (this.FDTMFILINGPERIOD == null ? that.FDTMFILINGPERIOD == null : this.FDTMFILINGPERIOD.equals(that.FDTMFILINGPERIOD));
    equal = equal && (this.FDTMRECEIVED == null ? that.FDTMRECEIVED == null : this.FDTMRECEIVED.equals(that.FDTMRECEIVED));
    equal = equal && (this.FDTMCOMPOSED == null ? that.FDTMCOMPOSED == null : this.FDTMCOMPOSED.equals(that.FDTMCOMPOSED));
    equal = equal && (this.FCURRISK == null ? that.FCURRISK == null : this.FCURRISK.equals(that.FCURRISK));
    equal = equal && (this.FBLNOPEN == null ? that.FBLNOPEN == null : this.FBLNOPEN.equals(that.FBLNOPEN));
    equal = equal && (this.FSTRACCOUNTTYPE == null ? that.FSTRACCOUNTTYPE == null : this.FSTRACCOUNTTYPE.equals(that.FSTRACCOUNTTYPE));
    equal = equal && (this.FSTRWHO == null ? that.FSTRWHO == null : this.FSTRWHO.equals(that.FSTRWHO));
    equal = equal && (this.FDTMWHEN == null ? that.FDTMWHEN == null : this.FDTMWHEN.equals(that.FDTMWHEN));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.FLNGRETURNKEY = JdbcWritableBridge.readInteger(1, __dbResults);
    this.FLNGWORKKEY = JdbcWritableBridge.readInteger(2, __dbResults);
    this.FSTRRETURNTYPE = JdbcWritableBridge.readString(3, __dbResults);
    this.FLNGBATCHKEY = JdbcWritableBridge.readInteger(4, __dbResults);
    this.FSTRBATCHID = JdbcWritableBridge.readString(5, __dbResults);
    this.FINTSEQUENCE = JdbcWritableBridge.readInteger(6, __dbResults);
    this.FDTMFILINGPERIOD = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.FDTMRECEIVED = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.FDTMCOMPOSED = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.FCURRISK = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.FBLNOPEN = JdbcWritableBridge.readInteger(11, __dbResults);
    this.FSTRACCOUNTTYPE = JdbcWritableBridge.readString(12, __dbResults);
    this.FSTRWHO = JdbcWritableBridge.readString(13, __dbResults);
    this.FDTMWHEN = JdbcWritableBridge.readTimestamp(14, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.FLNGRETURNKEY = JdbcWritableBridge.readInteger(1, __dbResults);
    this.FLNGWORKKEY = JdbcWritableBridge.readInteger(2, __dbResults);
    this.FSTRRETURNTYPE = JdbcWritableBridge.readString(3, __dbResults);
    this.FLNGBATCHKEY = JdbcWritableBridge.readInteger(4, __dbResults);
    this.FSTRBATCHID = JdbcWritableBridge.readString(5, __dbResults);
    this.FINTSEQUENCE = JdbcWritableBridge.readInteger(6, __dbResults);
    this.FDTMFILINGPERIOD = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.FDTMRECEIVED = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.FDTMCOMPOSED = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.FCURRISK = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.FBLNOPEN = JdbcWritableBridge.readInteger(11, __dbResults);
    this.FSTRACCOUNTTYPE = JdbcWritableBridge.readString(12, __dbResults);
    this.FSTRWHO = JdbcWritableBridge.readString(13, __dbResults);
    this.FDTMWHEN = JdbcWritableBridge.readTimestamp(14, __dbResults);
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
    JdbcWritableBridge.writeInteger(FLNGRETURNKEY, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGWORKKEY, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(FSTRRETURNTYPE, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGBATCHKEY, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(FSTRBATCHID, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(FINTSEQUENCE, 6 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMFILINGPERIOD, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMRECEIVED, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMCOMPOSED, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(FCURRISK, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(FBLNOPEN, 11 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(FSTRACCOUNTTYPE, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(FSTRWHO, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMWHEN, 14 + __off, 93, __dbStmt);
    return 14;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(FLNGRETURNKEY, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGWORKKEY, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(FSTRRETURNTYPE, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGBATCHKEY, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(FSTRBATCHID, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(FINTSEQUENCE, 6 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMFILINGPERIOD, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMRECEIVED, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMCOMPOSED, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(FCURRISK, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(FBLNOPEN, 11 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(FSTRACCOUNTTYPE, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(FSTRWHO, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMWHEN, 14 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.FLNGRETURNKEY = null;
    } else {
    this.FLNGRETURNKEY = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FLNGWORKKEY = null;
    } else {
    this.FLNGWORKKEY = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FSTRRETURNTYPE = null;
    } else {
    this.FSTRRETURNTYPE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FLNGBATCHKEY = null;
    } else {
    this.FLNGBATCHKEY = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FSTRBATCHID = null;
    } else {
    this.FSTRBATCHID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FINTSEQUENCE = null;
    } else {
    this.FINTSEQUENCE = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FDTMFILINGPERIOD = null;
    } else {
    this.FDTMFILINGPERIOD = new Timestamp(__dataIn.readLong());
    this.FDTMFILINGPERIOD.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FDTMRECEIVED = null;
    } else {
    this.FDTMRECEIVED = new Timestamp(__dataIn.readLong());
    this.FDTMRECEIVED.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FDTMCOMPOSED = null;
    } else {
    this.FDTMCOMPOSED = new Timestamp(__dataIn.readLong());
    this.FDTMCOMPOSED.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FCURRISK = null;
    } else {
    this.FCURRISK = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FBLNOPEN = null;
    } else {
    this.FBLNOPEN = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FSTRACCOUNTTYPE = null;
    } else {
    this.FSTRACCOUNTTYPE = Text.readString(__dataIn);
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
    if (null == this.FLNGRETURNKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGRETURNKEY);
    }
    if (null == this.FLNGWORKKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGWORKKEY);
    }
    if (null == this.FSTRRETURNTYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRRETURNTYPE);
    }
    if (null == this.FLNGBATCHKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGBATCHKEY);
    }
    if (null == this.FSTRBATCHID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRBATCHID);
    }
    if (null == this.FINTSEQUENCE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FINTSEQUENCE);
    }
    if (null == this.FDTMFILINGPERIOD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMFILINGPERIOD.getTime());
    __dataOut.writeInt(this.FDTMFILINGPERIOD.getNanos());
    }
    if (null == this.FDTMRECEIVED) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMRECEIVED.getTime());
    __dataOut.writeInt(this.FDTMRECEIVED.getNanos());
    }
    if (null == this.FDTMCOMPOSED) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMCOMPOSED.getTime());
    __dataOut.writeInt(this.FDTMCOMPOSED.getNanos());
    }
    if (null == this.FCURRISK) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.FCURRISK, __dataOut);
    }
    if (null == this.FBLNOPEN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FBLNOPEN);
    }
    if (null == this.FSTRACCOUNTTYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRACCOUNTTYPE);
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
    if (null == this.FLNGRETURNKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGRETURNKEY);
    }
    if (null == this.FLNGWORKKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGWORKKEY);
    }
    if (null == this.FSTRRETURNTYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRRETURNTYPE);
    }
    if (null == this.FLNGBATCHKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGBATCHKEY);
    }
    if (null == this.FSTRBATCHID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRBATCHID);
    }
    if (null == this.FINTSEQUENCE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FINTSEQUENCE);
    }
    if (null == this.FDTMFILINGPERIOD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMFILINGPERIOD.getTime());
    __dataOut.writeInt(this.FDTMFILINGPERIOD.getNanos());
    }
    if (null == this.FDTMRECEIVED) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMRECEIVED.getTime());
    __dataOut.writeInt(this.FDTMRECEIVED.getNanos());
    }
    if (null == this.FDTMCOMPOSED) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMCOMPOSED.getTime());
    __dataOut.writeInt(this.FDTMCOMPOSED.getNanos());
    }
    if (null == this.FCURRISK) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.FCURRISK, __dataOut);
    }
    if (null == this.FBLNOPEN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FBLNOPEN);
    }
    if (null == this.FSTRACCOUNTTYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRACCOUNTTYPE);
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
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGRETURNKEY==null?"\\N":"" + FLNGRETURNKEY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGWORKKEY==null?"\\N":"" + FLNGWORKKEY, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRRETURNTYPE==null?"\\N":FSTRRETURNTYPE, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGBATCHKEY==null?"\\N":"" + FLNGBATCHKEY, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRBATCHID==null?"\\N":FSTRBATCHID, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FINTSEQUENCE==null?"\\N":"" + FINTSEQUENCE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMFILINGPERIOD==null?"\\N":"" + FDTMFILINGPERIOD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMRECEIVED==null?"\\N":"" + FDTMRECEIVED, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMCOMPOSED==null?"\\N":"" + FDTMCOMPOSED, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FCURRISK==null?"\\N":FCURRISK.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FBLNOPEN==null?"\\N":"" + FBLNOPEN, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRACCOUNTTYPE==null?"\\N":FSTRACCOUNTTYPE, " ", delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGRETURNKEY==null?"\\N":"" + FLNGRETURNKEY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGWORKKEY==null?"\\N":"" + FLNGWORKKEY, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRRETURNTYPE==null?"\\N":FSTRRETURNTYPE, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGBATCHKEY==null?"\\N":"" + FLNGBATCHKEY, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRBATCHID==null?"\\N":FSTRBATCHID, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FINTSEQUENCE==null?"\\N":"" + FINTSEQUENCE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMFILINGPERIOD==null?"\\N":"" + FDTMFILINGPERIOD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMRECEIVED==null?"\\N":"" + FDTMRECEIVED, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMCOMPOSED==null?"\\N":"" + FDTMCOMPOSED, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FCURRISK==null?"\\N":FCURRISK.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FBLNOPEN==null?"\\N":"" + FBLNOPEN, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRACCOUNTTYPE==null?"\\N":FSTRACCOUNTTYPE, " ", delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGRETURNKEY = null; } else {
      this.FLNGRETURNKEY = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGWORKKEY = null; } else {
      this.FLNGWORKKEY = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRRETURNTYPE = null; } else {
      this.FSTRRETURNTYPE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGBATCHKEY = null; } else {
      this.FLNGBATCHKEY = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRBATCHID = null; } else {
      this.FSTRBATCHID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FINTSEQUENCE = null; } else {
      this.FINTSEQUENCE = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMFILINGPERIOD = null; } else {
      this.FDTMFILINGPERIOD = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMRECEIVED = null; } else {
      this.FDTMRECEIVED = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMCOMPOSED = null; } else {
      this.FDTMCOMPOSED = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FCURRISK = null; } else {
      this.FCURRISK = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FBLNOPEN = null; } else {
      this.FBLNOPEN = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRACCOUNTTYPE = null; } else {
      this.FSTRACCOUNTTYPE = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGRETURNKEY = null; } else {
      this.FLNGRETURNKEY = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGWORKKEY = null; } else {
      this.FLNGWORKKEY = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRRETURNTYPE = null; } else {
      this.FSTRRETURNTYPE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGBATCHKEY = null; } else {
      this.FLNGBATCHKEY = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRBATCHID = null; } else {
      this.FSTRBATCHID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FINTSEQUENCE = null; } else {
      this.FINTSEQUENCE = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMFILINGPERIOD = null; } else {
      this.FDTMFILINGPERIOD = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMRECEIVED = null; } else {
      this.FDTMRECEIVED = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMCOMPOSED = null; } else {
      this.FDTMCOMPOSED = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FCURRISK = null; } else {
      this.FCURRISK = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FBLNOPEN = null; } else {
      this.FBLNOPEN = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRACCOUNTTYPE = null; } else {
      this.FSTRACCOUNTTYPE = __cur_str;
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
    tblworktoreturn o = (tblworktoreturn) super.clone();
    o.FDTMFILINGPERIOD = (o.FDTMFILINGPERIOD != null) ? (java.sql.Timestamp) o.FDTMFILINGPERIOD.clone() : null;
    o.FDTMRECEIVED = (o.FDTMRECEIVED != null) ? (java.sql.Timestamp) o.FDTMRECEIVED.clone() : null;
    o.FDTMCOMPOSED = (o.FDTMCOMPOSED != null) ? (java.sql.Timestamp) o.FDTMCOMPOSED.clone() : null;
    o.FDTMWHEN = (o.FDTMWHEN != null) ? (java.sql.Timestamp) o.FDTMWHEN.clone() : null;
    return o;
  }

  public void clone0(tblworktoreturn o) throws CloneNotSupportedException {
    o.FDTMFILINGPERIOD = (o.FDTMFILINGPERIOD != null) ? (java.sql.Timestamp) o.FDTMFILINGPERIOD.clone() : null;
    o.FDTMRECEIVED = (o.FDTMRECEIVED != null) ? (java.sql.Timestamp) o.FDTMRECEIVED.clone() : null;
    o.FDTMCOMPOSED = (o.FDTMCOMPOSED != null) ? (java.sql.Timestamp) o.FDTMCOMPOSED.clone() : null;
    o.FDTMWHEN = (o.FDTMWHEN != null) ? (java.sql.Timestamp) o.FDTMWHEN.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("FLNGRETURNKEY", this.FLNGRETURNKEY);
    __sqoop$field_map.put("FLNGWORKKEY", this.FLNGWORKKEY);
    __sqoop$field_map.put("FSTRRETURNTYPE", this.FSTRRETURNTYPE);
    __sqoop$field_map.put("FLNGBATCHKEY", this.FLNGBATCHKEY);
    __sqoop$field_map.put("FSTRBATCHID", this.FSTRBATCHID);
    __sqoop$field_map.put("FINTSEQUENCE", this.FINTSEQUENCE);
    __sqoop$field_map.put("FDTMFILINGPERIOD", this.FDTMFILINGPERIOD);
    __sqoop$field_map.put("FDTMRECEIVED", this.FDTMRECEIVED);
    __sqoop$field_map.put("FDTMCOMPOSED", this.FDTMCOMPOSED);
    __sqoop$field_map.put("FCURRISK", this.FCURRISK);
    __sqoop$field_map.put("FBLNOPEN", this.FBLNOPEN);
    __sqoop$field_map.put("FSTRACCOUNTTYPE", this.FSTRACCOUNTTYPE);
    __sqoop$field_map.put("FSTRWHO", this.FSTRWHO);
    __sqoop$field_map.put("FDTMWHEN", this.FDTMWHEN);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("FLNGRETURNKEY", this.FLNGRETURNKEY);
    __sqoop$field_map.put("FLNGWORKKEY", this.FLNGWORKKEY);
    __sqoop$field_map.put("FSTRRETURNTYPE", this.FSTRRETURNTYPE);
    __sqoop$field_map.put("FLNGBATCHKEY", this.FLNGBATCHKEY);
    __sqoop$field_map.put("FSTRBATCHID", this.FSTRBATCHID);
    __sqoop$field_map.put("FINTSEQUENCE", this.FINTSEQUENCE);
    __sqoop$field_map.put("FDTMFILINGPERIOD", this.FDTMFILINGPERIOD);
    __sqoop$field_map.put("FDTMRECEIVED", this.FDTMRECEIVED);
    __sqoop$field_map.put("FDTMCOMPOSED", this.FDTMCOMPOSED);
    __sqoop$field_map.put("FCURRISK", this.FCURRISK);
    __sqoop$field_map.put("FBLNOPEN", this.FBLNOPEN);
    __sqoop$field_map.put("FSTRACCOUNTTYPE", this.FSTRACCOUNTTYPE);
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
