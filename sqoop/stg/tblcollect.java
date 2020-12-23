// ORM class for table 'tblcollect'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Dec 03 23:26:11 NZDT 2020
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

public class tblcollect extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngCollectKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollect.this.flngCollectKey = (Integer)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollect.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollect.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("fstrCategory", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollect.this.fstrCategory = (String)value;
      }
    });
    setters.put("fstrCollectType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollect.this.fstrCollectType = (String)value;
      }
    });
    setters.put("flngCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollect.this.flngCustomerKey = (Integer)value;
      }
    });
    setters.put("flngCustomerKey2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollect.this.flngCustomerKey2 = (Integer)value;
      }
    });
    setters.put("flngAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollect.this.flngAccountKey = (Integer)value;
      }
    });
    setters.put("fintCollectProfileNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollect.this.fintCollectProfileNumber = (Integer)value;
      }
    });
    setters.put("flngJournalKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollect.this.flngJournalKey = (Integer)value;
      }
    });
    setters.put("flngIndicatorKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollect.this.flngIndicatorKey = (Integer)value;
      }
    });
    setters.put("flngFolderKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollect.this.flngFolderKey = (Integer)value;
      }
    });
    setters.put("fcurTax", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollect.this.fcurTax = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPenalty", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollect.this.fcurPenalty = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurInterest", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollect.this.fcurInterest = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurBalance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollect.this.fcurBalance = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrCollectDistrictOffice", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollect.this.fstrCollectDistrictOffice = (String)value;
      }
    });
    setters.put("fstrAccountType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollect.this.fstrAccountType = (String)value;
      }
    });
    setters.put("fdtmWorkDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollect.this.fdtmWorkDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmWorkDateTime", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollect.this.fdtmWorkDateTime = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmCreationDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollect.this.fdtmCreationDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmClosedDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollect.this.fdtmClosedDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fblnAutomated", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollect.this.fblnAutomated = (Integer)value;
      }
    });
    setters.put("fdtmNextStage", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollect.this.fdtmNextStage = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrStageFlow", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollect.this.fstrStageFlow = (String)value;
      }
    });
    setters.put("fstrStage", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollect.this.fstrStage = (String)value;
      }
    });
    setters.put("fstrOwner", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollect.this.fstrOwner = (String)value;
      }
    });
    setters.put("flngRisk", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollect.this.flngRisk = (Integer)value;
      }
    });
    setters.put("fstrLastCompletedStage", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollect.this.fstrLastCompletedStage = (String)value;
      }
    });
    setters.put("flngTeamKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollect.this.flngTeamKey = (Integer)value;
      }
    });
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollect.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollect.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcollect.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblcollect() {
    init0();
  }
  private Integer flngCollectKey;
  public Integer get_flngCollectKey() {
    return flngCollectKey;
  }
  public void set_flngCollectKey(Integer flngCollectKey) {
    this.flngCollectKey = flngCollectKey;
  }
  public tblcollect with_flngCollectKey(Integer flngCollectKey) {
    this.flngCollectKey = flngCollectKey;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblcollect with_flngVer(Integer flngVer) {
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
  public tblcollect with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private String fstrCategory;
  public String get_fstrCategory() {
    return fstrCategory;
  }
  public void set_fstrCategory(String fstrCategory) {
    this.fstrCategory = fstrCategory;
  }
  public tblcollect with_fstrCategory(String fstrCategory) {
    this.fstrCategory = fstrCategory;
    return this;
  }
  private String fstrCollectType;
  public String get_fstrCollectType() {
    return fstrCollectType;
  }
  public void set_fstrCollectType(String fstrCollectType) {
    this.fstrCollectType = fstrCollectType;
  }
  public tblcollect with_fstrCollectType(String fstrCollectType) {
    this.fstrCollectType = fstrCollectType;
    return this;
  }
  private Integer flngCustomerKey;
  public Integer get_flngCustomerKey() {
    return flngCustomerKey;
  }
  public void set_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
  }
  public tblcollect with_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
    return this;
  }
  private Integer flngCustomerKey2;
  public Integer get_flngCustomerKey2() {
    return flngCustomerKey2;
  }
  public void set_flngCustomerKey2(Integer flngCustomerKey2) {
    this.flngCustomerKey2 = flngCustomerKey2;
  }
  public tblcollect with_flngCustomerKey2(Integer flngCustomerKey2) {
    this.flngCustomerKey2 = flngCustomerKey2;
    return this;
  }
  private Integer flngAccountKey;
  public Integer get_flngAccountKey() {
    return flngAccountKey;
  }
  public void set_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
  }
  public tblcollect with_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
    return this;
  }
  private Integer fintCollectProfileNumber;
  public Integer get_fintCollectProfileNumber() {
    return fintCollectProfileNumber;
  }
  public void set_fintCollectProfileNumber(Integer fintCollectProfileNumber) {
    this.fintCollectProfileNumber = fintCollectProfileNumber;
  }
  public tblcollect with_fintCollectProfileNumber(Integer fintCollectProfileNumber) {
    this.fintCollectProfileNumber = fintCollectProfileNumber;
    return this;
  }
  private Integer flngJournalKey;
  public Integer get_flngJournalKey() {
    return flngJournalKey;
  }
  public void set_flngJournalKey(Integer flngJournalKey) {
    this.flngJournalKey = flngJournalKey;
  }
  public tblcollect with_flngJournalKey(Integer flngJournalKey) {
    this.flngJournalKey = flngJournalKey;
    return this;
  }
  private Integer flngIndicatorKey;
  public Integer get_flngIndicatorKey() {
    return flngIndicatorKey;
  }
  public void set_flngIndicatorKey(Integer flngIndicatorKey) {
    this.flngIndicatorKey = flngIndicatorKey;
  }
  public tblcollect with_flngIndicatorKey(Integer flngIndicatorKey) {
    this.flngIndicatorKey = flngIndicatorKey;
    return this;
  }
  private Integer flngFolderKey;
  public Integer get_flngFolderKey() {
    return flngFolderKey;
  }
  public void set_flngFolderKey(Integer flngFolderKey) {
    this.flngFolderKey = flngFolderKey;
  }
  public tblcollect with_flngFolderKey(Integer flngFolderKey) {
    this.flngFolderKey = flngFolderKey;
    return this;
  }
  private java.math.BigDecimal fcurTax;
  public java.math.BigDecimal get_fcurTax() {
    return fcurTax;
  }
  public void set_fcurTax(java.math.BigDecimal fcurTax) {
    this.fcurTax = fcurTax;
  }
  public tblcollect with_fcurTax(java.math.BigDecimal fcurTax) {
    this.fcurTax = fcurTax;
    return this;
  }
  private java.math.BigDecimal fcurPenalty;
  public java.math.BigDecimal get_fcurPenalty() {
    return fcurPenalty;
  }
  public void set_fcurPenalty(java.math.BigDecimal fcurPenalty) {
    this.fcurPenalty = fcurPenalty;
  }
  public tblcollect with_fcurPenalty(java.math.BigDecimal fcurPenalty) {
    this.fcurPenalty = fcurPenalty;
    return this;
  }
  private java.math.BigDecimal fcurInterest;
  public java.math.BigDecimal get_fcurInterest() {
    return fcurInterest;
  }
  public void set_fcurInterest(java.math.BigDecimal fcurInterest) {
    this.fcurInterest = fcurInterest;
  }
  public tblcollect with_fcurInterest(java.math.BigDecimal fcurInterest) {
    this.fcurInterest = fcurInterest;
    return this;
  }
  private java.math.BigDecimal fcurBalance;
  public java.math.BigDecimal get_fcurBalance() {
    return fcurBalance;
  }
  public void set_fcurBalance(java.math.BigDecimal fcurBalance) {
    this.fcurBalance = fcurBalance;
  }
  public tblcollect with_fcurBalance(java.math.BigDecimal fcurBalance) {
    this.fcurBalance = fcurBalance;
    return this;
  }
  private String fstrCollectDistrictOffice;
  public String get_fstrCollectDistrictOffice() {
    return fstrCollectDistrictOffice;
  }
  public void set_fstrCollectDistrictOffice(String fstrCollectDistrictOffice) {
    this.fstrCollectDistrictOffice = fstrCollectDistrictOffice;
  }
  public tblcollect with_fstrCollectDistrictOffice(String fstrCollectDistrictOffice) {
    this.fstrCollectDistrictOffice = fstrCollectDistrictOffice;
    return this;
  }
  private String fstrAccountType;
  public String get_fstrAccountType() {
    return fstrAccountType;
  }
  public void set_fstrAccountType(String fstrAccountType) {
    this.fstrAccountType = fstrAccountType;
  }
  public tblcollect with_fstrAccountType(String fstrAccountType) {
    this.fstrAccountType = fstrAccountType;
    return this;
  }
  private java.sql.Timestamp fdtmWorkDate;
  public java.sql.Timestamp get_fdtmWorkDate() {
    return fdtmWorkDate;
  }
  public void set_fdtmWorkDate(java.sql.Timestamp fdtmWorkDate) {
    this.fdtmWorkDate = fdtmWorkDate;
  }
  public tblcollect with_fdtmWorkDate(java.sql.Timestamp fdtmWorkDate) {
    this.fdtmWorkDate = fdtmWorkDate;
    return this;
  }
  private java.sql.Timestamp fdtmWorkDateTime;
  public java.sql.Timestamp get_fdtmWorkDateTime() {
    return fdtmWorkDateTime;
  }
  public void set_fdtmWorkDateTime(java.sql.Timestamp fdtmWorkDateTime) {
    this.fdtmWorkDateTime = fdtmWorkDateTime;
  }
  public tblcollect with_fdtmWorkDateTime(java.sql.Timestamp fdtmWorkDateTime) {
    this.fdtmWorkDateTime = fdtmWorkDateTime;
    return this;
  }
  private java.sql.Timestamp fdtmCreationDate;
  public java.sql.Timestamp get_fdtmCreationDate() {
    return fdtmCreationDate;
  }
  public void set_fdtmCreationDate(java.sql.Timestamp fdtmCreationDate) {
    this.fdtmCreationDate = fdtmCreationDate;
  }
  public tblcollect with_fdtmCreationDate(java.sql.Timestamp fdtmCreationDate) {
    this.fdtmCreationDate = fdtmCreationDate;
    return this;
  }
  private java.sql.Timestamp fdtmClosedDate;
  public java.sql.Timestamp get_fdtmClosedDate() {
    return fdtmClosedDate;
  }
  public void set_fdtmClosedDate(java.sql.Timestamp fdtmClosedDate) {
    this.fdtmClosedDate = fdtmClosedDate;
  }
  public tblcollect with_fdtmClosedDate(java.sql.Timestamp fdtmClosedDate) {
    this.fdtmClosedDate = fdtmClosedDate;
    return this;
  }
  private Integer fblnAutomated;
  public Integer get_fblnAutomated() {
    return fblnAutomated;
  }
  public void set_fblnAutomated(Integer fblnAutomated) {
    this.fblnAutomated = fblnAutomated;
  }
  public tblcollect with_fblnAutomated(Integer fblnAutomated) {
    this.fblnAutomated = fblnAutomated;
    return this;
  }
  private java.sql.Timestamp fdtmNextStage;
  public java.sql.Timestamp get_fdtmNextStage() {
    return fdtmNextStage;
  }
  public void set_fdtmNextStage(java.sql.Timestamp fdtmNextStage) {
    this.fdtmNextStage = fdtmNextStage;
  }
  public tblcollect with_fdtmNextStage(java.sql.Timestamp fdtmNextStage) {
    this.fdtmNextStage = fdtmNextStage;
    return this;
  }
  private String fstrStageFlow;
  public String get_fstrStageFlow() {
    return fstrStageFlow;
  }
  public void set_fstrStageFlow(String fstrStageFlow) {
    this.fstrStageFlow = fstrStageFlow;
  }
  public tblcollect with_fstrStageFlow(String fstrStageFlow) {
    this.fstrStageFlow = fstrStageFlow;
    return this;
  }
  private String fstrStage;
  public String get_fstrStage() {
    return fstrStage;
  }
  public void set_fstrStage(String fstrStage) {
    this.fstrStage = fstrStage;
  }
  public tblcollect with_fstrStage(String fstrStage) {
    this.fstrStage = fstrStage;
    return this;
  }
  private String fstrOwner;
  public String get_fstrOwner() {
    return fstrOwner;
  }
  public void set_fstrOwner(String fstrOwner) {
    this.fstrOwner = fstrOwner;
  }
  public tblcollect with_fstrOwner(String fstrOwner) {
    this.fstrOwner = fstrOwner;
    return this;
  }
  private Integer flngRisk;
  public Integer get_flngRisk() {
    return flngRisk;
  }
  public void set_flngRisk(Integer flngRisk) {
    this.flngRisk = flngRisk;
  }
  public tblcollect with_flngRisk(Integer flngRisk) {
    this.flngRisk = flngRisk;
    return this;
  }
  private String fstrLastCompletedStage;
  public String get_fstrLastCompletedStage() {
    return fstrLastCompletedStage;
  }
  public void set_fstrLastCompletedStage(String fstrLastCompletedStage) {
    this.fstrLastCompletedStage = fstrLastCompletedStage;
  }
  public tblcollect with_fstrLastCompletedStage(String fstrLastCompletedStage) {
    this.fstrLastCompletedStage = fstrLastCompletedStage;
    return this;
  }
  private Integer flngTeamKey;
  public Integer get_flngTeamKey() {
    return flngTeamKey;
  }
  public void set_flngTeamKey(Integer flngTeamKey) {
    this.flngTeamKey = flngTeamKey;
  }
  public tblcollect with_flngTeamKey(Integer flngTeamKey) {
    this.flngTeamKey = flngTeamKey;
    return this;
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblcollect with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblcollect with_fstrWho(String fstrWho) {
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
  public tblcollect with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblcollect)) {
      return false;
    }
    tblcollect that = (tblcollect) o;
    boolean equal = true;
    equal = equal && (this.flngCollectKey == null ? that.flngCollectKey == null : this.flngCollectKey.equals(that.flngCollectKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fstrCategory == null ? that.fstrCategory == null : this.fstrCategory.equals(that.fstrCategory));
    equal = equal && (this.fstrCollectType == null ? that.fstrCollectType == null : this.fstrCollectType.equals(that.fstrCollectType));
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.flngCustomerKey2 == null ? that.flngCustomerKey2 == null : this.flngCustomerKey2.equals(that.flngCustomerKey2));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fintCollectProfileNumber == null ? that.fintCollectProfileNumber == null : this.fintCollectProfileNumber.equals(that.fintCollectProfileNumber));
    equal = equal && (this.flngJournalKey == null ? that.flngJournalKey == null : this.flngJournalKey.equals(that.flngJournalKey));
    equal = equal && (this.flngIndicatorKey == null ? that.flngIndicatorKey == null : this.flngIndicatorKey.equals(that.flngIndicatorKey));
    equal = equal && (this.flngFolderKey == null ? that.flngFolderKey == null : this.flngFolderKey.equals(that.flngFolderKey));
    equal = equal && (this.fcurTax == null ? that.fcurTax == null : this.fcurTax.equals(that.fcurTax));
    equal = equal && (this.fcurPenalty == null ? that.fcurPenalty == null : this.fcurPenalty.equals(that.fcurPenalty));
    equal = equal && (this.fcurInterest == null ? that.fcurInterest == null : this.fcurInterest.equals(that.fcurInterest));
    equal = equal && (this.fcurBalance == null ? that.fcurBalance == null : this.fcurBalance.equals(that.fcurBalance));
    equal = equal && (this.fstrCollectDistrictOffice == null ? that.fstrCollectDistrictOffice == null : this.fstrCollectDistrictOffice.equals(that.fstrCollectDistrictOffice));
    equal = equal && (this.fstrAccountType == null ? that.fstrAccountType == null : this.fstrAccountType.equals(that.fstrAccountType));
    equal = equal && (this.fdtmWorkDate == null ? that.fdtmWorkDate == null : this.fdtmWorkDate.equals(that.fdtmWorkDate));
    equal = equal && (this.fdtmWorkDateTime == null ? that.fdtmWorkDateTime == null : this.fdtmWorkDateTime.equals(that.fdtmWorkDateTime));
    equal = equal && (this.fdtmCreationDate == null ? that.fdtmCreationDate == null : this.fdtmCreationDate.equals(that.fdtmCreationDate));
    equal = equal && (this.fdtmClosedDate == null ? that.fdtmClosedDate == null : this.fdtmClosedDate.equals(that.fdtmClosedDate));
    equal = equal && (this.fblnAutomated == null ? that.fblnAutomated == null : this.fblnAutomated.equals(that.fblnAutomated));
    equal = equal && (this.fdtmNextStage == null ? that.fdtmNextStage == null : this.fdtmNextStage.equals(that.fdtmNextStage));
    equal = equal && (this.fstrStageFlow == null ? that.fstrStageFlow == null : this.fstrStageFlow.equals(that.fstrStageFlow));
    equal = equal && (this.fstrStage == null ? that.fstrStage == null : this.fstrStage.equals(that.fstrStage));
    equal = equal && (this.fstrOwner == null ? that.fstrOwner == null : this.fstrOwner.equals(that.fstrOwner));
    equal = equal && (this.flngRisk == null ? that.flngRisk == null : this.flngRisk.equals(that.flngRisk));
    equal = equal && (this.fstrLastCompletedStage == null ? that.fstrLastCompletedStage == null : this.fstrLastCompletedStage.equals(that.fstrLastCompletedStage));
    equal = equal && (this.flngTeamKey == null ? that.flngTeamKey == null : this.flngTeamKey.equals(that.flngTeamKey));
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblcollect)) {
      return false;
    }
    tblcollect that = (tblcollect) o;
    boolean equal = true;
    equal = equal && (this.flngCollectKey == null ? that.flngCollectKey == null : this.flngCollectKey.equals(that.flngCollectKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fstrCategory == null ? that.fstrCategory == null : this.fstrCategory.equals(that.fstrCategory));
    equal = equal && (this.fstrCollectType == null ? that.fstrCollectType == null : this.fstrCollectType.equals(that.fstrCollectType));
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.flngCustomerKey2 == null ? that.flngCustomerKey2 == null : this.flngCustomerKey2.equals(that.flngCustomerKey2));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fintCollectProfileNumber == null ? that.fintCollectProfileNumber == null : this.fintCollectProfileNumber.equals(that.fintCollectProfileNumber));
    equal = equal && (this.flngJournalKey == null ? that.flngJournalKey == null : this.flngJournalKey.equals(that.flngJournalKey));
    equal = equal && (this.flngIndicatorKey == null ? that.flngIndicatorKey == null : this.flngIndicatorKey.equals(that.flngIndicatorKey));
    equal = equal && (this.flngFolderKey == null ? that.flngFolderKey == null : this.flngFolderKey.equals(that.flngFolderKey));
    equal = equal && (this.fcurTax == null ? that.fcurTax == null : this.fcurTax.equals(that.fcurTax));
    equal = equal && (this.fcurPenalty == null ? that.fcurPenalty == null : this.fcurPenalty.equals(that.fcurPenalty));
    equal = equal && (this.fcurInterest == null ? that.fcurInterest == null : this.fcurInterest.equals(that.fcurInterest));
    equal = equal && (this.fcurBalance == null ? that.fcurBalance == null : this.fcurBalance.equals(that.fcurBalance));
    equal = equal && (this.fstrCollectDistrictOffice == null ? that.fstrCollectDistrictOffice == null : this.fstrCollectDistrictOffice.equals(that.fstrCollectDistrictOffice));
    equal = equal && (this.fstrAccountType == null ? that.fstrAccountType == null : this.fstrAccountType.equals(that.fstrAccountType));
    equal = equal && (this.fdtmWorkDate == null ? that.fdtmWorkDate == null : this.fdtmWorkDate.equals(that.fdtmWorkDate));
    equal = equal && (this.fdtmWorkDateTime == null ? that.fdtmWorkDateTime == null : this.fdtmWorkDateTime.equals(that.fdtmWorkDateTime));
    equal = equal && (this.fdtmCreationDate == null ? that.fdtmCreationDate == null : this.fdtmCreationDate.equals(that.fdtmCreationDate));
    equal = equal && (this.fdtmClosedDate == null ? that.fdtmClosedDate == null : this.fdtmClosedDate.equals(that.fdtmClosedDate));
    equal = equal && (this.fblnAutomated == null ? that.fblnAutomated == null : this.fblnAutomated.equals(that.fblnAutomated));
    equal = equal && (this.fdtmNextStage == null ? that.fdtmNextStage == null : this.fdtmNextStage.equals(that.fdtmNextStage));
    equal = equal && (this.fstrStageFlow == null ? that.fstrStageFlow == null : this.fstrStageFlow.equals(that.fstrStageFlow));
    equal = equal && (this.fstrStage == null ? that.fstrStage == null : this.fstrStage.equals(that.fstrStage));
    equal = equal && (this.fstrOwner == null ? that.fstrOwner == null : this.fstrOwner.equals(that.fstrOwner));
    equal = equal && (this.flngRisk == null ? that.flngRisk == null : this.flngRisk.equals(that.flngRisk));
    equal = equal && (this.fstrLastCompletedStage == null ? that.fstrLastCompletedStage == null : this.fstrLastCompletedStage.equals(that.fstrLastCompletedStage));
    equal = equal && (this.flngTeamKey == null ? that.flngTeamKey == null : this.flngTeamKey.equals(that.flngTeamKey));
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngCollectKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrCategory = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrCollectType = JdbcWritableBridge.readString(5, __dbResults);
    this.flngCustomerKey = JdbcWritableBridge.readInteger(6, __dbResults);
    this.flngCustomerKey2 = JdbcWritableBridge.readInteger(7, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fintCollectProfileNumber = JdbcWritableBridge.readInteger(9, __dbResults);
    this.flngJournalKey = JdbcWritableBridge.readInteger(10, __dbResults);
    this.flngIndicatorKey = JdbcWritableBridge.readInteger(11, __dbResults);
    this.flngFolderKey = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fcurTax = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurPenalty = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurInterest = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurBalance = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fstrCollectDistrictOffice = JdbcWritableBridge.readString(17, __dbResults);
    this.fstrAccountType = JdbcWritableBridge.readString(18, __dbResults);
    this.fdtmWorkDate = JdbcWritableBridge.readTimestamp(19, __dbResults);
    this.fdtmWorkDateTime = JdbcWritableBridge.readTimestamp(20, __dbResults);
    this.fdtmCreationDate = JdbcWritableBridge.readTimestamp(21, __dbResults);
    this.fdtmClosedDate = JdbcWritableBridge.readTimestamp(22, __dbResults);
    this.fblnAutomated = JdbcWritableBridge.readInteger(23, __dbResults);
    this.fdtmNextStage = JdbcWritableBridge.readTimestamp(24, __dbResults);
    this.fstrStageFlow = JdbcWritableBridge.readString(25, __dbResults);
    this.fstrStage = JdbcWritableBridge.readString(26, __dbResults);
    this.fstrOwner = JdbcWritableBridge.readString(27, __dbResults);
    this.flngRisk = JdbcWritableBridge.readInteger(28, __dbResults);
    this.fstrLastCompletedStage = JdbcWritableBridge.readString(29, __dbResults);
    this.flngTeamKey = JdbcWritableBridge.readInteger(30, __dbResults);
    this.flngDocKey = JdbcWritableBridge.readInteger(31, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(32, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(33, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngCollectKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrCategory = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrCollectType = JdbcWritableBridge.readString(5, __dbResults);
    this.flngCustomerKey = JdbcWritableBridge.readInteger(6, __dbResults);
    this.flngCustomerKey2 = JdbcWritableBridge.readInteger(7, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fintCollectProfileNumber = JdbcWritableBridge.readInteger(9, __dbResults);
    this.flngJournalKey = JdbcWritableBridge.readInteger(10, __dbResults);
    this.flngIndicatorKey = JdbcWritableBridge.readInteger(11, __dbResults);
    this.flngFolderKey = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fcurTax = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurPenalty = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurInterest = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurBalance = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fstrCollectDistrictOffice = JdbcWritableBridge.readString(17, __dbResults);
    this.fstrAccountType = JdbcWritableBridge.readString(18, __dbResults);
    this.fdtmWorkDate = JdbcWritableBridge.readTimestamp(19, __dbResults);
    this.fdtmWorkDateTime = JdbcWritableBridge.readTimestamp(20, __dbResults);
    this.fdtmCreationDate = JdbcWritableBridge.readTimestamp(21, __dbResults);
    this.fdtmClosedDate = JdbcWritableBridge.readTimestamp(22, __dbResults);
    this.fblnAutomated = JdbcWritableBridge.readInteger(23, __dbResults);
    this.fdtmNextStage = JdbcWritableBridge.readTimestamp(24, __dbResults);
    this.fstrStageFlow = JdbcWritableBridge.readString(25, __dbResults);
    this.fstrStage = JdbcWritableBridge.readString(26, __dbResults);
    this.fstrOwner = JdbcWritableBridge.readString(27, __dbResults);
    this.flngRisk = JdbcWritableBridge.readInteger(28, __dbResults);
    this.fstrLastCompletedStage = JdbcWritableBridge.readString(29, __dbResults);
    this.flngTeamKey = JdbcWritableBridge.readInteger(30, __dbResults);
    this.flngDocKey = JdbcWritableBridge.readInteger(31, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(32, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(33, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrCategory, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCollectType, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey2, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintCollectProfileNumber, 9 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngJournalKey, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngIndicatorKey, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFolderKey, 12 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTax, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPenalty, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterest, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBalance, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrCollectDistrictOffice, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountType, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWorkDate, 19 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWorkDateTime, 20 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCreationDate, 21 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmClosedDate, 22 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAutomated, 23 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmNextStage, 24 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrStageFlow, 25 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrStage, 26 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOwner, 27 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngRisk, 28 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrLastCompletedStage, 29 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngTeamKey, 30 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDocKey, 31 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 32 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 33 + __off, 93, __dbStmt);
    return 33;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngCollectKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrCategory, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCollectType, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey2, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintCollectProfileNumber, 9 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngJournalKey, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngIndicatorKey, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFolderKey, 12 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTax, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPenalty, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterest, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBalance, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrCollectDistrictOffice, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountType, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWorkDate, 19 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWorkDateTime, 20 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCreationDate, 21 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmClosedDate, 22 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAutomated, 23 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmNextStage, 24 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrStageFlow, 25 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrStage, 26 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOwner, 27 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngRisk, 28 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrLastCompletedStage, 29 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngTeamKey, 30 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDocKey, 31 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 32 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 33 + __off, 93, __dbStmt);
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
        this.fstrCategory = null;
    } else {
    this.fstrCategory = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCollectType = null;
    } else {
    this.fstrCollectType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngCustomerKey = null;
    } else {
    this.flngCustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngCustomerKey2 = null;
    } else {
    this.flngCustomerKey2 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngAccountKey = null;
    } else {
    this.flngAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintCollectProfileNumber = null;
    } else {
    this.fintCollectProfileNumber = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngJournalKey = null;
    } else {
    this.flngJournalKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngIndicatorKey = null;
    } else {
    this.flngIndicatorKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngFolderKey = null;
    } else {
    this.flngFolderKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTax = null;
    } else {
    this.fcurTax = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPenalty = null;
    } else {
    this.fcurPenalty = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurInterest = null;
    } else {
    this.fcurInterest = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurBalance = null;
    } else {
    this.fcurBalance = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCollectDistrictOffice = null;
    } else {
    this.fstrCollectDistrictOffice = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAccountType = null;
    } else {
    this.fstrAccountType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmWorkDate = null;
    } else {
    this.fdtmWorkDate = new Timestamp(__dataIn.readLong());
    this.fdtmWorkDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmWorkDateTime = null;
    } else {
    this.fdtmWorkDateTime = new Timestamp(__dataIn.readLong());
    this.fdtmWorkDateTime.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmCreationDate = null;
    } else {
    this.fdtmCreationDate = new Timestamp(__dataIn.readLong());
    this.fdtmCreationDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmClosedDate = null;
    } else {
    this.fdtmClosedDate = new Timestamp(__dataIn.readLong());
    this.fdtmClosedDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnAutomated = null;
    } else {
    this.fblnAutomated = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmNextStage = null;
    } else {
    this.fdtmNextStage = new Timestamp(__dataIn.readLong());
    this.fdtmNextStage.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrStageFlow = null;
    } else {
    this.fstrStageFlow = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrStage = null;
    } else {
    this.fstrStage = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrOwner = null;
    } else {
    this.fstrOwner = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngRisk = null;
    } else {
    this.flngRisk = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrLastCompletedStage = null;
    } else {
    this.fstrLastCompletedStage = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngTeamKey = null;
    } else {
    this.flngTeamKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngDocKey = null;
    } else {
    this.flngDocKey = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.fstrCategory) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCategory);
    }
    if (null == this.fstrCollectType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCollectType);
    }
    if (null == this.flngCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey);
    }
    if (null == this.flngCustomerKey2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey2);
    }
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
    }
    if (null == this.fintCollectProfileNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintCollectProfileNumber);
    }
    if (null == this.flngJournalKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngJournalKey);
    }
    if (null == this.flngIndicatorKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngIndicatorKey);
    }
    if (null == this.flngFolderKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFolderKey);
    }
    if (null == this.fcurTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTax, __dataOut);
    }
    if (null == this.fcurPenalty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPenalty, __dataOut);
    }
    if (null == this.fcurInterest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInterest, __dataOut);
    }
    if (null == this.fcurBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBalance, __dataOut);
    }
    if (null == this.fstrCollectDistrictOffice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCollectDistrictOffice);
    }
    if (null == this.fstrAccountType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAccountType);
    }
    if (null == this.fdtmWorkDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmWorkDate.getTime());
    __dataOut.writeInt(this.fdtmWorkDate.getNanos());
    }
    if (null == this.fdtmWorkDateTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmWorkDateTime.getTime());
    __dataOut.writeInt(this.fdtmWorkDateTime.getNanos());
    }
    if (null == this.fdtmCreationDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCreationDate.getTime());
    __dataOut.writeInt(this.fdtmCreationDate.getNanos());
    }
    if (null == this.fdtmClosedDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmClosedDate.getTime());
    __dataOut.writeInt(this.fdtmClosedDate.getNanos());
    }
    if (null == this.fblnAutomated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAutomated);
    }
    if (null == this.fdtmNextStage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmNextStage.getTime());
    __dataOut.writeInt(this.fdtmNextStage.getNanos());
    }
    if (null == this.fstrStageFlow) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStageFlow);
    }
    if (null == this.fstrStage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStage);
    }
    if (null == this.fstrOwner) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOwner);
    }
    if (null == this.flngRisk) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngRisk);
    }
    if (null == this.fstrLastCompletedStage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLastCompletedStage);
    }
    if (null == this.flngTeamKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTeamKey);
    }
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
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
    if (null == this.fstrCategory) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCategory);
    }
    if (null == this.fstrCollectType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCollectType);
    }
    if (null == this.flngCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey);
    }
    if (null == this.flngCustomerKey2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey2);
    }
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
    }
    if (null == this.fintCollectProfileNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintCollectProfileNumber);
    }
    if (null == this.flngJournalKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngJournalKey);
    }
    if (null == this.flngIndicatorKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngIndicatorKey);
    }
    if (null == this.flngFolderKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFolderKey);
    }
    if (null == this.fcurTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTax, __dataOut);
    }
    if (null == this.fcurPenalty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPenalty, __dataOut);
    }
    if (null == this.fcurInterest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInterest, __dataOut);
    }
    if (null == this.fcurBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBalance, __dataOut);
    }
    if (null == this.fstrCollectDistrictOffice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCollectDistrictOffice);
    }
    if (null == this.fstrAccountType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAccountType);
    }
    if (null == this.fdtmWorkDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmWorkDate.getTime());
    __dataOut.writeInt(this.fdtmWorkDate.getNanos());
    }
    if (null == this.fdtmWorkDateTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmWorkDateTime.getTime());
    __dataOut.writeInt(this.fdtmWorkDateTime.getNanos());
    }
    if (null == this.fdtmCreationDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCreationDate.getTime());
    __dataOut.writeInt(this.fdtmCreationDate.getNanos());
    }
    if (null == this.fdtmClosedDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmClosedDate.getTime());
    __dataOut.writeInt(this.fdtmClosedDate.getNanos());
    }
    if (null == this.fblnAutomated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAutomated);
    }
    if (null == this.fdtmNextStage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmNextStage.getTime());
    __dataOut.writeInt(this.fdtmNextStage.getNanos());
    }
    if (null == this.fstrStageFlow) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStageFlow);
    }
    if (null == this.fstrStage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStage);
    }
    if (null == this.fstrOwner) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOwner);
    }
    if (null == this.flngRisk) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngRisk);
    }
    if (null == this.fstrLastCompletedStage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLastCompletedStage);
    }
    if (null == this.flngTeamKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTeamKey);
    }
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCategory==null?"\\N":fstrCategory, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCollectType==null?"\\N":fstrCollectType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey2==null?"\\N":"" + flngCustomerKey2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintCollectProfileNumber==null?"\\N":"" + fintCollectProfileNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngJournalKey==null?"\\N":"" + flngJournalKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngIndicatorKey==null?"\\N":"" + flngIndicatorKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFolderKey==null?"\\N":"" + flngFolderKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTax==null?"\\N":fcurTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPenalty==null?"\\N":fcurPenalty.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterest==null?"\\N":fcurInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBalance==null?"\\N":fcurBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCollectDistrictOffice==null?"\\N":fstrCollectDistrictOffice, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAccountType==null?"\\N":fstrAccountType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmWorkDate==null?"\\N":"" + fdtmWorkDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmWorkDateTime==null?"\\N":"" + fdtmWorkDateTime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCreationDate==null?"\\N":"" + fdtmCreationDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmClosedDate==null?"\\N":"" + fdtmClosedDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAutomated==null?"\\N":"" + fblnAutomated, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmNextStage==null?"\\N":"" + fdtmNextStage, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStageFlow==null?"\\N":fstrStageFlow, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStage==null?"\\N":fstrStage, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOwner==null?"\\N":fstrOwner, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngRisk==null?"\\N":"" + flngRisk, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLastCompletedStage==null?"\\N":fstrLastCompletedStage, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngTeamKey==null?"\\N":"" + flngTeamKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCategory==null?"\\N":fstrCategory, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCollectType==null?"\\N":fstrCollectType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey2==null?"\\N":"" + flngCustomerKey2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintCollectProfileNumber==null?"\\N":"" + fintCollectProfileNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngJournalKey==null?"\\N":"" + flngJournalKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngIndicatorKey==null?"\\N":"" + flngIndicatorKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFolderKey==null?"\\N":"" + flngFolderKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTax==null?"\\N":fcurTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPenalty==null?"\\N":fcurPenalty.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterest==null?"\\N":fcurInterest.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBalance==null?"\\N":fcurBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCollectDistrictOffice==null?"\\N":fstrCollectDistrictOffice, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAccountType==null?"\\N":fstrAccountType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmWorkDate==null?"\\N":"" + fdtmWorkDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmWorkDateTime==null?"\\N":"" + fdtmWorkDateTime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCreationDate==null?"\\N":"" + fdtmCreationDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmClosedDate==null?"\\N":"" + fdtmClosedDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAutomated==null?"\\N":"" + fblnAutomated, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmNextStage==null?"\\N":"" + fdtmNextStage, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStageFlow==null?"\\N":fstrStageFlow, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStage==null?"\\N":fstrStage, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOwner==null?"\\N":fstrOwner, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngRisk==null?"\\N":"" + flngRisk, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLastCompletedStage==null?"\\N":fstrLastCompletedStage, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngTeamKey==null?"\\N":"" + flngTeamKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
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
    if (__cur_str.equals("null")) { this.fstrCategory = null; } else {
      this.fstrCategory = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCustomerKey = null; } else {
      this.flngCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCustomerKey2 = null; } else {
      this.flngCustomerKey2 = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintCollectProfileNumber = null; } else {
      this.fintCollectProfileNumber = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngJournalKey = null; } else {
      this.flngJournalKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngIndicatorKey = null; } else {
      this.flngIndicatorKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFolderKey = null; } else {
      this.flngFolderKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPenalty = null; } else {
      this.fcurPenalty = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBalance = null; } else {
      this.fcurBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCollectDistrictOffice = null; } else {
      this.fstrCollectDistrictOffice = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmWorkDate = null; } else {
      this.fdtmWorkDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmWorkDateTime = null; } else {
      this.fdtmWorkDateTime = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCreationDate = null; } else {
      this.fdtmCreationDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmClosedDate = null; } else {
      this.fdtmClosedDate = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmNextStage = null; } else {
      this.fdtmNextStage = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrStage = null; } else {
      this.fstrStage = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOwner = null; } else {
      this.fstrOwner = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngRisk = null; } else {
      this.flngRisk = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLastCompletedStage = null; } else {
      this.fstrLastCompletedStage = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTeamKey = null; } else {
      this.flngTeamKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrCategory = null; } else {
      this.fstrCategory = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCustomerKey = null; } else {
      this.flngCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCustomerKey2 = null; } else {
      this.flngCustomerKey2 = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintCollectProfileNumber = null; } else {
      this.fintCollectProfileNumber = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngJournalKey = null; } else {
      this.flngJournalKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngIndicatorKey = null; } else {
      this.flngIndicatorKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFolderKey = null; } else {
      this.flngFolderKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPenalty = null; } else {
      this.fcurPenalty = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBalance = null; } else {
      this.fcurBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCollectDistrictOffice = null; } else {
      this.fstrCollectDistrictOffice = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmWorkDate = null; } else {
      this.fdtmWorkDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmWorkDateTime = null; } else {
      this.fdtmWorkDateTime = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCreationDate = null; } else {
      this.fdtmCreationDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmClosedDate = null; } else {
      this.fdtmClosedDate = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmNextStage = null; } else {
      this.fdtmNextStage = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrStage = null; } else {
      this.fstrStage = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOwner = null; } else {
      this.fstrOwner = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngRisk = null; } else {
      this.flngRisk = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLastCompletedStage = null; } else {
      this.fstrLastCompletedStage = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTeamKey = null; } else {
      this.flngTeamKey = Integer.valueOf(__cur_str);
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
    tblcollect o = (tblcollect) super.clone();
    o.fdtmWorkDate = (o.fdtmWorkDate != null) ? (java.sql.Timestamp) o.fdtmWorkDate.clone() : null;
    o.fdtmWorkDateTime = (o.fdtmWorkDateTime != null) ? (java.sql.Timestamp) o.fdtmWorkDateTime.clone() : null;
    o.fdtmCreationDate = (o.fdtmCreationDate != null) ? (java.sql.Timestamp) o.fdtmCreationDate.clone() : null;
    o.fdtmClosedDate = (o.fdtmClosedDate != null) ? (java.sql.Timestamp) o.fdtmClosedDate.clone() : null;
    o.fdtmNextStage = (o.fdtmNextStage != null) ? (java.sql.Timestamp) o.fdtmNextStage.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblcollect o) throws CloneNotSupportedException {
    o.fdtmWorkDate = (o.fdtmWorkDate != null) ? (java.sql.Timestamp) o.fdtmWorkDate.clone() : null;
    o.fdtmWorkDateTime = (o.fdtmWorkDateTime != null) ? (java.sql.Timestamp) o.fdtmWorkDateTime.clone() : null;
    o.fdtmCreationDate = (o.fdtmCreationDate != null) ? (java.sql.Timestamp) o.fdtmCreationDate.clone() : null;
    o.fdtmClosedDate = (o.fdtmClosedDate != null) ? (java.sql.Timestamp) o.fdtmClosedDate.clone() : null;
    o.fdtmNextStage = (o.fdtmNextStage != null) ? (java.sql.Timestamp) o.fdtmNextStage.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngCollectKey", this.flngCollectKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fstrCategory", this.fstrCategory);
    __sqoop$field_map.put("fstrCollectType", this.fstrCollectType);
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("flngCustomerKey2", this.flngCustomerKey2);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fintCollectProfileNumber", this.fintCollectProfileNumber);
    __sqoop$field_map.put("flngJournalKey", this.flngJournalKey);
    __sqoop$field_map.put("flngIndicatorKey", this.flngIndicatorKey);
    __sqoop$field_map.put("flngFolderKey", this.flngFolderKey);
    __sqoop$field_map.put("fcurTax", this.fcurTax);
    __sqoop$field_map.put("fcurPenalty", this.fcurPenalty);
    __sqoop$field_map.put("fcurInterest", this.fcurInterest);
    __sqoop$field_map.put("fcurBalance", this.fcurBalance);
    __sqoop$field_map.put("fstrCollectDistrictOffice", this.fstrCollectDistrictOffice);
    __sqoop$field_map.put("fstrAccountType", this.fstrAccountType);
    __sqoop$field_map.put("fdtmWorkDate", this.fdtmWorkDate);
    __sqoop$field_map.put("fdtmWorkDateTime", this.fdtmWorkDateTime);
    __sqoop$field_map.put("fdtmCreationDate", this.fdtmCreationDate);
    __sqoop$field_map.put("fdtmClosedDate", this.fdtmClosedDate);
    __sqoop$field_map.put("fblnAutomated", this.fblnAutomated);
    __sqoop$field_map.put("fdtmNextStage", this.fdtmNextStage);
    __sqoop$field_map.put("fstrStageFlow", this.fstrStageFlow);
    __sqoop$field_map.put("fstrStage", this.fstrStage);
    __sqoop$field_map.put("fstrOwner", this.fstrOwner);
    __sqoop$field_map.put("flngRisk", this.flngRisk);
    __sqoop$field_map.put("fstrLastCompletedStage", this.fstrLastCompletedStage);
    __sqoop$field_map.put("flngTeamKey", this.flngTeamKey);
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngCollectKey", this.flngCollectKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fstrCategory", this.fstrCategory);
    __sqoop$field_map.put("fstrCollectType", this.fstrCollectType);
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("flngCustomerKey2", this.flngCustomerKey2);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fintCollectProfileNumber", this.fintCollectProfileNumber);
    __sqoop$field_map.put("flngJournalKey", this.flngJournalKey);
    __sqoop$field_map.put("flngIndicatorKey", this.flngIndicatorKey);
    __sqoop$field_map.put("flngFolderKey", this.flngFolderKey);
    __sqoop$field_map.put("fcurTax", this.fcurTax);
    __sqoop$field_map.put("fcurPenalty", this.fcurPenalty);
    __sqoop$field_map.put("fcurInterest", this.fcurInterest);
    __sqoop$field_map.put("fcurBalance", this.fcurBalance);
    __sqoop$field_map.put("fstrCollectDistrictOffice", this.fstrCollectDistrictOffice);
    __sqoop$field_map.put("fstrAccountType", this.fstrAccountType);
    __sqoop$field_map.put("fdtmWorkDate", this.fdtmWorkDate);
    __sqoop$field_map.put("fdtmWorkDateTime", this.fdtmWorkDateTime);
    __sqoop$field_map.put("fdtmCreationDate", this.fdtmCreationDate);
    __sqoop$field_map.put("fdtmClosedDate", this.fdtmClosedDate);
    __sqoop$field_map.put("fblnAutomated", this.fblnAutomated);
    __sqoop$field_map.put("fdtmNextStage", this.fdtmNextStage);
    __sqoop$field_map.put("fstrStageFlow", this.fstrStageFlow);
    __sqoop$field_map.put("fstrStage", this.fstrStage);
    __sqoop$field_map.put("fstrOwner", this.fstrOwner);
    __sqoop$field_map.put("flngRisk", this.flngRisk);
    __sqoop$field_map.put("fstrLastCompletedStage", this.fstrLastCompletedStage);
    __sqoop$field_map.put("flngTeamKey", this.flngTeamKey);
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
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
