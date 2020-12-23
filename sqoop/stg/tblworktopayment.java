// ORM class for table 'tblworktopayment'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 05:37:12 NZDT 2020
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

public class tblworktopayment extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("FLNGPAYMENTKEY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworktopayment.this.FLNGPAYMENTKEY = (Integer)value;
      }
    });
    setters.put("FLNGWORKKEY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworktopayment.this.FLNGWORKKEY = (Integer)value;
      }
    });
    setters.put("FBLNOPEN", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworktopayment.this.FBLNOPEN = (Integer)value;
      }
    });
    setters.put("FSTRDATA", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworktopayment.this.FSTRDATA = (String)value;
      }
    });
    setters.put("FLNGBATCHKEY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworktopayment.this.FLNGBATCHKEY = (Integer)value;
      }
    });
    setters.put("FSTRBATCHID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworktopayment.this.FSTRBATCHID = (String)value;
      }
    });
    setters.put("FINTSEQUENCE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworktopayment.this.FINTSEQUENCE = (Integer)value;
      }
    });
    setters.put("FDTMCOMPOSED", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworktopayment.this.FDTMCOMPOSED = (java.sql.Timestamp)value;
      }
    });
    setters.put("FCURAMOUNT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworktopayment.this.FCURAMOUNT = (java.math.BigDecimal)value;
      }
    });
    setters.put("FINTITEMS", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworktopayment.this.FINTITEMS = (Integer)value;
      }
    });
    setters.put("FSTRACCOUNTTYPE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworktopayment.this.FSTRACCOUNTTYPE = (String)value;
      }
    });
    setters.put("FSTRSOURCE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworktopayment.this.FSTRSOURCE = (String)value;
      }
    });
    setters.put("FSTRWHO", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworktopayment.this.FSTRWHO = (String)value;
      }
    });
    setters.put("FDTMWHEN", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblworktopayment.this.FDTMWHEN = (java.sql.Timestamp)value;
      }
    });
  }
  public tblworktopayment() {
    init0();
  }
  private Integer FLNGPAYMENTKEY;
  public Integer get_FLNGPAYMENTKEY() {
    return FLNGPAYMENTKEY;
  }
  public void set_FLNGPAYMENTKEY(Integer FLNGPAYMENTKEY) {
    this.FLNGPAYMENTKEY = FLNGPAYMENTKEY;
  }
  public tblworktopayment with_FLNGPAYMENTKEY(Integer FLNGPAYMENTKEY) {
    this.FLNGPAYMENTKEY = FLNGPAYMENTKEY;
    return this;
  }
  private Integer FLNGWORKKEY;
  public Integer get_FLNGWORKKEY() {
    return FLNGWORKKEY;
  }
  public void set_FLNGWORKKEY(Integer FLNGWORKKEY) {
    this.FLNGWORKKEY = FLNGWORKKEY;
  }
  public tblworktopayment with_FLNGWORKKEY(Integer FLNGWORKKEY) {
    this.FLNGWORKKEY = FLNGWORKKEY;
    return this;
  }
  private Integer FBLNOPEN;
  public Integer get_FBLNOPEN() {
    return FBLNOPEN;
  }
  public void set_FBLNOPEN(Integer FBLNOPEN) {
    this.FBLNOPEN = FBLNOPEN;
  }
  public tblworktopayment with_FBLNOPEN(Integer FBLNOPEN) {
    this.FBLNOPEN = FBLNOPEN;
    return this;
  }
  private String FSTRDATA;
  public String get_FSTRDATA() {
    return FSTRDATA;
  }
  public void set_FSTRDATA(String FSTRDATA) {
    this.FSTRDATA = FSTRDATA;
  }
  public tblworktopayment with_FSTRDATA(String FSTRDATA) {
    this.FSTRDATA = FSTRDATA;
    return this;
  }
  private Integer FLNGBATCHKEY;
  public Integer get_FLNGBATCHKEY() {
    return FLNGBATCHKEY;
  }
  public void set_FLNGBATCHKEY(Integer FLNGBATCHKEY) {
    this.FLNGBATCHKEY = FLNGBATCHKEY;
  }
  public tblworktopayment with_FLNGBATCHKEY(Integer FLNGBATCHKEY) {
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
  public tblworktopayment with_FSTRBATCHID(String FSTRBATCHID) {
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
  public tblworktopayment with_FINTSEQUENCE(Integer FINTSEQUENCE) {
    this.FINTSEQUENCE = FINTSEQUENCE;
    return this;
  }
  private java.sql.Timestamp FDTMCOMPOSED;
  public java.sql.Timestamp get_FDTMCOMPOSED() {
    return FDTMCOMPOSED;
  }
  public void set_FDTMCOMPOSED(java.sql.Timestamp FDTMCOMPOSED) {
    this.FDTMCOMPOSED = FDTMCOMPOSED;
  }
  public tblworktopayment with_FDTMCOMPOSED(java.sql.Timestamp FDTMCOMPOSED) {
    this.FDTMCOMPOSED = FDTMCOMPOSED;
    return this;
  }
  private java.math.BigDecimal FCURAMOUNT;
  public java.math.BigDecimal get_FCURAMOUNT() {
    return FCURAMOUNT;
  }
  public void set_FCURAMOUNT(java.math.BigDecimal FCURAMOUNT) {
    this.FCURAMOUNT = FCURAMOUNT;
  }
  public tblworktopayment with_FCURAMOUNT(java.math.BigDecimal FCURAMOUNT) {
    this.FCURAMOUNT = FCURAMOUNT;
    return this;
  }
  private Integer FINTITEMS;
  public Integer get_FINTITEMS() {
    return FINTITEMS;
  }
  public void set_FINTITEMS(Integer FINTITEMS) {
    this.FINTITEMS = FINTITEMS;
  }
  public tblworktopayment with_FINTITEMS(Integer FINTITEMS) {
    this.FINTITEMS = FINTITEMS;
    return this;
  }
  private String FSTRACCOUNTTYPE;
  public String get_FSTRACCOUNTTYPE() {
    return FSTRACCOUNTTYPE;
  }
  public void set_FSTRACCOUNTTYPE(String FSTRACCOUNTTYPE) {
    this.FSTRACCOUNTTYPE = FSTRACCOUNTTYPE;
  }
  public tblworktopayment with_FSTRACCOUNTTYPE(String FSTRACCOUNTTYPE) {
    this.FSTRACCOUNTTYPE = FSTRACCOUNTTYPE;
    return this;
  }
  private String FSTRSOURCE;
  public String get_FSTRSOURCE() {
    return FSTRSOURCE;
  }
  public void set_FSTRSOURCE(String FSTRSOURCE) {
    this.FSTRSOURCE = FSTRSOURCE;
  }
  public tblworktopayment with_FSTRSOURCE(String FSTRSOURCE) {
    this.FSTRSOURCE = FSTRSOURCE;
    return this;
  }
  private String FSTRWHO;
  public String get_FSTRWHO() {
    return FSTRWHO;
  }
  public void set_FSTRWHO(String FSTRWHO) {
    this.FSTRWHO = FSTRWHO;
  }
  public tblworktopayment with_FSTRWHO(String FSTRWHO) {
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
  public tblworktopayment with_FDTMWHEN(java.sql.Timestamp FDTMWHEN) {
    this.FDTMWHEN = FDTMWHEN;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblworktopayment)) {
      return false;
    }
    tblworktopayment that = (tblworktopayment) o;
    boolean equal = true;
    equal = equal && (this.FLNGPAYMENTKEY == null ? that.FLNGPAYMENTKEY == null : this.FLNGPAYMENTKEY.equals(that.FLNGPAYMENTKEY));
    equal = equal && (this.FLNGWORKKEY == null ? that.FLNGWORKKEY == null : this.FLNGWORKKEY.equals(that.FLNGWORKKEY));
    equal = equal && (this.FBLNOPEN == null ? that.FBLNOPEN == null : this.FBLNOPEN.equals(that.FBLNOPEN));
    equal = equal && (this.FSTRDATA == null ? that.FSTRDATA == null : this.FSTRDATA.equals(that.FSTRDATA));
    equal = equal && (this.FLNGBATCHKEY == null ? that.FLNGBATCHKEY == null : this.FLNGBATCHKEY.equals(that.FLNGBATCHKEY));
    equal = equal && (this.FSTRBATCHID == null ? that.FSTRBATCHID == null : this.FSTRBATCHID.equals(that.FSTRBATCHID));
    equal = equal && (this.FINTSEQUENCE == null ? that.FINTSEQUENCE == null : this.FINTSEQUENCE.equals(that.FINTSEQUENCE));
    equal = equal && (this.FDTMCOMPOSED == null ? that.FDTMCOMPOSED == null : this.FDTMCOMPOSED.equals(that.FDTMCOMPOSED));
    equal = equal && (this.FCURAMOUNT == null ? that.FCURAMOUNT == null : this.FCURAMOUNT.equals(that.FCURAMOUNT));
    equal = equal && (this.FINTITEMS == null ? that.FINTITEMS == null : this.FINTITEMS.equals(that.FINTITEMS));
    equal = equal && (this.FSTRACCOUNTTYPE == null ? that.FSTRACCOUNTTYPE == null : this.FSTRACCOUNTTYPE.equals(that.FSTRACCOUNTTYPE));
    equal = equal && (this.FSTRSOURCE == null ? that.FSTRSOURCE == null : this.FSTRSOURCE.equals(that.FSTRSOURCE));
    equal = equal && (this.FSTRWHO == null ? that.FSTRWHO == null : this.FSTRWHO.equals(that.FSTRWHO));
    equal = equal && (this.FDTMWHEN == null ? that.FDTMWHEN == null : this.FDTMWHEN.equals(that.FDTMWHEN));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblworktopayment)) {
      return false;
    }
    tblworktopayment that = (tblworktopayment) o;
    boolean equal = true;
    equal = equal && (this.FLNGPAYMENTKEY == null ? that.FLNGPAYMENTKEY == null : this.FLNGPAYMENTKEY.equals(that.FLNGPAYMENTKEY));
    equal = equal && (this.FLNGWORKKEY == null ? that.FLNGWORKKEY == null : this.FLNGWORKKEY.equals(that.FLNGWORKKEY));
    equal = equal && (this.FBLNOPEN == null ? that.FBLNOPEN == null : this.FBLNOPEN.equals(that.FBLNOPEN));
    equal = equal && (this.FSTRDATA == null ? that.FSTRDATA == null : this.FSTRDATA.equals(that.FSTRDATA));
    equal = equal && (this.FLNGBATCHKEY == null ? that.FLNGBATCHKEY == null : this.FLNGBATCHKEY.equals(that.FLNGBATCHKEY));
    equal = equal && (this.FSTRBATCHID == null ? that.FSTRBATCHID == null : this.FSTRBATCHID.equals(that.FSTRBATCHID));
    equal = equal && (this.FINTSEQUENCE == null ? that.FINTSEQUENCE == null : this.FINTSEQUENCE.equals(that.FINTSEQUENCE));
    equal = equal && (this.FDTMCOMPOSED == null ? that.FDTMCOMPOSED == null : this.FDTMCOMPOSED.equals(that.FDTMCOMPOSED));
    equal = equal && (this.FCURAMOUNT == null ? that.FCURAMOUNT == null : this.FCURAMOUNT.equals(that.FCURAMOUNT));
    equal = equal && (this.FINTITEMS == null ? that.FINTITEMS == null : this.FINTITEMS.equals(that.FINTITEMS));
    equal = equal && (this.FSTRACCOUNTTYPE == null ? that.FSTRACCOUNTTYPE == null : this.FSTRACCOUNTTYPE.equals(that.FSTRACCOUNTTYPE));
    equal = equal && (this.FSTRSOURCE == null ? that.FSTRSOURCE == null : this.FSTRSOURCE.equals(that.FSTRSOURCE));
    equal = equal && (this.FSTRWHO == null ? that.FSTRWHO == null : this.FSTRWHO.equals(that.FSTRWHO));
    equal = equal && (this.FDTMWHEN == null ? that.FDTMWHEN == null : this.FDTMWHEN.equals(that.FDTMWHEN));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.FLNGPAYMENTKEY = JdbcWritableBridge.readInteger(1, __dbResults);
    this.FLNGWORKKEY = JdbcWritableBridge.readInteger(2, __dbResults);
    this.FBLNOPEN = JdbcWritableBridge.readInteger(3, __dbResults);
    this.FSTRDATA = JdbcWritableBridge.readString(4, __dbResults);
    this.FLNGBATCHKEY = JdbcWritableBridge.readInteger(5, __dbResults);
    this.FSTRBATCHID = JdbcWritableBridge.readString(6, __dbResults);
    this.FINTSEQUENCE = JdbcWritableBridge.readInteger(7, __dbResults);
    this.FDTMCOMPOSED = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.FCURAMOUNT = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.FINTITEMS = JdbcWritableBridge.readInteger(10, __dbResults);
    this.FSTRACCOUNTTYPE = JdbcWritableBridge.readString(11, __dbResults);
    this.FSTRSOURCE = JdbcWritableBridge.readString(12, __dbResults);
    this.FSTRWHO = JdbcWritableBridge.readString(13, __dbResults);
    this.FDTMWHEN = JdbcWritableBridge.readTimestamp(14, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.FLNGPAYMENTKEY = JdbcWritableBridge.readInteger(1, __dbResults);
    this.FLNGWORKKEY = JdbcWritableBridge.readInteger(2, __dbResults);
    this.FBLNOPEN = JdbcWritableBridge.readInteger(3, __dbResults);
    this.FSTRDATA = JdbcWritableBridge.readString(4, __dbResults);
    this.FLNGBATCHKEY = JdbcWritableBridge.readInteger(5, __dbResults);
    this.FSTRBATCHID = JdbcWritableBridge.readString(6, __dbResults);
    this.FINTSEQUENCE = JdbcWritableBridge.readInteger(7, __dbResults);
    this.FDTMCOMPOSED = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.FCURAMOUNT = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.FINTITEMS = JdbcWritableBridge.readInteger(10, __dbResults);
    this.FSTRACCOUNTTYPE = JdbcWritableBridge.readString(11, __dbResults);
    this.FSTRSOURCE = JdbcWritableBridge.readString(12, __dbResults);
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
    JdbcWritableBridge.writeInteger(FLNGPAYMENTKEY, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGWORKKEY, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FBLNOPEN, 3 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(FSTRDATA, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGBATCHKEY, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(FSTRBATCHID, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(FINTSEQUENCE, 7 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMCOMPOSED, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(FCURAMOUNT, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(FINTITEMS, 10 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(FSTRACCOUNTTYPE, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(FSTRSOURCE, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(FSTRWHO, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMWHEN, 14 + __off, 93, __dbStmt);
    return 14;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(FLNGPAYMENTKEY, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGWORKKEY, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FBLNOPEN, 3 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(FSTRDATA, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGBATCHKEY, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(FSTRBATCHID, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(FINTSEQUENCE, 7 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMCOMPOSED, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(FCURAMOUNT, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(FINTITEMS, 10 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(FSTRACCOUNTTYPE, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(FSTRSOURCE, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(FSTRWHO, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMWHEN, 14 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.FLNGPAYMENTKEY = null;
    } else {
    this.FLNGPAYMENTKEY = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FLNGWORKKEY = null;
    } else {
    this.FLNGWORKKEY = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FBLNOPEN = null;
    } else {
    this.FBLNOPEN = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FSTRDATA = null;
    } else {
    this.FSTRDATA = Text.readString(__dataIn);
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
        this.FDTMCOMPOSED = null;
    } else {
    this.FDTMCOMPOSED = new Timestamp(__dataIn.readLong());
    this.FDTMCOMPOSED.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FCURAMOUNT = null;
    } else {
    this.FCURAMOUNT = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FINTITEMS = null;
    } else {
    this.FINTITEMS = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FSTRACCOUNTTYPE = null;
    } else {
    this.FSTRACCOUNTTYPE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FSTRSOURCE = null;
    } else {
    this.FSTRSOURCE = Text.readString(__dataIn);
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
    if (null == this.FLNGPAYMENTKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGPAYMENTKEY);
    }
    if (null == this.FLNGWORKKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGWORKKEY);
    }
    if (null == this.FBLNOPEN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FBLNOPEN);
    }
    if (null == this.FSTRDATA) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRDATA);
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
    if (null == this.FDTMCOMPOSED) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMCOMPOSED.getTime());
    __dataOut.writeInt(this.FDTMCOMPOSED.getNanos());
    }
    if (null == this.FCURAMOUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.FCURAMOUNT, __dataOut);
    }
    if (null == this.FINTITEMS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FINTITEMS);
    }
    if (null == this.FSTRACCOUNTTYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRACCOUNTTYPE);
    }
    if (null == this.FSTRSOURCE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRSOURCE);
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
    if (null == this.FLNGPAYMENTKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGPAYMENTKEY);
    }
    if (null == this.FLNGWORKKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGWORKKEY);
    }
    if (null == this.FBLNOPEN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FBLNOPEN);
    }
    if (null == this.FSTRDATA) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRDATA);
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
    if (null == this.FDTMCOMPOSED) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMCOMPOSED.getTime());
    __dataOut.writeInt(this.FDTMCOMPOSED.getNanos());
    }
    if (null == this.FCURAMOUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.FCURAMOUNT, __dataOut);
    }
    if (null == this.FINTITEMS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FINTITEMS);
    }
    if (null == this.FSTRACCOUNTTYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRACCOUNTTYPE);
    }
    if (null == this.FSTRSOURCE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRSOURCE);
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
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGPAYMENTKEY==null?"\\N":"" + FLNGPAYMENTKEY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGWORKKEY==null?"\\N":"" + FLNGWORKKEY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FBLNOPEN==null?"\\N":"" + FBLNOPEN, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRDATA==null?"\\N":FSTRDATA, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGBATCHKEY==null?"\\N":"" + FLNGBATCHKEY, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRBATCHID==null?"\\N":FSTRBATCHID, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FINTSEQUENCE==null?"\\N":"" + FINTSEQUENCE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMCOMPOSED==null?"\\N":"" + FDTMCOMPOSED, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FCURAMOUNT==null?"\\N":FCURAMOUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FINTITEMS==null?"\\N":"" + FINTITEMS, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRACCOUNTTYPE==null?"\\N":FSTRACCOUNTTYPE, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRSOURCE==null?"\\N":FSTRSOURCE, " ", delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGPAYMENTKEY==null?"\\N":"" + FLNGPAYMENTKEY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGWORKKEY==null?"\\N":"" + FLNGWORKKEY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FBLNOPEN==null?"\\N":"" + FBLNOPEN, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRDATA==null?"\\N":FSTRDATA, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGBATCHKEY==null?"\\N":"" + FLNGBATCHKEY, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRBATCHID==null?"\\N":FSTRBATCHID, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FINTSEQUENCE==null?"\\N":"" + FINTSEQUENCE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMCOMPOSED==null?"\\N":"" + FDTMCOMPOSED, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FCURAMOUNT==null?"\\N":FCURAMOUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FINTITEMS==null?"\\N":"" + FINTITEMS, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRACCOUNTTYPE==null?"\\N":FSTRACCOUNTTYPE, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRSOURCE==null?"\\N":FSTRSOURCE, " ", delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGPAYMENTKEY = null; } else {
      this.FLNGPAYMENTKEY = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FBLNOPEN = null; } else {
      this.FBLNOPEN = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRDATA = null; } else {
      this.FSTRDATA = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMCOMPOSED = null; } else {
      this.FDTMCOMPOSED = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FCURAMOUNT = null; } else {
      this.FCURAMOUNT = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FINTITEMS = null; } else {
      this.FINTITEMS = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.FSTRSOURCE = null; } else {
      this.FSTRSOURCE = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGPAYMENTKEY = null; } else {
      this.FLNGPAYMENTKEY = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FBLNOPEN = null; } else {
      this.FBLNOPEN = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRDATA = null; } else {
      this.FSTRDATA = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMCOMPOSED = null; } else {
      this.FDTMCOMPOSED = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FCURAMOUNT = null; } else {
      this.FCURAMOUNT = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FINTITEMS = null; } else {
      this.FINTITEMS = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.FSTRSOURCE = null; } else {
      this.FSTRSOURCE = __cur_str;
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
    tblworktopayment o = (tblworktopayment) super.clone();
    o.FDTMCOMPOSED = (o.FDTMCOMPOSED != null) ? (java.sql.Timestamp) o.FDTMCOMPOSED.clone() : null;
    o.FDTMWHEN = (o.FDTMWHEN != null) ? (java.sql.Timestamp) o.FDTMWHEN.clone() : null;
    return o;
  }

  public void clone0(tblworktopayment o) throws CloneNotSupportedException {
    o.FDTMCOMPOSED = (o.FDTMCOMPOSED != null) ? (java.sql.Timestamp) o.FDTMCOMPOSED.clone() : null;
    o.FDTMWHEN = (o.FDTMWHEN != null) ? (java.sql.Timestamp) o.FDTMWHEN.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("FLNGPAYMENTKEY", this.FLNGPAYMENTKEY);
    __sqoop$field_map.put("FLNGWORKKEY", this.FLNGWORKKEY);
    __sqoop$field_map.put("FBLNOPEN", this.FBLNOPEN);
    __sqoop$field_map.put("FSTRDATA", this.FSTRDATA);
    __sqoop$field_map.put("FLNGBATCHKEY", this.FLNGBATCHKEY);
    __sqoop$field_map.put("FSTRBATCHID", this.FSTRBATCHID);
    __sqoop$field_map.put("FINTSEQUENCE", this.FINTSEQUENCE);
    __sqoop$field_map.put("FDTMCOMPOSED", this.FDTMCOMPOSED);
    __sqoop$field_map.put("FCURAMOUNT", this.FCURAMOUNT);
    __sqoop$field_map.put("FINTITEMS", this.FINTITEMS);
    __sqoop$field_map.put("FSTRACCOUNTTYPE", this.FSTRACCOUNTTYPE);
    __sqoop$field_map.put("FSTRSOURCE", this.FSTRSOURCE);
    __sqoop$field_map.put("FSTRWHO", this.FSTRWHO);
    __sqoop$field_map.put("FDTMWHEN", this.FDTMWHEN);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("FLNGPAYMENTKEY", this.FLNGPAYMENTKEY);
    __sqoop$field_map.put("FLNGWORKKEY", this.FLNGWORKKEY);
    __sqoop$field_map.put("FBLNOPEN", this.FBLNOPEN);
    __sqoop$field_map.put("FSTRDATA", this.FSTRDATA);
    __sqoop$field_map.put("FLNGBATCHKEY", this.FLNGBATCHKEY);
    __sqoop$field_map.put("FSTRBATCHID", this.FSTRBATCHID);
    __sqoop$field_map.put("FINTSEQUENCE", this.FINTSEQUENCE);
    __sqoop$field_map.put("FDTMCOMPOSED", this.FDTMCOMPOSED);
    __sqoop$field_map.put("FCURAMOUNT", this.FCURAMOUNT);
    __sqoop$field_map.put("FINTITEMS", this.FINTITEMS);
    __sqoop$field_map.put("FSTRACCOUNTTYPE", this.FSTRACCOUNTTYPE);
    __sqoop$field_map.put("FSTRSOURCE", this.FSTRSOURCE);
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
