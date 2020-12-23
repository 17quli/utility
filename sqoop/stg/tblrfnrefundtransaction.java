// ORM class for table 'tblrfnrefundtransaction'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 04:10:31 NZDT 2020
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

public class tblrfnrefundtransaction extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngRefundKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefundtransaction.this.flngRefundKey = (Integer)value;
      }
    });
    setters.put("flngSourceTransKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefundtransaction.this.flngSourceTransKey = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefundtransaction.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("flngRefundTransKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefundtransaction.this.flngRefundTransKey = (Integer)value;
      }
    });
    setters.put("fstrSourceTransType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefundtransaction.this.fstrSourceTransType = (String)value;
      }
    });
    setters.put("fstrRefundTransType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefundtransaction.this.fstrRefundTransType = (String)value;
      }
    });
    setters.put("flngRefundReturnedTransKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefundtransaction.this.flngRefundReturnedTransKey = (Integer)value;
      }
    });
    setters.put("fstrRefundReturnedTransType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefundtransaction.this.fstrRefundReturnedTransType = (String)value;
      }
    });
    setters.put("flngAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefundtransaction.this.flngAccountKey = (Integer)value;
      }
    });
    setters.put("fdtmFilingPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefundtransaction.this.fdtmFilingPeriod = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrAccountType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefundtransaction.this.fstrAccountType = (String)value;
      }
    });
    setters.put("fdtmEffect", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefundtransaction.this.fdtmEffect = (java.sql.Timestamp)value;
      }
    });
    setters.put("fcurRequestedAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefundtransaction.this.fcurRequestedAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRefundPosted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefundtransaction.this.fcurRefundPosted = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurInterestPosted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefundtransaction.this.fcurInterestPosted = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalPosted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefundtransaction.this.fcurTotalPosted = (java.math.BigDecimal)value;
      }
    });
    setters.put("fdtmApproved", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefundtransaction.this.fdtmApproved = (java.sql.Timestamp)value;
      }
    });
    setters.put("flngInterestTransKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefundtransaction.this.flngInterestTransKey = (Integer)value;
      }
    });
    setters.put("fstrInterestTransType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefundtransaction.this.fstrInterestTransType = (String)value;
      }
    });
    setters.put("flngIntDebitTransKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefundtransaction.this.flngIntDebitTransKey = (Integer)value;
      }
    });
    setters.put("fstrIntDebitTransType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefundtransaction.this.fstrIntDebitTransType = (String)value;
      }
    });
    setters.put("fcurIntDebitAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefundtransaction.this.fcurIntDebitAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("flngInterestReturnedTransKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefundtransaction.this.flngInterestReturnedTransKey = (Integer)value;
      }
    });
    setters.put("fstrInterestReturnedTransType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefundtransaction.this.fstrInterestReturnedTransType = (String)value;
      }
    });
    setters.put("flngExcessRfnTransKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefundtransaction.this.flngExcessRfnTransKey = (Integer)value;
      }
    });
    setters.put("fstrExcessRfnTransType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefundtransaction.this.fstrExcessRfnTransType = (String)value;
      }
    });
    setters.put("fcurExcessRfnAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefundtransaction.this.fcurExcessRfnAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("flngExcessRfnReturnedTransKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefundtransaction.this.flngExcessRfnReturnedTransKey = (Integer)value;
      }
    });
    setters.put("fstrExcessRfnReturnedTransType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefundtransaction.this.fstrExcessRfnReturnedTransType = (String)value;
      }
    });
    setters.put("flngExcessIntTransKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefundtransaction.this.flngExcessIntTransKey = (Integer)value;
      }
    });
    setters.put("fstrExcessIntTransType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefundtransaction.this.fstrExcessIntTransType = (String)value;
      }
    });
    setters.put("fcurExcessIntAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefundtransaction.this.fcurExcessIntAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("flngExcessIntReturnedTransKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefundtransaction.this.flngExcessIntReturnedTransKey = (Integer)value;
      }
    });
    setters.put("fstrExcessIntReturnedTransType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefundtransaction.this.fstrExcessIntReturnedTransType = (String)value;
      }
    });
    setters.put("fdtmRejected", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefundtransaction.this.fdtmRejected = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmReversed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefundtransaction.this.fdtmReversed = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefundtransaction.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblrfnrefundtransaction.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblrfnrefundtransaction() {
    init0();
  }
  private Integer flngRefundKey;
  public Integer get_flngRefundKey() {
    return flngRefundKey;
  }
  public void set_flngRefundKey(Integer flngRefundKey) {
    this.flngRefundKey = flngRefundKey;
  }
  public tblrfnrefundtransaction with_flngRefundKey(Integer flngRefundKey) {
    this.flngRefundKey = flngRefundKey;
    return this;
  }
  private Integer flngSourceTransKey;
  public Integer get_flngSourceTransKey() {
    return flngSourceTransKey;
  }
  public void set_flngSourceTransKey(Integer flngSourceTransKey) {
    this.flngSourceTransKey = flngSourceTransKey;
  }
  public tblrfnrefundtransaction with_flngSourceTransKey(Integer flngSourceTransKey) {
    this.flngSourceTransKey = flngSourceTransKey;
    return this;
  }
  private Integer flngVerLast;
  public Integer get_flngVerLast() {
    return flngVerLast;
  }
  public void set_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
  }
  public tblrfnrefundtransaction with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private Integer flngRefundTransKey;
  public Integer get_flngRefundTransKey() {
    return flngRefundTransKey;
  }
  public void set_flngRefundTransKey(Integer flngRefundTransKey) {
    this.flngRefundTransKey = flngRefundTransKey;
  }
  public tblrfnrefundtransaction with_flngRefundTransKey(Integer flngRefundTransKey) {
    this.flngRefundTransKey = flngRefundTransKey;
    return this;
  }
  private String fstrSourceTransType;
  public String get_fstrSourceTransType() {
    return fstrSourceTransType;
  }
  public void set_fstrSourceTransType(String fstrSourceTransType) {
    this.fstrSourceTransType = fstrSourceTransType;
  }
  public tblrfnrefundtransaction with_fstrSourceTransType(String fstrSourceTransType) {
    this.fstrSourceTransType = fstrSourceTransType;
    return this;
  }
  private String fstrRefundTransType;
  public String get_fstrRefundTransType() {
    return fstrRefundTransType;
  }
  public void set_fstrRefundTransType(String fstrRefundTransType) {
    this.fstrRefundTransType = fstrRefundTransType;
  }
  public tblrfnrefundtransaction with_fstrRefundTransType(String fstrRefundTransType) {
    this.fstrRefundTransType = fstrRefundTransType;
    return this;
  }
  private Integer flngRefundReturnedTransKey;
  public Integer get_flngRefundReturnedTransKey() {
    return flngRefundReturnedTransKey;
  }
  public void set_flngRefundReturnedTransKey(Integer flngRefundReturnedTransKey) {
    this.flngRefundReturnedTransKey = flngRefundReturnedTransKey;
  }
  public tblrfnrefundtransaction with_flngRefundReturnedTransKey(Integer flngRefundReturnedTransKey) {
    this.flngRefundReturnedTransKey = flngRefundReturnedTransKey;
    return this;
  }
  private String fstrRefundReturnedTransType;
  public String get_fstrRefundReturnedTransType() {
    return fstrRefundReturnedTransType;
  }
  public void set_fstrRefundReturnedTransType(String fstrRefundReturnedTransType) {
    this.fstrRefundReturnedTransType = fstrRefundReturnedTransType;
  }
  public tblrfnrefundtransaction with_fstrRefundReturnedTransType(String fstrRefundReturnedTransType) {
    this.fstrRefundReturnedTransType = fstrRefundReturnedTransType;
    return this;
  }
  private Integer flngAccountKey;
  public Integer get_flngAccountKey() {
    return flngAccountKey;
  }
  public void set_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
  }
  public tblrfnrefundtransaction with_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
    return this;
  }
  private java.sql.Timestamp fdtmFilingPeriod;
  public java.sql.Timestamp get_fdtmFilingPeriod() {
    return fdtmFilingPeriod;
  }
  public void set_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
  }
  public tblrfnrefundtransaction with_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
    return this;
  }
  private String fstrAccountType;
  public String get_fstrAccountType() {
    return fstrAccountType;
  }
  public void set_fstrAccountType(String fstrAccountType) {
    this.fstrAccountType = fstrAccountType;
  }
  public tblrfnrefundtransaction with_fstrAccountType(String fstrAccountType) {
    this.fstrAccountType = fstrAccountType;
    return this;
  }
  private java.sql.Timestamp fdtmEffect;
  public java.sql.Timestamp get_fdtmEffect() {
    return fdtmEffect;
  }
  public void set_fdtmEffect(java.sql.Timestamp fdtmEffect) {
    this.fdtmEffect = fdtmEffect;
  }
  public tblrfnrefundtransaction with_fdtmEffect(java.sql.Timestamp fdtmEffect) {
    this.fdtmEffect = fdtmEffect;
    return this;
  }
  private java.math.BigDecimal fcurRequestedAmount;
  public java.math.BigDecimal get_fcurRequestedAmount() {
    return fcurRequestedAmount;
  }
  public void set_fcurRequestedAmount(java.math.BigDecimal fcurRequestedAmount) {
    this.fcurRequestedAmount = fcurRequestedAmount;
  }
  public tblrfnrefundtransaction with_fcurRequestedAmount(java.math.BigDecimal fcurRequestedAmount) {
    this.fcurRequestedAmount = fcurRequestedAmount;
    return this;
  }
  private java.math.BigDecimal fcurRefundPosted;
  public java.math.BigDecimal get_fcurRefundPosted() {
    return fcurRefundPosted;
  }
  public void set_fcurRefundPosted(java.math.BigDecimal fcurRefundPosted) {
    this.fcurRefundPosted = fcurRefundPosted;
  }
  public tblrfnrefundtransaction with_fcurRefundPosted(java.math.BigDecimal fcurRefundPosted) {
    this.fcurRefundPosted = fcurRefundPosted;
    return this;
  }
  private java.math.BigDecimal fcurInterestPosted;
  public java.math.BigDecimal get_fcurInterestPosted() {
    return fcurInterestPosted;
  }
  public void set_fcurInterestPosted(java.math.BigDecimal fcurInterestPosted) {
    this.fcurInterestPosted = fcurInterestPosted;
  }
  public tblrfnrefundtransaction with_fcurInterestPosted(java.math.BigDecimal fcurInterestPosted) {
    this.fcurInterestPosted = fcurInterestPosted;
    return this;
  }
  private java.math.BigDecimal fcurTotalPosted;
  public java.math.BigDecimal get_fcurTotalPosted() {
    return fcurTotalPosted;
  }
  public void set_fcurTotalPosted(java.math.BigDecimal fcurTotalPosted) {
    this.fcurTotalPosted = fcurTotalPosted;
  }
  public tblrfnrefundtransaction with_fcurTotalPosted(java.math.BigDecimal fcurTotalPosted) {
    this.fcurTotalPosted = fcurTotalPosted;
    return this;
  }
  private java.sql.Timestamp fdtmApproved;
  public java.sql.Timestamp get_fdtmApproved() {
    return fdtmApproved;
  }
  public void set_fdtmApproved(java.sql.Timestamp fdtmApproved) {
    this.fdtmApproved = fdtmApproved;
  }
  public tblrfnrefundtransaction with_fdtmApproved(java.sql.Timestamp fdtmApproved) {
    this.fdtmApproved = fdtmApproved;
    return this;
  }
  private Integer flngInterestTransKey;
  public Integer get_flngInterestTransKey() {
    return flngInterestTransKey;
  }
  public void set_flngInterestTransKey(Integer flngInterestTransKey) {
    this.flngInterestTransKey = flngInterestTransKey;
  }
  public tblrfnrefundtransaction with_flngInterestTransKey(Integer flngInterestTransKey) {
    this.flngInterestTransKey = flngInterestTransKey;
    return this;
  }
  private String fstrInterestTransType;
  public String get_fstrInterestTransType() {
    return fstrInterestTransType;
  }
  public void set_fstrInterestTransType(String fstrInterestTransType) {
    this.fstrInterestTransType = fstrInterestTransType;
  }
  public tblrfnrefundtransaction with_fstrInterestTransType(String fstrInterestTransType) {
    this.fstrInterestTransType = fstrInterestTransType;
    return this;
  }
  private Integer flngIntDebitTransKey;
  public Integer get_flngIntDebitTransKey() {
    return flngIntDebitTransKey;
  }
  public void set_flngIntDebitTransKey(Integer flngIntDebitTransKey) {
    this.flngIntDebitTransKey = flngIntDebitTransKey;
  }
  public tblrfnrefundtransaction with_flngIntDebitTransKey(Integer flngIntDebitTransKey) {
    this.flngIntDebitTransKey = flngIntDebitTransKey;
    return this;
  }
  private String fstrIntDebitTransType;
  public String get_fstrIntDebitTransType() {
    return fstrIntDebitTransType;
  }
  public void set_fstrIntDebitTransType(String fstrIntDebitTransType) {
    this.fstrIntDebitTransType = fstrIntDebitTransType;
  }
  public tblrfnrefundtransaction with_fstrIntDebitTransType(String fstrIntDebitTransType) {
    this.fstrIntDebitTransType = fstrIntDebitTransType;
    return this;
  }
  private java.math.BigDecimal fcurIntDebitAmount;
  public java.math.BigDecimal get_fcurIntDebitAmount() {
    return fcurIntDebitAmount;
  }
  public void set_fcurIntDebitAmount(java.math.BigDecimal fcurIntDebitAmount) {
    this.fcurIntDebitAmount = fcurIntDebitAmount;
  }
  public tblrfnrefundtransaction with_fcurIntDebitAmount(java.math.BigDecimal fcurIntDebitAmount) {
    this.fcurIntDebitAmount = fcurIntDebitAmount;
    return this;
  }
  private Integer flngInterestReturnedTransKey;
  public Integer get_flngInterestReturnedTransKey() {
    return flngInterestReturnedTransKey;
  }
  public void set_flngInterestReturnedTransKey(Integer flngInterestReturnedTransKey) {
    this.flngInterestReturnedTransKey = flngInterestReturnedTransKey;
  }
  public tblrfnrefundtransaction with_flngInterestReturnedTransKey(Integer flngInterestReturnedTransKey) {
    this.flngInterestReturnedTransKey = flngInterestReturnedTransKey;
    return this;
  }
  private String fstrInterestReturnedTransType;
  public String get_fstrInterestReturnedTransType() {
    return fstrInterestReturnedTransType;
  }
  public void set_fstrInterestReturnedTransType(String fstrInterestReturnedTransType) {
    this.fstrInterestReturnedTransType = fstrInterestReturnedTransType;
  }
  public tblrfnrefundtransaction with_fstrInterestReturnedTransType(String fstrInterestReturnedTransType) {
    this.fstrInterestReturnedTransType = fstrInterestReturnedTransType;
    return this;
  }
  private Integer flngExcessRfnTransKey;
  public Integer get_flngExcessRfnTransKey() {
    return flngExcessRfnTransKey;
  }
  public void set_flngExcessRfnTransKey(Integer flngExcessRfnTransKey) {
    this.flngExcessRfnTransKey = flngExcessRfnTransKey;
  }
  public tblrfnrefundtransaction with_flngExcessRfnTransKey(Integer flngExcessRfnTransKey) {
    this.flngExcessRfnTransKey = flngExcessRfnTransKey;
    return this;
  }
  private String fstrExcessRfnTransType;
  public String get_fstrExcessRfnTransType() {
    return fstrExcessRfnTransType;
  }
  public void set_fstrExcessRfnTransType(String fstrExcessRfnTransType) {
    this.fstrExcessRfnTransType = fstrExcessRfnTransType;
  }
  public tblrfnrefundtransaction with_fstrExcessRfnTransType(String fstrExcessRfnTransType) {
    this.fstrExcessRfnTransType = fstrExcessRfnTransType;
    return this;
  }
  private java.math.BigDecimal fcurExcessRfnAmount;
  public java.math.BigDecimal get_fcurExcessRfnAmount() {
    return fcurExcessRfnAmount;
  }
  public void set_fcurExcessRfnAmount(java.math.BigDecimal fcurExcessRfnAmount) {
    this.fcurExcessRfnAmount = fcurExcessRfnAmount;
  }
  public tblrfnrefundtransaction with_fcurExcessRfnAmount(java.math.BigDecimal fcurExcessRfnAmount) {
    this.fcurExcessRfnAmount = fcurExcessRfnAmount;
    return this;
  }
  private Integer flngExcessRfnReturnedTransKey;
  public Integer get_flngExcessRfnReturnedTransKey() {
    return flngExcessRfnReturnedTransKey;
  }
  public void set_flngExcessRfnReturnedTransKey(Integer flngExcessRfnReturnedTransKey) {
    this.flngExcessRfnReturnedTransKey = flngExcessRfnReturnedTransKey;
  }
  public tblrfnrefundtransaction with_flngExcessRfnReturnedTransKey(Integer flngExcessRfnReturnedTransKey) {
    this.flngExcessRfnReturnedTransKey = flngExcessRfnReturnedTransKey;
    return this;
  }
  private String fstrExcessRfnReturnedTransType;
  public String get_fstrExcessRfnReturnedTransType() {
    return fstrExcessRfnReturnedTransType;
  }
  public void set_fstrExcessRfnReturnedTransType(String fstrExcessRfnReturnedTransType) {
    this.fstrExcessRfnReturnedTransType = fstrExcessRfnReturnedTransType;
  }
  public tblrfnrefundtransaction with_fstrExcessRfnReturnedTransType(String fstrExcessRfnReturnedTransType) {
    this.fstrExcessRfnReturnedTransType = fstrExcessRfnReturnedTransType;
    return this;
  }
  private Integer flngExcessIntTransKey;
  public Integer get_flngExcessIntTransKey() {
    return flngExcessIntTransKey;
  }
  public void set_flngExcessIntTransKey(Integer flngExcessIntTransKey) {
    this.flngExcessIntTransKey = flngExcessIntTransKey;
  }
  public tblrfnrefundtransaction with_flngExcessIntTransKey(Integer flngExcessIntTransKey) {
    this.flngExcessIntTransKey = flngExcessIntTransKey;
    return this;
  }
  private String fstrExcessIntTransType;
  public String get_fstrExcessIntTransType() {
    return fstrExcessIntTransType;
  }
  public void set_fstrExcessIntTransType(String fstrExcessIntTransType) {
    this.fstrExcessIntTransType = fstrExcessIntTransType;
  }
  public tblrfnrefundtransaction with_fstrExcessIntTransType(String fstrExcessIntTransType) {
    this.fstrExcessIntTransType = fstrExcessIntTransType;
    return this;
  }
  private java.math.BigDecimal fcurExcessIntAmount;
  public java.math.BigDecimal get_fcurExcessIntAmount() {
    return fcurExcessIntAmount;
  }
  public void set_fcurExcessIntAmount(java.math.BigDecimal fcurExcessIntAmount) {
    this.fcurExcessIntAmount = fcurExcessIntAmount;
  }
  public tblrfnrefundtransaction with_fcurExcessIntAmount(java.math.BigDecimal fcurExcessIntAmount) {
    this.fcurExcessIntAmount = fcurExcessIntAmount;
    return this;
  }
  private Integer flngExcessIntReturnedTransKey;
  public Integer get_flngExcessIntReturnedTransKey() {
    return flngExcessIntReturnedTransKey;
  }
  public void set_flngExcessIntReturnedTransKey(Integer flngExcessIntReturnedTransKey) {
    this.flngExcessIntReturnedTransKey = flngExcessIntReturnedTransKey;
  }
  public tblrfnrefundtransaction with_flngExcessIntReturnedTransKey(Integer flngExcessIntReturnedTransKey) {
    this.flngExcessIntReturnedTransKey = flngExcessIntReturnedTransKey;
    return this;
  }
  private String fstrExcessIntReturnedTransType;
  public String get_fstrExcessIntReturnedTransType() {
    return fstrExcessIntReturnedTransType;
  }
  public void set_fstrExcessIntReturnedTransType(String fstrExcessIntReturnedTransType) {
    this.fstrExcessIntReturnedTransType = fstrExcessIntReturnedTransType;
  }
  public tblrfnrefundtransaction with_fstrExcessIntReturnedTransType(String fstrExcessIntReturnedTransType) {
    this.fstrExcessIntReturnedTransType = fstrExcessIntReturnedTransType;
    return this;
  }
  private java.sql.Timestamp fdtmRejected;
  public java.sql.Timestamp get_fdtmRejected() {
    return fdtmRejected;
  }
  public void set_fdtmRejected(java.sql.Timestamp fdtmRejected) {
    this.fdtmRejected = fdtmRejected;
  }
  public tblrfnrefundtransaction with_fdtmRejected(java.sql.Timestamp fdtmRejected) {
    this.fdtmRejected = fdtmRejected;
    return this;
  }
  private java.sql.Timestamp fdtmReversed;
  public java.sql.Timestamp get_fdtmReversed() {
    return fdtmReversed;
  }
  public void set_fdtmReversed(java.sql.Timestamp fdtmReversed) {
    this.fdtmReversed = fdtmReversed;
  }
  public tblrfnrefundtransaction with_fdtmReversed(java.sql.Timestamp fdtmReversed) {
    this.fdtmReversed = fdtmReversed;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblrfnrefundtransaction with_fstrWho(String fstrWho) {
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
  public tblrfnrefundtransaction with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblrfnrefundtransaction)) {
      return false;
    }
    tblrfnrefundtransaction that = (tblrfnrefundtransaction) o;
    boolean equal = true;
    equal = equal && (this.flngRefundKey == null ? that.flngRefundKey == null : this.flngRefundKey.equals(that.flngRefundKey));
    equal = equal && (this.flngSourceTransKey == null ? that.flngSourceTransKey == null : this.flngSourceTransKey.equals(that.flngSourceTransKey));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngRefundTransKey == null ? that.flngRefundTransKey == null : this.flngRefundTransKey.equals(that.flngRefundTransKey));
    equal = equal && (this.fstrSourceTransType == null ? that.fstrSourceTransType == null : this.fstrSourceTransType.equals(that.fstrSourceTransType));
    equal = equal && (this.fstrRefundTransType == null ? that.fstrRefundTransType == null : this.fstrRefundTransType.equals(that.fstrRefundTransType));
    equal = equal && (this.flngRefundReturnedTransKey == null ? that.flngRefundReturnedTransKey == null : this.flngRefundReturnedTransKey.equals(that.flngRefundReturnedTransKey));
    equal = equal && (this.fstrRefundReturnedTransType == null ? that.fstrRefundReturnedTransType == null : this.fstrRefundReturnedTransType.equals(that.fstrRefundReturnedTransType));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.fstrAccountType == null ? that.fstrAccountType == null : this.fstrAccountType.equals(that.fstrAccountType));
    equal = equal && (this.fdtmEffect == null ? that.fdtmEffect == null : this.fdtmEffect.equals(that.fdtmEffect));
    equal = equal && (this.fcurRequestedAmount == null ? that.fcurRequestedAmount == null : this.fcurRequestedAmount.equals(that.fcurRequestedAmount));
    equal = equal && (this.fcurRefundPosted == null ? that.fcurRefundPosted == null : this.fcurRefundPosted.equals(that.fcurRefundPosted));
    equal = equal && (this.fcurInterestPosted == null ? that.fcurInterestPosted == null : this.fcurInterestPosted.equals(that.fcurInterestPosted));
    equal = equal && (this.fcurTotalPosted == null ? that.fcurTotalPosted == null : this.fcurTotalPosted.equals(that.fcurTotalPosted));
    equal = equal && (this.fdtmApproved == null ? that.fdtmApproved == null : this.fdtmApproved.equals(that.fdtmApproved));
    equal = equal && (this.flngInterestTransKey == null ? that.flngInterestTransKey == null : this.flngInterestTransKey.equals(that.flngInterestTransKey));
    equal = equal && (this.fstrInterestTransType == null ? that.fstrInterestTransType == null : this.fstrInterestTransType.equals(that.fstrInterestTransType));
    equal = equal && (this.flngIntDebitTransKey == null ? that.flngIntDebitTransKey == null : this.flngIntDebitTransKey.equals(that.flngIntDebitTransKey));
    equal = equal && (this.fstrIntDebitTransType == null ? that.fstrIntDebitTransType == null : this.fstrIntDebitTransType.equals(that.fstrIntDebitTransType));
    equal = equal && (this.fcurIntDebitAmount == null ? that.fcurIntDebitAmount == null : this.fcurIntDebitAmount.equals(that.fcurIntDebitAmount));
    equal = equal && (this.flngInterestReturnedTransKey == null ? that.flngInterestReturnedTransKey == null : this.flngInterestReturnedTransKey.equals(that.flngInterestReturnedTransKey));
    equal = equal && (this.fstrInterestReturnedTransType == null ? that.fstrInterestReturnedTransType == null : this.fstrInterestReturnedTransType.equals(that.fstrInterestReturnedTransType));
    equal = equal && (this.flngExcessRfnTransKey == null ? that.flngExcessRfnTransKey == null : this.flngExcessRfnTransKey.equals(that.flngExcessRfnTransKey));
    equal = equal && (this.fstrExcessRfnTransType == null ? that.fstrExcessRfnTransType == null : this.fstrExcessRfnTransType.equals(that.fstrExcessRfnTransType));
    equal = equal && (this.fcurExcessRfnAmount == null ? that.fcurExcessRfnAmount == null : this.fcurExcessRfnAmount.equals(that.fcurExcessRfnAmount));
    equal = equal && (this.flngExcessRfnReturnedTransKey == null ? that.flngExcessRfnReturnedTransKey == null : this.flngExcessRfnReturnedTransKey.equals(that.flngExcessRfnReturnedTransKey));
    equal = equal && (this.fstrExcessRfnReturnedTransType == null ? that.fstrExcessRfnReturnedTransType == null : this.fstrExcessRfnReturnedTransType.equals(that.fstrExcessRfnReturnedTransType));
    equal = equal && (this.flngExcessIntTransKey == null ? that.flngExcessIntTransKey == null : this.flngExcessIntTransKey.equals(that.flngExcessIntTransKey));
    equal = equal && (this.fstrExcessIntTransType == null ? that.fstrExcessIntTransType == null : this.fstrExcessIntTransType.equals(that.fstrExcessIntTransType));
    equal = equal && (this.fcurExcessIntAmount == null ? that.fcurExcessIntAmount == null : this.fcurExcessIntAmount.equals(that.fcurExcessIntAmount));
    equal = equal && (this.flngExcessIntReturnedTransKey == null ? that.flngExcessIntReturnedTransKey == null : this.flngExcessIntReturnedTransKey.equals(that.flngExcessIntReturnedTransKey));
    equal = equal && (this.fstrExcessIntReturnedTransType == null ? that.fstrExcessIntReturnedTransType == null : this.fstrExcessIntReturnedTransType.equals(that.fstrExcessIntReturnedTransType));
    equal = equal && (this.fdtmRejected == null ? that.fdtmRejected == null : this.fdtmRejected.equals(that.fdtmRejected));
    equal = equal && (this.fdtmReversed == null ? that.fdtmReversed == null : this.fdtmReversed.equals(that.fdtmReversed));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblrfnrefundtransaction)) {
      return false;
    }
    tblrfnrefundtransaction that = (tblrfnrefundtransaction) o;
    boolean equal = true;
    equal = equal && (this.flngRefundKey == null ? that.flngRefundKey == null : this.flngRefundKey.equals(that.flngRefundKey));
    equal = equal && (this.flngSourceTransKey == null ? that.flngSourceTransKey == null : this.flngSourceTransKey.equals(that.flngSourceTransKey));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngRefundTransKey == null ? that.flngRefundTransKey == null : this.flngRefundTransKey.equals(that.flngRefundTransKey));
    equal = equal && (this.fstrSourceTransType == null ? that.fstrSourceTransType == null : this.fstrSourceTransType.equals(that.fstrSourceTransType));
    equal = equal && (this.fstrRefundTransType == null ? that.fstrRefundTransType == null : this.fstrRefundTransType.equals(that.fstrRefundTransType));
    equal = equal && (this.flngRefundReturnedTransKey == null ? that.flngRefundReturnedTransKey == null : this.flngRefundReturnedTransKey.equals(that.flngRefundReturnedTransKey));
    equal = equal && (this.fstrRefundReturnedTransType == null ? that.fstrRefundReturnedTransType == null : this.fstrRefundReturnedTransType.equals(that.fstrRefundReturnedTransType));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.fstrAccountType == null ? that.fstrAccountType == null : this.fstrAccountType.equals(that.fstrAccountType));
    equal = equal && (this.fdtmEffect == null ? that.fdtmEffect == null : this.fdtmEffect.equals(that.fdtmEffect));
    equal = equal && (this.fcurRequestedAmount == null ? that.fcurRequestedAmount == null : this.fcurRequestedAmount.equals(that.fcurRequestedAmount));
    equal = equal && (this.fcurRefundPosted == null ? that.fcurRefundPosted == null : this.fcurRefundPosted.equals(that.fcurRefundPosted));
    equal = equal && (this.fcurInterestPosted == null ? that.fcurInterestPosted == null : this.fcurInterestPosted.equals(that.fcurInterestPosted));
    equal = equal && (this.fcurTotalPosted == null ? that.fcurTotalPosted == null : this.fcurTotalPosted.equals(that.fcurTotalPosted));
    equal = equal && (this.fdtmApproved == null ? that.fdtmApproved == null : this.fdtmApproved.equals(that.fdtmApproved));
    equal = equal && (this.flngInterestTransKey == null ? that.flngInterestTransKey == null : this.flngInterestTransKey.equals(that.flngInterestTransKey));
    equal = equal && (this.fstrInterestTransType == null ? that.fstrInterestTransType == null : this.fstrInterestTransType.equals(that.fstrInterestTransType));
    equal = equal && (this.flngIntDebitTransKey == null ? that.flngIntDebitTransKey == null : this.flngIntDebitTransKey.equals(that.flngIntDebitTransKey));
    equal = equal && (this.fstrIntDebitTransType == null ? that.fstrIntDebitTransType == null : this.fstrIntDebitTransType.equals(that.fstrIntDebitTransType));
    equal = equal && (this.fcurIntDebitAmount == null ? that.fcurIntDebitAmount == null : this.fcurIntDebitAmount.equals(that.fcurIntDebitAmount));
    equal = equal && (this.flngInterestReturnedTransKey == null ? that.flngInterestReturnedTransKey == null : this.flngInterestReturnedTransKey.equals(that.flngInterestReturnedTransKey));
    equal = equal && (this.fstrInterestReturnedTransType == null ? that.fstrInterestReturnedTransType == null : this.fstrInterestReturnedTransType.equals(that.fstrInterestReturnedTransType));
    equal = equal && (this.flngExcessRfnTransKey == null ? that.flngExcessRfnTransKey == null : this.flngExcessRfnTransKey.equals(that.flngExcessRfnTransKey));
    equal = equal && (this.fstrExcessRfnTransType == null ? that.fstrExcessRfnTransType == null : this.fstrExcessRfnTransType.equals(that.fstrExcessRfnTransType));
    equal = equal && (this.fcurExcessRfnAmount == null ? that.fcurExcessRfnAmount == null : this.fcurExcessRfnAmount.equals(that.fcurExcessRfnAmount));
    equal = equal && (this.flngExcessRfnReturnedTransKey == null ? that.flngExcessRfnReturnedTransKey == null : this.flngExcessRfnReturnedTransKey.equals(that.flngExcessRfnReturnedTransKey));
    equal = equal && (this.fstrExcessRfnReturnedTransType == null ? that.fstrExcessRfnReturnedTransType == null : this.fstrExcessRfnReturnedTransType.equals(that.fstrExcessRfnReturnedTransType));
    equal = equal && (this.flngExcessIntTransKey == null ? that.flngExcessIntTransKey == null : this.flngExcessIntTransKey.equals(that.flngExcessIntTransKey));
    equal = equal && (this.fstrExcessIntTransType == null ? that.fstrExcessIntTransType == null : this.fstrExcessIntTransType.equals(that.fstrExcessIntTransType));
    equal = equal && (this.fcurExcessIntAmount == null ? that.fcurExcessIntAmount == null : this.fcurExcessIntAmount.equals(that.fcurExcessIntAmount));
    equal = equal && (this.flngExcessIntReturnedTransKey == null ? that.flngExcessIntReturnedTransKey == null : this.flngExcessIntReturnedTransKey.equals(that.flngExcessIntReturnedTransKey));
    equal = equal && (this.fstrExcessIntReturnedTransType == null ? that.fstrExcessIntReturnedTransType == null : this.fstrExcessIntReturnedTransType.equals(that.fstrExcessIntReturnedTransType));
    equal = equal && (this.fdtmRejected == null ? that.fdtmRejected == null : this.fdtmRejected.equals(that.fdtmRejected));
    equal = equal && (this.fdtmReversed == null ? that.fdtmReversed == null : this.fdtmReversed.equals(that.fdtmReversed));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngRefundKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngSourceTransKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngRefundTransKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fstrSourceTransType = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrRefundTransType = JdbcWritableBridge.readString(6, __dbResults);
    this.flngRefundReturnedTransKey = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fstrRefundReturnedTransType = JdbcWritableBridge.readString(8, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.fstrAccountType = JdbcWritableBridge.readString(11, __dbResults);
    this.fdtmEffect = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.fcurRequestedAmount = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurRefundPosted = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurInterestPosted = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurTotalPosted = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fdtmApproved = JdbcWritableBridge.readTimestamp(17, __dbResults);
    this.flngInterestTransKey = JdbcWritableBridge.readInteger(18, __dbResults);
    this.fstrInterestTransType = JdbcWritableBridge.readString(19, __dbResults);
    this.flngIntDebitTransKey = JdbcWritableBridge.readInteger(20, __dbResults);
    this.fstrIntDebitTransType = JdbcWritableBridge.readString(21, __dbResults);
    this.fcurIntDebitAmount = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.flngInterestReturnedTransKey = JdbcWritableBridge.readInteger(23, __dbResults);
    this.fstrInterestReturnedTransType = JdbcWritableBridge.readString(24, __dbResults);
    this.flngExcessRfnTransKey = JdbcWritableBridge.readInteger(25, __dbResults);
    this.fstrExcessRfnTransType = JdbcWritableBridge.readString(26, __dbResults);
    this.fcurExcessRfnAmount = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.flngExcessRfnReturnedTransKey = JdbcWritableBridge.readInteger(28, __dbResults);
    this.fstrExcessRfnReturnedTransType = JdbcWritableBridge.readString(29, __dbResults);
    this.flngExcessIntTransKey = JdbcWritableBridge.readInteger(30, __dbResults);
    this.fstrExcessIntTransType = JdbcWritableBridge.readString(31, __dbResults);
    this.fcurExcessIntAmount = JdbcWritableBridge.readBigDecimal(32, __dbResults);
    this.flngExcessIntReturnedTransKey = JdbcWritableBridge.readInteger(33, __dbResults);
    this.fstrExcessIntReturnedTransType = JdbcWritableBridge.readString(34, __dbResults);
    this.fdtmRejected = JdbcWritableBridge.readTimestamp(35, __dbResults);
    this.fdtmReversed = JdbcWritableBridge.readTimestamp(36, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(37, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(38, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngRefundKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngSourceTransKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngRefundTransKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fstrSourceTransType = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrRefundTransType = JdbcWritableBridge.readString(6, __dbResults);
    this.flngRefundReturnedTransKey = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fstrRefundReturnedTransType = JdbcWritableBridge.readString(8, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.fstrAccountType = JdbcWritableBridge.readString(11, __dbResults);
    this.fdtmEffect = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.fcurRequestedAmount = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurRefundPosted = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurInterestPosted = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurTotalPosted = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fdtmApproved = JdbcWritableBridge.readTimestamp(17, __dbResults);
    this.flngInterestTransKey = JdbcWritableBridge.readInteger(18, __dbResults);
    this.fstrInterestTransType = JdbcWritableBridge.readString(19, __dbResults);
    this.flngIntDebitTransKey = JdbcWritableBridge.readInteger(20, __dbResults);
    this.fstrIntDebitTransType = JdbcWritableBridge.readString(21, __dbResults);
    this.fcurIntDebitAmount = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.flngInterestReturnedTransKey = JdbcWritableBridge.readInteger(23, __dbResults);
    this.fstrInterestReturnedTransType = JdbcWritableBridge.readString(24, __dbResults);
    this.flngExcessRfnTransKey = JdbcWritableBridge.readInteger(25, __dbResults);
    this.fstrExcessRfnTransType = JdbcWritableBridge.readString(26, __dbResults);
    this.fcurExcessRfnAmount = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.flngExcessRfnReturnedTransKey = JdbcWritableBridge.readInteger(28, __dbResults);
    this.fstrExcessRfnReturnedTransType = JdbcWritableBridge.readString(29, __dbResults);
    this.flngExcessIntTransKey = JdbcWritableBridge.readInteger(30, __dbResults);
    this.fstrExcessIntTransType = JdbcWritableBridge.readString(31, __dbResults);
    this.fcurExcessIntAmount = JdbcWritableBridge.readBigDecimal(32, __dbResults);
    this.flngExcessIntReturnedTransKey = JdbcWritableBridge.readInteger(33, __dbResults);
    this.fstrExcessIntReturnedTransType = JdbcWritableBridge.readString(34, __dbResults);
    this.fdtmRejected = JdbcWritableBridge.readTimestamp(35, __dbResults);
    this.fdtmReversed = JdbcWritableBridge.readTimestamp(36, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(37, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(38, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngRefundKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngSourceTransKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngRefundTransKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrSourceTransType, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRefundTransType, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngRefundReturnedTransKey, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrRefundReturnedTransType, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountType, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEffect, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRequestedAmount, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRefundPosted, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterestPosted, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalPosted, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmApproved, 17 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngInterestTransKey, 18 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrInterestTransType, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngIntDebitTransKey, 20 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrIntDebitTransType, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurIntDebitAmount, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(flngInterestReturnedTransKey, 23 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrInterestReturnedTransType, 24 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngExcessRfnTransKey, 25 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrExcessRfnTransType, 26 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurExcessRfnAmount, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(flngExcessRfnReturnedTransKey, 28 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrExcessRfnReturnedTransType, 29 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngExcessIntTransKey, 30 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrExcessIntTransType, 31 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurExcessIntAmount, 32 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(flngExcessIntReturnedTransKey, 33 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrExcessIntReturnedTransType, 34 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmRejected, 35 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReversed, 36 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 37 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 38 + __off, 93, __dbStmt);
    return 38;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngRefundKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngSourceTransKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngRefundTransKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrSourceTransType, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRefundTransType, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngRefundReturnedTransKey, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrRefundReturnedTransType, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountType, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEffect, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRequestedAmount, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRefundPosted, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterestPosted, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalPosted, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmApproved, 17 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngInterestTransKey, 18 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrInterestTransType, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngIntDebitTransKey, 20 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrIntDebitTransType, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurIntDebitAmount, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(flngInterestReturnedTransKey, 23 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrInterestReturnedTransType, 24 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngExcessRfnTransKey, 25 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrExcessRfnTransType, 26 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurExcessRfnAmount, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(flngExcessRfnReturnedTransKey, 28 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrExcessRfnReturnedTransType, 29 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngExcessIntTransKey, 30 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrExcessIntTransType, 31 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurExcessIntAmount, 32 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(flngExcessIntReturnedTransKey, 33 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrExcessIntReturnedTransType, 34 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmRejected, 35 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReversed, 36 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 37 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 38 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngRefundKey = null;
    } else {
    this.flngRefundKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngSourceTransKey = null;
    } else {
    this.flngSourceTransKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngVerLast = null;
    } else {
    this.flngVerLast = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngRefundTransKey = null;
    } else {
    this.flngRefundTransKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSourceTransType = null;
    } else {
    this.fstrSourceTransType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRefundTransType = null;
    } else {
    this.fstrRefundTransType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngRefundReturnedTransKey = null;
    } else {
    this.flngRefundReturnedTransKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRefundReturnedTransType = null;
    } else {
    this.fstrRefundReturnedTransType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngAccountKey = null;
    } else {
    this.flngAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmFilingPeriod = null;
    } else {
    this.fdtmFilingPeriod = new Timestamp(__dataIn.readLong());
    this.fdtmFilingPeriod.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAccountType = null;
    } else {
    this.fstrAccountType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmEffect = null;
    } else {
    this.fdtmEffect = new Timestamp(__dataIn.readLong());
    this.fdtmEffect.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRequestedAmount = null;
    } else {
    this.fcurRequestedAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRefundPosted = null;
    } else {
    this.fcurRefundPosted = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurInterestPosted = null;
    } else {
    this.fcurInterestPosted = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalPosted = null;
    } else {
    this.fcurTotalPosted = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmApproved = null;
    } else {
    this.fdtmApproved = new Timestamp(__dataIn.readLong());
    this.fdtmApproved.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngInterestTransKey = null;
    } else {
    this.flngInterestTransKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrInterestTransType = null;
    } else {
    this.fstrInterestTransType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngIntDebitTransKey = null;
    } else {
    this.flngIntDebitTransKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrIntDebitTransType = null;
    } else {
    this.fstrIntDebitTransType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurIntDebitAmount = null;
    } else {
    this.fcurIntDebitAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngInterestReturnedTransKey = null;
    } else {
    this.flngInterestReturnedTransKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrInterestReturnedTransType = null;
    } else {
    this.fstrInterestReturnedTransType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngExcessRfnTransKey = null;
    } else {
    this.flngExcessRfnTransKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrExcessRfnTransType = null;
    } else {
    this.fstrExcessRfnTransType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurExcessRfnAmount = null;
    } else {
    this.fcurExcessRfnAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngExcessRfnReturnedTransKey = null;
    } else {
    this.flngExcessRfnReturnedTransKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrExcessRfnReturnedTransType = null;
    } else {
    this.fstrExcessRfnReturnedTransType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngExcessIntTransKey = null;
    } else {
    this.flngExcessIntTransKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrExcessIntTransType = null;
    } else {
    this.fstrExcessIntTransType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurExcessIntAmount = null;
    } else {
    this.fcurExcessIntAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngExcessIntReturnedTransKey = null;
    } else {
    this.flngExcessIntReturnedTransKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrExcessIntReturnedTransType = null;
    } else {
    this.fstrExcessIntReturnedTransType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmRejected = null;
    } else {
    this.fdtmRejected = new Timestamp(__dataIn.readLong());
    this.fdtmRejected.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmReversed = null;
    } else {
    this.fdtmReversed = new Timestamp(__dataIn.readLong());
    this.fdtmReversed.setNanos(__dataIn.readInt());
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
    if (null == this.flngRefundKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngRefundKey);
    }
    if (null == this.flngSourceTransKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngSourceTransKey);
    }
    if (null == this.flngVerLast) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVerLast);
    }
    if (null == this.flngRefundTransKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngRefundTransKey);
    }
    if (null == this.fstrSourceTransType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSourceTransType);
    }
    if (null == this.fstrRefundTransType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRefundTransType);
    }
    if (null == this.flngRefundReturnedTransKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngRefundReturnedTransKey);
    }
    if (null == this.fstrRefundReturnedTransType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRefundReturnedTransType);
    }
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
    }
    if (null == this.fdtmFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriod.getNanos());
    }
    if (null == this.fstrAccountType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAccountType);
    }
    if (null == this.fdtmEffect) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEffect.getTime());
    __dataOut.writeInt(this.fdtmEffect.getNanos());
    }
    if (null == this.fcurRequestedAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRequestedAmount, __dataOut);
    }
    if (null == this.fcurRefundPosted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRefundPosted, __dataOut);
    }
    if (null == this.fcurInterestPosted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInterestPosted, __dataOut);
    }
    if (null == this.fcurTotalPosted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalPosted, __dataOut);
    }
    if (null == this.fdtmApproved) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmApproved.getTime());
    __dataOut.writeInt(this.fdtmApproved.getNanos());
    }
    if (null == this.flngInterestTransKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngInterestTransKey);
    }
    if (null == this.fstrInterestTransType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrInterestTransType);
    }
    if (null == this.flngIntDebitTransKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngIntDebitTransKey);
    }
    if (null == this.fstrIntDebitTransType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIntDebitTransType);
    }
    if (null == this.fcurIntDebitAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurIntDebitAmount, __dataOut);
    }
    if (null == this.flngInterestReturnedTransKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngInterestReturnedTransKey);
    }
    if (null == this.fstrInterestReturnedTransType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrInterestReturnedTransType);
    }
    if (null == this.flngExcessRfnTransKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngExcessRfnTransKey);
    }
    if (null == this.fstrExcessRfnTransType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExcessRfnTransType);
    }
    if (null == this.fcurExcessRfnAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurExcessRfnAmount, __dataOut);
    }
    if (null == this.flngExcessRfnReturnedTransKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngExcessRfnReturnedTransKey);
    }
    if (null == this.fstrExcessRfnReturnedTransType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExcessRfnReturnedTransType);
    }
    if (null == this.flngExcessIntTransKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngExcessIntTransKey);
    }
    if (null == this.fstrExcessIntTransType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExcessIntTransType);
    }
    if (null == this.fcurExcessIntAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurExcessIntAmount, __dataOut);
    }
    if (null == this.flngExcessIntReturnedTransKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngExcessIntReturnedTransKey);
    }
    if (null == this.fstrExcessIntReturnedTransType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExcessIntReturnedTransType);
    }
    if (null == this.fdtmRejected) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmRejected.getTime());
    __dataOut.writeInt(this.fdtmRejected.getNanos());
    }
    if (null == this.fdtmReversed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReversed.getTime());
    __dataOut.writeInt(this.fdtmReversed.getNanos());
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
    if (null == this.flngRefundKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngRefundKey);
    }
    if (null == this.flngSourceTransKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngSourceTransKey);
    }
    if (null == this.flngVerLast) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVerLast);
    }
    if (null == this.flngRefundTransKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngRefundTransKey);
    }
    if (null == this.fstrSourceTransType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSourceTransType);
    }
    if (null == this.fstrRefundTransType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRefundTransType);
    }
    if (null == this.flngRefundReturnedTransKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngRefundReturnedTransKey);
    }
    if (null == this.fstrRefundReturnedTransType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRefundReturnedTransType);
    }
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
    }
    if (null == this.fdtmFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriod.getNanos());
    }
    if (null == this.fstrAccountType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAccountType);
    }
    if (null == this.fdtmEffect) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEffect.getTime());
    __dataOut.writeInt(this.fdtmEffect.getNanos());
    }
    if (null == this.fcurRequestedAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRequestedAmount, __dataOut);
    }
    if (null == this.fcurRefundPosted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRefundPosted, __dataOut);
    }
    if (null == this.fcurInterestPosted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInterestPosted, __dataOut);
    }
    if (null == this.fcurTotalPosted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalPosted, __dataOut);
    }
    if (null == this.fdtmApproved) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmApproved.getTime());
    __dataOut.writeInt(this.fdtmApproved.getNanos());
    }
    if (null == this.flngInterestTransKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngInterestTransKey);
    }
    if (null == this.fstrInterestTransType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrInterestTransType);
    }
    if (null == this.flngIntDebitTransKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngIntDebitTransKey);
    }
    if (null == this.fstrIntDebitTransType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIntDebitTransType);
    }
    if (null == this.fcurIntDebitAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurIntDebitAmount, __dataOut);
    }
    if (null == this.flngInterestReturnedTransKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngInterestReturnedTransKey);
    }
    if (null == this.fstrInterestReturnedTransType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrInterestReturnedTransType);
    }
    if (null == this.flngExcessRfnTransKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngExcessRfnTransKey);
    }
    if (null == this.fstrExcessRfnTransType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExcessRfnTransType);
    }
    if (null == this.fcurExcessRfnAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurExcessRfnAmount, __dataOut);
    }
    if (null == this.flngExcessRfnReturnedTransKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngExcessRfnReturnedTransKey);
    }
    if (null == this.fstrExcessRfnReturnedTransType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExcessRfnReturnedTransType);
    }
    if (null == this.flngExcessIntTransKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngExcessIntTransKey);
    }
    if (null == this.fstrExcessIntTransType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExcessIntTransType);
    }
    if (null == this.fcurExcessIntAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurExcessIntAmount, __dataOut);
    }
    if (null == this.flngExcessIntReturnedTransKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngExcessIntReturnedTransKey);
    }
    if (null == this.fstrExcessIntReturnedTransType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExcessIntReturnedTransType);
    }
    if (null == this.fdtmRejected) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmRejected.getTime());
    __dataOut.writeInt(this.fdtmRejected.getNanos());
    }
    if (null == this.fdtmReversed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReversed.getTime());
    __dataOut.writeInt(this.fdtmReversed.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngRefundKey==null?"\\N":"" + flngRefundKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngSourceTransKey==null?"\\N":"" + flngSourceTransKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngRefundTransKey==null?"\\N":"" + flngRefundTransKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSourceTransType==null?"\\N":fstrSourceTransType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRefundTransType==null?"\\N":fstrRefundTransType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngRefundReturnedTransKey==null?"\\N":"" + flngRefundReturnedTransKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRefundReturnedTransType==null?"\\N":fstrRefundReturnedTransType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAccountType==null?"\\N":fstrAccountType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEffect==null?"\\N":"" + fdtmEffect, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRequestedAmount==null?"\\N":fcurRequestedAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRefundPosted==null?"\\N":fcurRefundPosted.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterestPosted==null?"\\N":fcurInterestPosted.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalPosted==null?"\\N":fcurTotalPosted.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmApproved==null?"\\N":"" + fdtmApproved, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngInterestTransKey==null?"\\N":"" + flngInterestTransKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrInterestTransType==null?"\\N":fstrInterestTransType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngIntDebitTransKey==null?"\\N":"" + flngIntDebitTransKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIntDebitTransType==null?"\\N":fstrIntDebitTransType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurIntDebitAmount==null?"\\N":fcurIntDebitAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngInterestReturnedTransKey==null?"\\N":"" + flngInterestReturnedTransKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrInterestReturnedTransType==null?"\\N":fstrInterestReturnedTransType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngExcessRfnTransKey==null?"\\N":"" + flngExcessRfnTransKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExcessRfnTransType==null?"\\N":fstrExcessRfnTransType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurExcessRfnAmount==null?"\\N":fcurExcessRfnAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngExcessRfnReturnedTransKey==null?"\\N":"" + flngExcessRfnReturnedTransKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExcessRfnReturnedTransType==null?"\\N":fstrExcessRfnReturnedTransType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngExcessIntTransKey==null?"\\N":"" + flngExcessIntTransKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExcessIntTransType==null?"\\N":fstrExcessIntTransType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurExcessIntAmount==null?"\\N":fcurExcessIntAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngExcessIntReturnedTransKey==null?"\\N":"" + flngExcessIntReturnedTransKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExcessIntReturnedTransType==null?"\\N":fstrExcessIntReturnedTransType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmRejected==null?"\\N":"" + fdtmRejected, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReversed==null?"\\N":"" + fdtmReversed, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngRefundKey==null?"\\N":"" + flngRefundKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngSourceTransKey==null?"\\N":"" + flngSourceTransKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngRefundTransKey==null?"\\N":"" + flngRefundTransKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSourceTransType==null?"\\N":fstrSourceTransType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRefundTransType==null?"\\N":fstrRefundTransType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngRefundReturnedTransKey==null?"\\N":"" + flngRefundReturnedTransKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRefundReturnedTransType==null?"\\N":fstrRefundReturnedTransType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAccountType==null?"\\N":fstrAccountType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEffect==null?"\\N":"" + fdtmEffect, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRequestedAmount==null?"\\N":fcurRequestedAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRefundPosted==null?"\\N":fcurRefundPosted.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterestPosted==null?"\\N":fcurInterestPosted.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalPosted==null?"\\N":fcurTotalPosted.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmApproved==null?"\\N":"" + fdtmApproved, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngInterestTransKey==null?"\\N":"" + flngInterestTransKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrInterestTransType==null?"\\N":fstrInterestTransType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngIntDebitTransKey==null?"\\N":"" + flngIntDebitTransKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIntDebitTransType==null?"\\N":fstrIntDebitTransType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurIntDebitAmount==null?"\\N":fcurIntDebitAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngInterestReturnedTransKey==null?"\\N":"" + flngInterestReturnedTransKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrInterestReturnedTransType==null?"\\N":fstrInterestReturnedTransType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngExcessRfnTransKey==null?"\\N":"" + flngExcessRfnTransKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExcessRfnTransType==null?"\\N":fstrExcessRfnTransType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurExcessRfnAmount==null?"\\N":fcurExcessRfnAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngExcessRfnReturnedTransKey==null?"\\N":"" + flngExcessRfnReturnedTransKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExcessRfnReturnedTransType==null?"\\N":fstrExcessRfnReturnedTransType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngExcessIntTransKey==null?"\\N":"" + flngExcessIntTransKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExcessIntTransType==null?"\\N":fstrExcessIntTransType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurExcessIntAmount==null?"\\N":fcurExcessIntAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngExcessIntReturnedTransKey==null?"\\N":"" + flngExcessIntReturnedTransKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExcessIntReturnedTransType==null?"\\N":fstrExcessIntReturnedTransType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmRejected==null?"\\N":"" + fdtmRejected, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReversed==null?"\\N":"" + fdtmReversed, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngRefundKey = null; } else {
      this.flngRefundKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngSourceTransKey = null; } else {
      this.flngSourceTransKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngRefundTransKey = null; } else {
      this.flngRefundTransKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSourceTransType = null; } else {
      this.fstrSourceTransType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRefundTransType = null; } else {
      this.fstrRefundTransType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngRefundReturnedTransKey = null; } else {
      this.flngRefundReturnedTransKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRefundReturnedTransType = null; } else {
      this.fstrRefundReturnedTransType = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFilingPeriod = null; } else {
      this.fdtmFilingPeriod = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAccountType = null; } else {
      this.fstrAccountType = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRequestedAmount = null; } else {
      this.fcurRequestedAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRefundPosted = null; } else {
      this.fcurRefundPosted = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInterestPosted = null; } else {
      this.fcurInterestPosted = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalPosted = null; } else {
      this.fcurTotalPosted = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmApproved = null; } else {
      this.fdtmApproved = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngInterestTransKey = null; } else {
      this.flngInterestTransKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrInterestTransType = null; } else {
      this.fstrInterestTransType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngIntDebitTransKey = null; } else {
      this.flngIntDebitTransKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIntDebitTransType = null; } else {
      this.fstrIntDebitTransType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurIntDebitAmount = null; } else {
      this.fcurIntDebitAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngInterestReturnedTransKey = null; } else {
      this.flngInterestReturnedTransKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrInterestReturnedTransType = null; } else {
      this.fstrInterestReturnedTransType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngExcessRfnTransKey = null; } else {
      this.flngExcessRfnTransKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrExcessRfnTransType = null; } else {
      this.fstrExcessRfnTransType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurExcessRfnAmount = null; } else {
      this.fcurExcessRfnAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngExcessRfnReturnedTransKey = null; } else {
      this.flngExcessRfnReturnedTransKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrExcessRfnReturnedTransType = null; } else {
      this.fstrExcessRfnReturnedTransType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngExcessIntTransKey = null; } else {
      this.flngExcessIntTransKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrExcessIntTransType = null; } else {
      this.fstrExcessIntTransType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurExcessIntAmount = null; } else {
      this.fcurExcessIntAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngExcessIntReturnedTransKey = null; } else {
      this.flngExcessIntReturnedTransKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrExcessIntReturnedTransType = null; } else {
      this.fstrExcessIntReturnedTransType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmRejected = null; } else {
      this.fdtmRejected = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReversed = null; } else {
      this.fdtmReversed = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngRefundKey = null; } else {
      this.flngRefundKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngSourceTransKey = null; } else {
      this.flngSourceTransKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngRefundTransKey = null; } else {
      this.flngRefundTransKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSourceTransType = null; } else {
      this.fstrSourceTransType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRefundTransType = null; } else {
      this.fstrRefundTransType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngRefundReturnedTransKey = null; } else {
      this.flngRefundReturnedTransKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRefundReturnedTransType = null; } else {
      this.fstrRefundReturnedTransType = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFilingPeriod = null; } else {
      this.fdtmFilingPeriod = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAccountType = null; } else {
      this.fstrAccountType = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRequestedAmount = null; } else {
      this.fcurRequestedAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRefundPosted = null; } else {
      this.fcurRefundPosted = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInterestPosted = null; } else {
      this.fcurInterestPosted = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalPosted = null; } else {
      this.fcurTotalPosted = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmApproved = null; } else {
      this.fdtmApproved = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngInterestTransKey = null; } else {
      this.flngInterestTransKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrInterestTransType = null; } else {
      this.fstrInterestTransType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngIntDebitTransKey = null; } else {
      this.flngIntDebitTransKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIntDebitTransType = null; } else {
      this.fstrIntDebitTransType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurIntDebitAmount = null; } else {
      this.fcurIntDebitAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngInterestReturnedTransKey = null; } else {
      this.flngInterestReturnedTransKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrInterestReturnedTransType = null; } else {
      this.fstrInterestReturnedTransType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngExcessRfnTransKey = null; } else {
      this.flngExcessRfnTransKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrExcessRfnTransType = null; } else {
      this.fstrExcessRfnTransType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurExcessRfnAmount = null; } else {
      this.fcurExcessRfnAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngExcessRfnReturnedTransKey = null; } else {
      this.flngExcessRfnReturnedTransKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrExcessRfnReturnedTransType = null; } else {
      this.fstrExcessRfnReturnedTransType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngExcessIntTransKey = null; } else {
      this.flngExcessIntTransKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrExcessIntTransType = null; } else {
      this.fstrExcessIntTransType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurExcessIntAmount = null; } else {
      this.fcurExcessIntAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngExcessIntReturnedTransKey = null; } else {
      this.flngExcessIntReturnedTransKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrExcessIntReturnedTransType = null; } else {
      this.fstrExcessIntReturnedTransType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmRejected = null; } else {
      this.fdtmRejected = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReversed = null; } else {
      this.fdtmReversed = java.sql.Timestamp.valueOf(__cur_str);
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
    tblrfnrefundtransaction o = (tblrfnrefundtransaction) super.clone();
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmEffect = (o.fdtmEffect != null) ? (java.sql.Timestamp) o.fdtmEffect.clone() : null;
    o.fdtmApproved = (o.fdtmApproved != null) ? (java.sql.Timestamp) o.fdtmApproved.clone() : null;
    o.fdtmRejected = (o.fdtmRejected != null) ? (java.sql.Timestamp) o.fdtmRejected.clone() : null;
    o.fdtmReversed = (o.fdtmReversed != null) ? (java.sql.Timestamp) o.fdtmReversed.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblrfnrefundtransaction o) throws CloneNotSupportedException {
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmEffect = (o.fdtmEffect != null) ? (java.sql.Timestamp) o.fdtmEffect.clone() : null;
    o.fdtmApproved = (o.fdtmApproved != null) ? (java.sql.Timestamp) o.fdtmApproved.clone() : null;
    o.fdtmRejected = (o.fdtmRejected != null) ? (java.sql.Timestamp) o.fdtmRejected.clone() : null;
    o.fdtmReversed = (o.fdtmReversed != null) ? (java.sql.Timestamp) o.fdtmReversed.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngRefundKey", this.flngRefundKey);
    __sqoop$field_map.put("flngSourceTransKey", this.flngSourceTransKey);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngRefundTransKey", this.flngRefundTransKey);
    __sqoop$field_map.put("fstrSourceTransType", this.fstrSourceTransType);
    __sqoop$field_map.put("fstrRefundTransType", this.fstrRefundTransType);
    __sqoop$field_map.put("flngRefundReturnedTransKey", this.flngRefundReturnedTransKey);
    __sqoop$field_map.put("fstrRefundReturnedTransType", this.fstrRefundReturnedTransType);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("fstrAccountType", this.fstrAccountType);
    __sqoop$field_map.put("fdtmEffect", this.fdtmEffect);
    __sqoop$field_map.put("fcurRequestedAmount", this.fcurRequestedAmount);
    __sqoop$field_map.put("fcurRefundPosted", this.fcurRefundPosted);
    __sqoop$field_map.put("fcurInterestPosted", this.fcurInterestPosted);
    __sqoop$field_map.put("fcurTotalPosted", this.fcurTotalPosted);
    __sqoop$field_map.put("fdtmApproved", this.fdtmApproved);
    __sqoop$field_map.put("flngInterestTransKey", this.flngInterestTransKey);
    __sqoop$field_map.put("fstrInterestTransType", this.fstrInterestTransType);
    __sqoop$field_map.put("flngIntDebitTransKey", this.flngIntDebitTransKey);
    __sqoop$field_map.put("fstrIntDebitTransType", this.fstrIntDebitTransType);
    __sqoop$field_map.put("fcurIntDebitAmount", this.fcurIntDebitAmount);
    __sqoop$field_map.put("flngInterestReturnedTransKey", this.flngInterestReturnedTransKey);
    __sqoop$field_map.put("fstrInterestReturnedTransType", this.fstrInterestReturnedTransType);
    __sqoop$field_map.put("flngExcessRfnTransKey", this.flngExcessRfnTransKey);
    __sqoop$field_map.put("fstrExcessRfnTransType", this.fstrExcessRfnTransType);
    __sqoop$field_map.put("fcurExcessRfnAmount", this.fcurExcessRfnAmount);
    __sqoop$field_map.put("flngExcessRfnReturnedTransKey", this.flngExcessRfnReturnedTransKey);
    __sqoop$field_map.put("fstrExcessRfnReturnedTransType", this.fstrExcessRfnReturnedTransType);
    __sqoop$field_map.put("flngExcessIntTransKey", this.flngExcessIntTransKey);
    __sqoop$field_map.put("fstrExcessIntTransType", this.fstrExcessIntTransType);
    __sqoop$field_map.put("fcurExcessIntAmount", this.fcurExcessIntAmount);
    __sqoop$field_map.put("flngExcessIntReturnedTransKey", this.flngExcessIntReturnedTransKey);
    __sqoop$field_map.put("fstrExcessIntReturnedTransType", this.fstrExcessIntReturnedTransType);
    __sqoop$field_map.put("fdtmRejected", this.fdtmRejected);
    __sqoop$field_map.put("fdtmReversed", this.fdtmReversed);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngRefundKey", this.flngRefundKey);
    __sqoop$field_map.put("flngSourceTransKey", this.flngSourceTransKey);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngRefundTransKey", this.flngRefundTransKey);
    __sqoop$field_map.put("fstrSourceTransType", this.fstrSourceTransType);
    __sqoop$field_map.put("fstrRefundTransType", this.fstrRefundTransType);
    __sqoop$field_map.put("flngRefundReturnedTransKey", this.flngRefundReturnedTransKey);
    __sqoop$field_map.put("fstrRefundReturnedTransType", this.fstrRefundReturnedTransType);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("fstrAccountType", this.fstrAccountType);
    __sqoop$field_map.put("fdtmEffect", this.fdtmEffect);
    __sqoop$field_map.put("fcurRequestedAmount", this.fcurRequestedAmount);
    __sqoop$field_map.put("fcurRefundPosted", this.fcurRefundPosted);
    __sqoop$field_map.put("fcurInterestPosted", this.fcurInterestPosted);
    __sqoop$field_map.put("fcurTotalPosted", this.fcurTotalPosted);
    __sqoop$field_map.put("fdtmApproved", this.fdtmApproved);
    __sqoop$field_map.put("flngInterestTransKey", this.flngInterestTransKey);
    __sqoop$field_map.put("fstrInterestTransType", this.fstrInterestTransType);
    __sqoop$field_map.put("flngIntDebitTransKey", this.flngIntDebitTransKey);
    __sqoop$field_map.put("fstrIntDebitTransType", this.fstrIntDebitTransType);
    __sqoop$field_map.put("fcurIntDebitAmount", this.fcurIntDebitAmount);
    __sqoop$field_map.put("flngInterestReturnedTransKey", this.flngInterestReturnedTransKey);
    __sqoop$field_map.put("fstrInterestReturnedTransType", this.fstrInterestReturnedTransType);
    __sqoop$field_map.put("flngExcessRfnTransKey", this.flngExcessRfnTransKey);
    __sqoop$field_map.put("fstrExcessRfnTransType", this.fstrExcessRfnTransType);
    __sqoop$field_map.put("fcurExcessRfnAmount", this.fcurExcessRfnAmount);
    __sqoop$field_map.put("flngExcessRfnReturnedTransKey", this.flngExcessRfnReturnedTransKey);
    __sqoop$field_map.put("fstrExcessRfnReturnedTransType", this.fstrExcessRfnReturnedTransType);
    __sqoop$field_map.put("flngExcessIntTransKey", this.flngExcessIntTransKey);
    __sqoop$field_map.put("fstrExcessIntTransType", this.fstrExcessIntTransType);
    __sqoop$field_map.put("fcurExcessIntAmount", this.fcurExcessIntAmount);
    __sqoop$field_map.put("flngExcessIntReturnedTransKey", this.flngExcessIntReturnedTransKey);
    __sqoop$field_map.put("fstrExcessIntReturnedTransType", this.fstrExcessIntReturnedTransType);
    __sqoop$field_map.put("fdtmRejected", this.fdtmRejected);
    __sqoop$field_map.put("fdtmReversed", this.fdtmReversed);
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
