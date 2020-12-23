// ORM class for table 'rfrindicator'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 00:19:24 NZDT 2020
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

public class rfrindicator extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("fstrIndicator", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrindicator.this.fstrIndicator = (String)value;
      }
    });
    setters.put("fblnCustomerLevel", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrindicator.this.fblnCustomerLevel = (Integer)value;
      }
    });
    setters.put("fblnProfileLevel", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrindicator.this.fblnProfileLevel = (Integer)value;
      }
    });
    setters.put("fblnAccountLevel", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrindicator.this.fblnAccountLevel = (Integer)value;
      }
    });
    setters.put("fblnPeriodLevel", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrindicator.this.fblnPeriodLevel = (Integer)value;
      }
    });
    setters.put("fblnPeriodRequired", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrindicator.this.fblnPeriodRequired = (Integer)value;
      }
    });
    setters.put("fblnPeriodRange", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrindicator.this.fblnPeriodRange = (Integer)value;
      }
    });
    setters.put("fblnManual", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrindicator.this.fblnManual = (Integer)value;
      }
    });
    setters.put("fblnAmountAllowed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrindicator.this.fblnAmountAllowed = (Integer)value;
      }
    });
    setters.put("fblnUserRequired", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrindicator.this.fblnUserRequired = (Integer)value;
      }
    });
    setters.put("flngFunction", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrindicator.this.flngFunction = (Integer)value;
      }
    });
    setters.put("flngFunctionCease", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrindicator.this.flngFunctionCease = (Integer)value;
      }
    });
    setters.put("flngAssignFunction", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrindicator.this.flngAssignFunction = (Integer)value;
      }
    });
    setters.put("fblnCommentRequired", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrindicator.this.fblnCommentRequired = (Integer)value;
      }
    });
    setters.put("fblnCommentCease", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrindicator.this.fblnCommentCease = (Integer)value;
      }
    });
    setters.put("fblnReasonRequired", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrindicator.this.fblnReasonRequired = (Integer)value;
      }
    });
    setters.put("fblnHideAtCustomer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrindicator.this.fblnHideAtCustomer = (Integer)value;
      }
    });
    setters.put("fblnHideAtAccount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrindicator.this.fblnHideAtAccount = (Integer)value;
      }
    });
    setters.put("fblnHideAtPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrindicator.this.fblnHideAtPeriod = (Integer)value;
      }
    });
    setters.put("fstrVirtualBo", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrindicator.this.fstrVirtualBo = (String)value;
      }
    });
    setters.put("fblnAlert", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrindicator.this.fblnAlert = (Integer)value;
      }
    });
    setters.put("fstrDocType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrindicator.this.fstrDocType = (String)value;
      }
    });
    setters.put("fintDocVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrindicator.this.fintDocVer = (Integer)value;
      }
    });
    setters.put("fblnActive", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrindicator.this.fblnActive = (Integer)value;
      }
    });
  }
  public rfrindicator() {
    init0();
  }
  private String fstrIndicator;
  public String get_fstrIndicator() {
    return fstrIndicator;
  }
  public void set_fstrIndicator(String fstrIndicator) {
    this.fstrIndicator = fstrIndicator;
  }
  public rfrindicator with_fstrIndicator(String fstrIndicator) {
    this.fstrIndicator = fstrIndicator;
    return this;
  }
  private Integer fblnCustomerLevel;
  public Integer get_fblnCustomerLevel() {
    return fblnCustomerLevel;
  }
  public void set_fblnCustomerLevel(Integer fblnCustomerLevel) {
    this.fblnCustomerLevel = fblnCustomerLevel;
  }
  public rfrindicator with_fblnCustomerLevel(Integer fblnCustomerLevel) {
    this.fblnCustomerLevel = fblnCustomerLevel;
    return this;
  }
  private Integer fblnProfileLevel;
  public Integer get_fblnProfileLevel() {
    return fblnProfileLevel;
  }
  public void set_fblnProfileLevel(Integer fblnProfileLevel) {
    this.fblnProfileLevel = fblnProfileLevel;
  }
  public rfrindicator with_fblnProfileLevel(Integer fblnProfileLevel) {
    this.fblnProfileLevel = fblnProfileLevel;
    return this;
  }
  private Integer fblnAccountLevel;
  public Integer get_fblnAccountLevel() {
    return fblnAccountLevel;
  }
  public void set_fblnAccountLevel(Integer fblnAccountLevel) {
    this.fblnAccountLevel = fblnAccountLevel;
  }
  public rfrindicator with_fblnAccountLevel(Integer fblnAccountLevel) {
    this.fblnAccountLevel = fblnAccountLevel;
    return this;
  }
  private Integer fblnPeriodLevel;
  public Integer get_fblnPeriodLevel() {
    return fblnPeriodLevel;
  }
  public void set_fblnPeriodLevel(Integer fblnPeriodLevel) {
    this.fblnPeriodLevel = fblnPeriodLevel;
  }
  public rfrindicator with_fblnPeriodLevel(Integer fblnPeriodLevel) {
    this.fblnPeriodLevel = fblnPeriodLevel;
    return this;
  }
  private Integer fblnPeriodRequired;
  public Integer get_fblnPeriodRequired() {
    return fblnPeriodRequired;
  }
  public void set_fblnPeriodRequired(Integer fblnPeriodRequired) {
    this.fblnPeriodRequired = fblnPeriodRequired;
  }
  public rfrindicator with_fblnPeriodRequired(Integer fblnPeriodRequired) {
    this.fblnPeriodRequired = fblnPeriodRequired;
    return this;
  }
  private Integer fblnPeriodRange;
  public Integer get_fblnPeriodRange() {
    return fblnPeriodRange;
  }
  public void set_fblnPeriodRange(Integer fblnPeriodRange) {
    this.fblnPeriodRange = fblnPeriodRange;
  }
  public rfrindicator with_fblnPeriodRange(Integer fblnPeriodRange) {
    this.fblnPeriodRange = fblnPeriodRange;
    return this;
  }
  private Integer fblnManual;
  public Integer get_fblnManual() {
    return fblnManual;
  }
  public void set_fblnManual(Integer fblnManual) {
    this.fblnManual = fblnManual;
  }
  public rfrindicator with_fblnManual(Integer fblnManual) {
    this.fblnManual = fblnManual;
    return this;
  }
  private Integer fblnAmountAllowed;
  public Integer get_fblnAmountAllowed() {
    return fblnAmountAllowed;
  }
  public void set_fblnAmountAllowed(Integer fblnAmountAllowed) {
    this.fblnAmountAllowed = fblnAmountAllowed;
  }
  public rfrindicator with_fblnAmountAllowed(Integer fblnAmountAllowed) {
    this.fblnAmountAllowed = fblnAmountAllowed;
    return this;
  }
  private Integer fblnUserRequired;
  public Integer get_fblnUserRequired() {
    return fblnUserRequired;
  }
  public void set_fblnUserRequired(Integer fblnUserRequired) {
    this.fblnUserRequired = fblnUserRequired;
  }
  public rfrindicator with_fblnUserRequired(Integer fblnUserRequired) {
    this.fblnUserRequired = fblnUserRequired;
    return this;
  }
  private Integer flngFunction;
  public Integer get_flngFunction() {
    return flngFunction;
  }
  public void set_flngFunction(Integer flngFunction) {
    this.flngFunction = flngFunction;
  }
  public rfrindicator with_flngFunction(Integer flngFunction) {
    this.flngFunction = flngFunction;
    return this;
  }
  private Integer flngFunctionCease;
  public Integer get_flngFunctionCease() {
    return flngFunctionCease;
  }
  public void set_flngFunctionCease(Integer flngFunctionCease) {
    this.flngFunctionCease = flngFunctionCease;
  }
  public rfrindicator with_flngFunctionCease(Integer flngFunctionCease) {
    this.flngFunctionCease = flngFunctionCease;
    return this;
  }
  private Integer flngAssignFunction;
  public Integer get_flngAssignFunction() {
    return flngAssignFunction;
  }
  public void set_flngAssignFunction(Integer flngAssignFunction) {
    this.flngAssignFunction = flngAssignFunction;
  }
  public rfrindicator with_flngAssignFunction(Integer flngAssignFunction) {
    this.flngAssignFunction = flngAssignFunction;
    return this;
  }
  private Integer fblnCommentRequired;
  public Integer get_fblnCommentRequired() {
    return fblnCommentRequired;
  }
  public void set_fblnCommentRequired(Integer fblnCommentRequired) {
    this.fblnCommentRequired = fblnCommentRequired;
  }
  public rfrindicator with_fblnCommentRequired(Integer fblnCommentRequired) {
    this.fblnCommentRequired = fblnCommentRequired;
    return this;
  }
  private Integer fblnCommentCease;
  public Integer get_fblnCommentCease() {
    return fblnCommentCease;
  }
  public void set_fblnCommentCease(Integer fblnCommentCease) {
    this.fblnCommentCease = fblnCommentCease;
  }
  public rfrindicator with_fblnCommentCease(Integer fblnCommentCease) {
    this.fblnCommentCease = fblnCommentCease;
    return this;
  }
  private Integer fblnReasonRequired;
  public Integer get_fblnReasonRequired() {
    return fblnReasonRequired;
  }
  public void set_fblnReasonRequired(Integer fblnReasonRequired) {
    this.fblnReasonRequired = fblnReasonRequired;
  }
  public rfrindicator with_fblnReasonRequired(Integer fblnReasonRequired) {
    this.fblnReasonRequired = fblnReasonRequired;
    return this;
  }
  private Integer fblnHideAtCustomer;
  public Integer get_fblnHideAtCustomer() {
    return fblnHideAtCustomer;
  }
  public void set_fblnHideAtCustomer(Integer fblnHideAtCustomer) {
    this.fblnHideAtCustomer = fblnHideAtCustomer;
  }
  public rfrindicator with_fblnHideAtCustomer(Integer fblnHideAtCustomer) {
    this.fblnHideAtCustomer = fblnHideAtCustomer;
    return this;
  }
  private Integer fblnHideAtAccount;
  public Integer get_fblnHideAtAccount() {
    return fblnHideAtAccount;
  }
  public void set_fblnHideAtAccount(Integer fblnHideAtAccount) {
    this.fblnHideAtAccount = fblnHideAtAccount;
  }
  public rfrindicator with_fblnHideAtAccount(Integer fblnHideAtAccount) {
    this.fblnHideAtAccount = fblnHideAtAccount;
    return this;
  }
  private Integer fblnHideAtPeriod;
  public Integer get_fblnHideAtPeriod() {
    return fblnHideAtPeriod;
  }
  public void set_fblnHideAtPeriod(Integer fblnHideAtPeriod) {
    this.fblnHideAtPeriod = fblnHideAtPeriod;
  }
  public rfrindicator with_fblnHideAtPeriod(Integer fblnHideAtPeriod) {
    this.fblnHideAtPeriod = fblnHideAtPeriod;
    return this;
  }
  private String fstrVirtualBo;
  public String get_fstrVirtualBo() {
    return fstrVirtualBo;
  }
  public void set_fstrVirtualBo(String fstrVirtualBo) {
    this.fstrVirtualBo = fstrVirtualBo;
  }
  public rfrindicator with_fstrVirtualBo(String fstrVirtualBo) {
    this.fstrVirtualBo = fstrVirtualBo;
    return this;
  }
  private Integer fblnAlert;
  public Integer get_fblnAlert() {
    return fblnAlert;
  }
  public void set_fblnAlert(Integer fblnAlert) {
    this.fblnAlert = fblnAlert;
  }
  public rfrindicator with_fblnAlert(Integer fblnAlert) {
    this.fblnAlert = fblnAlert;
    return this;
  }
  private String fstrDocType;
  public String get_fstrDocType() {
    return fstrDocType;
  }
  public void set_fstrDocType(String fstrDocType) {
    this.fstrDocType = fstrDocType;
  }
  public rfrindicator with_fstrDocType(String fstrDocType) {
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
  public rfrindicator with_fintDocVer(Integer fintDocVer) {
    this.fintDocVer = fintDocVer;
    return this;
  }
  private Integer fblnActive;
  public Integer get_fblnActive() {
    return fblnActive;
  }
  public void set_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
  }
  public rfrindicator with_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof rfrindicator)) {
      return false;
    }
    rfrindicator that = (rfrindicator) o;
    boolean equal = true;
    equal = equal && (this.fstrIndicator == null ? that.fstrIndicator == null : this.fstrIndicator.equals(that.fstrIndicator));
    equal = equal && (this.fblnCustomerLevel == null ? that.fblnCustomerLevel == null : this.fblnCustomerLevel.equals(that.fblnCustomerLevel));
    equal = equal && (this.fblnProfileLevel == null ? that.fblnProfileLevel == null : this.fblnProfileLevel.equals(that.fblnProfileLevel));
    equal = equal && (this.fblnAccountLevel == null ? that.fblnAccountLevel == null : this.fblnAccountLevel.equals(that.fblnAccountLevel));
    equal = equal && (this.fblnPeriodLevel == null ? that.fblnPeriodLevel == null : this.fblnPeriodLevel.equals(that.fblnPeriodLevel));
    equal = equal && (this.fblnPeriodRequired == null ? that.fblnPeriodRequired == null : this.fblnPeriodRequired.equals(that.fblnPeriodRequired));
    equal = equal && (this.fblnPeriodRange == null ? that.fblnPeriodRange == null : this.fblnPeriodRange.equals(that.fblnPeriodRange));
    equal = equal && (this.fblnManual == null ? that.fblnManual == null : this.fblnManual.equals(that.fblnManual));
    equal = equal && (this.fblnAmountAllowed == null ? that.fblnAmountAllowed == null : this.fblnAmountAllowed.equals(that.fblnAmountAllowed));
    equal = equal && (this.fblnUserRequired == null ? that.fblnUserRequired == null : this.fblnUserRequired.equals(that.fblnUserRequired));
    equal = equal && (this.flngFunction == null ? that.flngFunction == null : this.flngFunction.equals(that.flngFunction));
    equal = equal && (this.flngFunctionCease == null ? that.flngFunctionCease == null : this.flngFunctionCease.equals(that.flngFunctionCease));
    equal = equal && (this.flngAssignFunction == null ? that.flngAssignFunction == null : this.flngAssignFunction.equals(that.flngAssignFunction));
    equal = equal && (this.fblnCommentRequired == null ? that.fblnCommentRequired == null : this.fblnCommentRequired.equals(that.fblnCommentRequired));
    equal = equal && (this.fblnCommentCease == null ? that.fblnCommentCease == null : this.fblnCommentCease.equals(that.fblnCommentCease));
    equal = equal && (this.fblnReasonRequired == null ? that.fblnReasonRequired == null : this.fblnReasonRequired.equals(that.fblnReasonRequired));
    equal = equal && (this.fblnHideAtCustomer == null ? that.fblnHideAtCustomer == null : this.fblnHideAtCustomer.equals(that.fblnHideAtCustomer));
    equal = equal && (this.fblnHideAtAccount == null ? that.fblnHideAtAccount == null : this.fblnHideAtAccount.equals(that.fblnHideAtAccount));
    equal = equal && (this.fblnHideAtPeriod == null ? that.fblnHideAtPeriod == null : this.fblnHideAtPeriod.equals(that.fblnHideAtPeriod));
    equal = equal && (this.fstrVirtualBo == null ? that.fstrVirtualBo == null : this.fstrVirtualBo.equals(that.fstrVirtualBo));
    equal = equal && (this.fblnAlert == null ? that.fblnAlert == null : this.fblnAlert.equals(that.fblnAlert));
    equal = equal && (this.fstrDocType == null ? that.fstrDocType == null : this.fstrDocType.equals(that.fstrDocType));
    equal = equal && (this.fintDocVer == null ? that.fintDocVer == null : this.fintDocVer.equals(that.fintDocVer));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof rfrindicator)) {
      return false;
    }
    rfrindicator that = (rfrindicator) o;
    boolean equal = true;
    equal = equal && (this.fstrIndicator == null ? that.fstrIndicator == null : this.fstrIndicator.equals(that.fstrIndicator));
    equal = equal && (this.fblnCustomerLevel == null ? that.fblnCustomerLevel == null : this.fblnCustomerLevel.equals(that.fblnCustomerLevel));
    equal = equal && (this.fblnProfileLevel == null ? that.fblnProfileLevel == null : this.fblnProfileLevel.equals(that.fblnProfileLevel));
    equal = equal && (this.fblnAccountLevel == null ? that.fblnAccountLevel == null : this.fblnAccountLevel.equals(that.fblnAccountLevel));
    equal = equal && (this.fblnPeriodLevel == null ? that.fblnPeriodLevel == null : this.fblnPeriodLevel.equals(that.fblnPeriodLevel));
    equal = equal && (this.fblnPeriodRequired == null ? that.fblnPeriodRequired == null : this.fblnPeriodRequired.equals(that.fblnPeriodRequired));
    equal = equal && (this.fblnPeriodRange == null ? that.fblnPeriodRange == null : this.fblnPeriodRange.equals(that.fblnPeriodRange));
    equal = equal && (this.fblnManual == null ? that.fblnManual == null : this.fblnManual.equals(that.fblnManual));
    equal = equal && (this.fblnAmountAllowed == null ? that.fblnAmountAllowed == null : this.fblnAmountAllowed.equals(that.fblnAmountAllowed));
    equal = equal && (this.fblnUserRequired == null ? that.fblnUserRequired == null : this.fblnUserRequired.equals(that.fblnUserRequired));
    equal = equal && (this.flngFunction == null ? that.flngFunction == null : this.flngFunction.equals(that.flngFunction));
    equal = equal && (this.flngFunctionCease == null ? that.flngFunctionCease == null : this.flngFunctionCease.equals(that.flngFunctionCease));
    equal = equal && (this.flngAssignFunction == null ? that.flngAssignFunction == null : this.flngAssignFunction.equals(that.flngAssignFunction));
    equal = equal && (this.fblnCommentRequired == null ? that.fblnCommentRequired == null : this.fblnCommentRequired.equals(that.fblnCommentRequired));
    equal = equal && (this.fblnCommentCease == null ? that.fblnCommentCease == null : this.fblnCommentCease.equals(that.fblnCommentCease));
    equal = equal && (this.fblnReasonRequired == null ? that.fblnReasonRequired == null : this.fblnReasonRequired.equals(that.fblnReasonRequired));
    equal = equal && (this.fblnHideAtCustomer == null ? that.fblnHideAtCustomer == null : this.fblnHideAtCustomer.equals(that.fblnHideAtCustomer));
    equal = equal && (this.fblnHideAtAccount == null ? that.fblnHideAtAccount == null : this.fblnHideAtAccount.equals(that.fblnHideAtAccount));
    equal = equal && (this.fblnHideAtPeriod == null ? that.fblnHideAtPeriod == null : this.fblnHideAtPeriod.equals(that.fblnHideAtPeriod));
    equal = equal && (this.fstrVirtualBo == null ? that.fstrVirtualBo == null : this.fstrVirtualBo.equals(that.fstrVirtualBo));
    equal = equal && (this.fblnAlert == null ? that.fblnAlert == null : this.fblnAlert.equals(that.fblnAlert));
    equal = equal && (this.fstrDocType == null ? that.fstrDocType == null : this.fstrDocType.equals(that.fstrDocType));
    equal = equal && (this.fintDocVer == null ? that.fintDocVer == null : this.fintDocVer.equals(that.fintDocVer));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.fstrIndicator = JdbcWritableBridge.readString(1, __dbResults);
    this.fblnCustomerLevel = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fblnProfileLevel = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fblnAccountLevel = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fblnPeriodLevel = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fblnPeriodRequired = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fblnPeriodRange = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fblnManual = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fblnAmountAllowed = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fblnUserRequired = JdbcWritableBridge.readInteger(10, __dbResults);
    this.flngFunction = JdbcWritableBridge.readInteger(11, __dbResults);
    this.flngFunctionCease = JdbcWritableBridge.readInteger(12, __dbResults);
    this.flngAssignFunction = JdbcWritableBridge.readInteger(13, __dbResults);
    this.fblnCommentRequired = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fblnCommentCease = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fblnReasonRequired = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fblnHideAtCustomer = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fblnHideAtAccount = JdbcWritableBridge.readInteger(18, __dbResults);
    this.fblnHideAtPeriod = JdbcWritableBridge.readInteger(19, __dbResults);
    this.fstrVirtualBo = JdbcWritableBridge.readString(20, __dbResults);
    this.fblnAlert = JdbcWritableBridge.readInteger(21, __dbResults);
    this.fstrDocType = JdbcWritableBridge.readString(22, __dbResults);
    this.fintDocVer = JdbcWritableBridge.readInteger(23, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(24, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.fstrIndicator = JdbcWritableBridge.readString(1, __dbResults);
    this.fblnCustomerLevel = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fblnProfileLevel = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fblnAccountLevel = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fblnPeriodLevel = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fblnPeriodRequired = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fblnPeriodRange = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fblnManual = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fblnAmountAllowed = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fblnUserRequired = JdbcWritableBridge.readInteger(10, __dbResults);
    this.flngFunction = JdbcWritableBridge.readInteger(11, __dbResults);
    this.flngFunctionCease = JdbcWritableBridge.readInteger(12, __dbResults);
    this.flngAssignFunction = JdbcWritableBridge.readInteger(13, __dbResults);
    this.fblnCommentRequired = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fblnCommentCease = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fblnReasonRequired = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fblnHideAtCustomer = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fblnHideAtAccount = JdbcWritableBridge.readInteger(18, __dbResults);
    this.fblnHideAtPeriod = JdbcWritableBridge.readInteger(19, __dbResults);
    this.fstrVirtualBo = JdbcWritableBridge.readString(20, __dbResults);
    this.fblnAlert = JdbcWritableBridge.readInteger(21, __dbResults);
    this.fstrDocType = JdbcWritableBridge.readString(22, __dbResults);
    this.fintDocVer = JdbcWritableBridge.readInteger(23, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(24, __dbResults);
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
    JdbcWritableBridge.writeString(fstrIndicator, 1 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCustomerLevel, 2 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnProfileLevel, 3 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAccountLevel, 4 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPeriodLevel, 5 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPeriodRequired, 6 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPeriodRange, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnManual, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAmountAllowed, 9 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnUserRequired, 10 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFunction, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFunctionCease, 12 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAssignFunction, 13 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCommentRequired, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCommentCease, 15 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnReasonRequired, 16 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnHideAtCustomer, 17 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnHideAtAccount, 18 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnHideAtPeriod, 19 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrVirtualBo, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAlert, 21 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrDocType, 22 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintDocVer, 23 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 24 + __off, -6, __dbStmt);
    return 24;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(fstrIndicator, 1 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCustomerLevel, 2 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnProfileLevel, 3 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAccountLevel, 4 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPeriodLevel, 5 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPeriodRequired, 6 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPeriodRange, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnManual, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAmountAllowed, 9 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnUserRequired, 10 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFunction, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFunctionCease, 12 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAssignFunction, 13 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCommentRequired, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCommentCease, 15 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnReasonRequired, 16 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnHideAtCustomer, 17 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnHideAtAccount, 18 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnHideAtPeriod, 19 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrVirtualBo, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAlert, 21 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrDocType, 22 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintDocVer, 23 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 24 + __off, -6, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.fstrIndicator = null;
    } else {
    this.fstrIndicator = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnCustomerLevel = null;
    } else {
    this.fblnCustomerLevel = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnProfileLevel = null;
    } else {
    this.fblnProfileLevel = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnAccountLevel = null;
    } else {
    this.fblnAccountLevel = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnPeriodLevel = null;
    } else {
    this.fblnPeriodLevel = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnPeriodRequired = null;
    } else {
    this.fblnPeriodRequired = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnPeriodRange = null;
    } else {
    this.fblnPeriodRange = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnManual = null;
    } else {
    this.fblnManual = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnAmountAllowed = null;
    } else {
    this.fblnAmountAllowed = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnUserRequired = null;
    } else {
    this.fblnUserRequired = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngFunction = null;
    } else {
    this.flngFunction = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngFunctionCease = null;
    } else {
    this.flngFunctionCease = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngAssignFunction = null;
    } else {
    this.flngAssignFunction = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnCommentRequired = null;
    } else {
    this.fblnCommentRequired = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnCommentCease = null;
    } else {
    this.fblnCommentCease = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnReasonRequired = null;
    } else {
    this.fblnReasonRequired = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnHideAtCustomer = null;
    } else {
    this.fblnHideAtCustomer = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnHideAtAccount = null;
    } else {
    this.fblnHideAtAccount = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnHideAtPeriod = null;
    } else {
    this.fblnHideAtPeriod = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrVirtualBo = null;
    } else {
    this.fstrVirtualBo = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnAlert = null;
    } else {
    this.fblnAlert = Integer.valueOf(__dataIn.readInt());
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
        this.fblnActive = null;
    } else {
    this.fblnActive = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.fstrIndicator) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIndicator);
    }
    if (null == this.fblnCustomerLevel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCustomerLevel);
    }
    if (null == this.fblnProfileLevel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnProfileLevel);
    }
    if (null == this.fblnAccountLevel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAccountLevel);
    }
    if (null == this.fblnPeriodLevel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPeriodLevel);
    }
    if (null == this.fblnPeriodRequired) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPeriodRequired);
    }
    if (null == this.fblnPeriodRange) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPeriodRange);
    }
    if (null == this.fblnManual) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnManual);
    }
    if (null == this.fblnAmountAllowed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAmountAllowed);
    }
    if (null == this.fblnUserRequired) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnUserRequired);
    }
    if (null == this.flngFunction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFunction);
    }
    if (null == this.flngFunctionCease) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFunctionCease);
    }
    if (null == this.flngAssignFunction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAssignFunction);
    }
    if (null == this.fblnCommentRequired) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCommentRequired);
    }
    if (null == this.fblnCommentCease) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCommentCease);
    }
    if (null == this.fblnReasonRequired) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnReasonRequired);
    }
    if (null == this.fblnHideAtCustomer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnHideAtCustomer);
    }
    if (null == this.fblnHideAtAccount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnHideAtAccount);
    }
    if (null == this.fblnHideAtPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnHideAtPeriod);
    }
    if (null == this.fstrVirtualBo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrVirtualBo);
    }
    if (null == this.fblnAlert) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAlert);
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
    if (null == this.fblnActive) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnActive);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.fstrIndicator) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIndicator);
    }
    if (null == this.fblnCustomerLevel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCustomerLevel);
    }
    if (null == this.fblnProfileLevel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnProfileLevel);
    }
    if (null == this.fblnAccountLevel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAccountLevel);
    }
    if (null == this.fblnPeriodLevel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPeriodLevel);
    }
    if (null == this.fblnPeriodRequired) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPeriodRequired);
    }
    if (null == this.fblnPeriodRange) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPeriodRange);
    }
    if (null == this.fblnManual) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnManual);
    }
    if (null == this.fblnAmountAllowed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAmountAllowed);
    }
    if (null == this.fblnUserRequired) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnUserRequired);
    }
    if (null == this.flngFunction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFunction);
    }
    if (null == this.flngFunctionCease) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFunctionCease);
    }
    if (null == this.flngAssignFunction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAssignFunction);
    }
    if (null == this.fblnCommentRequired) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCommentRequired);
    }
    if (null == this.fblnCommentCease) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCommentCease);
    }
    if (null == this.fblnReasonRequired) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnReasonRequired);
    }
    if (null == this.fblnHideAtCustomer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnHideAtCustomer);
    }
    if (null == this.fblnHideAtAccount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnHideAtAccount);
    }
    if (null == this.fblnHideAtPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnHideAtPeriod);
    }
    if (null == this.fstrVirtualBo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrVirtualBo);
    }
    if (null == this.fblnAlert) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAlert);
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
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIndicator==null?"\\N":fstrIndicator, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCustomerLevel==null?"\\N":"" + fblnCustomerLevel, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnProfileLevel==null?"\\N":"" + fblnProfileLevel, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAccountLevel==null?"\\N":"" + fblnAccountLevel, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPeriodLevel==null?"\\N":"" + fblnPeriodLevel, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPeriodRequired==null?"\\N":"" + fblnPeriodRequired, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPeriodRange==null?"\\N":"" + fblnPeriodRange, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnManual==null?"\\N":"" + fblnManual, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAmountAllowed==null?"\\N":"" + fblnAmountAllowed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnUserRequired==null?"\\N":"" + fblnUserRequired, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFunction==null?"\\N":"" + flngFunction, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFunctionCease==null?"\\N":"" + flngFunctionCease, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAssignFunction==null?"\\N":"" + flngAssignFunction, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCommentRequired==null?"\\N":"" + fblnCommentRequired, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCommentCease==null?"\\N":"" + fblnCommentCease, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnReasonRequired==null?"\\N":"" + fblnReasonRequired, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnHideAtCustomer==null?"\\N":"" + fblnHideAtCustomer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnHideAtAccount==null?"\\N":"" + fblnHideAtAccount, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnHideAtPeriod==null?"\\N":"" + fblnHideAtPeriod, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrVirtualBo==null?"\\N":fstrVirtualBo, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAlert==null?"\\N":"" + fblnAlert, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDocType==null?"\\N":fstrDocType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintDocVer==null?"\\N":"" + fintDocVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnActive==null?"\\N":"" + fblnActive, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIndicator==null?"\\N":fstrIndicator, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCustomerLevel==null?"\\N":"" + fblnCustomerLevel, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnProfileLevel==null?"\\N":"" + fblnProfileLevel, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAccountLevel==null?"\\N":"" + fblnAccountLevel, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPeriodLevel==null?"\\N":"" + fblnPeriodLevel, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPeriodRequired==null?"\\N":"" + fblnPeriodRequired, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPeriodRange==null?"\\N":"" + fblnPeriodRange, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnManual==null?"\\N":"" + fblnManual, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAmountAllowed==null?"\\N":"" + fblnAmountAllowed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnUserRequired==null?"\\N":"" + fblnUserRequired, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFunction==null?"\\N":"" + flngFunction, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFunctionCease==null?"\\N":"" + flngFunctionCease, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAssignFunction==null?"\\N":"" + flngAssignFunction, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCommentRequired==null?"\\N":"" + fblnCommentRequired, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCommentCease==null?"\\N":"" + fblnCommentCease, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnReasonRequired==null?"\\N":"" + fblnReasonRequired, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnHideAtCustomer==null?"\\N":"" + fblnHideAtCustomer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnHideAtAccount==null?"\\N":"" + fblnHideAtAccount, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnHideAtPeriod==null?"\\N":"" + fblnHideAtPeriod, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrVirtualBo==null?"\\N":fstrVirtualBo, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAlert==null?"\\N":"" + fblnAlert, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDocType==null?"\\N":fstrDocType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintDocVer==null?"\\N":"" + fintDocVer, delimiters));
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
    if (__cur_str.equals("null")) { this.fstrIndicator = null; } else {
      this.fstrIndicator = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCustomerLevel = null; } else {
      this.fblnCustomerLevel = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnProfileLevel = null; } else {
      this.fblnProfileLevel = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAccountLevel = null; } else {
      this.fblnAccountLevel = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPeriodLevel = null; } else {
      this.fblnPeriodLevel = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPeriodRange = null; } else {
      this.fblnPeriodRange = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnManual = null; } else {
      this.fblnManual = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAmountAllowed = null; } else {
      this.fblnAmountAllowed = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnUserRequired = null; } else {
      this.fblnUserRequired = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFunction = null; } else {
      this.flngFunction = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFunctionCease = null; } else {
      this.flngFunctionCease = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCommentRequired = null; } else {
      this.fblnCommentRequired = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCommentCease = null; } else {
      this.fblnCommentCease = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnReasonRequired = null; } else {
      this.fblnReasonRequired = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnHideAtCustomer = null; } else {
      this.fblnHideAtCustomer = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnHideAtAccount = null; } else {
      this.fblnHideAtAccount = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnHideAtPeriod = null; } else {
      this.fblnHideAtPeriod = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrVirtualBo = null; } else {
      this.fstrVirtualBo = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAlert = null; } else {
      this.fblnAlert = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrIndicator = null; } else {
      this.fstrIndicator = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCustomerLevel = null; } else {
      this.fblnCustomerLevel = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnProfileLevel = null; } else {
      this.fblnProfileLevel = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAccountLevel = null; } else {
      this.fblnAccountLevel = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPeriodLevel = null; } else {
      this.fblnPeriodLevel = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPeriodRange = null; } else {
      this.fblnPeriodRange = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnManual = null; } else {
      this.fblnManual = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAmountAllowed = null; } else {
      this.fblnAmountAllowed = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnUserRequired = null; } else {
      this.fblnUserRequired = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFunction = null; } else {
      this.flngFunction = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFunctionCease = null; } else {
      this.flngFunctionCease = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCommentRequired = null; } else {
      this.fblnCommentRequired = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCommentCease = null; } else {
      this.fblnCommentCease = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnReasonRequired = null; } else {
      this.fblnReasonRequired = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnHideAtCustomer = null; } else {
      this.fblnHideAtCustomer = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnHideAtAccount = null; } else {
      this.fblnHideAtAccount = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnHideAtPeriod = null; } else {
      this.fblnHideAtPeriod = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrVirtualBo = null; } else {
      this.fstrVirtualBo = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAlert = null; } else {
      this.fblnAlert = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnActive = null; } else {
      this.fblnActive = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    rfrindicator o = (rfrindicator) super.clone();
    return o;
  }

  public void clone0(rfrindicator o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("fstrIndicator", this.fstrIndicator);
    __sqoop$field_map.put("fblnCustomerLevel", this.fblnCustomerLevel);
    __sqoop$field_map.put("fblnProfileLevel", this.fblnProfileLevel);
    __sqoop$field_map.put("fblnAccountLevel", this.fblnAccountLevel);
    __sqoop$field_map.put("fblnPeriodLevel", this.fblnPeriodLevel);
    __sqoop$field_map.put("fblnPeriodRequired", this.fblnPeriodRequired);
    __sqoop$field_map.put("fblnPeriodRange", this.fblnPeriodRange);
    __sqoop$field_map.put("fblnManual", this.fblnManual);
    __sqoop$field_map.put("fblnAmountAllowed", this.fblnAmountAllowed);
    __sqoop$field_map.put("fblnUserRequired", this.fblnUserRequired);
    __sqoop$field_map.put("flngFunction", this.flngFunction);
    __sqoop$field_map.put("flngFunctionCease", this.flngFunctionCease);
    __sqoop$field_map.put("flngAssignFunction", this.flngAssignFunction);
    __sqoop$field_map.put("fblnCommentRequired", this.fblnCommentRequired);
    __sqoop$field_map.put("fblnCommentCease", this.fblnCommentCease);
    __sqoop$field_map.put("fblnReasonRequired", this.fblnReasonRequired);
    __sqoop$field_map.put("fblnHideAtCustomer", this.fblnHideAtCustomer);
    __sqoop$field_map.put("fblnHideAtAccount", this.fblnHideAtAccount);
    __sqoop$field_map.put("fblnHideAtPeriod", this.fblnHideAtPeriod);
    __sqoop$field_map.put("fstrVirtualBo", this.fstrVirtualBo);
    __sqoop$field_map.put("fblnAlert", this.fblnAlert);
    __sqoop$field_map.put("fstrDocType", this.fstrDocType);
    __sqoop$field_map.put("fintDocVer", this.fintDocVer);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("fstrIndicator", this.fstrIndicator);
    __sqoop$field_map.put("fblnCustomerLevel", this.fblnCustomerLevel);
    __sqoop$field_map.put("fblnProfileLevel", this.fblnProfileLevel);
    __sqoop$field_map.put("fblnAccountLevel", this.fblnAccountLevel);
    __sqoop$field_map.put("fblnPeriodLevel", this.fblnPeriodLevel);
    __sqoop$field_map.put("fblnPeriodRequired", this.fblnPeriodRequired);
    __sqoop$field_map.put("fblnPeriodRange", this.fblnPeriodRange);
    __sqoop$field_map.put("fblnManual", this.fblnManual);
    __sqoop$field_map.put("fblnAmountAllowed", this.fblnAmountAllowed);
    __sqoop$field_map.put("fblnUserRequired", this.fblnUserRequired);
    __sqoop$field_map.put("flngFunction", this.flngFunction);
    __sqoop$field_map.put("flngFunctionCease", this.flngFunctionCease);
    __sqoop$field_map.put("flngAssignFunction", this.flngAssignFunction);
    __sqoop$field_map.put("fblnCommentRequired", this.fblnCommentRequired);
    __sqoop$field_map.put("fblnCommentCease", this.fblnCommentCease);
    __sqoop$field_map.put("fblnReasonRequired", this.fblnReasonRequired);
    __sqoop$field_map.put("fblnHideAtCustomer", this.fblnHideAtCustomer);
    __sqoop$field_map.put("fblnHideAtAccount", this.fblnHideAtAccount);
    __sqoop$field_map.put("fblnHideAtPeriod", this.fblnHideAtPeriod);
    __sqoop$field_map.put("fstrVirtualBo", this.fstrVirtualBo);
    __sqoop$field_map.put("fblnAlert", this.fblnAlert);
    __sqoop$field_map.put("fstrDocType", this.fstrDocType);
    __sqoop$field_map.put("fintDocVer", this.fintDocVer);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
