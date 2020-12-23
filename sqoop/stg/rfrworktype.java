// ORM class for table 'rfrworktype'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Dec 03 22:35:15 NZDT 2020
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

public class rfrworktype extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("fstrWorkType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrworktype.this.fstrWorkType = (String)value;
      }
    });
    setters.put("fstrWorkCategory", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrworktype.this.fstrWorkCategory = (String)value;
      }
    });
    setters.put("fblnCanAddOnline", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrworktype.this.fblnCanAddOnline = (Integer)value;
      }
    });
    setters.put("fblnCustomerRequired", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrworktype.this.fblnCustomerRequired = (Integer)value;
      }
    });
    setters.put("fblnAccountRequired", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrworktype.this.fblnAccountRequired = (Integer)value;
      }
    });
    setters.put("fblnPeriodRequired", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrworktype.this.fblnPeriodRequired = (Integer)value;
      }
    });
    setters.put("fblnDefaultOwner", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrworktype.this.fblnDefaultOwner = (Integer)value;
      }
    });
    setters.put("fstrDaysToComplete", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrworktype.this.fstrDaysToComplete = (String)value;
      }
    });
    setters.put("fstrDaysTilDue", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrworktype.this.fstrDaysTilDue = (String)value;
      }
    });
    setters.put("fstrDaysTilAvailable", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrworktype.this.fstrDaysTilAvailable = (String)value;
      }
    });
    setters.put("fblnAllowInError", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrworktype.this.fblnAllowInError = (Integer)value;
      }
    });
    setters.put("fblnForceAvailable", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrworktype.this.fblnForceAvailable = (Integer)value;
      }
    });
    setters.put("fstrDocType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrworktype.this.fstrDocType = (String)value;
      }
    });
    setters.put("fintDocVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrworktype.this.fintDocVer = (Integer)value;
      }
    });
    setters.put("fstrFirstStage", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrworktype.this.fstrFirstStage = (String)value;
      }
    });
    setters.put("fstrAbortStage", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrworktype.this.fstrAbortStage = (String)value;
      }
    });
    setters.put("fblnStageFromDoc", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrworktype.this.fblnStageFromDoc = (Integer)value;
      }
    });
    setters.put("fstrPrePopBo", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrworktype.this.fstrPrePopBo = (String)value;
      }
    });
    setters.put("fblnAlwaysRunPrepop", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrworktype.this.fblnAlwaysRunPrepop = (Integer)value;
      }
    });
    setters.put("fstrCompletionBo", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrworktype.this.fstrCompletionBo = (String)value;
      }
    });
    setters.put("fblnSaveOnFailedComplete", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrworktype.this.fblnSaveOnFailedComplete = (Integer)value;
      }
    });
    setters.put("fblnPassMsgData", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrworktype.this.fblnPassMsgData = (Integer)value;
      }
    });
    setters.put("fstrFailMessage", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrworktype.this.fstrFailMessage = (String)value;
      }
    });
    setters.put("fblnDocOnAdd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrworktype.this.fblnDocOnAdd = (Integer)value;
      }
    });
    setters.put("fblnDocOnChange", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrworktype.this.fblnDocOnChange = (Integer)value;
      }
    });
    setters.put("fblnDocOnClose", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrworktype.this.fblnDocOnClose = (Integer)value;
      }
    });
    setters.put("fblnAssignOwnerOnClose", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrworktype.this.fblnAssignOwnerOnClose = (Integer)value;
      }
    });
    setters.put("fblnDocMode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrworktype.this.fblnDocMode = (Integer)value;
      }
    });
    setters.put("fblnHideNoteOnComplete", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrworktype.this.fblnHideNoteOnComplete = (Integer)value;
      }
    });
    setters.put("fintFunction", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrworktype.this.fintFunction = (Integer)value;
      }
    });
    setters.put("fstrIndicator", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrworktype.this.fstrIndicator = (String)value;
      }
    });
    setters.put("fblnAssignToManager", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrworktype.this.fblnAssignToManager = (Integer)value;
      }
    });
    setters.put("fintAssignToFunction", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrworktype.this.fintAssignToFunction = (Integer)value;
      }
    });
    setters.put("flngAssignFunction", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrworktype.this.flngAssignFunction = (Integer)value;
      }
    });
    setters.put("flngCompleteFunction", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrworktype.this.flngCompleteFunction = (Integer)value;
      }
    });
    setters.put("flngAbortFunction", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrworktype.this.flngAbortFunction = (Integer)value;
      }
    });
    setters.put("fstrLinkTag", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrworktype.this.fstrLinkTag = (String)value;
      }
    });
    setters.put("fstrViewSourceLinkTag", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrworktype.this.fstrViewSourceLinkTag = (String)value;
      }
    });
    setters.put("fblnRegistration", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrworktype.this.fblnRegistration = (Integer)value;
      }
    });
    setters.put("fblnReasonRequiredComplete", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrworktype.this.fblnReasonRequiredComplete = (Integer)value;
      }
    });
    setters.put("fblnCrmRequiredComplete", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrworktype.this.fblnCrmRequiredComplete = (Integer)value;
      }
    });
    setters.put("fblnCrmRequiredAbort", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrworktype.this.fblnCrmRequiredAbort = (Integer)value;
      }
    });
    setters.put("fblnActive", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrworktype.this.fblnActive = (Integer)value;
      }
    });
  }
  public rfrworktype() {
    init0();
  }
  private String fstrWorkType;
  public String get_fstrWorkType() {
    return fstrWorkType;
  }
  public void set_fstrWorkType(String fstrWorkType) {
    this.fstrWorkType = fstrWorkType;
  }
  public rfrworktype with_fstrWorkType(String fstrWorkType) {
    this.fstrWorkType = fstrWorkType;
    return this;
  }
  private String fstrWorkCategory;
  public String get_fstrWorkCategory() {
    return fstrWorkCategory;
  }
  public void set_fstrWorkCategory(String fstrWorkCategory) {
    this.fstrWorkCategory = fstrWorkCategory;
  }
  public rfrworktype with_fstrWorkCategory(String fstrWorkCategory) {
    this.fstrWorkCategory = fstrWorkCategory;
    return this;
  }
  private Integer fblnCanAddOnline;
  public Integer get_fblnCanAddOnline() {
    return fblnCanAddOnline;
  }
  public void set_fblnCanAddOnline(Integer fblnCanAddOnline) {
    this.fblnCanAddOnline = fblnCanAddOnline;
  }
  public rfrworktype with_fblnCanAddOnline(Integer fblnCanAddOnline) {
    this.fblnCanAddOnline = fblnCanAddOnline;
    return this;
  }
  private Integer fblnCustomerRequired;
  public Integer get_fblnCustomerRequired() {
    return fblnCustomerRequired;
  }
  public void set_fblnCustomerRequired(Integer fblnCustomerRequired) {
    this.fblnCustomerRequired = fblnCustomerRequired;
  }
  public rfrworktype with_fblnCustomerRequired(Integer fblnCustomerRequired) {
    this.fblnCustomerRequired = fblnCustomerRequired;
    return this;
  }
  private Integer fblnAccountRequired;
  public Integer get_fblnAccountRequired() {
    return fblnAccountRequired;
  }
  public void set_fblnAccountRequired(Integer fblnAccountRequired) {
    this.fblnAccountRequired = fblnAccountRequired;
  }
  public rfrworktype with_fblnAccountRequired(Integer fblnAccountRequired) {
    this.fblnAccountRequired = fblnAccountRequired;
    return this;
  }
  private Integer fblnPeriodRequired;
  public Integer get_fblnPeriodRequired() {
    return fblnPeriodRequired;
  }
  public void set_fblnPeriodRequired(Integer fblnPeriodRequired) {
    this.fblnPeriodRequired = fblnPeriodRequired;
  }
  public rfrworktype with_fblnPeriodRequired(Integer fblnPeriodRequired) {
    this.fblnPeriodRequired = fblnPeriodRequired;
    return this;
  }
  private Integer fblnDefaultOwner;
  public Integer get_fblnDefaultOwner() {
    return fblnDefaultOwner;
  }
  public void set_fblnDefaultOwner(Integer fblnDefaultOwner) {
    this.fblnDefaultOwner = fblnDefaultOwner;
  }
  public rfrworktype with_fblnDefaultOwner(Integer fblnDefaultOwner) {
    this.fblnDefaultOwner = fblnDefaultOwner;
    return this;
  }
  private String fstrDaysToComplete;
  public String get_fstrDaysToComplete() {
    return fstrDaysToComplete;
  }
  public void set_fstrDaysToComplete(String fstrDaysToComplete) {
    this.fstrDaysToComplete = fstrDaysToComplete;
  }
  public rfrworktype with_fstrDaysToComplete(String fstrDaysToComplete) {
    this.fstrDaysToComplete = fstrDaysToComplete;
    return this;
  }
  private String fstrDaysTilDue;
  public String get_fstrDaysTilDue() {
    return fstrDaysTilDue;
  }
  public void set_fstrDaysTilDue(String fstrDaysTilDue) {
    this.fstrDaysTilDue = fstrDaysTilDue;
  }
  public rfrworktype with_fstrDaysTilDue(String fstrDaysTilDue) {
    this.fstrDaysTilDue = fstrDaysTilDue;
    return this;
  }
  private String fstrDaysTilAvailable;
  public String get_fstrDaysTilAvailable() {
    return fstrDaysTilAvailable;
  }
  public void set_fstrDaysTilAvailable(String fstrDaysTilAvailable) {
    this.fstrDaysTilAvailable = fstrDaysTilAvailable;
  }
  public rfrworktype with_fstrDaysTilAvailable(String fstrDaysTilAvailable) {
    this.fstrDaysTilAvailable = fstrDaysTilAvailable;
    return this;
  }
  private Integer fblnAllowInError;
  public Integer get_fblnAllowInError() {
    return fblnAllowInError;
  }
  public void set_fblnAllowInError(Integer fblnAllowInError) {
    this.fblnAllowInError = fblnAllowInError;
  }
  public rfrworktype with_fblnAllowInError(Integer fblnAllowInError) {
    this.fblnAllowInError = fblnAllowInError;
    return this;
  }
  private Integer fblnForceAvailable;
  public Integer get_fblnForceAvailable() {
    return fblnForceAvailable;
  }
  public void set_fblnForceAvailable(Integer fblnForceAvailable) {
    this.fblnForceAvailable = fblnForceAvailable;
  }
  public rfrworktype with_fblnForceAvailable(Integer fblnForceAvailable) {
    this.fblnForceAvailable = fblnForceAvailable;
    return this;
  }
  private String fstrDocType;
  public String get_fstrDocType() {
    return fstrDocType;
  }
  public void set_fstrDocType(String fstrDocType) {
    this.fstrDocType = fstrDocType;
  }
  public rfrworktype with_fstrDocType(String fstrDocType) {
    this.fstrDocType = fstrDocType;
    return this;
  }
  private Integer fintDocVer;
  public Integer get_fintDocVer() {
    return fintDocVer;
  }
  public void set_fintDocVer(Integer fintDocVer) {
    this.fintDocVer = fintDocVer;
  }
  public rfrworktype with_fintDocVer(Integer fintDocVer) {
    this.fintDocVer = fintDocVer;
    return this;
  }
  private String fstrFirstStage;
  public String get_fstrFirstStage() {
    return fstrFirstStage;
  }
  public void set_fstrFirstStage(String fstrFirstStage) {
    this.fstrFirstStage = fstrFirstStage;
  }
  public rfrworktype with_fstrFirstStage(String fstrFirstStage) {
    this.fstrFirstStage = fstrFirstStage;
    return this;
  }
  private String fstrAbortStage;
  public String get_fstrAbortStage() {
    return fstrAbortStage;
  }
  public void set_fstrAbortStage(String fstrAbortStage) {
    this.fstrAbortStage = fstrAbortStage;
  }
  public rfrworktype with_fstrAbortStage(String fstrAbortStage) {
    this.fstrAbortStage = fstrAbortStage;
    return this;
  }
  private Integer fblnStageFromDoc;
  public Integer get_fblnStageFromDoc() {
    return fblnStageFromDoc;
  }
  public void set_fblnStageFromDoc(Integer fblnStageFromDoc) {
    this.fblnStageFromDoc = fblnStageFromDoc;
  }
  public rfrworktype with_fblnStageFromDoc(Integer fblnStageFromDoc) {
    this.fblnStageFromDoc = fblnStageFromDoc;
    return this;
  }
  private String fstrPrePopBo;
  public String get_fstrPrePopBo() {
    return fstrPrePopBo;
  }
  public void set_fstrPrePopBo(String fstrPrePopBo) {
    this.fstrPrePopBo = fstrPrePopBo;
  }
  public rfrworktype with_fstrPrePopBo(String fstrPrePopBo) {
    this.fstrPrePopBo = fstrPrePopBo;
    return this;
  }
  private Integer fblnAlwaysRunPrepop;
  public Integer get_fblnAlwaysRunPrepop() {
    return fblnAlwaysRunPrepop;
  }
  public void set_fblnAlwaysRunPrepop(Integer fblnAlwaysRunPrepop) {
    this.fblnAlwaysRunPrepop = fblnAlwaysRunPrepop;
  }
  public rfrworktype with_fblnAlwaysRunPrepop(Integer fblnAlwaysRunPrepop) {
    this.fblnAlwaysRunPrepop = fblnAlwaysRunPrepop;
    return this;
  }
  private String fstrCompletionBo;
  public String get_fstrCompletionBo() {
    return fstrCompletionBo;
  }
  public void set_fstrCompletionBo(String fstrCompletionBo) {
    this.fstrCompletionBo = fstrCompletionBo;
  }
  public rfrworktype with_fstrCompletionBo(String fstrCompletionBo) {
    this.fstrCompletionBo = fstrCompletionBo;
    return this;
  }
  private Integer fblnSaveOnFailedComplete;
  public Integer get_fblnSaveOnFailedComplete() {
    return fblnSaveOnFailedComplete;
  }
  public void set_fblnSaveOnFailedComplete(Integer fblnSaveOnFailedComplete) {
    this.fblnSaveOnFailedComplete = fblnSaveOnFailedComplete;
  }
  public rfrworktype with_fblnSaveOnFailedComplete(Integer fblnSaveOnFailedComplete) {
    this.fblnSaveOnFailedComplete = fblnSaveOnFailedComplete;
    return this;
  }
  private Integer fblnPassMsgData;
  public Integer get_fblnPassMsgData() {
    return fblnPassMsgData;
  }
  public void set_fblnPassMsgData(Integer fblnPassMsgData) {
    this.fblnPassMsgData = fblnPassMsgData;
  }
  public rfrworktype with_fblnPassMsgData(Integer fblnPassMsgData) {
    this.fblnPassMsgData = fblnPassMsgData;
    return this;
  }
  private String fstrFailMessage;
  public String get_fstrFailMessage() {
    return fstrFailMessage;
  }
  public void set_fstrFailMessage(String fstrFailMessage) {
    this.fstrFailMessage = fstrFailMessage;
  }
  public rfrworktype with_fstrFailMessage(String fstrFailMessage) {
    this.fstrFailMessage = fstrFailMessage;
    return this;
  }
  private Integer fblnDocOnAdd;
  public Integer get_fblnDocOnAdd() {
    return fblnDocOnAdd;
  }
  public void set_fblnDocOnAdd(Integer fblnDocOnAdd) {
    this.fblnDocOnAdd = fblnDocOnAdd;
  }
  public rfrworktype with_fblnDocOnAdd(Integer fblnDocOnAdd) {
    this.fblnDocOnAdd = fblnDocOnAdd;
    return this;
  }
  private Integer fblnDocOnChange;
  public Integer get_fblnDocOnChange() {
    return fblnDocOnChange;
  }
  public void set_fblnDocOnChange(Integer fblnDocOnChange) {
    this.fblnDocOnChange = fblnDocOnChange;
  }
  public rfrworktype with_fblnDocOnChange(Integer fblnDocOnChange) {
    this.fblnDocOnChange = fblnDocOnChange;
    return this;
  }
  private Integer fblnDocOnClose;
  public Integer get_fblnDocOnClose() {
    return fblnDocOnClose;
  }
  public void set_fblnDocOnClose(Integer fblnDocOnClose) {
    this.fblnDocOnClose = fblnDocOnClose;
  }
  public rfrworktype with_fblnDocOnClose(Integer fblnDocOnClose) {
    this.fblnDocOnClose = fblnDocOnClose;
    return this;
  }
  private Integer fblnAssignOwnerOnClose;
  public Integer get_fblnAssignOwnerOnClose() {
    return fblnAssignOwnerOnClose;
  }
  public void set_fblnAssignOwnerOnClose(Integer fblnAssignOwnerOnClose) {
    this.fblnAssignOwnerOnClose = fblnAssignOwnerOnClose;
  }
  public rfrworktype with_fblnAssignOwnerOnClose(Integer fblnAssignOwnerOnClose) {
    this.fblnAssignOwnerOnClose = fblnAssignOwnerOnClose;
    return this;
  }
  private Integer fblnDocMode;
  public Integer get_fblnDocMode() {
    return fblnDocMode;
  }
  public void set_fblnDocMode(Integer fblnDocMode) {
    this.fblnDocMode = fblnDocMode;
  }
  public rfrworktype with_fblnDocMode(Integer fblnDocMode) {
    this.fblnDocMode = fblnDocMode;
    return this;
  }
  private Integer fblnHideNoteOnComplete;
  public Integer get_fblnHideNoteOnComplete() {
    return fblnHideNoteOnComplete;
  }
  public void set_fblnHideNoteOnComplete(Integer fblnHideNoteOnComplete) {
    this.fblnHideNoteOnComplete = fblnHideNoteOnComplete;
  }
  public rfrworktype with_fblnHideNoteOnComplete(Integer fblnHideNoteOnComplete) {
    this.fblnHideNoteOnComplete = fblnHideNoteOnComplete;
    return this;
  }
  private Integer fintFunction;
  public Integer get_fintFunction() {
    return fintFunction;
  }
  public void set_fintFunction(Integer fintFunction) {
    this.fintFunction = fintFunction;
  }
  public rfrworktype with_fintFunction(Integer fintFunction) {
    this.fintFunction = fintFunction;
    return this;
  }
  private String fstrIndicator;
  public String get_fstrIndicator() {
    return fstrIndicator;
  }
  public void set_fstrIndicator(String fstrIndicator) {
    this.fstrIndicator = fstrIndicator;
  }
  public rfrworktype with_fstrIndicator(String fstrIndicator) {
    this.fstrIndicator = fstrIndicator;
    return this;
  }
  private Integer fblnAssignToManager;
  public Integer get_fblnAssignToManager() {
    return fblnAssignToManager;
  }
  public void set_fblnAssignToManager(Integer fblnAssignToManager) {
    this.fblnAssignToManager = fblnAssignToManager;
  }
  public rfrworktype with_fblnAssignToManager(Integer fblnAssignToManager) {
    this.fblnAssignToManager = fblnAssignToManager;
    return this;
  }
  private Integer fintAssignToFunction;
  public Integer get_fintAssignToFunction() {
    return fintAssignToFunction;
  }
  public void set_fintAssignToFunction(Integer fintAssignToFunction) {
    this.fintAssignToFunction = fintAssignToFunction;
  }
  public rfrworktype with_fintAssignToFunction(Integer fintAssignToFunction) {
    this.fintAssignToFunction = fintAssignToFunction;
    return this;
  }
  private Integer flngAssignFunction;
  public Integer get_flngAssignFunction() {
    return flngAssignFunction;
  }
  public void set_flngAssignFunction(Integer flngAssignFunction) {
    this.flngAssignFunction = flngAssignFunction;
  }
  public rfrworktype with_flngAssignFunction(Integer flngAssignFunction) {
    this.flngAssignFunction = flngAssignFunction;
    return this;
  }
  private Integer flngCompleteFunction;
  public Integer get_flngCompleteFunction() {
    return flngCompleteFunction;
  }
  public void set_flngCompleteFunction(Integer flngCompleteFunction) {
    this.flngCompleteFunction = flngCompleteFunction;
  }
  public rfrworktype with_flngCompleteFunction(Integer flngCompleteFunction) {
    this.flngCompleteFunction = flngCompleteFunction;
    return this;
  }
  private Integer flngAbortFunction;
  public Integer get_flngAbortFunction() {
    return flngAbortFunction;
  }
  public void set_flngAbortFunction(Integer flngAbortFunction) {
    this.flngAbortFunction = flngAbortFunction;
  }
  public rfrworktype with_flngAbortFunction(Integer flngAbortFunction) {
    this.flngAbortFunction = flngAbortFunction;
    return this;
  }
  private String fstrLinkTag;
  public String get_fstrLinkTag() {
    return fstrLinkTag;
  }
  public void set_fstrLinkTag(String fstrLinkTag) {
    this.fstrLinkTag = fstrLinkTag;
  }
  public rfrworktype with_fstrLinkTag(String fstrLinkTag) {
    this.fstrLinkTag = fstrLinkTag;
    return this;
  }
  private String fstrViewSourceLinkTag;
  public String get_fstrViewSourceLinkTag() {
    return fstrViewSourceLinkTag;
  }
  public void set_fstrViewSourceLinkTag(String fstrViewSourceLinkTag) {
    this.fstrViewSourceLinkTag = fstrViewSourceLinkTag;
  }
  public rfrworktype with_fstrViewSourceLinkTag(String fstrViewSourceLinkTag) {
    this.fstrViewSourceLinkTag = fstrViewSourceLinkTag;
    return this;
  }
  private Integer fblnRegistration;
  public Integer get_fblnRegistration() {
    return fblnRegistration;
  }
  public void set_fblnRegistration(Integer fblnRegistration) {
    this.fblnRegistration = fblnRegistration;
  }
  public rfrworktype with_fblnRegistration(Integer fblnRegistration) {
    this.fblnRegistration = fblnRegistration;
    return this;
  }
  private Integer fblnReasonRequiredComplete;
  public Integer get_fblnReasonRequiredComplete() {
    return fblnReasonRequiredComplete;
  }
  public void set_fblnReasonRequiredComplete(Integer fblnReasonRequiredComplete) {
    this.fblnReasonRequiredComplete = fblnReasonRequiredComplete;
  }
  public rfrworktype with_fblnReasonRequiredComplete(Integer fblnReasonRequiredComplete) {
    this.fblnReasonRequiredComplete = fblnReasonRequiredComplete;
    return this;
  }
  private Integer fblnCrmRequiredComplete;
  public Integer get_fblnCrmRequiredComplete() {
    return fblnCrmRequiredComplete;
  }
  public void set_fblnCrmRequiredComplete(Integer fblnCrmRequiredComplete) {
    this.fblnCrmRequiredComplete = fblnCrmRequiredComplete;
  }
  public rfrworktype with_fblnCrmRequiredComplete(Integer fblnCrmRequiredComplete) {
    this.fblnCrmRequiredComplete = fblnCrmRequiredComplete;
    return this;
  }
  private Integer fblnCrmRequiredAbort;
  public Integer get_fblnCrmRequiredAbort() {
    return fblnCrmRequiredAbort;
  }
  public void set_fblnCrmRequiredAbort(Integer fblnCrmRequiredAbort) {
    this.fblnCrmRequiredAbort = fblnCrmRequiredAbort;
  }
  public rfrworktype with_fblnCrmRequiredAbort(Integer fblnCrmRequiredAbort) {
    this.fblnCrmRequiredAbort = fblnCrmRequiredAbort;
    return this;
  }
  private Integer fblnActive;
  public Integer get_fblnActive() {
    return fblnActive;
  }
  public void set_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
  }
  public rfrworktype with_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof rfrworktype)) {
      return false;
    }
    rfrworktype that = (rfrworktype) o;
    boolean equal = true;
    equal = equal && (this.fstrWorkType == null ? that.fstrWorkType == null : this.fstrWorkType.equals(that.fstrWorkType));
    equal = equal && (this.fstrWorkCategory == null ? that.fstrWorkCategory == null : this.fstrWorkCategory.equals(that.fstrWorkCategory));
    equal = equal && (this.fblnCanAddOnline == null ? that.fblnCanAddOnline == null : this.fblnCanAddOnline.equals(that.fblnCanAddOnline));
    equal = equal && (this.fblnCustomerRequired == null ? that.fblnCustomerRequired == null : this.fblnCustomerRequired.equals(that.fblnCustomerRequired));
    equal = equal && (this.fblnAccountRequired == null ? that.fblnAccountRequired == null : this.fblnAccountRequired.equals(that.fblnAccountRequired));
    equal = equal && (this.fblnPeriodRequired == null ? that.fblnPeriodRequired == null : this.fblnPeriodRequired.equals(that.fblnPeriodRequired));
    equal = equal && (this.fblnDefaultOwner == null ? that.fblnDefaultOwner == null : this.fblnDefaultOwner.equals(that.fblnDefaultOwner));
    equal = equal && (this.fstrDaysToComplete == null ? that.fstrDaysToComplete == null : this.fstrDaysToComplete.equals(that.fstrDaysToComplete));
    equal = equal && (this.fstrDaysTilDue == null ? that.fstrDaysTilDue == null : this.fstrDaysTilDue.equals(that.fstrDaysTilDue));
    equal = equal && (this.fstrDaysTilAvailable == null ? that.fstrDaysTilAvailable == null : this.fstrDaysTilAvailable.equals(that.fstrDaysTilAvailable));
    equal = equal && (this.fblnAllowInError == null ? that.fblnAllowInError == null : this.fblnAllowInError.equals(that.fblnAllowInError));
    equal = equal && (this.fblnForceAvailable == null ? that.fblnForceAvailable == null : this.fblnForceAvailable.equals(that.fblnForceAvailable));
    equal = equal && (this.fstrDocType == null ? that.fstrDocType == null : this.fstrDocType.equals(that.fstrDocType));
    equal = equal && (this.fintDocVer == null ? that.fintDocVer == null : this.fintDocVer.equals(that.fintDocVer));
    equal = equal && (this.fstrFirstStage == null ? that.fstrFirstStage == null : this.fstrFirstStage.equals(that.fstrFirstStage));
    equal = equal && (this.fstrAbortStage == null ? that.fstrAbortStage == null : this.fstrAbortStage.equals(that.fstrAbortStage));
    equal = equal && (this.fblnStageFromDoc == null ? that.fblnStageFromDoc == null : this.fblnStageFromDoc.equals(that.fblnStageFromDoc));
    equal = equal && (this.fstrPrePopBo == null ? that.fstrPrePopBo == null : this.fstrPrePopBo.equals(that.fstrPrePopBo));
    equal = equal && (this.fblnAlwaysRunPrepop == null ? that.fblnAlwaysRunPrepop == null : this.fblnAlwaysRunPrepop.equals(that.fblnAlwaysRunPrepop));
    equal = equal && (this.fstrCompletionBo == null ? that.fstrCompletionBo == null : this.fstrCompletionBo.equals(that.fstrCompletionBo));
    equal = equal && (this.fblnSaveOnFailedComplete == null ? that.fblnSaveOnFailedComplete == null : this.fblnSaveOnFailedComplete.equals(that.fblnSaveOnFailedComplete));
    equal = equal && (this.fblnPassMsgData == null ? that.fblnPassMsgData == null : this.fblnPassMsgData.equals(that.fblnPassMsgData));
    equal = equal && (this.fstrFailMessage == null ? that.fstrFailMessage == null : this.fstrFailMessage.equals(that.fstrFailMessage));
    equal = equal && (this.fblnDocOnAdd == null ? that.fblnDocOnAdd == null : this.fblnDocOnAdd.equals(that.fblnDocOnAdd));
    equal = equal && (this.fblnDocOnChange == null ? that.fblnDocOnChange == null : this.fblnDocOnChange.equals(that.fblnDocOnChange));
    equal = equal && (this.fblnDocOnClose == null ? that.fblnDocOnClose == null : this.fblnDocOnClose.equals(that.fblnDocOnClose));
    equal = equal && (this.fblnAssignOwnerOnClose == null ? that.fblnAssignOwnerOnClose == null : this.fblnAssignOwnerOnClose.equals(that.fblnAssignOwnerOnClose));
    equal = equal && (this.fblnDocMode == null ? that.fblnDocMode == null : this.fblnDocMode.equals(that.fblnDocMode));
    equal = equal && (this.fblnHideNoteOnComplete == null ? that.fblnHideNoteOnComplete == null : this.fblnHideNoteOnComplete.equals(that.fblnHideNoteOnComplete));
    equal = equal && (this.fintFunction == null ? that.fintFunction == null : this.fintFunction.equals(that.fintFunction));
    equal = equal && (this.fstrIndicator == null ? that.fstrIndicator == null : this.fstrIndicator.equals(that.fstrIndicator));
    equal = equal && (this.fblnAssignToManager == null ? that.fblnAssignToManager == null : this.fblnAssignToManager.equals(that.fblnAssignToManager));
    equal = equal && (this.fintAssignToFunction == null ? that.fintAssignToFunction == null : this.fintAssignToFunction.equals(that.fintAssignToFunction));
    equal = equal && (this.flngAssignFunction == null ? that.flngAssignFunction == null : this.flngAssignFunction.equals(that.flngAssignFunction));
    equal = equal && (this.flngCompleteFunction == null ? that.flngCompleteFunction == null : this.flngCompleteFunction.equals(that.flngCompleteFunction));
    equal = equal && (this.flngAbortFunction == null ? that.flngAbortFunction == null : this.flngAbortFunction.equals(that.flngAbortFunction));
    equal = equal && (this.fstrLinkTag == null ? that.fstrLinkTag == null : this.fstrLinkTag.equals(that.fstrLinkTag));
    equal = equal && (this.fstrViewSourceLinkTag == null ? that.fstrViewSourceLinkTag == null : this.fstrViewSourceLinkTag.equals(that.fstrViewSourceLinkTag));
    equal = equal && (this.fblnRegistration == null ? that.fblnRegistration == null : this.fblnRegistration.equals(that.fblnRegistration));
    equal = equal && (this.fblnReasonRequiredComplete == null ? that.fblnReasonRequiredComplete == null : this.fblnReasonRequiredComplete.equals(that.fblnReasonRequiredComplete));
    equal = equal && (this.fblnCrmRequiredComplete == null ? that.fblnCrmRequiredComplete == null : this.fblnCrmRequiredComplete.equals(that.fblnCrmRequiredComplete));
    equal = equal && (this.fblnCrmRequiredAbort == null ? that.fblnCrmRequiredAbort == null : this.fblnCrmRequiredAbort.equals(that.fblnCrmRequiredAbort));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof rfrworktype)) {
      return false;
    }
    rfrworktype that = (rfrworktype) o;
    boolean equal = true;
    equal = equal && (this.fstrWorkType == null ? that.fstrWorkType == null : this.fstrWorkType.equals(that.fstrWorkType));
    equal = equal && (this.fstrWorkCategory == null ? that.fstrWorkCategory == null : this.fstrWorkCategory.equals(that.fstrWorkCategory));
    equal = equal && (this.fblnCanAddOnline == null ? that.fblnCanAddOnline == null : this.fblnCanAddOnline.equals(that.fblnCanAddOnline));
    equal = equal && (this.fblnCustomerRequired == null ? that.fblnCustomerRequired == null : this.fblnCustomerRequired.equals(that.fblnCustomerRequired));
    equal = equal && (this.fblnAccountRequired == null ? that.fblnAccountRequired == null : this.fblnAccountRequired.equals(that.fblnAccountRequired));
    equal = equal && (this.fblnPeriodRequired == null ? that.fblnPeriodRequired == null : this.fblnPeriodRequired.equals(that.fblnPeriodRequired));
    equal = equal && (this.fblnDefaultOwner == null ? that.fblnDefaultOwner == null : this.fblnDefaultOwner.equals(that.fblnDefaultOwner));
    equal = equal && (this.fstrDaysToComplete == null ? that.fstrDaysToComplete == null : this.fstrDaysToComplete.equals(that.fstrDaysToComplete));
    equal = equal && (this.fstrDaysTilDue == null ? that.fstrDaysTilDue == null : this.fstrDaysTilDue.equals(that.fstrDaysTilDue));
    equal = equal && (this.fstrDaysTilAvailable == null ? that.fstrDaysTilAvailable == null : this.fstrDaysTilAvailable.equals(that.fstrDaysTilAvailable));
    equal = equal && (this.fblnAllowInError == null ? that.fblnAllowInError == null : this.fblnAllowInError.equals(that.fblnAllowInError));
    equal = equal && (this.fblnForceAvailable == null ? that.fblnForceAvailable == null : this.fblnForceAvailable.equals(that.fblnForceAvailable));
    equal = equal && (this.fstrDocType == null ? that.fstrDocType == null : this.fstrDocType.equals(that.fstrDocType));
    equal = equal && (this.fintDocVer == null ? that.fintDocVer == null : this.fintDocVer.equals(that.fintDocVer));
    equal = equal && (this.fstrFirstStage == null ? that.fstrFirstStage == null : this.fstrFirstStage.equals(that.fstrFirstStage));
    equal = equal && (this.fstrAbortStage == null ? that.fstrAbortStage == null : this.fstrAbortStage.equals(that.fstrAbortStage));
    equal = equal && (this.fblnStageFromDoc == null ? that.fblnStageFromDoc == null : this.fblnStageFromDoc.equals(that.fblnStageFromDoc));
    equal = equal && (this.fstrPrePopBo == null ? that.fstrPrePopBo == null : this.fstrPrePopBo.equals(that.fstrPrePopBo));
    equal = equal && (this.fblnAlwaysRunPrepop == null ? that.fblnAlwaysRunPrepop == null : this.fblnAlwaysRunPrepop.equals(that.fblnAlwaysRunPrepop));
    equal = equal && (this.fstrCompletionBo == null ? that.fstrCompletionBo == null : this.fstrCompletionBo.equals(that.fstrCompletionBo));
    equal = equal && (this.fblnSaveOnFailedComplete == null ? that.fblnSaveOnFailedComplete == null : this.fblnSaveOnFailedComplete.equals(that.fblnSaveOnFailedComplete));
    equal = equal && (this.fblnPassMsgData == null ? that.fblnPassMsgData == null : this.fblnPassMsgData.equals(that.fblnPassMsgData));
    equal = equal && (this.fstrFailMessage == null ? that.fstrFailMessage == null : this.fstrFailMessage.equals(that.fstrFailMessage));
    equal = equal && (this.fblnDocOnAdd == null ? that.fblnDocOnAdd == null : this.fblnDocOnAdd.equals(that.fblnDocOnAdd));
    equal = equal && (this.fblnDocOnChange == null ? that.fblnDocOnChange == null : this.fblnDocOnChange.equals(that.fblnDocOnChange));
    equal = equal && (this.fblnDocOnClose == null ? that.fblnDocOnClose == null : this.fblnDocOnClose.equals(that.fblnDocOnClose));
    equal = equal && (this.fblnAssignOwnerOnClose == null ? that.fblnAssignOwnerOnClose == null : this.fblnAssignOwnerOnClose.equals(that.fblnAssignOwnerOnClose));
    equal = equal && (this.fblnDocMode == null ? that.fblnDocMode == null : this.fblnDocMode.equals(that.fblnDocMode));
    equal = equal && (this.fblnHideNoteOnComplete == null ? that.fblnHideNoteOnComplete == null : this.fblnHideNoteOnComplete.equals(that.fblnHideNoteOnComplete));
    equal = equal && (this.fintFunction == null ? that.fintFunction == null : this.fintFunction.equals(that.fintFunction));
    equal = equal && (this.fstrIndicator == null ? that.fstrIndicator == null : this.fstrIndicator.equals(that.fstrIndicator));
    equal = equal && (this.fblnAssignToManager == null ? that.fblnAssignToManager == null : this.fblnAssignToManager.equals(that.fblnAssignToManager));
    equal = equal && (this.fintAssignToFunction == null ? that.fintAssignToFunction == null : this.fintAssignToFunction.equals(that.fintAssignToFunction));
    equal = equal && (this.flngAssignFunction == null ? that.flngAssignFunction == null : this.flngAssignFunction.equals(that.flngAssignFunction));
    equal = equal && (this.flngCompleteFunction == null ? that.flngCompleteFunction == null : this.flngCompleteFunction.equals(that.flngCompleteFunction));
    equal = equal && (this.flngAbortFunction == null ? that.flngAbortFunction == null : this.flngAbortFunction.equals(that.flngAbortFunction));
    equal = equal && (this.fstrLinkTag == null ? that.fstrLinkTag == null : this.fstrLinkTag.equals(that.fstrLinkTag));
    equal = equal && (this.fstrViewSourceLinkTag == null ? that.fstrViewSourceLinkTag == null : this.fstrViewSourceLinkTag.equals(that.fstrViewSourceLinkTag));
    equal = equal && (this.fblnRegistration == null ? that.fblnRegistration == null : this.fblnRegistration.equals(that.fblnRegistration));
    equal = equal && (this.fblnReasonRequiredComplete == null ? that.fblnReasonRequiredComplete == null : this.fblnReasonRequiredComplete.equals(that.fblnReasonRequiredComplete));
    equal = equal && (this.fblnCrmRequiredComplete == null ? that.fblnCrmRequiredComplete == null : this.fblnCrmRequiredComplete.equals(that.fblnCrmRequiredComplete));
    equal = equal && (this.fblnCrmRequiredAbort == null ? that.fblnCrmRequiredAbort == null : this.fblnCrmRequiredAbort.equals(that.fblnCrmRequiredAbort));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.fstrWorkType = JdbcWritableBridge.readString(1, __dbResults);
    this.fstrWorkCategory = JdbcWritableBridge.readString(2, __dbResults);
    this.fblnCanAddOnline = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fblnCustomerRequired = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fblnAccountRequired = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fblnPeriodRequired = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fblnDefaultOwner = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fstrDaysToComplete = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrDaysTilDue = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrDaysTilAvailable = JdbcWritableBridge.readString(10, __dbResults);
    this.fblnAllowInError = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fblnForceAvailable = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fstrDocType = JdbcWritableBridge.readString(13, __dbResults);
    this.fintDocVer = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fstrFirstStage = JdbcWritableBridge.readString(15, __dbResults);
    this.fstrAbortStage = JdbcWritableBridge.readString(16, __dbResults);
    this.fblnStageFromDoc = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fstrPrePopBo = JdbcWritableBridge.readString(18, __dbResults);
    this.fblnAlwaysRunPrepop = JdbcWritableBridge.readInteger(19, __dbResults);
    this.fstrCompletionBo = JdbcWritableBridge.readString(20, __dbResults);
    this.fblnSaveOnFailedComplete = JdbcWritableBridge.readInteger(21, __dbResults);
    this.fblnPassMsgData = JdbcWritableBridge.readInteger(22, __dbResults);
    this.fstrFailMessage = JdbcWritableBridge.readString(23, __dbResults);
    this.fblnDocOnAdd = JdbcWritableBridge.readInteger(24, __dbResults);
    this.fblnDocOnChange = JdbcWritableBridge.readInteger(25, __dbResults);
    this.fblnDocOnClose = JdbcWritableBridge.readInteger(26, __dbResults);
    this.fblnAssignOwnerOnClose = JdbcWritableBridge.readInteger(27, __dbResults);
    this.fblnDocMode = JdbcWritableBridge.readInteger(28, __dbResults);
    this.fblnHideNoteOnComplete = JdbcWritableBridge.readInteger(29, __dbResults);
    this.fintFunction = JdbcWritableBridge.readInteger(30, __dbResults);
    this.fstrIndicator = JdbcWritableBridge.readString(31, __dbResults);
    this.fblnAssignToManager = JdbcWritableBridge.readInteger(32, __dbResults);
    this.fintAssignToFunction = JdbcWritableBridge.readInteger(33, __dbResults);
    this.flngAssignFunction = JdbcWritableBridge.readInteger(34, __dbResults);
    this.flngCompleteFunction = JdbcWritableBridge.readInteger(35, __dbResults);
    this.flngAbortFunction = JdbcWritableBridge.readInteger(36, __dbResults);
    this.fstrLinkTag = JdbcWritableBridge.readString(37, __dbResults);
    this.fstrViewSourceLinkTag = JdbcWritableBridge.readString(38, __dbResults);
    this.fblnRegistration = JdbcWritableBridge.readInteger(39, __dbResults);
    this.fblnReasonRequiredComplete = JdbcWritableBridge.readInteger(40, __dbResults);
    this.fblnCrmRequiredComplete = JdbcWritableBridge.readInteger(41, __dbResults);
    this.fblnCrmRequiredAbort = JdbcWritableBridge.readInteger(42, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(43, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.fstrWorkType = JdbcWritableBridge.readString(1, __dbResults);
    this.fstrWorkCategory = JdbcWritableBridge.readString(2, __dbResults);
    this.fblnCanAddOnline = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fblnCustomerRequired = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fblnAccountRequired = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fblnPeriodRequired = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fblnDefaultOwner = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fstrDaysToComplete = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrDaysTilDue = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrDaysTilAvailable = JdbcWritableBridge.readString(10, __dbResults);
    this.fblnAllowInError = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fblnForceAvailable = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fstrDocType = JdbcWritableBridge.readString(13, __dbResults);
    this.fintDocVer = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fstrFirstStage = JdbcWritableBridge.readString(15, __dbResults);
    this.fstrAbortStage = JdbcWritableBridge.readString(16, __dbResults);
    this.fblnStageFromDoc = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fstrPrePopBo = JdbcWritableBridge.readString(18, __dbResults);
    this.fblnAlwaysRunPrepop = JdbcWritableBridge.readInteger(19, __dbResults);
    this.fstrCompletionBo = JdbcWritableBridge.readString(20, __dbResults);
    this.fblnSaveOnFailedComplete = JdbcWritableBridge.readInteger(21, __dbResults);
    this.fblnPassMsgData = JdbcWritableBridge.readInteger(22, __dbResults);
    this.fstrFailMessage = JdbcWritableBridge.readString(23, __dbResults);
    this.fblnDocOnAdd = JdbcWritableBridge.readInteger(24, __dbResults);
    this.fblnDocOnChange = JdbcWritableBridge.readInteger(25, __dbResults);
    this.fblnDocOnClose = JdbcWritableBridge.readInteger(26, __dbResults);
    this.fblnAssignOwnerOnClose = JdbcWritableBridge.readInteger(27, __dbResults);
    this.fblnDocMode = JdbcWritableBridge.readInteger(28, __dbResults);
    this.fblnHideNoteOnComplete = JdbcWritableBridge.readInteger(29, __dbResults);
    this.fintFunction = JdbcWritableBridge.readInteger(30, __dbResults);
    this.fstrIndicator = JdbcWritableBridge.readString(31, __dbResults);
    this.fblnAssignToManager = JdbcWritableBridge.readInteger(32, __dbResults);
    this.fintAssignToFunction = JdbcWritableBridge.readInteger(33, __dbResults);
    this.flngAssignFunction = JdbcWritableBridge.readInteger(34, __dbResults);
    this.flngCompleteFunction = JdbcWritableBridge.readInteger(35, __dbResults);
    this.flngAbortFunction = JdbcWritableBridge.readInteger(36, __dbResults);
    this.fstrLinkTag = JdbcWritableBridge.readString(37, __dbResults);
    this.fstrViewSourceLinkTag = JdbcWritableBridge.readString(38, __dbResults);
    this.fblnRegistration = JdbcWritableBridge.readInteger(39, __dbResults);
    this.fblnReasonRequiredComplete = JdbcWritableBridge.readInteger(40, __dbResults);
    this.fblnCrmRequiredComplete = JdbcWritableBridge.readInteger(41, __dbResults);
    this.fblnCrmRequiredAbort = JdbcWritableBridge.readInteger(42, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(43, __dbResults);
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
    JdbcWritableBridge.writeString(fstrWorkType, 1 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWorkCategory, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCanAddOnline, 3 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCustomerRequired, 4 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAccountRequired, 5 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPeriodRequired, 6 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDefaultOwner, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrDaysToComplete, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDaysTilDue, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDaysTilAvailable, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAllowInError, 11 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnForceAvailable, 12 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrDocType, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintDocVer, 14 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrFirstStage, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAbortStage, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnStageFromDoc, 17 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrPrePopBo, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAlwaysRunPrepop, 19 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrCompletionBo, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnSaveOnFailedComplete, 21 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPassMsgData, 22 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrFailMessage, 23 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDocOnAdd, 24 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDocOnChange, 25 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDocOnClose, 26 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAssignOwnerOnClose, 27 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDocMode, 28 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnHideNoteOnComplete, 29 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fintFunction, 30 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrIndicator, 31 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAssignToManager, 32 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fintAssignToFunction, 33 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAssignFunction, 34 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCompleteFunction, 35 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAbortFunction, 36 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrLinkTag, 37 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrViewSourceLinkTag, 38 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnRegistration, 39 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnReasonRequiredComplete, 40 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCrmRequiredComplete, 41 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCrmRequiredAbort, 42 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 43 + __off, -6, __dbStmt);
    return 43;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(fstrWorkType, 1 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWorkCategory, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCanAddOnline, 3 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCustomerRequired, 4 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAccountRequired, 5 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPeriodRequired, 6 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDefaultOwner, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrDaysToComplete, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDaysTilDue, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDaysTilAvailable, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAllowInError, 11 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnForceAvailable, 12 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrDocType, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintDocVer, 14 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrFirstStage, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAbortStage, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnStageFromDoc, 17 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrPrePopBo, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAlwaysRunPrepop, 19 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrCompletionBo, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnSaveOnFailedComplete, 21 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPassMsgData, 22 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrFailMessage, 23 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDocOnAdd, 24 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDocOnChange, 25 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDocOnClose, 26 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAssignOwnerOnClose, 27 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDocMode, 28 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnHideNoteOnComplete, 29 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fintFunction, 30 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrIndicator, 31 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAssignToManager, 32 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fintAssignToFunction, 33 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAssignFunction, 34 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCompleteFunction, 35 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAbortFunction, 36 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrLinkTag, 37 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrViewSourceLinkTag, 38 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnRegistration, 39 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnReasonRequiredComplete, 40 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCrmRequiredComplete, 41 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCrmRequiredAbort, 42 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 43 + __off, -6, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.fstrWorkType = null;
    } else {
    this.fstrWorkType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrWorkCategory = null;
    } else {
    this.fstrWorkCategory = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnCanAddOnline = null;
    } else {
    this.fblnCanAddOnline = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnCustomerRequired = null;
    } else {
    this.fblnCustomerRequired = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnAccountRequired = null;
    } else {
    this.fblnAccountRequired = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnPeriodRequired = null;
    } else {
    this.fblnPeriodRequired = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnDefaultOwner = null;
    } else {
    this.fblnDefaultOwner = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDaysToComplete = null;
    } else {
    this.fstrDaysToComplete = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDaysTilDue = null;
    } else {
    this.fstrDaysTilDue = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDaysTilAvailable = null;
    } else {
    this.fstrDaysTilAvailable = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnAllowInError = null;
    } else {
    this.fblnAllowInError = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnForceAvailable = null;
    } else {
    this.fblnForceAvailable = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDocType = null;
    } else {
    this.fstrDocType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fintDocVer = null;
    } else {
    this.fintDocVer = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrFirstStage = null;
    } else {
    this.fstrFirstStage = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAbortStage = null;
    } else {
    this.fstrAbortStage = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnStageFromDoc = null;
    } else {
    this.fblnStageFromDoc = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPrePopBo = null;
    } else {
    this.fstrPrePopBo = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnAlwaysRunPrepop = null;
    } else {
    this.fblnAlwaysRunPrepop = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCompletionBo = null;
    } else {
    this.fstrCompletionBo = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnSaveOnFailedComplete = null;
    } else {
    this.fblnSaveOnFailedComplete = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnPassMsgData = null;
    } else {
    this.fblnPassMsgData = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrFailMessage = null;
    } else {
    this.fstrFailMessage = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnDocOnAdd = null;
    } else {
    this.fblnDocOnAdd = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnDocOnChange = null;
    } else {
    this.fblnDocOnChange = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnDocOnClose = null;
    } else {
    this.fblnDocOnClose = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnAssignOwnerOnClose = null;
    } else {
    this.fblnAssignOwnerOnClose = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnDocMode = null;
    } else {
    this.fblnDocMode = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnHideNoteOnComplete = null;
    } else {
    this.fblnHideNoteOnComplete = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintFunction = null;
    } else {
    this.fintFunction = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrIndicator = null;
    } else {
    this.fstrIndicator = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnAssignToManager = null;
    } else {
    this.fblnAssignToManager = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintAssignToFunction = null;
    } else {
    this.fintAssignToFunction = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngAssignFunction = null;
    } else {
    this.flngAssignFunction = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngCompleteFunction = null;
    } else {
    this.flngCompleteFunction = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngAbortFunction = null;
    } else {
    this.flngAbortFunction = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrLinkTag = null;
    } else {
    this.fstrLinkTag = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrViewSourceLinkTag = null;
    } else {
    this.fstrViewSourceLinkTag = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnRegistration = null;
    } else {
    this.fblnRegistration = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnReasonRequiredComplete = null;
    } else {
    this.fblnReasonRequiredComplete = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnCrmRequiredComplete = null;
    } else {
    this.fblnCrmRequiredComplete = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnCrmRequiredAbort = null;
    } else {
    this.fblnCrmRequiredAbort = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnActive = null;
    } else {
    this.fblnActive = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.fstrWorkType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWorkType);
    }
    if (null == this.fstrWorkCategory) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWorkCategory);
    }
    if (null == this.fblnCanAddOnline) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCanAddOnline);
    }
    if (null == this.fblnCustomerRequired) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCustomerRequired);
    }
    if (null == this.fblnAccountRequired) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAccountRequired);
    }
    if (null == this.fblnPeriodRequired) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPeriodRequired);
    }
    if (null == this.fblnDefaultOwner) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDefaultOwner);
    }
    if (null == this.fstrDaysToComplete) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDaysToComplete);
    }
    if (null == this.fstrDaysTilDue) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDaysTilDue);
    }
    if (null == this.fstrDaysTilAvailable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDaysTilAvailable);
    }
    if (null == this.fblnAllowInError) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAllowInError);
    }
    if (null == this.fblnForceAvailable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnForceAvailable);
    }
    if (null == this.fstrDocType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDocType);
    }
    if (null == this.fintDocVer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintDocVer);
    }
    if (null == this.fstrFirstStage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFirstStage);
    }
    if (null == this.fstrAbortStage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAbortStage);
    }
    if (null == this.fblnStageFromDoc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnStageFromDoc);
    }
    if (null == this.fstrPrePopBo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPrePopBo);
    }
    if (null == this.fblnAlwaysRunPrepop) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAlwaysRunPrepop);
    }
    if (null == this.fstrCompletionBo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCompletionBo);
    }
    if (null == this.fblnSaveOnFailedComplete) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnSaveOnFailedComplete);
    }
    if (null == this.fblnPassMsgData) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPassMsgData);
    }
    if (null == this.fstrFailMessage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFailMessage);
    }
    if (null == this.fblnDocOnAdd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDocOnAdd);
    }
    if (null == this.fblnDocOnChange) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDocOnChange);
    }
    if (null == this.fblnDocOnClose) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDocOnClose);
    }
    if (null == this.fblnAssignOwnerOnClose) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAssignOwnerOnClose);
    }
    if (null == this.fblnDocMode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDocMode);
    }
    if (null == this.fblnHideNoteOnComplete) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnHideNoteOnComplete);
    }
    if (null == this.fintFunction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintFunction);
    }
    if (null == this.fstrIndicator) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIndicator);
    }
    if (null == this.fblnAssignToManager) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAssignToManager);
    }
    if (null == this.fintAssignToFunction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintAssignToFunction);
    }
    if (null == this.flngAssignFunction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAssignFunction);
    }
    if (null == this.flngCompleteFunction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCompleteFunction);
    }
    if (null == this.flngAbortFunction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAbortFunction);
    }
    if (null == this.fstrLinkTag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLinkTag);
    }
    if (null == this.fstrViewSourceLinkTag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrViewSourceLinkTag);
    }
    if (null == this.fblnRegistration) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnRegistration);
    }
    if (null == this.fblnReasonRequiredComplete) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnReasonRequiredComplete);
    }
    if (null == this.fblnCrmRequiredComplete) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCrmRequiredComplete);
    }
    if (null == this.fblnCrmRequiredAbort) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCrmRequiredAbort);
    }
    if (null == this.fblnActive) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnActive);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.fstrWorkType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWorkType);
    }
    if (null == this.fstrWorkCategory) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWorkCategory);
    }
    if (null == this.fblnCanAddOnline) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCanAddOnline);
    }
    if (null == this.fblnCustomerRequired) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCustomerRequired);
    }
    if (null == this.fblnAccountRequired) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAccountRequired);
    }
    if (null == this.fblnPeriodRequired) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPeriodRequired);
    }
    if (null == this.fblnDefaultOwner) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDefaultOwner);
    }
    if (null == this.fstrDaysToComplete) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDaysToComplete);
    }
    if (null == this.fstrDaysTilDue) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDaysTilDue);
    }
    if (null == this.fstrDaysTilAvailable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDaysTilAvailable);
    }
    if (null == this.fblnAllowInError) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAllowInError);
    }
    if (null == this.fblnForceAvailable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnForceAvailable);
    }
    if (null == this.fstrDocType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDocType);
    }
    if (null == this.fintDocVer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintDocVer);
    }
    if (null == this.fstrFirstStage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFirstStage);
    }
    if (null == this.fstrAbortStage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAbortStage);
    }
    if (null == this.fblnStageFromDoc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnStageFromDoc);
    }
    if (null == this.fstrPrePopBo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPrePopBo);
    }
    if (null == this.fblnAlwaysRunPrepop) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAlwaysRunPrepop);
    }
    if (null == this.fstrCompletionBo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCompletionBo);
    }
    if (null == this.fblnSaveOnFailedComplete) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnSaveOnFailedComplete);
    }
    if (null == this.fblnPassMsgData) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPassMsgData);
    }
    if (null == this.fstrFailMessage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFailMessage);
    }
    if (null == this.fblnDocOnAdd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDocOnAdd);
    }
    if (null == this.fblnDocOnChange) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDocOnChange);
    }
    if (null == this.fblnDocOnClose) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDocOnClose);
    }
    if (null == this.fblnAssignOwnerOnClose) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAssignOwnerOnClose);
    }
    if (null == this.fblnDocMode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDocMode);
    }
    if (null == this.fblnHideNoteOnComplete) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnHideNoteOnComplete);
    }
    if (null == this.fintFunction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintFunction);
    }
    if (null == this.fstrIndicator) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIndicator);
    }
    if (null == this.fblnAssignToManager) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAssignToManager);
    }
    if (null == this.fintAssignToFunction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintAssignToFunction);
    }
    if (null == this.flngAssignFunction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAssignFunction);
    }
    if (null == this.flngCompleteFunction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCompleteFunction);
    }
    if (null == this.flngAbortFunction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAbortFunction);
    }
    if (null == this.fstrLinkTag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLinkTag);
    }
    if (null == this.fstrViewSourceLinkTag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrViewSourceLinkTag);
    }
    if (null == this.fblnRegistration) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnRegistration);
    }
    if (null == this.fblnReasonRequiredComplete) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnReasonRequiredComplete);
    }
    if (null == this.fblnCrmRequiredComplete) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCrmRequiredComplete);
    }
    if (null == this.fblnCrmRequiredAbort) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCrmRequiredAbort);
    }
    if (null == this.fblnActive) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnActive);
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
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWorkType==null?"\\N":fstrWorkType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWorkCategory==null?"\\N":fstrWorkCategory, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCanAddOnline==null?"\\N":"" + fblnCanAddOnline, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCustomerRequired==null?"\\N":"" + fblnCustomerRequired, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAccountRequired==null?"\\N":"" + fblnAccountRequired, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPeriodRequired==null?"\\N":"" + fblnPeriodRequired, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDefaultOwner==null?"\\N":"" + fblnDefaultOwner, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDaysToComplete==null?"\\N":fstrDaysToComplete, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDaysTilDue==null?"\\N":fstrDaysTilDue, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDaysTilAvailable==null?"\\N":fstrDaysTilAvailable, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAllowInError==null?"\\N":"" + fblnAllowInError, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnForceAvailable==null?"\\N":"" + fblnForceAvailable, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDocType==null?"\\N":fstrDocType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintDocVer==null?"\\N":"" + fintDocVer, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFirstStage==null?"\\N":fstrFirstStage, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAbortStage==null?"\\N":fstrAbortStage, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnStageFromDoc==null?"\\N":"" + fblnStageFromDoc, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPrePopBo==null?"\\N":fstrPrePopBo, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAlwaysRunPrepop==null?"\\N":"" + fblnAlwaysRunPrepop, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCompletionBo==null?"\\N":fstrCompletionBo, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnSaveOnFailedComplete==null?"\\N":"" + fblnSaveOnFailedComplete, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPassMsgData==null?"\\N":"" + fblnPassMsgData, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFailMessage==null?"\\N":fstrFailMessage, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDocOnAdd==null?"\\N":"" + fblnDocOnAdd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDocOnChange==null?"\\N":"" + fblnDocOnChange, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDocOnClose==null?"\\N":"" + fblnDocOnClose, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAssignOwnerOnClose==null?"\\N":"" + fblnAssignOwnerOnClose, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDocMode==null?"\\N":"" + fblnDocMode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnHideNoteOnComplete==null?"\\N":"" + fblnHideNoteOnComplete, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintFunction==null?"\\N":"" + fintFunction, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIndicator==null?"\\N":fstrIndicator, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAssignToManager==null?"\\N":"" + fblnAssignToManager, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintAssignToFunction==null?"\\N":"" + fintAssignToFunction, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAssignFunction==null?"\\N":"" + flngAssignFunction, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCompleteFunction==null?"\\N":"" + flngCompleteFunction, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAbortFunction==null?"\\N":"" + flngAbortFunction, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLinkTag==null?"\\N":fstrLinkTag, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrViewSourceLinkTag==null?"\\N":fstrViewSourceLinkTag, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnRegistration==null?"\\N":"" + fblnRegistration, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnReasonRequiredComplete==null?"\\N":"" + fblnReasonRequiredComplete, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCrmRequiredComplete==null?"\\N":"" + fblnCrmRequiredComplete, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCrmRequiredAbort==null?"\\N":"" + fblnCrmRequiredAbort, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnActive==null?"\\N":"" + fblnActive, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWorkType==null?"\\N":fstrWorkType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWorkCategory==null?"\\N":fstrWorkCategory, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCanAddOnline==null?"\\N":"" + fblnCanAddOnline, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCustomerRequired==null?"\\N":"" + fblnCustomerRequired, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAccountRequired==null?"\\N":"" + fblnAccountRequired, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPeriodRequired==null?"\\N":"" + fblnPeriodRequired, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDefaultOwner==null?"\\N":"" + fblnDefaultOwner, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDaysToComplete==null?"\\N":fstrDaysToComplete, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDaysTilDue==null?"\\N":fstrDaysTilDue, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDaysTilAvailable==null?"\\N":fstrDaysTilAvailable, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAllowInError==null?"\\N":"" + fblnAllowInError, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnForceAvailable==null?"\\N":"" + fblnForceAvailable, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDocType==null?"\\N":fstrDocType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintDocVer==null?"\\N":"" + fintDocVer, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFirstStage==null?"\\N":fstrFirstStage, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAbortStage==null?"\\N":fstrAbortStage, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnStageFromDoc==null?"\\N":"" + fblnStageFromDoc, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPrePopBo==null?"\\N":fstrPrePopBo, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAlwaysRunPrepop==null?"\\N":"" + fblnAlwaysRunPrepop, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCompletionBo==null?"\\N":fstrCompletionBo, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnSaveOnFailedComplete==null?"\\N":"" + fblnSaveOnFailedComplete, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPassMsgData==null?"\\N":"" + fblnPassMsgData, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFailMessage==null?"\\N":fstrFailMessage, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDocOnAdd==null?"\\N":"" + fblnDocOnAdd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDocOnChange==null?"\\N":"" + fblnDocOnChange, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDocOnClose==null?"\\N":"" + fblnDocOnClose, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAssignOwnerOnClose==null?"\\N":"" + fblnAssignOwnerOnClose, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDocMode==null?"\\N":"" + fblnDocMode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnHideNoteOnComplete==null?"\\N":"" + fblnHideNoteOnComplete, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintFunction==null?"\\N":"" + fintFunction, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIndicator==null?"\\N":fstrIndicator, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAssignToManager==null?"\\N":"" + fblnAssignToManager, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintAssignToFunction==null?"\\N":"" + fintAssignToFunction, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAssignFunction==null?"\\N":"" + flngAssignFunction, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCompleteFunction==null?"\\N":"" + flngCompleteFunction, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAbortFunction==null?"\\N":"" + flngAbortFunction, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLinkTag==null?"\\N":fstrLinkTag, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrViewSourceLinkTag==null?"\\N":fstrViewSourceLinkTag, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnRegistration==null?"\\N":"" + fblnRegistration, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnReasonRequiredComplete==null?"\\N":"" + fblnReasonRequiredComplete, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCrmRequiredComplete==null?"\\N":"" + fblnCrmRequiredComplete, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCrmRequiredAbort==null?"\\N":"" + fblnCrmRequiredAbort, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnActive==null?"\\N":"" + fblnActive, delimiters));
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
    if (__cur_str.equals("null")) { this.fstrWorkType = null; } else {
      this.fstrWorkType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrWorkCategory = null; } else {
      this.fstrWorkCategory = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCanAddOnline = null; } else {
      this.fblnCanAddOnline = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCustomerRequired = null; } else {
      this.fblnCustomerRequired = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAccountRequired = null; } else {
      this.fblnAccountRequired = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPeriodRequired = null; } else {
      this.fblnPeriodRequired = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnDefaultOwner = null; } else {
      this.fblnDefaultOwner = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDaysToComplete = null; } else {
      this.fstrDaysToComplete = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDaysTilDue = null; } else {
      this.fstrDaysTilDue = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDaysTilAvailable = null; } else {
      this.fstrDaysTilAvailable = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAllowInError = null; } else {
      this.fblnAllowInError = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnForceAvailable = null; } else {
      this.fblnForceAvailable = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDocType = null; } else {
      this.fstrDocType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintDocVer = null; } else {
      this.fintDocVer = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFirstStage = null; } else {
      this.fstrFirstStage = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAbortStage = null; } else {
      this.fstrAbortStage = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnStageFromDoc = null; } else {
      this.fblnStageFromDoc = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPrePopBo = null; } else {
      this.fstrPrePopBo = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAlwaysRunPrepop = null; } else {
      this.fblnAlwaysRunPrepop = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCompletionBo = null; } else {
      this.fstrCompletionBo = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnSaveOnFailedComplete = null; } else {
      this.fblnSaveOnFailedComplete = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPassMsgData = null; } else {
      this.fblnPassMsgData = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFailMessage = null; } else {
      this.fstrFailMessage = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnDocOnAdd = null; } else {
      this.fblnDocOnAdd = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnDocOnChange = null; } else {
      this.fblnDocOnChange = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnDocOnClose = null; } else {
      this.fblnDocOnClose = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAssignOwnerOnClose = null; } else {
      this.fblnAssignOwnerOnClose = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnDocMode = null; } else {
      this.fblnDocMode = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnHideNoteOnComplete = null; } else {
      this.fblnHideNoteOnComplete = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintFunction = null; } else {
      this.fintFunction = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIndicator = null; } else {
      this.fstrIndicator = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAssignToManager = null; } else {
      this.fblnAssignToManager = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintAssignToFunction = null; } else {
      this.fintAssignToFunction = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAssignFunction = null; } else {
      this.flngAssignFunction = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCompleteFunction = null; } else {
      this.flngCompleteFunction = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAbortFunction = null; } else {
      this.flngAbortFunction = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLinkTag = null; } else {
      this.fstrLinkTag = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrViewSourceLinkTag = null; } else {
      this.fstrViewSourceLinkTag = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnRegistration = null; } else {
      this.fblnRegistration = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnReasonRequiredComplete = null; } else {
      this.fblnReasonRequiredComplete = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCrmRequiredComplete = null; } else {
      this.fblnCrmRequiredComplete = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCrmRequiredAbort = null; } else {
      this.fblnCrmRequiredAbort = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnActive = null; } else {
      this.fblnActive = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrWorkType = null; } else {
      this.fstrWorkType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrWorkCategory = null; } else {
      this.fstrWorkCategory = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCanAddOnline = null; } else {
      this.fblnCanAddOnline = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCustomerRequired = null; } else {
      this.fblnCustomerRequired = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAccountRequired = null; } else {
      this.fblnAccountRequired = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPeriodRequired = null; } else {
      this.fblnPeriodRequired = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnDefaultOwner = null; } else {
      this.fblnDefaultOwner = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDaysToComplete = null; } else {
      this.fstrDaysToComplete = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDaysTilDue = null; } else {
      this.fstrDaysTilDue = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDaysTilAvailable = null; } else {
      this.fstrDaysTilAvailable = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAllowInError = null; } else {
      this.fblnAllowInError = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnForceAvailable = null; } else {
      this.fblnForceAvailable = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDocType = null; } else {
      this.fstrDocType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintDocVer = null; } else {
      this.fintDocVer = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFirstStage = null; } else {
      this.fstrFirstStage = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAbortStage = null; } else {
      this.fstrAbortStage = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnStageFromDoc = null; } else {
      this.fblnStageFromDoc = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPrePopBo = null; } else {
      this.fstrPrePopBo = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAlwaysRunPrepop = null; } else {
      this.fblnAlwaysRunPrepop = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCompletionBo = null; } else {
      this.fstrCompletionBo = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnSaveOnFailedComplete = null; } else {
      this.fblnSaveOnFailedComplete = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPassMsgData = null; } else {
      this.fblnPassMsgData = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFailMessage = null; } else {
      this.fstrFailMessage = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnDocOnAdd = null; } else {
      this.fblnDocOnAdd = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnDocOnChange = null; } else {
      this.fblnDocOnChange = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnDocOnClose = null; } else {
      this.fblnDocOnClose = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAssignOwnerOnClose = null; } else {
      this.fblnAssignOwnerOnClose = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnDocMode = null; } else {
      this.fblnDocMode = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnHideNoteOnComplete = null; } else {
      this.fblnHideNoteOnComplete = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintFunction = null; } else {
      this.fintFunction = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIndicator = null; } else {
      this.fstrIndicator = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAssignToManager = null; } else {
      this.fblnAssignToManager = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintAssignToFunction = null; } else {
      this.fintAssignToFunction = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAssignFunction = null; } else {
      this.flngAssignFunction = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCompleteFunction = null; } else {
      this.flngCompleteFunction = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAbortFunction = null; } else {
      this.flngAbortFunction = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLinkTag = null; } else {
      this.fstrLinkTag = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrViewSourceLinkTag = null; } else {
      this.fstrViewSourceLinkTag = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnRegistration = null; } else {
      this.fblnRegistration = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnReasonRequiredComplete = null; } else {
      this.fblnReasonRequiredComplete = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCrmRequiredComplete = null; } else {
      this.fblnCrmRequiredComplete = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCrmRequiredAbort = null; } else {
      this.fblnCrmRequiredAbort = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnActive = null; } else {
      this.fblnActive = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    rfrworktype o = (rfrworktype) super.clone();
    return o;
  }

  public void clone0(rfrworktype o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("fstrWorkType", this.fstrWorkType);
    __sqoop$field_map.put("fstrWorkCategory", this.fstrWorkCategory);
    __sqoop$field_map.put("fblnCanAddOnline", this.fblnCanAddOnline);
    __sqoop$field_map.put("fblnCustomerRequired", this.fblnCustomerRequired);
    __sqoop$field_map.put("fblnAccountRequired", this.fblnAccountRequired);
    __sqoop$field_map.put("fblnPeriodRequired", this.fblnPeriodRequired);
    __sqoop$field_map.put("fblnDefaultOwner", this.fblnDefaultOwner);
    __sqoop$field_map.put("fstrDaysToComplete", this.fstrDaysToComplete);
    __sqoop$field_map.put("fstrDaysTilDue", this.fstrDaysTilDue);
    __sqoop$field_map.put("fstrDaysTilAvailable", this.fstrDaysTilAvailable);
    __sqoop$field_map.put("fblnAllowInError", this.fblnAllowInError);
    __sqoop$field_map.put("fblnForceAvailable", this.fblnForceAvailable);
    __sqoop$field_map.put("fstrDocType", this.fstrDocType);
    __sqoop$field_map.put("fintDocVer", this.fintDocVer);
    __sqoop$field_map.put("fstrFirstStage", this.fstrFirstStage);
    __sqoop$field_map.put("fstrAbortStage", this.fstrAbortStage);
    __sqoop$field_map.put("fblnStageFromDoc", this.fblnStageFromDoc);
    __sqoop$field_map.put("fstrPrePopBo", this.fstrPrePopBo);
    __sqoop$field_map.put("fblnAlwaysRunPrepop", this.fblnAlwaysRunPrepop);
    __sqoop$field_map.put("fstrCompletionBo", this.fstrCompletionBo);
    __sqoop$field_map.put("fblnSaveOnFailedComplete", this.fblnSaveOnFailedComplete);
    __sqoop$field_map.put("fblnPassMsgData", this.fblnPassMsgData);
    __sqoop$field_map.put("fstrFailMessage", this.fstrFailMessage);
    __sqoop$field_map.put("fblnDocOnAdd", this.fblnDocOnAdd);
    __sqoop$field_map.put("fblnDocOnChange", this.fblnDocOnChange);
    __sqoop$field_map.put("fblnDocOnClose", this.fblnDocOnClose);
    __sqoop$field_map.put("fblnAssignOwnerOnClose", this.fblnAssignOwnerOnClose);
    __sqoop$field_map.put("fblnDocMode", this.fblnDocMode);
    __sqoop$field_map.put("fblnHideNoteOnComplete", this.fblnHideNoteOnComplete);
    __sqoop$field_map.put("fintFunction", this.fintFunction);
    __sqoop$field_map.put("fstrIndicator", this.fstrIndicator);
    __sqoop$field_map.put("fblnAssignToManager", this.fblnAssignToManager);
    __sqoop$field_map.put("fintAssignToFunction", this.fintAssignToFunction);
    __sqoop$field_map.put("flngAssignFunction", this.flngAssignFunction);
    __sqoop$field_map.put("flngCompleteFunction", this.flngCompleteFunction);
    __sqoop$field_map.put("flngAbortFunction", this.flngAbortFunction);
    __sqoop$field_map.put("fstrLinkTag", this.fstrLinkTag);
    __sqoop$field_map.put("fstrViewSourceLinkTag", this.fstrViewSourceLinkTag);
    __sqoop$field_map.put("fblnRegistration", this.fblnRegistration);
    __sqoop$field_map.put("fblnReasonRequiredComplete", this.fblnReasonRequiredComplete);
    __sqoop$field_map.put("fblnCrmRequiredComplete", this.fblnCrmRequiredComplete);
    __sqoop$field_map.put("fblnCrmRequiredAbort", this.fblnCrmRequiredAbort);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("fstrWorkType", this.fstrWorkType);
    __sqoop$field_map.put("fstrWorkCategory", this.fstrWorkCategory);
    __sqoop$field_map.put("fblnCanAddOnline", this.fblnCanAddOnline);
    __sqoop$field_map.put("fblnCustomerRequired", this.fblnCustomerRequired);
    __sqoop$field_map.put("fblnAccountRequired", this.fblnAccountRequired);
    __sqoop$field_map.put("fblnPeriodRequired", this.fblnPeriodRequired);
    __sqoop$field_map.put("fblnDefaultOwner", this.fblnDefaultOwner);
    __sqoop$field_map.put("fstrDaysToComplete", this.fstrDaysToComplete);
    __sqoop$field_map.put("fstrDaysTilDue", this.fstrDaysTilDue);
    __sqoop$field_map.put("fstrDaysTilAvailable", this.fstrDaysTilAvailable);
    __sqoop$field_map.put("fblnAllowInError", this.fblnAllowInError);
    __sqoop$field_map.put("fblnForceAvailable", this.fblnForceAvailable);
    __sqoop$field_map.put("fstrDocType", this.fstrDocType);
    __sqoop$field_map.put("fintDocVer", this.fintDocVer);
    __sqoop$field_map.put("fstrFirstStage", this.fstrFirstStage);
    __sqoop$field_map.put("fstrAbortStage", this.fstrAbortStage);
    __sqoop$field_map.put("fblnStageFromDoc", this.fblnStageFromDoc);
    __sqoop$field_map.put("fstrPrePopBo", this.fstrPrePopBo);
    __sqoop$field_map.put("fblnAlwaysRunPrepop", this.fblnAlwaysRunPrepop);
    __sqoop$field_map.put("fstrCompletionBo", this.fstrCompletionBo);
    __sqoop$field_map.put("fblnSaveOnFailedComplete", this.fblnSaveOnFailedComplete);
    __sqoop$field_map.put("fblnPassMsgData", this.fblnPassMsgData);
    __sqoop$field_map.put("fstrFailMessage", this.fstrFailMessage);
    __sqoop$field_map.put("fblnDocOnAdd", this.fblnDocOnAdd);
    __sqoop$field_map.put("fblnDocOnChange", this.fblnDocOnChange);
    __sqoop$field_map.put("fblnDocOnClose", this.fblnDocOnClose);
    __sqoop$field_map.put("fblnAssignOwnerOnClose", this.fblnAssignOwnerOnClose);
    __sqoop$field_map.put("fblnDocMode", this.fblnDocMode);
    __sqoop$field_map.put("fblnHideNoteOnComplete", this.fblnHideNoteOnComplete);
    __sqoop$field_map.put("fintFunction", this.fintFunction);
    __sqoop$field_map.put("fstrIndicator", this.fstrIndicator);
    __sqoop$field_map.put("fblnAssignToManager", this.fblnAssignToManager);
    __sqoop$field_map.put("fintAssignToFunction", this.fintAssignToFunction);
    __sqoop$field_map.put("flngAssignFunction", this.flngAssignFunction);
    __sqoop$field_map.put("flngCompleteFunction", this.flngCompleteFunction);
    __sqoop$field_map.put("flngAbortFunction", this.flngAbortFunction);
    __sqoop$field_map.put("fstrLinkTag", this.fstrLinkTag);
    __sqoop$field_map.put("fstrViewSourceLinkTag", this.fstrViewSourceLinkTag);
    __sqoop$field_map.put("fblnRegistration", this.fblnRegistration);
    __sqoop$field_map.put("fblnReasonRequiredComplete", this.fblnReasonRequiredComplete);
    __sqoop$field_map.put("fblnCrmRequiredComplete", this.fblnCrmRequiredComplete);
    __sqoop$field_map.put("fblnCrmRequiredAbort", this.fblnCrmRequiredAbort);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
