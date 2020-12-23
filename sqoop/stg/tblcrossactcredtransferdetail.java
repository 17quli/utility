// ORM class for table 'tblcrossactcredtransferdetail'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 08:01:03 NZDT 2020
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

public class tblcrossactcredtransferdetail extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("FLNGCREDITTRANSFERKEY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcrossactcredtransferdetail.this.FLNGCREDITTRANSFERKEY = (Integer)value;
      }
    });
    setters.put("FLNGSOURCEPOSTEDTRANSKEY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcrossactcredtransferdetail.this.FLNGSOURCEPOSTEDTRANSKEY = (Integer)value;
      }
    });
    setters.put("FLNGTARGETPOSTEDTRANSKEY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcrossactcredtransferdetail.this.FLNGTARGETPOSTEDTRANSKEY = (Integer)value;
      }
    });
    setters.put("FLNGVER", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcrossactcredtransferdetail.this.FLNGVER = (Integer)value;
      }
    });
    setters.put("FLNGVERLAST", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcrossactcredtransferdetail.this.FLNGVERLAST = (Integer)value;
      }
    });
    setters.put("FLNGSOURCETRANSKEY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcrossactcredtransferdetail.this.FLNGSOURCETRANSKEY = (Integer)value;
      }
    });
    setters.put("FCURAVAILABLE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcrossactcredtransferdetail.this.FCURAVAILABLE = (java.math.BigDecimal)value;
      }
    });
    setters.put("FCURAPPROVED", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcrossactcredtransferdetail.this.FCURAPPROVED = (java.math.BigDecimal)value;
      }
    });
    setters.put("FCURTRANSFERED", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcrossactcredtransferdetail.this.FCURTRANSFERED = (java.math.BigDecimal)value;
      }
    });
    setters.put("FDTMTRANSFERED", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcrossactcredtransferdetail.this.FDTMTRANSFERED = (java.sql.Timestamp)value;
      }
    });
    setters.put("FSTRAPPROVED", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcrossactcredtransferdetail.this.FSTRAPPROVED = (String)value;
      }
    });
    setters.put("FSTRWHO", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcrossactcredtransferdetail.this.FSTRWHO = (String)value;
      }
    });
    setters.put("FDTMWHEN", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcrossactcredtransferdetail.this.FDTMWHEN = (java.sql.Timestamp)value;
      }
    });
  }
  public tblcrossactcredtransferdetail() {
    init0();
  }
  private Integer FLNGCREDITTRANSFERKEY;
  public Integer get_FLNGCREDITTRANSFERKEY() {
    return FLNGCREDITTRANSFERKEY;
  }
  public void set_FLNGCREDITTRANSFERKEY(Integer FLNGCREDITTRANSFERKEY) {
    this.FLNGCREDITTRANSFERKEY = FLNGCREDITTRANSFERKEY;
  }
  public tblcrossactcredtransferdetail with_FLNGCREDITTRANSFERKEY(Integer FLNGCREDITTRANSFERKEY) {
    this.FLNGCREDITTRANSFERKEY = FLNGCREDITTRANSFERKEY;
    return this;
  }
  private Integer FLNGSOURCEPOSTEDTRANSKEY;
  public Integer get_FLNGSOURCEPOSTEDTRANSKEY() {
    return FLNGSOURCEPOSTEDTRANSKEY;
  }
  public void set_FLNGSOURCEPOSTEDTRANSKEY(Integer FLNGSOURCEPOSTEDTRANSKEY) {
    this.FLNGSOURCEPOSTEDTRANSKEY = FLNGSOURCEPOSTEDTRANSKEY;
  }
  public tblcrossactcredtransferdetail with_FLNGSOURCEPOSTEDTRANSKEY(Integer FLNGSOURCEPOSTEDTRANSKEY) {
    this.FLNGSOURCEPOSTEDTRANSKEY = FLNGSOURCEPOSTEDTRANSKEY;
    return this;
  }
  private Integer FLNGTARGETPOSTEDTRANSKEY;
  public Integer get_FLNGTARGETPOSTEDTRANSKEY() {
    return FLNGTARGETPOSTEDTRANSKEY;
  }
  public void set_FLNGTARGETPOSTEDTRANSKEY(Integer FLNGTARGETPOSTEDTRANSKEY) {
    this.FLNGTARGETPOSTEDTRANSKEY = FLNGTARGETPOSTEDTRANSKEY;
  }
  public tblcrossactcredtransferdetail with_FLNGTARGETPOSTEDTRANSKEY(Integer FLNGTARGETPOSTEDTRANSKEY) {
    this.FLNGTARGETPOSTEDTRANSKEY = FLNGTARGETPOSTEDTRANSKEY;
    return this;
  }
  private Integer FLNGVER;
  public Integer get_FLNGVER() {
    return FLNGVER;
  }
  public void set_FLNGVER(Integer FLNGVER) {
    this.FLNGVER = FLNGVER;
  }
  public tblcrossactcredtransferdetail with_FLNGVER(Integer FLNGVER) {
    this.FLNGVER = FLNGVER;
    return this;
  }
  private Integer FLNGVERLAST;
  public Integer get_FLNGVERLAST() {
    return FLNGVERLAST;
  }
  public void set_FLNGVERLAST(Integer FLNGVERLAST) {
    this.FLNGVERLAST = FLNGVERLAST;
  }
  public tblcrossactcredtransferdetail with_FLNGVERLAST(Integer FLNGVERLAST) {
    this.FLNGVERLAST = FLNGVERLAST;
    return this;
  }
  private Integer FLNGSOURCETRANSKEY;
  public Integer get_FLNGSOURCETRANSKEY() {
    return FLNGSOURCETRANSKEY;
  }
  public void set_FLNGSOURCETRANSKEY(Integer FLNGSOURCETRANSKEY) {
    this.FLNGSOURCETRANSKEY = FLNGSOURCETRANSKEY;
  }
  public tblcrossactcredtransferdetail with_FLNGSOURCETRANSKEY(Integer FLNGSOURCETRANSKEY) {
    this.FLNGSOURCETRANSKEY = FLNGSOURCETRANSKEY;
    return this;
  }
  private java.math.BigDecimal FCURAVAILABLE;
  public java.math.BigDecimal get_FCURAVAILABLE() {
    return FCURAVAILABLE;
  }
  public void set_FCURAVAILABLE(java.math.BigDecimal FCURAVAILABLE) {
    this.FCURAVAILABLE = FCURAVAILABLE;
  }
  public tblcrossactcredtransferdetail with_FCURAVAILABLE(java.math.BigDecimal FCURAVAILABLE) {
    this.FCURAVAILABLE = FCURAVAILABLE;
    return this;
  }
  private java.math.BigDecimal FCURAPPROVED;
  public java.math.BigDecimal get_FCURAPPROVED() {
    return FCURAPPROVED;
  }
  public void set_FCURAPPROVED(java.math.BigDecimal FCURAPPROVED) {
    this.FCURAPPROVED = FCURAPPROVED;
  }
  public tblcrossactcredtransferdetail with_FCURAPPROVED(java.math.BigDecimal FCURAPPROVED) {
    this.FCURAPPROVED = FCURAPPROVED;
    return this;
  }
  private java.math.BigDecimal FCURTRANSFERED;
  public java.math.BigDecimal get_FCURTRANSFERED() {
    return FCURTRANSFERED;
  }
  public void set_FCURTRANSFERED(java.math.BigDecimal FCURTRANSFERED) {
    this.FCURTRANSFERED = FCURTRANSFERED;
  }
  public tblcrossactcredtransferdetail with_FCURTRANSFERED(java.math.BigDecimal FCURTRANSFERED) {
    this.FCURTRANSFERED = FCURTRANSFERED;
    return this;
  }
  private java.sql.Timestamp FDTMTRANSFERED;
  public java.sql.Timestamp get_FDTMTRANSFERED() {
    return FDTMTRANSFERED;
  }
  public void set_FDTMTRANSFERED(java.sql.Timestamp FDTMTRANSFERED) {
    this.FDTMTRANSFERED = FDTMTRANSFERED;
  }
  public tblcrossactcredtransferdetail with_FDTMTRANSFERED(java.sql.Timestamp FDTMTRANSFERED) {
    this.FDTMTRANSFERED = FDTMTRANSFERED;
    return this;
  }
  private String FSTRAPPROVED;
  public String get_FSTRAPPROVED() {
    return FSTRAPPROVED;
  }
  public void set_FSTRAPPROVED(String FSTRAPPROVED) {
    this.FSTRAPPROVED = FSTRAPPROVED;
  }
  public tblcrossactcredtransferdetail with_FSTRAPPROVED(String FSTRAPPROVED) {
    this.FSTRAPPROVED = FSTRAPPROVED;
    return this;
  }
  private String FSTRWHO;
  public String get_FSTRWHO() {
    return FSTRWHO;
  }
  public void set_FSTRWHO(String FSTRWHO) {
    this.FSTRWHO = FSTRWHO;
  }
  public tblcrossactcredtransferdetail with_FSTRWHO(String FSTRWHO) {
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
  public tblcrossactcredtransferdetail with_FDTMWHEN(java.sql.Timestamp FDTMWHEN) {
    this.FDTMWHEN = FDTMWHEN;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblcrossactcredtransferdetail)) {
      return false;
    }
    tblcrossactcredtransferdetail that = (tblcrossactcredtransferdetail) o;
    boolean equal = true;
    equal = equal && (this.FLNGCREDITTRANSFERKEY == null ? that.FLNGCREDITTRANSFERKEY == null : this.FLNGCREDITTRANSFERKEY.equals(that.FLNGCREDITTRANSFERKEY));
    equal = equal && (this.FLNGSOURCEPOSTEDTRANSKEY == null ? that.FLNGSOURCEPOSTEDTRANSKEY == null : this.FLNGSOURCEPOSTEDTRANSKEY.equals(that.FLNGSOURCEPOSTEDTRANSKEY));
    equal = equal && (this.FLNGTARGETPOSTEDTRANSKEY == null ? that.FLNGTARGETPOSTEDTRANSKEY == null : this.FLNGTARGETPOSTEDTRANSKEY.equals(that.FLNGTARGETPOSTEDTRANSKEY));
    equal = equal && (this.FLNGVER == null ? that.FLNGVER == null : this.FLNGVER.equals(that.FLNGVER));
    equal = equal && (this.FLNGVERLAST == null ? that.FLNGVERLAST == null : this.FLNGVERLAST.equals(that.FLNGVERLAST));
    equal = equal && (this.FLNGSOURCETRANSKEY == null ? that.FLNGSOURCETRANSKEY == null : this.FLNGSOURCETRANSKEY.equals(that.FLNGSOURCETRANSKEY));
    equal = equal && (this.FCURAVAILABLE == null ? that.FCURAVAILABLE == null : this.FCURAVAILABLE.equals(that.FCURAVAILABLE));
    equal = equal && (this.FCURAPPROVED == null ? that.FCURAPPROVED == null : this.FCURAPPROVED.equals(that.FCURAPPROVED));
    equal = equal && (this.FCURTRANSFERED == null ? that.FCURTRANSFERED == null : this.FCURTRANSFERED.equals(that.FCURTRANSFERED));
    equal = equal && (this.FDTMTRANSFERED == null ? that.FDTMTRANSFERED == null : this.FDTMTRANSFERED.equals(that.FDTMTRANSFERED));
    equal = equal && (this.FSTRAPPROVED == null ? that.FSTRAPPROVED == null : this.FSTRAPPROVED.equals(that.FSTRAPPROVED));
    equal = equal && (this.FSTRWHO == null ? that.FSTRWHO == null : this.FSTRWHO.equals(that.FSTRWHO));
    equal = equal && (this.FDTMWHEN == null ? that.FDTMWHEN == null : this.FDTMWHEN.equals(that.FDTMWHEN));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblcrossactcredtransferdetail)) {
      return false;
    }
    tblcrossactcredtransferdetail that = (tblcrossactcredtransferdetail) o;
    boolean equal = true;
    equal = equal && (this.FLNGCREDITTRANSFERKEY == null ? that.FLNGCREDITTRANSFERKEY == null : this.FLNGCREDITTRANSFERKEY.equals(that.FLNGCREDITTRANSFERKEY));
    equal = equal && (this.FLNGSOURCEPOSTEDTRANSKEY == null ? that.FLNGSOURCEPOSTEDTRANSKEY == null : this.FLNGSOURCEPOSTEDTRANSKEY.equals(that.FLNGSOURCEPOSTEDTRANSKEY));
    equal = equal && (this.FLNGTARGETPOSTEDTRANSKEY == null ? that.FLNGTARGETPOSTEDTRANSKEY == null : this.FLNGTARGETPOSTEDTRANSKEY.equals(that.FLNGTARGETPOSTEDTRANSKEY));
    equal = equal && (this.FLNGVER == null ? that.FLNGVER == null : this.FLNGVER.equals(that.FLNGVER));
    equal = equal && (this.FLNGVERLAST == null ? that.FLNGVERLAST == null : this.FLNGVERLAST.equals(that.FLNGVERLAST));
    equal = equal && (this.FLNGSOURCETRANSKEY == null ? that.FLNGSOURCETRANSKEY == null : this.FLNGSOURCETRANSKEY.equals(that.FLNGSOURCETRANSKEY));
    equal = equal && (this.FCURAVAILABLE == null ? that.FCURAVAILABLE == null : this.FCURAVAILABLE.equals(that.FCURAVAILABLE));
    equal = equal && (this.FCURAPPROVED == null ? that.FCURAPPROVED == null : this.FCURAPPROVED.equals(that.FCURAPPROVED));
    equal = equal && (this.FCURTRANSFERED == null ? that.FCURTRANSFERED == null : this.FCURTRANSFERED.equals(that.FCURTRANSFERED));
    equal = equal && (this.FDTMTRANSFERED == null ? that.FDTMTRANSFERED == null : this.FDTMTRANSFERED.equals(that.FDTMTRANSFERED));
    equal = equal && (this.FSTRAPPROVED == null ? that.FSTRAPPROVED == null : this.FSTRAPPROVED.equals(that.FSTRAPPROVED));
    equal = equal && (this.FSTRWHO == null ? that.FSTRWHO == null : this.FSTRWHO.equals(that.FSTRWHO));
    equal = equal && (this.FDTMWHEN == null ? that.FDTMWHEN == null : this.FDTMWHEN.equals(that.FDTMWHEN));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.FLNGCREDITTRANSFERKEY = JdbcWritableBridge.readInteger(1, __dbResults);
    this.FLNGSOURCEPOSTEDTRANSKEY = JdbcWritableBridge.readInteger(2, __dbResults);
    this.FLNGTARGETPOSTEDTRANSKEY = JdbcWritableBridge.readInteger(3, __dbResults);
    this.FLNGVER = JdbcWritableBridge.readInteger(4, __dbResults);
    this.FLNGVERLAST = JdbcWritableBridge.readInteger(5, __dbResults);
    this.FLNGSOURCETRANSKEY = JdbcWritableBridge.readInteger(6, __dbResults);
    this.FCURAVAILABLE = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.FCURAPPROVED = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.FCURTRANSFERED = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.FDTMTRANSFERED = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.FSTRAPPROVED = JdbcWritableBridge.readString(11, __dbResults);
    this.FSTRWHO = JdbcWritableBridge.readString(12, __dbResults);
    this.FDTMWHEN = JdbcWritableBridge.readTimestamp(13, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.FLNGCREDITTRANSFERKEY = JdbcWritableBridge.readInteger(1, __dbResults);
    this.FLNGSOURCEPOSTEDTRANSKEY = JdbcWritableBridge.readInteger(2, __dbResults);
    this.FLNGTARGETPOSTEDTRANSKEY = JdbcWritableBridge.readInteger(3, __dbResults);
    this.FLNGVER = JdbcWritableBridge.readInteger(4, __dbResults);
    this.FLNGVERLAST = JdbcWritableBridge.readInteger(5, __dbResults);
    this.FLNGSOURCETRANSKEY = JdbcWritableBridge.readInteger(6, __dbResults);
    this.FCURAVAILABLE = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.FCURAPPROVED = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.FCURTRANSFERED = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.FDTMTRANSFERED = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.FSTRAPPROVED = JdbcWritableBridge.readString(11, __dbResults);
    this.FSTRWHO = JdbcWritableBridge.readString(12, __dbResults);
    this.FDTMWHEN = JdbcWritableBridge.readTimestamp(13, __dbResults);
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
    JdbcWritableBridge.writeInteger(FLNGCREDITTRANSFERKEY, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGSOURCEPOSTEDTRANSKEY, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGTARGETPOSTEDTRANSKEY, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGVER, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGVERLAST, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGSOURCETRANSKEY, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(FCURAVAILABLE, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(FCURAPPROVED, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(FCURTRANSFERED, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMTRANSFERED, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(FSTRAPPROVED, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(FSTRWHO, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMWHEN, 13 + __off, 93, __dbStmt);
    return 13;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(FLNGCREDITTRANSFERKEY, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGSOURCEPOSTEDTRANSKEY, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGTARGETPOSTEDTRANSKEY, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGVER, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGVERLAST, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGSOURCETRANSKEY, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(FCURAVAILABLE, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(FCURAPPROVED, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(FCURTRANSFERED, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMTRANSFERED, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(FSTRAPPROVED, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(FSTRWHO, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMWHEN, 13 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.FLNGCREDITTRANSFERKEY = null;
    } else {
    this.FLNGCREDITTRANSFERKEY = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FLNGSOURCEPOSTEDTRANSKEY = null;
    } else {
    this.FLNGSOURCEPOSTEDTRANSKEY = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FLNGTARGETPOSTEDTRANSKEY = null;
    } else {
    this.FLNGTARGETPOSTEDTRANSKEY = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FLNGVER = null;
    } else {
    this.FLNGVER = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FLNGVERLAST = null;
    } else {
    this.FLNGVERLAST = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FLNGSOURCETRANSKEY = null;
    } else {
    this.FLNGSOURCETRANSKEY = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FCURAVAILABLE = null;
    } else {
    this.FCURAVAILABLE = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FCURAPPROVED = null;
    } else {
    this.FCURAPPROVED = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FCURTRANSFERED = null;
    } else {
    this.FCURTRANSFERED = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FDTMTRANSFERED = null;
    } else {
    this.FDTMTRANSFERED = new Timestamp(__dataIn.readLong());
    this.FDTMTRANSFERED.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FSTRAPPROVED = null;
    } else {
    this.FSTRAPPROVED = Text.readString(__dataIn);
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
    if (null == this.FLNGCREDITTRANSFERKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGCREDITTRANSFERKEY);
    }
    if (null == this.FLNGSOURCEPOSTEDTRANSKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGSOURCEPOSTEDTRANSKEY);
    }
    if (null == this.FLNGTARGETPOSTEDTRANSKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGTARGETPOSTEDTRANSKEY);
    }
    if (null == this.FLNGVER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGVER);
    }
    if (null == this.FLNGVERLAST) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGVERLAST);
    }
    if (null == this.FLNGSOURCETRANSKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGSOURCETRANSKEY);
    }
    if (null == this.FCURAVAILABLE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.FCURAVAILABLE, __dataOut);
    }
    if (null == this.FCURAPPROVED) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.FCURAPPROVED, __dataOut);
    }
    if (null == this.FCURTRANSFERED) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.FCURTRANSFERED, __dataOut);
    }
    if (null == this.FDTMTRANSFERED) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMTRANSFERED.getTime());
    __dataOut.writeInt(this.FDTMTRANSFERED.getNanos());
    }
    if (null == this.FSTRAPPROVED) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRAPPROVED);
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
    if (null == this.FLNGCREDITTRANSFERKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGCREDITTRANSFERKEY);
    }
    if (null == this.FLNGSOURCEPOSTEDTRANSKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGSOURCEPOSTEDTRANSKEY);
    }
    if (null == this.FLNGTARGETPOSTEDTRANSKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGTARGETPOSTEDTRANSKEY);
    }
    if (null == this.FLNGVER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGVER);
    }
    if (null == this.FLNGVERLAST) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGVERLAST);
    }
    if (null == this.FLNGSOURCETRANSKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGSOURCETRANSKEY);
    }
    if (null == this.FCURAVAILABLE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.FCURAVAILABLE, __dataOut);
    }
    if (null == this.FCURAPPROVED) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.FCURAPPROVED, __dataOut);
    }
    if (null == this.FCURTRANSFERED) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.FCURTRANSFERED, __dataOut);
    }
    if (null == this.FDTMTRANSFERED) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMTRANSFERED.getTime());
    __dataOut.writeInt(this.FDTMTRANSFERED.getNanos());
    }
    if (null == this.FSTRAPPROVED) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRAPPROVED);
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
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGCREDITTRANSFERKEY==null?"\\N":"" + FLNGCREDITTRANSFERKEY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGSOURCEPOSTEDTRANSKEY==null?"\\N":"" + FLNGSOURCEPOSTEDTRANSKEY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGTARGETPOSTEDTRANSKEY==null?"\\N":"" + FLNGTARGETPOSTEDTRANSKEY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGVER==null?"\\N":"" + FLNGVER, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGVERLAST==null?"\\N":"" + FLNGVERLAST, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGSOURCETRANSKEY==null?"\\N":"" + FLNGSOURCETRANSKEY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FCURAVAILABLE==null?"\\N":FCURAVAILABLE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FCURAPPROVED==null?"\\N":FCURAPPROVED.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FCURTRANSFERED==null?"\\N":FCURTRANSFERED.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMTRANSFERED==null?"\\N":"" + FDTMTRANSFERED, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRAPPROVED==null?"\\N":FSTRAPPROVED, " ", delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGCREDITTRANSFERKEY==null?"\\N":"" + FLNGCREDITTRANSFERKEY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGSOURCEPOSTEDTRANSKEY==null?"\\N":"" + FLNGSOURCEPOSTEDTRANSKEY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGTARGETPOSTEDTRANSKEY==null?"\\N":"" + FLNGTARGETPOSTEDTRANSKEY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGVER==null?"\\N":"" + FLNGVER, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGVERLAST==null?"\\N":"" + FLNGVERLAST, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGSOURCETRANSKEY==null?"\\N":"" + FLNGSOURCETRANSKEY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FCURAVAILABLE==null?"\\N":FCURAVAILABLE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FCURAPPROVED==null?"\\N":FCURAPPROVED.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FCURTRANSFERED==null?"\\N":FCURTRANSFERED.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMTRANSFERED==null?"\\N":"" + FDTMTRANSFERED, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRAPPROVED==null?"\\N":FSTRAPPROVED, " ", delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGCREDITTRANSFERKEY = null; } else {
      this.FLNGCREDITTRANSFERKEY = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGSOURCEPOSTEDTRANSKEY = null; } else {
      this.FLNGSOURCEPOSTEDTRANSKEY = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGTARGETPOSTEDTRANSKEY = null; } else {
      this.FLNGTARGETPOSTEDTRANSKEY = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGVERLAST = null; } else {
      this.FLNGVERLAST = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGSOURCETRANSKEY = null; } else {
      this.FLNGSOURCETRANSKEY = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FCURAVAILABLE = null; } else {
      this.FCURAVAILABLE = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FCURAPPROVED = null; } else {
      this.FCURAPPROVED = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FCURTRANSFERED = null; } else {
      this.FCURTRANSFERED = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMTRANSFERED = null; } else {
      this.FDTMTRANSFERED = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRAPPROVED = null; } else {
      this.FSTRAPPROVED = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGCREDITTRANSFERKEY = null; } else {
      this.FLNGCREDITTRANSFERKEY = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGSOURCEPOSTEDTRANSKEY = null; } else {
      this.FLNGSOURCEPOSTEDTRANSKEY = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGTARGETPOSTEDTRANSKEY = null; } else {
      this.FLNGTARGETPOSTEDTRANSKEY = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGVERLAST = null; } else {
      this.FLNGVERLAST = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGSOURCETRANSKEY = null; } else {
      this.FLNGSOURCETRANSKEY = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FCURAVAILABLE = null; } else {
      this.FCURAVAILABLE = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FCURAPPROVED = null; } else {
      this.FCURAPPROVED = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FCURTRANSFERED = null; } else {
      this.FCURTRANSFERED = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMTRANSFERED = null; } else {
      this.FDTMTRANSFERED = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRAPPROVED = null; } else {
      this.FSTRAPPROVED = __cur_str;
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
    tblcrossactcredtransferdetail o = (tblcrossactcredtransferdetail) super.clone();
    o.FDTMTRANSFERED = (o.FDTMTRANSFERED != null) ? (java.sql.Timestamp) o.FDTMTRANSFERED.clone() : null;
    o.FDTMWHEN = (o.FDTMWHEN != null) ? (java.sql.Timestamp) o.FDTMWHEN.clone() : null;
    return o;
  }

  public void clone0(tblcrossactcredtransferdetail o) throws CloneNotSupportedException {
    o.FDTMTRANSFERED = (o.FDTMTRANSFERED != null) ? (java.sql.Timestamp) o.FDTMTRANSFERED.clone() : null;
    o.FDTMWHEN = (o.FDTMWHEN != null) ? (java.sql.Timestamp) o.FDTMWHEN.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("FLNGCREDITTRANSFERKEY", this.FLNGCREDITTRANSFERKEY);
    __sqoop$field_map.put("FLNGSOURCEPOSTEDTRANSKEY", this.FLNGSOURCEPOSTEDTRANSKEY);
    __sqoop$field_map.put("FLNGTARGETPOSTEDTRANSKEY", this.FLNGTARGETPOSTEDTRANSKEY);
    __sqoop$field_map.put("FLNGVER", this.FLNGVER);
    __sqoop$field_map.put("FLNGVERLAST", this.FLNGVERLAST);
    __sqoop$field_map.put("FLNGSOURCETRANSKEY", this.FLNGSOURCETRANSKEY);
    __sqoop$field_map.put("FCURAVAILABLE", this.FCURAVAILABLE);
    __sqoop$field_map.put("FCURAPPROVED", this.FCURAPPROVED);
    __sqoop$field_map.put("FCURTRANSFERED", this.FCURTRANSFERED);
    __sqoop$field_map.put("FDTMTRANSFERED", this.FDTMTRANSFERED);
    __sqoop$field_map.put("FSTRAPPROVED", this.FSTRAPPROVED);
    __sqoop$field_map.put("FSTRWHO", this.FSTRWHO);
    __sqoop$field_map.put("FDTMWHEN", this.FDTMWHEN);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("FLNGCREDITTRANSFERKEY", this.FLNGCREDITTRANSFERKEY);
    __sqoop$field_map.put("FLNGSOURCEPOSTEDTRANSKEY", this.FLNGSOURCEPOSTEDTRANSKEY);
    __sqoop$field_map.put("FLNGTARGETPOSTEDTRANSKEY", this.FLNGTARGETPOSTEDTRANSKEY);
    __sqoop$field_map.put("FLNGVER", this.FLNGVER);
    __sqoop$field_map.put("FLNGVERLAST", this.FLNGVERLAST);
    __sqoop$field_map.put("FLNGSOURCETRANSKEY", this.FLNGSOURCETRANSKEY);
    __sqoop$field_map.put("FCURAVAILABLE", this.FCURAVAILABLE);
    __sqoop$field_map.put("FCURAPPROVED", this.FCURAPPROVED);
    __sqoop$field_map.put("FCURTRANSFERED", this.FCURTRANSFERED);
    __sqoop$field_map.put("FDTMTRANSFERED", this.FDTMTRANSFERED);
    __sqoop$field_map.put("FSTRAPPROVED", this.FSTRAPPROVED);
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
