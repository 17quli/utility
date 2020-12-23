// ORM class for table 'tbltransoffsetdetail'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 05:04:58 NZDT 2020
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

public class tbltransoffsetdetail extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngOffsetKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransoffsetdetail.this.flngOffsetKey = (Integer)value;
      }
    });
    setters.put("fintSeq", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransoffsetdetail.this.fintSeq = (Integer)value;
      }
    });
    setters.put("FLNGVER", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransoffsetdetail.this.FLNGVER = (Integer)value;
      }
    });
    setters.put("FLNGVERLAST", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransoffsetdetail.this.FLNGVERLAST = (Integer)value;
      }
    });
    setters.put("FLNGACCOUNTKEY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransoffsetdetail.this.FLNGACCOUNTKEY = (Integer)value;
      }
    });
    setters.put("FLNGCREDITTRANSKEY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransoffsetdetail.this.FLNGCREDITTRANSKEY = (Integer)value;
      }
    });
    setters.put("flngCreditBillItemKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransoffsetdetail.this.flngCreditBillItemKey = (Integer)value;
      }
    });
    setters.put("fcurCreditAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransoffsetdetail.this.fcurCreditAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrCreditTransType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransoffsetdetail.this.fstrCreditTransType = (String)value;
      }
    });
    setters.put("fstrCreditImpact", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransoffsetdetail.this.fstrCreditImpact = (String)value;
      }
    });
    setters.put("fdtmCreditPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransoffsetdetail.this.fdtmCreditPeriod = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmCreditEffect", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransoffsetdetail.this.fdtmCreditEffect = (java.sql.Timestamp)value;
      }
    });
    setters.put("FLNGDEBITTRANSKEY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransoffsetdetail.this.FLNGDEBITTRANSKEY = (Integer)value;
      }
    });
    setters.put("flngDebitBillItemKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransoffsetdetail.this.flngDebitBillItemKey = (Integer)value;
      }
    });
    setters.put("fcurDebitAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransoffsetdetail.this.fcurDebitAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrDebitTransType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransoffsetdetail.this.fstrDebitTransType = (String)value;
      }
    });
    setters.put("fstrDebitImpact", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransoffsetdetail.this.fstrDebitImpact = (String)value;
      }
    });
    setters.put("fdtmDebitPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransoffsetdetail.this.fdtmDebitPeriod = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmDebitEffect", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransoffsetdetail.this.fdtmDebitEffect = (java.sql.Timestamp)value;
      }
    });
    setters.put("FCURAMOUNT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransoffsetdetail.this.FCURAMOUNT = (java.math.BigDecimal)value;
      }
    });
    setters.put("FDTMEFFECTIVE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransoffsetdetail.this.FDTMEFFECTIVE = (java.sql.Timestamp)value;
      }
    });
    setters.put("FBLNMANUALOFFSET", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransoffsetdetail.this.FBLNMANUALOFFSET = (Integer)value;
      }
    });
    setters.put("fblnTransReversed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransoffsetdetail.this.fblnTransReversed = (Integer)value;
      }
    });
    setters.put("fblnOffsetReversed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransoffsetdetail.this.fblnOffsetReversed = (Integer)value;
      }
    });
    setters.put("fcurDebitBalanceDelta", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransoffsetdetail.this.fcurDebitBalanceDelta = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDebitBalance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransoffsetdetail.this.fcurDebitBalance = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurCreditBalanceDelta", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransoffsetdetail.this.fcurCreditBalanceDelta = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurCreditBalance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransoffsetdetail.this.fcurCreditBalance = (java.math.BigDecimal)value;
      }
    });
    setters.put("fdtmProcess", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransoffsetdetail.this.fdtmProcess = (java.sql.Timestamp)value;
      }
    });
    setters.put("FSTRWHO", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransoffsetdetail.this.FSTRWHO = (String)value;
      }
    });
    setters.put("FDTMWHEN", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransoffsetdetail.this.FDTMWHEN = (java.sql.Timestamp)value;
      }
    });
  }
  public tbltransoffsetdetail() {
    init0();
  }
  private Integer flngOffsetKey;
  public Integer get_flngOffsetKey() {
    return flngOffsetKey;
  }
  public void set_flngOffsetKey(Integer flngOffsetKey) {
    this.flngOffsetKey = flngOffsetKey;
  }
  public tbltransoffsetdetail with_flngOffsetKey(Integer flngOffsetKey) {
    this.flngOffsetKey = flngOffsetKey;
    return this;
  }
  private Integer fintSeq;
  public Integer get_fintSeq() {
    return fintSeq;
  }
  public void set_fintSeq(Integer fintSeq) {
    this.fintSeq = fintSeq;
  }
  public tbltransoffsetdetail with_fintSeq(Integer fintSeq) {
    this.fintSeq = fintSeq;
    return this;
  }
  private Integer FLNGVER;
  public Integer get_FLNGVER() {
    return FLNGVER;
  }
  public void set_FLNGVER(Integer FLNGVER) {
    this.FLNGVER = FLNGVER;
  }
  public tbltransoffsetdetail with_FLNGVER(Integer FLNGVER) {
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
  public tbltransoffsetdetail with_FLNGVERLAST(Integer FLNGVERLAST) {
    this.FLNGVERLAST = FLNGVERLAST;
    return this;
  }
  private Integer FLNGACCOUNTKEY;
  public Integer get_FLNGACCOUNTKEY() {
    return FLNGACCOUNTKEY;
  }
  public void set_FLNGACCOUNTKEY(Integer FLNGACCOUNTKEY) {
    this.FLNGACCOUNTKEY = FLNGACCOUNTKEY;
  }
  public tbltransoffsetdetail with_FLNGACCOUNTKEY(Integer FLNGACCOUNTKEY) {
    this.FLNGACCOUNTKEY = FLNGACCOUNTKEY;
    return this;
  }
  private Integer FLNGCREDITTRANSKEY;
  public Integer get_FLNGCREDITTRANSKEY() {
    return FLNGCREDITTRANSKEY;
  }
  public void set_FLNGCREDITTRANSKEY(Integer FLNGCREDITTRANSKEY) {
    this.FLNGCREDITTRANSKEY = FLNGCREDITTRANSKEY;
  }
  public tbltransoffsetdetail with_FLNGCREDITTRANSKEY(Integer FLNGCREDITTRANSKEY) {
    this.FLNGCREDITTRANSKEY = FLNGCREDITTRANSKEY;
    return this;
  }
  private Integer flngCreditBillItemKey;
  public Integer get_flngCreditBillItemKey() {
    return flngCreditBillItemKey;
  }
  public void set_flngCreditBillItemKey(Integer flngCreditBillItemKey) {
    this.flngCreditBillItemKey = flngCreditBillItemKey;
  }
  public tbltransoffsetdetail with_flngCreditBillItemKey(Integer flngCreditBillItemKey) {
    this.flngCreditBillItemKey = flngCreditBillItemKey;
    return this;
  }
  private java.math.BigDecimal fcurCreditAmount;
  public java.math.BigDecimal get_fcurCreditAmount() {
    return fcurCreditAmount;
  }
  public void set_fcurCreditAmount(java.math.BigDecimal fcurCreditAmount) {
    this.fcurCreditAmount = fcurCreditAmount;
  }
  public tbltransoffsetdetail with_fcurCreditAmount(java.math.BigDecimal fcurCreditAmount) {
    this.fcurCreditAmount = fcurCreditAmount;
    return this;
  }
  private String fstrCreditTransType;
  public String get_fstrCreditTransType() {
    return fstrCreditTransType;
  }
  public void set_fstrCreditTransType(String fstrCreditTransType) {
    this.fstrCreditTransType = fstrCreditTransType;
  }
  public tbltransoffsetdetail with_fstrCreditTransType(String fstrCreditTransType) {
    this.fstrCreditTransType = fstrCreditTransType;
    return this;
  }
  private String fstrCreditImpact;
  public String get_fstrCreditImpact() {
    return fstrCreditImpact;
  }
  public void set_fstrCreditImpact(String fstrCreditImpact) {
    this.fstrCreditImpact = fstrCreditImpact;
  }
  public tbltransoffsetdetail with_fstrCreditImpact(String fstrCreditImpact) {
    this.fstrCreditImpact = fstrCreditImpact;
    return this;
  }
  private java.sql.Timestamp fdtmCreditPeriod;
  public java.sql.Timestamp get_fdtmCreditPeriod() {
    return fdtmCreditPeriod;
  }
  public void set_fdtmCreditPeriod(java.sql.Timestamp fdtmCreditPeriod) {
    this.fdtmCreditPeriod = fdtmCreditPeriod;
  }
  public tbltransoffsetdetail with_fdtmCreditPeriod(java.sql.Timestamp fdtmCreditPeriod) {
    this.fdtmCreditPeriod = fdtmCreditPeriod;
    return this;
  }
  private java.sql.Timestamp fdtmCreditEffect;
  public java.sql.Timestamp get_fdtmCreditEffect() {
    return fdtmCreditEffect;
  }
  public void set_fdtmCreditEffect(java.sql.Timestamp fdtmCreditEffect) {
    this.fdtmCreditEffect = fdtmCreditEffect;
  }
  public tbltransoffsetdetail with_fdtmCreditEffect(java.sql.Timestamp fdtmCreditEffect) {
    this.fdtmCreditEffect = fdtmCreditEffect;
    return this;
  }
  private Integer FLNGDEBITTRANSKEY;
  public Integer get_FLNGDEBITTRANSKEY() {
    return FLNGDEBITTRANSKEY;
  }
  public void set_FLNGDEBITTRANSKEY(Integer FLNGDEBITTRANSKEY) {
    this.FLNGDEBITTRANSKEY = FLNGDEBITTRANSKEY;
  }
  public tbltransoffsetdetail with_FLNGDEBITTRANSKEY(Integer FLNGDEBITTRANSKEY) {
    this.FLNGDEBITTRANSKEY = FLNGDEBITTRANSKEY;
    return this;
  }
  private Integer flngDebitBillItemKey;
  public Integer get_flngDebitBillItemKey() {
    return flngDebitBillItemKey;
  }
  public void set_flngDebitBillItemKey(Integer flngDebitBillItemKey) {
    this.flngDebitBillItemKey = flngDebitBillItemKey;
  }
  public tbltransoffsetdetail with_flngDebitBillItemKey(Integer flngDebitBillItemKey) {
    this.flngDebitBillItemKey = flngDebitBillItemKey;
    return this;
  }
  private java.math.BigDecimal fcurDebitAmount;
  public java.math.BigDecimal get_fcurDebitAmount() {
    return fcurDebitAmount;
  }
  public void set_fcurDebitAmount(java.math.BigDecimal fcurDebitAmount) {
    this.fcurDebitAmount = fcurDebitAmount;
  }
  public tbltransoffsetdetail with_fcurDebitAmount(java.math.BigDecimal fcurDebitAmount) {
    this.fcurDebitAmount = fcurDebitAmount;
    return this;
  }
  private String fstrDebitTransType;
  public String get_fstrDebitTransType() {
    return fstrDebitTransType;
  }
  public void set_fstrDebitTransType(String fstrDebitTransType) {
    this.fstrDebitTransType = fstrDebitTransType;
  }
  public tbltransoffsetdetail with_fstrDebitTransType(String fstrDebitTransType) {
    this.fstrDebitTransType = fstrDebitTransType;
    return this;
  }
  private String fstrDebitImpact;
  public String get_fstrDebitImpact() {
    return fstrDebitImpact;
  }
  public void set_fstrDebitImpact(String fstrDebitImpact) {
    this.fstrDebitImpact = fstrDebitImpact;
  }
  public tbltransoffsetdetail with_fstrDebitImpact(String fstrDebitImpact) {
    this.fstrDebitImpact = fstrDebitImpact;
    return this;
  }
  private java.sql.Timestamp fdtmDebitPeriod;
  public java.sql.Timestamp get_fdtmDebitPeriod() {
    return fdtmDebitPeriod;
  }
  public void set_fdtmDebitPeriod(java.sql.Timestamp fdtmDebitPeriod) {
    this.fdtmDebitPeriod = fdtmDebitPeriod;
  }
  public tbltransoffsetdetail with_fdtmDebitPeriod(java.sql.Timestamp fdtmDebitPeriod) {
    this.fdtmDebitPeriod = fdtmDebitPeriod;
    return this;
  }
  private java.sql.Timestamp fdtmDebitEffect;
  public java.sql.Timestamp get_fdtmDebitEffect() {
    return fdtmDebitEffect;
  }
  public void set_fdtmDebitEffect(java.sql.Timestamp fdtmDebitEffect) {
    this.fdtmDebitEffect = fdtmDebitEffect;
  }
  public tbltransoffsetdetail with_fdtmDebitEffect(java.sql.Timestamp fdtmDebitEffect) {
    this.fdtmDebitEffect = fdtmDebitEffect;
    return this;
  }
  private java.math.BigDecimal FCURAMOUNT;
  public java.math.BigDecimal get_FCURAMOUNT() {
    return FCURAMOUNT;
  }
  public void set_FCURAMOUNT(java.math.BigDecimal FCURAMOUNT) {
    this.FCURAMOUNT = FCURAMOUNT;
  }
  public tbltransoffsetdetail with_FCURAMOUNT(java.math.BigDecimal FCURAMOUNT) {
    this.FCURAMOUNT = FCURAMOUNT;
    return this;
  }
  private java.sql.Timestamp FDTMEFFECTIVE;
  public java.sql.Timestamp get_FDTMEFFECTIVE() {
    return FDTMEFFECTIVE;
  }
  public void set_FDTMEFFECTIVE(java.sql.Timestamp FDTMEFFECTIVE) {
    this.FDTMEFFECTIVE = FDTMEFFECTIVE;
  }
  public tbltransoffsetdetail with_FDTMEFFECTIVE(java.sql.Timestamp FDTMEFFECTIVE) {
    this.FDTMEFFECTIVE = FDTMEFFECTIVE;
    return this;
  }
  private Integer FBLNMANUALOFFSET;
  public Integer get_FBLNMANUALOFFSET() {
    return FBLNMANUALOFFSET;
  }
  public void set_FBLNMANUALOFFSET(Integer FBLNMANUALOFFSET) {
    this.FBLNMANUALOFFSET = FBLNMANUALOFFSET;
  }
  public tbltransoffsetdetail with_FBLNMANUALOFFSET(Integer FBLNMANUALOFFSET) {
    this.FBLNMANUALOFFSET = FBLNMANUALOFFSET;
    return this;
  }
  private Integer fblnTransReversed;
  public Integer get_fblnTransReversed() {
    return fblnTransReversed;
  }
  public void set_fblnTransReversed(Integer fblnTransReversed) {
    this.fblnTransReversed = fblnTransReversed;
  }
  public tbltransoffsetdetail with_fblnTransReversed(Integer fblnTransReversed) {
    this.fblnTransReversed = fblnTransReversed;
    return this;
  }
  private Integer fblnOffsetReversed;
  public Integer get_fblnOffsetReversed() {
    return fblnOffsetReversed;
  }
  public void set_fblnOffsetReversed(Integer fblnOffsetReversed) {
    this.fblnOffsetReversed = fblnOffsetReversed;
  }
  public tbltransoffsetdetail with_fblnOffsetReversed(Integer fblnOffsetReversed) {
    this.fblnOffsetReversed = fblnOffsetReversed;
    return this;
  }
  private java.math.BigDecimal fcurDebitBalanceDelta;
  public java.math.BigDecimal get_fcurDebitBalanceDelta() {
    return fcurDebitBalanceDelta;
  }
  public void set_fcurDebitBalanceDelta(java.math.BigDecimal fcurDebitBalanceDelta) {
    this.fcurDebitBalanceDelta = fcurDebitBalanceDelta;
  }
  public tbltransoffsetdetail with_fcurDebitBalanceDelta(java.math.BigDecimal fcurDebitBalanceDelta) {
    this.fcurDebitBalanceDelta = fcurDebitBalanceDelta;
    return this;
  }
  private java.math.BigDecimal fcurDebitBalance;
  public java.math.BigDecimal get_fcurDebitBalance() {
    return fcurDebitBalance;
  }
  public void set_fcurDebitBalance(java.math.BigDecimal fcurDebitBalance) {
    this.fcurDebitBalance = fcurDebitBalance;
  }
  public tbltransoffsetdetail with_fcurDebitBalance(java.math.BigDecimal fcurDebitBalance) {
    this.fcurDebitBalance = fcurDebitBalance;
    return this;
  }
  private java.math.BigDecimal fcurCreditBalanceDelta;
  public java.math.BigDecimal get_fcurCreditBalanceDelta() {
    return fcurCreditBalanceDelta;
  }
  public void set_fcurCreditBalanceDelta(java.math.BigDecimal fcurCreditBalanceDelta) {
    this.fcurCreditBalanceDelta = fcurCreditBalanceDelta;
  }
  public tbltransoffsetdetail with_fcurCreditBalanceDelta(java.math.BigDecimal fcurCreditBalanceDelta) {
    this.fcurCreditBalanceDelta = fcurCreditBalanceDelta;
    return this;
  }
  private java.math.BigDecimal fcurCreditBalance;
  public java.math.BigDecimal get_fcurCreditBalance() {
    return fcurCreditBalance;
  }
  public void set_fcurCreditBalance(java.math.BigDecimal fcurCreditBalance) {
    this.fcurCreditBalance = fcurCreditBalance;
  }
  public tbltransoffsetdetail with_fcurCreditBalance(java.math.BigDecimal fcurCreditBalance) {
    this.fcurCreditBalance = fcurCreditBalance;
    return this;
  }
  private java.sql.Timestamp fdtmProcess;
  public java.sql.Timestamp get_fdtmProcess() {
    return fdtmProcess;
  }
  public void set_fdtmProcess(java.sql.Timestamp fdtmProcess) {
    this.fdtmProcess = fdtmProcess;
  }
  public tbltransoffsetdetail with_fdtmProcess(java.sql.Timestamp fdtmProcess) {
    this.fdtmProcess = fdtmProcess;
    return this;
  }
  private String FSTRWHO;
  public String get_FSTRWHO() {
    return FSTRWHO;
  }
  public void set_FSTRWHO(String FSTRWHO) {
    this.FSTRWHO = FSTRWHO;
  }
  public tbltransoffsetdetail with_FSTRWHO(String FSTRWHO) {
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
  public tbltransoffsetdetail with_FDTMWHEN(java.sql.Timestamp FDTMWHEN) {
    this.FDTMWHEN = FDTMWHEN;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tbltransoffsetdetail)) {
      return false;
    }
    tbltransoffsetdetail that = (tbltransoffsetdetail) o;
    boolean equal = true;
    equal = equal && (this.flngOffsetKey == null ? that.flngOffsetKey == null : this.flngOffsetKey.equals(that.flngOffsetKey));
    equal = equal && (this.fintSeq == null ? that.fintSeq == null : this.fintSeq.equals(that.fintSeq));
    equal = equal && (this.FLNGVER == null ? that.FLNGVER == null : this.FLNGVER.equals(that.FLNGVER));
    equal = equal && (this.FLNGVERLAST == null ? that.FLNGVERLAST == null : this.FLNGVERLAST.equals(that.FLNGVERLAST));
    equal = equal && (this.FLNGACCOUNTKEY == null ? that.FLNGACCOUNTKEY == null : this.FLNGACCOUNTKEY.equals(that.FLNGACCOUNTKEY));
    equal = equal && (this.FLNGCREDITTRANSKEY == null ? that.FLNGCREDITTRANSKEY == null : this.FLNGCREDITTRANSKEY.equals(that.FLNGCREDITTRANSKEY));
    equal = equal && (this.flngCreditBillItemKey == null ? that.flngCreditBillItemKey == null : this.flngCreditBillItemKey.equals(that.flngCreditBillItemKey));
    equal = equal && (this.fcurCreditAmount == null ? that.fcurCreditAmount == null : this.fcurCreditAmount.equals(that.fcurCreditAmount));
    equal = equal && (this.fstrCreditTransType == null ? that.fstrCreditTransType == null : this.fstrCreditTransType.equals(that.fstrCreditTransType));
    equal = equal && (this.fstrCreditImpact == null ? that.fstrCreditImpact == null : this.fstrCreditImpact.equals(that.fstrCreditImpact));
    equal = equal && (this.fdtmCreditPeriod == null ? that.fdtmCreditPeriod == null : this.fdtmCreditPeriod.equals(that.fdtmCreditPeriod));
    equal = equal && (this.fdtmCreditEffect == null ? that.fdtmCreditEffect == null : this.fdtmCreditEffect.equals(that.fdtmCreditEffect));
    equal = equal && (this.FLNGDEBITTRANSKEY == null ? that.FLNGDEBITTRANSKEY == null : this.FLNGDEBITTRANSKEY.equals(that.FLNGDEBITTRANSKEY));
    equal = equal && (this.flngDebitBillItemKey == null ? that.flngDebitBillItemKey == null : this.flngDebitBillItemKey.equals(that.flngDebitBillItemKey));
    equal = equal && (this.fcurDebitAmount == null ? that.fcurDebitAmount == null : this.fcurDebitAmount.equals(that.fcurDebitAmount));
    equal = equal && (this.fstrDebitTransType == null ? that.fstrDebitTransType == null : this.fstrDebitTransType.equals(that.fstrDebitTransType));
    equal = equal && (this.fstrDebitImpact == null ? that.fstrDebitImpact == null : this.fstrDebitImpact.equals(that.fstrDebitImpact));
    equal = equal && (this.fdtmDebitPeriod == null ? that.fdtmDebitPeriod == null : this.fdtmDebitPeriod.equals(that.fdtmDebitPeriod));
    equal = equal && (this.fdtmDebitEffect == null ? that.fdtmDebitEffect == null : this.fdtmDebitEffect.equals(that.fdtmDebitEffect));
    equal = equal && (this.FCURAMOUNT == null ? that.FCURAMOUNT == null : this.FCURAMOUNT.equals(that.FCURAMOUNT));
    equal = equal && (this.FDTMEFFECTIVE == null ? that.FDTMEFFECTIVE == null : this.FDTMEFFECTIVE.equals(that.FDTMEFFECTIVE));
    equal = equal && (this.FBLNMANUALOFFSET == null ? that.FBLNMANUALOFFSET == null : this.FBLNMANUALOFFSET.equals(that.FBLNMANUALOFFSET));
    equal = equal && (this.fblnTransReversed == null ? that.fblnTransReversed == null : this.fblnTransReversed.equals(that.fblnTransReversed));
    equal = equal && (this.fblnOffsetReversed == null ? that.fblnOffsetReversed == null : this.fblnOffsetReversed.equals(that.fblnOffsetReversed));
    equal = equal && (this.fcurDebitBalanceDelta == null ? that.fcurDebitBalanceDelta == null : this.fcurDebitBalanceDelta.equals(that.fcurDebitBalanceDelta));
    equal = equal && (this.fcurDebitBalance == null ? that.fcurDebitBalance == null : this.fcurDebitBalance.equals(that.fcurDebitBalance));
    equal = equal && (this.fcurCreditBalanceDelta == null ? that.fcurCreditBalanceDelta == null : this.fcurCreditBalanceDelta.equals(that.fcurCreditBalanceDelta));
    equal = equal && (this.fcurCreditBalance == null ? that.fcurCreditBalance == null : this.fcurCreditBalance.equals(that.fcurCreditBalance));
    equal = equal && (this.fdtmProcess == null ? that.fdtmProcess == null : this.fdtmProcess.equals(that.fdtmProcess));
    equal = equal && (this.FSTRWHO == null ? that.FSTRWHO == null : this.FSTRWHO.equals(that.FSTRWHO));
    equal = equal && (this.FDTMWHEN == null ? that.FDTMWHEN == null : this.FDTMWHEN.equals(that.FDTMWHEN));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tbltransoffsetdetail)) {
      return false;
    }
    tbltransoffsetdetail that = (tbltransoffsetdetail) o;
    boolean equal = true;
    equal = equal && (this.flngOffsetKey == null ? that.flngOffsetKey == null : this.flngOffsetKey.equals(that.flngOffsetKey));
    equal = equal && (this.fintSeq == null ? that.fintSeq == null : this.fintSeq.equals(that.fintSeq));
    equal = equal && (this.FLNGVER == null ? that.FLNGVER == null : this.FLNGVER.equals(that.FLNGVER));
    equal = equal && (this.FLNGVERLAST == null ? that.FLNGVERLAST == null : this.FLNGVERLAST.equals(that.FLNGVERLAST));
    equal = equal && (this.FLNGACCOUNTKEY == null ? that.FLNGACCOUNTKEY == null : this.FLNGACCOUNTKEY.equals(that.FLNGACCOUNTKEY));
    equal = equal && (this.FLNGCREDITTRANSKEY == null ? that.FLNGCREDITTRANSKEY == null : this.FLNGCREDITTRANSKEY.equals(that.FLNGCREDITTRANSKEY));
    equal = equal && (this.flngCreditBillItemKey == null ? that.flngCreditBillItemKey == null : this.flngCreditBillItemKey.equals(that.flngCreditBillItemKey));
    equal = equal && (this.fcurCreditAmount == null ? that.fcurCreditAmount == null : this.fcurCreditAmount.equals(that.fcurCreditAmount));
    equal = equal && (this.fstrCreditTransType == null ? that.fstrCreditTransType == null : this.fstrCreditTransType.equals(that.fstrCreditTransType));
    equal = equal && (this.fstrCreditImpact == null ? that.fstrCreditImpact == null : this.fstrCreditImpact.equals(that.fstrCreditImpact));
    equal = equal && (this.fdtmCreditPeriod == null ? that.fdtmCreditPeriod == null : this.fdtmCreditPeriod.equals(that.fdtmCreditPeriod));
    equal = equal && (this.fdtmCreditEffect == null ? that.fdtmCreditEffect == null : this.fdtmCreditEffect.equals(that.fdtmCreditEffect));
    equal = equal && (this.FLNGDEBITTRANSKEY == null ? that.FLNGDEBITTRANSKEY == null : this.FLNGDEBITTRANSKEY.equals(that.FLNGDEBITTRANSKEY));
    equal = equal && (this.flngDebitBillItemKey == null ? that.flngDebitBillItemKey == null : this.flngDebitBillItemKey.equals(that.flngDebitBillItemKey));
    equal = equal && (this.fcurDebitAmount == null ? that.fcurDebitAmount == null : this.fcurDebitAmount.equals(that.fcurDebitAmount));
    equal = equal && (this.fstrDebitTransType == null ? that.fstrDebitTransType == null : this.fstrDebitTransType.equals(that.fstrDebitTransType));
    equal = equal && (this.fstrDebitImpact == null ? that.fstrDebitImpact == null : this.fstrDebitImpact.equals(that.fstrDebitImpact));
    equal = equal && (this.fdtmDebitPeriod == null ? that.fdtmDebitPeriod == null : this.fdtmDebitPeriod.equals(that.fdtmDebitPeriod));
    equal = equal && (this.fdtmDebitEffect == null ? that.fdtmDebitEffect == null : this.fdtmDebitEffect.equals(that.fdtmDebitEffect));
    equal = equal && (this.FCURAMOUNT == null ? that.FCURAMOUNT == null : this.FCURAMOUNT.equals(that.FCURAMOUNT));
    equal = equal && (this.FDTMEFFECTIVE == null ? that.FDTMEFFECTIVE == null : this.FDTMEFFECTIVE.equals(that.FDTMEFFECTIVE));
    equal = equal && (this.FBLNMANUALOFFSET == null ? that.FBLNMANUALOFFSET == null : this.FBLNMANUALOFFSET.equals(that.FBLNMANUALOFFSET));
    equal = equal && (this.fblnTransReversed == null ? that.fblnTransReversed == null : this.fblnTransReversed.equals(that.fblnTransReversed));
    equal = equal && (this.fblnOffsetReversed == null ? that.fblnOffsetReversed == null : this.fblnOffsetReversed.equals(that.fblnOffsetReversed));
    equal = equal && (this.fcurDebitBalanceDelta == null ? that.fcurDebitBalanceDelta == null : this.fcurDebitBalanceDelta.equals(that.fcurDebitBalanceDelta));
    equal = equal && (this.fcurDebitBalance == null ? that.fcurDebitBalance == null : this.fcurDebitBalance.equals(that.fcurDebitBalance));
    equal = equal && (this.fcurCreditBalanceDelta == null ? that.fcurCreditBalanceDelta == null : this.fcurCreditBalanceDelta.equals(that.fcurCreditBalanceDelta));
    equal = equal && (this.fcurCreditBalance == null ? that.fcurCreditBalance == null : this.fcurCreditBalance.equals(that.fcurCreditBalance));
    equal = equal && (this.fdtmProcess == null ? that.fdtmProcess == null : this.fdtmProcess.equals(that.fdtmProcess));
    equal = equal && (this.FSTRWHO == null ? that.FSTRWHO == null : this.FSTRWHO.equals(that.FSTRWHO));
    equal = equal && (this.FDTMWHEN == null ? that.FDTMWHEN == null : this.FDTMWHEN.equals(that.FDTMWHEN));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngOffsetKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fintSeq = JdbcWritableBridge.readInteger(2, __dbResults);
    this.FLNGVER = JdbcWritableBridge.readInteger(3, __dbResults);
    this.FLNGVERLAST = JdbcWritableBridge.readInteger(4, __dbResults);
    this.FLNGACCOUNTKEY = JdbcWritableBridge.readInteger(5, __dbResults);
    this.FLNGCREDITTRANSKEY = JdbcWritableBridge.readInteger(6, __dbResults);
    this.flngCreditBillItemKey = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fcurCreditAmount = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fstrCreditTransType = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrCreditImpact = JdbcWritableBridge.readString(10, __dbResults);
    this.fdtmCreditPeriod = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.fdtmCreditEffect = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.FLNGDEBITTRANSKEY = JdbcWritableBridge.readInteger(13, __dbResults);
    this.flngDebitBillItemKey = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fcurDebitAmount = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fstrDebitTransType = JdbcWritableBridge.readString(16, __dbResults);
    this.fstrDebitImpact = JdbcWritableBridge.readString(17, __dbResults);
    this.fdtmDebitPeriod = JdbcWritableBridge.readTimestamp(18, __dbResults);
    this.fdtmDebitEffect = JdbcWritableBridge.readTimestamp(19, __dbResults);
    this.FCURAMOUNT = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.FDTMEFFECTIVE = JdbcWritableBridge.readTimestamp(21, __dbResults);
    this.FBLNMANUALOFFSET = JdbcWritableBridge.readInteger(22, __dbResults);
    this.fblnTransReversed = JdbcWritableBridge.readInteger(23, __dbResults);
    this.fblnOffsetReversed = JdbcWritableBridge.readInteger(24, __dbResults);
    this.fcurDebitBalanceDelta = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fcurDebitBalance = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.fcurCreditBalanceDelta = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.fcurCreditBalance = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.fdtmProcess = JdbcWritableBridge.readTimestamp(29, __dbResults);
    this.FSTRWHO = JdbcWritableBridge.readString(30, __dbResults);
    this.FDTMWHEN = JdbcWritableBridge.readTimestamp(31, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngOffsetKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fintSeq = JdbcWritableBridge.readInteger(2, __dbResults);
    this.FLNGVER = JdbcWritableBridge.readInteger(3, __dbResults);
    this.FLNGVERLAST = JdbcWritableBridge.readInteger(4, __dbResults);
    this.FLNGACCOUNTKEY = JdbcWritableBridge.readInteger(5, __dbResults);
    this.FLNGCREDITTRANSKEY = JdbcWritableBridge.readInteger(6, __dbResults);
    this.flngCreditBillItemKey = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fcurCreditAmount = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fstrCreditTransType = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrCreditImpact = JdbcWritableBridge.readString(10, __dbResults);
    this.fdtmCreditPeriod = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.fdtmCreditEffect = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.FLNGDEBITTRANSKEY = JdbcWritableBridge.readInteger(13, __dbResults);
    this.flngDebitBillItemKey = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fcurDebitAmount = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fstrDebitTransType = JdbcWritableBridge.readString(16, __dbResults);
    this.fstrDebitImpact = JdbcWritableBridge.readString(17, __dbResults);
    this.fdtmDebitPeriod = JdbcWritableBridge.readTimestamp(18, __dbResults);
    this.fdtmDebitEffect = JdbcWritableBridge.readTimestamp(19, __dbResults);
    this.FCURAMOUNT = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.FDTMEFFECTIVE = JdbcWritableBridge.readTimestamp(21, __dbResults);
    this.FBLNMANUALOFFSET = JdbcWritableBridge.readInteger(22, __dbResults);
    this.fblnTransReversed = JdbcWritableBridge.readInteger(23, __dbResults);
    this.fblnOffsetReversed = JdbcWritableBridge.readInteger(24, __dbResults);
    this.fcurDebitBalanceDelta = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fcurDebitBalance = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.fcurCreditBalanceDelta = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.fcurCreditBalance = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.fdtmProcess = JdbcWritableBridge.readTimestamp(29, __dbResults);
    this.FSTRWHO = JdbcWritableBridge.readString(30, __dbResults);
    this.FDTMWHEN = JdbcWritableBridge.readTimestamp(31, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngOffsetKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintSeq, 2 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGVER, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGVERLAST, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGACCOUNTKEY, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGCREDITTRANSKEY, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCreditBillItemKey, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCreditAmount, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrCreditTransType, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCreditImpact, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCreditPeriod, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCreditEffect, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGDEBITTRANSKEY, 13 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDebitBillItemKey, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDebitAmount, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrDebitTransType, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDebitImpact, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDebitPeriod, 18 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDebitEffect, 19 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(FCURAMOUNT, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMEFFECTIVE, 21 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(FBLNMANUALOFFSET, 22 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnTransReversed, 23 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnOffsetReversed, 24 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDebitBalanceDelta, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDebitBalance, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCreditBalanceDelta, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCreditBalance, 28 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmProcess, 29 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(FSTRWHO, 30 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMWHEN, 31 + __off, 93, __dbStmt);
    return 31;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngOffsetKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintSeq, 2 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGVER, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGVERLAST, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGACCOUNTKEY, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGCREDITTRANSKEY, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCreditBillItemKey, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCreditAmount, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrCreditTransType, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCreditImpact, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCreditPeriod, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCreditEffect, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGDEBITTRANSKEY, 13 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDebitBillItemKey, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDebitAmount, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrDebitTransType, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDebitImpact, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDebitPeriod, 18 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDebitEffect, 19 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(FCURAMOUNT, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMEFFECTIVE, 21 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(FBLNMANUALOFFSET, 22 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnTransReversed, 23 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnOffsetReversed, 24 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDebitBalanceDelta, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDebitBalance, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCreditBalanceDelta, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCreditBalance, 28 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmProcess, 29 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(FSTRWHO, 30 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMWHEN, 31 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngOffsetKey = null;
    } else {
    this.flngOffsetKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintSeq = null;
    } else {
    this.fintSeq = Integer.valueOf(__dataIn.readInt());
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
        this.FLNGACCOUNTKEY = null;
    } else {
    this.FLNGACCOUNTKEY = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FLNGCREDITTRANSKEY = null;
    } else {
    this.FLNGCREDITTRANSKEY = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngCreditBillItemKey = null;
    } else {
    this.flngCreditBillItemKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurCreditAmount = null;
    } else {
    this.fcurCreditAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCreditTransType = null;
    } else {
    this.fstrCreditTransType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCreditImpact = null;
    } else {
    this.fstrCreditImpact = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmCreditPeriod = null;
    } else {
    this.fdtmCreditPeriod = new Timestamp(__dataIn.readLong());
    this.fdtmCreditPeriod.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmCreditEffect = null;
    } else {
    this.fdtmCreditEffect = new Timestamp(__dataIn.readLong());
    this.fdtmCreditEffect.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FLNGDEBITTRANSKEY = null;
    } else {
    this.FLNGDEBITTRANSKEY = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngDebitBillItemKey = null;
    } else {
    this.flngDebitBillItemKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDebitAmount = null;
    } else {
    this.fcurDebitAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDebitTransType = null;
    } else {
    this.fstrDebitTransType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDebitImpact = null;
    } else {
    this.fstrDebitImpact = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmDebitPeriod = null;
    } else {
    this.fdtmDebitPeriod = new Timestamp(__dataIn.readLong());
    this.fdtmDebitPeriod.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmDebitEffect = null;
    } else {
    this.fdtmDebitEffect = new Timestamp(__dataIn.readLong());
    this.fdtmDebitEffect.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FCURAMOUNT = null;
    } else {
    this.FCURAMOUNT = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FDTMEFFECTIVE = null;
    } else {
    this.FDTMEFFECTIVE = new Timestamp(__dataIn.readLong());
    this.FDTMEFFECTIVE.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FBLNMANUALOFFSET = null;
    } else {
    this.FBLNMANUALOFFSET = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnTransReversed = null;
    } else {
    this.fblnTransReversed = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnOffsetReversed = null;
    } else {
    this.fblnOffsetReversed = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDebitBalanceDelta = null;
    } else {
    this.fcurDebitBalanceDelta = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDebitBalance = null;
    } else {
    this.fcurDebitBalance = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurCreditBalanceDelta = null;
    } else {
    this.fcurCreditBalanceDelta = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurCreditBalance = null;
    } else {
    this.fcurCreditBalance = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmProcess = null;
    } else {
    this.fdtmProcess = new Timestamp(__dataIn.readLong());
    this.fdtmProcess.setNanos(__dataIn.readInt());
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
    if (null == this.flngOffsetKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngOffsetKey);
    }
    if (null == this.fintSeq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintSeq);
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
    if (null == this.FLNGACCOUNTKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGACCOUNTKEY);
    }
    if (null == this.FLNGCREDITTRANSKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGCREDITTRANSKEY);
    }
    if (null == this.flngCreditBillItemKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCreditBillItemKey);
    }
    if (null == this.fcurCreditAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCreditAmount, __dataOut);
    }
    if (null == this.fstrCreditTransType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCreditTransType);
    }
    if (null == this.fstrCreditImpact) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCreditImpact);
    }
    if (null == this.fdtmCreditPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCreditPeriod.getTime());
    __dataOut.writeInt(this.fdtmCreditPeriod.getNanos());
    }
    if (null == this.fdtmCreditEffect) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCreditEffect.getTime());
    __dataOut.writeInt(this.fdtmCreditEffect.getNanos());
    }
    if (null == this.FLNGDEBITTRANSKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGDEBITTRANSKEY);
    }
    if (null == this.flngDebitBillItemKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDebitBillItemKey);
    }
    if (null == this.fcurDebitAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDebitAmount, __dataOut);
    }
    if (null == this.fstrDebitTransType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDebitTransType);
    }
    if (null == this.fstrDebitImpact) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDebitImpact);
    }
    if (null == this.fdtmDebitPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDebitPeriod.getTime());
    __dataOut.writeInt(this.fdtmDebitPeriod.getNanos());
    }
    if (null == this.fdtmDebitEffect) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDebitEffect.getTime());
    __dataOut.writeInt(this.fdtmDebitEffect.getNanos());
    }
    if (null == this.FCURAMOUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.FCURAMOUNT, __dataOut);
    }
    if (null == this.FDTMEFFECTIVE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMEFFECTIVE.getTime());
    __dataOut.writeInt(this.FDTMEFFECTIVE.getNanos());
    }
    if (null == this.FBLNMANUALOFFSET) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FBLNMANUALOFFSET);
    }
    if (null == this.fblnTransReversed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnTransReversed);
    }
    if (null == this.fblnOffsetReversed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnOffsetReversed);
    }
    if (null == this.fcurDebitBalanceDelta) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDebitBalanceDelta, __dataOut);
    }
    if (null == this.fcurDebitBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDebitBalance, __dataOut);
    }
    if (null == this.fcurCreditBalanceDelta) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCreditBalanceDelta, __dataOut);
    }
    if (null == this.fcurCreditBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCreditBalance, __dataOut);
    }
    if (null == this.fdtmProcess) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmProcess.getTime());
    __dataOut.writeInt(this.fdtmProcess.getNanos());
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
    if (null == this.flngOffsetKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngOffsetKey);
    }
    if (null == this.fintSeq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintSeq);
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
    if (null == this.FLNGACCOUNTKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGACCOUNTKEY);
    }
    if (null == this.FLNGCREDITTRANSKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGCREDITTRANSKEY);
    }
    if (null == this.flngCreditBillItemKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCreditBillItemKey);
    }
    if (null == this.fcurCreditAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCreditAmount, __dataOut);
    }
    if (null == this.fstrCreditTransType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCreditTransType);
    }
    if (null == this.fstrCreditImpact) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCreditImpact);
    }
    if (null == this.fdtmCreditPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCreditPeriod.getTime());
    __dataOut.writeInt(this.fdtmCreditPeriod.getNanos());
    }
    if (null == this.fdtmCreditEffect) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCreditEffect.getTime());
    __dataOut.writeInt(this.fdtmCreditEffect.getNanos());
    }
    if (null == this.FLNGDEBITTRANSKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGDEBITTRANSKEY);
    }
    if (null == this.flngDebitBillItemKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDebitBillItemKey);
    }
    if (null == this.fcurDebitAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDebitAmount, __dataOut);
    }
    if (null == this.fstrDebitTransType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDebitTransType);
    }
    if (null == this.fstrDebitImpact) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDebitImpact);
    }
    if (null == this.fdtmDebitPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDebitPeriod.getTime());
    __dataOut.writeInt(this.fdtmDebitPeriod.getNanos());
    }
    if (null == this.fdtmDebitEffect) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDebitEffect.getTime());
    __dataOut.writeInt(this.fdtmDebitEffect.getNanos());
    }
    if (null == this.FCURAMOUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.FCURAMOUNT, __dataOut);
    }
    if (null == this.FDTMEFFECTIVE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMEFFECTIVE.getTime());
    __dataOut.writeInt(this.FDTMEFFECTIVE.getNanos());
    }
    if (null == this.FBLNMANUALOFFSET) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FBLNMANUALOFFSET);
    }
    if (null == this.fblnTransReversed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnTransReversed);
    }
    if (null == this.fblnOffsetReversed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnOffsetReversed);
    }
    if (null == this.fcurDebitBalanceDelta) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDebitBalanceDelta, __dataOut);
    }
    if (null == this.fcurDebitBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDebitBalance, __dataOut);
    }
    if (null == this.fcurCreditBalanceDelta) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCreditBalanceDelta, __dataOut);
    }
    if (null == this.fcurCreditBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCreditBalance, __dataOut);
    }
    if (null == this.fdtmProcess) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmProcess.getTime());
    __dataOut.writeInt(this.fdtmProcess.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngOffsetKey==null?"\\N":"" + flngOffsetKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintSeq==null?"\\N":"" + fintSeq, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGVER==null?"\\N":"" + FLNGVER, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGVERLAST==null?"\\N":"" + FLNGVERLAST, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGACCOUNTKEY==null?"\\N":"" + FLNGACCOUNTKEY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGCREDITTRANSKEY==null?"\\N":"" + FLNGCREDITTRANSKEY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCreditBillItemKey==null?"\\N":"" + flngCreditBillItemKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCreditAmount==null?"\\N":fcurCreditAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCreditTransType==null?"\\N":fstrCreditTransType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCreditImpact==null?"\\N":fstrCreditImpact, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCreditPeriod==null?"\\N":"" + fdtmCreditPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCreditEffect==null?"\\N":"" + fdtmCreditEffect, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGDEBITTRANSKEY==null?"\\N":"" + FLNGDEBITTRANSKEY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDebitBillItemKey==null?"\\N":"" + flngDebitBillItemKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDebitAmount==null?"\\N":fcurDebitAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDebitTransType==null?"\\N":fstrDebitTransType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDebitImpact==null?"\\N":fstrDebitImpact, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDebitPeriod==null?"\\N":"" + fdtmDebitPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDebitEffect==null?"\\N":"" + fdtmDebitEffect, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FCURAMOUNT==null?"\\N":FCURAMOUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMEFFECTIVE==null?"\\N":"" + FDTMEFFECTIVE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FBLNMANUALOFFSET==null?"\\N":"" + FBLNMANUALOFFSET, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnTransReversed==null?"\\N":"" + fblnTransReversed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnOffsetReversed==null?"\\N":"" + fblnOffsetReversed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDebitBalanceDelta==null?"\\N":fcurDebitBalanceDelta.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDebitBalance==null?"\\N":fcurDebitBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCreditBalanceDelta==null?"\\N":fcurCreditBalanceDelta.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCreditBalance==null?"\\N":fcurCreditBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmProcess==null?"\\N":"" + fdtmProcess, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngOffsetKey==null?"\\N":"" + flngOffsetKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintSeq==null?"\\N":"" + fintSeq, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGVER==null?"\\N":"" + FLNGVER, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGVERLAST==null?"\\N":"" + FLNGVERLAST, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGACCOUNTKEY==null?"\\N":"" + FLNGACCOUNTKEY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGCREDITTRANSKEY==null?"\\N":"" + FLNGCREDITTRANSKEY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCreditBillItemKey==null?"\\N":"" + flngCreditBillItemKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCreditAmount==null?"\\N":fcurCreditAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCreditTransType==null?"\\N":fstrCreditTransType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCreditImpact==null?"\\N":fstrCreditImpact, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCreditPeriod==null?"\\N":"" + fdtmCreditPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCreditEffect==null?"\\N":"" + fdtmCreditEffect, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGDEBITTRANSKEY==null?"\\N":"" + FLNGDEBITTRANSKEY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDebitBillItemKey==null?"\\N":"" + flngDebitBillItemKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDebitAmount==null?"\\N":fcurDebitAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDebitTransType==null?"\\N":fstrDebitTransType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDebitImpact==null?"\\N":fstrDebitImpact, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDebitPeriod==null?"\\N":"" + fdtmDebitPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDebitEffect==null?"\\N":"" + fdtmDebitEffect, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FCURAMOUNT==null?"\\N":FCURAMOUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMEFFECTIVE==null?"\\N":"" + FDTMEFFECTIVE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FBLNMANUALOFFSET==null?"\\N":"" + FBLNMANUALOFFSET, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnTransReversed==null?"\\N":"" + fblnTransReversed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnOffsetReversed==null?"\\N":"" + fblnOffsetReversed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDebitBalanceDelta==null?"\\N":fcurDebitBalanceDelta.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDebitBalance==null?"\\N":fcurDebitBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCreditBalanceDelta==null?"\\N":fcurCreditBalanceDelta.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCreditBalance==null?"\\N":fcurCreditBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmProcess==null?"\\N":"" + fdtmProcess, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngOffsetKey = null; } else {
      this.flngOffsetKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintSeq = null; } else {
      this.fintSeq = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGACCOUNTKEY = null; } else {
      this.FLNGACCOUNTKEY = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGCREDITTRANSKEY = null; } else {
      this.FLNGCREDITTRANSKEY = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCreditBillItemKey = null; } else {
      this.flngCreditBillItemKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCreditAmount = null; } else {
      this.fcurCreditAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCreditTransType = null; } else {
      this.fstrCreditTransType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCreditImpact = null; } else {
      this.fstrCreditImpact = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCreditPeriod = null; } else {
      this.fdtmCreditPeriod = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCreditEffect = null; } else {
      this.fdtmCreditEffect = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGDEBITTRANSKEY = null; } else {
      this.FLNGDEBITTRANSKEY = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDebitBillItemKey = null; } else {
      this.flngDebitBillItemKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDebitAmount = null; } else {
      this.fcurDebitAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDebitTransType = null; } else {
      this.fstrDebitTransType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDebitImpact = null; } else {
      this.fstrDebitImpact = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDebitPeriod = null; } else {
      this.fdtmDebitPeriod = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDebitEffect = null; } else {
      this.fdtmDebitEffect = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMEFFECTIVE = null; } else {
      this.FDTMEFFECTIVE = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FBLNMANUALOFFSET = null; } else {
      this.FBLNMANUALOFFSET = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnTransReversed = null; } else {
      this.fblnTransReversed = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnOffsetReversed = null; } else {
      this.fblnOffsetReversed = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDebitBalanceDelta = null; } else {
      this.fcurDebitBalanceDelta = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDebitBalance = null; } else {
      this.fcurDebitBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCreditBalanceDelta = null; } else {
      this.fcurCreditBalanceDelta = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCreditBalance = null; } else {
      this.fcurCreditBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmProcess = null; } else {
      this.fdtmProcess = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngOffsetKey = null; } else {
      this.flngOffsetKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintSeq = null; } else {
      this.fintSeq = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGACCOUNTKEY = null; } else {
      this.FLNGACCOUNTKEY = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGCREDITTRANSKEY = null; } else {
      this.FLNGCREDITTRANSKEY = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCreditBillItemKey = null; } else {
      this.flngCreditBillItemKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCreditAmount = null; } else {
      this.fcurCreditAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCreditTransType = null; } else {
      this.fstrCreditTransType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCreditImpact = null; } else {
      this.fstrCreditImpact = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCreditPeriod = null; } else {
      this.fdtmCreditPeriod = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCreditEffect = null; } else {
      this.fdtmCreditEffect = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGDEBITTRANSKEY = null; } else {
      this.FLNGDEBITTRANSKEY = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDebitBillItemKey = null; } else {
      this.flngDebitBillItemKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDebitAmount = null; } else {
      this.fcurDebitAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDebitTransType = null; } else {
      this.fstrDebitTransType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDebitImpact = null; } else {
      this.fstrDebitImpact = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDebitPeriod = null; } else {
      this.fdtmDebitPeriod = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDebitEffect = null; } else {
      this.fdtmDebitEffect = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMEFFECTIVE = null; } else {
      this.FDTMEFFECTIVE = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FBLNMANUALOFFSET = null; } else {
      this.FBLNMANUALOFFSET = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnTransReversed = null; } else {
      this.fblnTransReversed = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnOffsetReversed = null; } else {
      this.fblnOffsetReversed = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDebitBalanceDelta = null; } else {
      this.fcurDebitBalanceDelta = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDebitBalance = null; } else {
      this.fcurDebitBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCreditBalanceDelta = null; } else {
      this.fcurCreditBalanceDelta = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCreditBalance = null; } else {
      this.fcurCreditBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmProcess = null; } else {
      this.fdtmProcess = java.sql.Timestamp.valueOf(__cur_str);
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
    tbltransoffsetdetail o = (tbltransoffsetdetail) super.clone();
    o.fdtmCreditPeriod = (o.fdtmCreditPeriod != null) ? (java.sql.Timestamp) o.fdtmCreditPeriod.clone() : null;
    o.fdtmCreditEffect = (o.fdtmCreditEffect != null) ? (java.sql.Timestamp) o.fdtmCreditEffect.clone() : null;
    o.fdtmDebitPeriod = (o.fdtmDebitPeriod != null) ? (java.sql.Timestamp) o.fdtmDebitPeriod.clone() : null;
    o.fdtmDebitEffect = (o.fdtmDebitEffect != null) ? (java.sql.Timestamp) o.fdtmDebitEffect.clone() : null;
    o.FDTMEFFECTIVE = (o.FDTMEFFECTIVE != null) ? (java.sql.Timestamp) o.FDTMEFFECTIVE.clone() : null;
    o.fdtmProcess = (o.fdtmProcess != null) ? (java.sql.Timestamp) o.fdtmProcess.clone() : null;
    o.FDTMWHEN = (o.FDTMWHEN != null) ? (java.sql.Timestamp) o.FDTMWHEN.clone() : null;
    return o;
  }

  public void clone0(tbltransoffsetdetail o) throws CloneNotSupportedException {
    o.fdtmCreditPeriod = (o.fdtmCreditPeriod != null) ? (java.sql.Timestamp) o.fdtmCreditPeriod.clone() : null;
    o.fdtmCreditEffect = (o.fdtmCreditEffect != null) ? (java.sql.Timestamp) o.fdtmCreditEffect.clone() : null;
    o.fdtmDebitPeriod = (o.fdtmDebitPeriod != null) ? (java.sql.Timestamp) o.fdtmDebitPeriod.clone() : null;
    o.fdtmDebitEffect = (o.fdtmDebitEffect != null) ? (java.sql.Timestamp) o.fdtmDebitEffect.clone() : null;
    o.FDTMEFFECTIVE = (o.FDTMEFFECTIVE != null) ? (java.sql.Timestamp) o.FDTMEFFECTIVE.clone() : null;
    o.fdtmProcess = (o.fdtmProcess != null) ? (java.sql.Timestamp) o.fdtmProcess.clone() : null;
    o.FDTMWHEN = (o.FDTMWHEN != null) ? (java.sql.Timestamp) o.FDTMWHEN.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngOffsetKey", this.flngOffsetKey);
    __sqoop$field_map.put("fintSeq", this.fintSeq);
    __sqoop$field_map.put("FLNGVER", this.FLNGVER);
    __sqoop$field_map.put("FLNGVERLAST", this.FLNGVERLAST);
    __sqoop$field_map.put("FLNGACCOUNTKEY", this.FLNGACCOUNTKEY);
    __sqoop$field_map.put("FLNGCREDITTRANSKEY", this.FLNGCREDITTRANSKEY);
    __sqoop$field_map.put("flngCreditBillItemKey", this.flngCreditBillItemKey);
    __sqoop$field_map.put("fcurCreditAmount", this.fcurCreditAmount);
    __sqoop$field_map.put("fstrCreditTransType", this.fstrCreditTransType);
    __sqoop$field_map.put("fstrCreditImpact", this.fstrCreditImpact);
    __sqoop$field_map.put("fdtmCreditPeriod", this.fdtmCreditPeriod);
    __sqoop$field_map.put("fdtmCreditEffect", this.fdtmCreditEffect);
    __sqoop$field_map.put("FLNGDEBITTRANSKEY", this.FLNGDEBITTRANSKEY);
    __sqoop$field_map.put("flngDebitBillItemKey", this.flngDebitBillItemKey);
    __sqoop$field_map.put("fcurDebitAmount", this.fcurDebitAmount);
    __sqoop$field_map.put("fstrDebitTransType", this.fstrDebitTransType);
    __sqoop$field_map.put("fstrDebitImpact", this.fstrDebitImpact);
    __sqoop$field_map.put("fdtmDebitPeriod", this.fdtmDebitPeriod);
    __sqoop$field_map.put("fdtmDebitEffect", this.fdtmDebitEffect);
    __sqoop$field_map.put("FCURAMOUNT", this.FCURAMOUNT);
    __sqoop$field_map.put("FDTMEFFECTIVE", this.FDTMEFFECTIVE);
    __sqoop$field_map.put("FBLNMANUALOFFSET", this.FBLNMANUALOFFSET);
    __sqoop$field_map.put("fblnTransReversed", this.fblnTransReversed);
    __sqoop$field_map.put("fblnOffsetReversed", this.fblnOffsetReversed);
    __sqoop$field_map.put("fcurDebitBalanceDelta", this.fcurDebitBalanceDelta);
    __sqoop$field_map.put("fcurDebitBalance", this.fcurDebitBalance);
    __sqoop$field_map.put("fcurCreditBalanceDelta", this.fcurCreditBalanceDelta);
    __sqoop$field_map.put("fcurCreditBalance", this.fcurCreditBalance);
    __sqoop$field_map.put("fdtmProcess", this.fdtmProcess);
    __sqoop$field_map.put("FSTRWHO", this.FSTRWHO);
    __sqoop$field_map.put("FDTMWHEN", this.FDTMWHEN);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngOffsetKey", this.flngOffsetKey);
    __sqoop$field_map.put("fintSeq", this.fintSeq);
    __sqoop$field_map.put("FLNGVER", this.FLNGVER);
    __sqoop$field_map.put("FLNGVERLAST", this.FLNGVERLAST);
    __sqoop$field_map.put("FLNGACCOUNTKEY", this.FLNGACCOUNTKEY);
    __sqoop$field_map.put("FLNGCREDITTRANSKEY", this.FLNGCREDITTRANSKEY);
    __sqoop$field_map.put("flngCreditBillItemKey", this.flngCreditBillItemKey);
    __sqoop$field_map.put("fcurCreditAmount", this.fcurCreditAmount);
    __sqoop$field_map.put("fstrCreditTransType", this.fstrCreditTransType);
    __sqoop$field_map.put("fstrCreditImpact", this.fstrCreditImpact);
    __sqoop$field_map.put("fdtmCreditPeriod", this.fdtmCreditPeriod);
    __sqoop$field_map.put("fdtmCreditEffect", this.fdtmCreditEffect);
    __sqoop$field_map.put("FLNGDEBITTRANSKEY", this.FLNGDEBITTRANSKEY);
    __sqoop$field_map.put("flngDebitBillItemKey", this.flngDebitBillItemKey);
    __sqoop$field_map.put("fcurDebitAmount", this.fcurDebitAmount);
    __sqoop$field_map.put("fstrDebitTransType", this.fstrDebitTransType);
    __sqoop$field_map.put("fstrDebitImpact", this.fstrDebitImpact);
    __sqoop$field_map.put("fdtmDebitPeriod", this.fdtmDebitPeriod);
    __sqoop$field_map.put("fdtmDebitEffect", this.fdtmDebitEffect);
    __sqoop$field_map.put("FCURAMOUNT", this.FCURAMOUNT);
    __sqoop$field_map.put("FDTMEFFECTIVE", this.FDTMEFFECTIVE);
    __sqoop$field_map.put("FBLNMANUALOFFSET", this.FBLNMANUALOFFSET);
    __sqoop$field_map.put("fblnTransReversed", this.fblnTransReversed);
    __sqoop$field_map.put("fblnOffsetReversed", this.fblnOffsetReversed);
    __sqoop$field_map.put("fcurDebitBalanceDelta", this.fcurDebitBalanceDelta);
    __sqoop$field_map.put("fcurDebitBalance", this.fcurDebitBalance);
    __sqoop$field_map.put("fcurCreditBalanceDelta", this.fcurCreditBalanceDelta);
    __sqoop$field_map.put("fcurCreditBalance", this.fcurCreditBalance);
    __sqoop$field_map.put("fdtmProcess", this.fdtmProcess);
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
