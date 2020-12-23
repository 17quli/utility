// ORM class for table 'tblperiodbillitem'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed Dec 09 16:05:24 NZDT 2020
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

public class tblperiodbillitem extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngBillItemKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiodbillitem.this.flngBillItemKey = (Integer)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiodbillitem.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiodbillitem.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("flngAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiodbillitem.this.flngAccountKey = (Integer)value;
      }
    });
    setters.put("fdtmFilingPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiodbillitem.this.fdtmFilingPeriod = (java.sql.Timestamp)value;
      }
    });
    setters.put("fintBillItem", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiodbillitem.this.fintBillItem = (Integer)value;
      }
    });
    setters.put("fstrBillType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiodbillitem.this.fstrBillType = (String)value;
      }
    });
    setters.put("fdtmCreated", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiodbillitem.this.fdtmCreated = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmDue", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiodbillitem.this.fdtmDue = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrStage", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiodbillitem.this.fstrStage = (String)value;
      }
    });
    setters.put("fdtmStaged", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiodbillitem.this.fdtmStaged = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrPriorStage", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiodbillitem.this.fstrPriorStage = (String)value;
      }
    });
    setters.put("fdtmPriorStaged", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiodbillitem.this.fdtmPriorStaged = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmNextStageEval", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiodbillitem.this.fdtmNextStageEval = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmClosed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiodbillitem.this.fdtmClosed = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmProtest", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiodbillitem.this.fdtmProtest = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmFinalized", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiodbillitem.this.fdtmFinalized = (java.sql.Timestamp)value;
      }
    });
    setters.put("fcurTax", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiodbillitem.this.fcurTax = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxBalance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiodbillitem.this.fcurTaxBalance = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxDelta", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiodbillitem.this.fcurTaxDelta = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurInterest", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiodbillitem.this.fcurInterest = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurInterestBalance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiodbillitem.this.fcurInterestBalance = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurInterestDelta", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiodbillitem.this.fcurInterestDelta = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPenalty", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiodbillitem.this.fcurPenalty = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPenaltyBalance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiodbillitem.this.fcurPenaltyBalance = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPenaltyDelta", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiodbillitem.this.fcurPenaltyDelta = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOther", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiodbillitem.this.fcurOther = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOtherBalance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiodbillitem.this.fcurOtherBalance = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOtherDelta", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiodbillitem.this.fcurOtherDelta = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurCredit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiodbillitem.this.fcurCredit = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurCreditDelta", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiodbillitem.this.fcurCreditDelta = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurBalance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiodbillitem.this.fcurBalance = (java.math.BigDecimal)value;
      }
    });
    setters.put("fdtmBillActivity", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiodbillitem.this.fdtmBillActivity = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmPenalty", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiodbillitem.this.fdtmPenalty = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmDelta", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiodbillitem.this.fdtmDelta = (java.sql.Timestamp)value;
      }
    });
    setters.put("flngCollectKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiodbillitem.this.flngCollectKey = (Integer)value;
      }
    });
    setters.put("fintTransactionCount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiodbillitem.this.fintTransactionCount = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiodbillitem.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblperiodbillitem.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblperiodbillitem() {
    init0();
  }
  private Integer flngBillItemKey;
  public Integer get_flngBillItemKey() {
    return flngBillItemKey;
  }
  public void set_flngBillItemKey(Integer flngBillItemKey) {
    this.flngBillItemKey = flngBillItemKey;
  }
  public tblperiodbillitem with_flngBillItemKey(Integer flngBillItemKey) {
    this.flngBillItemKey = flngBillItemKey;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblperiodbillitem with_flngVer(Integer flngVer) {
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
  public tblperiodbillitem with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private Integer flngAccountKey;
  public Integer get_flngAccountKey() {
    return flngAccountKey;
  }
  public void set_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
  }
  public tblperiodbillitem with_flngAccountKey(Integer flngAccountKey) {
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
  public tblperiodbillitem with_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
    return this;
  }
  private Integer fintBillItem;
  public Integer get_fintBillItem() {
    return fintBillItem;
  }
  public void set_fintBillItem(Integer fintBillItem) {
    this.fintBillItem = fintBillItem;
  }
  public tblperiodbillitem with_fintBillItem(Integer fintBillItem) {
    this.fintBillItem = fintBillItem;
    return this;
  }
  private String fstrBillType;
  public String get_fstrBillType() {
    return fstrBillType;
  }
  public void set_fstrBillType(String fstrBillType) {
    this.fstrBillType = fstrBillType;
  }
  public tblperiodbillitem with_fstrBillType(String fstrBillType) {
    this.fstrBillType = fstrBillType;
    return this;
  }
  private java.sql.Timestamp fdtmCreated;
  public java.sql.Timestamp get_fdtmCreated() {
    return fdtmCreated;
  }
  public void set_fdtmCreated(java.sql.Timestamp fdtmCreated) {
    this.fdtmCreated = fdtmCreated;
  }
  public tblperiodbillitem with_fdtmCreated(java.sql.Timestamp fdtmCreated) {
    this.fdtmCreated = fdtmCreated;
    return this;
  }
  private java.sql.Timestamp fdtmDue;
  public java.sql.Timestamp get_fdtmDue() {
    return fdtmDue;
  }
  public void set_fdtmDue(java.sql.Timestamp fdtmDue) {
    this.fdtmDue = fdtmDue;
  }
  public tblperiodbillitem with_fdtmDue(java.sql.Timestamp fdtmDue) {
    this.fdtmDue = fdtmDue;
    return this;
  }
  private String fstrStage;
  public String get_fstrStage() {
    return fstrStage;
  }
  public void set_fstrStage(String fstrStage) {
    this.fstrStage = fstrStage;
  }
  public tblperiodbillitem with_fstrStage(String fstrStage) {
    this.fstrStage = fstrStage;
    return this;
  }
  private java.sql.Timestamp fdtmStaged;
  public java.sql.Timestamp get_fdtmStaged() {
    return fdtmStaged;
  }
  public void set_fdtmStaged(java.sql.Timestamp fdtmStaged) {
    this.fdtmStaged = fdtmStaged;
  }
  public tblperiodbillitem with_fdtmStaged(java.sql.Timestamp fdtmStaged) {
    this.fdtmStaged = fdtmStaged;
    return this;
  }
  private String fstrPriorStage;
  public String get_fstrPriorStage() {
    return fstrPriorStage;
  }
  public void set_fstrPriorStage(String fstrPriorStage) {
    this.fstrPriorStage = fstrPriorStage;
  }
  public tblperiodbillitem with_fstrPriorStage(String fstrPriorStage) {
    this.fstrPriorStage = fstrPriorStage;
    return this;
  }
  private java.sql.Timestamp fdtmPriorStaged;
  public java.sql.Timestamp get_fdtmPriorStaged() {
    return fdtmPriorStaged;
  }
  public void set_fdtmPriorStaged(java.sql.Timestamp fdtmPriorStaged) {
    this.fdtmPriorStaged = fdtmPriorStaged;
  }
  public tblperiodbillitem with_fdtmPriorStaged(java.sql.Timestamp fdtmPriorStaged) {
    this.fdtmPriorStaged = fdtmPriorStaged;
    return this;
  }
  private java.sql.Timestamp fdtmNextStageEval;
  public java.sql.Timestamp get_fdtmNextStageEval() {
    return fdtmNextStageEval;
  }
  public void set_fdtmNextStageEval(java.sql.Timestamp fdtmNextStageEval) {
    this.fdtmNextStageEval = fdtmNextStageEval;
  }
  public tblperiodbillitem with_fdtmNextStageEval(java.sql.Timestamp fdtmNextStageEval) {
    this.fdtmNextStageEval = fdtmNextStageEval;
    return this;
  }
  private java.sql.Timestamp fdtmClosed;
  public java.sql.Timestamp get_fdtmClosed() {
    return fdtmClosed;
  }
  public void set_fdtmClosed(java.sql.Timestamp fdtmClosed) {
    this.fdtmClosed = fdtmClosed;
  }
  public tblperiodbillitem with_fdtmClosed(java.sql.Timestamp fdtmClosed) {
    this.fdtmClosed = fdtmClosed;
    return this;
  }
  private java.sql.Timestamp fdtmProtest;
  public java.sql.Timestamp get_fdtmProtest() {
    return fdtmProtest;
  }
  public void set_fdtmProtest(java.sql.Timestamp fdtmProtest) {
    this.fdtmProtest = fdtmProtest;
  }
  public tblperiodbillitem with_fdtmProtest(java.sql.Timestamp fdtmProtest) {
    this.fdtmProtest = fdtmProtest;
    return this;
  }
  private java.sql.Timestamp fdtmFinalized;
  public java.sql.Timestamp get_fdtmFinalized() {
    return fdtmFinalized;
  }
  public void set_fdtmFinalized(java.sql.Timestamp fdtmFinalized) {
    this.fdtmFinalized = fdtmFinalized;
  }
  public tblperiodbillitem with_fdtmFinalized(java.sql.Timestamp fdtmFinalized) {
    this.fdtmFinalized = fdtmFinalized;
    return this;
  }
  private java.math.BigDecimal fcurTax;
  public java.math.BigDecimal get_fcurTax() {
    return fcurTax;
  }
  public void set_fcurTax(java.math.BigDecimal fcurTax) {
    this.fcurTax = fcurTax;
  }
  public tblperiodbillitem with_fcurTax(java.math.BigDecimal fcurTax) {
    this.fcurTax = fcurTax;
    return this;
  }
  private java.math.BigDecimal fcurTaxBalance;
  public java.math.BigDecimal get_fcurTaxBalance() {
    return fcurTaxBalance;
  }
  public void set_fcurTaxBalance(java.math.BigDecimal fcurTaxBalance) {
    this.fcurTaxBalance = fcurTaxBalance;
  }
  public tblperiodbillitem with_fcurTaxBalance(java.math.BigDecimal fcurTaxBalance) {
    this.fcurTaxBalance = fcurTaxBalance;
    return this;
  }
  private java.math.BigDecimal fcurTaxDelta;
  public java.math.BigDecimal get_fcurTaxDelta() {
    return fcurTaxDelta;
  }
  public void set_fcurTaxDelta(java.math.BigDecimal fcurTaxDelta) {
    this.fcurTaxDelta = fcurTaxDelta;
  }
  public tblperiodbillitem with_fcurTaxDelta(java.math.BigDecimal fcurTaxDelta) {
    this.fcurTaxDelta = fcurTaxDelta;
    return this;
  }
  private java.math.BigDecimal fcurInterest;
  public java.math.BigDecimal get_fcurInterest() {
    return fcurInterest;
  }
  public void set_fcurInterest(java.math.BigDecimal fcurInterest) {
    this.fcurInterest = fcurInterest;
  }
  public tblperiodbillitem with_fcurInterest(java.math.BigDecimal fcurInterest) {
    this.fcurInterest = fcurInterest;
    return this;
  }
  private java.math.BigDecimal fcurInterestBalance;
  public java.math.BigDecimal get_fcurInterestBalance() {
    return fcurInterestBalance;
  }
  public void set_fcurInterestBalance(java.math.BigDecimal fcurInterestBalance) {
    this.fcurInterestBalance = fcurInterestBalance;
  }
  public tblperiodbillitem with_fcurInterestBalance(java.math.BigDecimal fcurInterestBalance) {
    this.fcurInterestBalance = fcurInterestBalance;
    return this;
  }
  private java.math.BigDecimal fcurInterestDelta;
  public java.math.BigDecimal get_fcurInterestDelta() {
    return fcurInterestDelta;
  }
  public void set_fcurInterestDelta(java.math.BigDecimal fcurInterestDelta) {
    this.fcurInterestDelta = fcurInterestDelta;
  }
  public tblperiodbillitem with_fcurInterestDelta(java.math.BigDecimal fcurInterestDelta) {
    this.fcurInterestDelta = fcurInterestDelta;
    return this;
  }
  private java.math.BigDecimal fcurPenalty;
  public java.math.BigDecimal get_fcurPenalty() {
    return fcurPenalty;
  }
  public void set_fcurPenalty(java.math.BigDecimal fcurPenalty) {
    this.fcurPenalty = fcurPenalty;
  }
  public tblperiodbillitem with_fcurPenalty(java.math.BigDecimal fcurPenalty) {
    this.fcurPenalty = fcurPenalty;
    return this;
  }
  private java.math.BigDecimal fcurPenaltyBalance;
  public java.math.BigDecimal get_fcurPenaltyBalance() {
    return fcurPenaltyBalance;
  }
  public void set_fcurPenaltyBalance(java.math.BigDecimal fcurPenaltyBalance) {
    this.fcurPenaltyBalance = fcurPenaltyBalance;
  }
  public tblperiodbillitem with_fcurPenaltyBalance(java.math.BigDecimal fcurPenaltyBalance) {
    this.fcurPenaltyBalance = fcurPenaltyBalance;
    return this;
  }
  private java.math.BigDecimal fcurPenaltyDelta;
  public java.math.BigDecimal get_fcurPenaltyDelta() {
    return fcurPenaltyDelta;
  }
  public void set_fcurPenaltyDelta(java.math.BigDecimal fcurPenaltyDelta) {
    this.fcurPenaltyDelta = fcurPenaltyDelta;
  }
  public tblperiodbillitem with_fcurPenaltyDelta(java.math.BigDecimal fcurPenaltyDelta) {
    this.fcurPenaltyDelta = fcurPenaltyDelta;
    return this;
  }
  private java.math.BigDecimal fcurOther;
  public java.math.BigDecimal get_fcurOther() {
    return fcurOther;
  }
  public void set_fcurOther(java.math.BigDecimal fcurOther) {
    this.fcurOther = fcurOther;
  }
  public tblperiodbillitem with_fcurOther(java.math.BigDecimal fcurOther) {
    this.fcurOther = fcurOther;
    return this;
  }
  private java.math.BigDecimal fcurOtherBalance;
  public java.math.BigDecimal get_fcurOtherBalance() {
    return fcurOtherBalance;
  }
  public void set_fcurOtherBalance(java.math.BigDecimal fcurOtherBalance) {
    this.fcurOtherBalance = fcurOtherBalance;
  }
  public tblperiodbillitem with_fcurOtherBalance(java.math.BigDecimal fcurOtherBalance) {
    this.fcurOtherBalance = fcurOtherBalance;
    return this;
  }
  private java.math.BigDecimal fcurOtherDelta;
  public java.math.BigDecimal get_fcurOtherDelta() {
    return fcurOtherDelta;
  }
  public void set_fcurOtherDelta(java.math.BigDecimal fcurOtherDelta) {
    this.fcurOtherDelta = fcurOtherDelta;
  }
  public tblperiodbillitem with_fcurOtherDelta(java.math.BigDecimal fcurOtherDelta) {
    this.fcurOtherDelta = fcurOtherDelta;
    return this;
  }
  private java.math.BigDecimal fcurCredit;
  public java.math.BigDecimal get_fcurCredit() {
    return fcurCredit;
  }
  public void set_fcurCredit(java.math.BigDecimal fcurCredit) {
    this.fcurCredit = fcurCredit;
  }
  public tblperiodbillitem with_fcurCredit(java.math.BigDecimal fcurCredit) {
    this.fcurCredit = fcurCredit;
    return this;
  }
  private java.math.BigDecimal fcurCreditDelta;
  public java.math.BigDecimal get_fcurCreditDelta() {
    return fcurCreditDelta;
  }
  public void set_fcurCreditDelta(java.math.BigDecimal fcurCreditDelta) {
    this.fcurCreditDelta = fcurCreditDelta;
  }
  public tblperiodbillitem with_fcurCreditDelta(java.math.BigDecimal fcurCreditDelta) {
    this.fcurCreditDelta = fcurCreditDelta;
    return this;
  }
  private java.math.BigDecimal fcurBalance;
  public java.math.BigDecimal get_fcurBalance() {
    return fcurBalance;
  }
  public void set_fcurBalance(java.math.BigDecimal fcurBalance) {
    this.fcurBalance = fcurBalance;
  }
  public tblperiodbillitem with_fcurBalance(java.math.BigDecimal fcurBalance) {
    this.fcurBalance = fcurBalance;
    return this;
  }
  private java.sql.Timestamp fdtmBillActivity;
  public java.sql.Timestamp get_fdtmBillActivity() {
    return fdtmBillActivity;
  }
  public void set_fdtmBillActivity(java.sql.Timestamp fdtmBillActivity) {
    this.fdtmBillActivity = fdtmBillActivity;
  }
  public tblperiodbillitem with_fdtmBillActivity(java.sql.Timestamp fdtmBillActivity) {
    this.fdtmBillActivity = fdtmBillActivity;
    return this;
  }
  private java.sql.Timestamp fdtmPenalty;
  public java.sql.Timestamp get_fdtmPenalty() {
    return fdtmPenalty;
  }
  public void set_fdtmPenalty(java.sql.Timestamp fdtmPenalty) {
    this.fdtmPenalty = fdtmPenalty;
  }
  public tblperiodbillitem with_fdtmPenalty(java.sql.Timestamp fdtmPenalty) {
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
  public tblperiodbillitem with_fdtmDelta(java.sql.Timestamp fdtmDelta) {
    this.fdtmDelta = fdtmDelta;
    return this;
  }
  private Integer flngCollectKey;
  public Integer get_flngCollectKey() {
    return flngCollectKey;
  }
  public void set_flngCollectKey(Integer flngCollectKey) {
    this.flngCollectKey = flngCollectKey;
  }
  public tblperiodbillitem with_flngCollectKey(Integer flngCollectKey) {
    this.flngCollectKey = flngCollectKey;
    return this;
  }
  private Integer fintTransactionCount;
  public Integer get_fintTransactionCount() {
    return fintTransactionCount;
  }
  public void set_fintTransactionCount(Integer fintTransactionCount) {
    this.fintTransactionCount = fintTransactionCount;
  }
  public tblperiodbillitem with_fintTransactionCount(Integer fintTransactionCount) {
    this.fintTransactionCount = fintTransactionCount;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblperiodbillitem with_fstrWho(String fstrWho) {
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
  public tblperiodbillitem with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblperiodbillitem)) {
      return false;
    }
    tblperiodbillitem that = (tblperiodbillitem) o;
    boolean equal = true;
    equal = equal && (this.flngBillItemKey == null ? that.flngBillItemKey == null : this.flngBillItemKey.equals(that.flngBillItemKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.fintBillItem == null ? that.fintBillItem == null : this.fintBillItem.equals(that.fintBillItem));
    equal = equal && (this.fstrBillType == null ? that.fstrBillType == null : this.fstrBillType.equals(that.fstrBillType));
    equal = equal && (this.fdtmCreated == null ? that.fdtmCreated == null : this.fdtmCreated.equals(that.fdtmCreated));
    equal = equal && (this.fdtmDue == null ? that.fdtmDue == null : this.fdtmDue.equals(that.fdtmDue));
    equal = equal && (this.fstrStage == null ? that.fstrStage == null : this.fstrStage.equals(that.fstrStage));
    equal = equal && (this.fdtmStaged == null ? that.fdtmStaged == null : this.fdtmStaged.equals(that.fdtmStaged));
    equal = equal && (this.fstrPriorStage == null ? that.fstrPriorStage == null : this.fstrPriorStage.equals(that.fstrPriorStage));
    equal = equal && (this.fdtmPriorStaged == null ? that.fdtmPriorStaged == null : this.fdtmPriorStaged.equals(that.fdtmPriorStaged));
    equal = equal && (this.fdtmNextStageEval == null ? that.fdtmNextStageEval == null : this.fdtmNextStageEval.equals(that.fdtmNextStageEval));
    equal = equal && (this.fdtmClosed == null ? that.fdtmClosed == null : this.fdtmClosed.equals(that.fdtmClosed));
    equal = equal && (this.fdtmProtest == null ? that.fdtmProtest == null : this.fdtmProtest.equals(that.fdtmProtest));
    equal = equal && (this.fdtmFinalized == null ? that.fdtmFinalized == null : this.fdtmFinalized.equals(that.fdtmFinalized));
    equal = equal && (this.fcurTax == null ? that.fcurTax == null : this.fcurTax.equals(that.fcurTax));
    equal = equal && (this.fcurTaxBalance == null ? that.fcurTaxBalance == null : this.fcurTaxBalance.equals(that.fcurTaxBalance));
    equal = equal && (this.fcurTaxDelta == null ? that.fcurTaxDelta == null : this.fcurTaxDelta.equals(that.fcurTaxDelta));
    equal = equal && (this.fcurInterest == null ? that.fcurInterest == null : this.fcurInterest.equals(that.fcurInterest));
    equal = equal && (this.fcurInterestBalance == null ? that.fcurInterestBalance == null : this.fcurInterestBalance.equals(that.fcurInterestBalance));
    equal = equal && (this.fcurInterestDelta == null ? that.fcurInterestDelta == null : this.fcurInterestDelta.equals(that.fcurInterestDelta));
    equal = equal && (this.fcurPenalty == null ? that.fcurPenalty == null : this.fcurPenalty.equals(that.fcurPenalty));
    equal = equal && (this.fcurPenaltyBalance == null ? that.fcurPenaltyBalance == null : this.fcurPenaltyBalance.equals(that.fcurPenaltyBalance));
    equal = equal && (this.fcurPenaltyDelta == null ? that.fcurPenaltyDelta == null : this.fcurPenaltyDelta.equals(that.fcurPenaltyDelta));
    equal = equal && (this.fcurOther == null ? that.fcurOther == null : this.fcurOther.equals(that.fcurOther));
    equal = equal && (this.fcurOtherBalance == null ? that.fcurOtherBalance == null : this.fcurOtherBalance.equals(that.fcurOtherBalance));
    equal = equal && (this.fcurOtherDelta == null ? that.fcurOtherDelta == null : this.fcurOtherDelta.equals(that.fcurOtherDelta));
    equal = equal && (this.fcurCredit == null ? that.fcurCredit == null : this.fcurCredit.equals(that.fcurCredit));
    equal = equal && (this.fcurCreditDelta == null ? that.fcurCreditDelta == null : this.fcurCreditDelta.equals(that.fcurCreditDelta));
    equal = equal && (this.fcurBalance == null ? that.fcurBalance == null : this.fcurBalance.equals(that.fcurBalance));
    equal = equal && (this.fdtmBillActivity == null ? that.fdtmBillActivity == null : this.fdtmBillActivity.equals(that.fdtmBillActivity));
    equal = equal && (this.fdtmPenalty == null ? that.fdtmPenalty == null : this.fdtmPenalty.equals(that.fdtmPenalty));
    equal = equal && (this.fdtmDelta == null ? that.fdtmDelta == null : this.fdtmDelta.equals(that.fdtmDelta));
    equal = equal && (this.flngCollectKey == null ? that.flngCollectKey == null : this.flngCollectKey.equals(that.flngCollectKey));
    equal = equal && (this.fintTransactionCount == null ? that.fintTransactionCount == null : this.fintTransactionCount.equals(that.fintTransactionCount));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblperiodbillitem)) {
      return false;
    }
    tblperiodbillitem that = (tblperiodbillitem) o;
    boolean equal = true;
    equal = equal && (this.flngBillItemKey == null ? that.flngBillItemKey == null : this.flngBillItemKey.equals(that.flngBillItemKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.fintBillItem == null ? that.fintBillItem == null : this.fintBillItem.equals(that.fintBillItem));
    equal = equal && (this.fstrBillType == null ? that.fstrBillType == null : this.fstrBillType.equals(that.fstrBillType));
    equal = equal && (this.fdtmCreated == null ? that.fdtmCreated == null : this.fdtmCreated.equals(that.fdtmCreated));
    equal = equal && (this.fdtmDue == null ? that.fdtmDue == null : this.fdtmDue.equals(that.fdtmDue));
    equal = equal && (this.fstrStage == null ? that.fstrStage == null : this.fstrStage.equals(that.fstrStage));
    equal = equal && (this.fdtmStaged == null ? that.fdtmStaged == null : this.fdtmStaged.equals(that.fdtmStaged));
    equal = equal && (this.fstrPriorStage == null ? that.fstrPriorStage == null : this.fstrPriorStage.equals(that.fstrPriorStage));
    equal = equal && (this.fdtmPriorStaged == null ? that.fdtmPriorStaged == null : this.fdtmPriorStaged.equals(that.fdtmPriorStaged));
    equal = equal && (this.fdtmNextStageEval == null ? that.fdtmNextStageEval == null : this.fdtmNextStageEval.equals(that.fdtmNextStageEval));
    equal = equal && (this.fdtmClosed == null ? that.fdtmClosed == null : this.fdtmClosed.equals(that.fdtmClosed));
    equal = equal && (this.fdtmProtest == null ? that.fdtmProtest == null : this.fdtmProtest.equals(that.fdtmProtest));
    equal = equal && (this.fdtmFinalized == null ? that.fdtmFinalized == null : this.fdtmFinalized.equals(that.fdtmFinalized));
    equal = equal && (this.fcurTax == null ? that.fcurTax == null : this.fcurTax.equals(that.fcurTax));
    equal = equal && (this.fcurTaxBalance == null ? that.fcurTaxBalance == null : this.fcurTaxBalance.equals(that.fcurTaxBalance));
    equal = equal && (this.fcurTaxDelta == null ? that.fcurTaxDelta == null : this.fcurTaxDelta.equals(that.fcurTaxDelta));
    equal = equal && (this.fcurInterest == null ? that.fcurInterest == null : this.fcurInterest.equals(that.fcurInterest));
    equal = equal && (this.fcurInterestBalance == null ? that.fcurInterestBalance == null : this.fcurInterestBalance.equals(that.fcurInterestBalance));
    equal = equal && (this.fcurInterestDelta == null ? that.fcurInterestDelta == null : this.fcurInterestDelta.equals(that.fcurInterestDelta));
    equal = equal && (this.fcurPenalty == null ? that.fcurPenalty == null : this.fcurPenalty.equals(that.fcurPenalty));
    equal = equal && (this.fcurPenaltyBalance == null ? that.fcurPenaltyBalance == null : this.fcurPenaltyBalance.equals(that.fcurPenaltyBalance));
    equal = equal && (this.fcurPenaltyDelta == null ? that.fcurPenaltyDelta == null : this.fcurPenaltyDelta.equals(that.fcurPenaltyDelta));
    equal = equal && (this.fcurOther == null ? that.fcurOther == null : this.fcurOther.equals(that.fcurOther));
    equal = equal && (this.fcurOtherBalance == null ? that.fcurOtherBalance == null : this.fcurOtherBalance.equals(that.fcurOtherBalance));
    equal = equal && (this.fcurOtherDelta == null ? that.fcurOtherDelta == null : this.fcurOtherDelta.equals(that.fcurOtherDelta));
    equal = equal && (this.fcurCredit == null ? that.fcurCredit == null : this.fcurCredit.equals(that.fcurCredit));
    equal = equal && (this.fcurCreditDelta == null ? that.fcurCreditDelta == null : this.fcurCreditDelta.equals(that.fcurCreditDelta));
    equal = equal && (this.fcurBalance == null ? that.fcurBalance == null : this.fcurBalance.equals(that.fcurBalance));
    equal = equal && (this.fdtmBillActivity == null ? that.fdtmBillActivity == null : this.fdtmBillActivity.equals(that.fdtmBillActivity));
    equal = equal && (this.fdtmPenalty == null ? that.fdtmPenalty == null : this.fdtmPenalty.equals(that.fdtmPenalty));
    equal = equal && (this.fdtmDelta == null ? that.fdtmDelta == null : this.fdtmDelta.equals(that.fdtmDelta));
    equal = equal && (this.flngCollectKey == null ? that.flngCollectKey == null : this.flngCollectKey.equals(that.flngCollectKey));
    equal = equal && (this.fintTransactionCount == null ? that.fintTransactionCount == null : this.fintTransactionCount.equals(that.fintTransactionCount));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngBillItemKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.fintBillItem = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fstrBillType = JdbcWritableBridge.readString(7, __dbResults);
    this.fdtmCreated = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.fdtmDue = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.fstrStage = JdbcWritableBridge.readString(10, __dbResults);
    this.fdtmStaged = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.fstrPriorStage = JdbcWritableBridge.readString(12, __dbResults);
    this.fdtmPriorStaged = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.fdtmNextStageEval = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.fdtmClosed = JdbcWritableBridge.readTimestamp(15, __dbResults);
    this.fdtmProtest = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.fdtmFinalized = JdbcWritableBridge.readTimestamp(17, __dbResults);
    this.fcurTax = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.fcurTaxBalance = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fcurTaxDelta = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.fcurInterest = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fcurInterestBalance = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.fcurInterestDelta = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.fcurPenalty = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fcurPenaltyBalance = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fcurPenaltyDelta = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.fcurOther = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.fcurOtherBalance = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.fcurOtherDelta = JdbcWritableBridge.readBigDecimal(29, __dbResults);
    this.fcurCredit = JdbcWritableBridge.readBigDecimal(30, __dbResults);
    this.fcurCreditDelta = JdbcWritableBridge.readBigDecimal(31, __dbResults);
    this.fcurBalance = JdbcWritableBridge.readBigDecimal(32, __dbResults);
    this.fdtmBillActivity = JdbcWritableBridge.readTimestamp(33, __dbResults);
    this.fdtmPenalty = JdbcWritableBridge.readTimestamp(34, __dbResults);
    this.fdtmDelta = JdbcWritableBridge.readTimestamp(35, __dbResults);
    this.flngCollectKey = JdbcWritableBridge.readInteger(36, __dbResults);
    this.fintTransactionCount = JdbcWritableBridge.readInteger(37, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(38, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(39, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngBillItemKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.fintBillItem = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fstrBillType = JdbcWritableBridge.readString(7, __dbResults);
    this.fdtmCreated = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.fdtmDue = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.fstrStage = JdbcWritableBridge.readString(10, __dbResults);
    this.fdtmStaged = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.fstrPriorStage = JdbcWritableBridge.readString(12, __dbResults);
    this.fdtmPriorStaged = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.fdtmNextStageEval = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.fdtmClosed = JdbcWritableBridge.readTimestamp(15, __dbResults);
    this.fdtmProtest = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.fdtmFinalized = JdbcWritableBridge.readTimestamp(17, __dbResults);
    this.fcurTax = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.fcurTaxBalance = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fcurTaxDelta = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.fcurInterest = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fcurInterestBalance = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.fcurInterestDelta = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.fcurPenalty = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fcurPenaltyBalance = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fcurPenaltyDelta = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.fcurOther = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.fcurOtherBalance = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.fcurOtherDelta = JdbcWritableBridge.readBigDecimal(29, __dbResults);
    this.fcurCredit = JdbcWritableBridge.readBigDecimal(30, __dbResults);
    this.fcurCreditDelta = JdbcWritableBridge.readBigDecimal(31, __dbResults);
    this.fcurBalance = JdbcWritableBridge.readBigDecimal(32, __dbResults);
    this.fdtmBillActivity = JdbcWritableBridge.readTimestamp(33, __dbResults);
    this.fdtmPenalty = JdbcWritableBridge.readTimestamp(34, __dbResults);
    this.fdtmDelta = JdbcWritableBridge.readTimestamp(35, __dbResults);
    this.flngCollectKey = JdbcWritableBridge.readInteger(36, __dbResults);
    this.fintTransactionCount = JdbcWritableBridge.readInteger(37, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(38, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(39, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngBillItemKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fintBillItem, 6 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrBillType, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCreated, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDue, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrStage, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmStaged, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrPriorStage, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPriorStaged, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmNextStageEval, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmClosed, 15 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmProtest, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFinalized, 17 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTax, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxBalance, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxDelta, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterest, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterestBalance, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterestDelta, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPenalty, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPenaltyBalance, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPenaltyDelta, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOther, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherBalance, 28 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherDelta, 29 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCredit, 30 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCreditDelta, 31 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBalance, 32 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmBillActivity, 33 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPenalty, 34 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDelta, 35 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCollectKey, 36 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintTransactionCount, 37 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 38 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 39 + __off, 93, __dbStmt);
    return 39;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngBillItemKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fintBillItem, 6 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrBillType, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCreated, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDue, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrStage, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmStaged, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrPriorStage, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPriorStaged, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmNextStageEval, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmClosed, 15 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmProtest, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFinalized, 17 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTax, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxBalance, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxDelta, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterest, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterestBalance, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterestDelta, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPenalty, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPenaltyBalance, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPenaltyDelta, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOther, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherBalance, 28 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherDelta, 29 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCredit, 30 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCreditDelta, 31 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBalance, 32 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmBillActivity, 33 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPenalty, 34 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDelta, 35 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCollectKey, 36 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintTransactionCount, 37 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 38 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 39 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngBillItemKey = null;
    } else {
    this.flngBillItemKey = Integer.valueOf(__dataIn.readInt());
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
        this.fintBillItem = null;
    } else {
    this.fintBillItem = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrBillType = null;
    } else {
    this.fstrBillType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmCreated = null;
    } else {
    this.fdtmCreated = new Timestamp(__dataIn.readLong());
    this.fdtmCreated.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmDue = null;
    } else {
    this.fdtmDue = new Timestamp(__dataIn.readLong());
    this.fdtmDue.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrStage = null;
    } else {
    this.fstrStage = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmStaged = null;
    } else {
    this.fdtmStaged = new Timestamp(__dataIn.readLong());
    this.fdtmStaged.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPriorStage = null;
    } else {
    this.fstrPriorStage = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmPriorStaged = null;
    } else {
    this.fdtmPriorStaged = new Timestamp(__dataIn.readLong());
    this.fdtmPriorStaged.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmNextStageEval = null;
    } else {
    this.fdtmNextStageEval = new Timestamp(__dataIn.readLong());
    this.fdtmNextStageEval.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmClosed = null;
    } else {
    this.fdtmClosed = new Timestamp(__dataIn.readLong());
    this.fdtmClosed.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmProtest = null;
    } else {
    this.fdtmProtest = new Timestamp(__dataIn.readLong());
    this.fdtmProtest.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmFinalized = null;
    } else {
    this.fdtmFinalized = new Timestamp(__dataIn.readLong());
    this.fdtmFinalized.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTax = null;
    } else {
    this.fcurTax = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxBalance = null;
    } else {
    this.fcurTaxBalance = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxDelta = null;
    } else {
    this.fcurTaxDelta = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurInterest = null;
    } else {
    this.fcurInterest = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurInterestBalance = null;
    } else {
    this.fcurInterestBalance = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurInterestDelta = null;
    } else {
    this.fcurInterestDelta = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPenalty = null;
    } else {
    this.fcurPenalty = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPenaltyBalance = null;
    } else {
    this.fcurPenaltyBalance = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPenaltyDelta = null;
    } else {
    this.fcurPenaltyDelta = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOther = null;
    } else {
    this.fcurOther = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOtherBalance = null;
    } else {
    this.fcurOtherBalance = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOtherDelta = null;
    } else {
    this.fcurOtherDelta = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurCredit = null;
    } else {
    this.fcurCredit = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurCreditDelta = null;
    } else {
    this.fcurCreditDelta = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurBalance = null;
    } else {
    this.fcurBalance = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmBillActivity = null;
    } else {
    this.fdtmBillActivity = new Timestamp(__dataIn.readLong());
    this.fdtmBillActivity.setNanos(__dataIn.readInt());
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
        this.flngCollectKey = null;
    } else {
    this.flngCollectKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintTransactionCount = null;
    } else {
    this.fintTransactionCount = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.flngBillItemKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngBillItemKey);
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
    if (null == this.fintBillItem) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintBillItem);
    }
    if (null == this.fstrBillType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBillType);
    }
    if (null == this.fdtmCreated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCreated.getTime());
    __dataOut.writeInt(this.fdtmCreated.getNanos());
    }
    if (null == this.fdtmDue) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDue.getTime());
    __dataOut.writeInt(this.fdtmDue.getNanos());
    }
    if (null == this.fstrStage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStage);
    }
    if (null == this.fdtmStaged) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmStaged.getTime());
    __dataOut.writeInt(this.fdtmStaged.getNanos());
    }
    if (null == this.fstrPriorStage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPriorStage);
    }
    if (null == this.fdtmPriorStaged) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPriorStaged.getTime());
    __dataOut.writeInt(this.fdtmPriorStaged.getNanos());
    }
    if (null == this.fdtmNextStageEval) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmNextStageEval.getTime());
    __dataOut.writeInt(this.fdtmNextStageEval.getNanos());
    }
    if (null == this.fdtmClosed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmClosed.getTime());
    __dataOut.writeInt(this.fdtmClosed.getNanos());
    }
    if (null == this.fdtmProtest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmProtest.getTime());
    __dataOut.writeInt(this.fdtmProtest.getNanos());
    }
    if (null == this.fdtmFinalized) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFinalized.getTime());
    __dataOut.writeInt(this.fdtmFinalized.getNanos());
    }
    if (null == this.fcurTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTax, __dataOut);
    }
    if (null == this.fcurTaxBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxBalance, __dataOut);
    }
    if (null == this.fcurTaxDelta) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxDelta, __dataOut);
    }
    if (null == this.fcurInterest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInterest, __dataOut);
    }
    if (null == this.fcurInterestBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInterestBalance, __dataOut);
    }
    if (null == this.fcurInterestDelta) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInterestDelta, __dataOut);
    }
    if (null == this.fcurPenalty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPenalty, __dataOut);
    }
    if (null == this.fcurPenaltyBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPenaltyBalance, __dataOut);
    }
    if (null == this.fcurPenaltyDelta) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPenaltyDelta, __dataOut);
    }
    if (null == this.fcurOther) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOther, __dataOut);
    }
    if (null == this.fcurOtherBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherBalance, __dataOut);
    }
    if (null == this.fcurOtherDelta) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherDelta, __dataOut);
    }
    if (null == this.fcurCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCredit, __dataOut);
    }
    if (null == this.fcurCreditDelta) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCreditDelta, __dataOut);
    }
    if (null == this.fcurBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBalance, __dataOut);
    }
    if (null == this.fdtmBillActivity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmBillActivity.getTime());
    __dataOut.writeInt(this.fdtmBillActivity.getNanos());
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
    if (null == this.flngCollectKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCollectKey);
    }
    if (null == this.fintTransactionCount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintTransactionCount);
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
    if (null == this.flngBillItemKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngBillItemKey);
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
    if (null == this.fintBillItem) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintBillItem);
    }
    if (null == this.fstrBillType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBillType);
    }
    if (null == this.fdtmCreated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCreated.getTime());
    __dataOut.writeInt(this.fdtmCreated.getNanos());
    }
    if (null == this.fdtmDue) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDue.getTime());
    __dataOut.writeInt(this.fdtmDue.getNanos());
    }
    if (null == this.fstrStage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStage);
    }
    if (null == this.fdtmStaged) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmStaged.getTime());
    __dataOut.writeInt(this.fdtmStaged.getNanos());
    }
    if (null == this.fstrPriorStage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPriorStage);
    }
    if (null == this.fdtmPriorStaged) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPriorStaged.getTime());
    __dataOut.writeInt(this.fdtmPriorStaged.getNanos());
    }
    if (null == this.fdtmNextStageEval) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmNextStageEval.getTime());
    __dataOut.writeInt(this.fdtmNextStageEval.getNanos());
    }
    if (null == this.fdtmClosed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmClosed.getTime());
    __dataOut.writeInt(this.fdtmClosed.getNanos());
    }
    if (null == this.fdtmProtest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmProtest.getTime());
    __dataOut.writeInt(this.fdtmProtest.getNanos());
    }
    if (null == this.fdtmFinalized) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFinalized.getTime());
    __dataOut.writeInt(this.fdtmFinalized.getNanos());
    }
    if (null == this.fcurTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTax, __dataOut);
    }
    if (null == this.fcurTaxBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxBalance, __dataOut);
    }
    if (null == this.fcurTaxDelta) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxDelta, __dataOut);
    }
    if (null == this.fcurInterest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInterest, __dataOut);
    }
    if (null == this.fcurInterestBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInterestBalance, __dataOut);
    }
    if (null == this.fcurInterestDelta) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInterestDelta, __dataOut);
    }
    if (null == this.fcurPenalty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPenalty, __dataOut);
    }
    if (null == this.fcurPenaltyBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPenaltyBalance, __dataOut);
    }
    if (null == this.fcurPenaltyDelta) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPenaltyDelta, __dataOut);
    }
    if (null == this.fcurOther) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOther, __dataOut);
    }
    if (null == this.fcurOtherBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherBalance, __dataOut);
    }
    if (null == this.fcurOtherDelta) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherDelta, __dataOut);
    }
    if (null == this.fcurCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCredit, __dataOut);
    }
    if (null == this.fcurCreditDelta) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCreditDelta, __dataOut);
    }
    if (null == this.fcurBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBalance, __dataOut);
    }
    if (null == this.fdtmBillActivity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmBillActivity.getTime());
    __dataOut.writeInt(this.fdtmBillActivity.getNanos());
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
    if (null == this.flngCollectKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCollectKey);
    }
    if (null == this.fintTransactionCount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintTransactionCount);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngBillItemKey==null?"\\N":"" + flngBillItemKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintBillItem==null?"\\N":"" + fintBillItem, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBillType==null?"\\N":fstrBillType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCreated==null?"\\N":"" + fdtmCreated, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDue==null?"\\N":"" + fdtmDue, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStage==null?"\\N":fstrStage, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmStaged==null?"\\N":"" + fdtmStaged, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPriorStage==null?"\\N":fstrPriorStage, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPriorStaged==null?"\\N":"" + fdtmPriorStaged, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmNextStageEval==null?"\\N":"" + fdtmNextStageEval, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmClosed==null?"\\N":"" + fdtmClosed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmProtest==null?"\\N":"" + fdtmProtest, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFinalized==null?"\\N":"" + fdtmFinalized, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTax==null?"\\N":fcurTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxBalance==null?"\\N":fcurTaxBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxDelta==null?"\\N":fcurTaxDelta.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterest==null?"\\N":fcurInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterestBalance==null?"\\N":fcurInterestBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterestDelta==null?"\\N":fcurInterestDelta.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPenalty==null?"\\N":fcurPenalty.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPenaltyBalance==null?"\\N":fcurPenaltyBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPenaltyDelta==null?"\\N":fcurPenaltyDelta.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOther==null?"\\N":fcurOther.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherBalance==null?"\\N":fcurOtherBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherDelta==null?"\\N":fcurOtherDelta.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCredit==null?"\\N":fcurCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCreditDelta==null?"\\N":fcurCreditDelta.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBalance==null?"\\N":fcurBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmBillActivity==null?"\\N":"" + fdtmBillActivity, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPenalty==null?"\\N":"" + fdtmPenalty, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDelta==null?"\\N":"" + fdtmDelta, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCollectKey==null?"\\N":"" + flngCollectKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintTransactionCount==null?"\\N":"" + fintTransactionCount, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngBillItemKey==null?"\\N":"" + flngBillItemKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintBillItem==null?"\\N":"" + fintBillItem, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBillType==null?"\\N":fstrBillType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCreated==null?"\\N":"" + fdtmCreated, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDue==null?"\\N":"" + fdtmDue, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStage==null?"\\N":fstrStage, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmStaged==null?"\\N":"" + fdtmStaged, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPriorStage==null?"\\N":fstrPriorStage, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPriorStaged==null?"\\N":"" + fdtmPriorStaged, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmNextStageEval==null?"\\N":"" + fdtmNextStageEval, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmClosed==null?"\\N":"" + fdtmClosed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmProtest==null?"\\N":"" + fdtmProtest, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFinalized==null?"\\N":"" + fdtmFinalized, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTax==null?"\\N":fcurTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxBalance==null?"\\N":fcurTaxBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxDelta==null?"\\N":fcurTaxDelta.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterest==null?"\\N":fcurInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterestBalance==null?"\\N":fcurInterestBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterestDelta==null?"\\N":fcurInterestDelta.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPenalty==null?"\\N":fcurPenalty.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPenaltyBalance==null?"\\N":fcurPenaltyBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPenaltyDelta==null?"\\N":fcurPenaltyDelta.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOther==null?"\\N":fcurOther.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherBalance==null?"\\N":fcurOtherBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherDelta==null?"\\N":fcurOtherDelta.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCredit==null?"\\N":fcurCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCreditDelta==null?"\\N":fcurCreditDelta.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBalance==null?"\\N":fcurBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmBillActivity==null?"\\N":"" + fdtmBillActivity, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPenalty==null?"\\N":"" + fdtmPenalty, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDelta==null?"\\N":"" + fdtmDelta, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCollectKey==null?"\\N":"" + flngCollectKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintTransactionCount==null?"\\N":"" + fintTransactionCount, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngBillItemKey = null; } else {
      this.flngBillItemKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintBillItem = null; } else {
      this.fintBillItem = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrBillType = null; } else {
      this.fstrBillType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCreated = null; } else {
      this.fdtmCreated = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDue = null; } else {
      this.fdtmDue = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrStage = null; } else {
      this.fstrStage = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmStaged = null; } else {
      this.fdtmStaged = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPriorStage = null; } else {
      this.fstrPriorStage = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPriorStaged = null; } else {
      this.fdtmPriorStaged = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmNextStageEval = null; } else {
      this.fdtmNextStageEval = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmClosed = null; } else {
      this.fdtmClosed = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmProtest = null; } else {
      this.fdtmProtest = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFinalized = null; } else {
      this.fdtmFinalized = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTax = null; } else {
      this.fcurTax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxBalance = null; } else {
      this.fcurTaxBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxDelta = null; } else {
      this.fcurTaxDelta = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInterest = null; } else {
      this.fcurInterest = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInterestBalance = null; } else {
      this.fcurInterestBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInterestDelta = null; } else {
      this.fcurInterestDelta = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPenalty = null; } else {
      this.fcurPenalty = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPenaltyBalance = null; } else {
      this.fcurPenaltyBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPenaltyDelta = null; } else {
      this.fcurPenaltyDelta = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOther = null; } else {
      this.fcurOther = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOtherBalance = null; } else {
      this.fcurOtherBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOtherDelta = null; } else {
      this.fcurOtherDelta = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCredit = null; } else {
      this.fcurCredit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCreditDelta = null; } else {
      this.fcurCreditDelta = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmBillActivity = null; } else {
      this.fdtmBillActivity = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCollectKey = null; } else {
      this.flngCollectKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintTransactionCount = null; } else {
      this.fintTransactionCount = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngBillItemKey = null; } else {
      this.flngBillItemKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintBillItem = null; } else {
      this.fintBillItem = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrBillType = null; } else {
      this.fstrBillType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCreated = null; } else {
      this.fdtmCreated = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDue = null; } else {
      this.fdtmDue = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrStage = null; } else {
      this.fstrStage = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmStaged = null; } else {
      this.fdtmStaged = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPriorStage = null; } else {
      this.fstrPriorStage = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPriorStaged = null; } else {
      this.fdtmPriorStaged = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmNextStageEval = null; } else {
      this.fdtmNextStageEval = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmClosed = null; } else {
      this.fdtmClosed = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmProtest = null; } else {
      this.fdtmProtest = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFinalized = null; } else {
      this.fdtmFinalized = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTax = null; } else {
      this.fcurTax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxBalance = null; } else {
      this.fcurTaxBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxDelta = null; } else {
      this.fcurTaxDelta = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInterest = null; } else {
      this.fcurInterest = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInterestBalance = null; } else {
      this.fcurInterestBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInterestDelta = null; } else {
      this.fcurInterestDelta = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPenalty = null; } else {
      this.fcurPenalty = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPenaltyBalance = null; } else {
      this.fcurPenaltyBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPenaltyDelta = null; } else {
      this.fcurPenaltyDelta = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOther = null; } else {
      this.fcurOther = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOtherBalance = null; } else {
      this.fcurOtherBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOtherDelta = null; } else {
      this.fcurOtherDelta = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCredit = null; } else {
      this.fcurCredit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCreditDelta = null; } else {
      this.fcurCreditDelta = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmBillActivity = null; } else {
      this.fdtmBillActivity = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCollectKey = null; } else {
      this.flngCollectKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintTransactionCount = null; } else {
      this.fintTransactionCount = Integer.valueOf(__cur_str);
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
    tblperiodbillitem o = (tblperiodbillitem) super.clone();
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmCreated = (o.fdtmCreated != null) ? (java.sql.Timestamp) o.fdtmCreated.clone() : null;
    o.fdtmDue = (o.fdtmDue != null) ? (java.sql.Timestamp) o.fdtmDue.clone() : null;
    o.fdtmStaged = (o.fdtmStaged != null) ? (java.sql.Timestamp) o.fdtmStaged.clone() : null;
    o.fdtmPriorStaged = (o.fdtmPriorStaged != null) ? (java.sql.Timestamp) o.fdtmPriorStaged.clone() : null;
    o.fdtmNextStageEval = (o.fdtmNextStageEval != null) ? (java.sql.Timestamp) o.fdtmNextStageEval.clone() : null;
    o.fdtmClosed = (o.fdtmClosed != null) ? (java.sql.Timestamp) o.fdtmClosed.clone() : null;
    o.fdtmProtest = (o.fdtmProtest != null) ? (java.sql.Timestamp) o.fdtmProtest.clone() : null;
    o.fdtmFinalized = (o.fdtmFinalized != null) ? (java.sql.Timestamp) o.fdtmFinalized.clone() : null;
    o.fdtmBillActivity = (o.fdtmBillActivity != null) ? (java.sql.Timestamp) o.fdtmBillActivity.clone() : null;
    o.fdtmPenalty = (o.fdtmPenalty != null) ? (java.sql.Timestamp) o.fdtmPenalty.clone() : null;
    o.fdtmDelta = (o.fdtmDelta != null) ? (java.sql.Timestamp) o.fdtmDelta.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblperiodbillitem o) throws CloneNotSupportedException {
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmCreated = (o.fdtmCreated != null) ? (java.sql.Timestamp) o.fdtmCreated.clone() : null;
    o.fdtmDue = (o.fdtmDue != null) ? (java.sql.Timestamp) o.fdtmDue.clone() : null;
    o.fdtmStaged = (o.fdtmStaged != null) ? (java.sql.Timestamp) o.fdtmStaged.clone() : null;
    o.fdtmPriorStaged = (o.fdtmPriorStaged != null) ? (java.sql.Timestamp) o.fdtmPriorStaged.clone() : null;
    o.fdtmNextStageEval = (o.fdtmNextStageEval != null) ? (java.sql.Timestamp) o.fdtmNextStageEval.clone() : null;
    o.fdtmClosed = (o.fdtmClosed != null) ? (java.sql.Timestamp) o.fdtmClosed.clone() : null;
    o.fdtmProtest = (o.fdtmProtest != null) ? (java.sql.Timestamp) o.fdtmProtest.clone() : null;
    o.fdtmFinalized = (o.fdtmFinalized != null) ? (java.sql.Timestamp) o.fdtmFinalized.clone() : null;
    o.fdtmBillActivity = (o.fdtmBillActivity != null) ? (java.sql.Timestamp) o.fdtmBillActivity.clone() : null;
    o.fdtmPenalty = (o.fdtmPenalty != null) ? (java.sql.Timestamp) o.fdtmPenalty.clone() : null;
    o.fdtmDelta = (o.fdtmDelta != null) ? (java.sql.Timestamp) o.fdtmDelta.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngBillItemKey", this.flngBillItemKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("fintBillItem", this.fintBillItem);
    __sqoop$field_map.put("fstrBillType", this.fstrBillType);
    __sqoop$field_map.put("fdtmCreated", this.fdtmCreated);
    __sqoop$field_map.put("fdtmDue", this.fdtmDue);
    __sqoop$field_map.put("fstrStage", this.fstrStage);
    __sqoop$field_map.put("fdtmStaged", this.fdtmStaged);
    __sqoop$field_map.put("fstrPriorStage", this.fstrPriorStage);
    __sqoop$field_map.put("fdtmPriorStaged", this.fdtmPriorStaged);
    __sqoop$field_map.put("fdtmNextStageEval", this.fdtmNextStageEval);
    __sqoop$field_map.put("fdtmClosed", this.fdtmClosed);
    __sqoop$field_map.put("fdtmProtest", this.fdtmProtest);
    __sqoop$field_map.put("fdtmFinalized", this.fdtmFinalized);
    __sqoop$field_map.put("fcurTax", this.fcurTax);
    __sqoop$field_map.put("fcurTaxBalance", this.fcurTaxBalance);
    __sqoop$field_map.put("fcurTaxDelta", this.fcurTaxDelta);
    __sqoop$field_map.put("fcurInterest", this.fcurInterest);
    __sqoop$field_map.put("fcurInterestBalance", this.fcurInterestBalance);
    __sqoop$field_map.put("fcurInterestDelta", this.fcurInterestDelta);
    __sqoop$field_map.put("fcurPenalty", this.fcurPenalty);
    __sqoop$field_map.put("fcurPenaltyBalance", this.fcurPenaltyBalance);
    __sqoop$field_map.put("fcurPenaltyDelta", this.fcurPenaltyDelta);
    __sqoop$field_map.put("fcurOther", this.fcurOther);
    __sqoop$field_map.put("fcurOtherBalance", this.fcurOtherBalance);
    __sqoop$field_map.put("fcurOtherDelta", this.fcurOtherDelta);
    __sqoop$field_map.put("fcurCredit", this.fcurCredit);
    __sqoop$field_map.put("fcurCreditDelta", this.fcurCreditDelta);
    __sqoop$field_map.put("fcurBalance", this.fcurBalance);
    __sqoop$field_map.put("fdtmBillActivity", this.fdtmBillActivity);
    __sqoop$field_map.put("fdtmPenalty", this.fdtmPenalty);
    __sqoop$field_map.put("fdtmDelta", this.fdtmDelta);
    __sqoop$field_map.put("flngCollectKey", this.flngCollectKey);
    __sqoop$field_map.put("fintTransactionCount", this.fintTransactionCount);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngBillItemKey", this.flngBillItemKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("fintBillItem", this.fintBillItem);
    __sqoop$field_map.put("fstrBillType", this.fstrBillType);
    __sqoop$field_map.put("fdtmCreated", this.fdtmCreated);
    __sqoop$field_map.put("fdtmDue", this.fdtmDue);
    __sqoop$field_map.put("fstrStage", this.fstrStage);
    __sqoop$field_map.put("fdtmStaged", this.fdtmStaged);
    __sqoop$field_map.put("fstrPriorStage", this.fstrPriorStage);
    __sqoop$field_map.put("fdtmPriorStaged", this.fdtmPriorStaged);
    __sqoop$field_map.put("fdtmNextStageEval", this.fdtmNextStageEval);
    __sqoop$field_map.put("fdtmClosed", this.fdtmClosed);
    __sqoop$field_map.put("fdtmProtest", this.fdtmProtest);
    __sqoop$field_map.put("fdtmFinalized", this.fdtmFinalized);
    __sqoop$field_map.put("fcurTax", this.fcurTax);
    __sqoop$field_map.put("fcurTaxBalance", this.fcurTaxBalance);
    __sqoop$field_map.put("fcurTaxDelta", this.fcurTaxDelta);
    __sqoop$field_map.put("fcurInterest", this.fcurInterest);
    __sqoop$field_map.put("fcurInterestBalance", this.fcurInterestBalance);
    __sqoop$field_map.put("fcurInterestDelta", this.fcurInterestDelta);
    __sqoop$field_map.put("fcurPenalty", this.fcurPenalty);
    __sqoop$field_map.put("fcurPenaltyBalance", this.fcurPenaltyBalance);
    __sqoop$field_map.put("fcurPenaltyDelta", this.fcurPenaltyDelta);
    __sqoop$field_map.put("fcurOther", this.fcurOther);
    __sqoop$field_map.put("fcurOtherBalance", this.fcurOtherBalance);
    __sqoop$field_map.put("fcurOtherDelta", this.fcurOtherDelta);
    __sqoop$field_map.put("fcurCredit", this.fcurCredit);
    __sqoop$field_map.put("fcurCreditDelta", this.fcurCreditDelta);
    __sqoop$field_map.put("fcurBalance", this.fcurBalance);
    __sqoop$field_map.put("fdtmBillActivity", this.fdtmBillActivity);
    __sqoop$field_map.put("fdtmPenalty", this.fdtmPenalty);
    __sqoop$field_map.put("fdtmDelta", this.fdtmDelta);
    __sqoop$field_map.put("flngCollectKey", this.flngCollectKey);
    __sqoop$field_map.put("fintTransactionCount", this.fintTransactionCount);
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
