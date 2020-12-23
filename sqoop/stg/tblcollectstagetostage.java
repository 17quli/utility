// ORM class for table 'tblcollectstagetostage'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 04:42:51 NZDT 2020
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

public class tblcollectstagetostage extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngCollectKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectstagetostage.this.flngCollectKey = (Integer)value;
      }
    });
    setters.put("fintStage", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectstagetostage.this.fintStage = (Integer)value;
      }
    });
    setters.put("fstrCollectType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectstagetostage.this.fstrCollectType = (String)value;
      }
    });
    setters.put("fintSequence", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectstagetostage.this.fintSequence = (Integer)value;
      }
    });
    setters.put("fstrStageFlow", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectstagetostage.this.fstrStageFlow = (String)value;
      }
    });
    setters.put("fstrStagedFrom", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectstagetostage.this.fstrStagedFrom = (String)value;
      }
    });
    setters.put("fstrStagedTo", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectstagetostage.this.fstrStagedTo = (String)value;
      }
    });
    setters.put("fdtmStagedOn", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectstagetostage.this.fdtmStagedOn = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrStageAction", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectstagetostage.this.fstrStageAction = (String)value;
      }
    });
    setters.put("fcurTaxBalance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectstagetostage.this.fcurTaxBalance = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPenaltyBalance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectstagetostage.this.fcurPenaltyBalance = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurInterestBalance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectstagetostage.this.fcurInterestBalance = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurBalance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectstagetostage.this.fcurBalance = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnAutomated", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectstagetostage.this.fblnAutomated = (Integer)value;
      }
    });
    setters.put("fdtmCompleted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectstagetostage.this.fdtmCompleted = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrCompletedWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectstagetostage.this.fstrCompletedWho = (String)value;
      }
    });
    setters.put("flngCrmKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectstagetostage.this.flngCrmKey = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectstagetostage.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollectstagetostage.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblcollectstagetostage() {
    init0();
  }
  private Integer flngCollectKey;
  public Integer get_flngCollectKey() {
    return flngCollectKey;
  }
  public void set_flngCollectKey(Integer flngCollectKey) {
    this.flngCollectKey = flngCollectKey;
  }
  public tblcollectstagetostage with_flngCollectKey(Integer flngCollectKey) {
    this.flngCollectKey = flngCollectKey;
    return this;
  }
  private Integer fintStage;
  public Integer get_fintStage() {
    return fintStage;
  }
  public void set_fintStage(Integer fintStage) {
    this.fintStage = fintStage;
  }
  public tblcollectstagetostage with_fintStage(Integer fintStage) {
    this.fintStage = fintStage;
    return this;
  }
  private String fstrCollectType;
  public String get_fstrCollectType() {
    return fstrCollectType;
  }
  public void set_fstrCollectType(String fstrCollectType) {
    this.fstrCollectType = fstrCollectType;
  }
  public tblcollectstagetostage with_fstrCollectType(String fstrCollectType) {
    this.fstrCollectType = fstrCollectType;
    return this;
  }
  private Integer fintSequence;
  public Integer get_fintSequence() {
    return fintSequence;
  }
  public void set_fintSequence(Integer fintSequence) {
    this.fintSequence = fintSequence;
  }
  public tblcollectstagetostage with_fintSequence(Integer fintSequence) {
    this.fintSequence = fintSequence;
    return this;
  }
  private String fstrStageFlow;
  public String get_fstrStageFlow() {
    return fstrStageFlow;
  }
  public void set_fstrStageFlow(String fstrStageFlow) {
    this.fstrStageFlow = fstrStageFlow;
  }
  public tblcollectstagetostage with_fstrStageFlow(String fstrStageFlow) {
    this.fstrStageFlow = fstrStageFlow;
    return this;
  }
  private String fstrStagedFrom;
  public String get_fstrStagedFrom() {
    return fstrStagedFrom;
  }
  public void set_fstrStagedFrom(String fstrStagedFrom) {
    this.fstrStagedFrom = fstrStagedFrom;
  }
  public tblcollectstagetostage with_fstrStagedFrom(String fstrStagedFrom) {
    this.fstrStagedFrom = fstrStagedFrom;
    return this;
  }
  private String fstrStagedTo;
  public String get_fstrStagedTo() {
    return fstrStagedTo;
  }
  public void set_fstrStagedTo(String fstrStagedTo) {
    this.fstrStagedTo = fstrStagedTo;
  }
  public tblcollectstagetostage with_fstrStagedTo(String fstrStagedTo) {
    this.fstrStagedTo = fstrStagedTo;
    return this;
  }
  private java.sql.Timestamp fdtmStagedOn;
  public java.sql.Timestamp get_fdtmStagedOn() {
    return fdtmStagedOn;
  }
  public void set_fdtmStagedOn(java.sql.Timestamp fdtmStagedOn) {
    this.fdtmStagedOn = fdtmStagedOn;
  }
  public tblcollectstagetostage with_fdtmStagedOn(java.sql.Timestamp fdtmStagedOn) {
    this.fdtmStagedOn = fdtmStagedOn;
    return this;
  }
  private String fstrStageAction;
  public String get_fstrStageAction() {
    return fstrStageAction;
  }
  public void set_fstrStageAction(String fstrStageAction) {
    this.fstrStageAction = fstrStageAction;
  }
  public tblcollectstagetostage with_fstrStageAction(String fstrStageAction) {
    this.fstrStageAction = fstrStageAction;
    return this;
  }
  private java.math.BigDecimal fcurTaxBalance;
  public java.math.BigDecimal get_fcurTaxBalance() {
    return fcurTaxBalance;
  }
  public void set_fcurTaxBalance(java.math.BigDecimal fcurTaxBalance) {
    this.fcurTaxBalance = fcurTaxBalance;
  }
  public tblcollectstagetostage with_fcurTaxBalance(java.math.BigDecimal fcurTaxBalance) {
    this.fcurTaxBalance = fcurTaxBalance;
    return this;
  }
  private java.math.BigDecimal fcurPenaltyBalance;
  public java.math.BigDecimal get_fcurPenaltyBalance() {
    return fcurPenaltyBalance;
  }
  public void set_fcurPenaltyBalance(java.math.BigDecimal fcurPenaltyBalance) {
    this.fcurPenaltyBalance = fcurPenaltyBalance;
  }
  public tblcollectstagetostage with_fcurPenaltyBalance(java.math.BigDecimal fcurPenaltyBalance) {
    this.fcurPenaltyBalance = fcurPenaltyBalance;
    return this;
  }
  private java.math.BigDecimal fcurInterestBalance;
  public java.math.BigDecimal get_fcurInterestBalance() {
    return fcurInterestBalance;
  }
  public void set_fcurInterestBalance(java.math.BigDecimal fcurInterestBalance) {
    this.fcurInterestBalance = fcurInterestBalance;
  }
  public tblcollectstagetostage with_fcurInterestBalance(java.math.BigDecimal fcurInterestBalance) {
    this.fcurInterestBalance = fcurInterestBalance;
    return this;
  }
  private java.math.BigDecimal fcurBalance;
  public java.math.BigDecimal get_fcurBalance() {
    return fcurBalance;
  }
  public void set_fcurBalance(java.math.BigDecimal fcurBalance) {
    this.fcurBalance = fcurBalance;
  }
  public tblcollectstagetostage with_fcurBalance(java.math.BigDecimal fcurBalance) {
    this.fcurBalance = fcurBalance;
    return this;
  }
  private Integer fblnAutomated;
  public Integer get_fblnAutomated() {
    return fblnAutomated;
  }
  public void set_fblnAutomated(Integer fblnAutomated) {
    this.fblnAutomated = fblnAutomated;
  }
  public tblcollectstagetostage with_fblnAutomated(Integer fblnAutomated) {
    this.fblnAutomated = fblnAutomated;
    return this;
  }
  private java.sql.Timestamp fdtmCompleted;
  public java.sql.Timestamp get_fdtmCompleted() {
    return fdtmCompleted;
  }
  public void set_fdtmCompleted(java.sql.Timestamp fdtmCompleted) {
    this.fdtmCompleted = fdtmCompleted;
  }
  public tblcollectstagetostage with_fdtmCompleted(java.sql.Timestamp fdtmCompleted) {
    this.fdtmCompleted = fdtmCompleted;
    return this;
  }
  private String fstrCompletedWho;
  public String get_fstrCompletedWho() {
    return fstrCompletedWho;
  }
  public void set_fstrCompletedWho(String fstrCompletedWho) {
    this.fstrCompletedWho = fstrCompletedWho;
  }
  public tblcollectstagetostage with_fstrCompletedWho(String fstrCompletedWho) {
    this.fstrCompletedWho = fstrCompletedWho;
    return this;
  }
  private Integer flngCrmKey;
  public Integer get_flngCrmKey() {
    return flngCrmKey;
  }
  public void set_flngCrmKey(Integer flngCrmKey) {
    this.flngCrmKey = flngCrmKey;
  }
  public tblcollectstagetostage with_flngCrmKey(Integer flngCrmKey) {
    this.flngCrmKey = flngCrmKey;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblcollectstagetostage with_fstrWho(String fstrWho) {
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
  public tblcollectstagetostage with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblcollectstagetostage)) {
      return false;
    }
    tblcollectstagetostage that = (tblcollectstagetostage) o;
    boolean equal = true;
    equal = equal && (this.flngCollectKey == null ? that.flngCollectKey == null : this.flngCollectKey.equals(that.flngCollectKey));
    equal = equal && (this.fintStage == null ? that.fintStage == null : this.fintStage.equals(that.fintStage));
    equal = equal && (this.fstrCollectType == null ? that.fstrCollectType == null : this.fstrCollectType.equals(that.fstrCollectType));
    equal = equal && (this.fintSequence == null ? that.fintSequence == null : this.fintSequence.equals(that.fintSequence));
    equal = equal && (this.fstrStageFlow == null ? that.fstrStageFlow == null : this.fstrStageFlow.equals(that.fstrStageFlow));
    equal = equal && (this.fstrStagedFrom == null ? that.fstrStagedFrom == null : this.fstrStagedFrom.equals(that.fstrStagedFrom));
    equal = equal && (this.fstrStagedTo == null ? that.fstrStagedTo == null : this.fstrStagedTo.equals(that.fstrStagedTo));
    equal = equal && (this.fdtmStagedOn == null ? that.fdtmStagedOn == null : this.fdtmStagedOn.equals(that.fdtmStagedOn));
    equal = equal && (this.fstrStageAction == null ? that.fstrStageAction == null : this.fstrStageAction.equals(that.fstrStageAction));
    equal = equal && (this.fcurTaxBalance == null ? that.fcurTaxBalance == null : this.fcurTaxBalance.equals(that.fcurTaxBalance));
    equal = equal && (this.fcurPenaltyBalance == null ? that.fcurPenaltyBalance == null : this.fcurPenaltyBalance.equals(that.fcurPenaltyBalance));
    equal = equal && (this.fcurInterestBalance == null ? that.fcurInterestBalance == null : this.fcurInterestBalance.equals(that.fcurInterestBalance));
    equal = equal && (this.fcurBalance == null ? that.fcurBalance == null : this.fcurBalance.equals(that.fcurBalance));
    equal = equal && (this.fblnAutomated == null ? that.fblnAutomated == null : this.fblnAutomated.equals(that.fblnAutomated));
    equal = equal && (this.fdtmCompleted == null ? that.fdtmCompleted == null : this.fdtmCompleted.equals(that.fdtmCompleted));
    equal = equal && (this.fstrCompletedWho == null ? that.fstrCompletedWho == null : this.fstrCompletedWho.equals(that.fstrCompletedWho));
    equal = equal && (this.flngCrmKey == null ? that.flngCrmKey == null : this.flngCrmKey.equals(that.flngCrmKey));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblcollectstagetostage)) {
      return false;
    }
    tblcollectstagetostage that = (tblcollectstagetostage) o;
    boolean equal = true;
    equal = equal && (this.flngCollectKey == null ? that.flngCollectKey == null : this.flngCollectKey.equals(that.flngCollectKey));
    equal = equal && (this.fintStage == null ? that.fintStage == null : this.fintStage.equals(that.fintStage));
    equal = equal && (this.fstrCollectType == null ? that.fstrCollectType == null : this.fstrCollectType.equals(that.fstrCollectType));
    equal = equal && (this.fintSequence == null ? that.fintSequence == null : this.fintSequence.equals(that.fintSequence));
    equal = equal && (this.fstrStageFlow == null ? that.fstrStageFlow == null : this.fstrStageFlow.equals(that.fstrStageFlow));
    equal = equal && (this.fstrStagedFrom == null ? that.fstrStagedFrom == null : this.fstrStagedFrom.equals(that.fstrStagedFrom));
    equal = equal && (this.fstrStagedTo == null ? that.fstrStagedTo == null : this.fstrStagedTo.equals(that.fstrStagedTo));
    equal = equal && (this.fdtmStagedOn == null ? that.fdtmStagedOn == null : this.fdtmStagedOn.equals(that.fdtmStagedOn));
    equal = equal && (this.fstrStageAction == null ? that.fstrStageAction == null : this.fstrStageAction.equals(that.fstrStageAction));
    equal = equal && (this.fcurTaxBalance == null ? that.fcurTaxBalance == null : this.fcurTaxBalance.equals(that.fcurTaxBalance));
    equal = equal && (this.fcurPenaltyBalance == null ? that.fcurPenaltyBalance == null : this.fcurPenaltyBalance.equals(that.fcurPenaltyBalance));
    equal = equal && (this.fcurInterestBalance == null ? that.fcurInterestBalance == null : this.fcurInterestBalance.equals(that.fcurInterestBalance));
    equal = equal && (this.fcurBalance == null ? that.fcurBalance == null : this.fcurBalance.equals(that.fcurBalance));
    equal = equal && (this.fblnAutomated == null ? that.fblnAutomated == null : this.fblnAutomated.equals(that.fblnAutomated));
    equal = equal && (this.fdtmCompleted == null ? that.fdtmCompleted == null : this.fdtmCompleted.equals(that.fdtmCompleted));
    equal = equal && (this.fstrCompletedWho == null ? that.fstrCompletedWho == null : this.fstrCompletedWho.equals(that.fstrCompletedWho));
    equal = equal && (this.flngCrmKey == null ? that.flngCrmKey == null : this.flngCrmKey.equals(that.flngCrmKey));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngCollectKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fintStage = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fstrCollectType = JdbcWritableBridge.readString(3, __dbResults);
    this.fintSequence = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fstrStageFlow = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrStagedFrom = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrStagedTo = JdbcWritableBridge.readString(7, __dbResults);
    this.fdtmStagedOn = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.fstrStageAction = JdbcWritableBridge.readString(9, __dbResults);
    this.fcurTaxBalance = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurPenaltyBalance = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurInterestBalance = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurBalance = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fblnAutomated = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fdtmCompleted = JdbcWritableBridge.readTimestamp(15, __dbResults);
    this.fstrCompletedWho = JdbcWritableBridge.readString(16, __dbResults);
    this.flngCrmKey = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(18, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(19, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngCollectKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fintStage = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fstrCollectType = JdbcWritableBridge.readString(3, __dbResults);
    this.fintSequence = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fstrStageFlow = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrStagedFrom = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrStagedTo = JdbcWritableBridge.readString(7, __dbResults);
    this.fdtmStagedOn = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.fstrStageAction = JdbcWritableBridge.readString(9, __dbResults);
    this.fcurTaxBalance = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurPenaltyBalance = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurInterestBalance = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurBalance = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fblnAutomated = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fdtmCompleted = JdbcWritableBridge.readTimestamp(15, __dbResults);
    this.fstrCompletedWho = JdbcWritableBridge.readString(16, __dbResults);
    this.flngCrmKey = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(18, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(19, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngCollectKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintStage, 2 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrCollectType, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintSequence, 4 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrStageFlow, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrStagedFrom, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrStagedTo, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmStagedOn, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrStageAction, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxBalance, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPenaltyBalance, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterestBalance, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBalance, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAutomated, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCompleted, 15 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrCompletedWho, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCrmKey, 17 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 19 + __off, 93, __dbStmt);
    return 19;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngCollectKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintStage, 2 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrCollectType, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintSequence, 4 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrStageFlow, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrStagedFrom, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrStagedTo, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmStagedOn, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrStageAction, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxBalance, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPenaltyBalance, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterestBalance, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBalance, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAutomated, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCompleted, 15 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrCompletedWho, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCrmKey, 17 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 19 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngCollectKey = null;
    } else {
    this.flngCollectKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintStage = null;
    } else {
    this.fintStage = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCollectType = null;
    } else {
    this.fstrCollectType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fintSequence = null;
    } else {
    this.fintSequence = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrStageFlow = null;
    } else {
    this.fstrStageFlow = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrStagedFrom = null;
    } else {
    this.fstrStagedFrom = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrStagedTo = null;
    } else {
    this.fstrStagedTo = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmStagedOn = null;
    } else {
    this.fdtmStagedOn = new Timestamp(__dataIn.readLong());
    this.fdtmStagedOn.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrStageAction = null;
    } else {
    this.fstrStageAction = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxBalance = null;
    } else {
    this.fcurTaxBalance = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPenaltyBalance = null;
    } else {
    this.fcurPenaltyBalance = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurInterestBalance = null;
    } else {
    this.fcurInterestBalance = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurBalance = null;
    } else {
    this.fcurBalance = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnAutomated = null;
    } else {
    this.fblnAutomated = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmCompleted = null;
    } else {
    this.fdtmCompleted = new Timestamp(__dataIn.readLong());
    this.fdtmCompleted.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCompletedWho = null;
    } else {
    this.fstrCompletedWho = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngCrmKey = null;
    } else {
    this.flngCrmKey = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.flngCollectKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCollectKey);
    }
    if (null == this.fintStage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintStage);
    }
    if (null == this.fstrCollectType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCollectType);
    }
    if (null == this.fintSequence) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintSequence);
    }
    if (null == this.fstrStageFlow) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStageFlow);
    }
    if (null == this.fstrStagedFrom) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStagedFrom);
    }
    if (null == this.fstrStagedTo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStagedTo);
    }
    if (null == this.fdtmStagedOn) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmStagedOn.getTime());
    __dataOut.writeInt(this.fdtmStagedOn.getNanos());
    }
    if (null == this.fstrStageAction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStageAction);
    }
    if (null == this.fcurTaxBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxBalance, __dataOut);
    }
    if (null == this.fcurPenaltyBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPenaltyBalance, __dataOut);
    }
    if (null == this.fcurInterestBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInterestBalance, __dataOut);
    }
    if (null == this.fcurBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBalance, __dataOut);
    }
    if (null == this.fblnAutomated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAutomated);
    }
    if (null == this.fdtmCompleted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCompleted.getTime());
    __dataOut.writeInt(this.fdtmCompleted.getNanos());
    }
    if (null == this.fstrCompletedWho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCompletedWho);
    }
    if (null == this.flngCrmKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCrmKey);
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
    if (null == this.flngCollectKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCollectKey);
    }
    if (null == this.fintStage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintStage);
    }
    if (null == this.fstrCollectType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCollectType);
    }
    if (null == this.fintSequence) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintSequence);
    }
    if (null == this.fstrStageFlow) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStageFlow);
    }
    if (null == this.fstrStagedFrom) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStagedFrom);
    }
    if (null == this.fstrStagedTo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStagedTo);
    }
    if (null == this.fdtmStagedOn) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmStagedOn.getTime());
    __dataOut.writeInt(this.fdtmStagedOn.getNanos());
    }
    if (null == this.fstrStageAction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStageAction);
    }
    if (null == this.fcurTaxBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxBalance, __dataOut);
    }
    if (null == this.fcurPenaltyBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPenaltyBalance, __dataOut);
    }
    if (null == this.fcurInterestBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInterestBalance, __dataOut);
    }
    if (null == this.fcurBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBalance, __dataOut);
    }
    if (null == this.fblnAutomated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAutomated);
    }
    if (null == this.fdtmCompleted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCompleted.getTime());
    __dataOut.writeInt(this.fdtmCompleted.getNanos());
    }
    if (null == this.fstrCompletedWho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCompletedWho);
    }
    if (null == this.flngCrmKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCrmKey);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngCollectKey==null?"\\N":"" + flngCollectKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintStage==null?"\\N":"" + fintStage, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCollectType==null?"\\N":fstrCollectType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintSequence==null?"\\N":"" + fintSequence, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStageFlow==null?"\\N":fstrStageFlow, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStagedFrom==null?"\\N":fstrStagedFrom, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStagedTo==null?"\\N":fstrStagedTo, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmStagedOn==null?"\\N":"" + fdtmStagedOn, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStageAction==null?"\\N":fstrStageAction, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxBalance==null?"\\N":fcurTaxBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPenaltyBalance==null?"\\N":fcurPenaltyBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterestBalance==null?"\\N":fcurInterestBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBalance==null?"\\N":fcurBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAutomated==null?"\\N":"" + fblnAutomated, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCompleted==null?"\\N":"" + fdtmCompleted, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCompletedWho==null?"\\N":fstrCompletedWho, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCrmKey==null?"\\N":"" + flngCrmKey, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngCollectKey==null?"\\N":"" + flngCollectKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintStage==null?"\\N":"" + fintStage, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCollectType==null?"\\N":fstrCollectType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintSequence==null?"\\N":"" + fintSequence, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStageFlow==null?"\\N":fstrStageFlow, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStagedFrom==null?"\\N":fstrStagedFrom, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStagedTo==null?"\\N":fstrStagedTo, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmStagedOn==null?"\\N":"" + fdtmStagedOn, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStageAction==null?"\\N":fstrStageAction, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxBalance==null?"\\N":fcurTaxBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPenaltyBalance==null?"\\N":fcurPenaltyBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterestBalance==null?"\\N":fcurInterestBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBalance==null?"\\N":fcurBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAutomated==null?"\\N":"" + fblnAutomated, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCompleted==null?"\\N":"" + fdtmCompleted, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCompletedWho==null?"\\N":fstrCompletedWho, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCrmKey==null?"\\N":"" + flngCrmKey, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCollectKey = null; } else {
      this.flngCollectKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintStage = null; } else {
      this.fintStage = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCollectType = null; } else {
      this.fstrCollectType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintSequence = null; } else {
      this.fintSequence = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrStageFlow = null; } else {
      this.fstrStageFlow = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrStagedFrom = null; } else {
      this.fstrStagedFrom = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrStagedTo = null; } else {
      this.fstrStagedTo = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmStagedOn = null; } else {
      this.fdtmStagedOn = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrStageAction = null; } else {
      this.fstrStageAction = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPenaltyBalance = null; } else {
      this.fcurPenaltyBalance = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBalance = null; } else {
      this.fcurBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAutomated = null; } else {
      this.fblnAutomated = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCompleted = null; } else {
      this.fdtmCompleted = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCompletedWho = null; } else {
      this.fstrCompletedWho = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCollectKey = null; } else {
      this.flngCollectKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintStage = null; } else {
      this.fintStage = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCollectType = null; } else {
      this.fstrCollectType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintSequence = null; } else {
      this.fintSequence = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrStageFlow = null; } else {
      this.fstrStageFlow = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrStagedFrom = null; } else {
      this.fstrStagedFrom = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrStagedTo = null; } else {
      this.fstrStagedTo = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmStagedOn = null; } else {
      this.fdtmStagedOn = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrStageAction = null; } else {
      this.fstrStageAction = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPenaltyBalance = null; } else {
      this.fcurPenaltyBalance = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBalance = null; } else {
      this.fcurBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAutomated = null; } else {
      this.fblnAutomated = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCompleted = null; } else {
      this.fdtmCompleted = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCompletedWho = null; } else {
      this.fstrCompletedWho = __cur_str;
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
    tblcollectstagetostage o = (tblcollectstagetostage) super.clone();
    o.fdtmStagedOn = (o.fdtmStagedOn != null) ? (java.sql.Timestamp) o.fdtmStagedOn.clone() : null;
    o.fdtmCompleted = (o.fdtmCompleted != null) ? (java.sql.Timestamp) o.fdtmCompleted.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblcollectstagetostage o) throws CloneNotSupportedException {
    o.fdtmStagedOn = (o.fdtmStagedOn != null) ? (java.sql.Timestamp) o.fdtmStagedOn.clone() : null;
    o.fdtmCompleted = (o.fdtmCompleted != null) ? (java.sql.Timestamp) o.fdtmCompleted.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngCollectKey", this.flngCollectKey);
    __sqoop$field_map.put("fintStage", this.fintStage);
    __sqoop$field_map.put("fstrCollectType", this.fstrCollectType);
    __sqoop$field_map.put("fintSequence", this.fintSequence);
    __sqoop$field_map.put("fstrStageFlow", this.fstrStageFlow);
    __sqoop$field_map.put("fstrStagedFrom", this.fstrStagedFrom);
    __sqoop$field_map.put("fstrStagedTo", this.fstrStagedTo);
    __sqoop$field_map.put("fdtmStagedOn", this.fdtmStagedOn);
    __sqoop$field_map.put("fstrStageAction", this.fstrStageAction);
    __sqoop$field_map.put("fcurTaxBalance", this.fcurTaxBalance);
    __sqoop$field_map.put("fcurPenaltyBalance", this.fcurPenaltyBalance);
    __sqoop$field_map.put("fcurInterestBalance", this.fcurInterestBalance);
    __sqoop$field_map.put("fcurBalance", this.fcurBalance);
    __sqoop$field_map.put("fblnAutomated", this.fblnAutomated);
    __sqoop$field_map.put("fdtmCompleted", this.fdtmCompleted);
    __sqoop$field_map.put("fstrCompletedWho", this.fstrCompletedWho);
    __sqoop$field_map.put("flngCrmKey", this.flngCrmKey);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngCollectKey", this.flngCollectKey);
    __sqoop$field_map.put("fintStage", this.fintStage);
    __sqoop$field_map.put("fstrCollectType", this.fstrCollectType);
    __sqoop$field_map.put("fintSequence", this.fintSequence);
    __sqoop$field_map.put("fstrStageFlow", this.fstrStageFlow);
    __sqoop$field_map.put("fstrStagedFrom", this.fstrStagedFrom);
    __sqoop$field_map.put("fstrStagedTo", this.fstrStagedTo);
    __sqoop$field_map.put("fdtmStagedOn", this.fdtmStagedOn);
    __sqoop$field_map.put("fstrStageAction", this.fstrStageAction);
    __sqoop$field_map.put("fcurTaxBalance", this.fcurTaxBalance);
    __sqoop$field_map.put("fcurPenaltyBalance", this.fcurPenaltyBalance);
    __sqoop$field_map.put("fcurInterestBalance", this.fcurInterestBalance);
    __sqoop$field_map.put("fcurBalance", this.fcurBalance);
    __sqoop$field_map.put("fblnAutomated", this.fblnAutomated);
    __sqoop$field_map.put("fdtmCompleted", this.fdtmCompleted);
    __sqoop$field_map.put("fstrCompletedWho", this.fstrCompletedWho);
    __sqoop$field_map.put("flngCrmKey", this.flngCrmKey);
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
