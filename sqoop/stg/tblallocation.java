// ORM class for table 'tblallocation'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 00:21:46 NZDT 2020
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

public class tblallocation extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("FLNGPAYMENTKEY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblallocation.this.FLNGPAYMENTKEY = (Integer)value;
      }
    });
    setters.put("FLNGTRANSKEY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblallocation.this.FLNGTRANSKEY = (Integer)value;
      }
    });
    setters.put("FINTALLOCATION", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblallocation.this.FINTALLOCATION = (Integer)value;
      }
    });
    setters.put("FCURAMOUNT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblallocation.this.FCURAMOUNT = (java.math.BigDecimal)value;
      }
    });
    setters.put("FLNGACCOUNTKEY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblallocation.this.FLNGACCOUNTKEY = (Integer)value;
      }
    });
    setters.put("FDTMFILINGPERIOD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblallocation.this.FDTMFILINGPERIOD = (java.sql.Timestamp)value;
      }
    });
    setters.put("FDTMALLOCATED", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblallocation.this.FDTMALLOCATED = (java.sql.Timestamp)value;
      }
    });
    setters.put("FDTMREVERSED", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblallocation.this.FDTMREVERSED = (java.sql.Timestamp)value;
      }
    });
    setters.put("FSTRBATCHTYPE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblallocation.this.FSTRBATCHTYPE = (String)value;
      }
    });
    setters.put("FSTRACCOUNTTYPE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblallocation.this.FSTRACCOUNTTYPE = (String)value;
      }
    });
    setters.put("FSTRTRANSTYPE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblallocation.this.FSTRTRANSTYPE = (String)value;
      }
    });
    setters.put("FDTMEFFECT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblallocation.this.FDTMEFFECT = (java.sql.Timestamp)value;
      }
    });
    setters.put("FDTMRADAYALLOCATED", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblallocation.this.FDTMRADAYALLOCATED = (java.sql.Timestamp)value;
      }
    });
    setters.put("FDTMRADAYREVERSED", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblallocation.this.FDTMRADAYREVERSED = (java.sql.Timestamp)value;
      }
    });
    setters.put("FSTRWHO", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblallocation.this.FSTRWHO = (String)value;
      }
    });
    setters.put("FDTMWHEN", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblallocation.this.FDTMWHEN = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrSourceDepositType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblallocation.this.fstrSourceDepositType = (String)value;
      }
    });
    setters.put("fstrDestDepositType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblallocation.this.fstrDestDepositType = (String)value;
      }
    });
    setters.put("fdtmDepositDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblallocation.this.fdtmDepositDate = (java.sql.Timestamp)value;
      }
    });
  }
  public tblallocation() {
    init0();
  }
  private Integer FLNGPAYMENTKEY;
  public Integer get_FLNGPAYMENTKEY() {
    return FLNGPAYMENTKEY;
  }
  public void set_FLNGPAYMENTKEY(Integer FLNGPAYMENTKEY) {
    this.FLNGPAYMENTKEY = FLNGPAYMENTKEY;
  }
  public tblallocation with_FLNGPAYMENTKEY(Integer FLNGPAYMENTKEY) {
    this.FLNGPAYMENTKEY = FLNGPAYMENTKEY;
    return this;
  }
  private Integer FLNGTRANSKEY;
  public Integer get_FLNGTRANSKEY() {
    return FLNGTRANSKEY;
  }
  public void set_FLNGTRANSKEY(Integer FLNGTRANSKEY) {
    this.FLNGTRANSKEY = FLNGTRANSKEY;
  }
  public tblallocation with_FLNGTRANSKEY(Integer FLNGTRANSKEY) {
    this.FLNGTRANSKEY = FLNGTRANSKEY;
    return this;
  }
  private Integer FINTALLOCATION;
  public Integer get_FINTALLOCATION() {
    return FINTALLOCATION;
  }
  public void set_FINTALLOCATION(Integer FINTALLOCATION) {
    this.FINTALLOCATION = FINTALLOCATION;
  }
  public tblallocation with_FINTALLOCATION(Integer FINTALLOCATION) {
    this.FINTALLOCATION = FINTALLOCATION;
    return this;
  }
  private java.math.BigDecimal FCURAMOUNT;
  public java.math.BigDecimal get_FCURAMOUNT() {
    return FCURAMOUNT;
  }
  public void set_FCURAMOUNT(java.math.BigDecimal FCURAMOUNT) {
    this.FCURAMOUNT = FCURAMOUNT;
  }
  public tblallocation with_FCURAMOUNT(java.math.BigDecimal FCURAMOUNT) {
    this.FCURAMOUNT = FCURAMOUNT;
    return this;
  }
  private Integer FLNGACCOUNTKEY;
  public Integer get_FLNGACCOUNTKEY() {
    return FLNGACCOUNTKEY;
  }
  public void set_FLNGACCOUNTKEY(Integer FLNGACCOUNTKEY) {
    this.FLNGACCOUNTKEY = FLNGACCOUNTKEY;
  }
  public tblallocation with_FLNGACCOUNTKEY(Integer FLNGACCOUNTKEY) {
    this.FLNGACCOUNTKEY = FLNGACCOUNTKEY;
    return this;
  }
  private java.sql.Timestamp FDTMFILINGPERIOD;
  public java.sql.Timestamp get_FDTMFILINGPERIOD() {
    return FDTMFILINGPERIOD;
  }
  public void set_FDTMFILINGPERIOD(java.sql.Timestamp FDTMFILINGPERIOD) {
    this.FDTMFILINGPERIOD = FDTMFILINGPERIOD;
  }
  public tblallocation with_FDTMFILINGPERIOD(java.sql.Timestamp FDTMFILINGPERIOD) {
    this.FDTMFILINGPERIOD = FDTMFILINGPERIOD;
    return this;
  }
  private java.sql.Timestamp FDTMALLOCATED;
  public java.sql.Timestamp get_FDTMALLOCATED() {
    return FDTMALLOCATED;
  }
  public void set_FDTMALLOCATED(java.sql.Timestamp FDTMALLOCATED) {
    this.FDTMALLOCATED = FDTMALLOCATED;
  }
  public tblallocation with_FDTMALLOCATED(java.sql.Timestamp FDTMALLOCATED) {
    this.FDTMALLOCATED = FDTMALLOCATED;
    return this;
  }
  private java.sql.Timestamp FDTMREVERSED;
  public java.sql.Timestamp get_FDTMREVERSED() {
    return FDTMREVERSED;
  }
  public void set_FDTMREVERSED(java.sql.Timestamp FDTMREVERSED) {
    this.FDTMREVERSED = FDTMREVERSED;
  }
  public tblallocation with_FDTMREVERSED(java.sql.Timestamp FDTMREVERSED) {
    this.FDTMREVERSED = FDTMREVERSED;
    return this;
  }
  private String FSTRBATCHTYPE;
  public String get_FSTRBATCHTYPE() {
    return FSTRBATCHTYPE;
  }
  public void set_FSTRBATCHTYPE(String FSTRBATCHTYPE) {
    this.FSTRBATCHTYPE = FSTRBATCHTYPE;
  }
  public tblallocation with_FSTRBATCHTYPE(String FSTRBATCHTYPE) {
    this.FSTRBATCHTYPE = FSTRBATCHTYPE;
    return this;
  }
  private String FSTRACCOUNTTYPE;
  public String get_FSTRACCOUNTTYPE() {
    return FSTRACCOUNTTYPE;
  }
  public void set_FSTRACCOUNTTYPE(String FSTRACCOUNTTYPE) {
    this.FSTRACCOUNTTYPE = FSTRACCOUNTTYPE;
  }
  public tblallocation with_FSTRACCOUNTTYPE(String FSTRACCOUNTTYPE) {
    this.FSTRACCOUNTTYPE = FSTRACCOUNTTYPE;
    return this;
  }
  private String FSTRTRANSTYPE;
  public String get_FSTRTRANSTYPE() {
    return FSTRTRANSTYPE;
  }
  public void set_FSTRTRANSTYPE(String FSTRTRANSTYPE) {
    this.FSTRTRANSTYPE = FSTRTRANSTYPE;
  }
  public tblallocation with_FSTRTRANSTYPE(String FSTRTRANSTYPE) {
    this.FSTRTRANSTYPE = FSTRTRANSTYPE;
    return this;
  }
  private java.sql.Timestamp FDTMEFFECT;
  public java.sql.Timestamp get_FDTMEFFECT() {
    return FDTMEFFECT;
  }
  public void set_FDTMEFFECT(java.sql.Timestamp FDTMEFFECT) {
    this.FDTMEFFECT = FDTMEFFECT;
  }
  public tblallocation with_FDTMEFFECT(java.sql.Timestamp FDTMEFFECT) {
    this.FDTMEFFECT = FDTMEFFECT;
    return this;
  }
  private java.sql.Timestamp FDTMRADAYALLOCATED;
  public java.sql.Timestamp get_FDTMRADAYALLOCATED() {
    return FDTMRADAYALLOCATED;
  }
  public void set_FDTMRADAYALLOCATED(java.sql.Timestamp FDTMRADAYALLOCATED) {
    this.FDTMRADAYALLOCATED = FDTMRADAYALLOCATED;
  }
  public tblallocation with_FDTMRADAYALLOCATED(java.sql.Timestamp FDTMRADAYALLOCATED) {
    this.FDTMRADAYALLOCATED = FDTMRADAYALLOCATED;
    return this;
  }
  private java.sql.Timestamp FDTMRADAYREVERSED;
  public java.sql.Timestamp get_FDTMRADAYREVERSED() {
    return FDTMRADAYREVERSED;
  }
  public void set_FDTMRADAYREVERSED(java.sql.Timestamp FDTMRADAYREVERSED) {
    this.FDTMRADAYREVERSED = FDTMRADAYREVERSED;
  }
  public tblallocation with_FDTMRADAYREVERSED(java.sql.Timestamp FDTMRADAYREVERSED) {
    this.FDTMRADAYREVERSED = FDTMRADAYREVERSED;
    return this;
  }
  private String FSTRWHO;
  public String get_FSTRWHO() {
    return FSTRWHO;
  }
  public void set_FSTRWHO(String FSTRWHO) {
    this.FSTRWHO = FSTRWHO;
  }
  public tblallocation with_FSTRWHO(String FSTRWHO) {
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
  public tblallocation with_FDTMWHEN(java.sql.Timestamp FDTMWHEN) {
    this.FDTMWHEN = FDTMWHEN;
    return this;
  }
  private String fstrSourceDepositType;
  public String get_fstrSourceDepositType() {
    return fstrSourceDepositType;
  }
  public void set_fstrSourceDepositType(String fstrSourceDepositType) {
    this.fstrSourceDepositType = fstrSourceDepositType;
  }
  public tblallocation with_fstrSourceDepositType(String fstrSourceDepositType) {
    this.fstrSourceDepositType = fstrSourceDepositType;
    return this;
  }
  private String fstrDestDepositType;
  public String get_fstrDestDepositType() {
    return fstrDestDepositType;
  }
  public void set_fstrDestDepositType(String fstrDestDepositType) {
    this.fstrDestDepositType = fstrDestDepositType;
  }
  public tblallocation with_fstrDestDepositType(String fstrDestDepositType) {
    this.fstrDestDepositType = fstrDestDepositType;
    return this;
  }
  private java.sql.Timestamp fdtmDepositDate;
  public java.sql.Timestamp get_fdtmDepositDate() {
    return fdtmDepositDate;
  }
  public void set_fdtmDepositDate(java.sql.Timestamp fdtmDepositDate) {
    this.fdtmDepositDate = fdtmDepositDate;
  }
  public tblallocation with_fdtmDepositDate(java.sql.Timestamp fdtmDepositDate) {
    this.fdtmDepositDate = fdtmDepositDate;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblallocation)) {
      return false;
    }
    tblallocation that = (tblallocation) o;
    boolean equal = true;
    equal = equal && (this.FLNGPAYMENTKEY == null ? that.FLNGPAYMENTKEY == null : this.FLNGPAYMENTKEY.equals(that.FLNGPAYMENTKEY));
    equal = equal && (this.FLNGTRANSKEY == null ? that.FLNGTRANSKEY == null : this.FLNGTRANSKEY.equals(that.FLNGTRANSKEY));
    equal = equal && (this.FINTALLOCATION == null ? that.FINTALLOCATION == null : this.FINTALLOCATION.equals(that.FINTALLOCATION));
    equal = equal && (this.FCURAMOUNT == null ? that.FCURAMOUNT == null : this.FCURAMOUNT.equals(that.FCURAMOUNT));
    equal = equal && (this.FLNGACCOUNTKEY == null ? that.FLNGACCOUNTKEY == null : this.FLNGACCOUNTKEY.equals(that.FLNGACCOUNTKEY));
    equal = equal && (this.FDTMFILINGPERIOD == null ? that.FDTMFILINGPERIOD == null : this.FDTMFILINGPERIOD.equals(that.FDTMFILINGPERIOD));
    equal = equal && (this.FDTMALLOCATED == null ? that.FDTMALLOCATED == null : this.FDTMALLOCATED.equals(that.FDTMALLOCATED));
    equal = equal && (this.FDTMREVERSED == null ? that.FDTMREVERSED == null : this.FDTMREVERSED.equals(that.FDTMREVERSED));
    equal = equal && (this.FSTRBATCHTYPE == null ? that.FSTRBATCHTYPE == null : this.FSTRBATCHTYPE.equals(that.FSTRBATCHTYPE));
    equal = equal && (this.FSTRACCOUNTTYPE == null ? that.FSTRACCOUNTTYPE == null : this.FSTRACCOUNTTYPE.equals(that.FSTRACCOUNTTYPE));
    equal = equal && (this.FSTRTRANSTYPE == null ? that.FSTRTRANSTYPE == null : this.FSTRTRANSTYPE.equals(that.FSTRTRANSTYPE));
    equal = equal && (this.FDTMEFFECT == null ? that.FDTMEFFECT == null : this.FDTMEFFECT.equals(that.FDTMEFFECT));
    equal = equal && (this.FDTMRADAYALLOCATED == null ? that.FDTMRADAYALLOCATED == null : this.FDTMRADAYALLOCATED.equals(that.FDTMRADAYALLOCATED));
    equal = equal && (this.FDTMRADAYREVERSED == null ? that.FDTMRADAYREVERSED == null : this.FDTMRADAYREVERSED.equals(that.FDTMRADAYREVERSED));
    equal = equal && (this.FSTRWHO == null ? that.FSTRWHO == null : this.FSTRWHO.equals(that.FSTRWHO));
    equal = equal && (this.FDTMWHEN == null ? that.FDTMWHEN == null : this.FDTMWHEN.equals(that.FDTMWHEN));
    equal = equal && (this.fstrSourceDepositType == null ? that.fstrSourceDepositType == null : this.fstrSourceDepositType.equals(that.fstrSourceDepositType));
    equal = equal && (this.fstrDestDepositType == null ? that.fstrDestDepositType == null : this.fstrDestDepositType.equals(that.fstrDestDepositType));
    equal = equal && (this.fdtmDepositDate == null ? that.fdtmDepositDate == null : this.fdtmDepositDate.equals(that.fdtmDepositDate));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblallocation)) {
      return false;
    }
    tblallocation that = (tblallocation) o;
    boolean equal = true;
    equal = equal && (this.FLNGPAYMENTKEY == null ? that.FLNGPAYMENTKEY == null : this.FLNGPAYMENTKEY.equals(that.FLNGPAYMENTKEY));
    equal = equal && (this.FLNGTRANSKEY == null ? that.FLNGTRANSKEY == null : this.FLNGTRANSKEY.equals(that.FLNGTRANSKEY));
    equal = equal && (this.FINTALLOCATION == null ? that.FINTALLOCATION == null : this.FINTALLOCATION.equals(that.FINTALLOCATION));
    equal = equal && (this.FCURAMOUNT == null ? that.FCURAMOUNT == null : this.FCURAMOUNT.equals(that.FCURAMOUNT));
    equal = equal && (this.FLNGACCOUNTKEY == null ? that.FLNGACCOUNTKEY == null : this.FLNGACCOUNTKEY.equals(that.FLNGACCOUNTKEY));
    equal = equal && (this.FDTMFILINGPERIOD == null ? that.FDTMFILINGPERIOD == null : this.FDTMFILINGPERIOD.equals(that.FDTMFILINGPERIOD));
    equal = equal && (this.FDTMALLOCATED == null ? that.FDTMALLOCATED == null : this.FDTMALLOCATED.equals(that.FDTMALLOCATED));
    equal = equal && (this.FDTMREVERSED == null ? that.FDTMREVERSED == null : this.FDTMREVERSED.equals(that.FDTMREVERSED));
    equal = equal && (this.FSTRBATCHTYPE == null ? that.FSTRBATCHTYPE == null : this.FSTRBATCHTYPE.equals(that.FSTRBATCHTYPE));
    equal = equal && (this.FSTRACCOUNTTYPE == null ? that.FSTRACCOUNTTYPE == null : this.FSTRACCOUNTTYPE.equals(that.FSTRACCOUNTTYPE));
    equal = equal && (this.FSTRTRANSTYPE == null ? that.FSTRTRANSTYPE == null : this.FSTRTRANSTYPE.equals(that.FSTRTRANSTYPE));
    equal = equal && (this.FDTMEFFECT == null ? that.FDTMEFFECT == null : this.FDTMEFFECT.equals(that.FDTMEFFECT));
    equal = equal && (this.FDTMRADAYALLOCATED == null ? that.FDTMRADAYALLOCATED == null : this.FDTMRADAYALLOCATED.equals(that.FDTMRADAYALLOCATED));
    equal = equal && (this.FDTMRADAYREVERSED == null ? that.FDTMRADAYREVERSED == null : this.FDTMRADAYREVERSED.equals(that.FDTMRADAYREVERSED));
    equal = equal && (this.FSTRWHO == null ? that.FSTRWHO == null : this.FSTRWHO.equals(that.FSTRWHO));
    equal = equal && (this.FDTMWHEN == null ? that.FDTMWHEN == null : this.FDTMWHEN.equals(that.FDTMWHEN));
    equal = equal && (this.fstrSourceDepositType == null ? that.fstrSourceDepositType == null : this.fstrSourceDepositType.equals(that.fstrSourceDepositType));
    equal = equal && (this.fstrDestDepositType == null ? that.fstrDestDepositType == null : this.fstrDestDepositType.equals(that.fstrDestDepositType));
    equal = equal && (this.fdtmDepositDate == null ? that.fdtmDepositDate == null : this.fdtmDepositDate.equals(that.fdtmDepositDate));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.FLNGPAYMENTKEY = JdbcWritableBridge.readInteger(1, __dbResults);
    this.FLNGTRANSKEY = JdbcWritableBridge.readInteger(2, __dbResults);
    this.FINTALLOCATION = JdbcWritableBridge.readInteger(3, __dbResults);
    this.FCURAMOUNT = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.FLNGACCOUNTKEY = JdbcWritableBridge.readInteger(5, __dbResults);
    this.FDTMFILINGPERIOD = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.FDTMALLOCATED = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.FDTMREVERSED = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.FSTRBATCHTYPE = JdbcWritableBridge.readString(9, __dbResults);
    this.FSTRACCOUNTTYPE = JdbcWritableBridge.readString(10, __dbResults);
    this.FSTRTRANSTYPE = JdbcWritableBridge.readString(11, __dbResults);
    this.FDTMEFFECT = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.FDTMRADAYALLOCATED = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.FDTMRADAYREVERSED = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.FSTRWHO = JdbcWritableBridge.readString(15, __dbResults);
    this.FDTMWHEN = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.fstrSourceDepositType = JdbcWritableBridge.readString(17, __dbResults);
    this.fstrDestDepositType = JdbcWritableBridge.readString(18, __dbResults);
    this.fdtmDepositDate = JdbcWritableBridge.readTimestamp(19, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.FLNGPAYMENTKEY = JdbcWritableBridge.readInteger(1, __dbResults);
    this.FLNGTRANSKEY = JdbcWritableBridge.readInteger(2, __dbResults);
    this.FINTALLOCATION = JdbcWritableBridge.readInteger(3, __dbResults);
    this.FCURAMOUNT = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.FLNGACCOUNTKEY = JdbcWritableBridge.readInteger(5, __dbResults);
    this.FDTMFILINGPERIOD = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.FDTMALLOCATED = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.FDTMREVERSED = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.FSTRBATCHTYPE = JdbcWritableBridge.readString(9, __dbResults);
    this.FSTRACCOUNTTYPE = JdbcWritableBridge.readString(10, __dbResults);
    this.FSTRTRANSTYPE = JdbcWritableBridge.readString(11, __dbResults);
    this.FDTMEFFECT = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.FDTMRADAYALLOCATED = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.FDTMRADAYREVERSED = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.FSTRWHO = JdbcWritableBridge.readString(15, __dbResults);
    this.FDTMWHEN = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.fstrSourceDepositType = JdbcWritableBridge.readString(17, __dbResults);
    this.fstrDestDepositType = JdbcWritableBridge.readString(18, __dbResults);
    this.fdtmDepositDate = JdbcWritableBridge.readTimestamp(19, __dbResults);
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
    JdbcWritableBridge.writeInteger(FLNGTRANSKEY, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FINTALLOCATION, 3 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(FCURAMOUNT, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGACCOUNTKEY, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMFILINGPERIOD, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMALLOCATED, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMREVERSED, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(FSTRBATCHTYPE, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(FSTRACCOUNTTYPE, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(FSTRTRANSTYPE, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMEFFECT, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMRADAYALLOCATED, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMRADAYREVERSED, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(FSTRWHO, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMWHEN, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrSourceDepositType, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDestDepositType, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDepositDate, 19 + __off, 93, __dbStmt);
    return 19;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(FLNGPAYMENTKEY, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGTRANSKEY, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FINTALLOCATION, 3 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(FCURAMOUNT, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGACCOUNTKEY, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMFILINGPERIOD, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMALLOCATED, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMREVERSED, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(FSTRBATCHTYPE, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(FSTRACCOUNTTYPE, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(FSTRTRANSTYPE, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMEFFECT, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMRADAYALLOCATED, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMRADAYREVERSED, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(FSTRWHO, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMWHEN, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrSourceDepositType, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDestDepositType, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDepositDate, 19 + __off, 93, __dbStmt);
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
        this.FLNGTRANSKEY = null;
    } else {
    this.FLNGTRANSKEY = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FINTALLOCATION = null;
    } else {
    this.FINTALLOCATION = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FCURAMOUNT = null;
    } else {
    this.FCURAMOUNT = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FLNGACCOUNTKEY = null;
    } else {
    this.FLNGACCOUNTKEY = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FDTMFILINGPERIOD = null;
    } else {
    this.FDTMFILINGPERIOD = new Timestamp(__dataIn.readLong());
    this.FDTMFILINGPERIOD.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FDTMALLOCATED = null;
    } else {
    this.FDTMALLOCATED = new Timestamp(__dataIn.readLong());
    this.FDTMALLOCATED.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FDTMREVERSED = null;
    } else {
    this.FDTMREVERSED = new Timestamp(__dataIn.readLong());
    this.FDTMREVERSED.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FSTRBATCHTYPE = null;
    } else {
    this.FSTRBATCHTYPE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FSTRACCOUNTTYPE = null;
    } else {
    this.FSTRACCOUNTTYPE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FSTRTRANSTYPE = null;
    } else {
    this.FSTRTRANSTYPE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FDTMEFFECT = null;
    } else {
    this.FDTMEFFECT = new Timestamp(__dataIn.readLong());
    this.FDTMEFFECT.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FDTMRADAYALLOCATED = null;
    } else {
    this.FDTMRADAYALLOCATED = new Timestamp(__dataIn.readLong());
    this.FDTMRADAYALLOCATED.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FDTMRADAYREVERSED = null;
    } else {
    this.FDTMRADAYREVERSED = new Timestamp(__dataIn.readLong());
    this.FDTMRADAYREVERSED.setNanos(__dataIn.readInt());
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
    if (__dataIn.readBoolean()) { 
        this.fstrSourceDepositType = null;
    } else {
    this.fstrSourceDepositType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDestDepositType = null;
    } else {
    this.fstrDestDepositType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmDepositDate = null;
    } else {
    this.fdtmDepositDate = new Timestamp(__dataIn.readLong());
    this.fdtmDepositDate.setNanos(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.FLNGPAYMENTKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGPAYMENTKEY);
    }
    if (null == this.FLNGTRANSKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGTRANSKEY);
    }
    if (null == this.FINTALLOCATION) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FINTALLOCATION);
    }
    if (null == this.FCURAMOUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.FCURAMOUNT, __dataOut);
    }
    if (null == this.FLNGACCOUNTKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGACCOUNTKEY);
    }
    if (null == this.FDTMFILINGPERIOD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMFILINGPERIOD.getTime());
    __dataOut.writeInt(this.FDTMFILINGPERIOD.getNanos());
    }
    if (null == this.FDTMALLOCATED) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMALLOCATED.getTime());
    __dataOut.writeInt(this.FDTMALLOCATED.getNanos());
    }
    if (null == this.FDTMREVERSED) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMREVERSED.getTime());
    __dataOut.writeInt(this.FDTMREVERSED.getNanos());
    }
    if (null == this.FSTRBATCHTYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRBATCHTYPE);
    }
    if (null == this.FSTRACCOUNTTYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRACCOUNTTYPE);
    }
    if (null == this.FSTRTRANSTYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRTRANSTYPE);
    }
    if (null == this.FDTMEFFECT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMEFFECT.getTime());
    __dataOut.writeInt(this.FDTMEFFECT.getNanos());
    }
    if (null == this.FDTMRADAYALLOCATED) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMRADAYALLOCATED.getTime());
    __dataOut.writeInt(this.FDTMRADAYALLOCATED.getNanos());
    }
    if (null == this.FDTMRADAYREVERSED) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMRADAYREVERSED.getTime());
    __dataOut.writeInt(this.FDTMRADAYREVERSED.getNanos());
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
    if (null == this.fstrSourceDepositType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSourceDepositType);
    }
    if (null == this.fstrDestDepositType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDestDepositType);
    }
    if (null == this.fdtmDepositDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDepositDate.getTime());
    __dataOut.writeInt(this.fdtmDepositDate.getNanos());
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.FLNGPAYMENTKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGPAYMENTKEY);
    }
    if (null == this.FLNGTRANSKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGTRANSKEY);
    }
    if (null == this.FINTALLOCATION) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FINTALLOCATION);
    }
    if (null == this.FCURAMOUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.FCURAMOUNT, __dataOut);
    }
    if (null == this.FLNGACCOUNTKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGACCOUNTKEY);
    }
    if (null == this.FDTMFILINGPERIOD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMFILINGPERIOD.getTime());
    __dataOut.writeInt(this.FDTMFILINGPERIOD.getNanos());
    }
    if (null == this.FDTMALLOCATED) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMALLOCATED.getTime());
    __dataOut.writeInt(this.FDTMALLOCATED.getNanos());
    }
    if (null == this.FDTMREVERSED) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMREVERSED.getTime());
    __dataOut.writeInt(this.FDTMREVERSED.getNanos());
    }
    if (null == this.FSTRBATCHTYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRBATCHTYPE);
    }
    if (null == this.FSTRACCOUNTTYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRACCOUNTTYPE);
    }
    if (null == this.FSTRTRANSTYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRTRANSTYPE);
    }
    if (null == this.FDTMEFFECT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMEFFECT.getTime());
    __dataOut.writeInt(this.FDTMEFFECT.getNanos());
    }
    if (null == this.FDTMRADAYALLOCATED) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMRADAYALLOCATED.getTime());
    __dataOut.writeInt(this.FDTMRADAYALLOCATED.getNanos());
    }
    if (null == this.FDTMRADAYREVERSED) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMRADAYREVERSED.getTime());
    __dataOut.writeInt(this.FDTMRADAYREVERSED.getNanos());
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
    if (null == this.fstrSourceDepositType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSourceDepositType);
    }
    if (null == this.fstrDestDepositType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDestDepositType);
    }
    if (null == this.fdtmDepositDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDepositDate.getTime());
    __dataOut.writeInt(this.fdtmDepositDate.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGTRANSKEY==null?"\\N":"" + FLNGTRANSKEY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FINTALLOCATION==null?"\\N":"" + FINTALLOCATION, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FCURAMOUNT==null?"\\N":FCURAMOUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGACCOUNTKEY==null?"\\N":"" + FLNGACCOUNTKEY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMFILINGPERIOD==null?"\\N":"" + FDTMFILINGPERIOD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMALLOCATED==null?"\\N":"" + FDTMALLOCATED, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMREVERSED==null?"\\N":"" + FDTMREVERSED, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRBATCHTYPE==null?"\\N":FSTRBATCHTYPE, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRACCOUNTTYPE==null?"\\N":FSTRACCOUNTTYPE, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRTRANSTYPE==null?"\\N":FSTRTRANSTYPE, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMEFFECT==null?"\\N":"" + FDTMEFFECT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMRADAYALLOCATED==null?"\\N":"" + FDTMRADAYALLOCATED, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMRADAYREVERSED==null?"\\N":"" + FDTMRADAYREVERSED, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRWHO==null?"\\N":FSTRWHO, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMWHEN==null?"\\N":"" + FDTMWHEN, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSourceDepositType==null?"\\N":fstrSourceDepositType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDestDepositType==null?"\\N":fstrDestDepositType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDepositDate==null?"\\N":"" + fdtmDepositDate, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGPAYMENTKEY==null?"\\N":"" + FLNGPAYMENTKEY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGTRANSKEY==null?"\\N":"" + FLNGTRANSKEY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FINTALLOCATION==null?"\\N":"" + FINTALLOCATION, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FCURAMOUNT==null?"\\N":FCURAMOUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGACCOUNTKEY==null?"\\N":"" + FLNGACCOUNTKEY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMFILINGPERIOD==null?"\\N":"" + FDTMFILINGPERIOD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMALLOCATED==null?"\\N":"" + FDTMALLOCATED, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMREVERSED==null?"\\N":"" + FDTMREVERSED, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRBATCHTYPE==null?"\\N":FSTRBATCHTYPE, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRACCOUNTTYPE==null?"\\N":FSTRACCOUNTTYPE, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRTRANSTYPE==null?"\\N":FSTRTRANSTYPE, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMEFFECT==null?"\\N":"" + FDTMEFFECT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMRADAYALLOCATED==null?"\\N":"" + FDTMRADAYALLOCATED, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMRADAYREVERSED==null?"\\N":"" + FDTMRADAYREVERSED, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRWHO==null?"\\N":FSTRWHO, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMWHEN==null?"\\N":"" + FDTMWHEN, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSourceDepositType==null?"\\N":fstrSourceDepositType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDestDepositType==null?"\\N":fstrDestDepositType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDepositDate==null?"\\N":"" + fdtmDepositDate, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGTRANSKEY = null; } else {
      this.FLNGTRANSKEY = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FINTALLOCATION = null; } else {
      this.FINTALLOCATION = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGACCOUNTKEY = null; } else {
      this.FLNGACCOUNTKEY = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMALLOCATED = null; } else {
      this.FDTMALLOCATED = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMREVERSED = null; } else {
      this.FDTMREVERSED = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRBATCHTYPE = null; } else {
      this.FSTRBATCHTYPE = __cur_str;
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
    if (__cur_str.equals("null")) { this.FSTRTRANSTYPE = null; } else {
      this.FSTRTRANSTYPE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMEFFECT = null; } else {
      this.FDTMEFFECT = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMRADAYALLOCATED = null; } else {
      this.FDTMRADAYALLOCATED = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMRADAYREVERSED = null; } else {
      this.FDTMRADAYREVERSED = java.sql.Timestamp.valueOf(__cur_str);
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

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSourceDepositType = null; } else {
      this.fstrSourceDepositType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDestDepositType = null; } else {
      this.fstrDestDepositType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDepositDate = null; } else {
      this.fdtmDepositDate = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGTRANSKEY = null; } else {
      this.FLNGTRANSKEY = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FINTALLOCATION = null; } else {
      this.FINTALLOCATION = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGACCOUNTKEY = null; } else {
      this.FLNGACCOUNTKEY = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMALLOCATED = null; } else {
      this.FDTMALLOCATED = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMREVERSED = null; } else {
      this.FDTMREVERSED = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRBATCHTYPE = null; } else {
      this.FSTRBATCHTYPE = __cur_str;
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
    if (__cur_str.equals("null")) { this.FSTRTRANSTYPE = null; } else {
      this.FSTRTRANSTYPE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMEFFECT = null; } else {
      this.FDTMEFFECT = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMRADAYALLOCATED = null; } else {
      this.FDTMRADAYALLOCATED = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMRADAYREVERSED = null; } else {
      this.FDTMRADAYREVERSED = java.sql.Timestamp.valueOf(__cur_str);
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

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSourceDepositType = null; } else {
      this.fstrSourceDepositType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDestDepositType = null; } else {
      this.fstrDestDepositType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDepositDate = null; } else {
      this.fdtmDepositDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    tblallocation o = (tblallocation) super.clone();
    o.FDTMFILINGPERIOD = (o.FDTMFILINGPERIOD != null) ? (java.sql.Timestamp) o.FDTMFILINGPERIOD.clone() : null;
    o.FDTMALLOCATED = (o.FDTMALLOCATED != null) ? (java.sql.Timestamp) o.FDTMALLOCATED.clone() : null;
    o.FDTMREVERSED = (o.FDTMREVERSED != null) ? (java.sql.Timestamp) o.FDTMREVERSED.clone() : null;
    o.FDTMEFFECT = (o.FDTMEFFECT != null) ? (java.sql.Timestamp) o.FDTMEFFECT.clone() : null;
    o.FDTMRADAYALLOCATED = (o.FDTMRADAYALLOCATED != null) ? (java.sql.Timestamp) o.FDTMRADAYALLOCATED.clone() : null;
    o.FDTMRADAYREVERSED = (o.FDTMRADAYREVERSED != null) ? (java.sql.Timestamp) o.FDTMRADAYREVERSED.clone() : null;
    o.FDTMWHEN = (o.FDTMWHEN != null) ? (java.sql.Timestamp) o.FDTMWHEN.clone() : null;
    o.fdtmDepositDate = (o.fdtmDepositDate != null) ? (java.sql.Timestamp) o.fdtmDepositDate.clone() : null;
    return o;
  }

  public void clone0(tblallocation o) throws CloneNotSupportedException {
    o.FDTMFILINGPERIOD = (o.FDTMFILINGPERIOD != null) ? (java.sql.Timestamp) o.FDTMFILINGPERIOD.clone() : null;
    o.FDTMALLOCATED = (o.FDTMALLOCATED != null) ? (java.sql.Timestamp) o.FDTMALLOCATED.clone() : null;
    o.FDTMREVERSED = (o.FDTMREVERSED != null) ? (java.sql.Timestamp) o.FDTMREVERSED.clone() : null;
    o.FDTMEFFECT = (o.FDTMEFFECT != null) ? (java.sql.Timestamp) o.FDTMEFFECT.clone() : null;
    o.FDTMRADAYALLOCATED = (o.FDTMRADAYALLOCATED != null) ? (java.sql.Timestamp) o.FDTMRADAYALLOCATED.clone() : null;
    o.FDTMRADAYREVERSED = (o.FDTMRADAYREVERSED != null) ? (java.sql.Timestamp) o.FDTMRADAYREVERSED.clone() : null;
    o.FDTMWHEN = (o.FDTMWHEN != null) ? (java.sql.Timestamp) o.FDTMWHEN.clone() : null;
    o.fdtmDepositDate = (o.fdtmDepositDate != null) ? (java.sql.Timestamp) o.fdtmDepositDate.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("FLNGPAYMENTKEY", this.FLNGPAYMENTKEY);
    __sqoop$field_map.put("FLNGTRANSKEY", this.FLNGTRANSKEY);
    __sqoop$field_map.put("FINTALLOCATION", this.FINTALLOCATION);
    __sqoop$field_map.put("FCURAMOUNT", this.FCURAMOUNT);
    __sqoop$field_map.put("FLNGACCOUNTKEY", this.FLNGACCOUNTKEY);
    __sqoop$field_map.put("FDTMFILINGPERIOD", this.FDTMFILINGPERIOD);
    __sqoop$field_map.put("FDTMALLOCATED", this.FDTMALLOCATED);
    __sqoop$field_map.put("FDTMREVERSED", this.FDTMREVERSED);
    __sqoop$field_map.put("FSTRBATCHTYPE", this.FSTRBATCHTYPE);
    __sqoop$field_map.put("FSTRACCOUNTTYPE", this.FSTRACCOUNTTYPE);
    __sqoop$field_map.put("FSTRTRANSTYPE", this.FSTRTRANSTYPE);
    __sqoop$field_map.put("FDTMEFFECT", this.FDTMEFFECT);
    __sqoop$field_map.put("FDTMRADAYALLOCATED", this.FDTMRADAYALLOCATED);
    __sqoop$field_map.put("FDTMRADAYREVERSED", this.FDTMRADAYREVERSED);
    __sqoop$field_map.put("FSTRWHO", this.FSTRWHO);
    __sqoop$field_map.put("FDTMWHEN", this.FDTMWHEN);
    __sqoop$field_map.put("fstrSourceDepositType", this.fstrSourceDepositType);
    __sqoop$field_map.put("fstrDestDepositType", this.fstrDestDepositType);
    __sqoop$field_map.put("fdtmDepositDate", this.fdtmDepositDate);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("FLNGPAYMENTKEY", this.FLNGPAYMENTKEY);
    __sqoop$field_map.put("FLNGTRANSKEY", this.FLNGTRANSKEY);
    __sqoop$field_map.put("FINTALLOCATION", this.FINTALLOCATION);
    __sqoop$field_map.put("FCURAMOUNT", this.FCURAMOUNT);
    __sqoop$field_map.put("FLNGACCOUNTKEY", this.FLNGACCOUNTKEY);
    __sqoop$field_map.put("FDTMFILINGPERIOD", this.FDTMFILINGPERIOD);
    __sqoop$field_map.put("FDTMALLOCATED", this.FDTMALLOCATED);
    __sqoop$field_map.put("FDTMREVERSED", this.FDTMREVERSED);
    __sqoop$field_map.put("FSTRBATCHTYPE", this.FSTRBATCHTYPE);
    __sqoop$field_map.put("FSTRACCOUNTTYPE", this.FSTRACCOUNTTYPE);
    __sqoop$field_map.put("FSTRTRANSTYPE", this.FSTRTRANSTYPE);
    __sqoop$field_map.put("FDTMEFFECT", this.FDTMEFFECT);
    __sqoop$field_map.put("FDTMRADAYALLOCATED", this.FDTMRADAYALLOCATED);
    __sqoop$field_map.put("FDTMRADAYREVERSED", this.FDTMRADAYREVERSED);
    __sqoop$field_map.put("FSTRWHO", this.FSTRWHO);
    __sqoop$field_map.put("FDTMWHEN", this.FDTMWHEN);
    __sqoop$field_map.put("fstrSourceDepositType", this.fstrSourceDepositType);
    __sqoop$field_map.put("fstrDestDepositType", this.fstrDestDepositType);
    __sqoop$field_map.put("fdtmDepositDate", this.fdtmDepositDate);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
