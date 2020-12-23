// ORM class for table 'tblnz_paymentadditionalinfo'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 04:32:30 NZDT 2020
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

public class tblnz_paymentadditionalinfo extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_paymentadditionalinfo.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fstrIrdBankType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_paymentadditionalinfo.this.fstrIrdBankType = (String)value;
      }
    });
    setters.put("fstrIrdBankBranch", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_paymentadditionalinfo.this.fstrIrdBankBranch = (String)value;
      }
    });
    setters.put("fstrIrdBankAccountNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_paymentadditionalinfo.this.fstrIrdBankAccountNumber = (String)value;
      }
    });
    setters.put("fstrIrdBankSuffix", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_paymentadditionalinfo.this.fstrIrdBankSuffix = (String)value;
      }
    });
    setters.put("fstrPaymentTransCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_paymentadditionalinfo.this.fstrPaymentTransCode = (String)value;
      }
    });
    setters.put("fstrPaymentAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_paymentadditionalinfo.this.fstrPaymentAmount = (String)value;
      }
    });
    setters.put("fstrPaymentInputSource", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_paymentadditionalinfo.this.fstrPaymentInputSource = (String)value;
      }
    });
    setters.put("fstrOriginBank", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_paymentadditionalinfo.this.fstrOriginBank = (String)value;
      }
    });
    setters.put("fstrOriginBankBranch", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_paymentadditionalinfo.this.fstrOriginBankBranch = (String)value;
      }
    });
    setters.put("fstrOriginBatchNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_paymentadditionalinfo.this.fstrOriginBatchNumber = (String)value;
      }
    });
    setters.put("fstrThisPartyName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_paymentadditionalinfo.this.fstrThisPartyName = (String)value;
      }
    });
    setters.put("fstrPRN", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_paymentadditionalinfo.this.fstrPRN = (String)value;
      }
    });
    setters.put("fstrThisPartyReference", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_paymentadditionalinfo.this.fstrThisPartyReference = (String)value;
      }
    });
    setters.put("fstrThisPartyParticulars", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_paymentadditionalinfo.this.fstrThisPartyParticulars = (String)value;
      }
    });
    setters.put("fstrThisPartyAnalysisCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_paymentadditionalinfo.this.fstrThisPartyAnalysisCode = (String)value;
      }
    });
    setters.put("fstrOtherPartyName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_paymentadditionalinfo.this.fstrOtherPartyName = (String)value;
      }
    });
    setters.put("fstrOtherPartyBankType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_paymentadditionalinfo.this.fstrOtherPartyBankType = (String)value;
      }
    });
    setters.put("fstrOtherPartyBankBranch", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_paymentadditionalinfo.this.fstrOtherPartyBankBranch = (String)value;
      }
    });
    setters.put("fstrOtherPartyBankAccount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_paymentadditionalinfo.this.fstrOtherPartyBankAccount = (String)value;
      }
    });
    setters.put("fstrOtherPartyBankSuffix", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_paymentadditionalinfo.this.fstrOtherPartyBankSuffix = (String)value;
      }
    });
    setters.put("fstrAccountType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_paymentadditionalinfo.this.fstrAccountType = (String)value;
      }
    });
    setters.put("fdtmFilingPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_paymentadditionalinfo.this.fdtmFilingPeriod = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrIDType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_paymentadditionalinfo.this.fstrIDType = (String)value;
      }
    });
    setters.put("fstrID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_paymentadditionalinfo.this.fstrID = (String)value;
      }
    });
    setters.put("fstrAccountFilingIdHash", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_paymentadditionalinfo.this.fstrAccountFilingIdHash = (String)value;
      }
    });
    setters.put("fdtmDueDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_paymentadditionalinfo.this.fdtmDueDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrMedia", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_paymentadditionalinfo.this.fstrMedia = (String)value;
      }
    });
    setters.put("fstrVoucherType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_paymentadditionalinfo.this.fstrVoucherType = (String)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_paymentadditionalinfo.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_paymentadditionalinfo.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_paymentadditionalinfo() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_paymentadditionalinfo with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private String fstrIrdBankType;
  public String get_fstrIrdBankType() {
    return fstrIrdBankType;
  }
  public void set_fstrIrdBankType(String fstrIrdBankType) {
    this.fstrIrdBankType = fstrIrdBankType;
  }
  public tblnz_paymentadditionalinfo with_fstrIrdBankType(String fstrIrdBankType) {
    this.fstrIrdBankType = fstrIrdBankType;
    return this;
  }
  private String fstrIrdBankBranch;
  public String get_fstrIrdBankBranch() {
    return fstrIrdBankBranch;
  }
  public void set_fstrIrdBankBranch(String fstrIrdBankBranch) {
    this.fstrIrdBankBranch = fstrIrdBankBranch;
  }
  public tblnz_paymentadditionalinfo with_fstrIrdBankBranch(String fstrIrdBankBranch) {
    this.fstrIrdBankBranch = fstrIrdBankBranch;
    return this;
  }
  private String fstrIrdBankAccountNumber;
  public String get_fstrIrdBankAccountNumber() {
    return fstrIrdBankAccountNumber;
  }
  public void set_fstrIrdBankAccountNumber(String fstrIrdBankAccountNumber) {
    this.fstrIrdBankAccountNumber = fstrIrdBankAccountNumber;
  }
  public tblnz_paymentadditionalinfo with_fstrIrdBankAccountNumber(String fstrIrdBankAccountNumber) {
    this.fstrIrdBankAccountNumber = fstrIrdBankAccountNumber;
    return this;
  }
  private String fstrIrdBankSuffix;
  public String get_fstrIrdBankSuffix() {
    return fstrIrdBankSuffix;
  }
  public void set_fstrIrdBankSuffix(String fstrIrdBankSuffix) {
    this.fstrIrdBankSuffix = fstrIrdBankSuffix;
  }
  public tblnz_paymentadditionalinfo with_fstrIrdBankSuffix(String fstrIrdBankSuffix) {
    this.fstrIrdBankSuffix = fstrIrdBankSuffix;
    return this;
  }
  private String fstrPaymentTransCode;
  public String get_fstrPaymentTransCode() {
    return fstrPaymentTransCode;
  }
  public void set_fstrPaymentTransCode(String fstrPaymentTransCode) {
    this.fstrPaymentTransCode = fstrPaymentTransCode;
  }
  public tblnz_paymentadditionalinfo with_fstrPaymentTransCode(String fstrPaymentTransCode) {
    this.fstrPaymentTransCode = fstrPaymentTransCode;
    return this;
  }
  private String fstrPaymentAmount;
  public String get_fstrPaymentAmount() {
    return fstrPaymentAmount;
  }
  public void set_fstrPaymentAmount(String fstrPaymentAmount) {
    this.fstrPaymentAmount = fstrPaymentAmount;
  }
  public tblnz_paymentadditionalinfo with_fstrPaymentAmount(String fstrPaymentAmount) {
    this.fstrPaymentAmount = fstrPaymentAmount;
    return this;
  }
  private String fstrPaymentInputSource;
  public String get_fstrPaymentInputSource() {
    return fstrPaymentInputSource;
  }
  public void set_fstrPaymentInputSource(String fstrPaymentInputSource) {
    this.fstrPaymentInputSource = fstrPaymentInputSource;
  }
  public tblnz_paymentadditionalinfo with_fstrPaymentInputSource(String fstrPaymentInputSource) {
    this.fstrPaymentInputSource = fstrPaymentInputSource;
    return this;
  }
  private String fstrOriginBank;
  public String get_fstrOriginBank() {
    return fstrOriginBank;
  }
  public void set_fstrOriginBank(String fstrOriginBank) {
    this.fstrOriginBank = fstrOriginBank;
  }
  public tblnz_paymentadditionalinfo with_fstrOriginBank(String fstrOriginBank) {
    this.fstrOriginBank = fstrOriginBank;
    return this;
  }
  private String fstrOriginBankBranch;
  public String get_fstrOriginBankBranch() {
    return fstrOriginBankBranch;
  }
  public void set_fstrOriginBankBranch(String fstrOriginBankBranch) {
    this.fstrOriginBankBranch = fstrOriginBankBranch;
  }
  public tblnz_paymentadditionalinfo with_fstrOriginBankBranch(String fstrOriginBankBranch) {
    this.fstrOriginBankBranch = fstrOriginBankBranch;
    return this;
  }
  private String fstrOriginBatchNumber;
  public String get_fstrOriginBatchNumber() {
    return fstrOriginBatchNumber;
  }
  public void set_fstrOriginBatchNumber(String fstrOriginBatchNumber) {
    this.fstrOriginBatchNumber = fstrOriginBatchNumber;
  }
  public tblnz_paymentadditionalinfo with_fstrOriginBatchNumber(String fstrOriginBatchNumber) {
    this.fstrOriginBatchNumber = fstrOriginBatchNumber;
    return this;
  }
  private String fstrThisPartyName;
  public String get_fstrThisPartyName() {
    return fstrThisPartyName;
  }
  public void set_fstrThisPartyName(String fstrThisPartyName) {
    this.fstrThisPartyName = fstrThisPartyName;
  }
  public tblnz_paymentadditionalinfo with_fstrThisPartyName(String fstrThisPartyName) {
    this.fstrThisPartyName = fstrThisPartyName;
    return this;
  }
  private String fstrPRN;
  public String get_fstrPRN() {
    return fstrPRN;
  }
  public void set_fstrPRN(String fstrPRN) {
    this.fstrPRN = fstrPRN;
  }
  public tblnz_paymentadditionalinfo with_fstrPRN(String fstrPRN) {
    this.fstrPRN = fstrPRN;
    return this;
  }
  private String fstrThisPartyReference;
  public String get_fstrThisPartyReference() {
    return fstrThisPartyReference;
  }
  public void set_fstrThisPartyReference(String fstrThisPartyReference) {
    this.fstrThisPartyReference = fstrThisPartyReference;
  }
  public tblnz_paymentadditionalinfo with_fstrThisPartyReference(String fstrThisPartyReference) {
    this.fstrThisPartyReference = fstrThisPartyReference;
    return this;
  }
  private String fstrThisPartyParticulars;
  public String get_fstrThisPartyParticulars() {
    return fstrThisPartyParticulars;
  }
  public void set_fstrThisPartyParticulars(String fstrThisPartyParticulars) {
    this.fstrThisPartyParticulars = fstrThisPartyParticulars;
  }
  public tblnz_paymentadditionalinfo with_fstrThisPartyParticulars(String fstrThisPartyParticulars) {
    this.fstrThisPartyParticulars = fstrThisPartyParticulars;
    return this;
  }
  private String fstrThisPartyAnalysisCode;
  public String get_fstrThisPartyAnalysisCode() {
    return fstrThisPartyAnalysisCode;
  }
  public void set_fstrThisPartyAnalysisCode(String fstrThisPartyAnalysisCode) {
    this.fstrThisPartyAnalysisCode = fstrThisPartyAnalysisCode;
  }
  public tblnz_paymentadditionalinfo with_fstrThisPartyAnalysisCode(String fstrThisPartyAnalysisCode) {
    this.fstrThisPartyAnalysisCode = fstrThisPartyAnalysisCode;
    return this;
  }
  private String fstrOtherPartyName;
  public String get_fstrOtherPartyName() {
    return fstrOtherPartyName;
  }
  public void set_fstrOtherPartyName(String fstrOtherPartyName) {
    this.fstrOtherPartyName = fstrOtherPartyName;
  }
  public tblnz_paymentadditionalinfo with_fstrOtherPartyName(String fstrOtherPartyName) {
    this.fstrOtherPartyName = fstrOtherPartyName;
    return this;
  }
  private String fstrOtherPartyBankType;
  public String get_fstrOtherPartyBankType() {
    return fstrOtherPartyBankType;
  }
  public void set_fstrOtherPartyBankType(String fstrOtherPartyBankType) {
    this.fstrOtherPartyBankType = fstrOtherPartyBankType;
  }
  public tblnz_paymentadditionalinfo with_fstrOtherPartyBankType(String fstrOtherPartyBankType) {
    this.fstrOtherPartyBankType = fstrOtherPartyBankType;
    return this;
  }
  private String fstrOtherPartyBankBranch;
  public String get_fstrOtherPartyBankBranch() {
    return fstrOtherPartyBankBranch;
  }
  public void set_fstrOtherPartyBankBranch(String fstrOtherPartyBankBranch) {
    this.fstrOtherPartyBankBranch = fstrOtherPartyBankBranch;
  }
  public tblnz_paymentadditionalinfo with_fstrOtherPartyBankBranch(String fstrOtherPartyBankBranch) {
    this.fstrOtherPartyBankBranch = fstrOtherPartyBankBranch;
    return this;
  }
  private String fstrOtherPartyBankAccount;
  public String get_fstrOtherPartyBankAccount() {
    return fstrOtherPartyBankAccount;
  }
  public void set_fstrOtherPartyBankAccount(String fstrOtherPartyBankAccount) {
    this.fstrOtherPartyBankAccount = fstrOtherPartyBankAccount;
  }
  public tblnz_paymentadditionalinfo with_fstrOtherPartyBankAccount(String fstrOtherPartyBankAccount) {
    this.fstrOtherPartyBankAccount = fstrOtherPartyBankAccount;
    return this;
  }
  private String fstrOtherPartyBankSuffix;
  public String get_fstrOtherPartyBankSuffix() {
    return fstrOtherPartyBankSuffix;
  }
  public void set_fstrOtherPartyBankSuffix(String fstrOtherPartyBankSuffix) {
    this.fstrOtherPartyBankSuffix = fstrOtherPartyBankSuffix;
  }
  public tblnz_paymentadditionalinfo with_fstrOtherPartyBankSuffix(String fstrOtherPartyBankSuffix) {
    this.fstrOtherPartyBankSuffix = fstrOtherPartyBankSuffix;
    return this;
  }
  private String fstrAccountType;
  public String get_fstrAccountType() {
    return fstrAccountType;
  }
  public void set_fstrAccountType(String fstrAccountType) {
    this.fstrAccountType = fstrAccountType;
  }
  public tblnz_paymentadditionalinfo with_fstrAccountType(String fstrAccountType) {
    this.fstrAccountType = fstrAccountType;
    return this;
  }
  private java.sql.Timestamp fdtmFilingPeriod;
  public java.sql.Timestamp get_fdtmFilingPeriod() {
    return fdtmFilingPeriod;
  }
  public void set_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
  }
  public tblnz_paymentadditionalinfo with_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
    return this;
  }
  private String fstrIDType;
  public String get_fstrIDType() {
    return fstrIDType;
  }
  public void set_fstrIDType(String fstrIDType) {
    this.fstrIDType = fstrIDType;
  }
  public tblnz_paymentadditionalinfo with_fstrIDType(String fstrIDType) {
    this.fstrIDType = fstrIDType;
    return this;
  }
  private String fstrID;
  public String get_fstrID() {
    return fstrID;
  }
  public void set_fstrID(String fstrID) {
    this.fstrID = fstrID;
  }
  public tblnz_paymentadditionalinfo with_fstrID(String fstrID) {
    this.fstrID = fstrID;
    return this;
  }
  private String fstrAccountFilingIdHash;
  public String get_fstrAccountFilingIdHash() {
    return fstrAccountFilingIdHash;
  }
  public void set_fstrAccountFilingIdHash(String fstrAccountFilingIdHash) {
    this.fstrAccountFilingIdHash = fstrAccountFilingIdHash;
  }
  public tblnz_paymentadditionalinfo with_fstrAccountFilingIdHash(String fstrAccountFilingIdHash) {
    this.fstrAccountFilingIdHash = fstrAccountFilingIdHash;
    return this;
  }
  private java.sql.Timestamp fdtmDueDate;
  public java.sql.Timestamp get_fdtmDueDate() {
    return fdtmDueDate;
  }
  public void set_fdtmDueDate(java.sql.Timestamp fdtmDueDate) {
    this.fdtmDueDate = fdtmDueDate;
  }
  public tblnz_paymentadditionalinfo with_fdtmDueDate(java.sql.Timestamp fdtmDueDate) {
    this.fdtmDueDate = fdtmDueDate;
    return this;
  }
  private String fstrMedia;
  public String get_fstrMedia() {
    return fstrMedia;
  }
  public void set_fstrMedia(String fstrMedia) {
    this.fstrMedia = fstrMedia;
  }
  public tblnz_paymentadditionalinfo with_fstrMedia(String fstrMedia) {
    this.fstrMedia = fstrMedia;
    return this;
  }
  private String fstrVoucherType;
  public String get_fstrVoucherType() {
    return fstrVoucherType;
  }
  public void set_fstrVoucherType(String fstrVoucherType) {
    this.fstrVoucherType = fstrVoucherType;
  }
  public tblnz_paymentadditionalinfo with_fstrVoucherType(String fstrVoucherType) {
    this.fstrVoucherType = fstrVoucherType;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_paymentadditionalinfo with_fstrWho(String fstrWho) {
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
  public tblnz_paymentadditionalinfo with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_paymentadditionalinfo)) {
      return false;
    }
    tblnz_paymentadditionalinfo that = (tblnz_paymentadditionalinfo) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fstrIrdBankType == null ? that.fstrIrdBankType == null : this.fstrIrdBankType.equals(that.fstrIrdBankType));
    equal = equal && (this.fstrIrdBankBranch == null ? that.fstrIrdBankBranch == null : this.fstrIrdBankBranch.equals(that.fstrIrdBankBranch));
    equal = equal && (this.fstrIrdBankAccountNumber == null ? that.fstrIrdBankAccountNumber == null : this.fstrIrdBankAccountNumber.equals(that.fstrIrdBankAccountNumber));
    equal = equal && (this.fstrIrdBankSuffix == null ? that.fstrIrdBankSuffix == null : this.fstrIrdBankSuffix.equals(that.fstrIrdBankSuffix));
    equal = equal && (this.fstrPaymentTransCode == null ? that.fstrPaymentTransCode == null : this.fstrPaymentTransCode.equals(that.fstrPaymentTransCode));
    equal = equal && (this.fstrPaymentAmount == null ? that.fstrPaymentAmount == null : this.fstrPaymentAmount.equals(that.fstrPaymentAmount));
    equal = equal && (this.fstrPaymentInputSource == null ? that.fstrPaymentInputSource == null : this.fstrPaymentInputSource.equals(that.fstrPaymentInputSource));
    equal = equal && (this.fstrOriginBank == null ? that.fstrOriginBank == null : this.fstrOriginBank.equals(that.fstrOriginBank));
    equal = equal && (this.fstrOriginBankBranch == null ? that.fstrOriginBankBranch == null : this.fstrOriginBankBranch.equals(that.fstrOriginBankBranch));
    equal = equal && (this.fstrOriginBatchNumber == null ? that.fstrOriginBatchNumber == null : this.fstrOriginBatchNumber.equals(that.fstrOriginBatchNumber));
    equal = equal && (this.fstrThisPartyName == null ? that.fstrThisPartyName == null : this.fstrThisPartyName.equals(that.fstrThisPartyName));
    equal = equal && (this.fstrPRN == null ? that.fstrPRN == null : this.fstrPRN.equals(that.fstrPRN));
    equal = equal && (this.fstrThisPartyReference == null ? that.fstrThisPartyReference == null : this.fstrThisPartyReference.equals(that.fstrThisPartyReference));
    equal = equal && (this.fstrThisPartyParticulars == null ? that.fstrThisPartyParticulars == null : this.fstrThisPartyParticulars.equals(that.fstrThisPartyParticulars));
    equal = equal && (this.fstrThisPartyAnalysisCode == null ? that.fstrThisPartyAnalysisCode == null : this.fstrThisPartyAnalysisCode.equals(that.fstrThisPartyAnalysisCode));
    equal = equal && (this.fstrOtherPartyName == null ? that.fstrOtherPartyName == null : this.fstrOtherPartyName.equals(that.fstrOtherPartyName));
    equal = equal && (this.fstrOtherPartyBankType == null ? that.fstrOtherPartyBankType == null : this.fstrOtherPartyBankType.equals(that.fstrOtherPartyBankType));
    equal = equal && (this.fstrOtherPartyBankBranch == null ? that.fstrOtherPartyBankBranch == null : this.fstrOtherPartyBankBranch.equals(that.fstrOtherPartyBankBranch));
    equal = equal && (this.fstrOtherPartyBankAccount == null ? that.fstrOtherPartyBankAccount == null : this.fstrOtherPartyBankAccount.equals(that.fstrOtherPartyBankAccount));
    equal = equal && (this.fstrOtherPartyBankSuffix == null ? that.fstrOtherPartyBankSuffix == null : this.fstrOtherPartyBankSuffix.equals(that.fstrOtherPartyBankSuffix));
    equal = equal && (this.fstrAccountType == null ? that.fstrAccountType == null : this.fstrAccountType.equals(that.fstrAccountType));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.fstrIDType == null ? that.fstrIDType == null : this.fstrIDType.equals(that.fstrIDType));
    equal = equal && (this.fstrID == null ? that.fstrID == null : this.fstrID.equals(that.fstrID));
    equal = equal && (this.fstrAccountFilingIdHash == null ? that.fstrAccountFilingIdHash == null : this.fstrAccountFilingIdHash.equals(that.fstrAccountFilingIdHash));
    equal = equal && (this.fdtmDueDate == null ? that.fdtmDueDate == null : this.fdtmDueDate.equals(that.fdtmDueDate));
    equal = equal && (this.fstrMedia == null ? that.fstrMedia == null : this.fstrMedia.equals(that.fstrMedia));
    equal = equal && (this.fstrVoucherType == null ? that.fstrVoucherType == null : this.fstrVoucherType.equals(that.fstrVoucherType));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_paymentadditionalinfo)) {
      return false;
    }
    tblnz_paymentadditionalinfo that = (tblnz_paymentadditionalinfo) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fstrIrdBankType == null ? that.fstrIrdBankType == null : this.fstrIrdBankType.equals(that.fstrIrdBankType));
    equal = equal && (this.fstrIrdBankBranch == null ? that.fstrIrdBankBranch == null : this.fstrIrdBankBranch.equals(that.fstrIrdBankBranch));
    equal = equal && (this.fstrIrdBankAccountNumber == null ? that.fstrIrdBankAccountNumber == null : this.fstrIrdBankAccountNumber.equals(that.fstrIrdBankAccountNumber));
    equal = equal && (this.fstrIrdBankSuffix == null ? that.fstrIrdBankSuffix == null : this.fstrIrdBankSuffix.equals(that.fstrIrdBankSuffix));
    equal = equal && (this.fstrPaymentTransCode == null ? that.fstrPaymentTransCode == null : this.fstrPaymentTransCode.equals(that.fstrPaymentTransCode));
    equal = equal && (this.fstrPaymentAmount == null ? that.fstrPaymentAmount == null : this.fstrPaymentAmount.equals(that.fstrPaymentAmount));
    equal = equal && (this.fstrPaymentInputSource == null ? that.fstrPaymentInputSource == null : this.fstrPaymentInputSource.equals(that.fstrPaymentInputSource));
    equal = equal && (this.fstrOriginBank == null ? that.fstrOriginBank == null : this.fstrOriginBank.equals(that.fstrOriginBank));
    equal = equal && (this.fstrOriginBankBranch == null ? that.fstrOriginBankBranch == null : this.fstrOriginBankBranch.equals(that.fstrOriginBankBranch));
    equal = equal && (this.fstrOriginBatchNumber == null ? that.fstrOriginBatchNumber == null : this.fstrOriginBatchNumber.equals(that.fstrOriginBatchNumber));
    equal = equal && (this.fstrThisPartyName == null ? that.fstrThisPartyName == null : this.fstrThisPartyName.equals(that.fstrThisPartyName));
    equal = equal && (this.fstrPRN == null ? that.fstrPRN == null : this.fstrPRN.equals(that.fstrPRN));
    equal = equal && (this.fstrThisPartyReference == null ? that.fstrThisPartyReference == null : this.fstrThisPartyReference.equals(that.fstrThisPartyReference));
    equal = equal && (this.fstrThisPartyParticulars == null ? that.fstrThisPartyParticulars == null : this.fstrThisPartyParticulars.equals(that.fstrThisPartyParticulars));
    equal = equal && (this.fstrThisPartyAnalysisCode == null ? that.fstrThisPartyAnalysisCode == null : this.fstrThisPartyAnalysisCode.equals(that.fstrThisPartyAnalysisCode));
    equal = equal && (this.fstrOtherPartyName == null ? that.fstrOtherPartyName == null : this.fstrOtherPartyName.equals(that.fstrOtherPartyName));
    equal = equal && (this.fstrOtherPartyBankType == null ? that.fstrOtherPartyBankType == null : this.fstrOtherPartyBankType.equals(that.fstrOtherPartyBankType));
    equal = equal && (this.fstrOtherPartyBankBranch == null ? that.fstrOtherPartyBankBranch == null : this.fstrOtherPartyBankBranch.equals(that.fstrOtherPartyBankBranch));
    equal = equal && (this.fstrOtherPartyBankAccount == null ? that.fstrOtherPartyBankAccount == null : this.fstrOtherPartyBankAccount.equals(that.fstrOtherPartyBankAccount));
    equal = equal && (this.fstrOtherPartyBankSuffix == null ? that.fstrOtherPartyBankSuffix == null : this.fstrOtherPartyBankSuffix.equals(that.fstrOtherPartyBankSuffix));
    equal = equal && (this.fstrAccountType == null ? that.fstrAccountType == null : this.fstrAccountType.equals(that.fstrAccountType));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.fstrIDType == null ? that.fstrIDType == null : this.fstrIDType.equals(that.fstrIDType));
    equal = equal && (this.fstrID == null ? that.fstrID == null : this.fstrID.equals(that.fstrID));
    equal = equal && (this.fstrAccountFilingIdHash == null ? that.fstrAccountFilingIdHash == null : this.fstrAccountFilingIdHash.equals(that.fstrAccountFilingIdHash));
    equal = equal && (this.fdtmDueDate == null ? that.fdtmDueDate == null : this.fdtmDueDate.equals(that.fdtmDueDate));
    equal = equal && (this.fstrMedia == null ? that.fstrMedia == null : this.fstrMedia.equals(that.fstrMedia));
    equal = equal && (this.fstrVoucherType == null ? that.fstrVoucherType == null : this.fstrVoucherType.equals(that.fstrVoucherType));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fstrIrdBankType = JdbcWritableBridge.readString(2, __dbResults);
    this.fstrIrdBankBranch = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrIrdBankAccountNumber = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrIrdBankSuffix = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrPaymentTransCode = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrPaymentAmount = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrPaymentInputSource = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrOriginBank = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrOriginBankBranch = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrOriginBatchNumber = JdbcWritableBridge.readString(11, __dbResults);
    this.fstrThisPartyName = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrPRN = JdbcWritableBridge.readString(13, __dbResults);
    this.fstrThisPartyReference = JdbcWritableBridge.readString(14, __dbResults);
    this.fstrThisPartyParticulars = JdbcWritableBridge.readString(15, __dbResults);
    this.fstrThisPartyAnalysisCode = JdbcWritableBridge.readString(16, __dbResults);
    this.fstrOtherPartyName = JdbcWritableBridge.readString(17, __dbResults);
    this.fstrOtherPartyBankType = JdbcWritableBridge.readString(18, __dbResults);
    this.fstrOtherPartyBankBranch = JdbcWritableBridge.readString(19, __dbResults);
    this.fstrOtherPartyBankAccount = JdbcWritableBridge.readString(20, __dbResults);
    this.fstrOtherPartyBankSuffix = JdbcWritableBridge.readString(21, __dbResults);
    this.fstrAccountType = JdbcWritableBridge.readString(22, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(23, __dbResults);
    this.fstrIDType = JdbcWritableBridge.readString(24, __dbResults);
    this.fstrID = JdbcWritableBridge.readString(25, __dbResults);
    this.fstrAccountFilingIdHash = JdbcWritableBridge.readString(26, __dbResults);
    this.fdtmDueDate = JdbcWritableBridge.readTimestamp(27, __dbResults);
    this.fstrMedia = JdbcWritableBridge.readString(28, __dbResults);
    this.fstrVoucherType = JdbcWritableBridge.readString(29, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(30, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(31, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fstrIrdBankType = JdbcWritableBridge.readString(2, __dbResults);
    this.fstrIrdBankBranch = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrIrdBankAccountNumber = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrIrdBankSuffix = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrPaymentTransCode = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrPaymentAmount = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrPaymentInputSource = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrOriginBank = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrOriginBankBranch = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrOriginBatchNumber = JdbcWritableBridge.readString(11, __dbResults);
    this.fstrThisPartyName = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrPRN = JdbcWritableBridge.readString(13, __dbResults);
    this.fstrThisPartyReference = JdbcWritableBridge.readString(14, __dbResults);
    this.fstrThisPartyParticulars = JdbcWritableBridge.readString(15, __dbResults);
    this.fstrThisPartyAnalysisCode = JdbcWritableBridge.readString(16, __dbResults);
    this.fstrOtherPartyName = JdbcWritableBridge.readString(17, __dbResults);
    this.fstrOtherPartyBankType = JdbcWritableBridge.readString(18, __dbResults);
    this.fstrOtherPartyBankBranch = JdbcWritableBridge.readString(19, __dbResults);
    this.fstrOtherPartyBankAccount = JdbcWritableBridge.readString(20, __dbResults);
    this.fstrOtherPartyBankSuffix = JdbcWritableBridge.readString(21, __dbResults);
    this.fstrAccountType = JdbcWritableBridge.readString(22, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(23, __dbResults);
    this.fstrIDType = JdbcWritableBridge.readString(24, __dbResults);
    this.fstrID = JdbcWritableBridge.readString(25, __dbResults);
    this.fstrAccountFilingIdHash = JdbcWritableBridge.readString(26, __dbResults);
    this.fdtmDueDate = JdbcWritableBridge.readTimestamp(27, __dbResults);
    this.fstrMedia = JdbcWritableBridge.readString(28, __dbResults);
    this.fstrVoucherType = JdbcWritableBridge.readString(29, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(30, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(31, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrIrdBankType, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrIrdBankBranch, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrIrdBankAccountNumber, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrIrdBankSuffix, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPaymentTransCode, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPaymentAmount, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPaymentInputSource, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOriginBank, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOriginBankBranch, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOriginBatchNumber, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrThisPartyName, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPRN, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrThisPartyReference, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrThisPartyParticulars, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrThisPartyAnalysisCode, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOtherPartyName, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOtherPartyBankType, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOtherPartyBankBranch, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOtherPartyBankAccount, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOtherPartyBankSuffix, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountType, 22 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 23 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrIDType, 24 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrID, 25 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountFilingIdHash, 26 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDueDate, 27 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrMedia, 28 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrVoucherType, 29 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 30 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 31 + __off, 93, __dbStmt);
    return 31;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrIrdBankType, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrIrdBankBranch, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrIrdBankAccountNumber, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrIrdBankSuffix, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPaymentTransCode, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPaymentAmount, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPaymentInputSource, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOriginBank, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOriginBankBranch, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOriginBatchNumber, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrThisPartyName, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPRN, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrThisPartyReference, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrThisPartyParticulars, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrThisPartyAnalysisCode, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOtherPartyName, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOtherPartyBankType, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOtherPartyBankBranch, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOtherPartyBankAccount, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOtherPartyBankSuffix, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountType, 22 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 23 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrIDType, 24 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrID, 25 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountFilingIdHash, 26 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDueDate, 27 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrMedia, 28 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrVoucherType, 29 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 30 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 31 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngDocKey = null;
    } else {
    this.flngDocKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrIrdBankType = null;
    } else {
    this.fstrIrdBankType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrIrdBankBranch = null;
    } else {
    this.fstrIrdBankBranch = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrIrdBankAccountNumber = null;
    } else {
    this.fstrIrdBankAccountNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrIrdBankSuffix = null;
    } else {
    this.fstrIrdBankSuffix = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPaymentTransCode = null;
    } else {
    this.fstrPaymentTransCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPaymentAmount = null;
    } else {
    this.fstrPaymentAmount = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPaymentInputSource = null;
    } else {
    this.fstrPaymentInputSource = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrOriginBank = null;
    } else {
    this.fstrOriginBank = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrOriginBankBranch = null;
    } else {
    this.fstrOriginBankBranch = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrOriginBatchNumber = null;
    } else {
    this.fstrOriginBatchNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrThisPartyName = null;
    } else {
    this.fstrThisPartyName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPRN = null;
    } else {
    this.fstrPRN = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrThisPartyReference = null;
    } else {
    this.fstrThisPartyReference = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrThisPartyParticulars = null;
    } else {
    this.fstrThisPartyParticulars = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrThisPartyAnalysisCode = null;
    } else {
    this.fstrThisPartyAnalysisCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrOtherPartyName = null;
    } else {
    this.fstrOtherPartyName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrOtherPartyBankType = null;
    } else {
    this.fstrOtherPartyBankType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrOtherPartyBankBranch = null;
    } else {
    this.fstrOtherPartyBankBranch = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrOtherPartyBankAccount = null;
    } else {
    this.fstrOtherPartyBankAccount = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrOtherPartyBankSuffix = null;
    } else {
    this.fstrOtherPartyBankSuffix = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAccountType = null;
    } else {
    this.fstrAccountType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmFilingPeriod = null;
    } else {
    this.fdtmFilingPeriod = new Timestamp(__dataIn.readLong());
    this.fdtmFilingPeriod.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrIDType = null;
    } else {
    this.fstrIDType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrID = null;
    } else {
    this.fstrID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAccountFilingIdHash = null;
    } else {
    this.fstrAccountFilingIdHash = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmDueDate = null;
    } else {
    this.fdtmDueDate = new Timestamp(__dataIn.readLong());
    this.fdtmDueDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrMedia = null;
    } else {
    this.fstrMedia = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrVoucherType = null;
    } else {
    this.fstrVoucherType = Text.readString(__dataIn);
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
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.fstrIrdBankType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIrdBankType);
    }
    if (null == this.fstrIrdBankBranch) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIrdBankBranch);
    }
    if (null == this.fstrIrdBankAccountNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIrdBankAccountNumber);
    }
    if (null == this.fstrIrdBankSuffix) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIrdBankSuffix);
    }
    if (null == this.fstrPaymentTransCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPaymentTransCode);
    }
    if (null == this.fstrPaymentAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPaymentAmount);
    }
    if (null == this.fstrPaymentInputSource) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPaymentInputSource);
    }
    if (null == this.fstrOriginBank) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOriginBank);
    }
    if (null == this.fstrOriginBankBranch) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOriginBankBranch);
    }
    if (null == this.fstrOriginBatchNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOriginBatchNumber);
    }
    if (null == this.fstrThisPartyName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrThisPartyName);
    }
    if (null == this.fstrPRN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPRN);
    }
    if (null == this.fstrThisPartyReference) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrThisPartyReference);
    }
    if (null == this.fstrThisPartyParticulars) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrThisPartyParticulars);
    }
    if (null == this.fstrThisPartyAnalysisCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrThisPartyAnalysisCode);
    }
    if (null == this.fstrOtherPartyName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOtherPartyName);
    }
    if (null == this.fstrOtherPartyBankType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOtherPartyBankType);
    }
    if (null == this.fstrOtherPartyBankBranch) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOtherPartyBankBranch);
    }
    if (null == this.fstrOtherPartyBankAccount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOtherPartyBankAccount);
    }
    if (null == this.fstrOtherPartyBankSuffix) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOtherPartyBankSuffix);
    }
    if (null == this.fstrAccountType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAccountType);
    }
    if (null == this.fdtmFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriod.getNanos());
    }
    if (null == this.fstrIDType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIDType);
    }
    if (null == this.fstrID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrID);
    }
    if (null == this.fstrAccountFilingIdHash) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAccountFilingIdHash);
    }
    if (null == this.fdtmDueDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDueDate.getTime());
    __dataOut.writeInt(this.fdtmDueDate.getNanos());
    }
    if (null == this.fstrMedia) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMedia);
    }
    if (null == this.fstrVoucherType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrVoucherType);
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
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.fstrIrdBankType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIrdBankType);
    }
    if (null == this.fstrIrdBankBranch) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIrdBankBranch);
    }
    if (null == this.fstrIrdBankAccountNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIrdBankAccountNumber);
    }
    if (null == this.fstrIrdBankSuffix) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIrdBankSuffix);
    }
    if (null == this.fstrPaymentTransCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPaymentTransCode);
    }
    if (null == this.fstrPaymentAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPaymentAmount);
    }
    if (null == this.fstrPaymentInputSource) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPaymentInputSource);
    }
    if (null == this.fstrOriginBank) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOriginBank);
    }
    if (null == this.fstrOriginBankBranch) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOriginBankBranch);
    }
    if (null == this.fstrOriginBatchNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOriginBatchNumber);
    }
    if (null == this.fstrThisPartyName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrThisPartyName);
    }
    if (null == this.fstrPRN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPRN);
    }
    if (null == this.fstrThisPartyReference) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrThisPartyReference);
    }
    if (null == this.fstrThisPartyParticulars) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrThisPartyParticulars);
    }
    if (null == this.fstrThisPartyAnalysisCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrThisPartyAnalysisCode);
    }
    if (null == this.fstrOtherPartyName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOtherPartyName);
    }
    if (null == this.fstrOtherPartyBankType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOtherPartyBankType);
    }
    if (null == this.fstrOtherPartyBankBranch) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOtherPartyBankBranch);
    }
    if (null == this.fstrOtherPartyBankAccount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOtherPartyBankAccount);
    }
    if (null == this.fstrOtherPartyBankSuffix) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOtherPartyBankSuffix);
    }
    if (null == this.fstrAccountType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAccountType);
    }
    if (null == this.fdtmFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriod.getNanos());
    }
    if (null == this.fstrIDType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIDType);
    }
    if (null == this.fstrID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrID);
    }
    if (null == this.fstrAccountFilingIdHash) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAccountFilingIdHash);
    }
    if (null == this.fdtmDueDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDueDate.getTime());
    __dataOut.writeInt(this.fdtmDueDate.getNanos());
    }
    if (null == this.fstrMedia) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMedia);
    }
    if (null == this.fstrVoucherType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrVoucherType);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIrdBankType==null?"\\N":fstrIrdBankType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIrdBankBranch==null?"\\N":fstrIrdBankBranch, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIrdBankAccountNumber==null?"\\N":fstrIrdBankAccountNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIrdBankSuffix==null?"\\N":fstrIrdBankSuffix, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPaymentTransCode==null?"\\N":fstrPaymentTransCode, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPaymentAmount==null?"\\N":fstrPaymentAmount, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPaymentInputSource==null?"\\N":fstrPaymentInputSource, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOriginBank==null?"\\N":fstrOriginBank, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOriginBankBranch==null?"\\N":fstrOriginBankBranch, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOriginBatchNumber==null?"\\N":fstrOriginBatchNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrThisPartyName==null?"\\N":fstrThisPartyName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPRN==null?"\\N":fstrPRN, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrThisPartyReference==null?"\\N":fstrThisPartyReference, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrThisPartyParticulars==null?"\\N":fstrThisPartyParticulars, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrThisPartyAnalysisCode==null?"\\N":fstrThisPartyAnalysisCode, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOtherPartyName==null?"\\N":fstrOtherPartyName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOtherPartyBankType==null?"\\N":fstrOtherPartyBankType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOtherPartyBankBranch==null?"\\N":fstrOtherPartyBankBranch, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOtherPartyBankAccount==null?"\\N":fstrOtherPartyBankAccount, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOtherPartyBankSuffix==null?"\\N":fstrOtherPartyBankSuffix, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAccountType==null?"\\N":fstrAccountType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIDType==null?"\\N":fstrIDType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrID==null?"\\N":fstrID, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAccountFilingIdHash==null?"\\N":fstrAccountFilingIdHash, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDueDate==null?"\\N":"" + fdtmDueDate, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMedia==null?"\\N":fstrMedia, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrVoucherType==null?"\\N":fstrVoucherType, " ", delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIrdBankType==null?"\\N":fstrIrdBankType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIrdBankBranch==null?"\\N":fstrIrdBankBranch, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIrdBankAccountNumber==null?"\\N":fstrIrdBankAccountNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIrdBankSuffix==null?"\\N":fstrIrdBankSuffix, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPaymentTransCode==null?"\\N":fstrPaymentTransCode, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPaymentAmount==null?"\\N":fstrPaymentAmount, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPaymentInputSource==null?"\\N":fstrPaymentInputSource, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOriginBank==null?"\\N":fstrOriginBank, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOriginBankBranch==null?"\\N":fstrOriginBankBranch, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOriginBatchNumber==null?"\\N":fstrOriginBatchNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrThisPartyName==null?"\\N":fstrThisPartyName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPRN==null?"\\N":fstrPRN, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrThisPartyReference==null?"\\N":fstrThisPartyReference, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrThisPartyParticulars==null?"\\N":fstrThisPartyParticulars, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrThisPartyAnalysisCode==null?"\\N":fstrThisPartyAnalysisCode, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOtherPartyName==null?"\\N":fstrOtherPartyName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOtherPartyBankType==null?"\\N":fstrOtherPartyBankType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOtherPartyBankBranch==null?"\\N":fstrOtherPartyBankBranch, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOtherPartyBankAccount==null?"\\N":fstrOtherPartyBankAccount, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOtherPartyBankSuffix==null?"\\N":fstrOtherPartyBankSuffix, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAccountType==null?"\\N":fstrAccountType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIDType==null?"\\N":fstrIDType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrID==null?"\\N":fstrID, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAccountFilingIdHash==null?"\\N":fstrAccountFilingIdHash, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDueDate==null?"\\N":"" + fdtmDueDate, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMedia==null?"\\N":fstrMedia, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrVoucherType==null?"\\N":fstrVoucherType, " ", delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDocKey = null; } else {
      this.flngDocKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIrdBankType = null; } else {
      this.fstrIrdBankType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIrdBankBranch = null; } else {
      this.fstrIrdBankBranch = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIrdBankAccountNumber = null; } else {
      this.fstrIrdBankAccountNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIrdBankSuffix = null; } else {
      this.fstrIrdBankSuffix = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPaymentTransCode = null; } else {
      this.fstrPaymentTransCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPaymentAmount = null; } else {
      this.fstrPaymentAmount = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPaymentInputSource = null; } else {
      this.fstrPaymentInputSource = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOriginBank = null; } else {
      this.fstrOriginBank = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOriginBankBranch = null; } else {
      this.fstrOriginBankBranch = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOriginBatchNumber = null; } else {
      this.fstrOriginBatchNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrThisPartyName = null; } else {
      this.fstrThisPartyName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPRN = null; } else {
      this.fstrPRN = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrThisPartyReference = null; } else {
      this.fstrThisPartyReference = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrThisPartyParticulars = null; } else {
      this.fstrThisPartyParticulars = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrThisPartyAnalysisCode = null; } else {
      this.fstrThisPartyAnalysisCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOtherPartyName = null; } else {
      this.fstrOtherPartyName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOtherPartyBankType = null; } else {
      this.fstrOtherPartyBankType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOtherPartyBankBranch = null; } else {
      this.fstrOtherPartyBankBranch = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOtherPartyBankAccount = null; } else {
      this.fstrOtherPartyBankAccount = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOtherPartyBankSuffix = null; } else {
      this.fstrOtherPartyBankSuffix = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFilingPeriod = null; } else {
      this.fdtmFilingPeriod = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIDType = null; } else {
      this.fstrIDType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrID = null; } else {
      this.fstrID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAccountFilingIdHash = null; } else {
      this.fstrAccountFilingIdHash = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDueDate = null; } else {
      this.fdtmDueDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMedia = null; } else {
      this.fstrMedia = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrVoucherType = null; } else {
      this.fstrVoucherType = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDocKey = null; } else {
      this.flngDocKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIrdBankType = null; } else {
      this.fstrIrdBankType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIrdBankBranch = null; } else {
      this.fstrIrdBankBranch = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIrdBankAccountNumber = null; } else {
      this.fstrIrdBankAccountNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIrdBankSuffix = null; } else {
      this.fstrIrdBankSuffix = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPaymentTransCode = null; } else {
      this.fstrPaymentTransCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPaymentAmount = null; } else {
      this.fstrPaymentAmount = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPaymentInputSource = null; } else {
      this.fstrPaymentInputSource = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOriginBank = null; } else {
      this.fstrOriginBank = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOriginBankBranch = null; } else {
      this.fstrOriginBankBranch = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOriginBatchNumber = null; } else {
      this.fstrOriginBatchNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrThisPartyName = null; } else {
      this.fstrThisPartyName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPRN = null; } else {
      this.fstrPRN = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrThisPartyReference = null; } else {
      this.fstrThisPartyReference = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrThisPartyParticulars = null; } else {
      this.fstrThisPartyParticulars = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrThisPartyAnalysisCode = null; } else {
      this.fstrThisPartyAnalysisCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOtherPartyName = null; } else {
      this.fstrOtherPartyName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOtherPartyBankType = null; } else {
      this.fstrOtherPartyBankType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOtherPartyBankBranch = null; } else {
      this.fstrOtherPartyBankBranch = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOtherPartyBankAccount = null; } else {
      this.fstrOtherPartyBankAccount = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOtherPartyBankSuffix = null; } else {
      this.fstrOtherPartyBankSuffix = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFilingPeriod = null; } else {
      this.fdtmFilingPeriod = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIDType = null; } else {
      this.fstrIDType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrID = null; } else {
      this.fstrID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAccountFilingIdHash = null; } else {
      this.fstrAccountFilingIdHash = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDueDate = null; } else {
      this.fdtmDueDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMedia = null; } else {
      this.fstrMedia = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrVoucherType = null; } else {
      this.fstrVoucherType = __cur_str;
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
    tblnz_paymentadditionalinfo o = (tblnz_paymentadditionalinfo) super.clone();
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmDueDate = (o.fdtmDueDate != null) ? (java.sql.Timestamp) o.fdtmDueDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_paymentadditionalinfo o) throws CloneNotSupportedException {
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmDueDate = (o.fdtmDueDate != null) ? (java.sql.Timestamp) o.fdtmDueDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fstrIrdBankType", this.fstrIrdBankType);
    __sqoop$field_map.put("fstrIrdBankBranch", this.fstrIrdBankBranch);
    __sqoop$field_map.put("fstrIrdBankAccountNumber", this.fstrIrdBankAccountNumber);
    __sqoop$field_map.put("fstrIrdBankSuffix", this.fstrIrdBankSuffix);
    __sqoop$field_map.put("fstrPaymentTransCode", this.fstrPaymentTransCode);
    __sqoop$field_map.put("fstrPaymentAmount", this.fstrPaymentAmount);
    __sqoop$field_map.put("fstrPaymentInputSource", this.fstrPaymentInputSource);
    __sqoop$field_map.put("fstrOriginBank", this.fstrOriginBank);
    __sqoop$field_map.put("fstrOriginBankBranch", this.fstrOriginBankBranch);
    __sqoop$field_map.put("fstrOriginBatchNumber", this.fstrOriginBatchNumber);
    __sqoop$field_map.put("fstrThisPartyName", this.fstrThisPartyName);
    __sqoop$field_map.put("fstrPRN", this.fstrPRN);
    __sqoop$field_map.put("fstrThisPartyReference", this.fstrThisPartyReference);
    __sqoop$field_map.put("fstrThisPartyParticulars", this.fstrThisPartyParticulars);
    __sqoop$field_map.put("fstrThisPartyAnalysisCode", this.fstrThisPartyAnalysisCode);
    __sqoop$field_map.put("fstrOtherPartyName", this.fstrOtherPartyName);
    __sqoop$field_map.put("fstrOtherPartyBankType", this.fstrOtherPartyBankType);
    __sqoop$field_map.put("fstrOtherPartyBankBranch", this.fstrOtherPartyBankBranch);
    __sqoop$field_map.put("fstrOtherPartyBankAccount", this.fstrOtherPartyBankAccount);
    __sqoop$field_map.put("fstrOtherPartyBankSuffix", this.fstrOtherPartyBankSuffix);
    __sqoop$field_map.put("fstrAccountType", this.fstrAccountType);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("fstrIDType", this.fstrIDType);
    __sqoop$field_map.put("fstrID", this.fstrID);
    __sqoop$field_map.put("fstrAccountFilingIdHash", this.fstrAccountFilingIdHash);
    __sqoop$field_map.put("fdtmDueDate", this.fdtmDueDate);
    __sqoop$field_map.put("fstrMedia", this.fstrMedia);
    __sqoop$field_map.put("fstrVoucherType", this.fstrVoucherType);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fstrIrdBankType", this.fstrIrdBankType);
    __sqoop$field_map.put("fstrIrdBankBranch", this.fstrIrdBankBranch);
    __sqoop$field_map.put("fstrIrdBankAccountNumber", this.fstrIrdBankAccountNumber);
    __sqoop$field_map.put("fstrIrdBankSuffix", this.fstrIrdBankSuffix);
    __sqoop$field_map.put("fstrPaymentTransCode", this.fstrPaymentTransCode);
    __sqoop$field_map.put("fstrPaymentAmount", this.fstrPaymentAmount);
    __sqoop$field_map.put("fstrPaymentInputSource", this.fstrPaymentInputSource);
    __sqoop$field_map.put("fstrOriginBank", this.fstrOriginBank);
    __sqoop$field_map.put("fstrOriginBankBranch", this.fstrOriginBankBranch);
    __sqoop$field_map.put("fstrOriginBatchNumber", this.fstrOriginBatchNumber);
    __sqoop$field_map.put("fstrThisPartyName", this.fstrThisPartyName);
    __sqoop$field_map.put("fstrPRN", this.fstrPRN);
    __sqoop$field_map.put("fstrThisPartyReference", this.fstrThisPartyReference);
    __sqoop$field_map.put("fstrThisPartyParticulars", this.fstrThisPartyParticulars);
    __sqoop$field_map.put("fstrThisPartyAnalysisCode", this.fstrThisPartyAnalysisCode);
    __sqoop$field_map.put("fstrOtherPartyName", this.fstrOtherPartyName);
    __sqoop$field_map.put("fstrOtherPartyBankType", this.fstrOtherPartyBankType);
    __sqoop$field_map.put("fstrOtherPartyBankBranch", this.fstrOtherPartyBankBranch);
    __sqoop$field_map.put("fstrOtherPartyBankAccount", this.fstrOtherPartyBankAccount);
    __sqoop$field_map.put("fstrOtherPartyBankSuffix", this.fstrOtherPartyBankSuffix);
    __sqoop$field_map.put("fstrAccountType", this.fstrAccountType);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("fstrIDType", this.fstrIDType);
    __sqoop$field_map.put("fstrID", this.fstrID);
    __sqoop$field_map.put("fstrAccountFilingIdHash", this.fstrAccountFilingIdHash);
    __sqoop$field_map.put("fdtmDueDate", this.fdtmDueDate);
    __sqoop$field_map.put("fstrMedia", this.fstrMedia);
    __sqoop$field_map.put("fstrVoucherType", this.fstrVoucherType);
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
