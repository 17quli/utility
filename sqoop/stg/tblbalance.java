// ORM class for table 'tblbalance'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 03:07:18 NZDT 2020
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

public class tblbalance extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbalance.this.flngAccountKey = (Integer)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbalance.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbalance.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("fstrAccountType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbalance.this.fstrAccountType = (String)value;
      }
    });
    setters.put("fcurBalance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbalance.this.fcurBalance = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurBalanceDelta", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbalance.this.fcurBalanceDelta = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDisplayBalance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbalance.this.fcurDisplayBalance = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDisplayBalanceDelta", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbalance.this.fcurDisplayBalanceDelta = (java.math.BigDecimal)value;
      }
    });
    setters.put("fdtmInBalance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbalance.this.fdtmInBalance = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmBackEnd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbalance.this.fdtmBackEnd = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmImpact", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbalance.this.fdtmImpact = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmPenalty", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbalance.this.fdtmPenalty = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmDelta", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbalance.this.fdtmDelta = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmInspect", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbalance.this.fdtmInspect = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmLastStatement", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbalance.this.fdtmLastStatement = (java.sql.Timestamp)value;
      }
    });
    setters.put("fcurLastStatementBal", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbalance.this.fcurLastStatementBal = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnPNIRecalc", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbalance.this.fblnPNIRecalc = (Integer)value;
      }
    });
    setters.put("fblnHoldCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbalance.this.fblnHoldCredits = (Integer)value;
      }
    });
    setters.put("fintTransStateCount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbalance.this.fintTransStateCount = (Integer)value;
      }
    });
    setters.put("flngTransStageCount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbalance.this.flngTransStageCount = (Integer)value;
      }
    });
    setters.put("fdtmTransStageNext", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbalance.this.fdtmTransStageNext = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmCycledThru", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbalance.this.fdtmCycledThru = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmEvaluateAccount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbalance.this.fdtmEvaluateAccount = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmNextStatement", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbalance.this.fdtmNextStatement = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbalance.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbalance.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblbalance() {
    init0();
  }
  private Integer flngAccountKey;
  public Integer get_flngAccountKey() {
    return flngAccountKey;
  }
  public void set_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
  }
  public tblbalance with_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblbalance with_flngVer(Integer flngVer) {
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
  public tblbalance with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private String fstrAccountType;
  public String get_fstrAccountType() {
    return fstrAccountType;
  }
  public void set_fstrAccountType(String fstrAccountType) {
    this.fstrAccountType = fstrAccountType;
  }
  public tblbalance with_fstrAccountType(String fstrAccountType) {
    this.fstrAccountType = fstrAccountType;
    return this;
  }
  private java.math.BigDecimal fcurBalance;
  public java.math.BigDecimal get_fcurBalance() {
    return fcurBalance;
  }
  public void set_fcurBalance(java.math.BigDecimal fcurBalance) {
    this.fcurBalance = fcurBalance;
  }
  public tblbalance with_fcurBalance(java.math.BigDecimal fcurBalance) {
    this.fcurBalance = fcurBalance;
    return this;
  }
  private java.math.BigDecimal fcurBalanceDelta;
  public java.math.BigDecimal get_fcurBalanceDelta() {
    return fcurBalanceDelta;
  }
  public void set_fcurBalanceDelta(java.math.BigDecimal fcurBalanceDelta) {
    this.fcurBalanceDelta = fcurBalanceDelta;
  }
  public tblbalance with_fcurBalanceDelta(java.math.BigDecimal fcurBalanceDelta) {
    this.fcurBalanceDelta = fcurBalanceDelta;
    return this;
  }
  private java.math.BigDecimal fcurDisplayBalance;
  public java.math.BigDecimal get_fcurDisplayBalance() {
    return fcurDisplayBalance;
  }
  public void set_fcurDisplayBalance(java.math.BigDecimal fcurDisplayBalance) {
    this.fcurDisplayBalance = fcurDisplayBalance;
  }
  public tblbalance with_fcurDisplayBalance(java.math.BigDecimal fcurDisplayBalance) {
    this.fcurDisplayBalance = fcurDisplayBalance;
    return this;
  }
  private java.math.BigDecimal fcurDisplayBalanceDelta;
  public java.math.BigDecimal get_fcurDisplayBalanceDelta() {
    return fcurDisplayBalanceDelta;
  }
  public void set_fcurDisplayBalanceDelta(java.math.BigDecimal fcurDisplayBalanceDelta) {
    this.fcurDisplayBalanceDelta = fcurDisplayBalanceDelta;
  }
  public tblbalance with_fcurDisplayBalanceDelta(java.math.BigDecimal fcurDisplayBalanceDelta) {
    this.fcurDisplayBalanceDelta = fcurDisplayBalanceDelta;
    return this;
  }
  private java.sql.Timestamp fdtmInBalance;
  public java.sql.Timestamp get_fdtmInBalance() {
    return fdtmInBalance;
  }
  public void set_fdtmInBalance(java.sql.Timestamp fdtmInBalance) {
    this.fdtmInBalance = fdtmInBalance;
  }
  public tblbalance with_fdtmInBalance(java.sql.Timestamp fdtmInBalance) {
    this.fdtmInBalance = fdtmInBalance;
    return this;
  }
  private java.sql.Timestamp fdtmBackEnd;
  public java.sql.Timestamp get_fdtmBackEnd() {
    return fdtmBackEnd;
  }
  public void set_fdtmBackEnd(java.sql.Timestamp fdtmBackEnd) {
    this.fdtmBackEnd = fdtmBackEnd;
  }
  public tblbalance with_fdtmBackEnd(java.sql.Timestamp fdtmBackEnd) {
    this.fdtmBackEnd = fdtmBackEnd;
    return this;
  }
  private java.sql.Timestamp fdtmImpact;
  public java.sql.Timestamp get_fdtmImpact() {
    return fdtmImpact;
  }
  public void set_fdtmImpact(java.sql.Timestamp fdtmImpact) {
    this.fdtmImpact = fdtmImpact;
  }
  public tblbalance with_fdtmImpact(java.sql.Timestamp fdtmImpact) {
    this.fdtmImpact = fdtmImpact;
    return this;
  }
  private java.sql.Timestamp fdtmPenalty;
  public java.sql.Timestamp get_fdtmPenalty() {
    return fdtmPenalty;
  }
  public void set_fdtmPenalty(java.sql.Timestamp fdtmPenalty) {
    this.fdtmPenalty = fdtmPenalty;
  }
  public tblbalance with_fdtmPenalty(java.sql.Timestamp fdtmPenalty) {
    this.fdtmPenalty = fdtmPenalty;
    return this;
  }
  private java.sql.Timestamp fdtmDelta;
  public java.sql.Timestamp get_fdtmDelta() {
    return fdtmDelta;
  }
  public void set_fdtmDelta(java.sql.Timestamp fdtmDelta) {
    this.fdtmDelta = fdtmDelta;
  }
  public tblbalance with_fdtmDelta(java.sql.Timestamp fdtmDelta) {
    this.fdtmDelta = fdtmDelta;
    return this;
  }
  private java.sql.Timestamp fdtmInspect;
  public java.sql.Timestamp get_fdtmInspect() {
    return fdtmInspect;
  }
  public void set_fdtmInspect(java.sql.Timestamp fdtmInspect) {
    this.fdtmInspect = fdtmInspect;
  }
  public tblbalance with_fdtmInspect(java.sql.Timestamp fdtmInspect) {
    this.fdtmInspect = fdtmInspect;
    return this;
  }
  private java.sql.Timestamp fdtmLastStatement;
  public java.sql.Timestamp get_fdtmLastStatement() {
    return fdtmLastStatement;
  }
  public void set_fdtmLastStatement(java.sql.Timestamp fdtmLastStatement) {
    this.fdtmLastStatement = fdtmLastStatement;
  }
  public tblbalance with_fdtmLastStatement(java.sql.Timestamp fdtmLastStatement) {
    this.fdtmLastStatement = fdtmLastStatement;
    return this;
  }
  private java.math.BigDecimal fcurLastStatementBal;
  public java.math.BigDecimal get_fcurLastStatementBal() {
    return fcurLastStatementBal;
  }
  public void set_fcurLastStatementBal(java.math.BigDecimal fcurLastStatementBal) {
    this.fcurLastStatementBal = fcurLastStatementBal;
  }
  public tblbalance with_fcurLastStatementBal(java.math.BigDecimal fcurLastStatementBal) {
    this.fcurLastStatementBal = fcurLastStatementBal;
    return this;
  }
  private Integer fblnPNIRecalc;
  public Integer get_fblnPNIRecalc() {
    return fblnPNIRecalc;
  }
  public void set_fblnPNIRecalc(Integer fblnPNIRecalc) {
    this.fblnPNIRecalc = fblnPNIRecalc;
  }
  public tblbalance with_fblnPNIRecalc(Integer fblnPNIRecalc) {
    this.fblnPNIRecalc = fblnPNIRecalc;
    return this;
  }
  private Integer fblnHoldCredits;
  public Integer get_fblnHoldCredits() {
    return fblnHoldCredits;
  }
  public void set_fblnHoldCredits(Integer fblnHoldCredits) {
    this.fblnHoldCredits = fblnHoldCredits;
  }
  public tblbalance with_fblnHoldCredits(Integer fblnHoldCredits) {
    this.fblnHoldCredits = fblnHoldCredits;
    return this;
  }
  private Integer fintTransStateCount;
  public Integer get_fintTransStateCount() {
    return fintTransStateCount;
  }
  public void set_fintTransStateCount(Integer fintTransStateCount) {
    this.fintTransStateCount = fintTransStateCount;
  }
  public tblbalance with_fintTransStateCount(Integer fintTransStateCount) {
    this.fintTransStateCount = fintTransStateCount;
    return this;
  }
  private Integer flngTransStageCount;
  public Integer get_flngTransStageCount() {
    return flngTransStageCount;
  }
  public void set_flngTransStageCount(Integer flngTransStageCount) {
    this.flngTransStageCount = flngTransStageCount;
  }
  public tblbalance with_flngTransStageCount(Integer flngTransStageCount) {
    this.flngTransStageCount = flngTransStageCount;
    return this;
  }
  private java.sql.Timestamp fdtmTransStageNext;
  public java.sql.Timestamp get_fdtmTransStageNext() {
    return fdtmTransStageNext;
  }
  public void set_fdtmTransStageNext(java.sql.Timestamp fdtmTransStageNext) {
    this.fdtmTransStageNext = fdtmTransStageNext;
  }
  public tblbalance with_fdtmTransStageNext(java.sql.Timestamp fdtmTransStageNext) {
    this.fdtmTransStageNext = fdtmTransStageNext;
    return this;
  }
  private java.sql.Timestamp fdtmCycledThru;
  public java.sql.Timestamp get_fdtmCycledThru() {
    return fdtmCycledThru;
  }
  public void set_fdtmCycledThru(java.sql.Timestamp fdtmCycledThru) {
    this.fdtmCycledThru = fdtmCycledThru;
  }
  public tblbalance with_fdtmCycledThru(java.sql.Timestamp fdtmCycledThru) {
    this.fdtmCycledThru = fdtmCycledThru;
    return this;
  }
  private java.sql.Timestamp fdtmEvaluateAccount;
  public java.sql.Timestamp get_fdtmEvaluateAccount() {
    return fdtmEvaluateAccount;
  }
  public void set_fdtmEvaluateAccount(java.sql.Timestamp fdtmEvaluateAccount) {
    this.fdtmEvaluateAccount = fdtmEvaluateAccount;
  }
  public tblbalance with_fdtmEvaluateAccount(java.sql.Timestamp fdtmEvaluateAccount) {
    this.fdtmEvaluateAccount = fdtmEvaluateAccount;
    return this;
  }
  private java.sql.Timestamp fdtmNextStatement;
  public java.sql.Timestamp get_fdtmNextStatement() {
    return fdtmNextStatement;
  }
  public void set_fdtmNextStatement(java.sql.Timestamp fdtmNextStatement) {
    this.fdtmNextStatement = fdtmNextStatement;
  }
  public tblbalance with_fdtmNextStatement(java.sql.Timestamp fdtmNextStatement) {
    this.fdtmNextStatement = fdtmNextStatement;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblbalance with_fstrWho(String fstrWho) {
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
  public tblbalance with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblbalance)) {
      return false;
    }
    tblbalance that = (tblbalance) o;
    boolean equal = true;
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fstrAccountType == null ? that.fstrAccountType == null : this.fstrAccountType.equals(that.fstrAccountType));
    equal = equal && (this.fcurBalance == null ? that.fcurBalance == null : this.fcurBalance.equals(that.fcurBalance));
    equal = equal && (this.fcurBalanceDelta == null ? that.fcurBalanceDelta == null : this.fcurBalanceDelta.equals(that.fcurBalanceDelta));
    equal = equal && (this.fcurDisplayBalance == null ? that.fcurDisplayBalance == null : this.fcurDisplayBalance.equals(that.fcurDisplayBalance));
    equal = equal && (this.fcurDisplayBalanceDelta == null ? that.fcurDisplayBalanceDelta == null : this.fcurDisplayBalanceDelta.equals(that.fcurDisplayBalanceDelta));
    equal = equal && (this.fdtmInBalance == null ? that.fdtmInBalance == null : this.fdtmInBalance.equals(that.fdtmInBalance));
    equal = equal && (this.fdtmBackEnd == null ? that.fdtmBackEnd == null : this.fdtmBackEnd.equals(that.fdtmBackEnd));
    equal = equal && (this.fdtmImpact == null ? that.fdtmImpact == null : this.fdtmImpact.equals(that.fdtmImpact));
    equal = equal && (this.fdtmPenalty == null ? that.fdtmPenalty == null : this.fdtmPenalty.equals(that.fdtmPenalty));
    equal = equal && (this.fdtmDelta == null ? that.fdtmDelta == null : this.fdtmDelta.equals(that.fdtmDelta));
    equal = equal && (this.fdtmInspect == null ? that.fdtmInspect == null : this.fdtmInspect.equals(that.fdtmInspect));
    equal = equal && (this.fdtmLastStatement == null ? that.fdtmLastStatement == null : this.fdtmLastStatement.equals(that.fdtmLastStatement));
    equal = equal && (this.fcurLastStatementBal == null ? that.fcurLastStatementBal == null : this.fcurLastStatementBal.equals(that.fcurLastStatementBal));
    equal = equal && (this.fblnPNIRecalc == null ? that.fblnPNIRecalc == null : this.fblnPNIRecalc.equals(that.fblnPNIRecalc));
    equal = equal && (this.fblnHoldCredits == null ? that.fblnHoldCredits == null : this.fblnHoldCredits.equals(that.fblnHoldCredits));
    equal = equal && (this.fintTransStateCount == null ? that.fintTransStateCount == null : this.fintTransStateCount.equals(that.fintTransStateCount));
    equal = equal && (this.flngTransStageCount == null ? that.flngTransStageCount == null : this.flngTransStageCount.equals(that.flngTransStageCount));
    equal = equal && (this.fdtmTransStageNext == null ? that.fdtmTransStageNext == null : this.fdtmTransStageNext.equals(that.fdtmTransStageNext));
    equal = equal && (this.fdtmCycledThru == null ? that.fdtmCycledThru == null : this.fdtmCycledThru.equals(that.fdtmCycledThru));
    equal = equal && (this.fdtmEvaluateAccount == null ? that.fdtmEvaluateAccount == null : this.fdtmEvaluateAccount.equals(that.fdtmEvaluateAccount));
    equal = equal && (this.fdtmNextStatement == null ? that.fdtmNextStatement == null : this.fdtmNextStatement.equals(that.fdtmNextStatement));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblbalance)) {
      return false;
    }
    tblbalance that = (tblbalance) o;
    boolean equal = true;
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fstrAccountType == null ? that.fstrAccountType == null : this.fstrAccountType.equals(that.fstrAccountType));
    equal = equal && (this.fcurBalance == null ? that.fcurBalance == null : this.fcurBalance.equals(that.fcurBalance));
    equal = equal && (this.fcurBalanceDelta == null ? that.fcurBalanceDelta == null : this.fcurBalanceDelta.equals(that.fcurBalanceDelta));
    equal = equal && (this.fcurDisplayBalance == null ? that.fcurDisplayBalance == null : this.fcurDisplayBalance.equals(that.fcurDisplayBalance));
    equal = equal && (this.fcurDisplayBalanceDelta == null ? that.fcurDisplayBalanceDelta == null : this.fcurDisplayBalanceDelta.equals(that.fcurDisplayBalanceDelta));
    equal = equal && (this.fdtmInBalance == null ? that.fdtmInBalance == null : this.fdtmInBalance.equals(that.fdtmInBalance));
    equal = equal && (this.fdtmBackEnd == null ? that.fdtmBackEnd == null : this.fdtmBackEnd.equals(that.fdtmBackEnd));
    equal = equal && (this.fdtmImpact == null ? that.fdtmImpact == null : this.fdtmImpact.equals(that.fdtmImpact));
    equal = equal && (this.fdtmPenalty == null ? that.fdtmPenalty == null : this.fdtmPenalty.equals(that.fdtmPenalty));
    equal = equal && (this.fdtmDelta == null ? that.fdtmDelta == null : this.fdtmDelta.equals(that.fdtmDelta));
    equal = equal && (this.fdtmInspect == null ? that.fdtmInspect == null : this.fdtmInspect.equals(that.fdtmInspect));
    equal = equal && (this.fdtmLastStatement == null ? that.fdtmLastStatement == null : this.fdtmLastStatement.equals(that.fdtmLastStatement));
    equal = equal && (this.fcurLastStatementBal == null ? that.fcurLastStatementBal == null : this.fcurLastStatementBal.equals(that.fcurLastStatementBal));
    equal = equal && (this.fblnPNIRecalc == null ? that.fblnPNIRecalc == null : this.fblnPNIRecalc.equals(that.fblnPNIRecalc));
    equal = equal && (this.fblnHoldCredits == null ? that.fblnHoldCredits == null : this.fblnHoldCredits.equals(that.fblnHoldCredits));
    equal = equal && (this.fintTransStateCount == null ? that.fintTransStateCount == null : this.fintTransStateCount.equals(that.fintTransStateCount));
    equal = equal && (this.flngTransStageCount == null ? that.flngTransStageCount == null : this.flngTransStageCount.equals(that.flngTransStageCount));
    equal = equal && (this.fdtmTransStageNext == null ? that.fdtmTransStageNext == null : this.fdtmTransStageNext.equals(that.fdtmTransStageNext));
    equal = equal && (this.fdtmCycledThru == null ? that.fdtmCycledThru == null : this.fdtmCycledThru.equals(that.fdtmCycledThru));
    equal = equal && (this.fdtmEvaluateAccount == null ? that.fdtmEvaluateAccount == null : this.fdtmEvaluateAccount.equals(that.fdtmEvaluateAccount));
    equal = equal && (this.fdtmNextStatement == null ? that.fdtmNextStatement == null : this.fdtmNextStatement.equals(that.fdtmNextStatement));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngAccountKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrAccountType = JdbcWritableBridge.readString(4, __dbResults);
    this.fcurBalance = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurBalanceDelta = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurDisplayBalance = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurDisplayBalanceDelta = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fdtmInBalance = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.fdtmBackEnd = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.fdtmImpact = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.fdtmPenalty = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.fdtmDelta = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.fdtmInspect = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.fdtmLastStatement = JdbcWritableBridge.readTimestamp(15, __dbResults);
    this.fcurLastStatementBal = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fblnPNIRecalc = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fblnHoldCredits = JdbcWritableBridge.readInteger(18, __dbResults);
    this.fintTransStateCount = JdbcWritableBridge.readInteger(19, __dbResults);
    this.flngTransStageCount = JdbcWritableBridge.readInteger(20, __dbResults);
    this.fdtmTransStageNext = JdbcWritableBridge.readTimestamp(21, __dbResults);
    this.fdtmCycledThru = JdbcWritableBridge.readTimestamp(22, __dbResults);
    this.fdtmEvaluateAccount = JdbcWritableBridge.readTimestamp(23, __dbResults);
    this.fdtmNextStatement = JdbcWritableBridge.readTimestamp(24, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(25, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(26, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngAccountKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrAccountType = JdbcWritableBridge.readString(4, __dbResults);
    this.fcurBalance = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurBalanceDelta = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurDisplayBalance = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurDisplayBalanceDelta = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fdtmInBalance = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.fdtmBackEnd = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.fdtmImpact = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.fdtmPenalty = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.fdtmDelta = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.fdtmInspect = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.fdtmLastStatement = JdbcWritableBridge.readTimestamp(15, __dbResults);
    this.fcurLastStatementBal = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fblnPNIRecalc = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fblnHoldCredits = JdbcWritableBridge.readInteger(18, __dbResults);
    this.fintTransStateCount = JdbcWritableBridge.readInteger(19, __dbResults);
    this.flngTransStageCount = JdbcWritableBridge.readInteger(20, __dbResults);
    this.fdtmTransStageNext = JdbcWritableBridge.readTimestamp(21, __dbResults);
    this.fdtmCycledThru = JdbcWritableBridge.readTimestamp(22, __dbResults);
    this.fdtmEvaluateAccount = JdbcWritableBridge.readTimestamp(23, __dbResults);
    this.fdtmNextStatement = JdbcWritableBridge.readTimestamp(24, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(25, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(26, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngAccountKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountType, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBalance, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBalanceDelta, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDisplayBalance, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDisplayBalanceDelta, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmInBalance, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmBackEnd, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmImpact, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPenalty, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDelta, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmInspect, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmLastStatement, 15 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLastStatementBal, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPNIRecalc, 17 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnHoldCredits, 18 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fintTransStateCount, 19 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngTransStageCount, 20 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmTransStageNext, 21 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCycledThru, 22 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEvaluateAccount, 23 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmNextStatement, 24 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 25 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 26 + __off, 93, __dbStmt);
    return 26;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngAccountKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountType, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBalance, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBalanceDelta, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDisplayBalance, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDisplayBalanceDelta, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmInBalance, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmBackEnd, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmImpact, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPenalty, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDelta, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmInspect, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmLastStatement, 15 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLastStatementBal, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPNIRecalc, 17 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnHoldCredits, 18 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fintTransStateCount, 19 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngTransStageCount, 20 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmTransStageNext, 21 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCycledThru, 22 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEvaluateAccount, 23 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmNextStatement, 24 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 25 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 26 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngAccountKey = null;
    } else {
    this.flngAccountKey = Integer.valueOf(__dataIn.readInt());
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
        this.fstrAccountType = null;
    } else {
    this.fstrAccountType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurBalance = null;
    } else {
    this.fcurBalance = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurBalanceDelta = null;
    } else {
    this.fcurBalanceDelta = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDisplayBalance = null;
    } else {
    this.fcurDisplayBalance = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDisplayBalanceDelta = null;
    } else {
    this.fcurDisplayBalanceDelta = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmInBalance = null;
    } else {
    this.fdtmInBalance = new Timestamp(__dataIn.readLong());
    this.fdtmInBalance.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmBackEnd = null;
    } else {
    this.fdtmBackEnd = new Timestamp(__dataIn.readLong());
    this.fdtmBackEnd.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmImpact = null;
    } else {
    this.fdtmImpact = new Timestamp(__dataIn.readLong());
    this.fdtmImpact.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmPenalty = null;
    } else {
    this.fdtmPenalty = new Timestamp(__dataIn.readLong());
    this.fdtmPenalty.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmDelta = null;
    } else {
    this.fdtmDelta = new Timestamp(__dataIn.readLong());
    this.fdtmDelta.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmInspect = null;
    } else {
    this.fdtmInspect = new Timestamp(__dataIn.readLong());
    this.fdtmInspect.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmLastStatement = null;
    } else {
    this.fdtmLastStatement = new Timestamp(__dataIn.readLong());
    this.fdtmLastStatement.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurLastStatementBal = null;
    } else {
    this.fcurLastStatementBal = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnPNIRecalc = null;
    } else {
    this.fblnPNIRecalc = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnHoldCredits = null;
    } else {
    this.fblnHoldCredits = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintTransStateCount = null;
    } else {
    this.fintTransStateCount = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngTransStageCount = null;
    } else {
    this.flngTransStageCount = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmTransStageNext = null;
    } else {
    this.fdtmTransStageNext = new Timestamp(__dataIn.readLong());
    this.fdtmTransStageNext.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmCycledThru = null;
    } else {
    this.fdtmCycledThru = new Timestamp(__dataIn.readLong());
    this.fdtmCycledThru.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmEvaluateAccount = null;
    } else {
    this.fdtmEvaluateAccount = new Timestamp(__dataIn.readLong());
    this.fdtmEvaluateAccount.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmNextStatement = null;
    } else {
    this.fdtmNextStatement = new Timestamp(__dataIn.readLong());
    this.fdtmNextStatement.setNanos(__dataIn.readInt());
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
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
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
    if (null == this.fstrAccountType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAccountType);
    }
    if (null == this.fcurBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBalance, __dataOut);
    }
    if (null == this.fcurBalanceDelta) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBalanceDelta, __dataOut);
    }
    if (null == this.fcurDisplayBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDisplayBalance, __dataOut);
    }
    if (null == this.fcurDisplayBalanceDelta) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDisplayBalanceDelta, __dataOut);
    }
    if (null == this.fdtmInBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmInBalance.getTime());
    __dataOut.writeInt(this.fdtmInBalance.getNanos());
    }
    if (null == this.fdtmBackEnd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmBackEnd.getTime());
    __dataOut.writeInt(this.fdtmBackEnd.getNanos());
    }
    if (null == this.fdtmImpact) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmImpact.getTime());
    __dataOut.writeInt(this.fdtmImpact.getNanos());
    }
    if (null == this.fdtmPenalty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPenalty.getTime());
    __dataOut.writeInt(this.fdtmPenalty.getNanos());
    }
    if (null == this.fdtmDelta) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDelta.getTime());
    __dataOut.writeInt(this.fdtmDelta.getNanos());
    }
    if (null == this.fdtmInspect) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmInspect.getTime());
    __dataOut.writeInt(this.fdtmInspect.getNanos());
    }
    if (null == this.fdtmLastStatement) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmLastStatement.getTime());
    __dataOut.writeInt(this.fdtmLastStatement.getNanos());
    }
    if (null == this.fcurLastStatementBal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLastStatementBal, __dataOut);
    }
    if (null == this.fblnPNIRecalc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPNIRecalc);
    }
    if (null == this.fblnHoldCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnHoldCredits);
    }
    if (null == this.fintTransStateCount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintTransStateCount);
    }
    if (null == this.flngTransStageCount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTransStageCount);
    }
    if (null == this.fdtmTransStageNext) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmTransStageNext.getTime());
    __dataOut.writeInt(this.fdtmTransStageNext.getNanos());
    }
    if (null == this.fdtmCycledThru) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCycledThru.getTime());
    __dataOut.writeInt(this.fdtmCycledThru.getNanos());
    }
    if (null == this.fdtmEvaluateAccount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEvaluateAccount.getTime());
    __dataOut.writeInt(this.fdtmEvaluateAccount.getNanos());
    }
    if (null == this.fdtmNextStatement) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmNextStatement.getTime());
    __dataOut.writeInt(this.fdtmNextStatement.getNanos());
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
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
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
    if (null == this.fstrAccountType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAccountType);
    }
    if (null == this.fcurBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBalance, __dataOut);
    }
    if (null == this.fcurBalanceDelta) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBalanceDelta, __dataOut);
    }
    if (null == this.fcurDisplayBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDisplayBalance, __dataOut);
    }
    if (null == this.fcurDisplayBalanceDelta) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDisplayBalanceDelta, __dataOut);
    }
    if (null == this.fdtmInBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmInBalance.getTime());
    __dataOut.writeInt(this.fdtmInBalance.getNanos());
    }
    if (null == this.fdtmBackEnd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmBackEnd.getTime());
    __dataOut.writeInt(this.fdtmBackEnd.getNanos());
    }
    if (null == this.fdtmImpact) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmImpact.getTime());
    __dataOut.writeInt(this.fdtmImpact.getNanos());
    }
    if (null == this.fdtmPenalty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPenalty.getTime());
    __dataOut.writeInt(this.fdtmPenalty.getNanos());
    }
    if (null == this.fdtmDelta) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDelta.getTime());
    __dataOut.writeInt(this.fdtmDelta.getNanos());
    }
    if (null == this.fdtmInspect) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmInspect.getTime());
    __dataOut.writeInt(this.fdtmInspect.getNanos());
    }
    if (null == this.fdtmLastStatement) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmLastStatement.getTime());
    __dataOut.writeInt(this.fdtmLastStatement.getNanos());
    }
    if (null == this.fcurLastStatementBal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLastStatementBal, __dataOut);
    }
    if (null == this.fblnPNIRecalc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPNIRecalc);
    }
    if (null == this.fblnHoldCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnHoldCredits);
    }
    if (null == this.fintTransStateCount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintTransStateCount);
    }
    if (null == this.flngTransStageCount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTransStageCount);
    }
    if (null == this.fdtmTransStageNext) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmTransStageNext.getTime());
    __dataOut.writeInt(this.fdtmTransStageNext.getNanos());
    }
    if (null == this.fdtmCycledThru) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCycledThru.getTime());
    __dataOut.writeInt(this.fdtmCycledThru.getNanos());
    }
    if (null == this.fdtmEvaluateAccount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEvaluateAccount.getTime());
    __dataOut.writeInt(this.fdtmEvaluateAccount.getNanos());
    }
    if (null == this.fdtmNextStatement) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmNextStatement.getTime());
    __dataOut.writeInt(this.fdtmNextStatement.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAccountType==null?"\\N":fstrAccountType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBalance==null?"\\N":fcurBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBalanceDelta==null?"\\N":fcurBalanceDelta.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDisplayBalance==null?"\\N":fcurDisplayBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDisplayBalanceDelta==null?"\\N":fcurDisplayBalanceDelta.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmInBalance==null?"\\N":"" + fdtmInBalance, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmBackEnd==null?"\\N":"" + fdtmBackEnd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmImpact==null?"\\N":"" + fdtmImpact, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPenalty==null?"\\N":"" + fdtmPenalty, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDelta==null?"\\N":"" + fdtmDelta, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmInspect==null?"\\N":"" + fdtmInspect, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmLastStatement==null?"\\N":"" + fdtmLastStatement, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLastStatementBal==null?"\\N":fcurLastStatementBal.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPNIRecalc==null?"\\N":"" + fblnPNIRecalc, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnHoldCredits==null?"\\N":"" + fblnHoldCredits, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintTransStateCount==null?"\\N":"" + fintTransStateCount, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngTransStageCount==null?"\\N":"" + flngTransStageCount, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmTransStageNext==null?"\\N":"" + fdtmTransStageNext, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCycledThru==null?"\\N":"" + fdtmCycledThru, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEvaluateAccount==null?"\\N":"" + fdtmEvaluateAccount, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmNextStatement==null?"\\N":"" + fdtmNextStatement, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAccountType==null?"\\N":fstrAccountType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBalance==null?"\\N":fcurBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBalanceDelta==null?"\\N":fcurBalanceDelta.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDisplayBalance==null?"\\N":fcurDisplayBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDisplayBalanceDelta==null?"\\N":fcurDisplayBalanceDelta.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmInBalance==null?"\\N":"" + fdtmInBalance, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmBackEnd==null?"\\N":"" + fdtmBackEnd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmImpact==null?"\\N":"" + fdtmImpact, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPenalty==null?"\\N":"" + fdtmPenalty, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDelta==null?"\\N":"" + fdtmDelta, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmInspect==null?"\\N":"" + fdtmInspect, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmLastStatement==null?"\\N":"" + fdtmLastStatement, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLastStatementBal==null?"\\N":fcurLastStatementBal.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPNIRecalc==null?"\\N":"" + fblnPNIRecalc, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnHoldCredits==null?"\\N":"" + fblnHoldCredits, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintTransStateCount==null?"\\N":"" + fintTransStateCount, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngTransStageCount==null?"\\N":"" + flngTransStageCount, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmTransStageNext==null?"\\N":"" + fdtmTransStageNext, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCycledThru==null?"\\N":"" + fdtmCycledThru, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEvaluateAccount==null?"\\N":"" + fdtmEvaluateAccount, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmNextStatement==null?"\\N":"" + fdtmNextStatement, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAccountKey = null; } else {
      this.flngAccountKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrAccountType = null; } else {
      this.fstrAccountType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBalance = null; } else {
      this.fcurBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBalanceDelta = null; } else {
      this.fcurBalanceDelta = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDisplayBalance = null; } else {
      this.fcurDisplayBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDisplayBalanceDelta = null; } else {
      this.fcurDisplayBalanceDelta = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmInBalance = null; } else {
      this.fdtmInBalance = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmBackEnd = null; } else {
      this.fdtmBackEnd = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmImpact = null; } else {
      this.fdtmImpact = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPenalty = null; } else {
      this.fdtmPenalty = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDelta = null; } else {
      this.fdtmDelta = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmInspect = null; } else {
      this.fdtmInspect = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmLastStatement = null; } else {
      this.fdtmLastStatement = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLastStatementBal = null; } else {
      this.fcurLastStatementBal = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPNIRecalc = null; } else {
      this.fblnPNIRecalc = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnHoldCredits = null; } else {
      this.fblnHoldCredits = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintTransStateCount = null; } else {
      this.fintTransStateCount = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTransStageCount = null; } else {
      this.flngTransStageCount = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmTransStageNext = null; } else {
      this.fdtmTransStageNext = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCycledThru = null; } else {
      this.fdtmCycledThru = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmEvaluateAccount = null; } else {
      this.fdtmEvaluateAccount = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmNextStatement = null; } else {
      this.fdtmNextStatement = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAccountKey = null; } else {
      this.flngAccountKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrAccountType = null; } else {
      this.fstrAccountType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBalance = null; } else {
      this.fcurBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBalanceDelta = null; } else {
      this.fcurBalanceDelta = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDisplayBalance = null; } else {
      this.fcurDisplayBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDisplayBalanceDelta = null; } else {
      this.fcurDisplayBalanceDelta = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmInBalance = null; } else {
      this.fdtmInBalance = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmBackEnd = null; } else {
      this.fdtmBackEnd = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmImpact = null; } else {
      this.fdtmImpact = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPenalty = null; } else {
      this.fdtmPenalty = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDelta = null; } else {
      this.fdtmDelta = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmInspect = null; } else {
      this.fdtmInspect = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmLastStatement = null; } else {
      this.fdtmLastStatement = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLastStatementBal = null; } else {
      this.fcurLastStatementBal = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPNIRecalc = null; } else {
      this.fblnPNIRecalc = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnHoldCredits = null; } else {
      this.fblnHoldCredits = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintTransStateCount = null; } else {
      this.fintTransStateCount = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTransStageCount = null; } else {
      this.flngTransStageCount = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmTransStageNext = null; } else {
      this.fdtmTransStageNext = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCycledThru = null; } else {
      this.fdtmCycledThru = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmEvaluateAccount = null; } else {
      this.fdtmEvaluateAccount = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmNextStatement = null; } else {
      this.fdtmNextStatement = java.sql.Timestamp.valueOf(__cur_str);
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
    tblbalance o = (tblbalance) super.clone();
    o.fdtmInBalance = (o.fdtmInBalance != null) ? (java.sql.Timestamp) o.fdtmInBalance.clone() : null;
    o.fdtmBackEnd = (o.fdtmBackEnd != null) ? (java.sql.Timestamp) o.fdtmBackEnd.clone() : null;
    o.fdtmImpact = (o.fdtmImpact != null) ? (java.sql.Timestamp) o.fdtmImpact.clone() : null;
    o.fdtmPenalty = (o.fdtmPenalty != null) ? (java.sql.Timestamp) o.fdtmPenalty.clone() : null;
    o.fdtmDelta = (o.fdtmDelta != null) ? (java.sql.Timestamp) o.fdtmDelta.clone() : null;
    o.fdtmInspect = (o.fdtmInspect != null) ? (java.sql.Timestamp) o.fdtmInspect.clone() : null;
    o.fdtmLastStatement = (o.fdtmLastStatement != null) ? (java.sql.Timestamp) o.fdtmLastStatement.clone() : null;
    o.fdtmTransStageNext = (o.fdtmTransStageNext != null) ? (java.sql.Timestamp) o.fdtmTransStageNext.clone() : null;
    o.fdtmCycledThru = (o.fdtmCycledThru != null) ? (java.sql.Timestamp) o.fdtmCycledThru.clone() : null;
    o.fdtmEvaluateAccount = (o.fdtmEvaluateAccount != null) ? (java.sql.Timestamp) o.fdtmEvaluateAccount.clone() : null;
    o.fdtmNextStatement = (o.fdtmNextStatement != null) ? (java.sql.Timestamp) o.fdtmNextStatement.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblbalance o) throws CloneNotSupportedException {
    o.fdtmInBalance = (o.fdtmInBalance != null) ? (java.sql.Timestamp) o.fdtmInBalance.clone() : null;
    o.fdtmBackEnd = (o.fdtmBackEnd != null) ? (java.sql.Timestamp) o.fdtmBackEnd.clone() : null;
    o.fdtmImpact = (o.fdtmImpact != null) ? (java.sql.Timestamp) o.fdtmImpact.clone() : null;
    o.fdtmPenalty = (o.fdtmPenalty != null) ? (java.sql.Timestamp) o.fdtmPenalty.clone() : null;
    o.fdtmDelta = (o.fdtmDelta != null) ? (java.sql.Timestamp) o.fdtmDelta.clone() : null;
    o.fdtmInspect = (o.fdtmInspect != null) ? (java.sql.Timestamp) o.fdtmInspect.clone() : null;
    o.fdtmLastStatement = (o.fdtmLastStatement != null) ? (java.sql.Timestamp) o.fdtmLastStatement.clone() : null;
    o.fdtmTransStageNext = (o.fdtmTransStageNext != null) ? (java.sql.Timestamp) o.fdtmTransStageNext.clone() : null;
    o.fdtmCycledThru = (o.fdtmCycledThru != null) ? (java.sql.Timestamp) o.fdtmCycledThru.clone() : null;
    o.fdtmEvaluateAccount = (o.fdtmEvaluateAccount != null) ? (java.sql.Timestamp) o.fdtmEvaluateAccount.clone() : null;
    o.fdtmNextStatement = (o.fdtmNextStatement != null) ? (java.sql.Timestamp) o.fdtmNextStatement.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fstrAccountType", this.fstrAccountType);
    __sqoop$field_map.put("fcurBalance", this.fcurBalance);
    __sqoop$field_map.put("fcurBalanceDelta", this.fcurBalanceDelta);
    __sqoop$field_map.put("fcurDisplayBalance", this.fcurDisplayBalance);
    __sqoop$field_map.put("fcurDisplayBalanceDelta", this.fcurDisplayBalanceDelta);
    __sqoop$field_map.put("fdtmInBalance", this.fdtmInBalance);
    __sqoop$field_map.put("fdtmBackEnd", this.fdtmBackEnd);
    __sqoop$field_map.put("fdtmImpact", this.fdtmImpact);
    __sqoop$field_map.put("fdtmPenalty", this.fdtmPenalty);
    __sqoop$field_map.put("fdtmDelta", this.fdtmDelta);
    __sqoop$field_map.put("fdtmInspect", this.fdtmInspect);
    __sqoop$field_map.put("fdtmLastStatement", this.fdtmLastStatement);
    __sqoop$field_map.put("fcurLastStatementBal", this.fcurLastStatementBal);
    __sqoop$field_map.put("fblnPNIRecalc", this.fblnPNIRecalc);
    __sqoop$field_map.put("fblnHoldCredits", this.fblnHoldCredits);
    __sqoop$field_map.put("fintTransStateCount", this.fintTransStateCount);
    __sqoop$field_map.put("flngTransStageCount", this.flngTransStageCount);
    __sqoop$field_map.put("fdtmTransStageNext", this.fdtmTransStageNext);
    __sqoop$field_map.put("fdtmCycledThru", this.fdtmCycledThru);
    __sqoop$field_map.put("fdtmEvaluateAccount", this.fdtmEvaluateAccount);
    __sqoop$field_map.put("fdtmNextStatement", this.fdtmNextStatement);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fstrAccountType", this.fstrAccountType);
    __sqoop$field_map.put("fcurBalance", this.fcurBalance);
    __sqoop$field_map.put("fcurBalanceDelta", this.fcurBalanceDelta);
    __sqoop$field_map.put("fcurDisplayBalance", this.fcurDisplayBalance);
    __sqoop$field_map.put("fcurDisplayBalanceDelta", this.fcurDisplayBalanceDelta);
    __sqoop$field_map.put("fdtmInBalance", this.fdtmInBalance);
    __sqoop$field_map.put("fdtmBackEnd", this.fdtmBackEnd);
    __sqoop$field_map.put("fdtmImpact", this.fdtmImpact);
    __sqoop$field_map.put("fdtmPenalty", this.fdtmPenalty);
    __sqoop$field_map.put("fdtmDelta", this.fdtmDelta);
    __sqoop$field_map.put("fdtmInspect", this.fdtmInspect);
    __sqoop$field_map.put("fdtmLastStatement", this.fdtmLastStatement);
    __sqoop$field_map.put("fcurLastStatementBal", this.fcurLastStatementBal);
    __sqoop$field_map.put("fblnPNIRecalc", this.fblnPNIRecalc);
    __sqoop$field_map.put("fblnHoldCredits", this.fblnHoldCredits);
    __sqoop$field_map.put("fintTransStateCount", this.fintTransStateCount);
    __sqoop$field_map.put("flngTransStageCount", this.flngTransStageCount);
    __sqoop$field_map.put("fdtmTransStageNext", this.fdtmTransStageNext);
    __sqoop$field_map.put("fdtmCycledThru", this.fdtmCycledThru);
    __sqoop$field_map.put("fdtmEvaluateAccount", this.fdtmEvaluateAccount);
    __sqoop$field_map.put("fdtmNextStatement", this.fdtmNextStatement);
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
