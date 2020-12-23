// ORM class for table 'tblindicator'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Dec 03 23:32:51 NZDT 2020
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

public class tblindicator extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("FLNGINDICATORKEY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblindicator.this.FLNGINDICATORKEY = (Integer)value;
      }
    });
    setters.put("FLNGVER", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblindicator.this.FLNGVER = (Integer)value;
      }
    });
    setters.put("FLNGVERLAST", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblindicator.this.FLNGVERLAST = (Integer)value;
      }
    });
    setters.put("FINTLEVEL", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblindicator.this.FINTLEVEL = (Integer)value;
      }
    });
    setters.put("FLNGCUSTOMERKEY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblindicator.this.FLNGCUSTOMERKEY = (Integer)value;
      }
    });
    setters.put("FINTPROFILENUMBER", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblindicator.this.FINTPROFILENUMBER = (Integer)value;
      }
    });
    setters.put("FLNGACCOUNTKEY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblindicator.this.FLNGACCOUNTKEY = (Integer)value;
      }
    });
    setters.put("FSTRINDICATOR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblindicator.this.FSTRINDICATOR = (String)value;
      }
    });
    setters.put("FDTMCOMMENCE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblindicator.this.FDTMCOMMENCE = (java.sql.Timestamp)value;
      }
    });
    setters.put("FDTMFILINGPERIOD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblindicator.this.FDTMFILINGPERIOD = (java.sql.Timestamp)value;
      }
    });
    setters.put("FDTMFILINGPERIODTO", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblindicator.this.FDTMFILINGPERIODTO = (java.sql.Timestamp)value;
      }
    });
    setters.put("FCURAMOUNT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblindicator.this.FCURAMOUNT = (java.math.BigDecimal)value;
      }
    });
    setters.put("FDTMCEASE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblindicator.this.FDTMCEASE = (java.sql.Timestamp)value;
      }
    });
    setters.put("FSTRREASON", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblindicator.this.FSTRREASON = (String)value;
      }
    });
    setters.put("FDTMCOMMENCE1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblindicator.this.FDTMCOMMENCE1 = (java.sql.Timestamp)value;
      }
    });
    setters.put("FDTMCEASE1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblindicator.this.FDTMCEASE1 = (java.sql.Timestamp)value;
      }
    });
    setters.put("flngCrmKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblindicator.this.flngCrmKey = (Integer)value;
      }
    });
    setters.put("FSTRCOMMENT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblindicator.this.FSTRCOMMENT = (String)value;
      }
    });
    setters.put("FSTRUSER", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblindicator.this.FSTRUSER = (String)value;
      }
    });
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblindicator.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fblnActive", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblindicator.this.fblnActive = (Integer)value;
      }
    });
    setters.put("FSTRWHO", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblindicator.this.FSTRWHO = (String)value;
      }
    });
    setters.put("FDTMWHEN", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblindicator.this.FDTMWHEN = (java.sql.Timestamp)value;
      }
    });
  }
  public tblindicator() {
    init0();
  }
  private Integer FLNGINDICATORKEY;
  public Integer get_FLNGINDICATORKEY() {
    return FLNGINDICATORKEY;
  }
  public void set_FLNGINDICATORKEY(Integer FLNGINDICATORKEY) {
    this.FLNGINDICATORKEY = FLNGINDICATORKEY;
  }
  public tblindicator with_FLNGINDICATORKEY(Integer FLNGINDICATORKEY) {
    this.FLNGINDICATORKEY = FLNGINDICATORKEY;
    return this;
  }
  private Integer FLNGVER;
  public Integer get_FLNGVER() {
    return FLNGVER;
  }
  public void set_FLNGVER(Integer FLNGVER) {
    this.FLNGVER = FLNGVER;
  }
  public tblindicator with_FLNGVER(Integer FLNGVER) {
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
  public tblindicator with_FLNGVERLAST(Integer FLNGVERLAST) {
    this.FLNGVERLAST = FLNGVERLAST;
    return this;
  }
  private Integer FINTLEVEL;
  public Integer get_FINTLEVEL() {
    return FINTLEVEL;
  }
  public void set_FINTLEVEL(Integer FINTLEVEL) {
    this.FINTLEVEL = FINTLEVEL;
  }
  public tblindicator with_FINTLEVEL(Integer FINTLEVEL) {
    this.FINTLEVEL = FINTLEVEL;
    return this;
  }
  private Integer FLNGCUSTOMERKEY;
  public Integer get_FLNGCUSTOMERKEY() {
    return FLNGCUSTOMERKEY;
  }
  public void set_FLNGCUSTOMERKEY(Integer FLNGCUSTOMERKEY) {
    this.FLNGCUSTOMERKEY = FLNGCUSTOMERKEY;
  }
  public tblindicator with_FLNGCUSTOMERKEY(Integer FLNGCUSTOMERKEY) {
    this.FLNGCUSTOMERKEY = FLNGCUSTOMERKEY;
    return this;
  }
  private Integer FINTPROFILENUMBER;
  public Integer get_FINTPROFILENUMBER() {
    return FINTPROFILENUMBER;
  }
  public void set_FINTPROFILENUMBER(Integer FINTPROFILENUMBER) {
    this.FINTPROFILENUMBER = FINTPROFILENUMBER;
  }
  public tblindicator with_FINTPROFILENUMBER(Integer FINTPROFILENUMBER) {
    this.FINTPROFILENUMBER = FINTPROFILENUMBER;
    return this;
  }
  private Integer FLNGACCOUNTKEY;
  public Integer get_FLNGACCOUNTKEY() {
    return FLNGACCOUNTKEY;
  }
  public void set_FLNGACCOUNTKEY(Integer FLNGACCOUNTKEY) {
    this.FLNGACCOUNTKEY = FLNGACCOUNTKEY;
  }
  public tblindicator with_FLNGACCOUNTKEY(Integer FLNGACCOUNTKEY) {
    this.FLNGACCOUNTKEY = FLNGACCOUNTKEY;
    return this;
  }
  private String FSTRINDICATOR;
  public String get_FSTRINDICATOR() {
    return FSTRINDICATOR;
  }
  public void set_FSTRINDICATOR(String FSTRINDICATOR) {
    this.FSTRINDICATOR = FSTRINDICATOR;
  }
  public tblindicator with_FSTRINDICATOR(String FSTRINDICATOR) {
    this.FSTRINDICATOR = FSTRINDICATOR;
    return this;
  }
  private java.sql.Timestamp FDTMCOMMENCE;
  public java.sql.Timestamp get_FDTMCOMMENCE() {
    return FDTMCOMMENCE;
  }
  public void set_FDTMCOMMENCE(java.sql.Timestamp FDTMCOMMENCE) {
    this.FDTMCOMMENCE = FDTMCOMMENCE;
  }
  public tblindicator with_FDTMCOMMENCE(java.sql.Timestamp FDTMCOMMENCE) {
    this.FDTMCOMMENCE = FDTMCOMMENCE;
    return this;
  }
  private java.sql.Timestamp FDTMFILINGPERIOD;
  public java.sql.Timestamp get_FDTMFILINGPERIOD() {
    return FDTMFILINGPERIOD;
  }
  public void set_FDTMFILINGPERIOD(java.sql.Timestamp FDTMFILINGPERIOD) {
    this.FDTMFILINGPERIOD = FDTMFILINGPERIOD;
  }
  public tblindicator with_FDTMFILINGPERIOD(java.sql.Timestamp FDTMFILINGPERIOD) {
    this.FDTMFILINGPERIOD = FDTMFILINGPERIOD;
    return this;
  }
  private java.sql.Timestamp FDTMFILINGPERIODTO;
  public java.sql.Timestamp get_FDTMFILINGPERIODTO() {
    return FDTMFILINGPERIODTO;
  }
  public void set_FDTMFILINGPERIODTO(java.sql.Timestamp FDTMFILINGPERIODTO) {
    this.FDTMFILINGPERIODTO = FDTMFILINGPERIODTO;
  }
  public tblindicator with_FDTMFILINGPERIODTO(java.sql.Timestamp FDTMFILINGPERIODTO) {
    this.FDTMFILINGPERIODTO = FDTMFILINGPERIODTO;
    return this;
  }
  private java.math.BigDecimal FCURAMOUNT;
  public java.math.BigDecimal get_FCURAMOUNT() {
    return FCURAMOUNT;
  }
  public void set_FCURAMOUNT(java.math.BigDecimal FCURAMOUNT) {
    this.FCURAMOUNT = FCURAMOUNT;
  }
  public tblindicator with_FCURAMOUNT(java.math.BigDecimal FCURAMOUNT) {
    this.FCURAMOUNT = FCURAMOUNT;
    return this;
  }
  private java.sql.Timestamp FDTMCEASE;
  public java.sql.Timestamp get_FDTMCEASE() {
    return FDTMCEASE;
  }
  public void set_FDTMCEASE(java.sql.Timestamp FDTMCEASE) {
    this.FDTMCEASE = FDTMCEASE;
  }
  public tblindicator with_FDTMCEASE(java.sql.Timestamp FDTMCEASE) {
    this.FDTMCEASE = FDTMCEASE;
    return this;
  }
  private String FSTRREASON;
  public String get_FSTRREASON() {
    return FSTRREASON;
  }
  public void set_FSTRREASON(String FSTRREASON) {
    this.FSTRREASON = FSTRREASON;
  }
  public tblindicator with_FSTRREASON(String FSTRREASON) {
    this.FSTRREASON = FSTRREASON;
    return this;
  }
  private java.sql.Timestamp FDTMCOMMENCE1;
  public java.sql.Timestamp get_FDTMCOMMENCE1() {
    return FDTMCOMMENCE1;
  }
  public void set_FDTMCOMMENCE1(java.sql.Timestamp FDTMCOMMENCE1) {
    this.FDTMCOMMENCE1 = FDTMCOMMENCE1;
  }
  public tblindicator with_FDTMCOMMENCE1(java.sql.Timestamp FDTMCOMMENCE1) {
    this.FDTMCOMMENCE1 = FDTMCOMMENCE1;
    return this;
  }
  private java.sql.Timestamp FDTMCEASE1;
  public java.sql.Timestamp get_FDTMCEASE1() {
    return FDTMCEASE1;
  }
  public void set_FDTMCEASE1(java.sql.Timestamp FDTMCEASE1) {
    this.FDTMCEASE1 = FDTMCEASE1;
  }
  public tblindicator with_FDTMCEASE1(java.sql.Timestamp FDTMCEASE1) {
    this.FDTMCEASE1 = FDTMCEASE1;
    return this;
  }
  private Integer flngCrmKey;
  public Integer get_flngCrmKey() {
    return flngCrmKey;
  }
  public void set_flngCrmKey(Integer flngCrmKey) {
    this.flngCrmKey = flngCrmKey;
  }
  public tblindicator with_flngCrmKey(Integer flngCrmKey) {
    this.flngCrmKey = flngCrmKey;
    return this;
  }
  private String FSTRCOMMENT;
  public String get_FSTRCOMMENT() {
    return FSTRCOMMENT;
  }
  public void set_FSTRCOMMENT(String FSTRCOMMENT) {
    this.FSTRCOMMENT = FSTRCOMMENT;
  }
  public tblindicator with_FSTRCOMMENT(String FSTRCOMMENT) {
    this.FSTRCOMMENT = FSTRCOMMENT;
    return this;
  }
  private String FSTRUSER;
  public String get_FSTRUSER() {
    return FSTRUSER;
  }
  public void set_FSTRUSER(String FSTRUSER) {
    this.FSTRUSER = FSTRUSER;
  }
  public tblindicator with_FSTRUSER(String FSTRUSER) {
    this.FSTRUSER = FSTRUSER;
    return this;
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblindicator with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private Integer fblnActive;
  public Integer get_fblnActive() {
    return fblnActive;
  }
  public void set_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
  }
  public tblindicator with_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
    return this;
  }
  private String FSTRWHO;
  public String get_FSTRWHO() {
    return FSTRWHO;
  }
  public void set_FSTRWHO(String FSTRWHO) {
    this.FSTRWHO = FSTRWHO;
  }
  public tblindicator with_FSTRWHO(String FSTRWHO) {
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
  public tblindicator with_FDTMWHEN(java.sql.Timestamp FDTMWHEN) {
    this.FDTMWHEN = FDTMWHEN;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblindicator)) {
      return false;
    }
    tblindicator that = (tblindicator) o;
    boolean equal = true;
    equal = equal && (this.FLNGINDICATORKEY == null ? that.FLNGINDICATORKEY == null : this.FLNGINDICATORKEY.equals(that.FLNGINDICATORKEY));
    equal = equal && (this.FLNGVER == null ? that.FLNGVER == null : this.FLNGVER.equals(that.FLNGVER));
    equal = equal && (this.FLNGVERLAST == null ? that.FLNGVERLAST == null : this.FLNGVERLAST.equals(that.FLNGVERLAST));
    equal = equal && (this.FINTLEVEL == null ? that.FINTLEVEL == null : this.FINTLEVEL.equals(that.FINTLEVEL));
    equal = equal && (this.FLNGCUSTOMERKEY == null ? that.FLNGCUSTOMERKEY == null : this.FLNGCUSTOMERKEY.equals(that.FLNGCUSTOMERKEY));
    equal = equal && (this.FINTPROFILENUMBER == null ? that.FINTPROFILENUMBER == null : this.FINTPROFILENUMBER.equals(that.FINTPROFILENUMBER));
    equal = equal && (this.FLNGACCOUNTKEY == null ? that.FLNGACCOUNTKEY == null : this.FLNGACCOUNTKEY.equals(that.FLNGACCOUNTKEY));
    equal = equal && (this.FSTRINDICATOR == null ? that.FSTRINDICATOR == null : this.FSTRINDICATOR.equals(that.FSTRINDICATOR));
    equal = equal && (this.FDTMCOMMENCE == null ? that.FDTMCOMMENCE == null : this.FDTMCOMMENCE.equals(that.FDTMCOMMENCE));
    equal = equal && (this.FDTMFILINGPERIOD == null ? that.FDTMFILINGPERIOD == null : this.FDTMFILINGPERIOD.equals(that.FDTMFILINGPERIOD));
    equal = equal && (this.FDTMFILINGPERIODTO == null ? that.FDTMFILINGPERIODTO == null : this.FDTMFILINGPERIODTO.equals(that.FDTMFILINGPERIODTO));
    equal = equal && (this.FCURAMOUNT == null ? that.FCURAMOUNT == null : this.FCURAMOUNT.equals(that.FCURAMOUNT));
    equal = equal && (this.FDTMCEASE == null ? that.FDTMCEASE == null : this.FDTMCEASE.equals(that.FDTMCEASE));
    equal = equal && (this.FSTRREASON == null ? that.FSTRREASON == null : this.FSTRREASON.equals(that.FSTRREASON));
    equal = equal && (this.FDTMCOMMENCE1 == null ? that.FDTMCOMMENCE1 == null : this.FDTMCOMMENCE1.equals(that.FDTMCOMMENCE1));
    equal = equal && (this.FDTMCEASE1 == null ? that.FDTMCEASE1 == null : this.FDTMCEASE1.equals(that.FDTMCEASE1));
    equal = equal && (this.flngCrmKey == null ? that.flngCrmKey == null : this.flngCrmKey.equals(that.flngCrmKey));
    equal = equal && (this.FSTRCOMMENT == null ? that.FSTRCOMMENT == null : this.FSTRCOMMENT.equals(that.FSTRCOMMENT));
    equal = equal && (this.FSTRUSER == null ? that.FSTRUSER == null : this.FSTRUSER.equals(that.FSTRUSER));
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    equal = equal && (this.FSTRWHO == null ? that.FSTRWHO == null : this.FSTRWHO.equals(that.FSTRWHO));
    equal = equal && (this.FDTMWHEN == null ? that.FDTMWHEN == null : this.FDTMWHEN.equals(that.FDTMWHEN));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblindicator)) {
      return false;
    }
    tblindicator that = (tblindicator) o;
    boolean equal = true;
    equal = equal && (this.FLNGINDICATORKEY == null ? that.FLNGINDICATORKEY == null : this.FLNGINDICATORKEY.equals(that.FLNGINDICATORKEY));
    equal = equal && (this.FLNGVER == null ? that.FLNGVER == null : this.FLNGVER.equals(that.FLNGVER));
    equal = equal && (this.FLNGVERLAST == null ? that.FLNGVERLAST == null : this.FLNGVERLAST.equals(that.FLNGVERLAST));
    equal = equal && (this.FINTLEVEL == null ? that.FINTLEVEL == null : this.FINTLEVEL.equals(that.FINTLEVEL));
    equal = equal && (this.FLNGCUSTOMERKEY == null ? that.FLNGCUSTOMERKEY == null : this.FLNGCUSTOMERKEY.equals(that.FLNGCUSTOMERKEY));
    equal = equal && (this.FINTPROFILENUMBER == null ? that.FINTPROFILENUMBER == null : this.FINTPROFILENUMBER.equals(that.FINTPROFILENUMBER));
    equal = equal && (this.FLNGACCOUNTKEY == null ? that.FLNGACCOUNTKEY == null : this.FLNGACCOUNTKEY.equals(that.FLNGACCOUNTKEY));
    equal = equal && (this.FSTRINDICATOR == null ? that.FSTRINDICATOR == null : this.FSTRINDICATOR.equals(that.FSTRINDICATOR));
    equal = equal && (this.FDTMCOMMENCE == null ? that.FDTMCOMMENCE == null : this.FDTMCOMMENCE.equals(that.FDTMCOMMENCE));
    equal = equal && (this.FDTMFILINGPERIOD == null ? that.FDTMFILINGPERIOD == null : this.FDTMFILINGPERIOD.equals(that.FDTMFILINGPERIOD));
    equal = equal && (this.FDTMFILINGPERIODTO == null ? that.FDTMFILINGPERIODTO == null : this.FDTMFILINGPERIODTO.equals(that.FDTMFILINGPERIODTO));
    equal = equal && (this.FCURAMOUNT == null ? that.FCURAMOUNT == null : this.FCURAMOUNT.equals(that.FCURAMOUNT));
    equal = equal && (this.FDTMCEASE == null ? that.FDTMCEASE == null : this.FDTMCEASE.equals(that.FDTMCEASE));
    equal = equal && (this.FSTRREASON == null ? that.FSTRREASON == null : this.FSTRREASON.equals(that.FSTRREASON));
    equal = equal && (this.FDTMCOMMENCE1 == null ? that.FDTMCOMMENCE1 == null : this.FDTMCOMMENCE1.equals(that.FDTMCOMMENCE1));
    equal = equal && (this.FDTMCEASE1 == null ? that.FDTMCEASE1 == null : this.FDTMCEASE1.equals(that.FDTMCEASE1));
    equal = equal && (this.flngCrmKey == null ? that.flngCrmKey == null : this.flngCrmKey.equals(that.flngCrmKey));
    equal = equal && (this.FSTRCOMMENT == null ? that.FSTRCOMMENT == null : this.FSTRCOMMENT.equals(that.FSTRCOMMENT));
    equal = equal && (this.FSTRUSER == null ? that.FSTRUSER == null : this.FSTRUSER.equals(that.FSTRUSER));
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    equal = equal && (this.FSTRWHO == null ? that.FSTRWHO == null : this.FSTRWHO.equals(that.FSTRWHO));
    equal = equal && (this.FDTMWHEN == null ? that.FDTMWHEN == null : this.FDTMWHEN.equals(that.FDTMWHEN));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.FLNGINDICATORKEY = JdbcWritableBridge.readInteger(1, __dbResults);
    this.FLNGVER = JdbcWritableBridge.readInteger(2, __dbResults);
    this.FLNGVERLAST = JdbcWritableBridge.readInteger(3, __dbResults);
    this.FINTLEVEL = JdbcWritableBridge.readInteger(4, __dbResults);
    this.FLNGCUSTOMERKEY = JdbcWritableBridge.readInteger(5, __dbResults);
    this.FINTPROFILENUMBER = JdbcWritableBridge.readInteger(6, __dbResults);
    this.FLNGACCOUNTKEY = JdbcWritableBridge.readInteger(7, __dbResults);
    this.FSTRINDICATOR = JdbcWritableBridge.readString(8, __dbResults);
    this.FDTMCOMMENCE = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.FDTMFILINGPERIOD = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.FDTMFILINGPERIODTO = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.FCURAMOUNT = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.FDTMCEASE = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.FSTRREASON = JdbcWritableBridge.readString(14, __dbResults);
    this.FDTMCOMMENCE1 = JdbcWritableBridge.readTimestamp(15, __dbResults);
    this.FDTMCEASE1 = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.flngCrmKey = JdbcWritableBridge.readInteger(17, __dbResults);
    this.FSTRCOMMENT = JdbcWritableBridge.readString(18, __dbResults);
    this.FSTRUSER = JdbcWritableBridge.readString(19, __dbResults);
    this.flngDocKey = JdbcWritableBridge.readInteger(20, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(21, __dbResults);
    this.FSTRWHO = JdbcWritableBridge.readString(22, __dbResults);
    this.FDTMWHEN = JdbcWritableBridge.readTimestamp(23, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.FLNGINDICATORKEY = JdbcWritableBridge.readInteger(1, __dbResults);
    this.FLNGVER = JdbcWritableBridge.readInteger(2, __dbResults);
    this.FLNGVERLAST = JdbcWritableBridge.readInteger(3, __dbResults);
    this.FINTLEVEL = JdbcWritableBridge.readInteger(4, __dbResults);
    this.FLNGCUSTOMERKEY = JdbcWritableBridge.readInteger(5, __dbResults);
    this.FINTPROFILENUMBER = JdbcWritableBridge.readInteger(6, __dbResults);
    this.FLNGACCOUNTKEY = JdbcWritableBridge.readInteger(7, __dbResults);
    this.FSTRINDICATOR = JdbcWritableBridge.readString(8, __dbResults);
    this.FDTMCOMMENCE = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.FDTMFILINGPERIOD = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.FDTMFILINGPERIODTO = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.FCURAMOUNT = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.FDTMCEASE = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.FSTRREASON = JdbcWritableBridge.readString(14, __dbResults);
    this.FDTMCOMMENCE1 = JdbcWritableBridge.readTimestamp(15, __dbResults);
    this.FDTMCEASE1 = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.flngCrmKey = JdbcWritableBridge.readInteger(17, __dbResults);
    this.FSTRCOMMENT = JdbcWritableBridge.readString(18, __dbResults);
    this.FSTRUSER = JdbcWritableBridge.readString(19, __dbResults);
    this.flngDocKey = JdbcWritableBridge.readInteger(20, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(21, __dbResults);
    this.FSTRWHO = JdbcWritableBridge.readString(22, __dbResults);
    this.FDTMWHEN = JdbcWritableBridge.readTimestamp(23, __dbResults);
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
    JdbcWritableBridge.writeInteger(FLNGINDICATORKEY, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGVER, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGVERLAST, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FINTLEVEL, 4 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGCUSTOMERKEY, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FINTPROFILENUMBER, 6 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGACCOUNTKEY, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(FSTRINDICATOR, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMCOMMENCE, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMFILINGPERIOD, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMFILINGPERIODTO, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(FCURAMOUNT, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMCEASE, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(FSTRREASON, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMCOMMENCE1, 15 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMCEASE1, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCrmKey, 17 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(FSTRCOMMENT, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(FSTRUSER, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDocKey, 20 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 21 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(FSTRWHO, 22 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMWHEN, 23 + __off, 93, __dbStmt);
    return 23;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(FLNGINDICATORKEY, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGVER, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGVERLAST, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FINTLEVEL, 4 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGCUSTOMERKEY, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FINTPROFILENUMBER, 6 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGACCOUNTKEY, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(FSTRINDICATOR, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMCOMMENCE, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMFILINGPERIOD, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMFILINGPERIODTO, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(FCURAMOUNT, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMCEASE, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(FSTRREASON, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMCOMMENCE1, 15 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMCEASE1, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCrmKey, 17 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(FSTRCOMMENT, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(FSTRUSER, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDocKey, 20 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 21 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(FSTRWHO, 22 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMWHEN, 23 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.FLNGINDICATORKEY = null;
    } else {
    this.FLNGINDICATORKEY = Integer.valueOf(__dataIn.readInt());
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
        this.FINTLEVEL = null;
    } else {
    this.FINTLEVEL = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FLNGCUSTOMERKEY = null;
    } else {
    this.FLNGCUSTOMERKEY = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FINTPROFILENUMBER = null;
    } else {
    this.FINTPROFILENUMBER = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FLNGACCOUNTKEY = null;
    } else {
    this.FLNGACCOUNTKEY = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FSTRINDICATOR = null;
    } else {
    this.FSTRINDICATOR = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FDTMCOMMENCE = null;
    } else {
    this.FDTMCOMMENCE = new Timestamp(__dataIn.readLong());
    this.FDTMCOMMENCE.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FDTMFILINGPERIOD = null;
    } else {
    this.FDTMFILINGPERIOD = new Timestamp(__dataIn.readLong());
    this.FDTMFILINGPERIOD.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FDTMFILINGPERIODTO = null;
    } else {
    this.FDTMFILINGPERIODTO = new Timestamp(__dataIn.readLong());
    this.FDTMFILINGPERIODTO.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FCURAMOUNT = null;
    } else {
    this.FCURAMOUNT = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FDTMCEASE = null;
    } else {
    this.FDTMCEASE = new Timestamp(__dataIn.readLong());
    this.FDTMCEASE.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FSTRREASON = null;
    } else {
    this.FSTRREASON = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FDTMCOMMENCE1 = null;
    } else {
    this.FDTMCOMMENCE1 = new Timestamp(__dataIn.readLong());
    this.FDTMCOMMENCE1.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FDTMCEASE1 = null;
    } else {
    this.FDTMCEASE1 = new Timestamp(__dataIn.readLong());
    this.FDTMCEASE1.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngCrmKey = null;
    } else {
    this.flngCrmKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FSTRCOMMENT = null;
    } else {
    this.FSTRCOMMENT = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FSTRUSER = null;
    } else {
    this.FSTRUSER = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngDocKey = null;
    } else {
    this.flngDocKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnActive = null;
    } else {
    this.fblnActive = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.FLNGINDICATORKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGINDICATORKEY);
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
    if (null == this.FINTLEVEL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FINTLEVEL);
    }
    if (null == this.FLNGCUSTOMERKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGCUSTOMERKEY);
    }
    if (null == this.FINTPROFILENUMBER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FINTPROFILENUMBER);
    }
    if (null == this.FLNGACCOUNTKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGACCOUNTKEY);
    }
    if (null == this.FSTRINDICATOR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRINDICATOR);
    }
    if (null == this.FDTMCOMMENCE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMCOMMENCE.getTime());
    __dataOut.writeInt(this.FDTMCOMMENCE.getNanos());
    }
    if (null == this.FDTMFILINGPERIOD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMFILINGPERIOD.getTime());
    __dataOut.writeInt(this.FDTMFILINGPERIOD.getNanos());
    }
    if (null == this.FDTMFILINGPERIODTO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMFILINGPERIODTO.getTime());
    __dataOut.writeInt(this.FDTMFILINGPERIODTO.getNanos());
    }
    if (null == this.FCURAMOUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.FCURAMOUNT, __dataOut);
    }
    if (null == this.FDTMCEASE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMCEASE.getTime());
    __dataOut.writeInt(this.FDTMCEASE.getNanos());
    }
    if (null == this.FSTRREASON) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRREASON);
    }
    if (null == this.FDTMCOMMENCE1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMCOMMENCE1.getTime());
    __dataOut.writeInt(this.FDTMCOMMENCE1.getNanos());
    }
    if (null == this.FDTMCEASE1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMCEASE1.getTime());
    __dataOut.writeInt(this.FDTMCEASE1.getNanos());
    }
    if (null == this.flngCrmKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCrmKey);
    }
    if (null == this.FSTRCOMMENT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRCOMMENT);
    }
    if (null == this.FSTRUSER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRUSER);
    }
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.fblnActive) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnActive);
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
    if (null == this.FLNGINDICATORKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGINDICATORKEY);
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
    if (null == this.FINTLEVEL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FINTLEVEL);
    }
    if (null == this.FLNGCUSTOMERKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGCUSTOMERKEY);
    }
    if (null == this.FINTPROFILENUMBER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FINTPROFILENUMBER);
    }
    if (null == this.FLNGACCOUNTKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGACCOUNTKEY);
    }
    if (null == this.FSTRINDICATOR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRINDICATOR);
    }
    if (null == this.FDTMCOMMENCE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMCOMMENCE.getTime());
    __dataOut.writeInt(this.FDTMCOMMENCE.getNanos());
    }
    if (null == this.FDTMFILINGPERIOD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMFILINGPERIOD.getTime());
    __dataOut.writeInt(this.FDTMFILINGPERIOD.getNanos());
    }
    if (null == this.FDTMFILINGPERIODTO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMFILINGPERIODTO.getTime());
    __dataOut.writeInt(this.FDTMFILINGPERIODTO.getNanos());
    }
    if (null == this.FCURAMOUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.FCURAMOUNT, __dataOut);
    }
    if (null == this.FDTMCEASE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMCEASE.getTime());
    __dataOut.writeInt(this.FDTMCEASE.getNanos());
    }
    if (null == this.FSTRREASON) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRREASON);
    }
    if (null == this.FDTMCOMMENCE1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMCOMMENCE1.getTime());
    __dataOut.writeInt(this.FDTMCOMMENCE1.getNanos());
    }
    if (null == this.FDTMCEASE1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMCEASE1.getTime());
    __dataOut.writeInt(this.FDTMCEASE1.getNanos());
    }
    if (null == this.flngCrmKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCrmKey);
    }
    if (null == this.FSTRCOMMENT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRCOMMENT);
    }
    if (null == this.FSTRUSER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRUSER);
    }
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.fblnActive) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnActive);
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
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGINDICATORKEY==null?"\\N":"" + FLNGINDICATORKEY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGVER==null?"\\N":"" + FLNGVER, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGVERLAST==null?"\\N":"" + FLNGVERLAST, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FINTLEVEL==null?"\\N":"" + FINTLEVEL, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGCUSTOMERKEY==null?"\\N":"" + FLNGCUSTOMERKEY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FINTPROFILENUMBER==null?"\\N":"" + FINTPROFILENUMBER, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGACCOUNTKEY==null?"\\N":"" + FLNGACCOUNTKEY, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRINDICATOR==null?"\\N":FSTRINDICATOR, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMCOMMENCE==null?"\\N":"" + FDTMCOMMENCE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMFILINGPERIOD==null?"\\N":"" + FDTMFILINGPERIOD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMFILINGPERIODTO==null?"\\N":"" + FDTMFILINGPERIODTO, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FCURAMOUNT==null?"\\N":FCURAMOUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMCEASE==null?"\\N":"" + FDTMCEASE, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRREASON==null?"\\N":FSTRREASON, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMCOMMENCE1==null?"\\N":"" + FDTMCOMMENCE1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMCEASE1==null?"\\N":"" + FDTMCEASE1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCrmKey==null?"\\N":"" + flngCrmKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRCOMMENT==null?"\\N":FSTRCOMMENT, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRUSER==null?"\\N":FSTRUSER, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnActive==null?"\\N":"" + fblnActive, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGINDICATORKEY==null?"\\N":"" + FLNGINDICATORKEY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGVER==null?"\\N":"" + FLNGVER, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGVERLAST==null?"\\N":"" + FLNGVERLAST, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FINTLEVEL==null?"\\N":"" + FINTLEVEL, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGCUSTOMERKEY==null?"\\N":"" + FLNGCUSTOMERKEY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FINTPROFILENUMBER==null?"\\N":"" + FINTPROFILENUMBER, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGACCOUNTKEY==null?"\\N":"" + FLNGACCOUNTKEY, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRINDICATOR==null?"\\N":FSTRINDICATOR, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMCOMMENCE==null?"\\N":"" + FDTMCOMMENCE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMFILINGPERIOD==null?"\\N":"" + FDTMFILINGPERIOD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMFILINGPERIODTO==null?"\\N":"" + FDTMFILINGPERIODTO, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FCURAMOUNT==null?"\\N":FCURAMOUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMCEASE==null?"\\N":"" + FDTMCEASE, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRREASON==null?"\\N":FSTRREASON, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMCOMMENCE1==null?"\\N":"" + FDTMCOMMENCE1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMCEASE1==null?"\\N":"" + FDTMCEASE1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCrmKey==null?"\\N":"" + flngCrmKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRCOMMENT==null?"\\N":FSTRCOMMENT, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRUSER==null?"\\N":FSTRUSER, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnActive==null?"\\N":"" + fblnActive, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGINDICATORKEY = null; } else {
      this.FLNGINDICATORKEY = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FINTLEVEL = null; } else {
      this.FINTLEVEL = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FINTPROFILENUMBER = null; } else {
      this.FINTPROFILENUMBER = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.FSTRINDICATOR = null; } else {
      this.FSTRINDICATOR = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMFILINGPERIOD = null; } else {
      this.FDTMFILINGPERIOD = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMFILINGPERIODTO = null; } else {
      this.FDTMFILINGPERIODTO = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMCEASE = null; } else {
      this.FDTMCEASE = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRREASON = null; } else {
      this.FSTRREASON = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMCOMMENCE1 = null; } else {
      this.FDTMCOMMENCE1 = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMCEASE1 = null; } else {
      this.FDTMCEASE1 = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.FSTRCOMMENT = null; } else {
      this.FSTRCOMMENT = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRUSER = null; } else {
      this.FSTRUSER = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnActive = null; } else {
      this.fblnActive = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGINDICATORKEY = null; } else {
      this.FLNGINDICATORKEY = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FINTLEVEL = null; } else {
      this.FINTLEVEL = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FINTPROFILENUMBER = null; } else {
      this.FINTPROFILENUMBER = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.FSTRINDICATOR = null; } else {
      this.FSTRINDICATOR = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMFILINGPERIOD = null; } else {
      this.FDTMFILINGPERIOD = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMFILINGPERIODTO = null; } else {
      this.FDTMFILINGPERIODTO = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMCEASE = null; } else {
      this.FDTMCEASE = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRREASON = null; } else {
      this.FSTRREASON = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMCOMMENCE1 = null; } else {
      this.FDTMCOMMENCE1 = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMCEASE1 = null; } else {
      this.FDTMCEASE1 = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.FSTRCOMMENT = null; } else {
      this.FSTRCOMMENT = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRUSER = null; } else {
      this.FSTRUSER = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnActive = null; } else {
      this.fblnActive = Integer.valueOf(__cur_str);
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
    tblindicator o = (tblindicator) super.clone();
    o.FDTMCOMMENCE = (o.FDTMCOMMENCE != null) ? (java.sql.Timestamp) o.FDTMCOMMENCE.clone() : null;
    o.FDTMFILINGPERIOD = (o.FDTMFILINGPERIOD != null) ? (java.sql.Timestamp) o.FDTMFILINGPERIOD.clone() : null;
    o.FDTMFILINGPERIODTO = (o.FDTMFILINGPERIODTO != null) ? (java.sql.Timestamp) o.FDTMFILINGPERIODTO.clone() : null;
    o.FDTMCEASE = (o.FDTMCEASE != null) ? (java.sql.Timestamp) o.FDTMCEASE.clone() : null;
    o.FDTMCOMMENCE1 = (o.FDTMCOMMENCE1 != null) ? (java.sql.Timestamp) o.FDTMCOMMENCE1.clone() : null;
    o.FDTMCEASE1 = (o.FDTMCEASE1 != null) ? (java.sql.Timestamp) o.FDTMCEASE1.clone() : null;
    o.FDTMWHEN = (o.FDTMWHEN != null) ? (java.sql.Timestamp) o.FDTMWHEN.clone() : null;
    return o;
  }

  public void clone0(tblindicator o) throws CloneNotSupportedException {
    o.FDTMCOMMENCE = (o.FDTMCOMMENCE != null) ? (java.sql.Timestamp) o.FDTMCOMMENCE.clone() : null;
    o.FDTMFILINGPERIOD = (o.FDTMFILINGPERIOD != null) ? (java.sql.Timestamp) o.FDTMFILINGPERIOD.clone() : null;
    o.FDTMFILINGPERIODTO = (o.FDTMFILINGPERIODTO != null) ? (java.sql.Timestamp) o.FDTMFILINGPERIODTO.clone() : null;
    o.FDTMCEASE = (o.FDTMCEASE != null) ? (java.sql.Timestamp) o.FDTMCEASE.clone() : null;
    o.FDTMCOMMENCE1 = (o.FDTMCOMMENCE1 != null) ? (java.sql.Timestamp) o.FDTMCOMMENCE1.clone() : null;
    o.FDTMCEASE1 = (o.FDTMCEASE1 != null) ? (java.sql.Timestamp) o.FDTMCEASE1.clone() : null;
    o.FDTMWHEN = (o.FDTMWHEN != null) ? (java.sql.Timestamp) o.FDTMWHEN.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("FLNGINDICATORKEY", this.FLNGINDICATORKEY);
    __sqoop$field_map.put("FLNGVER", this.FLNGVER);
    __sqoop$field_map.put("FLNGVERLAST", this.FLNGVERLAST);
    __sqoop$field_map.put("FINTLEVEL", this.FINTLEVEL);
    __sqoop$field_map.put("FLNGCUSTOMERKEY", this.FLNGCUSTOMERKEY);
    __sqoop$field_map.put("FINTPROFILENUMBER", this.FINTPROFILENUMBER);
    __sqoop$field_map.put("FLNGACCOUNTKEY", this.FLNGACCOUNTKEY);
    __sqoop$field_map.put("FSTRINDICATOR", this.FSTRINDICATOR);
    __sqoop$field_map.put("FDTMCOMMENCE", this.FDTMCOMMENCE);
    __sqoop$field_map.put("FDTMFILINGPERIOD", this.FDTMFILINGPERIOD);
    __sqoop$field_map.put("FDTMFILINGPERIODTO", this.FDTMFILINGPERIODTO);
    __sqoop$field_map.put("FCURAMOUNT", this.FCURAMOUNT);
    __sqoop$field_map.put("FDTMCEASE", this.FDTMCEASE);
    __sqoop$field_map.put("FSTRREASON", this.FSTRREASON);
    __sqoop$field_map.put("FDTMCOMMENCE1", this.FDTMCOMMENCE1);
    __sqoop$field_map.put("FDTMCEASE1", this.FDTMCEASE1);
    __sqoop$field_map.put("flngCrmKey", this.flngCrmKey);
    __sqoop$field_map.put("FSTRCOMMENT", this.FSTRCOMMENT);
    __sqoop$field_map.put("FSTRUSER", this.FSTRUSER);
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
    __sqoop$field_map.put("FSTRWHO", this.FSTRWHO);
    __sqoop$field_map.put("FDTMWHEN", this.FDTMWHEN);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("FLNGINDICATORKEY", this.FLNGINDICATORKEY);
    __sqoop$field_map.put("FLNGVER", this.FLNGVER);
    __sqoop$field_map.put("FLNGVERLAST", this.FLNGVERLAST);
    __sqoop$field_map.put("FINTLEVEL", this.FINTLEVEL);
    __sqoop$field_map.put("FLNGCUSTOMERKEY", this.FLNGCUSTOMERKEY);
    __sqoop$field_map.put("FINTPROFILENUMBER", this.FINTPROFILENUMBER);
    __sqoop$field_map.put("FLNGACCOUNTKEY", this.FLNGACCOUNTKEY);
    __sqoop$field_map.put("FSTRINDICATOR", this.FSTRINDICATOR);
    __sqoop$field_map.put("FDTMCOMMENCE", this.FDTMCOMMENCE);
    __sqoop$field_map.put("FDTMFILINGPERIOD", this.FDTMFILINGPERIOD);
    __sqoop$field_map.put("FDTMFILINGPERIODTO", this.FDTMFILINGPERIODTO);
    __sqoop$field_map.put("FCURAMOUNT", this.FCURAMOUNT);
    __sqoop$field_map.put("FDTMCEASE", this.FDTMCEASE);
    __sqoop$field_map.put("FSTRREASON", this.FSTRREASON);
    __sqoop$field_map.put("FDTMCOMMENCE1", this.FDTMCOMMENCE1);
    __sqoop$field_map.put("FDTMCEASE1", this.FDTMCEASE1);
    __sqoop$field_map.put("flngCrmKey", this.flngCrmKey);
    __sqoop$field_map.put("FSTRCOMMENT", this.FSTRCOMMENT);
    __sqoop$field_map.put("FSTRUSER", this.FSTRUSER);
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
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
