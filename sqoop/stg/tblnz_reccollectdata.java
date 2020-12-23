// ORM class for table 'tblnz_reccollectdata'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 05:29:38 NZDT 2020
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

public class tblnz_reccollectdata extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDataKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_reccollectdata.this.flngDataKey = (Integer)value;
      }
    });
    setters.put("flngParentKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_reccollectdata.this.flngParentKey = (Integer)value;
      }
    });
    setters.put("fdtmBegin", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_reccollectdata.this.fdtmBegin = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmEnd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_reccollectdata.this.fdtmEnd = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrRecoveryGroup", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_reccollectdata.this.fstrRecoveryGroup = (String)value;
      }
    });
    setters.put("fstrOwner", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_reccollectdata.this.fstrOwner = (String)value;
      }
    });
    setters.put("fstrManager", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_reccollectdata.this.fstrManager = (String)value;
      }
    });
    setters.put("fstrDistrictOffice", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_reccollectdata.this.fstrDistrictOffice = (String)value;
      }
    });
    setters.put("fstrType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_reccollectdata.this.fstrType = (String)value;
      }
    });
    setters.put("fstrStage", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_reccollectdata.this.fstrStage = (String)value;
      }
    });
    setters.put("fblnAutomated", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_reccollectdata.this.fblnAutomated = (Integer)value;
      }
    });
    setters.put("fdtmNextStage", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_reccollectdata.this.fdtmNextStage = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrStageFlow", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_reccollectdata.this.fstrStageFlow = (String)value;
      }
    });
    setters.put("fstrCategory", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_reccollectdata.this.fstrCategory = (String)value;
      }
    });
    setters.put("flngCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_reccollectdata.this.flngCustomerKey = (Integer)value;
      }
    });
    setters.put("flngCustomerKey2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_reccollectdata.this.flngCustomerKey2 = (Integer)value;
      }
    });
    setters.put("flngAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_reccollectdata.this.flngAccountKey = (Integer)value;
      }
    });
    setters.put("fstrCollectionAgency", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_reccollectdata.this.fstrCollectionAgency = (String)value;
      }
    });
    setters.put("fstrActionTaken", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_reccollectdata.this.fstrActionTaken = (String)value;
      }
    });
    setters.put("fstrSource", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_reccollectdata.this.fstrSource = (String)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_reccollectdata.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_reccollectdata.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_reccollectdata() {
    init0();
  }
  private Integer flngDataKey;
  public Integer get_flngDataKey() {
    return flngDataKey;
  }
  public void set_flngDataKey(Integer flngDataKey) {
    this.flngDataKey = flngDataKey;
  }
  public tblnz_reccollectdata with_flngDataKey(Integer flngDataKey) {
    this.flngDataKey = flngDataKey;
    return this;
  }
  private Integer flngParentKey;
  public Integer get_flngParentKey() {
    return flngParentKey;
  }
  public void set_flngParentKey(Integer flngParentKey) {
    this.flngParentKey = flngParentKey;
  }
  public tblnz_reccollectdata with_flngParentKey(Integer flngParentKey) {
    this.flngParentKey = flngParentKey;
    return this;
  }
  private java.sql.Timestamp fdtmBegin;
  public java.sql.Timestamp get_fdtmBegin() {
    return fdtmBegin;
  }
  public void set_fdtmBegin(java.sql.Timestamp fdtmBegin) {
    this.fdtmBegin = fdtmBegin;
  }
  public tblnz_reccollectdata with_fdtmBegin(java.sql.Timestamp fdtmBegin) {
    this.fdtmBegin = fdtmBegin;
    return this;
  }
  private java.sql.Timestamp fdtmEnd;
  public java.sql.Timestamp get_fdtmEnd() {
    return fdtmEnd;
  }
  public void set_fdtmEnd(java.sql.Timestamp fdtmEnd) {
    this.fdtmEnd = fdtmEnd;
  }
  public tblnz_reccollectdata with_fdtmEnd(java.sql.Timestamp fdtmEnd) {
    this.fdtmEnd = fdtmEnd;
    return this;
  }
  private String fstrRecoveryGroup;
  public String get_fstrRecoveryGroup() {
    return fstrRecoveryGroup;
  }
  public void set_fstrRecoveryGroup(String fstrRecoveryGroup) {
    this.fstrRecoveryGroup = fstrRecoveryGroup;
  }
  public tblnz_reccollectdata with_fstrRecoveryGroup(String fstrRecoveryGroup) {
    this.fstrRecoveryGroup = fstrRecoveryGroup;
    return this;
  }
  private String fstrOwner;
  public String get_fstrOwner() {
    return fstrOwner;
  }
  public void set_fstrOwner(String fstrOwner) {
    this.fstrOwner = fstrOwner;
  }
  public tblnz_reccollectdata with_fstrOwner(String fstrOwner) {
    this.fstrOwner = fstrOwner;
    return this;
  }
  private String fstrManager;
  public String get_fstrManager() {
    return fstrManager;
  }
  public void set_fstrManager(String fstrManager) {
    this.fstrManager = fstrManager;
  }
  public tblnz_reccollectdata with_fstrManager(String fstrManager) {
    this.fstrManager = fstrManager;
    return this;
  }
  private String fstrDistrictOffice;
  public String get_fstrDistrictOffice() {
    return fstrDistrictOffice;
  }
  public void set_fstrDistrictOffice(String fstrDistrictOffice) {
    this.fstrDistrictOffice = fstrDistrictOffice;
  }
  public tblnz_reccollectdata with_fstrDistrictOffice(String fstrDistrictOffice) {
    this.fstrDistrictOffice = fstrDistrictOffice;
    return this;
  }
  private String fstrType;
  public String get_fstrType() {
    return fstrType;
  }
  public void set_fstrType(String fstrType) {
    this.fstrType = fstrType;
  }
  public tblnz_reccollectdata with_fstrType(String fstrType) {
    this.fstrType = fstrType;
    return this;
  }
  private String fstrStage;
  public String get_fstrStage() {
    return fstrStage;
  }
  public void set_fstrStage(String fstrStage) {
    this.fstrStage = fstrStage;
  }
  public tblnz_reccollectdata with_fstrStage(String fstrStage) {
    this.fstrStage = fstrStage;
    return this;
  }
  private Integer fblnAutomated;
  public Integer get_fblnAutomated() {
    return fblnAutomated;
  }
  public void set_fblnAutomated(Integer fblnAutomated) {
    this.fblnAutomated = fblnAutomated;
  }
  public tblnz_reccollectdata with_fblnAutomated(Integer fblnAutomated) {
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
  public tblnz_reccollectdata with_fdtmNextStage(java.sql.Timestamp fdtmNextStage) {
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
  public tblnz_reccollectdata with_fstrStageFlow(String fstrStageFlow) {
    this.fstrStageFlow = fstrStageFlow;
    return this;
  }
  private String fstrCategory;
  public String get_fstrCategory() {
    return fstrCategory;
  }
  public void set_fstrCategory(String fstrCategory) {
    this.fstrCategory = fstrCategory;
  }
  public tblnz_reccollectdata with_fstrCategory(String fstrCategory) {
    this.fstrCategory = fstrCategory;
    return this;
  }
  private Integer flngCustomerKey;
  public Integer get_flngCustomerKey() {
    return flngCustomerKey;
  }
  public void set_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
  }
  public tblnz_reccollectdata with_flngCustomerKey(Integer flngCustomerKey) {
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
  public tblnz_reccollectdata with_flngCustomerKey2(Integer flngCustomerKey2) {
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
  public tblnz_reccollectdata with_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
    return this;
  }
  private String fstrCollectionAgency;
  public String get_fstrCollectionAgency() {
    return fstrCollectionAgency;
  }
  public void set_fstrCollectionAgency(String fstrCollectionAgency) {
    this.fstrCollectionAgency = fstrCollectionAgency;
  }
  public tblnz_reccollectdata with_fstrCollectionAgency(String fstrCollectionAgency) {
    this.fstrCollectionAgency = fstrCollectionAgency;
    return this;
  }
  private String fstrActionTaken;
  public String get_fstrActionTaken() {
    return fstrActionTaken;
  }
  public void set_fstrActionTaken(String fstrActionTaken) {
    this.fstrActionTaken = fstrActionTaken;
  }
  public tblnz_reccollectdata with_fstrActionTaken(String fstrActionTaken) {
    this.fstrActionTaken = fstrActionTaken;
    return this;
  }
  private String fstrSource;
  public String get_fstrSource() {
    return fstrSource;
  }
  public void set_fstrSource(String fstrSource) {
    this.fstrSource = fstrSource;
  }
  public tblnz_reccollectdata with_fstrSource(String fstrSource) {
    this.fstrSource = fstrSource;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_reccollectdata with_fstrWho(String fstrWho) {
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
  public tblnz_reccollectdata with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_reccollectdata)) {
      return false;
    }
    tblnz_reccollectdata that = (tblnz_reccollectdata) o;
    boolean equal = true;
    equal = equal && (this.flngDataKey == null ? that.flngDataKey == null : this.flngDataKey.equals(that.flngDataKey));
    equal = equal && (this.flngParentKey == null ? that.flngParentKey == null : this.flngParentKey.equals(that.flngParentKey));
    equal = equal && (this.fdtmBegin == null ? that.fdtmBegin == null : this.fdtmBegin.equals(that.fdtmBegin));
    equal = equal && (this.fdtmEnd == null ? that.fdtmEnd == null : this.fdtmEnd.equals(that.fdtmEnd));
    equal = equal && (this.fstrRecoveryGroup == null ? that.fstrRecoveryGroup == null : this.fstrRecoveryGroup.equals(that.fstrRecoveryGroup));
    equal = equal && (this.fstrOwner == null ? that.fstrOwner == null : this.fstrOwner.equals(that.fstrOwner));
    equal = equal && (this.fstrManager == null ? that.fstrManager == null : this.fstrManager.equals(that.fstrManager));
    equal = equal && (this.fstrDistrictOffice == null ? that.fstrDistrictOffice == null : this.fstrDistrictOffice.equals(that.fstrDistrictOffice));
    equal = equal && (this.fstrType == null ? that.fstrType == null : this.fstrType.equals(that.fstrType));
    equal = equal && (this.fstrStage == null ? that.fstrStage == null : this.fstrStage.equals(that.fstrStage));
    equal = equal && (this.fblnAutomated == null ? that.fblnAutomated == null : this.fblnAutomated.equals(that.fblnAutomated));
    equal = equal && (this.fdtmNextStage == null ? that.fdtmNextStage == null : this.fdtmNextStage.equals(that.fdtmNextStage));
    equal = equal && (this.fstrStageFlow == null ? that.fstrStageFlow == null : this.fstrStageFlow.equals(that.fstrStageFlow));
    equal = equal && (this.fstrCategory == null ? that.fstrCategory == null : this.fstrCategory.equals(that.fstrCategory));
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.flngCustomerKey2 == null ? that.flngCustomerKey2 == null : this.flngCustomerKey2.equals(that.flngCustomerKey2));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fstrCollectionAgency == null ? that.fstrCollectionAgency == null : this.fstrCollectionAgency.equals(that.fstrCollectionAgency));
    equal = equal && (this.fstrActionTaken == null ? that.fstrActionTaken == null : this.fstrActionTaken.equals(that.fstrActionTaken));
    equal = equal && (this.fstrSource == null ? that.fstrSource == null : this.fstrSource.equals(that.fstrSource));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_reccollectdata)) {
      return false;
    }
    tblnz_reccollectdata that = (tblnz_reccollectdata) o;
    boolean equal = true;
    equal = equal && (this.flngDataKey == null ? that.flngDataKey == null : this.flngDataKey.equals(that.flngDataKey));
    equal = equal && (this.flngParentKey == null ? that.flngParentKey == null : this.flngParentKey.equals(that.flngParentKey));
    equal = equal && (this.fdtmBegin == null ? that.fdtmBegin == null : this.fdtmBegin.equals(that.fdtmBegin));
    equal = equal && (this.fdtmEnd == null ? that.fdtmEnd == null : this.fdtmEnd.equals(that.fdtmEnd));
    equal = equal && (this.fstrRecoveryGroup == null ? that.fstrRecoveryGroup == null : this.fstrRecoveryGroup.equals(that.fstrRecoveryGroup));
    equal = equal && (this.fstrOwner == null ? that.fstrOwner == null : this.fstrOwner.equals(that.fstrOwner));
    equal = equal && (this.fstrManager == null ? that.fstrManager == null : this.fstrManager.equals(that.fstrManager));
    equal = equal && (this.fstrDistrictOffice == null ? that.fstrDistrictOffice == null : this.fstrDistrictOffice.equals(that.fstrDistrictOffice));
    equal = equal && (this.fstrType == null ? that.fstrType == null : this.fstrType.equals(that.fstrType));
    equal = equal && (this.fstrStage == null ? that.fstrStage == null : this.fstrStage.equals(that.fstrStage));
    equal = equal && (this.fblnAutomated == null ? that.fblnAutomated == null : this.fblnAutomated.equals(that.fblnAutomated));
    equal = equal && (this.fdtmNextStage == null ? that.fdtmNextStage == null : this.fdtmNextStage.equals(that.fdtmNextStage));
    equal = equal && (this.fstrStageFlow == null ? that.fstrStageFlow == null : this.fstrStageFlow.equals(that.fstrStageFlow));
    equal = equal && (this.fstrCategory == null ? that.fstrCategory == null : this.fstrCategory.equals(that.fstrCategory));
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.flngCustomerKey2 == null ? that.flngCustomerKey2 == null : this.flngCustomerKey2.equals(that.flngCustomerKey2));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fstrCollectionAgency == null ? that.fstrCollectionAgency == null : this.fstrCollectionAgency.equals(that.fstrCollectionAgency));
    equal = equal && (this.fstrActionTaken == null ? that.fstrActionTaken == null : this.fstrActionTaken.equals(that.fstrActionTaken));
    equal = equal && (this.fstrSource == null ? that.fstrSource == null : this.fstrSource.equals(that.fstrSource));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDataKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngParentKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fdtmBegin = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.fdtmEnd = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.fstrRecoveryGroup = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrOwner = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrManager = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrDistrictOffice = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrType = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrStage = JdbcWritableBridge.readString(10, __dbResults);
    this.fblnAutomated = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fdtmNextStage = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.fstrStageFlow = JdbcWritableBridge.readString(13, __dbResults);
    this.fstrCategory = JdbcWritableBridge.readString(14, __dbResults);
    this.flngCustomerKey = JdbcWritableBridge.readInteger(15, __dbResults);
    this.flngCustomerKey2 = JdbcWritableBridge.readInteger(16, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fstrCollectionAgency = JdbcWritableBridge.readString(18, __dbResults);
    this.fstrActionTaken = JdbcWritableBridge.readString(19, __dbResults);
    this.fstrSource = JdbcWritableBridge.readString(20, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(21, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(22, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDataKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngParentKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fdtmBegin = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.fdtmEnd = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.fstrRecoveryGroup = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrOwner = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrManager = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrDistrictOffice = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrType = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrStage = JdbcWritableBridge.readString(10, __dbResults);
    this.fblnAutomated = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fdtmNextStage = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.fstrStageFlow = JdbcWritableBridge.readString(13, __dbResults);
    this.fstrCategory = JdbcWritableBridge.readString(14, __dbResults);
    this.flngCustomerKey = JdbcWritableBridge.readInteger(15, __dbResults);
    this.flngCustomerKey2 = JdbcWritableBridge.readInteger(16, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fstrCollectionAgency = JdbcWritableBridge.readString(18, __dbResults);
    this.fstrActionTaken = JdbcWritableBridge.readString(19, __dbResults);
    this.fstrSource = JdbcWritableBridge.readString(20, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(21, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(22, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngDataKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngParentKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmBegin, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEnd, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecoveryGroup, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOwner, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrManager, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDistrictOffice, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrType, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrStage, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAutomated, 11 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmNextStage, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrStageFlow, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCategory, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey, 15 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey2, 16 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 17 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrCollectionAgency, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrActionTaken, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSource, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 22 + __off, 93, __dbStmt);
    return 22;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDataKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngParentKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmBegin, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEnd, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecoveryGroup, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOwner, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrManager, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDistrictOffice, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrType, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrStage, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAutomated, 11 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmNextStage, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrStageFlow, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCategory, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey, 15 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey2, 16 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 17 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrCollectionAgency, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrActionTaken, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSource, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 22 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngDataKey = null;
    } else {
    this.flngDataKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngParentKey = null;
    } else {
    this.flngParentKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmBegin = null;
    } else {
    this.fdtmBegin = new Timestamp(__dataIn.readLong());
    this.fdtmBegin.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmEnd = null;
    } else {
    this.fdtmEnd = new Timestamp(__dataIn.readLong());
    this.fdtmEnd.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRecoveryGroup = null;
    } else {
    this.fstrRecoveryGroup = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrOwner = null;
    } else {
    this.fstrOwner = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrManager = null;
    } else {
    this.fstrManager = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDistrictOffice = null;
    } else {
    this.fstrDistrictOffice = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrType = null;
    } else {
    this.fstrType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrStage = null;
    } else {
    this.fstrStage = Text.readString(__dataIn);
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
        this.fstrCategory = null;
    } else {
    this.fstrCategory = Text.readString(__dataIn);
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
        this.fstrCollectionAgency = null;
    } else {
    this.fstrCollectionAgency = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrActionTaken = null;
    } else {
    this.fstrActionTaken = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSource = null;
    } else {
    this.fstrSource = Text.readString(__dataIn);
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
    if (null == this.flngDataKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDataKey);
    }
    if (null == this.flngParentKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngParentKey);
    }
    if (null == this.fdtmBegin) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmBegin.getTime());
    __dataOut.writeInt(this.fdtmBegin.getNanos());
    }
    if (null == this.fdtmEnd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEnd.getTime());
    __dataOut.writeInt(this.fdtmEnd.getNanos());
    }
    if (null == this.fstrRecoveryGroup) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecoveryGroup);
    }
    if (null == this.fstrOwner) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOwner);
    }
    if (null == this.fstrManager) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrManager);
    }
    if (null == this.fstrDistrictOffice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDistrictOffice);
    }
    if (null == this.fstrType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrType);
    }
    if (null == this.fstrStage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStage);
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
    if (null == this.fstrCategory) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCategory);
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
    if (null == this.fstrCollectionAgency) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCollectionAgency);
    }
    if (null == this.fstrActionTaken) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrActionTaken);
    }
    if (null == this.fstrSource) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSource);
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
    if (null == this.flngDataKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDataKey);
    }
    if (null == this.flngParentKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngParentKey);
    }
    if (null == this.fdtmBegin) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmBegin.getTime());
    __dataOut.writeInt(this.fdtmBegin.getNanos());
    }
    if (null == this.fdtmEnd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEnd.getTime());
    __dataOut.writeInt(this.fdtmEnd.getNanos());
    }
    if (null == this.fstrRecoveryGroup) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecoveryGroup);
    }
    if (null == this.fstrOwner) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOwner);
    }
    if (null == this.fstrManager) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrManager);
    }
    if (null == this.fstrDistrictOffice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDistrictOffice);
    }
    if (null == this.fstrType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrType);
    }
    if (null == this.fstrStage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStage);
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
    if (null == this.fstrCategory) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCategory);
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
    if (null == this.fstrCollectionAgency) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCollectionAgency);
    }
    if (null == this.fstrActionTaken) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrActionTaken);
    }
    if (null == this.fstrSource) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSource);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngDataKey==null?"\\N":"" + flngDataKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngParentKey==null?"\\N":"" + flngParentKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmBegin==null?"\\N":"" + fdtmBegin, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEnd==null?"\\N":"" + fdtmEnd, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecoveryGroup==null?"\\N":fstrRecoveryGroup, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOwner==null?"\\N":fstrOwner, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrManager==null?"\\N":fstrManager, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDistrictOffice==null?"\\N":fstrDistrictOffice, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrType==null?"\\N":fstrType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStage==null?"\\N":fstrStage, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAutomated==null?"\\N":"" + fblnAutomated, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmNextStage==null?"\\N":"" + fdtmNextStage, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStageFlow==null?"\\N":fstrStageFlow, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCategory==null?"\\N":fstrCategory, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey2==null?"\\N":"" + flngCustomerKey2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCollectionAgency==null?"\\N":fstrCollectionAgency, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrActionTaken==null?"\\N":fstrActionTaken, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSource==null?"\\N":fstrSource, " ", delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngDataKey==null?"\\N":"" + flngDataKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngParentKey==null?"\\N":"" + flngParentKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmBegin==null?"\\N":"" + fdtmBegin, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEnd==null?"\\N":"" + fdtmEnd, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecoveryGroup==null?"\\N":fstrRecoveryGroup, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOwner==null?"\\N":fstrOwner, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrManager==null?"\\N":fstrManager, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDistrictOffice==null?"\\N":fstrDistrictOffice, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrType==null?"\\N":fstrType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStage==null?"\\N":fstrStage, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAutomated==null?"\\N":"" + fblnAutomated, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmNextStage==null?"\\N":"" + fdtmNextStage, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStageFlow==null?"\\N":fstrStageFlow, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCategory==null?"\\N":fstrCategory, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey2==null?"\\N":"" + flngCustomerKey2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCollectionAgency==null?"\\N":fstrCollectionAgency, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrActionTaken==null?"\\N":fstrActionTaken, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSource==null?"\\N":fstrSource, " ", delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDataKey = null; } else {
      this.flngDataKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngParentKey = null; } else {
      this.flngParentKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmBegin = null; } else {
      this.fdtmBegin = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmEnd = null; } else {
      this.fdtmEnd = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecoveryGroup = null; } else {
      this.fstrRecoveryGroup = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrManager = null; } else {
      this.fstrManager = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDistrictOffice = null; } else {
      this.fstrDistrictOffice = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrType = null; } else {
      this.fstrType = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrCategory = null; } else {
      this.fstrCategory = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrCollectionAgency = null; } else {
      this.fstrCollectionAgency = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrActionTaken = null; } else {
      this.fstrActionTaken = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSource = null; } else {
      this.fstrSource = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDataKey = null; } else {
      this.flngDataKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngParentKey = null; } else {
      this.flngParentKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmBegin = null; } else {
      this.fdtmBegin = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmEnd = null; } else {
      this.fdtmEnd = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecoveryGroup = null; } else {
      this.fstrRecoveryGroup = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrManager = null; } else {
      this.fstrManager = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDistrictOffice = null; } else {
      this.fstrDistrictOffice = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrType = null; } else {
      this.fstrType = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrCategory = null; } else {
      this.fstrCategory = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrCollectionAgency = null; } else {
      this.fstrCollectionAgency = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrActionTaken = null; } else {
      this.fstrActionTaken = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSource = null; } else {
      this.fstrSource = __cur_str;
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
    tblnz_reccollectdata o = (tblnz_reccollectdata) super.clone();
    o.fdtmBegin = (o.fdtmBegin != null) ? (java.sql.Timestamp) o.fdtmBegin.clone() : null;
    o.fdtmEnd = (o.fdtmEnd != null) ? (java.sql.Timestamp) o.fdtmEnd.clone() : null;
    o.fdtmNextStage = (o.fdtmNextStage != null) ? (java.sql.Timestamp) o.fdtmNextStage.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_reccollectdata o) throws CloneNotSupportedException {
    o.fdtmBegin = (o.fdtmBegin != null) ? (java.sql.Timestamp) o.fdtmBegin.clone() : null;
    o.fdtmEnd = (o.fdtmEnd != null) ? (java.sql.Timestamp) o.fdtmEnd.clone() : null;
    o.fdtmNextStage = (o.fdtmNextStage != null) ? (java.sql.Timestamp) o.fdtmNextStage.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDataKey", this.flngDataKey);
    __sqoop$field_map.put("flngParentKey", this.flngParentKey);
    __sqoop$field_map.put("fdtmBegin", this.fdtmBegin);
    __sqoop$field_map.put("fdtmEnd", this.fdtmEnd);
    __sqoop$field_map.put("fstrRecoveryGroup", this.fstrRecoveryGroup);
    __sqoop$field_map.put("fstrOwner", this.fstrOwner);
    __sqoop$field_map.put("fstrManager", this.fstrManager);
    __sqoop$field_map.put("fstrDistrictOffice", this.fstrDistrictOffice);
    __sqoop$field_map.put("fstrType", this.fstrType);
    __sqoop$field_map.put("fstrStage", this.fstrStage);
    __sqoop$field_map.put("fblnAutomated", this.fblnAutomated);
    __sqoop$field_map.put("fdtmNextStage", this.fdtmNextStage);
    __sqoop$field_map.put("fstrStageFlow", this.fstrStageFlow);
    __sqoop$field_map.put("fstrCategory", this.fstrCategory);
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("flngCustomerKey2", this.flngCustomerKey2);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fstrCollectionAgency", this.fstrCollectionAgency);
    __sqoop$field_map.put("fstrActionTaken", this.fstrActionTaken);
    __sqoop$field_map.put("fstrSource", this.fstrSource);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDataKey", this.flngDataKey);
    __sqoop$field_map.put("flngParentKey", this.flngParentKey);
    __sqoop$field_map.put("fdtmBegin", this.fdtmBegin);
    __sqoop$field_map.put("fdtmEnd", this.fdtmEnd);
    __sqoop$field_map.put("fstrRecoveryGroup", this.fstrRecoveryGroup);
    __sqoop$field_map.put("fstrOwner", this.fstrOwner);
    __sqoop$field_map.put("fstrManager", this.fstrManager);
    __sqoop$field_map.put("fstrDistrictOffice", this.fstrDistrictOffice);
    __sqoop$field_map.put("fstrType", this.fstrType);
    __sqoop$field_map.put("fstrStage", this.fstrStage);
    __sqoop$field_map.put("fblnAutomated", this.fblnAutomated);
    __sqoop$field_map.put("fdtmNextStage", this.fdtmNextStage);
    __sqoop$field_map.put("fstrStageFlow", this.fstrStageFlow);
    __sqoop$field_map.put("fstrCategory", this.fstrCategory);
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("flngCustomerKey2", this.flngCustomerKey2);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fstrCollectionAgency", this.fstrCollectionAgency);
    __sqoop$field_map.put("fstrActionTaken", this.fstrActionTaken);
    __sqoop$field_map.put("fstrSource", this.fstrSource);
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
