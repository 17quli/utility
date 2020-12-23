// ORM class for table 'tblcrossaccttransfer'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 07:58:33 NZDT 2020
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

public class tblcrossaccttransfer extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("FLNGCREDITTRANSFERKEY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcrossaccttransfer.this.FLNGCREDITTRANSFERKEY = (Integer)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcrossaccttransfer.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcrossaccttransfer.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("FLNGTRANSKEYSOURCE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcrossaccttransfer.this.FLNGTRANSKEYSOURCE = (Integer)value;
      }
    });
    setters.put("FLNGTRANSKEYTARGET", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcrossaccttransfer.this.FLNGTRANSKEYTARGET = (Integer)value;
      }
    });
    setters.put("FLNGACCOUNTKEYSOURCE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcrossaccttransfer.this.FLNGACCOUNTKEYSOURCE = (Integer)value;
      }
    });
    setters.put("FLNGACCOUNTKEYTARGET", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcrossaccttransfer.this.FLNGACCOUNTKEYTARGET = (Integer)value;
      }
    });
    setters.put("FDTMFILINGPERIODSOURCEFROM", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcrossaccttransfer.this.FDTMFILINGPERIODSOURCEFROM = (java.sql.Timestamp)value;
      }
    });
    setters.put("FDTMFILINGPERIODSOURCETO", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcrossaccttransfer.this.FDTMFILINGPERIODSOURCETO = (java.sql.Timestamp)value;
      }
    });
    setters.put("FDTMFILINGPERIODTARGET", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcrossaccttransfer.this.FDTMFILINGPERIODTARGET = (java.sql.Timestamp)value;
      }
    });
    setters.put("flngBillItemKeyTarget", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcrossaccttransfer.this.flngBillItemKeyTarget = (Integer)value;
      }
    });
    setters.put("FCURAMOUNTTRANSFER", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcrossaccttransfer.this.FCURAMOUNTTRANSFER = (java.math.BigDecimal)value;
      }
    });
    setters.put("FSTRTRANSFERTYPE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcrossaccttransfer.this.FSTRTRANSFERTYPE = (String)value;
      }
    });
    setters.put("flngSourceCrmKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcrossaccttransfer.this.flngSourceCrmKey = (Integer)value;
      }
    });
    setters.put("flngTargetCrmKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcrossaccttransfer.this.flngTargetCrmKey = (Integer)value;
      }
    });
    setters.put("fdtmEffect", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcrossaccttransfer.this.fdtmEffect = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrAddedWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcrossaccttransfer.this.fstrAddedWho = (String)value;
      }
    });
    setters.put("fdtmAddedWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcrossaccttransfer.this.fdtmAddedWhen = (java.sql.Timestamp)value;
      }
    });
    setters.put("FBLNREVERSED", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcrossaccttransfer.this.FBLNREVERSED = (Integer)value;
      }
    });
    setters.put("fstrReversedWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcrossaccttransfer.this.fstrReversedWho = (String)value;
      }
    });
    setters.put("fdtmReversedWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcrossaccttransfer.this.fdtmReversedWhen = (java.sql.Timestamp)value;
      }
    });
    setters.put("FSTRWHO", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcrossaccttransfer.this.FSTRWHO = (String)value;
      }
    });
    setters.put("FDTMWHEN", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcrossaccttransfer.this.FDTMWHEN = (java.sql.Timestamp)value;
      }
    });
  }
  public tblcrossaccttransfer() {
    init0();
  }
  private Integer FLNGCREDITTRANSFERKEY;
  public Integer get_FLNGCREDITTRANSFERKEY() {
    return FLNGCREDITTRANSFERKEY;
  }
  public void set_FLNGCREDITTRANSFERKEY(Integer FLNGCREDITTRANSFERKEY) {
    this.FLNGCREDITTRANSFERKEY = FLNGCREDITTRANSFERKEY;
  }
  public tblcrossaccttransfer with_FLNGCREDITTRANSFERKEY(Integer FLNGCREDITTRANSFERKEY) {
    this.FLNGCREDITTRANSFERKEY = FLNGCREDITTRANSFERKEY;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblcrossaccttransfer with_flngVer(Integer flngVer) {
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
  public tblcrossaccttransfer with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private Integer FLNGTRANSKEYSOURCE;
  public Integer get_FLNGTRANSKEYSOURCE() {
    return FLNGTRANSKEYSOURCE;
  }
  public void set_FLNGTRANSKEYSOURCE(Integer FLNGTRANSKEYSOURCE) {
    this.FLNGTRANSKEYSOURCE = FLNGTRANSKEYSOURCE;
  }
  public tblcrossaccttransfer with_FLNGTRANSKEYSOURCE(Integer FLNGTRANSKEYSOURCE) {
    this.FLNGTRANSKEYSOURCE = FLNGTRANSKEYSOURCE;
    return this;
  }
  private Integer FLNGTRANSKEYTARGET;
  public Integer get_FLNGTRANSKEYTARGET() {
    return FLNGTRANSKEYTARGET;
  }
  public void set_FLNGTRANSKEYTARGET(Integer FLNGTRANSKEYTARGET) {
    this.FLNGTRANSKEYTARGET = FLNGTRANSKEYTARGET;
  }
  public tblcrossaccttransfer with_FLNGTRANSKEYTARGET(Integer FLNGTRANSKEYTARGET) {
    this.FLNGTRANSKEYTARGET = FLNGTRANSKEYTARGET;
    return this;
  }
  private Integer FLNGACCOUNTKEYSOURCE;
  public Integer get_FLNGACCOUNTKEYSOURCE() {
    return FLNGACCOUNTKEYSOURCE;
  }
  public void set_FLNGACCOUNTKEYSOURCE(Integer FLNGACCOUNTKEYSOURCE) {
    this.FLNGACCOUNTKEYSOURCE = FLNGACCOUNTKEYSOURCE;
  }
  public tblcrossaccttransfer with_FLNGACCOUNTKEYSOURCE(Integer FLNGACCOUNTKEYSOURCE) {
    this.FLNGACCOUNTKEYSOURCE = FLNGACCOUNTKEYSOURCE;
    return this;
  }
  private Integer FLNGACCOUNTKEYTARGET;
  public Integer get_FLNGACCOUNTKEYTARGET() {
    return FLNGACCOUNTKEYTARGET;
  }
  public void set_FLNGACCOUNTKEYTARGET(Integer FLNGACCOUNTKEYTARGET) {
    this.FLNGACCOUNTKEYTARGET = FLNGACCOUNTKEYTARGET;
  }
  public tblcrossaccttransfer with_FLNGACCOUNTKEYTARGET(Integer FLNGACCOUNTKEYTARGET) {
    this.FLNGACCOUNTKEYTARGET = FLNGACCOUNTKEYTARGET;
    return this;
  }
  private java.sql.Timestamp FDTMFILINGPERIODSOURCEFROM;
  public java.sql.Timestamp get_FDTMFILINGPERIODSOURCEFROM() {
    return FDTMFILINGPERIODSOURCEFROM;
  }
  public void set_FDTMFILINGPERIODSOURCEFROM(java.sql.Timestamp FDTMFILINGPERIODSOURCEFROM) {
    this.FDTMFILINGPERIODSOURCEFROM = FDTMFILINGPERIODSOURCEFROM;
  }
  public tblcrossaccttransfer with_FDTMFILINGPERIODSOURCEFROM(java.sql.Timestamp FDTMFILINGPERIODSOURCEFROM) {
    this.FDTMFILINGPERIODSOURCEFROM = FDTMFILINGPERIODSOURCEFROM;
    return this;
  }
  private java.sql.Timestamp FDTMFILINGPERIODSOURCETO;
  public java.sql.Timestamp get_FDTMFILINGPERIODSOURCETO() {
    return FDTMFILINGPERIODSOURCETO;
  }
  public void set_FDTMFILINGPERIODSOURCETO(java.sql.Timestamp FDTMFILINGPERIODSOURCETO) {
    this.FDTMFILINGPERIODSOURCETO = FDTMFILINGPERIODSOURCETO;
  }
  public tblcrossaccttransfer with_FDTMFILINGPERIODSOURCETO(java.sql.Timestamp FDTMFILINGPERIODSOURCETO) {
    this.FDTMFILINGPERIODSOURCETO = FDTMFILINGPERIODSOURCETO;
    return this;
  }
  private java.sql.Timestamp FDTMFILINGPERIODTARGET;
  public java.sql.Timestamp get_FDTMFILINGPERIODTARGET() {
    return FDTMFILINGPERIODTARGET;
  }
  public void set_FDTMFILINGPERIODTARGET(java.sql.Timestamp FDTMFILINGPERIODTARGET) {
    this.FDTMFILINGPERIODTARGET = FDTMFILINGPERIODTARGET;
  }
  public tblcrossaccttransfer with_FDTMFILINGPERIODTARGET(java.sql.Timestamp FDTMFILINGPERIODTARGET) {
    this.FDTMFILINGPERIODTARGET = FDTMFILINGPERIODTARGET;
    return this;
  }
  private Integer flngBillItemKeyTarget;
  public Integer get_flngBillItemKeyTarget() {
    return flngBillItemKeyTarget;
  }
  public void set_flngBillItemKeyTarget(Integer flngBillItemKeyTarget) {
    this.flngBillItemKeyTarget = flngBillItemKeyTarget;
  }
  public tblcrossaccttransfer with_flngBillItemKeyTarget(Integer flngBillItemKeyTarget) {
    this.flngBillItemKeyTarget = flngBillItemKeyTarget;
    return this;
  }
  private java.math.BigDecimal FCURAMOUNTTRANSFER;
  public java.math.BigDecimal get_FCURAMOUNTTRANSFER() {
    return FCURAMOUNTTRANSFER;
  }
  public void set_FCURAMOUNTTRANSFER(java.math.BigDecimal FCURAMOUNTTRANSFER) {
    this.FCURAMOUNTTRANSFER = FCURAMOUNTTRANSFER;
  }
  public tblcrossaccttransfer with_FCURAMOUNTTRANSFER(java.math.BigDecimal FCURAMOUNTTRANSFER) {
    this.FCURAMOUNTTRANSFER = FCURAMOUNTTRANSFER;
    return this;
  }
  private String FSTRTRANSFERTYPE;
  public String get_FSTRTRANSFERTYPE() {
    return FSTRTRANSFERTYPE;
  }
  public void set_FSTRTRANSFERTYPE(String FSTRTRANSFERTYPE) {
    this.FSTRTRANSFERTYPE = FSTRTRANSFERTYPE;
  }
  public tblcrossaccttransfer with_FSTRTRANSFERTYPE(String FSTRTRANSFERTYPE) {
    this.FSTRTRANSFERTYPE = FSTRTRANSFERTYPE;
    return this;
  }
  private Integer flngSourceCrmKey;
  public Integer get_flngSourceCrmKey() {
    return flngSourceCrmKey;
  }
  public void set_flngSourceCrmKey(Integer flngSourceCrmKey) {
    this.flngSourceCrmKey = flngSourceCrmKey;
  }
  public tblcrossaccttransfer with_flngSourceCrmKey(Integer flngSourceCrmKey) {
    this.flngSourceCrmKey = flngSourceCrmKey;
    return this;
  }
  private Integer flngTargetCrmKey;
  public Integer get_flngTargetCrmKey() {
    return flngTargetCrmKey;
  }
  public void set_flngTargetCrmKey(Integer flngTargetCrmKey) {
    this.flngTargetCrmKey = flngTargetCrmKey;
  }
  public tblcrossaccttransfer with_flngTargetCrmKey(Integer flngTargetCrmKey) {
    this.flngTargetCrmKey = flngTargetCrmKey;
    return this;
  }
  private java.sql.Timestamp fdtmEffect;
  public java.sql.Timestamp get_fdtmEffect() {
    return fdtmEffect;
  }
  public void set_fdtmEffect(java.sql.Timestamp fdtmEffect) {
    this.fdtmEffect = fdtmEffect;
  }
  public tblcrossaccttransfer with_fdtmEffect(java.sql.Timestamp fdtmEffect) {
    this.fdtmEffect = fdtmEffect;
    return this;
  }
  private String fstrAddedWho;
  public String get_fstrAddedWho() {
    return fstrAddedWho;
  }
  public void set_fstrAddedWho(String fstrAddedWho) {
    this.fstrAddedWho = fstrAddedWho;
  }
  public tblcrossaccttransfer with_fstrAddedWho(String fstrAddedWho) {
    this.fstrAddedWho = fstrAddedWho;
    return this;
  }
  private java.sql.Timestamp fdtmAddedWhen;
  public java.sql.Timestamp get_fdtmAddedWhen() {
    return fdtmAddedWhen;
  }
  public void set_fdtmAddedWhen(java.sql.Timestamp fdtmAddedWhen) {
    this.fdtmAddedWhen = fdtmAddedWhen;
  }
  public tblcrossaccttransfer with_fdtmAddedWhen(java.sql.Timestamp fdtmAddedWhen) {
    this.fdtmAddedWhen = fdtmAddedWhen;
    return this;
  }
  private Integer FBLNREVERSED;
  public Integer get_FBLNREVERSED() {
    return FBLNREVERSED;
  }
  public void set_FBLNREVERSED(Integer FBLNREVERSED) {
    this.FBLNREVERSED = FBLNREVERSED;
  }
  public tblcrossaccttransfer with_FBLNREVERSED(Integer FBLNREVERSED) {
    this.FBLNREVERSED = FBLNREVERSED;
    return this;
  }
  private String fstrReversedWho;
  public String get_fstrReversedWho() {
    return fstrReversedWho;
  }
  public void set_fstrReversedWho(String fstrReversedWho) {
    this.fstrReversedWho = fstrReversedWho;
  }
  public tblcrossaccttransfer with_fstrReversedWho(String fstrReversedWho) {
    this.fstrReversedWho = fstrReversedWho;
    return this;
  }
  private java.sql.Timestamp fdtmReversedWhen;
  public java.sql.Timestamp get_fdtmReversedWhen() {
    return fdtmReversedWhen;
  }
  public void set_fdtmReversedWhen(java.sql.Timestamp fdtmReversedWhen) {
    this.fdtmReversedWhen = fdtmReversedWhen;
  }
  public tblcrossaccttransfer with_fdtmReversedWhen(java.sql.Timestamp fdtmReversedWhen) {
    this.fdtmReversedWhen = fdtmReversedWhen;
    return this;
  }
  private String FSTRWHO;
  public String get_FSTRWHO() {
    return FSTRWHO;
  }
  public void set_FSTRWHO(String FSTRWHO) {
    this.FSTRWHO = FSTRWHO;
  }
  public tblcrossaccttransfer with_FSTRWHO(String FSTRWHO) {
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
  public tblcrossaccttransfer with_FDTMWHEN(java.sql.Timestamp FDTMWHEN) {
    this.FDTMWHEN = FDTMWHEN;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblcrossaccttransfer)) {
      return false;
    }
    tblcrossaccttransfer that = (tblcrossaccttransfer) o;
    boolean equal = true;
    equal = equal && (this.FLNGCREDITTRANSFERKEY == null ? that.FLNGCREDITTRANSFERKEY == null : this.FLNGCREDITTRANSFERKEY.equals(that.FLNGCREDITTRANSFERKEY));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.FLNGTRANSKEYSOURCE == null ? that.FLNGTRANSKEYSOURCE == null : this.FLNGTRANSKEYSOURCE.equals(that.FLNGTRANSKEYSOURCE));
    equal = equal && (this.FLNGTRANSKEYTARGET == null ? that.FLNGTRANSKEYTARGET == null : this.FLNGTRANSKEYTARGET.equals(that.FLNGTRANSKEYTARGET));
    equal = equal && (this.FLNGACCOUNTKEYSOURCE == null ? that.FLNGACCOUNTKEYSOURCE == null : this.FLNGACCOUNTKEYSOURCE.equals(that.FLNGACCOUNTKEYSOURCE));
    equal = equal && (this.FLNGACCOUNTKEYTARGET == null ? that.FLNGACCOUNTKEYTARGET == null : this.FLNGACCOUNTKEYTARGET.equals(that.FLNGACCOUNTKEYTARGET));
    equal = equal && (this.FDTMFILINGPERIODSOURCEFROM == null ? that.FDTMFILINGPERIODSOURCEFROM == null : this.FDTMFILINGPERIODSOURCEFROM.equals(that.FDTMFILINGPERIODSOURCEFROM));
    equal = equal && (this.FDTMFILINGPERIODSOURCETO == null ? that.FDTMFILINGPERIODSOURCETO == null : this.FDTMFILINGPERIODSOURCETO.equals(that.FDTMFILINGPERIODSOURCETO));
    equal = equal && (this.FDTMFILINGPERIODTARGET == null ? that.FDTMFILINGPERIODTARGET == null : this.FDTMFILINGPERIODTARGET.equals(that.FDTMFILINGPERIODTARGET));
    equal = equal && (this.flngBillItemKeyTarget == null ? that.flngBillItemKeyTarget == null : this.flngBillItemKeyTarget.equals(that.flngBillItemKeyTarget));
    equal = equal && (this.FCURAMOUNTTRANSFER == null ? that.FCURAMOUNTTRANSFER == null : this.FCURAMOUNTTRANSFER.equals(that.FCURAMOUNTTRANSFER));
    equal = equal && (this.FSTRTRANSFERTYPE == null ? that.FSTRTRANSFERTYPE == null : this.FSTRTRANSFERTYPE.equals(that.FSTRTRANSFERTYPE));
    equal = equal && (this.flngSourceCrmKey == null ? that.flngSourceCrmKey == null : this.flngSourceCrmKey.equals(that.flngSourceCrmKey));
    equal = equal && (this.flngTargetCrmKey == null ? that.flngTargetCrmKey == null : this.flngTargetCrmKey.equals(that.flngTargetCrmKey));
    equal = equal && (this.fdtmEffect == null ? that.fdtmEffect == null : this.fdtmEffect.equals(that.fdtmEffect));
    equal = equal && (this.fstrAddedWho == null ? that.fstrAddedWho == null : this.fstrAddedWho.equals(that.fstrAddedWho));
    equal = equal && (this.fdtmAddedWhen == null ? that.fdtmAddedWhen == null : this.fdtmAddedWhen.equals(that.fdtmAddedWhen));
    equal = equal && (this.FBLNREVERSED == null ? that.FBLNREVERSED == null : this.FBLNREVERSED.equals(that.FBLNREVERSED));
    equal = equal && (this.fstrReversedWho == null ? that.fstrReversedWho == null : this.fstrReversedWho.equals(that.fstrReversedWho));
    equal = equal && (this.fdtmReversedWhen == null ? that.fdtmReversedWhen == null : this.fdtmReversedWhen.equals(that.fdtmReversedWhen));
    equal = equal && (this.FSTRWHO == null ? that.FSTRWHO == null : this.FSTRWHO.equals(that.FSTRWHO));
    equal = equal && (this.FDTMWHEN == null ? that.FDTMWHEN == null : this.FDTMWHEN.equals(that.FDTMWHEN));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblcrossaccttransfer)) {
      return false;
    }
    tblcrossaccttransfer that = (tblcrossaccttransfer) o;
    boolean equal = true;
    equal = equal && (this.FLNGCREDITTRANSFERKEY == null ? that.FLNGCREDITTRANSFERKEY == null : this.FLNGCREDITTRANSFERKEY.equals(that.FLNGCREDITTRANSFERKEY));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.FLNGTRANSKEYSOURCE == null ? that.FLNGTRANSKEYSOURCE == null : this.FLNGTRANSKEYSOURCE.equals(that.FLNGTRANSKEYSOURCE));
    equal = equal && (this.FLNGTRANSKEYTARGET == null ? that.FLNGTRANSKEYTARGET == null : this.FLNGTRANSKEYTARGET.equals(that.FLNGTRANSKEYTARGET));
    equal = equal && (this.FLNGACCOUNTKEYSOURCE == null ? that.FLNGACCOUNTKEYSOURCE == null : this.FLNGACCOUNTKEYSOURCE.equals(that.FLNGACCOUNTKEYSOURCE));
    equal = equal && (this.FLNGACCOUNTKEYTARGET == null ? that.FLNGACCOUNTKEYTARGET == null : this.FLNGACCOUNTKEYTARGET.equals(that.FLNGACCOUNTKEYTARGET));
    equal = equal && (this.FDTMFILINGPERIODSOURCEFROM == null ? that.FDTMFILINGPERIODSOURCEFROM == null : this.FDTMFILINGPERIODSOURCEFROM.equals(that.FDTMFILINGPERIODSOURCEFROM));
    equal = equal && (this.FDTMFILINGPERIODSOURCETO == null ? that.FDTMFILINGPERIODSOURCETO == null : this.FDTMFILINGPERIODSOURCETO.equals(that.FDTMFILINGPERIODSOURCETO));
    equal = equal && (this.FDTMFILINGPERIODTARGET == null ? that.FDTMFILINGPERIODTARGET == null : this.FDTMFILINGPERIODTARGET.equals(that.FDTMFILINGPERIODTARGET));
    equal = equal && (this.flngBillItemKeyTarget == null ? that.flngBillItemKeyTarget == null : this.flngBillItemKeyTarget.equals(that.flngBillItemKeyTarget));
    equal = equal && (this.FCURAMOUNTTRANSFER == null ? that.FCURAMOUNTTRANSFER == null : this.FCURAMOUNTTRANSFER.equals(that.FCURAMOUNTTRANSFER));
    equal = equal && (this.FSTRTRANSFERTYPE == null ? that.FSTRTRANSFERTYPE == null : this.FSTRTRANSFERTYPE.equals(that.FSTRTRANSFERTYPE));
    equal = equal && (this.flngSourceCrmKey == null ? that.flngSourceCrmKey == null : this.flngSourceCrmKey.equals(that.flngSourceCrmKey));
    equal = equal && (this.flngTargetCrmKey == null ? that.flngTargetCrmKey == null : this.flngTargetCrmKey.equals(that.flngTargetCrmKey));
    equal = equal && (this.fdtmEffect == null ? that.fdtmEffect == null : this.fdtmEffect.equals(that.fdtmEffect));
    equal = equal && (this.fstrAddedWho == null ? that.fstrAddedWho == null : this.fstrAddedWho.equals(that.fstrAddedWho));
    equal = equal && (this.fdtmAddedWhen == null ? that.fdtmAddedWhen == null : this.fdtmAddedWhen.equals(that.fdtmAddedWhen));
    equal = equal && (this.FBLNREVERSED == null ? that.FBLNREVERSED == null : this.FBLNREVERSED.equals(that.FBLNREVERSED));
    equal = equal && (this.fstrReversedWho == null ? that.fstrReversedWho == null : this.fstrReversedWho.equals(that.fstrReversedWho));
    equal = equal && (this.fdtmReversedWhen == null ? that.fdtmReversedWhen == null : this.fdtmReversedWhen.equals(that.fdtmReversedWhen));
    equal = equal && (this.FSTRWHO == null ? that.FSTRWHO == null : this.FSTRWHO.equals(that.FSTRWHO));
    equal = equal && (this.FDTMWHEN == null ? that.FDTMWHEN == null : this.FDTMWHEN.equals(that.FDTMWHEN));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.FLNGCREDITTRANSFERKEY = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.FLNGTRANSKEYSOURCE = JdbcWritableBridge.readInteger(4, __dbResults);
    this.FLNGTRANSKEYTARGET = JdbcWritableBridge.readInteger(5, __dbResults);
    this.FLNGACCOUNTKEYSOURCE = JdbcWritableBridge.readInteger(6, __dbResults);
    this.FLNGACCOUNTKEYTARGET = JdbcWritableBridge.readInteger(7, __dbResults);
    this.FDTMFILINGPERIODSOURCEFROM = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.FDTMFILINGPERIODSOURCETO = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.FDTMFILINGPERIODTARGET = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.flngBillItemKeyTarget = JdbcWritableBridge.readInteger(11, __dbResults);
    this.FCURAMOUNTTRANSFER = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.FSTRTRANSFERTYPE = JdbcWritableBridge.readString(13, __dbResults);
    this.flngSourceCrmKey = JdbcWritableBridge.readInteger(14, __dbResults);
    this.flngTargetCrmKey = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fdtmEffect = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.fstrAddedWho = JdbcWritableBridge.readString(17, __dbResults);
    this.fdtmAddedWhen = JdbcWritableBridge.readTimestamp(18, __dbResults);
    this.FBLNREVERSED = JdbcWritableBridge.readInteger(19, __dbResults);
    this.fstrReversedWho = JdbcWritableBridge.readString(20, __dbResults);
    this.fdtmReversedWhen = JdbcWritableBridge.readTimestamp(21, __dbResults);
    this.FSTRWHO = JdbcWritableBridge.readString(22, __dbResults);
    this.FDTMWHEN = JdbcWritableBridge.readTimestamp(23, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.FLNGCREDITTRANSFERKEY = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.FLNGTRANSKEYSOURCE = JdbcWritableBridge.readInteger(4, __dbResults);
    this.FLNGTRANSKEYTARGET = JdbcWritableBridge.readInteger(5, __dbResults);
    this.FLNGACCOUNTKEYSOURCE = JdbcWritableBridge.readInteger(6, __dbResults);
    this.FLNGACCOUNTKEYTARGET = JdbcWritableBridge.readInteger(7, __dbResults);
    this.FDTMFILINGPERIODSOURCEFROM = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.FDTMFILINGPERIODSOURCETO = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.FDTMFILINGPERIODTARGET = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.flngBillItemKeyTarget = JdbcWritableBridge.readInteger(11, __dbResults);
    this.FCURAMOUNTTRANSFER = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.FSTRTRANSFERTYPE = JdbcWritableBridge.readString(13, __dbResults);
    this.flngSourceCrmKey = JdbcWritableBridge.readInteger(14, __dbResults);
    this.flngTargetCrmKey = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fdtmEffect = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.fstrAddedWho = JdbcWritableBridge.readString(17, __dbResults);
    this.fdtmAddedWhen = JdbcWritableBridge.readTimestamp(18, __dbResults);
    this.FBLNREVERSED = JdbcWritableBridge.readInteger(19, __dbResults);
    this.fstrReversedWho = JdbcWritableBridge.readString(20, __dbResults);
    this.fdtmReversedWhen = JdbcWritableBridge.readTimestamp(21, __dbResults);
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
    JdbcWritableBridge.writeInteger(FLNGCREDITTRANSFERKEY, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGTRANSKEYSOURCE, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGTRANSKEYTARGET, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGACCOUNTKEYSOURCE, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGACCOUNTKEYTARGET, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMFILINGPERIODSOURCEFROM, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMFILINGPERIODSOURCETO, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMFILINGPERIODTARGET, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngBillItemKeyTarget, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(FCURAMOUNTTRANSFER, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(FSTRTRANSFERTYPE, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngSourceCrmKey, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngTargetCrmKey, 15 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEffect, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrAddedWho, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmAddedWhen, 18 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(FBLNREVERSED, 19 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrReversedWho, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReversedWhen, 21 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(FSTRWHO, 22 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMWHEN, 23 + __off, 93, __dbStmt);
    return 23;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(FLNGCREDITTRANSFERKEY, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGTRANSKEYSOURCE, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGTRANSKEYTARGET, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGACCOUNTKEYSOURCE, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGACCOUNTKEYTARGET, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMFILINGPERIODSOURCEFROM, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMFILINGPERIODSOURCETO, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMFILINGPERIODTARGET, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngBillItemKeyTarget, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(FCURAMOUNTTRANSFER, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(FSTRTRANSFERTYPE, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngSourceCrmKey, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngTargetCrmKey, 15 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEffect, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrAddedWho, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmAddedWhen, 18 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(FBLNREVERSED, 19 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrReversedWho, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReversedWhen, 21 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(FSTRWHO, 22 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMWHEN, 23 + __off, 93, __dbStmt);
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
        this.FLNGTRANSKEYSOURCE = null;
    } else {
    this.FLNGTRANSKEYSOURCE = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FLNGTRANSKEYTARGET = null;
    } else {
    this.FLNGTRANSKEYTARGET = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FLNGACCOUNTKEYSOURCE = null;
    } else {
    this.FLNGACCOUNTKEYSOURCE = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FLNGACCOUNTKEYTARGET = null;
    } else {
    this.FLNGACCOUNTKEYTARGET = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FDTMFILINGPERIODSOURCEFROM = null;
    } else {
    this.FDTMFILINGPERIODSOURCEFROM = new Timestamp(__dataIn.readLong());
    this.FDTMFILINGPERIODSOURCEFROM.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FDTMFILINGPERIODSOURCETO = null;
    } else {
    this.FDTMFILINGPERIODSOURCETO = new Timestamp(__dataIn.readLong());
    this.FDTMFILINGPERIODSOURCETO.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FDTMFILINGPERIODTARGET = null;
    } else {
    this.FDTMFILINGPERIODTARGET = new Timestamp(__dataIn.readLong());
    this.FDTMFILINGPERIODTARGET.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngBillItemKeyTarget = null;
    } else {
    this.flngBillItemKeyTarget = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FCURAMOUNTTRANSFER = null;
    } else {
    this.FCURAMOUNTTRANSFER = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FSTRTRANSFERTYPE = null;
    } else {
    this.FSTRTRANSFERTYPE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngSourceCrmKey = null;
    } else {
    this.flngSourceCrmKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngTargetCrmKey = null;
    } else {
    this.flngTargetCrmKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmEffect = null;
    } else {
    this.fdtmEffect = new Timestamp(__dataIn.readLong());
    this.fdtmEffect.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAddedWho = null;
    } else {
    this.fstrAddedWho = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmAddedWhen = null;
    } else {
    this.fdtmAddedWhen = new Timestamp(__dataIn.readLong());
    this.fdtmAddedWhen.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FBLNREVERSED = null;
    } else {
    this.FBLNREVERSED = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrReversedWho = null;
    } else {
    this.fstrReversedWho = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmReversedWhen = null;
    } else {
    this.fdtmReversedWhen = new Timestamp(__dataIn.readLong());
    this.fdtmReversedWhen.setNanos(__dataIn.readInt());
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
    if (null == this.FLNGTRANSKEYSOURCE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGTRANSKEYSOURCE);
    }
    if (null == this.FLNGTRANSKEYTARGET) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGTRANSKEYTARGET);
    }
    if (null == this.FLNGACCOUNTKEYSOURCE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGACCOUNTKEYSOURCE);
    }
    if (null == this.FLNGACCOUNTKEYTARGET) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGACCOUNTKEYTARGET);
    }
    if (null == this.FDTMFILINGPERIODSOURCEFROM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMFILINGPERIODSOURCEFROM.getTime());
    __dataOut.writeInt(this.FDTMFILINGPERIODSOURCEFROM.getNanos());
    }
    if (null == this.FDTMFILINGPERIODSOURCETO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMFILINGPERIODSOURCETO.getTime());
    __dataOut.writeInt(this.FDTMFILINGPERIODSOURCETO.getNanos());
    }
    if (null == this.FDTMFILINGPERIODTARGET) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMFILINGPERIODTARGET.getTime());
    __dataOut.writeInt(this.FDTMFILINGPERIODTARGET.getNanos());
    }
    if (null == this.flngBillItemKeyTarget) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngBillItemKeyTarget);
    }
    if (null == this.FCURAMOUNTTRANSFER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.FCURAMOUNTTRANSFER, __dataOut);
    }
    if (null == this.FSTRTRANSFERTYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRTRANSFERTYPE);
    }
    if (null == this.flngSourceCrmKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngSourceCrmKey);
    }
    if (null == this.flngTargetCrmKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTargetCrmKey);
    }
    if (null == this.fdtmEffect) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEffect.getTime());
    __dataOut.writeInt(this.fdtmEffect.getNanos());
    }
    if (null == this.fstrAddedWho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAddedWho);
    }
    if (null == this.fdtmAddedWhen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmAddedWhen.getTime());
    __dataOut.writeInt(this.fdtmAddedWhen.getNanos());
    }
    if (null == this.FBLNREVERSED) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FBLNREVERSED);
    }
    if (null == this.fstrReversedWho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrReversedWho);
    }
    if (null == this.fdtmReversedWhen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReversedWhen.getTime());
    __dataOut.writeInt(this.fdtmReversedWhen.getNanos());
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
    if (null == this.FLNGTRANSKEYSOURCE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGTRANSKEYSOURCE);
    }
    if (null == this.FLNGTRANSKEYTARGET) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGTRANSKEYTARGET);
    }
    if (null == this.FLNGACCOUNTKEYSOURCE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGACCOUNTKEYSOURCE);
    }
    if (null == this.FLNGACCOUNTKEYTARGET) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGACCOUNTKEYTARGET);
    }
    if (null == this.FDTMFILINGPERIODSOURCEFROM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMFILINGPERIODSOURCEFROM.getTime());
    __dataOut.writeInt(this.FDTMFILINGPERIODSOURCEFROM.getNanos());
    }
    if (null == this.FDTMFILINGPERIODSOURCETO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMFILINGPERIODSOURCETO.getTime());
    __dataOut.writeInt(this.FDTMFILINGPERIODSOURCETO.getNanos());
    }
    if (null == this.FDTMFILINGPERIODTARGET) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMFILINGPERIODTARGET.getTime());
    __dataOut.writeInt(this.FDTMFILINGPERIODTARGET.getNanos());
    }
    if (null == this.flngBillItemKeyTarget) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngBillItemKeyTarget);
    }
    if (null == this.FCURAMOUNTTRANSFER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.FCURAMOUNTTRANSFER, __dataOut);
    }
    if (null == this.FSTRTRANSFERTYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRTRANSFERTYPE);
    }
    if (null == this.flngSourceCrmKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngSourceCrmKey);
    }
    if (null == this.flngTargetCrmKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTargetCrmKey);
    }
    if (null == this.fdtmEffect) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEffect.getTime());
    __dataOut.writeInt(this.fdtmEffect.getNanos());
    }
    if (null == this.fstrAddedWho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAddedWho);
    }
    if (null == this.fdtmAddedWhen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmAddedWhen.getTime());
    __dataOut.writeInt(this.fdtmAddedWhen.getNanos());
    }
    if (null == this.FBLNREVERSED) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FBLNREVERSED);
    }
    if (null == this.fstrReversedWho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrReversedWho);
    }
    if (null == this.fdtmReversedWhen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReversedWhen.getTime());
    __dataOut.writeInt(this.fdtmReversedWhen.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGTRANSKEYSOURCE==null?"\\N":"" + FLNGTRANSKEYSOURCE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGTRANSKEYTARGET==null?"\\N":"" + FLNGTRANSKEYTARGET, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGACCOUNTKEYSOURCE==null?"\\N":"" + FLNGACCOUNTKEYSOURCE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGACCOUNTKEYTARGET==null?"\\N":"" + FLNGACCOUNTKEYTARGET, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMFILINGPERIODSOURCEFROM==null?"\\N":"" + FDTMFILINGPERIODSOURCEFROM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMFILINGPERIODSOURCETO==null?"\\N":"" + FDTMFILINGPERIODSOURCETO, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMFILINGPERIODTARGET==null?"\\N":"" + FDTMFILINGPERIODTARGET, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngBillItemKeyTarget==null?"\\N":"" + flngBillItemKeyTarget, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FCURAMOUNTTRANSFER==null?"\\N":FCURAMOUNTTRANSFER.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRTRANSFERTYPE==null?"\\N":FSTRTRANSFERTYPE, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngSourceCrmKey==null?"\\N":"" + flngSourceCrmKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngTargetCrmKey==null?"\\N":"" + flngTargetCrmKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEffect==null?"\\N":"" + fdtmEffect, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAddedWho==null?"\\N":fstrAddedWho, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmAddedWhen==null?"\\N":"" + fdtmAddedWhen, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FBLNREVERSED==null?"\\N":"" + FBLNREVERSED, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrReversedWho==null?"\\N":fstrReversedWho, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReversedWhen==null?"\\N":"" + fdtmReversedWhen, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGTRANSKEYSOURCE==null?"\\N":"" + FLNGTRANSKEYSOURCE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGTRANSKEYTARGET==null?"\\N":"" + FLNGTRANSKEYTARGET, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGACCOUNTKEYSOURCE==null?"\\N":"" + FLNGACCOUNTKEYSOURCE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGACCOUNTKEYTARGET==null?"\\N":"" + FLNGACCOUNTKEYTARGET, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMFILINGPERIODSOURCEFROM==null?"\\N":"" + FDTMFILINGPERIODSOURCEFROM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMFILINGPERIODSOURCETO==null?"\\N":"" + FDTMFILINGPERIODSOURCETO, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMFILINGPERIODTARGET==null?"\\N":"" + FDTMFILINGPERIODTARGET, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngBillItemKeyTarget==null?"\\N":"" + flngBillItemKeyTarget, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FCURAMOUNTTRANSFER==null?"\\N":FCURAMOUNTTRANSFER.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRTRANSFERTYPE==null?"\\N":FSTRTRANSFERTYPE, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngSourceCrmKey==null?"\\N":"" + flngSourceCrmKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngTargetCrmKey==null?"\\N":"" + flngTargetCrmKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEffect==null?"\\N":"" + fdtmEffect, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAddedWho==null?"\\N":fstrAddedWho, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmAddedWhen==null?"\\N":"" + fdtmAddedWhen, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FBLNREVERSED==null?"\\N":"" + FBLNREVERSED, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrReversedWho==null?"\\N":fstrReversedWho, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReversedWhen==null?"\\N":"" + fdtmReversedWhen, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGTRANSKEYSOURCE = null; } else {
      this.FLNGTRANSKEYSOURCE = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGTRANSKEYTARGET = null; } else {
      this.FLNGTRANSKEYTARGET = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGACCOUNTKEYSOURCE = null; } else {
      this.FLNGACCOUNTKEYSOURCE = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGACCOUNTKEYTARGET = null; } else {
      this.FLNGACCOUNTKEYTARGET = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMFILINGPERIODSOURCEFROM = null; } else {
      this.FDTMFILINGPERIODSOURCEFROM = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMFILINGPERIODSOURCETO = null; } else {
      this.FDTMFILINGPERIODSOURCETO = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMFILINGPERIODTARGET = null; } else {
      this.FDTMFILINGPERIODTARGET = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngBillItemKeyTarget = null; } else {
      this.flngBillItemKeyTarget = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FCURAMOUNTTRANSFER = null; } else {
      this.FCURAMOUNTTRANSFER = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRTRANSFERTYPE = null; } else {
      this.FSTRTRANSFERTYPE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngSourceCrmKey = null; } else {
      this.flngSourceCrmKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTargetCrmKey = null; } else {
      this.flngTargetCrmKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmEffect = null; } else {
      this.fdtmEffect = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAddedWho = null; } else {
      this.fstrAddedWho = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmAddedWhen = null; } else {
      this.fdtmAddedWhen = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FBLNREVERSED = null; } else {
      this.FBLNREVERSED = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrReversedWho = null; } else {
      this.fstrReversedWho = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReversedWhen = null; } else {
      this.fdtmReversedWhen = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGTRANSKEYSOURCE = null; } else {
      this.FLNGTRANSKEYSOURCE = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGTRANSKEYTARGET = null; } else {
      this.FLNGTRANSKEYTARGET = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGACCOUNTKEYSOURCE = null; } else {
      this.FLNGACCOUNTKEYSOURCE = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGACCOUNTKEYTARGET = null; } else {
      this.FLNGACCOUNTKEYTARGET = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMFILINGPERIODSOURCEFROM = null; } else {
      this.FDTMFILINGPERIODSOURCEFROM = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMFILINGPERIODSOURCETO = null; } else {
      this.FDTMFILINGPERIODSOURCETO = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMFILINGPERIODTARGET = null; } else {
      this.FDTMFILINGPERIODTARGET = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngBillItemKeyTarget = null; } else {
      this.flngBillItemKeyTarget = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FCURAMOUNTTRANSFER = null; } else {
      this.FCURAMOUNTTRANSFER = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRTRANSFERTYPE = null; } else {
      this.FSTRTRANSFERTYPE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngSourceCrmKey = null; } else {
      this.flngSourceCrmKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTargetCrmKey = null; } else {
      this.flngTargetCrmKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmEffect = null; } else {
      this.fdtmEffect = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAddedWho = null; } else {
      this.fstrAddedWho = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmAddedWhen = null; } else {
      this.fdtmAddedWhen = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FBLNREVERSED = null; } else {
      this.FBLNREVERSED = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrReversedWho = null; } else {
      this.fstrReversedWho = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReversedWhen = null; } else {
      this.fdtmReversedWhen = java.sql.Timestamp.valueOf(__cur_str);
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
    tblcrossaccttransfer o = (tblcrossaccttransfer) super.clone();
    o.FDTMFILINGPERIODSOURCEFROM = (o.FDTMFILINGPERIODSOURCEFROM != null) ? (java.sql.Timestamp) o.FDTMFILINGPERIODSOURCEFROM.clone() : null;
    o.FDTMFILINGPERIODSOURCETO = (o.FDTMFILINGPERIODSOURCETO != null) ? (java.sql.Timestamp) o.FDTMFILINGPERIODSOURCETO.clone() : null;
    o.FDTMFILINGPERIODTARGET = (o.FDTMFILINGPERIODTARGET != null) ? (java.sql.Timestamp) o.FDTMFILINGPERIODTARGET.clone() : null;
    o.fdtmEffect = (o.fdtmEffect != null) ? (java.sql.Timestamp) o.fdtmEffect.clone() : null;
    o.fdtmAddedWhen = (o.fdtmAddedWhen != null) ? (java.sql.Timestamp) o.fdtmAddedWhen.clone() : null;
    o.fdtmReversedWhen = (o.fdtmReversedWhen != null) ? (java.sql.Timestamp) o.fdtmReversedWhen.clone() : null;
    o.FDTMWHEN = (o.FDTMWHEN != null) ? (java.sql.Timestamp) o.FDTMWHEN.clone() : null;
    return o;
  }

  public void clone0(tblcrossaccttransfer o) throws CloneNotSupportedException {
    o.FDTMFILINGPERIODSOURCEFROM = (o.FDTMFILINGPERIODSOURCEFROM != null) ? (java.sql.Timestamp) o.FDTMFILINGPERIODSOURCEFROM.clone() : null;
    o.FDTMFILINGPERIODSOURCETO = (o.FDTMFILINGPERIODSOURCETO != null) ? (java.sql.Timestamp) o.FDTMFILINGPERIODSOURCETO.clone() : null;
    o.FDTMFILINGPERIODTARGET = (o.FDTMFILINGPERIODTARGET != null) ? (java.sql.Timestamp) o.FDTMFILINGPERIODTARGET.clone() : null;
    o.fdtmEffect = (o.fdtmEffect != null) ? (java.sql.Timestamp) o.fdtmEffect.clone() : null;
    o.fdtmAddedWhen = (o.fdtmAddedWhen != null) ? (java.sql.Timestamp) o.fdtmAddedWhen.clone() : null;
    o.fdtmReversedWhen = (o.fdtmReversedWhen != null) ? (java.sql.Timestamp) o.fdtmReversedWhen.clone() : null;
    o.FDTMWHEN = (o.FDTMWHEN != null) ? (java.sql.Timestamp) o.FDTMWHEN.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("FLNGCREDITTRANSFERKEY", this.FLNGCREDITTRANSFERKEY);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("FLNGTRANSKEYSOURCE", this.FLNGTRANSKEYSOURCE);
    __sqoop$field_map.put("FLNGTRANSKEYTARGET", this.FLNGTRANSKEYTARGET);
    __sqoop$field_map.put("FLNGACCOUNTKEYSOURCE", this.FLNGACCOUNTKEYSOURCE);
    __sqoop$field_map.put("FLNGACCOUNTKEYTARGET", this.FLNGACCOUNTKEYTARGET);
    __sqoop$field_map.put("FDTMFILINGPERIODSOURCEFROM", this.FDTMFILINGPERIODSOURCEFROM);
    __sqoop$field_map.put("FDTMFILINGPERIODSOURCETO", this.FDTMFILINGPERIODSOURCETO);
    __sqoop$field_map.put("FDTMFILINGPERIODTARGET", this.FDTMFILINGPERIODTARGET);
    __sqoop$field_map.put("flngBillItemKeyTarget", this.flngBillItemKeyTarget);
    __sqoop$field_map.put("FCURAMOUNTTRANSFER", this.FCURAMOUNTTRANSFER);
    __sqoop$field_map.put("FSTRTRANSFERTYPE", this.FSTRTRANSFERTYPE);
    __sqoop$field_map.put("flngSourceCrmKey", this.flngSourceCrmKey);
    __sqoop$field_map.put("flngTargetCrmKey", this.flngTargetCrmKey);
    __sqoop$field_map.put("fdtmEffect", this.fdtmEffect);
    __sqoop$field_map.put("fstrAddedWho", this.fstrAddedWho);
    __sqoop$field_map.put("fdtmAddedWhen", this.fdtmAddedWhen);
    __sqoop$field_map.put("FBLNREVERSED", this.FBLNREVERSED);
    __sqoop$field_map.put("fstrReversedWho", this.fstrReversedWho);
    __sqoop$field_map.put("fdtmReversedWhen", this.fdtmReversedWhen);
    __sqoop$field_map.put("FSTRWHO", this.FSTRWHO);
    __sqoop$field_map.put("FDTMWHEN", this.FDTMWHEN);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("FLNGCREDITTRANSFERKEY", this.FLNGCREDITTRANSFERKEY);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("FLNGTRANSKEYSOURCE", this.FLNGTRANSKEYSOURCE);
    __sqoop$field_map.put("FLNGTRANSKEYTARGET", this.FLNGTRANSKEYTARGET);
    __sqoop$field_map.put("FLNGACCOUNTKEYSOURCE", this.FLNGACCOUNTKEYSOURCE);
    __sqoop$field_map.put("FLNGACCOUNTKEYTARGET", this.FLNGACCOUNTKEYTARGET);
    __sqoop$field_map.put("FDTMFILINGPERIODSOURCEFROM", this.FDTMFILINGPERIODSOURCEFROM);
    __sqoop$field_map.put("FDTMFILINGPERIODSOURCETO", this.FDTMFILINGPERIODSOURCETO);
    __sqoop$field_map.put("FDTMFILINGPERIODTARGET", this.FDTMFILINGPERIODTARGET);
    __sqoop$field_map.put("flngBillItemKeyTarget", this.flngBillItemKeyTarget);
    __sqoop$field_map.put("FCURAMOUNTTRANSFER", this.FCURAMOUNTTRANSFER);
    __sqoop$field_map.put("FSTRTRANSFERTYPE", this.FSTRTRANSFERTYPE);
    __sqoop$field_map.put("flngSourceCrmKey", this.flngSourceCrmKey);
    __sqoop$field_map.put("flngTargetCrmKey", this.flngTargetCrmKey);
    __sqoop$field_map.put("fdtmEffect", this.fdtmEffect);
    __sqoop$field_map.put("fstrAddedWho", this.fstrAddedWho);
    __sqoop$field_map.put("fdtmAddedWhen", this.fdtmAddedWhen);
    __sqoop$field_map.put("FBLNREVERSED", this.FBLNREVERSED);
    __sqoop$field_map.put("fstrReversedWho", this.fstrReversedWho);
    __sqoop$field_map.put("fdtmReversedWhen", this.fdtmReversedWhen);
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
