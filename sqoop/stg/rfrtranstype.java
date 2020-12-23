// ORM class for table 'rfrtranstype'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 00:27:33 NZDT 2020
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

public class rfrtranstype extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("fstrTransType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrtranstype.this.fstrTransType = (String)value;
      }
    });
    setters.put("fstrCriteria", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrtranstype.this.fstrCriteria = (String)value;
      }
    });
    setters.put("fstrTransCategory", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrtranstype.this.fstrTransCategory = (String)value;
      }
    });
    setters.put("fblnLinkRequired", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrtranstype.this.fblnLinkRequired = (Integer)value;
      }
    });
    setters.put("fblnManualPost", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrtranstype.this.fblnManualPost = (Integer)value;
      }
    });
    setters.put("fblnIsReversal", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrtranstype.this.fblnIsReversal = (Integer)value;
      }
    });
    setters.put("fblnIsCredit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrtranstype.this.fblnIsCredit = (Integer)value;
      }
    });
    setters.put("fblnIsWaiver", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrtranstype.this.fblnIsWaiver = (Integer)value;
      }
    });
    setters.put("fblnPayment", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrtranstype.this.fblnPayment = (Integer)value;
      }
    });
    setters.put("fblnReturn", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrtranstype.this.fblnReturn = (Integer)value;
      }
    });
    setters.put("fblnTax", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrtranstype.this.fblnTax = (Integer)value;
      }
    });
    setters.put("fstrDetail", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrtranstype.this.fstrDetail = (String)value;
      }
    });
    setters.put("fstrPeriodImpact", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrtranstype.this.fstrPeriodImpact = (String)value;
      }
    });
    setters.put("fblnPeriodActivity", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrtranstype.this.fblnPeriodActivity = (Integer)value;
      }
    });
    setters.put("fstrLockType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrtranstype.this.fstrLockType = (String)value;
      }
    });
    setters.put("fblnLocking", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrtranstype.this.fblnLocking = (Integer)value;
      }
    });
    setters.put("fstrLockTransType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrtranstype.this.fstrLockTransType = (String)value;
      }
    });
    setters.put("fcurTransWOMin", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrtranstype.this.fcurTransWOMin = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTransWOMax", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrtranstype.this.fcurTransWOMax = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPeriodWOMin", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrtranstype.this.fcurPeriodWOMin = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPeriodWOMax", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrtranstype.this.fcurPeriodWOMax = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrTransTypeSBA", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrtranstype.this.fstrTransTypeSBA = (String)value;
      }
    });
    setters.put("fstrTransTypeWO", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrtranstype.this.fstrTransTypeWO = (String)value;
      }
    });
    setters.put("fstrTransTypeWaiver", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrtranstype.this.fstrTransTypeWaiver = (String)value;
      }
    });
    setters.put("fstrTransTypeProtest", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrtranstype.this.fstrTransTypeProtest = (String)value;
      }
    });
    setters.put("fstrTransTypeAdjust", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrtranstype.this.fstrTransTypeAdjust = (String)value;
      }
    });
    setters.put("fstrTransTypeReverse", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrtranstype.this.fstrTransTypeReverse = (String)value;
      }
    });
    setters.put("fstrTransTypeReverseSys", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrtranstype.this.fstrTransTypeReverseSys = (String)value;
      }
    });
    setters.put("fstrTransTypeWoSys", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrtranstype.this.fstrTransTypeWoSys = (String)value;
      }
    });
    setters.put("fstrTransTypeRefundACH", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrtranstype.this.fstrTransTypeRefundACH = (String)value;
      }
    });
    setters.put("fstrTransTypeRefundCheck", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrtranstype.this.fstrTransTypeRefundCheck = (String)value;
      }
    });
    setters.put("fstrTransTypeExcessRefund", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrtranstype.this.fstrTransTypeExcessRefund = (String)value;
      }
    });
    setters.put("fblnExcessRfnOnRunDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrtranstype.this.fblnExcessRfnOnRunDate = (Integer)value;
      }
    });
    setters.put("fstrOffsetGroup", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrtranstype.this.fstrOffsetGroup = (String)value;
      }
    });
    setters.put("fstrSourceRAType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrtranstype.this.fstrSourceRAType = (String)value;
      }
    });
    setters.put("fstrDestRAType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrtranstype.this.fstrDestRAType = (String)value;
      }
    });
    setters.put("fstrReverseRAType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrtranstype.this.fstrReverseRAType = (String)value;
      }
    });
    setters.put("fstrPeriodTransferRAType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrtranstype.this.fstrPeriodTransferRAType = (String)value;
      }
    });
    setters.put("fstrCreditTransferRAType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrtranstype.this.fstrCreditTransferRAType = (String)value;
      }
    });
    setters.put("fblnStrongLink", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrtranstype.this.fblnStrongLink = (Integer)value;
      }
    });
    setters.put("fblnEffectChange", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrtranstype.this.fblnEffectChange = (Integer)value;
      }
    });
    setters.put("fblnAllowGeneralOffset", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrtranstype.this.fblnAllowGeneralOffset = (Integer)value;
      }
    });
    setters.put("fblnTransferTrans", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrtranstype.this.fblnTransferTrans = (Integer)value;
      }
    });
    setters.put("fblnBillItemIfCredit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrtranstype.this.fblnBillItemIfCredit = (Integer)value;
      }
    });
    setters.put("fblnBillItemIfZero", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrtranstype.this.fblnBillItemIfZero = (Integer)value;
      }
    });
    setters.put("fblnInformational", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrtranstype.this.fblnInformational = (Integer)value;
      }
    });
    setters.put("fblnRecovery", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrtranstype.this.fblnRecovery = (Integer)value;
      }
    });
    setters.put("fstrLinkTag", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrtranstype.this.fstrLinkTag = (String)value;
      }
    });
    setters.put("fstrRevenuePrdCalc", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrtranstype.this.fstrRevenuePrdCalc = (String)value;
      }
    });
    setters.put("fstrPostProcessBo", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrtranstype.this.fstrPostProcessBo = (String)value;
      }
    });
    setters.put("fblnActive", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrtranstype.this.fblnActive = (Integer)value;
      }
    });
  }
  public rfrtranstype() {
    init0();
  }
  private String fstrTransType;
  public String get_fstrTransType() {
    return fstrTransType;
  }
  public void set_fstrTransType(String fstrTransType) {
    this.fstrTransType = fstrTransType;
  }
  public rfrtranstype with_fstrTransType(String fstrTransType) {
    this.fstrTransType = fstrTransType;
    return this;
  }
  private String fstrCriteria;
  public String get_fstrCriteria() {
    return fstrCriteria;
  }
  public void set_fstrCriteria(String fstrCriteria) {
    this.fstrCriteria = fstrCriteria;
  }
  public rfrtranstype with_fstrCriteria(String fstrCriteria) {
    this.fstrCriteria = fstrCriteria;
    return this;
  }
  private String fstrTransCategory;
  public String get_fstrTransCategory() {
    return fstrTransCategory;
  }
  public void set_fstrTransCategory(String fstrTransCategory) {
    this.fstrTransCategory = fstrTransCategory;
  }
  public rfrtranstype with_fstrTransCategory(String fstrTransCategory) {
    this.fstrTransCategory = fstrTransCategory;
    return this;
  }
  private Integer fblnLinkRequired;
  public Integer get_fblnLinkRequired() {
    return fblnLinkRequired;
  }
  public void set_fblnLinkRequired(Integer fblnLinkRequired) {
    this.fblnLinkRequired = fblnLinkRequired;
  }
  public rfrtranstype with_fblnLinkRequired(Integer fblnLinkRequired) {
    this.fblnLinkRequired = fblnLinkRequired;
    return this;
  }
  private Integer fblnManualPost;
  public Integer get_fblnManualPost() {
    return fblnManualPost;
  }
  public void set_fblnManualPost(Integer fblnManualPost) {
    this.fblnManualPost = fblnManualPost;
  }
  public rfrtranstype with_fblnManualPost(Integer fblnManualPost) {
    this.fblnManualPost = fblnManualPost;
    return this;
  }
  private Integer fblnIsReversal;
  public Integer get_fblnIsReversal() {
    return fblnIsReversal;
  }
  public void set_fblnIsReversal(Integer fblnIsReversal) {
    this.fblnIsReversal = fblnIsReversal;
  }
  public rfrtranstype with_fblnIsReversal(Integer fblnIsReversal) {
    this.fblnIsReversal = fblnIsReversal;
    return this;
  }
  private Integer fblnIsCredit;
  public Integer get_fblnIsCredit() {
    return fblnIsCredit;
  }
  public void set_fblnIsCredit(Integer fblnIsCredit) {
    this.fblnIsCredit = fblnIsCredit;
  }
  public rfrtranstype with_fblnIsCredit(Integer fblnIsCredit) {
    this.fblnIsCredit = fblnIsCredit;
    return this;
  }
  private Integer fblnIsWaiver;
  public Integer get_fblnIsWaiver() {
    return fblnIsWaiver;
  }
  public void set_fblnIsWaiver(Integer fblnIsWaiver) {
    this.fblnIsWaiver = fblnIsWaiver;
  }
  public rfrtranstype with_fblnIsWaiver(Integer fblnIsWaiver) {
    this.fblnIsWaiver = fblnIsWaiver;
    return this;
  }
  private Integer fblnPayment;
  public Integer get_fblnPayment() {
    return fblnPayment;
  }
  public void set_fblnPayment(Integer fblnPayment) {
    this.fblnPayment = fblnPayment;
  }
  public rfrtranstype with_fblnPayment(Integer fblnPayment) {
    this.fblnPayment = fblnPayment;
    return this;
  }
  private Integer fblnReturn;
  public Integer get_fblnReturn() {
    return fblnReturn;
  }
  public void set_fblnReturn(Integer fblnReturn) {
    this.fblnReturn = fblnReturn;
  }
  public rfrtranstype with_fblnReturn(Integer fblnReturn) {
    this.fblnReturn = fblnReturn;
    return this;
  }
  private Integer fblnTax;
  public Integer get_fblnTax() {
    return fblnTax;
  }
  public void set_fblnTax(Integer fblnTax) {
    this.fblnTax = fblnTax;
  }
  public rfrtranstype with_fblnTax(Integer fblnTax) {
    this.fblnTax = fblnTax;
    return this;
  }
  private String fstrDetail;
  public String get_fstrDetail() {
    return fstrDetail;
  }
  public void set_fstrDetail(String fstrDetail) {
    this.fstrDetail = fstrDetail;
  }
  public rfrtranstype with_fstrDetail(String fstrDetail) {
    this.fstrDetail = fstrDetail;
    return this;
  }
  private String fstrPeriodImpact;
  public String get_fstrPeriodImpact() {
    return fstrPeriodImpact;
  }
  public void set_fstrPeriodImpact(String fstrPeriodImpact) {
    this.fstrPeriodImpact = fstrPeriodImpact;
  }
  public rfrtranstype with_fstrPeriodImpact(String fstrPeriodImpact) {
    this.fstrPeriodImpact = fstrPeriodImpact;
    return this;
  }
  private Integer fblnPeriodActivity;
  public Integer get_fblnPeriodActivity() {
    return fblnPeriodActivity;
  }
  public void set_fblnPeriodActivity(Integer fblnPeriodActivity) {
    this.fblnPeriodActivity = fblnPeriodActivity;
  }
  public rfrtranstype with_fblnPeriodActivity(Integer fblnPeriodActivity) {
    this.fblnPeriodActivity = fblnPeriodActivity;
    return this;
  }
  private String fstrLockType;
  public String get_fstrLockType() {
    return fstrLockType;
  }
  public void set_fstrLockType(String fstrLockType) {
    this.fstrLockType = fstrLockType;
  }
  public rfrtranstype with_fstrLockType(String fstrLockType) {
    this.fstrLockType = fstrLockType;
    return this;
  }
  private Integer fblnLocking;
  public Integer get_fblnLocking() {
    return fblnLocking;
  }
  public void set_fblnLocking(Integer fblnLocking) {
    this.fblnLocking = fblnLocking;
  }
  public rfrtranstype with_fblnLocking(Integer fblnLocking) {
    this.fblnLocking = fblnLocking;
    return this;
  }
  private String fstrLockTransType;
  public String get_fstrLockTransType() {
    return fstrLockTransType;
  }
  public void set_fstrLockTransType(String fstrLockTransType) {
    this.fstrLockTransType = fstrLockTransType;
  }
  public rfrtranstype with_fstrLockTransType(String fstrLockTransType) {
    this.fstrLockTransType = fstrLockTransType;
    return this;
  }
  private java.math.BigDecimal fcurTransWOMin;
  public java.math.BigDecimal get_fcurTransWOMin() {
    return fcurTransWOMin;
  }
  public void set_fcurTransWOMin(java.math.BigDecimal fcurTransWOMin) {
    this.fcurTransWOMin = fcurTransWOMin;
  }
  public rfrtranstype with_fcurTransWOMin(java.math.BigDecimal fcurTransWOMin) {
    this.fcurTransWOMin = fcurTransWOMin;
    return this;
  }
  private java.math.BigDecimal fcurTransWOMax;
  public java.math.BigDecimal get_fcurTransWOMax() {
    return fcurTransWOMax;
  }
  public void set_fcurTransWOMax(java.math.BigDecimal fcurTransWOMax) {
    this.fcurTransWOMax = fcurTransWOMax;
  }
  public rfrtranstype with_fcurTransWOMax(java.math.BigDecimal fcurTransWOMax) {
    this.fcurTransWOMax = fcurTransWOMax;
    return this;
  }
  private java.math.BigDecimal fcurPeriodWOMin;
  public java.math.BigDecimal get_fcurPeriodWOMin() {
    return fcurPeriodWOMin;
  }
  public void set_fcurPeriodWOMin(java.math.BigDecimal fcurPeriodWOMin) {
    this.fcurPeriodWOMin = fcurPeriodWOMin;
  }
  public rfrtranstype with_fcurPeriodWOMin(java.math.BigDecimal fcurPeriodWOMin) {
    this.fcurPeriodWOMin = fcurPeriodWOMin;
    return this;
  }
  private java.math.BigDecimal fcurPeriodWOMax;
  public java.math.BigDecimal get_fcurPeriodWOMax() {
    return fcurPeriodWOMax;
  }
  public void set_fcurPeriodWOMax(java.math.BigDecimal fcurPeriodWOMax) {
    this.fcurPeriodWOMax = fcurPeriodWOMax;
  }
  public rfrtranstype with_fcurPeriodWOMax(java.math.BigDecimal fcurPeriodWOMax) {
    this.fcurPeriodWOMax = fcurPeriodWOMax;
    return this;
  }
  private String fstrTransTypeSBA;
  public String get_fstrTransTypeSBA() {
    return fstrTransTypeSBA;
  }
  public void set_fstrTransTypeSBA(String fstrTransTypeSBA) {
    this.fstrTransTypeSBA = fstrTransTypeSBA;
  }
  public rfrtranstype with_fstrTransTypeSBA(String fstrTransTypeSBA) {
    this.fstrTransTypeSBA = fstrTransTypeSBA;
    return this;
  }
  private String fstrTransTypeWO;
  public String get_fstrTransTypeWO() {
    return fstrTransTypeWO;
  }
  public void set_fstrTransTypeWO(String fstrTransTypeWO) {
    this.fstrTransTypeWO = fstrTransTypeWO;
  }
  public rfrtranstype with_fstrTransTypeWO(String fstrTransTypeWO) {
    this.fstrTransTypeWO = fstrTransTypeWO;
    return this;
  }
  private String fstrTransTypeWaiver;
  public String get_fstrTransTypeWaiver() {
    return fstrTransTypeWaiver;
  }
  public void set_fstrTransTypeWaiver(String fstrTransTypeWaiver) {
    this.fstrTransTypeWaiver = fstrTransTypeWaiver;
  }
  public rfrtranstype with_fstrTransTypeWaiver(String fstrTransTypeWaiver) {
    this.fstrTransTypeWaiver = fstrTransTypeWaiver;
    return this;
  }
  private String fstrTransTypeProtest;
  public String get_fstrTransTypeProtest() {
    return fstrTransTypeProtest;
  }
  public void set_fstrTransTypeProtest(String fstrTransTypeProtest) {
    this.fstrTransTypeProtest = fstrTransTypeProtest;
  }
  public rfrtranstype with_fstrTransTypeProtest(String fstrTransTypeProtest) {
    this.fstrTransTypeProtest = fstrTransTypeProtest;
    return this;
  }
  private String fstrTransTypeAdjust;
  public String get_fstrTransTypeAdjust() {
    return fstrTransTypeAdjust;
  }
  public void set_fstrTransTypeAdjust(String fstrTransTypeAdjust) {
    this.fstrTransTypeAdjust = fstrTransTypeAdjust;
  }
  public rfrtranstype with_fstrTransTypeAdjust(String fstrTransTypeAdjust) {
    this.fstrTransTypeAdjust = fstrTransTypeAdjust;
    return this;
  }
  private String fstrTransTypeReverse;
  public String get_fstrTransTypeReverse() {
    return fstrTransTypeReverse;
  }
  public void set_fstrTransTypeReverse(String fstrTransTypeReverse) {
    this.fstrTransTypeReverse = fstrTransTypeReverse;
  }
  public rfrtranstype with_fstrTransTypeReverse(String fstrTransTypeReverse) {
    this.fstrTransTypeReverse = fstrTransTypeReverse;
    return this;
  }
  private String fstrTransTypeReverseSys;
  public String get_fstrTransTypeReverseSys() {
    return fstrTransTypeReverseSys;
  }
  public void set_fstrTransTypeReverseSys(String fstrTransTypeReverseSys) {
    this.fstrTransTypeReverseSys = fstrTransTypeReverseSys;
  }
  public rfrtranstype with_fstrTransTypeReverseSys(String fstrTransTypeReverseSys) {
    this.fstrTransTypeReverseSys = fstrTransTypeReverseSys;
    return this;
  }
  private String fstrTransTypeWoSys;
  public String get_fstrTransTypeWoSys() {
    return fstrTransTypeWoSys;
  }
  public void set_fstrTransTypeWoSys(String fstrTransTypeWoSys) {
    this.fstrTransTypeWoSys = fstrTransTypeWoSys;
  }
  public rfrtranstype with_fstrTransTypeWoSys(String fstrTransTypeWoSys) {
    this.fstrTransTypeWoSys = fstrTransTypeWoSys;
    return this;
  }
  private String fstrTransTypeRefundACH;
  public String get_fstrTransTypeRefundACH() {
    return fstrTransTypeRefundACH;
  }
  public void set_fstrTransTypeRefundACH(String fstrTransTypeRefundACH) {
    this.fstrTransTypeRefundACH = fstrTransTypeRefundACH;
  }
  public rfrtranstype with_fstrTransTypeRefundACH(String fstrTransTypeRefundACH) {
    this.fstrTransTypeRefundACH = fstrTransTypeRefundACH;
    return this;
  }
  private String fstrTransTypeRefundCheck;
  public String get_fstrTransTypeRefundCheck() {
    return fstrTransTypeRefundCheck;
  }
  public void set_fstrTransTypeRefundCheck(String fstrTransTypeRefundCheck) {
    this.fstrTransTypeRefundCheck = fstrTransTypeRefundCheck;
  }
  public rfrtranstype with_fstrTransTypeRefundCheck(String fstrTransTypeRefundCheck) {
    this.fstrTransTypeRefundCheck = fstrTransTypeRefundCheck;
    return this;
  }
  private String fstrTransTypeExcessRefund;
  public String get_fstrTransTypeExcessRefund() {
    return fstrTransTypeExcessRefund;
  }
  public void set_fstrTransTypeExcessRefund(String fstrTransTypeExcessRefund) {
    this.fstrTransTypeExcessRefund = fstrTransTypeExcessRefund;
  }
  public rfrtranstype with_fstrTransTypeExcessRefund(String fstrTransTypeExcessRefund) {
    this.fstrTransTypeExcessRefund = fstrTransTypeExcessRefund;
    return this;
  }
  private Integer fblnExcessRfnOnRunDate;
  public Integer get_fblnExcessRfnOnRunDate() {
    return fblnExcessRfnOnRunDate;
  }
  public void set_fblnExcessRfnOnRunDate(Integer fblnExcessRfnOnRunDate) {
    this.fblnExcessRfnOnRunDate = fblnExcessRfnOnRunDate;
  }
  public rfrtranstype with_fblnExcessRfnOnRunDate(Integer fblnExcessRfnOnRunDate) {
    this.fblnExcessRfnOnRunDate = fblnExcessRfnOnRunDate;
    return this;
  }
  private String fstrOffsetGroup;
  public String get_fstrOffsetGroup() {
    return fstrOffsetGroup;
  }
  public void set_fstrOffsetGroup(String fstrOffsetGroup) {
    this.fstrOffsetGroup = fstrOffsetGroup;
  }
  public rfrtranstype with_fstrOffsetGroup(String fstrOffsetGroup) {
    this.fstrOffsetGroup = fstrOffsetGroup;
    return this;
  }
  private String fstrSourceRAType;
  public String get_fstrSourceRAType() {
    return fstrSourceRAType;
  }
  public void set_fstrSourceRAType(String fstrSourceRAType) {
    this.fstrSourceRAType = fstrSourceRAType;
  }
  public rfrtranstype with_fstrSourceRAType(String fstrSourceRAType) {
    this.fstrSourceRAType = fstrSourceRAType;
    return this;
  }
  private String fstrDestRAType;
  public String get_fstrDestRAType() {
    return fstrDestRAType;
  }
  public void set_fstrDestRAType(String fstrDestRAType) {
    this.fstrDestRAType = fstrDestRAType;
  }
  public rfrtranstype with_fstrDestRAType(String fstrDestRAType) {
    this.fstrDestRAType = fstrDestRAType;
    return this;
  }
  private String fstrReverseRAType;
  public String get_fstrReverseRAType() {
    return fstrReverseRAType;
  }
  public void set_fstrReverseRAType(String fstrReverseRAType) {
    this.fstrReverseRAType = fstrReverseRAType;
  }
  public rfrtranstype with_fstrReverseRAType(String fstrReverseRAType) {
    this.fstrReverseRAType = fstrReverseRAType;
    return this;
  }
  private String fstrPeriodTransferRAType;
  public String get_fstrPeriodTransferRAType() {
    return fstrPeriodTransferRAType;
  }
  public void set_fstrPeriodTransferRAType(String fstrPeriodTransferRAType) {
    this.fstrPeriodTransferRAType = fstrPeriodTransferRAType;
  }
  public rfrtranstype with_fstrPeriodTransferRAType(String fstrPeriodTransferRAType) {
    this.fstrPeriodTransferRAType = fstrPeriodTransferRAType;
    return this;
  }
  private String fstrCreditTransferRAType;
  public String get_fstrCreditTransferRAType() {
    return fstrCreditTransferRAType;
  }
  public void set_fstrCreditTransferRAType(String fstrCreditTransferRAType) {
    this.fstrCreditTransferRAType = fstrCreditTransferRAType;
  }
  public rfrtranstype with_fstrCreditTransferRAType(String fstrCreditTransferRAType) {
    this.fstrCreditTransferRAType = fstrCreditTransferRAType;
    return this;
  }
  private Integer fblnStrongLink;
  public Integer get_fblnStrongLink() {
    return fblnStrongLink;
  }
  public void set_fblnStrongLink(Integer fblnStrongLink) {
    this.fblnStrongLink = fblnStrongLink;
  }
  public rfrtranstype with_fblnStrongLink(Integer fblnStrongLink) {
    this.fblnStrongLink = fblnStrongLink;
    return this;
  }
  private Integer fblnEffectChange;
  public Integer get_fblnEffectChange() {
    return fblnEffectChange;
  }
  public void set_fblnEffectChange(Integer fblnEffectChange) {
    this.fblnEffectChange = fblnEffectChange;
  }
  public rfrtranstype with_fblnEffectChange(Integer fblnEffectChange) {
    this.fblnEffectChange = fblnEffectChange;
    return this;
  }
  private Integer fblnAllowGeneralOffset;
  public Integer get_fblnAllowGeneralOffset() {
    return fblnAllowGeneralOffset;
  }
  public void set_fblnAllowGeneralOffset(Integer fblnAllowGeneralOffset) {
    this.fblnAllowGeneralOffset = fblnAllowGeneralOffset;
  }
  public rfrtranstype with_fblnAllowGeneralOffset(Integer fblnAllowGeneralOffset) {
    this.fblnAllowGeneralOffset = fblnAllowGeneralOffset;
    return this;
  }
  private Integer fblnTransferTrans;
  public Integer get_fblnTransferTrans() {
    return fblnTransferTrans;
  }
  public void set_fblnTransferTrans(Integer fblnTransferTrans) {
    this.fblnTransferTrans = fblnTransferTrans;
  }
  public rfrtranstype with_fblnTransferTrans(Integer fblnTransferTrans) {
    this.fblnTransferTrans = fblnTransferTrans;
    return this;
  }
  private Integer fblnBillItemIfCredit;
  public Integer get_fblnBillItemIfCredit() {
    return fblnBillItemIfCredit;
  }
  public void set_fblnBillItemIfCredit(Integer fblnBillItemIfCredit) {
    this.fblnBillItemIfCredit = fblnBillItemIfCredit;
  }
  public rfrtranstype with_fblnBillItemIfCredit(Integer fblnBillItemIfCredit) {
    this.fblnBillItemIfCredit = fblnBillItemIfCredit;
    return this;
  }
  private Integer fblnBillItemIfZero;
  public Integer get_fblnBillItemIfZero() {
    return fblnBillItemIfZero;
  }
  public void set_fblnBillItemIfZero(Integer fblnBillItemIfZero) {
    this.fblnBillItemIfZero = fblnBillItemIfZero;
  }
  public rfrtranstype with_fblnBillItemIfZero(Integer fblnBillItemIfZero) {
    this.fblnBillItemIfZero = fblnBillItemIfZero;
    return this;
  }
  private Integer fblnInformational;
  public Integer get_fblnInformational() {
    return fblnInformational;
  }
  public void set_fblnInformational(Integer fblnInformational) {
    this.fblnInformational = fblnInformational;
  }
  public rfrtranstype with_fblnInformational(Integer fblnInformational) {
    this.fblnInformational = fblnInformational;
    return this;
  }
  private Integer fblnRecovery;
  public Integer get_fblnRecovery() {
    return fblnRecovery;
  }
  public void set_fblnRecovery(Integer fblnRecovery) {
    this.fblnRecovery = fblnRecovery;
  }
  public rfrtranstype with_fblnRecovery(Integer fblnRecovery) {
    this.fblnRecovery = fblnRecovery;
    return this;
  }
  private String fstrLinkTag;
  public String get_fstrLinkTag() {
    return fstrLinkTag;
  }
  public void set_fstrLinkTag(String fstrLinkTag) {
    this.fstrLinkTag = fstrLinkTag;
  }
  public rfrtranstype with_fstrLinkTag(String fstrLinkTag) {
    this.fstrLinkTag = fstrLinkTag;
    return this;
  }
  private String fstrRevenuePrdCalc;
  public String get_fstrRevenuePrdCalc() {
    return fstrRevenuePrdCalc;
  }
  public void set_fstrRevenuePrdCalc(String fstrRevenuePrdCalc) {
    this.fstrRevenuePrdCalc = fstrRevenuePrdCalc;
  }
  public rfrtranstype with_fstrRevenuePrdCalc(String fstrRevenuePrdCalc) {
    this.fstrRevenuePrdCalc = fstrRevenuePrdCalc;
    return this;
  }
  private String fstrPostProcessBo;
  public String get_fstrPostProcessBo() {
    return fstrPostProcessBo;
  }
  public void set_fstrPostProcessBo(String fstrPostProcessBo) {
    this.fstrPostProcessBo = fstrPostProcessBo;
  }
  public rfrtranstype with_fstrPostProcessBo(String fstrPostProcessBo) {
    this.fstrPostProcessBo = fstrPostProcessBo;
    return this;
  }
  private Integer fblnActive;
  public Integer get_fblnActive() {
    return fblnActive;
  }
  public void set_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
  }
  public rfrtranstype with_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof rfrtranstype)) {
      return false;
    }
    rfrtranstype that = (rfrtranstype) o;
    boolean equal = true;
    equal = equal && (this.fstrTransType == null ? that.fstrTransType == null : this.fstrTransType.equals(that.fstrTransType));
    equal = equal && (this.fstrCriteria == null ? that.fstrCriteria == null : this.fstrCriteria.equals(that.fstrCriteria));
    equal = equal && (this.fstrTransCategory == null ? that.fstrTransCategory == null : this.fstrTransCategory.equals(that.fstrTransCategory));
    equal = equal && (this.fblnLinkRequired == null ? that.fblnLinkRequired == null : this.fblnLinkRequired.equals(that.fblnLinkRequired));
    equal = equal && (this.fblnManualPost == null ? that.fblnManualPost == null : this.fblnManualPost.equals(that.fblnManualPost));
    equal = equal && (this.fblnIsReversal == null ? that.fblnIsReversal == null : this.fblnIsReversal.equals(that.fblnIsReversal));
    equal = equal && (this.fblnIsCredit == null ? that.fblnIsCredit == null : this.fblnIsCredit.equals(that.fblnIsCredit));
    equal = equal && (this.fblnIsWaiver == null ? that.fblnIsWaiver == null : this.fblnIsWaiver.equals(that.fblnIsWaiver));
    equal = equal && (this.fblnPayment == null ? that.fblnPayment == null : this.fblnPayment.equals(that.fblnPayment));
    equal = equal && (this.fblnReturn == null ? that.fblnReturn == null : this.fblnReturn.equals(that.fblnReturn));
    equal = equal && (this.fblnTax == null ? that.fblnTax == null : this.fblnTax.equals(that.fblnTax));
    equal = equal && (this.fstrDetail == null ? that.fstrDetail == null : this.fstrDetail.equals(that.fstrDetail));
    equal = equal && (this.fstrPeriodImpact == null ? that.fstrPeriodImpact == null : this.fstrPeriodImpact.equals(that.fstrPeriodImpact));
    equal = equal && (this.fblnPeriodActivity == null ? that.fblnPeriodActivity == null : this.fblnPeriodActivity.equals(that.fblnPeriodActivity));
    equal = equal && (this.fstrLockType == null ? that.fstrLockType == null : this.fstrLockType.equals(that.fstrLockType));
    equal = equal && (this.fblnLocking == null ? that.fblnLocking == null : this.fblnLocking.equals(that.fblnLocking));
    equal = equal && (this.fstrLockTransType == null ? that.fstrLockTransType == null : this.fstrLockTransType.equals(that.fstrLockTransType));
    equal = equal && (this.fcurTransWOMin == null ? that.fcurTransWOMin == null : this.fcurTransWOMin.equals(that.fcurTransWOMin));
    equal = equal && (this.fcurTransWOMax == null ? that.fcurTransWOMax == null : this.fcurTransWOMax.equals(that.fcurTransWOMax));
    equal = equal && (this.fcurPeriodWOMin == null ? that.fcurPeriodWOMin == null : this.fcurPeriodWOMin.equals(that.fcurPeriodWOMin));
    equal = equal && (this.fcurPeriodWOMax == null ? that.fcurPeriodWOMax == null : this.fcurPeriodWOMax.equals(that.fcurPeriodWOMax));
    equal = equal && (this.fstrTransTypeSBA == null ? that.fstrTransTypeSBA == null : this.fstrTransTypeSBA.equals(that.fstrTransTypeSBA));
    equal = equal && (this.fstrTransTypeWO == null ? that.fstrTransTypeWO == null : this.fstrTransTypeWO.equals(that.fstrTransTypeWO));
    equal = equal && (this.fstrTransTypeWaiver == null ? that.fstrTransTypeWaiver == null : this.fstrTransTypeWaiver.equals(that.fstrTransTypeWaiver));
    equal = equal && (this.fstrTransTypeProtest == null ? that.fstrTransTypeProtest == null : this.fstrTransTypeProtest.equals(that.fstrTransTypeProtest));
    equal = equal && (this.fstrTransTypeAdjust == null ? that.fstrTransTypeAdjust == null : this.fstrTransTypeAdjust.equals(that.fstrTransTypeAdjust));
    equal = equal && (this.fstrTransTypeReverse == null ? that.fstrTransTypeReverse == null : this.fstrTransTypeReverse.equals(that.fstrTransTypeReverse));
    equal = equal && (this.fstrTransTypeReverseSys == null ? that.fstrTransTypeReverseSys == null : this.fstrTransTypeReverseSys.equals(that.fstrTransTypeReverseSys));
    equal = equal && (this.fstrTransTypeWoSys == null ? that.fstrTransTypeWoSys == null : this.fstrTransTypeWoSys.equals(that.fstrTransTypeWoSys));
    equal = equal && (this.fstrTransTypeRefundACH == null ? that.fstrTransTypeRefundACH == null : this.fstrTransTypeRefundACH.equals(that.fstrTransTypeRefundACH));
    equal = equal && (this.fstrTransTypeRefundCheck == null ? that.fstrTransTypeRefundCheck == null : this.fstrTransTypeRefundCheck.equals(that.fstrTransTypeRefundCheck));
    equal = equal && (this.fstrTransTypeExcessRefund == null ? that.fstrTransTypeExcessRefund == null : this.fstrTransTypeExcessRefund.equals(that.fstrTransTypeExcessRefund));
    equal = equal && (this.fblnExcessRfnOnRunDate == null ? that.fblnExcessRfnOnRunDate == null : this.fblnExcessRfnOnRunDate.equals(that.fblnExcessRfnOnRunDate));
    equal = equal && (this.fstrOffsetGroup == null ? that.fstrOffsetGroup == null : this.fstrOffsetGroup.equals(that.fstrOffsetGroup));
    equal = equal && (this.fstrSourceRAType == null ? that.fstrSourceRAType == null : this.fstrSourceRAType.equals(that.fstrSourceRAType));
    equal = equal && (this.fstrDestRAType == null ? that.fstrDestRAType == null : this.fstrDestRAType.equals(that.fstrDestRAType));
    equal = equal && (this.fstrReverseRAType == null ? that.fstrReverseRAType == null : this.fstrReverseRAType.equals(that.fstrReverseRAType));
    equal = equal && (this.fstrPeriodTransferRAType == null ? that.fstrPeriodTransferRAType == null : this.fstrPeriodTransferRAType.equals(that.fstrPeriodTransferRAType));
    equal = equal && (this.fstrCreditTransferRAType == null ? that.fstrCreditTransferRAType == null : this.fstrCreditTransferRAType.equals(that.fstrCreditTransferRAType));
    equal = equal && (this.fblnStrongLink == null ? that.fblnStrongLink == null : this.fblnStrongLink.equals(that.fblnStrongLink));
    equal = equal && (this.fblnEffectChange == null ? that.fblnEffectChange == null : this.fblnEffectChange.equals(that.fblnEffectChange));
    equal = equal && (this.fblnAllowGeneralOffset == null ? that.fblnAllowGeneralOffset == null : this.fblnAllowGeneralOffset.equals(that.fblnAllowGeneralOffset));
    equal = equal && (this.fblnTransferTrans == null ? that.fblnTransferTrans == null : this.fblnTransferTrans.equals(that.fblnTransferTrans));
    equal = equal && (this.fblnBillItemIfCredit == null ? that.fblnBillItemIfCredit == null : this.fblnBillItemIfCredit.equals(that.fblnBillItemIfCredit));
    equal = equal && (this.fblnBillItemIfZero == null ? that.fblnBillItemIfZero == null : this.fblnBillItemIfZero.equals(that.fblnBillItemIfZero));
    equal = equal && (this.fblnInformational == null ? that.fblnInformational == null : this.fblnInformational.equals(that.fblnInformational));
    equal = equal && (this.fblnRecovery == null ? that.fblnRecovery == null : this.fblnRecovery.equals(that.fblnRecovery));
    equal = equal && (this.fstrLinkTag == null ? that.fstrLinkTag == null : this.fstrLinkTag.equals(that.fstrLinkTag));
    equal = equal && (this.fstrRevenuePrdCalc == null ? that.fstrRevenuePrdCalc == null : this.fstrRevenuePrdCalc.equals(that.fstrRevenuePrdCalc));
    equal = equal && (this.fstrPostProcessBo == null ? that.fstrPostProcessBo == null : this.fstrPostProcessBo.equals(that.fstrPostProcessBo));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof rfrtranstype)) {
      return false;
    }
    rfrtranstype that = (rfrtranstype) o;
    boolean equal = true;
    equal = equal && (this.fstrTransType == null ? that.fstrTransType == null : this.fstrTransType.equals(that.fstrTransType));
    equal = equal && (this.fstrCriteria == null ? that.fstrCriteria == null : this.fstrCriteria.equals(that.fstrCriteria));
    equal = equal && (this.fstrTransCategory == null ? that.fstrTransCategory == null : this.fstrTransCategory.equals(that.fstrTransCategory));
    equal = equal && (this.fblnLinkRequired == null ? that.fblnLinkRequired == null : this.fblnLinkRequired.equals(that.fblnLinkRequired));
    equal = equal && (this.fblnManualPost == null ? that.fblnManualPost == null : this.fblnManualPost.equals(that.fblnManualPost));
    equal = equal && (this.fblnIsReversal == null ? that.fblnIsReversal == null : this.fblnIsReversal.equals(that.fblnIsReversal));
    equal = equal && (this.fblnIsCredit == null ? that.fblnIsCredit == null : this.fblnIsCredit.equals(that.fblnIsCredit));
    equal = equal && (this.fblnIsWaiver == null ? that.fblnIsWaiver == null : this.fblnIsWaiver.equals(that.fblnIsWaiver));
    equal = equal && (this.fblnPayment == null ? that.fblnPayment == null : this.fblnPayment.equals(that.fblnPayment));
    equal = equal && (this.fblnReturn == null ? that.fblnReturn == null : this.fblnReturn.equals(that.fblnReturn));
    equal = equal && (this.fblnTax == null ? that.fblnTax == null : this.fblnTax.equals(that.fblnTax));
    equal = equal && (this.fstrDetail == null ? that.fstrDetail == null : this.fstrDetail.equals(that.fstrDetail));
    equal = equal && (this.fstrPeriodImpact == null ? that.fstrPeriodImpact == null : this.fstrPeriodImpact.equals(that.fstrPeriodImpact));
    equal = equal && (this.fblnPeriodActivity == null ? that.fblnPeriodActivity == null : this.fblnPeriodActivity.equals(that.fblnPeriodActivity));
    equal = equal && (this.fstrLockType == null ? that.fstrLockType == null : this.fstrLockType.equals(that.fstrLockType));
    equal = equal && (this.fblnLocking == null ? that.fblnLocking == null : this.fblnLocking.equals(that.fblnLocking));
    equal = equal && (this.fstrLockTransType == null ? that.fstrLockTransType == null : this.fstrLockTransType.equals(that.fstrLockTransType));
    equal = equal && (this.fcurTransWOMin == null ? that.fcurTransWOMin == null : this.fcurTransWOMin.equals(that.fcurTransWOMin));
    equal = equal && (this.fcurTransWOMax == null ? that.fcurTransWOMax == null : this.fcurTransWOMax.equals(that.fcurTransWOMax));
    equal = equal && (this.fcurPeriodWOMin == null ? that.fcurPeriodWOMin == null : this.fcurPeriodWOMin.equals(that.fcurPeriodWOMin));
    equal = equal && (this.fcurPeriodWOMax == null ? that.fcurPeriodWOMax == null : this.fcurPeriodWOMax.equals(that.fcurPeriodWOMax));
    equal = equal && (this.fstrTransTypeSBA == null ? that.fstrTransTypeSBA == null : this.fstrTransTypeSBA.equals(that.fstrTransTypeSBA));
    equal = equal && (this.fstrTransTypeWO == null ? that.fstrTransTypeWO == null : this.fstrTransTypeWO.equals(that.fstrTransTypeWO));
    equal = equal && (this.fstrTransTypeWaiver == null ? that.fstrTransTypeWaiver == null : this.fstrTransTypeWaiver.equals(that.fstrTransTypeWaiver));
    equal = equal && (this.fstrTransTypeProtest == null ? that.fstrTransTypeProtest == null : this.fstrTransTypeProtest.equals(that.fstrTransTypeProtest));
    equal = equal && (this.fstrTransTypeAdjust == null ? that.fstrTransTypeAdjust == null : this.fstrTransTypeAdjust.equals(that.fstrTransTypeAdjust));
    equal = equal && (this.fstrTransTypeReverse == null ? that.fstrTransTypeReverse == null : this.fstrTransTypeReverse.equals(that.fstrTransTypeReverse));
    equal = equal && (this.fstrTransTypeReverseSys == null ? that.fstrTransTypeReverseSys == null : this.fstrTransTypeReverseSys.equals(that.fstrTransTypeReverseSys));
    equal = equal && (this.fstrTransTypeWoSys == null ? that.fstrTransTypeWoSys == null : this.fstrTransTypeWoSys.equals(that.fstrTransTypeWoSys));
    equal = equal && (this.fstrTransTypeRefundACH == null ? that.fstrTransTypeRefundACH == null : this.fstrTransTypeRefundACH.equals(that.fstrTransTypeRefundACH));
    equal = equal && (this.fstrTransTypeRefundCheck == null ? that.fstrTransTypeRefundCheck == null : this.fstrTransTypeRefundCheck.equals(that.fstrTransTypeRefundCheck));
    equal = equal && (this.fstrTransTypeExcessRefund == null ? that.fstrTransTypeExcessRefund == null : this.fstrTransTypeExcessRefund.equals(that.fstrTransTypeExcessRefund));
    equal = equal && (this.fblnExcessRfnOnRunDate == null ? that.fblnExcessRfnOnRunDate == null : this.fblnExcessRfnOnRunDate.equals(that.fblnExcessRfnOnRunDate));
    equal = equal && (this.fstrOffsetGroup == null ? that.fstrOffsetGroup == null : this.fstrOffsetGroup.equals(that.fstrOffsetGroup));
    equal = equal && (this.fstrSourceRAType == null ? that.fstrSourceRAType == null : this.fstrSourceRAType.equals(that.fstrSourceRAType));
    equal = equal && (this.fstrDestRAType == null ? that.fstrDestRAType == null : this.fstrDestRAType.equals(that.fstrDestRAType));
    equal = equal && (this.fstrReverseRAType == null ? that.fstrReverseRAType == null : this.fstrReverseRAType.equals(that.fstrReverseRAType));
    equal = equal && (this.fstrPeriodTransferRAType == null ? that.fstrPeriodTransferRAType == null : this.fstrPeriodTransferRAType.equals(that.fstrPeriodTransferRAType));
    equal = equal && (this.fstrCreditTransferRAType == null ? that.fstrCreditTransferRAType == null : this.fstrCreditTransferRAType.equals(that.fstrCreditTransferRAType));
    equal = equal && (this.fblnStrongLink == null ? that.fblnStrongLink == null : this.fblnStrongLink.equals(that.fblnStrongLink));
    equal = equal && (this.fblnEffectChange == null ? that.fblnEffectChange == null : this.fblnEffectChange.equals(that.fblnEffectChange));
    equal = equal && (this.fblnAllowGeneralOffset == null ? that.fblnAllowGeneralOffset == null : this.fblnAllowGeneralOffset.equals(that.fblnAllowGeneralOffset));
    equal = equal && (this.fblnTransferTrans == null ? that.fblnTransferTrans == null : this.fblnTransferTrans.equals(that.fblnTransferTrans));
    equal = equal && (this.fblnBillItemIfCredit == null ? that.fblnBillItemIfCredit == null : this.fblnBillItemIfCredit.equals(that.fblnBillItemIfCredit));
    equal = equal && (this.fblnBillItemIfZero == null ? that.fblnBillItemIfZero == null : this.fblnBillItemIfZero.equals(that.fblnBillItemIfZero));
    equal = equal && (this.fblnInformational == null ? that.fblnInformational == null : this.fblnInformational.equals(that.fblnInformational));
    equal = equal && (this.fblnRecovery == null ? that.fblnRecovery == null : this.fblnRecovery.equals(that.fblnRecovery));
    equal = equal && (this.fstrLinkTag == null ? that.fstrLinkTag == null : this.fstrLinkTag.equals(that.fstrLinkTag));
    equal = equal && (this.fstrRevenuePrdCalc == null ? that.fstrRevenuePrdCalc == null : this.fstrRevenuePrdCalc.equals(that.fstrRevenuePrdCalc));
    equal = equal && (this.fstrPostProcessBo == null ? that.fstrPostProcessBo == null : this.fstrPostProcessBo.equals(that.fstrPostProcessBo));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.fstrTransType = JdbcWritableBridge.readString(1, __dbResults);
    this.fstrCriteria = JdbcWritableBridge.readString(2, __dbResults);
    this.fstrTransCategory = JdbcWritableBridge.readString(3, __dbResults);
    this.fblnLinkRequired = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fblnManualPost = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fblnIsReversal = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fblnIsCredit = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fblnIsWaiver = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fblnPayment = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fblnReturn = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fblnTax = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fstrDetail = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrPeriodImpact = JdbcWritableBridge.readString(13, __dbResults);
    this.fblnPeriodActivity = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fstrLockType = JdbcWritableBridge.readString(15, __dbResults);
    this.fblnLocking = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fstrLockTransType = JdbcWritableBridge.readString(17, __dbResults);
    this.fcurTransWOMin = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.fcurTransWOMax = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fcurPeriodWOMin = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.fcurPeriodWOMax = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fstrTransTypeSBA = JdbcWritableBridge.readString(22, __dbResults);
    this.fstrTransTypeWO = JdbcWritableBridge.readString(23, __dbResults);
    this.fstrTransTypeWaiver = JdbcWritableBridge.readString(24, __dbResults);
    this.fstrTransTypeProtest = JdbcWritableBridge.readString(25, __dbResults);
    this.fstrTransTypeAdjust = JdbcWritableBridge.readString(26, __dbResults);
    this.fstrTransTypeReverse = JdbcWritableBridge.readString(27, __dbResults);
    this.fstrTransTypeReverseSys = JdbcWritableBridge.readString(28, __dbResults);
    this.fstrTransTypeWoSys = JdbcWritableBridge.readString(29, __dbResults);
    this.fstrTransTypeRefundACH = JdbcWritableBridge.readString(30, __dbResults);
    this.fstrTransTypeRefundCheck = JdbcWritableBridge.readString(31, __dbResults);
    this.fstrTransTypeExcessRefund = JdbcWritableBridge.readString(32, __dbResults);
    this.fblnExcessRfnOnRunDate = JdbcWritableBridge.readInteger(33, __dbResults);
    this.fstrOffsetGroup = JdbcWritableBridge.readString(34, __dbResults);
    this.fstrSourceRAType = JdbcWritableBridge.readString(35, __dbResults);
    this.fstrDestRAType = JdbcWritableBridge.readString(36, __dbResults);
    this.fstrReverseRAType = JdbcWritableBridge.readString(37, __dbResults);
    this.fstrPeriodTransferRAType = JdbcWritableBridge.readString(38, __dbResults);
    this.fstrCreditTransferRAType = JdbcWritableBridge.readString(39, __dbResults);
    this.fblnStrongLink = JdbcWritableBridge.readInteger(40, __dbResults);
    this.fblnEffectChange = JdbcWritableBridge.readInteger(41, __dbResults);
    this.fblnAllowGeneralOffset = JdbcWritableBridge.readInteger(42, __dbResults);
    this.fblnTransferTrans = JdbcWritableBridge.readInteger(43, __dbResults);
    this.fblnBillItemIfCredit = JdbcWritableBridge.readInteger(44, __dbResults);
    this.fblnBillItemIfZero = JdbcWritableBridge.readInteger(45, __dbResults);
    this.fblnInformational = JdbcWritableBridge.readInteger(46, __dbResults);
    this.fblnRecovery = JdbcWritableBridge.readInteger(47, __dbResults);
    this.fstrLinkTag = JdbcWritableBridge.readString(48, __dbResults);
    this.fstrRevenuePrdCalc = JdbcWritableBridge.readString(49, __dbResults);
    this.fstrPostProcessBo = JdbcWritableBridge.readString(50, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(51, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.fstrTransType = JdbcWritableBridge.readString(1, __dbResults);
    this.fstrCriteria = JdbcWritableBridge.readString(2, __dbResults);
    this.fstrTransCategory = JdbcWritableBridge.readString(3, __dbResults);
    this.fblnLinkRequired = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fblnManualPost = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fblnIsReversal = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fblnIsCredit = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fblnIsWaiver = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fblnPayment = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fblnReturn = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fblnTax = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fstrDetail = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrPeriodImpact = JdbcWritableBridge.readString(13, __dbResults);
    this.fblnPeriodActivity = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fstrLockType = JdbcWritableBridge.readString(15, __dbResults);
    this.fblnLocking = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fstrLockTransType = JdbcWritableBridge.readString(17, __dbResults);
    this.fcurTransWOMin = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.fcurTransWOMax = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fcurPeriodWOMin = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.fcurPeriodWOMax = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fstrTransTypeSBA = JdbcWritableBridge.readString(22, __dbResults);
    this.fstrTransTypeWO = JdbcWritableBridge.readString(23, __dbResults);
    this.fstrTransTypeWaiver = JdbcWritableBridge.readString(24, __dbResults);
    this.fstrTransTypeProtest = JdbcWritableBridge.readString(25, __dbResults);
    this.fstrTransTypeAdjust = JdbcWritableBridge.readString(26, __dbResults);
    this.fstrTransTypeReverse = JdbcWritableBridge.readString(27, __dbResults);
    this.fstrTransTypeReverseSys = JdbcWritableBridge.readString(28, __dbResults);
    this.fstrTransTypeWoSys = JdbcWritableBridge.readString(29, __dbResults);
    this.fstrTransTypeRefundACH = JdbcWritableBridge.readString(30, __dbResults);
    this.fstrTransTypeRefundCheck = JdbcWritableBridge.readString(31, __dbResults);
    this.fstrTransTypeExcessRefund = JdbcWritableBridge.readString(32, __dbResults);
    this.fblnExcessRfnOnRunDate = JdbcWritableBridge.readInteger(33, __dbResults);
    this.fstrOffsetGroup = JdbcWritableBridge.readString(34, __dbResults);
    this.fstrSourceRAType = JdbcWritableBridge.readString(35, __dbResults);
    this.fstrDestRAType = JdbcWritableBridge.readString(36, __dbResults);
    this.fstrReverseRAType = JdbcWritableBridge.readString(37, __dbResults);
    this.fstrPeriodTransferRAType = JdbcWritableBridge.readString(38, __dbResults);
    this.fstrCreditTransferRAType = JdbcWritableBridge.readString(39, __dbResults);
    this.fblnStrongLink = JdbcWritableBridge.readInteger(40, __dbResults);
    this.fblnEffectChange = JdbcWritableBridge.readInteger(41, __dbResults);
    this.fblnAllowGeneralOffset = JdbcWritableBridge.readInteger(42, __dbResults);
    this.fblnTransferTrans = JdbcWritableBridge.readInteger(43, __dbResults);
    this.fblnBillItemIfCredit = JdbcWritableBridge.readInteger(44, __dbResults);
    this.fblnBillItemIfZero = JdbcWritableBridge.readInteger(45, __dbResults);
    this.fblnInformational = JdbcWritableBridge.readInteger(46, __dbResults);
    this.fblnRecovery = JdbcWritableBridge.readInteger(47, __dbResults);
    this.fstrLinkTag = JdbcWritableBridge.readString(48, __dbResults);
    this.fstrRevenuePrdCalc = JdbcWritableBridge.readString(49, __dbResults);
    this.fstrPostProcessBo = JdbcWritableBridge.readString(50, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(51, __dbResults);
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
    JdbcWritableBridge.writeString(fstrTransType, 1 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCriteria, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTransCategory, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnLinkRequired, 4 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnManualPost, 5 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnIsReversal, 6 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnIsCredit, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnIsWaiver, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPayment, 9 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnReturn, 10 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnTax, 11 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrDetail, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPeriodImpact, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPeriodActivity, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrLockType, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnLocking, 16 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrLockTransType, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTransWOMin, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTransWOMax, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPeriodWOMin, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPeriodWOMax, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrTransTypeSBA, 22 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTransTypeWO, 23 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTransTypeWaiver, 24 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTransTypeProtest, 25 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTransTypeAdjust, 26 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTransTypeReverse, 27 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTransTypeReverseSys, 28 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTransTypeWoSys, 29 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTransTypeRefundACH, 30 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTransTypeRefundCheck, 31 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTransTypeExcessRefund, 32 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnExcessRfnOnRunDate, 33 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrOffsetGroup, 34 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSourceRAType, 35 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDestRAType, 36 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrReverseRAType, 37 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPeriodTransferRAType, 38 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCreditTransferRAType, 39 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnStrongLink, 40 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnEffectChange, 41 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAllowGeneralOffset, 42 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnTransferTrans, 43 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnBillItemIfCredit, 44 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnBillItemIfZero, 45 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnInformational, 46 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnRecovery, 47 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrLinkTag, 48 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRevenuePrdCalc, 49 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPostProcessBo, 50 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 51 + __off, -6, __dbStmt);
    return 51;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(fstrTransType, 1 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCriteria, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTransCategory, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnLinkRequired, 4 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnManualPost, 5 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnIsReversal, 6 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnIsCredit, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnIsWaiver, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPayment, 9 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnReturn, 10 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnTax, 11 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrDetail, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPeriodImpact, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPeriodActivity, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrLockType, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnLocking, 16 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrLockTransType, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTransWOMin, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTransWOMax, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPeriodWOMin, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPeriodWOMax, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrTransTypeSBA, 22 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTransTypeWO, 23 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTransTypeWaiver, 24 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTransTypeProtest, 25 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTransTypeAdjust, 26 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTransTypeReverse, 27 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTransTypeReverseSys, 28 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTransTypeWoSys, 29 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTransTypeRefundACH, 30 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTransTypeRefundCheck, 31 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTransTypeExcessRefund, 32 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnExcessRfnOnRunDate, 33 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrOffsetGroup, 34 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSourceRAType, 35 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDestRAType, 36 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrReverseRAType, 37 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPeriodTransferRAType, 38 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCreditTransferRAType, 39 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnStrongLink, 40 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnEffectChange, 41 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAllowGeneralOffset, 42 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnTransferTrans, 43 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnBillItemIfCredit, 44 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnBillItemIfZero, 45 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnInformational, 46 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnRecovery, 47 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrLinkTag, 48 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRevenuePrdCalc, 49 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPostProcessBo, 50 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 51 + __off, -6, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.fstrTransType = null;
    } else {
    this.fstrTransType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCriteria = null;
    } else {
    this.fstrCriteria = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrTransCategory = null;
    } else {
    this.fstrTransCategory = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnLinkRequired = null;
    } else {
    this.fblnLinkRequired = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnManualPost = null;
    } else {
    this.fblnManualPost = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnIsReversal = null;
    } else {
    this.fblnIsReversal = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnIsCredit = null;
    } else {
    this.fblnIsCredit = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnIsWaiver = null;
    } else {
    this.fblnIsWaiver = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnPayment = null;
    } else {
    this.fblnPayment = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnReturn = null;
    } else {
    this.fblnReturn = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnTax = null;
    } else {
    this.fblnTax = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDetail = null;
    } else {
    this.fstrDetail = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPeriodImpact = null;
    } else {
    this.fstrPeriodImpact = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnPeriodActivity = null;
    } else {
    this.fblnPeriodActivity = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrLockType = null;
    } else {
    this.fstrLockType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnLocking = null;
    } else {
    this.fblnLocking = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrLockTransType = null;
    } else {
    this.fstrLockTransType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTransWOMin = null;
    } else {
    this.fcurTransWOMin = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTransWOMax = null;
    } else {
    this.fcurTransWOMax = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPeriodWOMin = null;
    } else {
    this.fcurPeriodWOMin = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPeriodWOMax = null;
    } else {
    this.fcurPeriodWOMax = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrTransTypeSBA = null;
    } else {
    this.fstrTransTypeSBA = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrTransTypeWO = null;
    } else {
    this.fstrTransTypeWO = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrTransTypeWaiver = null;
    } else {
    this.fstrTransTypeWaiver = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrTransTypeProtest = null;
    } else {
    this.fstrTransTypeProtest = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrTransTypeAdjust = null;
    } else {
    this.fstrTransTypeAdjust = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrTransTypeReverse = null;
    } else {
    this.fstrTransTypeReverse = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrTransTypeReverseSys = null;
    } else {
    this.fstrTransTypeReverseSys = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrTransTypeWoSys = null;
    } else {
    this.fstrTransTypeWoSys = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrTransTypeRefundACH = null;
    } else {
    this.fstrTransTypeRefundACH = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrTransTypeRefundCheck = null;
    } else {
    this.fstrTransTypeRefundCheck = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrTransTypeExcessRefund = null;
    } else {
    this.fstrTransTypeExcessRefund = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnExcessRfnOnRunDate = null;
    } else {
    this.fblnExcessRfnOnRunDate = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrOffsetGroup = null;
    } else {
    this.fstrOffsetGroup = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSourceRAType = null;
    } else {
    this.fstrSourceRAType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDestRAType = null;
    } else {
    this.fstrDestRAType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrReverseRAType = null;
    } else {
    this.fstrReverseRAType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPeriodTransferRAType = null;
    } else {
    this.fstrPeriodTransferRAType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCreditTransferRAType = null;
    } else {
    this.fstrCreditTransferRAType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnStrongLink = null;
    } else {
    this.fblnStrongLink = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnEffectChange = null;
    } else {
    this.fblnEffectChange = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnAllowGeneralOffset = null;
    } else {
    this.fblnAllowGeneralOffset = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnTransferTrans = null;
    } else {
    this.fblnTransferTrans = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnBillItemIfCredit = null;
    } else {
    this.fblnBillItemIfCredit = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnBillItemIfZero = null;
    } else {
    this.fblnBillItemIfZero = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnInformational = null;
    } else {
    this.fblnInformational = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnRecovery = null;
    } else {
    this.fblnRecovery = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrLinkTag = null;
    } else {
    this.fstrLinkTag = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRevenuePrdCalc = null;
    } else {
    this.fstrRevenuePrdCalc = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPostProcessBo = null;
    } else {
    this.fstrPostProcessBo = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnActive = null;
    } else {
    this.fblnActive = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.fstrTransType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTransType);
    }
    if (null == this.fstrCriteria) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCriteria);
    }
    if (null == this.fstrTransCategory) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTransCategory);
    }
    if (null == this.fblnLinkRequired) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnLinkRequired);
    }
    if (null == this.fblnManualPost) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnManualPost);
    }
    if (null == this.fblnIsReversal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnIsReversal);
    }
    if (null == this.fblnIsCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnIsCredit);
    }
    if (null == this.fblnIsWaiver) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnIsWaiver);
    }
    if (null == this.fblnPayment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPayment);
    }
    if (null == this.fblnReturn) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnReturn);
    }
    if (null == this.fblnTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnTax);
    }
    if (null == this.fstrDetail) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDetail);
    }
    if (null == this.fstrPeriodImpact) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPeriodImpact);
    }
    if (null == this.fblnPeriodActivity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPeriodActivity);
    }
    if (null == this.fstrLockType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLockType);
    }
    if (null == this.fblnLocking) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnLocking);
    }
    if (null == this.fstrLockTransType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLockTransType);
    }
    if (null == this.fcurTransWOMin) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTransWOMin, __dataOut);
    }
    if (null == this.fcurTransWOMax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTransWOMax, __dataOut);
    }
    if (null == this.fcurPeriodWOMin) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPeriodWOMin, __dataOut);
    }
    if (null == this.fcurPeriodWOMax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPeriodWOMax, __dataOut);
    }
    if (null == this.fstrTransTypeSBA) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTransTypeSBA);
    }
    if (null == this.fstrTransTypeWO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTransTypeWO);
    }
    if (null == this.fstrTransTypeWaiver) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTransTypeWaiver);
    }
    if (null == this.fstrTransTypeProtest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTransTypeProtest);
    }
    if (null == this.fstrTransTypeAdjust) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTransTypeAdjust);
    }
    if (null == this.fstrTransTypeReverse) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTransTypeReverse);
    }
    if (null == this.fstrTransTypeReverseSys) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTransTypeReverseSys);
    }
    if (null == this.fstrTransTypeWoSys) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTransTypeWoSys);
    }
    if (null == this.fstrTransTypeRefundACH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTransTypeRefundACH);
    }
    if (null == this.fstrTransTypeRefundCheck) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTransTypeRefundCheck);
    }
    if (null == this.fstrTransTypeExcessRefund) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTransTypeExcessRefund);
    }
    if (null == this.fblnExcessRfnOnRunDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnExcessRfnOnRunDate);
    }
    if (null == this.fstrOffsetGroup) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOffsetGroup);
    }
    if (null == this.fstrSourceRAType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSourceRAType);
    }
    if (null == this.fstrDestRAType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDestRAType);
    }
    if (null == this.fstrReverseRAType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrReverseRAType);
    }
    if (null == this.fstrPeriodTransferRAType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPeriodTransferRAType);
    }
    if (null == this.fstrCreditTransferRAType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCreditTransferRAType);
    }
    if (null == this.fblnStrongLink) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnStrongLink);
    }
    if (null == this.fblnEffectChange) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnEffectChange);
    }
    if (null == this.fblnAllowGeneralOffset) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAllowGeneralOffset);
    }
    if (null == this.fblnTransferTrans) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnTransferTrans);
    }
    if (null == this.fblnBillItemIfCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnBillItemIfCredit);
    }
    if (null == this.fblnBillItemIfZero) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnBillItemIfZero);
    }
    if (null == this.fblnInformational) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnInformational);
    }
    if (null == this.fblnRecovery) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnRecovery);
    }
    if (null == this.fstrLinkTag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLinkTag);
    }
    if (null == this.fstrRevenuePrdCalc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRevenuePrdCalc);
    }
    if (null == this.fstrPostProcessBo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPostProcessBo);
    }
    if (null == this.fblnActive) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnActive);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.fstrTransType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTransType);
    }
    if (null == this.fstrCriteria) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCriteria);
    }
    if (null == this.fstrTransCategory) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTransCategory);
    }
    if (null == this.fblnLinkRequired) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnLinkRequired);
    }
    if (null == this.fblnManualPost) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnManualPost);
    }
    if (null == this.fblnIsReversal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnIsReversal);
    }
    if (null == this.fblnIsCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnIsCredit);
    }
    if (null == this.fblnIsWaiver) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnIsWaiver);
    }
    if (null == this.fblnPayment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPayment);
    }
    if (null == this.fblnReturn) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnReturn);
    }
    if (null == this.fblnTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnTax);
    }
    if (null == this.fstrDetail) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDetail);
    }
    if (null == this.fstrPeriodImpact) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPeriodImpact);
    }
    if (null == this.fblnPeriodActivity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPeriodActivity);
    }
    if (null == this.fstrLockType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLockType);
    }
    if (null == this.fblnLocking) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnLocking);
    }
    if (null == this.fstrLockTransType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLockTransType);
    }
    if (null == this.fcurTransWOMin) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTransWOMin, __dataOut);
    }
    if (null == this.fcurTransWOMax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTransWOMax, __dataOut);
    }
    if (null == this.fcurPeriodWOMin) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPeriodWOMin, __dataOut);
    }
    if (null == this.fcurPeriodWOMax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPeriodWOMax, __dataOut);
    }
    if (null == this.fstrTransTypeSBA) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTransTypeSBA);
    }
    if (null == this.fstrTransTypeWO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTransTypeWO);
    }
    if (null == this.fstrTransTypeWaiver) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTransTypeWaiver);
    }
    if (null == this.fstrTransTypeProtest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTransTypeProtest);
    }
    if (null == this.fstrTransTypeAdjust) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTransTypeAdjust);
    }
    if (null == this.fstrTransTypeReverse) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTransTypeReverse);
    }
    if (null == this.fstrTransTypeReverseSys) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTransTypeReverseSys);
    }
    if (null == this.fstrTransTypeWoSys) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTransTypeWoSys);
    }
    if (null == this.fstrTransTypeRefundACH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTransTypeRefundACH);
    }
    if (null == this.fstrTransTypeRefundCheck) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTransTypeRefundCheck);
    }
    if (null == this.fstrTransTypeExcessRefund) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTransTypeExcessRefund);
    }
    if (null == this.fblnExcessRfnOnRunDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnExcessRfnOnRunDate);
    }
    if (null == this.fstrOffsetGroup) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOffsetGroup);
    }
    if (null == this.fstrSourceRAType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSourceRAType);
    }
    if (null == this.fstrDestRAType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDestRAType);
    }
    if (null == this.fstrReverseRAType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrReverseRAType);
    }
    if (null == this.fstrPeriodTransferRAType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPeriodTransferRAType);
    }
    if (null == this.fstrCreditTransferRAType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCreditTransferRAType);
    }
    if (null == this.fblnStrongLink) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnStrongLink);
    }
    if (null == this.fblnEffectChange) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnEffectChange);
    }
    if (null == this.fblnAllowGeneralOffset) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAllowGeneralOffset);
    }
    if (null == this.fblnTransferTrans) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnTransferTrans);
    }
    if (null == this.fblnBillItemIfCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnBillItemIfCredit);
    }
    if (null == this.fblnBillItemIfZero) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnBillItemIfZero);
    }
    if (null == this.fblnInformational) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnInformational);
    }
    if (null == this.fblnRecovery) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnRecovery);
    }
    if (null == this.fstrLinkTag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLinkTag);
    }
    if (null == this.fstrRevenuePrdCalc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRevenuePrdCalc);
    }
    if (null == this.fstrPostProcessBo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPostProcessBo);
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
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTransType==null?"\\N":fstrTransType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCriteria==null?"\\N":fstrCriteria, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTransCategory==null?"\\N":fstrTransCategory, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnLinkRequired==null?"\\N":"" + fblnLinkRequired, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnManualPost==null?"\\N":"" + fblnManualPost, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnIsReversal==null?"\\N":"" + fblnIsReversal, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnIsCredit==null?"\\N":"" + fblnIsCredit, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnIsWaiver==null?"\\N":"" + fblnIsWaiver, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPayment==null?"\\N":"" + fblnPayment, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnReturn==null?"\\N":"" + fblnReturn, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnTax==null?"\\N":"" + fblnTax, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDetail==null?"\\N":fstrDetail, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPeriodImpact==null?"\\N":fstrPeriodImpact, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPeriodActivity==null?"\\N":"" + fblnPeriodActivity, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLockType==null?"\\N":fstrLockType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnLocking==null?"\\N":"" + fblnLocking, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLockTransType==null?"\\N":fstrLockTransType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTransWOMin==null?"\\N":fcurTransWOMin.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTransWOMax==null?"\\N":fcurTransWOMax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPeriodWOMin==null?"\\N":fcurPeriodWOMin.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPeriodWOMax==null?"\\N":fcurPeriodWOMax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTransTypeSBA==null?"\\N":fstrTransTypeSBA, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTransTypeWO==null?"\\N":fstrTransTypeWO, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTransTypeWaiver==null?"\\N":fstrTransTypeWaiver, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTransTypeProtest==null?"\\N":fstrTransTypeProtest, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTransTypeAdjust==null?"\\N":fstrTransTypeAdjust, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTransTypeReverse==null?"\\N":fstrTransTypeReverse, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTransTypeReverseSys==null?"\\N":fstrTransTypeReverseSys, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTransTypeWoSys==null?"\\N":fstrTransTypeWoSys, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTransTypeRefundACH==null?"\\N":fstrTransTypeRefundACH, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTransTypeRefundCheck==null?"\\N":fstrTransTypeRefundCheck, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTransTypeExcessRefund==null?"\\N":fstrTransTypeExcessRefund, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnExcessRfnOnRunDate==null?"\\N":"" + fblnExcessRfnOnRunDate, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOffsetGroup==null?"\\N":fstrOffsetGroup, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSourceRAType==null?"\\N":fstrSourceRAType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDestRAType==null?"\\N":fstrDestRAType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrReverseRAType==null?"\\N":fstrReverseRAType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPeriodTransferRAType==null?"\\N":fstrPeriodTransferRAType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCreditTransferRAType==null?"\\N":fstrCreditTransferRAType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnStrongLink==null?"\\N":"" + fblnStrongLink, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnEffectChange==null?"\\N":"" + fblnEffectChange, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAllowGeneralOffset==null?"\\N":"" + fblnAllowGeneralOffset, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnTransferTrans==null?"\\N":"" + fblnTransferTrans, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnBillItemIfCredit==null?"\\N":"" + fblnBillItemIfCredit, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnBillItemIfZero==null?"\\N":"" + fblnBillItemIfZero, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnInformational==null?"\\N":"" + fblnInformational, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnRecovery==null?"\\N":"" + fblnRecovery, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLinkTag==null?"\\N":fstrLinkTag, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRevenuePrdCalc==null?"\\N":fstrRevenuePrdCalc, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPostProcessBo==null?"\\N":fstrPostProcessBo, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnActive==null?"\\N":"" + fblnActive, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTransType==null?"\\N":fstrTransType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCriteria==null?"\\N":fstrCriteria, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTransCategory==null?"\\N":fstrTransCategory, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnLinkRequired==null?"\\N":"" + fblnLinkRequired, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnManualPost==null?"\\N":"" + fblnManualPost, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnIsReversal==null?"\\N":"" + fblnIsReversal, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnIsCredit==null?"\\N":"" + fblnIsCredit, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnIsWaiver==null?"\\N":"" + fblnIsWaiver, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPayment==null?"\\N":"" + fblnPayment, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnReturn==null?"\\N":"" + fblnReturn, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnTax==null?"\\N":"" + fblnTax, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDetail==null?"\\N":fstrDetail, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPeriodImpact==null?"\\N":fstrPeriodImpact, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPeriodActivity==null?"\\N":"" + fblnPeriodActivity, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLockType==null?"\\N":fstrLockType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnLocking==null?"\\N":"" + fblnLocking, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLockTransType==null?"\\N":fstrLockTransType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTransWOMin==null?"\\N":fcurTransWOMin.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTransWOMax==null?"\\N":fcurTransWOMax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPeriodWOMin==null?"\\N":fcurPeriodWOMin.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPeriodWOMax==null?"\\N":fcurPeriodWOMax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTransTypeSBA==null?"\\N":fstrTransTypeSBA, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTransTypeWO==null?"\\N":fstrTransTypeWO, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTransTypeWaiver==null?"\\N":fstrTransTypeWaiver, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTransTypeProtest==null?"\\N":fstrTransTypeProtest, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTransTypeAdjust==null?"\\N":fstrTransTypeAdjust, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTransTypeReverse==null?"\\N":fstrTransTypeReverse, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTransTypeReverseSys==null?"\\N":fstrTransTypeReverseSys, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTransTypeWoSys==null?"\\N":fstrTransTypeWoSys, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTransTypeRefundACH==null?"\\N":fstrTransTypeRefundACH, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTransTypeRefundCheck==null?"\\N":fstrTransTypeRefundCheck, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTransTypeExcessRefund==null?"\\N":fstrTransTypeExcessRefund, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnExcessRfnOnRunDate==null?"\\N":"" + fblnExcessRfnOnRunDate, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOffsetGroup==null?"\\N":fstrOffsetGroup, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSourceRAType==null?"\\N":fstrSourceRAType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDestRAType==null?"\\N":fstrDestRAType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrReverseRAType==null?"\\N":fstrReverseRAType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPeriodTransferRAType==null?"\\N":fstrPeriodTransferRAType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCreditTransferRAType==null?"\\N":fstrCreditTransferRAType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnStrongLink==null?"\\N":"" + fblnStrongLink, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnEffectChange==null?"\\N":"" + fblnEffectChange, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAllowGeneralOffset==null?"\\N":"" + fblnAllowGeneralOffset, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnTransferTrans==null?"\\N":"" + fblnTransferTrans, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnBillItemIfCredit==null?"\\N":"" + fblnBillItemIfCredit, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnBillItemIfZero==null?"\\N":"" + fblnBillItemIfZero, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnInformational==null?"\\N":"" + fblnInformational, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnRecovery==null?"\\N":"" + fblnRecovery, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLinkTag==null?"\\N":fstrLinkTag, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRevenuePrdCalc==null?"\\N":fstrRevenuePrdCalc, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPostProcessBo==null?"\\N":fstrPostProcessBo, " ", delimiters));
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
    if (__cur_str.equals("null")) { this.fstrTransType = null; } else {
      this.fstrTransType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCriteria = null; } else {
      this.fstrCriteria = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTransCategory = null; } else {
      this.fstrTransCategory = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnLinkRequired = null; } else {
      this.fblnLinkRequired = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnManualPost = null; } else {
      this.fblnManualPost = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnIsReversal = null; } else {
      this.fblnIsReversal = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnIsCredit = null; } else {
      this.fblnIsCredit = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnIsWaiver = null; } else {
      this.fblnIsWaiver = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPayment = null; } else {
      this.fblnPayment = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnReturn = null; } else {
      this.fblnReturn = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnTax = null; } else {
      this.fblnTax = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDetail = null; } else {
      this.fstrDetail = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPeriodImpact = null; } else {
      this.fstrPeriodImpact = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPeriodActivity = null; } else {
      this.fblnPeriodActivity = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLockType = null; } else {
      this.fstrLockType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnLocking = null; } else {
      this.fblnLocking = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLockTransType = null; } else {
      this.fstrLockTransType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTransWOMin = null; } else {
      this.fcurTransWOMin = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTransWOMax = null; } else {
      this.fcurTransWOMax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPeriodWOMin = null; } else {
      this.fcurPeriodWOMin = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPeriodWOMax = null; } else {
      this.fcurPeriodWOMax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTransTypeSBA = null; } else {
      this.fstrTransTypeSBA = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTransTypeWO = null; } else {
      this.fstrTransTypeWO = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTransTypeWaiver = null; } else {
      this.fstrTransTypeWaiver = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTransTypeProtest = null; } else {
      this.fstrTransTypeProtest = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTransTypeAdjust = null; } else {
      this.fstrTransTypeAdjust = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTransTypeReverse = null; } else {
      this.fstrTransTypeReverse = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTransTypeReverseSys = null; } else {
      this.fstrTransTypeReverseSys = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTransTypeWoSys = null; } else {
      this.fstrTransTypeWoSys = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTransTypeRefundACH = null; } else {
      this.fstrTransTypeRefundACH = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTransTypeRefundCheck = null; } else {
      this.fstrTransTypeRefundCheck = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTransTypeExcessRefund = null; } else {
      this.fstrTransTypeExcessRefund = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnExcessRfnOnRunDate = null; } else {
      this.fblnExcessRfnOnRunDate = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOffsetGroup = null; } else {
      this.fstrOffsetGroup = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSourceRAType = null; } else {
      this.fstrSourceRAType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDestRAType = null; } else {
      this.fstrDestRAType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrReverseRAType = null; } else {
      this.fstrReverseRAType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPeriodTransferRAType = null; } else {
      this.fstrPeriodTransferRAType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCreditTransferRAType = null; } else {
      this.fstrCreditTransferRAType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnStrongLink = null; } else {
      this.fblnStrongLink = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnEffectChange = null; } else {
      this.fblnEffectChange = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAllowGeneralOffset = null; } else {
      this.fblnAllowGeneralOffset = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnTransferTrans = null; } else {
      this.fblnTransferTrans = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnBillItemIfCredit = null; } else {
      this.fblnBillItemIfCredit = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnBillItemIfZero = null; } else {
      this.fblnBillItemIfZero = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnInformational = null; } else {
      this.fblnInformational = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnRecovery = null; } else {
      this.fblnRecovery = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrRevenuePrdCalc = null; } else {
      this.fstrRevenuePrdCalc = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPostProcessBo = null; } else {
      this.fstrPostProcessBo = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrTransType = null; } else {
      this.fstrTransType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCriteria = null; } else {
      this.fstrCriteria = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTransCategory = null; } else {
      this.fstrTransCategory = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnLinkRequired = null; } else {
      this.fblnLinkRequired = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnManualPost = null; } else {
      this.fblnManualPost = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnIsReversal = null; } else {
      this.fblnIsReversal = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnIsCredit = null; } else {
      this.fblnIsCredit = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnIsWaiver = null; } else {
      this.fblnIsWaiver = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPayment = null; } else {
      this.fblnPayment = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnReturn = null; } else {
      this.fblnReturn = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnTax = null; } else {
      this.fblnTax = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDetail = null; } else {
      this.fstrDetail = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPeriodImpact = null; } else {
      this.fstrPeriodImpact = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPeriodActivity = null; } else {
      this.fblnPeriodActivity = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLockType = null; } else {
      this.fstrLockType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnLocking = null; } else {
      this.fblnLocking = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLockTransType = null; } else {
      this.fstrLockTransType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTransWOMin = null; } else {
      this.fcurTransWOMin = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTransWOMax = null; } else {
      this.fcurTransWOMax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPeriodWOMin = null; } else {
      this.fcurPeriodWOMin = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPeriodWOMax = null; } else {
      this.fcurPeriodWOMax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTransTypeSBA = null; } else {
      this.fstrTransTypeSBA = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTransTypeWO = null; } else {
      this.fstrTransTypeWO = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTransTypeWaiver = null; } else {
      this.fstrTransTypeWaiver = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTransTypeProtest = null; } else {
      this.fstrTransTypeProtest = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTransTypeAdjust = null; } else {
      this.fstrTransTypeAdjust = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTransTypeReverse = null; } else {
      this.fstrTransTypeReverse = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTransTypeReverseSys = null; } else {
      this.fstrTransTypeReverseSys = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTransTypeWoSys = null; } else {
      this.fstrTransTypeWoSys = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTransTypeRefundACH = null; } else {
      this.fstrTransTypeRefundACH = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTransTypeRefundCheck = null; } else {
      this.fstrTransTypeRefundCheck = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTransTypeExcessRefund = null; } else {
      this.fstrTransTypeExcessRefund = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnExcessRfnOnRunDate = null; } else {
      this.fblnExcessRfnOnRunDate = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOffsetGroup = null; } else {
      this.fstrOffsetGroup = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSourceRAType = null; } else {
      this.fstrSourceRAType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDestRAType = null; } else {
      this.fstrDestRAType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrReverseRAType = null; } else {
      this.fstrReverseRAType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPeriodTransferRAType = null; } else {
      this.fstrPeriodTransferRAType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCreditTransferRAType = null; } else {
      this.fstrCreditTransferRAType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnStrongLink = null; } else {
      this.fblnStrongLink = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnEffectChange = null; } else {
      this.fblnEffectChange = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAllowGeneralOffset = null; } else {
      this.fblnAllowGeneralOffset = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnTransferTrans = null; } else {
      this.fblnTransferTrans = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnBillItemIfCredit = null; } else {
      this.fblnBillItemIfCredit = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnBillItemIfZero = null; } else {
      this.fblnBillItemIfZero = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnInformational = null; } else {
      this.fblnInformational = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnRecovery = null; } else {
      this.fblnRecovery = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrRevenuePrdCalc = null; } else {
      this.fstrRevenuePrdCalc = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPostProcessBo = null; } else {
      this.fstrPostProcessBo = __cur_str;
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
    rfrtranstype o = (rfrtranstype) super.clone();
    return o;
  }

  public void clone0(rfrtranstype o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("fstrTransType", this.fstrTransType);
    __sqoop$field_map.put("fstrCriteria", this.fstrCriteria);
    __sqoop$field_map.put("fstrTransCategory", this.fstrTransCategory);
    __sqoop$field_map.put("fblnLinkRequired", this.fblnLinkRequired);
    __sqoop$field_map.put("fblnManualPost", this.fblnManualPost);
    __sqoop$field_map.put("fblnIsReversal", this.fblnIsReversal);
    __sqoop$field_map.put("fblnIsCredit", this.fblnIsCredit);
    __sqoop$field_map.put("fblnIsWaiver", this.fblnIsWaiver);
    __sqoop$field_map.put("fblnPayment", this.fblnPayment);
    __sqoop$field_map.put("fblnReturn", this.fblnReturn);
    __sqoop$field_map.put("fblnTax", this.fblnTax);
    __sqoop$field_map.put("fstrDetail", this.fstrDetail);
    __sqoop$field_map.put("fstrPeriodImpact", this.fstrPeriodImpact);
    __sqoop$field_map.put("fblnPeriodActivity", this.fblnPeriodActivity);
    __sqoop$field_map.put("fstrLockType", this.fstrLockType);
    __sqoop$field_map.put("fblnLocking", this.fblnLocking);
    __sqoop$field_map.put("fstrLockTransType", this.fstrLockTransType);
    __sqoop$field_map.put("fcurTransWOMin", this.fcurTransWOMin);
    __sqoop$field_map.put("fcurTransWOMax", this.fcurTransWOMax);
    __sqoop$field_map.put("fcurPeriodWOMin", this.fcurPeriodWOMin);
    __sqoop$field_map.put("fcurPeriodWOMax", this.fcurPeriodWOMax);
    __sqoop$field_map.put("fstrTransTypeSBA", this.fstrTransTypeSBA);
    __sqoop$field_map.put("fstrTransTypeWO", this.fstrTransTypeWO);
    __sqoop$field_map.put("fstrTransTypeWaiver", this.fstrTransTypeWaiver);
    __sqoop$field_map.put("fstrTransTypeProtest", this.fstrTransTypeProtest);
    __sqoop$field_map.put("fstrTransTypeAdjust", this.fstrTransTypeAdjust);
    __sqoop$field_map.put("fstrTransTypeReverse", this.fstrTransTypeReverse);
    __sqoop$field_map.put("fstrTransTypeReverseSys", this.fstrTransTypeReverseSys);
    __sqoop$field_map.put("fstrTransTypeWoSys", this.fstrTransTypeWoSys);
    __sqoop$field_map.put("fstrTransTypeRefundACH", this.fstrTransTypeRefundACH);
    __sqoop$field_map.put("fstrTransTypeRefundCheck", this.fstrTransTypeRefundCheck);
    __sqoop$field_map.put("fstrTransTypeExcessRefund", this.fstrTransTypeExcessRefund);
    __sqoop$field_map.put("fblnExcessRfnOnRunDate", this.fblnExcessRfnOnRunDate);
    __sqoop$field_map.put("fstrOffsetGroup", this.fstrOffsetGroup);
    __sqoop$field_map.put("fstrSourceRAType", this.fstrSourceRAType);
    __sqoop$field_map.put("fstrDestRAType", this.fstrDestRAType);
    __sqoop$field_map.put("fstrReverseRAType", this.fstrReverseRAType);
    __sqoop$field_map.put("fstrPeriodTransferRAType", this.fstrPeriodTransferRAType);
    __sqoop$field_map.put("fstrCreditTransferRAType", this.fstrCreditTransferRAType);
    __sqoop$field_map.put("fblnStrongLink", this.fblnStrongLink);
    __sqoop$field_map.put("fblnEffectChange", this.fblnEffectChange);
    __sqoop$field_map.put("fblnAllowGeneralOffset", this.fblnAllowGeneralOffset);
    __sqoop$field_map.put("fblnTransferTrans", this.fblnTransferTrans);
    __sqoop$field_map.put("fblnBillItemIfCredit", this.fblnBillItemIfCredit);
    __sqoop$field_map.put("fblnBillItemIfZero", this.fblnBillItemIfZero);
    __sqoop$field_map.put("fblnInformational", this.fblnInformational);
    __sqoop$field_map.put("fblnRecovery", this.fblnRecovery);
    __sqoop$field_map.put("fstrLinkTag", this.fstrLinkTag);
    __sqoop$field_map.put("fstrRevenuePrdCalc", this.fstrRevenuePrdCalc);
    __sqoop$field_map.put("fstrPostProcessBo", this.fstrPostProcessBo);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("fstrTransType", this.fstrTransType);
    __sqoop$field_map.put("fstrCriteria", this.fstrCriteria);
    __sqoop$field_map.put("fstrTransCategory", this.fstrTransCategory);
    __sqoop$field_map.put("fblnLinkRequired", this.fblnLinkRequired);
    __sqoop$field_map.put("fblnManualPost", this.fblnManualPost);
    __sqoop$field_map.put("fblnIsReversal", this.fblnIsReversal);
    __sqoop$field_map.put("fblnIsCredit", this.fblnIsCredit);
    __sqoop$field_map.put("fblnIsWaiver", this.fblnIsWaiver);
    __sqoop$field_map.put("fblnPayment", this.fblnPayment);
    __sqoop$field_map.put("fblnReturn", this.fblnReturn);
    __sqoop$field_map.put("fblnTax", this.fblnTax);
    __sqoop$field_map.put("fstrDetail", this.fstrDetail);
    __sqoop$field_map.put("fstrPeriodImpact", this.fstrPeriodImpact);
    __sqoop$field_map.put("fblnPeriodActivity", this.fblnPeriodActivity);
    __sqoop$field_map.put("fstrLockType", this.fstrLockType);
    __sqoop$field_map.put("fblnLocking", this.fblnLocking);
    __sqoop$field_map.put("fstrLockTransType", this.fstrLockTransType);
    __sqoop$field_map.put("fcurTransWOMin", this.fcurTransWOMin);
    __sqoop$field_map.put("fcurTransWOMax", this.fcurTransWOMax);
    __sqoop$field_map.put("fcurPeriodWOMin", this.fcurPeriodWOMin);
    __sqoop$field_map.put("fcurPeriodWOMax", this.fcurPeriodWOMax);
    __sqoop$field_map.put("fstrTransTypeSBA", this.fstrTransTypeSBA);
    __sqoop$field_map.put("fstrTransTypeWO", this.fstrTransTypeWO);
    __sqoop$field_map.put("fstrTransTypeWaiver", this.fstrTransTypeWaiver);
    __sqoop$field_map.put("fstrTransTypeProtest", this.fstrTransTypeProtest);
    __sqoop$field_map.put("fstrTransTypeAdjust", this.fstrTransTypeAdjust);
    __sqoop$field_map.put("fstrTransTypeReverse", this.fstrTransTypeReverse);
    __sqoop$field_map.put("fstrTransTypeReverseSys", this.fstrTransTypeReverseSys);
    __sqoop$field_map.put("fstrTransTypeWoSys", this.fstrTransTypeWoSys);
    __sqoop$field_map.put("fstrTransTypeRefundACH", this.fstrTransTypeRefundACH);
    __sqoop$field_map.put("fstrTransTypeRefundCheck", this.fstrTransTypeRefundCheck);
    __sqoop$field_map.put("fstrTransTypeExcessRefund", this.fstrTransTypeExcessRefund);
    __sqoop$field_map.put("fblnExcessRfnOnRunDate", this.fblnExcessRfnOnRunDate);
    __sqoop$field_map.put("fstrOffsetGroup", this.fstrOffsetGroup);
    __sqoop$field_map.put("fstrSourceRAType", this.fstrSourceRAType);
    __sqoop$field_map.put("fstrDestRAType", this.fstrDestRAType);
    __sqoop$field_map.put("fstrReverseRAType", this.fstrReverseRAType);
    __sqoop$field_map.put("fstrPeriodTransferRAType", this.fstrPeriodTransferRAType);
    __sqoop$field_map.put("fstrCreditTransferRAType", this.fstrCreditTransferRAType);
    __sqoop$field_map.put("fblnStrongLink", this.fblnStrongLink);
    __sqoop$field_map.put("fblnEffectChange", this.fblnEffectChange);
    __sqoop$field_map.put("fblnAllowGeneralOffset", this.fblnAllowGeneralOffset);
    __sqoop$field_map.put("fblnTransferTrans", this.fblnTransferTrans);
    __sqoop$field_map.put("fblnBillItemIfCredit", this.fblnBillItemIfCredit);
    __sqoop$field_map.put("fblnBillItemIfZero", this.fblnBillItemIfZero);
    __sqoop$field_map.put("fblnInformational", this.fblnInformational);
    __sqoop$field_map.put("fblnRecovery", this.fblnRecovery);
    __sqoop$field_map.put("fstrLinkTag", this.fstrLinkTag);
    __sqoop$field_map.put("fstrRevenuePrdCalc", this.fstrRevenuePrdCalc);
    __sqoop$field_map.put("fstrPostProcessBo", this.fstrPostProcessBo);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
